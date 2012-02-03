// $ANTLR 3.4 org/apache/mahout/pig/encoders/Formula.g 2012-01-30 01:29:50

package org.apache.mahout.pig.encoders;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class FormulaParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DOLLAR", "ID", "INTEGER", "LPAREN", "PLUS", "RPAREN", "TIMES", "UP_ARROW", "WS"
    };

    public static final int EOF=-1;
    public static final int DOLLAR=4;
    public static final int ID=5;
    public static final int INTEGER=6;
    public static final int LPAREN=7;
    public static final int PLUS=8;
    public static final int RPAREN=9;
    public static final int TIMES=10;
    public static final int UP_ARROW=11;
    public static final int WS=12;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public FormulaParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public FormulaParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return FormulaParser.tokenNames; }
    public String getGrammarFileName() { return "org/apache/mahout/pig/encoders/Formula.g"; }


      public void reportError(RecognitionException e) {
        if (e instanceof FailedPredicateException) {
          throw new FormulaParseException(e, "Invalid bias");
        } else {
          throw new FormulaParseException(e, "Syntax error in schema: ");
        }
      }


    public static class expression_return extends ParserRuleReturnScope {
        public EncodingSpec r;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // org/apache/mahout/pig/encoders/Formula.g:25:1: expression returns [EncodingSpec r] : s= sumExpression EOF ;
    public final FormulaParser.expression_return expression() throws RecognitionException {
        FormulaParser.expression_return retval = new FormulaParser.expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EOF1=null;
        FormulaParser.sumExpression_return s =null;


        Object EOF1_tree=null;

        try {
            // org/apache/mahout/pig/encoders/Formula.g:25:36: (s= sumExpression EOF )
            // org/apache/mahout/pig/encoders/Formula.g:25:38: s= sumExpression EOF
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_sumExpression_in_expression50);
            s=sumExpression();

            state._fsp--;

            adaptor.addChild(root_0, s.getTree());

            EOF1=(Token)match(input,EOF,FOLLOW_EOF_in_expression52); 
            EOF1_tree = 
            (Object)adaptor.create(EOF1)
            ;
            adaptor.addChild(root_0, EOF1_tree);


            retval.r = (s!=null?s.r:null);

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expression"


    public static class sumExpression_return extends ParserRuleReturnScope {
        public EncodingSpec r;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sumExpression"
    // org/apache/mahout/pig/encoders/Formula.g:27:1: sumExpression returns [EncodingSpec r] : f1= factor ( PLUS f2= factor )* ;
    public final FormulaParser.sumExpression_return sumExpression() throws RecognitionException {
        FormulaParser.sumExpression_return retval = new FormulaParser.sumExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PLUS2=null;
        FormulaParser.factor_return f1 =null;

        FormulaParser.factor_return f2 =null;


        Object PLUS2_tree=null;

        try {
            // org/apache/mahout/pig/encoders/Formula.g:27:39: (f1= factor ( PLUS f2= factor )* )
            // org/apache/mahout/pig/encoders/Formula.g:28:5: f1= factor ( PLUS f2= factor )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_factor_in_sumExpression72);
            f1=factor();

            state._fsp--;

            adaptor.addChild(root_0, f1.getTree());

            retval.r = (f1!=null?f1.r:null);

            // org/apache/mahout/pig/encoders/Formula.g:29:8: ( PLUS f2= factor )*
            loop1:
            do {
                int alt1=2;
                switch ( input.LA(1) ) {
                case PLUS:
                    {
                    alt1=1;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // org/apache/mahout/pig/encoders/Formula.g:29:9: PLUS f2= factor
            	    {
            	    PLUS2=(Token)match(input,PLUS,FOLLOW_PLUS_in_sumExpression84); 
            	    PLUS2_tree = 
            	    (Object)adaptor.create(PLUS2)
            	    ;
            	    adaptor.addChild(root_0, PLUS2_tree);


            	    pushFollow(FOLLOW_factor_in_sumExpression88);
            	    f2=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, f2.getTree());

            	    retval.r = EncodingSpec.add(retval.r, (f2!=null?f2.r:null));

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "sumExpression"


    public static class factor_return extends ParserRuleReturnScope {
        public EncodingSpec r;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // org/apache/mahout/pig/encoders/Formula.g:32:1: factor returns [EncodingSpec r] : a1= argument ( TIMES a2= argument )* ;
    public final FormulaParser.factor_return factor() throws RecognitionException {
        FormulaParser.factor_return retval = new FormulaParser.factor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TIMES3=null;
        FormulaParser.argument_return a1 =null;

        FormulaParser.argument_return a2 =null;


        Object TIMES3_tree=null;

        try {
            // org/apache/mahout/pig/encoders/Formula.g:32:32: (a1= argument ( TIMES a2= argument )* )
            // org/apache/mahout/pig/encoders/Formula.g:33:5: a1= argument ( TIMES a2= argument )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_argument_in_factor114);
            a1=argument();

            state._fsp--;

            adaptor.addChild(root_0, a1.getTree());

            retval.r = (a1!=null?a1.r:null);

            // org/apache/mahout/pig/encoders/Formula.g:33:31: ( TIMES a2= argument )*
            loop2:
            do {
                int alt2=2;
                switch ( input.LA(1) ) {
                case TIMES:
                    {
                    alt2=1;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // org/apache/mahout/pig/encoders/Formula.g:33:32: TIMES a2= argument
            	    {
            	    TIMES3=(Token)match(input,TIMES,FOLLOW_TIMES_in_factor119); 
            	    TIMES3_tree = 
            	    (Object)adaptor.create(TIMES3)
            	    ;
            	    adaptor.addChild(root_0, TIMES3_tree);


            	    pushFollow(FOLLOW_argument_in_factor123);
            	    a2=argument();

            	    state._fsp--;

            	    adaptor.addChild(root_0, a2.getTree());

            	    retval.r = EncodingSpec.interact(retval.r, (a2!=null?a2.r:null));

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "factor"


    public static class argument_return extends ParserRuleReturnScope {
        public EncodingSpec r;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "argument"
    // org/apache/mahout/pig/encoders/Formula.g:35:1: argument returns [EncodingSpec r] : ( LPAREN s1= sumExpression RPAREN ( UP_ARROW n= INTEGER )? | ID | bias );
    public final FormulaParser.argument_return argument() throws RecognitionException {
        FormulaParser.argument_return retval = new FormulaParser.argument_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token n=null;
        Token LPAREN4=null;
        Token RPAREN5=null;
        Token UP_ARROW6=null;
        Token ID7=null;
        FormulaParser.sumExpression_return s1 =null;

        FormulaParser.bias_return bias8 =null;


        Object n_tree=null;
        Object LPAREN4_tree=null;
        Object RPAREN5_tree=null;
        Object UP_ARROW6_tree=null;
        Object ID7_tree=null;

        try {
            // org/apache/mahout/pig/encoders/Formula.g:35:34: ( LPAREN s1= sumExpression RPAREN ( UP_ARROW n= INTEGER )? | ID | bias )
            int alt4=3;
            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt4=1;
                }
                break;
            case ID:
                {
                alt4=2;
                }
                break;
            case INTEGER:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // org/apache/mahout/pig/encoders/Formula.g:36:5: LPAREN s1= sumExpression RPAREN ( UP_ARROW n= INTEGER )?
                    {
                    root_0 = (Object)adaptor.nil();


                    LPAREN4=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_argument145); 
                    LPAREN4_tree = 
                    (Object)adaptor.create(LPAREN4)
                    ;
                    adaptor.addChild(root_0, LPAREN4_tree);


                    pushFollow(FOLLOW_sumExpression_in_argument149);
                    s1=sumExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, s1.getTree());

                    RPAREN5=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_argument152); 
                    RPAREN5_tree = 
                    (Object)adaptor.create(RPAREN5)
                    ;
                    adaptor.addChild(root_0, RPAREN5_tree);


                    retval.r = (s1!=null?s1.r:null);

                    // org/apache/mahout/pig/encoders/Formula.g:37:5: ( UP_ARROW n= INTEGER )?
                    int alt3=2;
                    switch ( input.LA(1) ) {
                        case UP_ARROW:
                            {
                            alt3=1;
                            }
                            break;
                    }

                    switch (alt3) {
                        case 1 :
                            // org/apache/mahout/pig/encoders/Formula.g:37:6: UP_ARROW n= INTEGER
                            {
                            UP_ARROW6=(Token)match(input,UP_ARROW,FOLLOW_UP_ARROW_in_argument162); 
                            UP_ARROW6_tree = 
                            (Object)adaptor.create(UP_ARROW6)
                            ;
                            adaptor.addChild(root_0, UP_ARROW6_tree);


                            n=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_argument168); 
                            n_tree = 
                            (Object)adaptor.create(n)
                            ;
                            adaptor.addChild(root_0, n_tree);


                            retval.r = EncodingSpec.pow((s1!=null?s1.r:null), Integer.parseInt(n.getText()));

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // org/apache/mahout/pig/encoders/Formula.g:38:7: ID
                    {
                    root_0 = (Object)adaptor.nil();


                    ID7=(Token)match(input,ID,FOLLOW_ID_in_argument180); 
                    ID7_tree = 
                    (Object)adaptor.create(ID7)
                    ;
                    adaptor.addChild(root_0, ID7_tree);


                    retval.r = EncodingSpec.atom((ID7!=null?ID7.getText():null));

                    }
                    break;
                case 3 :
                    // org/apache/mahout/pig/encoders/Formula.g:39:7: bias
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_bias_in_argument190);
                    bias8=bias();

                    state._fsp--;

                    adaptor.addChild(root_0, bias8.getTree());

                    retval.r = EncodingSpec.atom("1");

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "argument"


    public static class bias_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bias"
    // org/apache/mahout/pig/encoders/Formula.g:41:1: bias : i= INTEGER {...}?;
    public final FormulaParser.bias_return bias() throws RecognitionException {
        FormulaParser.bias_return retval = new FormulaParser.bias_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token i=null;

        Object i_tree=null;

        try {
            // org/apache/mahout/pig/encoders/Formula.g:41:6: (i= INTEGER {...}?)
            // org/apache/mahout/pig/encoders/Formula.g:41:8: i= INTEGER {...}?
            {
            root_0 = (Object)adaptor.nil();


            i=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_bias204); 
            i_tree = 
            (Object)adaptor.create(i)
            ;
            adaptor.addChild(root_0, i_tree);


            if ( !(("1".equals(i.getText()))) ) {
                throw new FailedPredicateException(input, "bias", "\"1\".equals(i.getText())");
            }

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bias"

    // Delegated rules


 

    public static final BitSet FOLLOW_sumExpression_in_expression50 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_expression52 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_sumExpression72 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_PLUS_in_sumExpression84 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_factor_in_sumExpression88 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_argument_in_factor114 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_TIMES_in_factor119 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_argument_in_factor123 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_LPAREN_in_argument145 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_sumExpression_in_argument149 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_argument152 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_UP_ARROW_in_argument162 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INTEGER_in_argument168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_argument180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bias_in_argument190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_bias204 = new BitSet(new long[]{0x0000000000000002L});

}