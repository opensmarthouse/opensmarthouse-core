package org.openhab.core.model.thing.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalThingLexer extends Lexer {
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalThingLexer() {;} 
    public InternalThingLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalThingLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalThing.g"; }

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalThing.g:11:7: ( 'State' )
            // InternalThing.g:11:9: 'State'
            {
            match("State"); 


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
            // InternalThing.g:12:7: ( 'Trigger' )
            // InternalThing.g:12:9: 'Trigger'
            {
            match("Trigger"); 


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
            // InternalThing.g:13:7: ( 'Switch' )
            // InternalThing.g:13:9: 'Switch'
            {
            match("Switch"); 


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
            // InternalThing.g:14:7: ( 'Rollershutter' )
            // InternalThing.g:14:9: 'Rollershutter'
            {
            match("Rollershutter"); 


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
            // InternalThing.g:15:7: ( 'Number' )
            // InternalThing.g:15:9: 'Number'
            {
            match("Number"); 


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
            // InternalThing.g:16:7: ( 'String' )
            // InternalThing.g:16:9: 'String'
            {
            match("String"); 


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
            // InternalThing.g:17:7: ( 'Dimmer' )
            // InternalThing.g:17:9: 'Dimmer'
            {
            match("Dimmer"); 


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
            // InternalThing.g:18:7: ( 'Contact' )
            // InternalThing.g:18:9: 'Contact'
            {
            match("Contact"); 


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
            // InternalThing.g:19:7: ( 'DateTime' )
            // InternalThing.g:19:9: 'DateTime'
            {
            match("DateTime"); 


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
            // InternalThing.g:20:7: ( 'Color' )
            // InternalThing.g:20:9: 'Color'
            {
            match("Color"); 


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
            // InternalThing.g:21:7: ( 'Player' )
            // InternalThing.g:21:9: 'Player'
            {
            match("Player"); 


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
            // InternalThing.g:22:7: ( 'Location' )
            // InternalThing.g:22:9: 'Location'
            {
            match("Location"); 


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
            // InternalThing.g:23:7: ( 'Call' )
            // InternalThing.g:23:9: 'Call'
            {
            match("Call"); 


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
            // InternalThing.g:24:7: ( 'Image' )
            // InternalThing.g:24:9: 'Image'
            {
            match("Image"); 


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
            // InternalThing.g:25:7: ( 'true' )
            // InternalThing.g:25:9: 'true'
            {
            match("true"); 


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
            // InternalThing.g:26:7: ( 'false' )
            // InternalThing.g:26:9: 'false'
            {
            match("false"); 


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
            // InternalThing.g:27:7: ( '@' )
            // InternalThing.g:27:9: '@'
            {
            match('@'); 

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
            // InternalThing.g:28:7: ( '[' )
            // InternalThing.g:28:9: '['
            {
            match('['); 

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
            // InternalThing.g:29:7: ( ']' )
            // InternalThing.g:29:9: ']'
            {
            match(']'); 

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
            // InternalThing.g:30:7: ( ',' )
            // InternalThing.g:30:9: ','
            {
            match(','); 

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
            // InternalThing.g:31:7: ( '{' )
            // InternalThing.g:31:9: '{'
            {
            match('{'); 

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
            // InternalThing.g:32:7: ( 'Things:' )
            // InternalThing.g:32:9: 'Things:'
            {
            match("Things:"); 


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
            // InternalThing.g:33:7: ( 'Channels:' )
            // InternalThing.g:33:9: 'Channels:'
            {
            match("Channels:"); 


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
            // InternalThing.g:34:7: ( '}' )
            // InternalThing.g:34:9: '}'
            {
            match('}'); 

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
            // InternalThing.g:35:7: ( 'Thing' )
            // InternalThing.g:35:9: 'Thing'
            {
            match("Thing"); 


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
            // InternalThing.g:36:7: ( '(' )
            // InternalThing.g:36:9: '('
            {
            match('('); 

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
            // InternalThing.g:37:7: ( ')' )
            // InternalThing.g:37:9: ')'
            {
            match(')'); 

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
            // InternalThing.g:38:7: ( ':' )
            // InternalThing.g:38:9: ':'
            {
            match(':'); 

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
            // InternalThing.g:39:7: ( 'Type' )
            // InternalThing.g:39:9: 'Type'
            {
            match("Type"); 


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
            // InternalThing.g:40:7: ( 'Number:' )
            // InternalThing.g:40:9: 'Number:'
            {
            match("Number:"); 


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
            // InternalThing.g:41:7: ( '=' )
            // InternalThing.g:41:9: '='
            {
            match('='); 

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
            // InternalThing.g:42:7: ( '#' )
            // InternalThing.g:42:9: '#'
            {
            match('#'); 

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
            // InternalThing.g:43:7: ( '.' )
            // InternalThing.g:43:9: '.'
            {
            match('.'); 

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
            // InternalThing.g:44:7: ( 'Bridge' )
            // InternalThing.g:44:9: 'Bridge'
            {
            match("Bridge"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalThing.g:3430:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )* )
            // InternalThing.g:3430:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )*
            {
            // InternalThing.g:3430:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalThing.g:3430:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalThing.g:3430:53: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='-'||(LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalThing.g:
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
            // InternalThing.g:3432:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalThing.g:3432:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalThing.g:3432:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalThing.g:3432:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalThing.g:3432:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalThing.g:3432:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // InternalThing.g:3432:66: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalThing.g:3432:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalThing.g:3432:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalThing.g:3432:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // InternalThing.g:3432:137: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalThing.g:3434:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalThing.g:3434:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalThing.g:3434:24: ( options {greedy=false; } : . )*
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
            	    // InternalThing.g:3434:52: .
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
            // InternalThing.g:3436:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalThing.g:3436:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalThing.g:3436:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalThing.g:3436:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalThing.g:3436:40: ( ( '\\r' )? '\\n' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\n'||LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalThing.g:3436:41: ( '\\r' )? '\\n'
                    {
                    // InternalThing.g:3436:41: ( '\\r' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\r') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalThing.g:3436:41: '\\r'
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
            // InternalThing.g:3438:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalThing.g:3438:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalThing.g:3438:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalThing.g:
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
            // InternalThing.g:3440:16: ( . )
            // InternalThing.g:3440:18: .
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
        // InternalThing.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt11=40;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // InternalThing.g:1:10: T__10
                {
                mT__10(); 

                }
                break;
            case 2 :
                // InternalThing.g:1:16: T__11
                {
                mT__11(); 

                }
                break;
            case 3 :
                // InternalThing.g:1:22: T__12
                {
                mT__12(); 

                }
                break;
            case 4 :
                // InternalThing.g:1:28: T__13
                {
                mT__13(); 

                }
                break;
            case 5 :
                // InternalThing.g:1:34: T__14
                {
                mT__14(); 

                }
                break;
            case 6 :
                // InternalThing.g:1:40: T__15
                {
                mT__15(); 

                }
                break;
            case 7 :
                // InternalThing.g:1:46: T__16
                {
                mT__16(); 

                }
                break;
            case 8 :
                // InternalThing.g:1:52: T__17
                {
                mT__17(); 

                }
                break;
            case 9 :
                // InternalThing.g:1:58: T__18
                {
                mT__18(); 

                }
                break;
            case 10 :
                // InternalThing.g:1:64: T__19
                {
                mT__19(); 

                }
                break;
            case 11 :
                // InternalThing.g:1:70: T__20
                {
                mT__20(); 

                }
                break;
            case 12 :
                // InternalThing.g:1:76: T__21
                {
                mT__21(); 

                }
                break;
            case 13 :
                // InternalThing.g:1:82: T__22
                {
                mT__22(); 

                }
                break;
            case 14 :
                // InternalThing.g:1:88: T__23
                {
                mT__23(); 

                }
                break;
            case 15 :
                // InternalThing.g:1:94: T__24
                {
                mT__24(); 

                }
                break;
            case 16 :
                // InternalThing.g:1:100: T__25
                {
                mT__25(); 

                }
                break;
            case 17 :
                // InternalThing.g:1:106: T__26
                {
                mT__26(); 

                }
                break;
            case 18 :
                // InternalThing.g:1:112: T__27
                {
                mT__27(); 

                }
                break;
            case 19 :
                // InternalThing.g:1:118: T__28
                {
                mT__28(); 

                }
                break;
            case 20 :
                // InternalThing.g:1:124: T__29
                {
                mT__29(); 

                }
                break;
            case 21 :
                // InternalThing.g:1:130: T__30
                {
                mT__30(); 

                }
                break;
            case 22 :
                // InternalThing.g:1:136: T__31
                {
                mT__31(); 

                }
                break;
            case 23 :
                // InternalThing.g:1:142: T__32
                {
                mT__32(); 

                }
                break;
            case 24 :
                // InternalThing.g:1:148: T__33
                {
                mT__33(); 

                }
                break;
            case 25 :
                // InternalThing.g:1:154: T__34
                {
                mT__34(); 

                }
                break;
            case 26 :
                // InternalThing.g:1:160: T__35
                {
                mT__35(); 

                }
                break;
            case 27 :
                // InternalThing.g:1:166: T__36
                {
                mT__36(); 

                }
                break;
            case 28 :
                // InternalThing.g:1:172: T__37
                {
                mT__37(); 

                }
                break;
            case 29 :
                // InternalThing.g:1:178: T__38
                {
                mT__38(); 

                }
                break;
            case 30 :
                // InternalThing.g:1:184: T__39
                {
                mT__39(); 

                }
                break;
            case 31 :
                // InternalThing.g:1:190: T__40
                {
                mT__40(); 

                }
                break;
            case 32 :
                // InternalThing.g:1:196: T__41
                {
                mT__41(); 

                }
                break;
            case 33 :
                // InternalThing.g:1:202: T__42
                {
                mT__42(); 

                }
                break;
            case 34 :
                // InternalThing.g:1:208: T__43
                {
                mT__43(); 

                }
                break;
            case 35 :
                // InternalThing.g:1:214: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 36 :
                // InternalThing.g:1:222: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 37 :
                // InternalThing.g:1:234: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 38 :
                // InternalThing.g:1:250: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 39 :
                // InternalThing.g:1:266: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 40 :
                // InternalThing.g:1:274: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\13\42\14\uffff\1\42\1\37\1\uffff\3\37\2\uffff\2\42\1\uffff\17\42\14\uffff\1\42\4\uffff\31\42\1\160\6\42\1\167\4\42\1\174\2\42\1\177\3\42\1\u0084\1\uffff\5\42\1\u008a\1\uffff\3\42\1\u008e\1\uffff\1\u008f\1\42\1\uffff\1\u0091\1\u0092\2\42\1\uffff\1\42\1\u0097\1\u0098\2\42\1\uffff\1\42\1\u009c\1\42\2\uffff\1\u009e\2\uffff\1\u009f\1\uffff\1\42\3\uffff\1\42\1\u00a2\1\42\1\uffff\1\42\2\uffff\1\42\1\u00a6\1\uffff\1\42\1\u00a8\1\42\3\uffff\3\42\1\u00ad\1\uffff";
    static final String DFA11_eofS =
        "\u00ae\uffff";
    static final String DFA11_minS =
        "\1\0\1\164\1\150\1\157\1\165\2\141\1\154\1\157\1\155\1\162\1\141\14\uffff\1\162\1\55\1\uffff\2\0\1\52\2\uffff\1\141\1\151\1\uffff\2\151\1\160\1\154\2\155\1\164\2\154\2\141\1\143\1\141\1\165\1\154\14\uffff\1\151\4\uffff\1\164\1\151\1\164\1\147\1\156\1\145\1\154\1\142\1\155\1\145\1\164\1\157\1\154\1\156\1\171\1\141\1\147\1\145\1\163\1\144\1\145\1\156\1\143\2\147\1\55\3\145\1\124\1\141\1\162\1\55\1\156\1\145\1\164\1\145\1\55\1\145\1\147\1\55\1\147\1\150\1\145\1\55\1\uffff\3\162\1\151\1\143\1\55\1\uffff\1\145\1\162\1\151\1\55\1\uffff\1\55\1\145\1\uffff\2\55\1\162\1\72\1\uffff\1\163\2\55\1\155\1\164\1\uffff\1\154\1\55\1\157\2\uffff\1\55\2\uffff\1\55\1\uffff\1\150\3\uffff\1\145\1\55\1\163\1\uffff\1\156\2\uffff\1\165\1\55\1\uffff\1\72\1\55\1\164\3\uffff\1\164\1\145\1\162\1\55\1\uffff";
    static final String DFA11_maxS =
        "\1\uffff\1\167\1\171\1\157\1\165\1\151\1\157\1\154\1\157\1\155\1\162\1\141\14\uffff\1\162\1\172\1\uffff\2\uffff\1\57\2\uffff\1\162\1\151\1\uffff\2\151\1\160\1\154\2\155\1\164\1\156\1\154\2\141\1\143\1\141\1\165\1\154\14\uffff\1\151\4\uffff\1\164\1\151\1\164\1\147\1\156\1\145\1\154\1\142\1\155\1\145\1\164\1\157\1\154\1\156\1\171\1\141\1\147\1\145\1\163\1\144\1\145\1\156\1\143\2\147\1\172\3\145\1\124\1\141\1\162\1\172\1\156\1\145\1\164\1\145\1\172\1\145\1\147\1\172\1\147\1\150\1\145\1\172\1\uffff\3\162\1\151\1\143\1\172\1\uffff\1\145\1\162\1\151\1\172\1\uffff\1\172\1\145\1\uffff\2\172\1\162\1\72\1\uffff\1\163\2\172\1\155\1\164\1\uffff\1\154\1\172\1\157\2\uffff\1\172\2\uffff\1\172\1\uffff\1\150\3\uffff\1\145\1\172\1\163\1\uffff\1\156\2\uffff\1\165\1\172\1\uffff\1\72\1\172\1\164\3\uffff\1\164\1\145\1\162\1\172\1\uffff";
    static final String DFA11_acceptS =
        "\14\uffff\1\21\1\22\1\23\1\24\1\25\1\30\1\32\1\33\1\34\1\37\1\40\1\41\2\uffff\1\43\3\uffff\1\47\1\50\2\uffff\1\43\17\uffff\1\21\1\22\1\23\1\24\1\25\1\30\1\32\1\33\1\34\1\37\1\40\1\41\1\uffff\1\44\1\45\1\46\1\47\55\uffff\1\35\6\uffff\1\15\4\uffff\1\17\2\uffff\1\1\4\uffff\1\31\5\uffff\1\12\3\uffff\1\16\1\20\1\uffff\1\6\1\3\1\uffff\1\26\1\uffff\1\36\1\5\1\7\3\uffff\1\13\1\uffff\1\42\1\2\2\uffff\1\10\3\uffff\1\11\1\27\1\14\4\uffff\1\4";
    static final String DFA11_specialS =
        "\1\1\32\uffff\1\0\1\2\u0091\uffff}>";
    static final String[] DFA11_transitionS = {
            "\11\37\2\36\2\37\1\36\22\37\1\36\1\37\1\33\1\26\3\37\1\34\1\22\1\23\2\37\1\17\1\32\1\27\1\35\12\32\1\24\2\37\1\25\2\37\1\14\1\32\1\30\1\6\1\5\4\32\1\11\2\32\1\10\1\32\1\4\1\32\1\7\1\32\1\3\1\1\1\2\6\32\1\15\1\37\1\16\1\31\1\32\1\37\5\32\1\13\15\32\1\12\6\32\1\20\1\37\1\21\uff82\37",
            "\1\40\2\uffff\1\41",
            "\1\44\11\uffff\1\43\6\uffff\1\45",
            "\1\46",
            "\1\47",
            "\1\51\7\uffff\1\50",
            "\1\53\6\uffff\1\54\6\uffff\1\52",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
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
            "",
            "\1\76",
            "\1\42\2\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\0\77",
            "\0\77",
            "\1\100\4\uffff\1\101",
            "",
            "",
            "\1\103\20\uffff\1\104",
            "\1\105",
            "",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\116\1\uffff\1\115",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
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
            "",
            "\1\126",
            "",
            "",
            "",
            "",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\42\2\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\42\2\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\42\2\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\175",
            "\1\176",
            "\1\42\2\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\42\2\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\22\42\1\u0083\7\42",
            "",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\42\2\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\42\2\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\42\2\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0090",
            "",
            "\1\42\2\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\42\2\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0093",
            "\1\u0094",
            "",
            "\1\u0095",
            "\1\42\2\uffff\12\42\1\u0096\6\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\42\2\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0099",
            "\1\u009a",
            "",
            "\1\u009b",
            "\1\42\2\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u009d",
            "",
            "",
            "\1\42\2\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\1\42\2\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u00a0",
            "",
            "",
            "",
            "\1\u00a1",
            "\1\42\2\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00a3",
            "",
            "\1\u00a4",
            "",
            "",
            "\1\u00a5",
            "\1\42\2\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u00a7",
            "\1\42\2\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00a9",
            "",
            "",
            "",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\42\2\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
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
            return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_27 = input.LA(1);

                        s = -1;
                        if ( ((LA11_27>='\u0000' && LA11_27<='\uFFFF')) ) {s = 63;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_0 = input.LA(1);

                        s = -1;
                        if ( (LA11_0=='S') ) {s = 1;}

                        else if ( (LA11_0=='T') ) {s = 2;}

                        else if ( (LA11_0=='R') ) {s = 3;}

                        else if ( (LA11_0=='N') ) {s = 4;}

                        else if ( (LA11_0=='D') ) {s = 5;}

                        else if ( (LA11_0=='C') ) {s = 6;}

                        else if ( (LA11_0=='P') ) {s = 7;}

                        else if ( (LA11_0=='L') ) {s = 8;}

                        else if ( (LA11_0=='I') ) {s = 9;}

                        else if ( (LA11_0=='t') ) {s = 10;}

                        else if ( (LA11_0=='f') ) {s = 11;}

                        else if ( (LA11_0=='@') ) {s = 12;}

                        else if ( (LA11_0=='[') ) {s = 13;}

                        else if ( (LA11_0==']') ) {s = 14;}

                        else if ( (LA11_0==',') ) {s = 15;}

                        else if ( (LA11_0=='{') ) {s = 16;}

                        else if ( (LA11_0=='}') ) {s = 17;}

                        else if ( (LA11_0=='(') ) {s = 18;}

                        else if ( (LA11_0==')') ) {s = 19;}

                        else if ( (LA11_0==':') ) {s = 20;}

                        else if ( (LA11_0=='=') ) {s = 21;}

                        else if ( (LA11_0=='#') ) {s = 22;}

                        else if ( (LA11_0=='.') ) {s = 23;}

                        else if ( (LA11_0=='B') ) {s = 24;}

                        else if ( (LA11_0=='^') ) {s = 25;}

                        else if ( (LA11_0=='-'||(LA11_0>='0' && LA11_0<='9')||LA11_0=='A'||(LA11_0>='E' && LA11_0<='H')||(LA11_0>='J' && LA11_0<='K')||LA11_0=='M'||LA11_0=='O'||LA11_0=='Q'||(LA11_0>='U' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='e')||(LA11_0>='g' && LA11_0<='s')||(LA11_0>='u' && LA11_0<='z')) ) {s = 26;}

                        else if ( (LA11_0=='\"') ) {s = 27;}

                        else if ( (LA11_0=='\'') ) {s = 28;}

                        else if ( (LA11_0=='/') ) {s = 29;}

                        else if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {s = 30;}

                        else if ( ((LA11_0>='\u0000' && LA11_0<='\b')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\u001F')||LA11_0=='!'||(LA11_0>='$' && LA11_0<='&')||(LA11_0>='*' && LA11_0<='+')||(LA11_0>=';' && LA11_0<='<')||(LA11_0>='>' && LA11_0<='?')||LA11_0=='\\'||LA11_0=='`'||LA11_0=='|'||(LA11_0>='~' && LA11_0<='\uFFFF')) ) {s = 31;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_28 = input.LA(1);

                        s = -1;
                        if ( ((LA11_28>='\u0000' && LA11_28<='\uFFFF')) ) {s = 63;}

                        else s = 31;

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