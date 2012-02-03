register 'target/pig-vector-1.0-jar-with-dependencies.jar';
define encodeVector org.apache.mahout.pig.encoders.EncodeVector('100000', 'subject+body', 'group:word, article:numeric, subject:text, body:text');
define train org.apache.mahout.pig.LogisticRegression('iterations=5, inMemory=true, features=100000, categories=alt.atheism comp.sys.mac.hardware rec.motorcycles sci.electronics talk.politics.guns comp.graphics comp.windows.x rec.sport.baseball sci.med talk.politics.mideast comp.os.ms-windows.misc misc.forsale rec.sport.hockey sci.space talk.politics.misc comp.sys.ibm.pc.hardware rec.autos sci.crypt soc.religion.christian talk.religion.misc');

/*rm model.dat*/

/* read the data */
docs = load '20news-bydate-train/*/*' using org.apache.mahout.pig.MessageLoader()
     as (newsgroup, id:int, subject, body);
/* encode as vectors, retain the target variable and the feature vector */
vectors = foreach docs generate newsgroup, encodeVector(*) as v;
describe vectors;

/* put the training data in a single bag.  We could train multiple models this way */
grouped = group vectors all;

/* train the actual model.  The key is bogus to satisfy the sequence vector format. */
model = foreach grouped generate 1 as key, train(vectors) as model;

/* the trained model is passed to use as a bytearray so we just pass it on out.  The classifier
   class just contains the list of target valeus and the OnlineLogisticRegression object itself. */
store model into 'model.dat' using com.twitter.elephantbird.pig.store.SequenceFileStorage (
   '-c com.twitter.elephantbird.pig.util.IntWritableConverter',
   '-c com.twitter.elephantbird.pig.util.GenericWritableConverter -t org.apache.mahout.pig.Classifier'
);
