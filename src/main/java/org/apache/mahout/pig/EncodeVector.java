package org.apache.mahout.pig;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.apache.mahout.math.RandomAccessSparseVector;
import org.apache.mahout.math.Vector;
import org.apache.mahout.vectorizer.encoders.ConstantValueEncoder;
import org.apache.mahout.vectorizer.encoders.FeatureVectorEncoder;
import org.apache.pig.EvalFunc;
import org.apache.pig.data.DataType;
import org.apache.pig.data.Tuple;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/**
 * Encodes a tuple as a vector using the hashed vector representation.
 */
public class EncodeVector extends EvalFunc<Tuple> {
    private int dimension;
    private EncodingSpec spec;
    private Map<String,ArgumentEncoder> encoderMap;
    private final FeatureVectorEncoder constantEncoder = new ConstantValueEncoder("- bias -");
    private int minimumTupleSize;

    /**
     * This class requires that a formula and a schema be provided in order to specify how
     * to encode tuples.  The formula should be like an R formula such as is used by lm or glm.
     *
     * The formula can look like this
     *
     *    x + y*z + 1
     *
     * This indicates that x, the interaction between x and y and a constant offset should be encoded.
     *
     * The schema looks generally like a pig schema except that only the following primitive types are recognized:
     *
     * numeric
     * word
     * text
     * text(Analyzer)
     *
     * @param dimension  Number of elements in the resulting encoded vectors
     * @param formula    The R-like formula that describes the data to encode
     * @param schema     A schema description for the arguments that will be given to the function later.
     */
    public EncodeVector(String dimension, String formula, String schema) {
        this.dimension = Integer.parseInt(dimension);
        encoderMap = Schema.parse(schema);
        minimumTupleSize = 0;
        for (ArgumentEncoder encoder : encoderMap.values()) {
            minimumTupleSize = Math.max(minimumTupleSize, encoder.getPosition() + 1);
        }
        spec = Formula.parse(formula);
        ArrayList<Object> encoders = Lists.newArrayList();
    }

    public Tuple exec(Tuple input) throws IOException {
        if (input == null || input.size() == 0 || input.size() < minimumTupleSize) {
            throw new IllegalArgumentException("Tuple doesn't have at least " + minimumTupleSize + " elements");
        } else {
            Vector r = new RandomAccessSparseVector(dimension);
            int i = 0;
            for (Set<String> variables : spec.getVariables()) {
                if (variables.size() > 1) {
                    throw new UnsupportedOperationException("Can't encode interactions yet");
                }
                if (variables.size() == 0) {
                    throw new ImpossibleStateError("No variables!");
                }
                final String var = variables.iterator().next();
                if ("1".equals(var)) {
                    constantEncoder.addToVector((byte[]) null, r);
                } else {
                    ArgumentEncoder encoder = encoderMap.get(var);
                    encoder.getEncoder().addToVector(input.get(encoder.getPosition()).toString(), r);
                }
            }
            return new PigVector(r);
        }
    }
}
