package org.openhab.core.model.thing.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.openhab.core.model.thing.services.ThingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalThingParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'State'", "'Trigger'", "'Switch'", "'Rollershutter'", "'Number'", "'String'", "'Dimmer'", "'Contact'", "'DateTime'", "'Color'", "'Player'", "'Location'", "'Call'", "'Image'", "'true'", "'false'", "'@'", "'['", "']'", "','", "'{'", "'Things:'", "'Channels:'", "'}'", "'Thing'", "'('", "')'", "':'", "'Type'", "'Number:'", "'='", "'#'", "'-'", "'.'", "'Bridge'"
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

    	public void setGrammarAccess(ThingGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleThingModel"
    // InternalThing.g:54:1: entryRuleThingModel : ruleThingModel EOF ;
    public final void entryRuleThingModel() throws RecognitionException {
        try {
            // InternalThing.g:55:1: ( ruleThingModel EOF )
            // InternalThing.g:56:1: ruleThingModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getThingModelRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleThingModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getThingModelRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleThingModel"


    // $ANTLR start "ruleThingModel"
    // InternalThing.g:63:1: ruleThingModel : ( ( rule__ThingModel__ThingsAssignment )* ) ;
    public final void ruleThingModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:67:2: ( ( ( rule__ThingModel__ThingsAssignment )* ) )
            // InternalThing.g:68:2: ( ( rule__ThingModel__ThingsAssignment )* )
            {
            // InternalThing.g:68:2: ( ( rule__ThingModel__ThingsAssignment )* )
            // InternalThing.g:69:3: ( rule__ThingModel__ThingsAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getThingModelAccess().getThingsAssignment()); 
            }
            // InternalThing.g:70:3: ( rule__ThingModel__ThingsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==34||LA1_0==44) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalThing.g:70:4: rule__ThingModel__ThingsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__ThingModel__ThingsAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getThingModelAccess().getThingsAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleThingModel"


    // $ANTLR start "entryRuleModelBridge"
    // InternalThing.g:79:1: entryRuleModelBridge : ruleModelBridge EOF ;
    public final void entryRuleModelBridge() throws RecognitionException {
        try {
            // InternalThing.g:80:1: ( ruleModelBridge EOF )
            // InternalThing.g:81:1: ruleModelBridge EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelBridgeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleModelBridge();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelBridgeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModelBridge"


    // $ANTLR start "ruleModelBridge"
    // InternalThing.g:88:1: ruleModelBridge : ( ( rule__ModelBridge__Group__0 ) ) ;
    public final void ruleModelBridge() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:92:2: ( ( ( rule__ModelBridge__Group__0 ) ) )
            // InternalThing.g:93:2: ( ( rule__ModelBridge__Group__0 ) )
            {
            // InternalThing.g:93:2: ( ( rule__ModelBridge__Group__0 ) )
            // InternalThing.g:94:3: ( rule__ModelBridge__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelBridgeAccess().getGroup()); 
            }
            // InternalThing.g:95:3: ( rule__ModelBridge__Group__0 )
            // InternalThing.g:95:4: rule__ModelBridge__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ModelBridge__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelBridgeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelBridge"


    // $ANTLR start "entryRuleModelThing"
    // InternalThing.g:104:1: entryRuleModelThing : ruleModelThing EOF ;
    public final void entryRuleModelThing() throws RecognitionException {
        try {
            // InternalThing.g:105:1: ( ruleModelThing EOF )
            // InternalThing.g:106:1: ruleModelThing EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelThingRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleModelThing();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelThingRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModelThing"


    // $ANTLR start "ruleModelThing"
    // InternalThing.g:113:1: ruleModelThing : ( ( rule__ModelThing__Group__0 ) ) ;
    public final void ruleModelThing() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:117:2: ( ( ( rule__ModelThing__Group__0 ) ) )
            // InternalThing.g:118:2: ( ( rule__ModelThing__Group__0 ) )
            {
            // InternalThing.g:118:2: ( ( rule__ModelThing__Group__0 ) )
            // InternalThing.g:119:3: ( rule__ModelThing__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelThingAccess().getGroup()); 
            }
            // InternalThing.g:120:3: ( rule__ModelThing__Group__0 )
            // InternalThing.g:120:4: rule__ModelThing__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ModelThing__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelThingAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelThing"


    // $ANTLR start "entryRuleModelChannel"
    // InternalThing.g:129:1: entryRuleModelChannel : ruleModelChannel EOF ;
    public final void entryRuleModelChannel() throws RecognitionException {
        try {
            // InternalThing.g:130:1: ( ruleModelChannel EOF )
            // InternalThing.g:131:1: ruleModelChannel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelChannelRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleModelChannel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelChannelRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModelChannel"


    // $ANTLR start "ruleModelChannel"
    // InternalThing.g:138:1: ruleModelChannel : ( ( rule__ModelChannel__Group__0 ) ) ;
    public final void ruleModelChannel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:142:2: ( ( ( rule__ModelChannel__Group__0 ) ) )
            // InternalThing.g:143:2: ( ( rule__ModelChannel__Group__0 ) )
            {
            // InternalThing.g:143:2: ( ( rule__ModelChannel__Group__0 ) )
            // InternalThing.g:144:3: ( rule__ModelChannel__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelChannelAccess().getGroup()); 
            }
            // InternalThing.g:145:3: ( rule__ModelChannel__Group__0 )
            // InternalThing.g:145:4: rule__ModelChannel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ModelChannel__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelChannelAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelChannel"


    // $ANTLR start "entryRuleModelItemType"
    // InternalThing.g:154:1: entryRuleModelItemType : ruleModelItemType EOF ;
    public final void entryRuleModelItemType() throws RecognitionException {
        try {
            // InternalThing.g:155:1: ( ruleModelItemType EOF )
            // InternalThing.g:156:1: ruleModelItemType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelItemTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleModelItemType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelItemTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModelItemType"


    // $ANTLR start "ruleModelItemType"
    // InternalThing.g:163:1: ruleModelItemType : ( ( rule__ModelItemType__Alternatives ) ) ;
    public final void ruleModelItemType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:167:2: ( ( ( rule__ModelItemType__Alternatives ) ) )
            // InternalThing.g:168:2: ( ( rule__ModelItemType__Alternatives ) )
            {
            // InternalThing.g:168:2: ( ( rule__ModelItemType__Alternatives ) )
            // InternalThing.g:169:3: ( rule__ModelItemType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelItemTypeAccess().getAlternatives()); 
            }
            // InternalThing.g:170:3: ( rule__ModelItemType__Alternatives )
            // InternalThing.g:170:4: rule__ModelItemType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ModelItemType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelItemTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelItemType"


    // $ANTLR start "entryRuleBaseModelItemType"
    // InternalThing.g:179:1: entryRuleBaseModelItemType : ruleBaseModelItemType EOF ;
    public final void entryRuleBaseModelItemType() throws RecognitionException {
        try {
            // InternalThing.g:180:1: ( ruleBaseModelItemType EOF )
            // InternalThing.g:181:1: ruleBaseModelItemType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseModelItemTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBaseModelItemType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseModelItemTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBaseModelItemType"


    // $ANTLR start "ruleBaseModelItemType"
    // InternalThing.g:188:1: ruleBaseModelItemType : ( ( rule__BaseModelItemType__Alternatives ) ) ;
    public final void ruleBaseModelItemType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:192:2: ( ( ( rule__BaseModelItemType__Alternatives ) ) )
            // InternalThing.g:193:2: ( ( rule__BaseModelItemType__Alternatives ) )
            {
            // InternalThing.g:193:2: ( ( rule__BaseModelItemType__Alternatives ) )
            // InternalThing.g:194:3: ( rule__BaseModelItemType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseModelItemTypeAccess().getAlternatives()); 
            }
            // InternalThing.g:195:3: ( rule__BaseModelItemType__Alternatives )
            // InternalThing.g:195:4: rule__BaseModelItemType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BaseModelItemType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseModelItemTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBaseModelItemType"


    // $ANTLR start "entryRuleModelProperty"
    // InternalThing.g:204:1: entryRuleModelProperty : ruleModelProperty EOF ;
    public final void entryRuleModelProperty() throws RecognitionException {
        try {
            // InternalThing.g:205:1: ( ruleModelProperty EOF )
            // InternalThing.g:206:1: ruleModelProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelPropertyRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleModelProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelPropertyRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModelProperty"


    // $ANTLR start "ruleModelProperty"
    // InternalThing.g:213:1: ruleModelProperty : ( ( rule__ModelProperty__Group__0 ) ) ;
    public final void ruleModelProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:217:2: ( ( ( rule__ModelProperty__Group__0 ) ) )
            // InternalThing.g:218:2: ( ( rule__ModelProperty__Group__0 ) )
            {
            // InternalThing.g:218:2: ( ( rule__ModelProperty__Group__0 ) )
            // InternalThing.g:219:3: ( rule__ModelProperty__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelPropertyAccess().getGroup()); 
            }
            // InternalThing.g:220:3: ( rule__ModelProperty__Group__0 )
            // InternalThing.g:220:4: rule__ModelProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ModelProperty__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelPropertyAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelProperty"


    // $ANTLR start "entryRuleCHANNEL_ID"
    // InternalThing.g:229:1: entryRuleCHANNEL_ID : ruleCHANNEL_ID EOF ;
    public final void entryRuleCHANNEL_ID() throws RecognitionException {
        try {
            // InternalThing.g:230:1: ( ruleCHANNEL_ID EOF )
            // InternalThing.g:231:1: ruleCHANNEL_ID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCHANNEL_IDRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCHANNEL_ID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCHANNEL_IDRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCHANNEL_ID"


    // $ANTLR start "ruleCHANNEL_ID"
    // InternalThing.g:238:1: ruleCHANNEL_ID : ( ( rule__CHANNEL_ID__Group__0 ) ) ;
    public final void ruleCHANNEL_ID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:242:2: ( ( ( rule__CHANNEL_ID__Group__0 ) ) )
            // InternalThing.g:243:2: ( ( rule__CHANNEL_ID__Group__0 ) )
            {
            // InternalThing.g:243:2: ( ( rule__CHANNEL_ID__Group__0 ) )
            // InternalThing.g:244:3: ( rule__CHANNEL_ID__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCHANNEL_IDAccess().getGroup()); 
            }
            // InternalThing.g:245:3: ( rule__CHANNEL_ID__Group__0 )
            // InternalThing.g:245:4: rule__CHANNEL_ID__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CHANNEL_ID__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCHANNEL_IDAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCHANNEL_ID"


    // $ANTLR start "entryRuleUID"
    // InternalThing.g:254:1: entryRuleUID : ruleUID EOF ;
    public final void entryRuleUID() throws RecognitionException {
        try {
            // InternalThing.g:255:1: ( ruleUID EOF )
            // InternalThing.g:256:1: ruleUID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleUID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIDRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUID"


    // $ANTLR start "ruleUID"
    // InternalThing.g:263:1: ruleUID : ( ( rule__UID__Group__0 ) ) ;
    public final void ruleUID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:267:2: ( ( ( rule__UID__Group__0 ) ) )
            // InternalThing.g:268:2: ( ( rule__UID__Group__0 ) )
            {
            // InternalThing.g:268:2: ( ( rule__UID__Group__0 ) )
            // InternalThing.g:269:3: ( rule__UID__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDAccess().getGroup()); 
            }
            // InternalThing.g:270:3: ( rule__UID__Group__0 )
            // InternalThing.g:270:4: rule__UID__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UID__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIDAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUID"


    // $ANTLR start "entryRuleUID_SEGMENT"
    // InternalThing.g:279:1: entryRuleUID_SEGMENT : ruleUID_SEGMENT EOF ;
    public final void entryRuleUID_SEGMENT() throws RecognitionException {
        try {
            // InternalThing.g:280:1: ( ruleUID_SEGMENT EOF )
            // InternalThing.g:281:1: ruleUID_SEGMENT EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUID_SEGMENTRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleUID_SEGMENT();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUID_SEGMENTRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUID_SEGMENT"


    // $ANTLR start "ruleUID_SEGMENT"
    // InternalThing.g:288:1: ruleUID_SEGMENT : ( RULE_ID ) ;
    public final void ruleUID_SEGMENT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:292:2: ( ( RULE_ID ) )
            // InternalThing.g:293:2: ( RULE_ID )
            {
            // InternalThing.g:293:2: ( RULE_ID )
            // InternalThing.g:294:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUID_SEGMENTAccess().getIDTerminalRuleCall()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUID_SEGMENTAccess().getIDTerminalRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUID_SEGMENT"


    // $ANTLR start "entryRuleValueType"
    // InternalThing.g:304:1: entryRuleValueType : ruleValueType EOF ;
    public final void entryRuleValueType() throws RecognitionException {
        try {
            // InternalThing.g:305:1: ( ruleValueType EOF )
            // InternalThing.g:306:1: ruleValueType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleValueType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValueType"


    // $ANTLR start "ruleValueType"
    // InternalThing.g:313:1: ruleValueType : ( ( rule__ValueType__Alternatives ) ) ;
    public final void ruleValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:317:2: ( ( ( rule__ValueType__Alternatives ) ) )
            // InternalThing.g:318:2: ( ( rule__ValueType__Alternatives ) )
            {
            // InternalThing.g:318:2: ( ( rule__ValueType__Alternatives ) )
            // InternalThing.g:319:3: ( rule__ValueType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueTypeAccess().getAlternatives()); 
            }
            // InternalThing.g:320:3: ( rule__ValueType__Alternatives )
            // InternalThing.g:320:4: rule__ValueType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ValueType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValueType"


    // $ANTLR start "entryRuleBOOLEAN"
    // InternalThing.g:329:1: entryRuleBOOLEAN : ruleBOOLEAN EOF ;
    public final void entryRuleBOOLEAN() throws RecognitionException {
        try {
            // InternalThing.g:330:1: ( ruleBOOLEAN EOF )
            // InternalThing.g:331:1: ruleBOOLEAN EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBOOLEANRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBOOLEAN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBOOLEANRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBOOLEAN"


    // $ANTLR start "ruleBOOLEAN"
    // InternalThing.g:338:1: ruleBOOLEAN : ( ( rule__BOOLEAN__Alternatives ) ) ;
    public final void ruleBOOLEAN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:342:2: ( ( ( rule__BOOLEAN__Alternatives ) ) )
            // InternalThing.g:343:2: ( ( rule__BOOLEAN__Alternatives ) )
            {
            // InternalThing.g:343:2: ( ( rule__BOOLEAN__Alternatives ) )
            // InternalThing.g:344:3: ( rule__BOOLEAN__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBOOLEANAccess().getAlternatives()); 
            }
            // InternalThing.g:345:3: ( rule__BOOLEAN__Alternatives )
            // InternalThing.g:345:4: rule__BOOLEAN__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BOOLEAN__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBOOLEANAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBOOLEAN"


    // $ANTLR start "entryRuleNUMBER"
    // InternalThing.g:354:1: entryRuleNUMBER : ruleNUMBER EOF ;
    public final void entryRuleNUMBER() throws RecognitionException {
        try {
            // InternalThing.g:355:1: ( ruleNUMBER EOF )
            // InternalThing.g:356:1: ruleNUMBER EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNUMBERRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNUMBER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNUMBERRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // InternalThing.g:363:1: ruleNUMBER : ( ( rule__NUMBER__Group__0 ) ) ;
    public final void ruleNUMBER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:367:2: ( ( ( rule__NUMBER__Group__0 ) ) )
            // InternalThing.g:368:2: ( ( rule__NUMBER__Group__0 ) )
            {
            // InternalThing.g:368:2: ( ( rule__NUMBER__Group__0 ) )
            // InternalThing.g:369:3: ( rule__NUMBER__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNUMBERAccess().getGroup()); 
            }
            // InternalThing.g:370:3: ( rule__NUMBER__Group__0 )
            // InternalThing.g:370:4: rule__NUMBER__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NUMBER__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNUMBERAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNUMBER"


    // $ANTLR start "rule__ThingModel__ThingsAlternatives_0"
    // InternalThing.g:378:1: rule__ThingModel__ThingsAlternatives_0 : ( ( ruleModelThing ) | ( ruleModelBridge ) );
    public final void rule__ThingModel__ThingsAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:382:1: ( ( ruleModelThing ) | ( ruleModelBridge ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID||LA2_0==34) ) {
                alt2=1;
            }
            else if ( (LA2_0==44) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalThing.g:383:2: ( ruleModelThing )
                    {
                    // InternalThing.g:383:2: ( ruleModelThing )
                    // InternalThing.g:384:3: ruleModelThing
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getThingModelAccess().getThingsModelThingParserRuleCall_0_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleModelThing();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getThingModelAccess().getThingsModelThingParserRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalThing.g:389:2: ( ruleModelBridge )
                    {
                    // InternalThing.g:389:2: ( ruleModelBridge )
                    // InternalThing.g:390:3: ruleModelBridge
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getThingModelAccess().getThingsModelBridgeParserRuleCall_0_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleModelBridge();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getThingModelAccess().getThingsModelBridgeParserRuleCall_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThingModel__ThingsAlternatives_0"


    // $ANTLR start "rule__ModelBridge__Alternatives_2"
    // InternalThing.g:399:1: rule__ModelBridge__Alternatives_2 : ( ( ( rule__ModelBridge__IdAssignment_2_0 ) ) | ( ( rule__ModelBridge__Group_2_1__0 ) ) );
    public final void rule__ModelBridge__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:403:1: ( ( ( rule__ModelBridge__IdAssignment_2_0 ) ) | ( ( rule__ModelBridge__Group_2_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_ID) ) {
                    alt3=2;
                }
                else if ( (LA3_1==37) ) {
                    alt3=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalThing.g:404:2: ( ( rule__ModelBridge__IdAssignment_2_0 ) )
                    {
                    // InternalThing.g:404:2: ( ( rule__ModelBridge__IdAssignment_2_0 ) )
                    // InternalThing.g:405:3: ( rule__ModelBridge__IdAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelBridgeAccess().getIdAssignment_2_0()); 
                    }
                    // InternalThing.g:406:3: ( rule__ModelBridge__IdAssignment_2_0 )
                    // InternalThing.g:406:4: rule__ModelBridge__IdAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ModelBridge__IdAssignment_2_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelBridgeAccess().getIdAssignment_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalThing.g:410:2: ( ( rule__ModelBridge__Group_2_1__0 ) )
                    {
                    // InternalThing.g:410:2: ( ( rule__ModelBridge__Group_2_1__0 ) )
                    // InternalThing.g:411:3: ( rule__ModelBridge__Group_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelBridgeAccess().getGroup_2_1()); 
                    }
                    // InternalThing.g:412:3: ( rule__ModelBridge__Group_2_1__0 )
                    // InternalThing.g:412:4: rule__ModelBridge__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ModelBridge__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelBridgeAccess().getGroup_2_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Alternatives_2"


    // $ANTLR start "rule__ModelBridge__ThingsAlternatives_6_2_0"
    // InternalThing.g:420:1: rule__ModelBridge__ThingsAlternatives_6_2_0 : ( ( ruleModelThing ) | ( ruleModelBridge ) );
    public final void rule__ModelBridge__ThingsAlternatives_6_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:424:1: ( ( ruleModelThing ) | ( ruleModelBridge ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID||LA4_0==34) ) {
                alt4=1;
            }
            else if ( (LA4_0==44) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalThing.g:425:2: ( ruleModelThing )
                    {
                    // InternalThing.g:425:2: ( ruleModelThing )
                    // InternalThing.g:426:3: ruleModelThing
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelBridgeAccess().getThingsModelThingParserRuleCall_6_2_0_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleModelThing();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelBridgeAccess().getThingsModelThingParserRuleCall_6_2_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalThing.g:431:2: ( ruleModelBridge )
                    {
                    // InternalThing.g:431:2: ( ruleModelBridge )
                    // InternalThing.g:432:3: ruleModelBridge
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelBridgeAccess().getThingsModelBridgeParserRuleCall_6_2_0_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleModelBridge();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelBridgeAccess().getThingsModelBridgeParserRuleCall_6_2_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__ThingsAlternatives_6_2_0"


    // $ANTLR start "rule__ModelThing__Alternatives_1"
    // InternalThing.g:441:1: rule__ModelThing__Alternatives_1 : ( ( ( rule__ModelThing__IdAssignment_1_0 ) ) | ( ( rule__ModelThing__Group_1_1__0 ) ) );
    public final void rule__ModelThing__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:445:1: ( ( ( rule__ModelThing__IdAssignment_1_0 ) ) | ( ( rule__ModelThing__Group_1_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_ID) ) {
                    alt5=2;
                }
                else if ( (LA5_1==37) ) {
                    alt5=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalThing.g:446:2: ( ( rule__ModelThing__IdAssignment_1_0 ) )
                    {
                    // InternalThing.g:446:2: ( ( rule__ModelThing__IdAssignment_1_0 ) )
                    // InternalThing.g:447:3: ( rule__ModelThing__IdAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelThingAccess().getIdAssignment_1_0()); 
                    }
                    // InternalThing.g:448:3: ( rule__ModelThing__IdAssignment_1_0 )
                    // InternalThing.g:448:4: rule__ModelThing__IdAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ModelThing__IdAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelThingAccess().getIdAssignment_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalThing.g:452:2: ( ( rule__ModelThing__Group_1_1__0 ) )
                    {
                    // InternalThing.g:452:2: ( ( rule__ModelThing__Group_1_1__0 ) )
                    // InternalThing.g:453:3: ( rule__ModelThing__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelThingAccess().getGroup_1_1()); 
                    }
                    // InternalThing.g:454:3: ( rule__ModelThing__Group_1_1__0 )
                    // InternalThing.g:454:4: rule__ModelThing__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ModelThing__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelThingAccess().getGroup_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Alternatives_1"


    // $ANTLR start "rule__ModelChannel__Alternatives_0"
    // InternalThing.g:462:1: rule__ModelChannel__Alternatives_0 : ( ( ( rule__ModelChannel__Group_0_0__0 ) ) | ( ( rule__ModelChannel__Group_0_1__0 ) ) );
    public final void rule__ModelChannel__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:466:1: ( ( ( rule__ModelChannel__Group_0_0__0 ) ) | ( ( rule__ModelChannel__Group_0_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=10 && LA6_0<=23)||LA6_0==39) ) {
                alt6=1;
            }
            else if ( (LA6_0==38) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalThing.g:467:2: ( ( rule__ModelChannel__Group_0_0__0 ) )
                    {
                    // InternalThing.g:467:2: ( ( rule__ModelChannel__Group_0_0__0 ) )
                    // InternalThing.g:468:3: ( rule__ModelChannel__Group_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelChannelAccess().getGroup_0_0()); 
                    }
                    // InternalThing.g:469:3: ( rule__ModelChannel__Group_0_0__0 )
                    // InternalThing.g:469:4: rule__ModelChannel__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ModelChannel__Group_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelChannelAccess().getGroup_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalThing.g:473:2: ( ( rule__ModelChannel__Group_0_1__0 ) )
                    {
                    // InternalThing.g:473:2: ( ( rule__ModelChannel__Group_0_1__0 ) )
                    // InternalThing.g:474:3: ( rule__ModelChannel__Group_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelChannelAccess().getGroup_0_1()); 
                    }
                    // InternalThing.g:475:3: ( rule__ModelChannel__Group_0_1__0 )
                    // InternalThing.g:475:4: rule__ModelChannel__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ModelChannel__Group_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelChannelAccess().getGroup_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelChannel__Alternatives_0"


    // $ANTLR start "rule__ModelChannel__ChannelKindAlternatives_0_0_0_0"
    // InternalThing.g:483:1: rule__ModelChannel__ChannelKindAlternatives_0_0_0_0 : ( ( 'State' ) | ( 'Trigger' ) );
    public final void rule__ModelChannel__ChannelKindAlternatives_0_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:487:1: ( ( 'State' ) | ( 'Trigger' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==10) ) {
                alt7=1;
            }
            else if ( (LA7_0==11) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalThing.g:488:2: ( 'State' )
                    {
                    // InternalThing.g:488:2: ( 'State' )
                    // InternalThing.g:489:3: 'State'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelChannelAccess().getChannelKindStateKeyword_0_0_0_0_0()); 
                    }
                    match(input,10,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelChannelAccess().getChannelKindStateKeyword_0_0_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalThing.g:494:2: ( 'Trigger' )
                    {
                    // InternalThing.g:494:2: ( 'Trigger' )
                    // InternalThing.g:495:3: 'Trigger'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelChannelAccess().getChannelKindTriggerKeyword_0_0_0_0_1()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelChannelAccess().getChannelKindTriggerKeyword_0_0_0_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelChannel__ChannelKindAlternatives_0_0_0_0"


    // $ANTLR start "rule__ModelItemType__Alternatives"
    // InternalThing.g:504:1: rule__ModelItemType__Alternatives : ( ( ruleBaseModelItemType ) | ( ( rule__ModelItemType__Group_1__0 ) ) );
    public final void rule__ModelItemType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:508:1: ( ( ruleBaseModelItemType ) | ( ( rule__ModelItemType__Group_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=12 && LA8_0<=23)) ) {
                alt8=1;
            }
            else if ( (LA8_0==39) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalThing.g:509:2: ( ruleBaseModelItemType )
                    {
                    // InternalThing.g:509:2: ( ruleBaseModelItemType )
                    // InternalThing.g:510:3: ruleBaseModelItemType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelItemTypeAccess().getBaseModelItemTypeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBaseModelItemType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelItemTypeAccess().getBaseModelItemTypeParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalThing.g:515:2: ( ( rule__ModelItemType__Group_1__0 ) )
                    {
                    // InternalThing.g:515:2: ( ( rule__ModelItemType__Group_1__0 ) )
                    // InternalThing.g:516:3: ( rule__ModelItemType__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelItemTypeAccess().getGroup_1()); 
                    }
                    // InternalThing.g:517:3: ( rule__ModelItemType__Group_1__0 )
                    // InternalThing.g:517:4: rule__ModelItemType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ModelItemType__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelItemTypeAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelItemType__Alternatives"


    // $ANTLR start "rule__BaseModelItemType__Alternatives"
    // InternalThing.g:525:1: rule__BaseModelItemType__Alternatives : ( ( 'Switch' ) | ( 'Rollershutter' ) | ( 'Number' ) | ( 'String' ) | ( 'Dimmer' ) | ( 'Contact' ) | ( 'DateTime' ) | ( 'Color' ) | ( 'Player' ) | ( 'Location' ) | ( 'Call' ) | ( 'Image' ) );
    public final void rule__BaseModelItemType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:529:1: ( ( 'Switch' ) | ( 'Rollershutter' ) | ( 'Number' ) | ( 'String' ) | ( 'Dimmer' ) | ( 'Contact' ) | ( 'DateTime' ) | ( 'Color' ) | ( 'Player' ) | ( 'Location' ) | ( 'Call' ) | ( 'Image' ) )
            int alt9=12;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt9=1;
                }
                break;
            case 13:
                {
                alt9=2;
                }
                break;
            case 14:
                {
                alt9=3;
                }
                break;
            case 15:
                {
                alt9=4;
                }
                break;
            case 16:
                {
                alt9=5;
                }
                break;
            case 17:
                {
                alt9=6;
                }
                break;
            case 18:
                {
                alt9=7;
                }
                break;
            case 19:
                {
                alt9=8;
                }
                break;
            case 20:
                {
                alt9=9;
                }
                break;
            case 21:
                {
                alt9=10;
                }
                break;
            case 22:
                {
                alt9=11;
                }
                break;
            case 23:
                {
                alt9=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalThing.g:530:2: ( 'Switch' )
                    {
                    // InternalThing.g:530:2: ( 'Switch' )
                    // InternalThing.g:531:3: 'Switch'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseModelItemTypeAccess().getSwitchKeyword_0()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBaseModelItemTypeAccess().getSwitchKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalThing.g:536:2: ( 'Rollershutter' )
                    {
                    // InternalThing.g:536:2: ( 'Rollershutter' )
                    // InternalThing.g:537:3: 'Rollershutter'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseModelItemTypeAccess().getRollershutterKeyword_1()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBaseModelItemTypeAccess().getRollershutterKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalThing.g:542:2: ( 'Number' )
                    {
                    // InternalThing.g:542:2: ( 'Number' )
                    // InternalThing.g:543:3: 'Number'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseModelItemTypeAccess().getNumberKeyword_2()); 
                    }
                    match(input,14,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBaseModelItemTypeAccess().getNumberKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalThing.g:548:2: ( 'String' )
                    {
                    // InternalThing.g:548:2: ( 'String' )
                    // InternalThing.g:549:3: 'String'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseModelItemTypeAccess().getStringKeyword_3()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBaseModelItemTypeAccess().getStringKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalThing.g:554:2: ( 'Dimmer' )
                    {
                    // InternalThing.g:554:2: ( 'Dimmer' )
                    // InternalThing.g:555:3: 'Dimmer'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseModelItemTypeAccess().getDimmerKeyword_4()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBaseModelItemTypeAccess().getDimmerKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalThing.g:560:2: ( 'Contact' )
                    {
                    // InternalThing.g:560:2: ( 'Contact' )
                    // InternalThing.g:561:3: 'Contact'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseModelItemTypeAccess().getContactKeyword_5()); 
                    }
                    match(input,17,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBaseModelItemTypeAccess().getContactKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalThing.g:566:2: ( 'DateTime' )
                    {
                    // InternalThing.g:566:2: ( 'DateTime' )
                    // InternalThing.g:567:3: 'DateTime'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseModelItemTypeAccess().getDateTimeKeyword_6()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBaseModelItemTypeAccess().getDateTimeKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalThing.g:572:2: ( 'Color' )
                    {
                    // InternalThing.g:572:2: ( 'Color' )
                    // InternalThing.g:573:3: 'Color'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseModelItemTypeAccess().getColorKeyword_7()); 
                    }
                    match(input,19,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBaseModelItemTypeAccess().getColorKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalThing.g:578:2: ( 'Player' )
                    {
                    // InternalThing.g:578:2: ( 'Player' )
                    // InternalThing.g:579:3: 'Player'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseModelItemTypeAccess().getPlayerKeyword_8()); 
                    }
                    match(input,20,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBaseModelItemTypeAccess().getPlayerKeyword_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalThing.g:584:2: ( 'Location' )
                    {
                    // InternalThing.g:584:2: ( 'Location' )
                    // InternalThing.g:585:3: 'Location'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseModelItemTypeAccess().getLocationKeyword_9()); 
                    }
                    match(input,21,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBaseModelItemTypeAccess().getLocationKeyword_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalThing.g:590:2: ( 'Call' )
                    {
                    // InternalThing.g:590:2: ( 'Call' )
                    // InternalThing.g:591:3: 'Call'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseModelItemTypeAccess().getCallKeyword_10()); 
                    }
                    match(input,22,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBaseModelItemTypeAccess().getCallKeyword_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalThing.g:596:2: ( 'Image' )
                    {
                    // InternalThing.g:596:2: ( 'Image' )
                    // InternalThing.g:597:3: 'Image'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseModelItemTypeAccess().getImageKeyword_11()); 
                    }
                    match(input,23,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBaseModelItemTypeAccess().getImageKeyword_11()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseModelItemType__Alternatives"


    // $ANTLR start "rule__ValueType__Alternatives"
    // InternalThing.g:606:1: rule__ValueType__Alternatives : ( ( RULE_STRING ) | ( ruleNUMBER ) | ( ruleBOOLEAN ) );
    public final void rule__ValueType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:610:1: ( ( RULE_STRING ) | ( ruleNUMBER ) | ( ruleBOOLEAN ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt10=1;
                }
                break;
            case RULE_ID:
            case 42:
                {
                alt10=2;
                }
                break;
            case 24:
            case 25:
                {
                alt10=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalThing.g:611:2: ( RULE_STRING )
                    {
                    // InternalThing.g:611:2: ( RULE_STRING )
                    // InternalThing.g:612:3: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueTypeAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalThing.g:617:2: ( ruleNUMBER )
                    {
                    // InternalThing.g:617:2: ( ruleNUMBER )
                    // InternalThing.g:618:3: ruleNUMBER
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getNUMBERParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleNUMBER();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueTypeAccess().getNUMBERParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalThing.g:623:2: ( ruleBOOLEAN )
                    {
                    // InternalThing.g:623:2: ( ruleBOOLEAN )
                    // InternalThing.g:624:3: ruleBOOLEAN
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getBOOLEANParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBOOLEAN();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueTypeAccess().getBOOLEANParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType__Alternatives"


    // $ANTLR start "rule__BOOLEAN__Alternatives"
    // InternalThing.g:633:1: rule__BOOLEAN__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BOOLEAN__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:637:1: ( ( 'true' ) | ( 'false' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            else if ( (LA11_0==25) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalThing.g:638:2: ( 'true' )
                    {
                    // InternalThing.g:638:2: ( 'true' )
                    // InternalThing.g:639:3: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBOOLEANAccess().getTrueKeyword_0()); 
                    }
                    match(input,24,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBOOLEANAccess().getTrueKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalThing.g:644:2: ( 'false' )
                    {
                    // InternalThing.g:644:2: ( 'false' )
                    // InternalThing.g:645:3: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBOOLEANAccess().getFalseKeyword_1()); 
                    }
                    match(input,25,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBOOLEANAccess().getFalseKeyword_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOOLEAN__Alternatives"


    // $ANTLR start "rule__ModelBridge__Group__0"
    // InternalThing.g:654:1: rule__ModelBridge__Group__0 : rule__ModelBridge__Group__0__Impl rule__ModelBridge__Group__1 ;
    public final void rule__ModelBridge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:658:1: ( rule__ModelBridge__Group__0__Impl rule__ModelBridge__Group__1 )
            // InternalThing.g:659:2: rule__ModelBridge__Group__0__Impl rule__ModelBridge__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ModelBridge__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelBridge__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group__0"


    // $ANTLR start "rule__ModelBridge__Group__0__Impl"
    // InternalThing.g:666:1: rule__ModelBridge__Group__0__Impl : ( () ) ;
    public final void rule__ModelBridge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:670:1: ( ( () ) )
            // InternalThing.g:671:1: ( () )
            {
            // InternalThing.g:671:1: ( () )
            // InternalThing.g:672:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelBridgeAccess().getModelBridgeAction_0()); 
            }
            // InternalThing.g:673:2: ()
            // InternalThing.g:673:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelBridgeAccess().getModelBridgeAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group__0__Impl"


    // $ANTLR start "rule__ModelBridge__Group__1"
    // InternalThing.g:681:1: rule__ModelBridge__Group__1 : rule__ModelBridge__Group__1__Impl rule__ModelBridge__Group__2 ;
    public final void rule__ModelBridge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:685:1: ( rule__ModelBridge__Group__1__Impl rule__ModelBridge__Group__2 )
            // InternalThing.g:686:2: rule__ModelBridge__Group__1__Impl rule__ModelBridge__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ModelBridge__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelBridge__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group__1"


    // $ANTLR start "rule__ModelBridge__Group__1__Impl"
    // InternalThing.g:693:1: rule__ModelBridge__Group__1__Impl : ( ( rule__ModelBridge__BridgeAssignment_1 ) ) ;
    public final void rule__ModelBridge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:697:1: ( ( ( rule__ModelBridge__BridgeAssignment_1 ) ) )
            // InternalThing.g:698:1: ( ( rule__ModelBridge__BridgeAssignment_1 ) )
            {
            // InternalThing.g:698:1: ( ( rule__ModelBridge__BridgeAssignment_1 ) )
            // InternalThing.g:699:2: ( rule__ModelBridge__BridgeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelBridgeAccess().getBridgeAssignment_1()); 
            }
            // InternalThing.g:700:2: ( rule__ModelBridge__BridgeAssignment_1 )
            // InternalThing.g:700:3: rule__ModelBridge__BridgeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ModelBridge__BridgeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelBridgeAccess().getBridgeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group__1__Impl"


    // $ANTLR start "rule__ModelBridge__Group__2"
    // InternalThing.g:708:1: rule__ModelBridge__Group__2 : rule__ModelBridge__Group__2__Impl rule__ModelBridge__Group__3 ;
    public final void rule__ModelBridge__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:712:1: ( rule__ModelBridge__Group__2__Impl rule__ModelBridge__Group__3 )
            // InternalThing.g:713:2: rule__ModelBridge__Group__2__Impl rule__ModelBridge__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__ModelBridge__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelBridge__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group__2"


    // $ANTLR start "rule__ModelBridge__Group__2__Impl"
    // InternalThing.g:720:1: rule__ModelBridge__Group__2__Impl : ( ( rule__ModelBridge__Alternatives_2 ) ) ;
    public final void rule__ModelBridge__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:724:1: ( ( ( rule__ModelBridge__Alternatives_2 ) ) )
            // InternalThing.g:725:1: ( ( rule__ModelBridge__Alternatives_2 ) )
            {
            // InternalThing.g:725:1: ( ( rule__ModelBridge__Alternatives_2 ) )
            // InternalThing.g:726:2: ( rule__ModelBridge__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelBridgeAccess().getAlternatives_2()); 
            }
            // InternalThing.g:727:2: ( rule__ModelBridge__Alternatives_2 )
            // InternalThing.g:727:3: rule__ModelBridge__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__ModelBridge__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelBridgeAccess().getAlternatives_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group__2__Impl"


    // $ANTLR start "rule__ModelBridge__Group__3"
    // InternalThing.g:735:1: rule__ModelBridge__Group__3 : rule__ModelBridge__Group__3__Impl rule__ModelBridge__Group__4 ;
    public final void rule__ModelBridge__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:739:1: ( rule__ModelBridge__Group__3__Impl rule__ModelBridge__Group__4 )
            // InternalThing.g:740:2: rule__ModelBridge__Group__3__Impl rule__ModelBridge__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ModelBridge__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelBridge__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group__3"


    // $ANTLR start "rule__ModelBridge__Group__3__Impl"
    // InternalThing.g:747:1: rule__ModelBridge__Group__3__Impl : ( ( rule__ModelBridge__LabelAssignment_3 )? ) ;
    public final void rule__ModelBridge__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:751:1: ( ( ( rule__ModelBridge__LabelAssignment_3 )? ) )
            // InternalThing.g:752:1: ( ( rule__ModelBridge__LabelAssignment_3 )? )
            {
            // InternalThing.g:752:1: ( ( rule__ModelBridge__LabelAssignment_3 )? )
            // InternalThing.g:753:2: ( rule__ModelBridge__LabelAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelBridgeAccess().getLabelAssignment_3()); 
            }
            // InternalThing.g:754:2: ( rule__ModelBridge__LabelAssignment_3 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalThing.g:754:3: rule__ModelBridge__LabelAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ModelBridge__LabelAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelBridgeAccess().getLabelAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group__3__Impl"


    // $ANTLR start "rule__ModelBridge__Group__4"
    // InternalThing.g:762:1: rule__ModelBridge__Group__4 : rule__ModelBridge__Group__4__Impl rule__ModelBridge__Group__5 ;
    public final void rule__ModelBridge__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:766:1: ( rule__ModelBridge__Group__4__Impl rule__ModelBridge__Group__5 )
            // InternalThing.g:767:2: rule__ModelBridge__Group__4__Impl rule__ModelBridge__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__ModelBridge__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelBridge__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group__4"


    // $ANTLR start "rule__ModelBridge__Group__4__Impl"
    // InternalThing.g:774:1: rule__ModelBridge__Group__4__Impl : ( ( rule__ModelBridge__Group_4__0 )? ) ;
    public final void rule__ModelBridge__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:778:1: ( ( ( rule__ModelBridge__Group_4__0 )? ) )
            // InternalThing.g:779:1: ( ( rule__ModelBridge__Group_4__0 )? )
            {
            // InternalThing.g:779:1: ( ( rule__ModelBridge__Group_4__0 )? )
            // InternalThing.g:780:2: ( rule__ModelBridge__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelBridgeAccess().getGroup_4()); 
            }
            // InternalThing.g:781:2: ( rule__ModelBridge__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalThing.g:781:3: rule__ModelBridge__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ModelBridge__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelBridgeAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group__4__Impl"


    // $ANTLR start "rule__ModelBridge__Group__5"
    // InternalThing.g:789:1: rule__ModelBridge__Group__5 : rule__ModelBridge__Group__5__Impl rule__ModelBridge__Group__6 ;
    public final void rule__ModelBridge__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:793:1: ( rule__ModelBridge__Group__5__Impl rule__ModelBridge__Group__6 )
            // InternalThing.g:794:2: rule__ModelBridge__Group__5__Impl rule__ModelBridge__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__ModelBridge__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelBridge__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group__5"


    // $ANTLR start "rule__ModelBridge__Group__5__Impl"
    // InternalThing.g:801:1: rule__ModelBridge__Group__5__Impl : ( ( rule__ModelBridge__Group_5__0 )? ) ;
    public final void rule__ModelBridge__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:805:1: ( ( ( rule__ModelBridge__Group_5__0 )? ) )
            // InternalThing.g:806:1: ( ( rule__ModelBridge__Group_5__0 )? )
            {
            // InternalThing.g:806:1: ( ( rule__ModelBridge__Group_5__0 )? )
            // InternalThing.g:807:2: ( rule__ModelBridge__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelBridgeAccess().getGroup_5()); 
            }
            // InternalThing.g:808:2: ( rule__ModelBridge__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalThing.g:808:3: rule__ModelBridge__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ModelBridge__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelBridgeAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group__5__Impl"


    // $ANTLR start "rule__ModelBridge__Group__6"
    // InternalThing.g:816:1: rule__ModelBridge__Group__6 : rule__ModelBridge__Group__6__Impl ;
    public final void rule__ModelBridge__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:820:1: ( rule__ModelBridge__Group__6__Impl )
            // InternalThing.g:821:2: rule__ModelBridge__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelBridge__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group__6"


    // $ANTLR start "rule__ModelBridge__Group__6__Impl"
    // InternalThing.g:827:1: rule__ModelBridge__Group__6__Impl : ( ( rule__ModelBridge__Group_6__0 )? ) ;
    public final void rule__ModelBridge__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:831:1: ( ( ( rule__ModelBridge__Group_6__0 )? ) )
            // InternalThing.g:832:1: ( ( rule__ModelBridge__Group_6__0 )? )
            {
            // InternalThing.g:832:1: ( ( rule__ModelBridge__Group_6__0 )? )
            // InternalThing.g:833:2: ( rule__ModelBridge__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelBridgeAccess().getGroup_6()); 
            }
            // InternalThing.g:834:2: ( rule__ModelBridge__Group_6__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalThing.g:834:3: rule__ModelBridge__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ModelBridge__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelBridgeAccess().getGroup_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group__6__Impl"


    // $ANTLR start "rule__ModelBridge__Group_2_1__0"
    // InternalThing.g:843:1: rule__ModelBridge__Group_2_1__0 : rule__ModelBridge__Group_2_1__0__Impl rule__ModelBridge__Group_2_1__1 ;
    public final void rule__ModelBridge__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:847:1: ( rule__ModelBridge__Group_2_1__0__Impl rule__ModelBridge__Group_2_1__1 )
            // InternalThing.g:848:2: rule__ModelBridge__Group_2_1__0__Impl rule__ModelBridge__Group_2_1__1
            {
            pushFollow(FOLLOW_5);
            rule__ModelBridge__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelBridge__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group_2_1__0"


    // $ANTLR start "rule__ModelBridge__Group_2_1__0__Impl"
    // InternalThing.g:855:1: rule__ModelBridge__Group_2_1__0__Impl : ( ( rule__ModelBridge__ThingTypeIdAssignment_2_1_0 ) ) ;
    public final void rule__ModelBridge__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:859:1: ( ( ( rule__ModelBridge__ThingTypeIdAssignment_2_1_0 ) ) )
            // InternalThing.g:860:1: ( ( rule__ModelBridge__ThingTypeIdAssignment_2_1_0 ) )
            {
            // InternalThing.g:860:1: ( ( rule__ModelBridge__ThingTypeIdAssignment_2_1_0 ) )
            // InternalThing.g:861:2: ( rule__ModelBridge__ThingTypeIdAssignment_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelBridgeAccess().getThingTypeIdAssignment_2_1_0()); 
            }
            // InternalThing.g:862:2: ( rule__ModelBridge__ThingTypeIdAssignment_2_1_0 )
            // InternalThing.g:862:3: rule__ModelBridge__ThingTypeIdAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ModelBridge__ThingTypeIdAssignment_2_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelBridgeAccess().getThingTypeIdAssignment_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group_2_1__0__Impl"


    // $ANTLR start "rule__ModelBridge__Group_2_1__1"
    // InternalThing.g:870:1: rule__ModelBridge__Group_2_1__1 : rule__ModelBridge__Group_2_1__1__Impl ;
    public final void rule__ModelBridge__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:874:1: ( rule__ModelBridge__Group_2_1__1__Impl )
            // InternalThing.g:875:2: rule__ModelBridge__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelBridge__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group_2_1__1"


    // $ANTLR start "rule__ModelBridge__Group_2_1__1__Impl"
    // InternalThing.g:881:1: rule__ModelBridge__Group_2_1__1__Impl : ( ( rule__ModelBridge__ThingIdAssignment_2_1_1 ) ) ;
    public final void rule__ModelBridge__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:885:1: ( ( ( rule__ModelBridge__ThingIdAssignment_2_1_1 ) ) )
            // InternalThing.g:886:1: ( ( rule__ModelBridge__ThingIdAssignment_2_1_1 ) )
            {
            // InternalThing.g:886:1: ( ( rule__ModelBridge__ThingIdAssignment_2_1_1 ) )
            // InternalThing.g:887:2: ( rule__ModelBridge__ThingIdAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelBridgeAccess().getThingIdAssignment_2_1_1()); 
            }
            // InternalThing.g:888:2: ( rule__ModelBridge__ThingIdAssignment_2_1_1 )
            // InternalThing.g:888:3: rule__ModelBridge__ThingIdAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ModelBridge__ThingIdAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelBridgeAccess().getThingIdAssignment_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group_2_1__1__Impl"


    // $ANTLR start "rule__ModelBridge__Group_4__0"
    // InternalThing.g:897:1: rule__ModelBridge__Group_4__0 : rule__ModelBridge__Group_4__0__Impl rule__ModelBridge__Group_4__1 ;
    public final void rule__ModelBridge__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:901:1: ( rule__ModelBridge__Group_4__0__Impl rule__ModelBridge__Group_4__1 )
            // InternalThing.g:902:2: rule__ModelBridge__Group_4__0__Impl rule__ModelBridge__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__ModelBridge__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelBridge__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group_4__0"


    // $ANTLR start "rule__ModelBridge__Group_4__0__Impl"
    // InternalThing.g:909:1: rule__ModelBridge__Group_4__0__Impl : ( '@' ) ;
    public final void rule__ModelBridge__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:913:1: ( ( '@' ) )
            // InternalThing.g:914:1: ( '@' )
            {
            // InternalThing.g:914:1: ( '@' )
            // InternalThing.g:915:2: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelBridgeAccess().getCommercialAtKeyword_4_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelBridgeAccess().getCommercialAtKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group_4__0__Impl"


    // $ANTLR start "rule__ModelBridge__Group_4__1"
    // InternalThing.g:924:1: rule__ModelBridge__Group_4__1 : rule__ModelBridge__Group_4__1__Impl ;
    public final void rule__ModelBridge__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:928:1: ( rule__ModelBridge__Group_4__1__Impl )
            // InternalThing.g:929:2: rule__ModelBridge__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelBridge__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group_4__1"


    // $ANTLR start "rule__ModelBridge__Group_4__1__Impl"
    // InternalThing.g:935:1: rule__ModelBridge__Group_4__1__Impl : ( ( rule__ModelBridge__LocationAssignment_4_1 ) ) ;
    public final void rule__ModelBridge__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:939:1: ( ( ( rule__ModelBridge__LocationAssignment_4_1 ) ) )
            // InternalThing.g:940:1: ( ( rule__ModelBridge__LocationAssignment_4_1 ) )
            {
            // InternalThing.g:940:1: ( ( rule__ModelBridge__LocationAssignment_4_1 ) )
            // InternalThing.g:941:2: ( rule__ModelBridge__LocationAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelBridgeAccess().getLocationAssignment_4_1()); 
            }
            // InternalThing.g:942:2: ( rule__ModelBridge__LocationAssignment_4_1 )
            // InternalThing.g:942:3: rule__ModelBridge__LocationAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ModelBridge__LocationAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelBridgeAccess().getLocationAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group_4__1__Impl"


    // $ANTLR start "rule__ModelBridge__Group_5__0"
    // InternalThing.g:951:1: rule__ModelBridge__Group_5__0 : rule__ModelBridge__Group_5__0__Impl rule__ModelBridge__Group_5__1 ;
    public final void rule__ModelBridge__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:955:1: ( rule__ModelBridge__Group_5__0__Impl rule__ModelBridge__Group_5__1 )
            // InternalThing.g:956:2: rule__ModelBridge__Group_5__0__Impl rule__ModelBridge__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__ModelBridge__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelBridge__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group_5__0"


    // $ANTLR start "rule__ModelBridge__Group_5__0__Impl"
    // InternalThing.g:963:1: rule__ModelBridge__Group_5__0__Impl : ( '[' ) ;
    public final void rule__ModelBridge__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:967:1: ( ( '[' ) )
            // InternalThing.g:968:1: ( '[' )
            {
            // InternalThing.g:968:1: ( '[' )
            // InternalThing.g:969:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelBridgeAccess().getLeftSquareBracketKeyword_5_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelBridgeAccess().getLeftSquareBracketKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group_5__0__Impl"


    // $ANTLR start "rule__ModelBridge__Group_5__1"
    // InternalThing.g:978:1: rule__ModelBridge__Group_5__1 : rule__ModelBridge__Group_5__1__Impl rule__ModelBridge__Group_5__2 ;
    public final void rule__ModelBridge__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:982:1: ( rule__ModelBridge__Group_5__1__Impl rule__ModelBridge__Group_5__2 )
            // InternalThing.g:983:2: rule__ModelBridge__Group_5__1__Impl rule__ModelBridge__Group_5__2
            {
            pushFollow(FOLLOW_8);
            rule__ModelBridge__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelBridge__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group_5__1"


    // $ANTLR start "rule__ModelBridge__Group_5__1__Impl"
    // InternalThing.g:990:1: rule__ModelBridge__Group_5__1__Impl : ( ( rule__ModelBridge__PropertiesAssignment_5_1 )? ) ;
    public final void rule__ModelBridge__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:994:1: ( ( ( rule__ModelBridge__PropertiesAssignment_5_1 )? ) )
            // InternalThing.g:995:1: ( ( rule__ModelBridge__PropertiesAssignment_5_1 )? )
            {
            // InternalThing.g:995:1: ( ( rule__ModelBridge__PropertiesAssignment_5_1 )? )
            // InternalThing.g:996:2: ( rule__ModelBridge__PropertiesAssignment_5_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelBridgeAccess().getPropertiesAssignment_5_1()); 
            }
            // InternalThing.g:997:2: ( rule__ModelBridge__PropertiesAssignment_5_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalThing.g:997:3: rule__ModelBridge__PropertiesAssignment_5_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ModelBridge__PropertiesAssignment_5_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelBridgeAccess().getPropertiesAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group_5__1__Impl"


    // $ANTLR start "rule__ModelBridge__Group_5__2"
    // InternalThing.g:1005:1: rule__ModelBridge__Group_5__2 : rule__ModelBridge__Group_5__2__Impl rule__ModelBridge__Group_5__3 ;
    public final void rule__ModelBridge__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1009:1: ( rule__ModelBridge__Group_5__2__Impl rule__ModelBridge__Group_5__3 )
            // InternalThing.g:1010:2: rule__ModelBridge__Group_5__2__Impl rule__ModelBridge__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__ModelBridge__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelBridge__Group_5__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group_5__2"


    // $ANTLR start "rule__ModelBridge__Group_5__2__Impl"
    // InternalThing.g:1017:1: rule__ModelBridge__Group_5__2__Impl : ( ( rule__ModelBridge__Group_5_2__0 )* ) ;
    public final void rule__ModelBridge__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1021:1: ( ( ( rule__ModelBridge__Group_5_2__0 )* ) )
            // InternalThing.g:1022:1: ( ( rule__ModelBridge__Group_5_2__0 )* )
            {
            // InternalThing.g:1022:1: ( ( rule__ModelBridge__Group_5_2__0 )* )
            // InternalThing.g:1023:2: ( rule__ModelBridge__Group_5_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelBridgeAccess().getGroup_5_2()); 
            }
            // InternalThing.g:1024:2: ( rule__ModelBridge__Group_5_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==29) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalThing.g:1024:3: rule__ModelBridge__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ModelBridge__Group_5_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelBridgeAccess().getGroup_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group_5__2__Impl"


    // $ANTLR start "rule__ModelBridge__Group_5__3"
    // InternalThing.g:1032:1: rule__ModelBridge__Group_5__3 : rule__ModelBridge__Group_5__3__Impl ;
    public final void rule__ModelBridge__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1036:1: ( rule__ModelBridge__Group_5__3__Impl )
            // InternalThing.g:1037:2: rule__ModelBridge__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelBridge__Group_5__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group_5__3"


    // $ANTLR start "rule__ModelBridge__Group_5__3__Impl"
    // InternalThing.g:1043:1: rule__ModelBridge__Group_5__3__Impl : ( ']' ) ;
    public final void rule__ModelBridge__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1047:1: ( ( ']' ) )
            // InternalThing.g:1048:1: ( ']' )
            {
            // InternalThing.g:1048:1: ( ']' )
            // InternalThing.g:1049:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelBridgeAccess().getRightSquareBracketKeyword_5_3()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelBridgeAccess().getRightSquareBracketKeyword_5_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group_5__3__Impl"


    // $ANTLR start "rule__ModelBridge__Group_5_2__0"
    // InternalThing.g:1059:1: rule__ModelBridge__Group_5_2__0 : rule__ModelBridge__Group_5_2__0__Impl rule__ModelBridge__Group_5_2__1 ;
    public final void rule__ModelBridge__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1063:1: ( rule__ModelBridge__Group_5_2__0__Impl rule__ModelBridge__Group_5_2__1 )
            // InternalThing.g:1064:2: rule__ModelBridge__Group_5_2__0__Impl rule__ModelBridge__Group_5_2__1
            {
            pushFollow(FOLLOW_5);
            rule__ModelBridge__Group_5_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelBridge__Group_5_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group_5_2__0"


    // $ANTLR start "rule__ModelBridge__Group_5_2__0__Impl"
    // InternalThing.g:1071:1: rule__ModelBridge__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__ModelBridge__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1075:1: ( ( ',' ) )
            // InternalThing.g:1076:1: ( ',' )
            {
            // InternalThing.g:1076:1: ( ',' )
            // InternalThing.g:1077:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelBridgeAccess().getCommaKeyword_5_2_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelBridgeAccess().getCommaKeyword_5_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group_5_2__0__Impl"


    // $ANTLR start "rule__ModelBridge__Group_5_2__1"
    // InternalThing.g:1086:1: rule__ModelBridge__Group_5_2__1 : rule__ModelBridge__Group_5_2__1__Impl ;
    public final void rule__ModelBridge__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1090:1: ( rule__ModelBridge__Group_5_2__1__Impl )
            // InternalThing.g:1091:2: rule__ModelBridge__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelBridge__Group_5_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group_5_2__1"


    // $ANTLR start "rule__ModelBridge__Group_5_2__1__Impl"
    // InternalThing.g:1097:1: rule__ModelBridge__Group_5_2__1__Impl : ( ( rule__ModelBridge__PropertiesAssignment_5_2_1 ) ) ;
    public final void rule__ModelBridge__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1101:1: ( ( ( rule__ModelBridge__PropertiesAssignment_5_2_1 ) ) )
            // InternalThing.g:1102:1: ( ( rule__ModelBridge__PropertiesAssignment_5_2_1 ) )
            {
            // InternalThing.g:1102:1: ( ( rule__ModelBridge__PropertiesAssignment_5_2_1 ) )
            // InternalThing.g:1103:2: ( rule__ModelBridge__PropertiesAssignment_5_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelBridgeAccess().getPropertiesAssignment_5_2_1()); 
            }
            // InternalThing.g:1104:2: ( rule__ModelBridge__PropertiesAssignment_5_2_1 )
            // InternalThing.g:1104:3: rule__ModelBridge__PropertiesAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ModelBridge__PropertiesAssignment_5_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelBridgeAccess().getPropertiesAssignment_5_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group_5_2__1__Impl"


    // $ANTLR start "rule__ModelBridge__Group_6__0"
    // InternalThing.g:1113:1: rule__ModelBridge__Group_6__0 : rule__ModelBridge__Group_6__0__Impl rule__ModelBridge__Group_6__1 ;
    public final void rule__ModelBridge__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1117:1: ( rule__ModelBridge__Group_6__0__Impl rule__ModelBridge__Group_6__1 )
            // InternalThing.g:1118:2: rule__ModelBridge__Group_6__0__Impl rule__ModelBridge__Group_6__1
            {
            pushFollow(FOLLOW_10);
            rule__ModelBridge__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelBridge__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group_6__0"


    // $ANTLR start "rule__ModelBridge__Group_6__0__Impl"
    // InternalThing.g:1125:1: rule__ModelBridge__Group_6__0__Impl : ( '{' ) ;
    public final void rule__ModelBridge__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1129:1: ( ( '{' ) )
            // InternalThing.g:1130:1: ( '{' )
            {
            // InternalThing.g:1130:1: ( '{' )
            // InternalThing.g:1131:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelBridgeAccess().getLeftCurlyBracketKeyword_6_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelBridgeAccess().getLeftCurlyBracketKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group_6__0__Impl"


    // $ANTLR start "rule__ModelBridge__Group_6__1"
    // InternalThing.g:1140:1: rule__ModelBridge__Group_6__1 : rule__ModelBridge__Group_6__1__Impl rule__ModelBridge__Group_6__2 ;
    public final void rule__ModelBridge__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1144:1: ( rule__ModelBridge__Group_6__1__Impl rule__ModelBridge__Group_6__2 )
            // InternalThing.g:1145:2: rule__ModelBridge__Group_6__1__Impl rule__ModelBridge__Group_6__2
            {
            pushFollow(FOLLOW_10);
            rule__ModelBridge__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelBridge__Group_6__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group_6__1"


    // $ANTLR start "rule__ModelBridge__Group_6__1__Impl"
    // InternalThing.g:1152:1: rule__ModelBridge__Group_6__1__Impl : ( ( 'Things:' )? ) ;
    public final void rule__ModelBridge__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1156:1: ( ( ( 'Things:' )? ) )
            // InternalThing.g:1157:1: ( ( 'Things:' )? )
            {
            // InternalThing.g:1157:1: ( ( 'Things:' )? )
            // InternalThing.g:1158:2: ( 'Things:' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelBridgeAccess().getThingsKeyword_6_1()); 
            }
            // InternalThing.g:1159:2: ( 'Things:' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalThing.g:1159:3: 'Things:'
                    {
                    match(input,31,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelBridgeAccess().getThingsKeyword_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group_6__1__Impl"


    // $ANTLR start "rule__ModelBridge__Group_6__2"
    // InternalThing.g:1167:1: rule__ModelBridge__Group_6__2 : rule__ModelBridge__Group_6__2__Impl rule__ModelBridge__Group_6__3 ;
    public final void rule__ModelBridge__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1171:1: ( rule__ModelBridge__Group_6__2__Impl rule__ModelBridge__Group_6__3 )
            // InternalThing.g:1172:2: rule__ModelBridge__Group_6__2__Impl rule__ModelBridge__Group_6__3
            {
            pushFollow(FOLLOW_10);
            rule__ModelBridge__Group_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelBridge__Group_6__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group_6__2"


    // $ANTLR start "rule__ModelBridge__Group_6__2__Impl"
    // InternalThing.g:1179:1: rule__ModelBridge__Group_6__2__Impl : ( ( rule__ModelBridge__ThingsAssignment_6_2 )* ) ;
    public final void rule__ModelBridge__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1183:1: ( ( ( rule__ModelBridge__ThingsAssignment_6_2 )* ) )
            // InternalThing.g:1184:1: ( ( rule__ModelBridge__ThingsAssignment_6_2 )* )
            {
            // InternalThing.g:1184:1: ( ( rule__ModelBridge__ThingsAssignment_6_2 )* )
            // InternalThing.g:1185:2: ( rule__ModelBridge__ThingsAssignment_6_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelBridgeAccess().getThingsAssignment_6_2()); 
            }
            // InternalThing.g:1186:2: ( rule__ModelBridge__ThingsAssignment_6_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||LA19_0==34||LA19_0==44) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalThing.g:1186:3: rule__ModelBridge__ThingsAssignment_6_2
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__ModelBridge__ThingsAssignment_6_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelBridgeAccess().getThingsAssignment_6_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group_6__2__Impl"


    // $ANTLR start "rule__ModelBridge__Group_6__3"
    // InternalThing.g:1194:1: rule__ModelBridge__Group_6__3 : rule__ModelBridge__Group_6__3__Impl rule__ModelBridge__Group_6__4 ;
    public final void rule__ModelBridge__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1198:1: ( rule__ModelBridge__Group_6__3__Impl rule__ModelBridge__Group_6__4 )
            // InternalThing.g:1199:2: rule__ModelBridge__Group_6__3__Impl rule__ModelBridge__Group_6__4
            {
            pushFollow(FOLLOW_10);
            rule__ModelBridge__Group_6__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelBridge__Group_6__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group_6__3"


    // $ANTLR start "rule__ModelBridge__Group_6__3__Impl"
    // InternalThing.g:1206:1: rule__ModelBridge__Group_6__3__Impl : ( ( 'Channels:' )? ) ;
    public final void rule__ModelBridge__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1210:1: ( ( ( 'Channels:' )? ) )
            // InternalThing.g:1211:1: ( ( 'Channels:' )? )
            {
            // InternalThing.g:1211:1: ( ( 'Channels:' )? )
            // InternalThing.g:1212:2: ( 'Channels:' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelBridgeAccess().getChannelsKeyword_6_3()); 
            }
            // InternalThing.g:1213:2: ( 'Channels:' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalThing.g:1213:3: 'Channels:'
                    {
                    match(input,32,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelBridgeAccess().getChannelsKeyword_6_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group_6__3__Impl"


    // $ANTLR start "rule__ModelBridge__Group_6__4"
    // InternalThing.g:1221:1: rule__ModelBridge__Group_6__4 : rule__ModelBridge__Group_6__4__Impl rule__ModelBridge__Group_6__5 ;
    public final void rule__ModelBridge__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1225:1: ( rule__ModelBridge__Group_6__4__Impl rule__ModelBridge__Group_6__5 )
            // InternalThing.g:1226:2: rule__ModelBridge__Group_6__4__Impl rule__ModelBridge__Group_6__5
            {
            pushFollow(FOLLOW_10);
            rule__ModelBridge__Group_6__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelBridge__Group_6__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group_6__4"


    // $ANTLR start "rule__ModelBridge__Group_6__4__Impl"
    // InternalThing.g:1233:1: rule__ModelBridge__Group_6__4__Impl : ( ( rule__ModelBridge__ChannelsAssignment_6_4 )* ) ;
    public final void rule__ModelBridge__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1237:1: ( ( ( rule__ModelBridge__ChannelsAssignment_6_4 )* ) )
            // InternalThing.g:1238:1: ( ( rule__ModelBridge__ChannelsAssignment_6_4 )* )
            {
            // InternalThing.g:1238:1: ( ( rule__ModelBridge__ChannelsAssignment_6_4 )* )
            // InternalThing.g:1239:2: ( rule__ModelBridge__ChannelsAssignment_6_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelBridgeAccess().getChannelsAssignment_6_4()); 
            }
            // InternalThing.g:1240:2: ( rule__ModelBridge__ChannelsAssignment_6_4 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=10 && LA21_0<=23)||(LA21_0>=38 && LA21_0<=39)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalThing.g:1240:3: rule__ModelBridge__ChannelsAssignment_6_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ModelBridge__ChannelsAssignment_6_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelBridgeAccess().getChannelsAssignment_6_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group_6__4__Impl"


    // $ANTLR start "rule__ModelBridge__Group_6__5"
    // InternalThing.g:1248:1: rule__ModelBridge__Group_6__5 : rule__ModelBridge__Group_6__5__Impl ;
    public final void rule__ModelBridge__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1252:1: ( rule__ModelBridge__Group_6__5__Impl )
            // InternalThing.g:1253:2: rule__ModelBridge__Group_6__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelBridge__Group_6__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group_6__5"


    // $ANTLR start "rule__ModelBridge__Group_6__5__Impl"
    // InternalThing.g:1259:1: rule__ModelBridge__Group_6__5__Impl : ( '}' ) ;
    public final void rule__ModelBridge__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1263:1: ( ( '}' ) )
            // InternalThing.g:1264:1: ( '}' )
            {
            // InternalThing.g:1264:1: ( '}' )
            // InternalThing.g:1265:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelBridgeAccess().getRightCurlyBracketKeyword_6_5()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelBridgeAccess().getRightCurlyBracketKeyword_6_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__Group_6__5__Impl"


    // $ANTLR start "rule__ModelThing__Group__0"
    // InternalThing.g:1275:1: rule__ModelThing__Group__0 : rule__ModelThing__Group__0__Impl rule__ModelThing__Group__1 ;
    public final void rule__ModelThing__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1279:1: ( rule__ModelThing__Group__0__Impl rule__ModelThing__Group__1 )
            // InternalThing.g:1280:2: rule__ModelThing__Group__0__Impl rule__ModelThing__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__ModelThing__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelThing__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group__0"


    // $ANTLR start "rule__ModelThing__Group__0__Impl"
    // InternalThing.g:1287:1: rule__ModelThing__Group__0__Impl : ( ( 'Thing' )? ) ;
    public final void rule__ModelThing__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1291:1: ( ( ( 'Thing' )? ) )
            // InternalThing.g:1292:1: ( ( 'Thing' )? )
            {
            // InternalThing.g:1292:1: ( ( 'Thing' )? )
            // InternalThing.g:1293:2: ( 'Thing' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelThingAccess().getThingKeyword_0()); 
            }
            // InternalThing.g:1294:2: ( 'Thing' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==34) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalThing.g:1294:3: 'Thing'
                    {
                    match(input,34,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelThingAccess().getThingKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group__0__Impl"


    // $ANTLR start "rule__ModelThing__Group__1"
    // InternalThing.g:1302:1: rule__ModelThing__Group__1 : rule__ModelThing__Group__1__Impl rule__ModelThing__Group__2 ;
    public final void rule__ModelThing__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1306:1: ( rule__ModelThing__Group__1__Impl rule__ModelThing__Group__2 )
            // InternalThing.g:1307:2: rule__ModelThing__Group__1__Impl rule__ModelThing__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__ModelThing__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelThing__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group__1"


    // $ANTLR start "rule__ModelThing__Group__1__Impl"
    // InternalThing.g:1314:1: rule__ModelThing__Group__1__Impl : ( ( rule__ModelThing__Alternatives_1 ) ) ;
    public final void rule__ModelThing__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1318:1: ( ( ( rule__ModelThing__Alternatives_1 ) ) )
            // InternalThing.g:1319:1: ( ( rule__ModelThing__Alternatives_1 ) )
            {
            // InternalThing.g:1319:1: ( ( rule__ModelThing__Alternatives_1 ) )
            // InternalThing.g:1320:2: ( rule__ModelThing__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelThingAccess().getAlternatives_1()); 
            }
            // InternalThing.g:1321:2: ( rule__ModelThing__Alternatives_1 )
            // InternalThing.g:1321:3: rule__ModelThing__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__ModelThing__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelThingAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group__1__Impl"


    // $ANTLR start "rule__ModelThing__Group__2"
    // InternalThing.g:1329:1: rule__ModelThing__Group__2 : rule__ModelThing__Group__2__Impl rule__ModelThing__Group__3 ;
    public final void rule__ModelThing__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1333:1: ( rule__ModelThing__Group__2__Impl rule__ModelThing__Group__3 )
            // InternalThing.g:1334:2: rule__ModelThing__Group__2__Impl rule__ModelThing__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__ModelThing__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelThing__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group__2"


    // $ANTLR start "rule__ModelThing__Group__2__Impl"
    // InternalThing.g:1341:1: rule__ModelThing__Group__2__Impl : ( ( rule__ModelThing__LabelAssignment_2 )? ) ;
    public final void rule__ModelThing__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1345:1: ( ( ( rule__ModelThing__LabelAssignment_2 )? ) )
            // InternalThing.g:1346:1: ( ( rule__ModelThing__LabelAssignment_2 )? )
            {
            // InternalThing.g:1346:1: ( ( rule__ModelThing__LabelAssignment_2 )? )
            // InternalThing.g:1347:2: ( rule__ModelThing__LabelAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelThingAccess().getLabelAssignment_2()); 
            }
            // InternalThing.g:1348:2: ( rule__ModelThing__LabelAssignment_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalThing.g:1348:3: rule__ModelThing__LabelAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ModelThing__LabelAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelThingAccess().getLabelAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group__2__Impl"


    // $ANTLR start "rule__ModelThing__Group__3"
    // InternalThing.g:1356:1: rule__ModelThing__Group__3 : rule__ModelThing__Group__3__Impl rule__ModelThing__Group__4 ;
    public final void rule__ModelThing__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1360:1: ( rule__ModelThing__Group__3__Impl rule__ModelThing__Group__4 )
            // InternalThing.g:1361:2: rule__ModelThing__Group__3__Impl rule__ModelThing__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__ModelThing__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelThing__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group__3"


    // $ANTLR start "rule__ModelThing__Group__3__Impl"
    // InternalThing.g:1368:1: rule__ModelThing__Group__3__Impl : ( ( rule__ModelThing__Group_3__0 )? ) ;
    public final void rule__ModelThing__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1372:1: ( ( ( rule__ModelThing__Group_3__0 )? ) )
            // InternalThing.g:1373:1: ( ( rule__ModelThing__Group_3__0 )? )
            {
            // InternalThing.g:1373:1: ( ( rule__ModelThing__Group_3__0 )? )
            // InternalThing.g:1374:2: ( rule__ModelThing__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelThingAccess().getGroup_3()); 
            }
            // InternalThing.g:1375:2: ( rule__ModelThing__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalThing.g:1375:3: rule__ModelThing__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ModelThing__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelThingAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group__3__Impl"


    // $ANTLR start "rule__ModelThing__Group__4"
    // InternalThing.g:1383:1: rule__ModelThing__Group__4 : rule__ModelThing__Group__4__Impl rule__ModelThing__Group__5 ;
    public final void rule__ModelThing__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1387:1: ( rule__ModelThing__Group__4__Impl rule__ModelThing__Group__5 )
            // InternalThing.g:1388:2: rule__ModelThing__Group__4__Impl rule__ModelThing__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__ModelThing__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelThing__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group__4"


    // $ANTLR start "rule__ModelThing__Group__4__Impl"
    // InternalThing.g:1395:1: rule__ModelThing__Group__4__Impl : ( ( rule__ModelThing__Group_4__0 )? ) ;
    public final void rule__ModelThing__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1399:1: ( ( ( rule__ModelThing__Group_4__0 )? ) )
            // InternalThing.g:1400:1: ( ( rule__ModelThing__Group_4__0 )? )
            {
            // InternalThing.g:1400:1: ( ( rule__ModelThing__Group_4__0 )? )
            // InternalThing.g:1401:2: ( rule__ModelThing__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelThingAccess().getGroup_4()); 
            }
            // InternalThing.g:1402:2: ( rule__ModelThing__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==26) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalThing.g:1402:3: rule__ModelThing__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ModelThing__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelThingAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group__4__Impl"


    // $ANTLR start "rule__ModelThing__Group__5"
    // InternalThing.g:1410:1: rule__ModelThing__Group__5 : rule__ModelThing__Group__5__Impl rule__ModelThing__Group__6 ;
    public final void rule__ModelThing__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1414:1: ( rule__ModelThing__Group__5__Impl rule__ModelThing__Group__6 )
            // InternalThing.g:1415:2: rule__ModelThing__Group__5__Impl rule__ModelThing__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__ModelThing__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelThing__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group__5"


    // $ANTLR start "rule__ModelThing__Group__5__Impl"
    // InternalThing.g:1422:1: rule__ModelThing__Group__5__Impl : ( ( rule__ModelThing__Group_5__0 )? ) ;
    public final void rule__ModelThing__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1426:1: ( ( ( rule__ModelThing__Group_5__0 )? ) )
            // InternalThing.g:1427:1: ( ( rule__ModelThing__Group_5__0 )? )
            {
            // InternalThing.g:1427:1: ( ( rule__ModelThing__Group_5__0 )? )
            // InternalThing.g:1428:2: ( rule__ModelThing__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelThingAccess().getGroup_5()); 
            }
            // InternalThing.g:1429:2: ( rule__ModelThing__Group_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==27) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalThing.g:1429:3: rule__ModelThing__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ModelThing__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelThingAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group__5__Impl"


    // $ANTLR start "rule__ModelThing__Group__6"
    // InternalThing.g:1437:1: rule__ModelThing__Group__6 : rule__ModelThing__Group__6__Impl ;
    public final void rule__ModelThing__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1441:1: ( rule__ModelThing__Group__6__Impl )
            // InternalThing.g:1442:2: rule__ModelThing__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelThing__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group__6"


    // $ANTLR start "rule__ModelThing__Group__6__Impl"
    // InternalThing.g:1448:1: rule__ModelThing__Group__6__Impl : ( ( rule__ModelThing__Group_6__0 )? ) ;
    public final void rule__ModelThing__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1452:1: ( ( ( rule__ModelThing__Group_6__0 )? ) )
            // InternalThing.g:1453:1: ( ( rule__ModelThing__Group_6__0 )? )
            {
            // InternalThing.g:1453:1: ( ( rule__ModelThing__Group_6__0 )? )
            // InternalThing.g:1454:2: ( rule__ModelThing__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelThingAccess().getGroup_6()); 
            }
            // InternalThing.g:1455:2: ( rule__ModelThing__Group_6__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==30) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalThing.g:1455:3: rule__ModelThing__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ModelThing__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelThingAccess().getGroup_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group__6__Impl"


    // $ANTLR start "rule__ModelThing__Group_1_1__0"
    // InternalThing.g:1464:1: rule__ModelThing__Group_1_1__0 : rule__ModelThing__Group_1_1__0__Impl rule__ModelThing__Group_1_1__1 ;
    public final void rule__ModelThing__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1468:1: ( rule__ModelThing__Group_1_1__0__Impl rule__ModelThing__Group_1_1__1 )
            // InternalThing.g:1469:2: rule__ModelThing__Group_1_1__0__Impl rule__ModelThing__Group_1_1__1
            {
            pushFollow(FOLLOW_5);
            rule__ModelThing__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelThing__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group_1_1__0"


    // $ANTLR start "rule__ModelThing__Group_1_1__0__Impl"
    // InternalThing.g:1476:1: rule__ModelThing__Group_1_1__0__Impl : ( ( rule__ModelThing__ThingTypeIdAssignment_1_1_0 ) ) ;
    public final void rule__ModelThing__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1480:1: ( ( ( rule__ModelThing__ThingTypeIdAssignment_1_1_0 ) ) )
            // InternalThing.g:1481:1: ( ( rule__ModelThing__ThingTypeIdAssignment_1_1_0 ) )
            {
            // InternalThing.g:1481:1: ( ( rule__ModelThing__ThingTypeIdAssignment_1_1_0 ) )
            // InternalThing.g:1482:2: ( rule__ModelThing__ThingTypeIdAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelThingAccess().getThingTypeIdAssignment_1_1_0()); 
            }
            // InternalThing.g:1483:2: ( rule__ModelThing__ThingTypeIdAssignment_1_1_0 )
            // InternalThing.g:1483:3: rule__ModelThing__ThingTypeIdAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ModelThing__ThingTypeIdAssignment_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelThingAccess().getThingTypeIdAssignment_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group_1_1__0__Impl"


    // $ANTLR start "rule__ModelThing__Group_1_1__1"
    // InternalThing.g:1491:1: rule__ModelThing__Group_1_1__1 : rule__ModelThing__Group_1_1__1__Impl ;
    public final void rule__ModelThing__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1495:1: ( rule__ModelThing__Group_1_1__1__Impl )
            // InternalThing.g:1496:2: rule__ModelThing__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelThing__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group_1_1__1"


    // $ANTLR start "rule__ModelThing__Group_1_1__1__Impl"
    // InternalThing.g:1502:1: rule__ModelThing__Group_1_1__1__Impl : ( ( rule__ModelThing__ThingIdAssignment_1_1_1 ) ) ;
    public final void rule__ModelThing__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1506:1: ( ( ( rule__ModelThing__ThingIdAssignment_1_1_1 ) ) )
            // InternalThing.g:1507:1: ( ( rule__ModelThing__ThingIdAssignment_1_1_1 ) )
            {
            // InternalThing.g:1507:1: ( ( rule__ModelThing__ThingIdAssignment_1_1_1 ) )
            // InternalThing.g:1508:2: ( rule__ModelThing__ThingIdAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelThingAccess().getThingIdAssignment_1_1_1()); 
            }
            // InternalThing.g:1509:2: ( rule__ModelThing__ThingIdAssignment_1_1_1 )
            // InternalThing.g:1509:3: rule__ModelThing__ThingIdAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ModelThing__ThingIdAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelThingAccess().getThingIdAssignment_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group_1_1__1__Impl"


    // $ANTLR start "rule__ModelThing__Group_3__0"
    // InternalThing.g:1518:1: rule__ModelThing__Group_3__0 : rule__ModelThing__Group_3__0__Impl rule__ModelThing__Group_3__1 ;
    public final void rule__ModelThing__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1522:1: ( rule__ModelThing__Group_3__0__Impl rule__ModelThing__Group_3__1 )
            // InternalThing.g:1523:2: rule__ModelThing__Group_3__0__Impl rule__ModelThing__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__ModelThing__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelThing__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group_3__0"


    // $ANTLR start "rule__ModelThing__Group_3__0__Impl"
    // InternalThing.g:1530:1: rule__ModelThing__Group_3__0__Impl : ( '(' ) ;
    public final void rule__ModelThing__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1534:1: ( ( '(' ) )
            // InternalThing.g:1535:1: ( '(' )
            {
            // InternalThing.g:1535:1: ( '(' )
            // InternalThing.g:1536:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelThingAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelThingAccess().getLeftParenthesisKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group_3__0__Impl"


    // $ANTLR start "rule__ModelThing__Group_3__1"
    // InternalThing.g:1545:1: rule__ModelThing__Group_3__1 : rule__ModelThing__Group_3__1__Impl rule__ModelThing__Group_3__2 ;
    public final void rule__ModelThing__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1549:1: ( rule__ModelThing__Group_3__1__Impl rule__ModelThing__Group_3__2 )
            // InternalThing.g:1550:2: rule__ModelThing__Group_3__1__Impl rule__ModelThing__Group_3__2
            {
            pushFollow(FOLLOW_14);
            rule__ModelThing__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelThing__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group_3__1"


    // $ANTLR start "rule__ModelThing__Group_3__1__Impl"
    // InternalThing.g:1557:1: rule__ModelThing__Group_3__1__Impl : ( ( rule__ModelThing__BridgeUIDAssignment_3_1 ) ) ;
    public final void rule__ModelThing__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1561:1: ( ( ( rule__ModelThing__BridgeUIDAssignment_3_1 ) ) )
            // InternalThing.g:1562:1: ( ( rule__ModelThing__BridgeUIDAssignment_3_1 ) )
            {
            // InternalThing.g:1562:1: ( ( rule__ModelThing__BridgeUIDAssignment_3_1 ) )
            // InternalThing.g:1563:2: ( rule__ModelThing__BridgeUIDAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelThingAccess().getBridgeUIDAssignment_3_1()); 
            }
            // InternalThing.g:1564:2: ( rule__ModelThing__BridgeUIDAssignment_3_1 )
            // InternalThing.g:1564:3: rule__ModelThing__BridgeUIDAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ModelThing__BridgeUIDAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelThingAccess().getBridgeUIDAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group_3__1__Impl"


    // $ANTLR start "rule__ModelThing__Group_3__2"
    // InternalThing.g:1572:1: rule__ModelThing__Group_3__2 : rule__ModelThing__Group_3__2__Impl ;
    public final void rule__ModelThing__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1576:1: ( rule__ModelThing__Group_3__2__Impl )
            // InternalThing.g:1577:2: rule__ModelThing__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelThing__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group_3__2"


    // $ANTLR start "rule__ModelThing__Group_3__2__Impl"
    // InternalThing.g:1583:1: rule__ModelThing__Group_3__2__Impl : ( ')' ) ;
    public final void rule__ModelThing__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1587:1: ( ( ')' ) )
            // InternalThing.g:1588:1: ( ')' )
            {
            // InternalThing.g:1588:1: ( ')' )
            // InternalThing.g:1589:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelThingAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelThingAccess().getRightParenthesisKeyword_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group_3__2__Impl"


    // $ANTLR start "rule__ModelThing__Group_4__0"
    // InternalThing.g:1599:1: rule__ModelThing__Group_4__0 : rule__ModelThing__Group_4__0__Impl rule__ModelThing__Group_4__1 ;
    public final void rule__ModelThing__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1603:1: ( rule__ModelThing__Group_4__0__Impl rule__ModelThing__Group_4__1 )
            // InternalThing.g:1604:2: rule__ModelThing__Group_4__0__Impl rule__ModelThing__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__ModelThing__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelThing__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group_4__0"


    // $ANTLR start "rule__ModelThing__Group_4__0__Impl"
    // InternalThing.g:1611:1: rule__ModelThing__Group_4__0__Impl : ( '@' ) ;
    public final void rule__ModelThing__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1615:1: ( ( '@' ) )
            // InternalThing.g:1616:1: ( '@' )
            {
            // InternalThing.g:1616:1: ( '@' )
            // InternalThing.g:1617:2: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelThingAccess().getCommercialAtKeyword_4_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelThingAccess().getCommercialAtKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group_4__0__Impl"


    // $ANTLR start "rule__ModelThing__Group_4__1"
    // InternalThing.g:1626:1: rule__ModelThing__Group_4__1 : rule__ModelThing__Group_4__1__Impl ;
    public final void rule__ModelThing__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1630:1: ( rule__ModelThing__Group_4__1__Impl )
            // InternalThing.g:1631:2: rule__ModelThing__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelThing__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group_4__1"


    // $ANTLR start "rule__ModelThing__Group_4__1__Impl"
    // InternalThing.g:1637:1: rule__ModelThing__Group_4__1__Impl : ( ( rule__ModelThing__LocationAssignment_4_1 ) ) ;
    public final void rule__ModelThing__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1641:1: ( ( ( rule__ModelThing__LocationAssignment_4_1 ) ) )
            // InternalThing.g:1642:1: ( ( rule__ModelThing__LocationAssignment_4_1 ) )
            {
            // InternalThing.g:1642:1: ( ( rule__ModelThing__LocationAssignment_4_1 ) )
            // InternalThing.g:1643:2: ( rule__ModelThing__LocationAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelThingAccess().getLocationAssignment_4_1()); 
            }
            // InternalThing.g:1644:2: ( rule__ModelThing__LocationAssignment_4_1 )
            // InternalThing.g:1644:3: rule__ModelThing__LocationAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ModelThing__LocationAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelThingAccess().getLocationAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group_4__1__Impl"


    // $ANTLR start "rule__ModelThing__Group_5__0"
    // InternalThing.g:1653:1: rule__ModelThing__Group_5__0 : rule__ModelThing__Group_5__0__Impl rule__ModelThing__Group_5__1 ;
    public final void rule__ModelThing__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1657:1: ( rule__ModelThing__Group_5__0__Impl rule__ModelThing__Group_5__1 )
            // InternalThing.g:1658:2: rule__ModelThing__Group_5__0__Impl rule__ModelThing__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__ModelThing__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelThing__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group_5__0"


    // $ANTLR start "rule__ModelThing__Group_5__0__Impl"
    // InternalThing.g:1665:1: rule__ModelThing__Group_5__0__Impl : ( '[' ) ;
    public final void rule__ModelThing__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1669:1: ( ( '[' ) )
            // InternalThing.g:1670:1: ( '[' )
            {
            // InternalThing.g:1670:1: ( '[' )
            // InternalThing.g:1671:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelThingAccess().getLeftSquareBracketKeyword_5_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelThingAccess().getLeftSquareBracketKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group_5__0__Impl"


    // $ANTLR start "rule__ModelThing__Group_5__1"
    // InternalThing.g:1680:1: rule__ModelThing__Group_5__1 : rule__ModelThing__Group_5__1__Impl rule__ModelThing__Group_5__2 ;
    public final void rule__ModelThing__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1684:1: ( rule__ModelThing__Group_5__1__Impl rule__ModelThing__Group_5__2 )
            // InternalThing.g:1685:2: rule__ModelThing__Group_5__1__Impl rule__ModelThing__Group_5__2
            {
            pushFollow(FOLLOW_8);
            rule__ModelThing__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelThing__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group_5__1"


    // $ANTLR start "rule__ModelThing__Group_5__1__Impl"
    // InternalThing.g:1692:1: rule__ModelThing__Group_5__1__Impl : ( ( rule__ModelThing__PropertiesAssignment_5_1 )? ) ;
    public final void rule__ModelThing__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1696:1: ( ( ( rule__ModelThing__PropertiesAssignment_5_1 )? ) )
            // InternalThing.g:1697:1: ( ( rule__ModelThing__PropertiesAssignment_5_1 )? )
            {
            // InternalThing.g:1697:1: ( ( rule__ModelThing__PropertiesAssignment_5_1 )? )
            // InternalThing.g:1698:2: ( rule__ModelThing__PropertiesAssignment_5_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelThingAccess().getPropertiesAssignment_5_1()); 
            }
            // InternalThing.g:1699:2: ( rule__ModelThing__PropertiesAssignment_5_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalThing.g:1699:3: rule__ModelThing__PropertiesAssignment_5_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ModelThing__PropertiesAssignment_5_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelThingAccess().getPropertiesAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group_5__1__Impl"


    // $ANTLR start "rule__ModelThing__Group_5__2"
    // InternalThing.g:1707:1: rule__ModelThing__Group_5__2 : rule__ModelThing__Group_5__2__Impl rule__ModelThing__Group_5__3 ;
    public final void rule__ModelThing__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1711:1: ( rule__ModelThing__Group_5__2__Impl rule__ModelThing__Group_5__3 )
            // InternalThing.g:1712:2: rule__ModelThing__Group_5__2__Impl rule__ModelThing__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__ModelThing__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelThing__Group_5__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group_5__2"


    // $ANTLR start "rule__ModelThing__Group_5__2__Impl"
    // InternalThing.g:1719:1: rule__ModelThing__Group_5__2__Impl : ( ( rule__ModelThing__Group_5_2__0 )* ) ;
    public final void rule__ModelThing__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1723:1: ( ( ( rule__ModelThing__Group_5_2__0 )* ) )
            // InternalThing.g:1724:1: ( ( rule__ModelThing__Group_5_2__0 )* )
            {
            // InternalThing.g:1724:1: ( ( rule__ModelThing__Group_5_2__0 )* )
            // InternalThing.g:1725:2: ( rule__ModelThing__Group_5_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelThingAccess().getGroup_5_2()); 
            }
            // InternalThing.g:1726:2: ( rule__ModelThing__Group_5_2__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==29) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalThing.g:1726:3: rule__ModelThing__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ModelThing__Group_5_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelThingAccess().getGroup_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group_5__2__Impl"


    // $ANTLR start "rule__ModelThing__Group_5__3"
    // InternalThing.g:1734:1: rule__ModelThing__Group_5__3 : rule__ModelThing__Group_5__3__Impl ;
    public final void rule__ModelThing__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1738:1: ( rule__ModelThing__Group_5__3__Impl )
            // InternalThing.g:1739:2: rule__ModelThing__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelThing__Group_5__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group_5__3"


    // $ANTLR start "rule__ModelThing__Group_5__3__Impl"
    // InternalThing.g:1745:1: rule__ModelThing__Group_5__3__Impl : ( ']' ) ;
    public final void rule__ModelThing__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1749:1: ( ( ']' ) )
            // InternalThing.g:1750:1: ( ']' )
            {
            // InternalThing.g:1750:1: ( ']' )
            // InternalThing.g:1751:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelThingAccess().getRightSquareBracketKeyword_5_3()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelThingAccess().getRightSquareBracketKeyword_5_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group_5__3__Impl"


    // $ANTLR start "rule__ModelThing__Group_5_2__0"
    // InternalThing.g:1761:1: rule__ModelThing__Group_5_2__0 : rule__ModelThing__Group_5_2__0__Impl rule__ModelThing__Group_5_2__1 ;
    public final void rule__ModelThing__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1765:1: ( rule__ModelThing__Group_5_2__0__Impl rule__ModelThing__Group_5_2__1 )
            // InternalThing.g:1766:2: rule__ModelThing__Group_5_2__0__Impl rule__ModelThing__Group_5_2__1
            {
            pushFollow(FOLLOW_5);
            rule__ModelThing__Group_5_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelThing__Group_5_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group_5_2__0"


    // $ANTLR start "rule__ModelThing__Group_5_2__0__Impl"
    // InternalThing.g:1773:1: rule__ModelThing__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__ModelThing__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1777:1: ( ( ',' ) )
            // InternalThing.g:1778:1: ( ',' )
            {
            // InternalThing.g:1778:1: ( ',' )
            // InternalThing.g:1779:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelThingAccess().getCommaKeyword_5_2_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelThingAccess().getCommaKeyword_5_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group_5_2__0__Impl"


    // $ANTLR start "rule__ModelThing__Group_5_2__1"
    // InternalThing.g:1788:1: rule__ModelThing__Group_5_2__1 : rule__ModelThing__Group_5_2__1__Impl ;
    public final void rule__ModelThing__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1792:1: ( rule__ModelThing__Group_5_2__1__Impl )
            // InternalThing.g:1793:2: rule__ModelThing__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelThing__Group_5_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group_5_2__1"


    // $ANTLR start "rule__ModelThing__Group_5_2__1__Impl"
    // InternalThing.g:1799:1: rule__ModelThing__Group_5_2__1__Impl : ( ( rule__ModelThing__PropertiesAssignment_5_2_1 ) ) ;
    public final void rule__ModelThing__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1803:1: ( ( ( rule__ModelThing__PropertiesAssignment_5_2_1 ) ) )
            // InternalThing.g:1804:1: ( ( rule__ModelThing__PropertiesAssignment_5_2_1 ) )
            {
            // InternalThing.g:1804:1: ( ( rule__ModelThing__PropertiesAssignment_5_2_1 ) )
            // InternalThing.g:1805:2: ( rule__ModelThing__PropertiesAssignment_5_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelThingAccess().getPropertiesAssignment_5_2_1()); 
            }
            // InternalThing.g:1806:2: ( rule__ModelThing__PropertiesAssignment_5_2_1 )
            // InternalThing.g:1806:3: rule__ModelThing__PropertiesAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ModelThing__PropertiesAssignment_5_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelThingAccess().getPropertiesAssignment_5_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group_5_2__1__Impl"


    // $ANTLR start "rule__ModelThing__Group_6__0"
    // InternalThing.g:1815:1: rule__ModelThing__Group_6__0 : rule__ModelThing__Group_6__0__Impl rule__ModelThing__Group_6__1 ;
    public final void rule__ModelThing__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1819:1: ( rule__ModelThing__Group_6__0__Impl rule__ModelThing__Group_6__1 )
            // InternalThing.g:1820:2: rule__ModelThing__Group_6__0__Impl rule__ModelThing__Group_6__1
            {
            pushFollow(FOLLOW_15);
            rule__ModelThing__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelThing__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group_6__0"


    // $ANTLR start "rule__ModelThing__Group_6__0__Impl"
    // InternalThing.g:1827:1: rule__ModelThing__Group_6__0__Impl : ( '{' ) ;
    public final void rule__ModelThing__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1831:1: ( ( '{' ) )
            // InternalThing.g:1832:1: ( '{' )
            {
            // InternalThing.g:1832:1: ( '{' )
            // InternalThing.g:1833:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelThingAccess().getLeftCurlyBracketKeyword_6_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelThingAccess().getLeftCurlyBracketKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group_6__0__Impl"


    // $ANTLR start "rule__ModelThing__Group_6__1"
    // InternalThing.g:1842:1: rule__ModelThing__Group_6__1 : rule__ModelThing__Group_6__1__Impl rule__ModelThing__Group_6__2 ;
    public final void rule__ModelThing__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1846:1: ( rule__ModelThing__Group_6__1__Impl rule__ModelThing__Group_6__2 )
            // InternalThing.g:1847:2: rule__ModelThing__Group_6__1__Impl rule__ModelThing__Group_6__2
            {
            pushFollow(FOLLOW_15);
            rule__ModelThing__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelThing__Group_6__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group_6__1"


    // $ANTLR start "rule__ModelThing__Group_6__1__Impl"
    // InternalThing.g:1854:1: rule__ModelThing__Group_6__1__Impl : ( ( 'Channels:' )? ) ;
    public final void rule__ModelThing__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1858:1: ( ( ( 'Channels:' )? ) )
            // InternalThing.g:1859:1: ( ( 'Channels:' )? )
            {
            // InternalThing.g:1859:1: ( ( 'Channels:' )? )
            // InternalThing.g:1860:2: ( 'Channels:' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelThingAccess().getChannelsKeyword_6_1()); 
            }
            // InternalThing.g:1861:2: ( 'Channels:' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==32) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalThing.g:1861:3: 'Channels:'
                    {
                    match(input,32,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelThingAccess().getChannelsKeyword_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group_6__1__Impl"


    // $ANTLR start "rule__ModelThing__Group_6__2"
    // InternalThing.g:1869:1: rule__ModelThing__Group_6__2 : rule__ModelThing__Group_6__2__Impl rule__ModelThing__Group_6__3 ;
    public final void rule__ModelThing__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1873:1: ( rule__ModelThing__Group_6__2__Impl rule__ModelThing__Group_6__3 )
            // InternalThing.g:1874:2: rule__ModelThing__Group_6__2__Impl rule__ModelThing__Group_6__3
            {
            pushFollow(FOLLOW_15);
            rule__ModelThing__Group_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelThing__Group_6__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group_6__2"


    // $ANTLR start "rule__ModelThing__Group_6__2__Impl"
    // InternalThing.g:1881:1: rule__ModelThing__Group_6__2__Impl : ( ( rule__ModelThing__ChannelsAssignment_6_2 )* ) ;
    public final void rule__ModelThing__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1885:1: ( ( ( rule__ModelThing__ChannelsAssignment_6_2 )* ) )
            // InternalThing.g:1886:1: ( ( rule__ModelThing__ChannelsAssignment_6_2 )* )
            {
            // InternalThing.g:1886:1: ( ( rule__ModelThing__ChannelsAssignment_6_2 )* )
            // InternalThing.g:1887:2: ( rule__ModelThing__ChannelsAssignment_6_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelThingAccess().getChannelsAssignment_6_2()); 
            }
            // InternalThing.g:1888:2: ( rule__ModelThing__ChannelsAssignment_6_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=10 && LA31_0<=23)||(LA31_0>=38 && LA31_0<=39)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalThing.g:1888:3: rule__ModelThing__ChannelsAssignment_6_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ModelThing__ChannelsAssignment_6_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelThingAccess().getChannelsAssignment_6_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group_6__2__Impl"


    // $ANTLR start "rule__ModelThing__Group_6__3"
    // InternalThing.g:1896:1: rule__ModelThing__Group_6__3 : rule__ModelThing__Group_6__3__Impl ;
    public final void rule__ModelThing__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1900:1: ( rule__ModelThing__Group_6__3__Impl )
            // InternalThing.g:1901:2: rule__ModelThing__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelThing__Group_6__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group_6__3"


    // $ANTLR start "rule__ModelThing__Group_6__3__Impl"
    // InternalThing.g:1907:1: rule__ModelThing__Group_6__3__Impl : ( '}' ) ;
    public final void rule__ModelThing__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1911:1: ( ( '}' ) )
            // InternalThing.g:1912:1: ( '}' )
            {
            // InternalThing.g:1912:1: ( '}' )
            // InternalThing.g:1913:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelThingAccess().getRightCurlyBracketKeyword_6_3()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelThingAccess().getRightCurlyBracketKeyword_6_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__Group_6__3__Impl"


    // $ANTLR start "rule__ModelChannel__Group__0"
    // InternalThing.g:1923:1: rule__ModelChannel__Group__0 : rule__ModelChannel__Group__0__Impl rule__ModelChannel__Group__1 ;
    public final void rule__ModelChannel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1927:1: ( rule__ModelChannel__Group__0__Impl rule__ModelChannel__Group__1 )
            // InternalThing.g:1928:2: rule__ModelChannel__Group__0__Impl rule__ModelChannel__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__ModelChannel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelChannel__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelChannel__Group__0"


    // $ANTLR start "rule__ModelChannel__Group__0__Impl"
    // InternalThing.g:1935:1: rule__ModelChannel__Group__0__Impl : ( ( rule__ModelChannel__Alternatives_0 ) ) ;
    public final void rule__ModelChannel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1939:1: ( ( ( rule__ModelChannel__Alternatives_0 ) ) )
            // InternalThing.g:1940:1: ( ( rule__ModelChannel__Alternatives_0 ) )
            {
            // InternalThing.g:1940:1: ( ( rule__ModelChannel__Alternatives_0 ) )
            // InternalThing.g:1941:2: ( rule__ModelChannel__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelChannelAccess().getAlternatives_0()); 
            }
            // InternalThing.g:1942:2: ( rule__ModelChannel__Alternatives_0 )
            // InternalThing.g:1942:3: rule__ModelChannel__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__ModelChannel__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelChannelAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelChannel__Group__0__Impl"


    // $ANTLR start "rule__ModelChannel__Group__1"
    // InternalThing.g:1950:1: rule__ModelChannel__Group__1 : rule__ModelChannel__Group__1__Impl rule__ModelChannel__Group__2 ;
    public final void rule__ModelChannel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1954:1: ( rule__ModelChannel__Group__1__Impl rule__ModelChannel__Group__2 )
            // InternalThing.g:1955:2: rule__ModelChannel__Group__1__Impl rule__ModelChannel__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ModelChannel__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelChannel__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelChannel__Group__1"


    // $ANTLR start "rule__ModelChannel__Group__1__Impl"
    // InternalThing.g:1962:1: rule__ModelChannel__Group__1__Impl : ( ':' ) ;
    public final void rule__ModelChannel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1966:1: ( ( ':' ) )
            // InternalThing.g:1967:1: ( ':' )
            {
            // InternalThing.g:1967:1: ( ':' )
            // InternalThing.g:1968:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelChannelAccess().getColonKeyword_1()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelChannelAccess().getColonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelChannel__Group__1__Impl"


    // $ANTLR start "rule__ModelChannel__Group__2"
    // InternalThing.g:1977:1: rule__ModelChannel__Group__2 : rule__ModelChannel__Group__2__Impl rule__ModelChannel__Group__3 ;
    public final void rule__ModelChannel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1981:1: ( rule__ModelChannel__Group__2__Impl rule__ModelChannel__Group__3 )
            // InternalThing.g:1982:2: rule__ModelChannel__Group__2__Impl rule__ModelChannel__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__ModelChannel__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelChannel__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelChannel__Group__2"


    // $ANTLR start "rule__ModelChannel__Group__2__Impl"
    // InternalThing.g:1989:1: rule__ModelChannel__Group__2__Impl : ( ( rule__ModelChannel__IdAssignment_2 ) ) ;
    public final void rule__ModelChannel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:1993:1: ( ( ( rule__ModelChannel__IdAssignment_2 ) ) )
            // InternalThing.g:1994:1: ( ( rule__ModelChannel__IdAssignment_2 ) )
            {
            // InternalThing.g:1994:1: ( ( rule__ModelChannel__IdAssignment_2 ) )
            // InternalThing.g:1995:2: ( rule__ModelChannel__IdAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelChannelAccess().getIdAssignment_2()); 
            }
            // InternalThing.g:1996:2: ( rule__ModelChannel__IdAssignment_2 )
            // InternalThing.g:1996:3: rule__ModelChannel__IdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ModelChannel__IdAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelChannelAccess().getIdAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelChannel__Group__2__Impl"


    // $ANTLR start "rule__ModelChannel__Group__3"
    // InternalThing.g:2004:1: rule__ModelChannel__Group__3 : rule__ModelChannel__Group__3__Impl rule__ModelChannel__Group__4 ;
    public final void rule__ModelChannel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2008:1: ( rule__ModelChannel__Group__3__Impl rule__ModelChannel__Group__4 )
            // InternalThing.g:2009:2: rule__ModelChannel__Group__3__Impl rule__ModelChannel__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__ModelChannel__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelChannel__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelChannel__Group__3"


    // $ANTLR start "rule__ModelChannel__Group__3__Impl"
    // InternalThing.g:2016:1: rule__ModelChannel__Group__3__Impl : ( ( rule__ModelChannel__LabelAssignment_3 )? ) ;
    public final void rule__ModelChannel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2020:1: ( ( ( rule__ModelChannel__LabelAssignment_3 )? ) )
            // InternalThing.g:2021:1: ( ( rule__ModelChannel__LabelAssignment_3 )? )
            {
            // InternalThing.g:2021:1: ( ( rule__ModelChannel__LabelAssignment_3 )? )
            // InternalThing.g:2022:2: ( rule__ModelChannel__LabelAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelChannelAccess().getLabelAssignment_3()); 
            }
            // InternalThing.g:2023:2: ( rule__ModelChannel__LabelAssignment_3 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_STRING) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalThing.g:2023:3: rule__ModelChannel__LabelAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ModelChannel__LabelAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelChannelAccess().getLabelAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelChannel__Group__3__Impl"


    // $ANTLR start "rule__ModelChannel__Group__4"
    // InternalThing.g:2031:1: rule__ModelChannel__Group__4 : rule__ModelChannel__Group__4__Impl ;
    public final void rule__ModelChannel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2035:1: ( rule__ModelChannel__Group__4__Impl )
            // InternalThing.g:2036:2: rule__ModelChannel__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelChannel__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelChannel__Group__4"


    // $ANTLR start "rule__ModelChannel__Group__4__Impl"
    // InternalThing.g:2042:1: rule__ModelChannel__Group__4__Impl : ( ( rule__ModelChannel__Group_4__0 )? ) ;
    public final void rule__ModelChannel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2046:1: ( ( ( rule__ModelChannel__Group_4__0 )? ) )
            // InternalThing.g:2047:1: ( ( rule__ModelChannel__Group_4__0 )? )
            {
            // InternalThing.g:2047:1: ( ( rule__ModelChannel__Group_4__0 )? )
            // InternalThing.g:2048:2: ( rule__ModelChannel__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelChannelAccess().getGroup_4()); 
            }
            // InternalThing.g:2049:2: ( rule__ModelChannel__Group_4__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==27) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalThing.g:2049:3: rule__ModelChannel__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ModelChannel__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelChannelAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelChannel__Group__4__Impl"


    // $ANTLR start "rule__ModelChannel__Group_0_0__0"
    // InternalThing.g:2058:1: rule__ModelChannel__Group_0_0__0 : rule__ModelChannel__Group_0_0__0__Impl rule__ModelChannel__Group_0_0__1 ;
    public final void rule__ModelChannel__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2062:1: ( rule__ModelChannel__Group_0_0__0__Impl rule__ModelChannel__Group_0_0__1 )
            // InternalThing.g:2063:2: rule__ModelChannel__Group_0_0__0__Impl rule__ModelChannel__Group_0_0__1
            {
            pushFollow(FOLLOW_18);
            rule__ModelChannel__Group_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelChannel__Group_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelChannel__Group_0_0__0"


    // $ANTLR start "rule__ModelChannel__Group_0_0__0__Impl"
    // InternalThing.g:2070:1: rule__ModelChannel__Group_0_0__0__Impl : ( ( rule__ModelChannel__ChannelKindAssignment_0_0_0 )? ) ;
    public final void rule__ModelChannel__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2074:1: ( ( ( rule__ModelChannel__ChannelKindAssignment_0_0_0 )? ) )
            // InternalThing.g:2075:1: ( ( rule__ModelChannel__ChannelKindAssignment_0_0_0 )? )
            {
            // InternalThing.g:2075:1: ( ( rule__ModelChannel__ChannelKindAssignment_0_0_0 )? )
            // InternalThing.g:2076:2: ( rule__ModelChannel__ChannelKindAssignment_0_0_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelChannelAccess().getChannelKindAssignment_0_0_0()); 
            }
            // InternalThing.g:2077:2: ( rule__ModelChannel__ChannelKindAssignment_0_0_0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=10 && LA34_0<=11)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalThing.g:2077:3: rule__ModelChannel__ChannelKindAssignment_0_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ModelChannel__ChannelKindAssignment_0_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelChannelAccess().getChannelKindAssignment_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelChannel__Group_0_0__0__Impl"


    // $ANTLR start "rule__ModelChannel__Group_0_0__1"
    // InternalThing.g:2085:1: rule__ModelChannel__Group_0_0__1 : rule__ModelChannel__Group_0_0__1__Impl ;
    public final void rule__ModelChannel__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2089:1: ( rule__ModelChannel__Group_0_0__1__Impl )
            // InternalThing.g:2090:2: rule__ModelChannel__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelChannel__Group_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelChannel__Group_0_0__1"


    // $ANTLR start "rule__ModelChannel__Group_0_0__1__Impl"
    // InternalThing.g:2096:1: rule__ModelChannel__Group_0_0__1__Impl : ( ( rule__ModelChannel__TypeAssignment_0_0_1 ) ) ;
    public final void rule__ModelChannel__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2100:1: ( ( ( rule__ModelChannel__TypeAssignment_0_0_1 ) ) )
            // InternalThing.g:2101:1: ( ( rule__ModelChannel__TypeAssignment_0_0_1 ) )
            {
            // InternalThing.g:2101:1: ( ( rule__ModelChannel__TypeAssignment_0_0_1 ) )
            // InternalThing.g:2102:2: ( rule__ModelChannel__TypeAssignment_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelChannelAccess().getTypeAssignment_0_0_1()); 
            }
            // InternalThing.g:2103:2: ( rule__ModelChannel__TypeAssignment_0_0_1 )
            // InternalThing.g:2103:3: rule__ModelChannel__TypeAssignment_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ModelChannel__TypeAssignment_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelChannelAccess().getTypeAssignment_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelChannel__Group_0_0__1__Impl"


    // $ANTLR start "rule__ModelChannel__Group_0_1__0"
    // InternalThing.g:2112:1: rule__ModelChannel__Group_0_1__0 : rule__ModelChannel__Group_0_1__0__Impl rule__ModelChannel__Group_0_1__1 ;
    public final void rule__ModelChannel__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2116:1: ( rule__ModelChannel__Group_0_1__0__Impl rule__ModelChannel__Group_0_1__1 )
            // InternalThing.g:2117:2: rule__ModelChannel__Group_0_1__0__Impl rule__ModelChannel__Group_0_1__1
            {
            pushFollow(FOLLOW_5);
            rule__ModelChannel__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelChannel__Group_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelChannel__Group_0_1__0"


    // $ANTLR start "rule__ModelChannel__Group_0_1__0__Impl"
    // InternalThing.g:2124:1: rule__ModelChannel__Group_0_1__0__Impl : ( 'Type' ) ;
    public final void rule__ModelChannel__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2128:1: ( ( 'Type' ) )
            // InternalThing.g:2129:1: ( 'Type' )
            {
            // InternalThing.g:2129:1: ( 'Type' )
            // InternalThing.g:2130:2: 'Type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelChannelAccess().getTypeKeyword_0_1_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelChannelAccess().getTypeKeyword_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelChannel__Group_0_1__0__Impl"


    // $ANTLR start "rule__ModelChannel__Group_0_1__1"
    // InternalThing.g:2139:1: rule__ModelChannel__Group_0_1__1 : rule__ModelChannel__Group_0_1__1__Impl ;
    public final void rule__ModelChannel__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2143:1: ( rule__ModelChannel__Group_0_1__1__Impl )
            // InternalThing.g:2144:2: rule__ModelChannel__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelChannel__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelChannel__Group_0_1__1"


    // $ANTLR start "rule__ModelChannel__Group_0_1__1__Impl"
    // InternalThing.g:2150:1: rule__ModelChannel__Group_0_1__1__Impl : ( ( rule__ModelChannel__ChannelTypeAssignment_0_1_1 ) ) ;
    public final void rule__ModelChannel__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2154:1: ( ( ( rule__ModelChannel__ChannelTypeAssignment_0_1_1 ) ) )
            // InternalThing.g:2155:1: ( ( rule__ModelChannel__ChannelTypeAssignment_0_1_1 ) )
            {
            // InternalThing.g:2155:1: ( ( rule__ModelChannel__ChannelTypeAssignment_0_1_1 ) )
            // InternalThing.g:2156:2: ( rule__ModelChannel__ChannelTypeAssignment_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelChannelAccess().getChannelTypeAssignment_0_1_1()); 
            }
            // InternalThing.g:2157:2: ( rule__ModelChannel__ChannelTypeAssignment_0_1_1 )
            // InternalThing.g:2157:3: rule__ModelChannel__ChannelTypeAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ModelChannel__ChannelTypeAssignment_0_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelChannelAccess().getChannelTypeAssignment_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelChannel__Group_0_1__1__Impl"


    // $ANTLR start "rule__ModelChannel__Group_4__0"
    // InternalThing.g:2166:1: rule__ModelChannel__Group_4__0 : rule__ModelChannel__Group_4__0__Impl rule__ModelChannel__Group_4__1 ;
    public final void rule__ModelChannel__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2170:1: ( rule__ModelChannel__Group_4__0__Impl rule__ModelChannel__Group_4__1 )
            // InternalThing.g:2171:2: rule__ModelChannel__Group_4__0__Impl rule__ModelChannel__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__ModelChannel__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelChannel__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelChannel__Group_4__0"


    // $ANTLR start "rule__ModelChannel__Group_4__0__Impl"
    // InternalThing.g:2178:1: rule__ModelChannel__Group_4__0__Impl : ( '[' ) ;
    public final void rule__ModelChannel__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2182:1: ( ( '[' ) )
            // InternalThing.g:2183:1: ( '[' )
            {
            // InternalThing.g:2183:1: ( '[' )
            // InternalThing.g:2184:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelChannelAccess().getLeftSquareBracketKeyword_4_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelChannelAccess().getLeftSquareBracketKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelChannel__Group_4__0__Impl"


    // $ANTLR start "rule__ModelChannel__Group_4__1"
    // InternalThing.g:2193:1: rule__ModelChannel__Group_4__1 : rule__ModelChannel__Group_4__1__Impl rule__ModelChannel__Group_4__2 ;
    public final void rule__ModelChannel__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2197:1: ( rule__ModelChannel__Group_4__1__Impl rule__ModelChannel__Group_4__2 )
            // InternalThing.g:2198:2: rule__ModelChannel__Group_4__1__Impl rule__ModelChannel__Group_4__2
            {
            pushFollow(FOLLOW_8);
            rule__ModelChannel__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelChannel__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelChannel__Group_4__1"


    // $ANTLR start "rule__ModelChannel__Group_4__1__Impl"
    // InternalThing.g:2205:1: rule__ModelChannel__Group_4__1__Impl : ( ( rule__ModelChannel__PropertiesAssignment_4_1 )? ) ;
    public final void rule__ModelChannel__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2209:1: ( ( ( rule__ModelChannel__PropertiesAssignment_4_1 )? ) )
            // InternalThing.g:2210:1: ( ( rule__ModelChannel__PropertiesAssignment_4_1 )? )
            {
            // InternalThing.g:2210:1: ( ( rule__ModelChannel__PropertiesAssignment_4_1 )? )
            // InternalThing.g:2211:2: ( rule__ModelChannel__PropertiesAssignment_4_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelChannelAccess().getPropertiesAssignment_4_1()); 
            }
            // InternalThing.g:2212:2: ( rule__ModelChannel__PropertiesAssignment_4_1 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalThing.g:2212:3: rule__ModelChannel__PropertiesAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ModelChannel__PropertiesAssignment_4_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelChannelAccess().getPropertiesAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelChannel__Group_4__1__Impl"


    // $ANTLR start "rule__ModelChannel__Group_4__2"
    // InternalThing.g:2220:1: rule__ModelChannel__Group_4__2 : rule__ModelChannel__Group_4__2__Impl rule__ModelChannel__Group_4__3 ;
    public final void rule__ModelChannel__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2224:1: ( rule__ModelChannel__Group_4__2__Impl rule__ModelChannel__Group_4__3 )
            // InternalThing.g:2225:2: rule__ModelChannel__Group_4__2__Impl rule__ModelChannel__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__ModelChannel__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelChannel__Group_4__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelChannel__Group_4__2"


    // $ANTLR start "rule__ModelChannel__Group_4__2__Impl"
    // InternalThing.g:2232:1: rule__ModelChannel__Group_4__2__Impl : ( ( rule__ModelChannel__Group_4_2__0 )* ) ;
    public final void rule__ModelChannel__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2236:1: ( ( ( rule__ModelChannel__Group_4_2__0 )* ) )
            // InternalThing.g:2237:1: ( ( rule__ModelChannel__Group_4_2__0 )* )
            {
            // InternalThing.g:2237:1: ( ( rule__ModelChannel__Group_4_2__0 )* )
            // InternalThing.g:2238:2: ( rule__ModelChannel__Group_4_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelChannelAccess().getGroup_4_2()); 
            }
            // InternalThing.g:2239:2: ( rule__ModelChannel__Group_4_2__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==29) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalThing.g:2239:3: rule__ModelChannel__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ModelChannel__Group_4_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelChannelAccess().getGroup_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelChannel__Group_4__2__Impl"


    // $ANTLR start "rule__ModelChannel__Group_4__3"
    // InternalThing.g:2247:1: rule__ModelChannel__Group_4__3 : rule__ModelChannel__Group_4__3__Impl ;
    public final void rule__ModelChannel__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2251:1: ( rule__ModelChannel__Group_4__3__Impl )
            // InternalThing.g:2252:2: rule__ModelChannel__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelChannel__Group_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelChannel__Group_4__3"


    // $ANTLR start "rule__ModelChannel__Group_4__3__Impl"
    // InternalThing.g:2258:1: rule__ModelChannel__Group_4__3__Impl : ( ']' ) ;
    public final void rule__ModelChannel__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2262:1: ( ( ']' ) )
            // InternalThing.g:2263:1: ( ']' )
            {
            // InternalThing.g:2263:1: ( ']' )
            // InternalThing.g:2264:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelChannelAccess().getRightSquareBracketKeyword_4_3()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelChannelAccess().getRightSquareBracketKeyword_4_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelChannel__Group_4__3__Impl"


    // $ANTLR start "rule__ModelChannel__Group_4_2__0"
    // InternalThing.g:2274:1: rule__ModelChannel__Group_4_2__0 : rule__ModelChannel__Group_4_2__0__Impl rule__ModelChannel__Group_4_2__1 ;
    public final void rule__ModelChannel__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2278:1: ( rule__ModelChannel__Group_4_2__0__Impl rule__ModelChannel__Group_4_2__1 )
            // InternalThing.g:2279:2: rule__ModelChannel__Group_4_2__0__Impl rule__ModelChannel__Group_4_2__1
            {
            pushFollow(FOLLOW_5);
            rule__ModelChannel__Group_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelChannel__Group_4_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelChannel__Group_4_2__0"


    // $ANTLR start "rule__ModelChannel__Group_4_2__0__Impl"
    // InternalThing.g:2286:1: rule__ModelChannel__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__ModelChannel__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2290:1: ( ( ',' ) )
            // InternalThing.g:2291:1: ( ',' )
            {
            // InternalThing.g:2291:1: ( ',' )
            // InternalThing.g:2292:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelChannelAccess().getCommaKeyword_4_2_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelChannelAccess().getCommaKeyword_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelChannel__Group_4_2__0__Impl"


    // $ANTLR start "rule__ModelChannel__Group_4_2__1"
    // InternalThing.g:2301:1: rule__ModelChannel__Group_4_2__1 : rule__ModelChannel__Group_4_2__1__Impl ;
    public final void rule__ModelChannel__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2305:1: ( rule__ModelChannel__Group_4_2__1__Impl )
            // InternalThing.g:2306:2: rule__ModelChannel__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelChannel__Group_4_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelChannel__Group_4_2__1"


    // $ANTLR start "rule__ModelChannel__Group_4_2__1__Impl"
    // InternalThing.g:2312:1: rule__ModelChannel__Group_4_2__1__Impl : ( ( rule__ModelChannel__PropertiesAssignment_4_2_1 ) ) ;
    public final void rule__ModelChannel__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2316:1: ( ( ( rule__ModelChannel__PropertiesAssignment_4_2_1 ) ) )
            // InternalThing.g:2317:1: ( ( rule__ModelChannel__PropertiesAssignment_4_2_1 ) )
            {
            // InternalThing.g:2317:1: ( ( rule__ModelChannel__PropertiesAssignment_4_2_1 ) )
            // InternalThing.g:2318:2: ( rule__ModelChannel__PropertiesAssignment_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelChannelAccess().getPropertiesAssignment_4_2_1()); 
            }
            // InternalThing.g:2319:2: ( rule__ModelChannel__PropertiesAssignment_4_2_1 )
            // InternalThing.g:2319:3: rule__ModelChannel__PropertiesAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ModelChannel__PropertiesAssignment_4_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelChannelAccess().getPropertiesAssignment_4_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelChannel__Group_4_2__1__Impl"


    // $ANTLR start "rule__ModelItemType__Group_1__0"
    // InternalThing.g:2328:1: rule__ModelItemType__Group_1__0 : rule__ModelItemType__Group_1__0__Impl rule__ModelItemType__Group_1__1 ;
    public final void rule__ModelItemType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2332:1: ( rule__ModelItemType__Group_1__0__Impl rule__ModelItemType__Group_1__1 )
            // InternalThing.g:2333:2: rule__ModelItemType__Group_1__0__Impl rule__ModelItemType__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__ModelItemType__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelItemType__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelItemType__Group_1__0"


    // $ANTLR start "rule__ModelItemType__Group_1__0__Impl"
    // InternalThing.g:2340:1: rule__ModelItemType__Group_1__0__Impl : ( 'Number:' ) ;
    public final void rule__ModelItemType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2344:1: ( ( 'Number:' ) )
            // InternalThing.g:2345:1: ( 'Number:' )
            {
            // InternalThing.g:2345:1: ( 'Number:' )
            // InternalThing.g:2346:2: 'Number:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelItemTypeAccess().getNumberKeyword_1_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelItemTypeAccess().getNumberKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelItemType__Group_1__0__Impl"


    // $ANTLR start "rule__ModelItemType__Group_1__1"
    // InternalThing.g:2355:1: rule__ModelItemType__Group_1__1 : rule__ModelItemType__Group_1__1__Impl ;
    public final void rule__ModelItemType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2359:1: ( rule__ModelItemType__Group_1__1__Impl )
            // InternalThing.g:2360:2: rule__ModelItemType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelItemType__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelItemType__Group_1__1"


    // $ANTLR start "rule__ModelItemType__Group_1__1__Impl"
    // InternalThing.g:2366:1: rule__ModelItemType__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ModelItemType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2370:1: ( ( RULE_ID ) )
            // InternalThing.g:2371:1: ( RULE_ID )
            {
            // InternalThing.g:2371:1: ( RULE_ID )
            // InternalThing.g:2372:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelItemTypeAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelItemTypeAccess().getIDTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelItemType__Group_1__1__Impl"


    // $ANTLR start "rule__ModelProperty__Group__0"
    // InternalThing.g:2382:1: rule__ModelProperty__Group__0 : rule__ModelProperty__Group__0__Impl rule__ModelProperty__Group__1 ;
    public final void rule__ModelProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2386:1: ( rule__ModelProperty__Group__0__Impl rule__ModelProperty__Group__1 )
            // InternalThing.g:2387:2: rule__ModelProperty__Group__0__Impl rule__ModelProperty__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ModelProperty__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelProperty__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperty__Group__0"


    // $ANTLR start "rule__ModelProperty__Group__0__Impl"
    // InternalThing.g:2394:1: rule__ModelProperty__Group__0__Impl : ( ( rule__ModelProperty__KeyAssignment_0 ) ) ;
    public final void rule__ModelProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2398:1: ( ( ( rule__ModelProperty__KeyAssignment_0 ) ) )
            // InternalThing.g:2399:1: ( ( rule__ModelProperty__KeyAssignment_0 ) )
            {
            // InternalThing.g:2399:1: ( ( rule__ModelProperty__KeyAssignment_0 ) )
            // InternalThing.g:2400:2: ( rule__ModelProperty__KeyAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelPropertyAccess().getKeyAssignment_0()); 
            }
            // InternalThing.g:2401:2: ( rule__ModelProperty__KeyAssignment_0 )
            // InternalThing.g:2401:3: rule__ModelProperty__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ModelProperty__KeyAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelPropertyAccess().getKeyAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperty__Group__0__Impl"


    // $ANTLR start "rule__ModelProperty__Group__1"
    // InternalThing.g:2409:1: rule__ModelProperty__Group__1 : rule__ModelProperty__Group__1__Impl rule__ModelProperty__Group__2 ;
    public final void rule__ModelProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2413:1: ( rule__ModelProperty__Group__1__Impl rule__ModelProperty__Group__2 )
            // InternalThing.g:2414:2: rule__ModelProperty__Group__1__Impl rule__ModelProperty__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__ModelProperty__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelProperty__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperty__Group__1"


    // $ANTLR start "rule__ModelProperty__Group__1__Impl"
    // InternalThing.g:2421:1: rule__ModelProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__ModelProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2425:1: ( ( '=' ) )
            // InternalThing.g:2426:1: ( '=' )
            {
            // InternalThing.g:2426:1: ( '=' )
            // InternalThing.g:2427:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelPropertyAccess().getEqualsSignKeyword_1()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelPropertyAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperty__Group__1__Impl"


    // $ANTLR start "rule__ModelProperty__Group__2"
    // InternalThing.g:2436:1: rule__ModelProperty__Group__2 : rule__ModelProperty__Group__2__Impl rule__ModelProperty__Group__3 ;
    public final void rule__ModelProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2440:1: ( rule__ModelProperty__Group__2__Impl rule__ModelProperty__Group__3 )
            // InternalThing.g:2441:2: rule__ModelProperty__Group__2__Impl rule__ModelProperty__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__ModelProperty__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelProperty__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperty__Group__2"


    // $ANTLR start "rule__ModelProperty__Group__2__Impl"
    // InternalThing.g:2448:1: rule__ModelProperty__Group__2__Impl : ( ( rule__ModelProperty__ValueAssignment_2 ) ) ;
    public final void rule__ModelProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2452:1: ( ( ( rule__ModelProperty__ValueAssignment_2 ) ) )
            // InternalThing.g:2453:1: ( ( rule__ModelProperty__ValueAssignment_2 ) )
            {
            // InternalThing.g:2453:1: ( ( rule__ModelProperty__ValueAssignment_2 ) )
            // InternalThing.g:2454:2: ( rule__ModelProperty__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelPropertyAccess().getValueAssignment_2()); 
            }
            // InternalThing.g:2455:2: ( rule__ModelProperty__ValueAssignment_2 )
            // InternalThing.g:2455:3: rule__ModelProperty__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ModelProperty__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelPropertyAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperty__Group__2__Impl"


    // $ANTLR start "rule__ModelProperty__Group__3"
    // InternalThing.g:2463:1: rule__ModelProperty__Group__3 : rule__ModelProperty__Group__3__Impl ;
    public final void rule__ModelProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2467:1: ( rule__ModelProperty__Group__3__Impl )
            // InternalThing.g:2468:2: rule__ModelProperty__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelProperty__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperty__Group__3"


    // $ANTLR start "rule__ModelProperty__Group__3__Impl"
    // InternalThing.g:2474:1: rule__ModelProperty__Group__3__Impl : ( ( rule__ModelProperty__Group_3__0 )* ) ;
    public final void rule__ModelProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2478:1: ( ( ( rule__ModelProperty__Group_3__0 )* ) )
            // InternalThing.g:2479:1: ( ( rule__ModelProperty__Group_3__0 )* )
            {
            // InternalThing.g:2479:1: ( ( rule__ModelProperty__Group_3__0 )* )
            // InternalThing.g:2480:2: ( rule__ModelProperty__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelPropertyAccess().getGroup_3()); 
            }
            // InternalThing.g:2481:2: ( rule__ModelProperty__Group_3__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==29) ) {
                    int LA37_2 = input.LA(2);

                    if ( (LA37_2==RULE_ID) ) {
                        int LA37_3 = input.LA(3);

                        if ( (LA37_3==EOF||(LA37_3>=28 && LA37_3<=29)||LA37_3==43) ) {
                            alt37=1;
                        }


                    }
                    else if ( (LA37_2==RULE_STRING||(LA37_2>=24 && LA37_2<=25)||LA37_2==42) ) {
                        alt37=1;
                    }


                }


                switch (alt37) {
            	case 1 :
            	    // InternalThing.g:2481:3: rule__ModelProperty__Group_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ModelProperty__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelPropertyAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperty__Group__3__Impl"


    // $ANTLR start "rule__ModelProperty__Group_3__0"
    // InternalThing.g:2490:1: rule__ModelProperty__Group_3__0 : rule__ModelProperty__Group_3__0__Impl rule__ModelProperty__Group_3__1 ;
    public final void rule__ModelProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2494:1: ( rule__ModelProperty__Group_3__0__Impl rule__ModelProperty__Group_3__1 )
            // InternalThing.g:2495:2: rule__ModelProperty__Group_3__0__Impl rule__ModelProperty__Group_3__1
            {
            pushFollow(FOLLOW_20);
            rule__ModelProperty__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelProperty__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperty__Group_3__0"


    // $ANTLR start "rule__ModelProperty__Group_3__0__Impl"
    // InternalThing.g:2502:1: rule__ModelProperty__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ModelProperty__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2506:1: ( ( ',' ) )
            // InternalThing.g:2507:1: ( ',' )
            {
            // InternalThing.g:2507:1: ( ',' )
            // InternalThing.g:2508:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelPropertyAccess().getCommaKeyword_3_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelPropertyAccess().getCommaKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperty__Group_3__0__Impl"


    // $ANTLR start "rule__ModelProperty__Group_3__1"
    // InternalThing.g:2517:1: rule__ModelProperty__Group_3__1 : rule__ModelProperty__Group_3__1__Impl ;
    public final void rule__ModelProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2521:1: ( rule__ModelProperty__Group_3__1__Impl )
            // InternalThing.g:2522:2: rule__ModelProperty__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelProperty__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperty__Group_3__1"


    // $ANTLR start "rule__ModelProperty__Group_3__1__Impl"
    // InternalThing.g:2528:1: rule__ModelProperty__Group_3__1__Impl : ( ( rule__ModelProperty__ValueAssignment_3_1 ) ) ;
    public final void rule__ModelProperty__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2532:1: ( ( ( rule__ModelProperty__ValueAssignment_3_1 ) ) )
            // InternalThing.g:2533:1: ( ( rule__ModelProperty__ValueAssignment_3_1 ) )
            {
            // InternalThing.g:2533:1: ( ( rule__ModelProperty__ValueAssignment_3_1 ) )
            // InternalThing.g:2534:2: ( rule__ModelProperty__ValueAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelPropertyAccess().getValueAssignment_3_1()); 
            }
            // InternalThing.g:2535:2: ( rule__ModelProperty__ValueAssignment_3_1 )
            // InternalThing.g:2535:3: rule__ModelProperty__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ModelProperty__ValueAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelPropertyAccess().getValueAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperty__Group_3__1__Impl"


    // $ANTLR start "rule__CHANNEL_ID__Group__0"
    // InternalThing.g:2544:1: rule__CHANNEL_ID__Group__0 : rule__CHANNEL_ID__Group__0__Impl rule__CHANNEL_ID__Group__1 ;
    public final void rule__CHANNEL_ID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2548:1: ( rule__CHANNEL_ID__Group__0__Impl rule__CHANNEL_ID__Group__1 )
            // InternalThing.g:2549:2: rule__CHANNEL_ID__Group__0__Impl rule__CHANNEL_ID__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__CHANNEL_ID__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CHANNEL_ID__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CHANNEL_ID__Group__0"


    // $ANTLR start "rule__CHANNEL_ID__Group__0__Impl"
    // InternalThing.g:2556:1: rule__CHANNEL_ID__Group__0__Impl : ( ruleUID_SEGMENT ) ;
    public final void rule__CHANNEL_ID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2560:1: ( ( ruleUID_SEGMENT ) )
            // InternalThing.g:2561:1: ( ruleUID_SEGMENT )
            {
            // InternalThing.g:2561:1: ( ruleUID_SEGMENT )
            // InternalThing.g:2562:2: ruleUID_SEGMENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCHANNEL_IDAccess().getUID_SEGMENTParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleUID_SEGMENT();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCHANNEL_IDAccess().getUID_SEGMENTParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CHANNEL_ID__Group__0__Impl"


    // $ANTLR start "rule__CHANNEL_ID__Group__1"
    // InternalThing.g:2571:1: rule__CHANNEL_ID__Group__1 : rule__CHANNEL_ID__Group__1__Impl ;
    public final void rule__CHANNEL_ID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2575:1: ( rule__CHANNEL_ID__Group__1__Impl )
            // InternalThing.g:2576:2: rule__CHANNEL_ID__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CHANNEL_ID__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CHANNEL_ID__Group__1"


    // $ANTLR start "rule__CHANNEL_ID__Group__1__Impl"
    // InternalThing.g:2582:1: rule__CHANNEL_ID__Group__1__Impl : ( ( rule__CHANNEL_ID__Group_1__0 )? ) ;
    public final void rule__CHANNEL_ID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2586:1: ( ( ( rule__CHANNEL_ID__Group_1__0 )? ) )
            // InternalThing.g:2587:1: ( ( rule__CHANNEL_ID__Group_1__0 )? )
            {
            // InternalThing.g:2587:1: ( ( rule__CHANNEL_ID__Group_1__0 )? )
            // InternalThing.g:2588:2: ( rule__CHANNEL_ID__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCHANNEL_IDAccess().getGroup_1()); 
            }
            // InternalThing.g:2589:2: ( rule__CHANNEL_ID__Group_1__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==41) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalThing.g:2589:3: rule__CHANNEL_ID__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CHANNEL_ID__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCHANNEL_IDAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CHANNEL_ID__Group__1__Impl"


    // $ANTLR start "rule__CHANNEL_ID__Group_1__0"
    // InternalThing.g:2598:1: rule__CHANNEL_ID__Group_1__0 : rule__CHANNEL_ID__Group_1__0__Impl rule__CHANNEL_ID__Group_1__1 ;
    public final void rule__CHANNEL_ID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2602:1: ( rule__CHANNEL_ID__Group_1__0__Impl rule__CHANNEL_ID__Group_1__1 )
            // InternalThing.g:2603:2: rule__CHANNEL_ID__Group_1__0__Impl rule__CHANNEL_ID__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__CHANNEL_ID__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CHANNEL_ID__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CHANNEL_ID__Group_1__0"


    // $ANTLR start "rule__CHANNEL_ID__Group_1__0__Impl"
    // InternalThing.g:2610:1: rule__CHANNEL_ID__Group_1__0__Impl : ( '#' ) ;
    public final void rule__CHANNEL_ID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2614:1: ( ( '#' ) )
            // InternalThing.g:2615:1: ( '#' )
            {
            // InternalThing.g:2615:1: ( '#' )
            // InternalThing.g:2616:2: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCHANNEL_IDAccess().getNumberSignKeyword_1_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCHANNEL_IDAccess().getNumberSignKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CHANNEL_ID__Group_1__0__Impl"


    // $ANTLR start "rule__CHANNEL_ID__Group_1__1"
    // InternalThing.g:2625:1: rule__CHANNEL_ID__Group_1__1 : rule__CHANNEL_ID__Group_1__1__Impl ;
    public final void rule__CHANNEL_ID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2629:1: ( rule__CHANNEL_ID__Group_1__1__Impl )
            // InternalThing.g:2630:2: rule__CHANNEL_ID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CHANNEL_ID__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CHANNEL_ID__Group_1__1"


    // $ANTLR start "rule__CHANNEL_ID__Group_1__1__Impl"
    // InternalThing.g:2636:1: rule__CHANNEL_ID__Group_1__1__Impl : ( ruleUID_SEGMENT ) ;
    public final void rule__CHANNEL_ID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2640:1: ( ( ruleUID_SEGMENT ) )
            // InternalThing.g:2641:1: ( ruleUID_SEGMENT )
            {
            // InternalThing.g:2641:1: ( ruleUID_SEGMENT )
            // InternalThing.g:2642:2: ruleUID_SEGMENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCHANNEL_IDAccess().getUID_SEGMENTParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleUID_SEGMENT();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCHANNEL_IDAccess().getUID_SEGMENTParserRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CHANNEL_ID__Group_1__1__Impl"


    // $ANTLR start "rule__UID__Group__0"
    // InternalThing.g:2652:1: rule__UID__Group__0 : rule__UID__Group__0__Impl rule__UID__Group__1 ;
    public final void rule__UID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2656:1: ( rule__UID__Group__0__Impl rule__UID__Group__1 )
            // InternalThing.g:2657:2: rule__UID__Group__0__Impl rule__UID__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__UID__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UID__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UID__Group__0"


    // $ANTLR start "rule__UID__Group__0__Impl"
    // InternalThing.g:2664:1: rule__UID__Group__0__Impl : ( ruleUID_SEGMENT ) ;
    public final void rule__UID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2668:1: ( ( ruleUID_SEGMENT ) )
            // InternalThing.g:2669:1: ( ruleUID_SEGMENT )
            {
            // InternalThing.g:2669:1: ( ruleUID_SEGMENT )
            // InternalThing.g:2670:2: ruleUID_SEGMENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDAccess().getUID_SEGMENTParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleUID_SEGMENT();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIDAccess().getUID_SEGMENTParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UID__Group__0__Impl"


    // $ANTLR start "rule__UID__Group__1"
    // InternalThing.g:2679:1: rule__UID__Group__1 : rule__UID__Group__1__Impl rule__UID__Group__2 ;
    public final void rule__UID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2683:1: ( rule__UID__Group__1__Impl rule__UID__Group__2 )
            // InternalThing.g:2684:2: rule__UID__Group__1__Impl rule__UID__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__UID__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UID__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UID__Group__1"


    // $ANTLR start "rule__UID__Group__1__Impl"
    // InternalThing.g:2691:1: rule__UID__Group__1__Impl : ( ':' ) ;
    public final void rule__UID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2695:1: ( ( ':' ) )
            // InternalThing.g:2696:1: ( ':' )
            {
            // InternalThing.g:2696:1: ( ':' )
            // InternalThing.g:2697:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDAccess().getColonKeyword_1()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIDAccess().getColonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UID__Group__1__Impl"


    // $ANTLR start "rule__UID__Group__2"
    // InternalThing.g:2706:1: rule__UID__Group__2 : rule__UID__Group__2__Impl rule__UID__Group__3 ;
    public final void rule__UID__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2710:1: ( rule__UID__Group__2__Impl rule__UID__Group__3 )
            // InternalThing.g:2711:2: rule__UID__Group__2__Impl rule__UID__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__UID__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UID__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UID__Group__2"


    // $ANTLR start "rule__UID__Group__2__Impl"
    // InternalThing.g:2718:1: rule__UID__Group__2__Impl : ( ruleUID_SEGMENT ) ;
    public final void rule__UID__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2722:1: ( ( ruleUID_SEGMENT ) )
            // InternalThing.g:2723:1: ( ruleUID_SEGMENT )
            {
            // InternalThing.g:2723:1: ( ruleUID_SEGMENT )
            // InternalThing.g:2724:2: ruleUID_SEGMENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDAccess().getUID_SEGMENTParserRuleCall_2()); 
            }
            pushFollow(FOLLOW_2);
            ruleUID_SEGMENT();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIDAccess().getUID_SEGMENTParserRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UID__Group__2__Impl"


    // $ANTLR start "rule__UID__Group__3"
    // InternalThing.g:2733:1: rule__UID__Group__3 : rule__UID__Group__3__Impl rule__UID__Group__4 ;
    public final void rule__UID__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2737:1: ( rule__UID__Group__3__Impl rule__UID__Group__4 )
            // InternalThing.g:2738:2: rule__UID__Group__3__Impl rule__UID__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__UID__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UID__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UID__Group__3"


    // $ANTLR start "rule__UID__Group__3__Impl"
    // InternalThing.g:2745:1: rule__UID__Group__3__Impl : ( ':' ) ;
    public final void rule__UID__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2749:1: ( ( ':' ) )
            // InternalThing.g:2750:1: ( ':' )
            {
            // InternalThing.g:2750:1: ( ':' )
            // InternalThing.g:2751:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDAccess().getColonKeyword_3()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIDAccess().getColonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UID__Group__3__Impl"


    // $ANTLR start "rule__UID__Group__4"
    // InternalThing.g:2760:1: rule__UID__Group__4 : rule__UID__Group__4__Impl rule__UID__Group__5 ;
    public final void rule__UID__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2764:1: ( rule__UID__Group__4__Impl rule__UID__Group__5 )
            // InternalThing.g:2765:2: rule__UID__Group__4__Impl rule__UID__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__UID__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UID__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UID__Group__4"


    // $ANTLR start "rule__UID__Group__4__Impl"
    // InternalThing.g:2772:1: rule__UID__Group__4__Impl : ( ruleUID_SEGMENT ) ;
    public final void rule__UID__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2776:1: ( ( ruleUID_SEGMENT ) )
            // InternalThing.g:2777:1: ( ruleUID_SEGMENT )
            {
            // InternalThing.g:2777:1: ( ruleUID_SEGMENT )
            // InternalThing.g:2778:2: ruleUID_SEGMENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDAccess().getUID_SEGMENTParserRuleCall_4()); 
            }
            pushFollow(FOLLOW_2);
            ruleUID_SEGMENT();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIDAccess().getUID_SEGMENTParserRuleCall_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UID__Group__4__Impl"


    // $ANTLR start "rule__UID__Group__5"
    // InternalThing.g:2787:1: rule__UID__Group__5 : rule__UID__Group__5__Impl ;
    public final void rule__UID__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2791:1: ( rule__UID__Group__5__Impl )
            // InternalThing.g:2792:2: rule__UID__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UID__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UID__Group__5"


    // $ANTLR start "rule__UID__Group__5__Impl"
    // InternalThing.g:2798:1: rule__UID__Group__5__Impl : ( ( rule__UID__Group_5__0 )* ) ;
    public final void rule__UID__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2802:1: ( ( ( rule__UID__Group_5__0 )* ) )
            // InternalThing.g:2803:1: ( ( rule__UID__Group_5__0 )* )
            {
            // InternalThing.g:2803:1: ( ( rule__UID__Group_5__0 )* )
            // InternalThing.g:2804:2: ( rule__UID__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDAccess().getGroup_5()); 
            }
            // InternalThing.g:2805:2: ( rule__UID__Group_5__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==37) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalThing.g:2805:3: rule__UID__Group_5__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__UID__Group_5__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIDAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UID__Group__5__Impl"


    // $ANTLR start "rule__UID__Group_5__0"
    // InternalThing.g:2814:1: rule__UID__Group_5__0 : rule__UID__Group_5__0__Impl rule__UID__Group_5__1 ;
    public final void rule__UID__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2818:1: ( rule__UID__Group_5__0__Impl rule__UID__Group_5__1 )
            // InternalThing.g:2819:2: rule__UID__Group_5__0__Impl rule__UID__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__UID__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UID__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UID__Group_5__0"


    // $ANTLR start "rule__UID__Group_5__0__Impl"
    // InternalThing.g:2826:1: rule__UID__Group_5__0__Impl : ( ( ':' ) ) ;
    public final void rule__UID__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2830:1: ( ( ( ':' ) ) )
            // InternalThing.g:2831:1: ( ( ':' ) )
            {
            // InternalThing.g:2831:1: ( ( ':' ) )
            // InternalThing.g:2832:2: ( ':' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDAccess().getColonKeyword_5_0()); 
            }
            // InternalThing.g:2833:2: ( ':' )
            // InternalThing.g:2833:3: ':'
            {
            match(input,37,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIDAccess().getColonKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UID__Group_5__0__Impl"


    // $ANTLR start "rule__UID__Group_5__1"
    // InternalThing.g:2841:1: rule__UID__Group_5__1 : rule__UID__Group_5__1__Impl ;
    public final void rule__UID__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2845:1: ( rule__UID__Group_5__1__Impl )
            // InternalThing.g:2846:2: rule__UID__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UID__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UID__Group_5__1"


    // $ANTLR start "rule__UID__Group_5__1__Impl"
    // InternalThing.g:2852:1: rule__UID__Group_5__1__Impl : ( ruleUID_SEGMENT ) ;
    public final void rule__UID__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2856:1: ( ( ruleUID_SEGMENT ) )
            // InternalThing.g:2857:1: ( ruleUID_SEGMENT )
            {
            // InternalThing.g:2857:1: ( ruleUID_SEGMENT )
            // InternalThing.g:2858:2: ruleUID_SEGMENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUIDAccess().getUID_SEGMENTParserRuleCall_5_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleUID_SEGMENT();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUIDAccess().getUID_SEGMENTParserRuleCall_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UID__Group_5__1__Impl"


    // $ANTLR start "rule__NUMBER__Group__0"
    // InternalThing.g:2868:1: rule__NUMBER__Group__0 : rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1 ;
    public final void rule__NUMBER__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2872:1: ( rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1 )
            // InternalThing.g:2873:2: rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__NUMBER__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NUMBER__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group__0"


    // $ANTLR start "rule__NUMBER__Group__0__Impl"
    // InternalThing.g:2880:1: rule__NUMBER__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__NUMBER__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2884:1: ( ( ( '-' )? ) )
            // InternalThing.g:2885:1: ( ( '-' )? )
            {
            // InternalThing.g:2885:1: ( ( '-' )? )
            // InternalThing.g:2886:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNUMBERAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalThing.g:2887:2: ( '-' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==42) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalThing.g:2887:3: '-'
                    {
                    match(input,42,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNUMBERAccess().getHyphenMinusKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group__0__Impl"


    // $ANTLR start "rule__NUMBER__Group__1"
    // InternalThing.g:2895:1: rule__NUMBER__Group__1 : rule__NUMBER__Group__1__Impl rule__NUMBER__Group__2 ;
    public final void rule__NUMBER__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2899:1: ( rule__NUMBER__Group__1__Impl rule__NUMBER__Group__2 )
            // InternalThing.g:2900:2: rule__NUMBER__Group__1__Impl rule__NUMBER__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__NUMBER__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NUMBER__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group__1"


    // $ANTLR start "rule__NUMBER__Group__1__Impl"
    // InternalThing.g:2907:1: rule__NUMBER__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__NUMBER__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2911:1: ( ( RULE_ID ) )
            // InternalThing.g:2912:1: ( RULE_ID )
            {
            // InternalThing.g:2912:1: ( RULE_ID )
            // InternalThing.g:2913:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNUMBERAccess().getIDTerminalRuleCall_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNUMBERAccess().getIDTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group__1__Impl"


    // $ANTLR start "rule__NUMBER__Group__2"
    // InternalThing.g:2922:1: rule__NUMBER__Group__2 : rule__NUMBER__Group__2__Impl ;
    public final void rule__NUMBER__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2926:1: ( rule__NUMBER__Group__2__Impl )
            // InternalThing.g:2927:2: rule__NUMBER__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NUMBER__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group__2"


    // $ANTLR start "rule__NUMBER__Group__2__Impl"
    // InternalThing.g:2933:1: rule__NUMBER__Group__2__Impl : ( ( rule__NUMBER__Group_2__0 )? ) ;
    public final void rule__NUMBER__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2937:1: ( ( ( rule__NUMBER__Group_2__0 )? ) )
            // InternalThing.g:2938:1: ( ( rule__NUMBER__Group_2__0 )? )
            {
            // InternalThing.g:2938:1: ( ( rule__NUMBER__Group_2__0 )? )
            // InternalThing.g:2939:2: ( rule__NUMBER__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNUMBERAccess().getGroup_2()); 
            }
            // InternalThing.g:2940:2: ( rule__NUMBER__Group_2__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==43) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalThing.g:2940:3: rule__NUMBER__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NUMBER__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNUMBERAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group__2__Impl"


    // $ANTLR start "rule__NUMBER__Group_2__0"
    // InternalThing.g:2949:1: rule__NUMBER__Group_2__0 : rule__NUMBER__Group_2__0__Impl rule__NUMBER__Group_2__1 ;
    public final void rule__NUMBER__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2953:1: ( rule__NUMBER__Group_2__0__Impl rule__NUMBER__Group_2__1 )
            // InternalThing.g:2954:2: rule__NUMBER__Group_2__0__Impl rule__NUMBER__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__NUMBER__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NUMBER__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group_2__0"


    // $ANTLR start "rule__NUMBER__Group_2__0__Impl"
    // InternalThing.g:2961:1: rule__NUMBER__Group_2__0__Impl : ( '.' ) ;
    public final void rule__NUMBER__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2965:1: ( ( '.' ) )
            // InternalThing.g:2966:1: ( '.' )
            {
            // InternalThing.g:2966:1: ( '.' )
            // InternalThing.g:2967:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNUMBERAccess().getFullStopKeyword_2_0()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNUMBERAccess().getFullStopKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group_2__0__Impl"


    // $ANTLR start "rule__NUMBER__Group_2__1"
    // InternalThing.g:2976:1: rule__NUMBER__Group_2__1 : rule__NUMBER__Group_2__1__Impl ;
    public final void rule__NUMBER__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2980:1: ( rule__NUMBER__Group_2__1__Impl )
            // InternalThing.g:2981:2: rule__NUMBER__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NUMBER__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group_2__1"


    // $ANTLR start "rule__NUMBER__Group_2__1__Impl"
    // InternalThing.g:2987:1: rule__NUMBER__Group_2__1__Impl : ( RULE_ID ) ;
    public final void rule__NUMBER__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:2991:1: ( ( RULE_ID ) )
            // InternalThing.g:2992:1: ( RULE_ID )
            {
            // InternalThing.g:2992:1: ( RULE_ID )
            // InternalThing.g:2993:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNUMBERAccess().getIDTerminalRuleCall_2_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNUMBERAccess().getIDTerminalRuleCall_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group_2__1__Impl"


    // $ANTLR start "rule__ThingModel__ThingsAssignment"
    // InternalThing.g:3003:1: rule__ThingModel__ThingsAssignment : ( ( rule__ThingModel__ThingsAlternatives_0 ) ) ;
    public final void rule__ThingModel__ThingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:3007:1: ( ( ( rule__ThingModel__ThingsAlternatives_0 ) ) )
            // InternalThing.g:3008:2: ( ( rule__ThingModel__ThingsAlternatives_0 ) )
            {
            // InternalThing.g:3008:2: ( ( rule__ThingModel__ThingsAlternatives_0 ) )
            // InternalThing.g:3009:3: ( rule__ThingModel__ThingsAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getThingModelAccess().getThingsAlternatives_0()); 
            }
            // InternalThing.g:3010:3: ( rule__ThingModel__ThingsAlternatives_0 )
            // InternalThing.g:3010:4: rule__ThingModel__ThingsAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__ThingModel__ThingsAlternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getThingModelAccess().getThingsAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThingModel__ThingsAssignment"


    // $ANTLR start "rule__ModelBridge__BridgeAssignment_1"
    // InternalThing.g:3018:1: rule__ModelBridge__BridgeAssignment_1 : ( ( 'Bridge' ) ) ;
    public final void rule__ModelBridge__BridgeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:3022:1: ( ( ( 'Bridge' ) ) )
            // InternalThing.g:3023:2: ( ( 'Bridge' ) )
            {
            // InternalThing.g:3023:2: ( ( 'Bridge' ) )
            // InternalThing.g:3024:3: ( 'Bridge' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelBridgeAccess().getBridgeBridgeKeyword_1_0()); 
            }
            // InternalThing.g:3025:3: ( 'Bridge' )
            // InternalThing.g:3026:4: 'Bridge'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelBridgeAccess().getBridgeBridgeKeyword_1_0()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelBridgeAccess().getBridgeBridgeKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelBridgeAccess().getBridgeBridgeKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__BridgeAssignment_1"


    // $ANTLR start "rule__ModelBridge__IdAssignment_2_0"
    // InternalThing.g:3037:1: rule__ModelBridge__IdAssignment_2_0 : ( ruleUID ) ;
    public final void rule__ModelBridge__IdAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:3041:1: ( ( ruleUID ) )
            // InternalThing.g:3042:2: ( ruleUID )
            {
            // InternalThing.g:3042:2: ( ruleUID )
            // InternalThing.g:3043:3: ruleUID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelBridgeAccess().getIdUIDParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleUID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelBridgeAccess().getIdUIDParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__IdAssignment_2_0"


    // $ANTLR start "rule__ModelBridge__ThingTypeIdAssignment_2_1_0"
    // InternalThing.g:3052:1: rule__ModelBridge__ThingTypeIdAssignment_2_1_0 : ( ruleUID_SEGMENT ) ;
    public final void rule__ModelBridge__ThingTypeIdAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:3056:1: ( ( ruleUID_SEGMENT ) )
            // InternalThing.g:3057:2: ( ruleUID_SEGMENT )
            {
            // InternalThing.g:3057:2: ( ruleUID_SEGMENT )
            // InternalThing.g:3058:3: ruleUID_SEGMENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelBridgeAccess().getThingTypeIdUID_SEGMENTParserRuleCall_2_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleUID_SEGMENT();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelBridgeAccess().getThingTypeIdUID_SEGMENTParserRuleCall_2_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__ThingTypeIdAssignment_2_1_0"


    // $ANTLR start "rule__ModelBridge__ThingIdAssignment_2_1_1"
    // InternalThing.g:3067:1: rule__ModelBridge__ThingIdAssignment_2_1_1 : ( ruleUID_SEGMENT ) ;
    public final void rule__ModelBridge__ThingIdAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:3071:1: ( ( ruleUID_SEGMENT ) )
            // InternalThing.g:3072:2: ( ruleUID_SEGMENT )
            {
            // InternalThing.g:3072:2: ( ruleUID_SEGMENT )
            // InternalThing.g:3073:3: ruleUID_SEGMENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelBridgeAccess().getThingIdUID_SEGMENTParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleUID_SEGMENT();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelBridgeAccess().getThingIdUID_SEGMENTParserRuleCall_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__ThingIdAssignment_2_1_1"


    // $ANTLR start "rule__ModelBridge__LabelAssignment_3"
    // InternalThing.g:3082:1: rule__ModelBridge__LabelAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ModelBridge__LabelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:3086:1: ( ( RULE_STRING ) )
            // InternalThing.g:3087:2: ( RULE_STRING )
            {
            // InternalThing.g:3087:2: ( RULE_STRING )
            // InternalThing.g:3088:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelBridgeAccess().getLabelSTRINGTerminalRuleCall_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelBridgeAccess().getLabelSTRINGTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__LabelAssignment_3"


    // $ANTLR start "rule__ModelBridge__LocationAssignment_4_1"
    // InternalThing.g:3097:1: rule__ModelBridge__LocationAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__ModelBridge__LocationAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:3101:1: ( ( RULE_STRING ) )
            // InternalThing.g:3102:2: ( RULE_STRING )
            {
            // InternalThing.g:3102:2: ( RULE_STRING )
            // InternalThing.g:3103:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelBridgeAccess().getLocationSTRINGTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelBridgeAccess().getLocationSTRINGTerminalRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__LocationAssignment_4_1"


    // $ANTLR start "rule__ModelBridge__PropertiesAssignment_5_1"
    // InternalThing.g:3112:1: rule__ModelBridge__PropertiesAssignment_5_1 : ( ruleModelProperty ) ;
    public final void rule__ModelBridge__PropertiesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:3116:1: ( ( ruleModelProperty ) )
            // InternalThing.g:3117:2: ( ruleModelProperty )
            {
            // InternalThing.g:3117:2: ( ruleModelProperty )
            // InternalThing.g:3118:3: ruleModelProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelBridgeAccess().getPropertiesModelPropertyParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleModelProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelBridgeAccess().getPropertiesModelPropertyParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__PropertiesAssignment_5_1"


    // $ANTLR start "rule__ModelBridge__PropertiesAssignment_5_2_1"
    // InternalThing.g:3127:1: rule__ModelBridge__PropertiesAssignment_5_2_1 : ( ruleModelProperty ) ;
    public final void rule__ModelBridge__PropertiesAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:3131:1: ( ( ruleModelProperty ) )
            // InternalThing.g:3132:2: ( ruleModelProperty )
            {
            // InternalThing.g:3132:2: ( ruleModelProperty )
            // InternalThing.g:3133:3: ruleModelProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelBridgeAccess().getPropertiesModelPropertyParserRuleCall_5_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleModelProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelBridgeAccess().getPropertiesModelPropertyParserRuleCall_5_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__PropertiesAssignment_5_2_1"


    // $ANTLR start "rule__ModelBridge__ThingsAssignment_6_2"
    // InternalThing.g:3142:1: rule__ModelBridge__ThingsAssignment_6_2 : ( ( rule__ModelBridge__ThingsAlternatives_6_2_0 ) ) ;
    public final void rule__ModelBridge__ThingsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:3146:1: ( ( ( rule__ModelBridge__ThingsAlternatives_6_2_0 ) ) )
            // InternalThing.g:3147:2: ( ( rule__ModelBridge__ThingsAlternatives_6_2_0 ) )
            {
            // InternalThing.g:3147:2: ( ( rule__ModelBridge__ThingsAlternatives_6_2_0 ) )
            // InternalThing.g:3148:3: ( rule__ModelBridge__ThingsAlternatives_6_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelBridgeAccess().getThingsAlternatives_6_2_0()); 
            }
            // InternalThing.g:3149:3: ( rule__ModelBridge__ThingsAlternatives_6_2_0 )
            // InternalThing.g:3149:4: rule__ModelBridge__ThingsAlternatives_6_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ModelBridge__ThingsAlternatives_6_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelBridgeAccess().getThingsAlternatives_6_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__ThingsAssignment_6_2"


    // $ANTLR start "rule__ModelBridge__ChannelsAssignment_6_4"
    // InternalThing.g:3157:1: rule__ModelBridge__ChannelsAssignment_6_4 : ( ruleModelChannel ) ;
    public final void rule__ModelBridge__ChannelsAssignment_6_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:3161:1: ( ( ruleModelChannel ) )
            // InternalThing.g:3162:2: ( ruleModelChannel )
            {
            // InternalThing.g:3162:2: ( ruleModelChannel )
            // InternalThing.g:3163:3: ruleModelChannel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelBridgeAccess().getChannelsModelChannelParserRuleCall_6_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleModelChannel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelBridgeAccess().getChannelsModelChannelParserRuleCall_6_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelBridge__ChannelsAssignment_6_4"


    // $ANTLR start "rule__ModelThing__IdAssignment_1_0"
    // InternalThing.g:3172:1: rule__ModelThing__IdAssignment_1_0 : ( ruleUID ) ;
    public final void rule__ModelThing__IdAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:3176:1: ( ( ruleUID ) )
            // InternalThing.g:3177:2: ( ruleUID )
            {
            // InternalThing.g:3177:2: ( ruleUID )
            // InternalThing.g:3178:3: ruleUID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelThingAccess().getIdUIDParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleUID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelThingAccess().getIdUIDParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__IdAssignment_1_0"


    // $ANTLR start "rule__ModelThing__ThingTypeIdAssignment_1_1_0"
    // InternalThing.g:3187:1: rule__ModelThing__ThingTypeIdAssignment_1_1_0 : ( ruleUID_SEGMENT ) ;
    public final void rule__ModelThing__ThingTypeIdAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:3191:1: ( ( ruleUID_SEGMENT ) )
            // InternalThing.g:3192:2: ( ruleUID_SEGMENT )
            {
            // InternalThing.g:3192:2: ( ruleUID_SEGMENT )
            // InternalThing.g:3193:3: ruleUID_SEGMENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelThingAccess().getThingTypeIdUID_SEGMENTParserRuleCall_1_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleUID_SEGMENT();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelThingAccess().getThingTypeIdUID_SEGMENTParserRuleCall_1_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__ThingTypeIdAssignment_1_1_0"


    // $ANTLR start "rule__ModelThing__ThingIdAssignment_1_1_1"
    // InternalThing.g:3202:1: rule__ModelThing__ThingIdAssignment_1_1_1 : ( ruleUID_SEGMENT ) ;
    public final void rule__ModelThing__ThingIdAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:3206:1: ( ( ruleUID_SEGMENT ) )
            // InternalThing.g:3207:2: ( ruleUID_SEGMENT )
            {
            // InternalThing.g:3207:2: ( ruleUID_SEGMENT )
            // InternalThing.g:3208:3: ruleUID_SEGMENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelThingAccess().getThingIdUID_SEGMENTParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleUID_SEGMENT();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelThingAccess().getThingIdUID_SEGMENTParserRuleCall_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__ThingIdAssignment_1_1_1"


    // $ANTLR start "rule__ModelThing__LabelAssignment_2"
    // InternalThing.g:3217:1: rule__ModelThing__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ModelThing__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:3221:1: ( ( RULE_STRING ) )
            // InternalThing.g:3222:2: ( RULE_STRING )
            {
            // InternalThing.g:3222:2: ( RULE_STRING )
            // InternalThing.g:3223:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelThingAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelThingAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__LabelAssignment_2"


    // $ANTLR start "rule__ModelThing__BridgeUIDAssignment_3_1"
    // InternalThing.g:3232:1: rule__ModelThing__BridgeUIDAssignment_3_1 : ( ruleUID ) ;
    public final void rule__ModelThing__BridgeUIDAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:3236:1: ( ( ruleUID ) )
            // InternalThing.g:3237:2: ( ruleUID )
            {
            // InternalThing.g:3237:2: ( ruleUID )
            // InternalThing.g:3238:3: ruleUID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelThingAccess().getBridgeUIDUIDParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleUID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelThingAccess().getBridgeUIDUIDParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__BridgeUIDAssignment_3_1"


    // $ANTLR start "rule__ModelThing__LocationAssignment_4_1"
    // InternalThing.g:3247:1: rule__ModelThing__LocationAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__ModelThing__LocationAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:3251:1: ( ( RULE_STRING ) )
            // InternalThing.g:3252:2: ( RULE_STRING )
            {
            // InternalThing.g:3252:2: ( RULE_STRING )
            // InternalThing.g:3253:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelThingAccess().getLocationSTRINGTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelThingAccess().getLocationSTRINGTerminalRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__LocationAssignment_4_1"


    // $ANTLR start "rule__ModelThing__PropertiesAssignment_5_1"
    // InternalThing.g:3262:1: rule__ModelThing__PropertiesAssignment_5_1 : ( ruleModelProperty ) ;
    public final void rule__ModelThing__PropertiesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:3266:1: ( ( ruleModelProperty ) )
            // InternalThing.g:3267:2: ( ruleModelProperty )
            {
            // InternalThing.g:3267:2: ( ruleModelProperty )
            // InternalThing.g:3268:3: ruleModelProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelThingAccess().getPropertiesModelPropertyParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleModelProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelThingAccess().getPropertiesModelPropertyParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__PropertiesAssignment_5_1"


    // $ANTLR start "rule__ModelThing__PropertiesAssignment_5_2_1"
    // InternalThing.g:3277:1: rule__ModelThing__PropertiesAssignment_5_2_1 : ( ruleModelProperty ) ;
    public final void rule__ModelThing__PropertiesAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:3281:1: ( ( ruleModelProperty ) )
            // InternalThing.g:3282:2: ( ruleModelProperty )
            {
            // InternalThing.g:3282:2: ( ruleModelProperty )
            // InternalThing.g:3283:3: ruleModelProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelThingAccess().getPropertiesModelPropertyParserRuleCall_5_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleModelProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelThingAccess().getPropertiesModelPropertyParserRuleCall_5_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__PropertiesAssignment_5_2_1"


    // $ANTLR start "rule__ModelThing__ChannelsAssignment_6_2"
    // InternalThing.g:3292:1: rule__ModelThing__ChannelsAssignment_6_2 : ( ruleModelChannel ) ;
    public final void rule__ModelThing__ChannelsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:3296:1: ( ( ruleModelChannel ) )
            // InternalThing.g:3297:2: ( ruleModelChannel )
            {
            // InternalThing.g:3297:2: ( ruleModelChannel )
            // InternalThing.g:3298:3: ruleModelChannel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelThingAccess().getChannelsModelChannelParserRuleCall_6_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleModelChannel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelThingAccess().getChannelsModelChannelParserRuleCall_6_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelThing__ChannelsAssignment_6_2"


    // $ANTLR start "rule__ModelChannel__ChannelKindAssignment_0_0_0"
    // InternalThing.g:3307:1: rule__ModelChannel__ChannelKindAssignment_0_0_0 : ( ( rule__ModelChannel__ChannelKindAlternatives_0_0_0_0 ) ) ;
    public final void rule__ModelChannel__ChannelKindAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:3311:1: ( ( ( rule__ModelChannel__ChannelKindAlternatives_0_0_0_0 ) ) )
            // InternalThing.g:3312:2: ( ( rule__ModelChannel__ChannelKindAlternatives_0_0_0_0 ) )
            {
            // InternalThing.g:3312:2: ( ( rule__ModelChannel__ChannelKindAlternatives_0_0_0_0 ) )
            // InternalThing.g:3313:3: ( rule__ModelChannel__ChannelKindAlternatives_0_0_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelChannelAccess().getChannelKindAlternatives_0_0_0_0()); 
            }
            // InternalThing.g:3314:3: ( rule__ModelChannel__ChannelKindAlternatives_0_0_0_0 )
            // InternalThing.g:3314:4: rule__ModelChannel__ChannelKindAlternatives_0_0_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ModelChannel__ChannelKindAlternatives_0_0_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelChannelAccess().getChannelKindAlternatives_0_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelChannel__ChannelKindAssignment_0_0_0"


    // $ANTLR start "rule__ModelChannel__TypeAssignment_0_0_1"
    // InternalThing.g:3322:1: rule__ModelChannel__TypeAssignment_0_0_1 : ( ruleModelItemType ) ;
    public final void rule__ModelChannel__TypeAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:3326:1: ( ( ruleModelItemType ) )
            // InternalThing.g:3327:2: ( ruleModelItemType )
            {
            // InternalThing.g:3327:2: ( ruleModelItemType )
            // InternalThing.g:3328:3: ruleModelItemType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelChannelAccess().getTypeModelItemTypeParserRuleCall_0_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleModelItemType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelChannelAccess().getTypeModelItemTypeParserRuleCall_0_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelChannel__TypeAssignment_0_0_1"


    // $ANTLR start "rule__ModelChannel__ChannelTypeAssignment_0_1_1"
    // InternalThing.g:3337:1: rule__ModelChannel__ChannelTypeAssignment_0_1_1 : ( ruleUID_SEGMENT ) ;
    public final void rule__ModelChannel__ChannelTypeAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:3341:1: ( ( ruleUID_SEGMENT ) )
            // InternalThing.g:3342:2: ( ruleUID_SEGMENT )
            {
            // InternalThing.g:3342:2: ( ruleUID_SEGMENT )
            // InternalThing.g:3343:3: ruleUID_SEGMENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelChannelAccess().getChannelTypeUID_SEGMENTParserRuleCall_0_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleUID_SEGMENT();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelChannelAccess().getChannelTypeUID_SEGMENTParserRuleCall_0_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelChannel__ChannelTypeAssignment_0_1_1"


    // $ANTLR start "rule__ModelChannel__IdAssignment_2"
    // InternalThing.g:3352:1: rule__ModelChannel__IdAssignment_2 : ( ruleCHANNEL_ID ) ;
    public final void rule__ModelChannel__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:3356:1: ( ( ruleCHANNEL_ID ) )
            // InternalThing.g:3357:2: ( ruleCHANNEL_ID )
            {
            // InternalThing.g:3357:2: ( ruleCHANNEL_ID )
            // InternalThing.g:3358:3: ruleCHANNEL_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelChannelAccess().getIdCHANNEL_IDParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCHANNEL_ID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelChannelAccess().getIdCHANNEL_IDParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelChannel__IdAssignment_2"


    // $ANTLR start "rule__ModelChannel__LabelAssignment_3"
    // InternalThing.g:3367:1: rule__ModelChannel__LabelAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ModelChannel__LabelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:3371:1: ( ( RULE_STRING ) )
            // InternalThing.g:3372:2: ( RULE_STRING )
            {
            // InternalThing.g:3372:2: ( RULE_STRING )
            // InternalThing.g:3373:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelChannelAccess().getLabelSTRINGTerminalRuleCall_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelChannelAccess().getLabelSTRINGTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelChannel__LabelAssignment_3"


    // $ANTLR start "rule__ModelChannel__PropertiesAssignment_4_1"
    // InternalThing.g:3382:1: rule__ModelChannel__PropertiesAssignment_4_1 : ( ruleModelProperty ) ;
    public final void rule__ModelChannel__PropertiesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:3386:1: ( ( ruleModelProperty ) )
            // InternalThing.g:3387:2: ( ruleModelProperty )
            {
            // InternalThing.g:3387:2: ( ruleModelProperty )
            // InternalThing.g:3388:3: ruleModelProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelChannelAccess().getPropertiesModelPropertyParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleModelProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelChannelAccess().getPropertiesModelPropertyParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelChannel__PropertiesAssignment_4_1"


    // $ANTLR start "rule__ModelChannel__PropertiesAssignment_4_2_1"
    // InternalThing.g:3397:1: rule__ModelChannel__PropertiesAssignment_4_2_1 : ( ruleModelProperty ) ;
    public final void rule__ModelChannel__PropertiesAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:3401:1: ( ( ruleModelProperty ) )
            // InternalThing.g:3402:2: ( ruleModelProperty )
            {
            // InternalThing.g:3402:2: ( ruleModelProperty )
            // InternalThing.g:3403:3: ruleModelProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelChannelAccess().getPropertiesModelPropertyParserRuleCall_4_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleModelProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelChannelAccess().getPropertiesModelPropertyParserRuleCall_4_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelChannel__PropertiesAssignment_4_2_1"


    // $ANTLR start "rule__ModelProperty__KeyAssignment_0"
    // InternalThing.g:3412:1: rule__ModelProperty__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__ModelProperty__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:3416:1: ( ( RULE_ID ) )
            // InternalThing.g:3417:2: ( RULE_ID )
            {
            // InternalThing.g:3417:2: ( RULE_ID )
            // InternalThing.g:3418:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelPropertyAccess().getKeyIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelPropertyAccess().getKeyIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperty__KeyAssignment_0"


    // $ANTLR start "rule__ModelProperty__ValueAssignment_2"
    // InternalThing.g:3427:1: rule__ModelProperty__ValueAssignment_2 : ( ruleValueType ) ;
    public final void rule__ModelProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:3431:1: ( ( ruleValueType ) )
            // InternalThing.g:3432:2: ( ruleValueType )
            {
            // InternalThing.g:3432:2: ( ruleValueType )
            // InternalThing.g:3433:3: ruleValueType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelPropertyAccess().getValueValueTypeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValueType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelPropertyAccess().getValueValueTypeParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperty__ValueAssignment_2"


    // $ANTLR start "rule__ModelProperty__ValueAssignment_3_1"
    // InternalThing.g:3442:1: rule__ModelProperty__ValueAssignment_3_1 : ( ruleValueType ) ;
    public final void rule__ModelProperty__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThing.g:3446:1: ( ( ruleValueType ) )
            // InternalThing.g:3447:2: ( ruleValueType )
            {
            // InternalThing.g:3447:2: ( ruleValueType )
            // InternalThing.g:3448:3: ruleValueType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelPropertyAccess().getValueValueTypeParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValueType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelPropertyAccess().getValueValueTypeParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperty__ValueAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000100400000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000100400000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000004C000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000030000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000010C780FFFC10L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000C000FFFC02L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000084C000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000C300FFFC00L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000008000FFFC00L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000040003000030L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000080000000000L});

}