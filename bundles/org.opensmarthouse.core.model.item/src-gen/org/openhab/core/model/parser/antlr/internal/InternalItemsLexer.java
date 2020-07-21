package org.openhab.core.model.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalItemsLexer extends Lexer {
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__10=10;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=6;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=7;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=8;
    public static final int RULE_ANY_OTHER=9;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalItemsLexer() {;} 
    public InternalItemsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalItemsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalItems.g"; }

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:11:7: ( '<' )
            // InternalItems.g:11:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:12:7: ( '>' )
            // InternalItems.g:12:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:13:7: ( '(' )
            // InternalItems.g:13:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:14:7: ( ',' )
            // InternalItems.g:14:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:15:7: ( ')' )
            // InternalItems.g:15:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:16:7: ( '[' )
            // InternalItems.g:16:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:17:7: ( ']' )
            // InternalItems.g:17:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:18:7: ( '{' )
            // InternalItems.g:18:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:19:7: ( '}' )
            // InternalItems.g:19:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:20:7: ( 'Group' )
            // InternalItems.g:20:9: 'Group'
            {
            match("Group"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:21:7: ( ':' )
            // InternalItems.g:21:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:22:7: ( 'Number' )
            // InternalItems.g:22:9: 'Number'
            {
            match("Number"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:23:7: ( 'Switch' )
            // InternalItems.g:23:9: 'Switch'
            {
            match("Switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:24:7: ( 'Rollershutter' )
            // InternalItems.g:24:9: 'Rollershutter'
            {
            match("Rollershutter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:25:7: ( 'String' )
            // InternalItems.g:25:9: 'String'
            {
            match("String"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:26:7: ( 'Dimmer' )
            // InternalItems.g:26:9: 'Dimmer'
            {
            match("Dimmer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:27:7: ( 'Contact' )
            // InternalItems.g:27:9: 'Contact'
            {
            match("Contact"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:28:7: ( 'DateTime' )
            // InternalItems.g:28:9: 'DateTime'
            {
            match("DateTime"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:29:7: ( 'Color' )
            // InternalItems.g:29:9: 'Color'
            {
            match("Color"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:30:7: ( 'Player' )
            // InternalItems.g:30:9: 'Player'
            {
            match("Player"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:31:7: ( 'Location' )
            // InternalItems.g:31:9: 'Location'
            {
            match("Location"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:32:7: ( 'Call' )
            // InternalItems.g:32:9: 'Call'
            {
            match("Call"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:33:7: ( 'Image' )
            // InternalItems.g:33:9: 'Image'
            {
            match("Image"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:34:7: ( '=' )
            // InternalItems.g:34:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:35:7: ( 'true' )
            // InternalItems.g:35:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:36:7: ( 'false' )
            // InternalItems.g:36:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:37:7: ( '-' )
            // InternalItems.g:37:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:38:7: ( '.' )
            // InternalItems.g:38:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:39:7: ( 'EQUALITY' )
            // InternalItems.g:39:9: 'EQUALITY'
            {
            match("EQUALITY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:40:7: ( 'AND' )
            // InternalItems.g:40:9: 'AND'
            {
            match("AND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:41:7: ( 'OR' )
            // InternalItems.g:41:9: 'OR'
            {
            match("OR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:42:7: ( 'NAND' )
            // InternalItems.g:42:9: 'NAND'
            {
            match("NAND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:43:7: ( 'NOR' )
            // InternalItems.g:43:9: 'NOR'
            {
            match("NOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:44:7: ( 'AVG' )
            // InternalItems.g:44:9: 'AVG'
            {
            match("AVG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:45:7: ( 'SUM' )
            // InternalItems.g:45:9: 'SUM'
            {
            match("SUM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:46:7: ( 'MAX' )
            // InternalItems.g:46:9: 'MAX'
            {
            match("MAX"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:47:7: ( 'MIN' )
            // InternalItems.g:47:9: 'MIN'
            {
            match("MIN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:48:7: ( 'COUNT' )
            // InternalItems.g:48:9: 'COUNT'
            {
            match("COUNT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:49:7: ( 'LATEST' )
            // InternalItems.g:49:9: 'LATEST'
            {
            match("LATEST"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:50:7: ( 'EARLIEST' )
            // InternalItems.g:50:9: 'EARLIEST'
            {
            match("EARLIEST"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:1162:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )* )
            // InternalItems.g:1162:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )*
            {
            // InternalItems.g:1162:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalItems.g:1162:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalItems.g:1162:49: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='-'||(LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalItems.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:1164:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalItems.g:1164:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalItems.g:1164:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\"') ) {
                alt5=1;
            }
            else if ( (LA5_0=='\'') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalItems.g:1164:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalItems.g:1164:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop3:
                    do {
                        int alt3=3;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='\\') ) {
                            alt3=1;
                        }
                        else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                            alt3=2;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalItems.g:1164:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalItems.g:1164:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalItems.g:1164:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalItems.g:1164:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='&')||(LA4_0>='(' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalItems.g:1164:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalItems.g:1164:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:1166:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalItems.g:1166:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalItems.g:1166:24: ( options {greedy=false; } : . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='*') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='/') ) {
                        alt6=2;
                    }
                    else if ( ((LA6_1>='\u0000' && LA6_1<='.')||(LA6_1>='0' && LA6_1<='\uFFFF')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0>='\u0000' && LA6_0<=')')||(LA6_0>='+' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalItems.g:1166:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:1168:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalItems.g:1168:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalItems.g:1168:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalItems.g:1168:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalItems.g:1168:40: ( ( '\\r' )? '\\n' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\n'||LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalItems.g:1168:41: ( '\\r' )? '\\n'
                    {
                    // InternalItems.g:1168:41: ( '\\r' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\r') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalItems.g:1168:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:1170:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalItems.g:1170:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalItems.g:1170:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||LA10_0==' ') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalItems.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalItems.g:1172:16: ( . )
            // InternalItems.g:1172:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalItems.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt11=46;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // InternalItems.g:1:10: T__10
                {
                mT__10(); 

                }
                break;
            case 2 :
                // InternalItems.g:1:16: T__11
                {
                mT__11(); 

                }
                break;
            case 3 :
                // InternalItems.g:1:22: T__12
                {
                mT__12(); 

                }
                break;
            case 4 :
                // InternalItems.g:1:28: T__13
                {
                mT__13(); 

                }
                break;
            case 5 :
                // InternalItems.g:1:34: T__14
                {
                mT__14(); 

                }
                break;
            case 6 :
                // InternalItems.g:1:40: T__15
                {
                mT__15(); 

                }
                break;
            case 7 :
                // InternalItems.g:1:46: T__16
                {
                mT__16(); 

                }
                break;
            case 8 :
                // InternalItems.g:1:52: T__17
                {
                mT__17(); 

                }
                break;
            case 9 :
                // InternalItems.g:1:58: T__18
                {
                mT__18(); 

                }
                break;
            case 10 :
                // InternalItems.g:1:64: T__19
                {
                mT__19(); 

                }
                break;
            case 11 :
                // InternalItems.g:1:70: T__20
                {
                mT__20(); 

                }
                break;
            case 12 :
                // InternalItems.g:1:76: T__21
                {
                mT__21(); 

                }
                break;
            case 13 :
                // InternalItems.g:1:82: T__22
                {
                mT__22(); 

                }
                break;
            case 14 :
                // InternalItems.g:1:88: T__23
                {
                mT__23(); 

                }
                break;
            case 15 :
                // InternalItems.g:1:94: T__24
                {
                mT__24(); 

                }
                break;
            case 16 :
                // InternalItems.g:1:100: T__25
                {
                mT__25(); 

                }
                break;
            case 17 :
                // InternalItems.g:1:106: T__26
                {
                mT__26(); 

                }
                break;
            case 18 :
                // InternalItems.g:1:112: T__27
                {
                mT__27(); 

                }
                break;
            case 19 :
                // InternalItems.g:1:118: T__28
                {
                mT__28(); 

                }
                break;
            case 20 :
                // InternalItems.g:1:124: T__29
                {
                mT__29(); 

                }
                break;
            case 21 :
                // InternalItems.g:1:130: T__30
                {
                mT__30(); 

                }
                break;
            case 22 :
                // InternalItems.g:1:136: T__31
                {
                mT__31(); 

                }
                break;
            case 23 :
                // InternalItems.g:1:142: T__32
                {
                mT__32(); 

                }
                break;
            case 24 :
                // InternalItems.g:1:148: T__33
                {
                mT__33(); 

                }
                break;
            case 25 :
                // InternalItems.g:1:154: T__34
                {
                mT__34(); 

                }
                break;
            case 26 :
                // InternalItems.g:1:160: T__35
                {
                mT__35(); 

                }
                break;
            case 27 :
                // InternalItems.g:1:166: T__36
                {
                mT__36(); 

                }
                break;
            case 28 :
                // InternalItems.g:1:172: T__37
                {
                mT__37(); 

                }
                break;
            case 29 :
                // InternalItems.g:1:178: T__38
                {
                mT__38(); 

                }
                break;
            case 30 :
                // InternalItems.g:1:184: T__39
                {
                mT__39(); 

                }
                break;
            case 31 :
                // InternalItems.g:1:190: T__40
                {
                mT__40(); 

                }
                break;
            case 32 :
                // InternalItems.g:1:196: T__41
                {
                mT__41(); 

                }
                break;
            case 33 :
                // InternalItems.g:1:202: T__42
                {
                mT__42(); 

                }
                break;
            case 34 :
                // InternalItems.g:1:208: T__43
                {
                mT__43(); 

                }
                break;
            case 35 :
                // InternalItems.g:1:214: T__44
                {
                mT__44(); 

                }
                break;
            case 36 :
                // InternalItems.g:1:220: T__45
                {
                mT__45(); 

                }
                break;
            case 37 :
                // InternalItems.g:1:226: T__46
                {
                mT__46(); 

                }
                break;
            case 38 :
                // InternalItems.g:1:232: T__47
                {
                mT__47(); 

                }
                break;
            case 39 :
                // InternalItems.g:1:238: T__48
                {
                mT__48(); 

                }
                break;
            case 40 :
                // InternalItems.g:1:244: T__49
                {
                mT__49(); 

                }
                break;
            case 41 :
                // InternalItems.g:1:250: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 42 :
                // InternalItems.g:1:258: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 43 :
                // InternalItems.g:1:270: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 44 :
                // InternalItems.g:1:286: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 45 :
                // InternalItems.g:1:302: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 46 :
                // InternalItems.g:1:310: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\12\uffff\1\56\1\uffff\10\56\1\uffff\2\56\2\uffff\4\56\1\43\1\uffff\3\43\13\uffff\1\56\2\uffff\20\56\1\uffff\2\56\2\uffff\4\56\1\150\2\56\4\uffff\3\56\1\156\2\56\1\161\17\56\1\u0081\1\u0082\1\uffff\1\u0083\1\u0084\2\56\1\u0087\1\uffff\2\56\1\uffff\5\56\1\u008f\5\56\1\u0095\3\56\4\uffff\1\u0099\1\56\1\uffff\6\56\1\u00a1\1\uffff\1\u00a2\3\56\1\u00a6\1\uffff\1\u00a7\2\56\1\uffff\1\u00aa\1\u00ab\1\u00ac\1\56\1\u00ae\2\56\2\uffff\1\u00b1\1\56\1\u00b3\2\uffff\2\56\3\uffff\1\56\1\uffff\1\56\1\u00b8\1\uffff\1\56\1\uffff\3\56\1\u00bd\1\uffff\1\u00be\1\u00bf\1\u00c0\1\56\4\uffff\3\56\1\u00c5\1\uffff";
    static final String DFA11_eofS =
        "\u00c6\uffff";
    static final String DFA11_minS =
        "\1\0\11\uffff\1\162\1\uffff\1\101\1\125\1\157\1\141\1\117\1\154\1\101\1\155\1\uffff\1\162\1\141\2\uffff\1\101\1\116\1\122\1\101\1\60\1\uffff\2\0\1\52\13\uffff\1\157\2\uffff\1\155\1\116\1\122\1\151\1\162\1\115\1\154\1\155\1\164\2\154\1\125\1\141\1\143\1\124\1\141\1\uffff\1\165\1\154\2\uffff\1\125\1\122\1\104\1\107\1\55\1\130\1\116\4\uffff\1\165\1\142\1\104\1\55\1\164\1\151\1\55\1\154\1\155\1\145\1\164\1\157\1\154\1\116\1\171\1\141\1\105\1\147\1\145\1\163\1\101\1\114\2\55\1\uffff\2\55\1\160\1\145\1\55\1\uffff\1\143\1\156\1\uffff\2\145\1\124\1\141\1\162\1\55\1\124\1\145\1\164\1\123\1\145\1\55\1\145\1\114\1\111\4\uffff\1\55\1\162\1\uffff\1\150\1\147\2\162\1\151\1\143\1\55\1\uffff\1\55\1\162\1\151\1\124\1\55\1\uffff\1\55\1\111\1\105\1\uffff\3\55\1\163\1\55\1\155\1\164\2\uffff\1\55\1\157\1\55\2\uffff\1\124\1\123\3\uffff\1\150\1\uffff\1\145\1\55\1\uffff\1\156\1\uffff\1\131\1\124\1\165\1\55\1\uffff\3\55\1\164\4\uffff\1\164\1\145\1\162\1\55\1\uffff";
    static final String DFA11_maxS =
        "\1\uffff\11\uffff\1\162\1\uffff\1\165\1\167\1\157\1\151\1\157\1\154\1\157\1\155\1\uffff\1\162\1\141\2\uffff\1\121\1\126\1\122\1\111\1\172\1\uffff\2\uffff\1\57\13\uffff\1\157\2\uffff\1\155\1\116\1\122\1\151\1\162\1\115\1\154\1\155\1\164\1\156\1\154\1\125\1\141\1\143\1\124\1\141\1\uffff\1\165\1\154\2\uffff\1\125\1\122\1\104\1\107\1\172\1\130\1\116\4\uffff\1\165\1\142\1\104\1\172\1\164\1\151\1\172\1\154\1\155\1\145\1\164\1\157\1\154\1\116\1\171\1\141\1\105\1\147\1\145\1\163\1\101\1\114\2\172\1\uffff\2\172\1\160\1\145\1\172\1\uffff\1\143\1\156\1\uffff\2\145\1\124\1\141\1\162\1\172\1\124\1\145\1\164\1\123\1\145\1\172\1\145\1\114\1\111\4\uffff\1\172\1\162\1\uffff\1\150\1\147\2\162\1\151\1\143\1\172\1\uffff\1\172\1\162\1\151\1\124\1\172\1\uffff\1\172\1\111\1\105\1\uffff\3\172\1\163\1\172\1\155\1\164\2\uffff\1\172\1\157\1\172\2\uffff\1\124\1\123\3\uffff\1\150\1\uffff\1\145\1\172\1\uffff\1\156\1\uffff\1\131\1\124\1\165\1\172\1\uffff\3\172\1\164\4\uffff\1\164\1\145\1\162\1\172\1\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\13\10\uffff\1\30\2\uffff\1\33\1\34\5\uffff\1\51\3\uffff\1\55\1\56\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\51\1\13\20\uffff\1\30\2\uffff\1\33\1\34\7\uffff\1\52\1\53\1\54\1\55\30\uffff\1\37\5\uffff\1\41\2\uffff\1\43\17\uffff\1\36\1\42\1\44\1\45\2\uffff\1\40\7\uffff\1\26\5\uffff\1\31\3\uffff\1\12\7\uffff\1\23\1\46\3\uffff\1\27\1\32\2\uffff\1\14\1\15\1\17\1\uffff\1\20\2\uffff\1\24\1\uffff\1\47\4\uffff\1\21\4\uffff\1\22\1\25\1\35\1\50\4\uffff\1\16";
    static final String DFA11_specialS =
        "\1\1\36\uffff\1\2\1\0\u00a5\uffff}>";
    static final String[] DFA11_transitionS = {
            "\11\43\2\42\2\43\1\42\22\43\1\42\1\43\1\37\4\43\1\40\1\3\1\5\2\43\1\4\1\27\1\30\1\41\12\36\1\13\1\43\1\1\1\24\1\2\2\43\1\32\1\36\1\20\1\17\1\31\1\36\1\12\1\36\1\23\2\36\1\22\1\34\1\14\1\33\1\21\1\36\1\16\1\15\7\36\1\6\1\43\1\7\1\35\1\36\1\43\5\36\1\26\15\36\1\25\6\36\1\10\1\43\1\11\uff82\43",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\55",
            "",
            "\1\61\15\uffff\1\62\45\uffff\1\60",
            "\1\65\36\uffff\1\64\2\uffff\1\63",
            "\1\66",
            "\1\70\7\uffff\1\67",
            "\1\73\21\uffff\1\72\15\uffff\1\71",
            "\1\74",
            "\1\76\55\uffff\1\75",
            "\1\77",
            "",
            "\1\101",
            "\1\102",
            "",
            "",
            "\1\106\17\uffff\1\105",
            "\1\107\7\uffff\1\110",
            "\1\111",
            "\1\112\7\uffff\1\113",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\0\114",
            "\0\114",
            "\1\115\4\uffff\1\116",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\120",
            "",
            "",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\133\1\uffff\1\132",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "",
            "\1\142",
            "\1\143",
            "",
            "",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\56\2\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\151",
            "\1\152",
            "",
            "",
            "",
            "",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\56\2\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\157",
            "\1\160",
            "\1\56\2\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\56\2\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\56\2\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\56\2\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\56\2\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0085",
            "\1\u0086",
            "\1\56\2\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u0088",
            "\1\u0089",
            "",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\56\2\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\56\2\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "",
            "",
            "",
            "",
            "\1\56\2\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u009a",
            "",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\56\2\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\56\2\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\56\2\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\56\2\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00a8",
            "\1\u00a9",
            "",
            "\1\56\2\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\56\2\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\56\2\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00ad",
            "\1\56\2\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00af",
            "\1\u00b0",
            "",
            "",
            "\1\56\2\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00b2",
            "\1\56\2\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\u00b4",
            "\1\u00b5",
            "",
            "",
            "",
            "\1\u00b6",
            "",
            "\1\u00b7",
            "\1\56\2\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u00b9",
            "",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\56\2\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\56\2\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\56\2\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\56\2\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00c1",
            "",
            "",
            "",
            "",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\56\2\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_32 = input.LA(1);

                        s = -1;
                        if ( ((LA11_32>='\u0000' && LA11_32<='\uFFFF')) ) {s = 76;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_0 = input.LA(1);

                        s = -1;
                        if ( (LA11_0=='<') ) {s = 1;}

                        else if ( (LA11_0=='>') ) {s = 2;}

                        else if ( (LA11_0=='(') ) {s = 3;}

                        else if ( (LA11_0==',') ) {s = 4;}

                        else if ( (LA11_0==')') ) {s = 5;}

                        else if ( (LA11_0=='[') ) {s = 6;}

                        else if ( (LA11_0==']') ) {s = 7;}

                        else if ( (LA11_0=='{') ) {s = 8;}

                        else if ( (LA11_0=='}') ) {s = 9;}

                        else if ( (LA11_0=='G') ) {s = 10;}

                        else if ( (LA11_0==':') ) {s = 11;}

                        else if ( (LA11_0=='N') ) {s = 12;}

                        else if ( (LA11_0=='S') ) {s = 13;}

                        else if ( (LA11_0=='R') ) {s = 14;}

                        else if ( (LA11_0=='D') ) {s = 15;}

                        else if ( (LA11_0=='C') ) {s = 16;}

                        else if ( (LA11_0=='P') ) {s = 17;}

                        else if ( (LA11_0=='L') ) {s = 18;}

                        else if ( (LA11_0=='I') ) {s = 19;}

                        else if ( (LA11_0=='=') ) {s = 20;}

                        else if ( (LA11_0=='t') ) {s = 21;}

                        else if ( (LA11_0=='f') ) {s = 22;}

                        else if ( (LA11_0=='-') ) {s = 23;}

                        else if ( (LA11_0=='.') ) {s = 24;}

                        else if ( (LA11_0=='E') ) {s = 25;}

                        else if ( (LA11_0=='A') ) {s = 26;}

                        else if ( (LA11_0=='O') ) {s = 27;}

                        else if ( (LA11_0=='M') ) {s = 28;}

                        else if ( (LA11_0=='^') ) {s = 29;}

                        else if ( ((LA11_0>='0' && LA11_0<='9')||LA11_0=='B'||LA11_0=='F'||LA11_0=='H'||(LA11_0>='J' && LA11_0<='K')||LA11_0=='Q'||(LA11_0>='T' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='e')||(LA11_0>='g' && LA11_0<='s')||(LA11_0>='u' && LA11_0<='z')) ) {s = 30;}

                        else if ( (LA11_0=='\"') ) {s = 31;}

                        else if ( (LA11_0=='\'') ) {s = 32;}

                        else if ( (LA11_0=='/') ) {s = 33;}

                        else if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {s = 34;}

                        else if ( ((LA11_0>='\u0000' && LA11_0<='\b')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\u001F')||LA11_0=='!'||(LA11_0>='#' && LA11_0<='&')||(LA11_0>='*' && LA11_0<='+')||LA11_0==';'||(LA11_0>='?' && LA11_0<='@')||LA11_0=='\\'||LA11_0=='`'||LA11_0=='|'||(LA11_0>='~' && LA11_0<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_31 = input.LA(1);

                        s = -1;
                        if ( ((LA11_31>='\u0000' && LA11_31<='\uFFFF')) ) {s = 76;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}