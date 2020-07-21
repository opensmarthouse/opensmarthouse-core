package org.openhab.core.model.thing.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.openhab.core.model.thing.services.ThingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalThingParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Bridge'", "'@'", "'['", "','", "']'", "'{'", "'Things:'", "'Channels:'", "'}'", "'Thing'", "'('", "')'", "'State'", "'Trigger'", "'Type'", "':'", "'Number:'", "'Switch'", "'Rollershutter'", "'Number'", "'String'", "'Dimmer'", "'Contact'", "'DateTime'", "'Color'", "'Player'", "'Location'", "'Call'", "'Image'", "'='", "'#'", "'true'", "'false'", "'-'", "'.'"
    };
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
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
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
    public static final int T__44=44;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalThingParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalThingParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalThingParser.tokenNames; }
    public String getGrammarFileName() { return "InternalThing.g"; }



     	private ThingGrammarAccess grammarAccess;

        public InternalThingParser(TokenStream input, ThingGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ThingModel";
       	}

       	@Override
       	protected ThingGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleThingModel"
    // InternalThing.g:64:1: entryRuleThingModel returns [EObject current=null] : iv_ruleThingModel= ruleThingModel EOF ;
    public final EObject entryRuleThingModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThingModel = null;


        try {
            // InternalThing.g:64:51: (iv_ruleThingModel= ruleThingModel EOF )
            // InternalThing.g:65:2: iv_ruleThingModel= ruleThingModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getThingModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleThingModel=ruleThingModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleThingModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleThingModel"


    // $ANTLR start "ruleThingModel"
    // InternalThing.g:71:1: ruleThingModel returns [EObject current=null] : ( ( (lv_things_0_1= ruleModelThing | lv_things_0_2= ruleModelBridge ) ) )* ;
    public final EObject ruleThingModel() throws RecognitionException {
        EObject current = null;

        EObject lv_things_0_1 = null;

        EObject lv_things_0_2 = null;



        	enterRule();

        try {
            // InternalThing.g:77:2: ( ( ( (lv_things_0_1= ruleModelThing | lv_things_0_2= ruleModelBridge ) ) )* )
            // InternalThing.g:78:2: ( ( (lv_things_0_1= ruleModelThing | lv_things_0_2= ruleModelBridge ) ) )*
            {
            // InternalThing.g:78:2: ( ( (lv_things_0_1= ruleModelThing | lv_things_0_2= ruleModelBridge ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==10||LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalThing.g:79:3: ( (lv_things_0_1= ruleModelThing | lv_things_0_2= ruleModelBridge ) )
            	    {
            	    // InternalThing.g:79:3: ( (lv_things_0_1= ruleModelThing | lv_things_0_2= ruleModelBridge ) )
            	    // InternalThing.g:80:4: (lv_things_0_1= ruleModelThing | lv_things_0_2= ruleModelBridge )
            	    {
            	    // InternalThing.g:80:4: (lv_things_0_1= ruleModelThing | lv_things_0_2= ruleModelBridge )
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==RULE_ID||LA1_0==19) ) {
            	        alt1=1;
            	    }
            	    else if ( (LA1_0==10) ) {
            	        alt1=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // InternalThing.g:81:5: lv_things_0_1= ruleModelThing
            	            {
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getThingModelAccess().getThingsModelThingParserRuleCall_0_0());
            	              				
            	            }
            	            pushFollow(FOLLOW_3);
            	            lv_things_0_1=ruleModelThing();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					if (current==null) {
            	              						current = createModelElementForParent(grammarAccess.getThingModelRule());
            	              					}
            	              					add(
            	              						current,
            	              						"things",
            	              						lv_things_0_1,
            	              						"org.openhab.core.model.thing.Thing.ModelThing");
            	              					afterParserOrEnumRuleCall();
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalThing.g:97:5: lv_things_0_2= ruleModelBridge
            	            {
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getThingModelAccess().getThingsModelBridgeParserRuleCall_0_1());
            	              				
            	            }
            	            pushFollow(FOLLOW_3);
            	            lv_things_0_2=ruleModelBridge();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					if (current==null) {
            	              						current = createModelElementForParent(grammarAccess.getThingModelRule());
            	              					}
            	              					add(
            	              						current,
            	              						"things",
            	              						lv_things_0_2,
            	              						"org.openhab.core.model.thing.Thing.ModelBridge");
            	              					afterParserOrEnumRuleCall();
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleThingModel"


    // $ANTLR start "entryRuleModelBridge"
    // InternalThing.g:118:1: entryRuleModelBridge returns [EObject current=null] : iv_ruleModelBridge= ruleModelBridge EOF ;
    public final EObject entryRuleModelBridge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelBridge = null;


        try {
            // InternalThing.g:118:52: (iv_ruleModelBridge= ruleModelBridge EOF )
            // InternalThing.g:119:2: iv_ruleModelBridge= ruleModelBridge EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelBridgeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModelBridge=ruleModelBridge();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModelBridge; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelBridge"


    // $ANTLR start "ruleModelBridge"
    // InternalThing.g:125:1: ruleModelBridge returns [EObject current=null] : ( () ( (lv_bridge_1_0= 'Bridge' ) ) ( ( (lv_id_2_0= ruleUID ) ) | ( ( (lv_thingTypeId_3_0= ruleUID_SEGMENT ) ) ( (lv_thingId_4_0= ruleUID_SEGMENT ) ) ) ) ( (lv_label_5_0= RULE_STRING ) )? (otherlv_6= '@' ( (lv_location_7_0= RULE_STRING ) ) )? (otherlv_8= '[' ( (lv_properties_9_0= ruleModelProperty ) )? (otherlv_10= ',' ( (lv_properties_11_0= ruleModelProperty ) ) )* otherlv_12= ']' )? (otherlv_13= '{' (otherlv_14= 'Things:' )? ( ( (lv_things_15_1= ruleModelThing | lv_things_15_2= ruleModelBridge ) ) )* (otherlv_16= 'Channels:' )? ( (lv_channels_17_0= ruleModelChannel ) )* otherlv_18= '}' )? ) ;
    public final EObject ruleModelBridge() throws RecognitionException {
        EObject current = null;

        Token lv_bridge_1_0=null;
        Token lv_label_5_0=null;
        Token otherlv_6=null;
        Token lv_location_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_id_2_0 = null;

        AntlrDatatypeRuleToken lv_thingTypeId_3_0 = null;

        AntlrDatatypeRuleToken lv_thingId_4_0 = null;

        EObject lv_properties_9_0 = null;

        EObject lv_properties_11_0 = null;

        EObject lv_things_15_1 = null;

        EObject lv_things_15_2 = null;

        EObject lv_channels_17_0 = null;



        	enterRule();

        try {
            // InternalThing.g:131:2: ( ( () ( (lv_bridge_1_0= 'Bridge' ) ) ( ( (lv_id_2_0= ruleUID ) ) | ( ( (lv_thingTypeId_3_0= ruleUID_SEGMENT ) ) ( (lv_thingId_4_0= ruleUID_SEGMENT ) ) ) ) ( (lv_label_5_0= RULE_STRING ) )? (otherlv_6= '@' ( (lv_location_7_0= RULE_STRING ) ) )? (otherlv_8= '[' ( (lv_properties_9_0= ruleModelProperty ) )? (otherlv_10= ',' ( (lv_properties_11_0= ruleModelProperty ) ) )* otherlv_12= ']' )? (otherlv_13= '{' (otherlv_14= 'Things:' )? ( ( (lv_things_15_1= ruleModelThing | lv_things_15_2= ruleModelBridge ) ) )* (otherlv_16= 'Channels:' )? ( (lv_channels_17_0= ruleModelChannel ) )* otherlv_18= '}' )? ) )
            // InternalThing.g:132:2: ( () ( (lv_bridge_1_0= 'Bridge' ) ) ( ( (lv_id_2_0= ruleUID ) ) | ( ( (lv_thingTypeId_3_0= ruleUID_SEGMENT ) ) ( (lv_thingId_4_0= ruleUID_SEGMENT ) ) ) ) ( (lv_label_5_0= RULE_STRING ) )? (otherlv_6= '@' ( (lv_location_7_0= RULE_STRING ) ) )? (otherlv_8= '[' ( (lv_properties_9_0= ruleModelProperty ) )? (otherlv_10= ',' ( (lv_properties_11_0= ruleModelProperty ) ) )* otherlv_12= ']' )? (otherlv_13= '{' (otherlv_14= 'Things:' )? ( ( (lv_things_15_1= ruleModelThing | lv_things_15_2= ruleModelBridge ) ) )* (otherlv_16= 'Channels:' )? ( (lv_channels_17_0= ruleModelChannel ) )* otherlv_18= '}' )? )
            {
            // InternalThing.g:132:2: ( () ( (lv_bridge_1_0= 'Bridge' ) ) ( ( (lv_id_2_0= ruleUID ) ) | ( ( (lv_thingTypeId_3_0= ruleUID_SEGMENT ) ) ( (lv_thingId_4_0= ruleUID_SEGMENT ) ) ) ) ( (lv_label_5_0= RULE_STRING ) )? (otherlv_6= '@' ( (lv_location_7_0= RULE_STRING ) ) )? (otherlv_8= '[' ( (lv_properties_9_0= ruleModelProperty ) )? (otherlv_10= ',' ( (lv_properties_11_0= ruleModelProperty ) ) )* otherlv_12= ']' )? (otherlv_13= '{' (otherlv_14= 'Things:' )? ( ( (lv_things_15_1= ruleModelThing | lv_things_15_2= ruleModelBridge ) ) )* (otherlv_16= 'Channels:' )? ( (lv_channels_17_0= ruleModelChannel ) )* otherlv_18= '}' )? )
            // InternalThing.g:133:3: () ( (lv_bridge_1_0= 'Bridge' ) ) ( ( (lv_id_2_0= ruleUID ) ) | ( ( (lv_thingTypeId_3_0= ruleUID_SEGMENT ) ) ( (lv_thingId_4_0= ruleUID_SEGMENT ) ) ) ) ( (lv_label_5_0= RULE_STRING ) )? (otherlv_6= '@' ( (lv_location_7_0= RULE_STRING ) ) )? (otherlv_8= '[' ( (lv_properties_9_0= ruleModelProperty ) )? (otherlv_10= ',' ( (lv_properties_11_0= ruleModelProperty ) ) )* otherlv_12= ']' )? (otherlv_13= '{' (otherlv_14= 'Things:' )? ( ( (lv_things_15_1= ruleModelThing | lv_things_15_2= ruleModelBridge ) ) )* (otherlv_16= 'Channels:' )? ( (lv_channels_17_0= ruleModelChannel ) )* otherlv_18= '}' )?
            {
            // InternalThing.g:133:3: ()
            // InternalThing.g:134:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getModelBridgeAccess().getModelBridgeAction_0(),
              					current);
              			
            }

            }

            // InternalThing.g:140:3: ( (lv_bridge_1_0= 'Bridge' ) )
            // InternalThing.g:141:4: (lv_bridge_1_0= 'Bridge' )
            {
            // InternalThing.g:141:4: (lv_bridge_1_0= 'Bridge' )
            // InternalThing.g:142:5: lv_bridge_1_0= 'Bridge'
            {
            lv_bridge_1_0=(Token)match(input,10,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_bridge_1_0, grammarAccess.getModelBridgeAccess().getBridgeBridgeKeyword_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getModelBridgeRule());
              					}
              					setWithLastConsumed(current, "bridge", true, "Bridge");
              				
            }

            }


            }

            // InternalThing.g:154:3: ( ( (lv_id_2_0= ruleUID ) ) | ( ( (lv_thingTypeId_3_0= ruleUID_SEGMENT ) ) ( (lv_thingId_4_0= ruleUID_SEGMENT ) ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==25) ) {
                    alt3=1;
                }
                else if ( (LA3_1==RULE_ID) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalThing.g:155:4: ( (lv_id_2_0= ruleUID ) )
                    {
                    // InternalThing.g:155:4: ( (lv_id_2_0= ruleUID ) )
                    // InternalThing.g:156:5: (lv_id_2_0= ruleUID )
                    {
                    // InternalThing.g:156:5: (lv_id_2_0= ruleUID )
                    // InternalThing.g:157:6: lv_id_2_0= ruleUID
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getModelBridgeAccess().getIdUIDParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_5);
                    lv_id_2_0=ruleUID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getModelBridgeRule());
                      						}
                      						set(
                      							current,
                      							"id",
                      							lv_id_2_0,
                      							"org.openhab.core.model.thing.Thing.UID");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalThing.g:175:4: ( ( (lv_thingTypeId_3_0= ruleUID_SEGMENT ) ) ( (lv_thingId_4_0= ruleUID_SEGMENT ) ) )
                    {
                    // InternalThing.g:175:4: ( ( (lv_thingTypeId_3_0= ruleUID_SEGMENT ) ) ( (lv_thingId_4_0= ruleUID_SEGMENT ) ) )
                    // InternalThing.g:176:5: ( (lv_thingTypeId_3_0= ruleUID_SEGMENT ) ) ( (lv_thingId_4_0= ruleUID_SEGMENT ) )
                    {
                    // InternalThing.g:176:5: ( (lv_thingTypeId_3_0= ruleUID_SEGMENT ) )
                    // InternalThing.g:177:6: (lv_thingTypeId_3_0= ruleUID_SEGMENT )
                    {
                    // InternalThing.g:177:6: (lv_thingTypeId_3_0= ruleUID_SEGMENT )
                    // InternalThing.g:178:7: lv_thingTypeId_3_0= ruleUID_SEGMENT
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getModelBridgeAccess().getThingTypeIdUID_SEGMENTParserRuleCall_2_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_4);
                    lv_thingTypeId_3_0=ruleUID_SEGMENT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getModelBridgeRule());
                      							}
                      							set(
                      								current,
                      								"thingTypeId",
                      								lv_thingTypeId_3_0,
                      								"org.openhab.core.model.thing.Thing.UID_SEGMENT");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalThing.g:195:5: ( (lv_thingId_4_0= ruleUID_SEGMENT ) )
                    // InternalThing.g:196:6: (lv_thingId_4_0= ruleUID_SEGMENT )
                    {
                    // InternalThing.g:196:6: (lv_thingId_4_0= ruleUID_SEGMENT )
                    // InternalThing.g:197:7: lv_thingId_4_0= ruleUID_SEGMENT
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getModelBridgeAccess().getThingIdUID_SEGMENTParserRuleCall_2_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_5);
                    lv_thingId_4_0=ruleUID_SEGMENT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getModelBridgeRule());
                      							}
                      							set(
                      								current,
                      								"thingId",
                      								lv_thingId_4_0,
                      								"org.openhab.core.model.thing.Thing.UID_SEGMENT");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalThing.g:216:3: ( (lv_label_5_0= RULE_STRING ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalThing.g:217:4: (lv_label_5_0= RULE_STRING )
                    {
                    // InternalThing.g:217:4: (lv_label_5_0= RULE_STRING )
                    // InternalThing.g:218:5: lv_label_5_0= RULE_STRING
                    {
                    lv_label_5_0=(Token)match(input,RULE_STRING,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_label_5_0, grammarAccess.getModelBridgeAccess().getLabelSTRINGTerminalRuleCall_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getModelBridgeRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"label",
                      						lv_label_5_0,
                      						"org.openhab.core.model.thing.Thing.STRING");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalThing.g:234:3: (otherlv_6= '@' ( (lv_location_7_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalThing.g:235:4: otherlv_6= '@' ( (lv_location_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,11,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getModelBridgeAccess().getCommercialAtKeyword_4_0());
                      			
                    }
                    // InternalThing.g:239:4: ( (lv_location_7_0= RULE_STRING ) )
                    // InternalThing.g:240:5: (lv_location_7_0= RULE_STRING )
                    {
                    // InternalThing.g:240:5: (lv_location_7_0= RULE_STRING )
                    // InternalThing.g:241:6: lv_location_7_0= RULE_STRING
                    {
                    lv_location_7_0=(Token)match(input,RULE_STRING,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_location_7_0, grammarAccess.getModelBridgeAccess().getLocationSTRINGTerminalRuleCall_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getModelBridgeRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"location",
                      							lv_location_7_0,
                      							"org.openhab.core.model.thing.Thing.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalThing.g:258:3: (otherlv_8= '[' ( (lv_properties_9_0= ruleModelProperty ) )? (otherlv_10= ',' ( (lv_properties_11_0= ruleModelProperty ) ) )* otherlv_12= ']' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==12) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalThing.g:259:4: otherlv_8= '[' ( (lv_properties_9_0= ruleModelProperty ) )? (otherlv_10= ',' ( (lv_properties_11_0= ruleModelProperty ) ) )* otherlv_12= ']'
                    {
                    otherlv_8=(Token)match(input,12,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getModelBridgeAccess().getLeftSquareBracketKeyword_5_0());
                      			
                    }
                    // InternalThing.g:263:4: ( (lv_properties_9_0= ruleModelProperty ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_ID) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalThing.g:264:5: (lv_properties_9_0= ruleModelProperty )
                            {
                            // InternalThing.g:264:5: (lv_properties_9_0= ruleModelProperty )
                            // InternalThing.g:265:6: lv_properties_9_0= ruleModelProperty
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getModelBridgeAccess().getPropertiesModelPropertyParserRuleCall_5_1_0());
                              					
                            }
                            pushFollow(FOLLOW_10);
                            lv_properties_9_0=ruleModelProperty();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getModelBridgeRule());
                              						}
                              						add(
                              							current,
                              							"properties",
                              							lv_properties_9_0,
                              							"org.openhab.core.model.thing.Thing.ModelProperty");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalThing.g:282:4: (otherlv_10= ',' ( (lv_properties_11_0= ruleModelProperty ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==13) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalThing.g:283:5: otherlv_10= ',' ( (lv_properties_11_0= ruleModelProperty ) )
                    	    {
                    	    otherlv_10=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_10, grammarAccess.getModelBridgeAccess().getCommaKeyword_5_2_0());
                    	      				
                    	    }
                    	    // InternalThing.g:287:5: ( (lv_properties_11_0= ruleModelProperty ) )
                    	    // InternalThing.g:288:6: (lv_properties_11_0= ruleModelProperty )
                    	    {
                    	    // InternalThing.g:288:6: (lv_properties_11_0= ruleModelProperty )
                    	    // InternalThing.g:289:7: lv_properties_11_0= ruleModelProperty
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getModelBridgeAccess().getPropertiesModelPropertyParserRuleCall_5_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_10);
                    	    lv_properties_11_0=ruleModelProperty();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getModelBridgeRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"properties",
                    	      								lv_properties_11_0,
                    	      								"org.openhab.core.model.thing.Thing.ModelProperty");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,14,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getModelBridgeAccess().getRightSquareBracketKeyword_5_3());
                      			
                    }

                    }
                    break;

            }

            // InternalThing.g:312:3: (otherlv_13= '{' (otherlv_14= 'Things:' )? ( ( (lv_things_15_1= ruleModelThing | lv_things_15_2= ruleModelBridge ) ) )* (otherlv_16= 'Channels:' )? ( (lv_channels_17_0= ruleModelChannel ) )* otherlv_18= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==15) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalThing.g:313:4: otherlv_13= '{' (otherlv_14= 'Things:' )? ( ( (lv_things_15_1= ruleModelThing | lv_things_15_2= ruleModelBridge ) ) )* (otherlv_16= 'Channels:' )? ( (lv_channels_17_0= ruleModelChannel ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,15,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getModelBridgeAccess().getLeftCurlyBracketKeyword_6_0());
                      			
                    }
                    // InternalThing.g:317:4: (otherlv_14= 'Things:' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==16) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalThing.g:318:5: otherlv_14= 'Things:'
                            {
                            otherlv_14=(Token)match(input,16,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_14, grammarAccess.getModelBridgeAccess().getThingsKeyword_6_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalThing.g:323:4: ( ( (lv_things_15_1= ruleModelThing | lv_things_15_2= ruleModelBridge ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID||LA11_0==10||LA11_0==19) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalThing.g:324:5: ( (lv_things_15_1= ruleModelThing | lv_things_15_2= ruleModelBridge ) )
                    	    {
                    	    // InternalThing.g:324:5: ( (lv_things_15_1= ruleModelThing | lv_things_15_2= ruleModelBridge ) )
                    	    // InternalThing.g:325:6: (lv_things_15_1= ruleModelThing | lv_things_15_2= ruleModelBridge )
                    	    {
                    	    // InternalThing.g:325:6: (lv_things_15_1= ruleModelThing | lv_things_15_2= ruleModelBridge )
                    	    int alt10=2;
                    	    int LA10_0 = input.LA(1);

                    	    if ( (LA10_0==RULE_ID||LA10_0==19) ) {
                    	        alt10=1;
                    	    }
                    	    else if ( (LA10_0==10) ) {
                    	        alt10=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 10, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt10) {
                    	        case 1 :
                    	            // InternalThing.g:326:7: lv_things_15_1= ruleModelThing
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              							newCompositeNode(grammarAccess.getModelBridgeAccess().getThingsModelThingParserRuleCall_6_2_0_0());
                    	              						
                    	            }
                    	            pushFollow(FOLLOW_13);
                    	            lv_things_15_1=ruleModelThing();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							if (current==null) {
                    	              								current = createModelElementForParent(grammarAccess.getModelBridgeRule());
                    	              							}
                    	              							add(
                    	              								current,
                    	              								"things",
                    	              								lv_things_15_1,
                    	              								"org.openhab.core.model.thing.Thing.ModelThing");
                    	              							afterParserOrEnumRuleCall();
                    	              						
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalThing.g:342:7: lv_things_15_2= ruleModelBridge
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              							newCompositeNode(grammarAccess.getModelBridgeAccess().getThingsModelBridgeParserRuleCall_6_2_0_1());
                    	              						
                    	            }
                    	            pushFollow(FOLLOW_13);
                    	            lv_things_15_2=ruleModelBridge();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							if (current==null) {
                    	              								current = createModelElementForParent(grammarAccess.getModelBridgeRule());
                    	              							}
                    	              							add(
                    	              								current,
                    	              								"things",
                    	              								lv_things_15_2,
                    	              								"org.openhab.core.model.thing.Thing.ModelBridge");
                    	              							afterParserOrEnumRuleCall();
                    	              						
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    // InternalThing.g:360:4: (otherlv_16= 'Channels:' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==17) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalThing.g:361:5: otherlv_16= 'Channels:'
                            {
                            otherlv_16=(Token)match(input,17,FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_16, grammarAccess.getModelBridgeAccess().getChannelsKeyword_6_3());
                              				
                            }

                            }
                            break;

                    }

                    // InternalThing.g:366:4: ( (lv_channels_17_0= ruleModelChannel ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>=22 && LA13_0<=24)||(LA13_0>=26 && LA13_0<=38)) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalThing.g:367:5: (lv_channels_17_0= ruleModelChannel )
                    	    {
                    	    // InternalThing.g:367:5: (lv_channels_17_0= ruleModelChannel )
                    	    // InternalThing.g:368:6: lv_channels_17_0= ruleModelChannel
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getModelBridgeAccess().getChannelsModelChannelParserRuleCall_6_4_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_14);
                    	    lv_channels_17_0=ruleModelChannel();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getModelBridgeRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"channels",
                    	      							lv_channels_17_0,
                    	      							"org.openhab.core.model.thing.Thing.ModelChannel");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getModelBridgeAccess().getRightCurlyBracketKeyword_6_5());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelBridge"


    // $ANTLR start "entryRuleModelThing"
    // InternalThing.g:394:1: entryRuleModelThing returns [EObject current=null] : iv_ruleModelThing= ruleModelThing EOF ;
    public final EObject entryRuleModelThing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelThing = null;


        try {
            // InternalThing.g:394:51: (iv_ruleModelThing= ruleModelThing EOF )
            // InternalThing.g:395:2: iv_ruleModelThing= ruleModelThing EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelThingRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModelThing=ruleModelThing();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModelThing; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelThing"


    // $ANTLR start "ruleModelThing"
    // InternalThing.g:401:1: ruleModelThing returns [EObject current=null] : ( (otherlv_0= 'Thing' )? ( ( (lv_id_1_0= ruleUID ) ) | ( ( (lv_thingTypeId_2_0= ruleUID_SEGMENT ) ) ( (lv_thingId_3_0= ruleUID_SEGMENT ) ) ) ) ( (lv_label_4_0= RULE_STRING ) )? (otherlv_5= '(' ( (lv_bridgeUID_6_0= ruleUID ) ) otherlv_7= ')' )? (otherlv_8= '@' ( (lv_location_9_0= RULE_STRING ) ) )? (otherlv_10= '[' ( (lv_properties_11_0= ruleModelProperty ) )? (otherlv_12= ',' ( (lv_properties_13_0= ruleModelProperty ) ) )* otherlv_14= ']' )? (otherlv_15= '{' (otherlv_16= 'Channels:' )? ( (lv_channels_17_0= ruleModelChannel ) )* otherlv_18= '}' )? ) ;
    public final EObject ruleModelThing() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_label_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_location_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_id_1_0 = null;

        AntlrDatatypeRuleToken lv_thingTypeId_2_0 = null;

        AntlrDatatypeRuleToken lv_thingId_3_0 = null;

        AntlrDatatypeRuleToken lv_bridgeUID_6_0 = null;

        EObject lv_properties_11_0 = null;

        EObject lv_properties_13_0 = null;

        EObject lv_channels_17_0 = null;



        	enterRule();

        try {
            // InternalThing.g:407:2: ( ( (otherlv_0= 'Thing' )? ( ( (lv_id_1_0= ruleUID ) ) | ( ( (lv_thingTypeId_2_0= ruleUID_SEGMENT ) ) ( (lv_thingId_3_0= ruleUID_SEGMENT ) ) ) ) ( (lv_label_4_0= RULE_STRING ) )? (otherlv_5= '(' ( (lv_bridgeUID_6_0= ruleUID ) ) otherlv_7= ')' )? (otherlv_8= '@' ( (lv_location_9_0= RULE_STRING ) ) )? (otherlv_10= '[' ( (lv_properties_11_0= ruleModelProperty ) )? (otherlv_12= ',' ( (lv_properties_13_0= ruleModelProperty ) ) )* otherlv_14= ']' )? (otherlv_15= '{' (otherlv_16= 'Channels:' )? ( (lv_channels_17_0= ruleModelChannel ) )* otherlv_18= '}' )? ) )
            // InternalThing.g:408:2: ( (otherlv_0= 'Thing' )? ( ( (lv_id_1_0= ruleUID ) ) | ( ( (lv_thingTypeId_2_0= ruleUID_SEGMENT ) ) ( (lv_thingId_3_0= ruleUID_SEGMENT ) ) ) ) ( (lv_label_4_0= RULE_STRING ) )? (otherlv_5= '(' ( (lv_bridgeUID_6_0= ruleUID ) ) otherlv_7= ')' )? (otherlv_8= '@' ( (lv_location_9_0= RULE_STRING ) ) )? (otherlv_10= '[' ( (lv_properties_11_0= ruleModelProperty ) )? (otherlv_12= ',' ( (lv_properties_13_0= ruleModelProperty ) ) )* otherlv_14= ']' )? (otherlv_15= '{' (otherlv_16= 'Channels:' )? ( (lv_channels_17_0= ruleModelChannel ) )* otherlv_18= '}' )? )
            {
            // InternalThing.g:408:2: ( (otherlv_0= 'Thing' )? ( ( (lv_id_1_0= ruleUID ) ) | ( ( (lv_thingTypeId_2_0= ruleUID_SEGMENT ) ) ( (lv_thingId_3_0= ruleUID_SEGMENT ) ) ) ) ( (lv_label_4_0= RULE_STRING ) )? (otherlv_5= '(' ( (lv_bridgeUID_6_0= ruleUID ) ) otherlv_7= ')' )? (otherlv_8= '@' ( (lv_location_9_0= RULE_STRING ) ) )? (otherlv_10= '[' ( (lv_properties_11_0= ruleModelProperty ) )? (otherlv_12= ',' ( (lv_properties_13_0= ruleModelProperty ) ) )* otherlv_14= ']' )? (otherlv_15= '{' (otherlv_16= 'Channels:' )? ( (lv_channels_17_0= ruleModelChannel ) )* otherlv_18= '}' )? )
            // InternalThing.g:409:3: (otherlv_0= 'Thing' )? ( ( (lv_id_1_0= ruleUID ) ) | ( ( (lv_thingTypeId_2_0= ruleUID_SEGMENT ) ) ( (lv_thingId_3_0= ruleUID_SEGMENT ) ) ) ) ( (lv_label_4_0= RULE_STRING ) )? (otherlv_5= '(' ( (lv_bridgeUID_6_0= ruleUID ) ) otherlv_7= ')' )? (otherlv_8= '@' ( (lv_location_9_0= RULE_STRING ) ) )? (otherlv_10= '[' ( (lv_properties_11_0= ruleModelProperty ) )? (otherlv_12= ',' ( (lv_properties_13_0= ruleModelProperty ) ) )* otherlv_14= ']' )? (otherlv_15= '{' (otherlv_16= 'Channels:' )? ( (lv_channels_17_0= ruleModelChannel ) )* otherlv_18= '}' )?
            {
            // InternalThing.g:409:3: (otherlv_0= 'Thing' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalThing.g:410:4: otherlv_0= 'Thing'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getModelThingAccess().getThingKeyword_0());
                      			
                    }

                    }
                    break;

            }

            // InternalThing.g:415:3: ( ( (lv_id_1_0= ruleUID ) ) | ( ( (lv_thingTypeId_2_0= ruleUID_SEGMENT ) ) ( (lv_thingId_3_0= ruleUID_SEGMENT ) ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==25) ) {
                    alt16=1;
                }
                else if ( (LA16_1==RULE_ID) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalThing.g:416:4: ( (lv_id_1_0= ruleUID ) )
                    {
                    // InternalThing.g:416:4: ( (lv_id_1_0= ruleUID ) )
                    // InternalThing.g:417:5: (lv_id_1_0= ruleUID )
                    {
                    // InternalThing.g:417:5: (lv_id_1_0= ruleUID )
                    // InternalThing.g:418:6: lv_id_1_0= ruleUID
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getModelThingAccess().getIdUIDParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_15);
                    lv_id_1_0=ruleUID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getModelThingRule());
                      						}
                      						set(
                      							current,
                      							"id",
                      							lv_id_1_0,
                      							"org.openhab.core.model.thing.Thing.UID");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalThing.g:436:4: ( ( (lv_thingTypeId_2_0= ruleUID_SEGMENT ) ) ( (lv_thingId_3_0= ruleUID_SEGMENT ) ) )
                    {
                    // InternalThing.g:436:4: ( ( (lv_thingTypeId_2_0= ruleUID_SEGMENT ) ) ( (lv_thingId_3_0= ruleUID_SEGMENT ) ) )
                    // InternalThing.g:437:5: ( (lv_thingTypeId_2_0= ruleUID_SEGMENT ) ) ( (lv_thingId_3_0= ruleUID_SEGMENT ) )
                    {
                    // InternalThing.g:437:5: ( (lv_thingTypeId_2_0= ruleUID_SEGMENT ) )
                    // InternalThing.g:438:6: (lv_thingTypeId_2_0= ruleUID_SEGMENT )
                    {
                    // InternalThing.g:438:6: (lv_thingTypeId_2_0= ruleUID_SEGMENT )
                    // InternalThing.g:439:7: lv_thingTypeId_2_0= ruleUID_SEGMENT
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getModelThingAccess().getThingTypeIdUID_SEGMENTParserRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_4);
                    lv_thingTypeId_2_0=ruleUID_SEGMENT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getModelThingRule());
                      							}
                      							set(
                      								current,
                      								"thingTypeId",
                      								lv_thingTypeId_2_0,
                      								"org.openhab.core.model.thing.Thing.UID_SEGMENT");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalThing.g:456:5: ( (lv_thingId_3_0= ruleUID_SEGMENT ) )
                    // InternalThing.g:457:6: (lv_thingId_3_0= ruleUID_SEGMENT )
                    {
                    // InternalThing.g:457:6: (lv_thingId_3_0= ruleUID_SEGMENT )
                    // InternalThing.g:458:7: lv_thingId_3_0= ruleUID_SEGMENT
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getModelThingAccess().getThingIdUID_SEGMENTParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_15);
                    lv_thingId_3_0=ruleUID_SEGMENT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getModelThingRule());
                      							}
                      							set(
                      								current,
                      								"thingId",
                      								lv_thingId_3_0,
                      								"org.openhab.core.model.thing.Thing.UID_SEGMENT");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalThing.g:477:3: ( (lv_label_4_0= RULE_STRING ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalThing.g:478:4: (lv_label_4_0= RULE_STRING )
                    {
                    // InternalThing.g:478:4: (lv_label_4_0= RULE_STRING )
                    // InternalThing.g:479:5: lv_label_4_0= RULE_STRING
                    {
                    lv_label_4_0=(Token)match(input,RULE_STRING,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_label_4_0, grammarAccess.getModelThingAccess().getLabelSTRINGTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getModelThingRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"label",
                      						lv_label_4_0,
                      						"org.openhab.core.model.thing.Thing.STRING");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalThing.g:495:3: (otherlv_5= '(' ( (lv_bridgeUID_6_0= ruleUID ) ) otherlv_7= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==20) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalThing.g:496:4: otherlv_5= '(' ( (lv_bridgeUID_6_0= ruleUID ) ) otherlv_7= ')'
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getModelThingAccess().getLeftParenthesisKeyword_3_0());
                      			
                    }
                    // InternalThing.g:500:4: ( (lv_bridgeUID_6_0= ruleUID ) )
                    // InternalThing.g:501:5: (lv_bridgeUID_6_0= ruleUID )
                    {
                    // InternalThing.g:501:5: (lv_bridgeUID_6_0= ruleUID )
                    // InternalThing.g:502:6: lv_bridgeUID_6_0= ruleUID
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getModelThingAccess().getBridgeUIDUIDParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_17);
                    lv_bridgeUID_6_0=ruleUID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getModelThingRule());
                      						}
                      						set(
                      							current,
                      							"bridgeUID",
                      							lv_bridgeUID_6_0,
                      							"org.openhab.core.model.thing.Thing.UID");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,21,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getModelThingAccess().getRightParenthesisKeyword_3_2());
                      			
                    }

                    }
                    break;

            }

            // InternalThing.g:524:3: (otherlv_8= '@' ( (lv_location_9_0= RULE_STRING ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==11) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalThing.g:525:4: otherlv_8= '@' ( (lv_location_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,11,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getModelThingAccess().getCommercialAtKeyword_4_0());
                      			
                    }
                    // InternalThing.g:529:4: ( (lv_location_9_0= RULE_STRING ) )
                    // InternalThing.g:530:5: (lv_location_9_0= RULE_STRING )
                    {
                    // InternalThing.g:530:5: (lv_location_9_0= RULE_STRING )
                    // InternalThing.g:531:6: lv_location_9_0= RULE_STRING
                    {
                    lv_location_9_0=(Token)match(input,RULE_STRING,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_location_9_0, grammarAccess.getModelThingAccess().getLocationSTRINGTerminalRuleCall_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getModelThingRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"location",
                      							lv_location_9_0,
                      							"org.openhab.core.model.thing.Thing.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalThing.g:548:3: (otherlv_10= '[' ( (lv_properties_11_0= ruleModelProperty ) )? (otherlv_12= ',' ( (lv_properties_13_0= ruleModelProperty ) ) )* otherlv_14= ']' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==12) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalThing.g:549:4: otherlv_10= '[' ( (lv_properties_11_0= ruleModelProperty ) )? (otherlv_12= ',' ( (lv_properties_13_0= ruleModelProperty ) ) )* otherlv_14= ']'
                    {
                    otherlv_10=(Token)match(input,12,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getModelThingAccess().getLeftSquareBracketKeyword_5_0());
                      			
                    }
                    // InternalThing.g:553:4: ( (lv_properties_11_0= ruleModelProperty ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==RULE_ID) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalThing.g:554:5: (lv_properties_11_0= ruleModelProperty )
                            {
                            // InternalThing.g:554:5: (lv_properties_11_0= ruleModelProperty )
                            // InternalThing.g:555:6: lv_properties_11_0= ruleModelProperty
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getModelThingAccess().getPropertiesModelPropertyParserRuleCall_5_1_0());
                              					
                            }
                            pushFollow(FOLLOW_10);
                            lv_properties_11_0=ruleModelProperty();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getModelThingRule());
                              						}
                              						add(
                              							current,
                              							"properties",
                              							lv_properties_11_0,
                              							"org.openhab.core.model.thing.Thing.ModelProperty");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalThing.g:572:4: (otherlv_12= ',' ( (lv_properties_13_0= ruleModelProperty ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==13) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalThing.g:573:5: otherlv_12= ',' ( (lv_properties_13_0= ruleModelProperty ) )
                    	    {
                    	    otherlv_12=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_12, grammarAccess.getModelThingAccess().getCommaKeyword_5_2_0());
                    	      				
                    	    }
                    	    // InternalThing.g:577:5: ( (lv_properties_13_0= ruleModelProperty ) )
                    	    // InternalThing.g:578:6: (lv_properties_13_0= ruleModelProperty )
                    	    {
                    	    // InternalThing.g:578:6: (lv_properties_13_0= ruleModelProperty )
                    	    // InternalThing.g:579:7: lv_properties_13_0= ruleModelProperty
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getModelThingAccess().getPropertiesModelPropertyParserRuleCall_5_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_10);
                    	    lv_properties_13_0=ruleModelProperty();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getModelThingRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"properties",
                    	      								lv_properties_13_0,
                    	      								"org.openhab.core.model.thing.Thing.ModelProperty");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,14,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getModelThingAccess().getRightSquareBracketKeyword_5_3());
                      			
                    }

                    }
                    break;

            }

            // InternalThing.g:602:3: (otherlv_15= '{' (otherlv_16= 'Channels:' )? ( (lv_channels_17_0= ruleModelChannel ) )* otherlv_18= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==15) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalThing.g:603:4: otherlv_15= '{' (otherlv_16= 'Channels:' )? ( (lv_channels_17_0= ruleModelChannel ) )* otherlv_18= '}'
                    {
                    otherlv_15=(Token)match(input,15,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getModelThingAccess().getLeftCurlyBracketKeyword_6_0());
                      			
                    }
                    // InternalThing.g:607:4: (otherlv_16= 'Channels:' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==17) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalThing.g:608:5: otherlv_16= 'Channels:'
                            {
                            otherlv_16=(Token)match(input,17,FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_16, grammarAccess.getModelThingAccess().getChannelsKeyword_6_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalThing.g:613:4: ( (lv_channels_17_0= ruleModelChannel ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( ((LA24_0>=22 && LA24_0<=24)||(LA24_0>=26 && LA24_0<=38)) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalThing.g:614:5: (lv_channels_17_0= ruleModelChannel )
                    	    {
                    	    // InternalThing.g:614:5: (lv_channels_17_0= ruleModelChannel )
                    	    // InternalThing.g:615:6: lv_channels_17_0= ruleModelChannel
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getModelThingAccess().getChannelsModelChannelParserRuleCall_6_2_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_14);
                    	    lv_channels_17_0=ruleModelChannel();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getModelThingRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"channels",
                    	      							lv_channels_17_0,
                    	      							"org.openhab.core.model.thing.Thing.ModelChannel");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getModelThingAccess().getRightCurlyBracketKeyword_6_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelThing"


    // $ANTLR start "entryRuleModelChannel"
    // InternalThing.g:641:1: entryRuleModelChannel returns [EObject current=null] : iv_ruleModelChannel= ruleModelChannel EOF ;
    public final EObject entryRuleModelChannel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelChannel = null;


        try {
            // InternalThing.g:641:53: (iv_ruleModelChannel= ruleModelChannel EOF )
            // InternalThing.g:642:2: iv_ruleModelChannel= ruleModelChannel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelChannelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModelChannel=ruleModelChannel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModelChannel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelChannel"


    // $ANTLR start "ruleModelChannel"
    // InternalThing.g:648:1: ruleModelChannel returns [EObject current=null] : ( ( ( ( ( (lv_channelKind_0_1= 'State' | lv_channelKind_0_2= 'Trigger' ) ) )? ( (lv_type_1_0= ruleModelItemType ) ) ) | (otherlv_2= 'Type' ( (lv_channelType_3_0= ruleUID_SEGMENT ) ) ) ) otherlv_4= ':' ( (lv_id_5_0= ruleCHANNEL_ID ) ) ( (lv_label_6_0= RULE_STRING ) )? (otherlv_7= '[' ( (lv_properties_8_0= ruleModelProperty ) )? (otherlv_9= ',' ( (lv_properties_10_0= ruleModelProperty ) ) )* otherlv_11= ']' )? ) ;
    public final EObject ruleModelChannel() throws RecognitionException {
        EObject current = null;

        Token lv_channelKind_0_1=null;
        Token lv_channelKind_0_2=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_label_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_channelType_3_0 = null;

        AntlrDatatypeRuleToken lv_id_5_0 = null;

        EObject lv_properties_8_0 = null;

        EObject lv_properties_10_0 = null;



        	enterRule();

        try {
            // InternalThing.g:654:2: ( ( ( ( ( ( (lv_channelKind_0_1= 'State' | lv_channelKind_0_2= 'Trigger' ) ) )? ( (lv_type_1_0= ruleModelItemType ) ) ) | (otherlv_2= 'Type' ( (lv_channelType_3_0= ruleUID_SEGMENT ) ) ) ) otherlv_4= ':' ( (lv_id_5_0= ruleCHANNEL_ID ) ) ( (lv_label_6_0= RULE_STRING ) )? (otherlv_7= '[' ( (lv_properties_8_0= ruleModelProperty ) )? (otherlv_9= ',' ( (lv_properties_10_0= ruleModelProperty ) ) )* otherlv_11= ']' )? ) )
            // InternalThing.g:655:2: ( ( ( ( ( (lv_channelKind_0_1= 'State' | lv_channelKind_0_2= 'Trigger' ) ) )? ( (lv_type_1_0= ruleModelItemType ) ) ) | (otherlv_2= 'Type' ( (lv_channelType_3_0= ruleUID_SEGMENT ) ) ) ) otherlv_4= ':' ( (lv_id_5_0= ruleCHANNEL_ID ) ) ( (lv_label_6_0= RULE_STRING ) )? (otherlv_7= '[' ( (lv_properties_8_0= ruleModelProperty ) )? (otherlv_9= ',' ( (lv_properties_10_0= ruleModelProperty ) ) )* otherlv_11= ']' )? )
            {
            // InternalThing.g:655:2: ( ( ( ( ( (lv_channelKind_0_1= 'State' | lv_channelKind_0_2= 'Trigger' ) ) )? ( (lv_type_1_0= ruleModelItemType ) ) ) | (otherlv_2= 'Type' ( (lv_channelType_3_0= ruleUID_SEGMENT ) ) ) ) otherlv_4= ':' ( (lv_id_5_0= ruleCHANNEL_ID ) ) ( (lv_label_6_0= RULE_STRING ) )? (otherlv_7= '[' ( (lv_properties_8_0= ruleModelProperty ) )? (otherlv_9= ',' ( (lv_properties_10_0= ruleModelProperty ) ) )* otherlv_11= ']' )? )
            // InternalThing.g:656:3: ( ( ( ( (lv_channelKind_0_1= 'State' | lv_channelKind_0_2= 'Trigger' ) ) )? ( (lv_type_1_0= ruleModelItemType ) ) ) | (otherlv_2= 'Type' ( (lv_channelType_3_0= ruleUID_SEGMENT ) ) ) ) otherlv_4= ':' ( (lv_id_5_0= ruleCHANNEL_ID ) ) ( (lv_label_6_0= RULE_STRING ) )? (otherlv_7= '[' ( (lv_properties_8_0= ruleModelProperty ) )? (otherlv_9= ',' ( (lv_properties_10_0= ruleModelProperty ) ) )* otherlv_11= ']' )?
            {
            // InternalThing.g:656:3: ( ( ( ( (lv_channelKind_0_1= 'State' | lv_channelKind_0_2= 'Trigger' ) ) )? ( (lv_type_1_0= ruleModelItemType ) ) ) | (otherlv_2= 'Type' ( (lv_channelType_3_0= ruleUID_SEGMENT ) ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=22 && LA28_0<=23)||(LA28_0>=26 && LA28_0<=38)) ) {
                alt28=1;
            }
            else if ( (LA28_0==24) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalThing.g:657:4: ( ( ( (lv_channelKind_0_1= 'State' | lv_channelKind_0_2= 'Trigger' ) ) )? ( (lv_type_1_0= ruleModelItemType ) ) )
                    {
                    // InternalThing.g:657:4: ( ( ( (lv_channelKind_0_1= 'State' | lv_channelKind_0_2= 'Trigger' ) ) )? ( (lv_type_1_0= ruleModelItemType ) ) )
                    // InternalThing.g:658:5: ( ( (lv_channelKind_0_1= 'State' | lv_channelKind_0_2= 'Trigger' ) ) )? ( (lv_type_1_0= ruleModelItemType ) )
                    {
                    // InternalThing.g:658:5: ( ( (lv_channelKind_0_1= 'State' | lv_channelKind_0_2= 'Trigger' ) ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( ((LA27_0>=22 && LA27_0<=23)) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalThing.g:659:6: ( (lv_channelKind_0_1= 'State' | lv_channelKind_0_2= 'Trigger' ) )
                            {
                            // InternalThing.g:659:6: ( (lv_channelKind_0_1= 'State' | lv_channelKind_0_2= 'Trigger' ) )
                            // InternalThing.g:660:7: (lv_channelKind_0_1= 'State' | lv_channelKind_0_2= 'Trigger' )
                            {
                            // InternalThing.g:660:7: (lv_channelKind_0_1= 'State' | lv_channelKind_0_2= 'Trigger' )
                            int alt26=2;
                            int LA26_0 = input.LA(1);

                            if ( (LA26_0==22) ) {
                                alt26=1;
                            }
                            else if ( (LA26_0==23) ) {
                                alt26=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 26, 0, input);

                                throw nvae;
                            }
                            switch (alt26) {
                                case 1 :
                                    // InternalThing.g:661:8: lv_channelKind_0_1= 'State'
                                    {
                                    lv_channelKind_0_1=(Token)match(input,22,FOLLOW_19); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								newLeafNode(lv_channelKind_0_1, grammarAccess.getModelChannelAccess().getChannelKindStateKeyword_0_0_0_0_0());
                                      							
                                    }
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElement(grammarAccess.getModelChannelRule());
                                      								}
                                      								setWithLastConsumed(current, "channelKind", lv_channelKind_0_1, null);
                                      							
                                    }

                                    }
                                    break;
                                case 2 :
                                    // InternalThing.g:672:8: lv_channelKind_0_2= 'Trigger'
                                    {
                                    lv_channelKind_0_2=(Token)match(input,23,FOLLOW_19); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								newLeafNode(lv_channelKind_0_2, grammarAccess.getModelChannelAccess().getChannelKindTriggerKeyword_0_0_0_0_1());
                                      							
                                    }
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElement(grammarAccess.getModelChannelRule());
                                      								}
                                      								setWithLastConsumed(current, "channelKind", lv_channelKind_0_2, null);
                                      							
                                    }

                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }

                    // InternalThing.g:685:5: ( (lv_type_1_0= ruleModelItemType ) )
                    // InternalThing.g:686:6: (lv_type_1_0= ruleModelItemType )
                    {
                    // InternalThing.g:686:6: (lv_type_1_0= ruleModelItemType )
                    // InternalThing.g:687:7: lv_type_1_0= ruleModelItemType
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getModelChannelAccess().getTypeModelItemTypeParserRuleCall_0_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_20);
                    lv_type_1_0=ruleModelItemType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getModelChannelRule());
                      							}
                      							set(
                      								current,
                      								"type",
                      								lv_type_1_0,
                      								"org.openhab.core.model.thing.Thing.ModelItemType");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalThing.g:706:4: (otherlv_2= 'Type' ( (lv_channelType_3_0= ruleUID_SEGMENT ) ) )
                    {
                    // InternalThing.g:706:4: (otherlv_2= 'Type' ( (lv_channelType_3_0= ruleUID_SEGMENT ) ) )
                    // InternalThing.g:707:5: otherlv_2= 'Type' ( (lv_channelType_3_0= ruleUID_SEGMENT ) )
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getModelChannelAccess().getTypeKeyword_0_1_0());
                      				
                    }
                    // InternalThing.g:711:5: ( (lv_channelType_3_0= ruleUID_SEGMENT ) )
                    // InternalThing.g:712:6: (lv_channelType_3_0= ruleUID_SEGMENT )
                    {
                    // InternalThing.g:712:6: (lv_channelType_3_0= ruleUID_SEGMENT )
                    // InternalThing.g:713:7: lv_channelType_3_0= ruleUID_SEGMENT
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getModelChannelAccess().getChannelTypeUID_SEGMENTParserRuleCall_0_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_20);
                    lv_channelType_3_0=ruleUID_SEGMENT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getModelChannelRule());
                      							}
                      							set(
                      								current,
                      								"channelType",
                      								lv_channelType_3_0,
                      								"org.openhab.core.model.thing.Thing.UID_SEGMENT");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,25,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getModelChannelAccess().getColonKeyword_1());
              		
            }
            // InternalThing.g:736:3: ( (lv_id_5_0= ruleCHANNEL_ID ) )
            // InternalThing.g:737:4: (lv_id_5_0= ruleCHANNEL_ID )
            {
            // InternalThing.g:737:4: (lv_id_5_0= ruleCHANNEL_ID )
            // InternalThing.g:738:5: lv_id_5_0= ruleCHANNEL_ID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModelChannelAccess().getIdCHANNEL_IDParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_id_5_0=ruleCHANNEL_ID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getModelChannelRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_5_0,
              						"org.openhab.core.model.thing.Thing.CHANNEL_ID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalThing.g:755:3: ( (lv_label_6_0= RULE_STRING ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalThing.g:756:4: (lv_label_6_0= RULE_STRING )
                    {
                    // InternalThing.g:756:4: (lv_label_6_0= RULE_STRING )
                    // InternalThing.g:757:5: lv_label_6_0= RULE_STRING
                    {
                    lv_label_6_0=(Token)match(input,RULE_STRING,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_label_6_0, grammarAccess.getModelChannelAccess().getLabelSTRINGTerminalRuleCall_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getModelChannelRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"label",
                      						lv_label_6_0,
                      						"org.openhab.core.model.thing.Thing.STRING");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalThing.g:773:3: (otherlv_7= '[' ( (lv_properties_8_0= ruleModelProperty ) )? (otherlv_9= ',' ( (lv_properties_10_0= ruleModelProperty ) ) )* otherlv_11= ']' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==12) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalThing.g:774:4: otherlv_7= '[' ( (lv_properties_8_0= ruleModelProperty ) )? (otherlv_9= ',' ( (lv_properties_10_0= ruleModelProperty ) ) )* otherlv_11= ']'
                    {
                    otherlv_7=(Token)match(input,12,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getModelChannelAccess().getLeftSquareBracketKeyword_4_0());
                      			
                    }
                    // InternalThing.g:778:4: ( (lv_properties_8_0= ruleModelProperty ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==RULE_ID) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalThing.g:779:5: (lv_properties_8_0= ruleModelProperty )
                            {
                            // InternalThing.g:779:5: (lv_properties_8_0= ruleModelProperty )
                            // InternalThing.g:780:6: lv_properties_8_0= ruleModelProperty
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getModelChannelAccess().getPropertiesModelPropertyParserRuleCall_4_1_0());
                              					
                            }
                            pushFollow(FOLLOW_10);
                            lv_properties_8_0=ruleModelProperty();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getModelChannelRule());
                              						}
                              						add(
                              							current,
                              							"properties",
                              							lv_properties_8_0,
                              							"org.openhab.core.model.thing.Thing.ModelProperty");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalThing.g:797:4: (otherlv_9= ',' ( (lv_properties_10_0= ruleModelProperty ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==13) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalThing.g:798:5: otherlv_9= ',' ( (lv_properties_10_0= ruleModelProperty ) )
                    	    {
                    	    otherlv_9=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_9, grammarAccess.getModelChannelAccess().getCommaKeyword_4_2_0());
                    	      				
                    	    }
                    	    // InternalThing.g:802:5: ( (lv_properties_10_0= ruleModelProperty ) )
                    	    // InternalThing.g:803:6: (lv_properties_10_0= ruleModelProperty )
                    	    {
                    	    // InternalThing.g:803:6: (lv_properties_10_0= ruleModelProperty )
                    	    // InternalThing.g:804:7: lv_properties_10_0= ruleModelProperty
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getModelChannelAccess().getPropertiesModelPropertyParserRuleCall_4_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_10);
                    	    lv_properties_10_0=ruleModelProperty();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getModelChannelRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"properties",
                    	      								lv_properties_10_0,
                    	      								"org.openhab.core.model.thing.Thing.ModelProperty");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getModelChannelAccess().getRightSquareBracketKeyword_4_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelChannel"


    // $ANTLR start "entryRuleModelItemType"
    // InternalThing.g:831:1: entryRuleModelItemType returns [String current=null] : iv_ruleModelItemType= ruleModelItemType EOF ;
    public final String entryRuleModelItemType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModelItemType = null;


        try {
            // InternalThing.g:831:53: (iv_ruleModelItemType= ruleModelItemType EOF )
            // InternalThing.g:832:2: iv_ruleModelItemType= ruleModelItemType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelItemTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModelItemType=ruleModelItemType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModelItemType.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelItemType"


    // $ANTLR start "ruleModelItemType"
    // InternalThing.g:838:1: ruleModelItemType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BaseModelItemType_0= ruleBaseModelItemType | (kw= 'Number:' this_ID_2= RULE_ID ) ) ;
    public final AntlrDatatypeRuleToken ruleModelItemType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_BaseModelItemType_0 = null;



        	enterRule();

        try {
            // InternalThing.g:844:2: ( (this_BaseModelItemType_0= ruleBaseModelItemType | (kw= 'Number:' this_ID_2= RULE_ID ) ) )
            // InternalThing.g:845:2: (this_BaseModelItemType_0= ruleBaseModelItemType | (kw= 'Number:' this_ID_2= RULE_ID ) )
            {
            // InternalThing.g:845:2: (this_BaseModelItemType_0= ruleBaseModelItemType | (kw= 'Number:' this_ID_2= RULE_ID ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=27 && LA33_0<=38)) ) {
                alt33=1;
            }
            else if ( (LA33_0==26) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalThing.g:846:3: this_BaseModelItemType_0= ruleBaseModelItemType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getModelItemTypeAccess().getBaseModelItemTypeParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BaseModelItemType_0=ruleBaseModelItemType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_BaseModelItemType_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalThing.g:857:3: (kw= 'Number:' this_ID_2= RULE_ID )
                    {
                    // InternalThing.g:857:3: (kw= 'Number:' this_ID_2= RULE_ID )
                    // InternalThing.g:858:4: kw= 'Number:' this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,26,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getModelItemTypeAccess().getNumberKeyword_1_0());
                      			
                    }
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ID_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_2, grammarAccess.getModelItemTypeAccess().getIDTerminalRuleCall_1_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelItemType"


    // $ANTLR start "entryRuleBaseModelItemType"
    // InternalThing.g:875:1: entryRuleBaseModelItemType returns [String current=null] : iv_ruleBaseModelItemType= ruleBaseModelItemType EOF ;
    public final String entryRuleBaseModelItemType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBaseModelItemType = null;


        try {
            // InternalThing.g:875:57: (iv_ruleBaseModelItemType= ruleBaseModelItemType EOF )
            // InternalThing.g:876:2: iv_ruleBaseModelItemType= ruleBaseModelItemType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBaseModelItemTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBaseModelItemType=ruleBaseModelItemType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBaseModelItemType.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBaseModelItemType"


    // $ANTLR start "ruleBaseModelItemType"
    // InternalThing.g:882:1: ruleBaseModelItemType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Switch' | kw= 'Rollershutter' | kw= 'Number' | kw= 'String' | kw= 'Dimmer' | kw= 'Contact' | kw= 'DateTime' | kw= 'Color' | kw= 'Player' | kw= 'Location' | kw= 'Call' | kw= 'Image' ) ;
    public final AntlrDatatypeRuleToken ruleBaseModelItemType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalThing.g:888:2: ( (kw= 'Switch' | kw= 'Rollershutter' | kw= 'Number' | kw= 'String' | kw= 'Dimmer' | kw= 'Contact' | kw= 'DateTime' | kw= 'Color' | kw= 'Player' | kw= 'Location' | kw= 'Call' | kw= 'Image' ) )
            // InternalThing.g:889:2: (kw= 'Switch' | kw= 'Rollershutter' | kw= 'Number' | kw= 'String' | kw= 'Dimmer' | kw= 'Contact' | kw= 'DateTime' | kw= 'Color' | kw= 'Player' | kw= 'Location' | kw= 'Call' | kw= 'Image' )
            {
            // InternalThing.g:889:2: (kw= 'Switch' | kw= 'Rollershutter' | kw= 'Number' | kw= 'String' | kw= 'Dimmer' | kw= 'Contact' | kw= 'DateTime' | kw= 'Color' | kw= 'Player' | kw= 'Location' | kw= 'Call' | kw= 'Image' )
            int alt34=12;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt34=1;
                }
                break;
            case 28:
                {
                alt34=2;
                }
                break;
            case 29:
                {
                alt34=3;
                }
                break;
            case 30:
                {
                alt34=4;
                }
                break;
            case 31:
                {
                alt34=5;
                }
                break;
            case 32:
                {
                alt34=6;
                }
                break;
            case 33:
                {
                alt34=7;
                }
                break;
            case 34:
                {
                alt34=8;
                }
                break;
            case 35:
                {
                alt34=9;
                }
                break;
            case 36:
                {
                alt34=10;
                }
                break;
            case 37:
                {
                alt34=11;
                }
                break;
            case 38:
                {
                alt34=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalThing.g:890:3: kw= 'Switch'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBaseModelItemTypeAccess().getSwitchKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalThing.g:896:3: kw= 'Rollershutter'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBaseModelItemTypeAccess().getRollershutterKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalThing.g:902:3: kw= 'Number'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBaseModelItemTypeAccess().getNumberKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalThing.g:908:3: kw= 'String'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBaseModelItemTypeAccess().getStringKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalThing.g:914:3: kw= 'Dimmer'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBaseModelItemTypeAccess().getDimmerKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalThing.g:920:3: kw= 'Contact'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBaseModelItemTypeAccess().getContactKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalThing.g:926:3: kw= 'DateTime'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBaseModelItemTypeAccess().getDateTimeKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalThing.g:932:3: kw= 'Color'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBaseModelItemTypeAccess().getColorKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalThing.g:938:3: kw= 'Player'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBaseModelItemTypeAccess().getPlayerKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalThing.g:944:3: kw= 'Location'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBaseModelItemTypeAccess().getLocationKeyword_9());
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalThing.g:950:3: kw= 'Call'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBaseModelItemTypeAccess().getCallKeyword_10());
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalThing.g:956:3: kw= 'Image'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBaseModelItemTypeAccess().getImageKeyword_11());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBaseModelItemType"


    // $ANTLR start "entryRuleModelProperty"
    // InternalThing.g:965:1: entryRuleModelProperty returns [EObject current=null] : iv_ruleModelProperty= ruleModelProperty EOF ;
    public final EObject entryRuleModelProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelProperty = null;


        try {
            // InternalThing.g:965:54: (iv_ruleModelProperty= ruleModelProperty EOF )
            // InternalThing.g:966:2: iv_ruleModelProperty= ruleModelProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelPropertyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModelProperty=ruleModelProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModelProperty; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelProperty"


    // $ANTLR start "ruleModelProperty"
    // InternalThing.g:972:1: ruleModelProperty returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueType ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValueType ) ) )* ) ;
    public final EObject ruleModelProperty() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalThing.g:978:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueType ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValueType ) ) )* ) )
            // InternalThing.g:979:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueType ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValueType ) ) )* )
            {
            // InternalThing.g:979:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueType ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValueType ) ) )* )
            // InternalThing.g:980:3: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueType ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValueType ) ) )*
            {
            // InternalThing.g:980:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalThing.g:981:4: (lv_key_0_0= RULE_ID )
            {
            // InternalThing.g:981:4: (lv_key_0_0= RULE_ID )
            // InternalThing.g:982:5: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_key_0_0, grammarAccess.getModelPropertyAccess().getKeyIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getModelPropertyRule());
              					}
              					setWithLastConsumed(
              						current,
              						"key",
              						lv_key_0_0,
              						"org.openhab.core.model.thing.Thing.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,39,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getModelPropertyAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalThing.g:1002:3: ( (lv_value_2_0= ruleValueType ) )
            // InternalThing.g:1003:4: (lv_value_2_0= ruleValueType )
            {
            // InternalThing.g:1003:4: (lv_value_2_0= ruleValueType )
            // InternalThing.g:1004:5: lv_value_2_0= ruleValueType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModelPropertyAccess().getValueValueTypeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_value_2_0=ruleValueType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getModelPropertyRule());
              					}
              					add(
              						current,
              						"value",
              						lv_value_2_0,
              						"org.openhab.core.model.thing.Thing.ValueType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalThing.g:1021:3: (otherlv_3= ',' ( (lv_value_4_0= ruleValueType ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==13) ) {
                    int LA35_1 = input.LA(2);

                    if ( (LA35_1==RULE_ID) ) {
                        int LA35_3 = input.LA(3);

                        if ( (LA35_3==EOF||(LA35_3>=13 && LA35_3<=14)||LA35_3==44) ) {
                            alt35=1;
                        }


                    }
                    else if ( (LA35_1==RULE_STRING||(LA35_1>=41 && LA35_1<=43)) ) {
                        alt35=1;
                    }


                }


                switch (alt35) {
            	case 1 :
            	    // InternalThing.g:1022:4: otherlv_3= ',' ( (lv_value_4_0= ruleValueType ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getModelPropertyAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalThing.g:1026:4: ( (lv_value_4_0= ruleValueType ) )
            	    // InternalThing.g:1027:5: (lv_value_4_0= ruleValueType )
            	    {
            	    // InternalThing.g:1027:5: (lv_value_4_0= ruleValueType )
            	    // InternalThing.g:1028:6: lv_value_4_0= ruleValueType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getModelPropertyAccess().getValueValueTypeParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_25);
            	    lv_value_4_0=ruleValueType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getModelPropertyRule());
            	      						}
            	      						add(
            	      							current,
            	      							"value",
            	      							lv_value_4_0,
            	      							"org.openhab.core.model.thing.Thing.ValueType");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelProperty"


    // $ANTLR start "entryRuleCHANNEL_ID"
    // InternalThing.g:1050:1: entryRuleCHANNEL_ID returns [String current=null] : iv_ruleCHANNEL_ID= ruleCHANNEL_ID EOF ;
    public final String entryRuleCHANNEL_ID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCHANNEL_ID = null;


        try {
            // InternalThing.g:1050:50: (iv_ruleCHANNEL_ID= ruleCHANNEL_ID EOF )
            // InternalThing.g:1051:2: iv_ruleCHANNEL_ID= ruleCHANNEL_ID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCHANNEL_IDRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCHANNEL_ID=ruleCHANNEL_ID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCHANNEL_ID.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCHANNEL_ID"


    // $ANTLR start "ruleCHANNEL_ID"
    // InternalThing.g:1057:1: ruleCHANNEL_ID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_UID_SEGMENT_0= ruleUID_SEGMENT (kw= '#' this_UID_SEGMENT_2= ruleUID_SEGMENT )? ) ;
    public final AntlrDatatypeRuleToken ruleCHANNEL_ID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_UID_SEGMENT_0 = null;

        AntlrDatatypeRuleToken this_UID_SEGMENT_2 = null;



        	enterRule();

        try {
            // InternalThing.g:1063:2: ( (this_UID_SEGMENT_0= ruleUID_SEGMENT (kw= '#' this_UID_SEGMENT_2= ruleUID_SEGMENT )? ) )
            // InternalThing.g:1064:2: (this_UID_SEGMENT_0= ruleUID_SEGMENT (kw= '#' this_UID_SEGMENT_2= ruleUID_SEGMENT )? )
            {
            // InternalThing.g:1064:2: (this_UID_SEGMENT_0= ruleUID_SEGMENT (kw= '#' this_UID_SEGMENT_2= ruleUID_SEGMENT )? )
            // InternalThing.g:1065:3: this_UID_SEGMENT_0= ruleUID_SEGMENT (kw= '#' this_UID_SEGMENT_2= ruleUID_SEGMENT )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCHANNEL_IDAccess().getUID_SEGMENTParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_26);
            this_UID_SEGMENT_0=ruleUID_SEGMENT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_UID_SEGMENT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalThing.g:1075:3: (kw= '#' this_UID_SEGMENT_2= ruleUID_SEGMENT )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==40) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalThing.g:1076:4: kw= '#' this_UID_SEGMENT_2= ruleUID_SEGMENT
                    {
                    kw=(Token)match(input,40,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getCHANNEL_IDAccess().getNumberSignKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getCHANNEL_IDAccess().getUID_SEGMENTParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_UID_SEGMENT_2=ruleUID_SEGMENT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_UID_SEGMENT_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCHANNEL_ID"


    // $ANTLR start "entryRuleUID"
    // InternalThing.g:1096:1: entryRuleUID returns [String current=null] : iv_ruleUID= ruleUID EOF ;
    public final String entryRuleUID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUID = null;


        try {
            // InternalThing.g:1096:43: (iv_ruleUID= ruleUID EOF )
            // InternalThing.g:1097:2: iv_ruleUID= ruleUID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUIDRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUID=ruleUID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUID.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUID"


    // $ANTLR start "ruleUID"
    // InternalThing.g:1103:1: ruleUID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_UID_SEGMENT_0= ruleUID_SEGMENT kw= ':' this_UID_SEGMENT_2= ruleUID_SEGMENT kw= ':' this_UID_SEGMENT_4= ruleUID_SEGMENT ( ( ( ':' )=>kw= ':' ) this_UID_SEGMENT_6= ruleUID_SEGMENT )* ) ;
    public final AntlrDatatypeRuleToken ruleUID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_UID_SEGMENT_0 = null;

        AntlrDatatypeRuleToken this_UID_SEGMENT_2 = null;

        AntlrDatatypeRuleToken this_UID_SEGMENT_4 = null;

        AntlrDatatypeRuleToken this_UID_SEGMENT_6 = null;



        	enterRule();

        try {
            // InternalThing.g:1109:2: ( (this_UID_SEGMENT_0= ruleUID_SEGMENT kw= ':' this_UID_SEGMENT_2= ruleUID_SEGMENT kw= ':' this_UID_SEGMENT_4= ruleUID_SEGMENT ( ( ( ':' )=>kw= ':' ) this_UID_SEGMENT_6= ruleUID_SEGMENT )* ) )
            // InternalThing.g:1110:2: (this_UID_SEGMENT_0= ruleUID_SEGMENT kw= ':' this_UID_SEGMENT_2= ruleUID_SEGMENT kw= ':' this_UID_SEGMENT_4= ruleUID_SEGMENT ( ( ( ':' )=>kw= ':' ) this_UID_SEGMENT_6= ruleUID_SEGMENT )* )
            {
            // InternalThing.g:1110:2: (this_UID_SEGMENT_0= ruleUID_SEGMENT kw= ':' this_UID_SEGMENT_2= ruleUID_SEGMENT kw= ':' this_UID_SEGMENT_4= ruleUID_SEGMENT ( ( ( ':' )=>kw= ':' ) this_UID_SEGMENT_6= ruleUID_SEGMENT )* )
            // InternalThing.g:1111:3: this_UID_SEGMENT_0= ruleUID_SEGMENT kw= ':' this_UID_SEGMENT_2= ruleUID_SEGMENT kw= ':' this_UID_SEGMENT_4= ruleUID_SEGMENT ( ( ( ':' )=>kw= ':' ) this_UID_SEGMENT_6= ruleUID_SEGMENT )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getUIDAccess().getUID_SEGMENTParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_20);
            this_UID_SEGMENT_0=ruleUID_SEGMENT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_UID_SEGMENT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,25,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getUIDAccess().getColonKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getUIDAccess().getUID_SEGMENTParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_20);
            this_UID_SEGMENT_2=ruleUID_SEGMENT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_UID_SEGMENT_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,25,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getUIDAccess().getColonKeyword_3());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getUIDAccess().getUID_SEGMENTParserRuleCall_4());
              		
            }
            pushFollow(FOLLOW_27);
            this_UID_SEGMENT_4=ruleUID_SEGMENT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_UID_SEGMENT_4);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalThing.g:1151:3: ( ( ( ':' )=>kw= ':' ) this_UID_SEGMENT_6= ruleUID_SEGMENT )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==25) && (synpred1_InternalThing())) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalThing.g:1152:4: ( ( ':' )=>kw= ':' ) this_UID_SEGMENT_6= ruleUID_SEGMENT
            	    {
            	    // InternalThing.g:1152:4: ( ( ':' )=>kw= ':' )
            	    // InternalThing.g:1153:5: ( ':' )=>kw= ':'
            	    {
            	    kw=(Token)match(input,25,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					current.merge(kw);
            	      					newLeafNode(kw, grammarAccess.getUIDAccess().getColonKeyword_5_0());
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getUIDAccess().getUID_SEGMENTParserRuleCall_5_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_27);
            	    this_UID_SEGMENT_6=ruleUID_SEGMENT();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_UID_SEGMENT_6);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUID"


    // $ANTLR start "entryRuleUID_SEGMENT"
    // InternalThing.g:1175:1: entryRuleUID_SEGMENT returns [String current=null] : iv_ruleUID_SEGMENT= ruleUID_SEGMENT EOF ;
    public final String entryRuleUID_SEGMENT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUID_SEGMENT = null;


        try {
            // InternalThing.g:1175:51: (iv_ruleUID_SEGMENT= ruleUID_SEGMENT EOF )
            // InternalThing.g:1176:2: iv_ruleUID_SEGMENT= ruleUID_SEGMENT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUID_SEGMENTRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUID_SEGMENT=ruleUID_SEGMENT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUID_SEGMENT.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUID_SEGMENT"


    // $ANTLR start "ruleUID_SEGMENT"
    // InternalThing.g:1182:1: ruleUID_SEGMENT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleUID_SEGMENT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalThing.g:1188:2: (this_ID_0= RULE_ID )
            // InternalThing.g:1189:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_ID_0, grammarAccess.getUID_SEGMENTAccess().getIDTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUID_SEGMENT"


    // $ANTLR start "entryRuleValueType"
    // InternalThing.g:1199:1: entryRuleValueType returns [String current=null] : iv_ruleValueType= ruleValueType EOF ;
    public final String entryRuleValueType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValueType = null;


        try {
            // InternalThing.g:1199:49: (iv_ruleValueType= ruleValueType EOF )
            // InternalThing.g:1200:2: iv_ruleValueType= ruleValueType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValueType=ruleValueType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueType.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueType"


    // $ANTLR start "ruleValueType"
    // InternalThing.g:1206:1: ruleValueType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_NUMBER_1= ruleNUMBER | this_BOOLEAN_2= ruleBOOLEAN ) ;
    public final AntlrDatatypeRuleToken ruleValueType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_NUMBER_1 = null;

        AntlrDatatypeRuleToken this_BOOLEAN_2 = null;



        	enterRule();

        try {
            // InternalThing.g:1212:2: ( (this_STRING_0= RULE_STRING | this_NUMBER_1= ruleNUMBER | this_BOOLEAN_2= ruleBOOLEAN ) )
            // InternalThing.g:1213:2: (this_STRING_0= RULE_STRING | this_NUMBER_1= ruleNUMBER | this_BOOLEAN_2= ruleBOOLEAN )
            {
            // InternalThing.g:1213:2: (this_STRING_0= RULE_STRING | this_NUMBER_1= ruleNUMBER | this_BOOLEAN_2= ruleBOOLEAN )
            int alt38=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt38=1;
                }
                break;
            case RULE_ID:
            case 43:
                {
                alt38=2;
                }
                break;
            case 41:
            case 42:
                {
                alt38=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalThing.g:1214:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_0, grammarAccess.getValueTypeAccess().getSTRINGTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalThing.g:1222:3: this_NUMBER_1= ruleNUMBER
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getValueTypeAccess().getNUMBERParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NUMBER_1=ruleNUMBER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_NUMBER_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalThing.g:1233:3: this_BOOLEAN_2= ruleBOOLEAN
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getValueTypeAccess().getBOOLEANParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BOOLEAN_2=ruleBOOLEAN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_BOOLEAN_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueType"


    // $ANTLR start "entryRuleBOOLEAN"
    // InternalThing.g:1247:1: entryRuleBOOLEAN returns [String current=null] : iv_ruleBOOLEAN= ruleBOOLEAN EOF ;
    public final String entryRuleBOOLEAN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOLEAN = null;


        try {
            // InternalThing.g:1247:47: (iv_ruleBOOLEAN= ruleBOOLEAN EOF )
            // InternalThing.g:1248:2: iv_ruleBOOLEAN= ruleBOOLEAN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBOOLEANRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBOOLEAN=ruleBOOLEAN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBOOLEAN.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBOOLEAN"


    // $ANTLR start "ruleBOOLEAN"
    // InternalThing.g:1254:1: ruleBOOLEAN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBOOLEAN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalThing.g:1260:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalThing.g:1261:2: (kw= 'true' | kw= 'false' )
            {
            // InternalThing.g:1261:2: (kw= 'true' | kw= 'false' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==41) ) {
                alt39=1;
            }
            else if ( (LA39_0==42) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalThing.g:1262:3: kw= 'true'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBOOLEANAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalThing.g:1268:3: kw= 'false'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBOOLEANAccess().getFalseKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBOOLEAN"


    // $ANTLR start "entryRuleNUMBER"
    // InternalThing.g:1277:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;


        try {
            // InternalThing.g:1277:46: (iv_ruleNUMBER= ruleNUMBER EOF )
            // InternalThing.g:1278:2: iv_ruleNUMBER= ruleNUMBER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNUMBERRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNUMBER=ruleNUMBER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNUMBER.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // InternalThing.g:1284:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_ID_1= RULE_ID (kw= '.' this_ID_3= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_ID_3=null;


        	enterRule();

        try {
            // InternalThing.g:1290:2: ( ( (kw= '-' )? this_ID_1= RULE_ID (kw= '.' this_ID_3= RULE_ID )? ) )
            // InternalThing.g:1291:2: ( (kw= '-' )? this_ID_1= RULE_ID (kw= '.' this_ID_3= RULE_ID )? )
            {
            // InternalThing.g:1291:2: ( (kw= '-' )? this_ID_1= RULE_ID (kw= '.' this_ID_3= RULE_ID )? )
            // InternalThing.g:1292:3: (kw= '-' )? this_ID_1= RULE_ID (kw= '.' this_ID_3= RULE_ID )?
            {
            // InternalThing.g:1292:3: (kw= '-' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==43) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalThing.g:1293:4: kw= '-'
                    {
                    kw=(Token)match(input,43,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getNUMBERAccess().getHyphenMinusKeyword_0());
                      			
                    }

                    }
                    break;

            }

            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_1, grammarAccess.getNUMBERAccess().getIDTerminalRuleCall_1());
              		
            }
            // InternalThing.g:1306:3: (kw= '.' this_ID_3= RULE_ID )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==44) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalThing.g:1307:4: kw= '.' this_ID_3= RULE_ID
                    {
                    kw=(Token)match(input,44,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getNUMBERAccess().getFullStopKeyword_2_0());
                      			
                    }
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ID_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_3, grammarAccess.getNUMBERAccess().getIDTerminalRuleCall_2_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNUMBER"

    // $ANTLR start synpred1_InternalThing
    public final void synpred1_InternalThing_fragment() throws RecognitionException {   
        // InternalThing.g:1153:5: ( ':' )
        // InternalThing.g:1153:6: ':'
        {
        match(input,25,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalThing

    // Delegated rules

    public final boolean synpred1_InternalThing() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalThing_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000080422L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000009812L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000009802L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000009002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000006020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000007FFDCF0420L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000007FFDCE0420L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000007FFDC40000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000109812L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000109802L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000007FFDC60000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000007FFCC00000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000001012L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000E0000000030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000100000000002L});

}