// $ANTLR 3.4 org/apache/mahout/pig/encoders/Schema.g 2012-01-30 01:29:51

package org.apache.mahout.pig.encoders;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SchemaLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public SchemaLexer() {} 
    public SchemaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SchemaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "org/apache/mahout/pig/encoders/Schema.g"; }

    // $ANTLR start "NUMERIC"
    public final void mNUMERIC() throws RecognitionException {
        try {
            int _type = NUMERIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/mahout/pig/encoders/Schema.g:56:9: ( 'numeric' )
            // org/apache/mahout/pig/encoders/Schema.g:56:11: 'numeric'
            {
            match("numeric"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUMERIC"

    // $ANTLR start "WORD"
    public final void mWORD() throws RecognitionException {
        try {
            int _type = WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/mahout/pig/encoders/Schema.g:57:6: ( 'word' )
            // org/apache/mahout/pig/encoders/Schema.g:57:8: 'word'
            {
            match("word"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WORD"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/mahout/pig/encoders/Schema.g:58:6: ( 'text' )
            // org/apache/mahout/pig/encoders/Schema.g:58:8: 'text'
            {
            match("text"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TEXT"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/mahout/pig/encoders/Schema.g:59:8: ( ( '0' .. '9' )+ )
            // org/apache/mahout/pig/encoders/Schema.g:59:10: ( '0' .. '9' )+
            {
            // org/apache/mahout/pig/encoders/Schema.g:59:10: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                switch ( input.LA(1) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt1=1;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // org/apache/mahout/pig/encoders/Schema.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/mahout/pig/encoders/Schema.g:61:8: ( '(' )
            // org/apache/mahout/pig/encoders/Schema.g:61:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/mahout/pig/encoders/Schema.g:62:8: ( ')' )
            // org/apache/mahout/pig/encoders/Schema.g:62:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/mahout/pig/encoders/Schema.g:63:7: ( ':' )
            // org/apache/mahout/pig/encoders/Schema.g:63:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/mahout/pig/encoders/Schema.g:64:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // org/apache/mahout/pig/encoders/Schema.g:64:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // org/apache/mahout/pig/encoders/Schema.g:64:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop2:
            do {
                int alt2=2;
                switch ( input.LA(1) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case '_':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt2=1;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // org/apache/mahout/pig/encoders/Schema.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/mahout/pig/encoders/Schema.g:66:5: ( '.' )
            // org/apache/mahout/pig/encoders/Schema.g:66:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/mahout/pig/encoders/Schema.g:67:7: ( ',' )
            // org/apache/mahout/pig/encoders/Schema.g:67:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "DOLLAR"
    public final void mDOLLAR() throws RecognitionException {
        try {
            int _type = DOLLAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/mahout/pig/encoders/Schema.g:68:8: ( '$' )
            // org/apache/mahout/pig/encoders/Schema.g:68:10: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOLLAR"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/mahout/pig/encoders/Schema.g:70:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // org/apache/mahout/pig/encoders/Schema.g:70:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // org/apache/mahout/pig/encoders/Schema.g:1:8: ( NUMERIC | WORD | TEXT | INTEGER | LPAREN | RPAREN | COLON | ID | DOT | COMMA | DOLLAR | WS )
        int alt3=12;
        switch ( input.LA(1) ) {
        case 'n':
            {
            switch ( input.LA(2) ) {
            case 'u':
                {
                switch ( input.LA(3) ) {
                case 'm':
                    {
                    switch ( input.LA(4) ) {
                    case 'e':
                        {
                        switch ( input.LA(5) ) {
                        case 'r':
                            {
                            switch ( input.LA(6) ) {
                            case 'i':
                                {
                                switch ( input.LA(7) ) {
                                case 'c':
                                    {
                                    switch ( input.LA(8) ) {
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                    case 'A':
                                    case 'B':
                                    case 'C':
                                    case 'D':
                                    case 'E':
                                    case 'F':
                                    case 'G':
                                    case 'H':
                                    case 'I':
                                    case 'J':
                                    case 'K':
                                    case 'L':
                                    case 'M':
                                    case 'N':
                                    case 'O':
                                    case 'P':
                                    case 'Q':
                                    case 'R':
                                    case 'S':
                                    case 'T':
                                    case 'U':
                                    case 'V':
                                    case 'W':
                                    case 'X':
                                    case 'Y':
                                    case 'Z':
                                    case '_':
                                    case 'a':
                                    case 'b':
                                    case 'c':
                                    case 'd':
                                    case 'e':
                                    case 'f':
                                    case 'g':
                                    case 'h':
                                    case 'i':
                                    case 'j':
                                    case 'k':
                                    case 'l':
                                    case 'm':
                                    case 'n':
                                    case 'o':
                                    case 'p':
                                    case 'q':
                                    case 'r':
                                    case 's':
                                    case 't':
                                    case 'u':
                                    case 'v':
                                    case 'w':
                                    case 'x':
                                    case 'y':
                                    case 'z':
                                        {
                                        alt3=8;
                                        }
                                        break;
                                    default:
                                        alt3=1;
                                    }

                                    }
                                    break;
                                default:
                                    alt3=8;
                                }

                                }
                                break;
                            default:
                                alt3=8;
                            }

                            }
                            break;
                        default:
                            alt3=8;
                        }

                        }
                        break;
                    default:
                        alt3=8;
                    }

                    }
                    break;
                default:
                    alt3=8;
                }

                }
                break;
            default:
                alt3=8;
            }

            }
            break;
        case 'w':
            {
            switch ( input.LA(2) ) {
            case 'o':
                {
                switch ( input.LA(3) ) {
                case 'r':
                    {
                    switch ( input.LA(4) ) {
                    case 'd':
                        {
                        switch ( input.LA(5) ) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                        case 'A':
                        case 'B':
                        case 'C':
                        case 'D':
                        case 'E':
                        case 'F':
                        case 'G':
                        case 'H':
                        case 'I':
                        case 'J':
                        case 'K':
                        case 'L':
                        case 'M':
                        case 'N':
                        case 'O':
                        case 'P':
                        case 'Q':
                        case 'R':
                        case 'S':
                        case 'T':
                        case 'U':
                        case 'V':
                        case 'W':
                        case 'X':
                        case 'Y':
                        case 'Z':
                        case '_':
                        case 'a':
                        case 'b':
                        case 'c':
                        case 'd':
                        case 'e':
                        case 'f':
                        case 'g':
                        case 'h':
                        case 'i':
                        case 'j':
                        case 'k':
                        case 'l':
                        case 'm':
                        case 'n':
                        case 'o':
                        case 'p':
                        case 'q':
                        case 'r':
                        case 's':
                        case 't':
                        case 'u':
                        case 'v':
                        case 'w':
                        case 'x':
                        case 'y':
                        case 'z':
                            {
                            alt3=8;
                            }
                            break;
                        default:
                            alt3=2;
                        }

                        }
                        break;
                    default:
                        alt3=8;
                    }

                    }
                    break;
                default:
                    alt3=8;
                }

                }
                break;
            default:
                alt3=8;
            }

            }
            break;
        case 't':
            {
            switch ( input.LA(2) ) {
            case 'e':
                {
                switch ( input.LA(3) ) {
                case 'x':
                    {
                    switch ( input.LA(4) ) {
                    case 't':
                        {
                        switch ( input.LA(5) ) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                        case 'A':
                        case 'B':
                        case 'C':
                        case 'D':
                        case 'E':
                        case 'F':
                        case 'G':
                        case 'H':
                        case 'I':
                        case 'J':
                        case 'K':
                        case 'L':
                        case 'M':
                        case 'N':
                        case 'O':
                        case 'P':
                        case 'Q':
                        case 'R':
                        case 'S':
                        case 'T':
                        case 'U':
                        case 'V':
                        case 'W':
                        case 'X':
                        case 'Y':
                        case 'Z':
                        case '_':
                        case 'a':
                        case 'b':
                        case 'c':
                        case 'd':
                        case 'e':
                        case 'f':
                        case 'g':
                        case 'h':
                        case 'i':
                        case 'j':
                        case 'k':
                        case 'l':
                        case 'm':
                        case 'n':
                        case 'o':
                        case 'p':
                        case 'q':
                        case 'r':
                        case 's':
                        case 't':
                        case 'u':
                        case 'v':
                        case 'w':
                        case 'x':
                        case 'y':
                        case 'z':
                            {
                            alt3=8;
                            }
                            break;
                        default:
                            alt3=3;
                        }

                        }
                        break;
                    default:
                        alt3=8;
                    }

                    }
                    break;
                default:
                    alt3=8;
                }

                }
                break;
            default:
                alt3=8;
            }

            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt3=4;
            }
            break;
        case '(':
            {
            alt3=5;
            }
            break;
        case ')':
            {
            alt3=6;
            }
            break;
        case ':':
            {
            alt3=7;
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case '_':
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 'u':
        case 'v':
        case 'x':
        case 'y':
        case 'z':
            {
            alt3=8;
            }
            break;
        case '.':
            {
            alt3=9;
            }
            break;
        case ',':
            {
            alt3=10;
            }
            break;
        case '$':
            {
            alt3=11;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt3=12;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 3, 0, input);

            throw nvae;

        }

        switch (alt3) {
            case 1 :
                // org/apache/mahout/pig/encoders/Schema.g:1:10: NUMERIC
                {
                mNUMERIC(); 


                }
                break;
            case 2 :
                // org/apache/mahout/pig/encoders/Schema.g:1:18: WORD
                {
                mWORD(); 


                }
                break;
            case 3 :
                // org/apache/mahout/pig/encoders/Schema.g:1:23: TEXT
                {
                mTEXT(); 


                }
                break;
            case 4 :
                // org/apache/mahout/pig/encoders/Schema.g:1:28: INTEGER
                {
                mINTEGER(); 


                }
                break;
            case 5 :
                // org/apache/mahout/pig/encoders/Schema.g:1:36: LPAREN
                {
                mLPAREN(); 


                }
                break;
            case 6 :
                // org/apache/mahout/pig/encoders/Schema.g:1:43: RPAREN
                {
                mRPAREN(); 


                }
                break;
            case 7 :
                // org/apache/mahout/pig/encoders/Schema.g:1:50: COLON
                {
                mCOLON(); 


                }
                break;
            case 8 :
                // org/apache/mahout/pig/encoders/Schema.g:1:56: ID
                {
                mID(); 


                }
                break;
            case 9 :
                // org/apache/mahout/pig/encoders/Schema.g:1:59: DOT
                {
                mDOT(); 


                }
                break;
            case 10 :
                // org/apache/mahout/pig/encoders/Schema.g:1:63: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 11 :
                // org/apache/mahout/pig/encoders/Schema.g:1:69: DOLLAR
                {
                mDOLLAR(); 


                }
                break;
            case 12 :
                // org/apache/mahout/pig/encoders/Schema.g:1:76: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}