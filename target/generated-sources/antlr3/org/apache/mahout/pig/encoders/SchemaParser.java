// $ANTLR 3.4 org/apache/mahout/pig/encoders/Schema.g 2012-01-30 01:29:51

package org.apache.mahout.pig.encoders;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SchemaParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COLON", "COMMA", "DOLLAR", "DOT", "ID", "INTEGER", "LPAREN", "NUMERIC", "RPAREN", "TEXT", "WORD", "WS"
    };

    public static final int EOF=-1;
    public static final int COLON=4;
    public static final int COMMA=5;
    public static final int DOLLAR=6;
    public static final int DOT=7;
    public static final int ID=8;
    public static final int INTEGER=9;
    public static final int LPAREN=10;
    public static final int NUMERIC=11;
    public static final int RPAREN=12;
    public static final int TEXT=13;
    public static final int WORD=14;
    public static final int WS=15;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public SchemaParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public SchemaParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return SchemaParser.tokenNames; }
    public String getGrammarFileName() { return "org/apache/mahout/pig/encoders/Schema.g"; }

           
           private int position = 0;
           private Map<String, ArgumentEncoder> encoders = Maps.newHashMap();
         
           public Map<String, ArgumentEncoder> getEncoders() {
              return encoders;
           }

           public void reportError(RecognitionException e) {
             if (e instanceof FailedPredicateException) {
               throw new SchemaParseException("Variable multiply defined", e);
             } else {
               throw new SchemaParseException("Syntax error in schema: ", e);
             }
           }



    public static class schema_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "schema"
    // org/apache/mahout/pig/encoders/Schema.g:37:1: schema : variable ( COMMA ! variable )* ;
    public final SchemaParser.schema_return schema() throws RecognitionException {
        SchemaParser.schema_return retval = new SchemaParser.schema_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA2=null;
        SchemaParser.variable_return variable1 =null;

        SchemaParser.variable_return variable3 =null;


        Object COMMA2_tree=null;

        try {
            // org/apache/mahout/pig/encoders/Schema.g:37:9: ( variable ( COMMA ! variable )* )
            // org/apache/mahout/pig/encoders/Schema.g:37:11: variable ( COMMA ! variable )*
            {
            root_0 = (Object)adaptor.nil();


            position = 0;

            pushFollow(FOLLOW_variable_in_schema48);
            variable1=variable();

            state._fsp--;

            adaptor.addChild(root_0, variable1.getTree());

            // org/apache/mahout/pig/encoders/Schema.g:37:36: ( COMMA ! variable )*
            loop1:
            do {
                int alt1=2;
                switch ( input.LA(1) ) {
                case COMMA:
                    {
                    alt1=1;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // org/apache/mahout/pig/encoders/Schema.g:37:37: COMMA ! variable
            	    {
            	    COMMA2=(Token)match(input,COMMA,FOLLOW_COMMA_in_schema51); 

            	    pushFollow(FOLLOW_variable_in_schema54);
            	    variable3=variable();

            	    state._fsp--;

            	    adaptor.addChild(root_0, variable3.getTree());

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
    // $ANTLR end "schema"


    public static class variable_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variable"
    // org/apache/mahout/pig/encoders/Schema.g:39:1: variable : ( ID ^ COLON !t= type[$ID.text, position++] {...}?| ID ^ DOLLAR INTEGER COLON !t= type[$ID.text, Integer.parseInt($INTEGER.text)] {...}?);
    public final SchemaParser.variable_return variable() throws RecognitionException {
        SchemaParser.variable_return retval = new SchemaParser.variable_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID4=null;
        Token COLON5=null;
        Token ID6=null;
        Token DOLLAR7=null;
        Token INTEGER8=null;
        Token COLON9=null;
        SchemaParser.type_return t =null;


        Object ID4_tree=null;
        Object COLON5_tree=null;
        Object ID6_tree=null;
        Object DOLLAR7_tree=null;
        Object INTEGER8_tree=null;
        Object COLON9_tree=null;

        try {
            // org/apache/mahout/pig/encoders/Schema.g:39:10: ( ID ^ COLON !t= type[$ID.text, position++] {...}?| ID ^ DOLLAR INTEGER COLON !t= type[$ID.text, Integer.parseInt($INTEGER.text)] {...}?)
            int alt2=2;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case COLON:
                    {
                    alt2=1;
                    }
                    break;
                case DOLLAR:
                    {
                    alt2=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // org/apache/mahout/pig/encoders/Schema.g:40:11: ID ^ COLON !t= type[$ID.text, position++] {...}?
                    {
                    root_0 = (Object)adaptor.nil();


                    ID4=(Token)match(input,ID,FOLLOW_ID_in_variable74); 
                    ID4_tree = 
                    (Object)adaptor.create(ID4)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ID4_tree, root_0);


                    COLON5=(Token)match(input,COLON,FOLLOW_COLON_in_variable77); 

                    pushFollow(FOLLOW_type_in_variable82);
                    t=type((ID4!=null?ID4.getText():null), position++);

                    state._fsp--;

                    adaptor.addChild(root_0, t.getTree());

                    if ( !((encoders.get((ID4!=null?ID4.getText():null)) == null)) ) {
                        throw new FailedPredicateException(input, "variable", "encoders.get($ID.text) == null");
                    }

                    encoders.put((ID4!=null?ID4.getText():null), (t!=null?t.encoder:null));

                    }
                    break;
                case 2 :
                    // org/apache/mahout/pig/encoders/Schema.g:43:13: ID ^ DOLLAR INTEGER COLON !t= type[$ID.text, Integer.parseInt($INTEGER.text)] {...}?
                    {
                    root_0 = (Object)adaptor.nil();


                    ID6=(Token)match(input,ID,FOLLOW_ID_in_variable125); 
                    ID6_tree = 
                    (Object)adaptor.create(ID6)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ID6_tree, root_0);


                    DOLLAR7=(Token)match(input,DOLLAR,FOLLOW_DOLLAR_in_variable128); 
                    DOLLAR7_tree = 
                    (Object)adaptor.create(DOLLAR7)
                    ;
                    adaptor.addChild(root_0, DOLLAR7_tree);


                    INTEGER8=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_variable130); 
                    INTEGER8_tree = 
                    (Object)adaptor.create(INTEGER8)
                    ;
                    adaptor.addChild(root_0, INTEGER8_tree);


                    COLON9=(Token)match(input,COLON,FOLLOW_COLON_in_variable132); 

                    pushFollow(FOLLOW_type_in_variable137);
                    t=type((ID6!=null?ID6.getText():null), Integer.parseInt((INTEGER8!=null?INTEGER8.getText():null)));

                    state._fsp--;

                    adaptor.addChild(root_0, t.getTree());

                    if ( !((encoders.get((ID6!=null?ID6.getText():null)) == null)) ) {
                        throw new FailedPredicateException(input, "variable", "encoders.get($ID.text) == null");
                    }

                    encoders.put((ID6!=null?ID6.getText():null), (t!=null?t.encoder:null));

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
    // $ANTLR end "variable"


    public static class type_return extends ParserRuleReturnScope {
        public ArgumentEncoder encoder;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type"
    // org/apache/mahout/pig/encoders/Schema.g:47:1: type[String name, int position] returns [ArgumentEncoder encoder] : ( NUMERIC ^| WORD ^| TEXT ^| TEXT ^ LPAREN ! className RPAREN !);
    public final SchemaParser.type_return type(String name, int position) throws RecognitionException {
        SchemaParser.type_return retval = new SchemaParser.type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NUMERIC10=null;
        Token WORD11=null;
        Token TEXT12=null;
        Token TEXT13=null;
        Token LPAREN14=null;
        Token RPAREN16=null;
        SchemaParser.className_return className15 =null;


        Object NUMERIC10_tree=null;
        Object WORD11_tree=null;
        Object TEXT12_tree=null;
        Object TEXT13_tree=null;
        Object LPAREN14_tree=null;
        Object RPAREN16_tree=null;

        try {
            // org/apache/mahout/pig/encoders/Schema.g:47:67: ( NUMERIC ^| WORD ^| TEXT ^| TEXT ^ LPAREN ! className RPAREN !)
            int alt3=4;
            switch ( input.LA(1) ) {
            case NUMERIC:
                {
                alt3=1;
                }
                break;
            case WORD:
                {
                alt3=2;
                }
                break;
            case TEXT:
                {
                switch ( input.LA(2) ) {
                case LPAREN:
                    {
                    alt3=4;
                    }
                    break;
                case EOF:
                case COMMA:
                    {
                    alt3=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // org/apache/mahout/pig/encoders/Schema.g:48:11: NUMERIC ^
                    {
                    root_0 = (Object)adaptor.nil();


                    NUMERIC10=(Token)match(input,NUMERIC,FOLLOW_NUMERIC_in_type190); 
                    NUMERIC10_tree = 
                    (Object)adaptor.create(NUMERIC10)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(NUMERIC10_tree, root_0);


                    retval.encoder = ArgumentEncoder.newNumericEncoder(position, name);

                    }
                    break;
                case 2 :
                    // org/apache/mahout/pig/encoders/Schema.g:49:13: WORD ^
                    {
                    root_0 = (Object)adaptor.nil();


                    WORD11=(Token)match(input,WORD,FOLLOW_WORD_in_type207); 
                    WORD11_tree = 
                    (Object)adaptor.create(WORD11)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(WORD11_tree, root_0);


                    retval.encoder = ArgumentEncoder.newWordEncoder(position, name);

                    }
                    break;
                case 3 :
                    // org/apache/mahout/pig/encoders/Schema.g:50:13: TEXT ^
                    {
                    root_0 = (Object)adaptor.nil();


                    TEXT12=(Token)match(input,TEXT,FOLLOW_TEXT_in_type224); 
                    TEXT12_tree = 
                    (Object)adaptor.create(TEXT12)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(TEXT12_tree, root_0);


                    retval.encoder = ArgumentEncoder.newTextEncoder(position, name);

                    }
                    break;
                case 4 :
                    // org/apache/mahout/pig/encoders/Schema.g:51:13: TEXT ^ LPAREN ! className RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    TEXT13=(Token)match(input,TEXT,FOLLOW_TEXT_in_type241); 
                    TEXT13_tree = 
                    (Object)adaptor.create(TEXT13)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(TEXT13_tree, root_0);


                    LPAREN14=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_type244); 

                    pushFollow(FOLLOW_className_in_type247);
                    className15=className();

                    state._fsp--;

                    adaptor.addChild(root_0, className15.getTree());

                    RPAREN16=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_type249); 

                    retval.encoder = ArgumentEncoder.newTextEncoder(position, name, (className15!=null?input.toString(className15.start,className15.stop):null));

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
    // $ANTLR end "type"


    public static class className_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "className"
    // org/apache/mahout/pig/encoders/Schema.g:54:1: className : ID ( DOT ID )* ;
    public final SchemaParser.className_return className() throws RecognitionException {
        SchemaParser.className_return retval = new SchemaParser.className_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID17=null;
        Token DOT18=null;
        Token ID19=null;

        Object ID17_tree=null;
        Object DOT18_tree=null;
        Object ID19_tree=null;

        try {
            // org/apache/mahout/pig/encoders/Schema.g:54:11: ( ID ( DOT ID )* )
            // org/apache/mahout/pig/encoders/Schema.g:54:13: ID ( DOT ID )*
            {
            root_0 = (Object)adaptor.nil();


            ID17=(Token)match(input,ID,FOLLOW_ID_in_className281); 
            ID17_tree = 
            (Object)adaptor.create(ID17)
            ;
            adaptor.addChild(root_0, ID17_tree);


            // org/apache/mahout/pig/encoders/Schema.g:54:16: ( DOT ID )*
            loop4:
            do {
                int alt4=2;
                switch ( input.LA(1) ) {
                case DOT:
                    {
                    alt4=1;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // org/apache/mahout/pig/encoders/Schema.g:54:17: DOT ID
            	    {
            	    DOT18=(Token)match(input,DOT,FOLLOW_DOT_in_className284); 
            	    DOT18_tree = 
            	    (Object)adaptor.create(DOT18)
            	    ;
            	    adaptor.addChild(root_0, DOT18_tree);


            	    ID19=(Token)match(input,ID,FOLLOW_ID_in_className286); 
            	    ID19_tree = 
            	    (Object)adaptor.create(ID19)
            	    ;
            	    adaptor.addChild(root_0, ID19_tree);


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "className"

    // Delegated rules


 

    public static final BitSet FOLLOW_variable_in_schema48 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_COMMA_in_schema51 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_variable_in_schema54 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ID_in_variable74 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_COLON_in_variable77 = new BitSet(new long[]{0x0000000000006800L});
    public static final BitSet FOLLOW_type_in_variable82 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable125 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DOLLAR_in_variable128 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_INTEGER_in_variable130 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_COLON_in_variable132 = new BitSet(new long[]{0x0000000000006800L});
    public static final BitSet FOLLOW_type_in_variable137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMERIC_in_type190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_type207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_type224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_type241 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_LPAREN_in_type244 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_className_in_type247 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RPAREN_in_type249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_className281 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DOT_in_className284 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_className286 = new BitSet(new long[]{0x0000000000000082L});

}