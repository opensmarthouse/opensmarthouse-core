package org.openhab.core.model.persistence.ide.contentassist.antlr.internal;

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
import org.openhab.core.model.persistence.services.PersistenceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPersistenceParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'s'", "'m'", "'h'", "'d'", "';'", "'Strategies'", "'{'", "'}'", "'default'", "'='", "','", "'Filters'", "'Items'", "':'", "'>'", "'->'", "'strategy'", "'filter'", "'*'", "'.'", "'%'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPersistenceParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPersistenceParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPersistenceParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPersistence.g"; }


    	private PersistenceGrammarAccess grammarAccess;

    	public void setGrammarAccess(PersistenceGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRulePersistenceModel"
    // InternalPersistence.g:53:1: entryRulePersistenceModel : rulePersistenceModel EOF ;
    public final void entryRulePersistenceModel() throws RecognitionException {
        try {
            // InternalPersistence.g:54:1: ( rulePersistenceModel EOF )
            // InternalPersistence.g:55:1: rulePersistenceModel EOF
            {
             before(grammarAccess.getPersistenceModelRule()); 
            pushFollow(FOLLOW_1);
            rulePersistenceModel();

            state._fsp--;

             after(grammarAccess.getPersistenceModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePersistenceModel"


    // $ANTLR start "rulePersistenceModel"
    // InternalPersistence.g:62:1: rulePersistenceModel : ( ( rule__PersistenceModel__Group__0 ) ) ;
    public final void rulePersistenceModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:66:2: ( ( ( rule__PersistenceModel__Group__0 ) ) )
            // InternalPersistence.g:67:2: ( ( rule__PersistenceModel__Group__0 ) )
            {
            // InternalPersistence.g:67:2: ( ( rule__PersistenceModel__Group__0 ) )
            // InternalPersistence.g:68:3: ( rule__PersistenceModel__Group__0 )
            {
             before(grammarAccess.getPersistenceModelAccess().getGroup()); 
            // InternalPersistence.g:69:3: ( rule__PersistenceModel__Group__0 )
            // InternalPersistence.g:69:4: rule__PersistenceModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PersistenceModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPersistenceModelAccess().getGroup()); 

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
    // $ANTLR end "rulePersistenceModel"


    // $ANTLR start "entryRuleStrategy"
    // InternalPersistence.g:78:1: entryRuleStrategy : ruleStrategy EOF ;
    public final void entryRuleStrategy() throws RecognitionException {
        try {
            // InternalPersistence.g:79:1: ( ruleStrategy EOF )
            // InternalPersistence.g:80:1: ruleStrategy EOF
            {
             before(grammarAccess.getStrategyRule()); 
            pushFollow(FOLLOW_1);
            ruleStrategy();

            state._fsp--;

             after(grammarAccess.getStrategyRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStrategy"


    // $ANTLR start "ruleStrategy"
    // InternalPersistence.g:87:1: ruleStrategy : ( ( rule__Strategy__Alternatives ) ) ;
    public final void ruleStrategy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:91:2: ( ( ( rule__Strategy__Alternatives ) ) )
            // InternalPersistence.g:92:2: ( ( rule__Strategy__Alternatives ) )
            {
            // InternalPersistence.g:92:2: ( ( rule__Strategy__Alternatives ) )
            // InternalPersistence.g:93:3: ( rule__Strategy__Alternatives )
            {
             before(grammarAccess.getStrategyAccess().getAlternatives()); 
            // InternalPersistence.g:94:3: ( rule__Strategy__Alternatives )
            // InternalPersistence.g:94:4: rule__Strategy__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Strategy__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStrategyAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStrategy"


    // $ANTLR start "entryRuleCronStrategy"
    // InternalPersistence.g:103:1: entryRuleCronStrategy : ruleCronStrategy EOF ;
    public final void entryRuleCronStrategy() throws RecognitionException {
        try {
            // InternalPersistence.g:104:1: ( ruleCronStrategy EOF )
            // InternalPersistence.g:105:1: ruleCronStrategy EOF
            {
             before(grammarAccess.getCronStrategyRule()); 
            pushFollow(FOLLOW_1);
            ruleCronStrategy();

            state._fsp--;

             after(grammarAccess.getCronStrategyRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCronStrategy"


    // $ANTLR start "ruleCronStrategy"
    // InternalPersistence.g:112:1: ruleCronStrategy : ( ( rule__CronStrategy__Group__0 ) ) ;
    public final void ruleCronStrategy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:116:2: ( ( ( rule__CronStrategy__Group__0 ) ) )
            // InternalPersistence.g:117:2: ( ( rule__CronStrategy__Group__0 ) )
            {
            // InternalPersistence.g:117:2: ( ( rule__CronStrategy__Group__0 ) )
            // InternalPersistence.g:118:3: ( rule__CronStrategy__Group__0 )
            {
             before(grammarAccess.getCronStrategyAccess().getGroup()); 
            // InternalPersistence.g:119:3: ( rule__CronStrategy__Group__0 )
            // InternalPersistence.g:119:4: rule__CronStrategy__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CronStrategy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCronStrategyAccess().getGroup()); 

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
    // $ANTLR end "ruleCronStrategy"


    // $ANTLR start "entryRuleFilter"
    // InternalPersistence.g:128:1: entryRuleFilter : ruleFilter EOF ;
    public final void entryRuleFilter() throws RecognitionException {
        try {
            // InternalPersistence.g:129:1: ( ruleFilter EOF )
            // InternalPersistence.g:130:1: ruleFilter EOF
            {
             before(grammarAccess.getFilterRule()); 
            pushFollow(FOLLOW_1);
            ruleFilter();

            state._fsp--;

             after(grammarAccess.getFilterRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // InternalPersistence.g:137:1: ruleFilter : ( ( rule__Filter__Group__0 ) ) ;
    public final void ruleFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:141:2: ( ( ( rule__Filter__Group__0 ) ) )
            // InternalPersistence.g:142:2: ( ( rule__Filter__Group__0 ) )
            {
            // InternalPersistence.g:142:2: ( ( rule__Filter__Group__0 ) )
            // InternalPersistence.g:143:3: ( rule__Filter__Group__0 )
            {
             before(grammarAccess.getFilterAccess().getGroup()); 
            // InternalPersistence.g:144:3: ( rule__Filter__Group__0 )
            // InternalPersistence.g:144:4: rule__Filter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Filter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFilterAccess().getGroup()); 

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
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleFilterDetails"
    // InternalPersistence.g:153:1: entryRuleFilterDetails : ruleFilterDetails EOF ;
    public final void entryRuleFilterDetails() throws RecognitionException {
        try {
            // InternalPersistence.g:154:1: ( ruleFilterDetails EOF )
            // InternalPersistence.g:155:1: ruleFilterDetails EOF
            {
             before(grammarAccess.getFilterDetailsRule()); 
            pushFollow(FOLLOW_1);
            ruleFilterDetails();

            state._fsp--;

             after(grammarAccess.getFilterDetailsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFilterDetails"


    // $ANTLR start "ruleFilterDetails"
    // InternalPersistence.g:162:1: ruleFilterDetails : ( ( rule__FilterDetails__Alternatives ) ) ;
    public final void ruleFilterDetails() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:166:2: ( ( ( rule__FilterDetails__Alternatives ) ) )
            // InternalPersistence.g:167:2: ( ( rule__FilterDetails__Alternatives ) )
            {
            // InternalPersistence.g:167:2: ( ( rule__FilterDetails__Alternatives ) )
            // InternalPersistence.g:168:3: ( rule__FilterDetails__Alternatives )
            {
             before(grammarAccess.getFilterDetailsAccess().getAlternatives()); 
            // InternalPersistence.g:169:3: ( rule__FilterDetails__Alternatives )
            // InternalPersistence.g:169:4: rule__FilterDetails__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FilterDetails__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFilterDetailsAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFilterDetails"


    // $ANTLR start "entryRuleThresholdFilter"
    // InternalPersistence.g:178:1: entryRuleThresholdFilter : ruleThresholdFilter EOF ;
    public final void entryRuleThresholdFilter() throws RecognitionException {
        try {
            // InternalPersistence.g:179:1: ( ruleThresholdFilter EOF )
            // InternalPersistence.g:180:1: ruleThresholdFilter EOF
            {
             before(grammarAccess.getThresholdFilterRule()); 
            pushFollow(FOLLOW_1);
            ruleThresholdFilter();

            state._fsp--;

             after(grammarAccess.getThresholdFilterRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleThresholdFilter"


    // $ANTLR start "ruleThresholdFilter"
    // InternalPersistence.g:187:1: ruleThresholdFilter : ( ( rule__ThresholdFilter__Group__0 ) ) ;
    public final void ruleThresholdFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:191:2: ( ( ( rule__ThresholdFilter__Group__0 ) ) )
            // InternalPersistence.g:192:2: ( ( rule__ThresholdFilter__Group__0 ) )
            {
            // InternalPersistence.g:192:2: ( ( rule__ThresholdFilter__Group__0 ) )
            // InternalPersistence.g:193:3: ( rule__ThresholdFilter__Group__0 )
            {
             before(grammarAccess.getThresholdFilterAccess().getGroup()); 
            // InternalPersistence.g:194:3: ( rule__ThresholdFilter__Group__0 )
            // InternalPersistence.g:194:4: rule__ThresholdFilter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ThresholdFilter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getThresholdFilterAccess().getGroup()); 

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
    // $ANTLR end "ruleThresholdFilter"


    // $ANTLR start "entryRuleTimeFilter"
    // InternalPersistence.g:203:1: entryRuleTimeFilter : ruleTimeFilter EOF ;
    public final void entryRuleTimeFilter() throws RecognitionException {
        try {
            // InternalPersistence.g:204:1: ( ruleTimeFilter EOF )
            // InternalPersistence.g:205:1: ruleTimeFilter EOF
            {
             before(grammarAccess.getTimeFilterRule()); 
            pushFollow(FOLLOW_1);
            ruleTimeFilter();

            state._fsp--;

             after(grammarAccess.getTimeFilterRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTimeFilter"


    // $ANTLR start "ruleTimeFilter"
    // InternalPersistence.g:212:1: ruleTimeFilter : ( ( rule__TimeFilter__Group__0 ) ) ;
    public final void ruleTimeFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:216:2: ( ( ( rule__TimeFilter__Group__0 ) ) )
            // InternalPersistence.g:217:2: ( ( rule__TimeFilter__Group__0 ) )
            {
            // InternalPersistence.g:217:2: ( ( rule__TimeFilter__Group__0 ) )
            // InternalPersistence.g:218:3: ( rule__TimeFilter__Group__0 )
            {
             before(grammarAccess.getTimeFilterAccess().getGroup()); 
            // InternalPersistence.g:219:3: ( rule__TimeFilter__Group__0 )
            // InternalPersistence.g:219:4: rule__TimeFilter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TimeFilter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimeFilterAccess().getGroup()); 

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
    // $ANTLR end "ruleTimeFilter"


    // $ANTLR start "entryRulePersistenceConfiguration"
    // InternalPersistence.g:228:1: entryRulePersistenceConfiguration : rulePersistenceConfiguration EOF ;
    public final void entryRulePersistenceConfiguration() throws RecognitionException {
        try {
            // InternalPersistence.g:229:1: ( rulePersistenceConfiguration EOF )
            // InternalPersistence.g:230:1: rulePersistenceConfiguration EOF
            {
             before(grammarAccess.getPersistenceConfigurationRule()); 
            pushFollow(FOLLOW_1);
            rulePersistenceConfiguration();

            state._fsp--;

             after(grammarAccess.getPersistenceConfigurationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePersistenceConfiguration"


    // $ANTLR start "rulePersistenceConfiguration"
    // InternalPersistence.g:237:1: rulePersistenceConfiguration : ( ( rule__PersistenceConfiguration__Group__0 ) ) ;
    public final void rulePersistenceConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:241:2: ( ( ( rule__PersistenceConfiguration__Group__0 ) ) )
            // InternalPersistence.g:242:2: ( ( rule__PersistenceConfiguration__Group__0 ) )
            {
            // InternalPersistence.g:242:2: ( ( rule__PersistenceConfiguration__Group__0 ) )
            // InternalPersistence.g:243:3: ( rule__PersistenceConfiguration__Group__0 )
            {
             before(grammarAccess.getPersistenceConfigurationAccess().getGroup()); 
            // InternalPersistence.g:244:3: ( rule__PersistenceConfiguration__Group__0 )
            // InternalPersistence.g:244:4: rule__PersistenceConfiguration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PersistenceConfiguration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPersistenceConfigurationAccess().getGroup()); 

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
    // $ANTLR end "rulePersistenceConfiguration"


    // $ANTLR start "entryRuleAllConfig"
    // InternalPersistence.g:253:1: entryRuleAllConfig : ruleAllConfig EOF ;
    public final void entryRuleAllConfig() throws RecognitionException {
        try {
            // InternalPersistence.g:254:1: ( ruleAllConfig EOF )
            // InternalPersistence.g:255:1: ruleAllConfig EOF
            {
             before(grammarAccess.getAllConfigRule()); 
            pushFollow(FOLLOW_1);
            ruleAllConfig();

            state._fsp--;

             after(grammarAccess.getAllConfigRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAllConfig"


    // $ANTLR start "ruleAllConfig"
    // InternalPersistence.g:262:1: ruleAllConfig : ( ( rule__AllConfig__Group__0 ) ) ;
    public final void ruleAllConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:266:2: ( ( ( rule__AllConfig__Group__0 ) ) )
            // InternalPersistence.g:267:2: ( ( rule__AllConfig__Group__0 ) )
            {
            // InternalPersistence.g:267:2: ( ( rule__AllConfig__Group__0 ) )
            // InternalPersistence.g:268:3: ( rule__AllConfig__Group__0 )
            {
             before(grammarAccess.getAllConfigAccess().getGroup()); 
            // InternalPersistence.g:269:3: ( rule__AllConfig__Group__0 )
            // InternalPersistence.g:269:4: rule__AllConfig__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AllConfig__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAllConfigAccess().getGroup()); 

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
    // $ANTLR end "ruleAllConfig"


    // $ANTLR start "entryRuleItemConfig"
    // InternalPersistence.g:278:1: entryRuleItemConfig : ruleItemConfig EOF ;
    public final void entryRuleItemConfig() throws RecognitionException {
        try {
            // InternalPersistence.g:279:1: ( ruleItemConfig EOF )
            // InternalPersistence.g:280:1: ruleItemConfig EOF
            {
             before(grammarAccess.getItemConfigRule()); 
            pushFollow(FOLLOW_1);
            ruleItemConfig();

            state._fsp--;

             after(grammarAccess.getItemConfigRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleItemConfig"


    // $ANTLR start "ruleItemConfig"
    // InternalPersistence.g:287:1: ruleItemConfig : ( ( rule__ItemConfig__ItemAssignment ) ) ;
    public final void ruleItemConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:291:2: ( ( ( rule__ItemConfig__ItemAssignment ) ) )
            // InternalPersistence.g:292:2: ( ( rule__ItemConfig__ItemAssignment ) )
            {
            // InternalPersistence.g:292:2: ( ( rule__ItemConfig__ItemAssignment ) )
            // InternalPersistence.g:293:3: ( rule__ItemConfig__ItemAssignment )
            {
             before(grammarAccess.getItemConfigAccess().getItemAssignment()); 
            // InternalPersistence.g:294:3: ( rule__ItemConfig__ItemAssignment )
            // InternalPersistence.g:294:4: rule__ItemConfig__ItemAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ItemConfig__ItemAssignment();

            state._fsp--;


            }

             after(grammarAccess.getItemConfigAccess().getItemAssignment()); 

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
    // $ANTLR end "ruleItemConfig"


    // $ANTLR start "entryRuleGroupConfig"
    // InternalPersistence.g:303:1: entryRuleGroupConfig : ruleGroupConfig EOF ;
    public final void entryRuleGroupConfig() throws RecognitionException {
        try {
            // InternalPersistence.g:304:1: ( ruleGroupConfig EOF )
            // InternalPersistence.g:305:1: ruleGroupConfig EOF
            {
             before(grammarAccess.getGroupConfigRule()); 
            pushFollow(FOLLOW_1);
            ruleGroupConfig();

            state._fsp--;

             after(grammarAccess.getGroupConfigRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGroupConfig"


    // $ANTLR start "ruleGroupConfig"
    // InternalPersistence.g:312:1: ruleGroupConfig : ( ( rule__GroupConfig__Group__0 ) ) ;
    public final void ruleGroupConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:316:2: ( ( ( rule__GroupConfig__Group__0 ) ) )
            // InternalPersistence.g:317:2: ( ( rule__GroupConfig__Group__0 ) )
            {
            // InternalPersistence.g:317:2: ( ( rule__GroupConfig__Group__0 ) )
            // InternalPersistence.g:318:3: ( rule__GroupConfig__Group__0 )
            {
             before(grammarAccess.getGroupConfigAccess().getGroup()); 
            // InternalPersistence.g:319:3: ( rule__GroupConfig__Group__0 )
            // InternalPersistence.g:319:4: rule__GroupConfig__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GroupConfig__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupConfigAccess().getGroup()); 

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
    // $ANTLR end "ruleGroupConfig"


    // $ANTLR start "entryRuleDECIMAL"
    // InternalPersistence.g:328:1: entryRuleDECIMAL : ruleDECIMAL EOF ;
    public final void entryRuleDECIMAL() throws RecognitionException {
        try {
            // InternalPersistence.g:329:1: ( ruleDECIMAL EOF )
            // InternalPersistence.g:330:1: ruleDECIMAL EOF
            {
             before(grammarAccess.getDECIMALRule()); 
            pushFollow(FOLLOW_1);
            ruleDECIMAL();

            state._fsp--;

             after(grammarAccess.getDECIMALRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDECIMAL"


    // $ANTLR start "ruleDECIMAL"
    // InternalPersistence.g:337:1: ruleDECIMAL : ( ( rule__DECIMAL__Group__0 ) ) ;
    public final void ruleDECIMAL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:341:2: ( ( ( rule__DECIMAL__Group__0 ) ) )
            // InternalPersistence.g:342:2: ( ( rule__DECIMAL__Group__0 ) )
            {
            // InternalPersistence.g:342:2: ( ( rule__DECIMAL__Group__0 ) )
            // InternalPersistence.g:343:3: ( rule__DECIMAL__Group__0 )
            {
             before(grammarAccess.getDECIMALAccess().getGroup()); 
            // InternalPersistence.g:344:3: ( rule__DECIMAL__Group__0 )
            // InternalPersistence.g:344:4: rule__DECIMAL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DECIMAL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDECIMALAccess().getGroup()); 

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
    // $ANTLR end "ruleDECIMAL"


    // $ANTLR start "rule__Strategy__Alternatives"
    // InternalPersistence.g:352:1: rule__Strategy__Alternatives : ( ( ruleCronStrategy ) | ( ( rule__Strategy__NameAssignment_1 ) ) );
    public final void rule__Strategy__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:356:1: ( ( ruleCronStrategy ) | ( ( rule__Strategy__NameAssignment_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==EOF||LA1_1==RULE_ID||(LA1_1>=18 && LA1_1<=19)) ) {
                    alt1=2;
                }
                else if ( (LA1_1==24) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalPersistence.g:357:2: ( ruleCronStrategy )
                    {
                    // InternalPersistence.g:357:2: ( ruleCronStrategy )
                    // InternalPersistence.g:358:3: ruleCronStrategy
                    {
                     before(grammarAccess.getStrategyAccess().getCronStrategyParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCronStrategy();

                    state._fsp--;

                     after(grammarAccess.getStrategyAccess().getCronStrategyParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPersistence.g:363:2: ( ( rule__Strategy__NameAssignment_1 ) )
                    {
                    // InternalPersistence.g:363:2: ( ( rule__Strategy__NameAssignment_1 ) )
                    // InternalPersistence.g:364:3: ( rule__Strategy__NameAssignment_1 )
                    {
                     before(grammarAccess.getStrategyAccess().getNameAssignment_1()); 
                    // InternalPersistence.g:365:3: ( rule__Strategy__NameAssignment_1 )
                    // InternalPersistence.g:365:4: rule__Strategy__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Strategy__NameAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getStrategyAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Strategy__Alternatives"


    // $ANTLR start "rule__FilterDetails__Alternatives"
    // InternalPersistence.g:373:1: rule__FilterDetails__Alternatives : ( ( ruleThresholdFilter ) | ( ruleTimeFilter ) );
    public final void rule__FilterDetails__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:377:1: ( ( ruleThresholdFilter ) | ( ruleTimeFilter ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==25) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_INT) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalPersistence.g:378:2: ( ruleThresholdFilter )
                    {
                    // InternalPersistence.g:378:2: ( ruleThresholdFilter )
                    // InternalPersistence.g:379:3: ruleThresholdFilter
                    {
                     before(grammarAccess.getFilterDetailsAccess().getThresholdFilterParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleThresholdFilter();

                    state._fsp--;

                     after(grammarAccess.getFilterDetailsAccess().getThresholdFilterParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPersistence.g:384:2: ( ruleTimeFilter )
                    {
                    // InternalPersistence.g:384:2: ( ruleTimeFilter )
                    // InternalPersistence.g:385:3: ruleTimeFilter
                    {
                     before(grammarAccess.getFilterDetailsAccess().getTimeFilterParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTimeFilter();

                    state._fsp--;

                     after(grammarAccess.getFilterDetailsAccess().getTimeFilterParserRuleCall_1()); 

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
    // $ANTLR end "rule__FilterDetails__Alternatives"


    // $ANTLR start "rule__TimeFilter__UnitAlternatives_1_0"
    // InternalPersistence.g:394:1: rule__TimeFilter__UnitAlternatives_1_0 : ( ( 's' ) | ( 'm' ) | ( 'h' ) | ( 'd' ) );
    public final void rule__TimeFilter__UnitAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:398:1: ( ( 's' ) | ( 'm' ) | ( 'h' ) | ( 'd' ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalPersistence.g:399:2: ( 's' )
                    {
                    // InternalPersistence.g:399:2: ( 's' )
                    // InternalPersistence.g:400:3: 's'
                    {
                     before(grammarAccess.getTimeFilterAccess().getUnitSKeyword_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getTimeFilterAccess().getUnitSKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPersistence.g:405:2: ( 'm' )
                    {
                    // InternalPersistence.g:405:2: ( 'm' )
                    // InternalPersistence.g:406:3: 'm'
                    {
                     before(grammarAccess.getTimeFilterAccess().getUnitMKeyword_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getTimeFilterAccess().getUnitMKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPersistence.g:411:2: ( 'h' )
                    {
                    // InternalPersistence.g:411:2: ( 'h' )
                    // InternalPersistence.g:412:3: 'h'
                    {
                     before(grammarAccess.getTimeFilterAccess().getUnitHKeyword_1_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getTimeFilterAccess().getUnitHKeyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPersistence.g:417:2: ( 'd' )
                    {
                    // InternalPersistence.g:417:2: ( 'd' )
                    // InternalPersistence.g:418:3: 'd'
                    {
                     before(grammarAccess.getTimeFilterAccess().getUnitDKeyword_1_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getTimeFilterAccess().getUnitDKeyword_1_0_3()); 

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
    // $ANTLR end "rule__TimeFilter__UnitAlternatives_1_0"


    // $ANTLR start "rule__PersistenceConfiguration__ItemsAlternatives_0_0"
    // InternalPersistence.g:427:1: rule__PersistenceConfiguration__ItemsAlternatives_0_0 : ( ( ruleAllConfig ) | ( ruleItemConfig ) | ( ruleGroupConfig ) );
    public final void rule__PersistenceConfiguration__ItemsAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:431:1: ( ( ruleAllConfig ) | ( ruleItemConfig ) | ( ruleGroupConfig ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==29) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==15||LA4_2==21||LA4_2==24||LA4_2==26) ) {
                    alt4=2;
                }
                else if ( (LA4_2==29) ) {
                    alt4=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPersistence.g:432:2: ( ruleAllConfig )
                    {
                    // InternalPersistence.g:432:2: ( ruleAllConfig )
                    // InternalPersistence.g:433:3: ruleAllConfig
                    {
                     before(grammarAccess.getPersistenceConfigurationAccess().getItemsAllConfigParserRuleCall_0_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAllConfig();

                    state._fsp--;

                     after(grammarAccess.getPersistenceConfigurationAccess().getItemsAllConfigParserRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPersistence.g:438:2: ( ruleItemConfig )
                    {
                    // InternalPersistence.g:438:2: ( ruleItemConfig )
                    // InternalPersistence.g:439:3: ruleItemConfig
                    {
                     before(grammarAccess.getPersistenceConfigurationAccess().getItemsItemConfigParserRuleCall_0_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleItemConfig();

                    state._fsp--;

                     after(grammarAccess.getPersistenceConfigurationAccess().getItemsItemConfigParserRuleCall_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPersistence.g:444:2: ( ruleGroupConfig )
                    {
                    // InternalPersistence.g:444:2: ( ruleGroupConfig )
                    // InternalPersistence.g:445:3: ruleGroupConfig
                    {
                     before(grammarAccess.getPersistenceConfigurationAccess().getItemsGroupConfigParserRuleCall_0_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleGroupConfig();

                    state._fsp--;

                     after(grammarAccess.getPersistenceConfigurationAccess().getItemsGroupConfigParserRuleCall_0_0_2()); 

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
    // $ANTLR end "rule__PersistenceConfiguration__ItemsAlternatives_0_0"


    // $ANTLR start "rule__PersistenceConfiguration__ItemsAlternatives_1_1_0"
    // InternalPersistence.g:454:1: rule__PersistenceConfiguration__ItemsAlternatives_1_1_0 : ( ( ruleAllConfig ) | ( ruleItemConfig ) | ( ruleGroupConfig ) );
    public final void rule__PersistenceConfiguration__ItemsAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:458:1: ( ( ruleAllConfig ) | ( ruleItemConfig ) | ( ruleGroupConfig ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==29) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==15||LA5_2==21||LA5_2==24||LA5_2==26) ) {
                    alt5=2;
                }
                else if ( (LA5_2==29) ) {
                    alt5=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalPersistence.g:459:2: ( ruleAllConfig )
                    {
                    // InternalPersistence.g:459:2: ( ruleAllConfig )
                    // InternalPersistence.g:460:3: ruleAllConfig
                    {
                     before(grammarAccess.getPersistenceConfigurationAccess().getItemsAllConfigParserRuleCall_1_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAllConfig();

                    state._fsp--;

                     after(grammarAccess.getPersistenceConfigurationAccess().getItemsAllConfigParserRuleCall_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPersistence.g:465:2: ( ruleItemConfig )
                    {
                    // InternalPersistence.g:465:2: ( ruleItemConfig )
                    // InternalPersistence.g:466:3: ruleItemConfig
                    {
                     before(grammarAccess.getPersistenceConfigurationAccess().getItemsItemConfigParserRuleCall_1_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleItemConfig();

                    state._fsp--;

                     after(grammarAccess.getPersistenceConfigurationAccess().getItemsItemConfigParserRuleCall_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPersistence.g:471:2: ( ruleGroupConfig )
                    {
                    // InternalPersistence.g:471:2: ( ruleGroupConfig )
                    // InternalPersistence.g:472:3: ruleGroupConfig
                    {
                     before(grammarAccess.getPersistenceConfigurationAccess().getItemsGroupConfigParserRuleCall_1_1_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleGroupConfig();

                    state._fsp--;

                     after(grammarAccess.getPersistenceConfigurationAccess().getItemsGroupConfigParserRuleCall_1_1_0_2()); 

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
    // $ANTLR end "rule__PersistenceConfiguration__ItemsAlternatives_1_1_0"


    // $ANTLR start "rule__PersistenceConfiguration__Alternatives_3"
    // InternalPersistence.g:481:1: rule__PersistenceConfiguration__Alternatives_3 : ( ( ( rule__PersistenceConfiguration__Group_3_0__0 ) ) | ( ';' ) );
    public final void rule__PersistenceConfiguration__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:485:1: ( ( ( rule__PersistenceConfiguration__Group_3_0__0 ) ) | ( ';' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            else if ( (LA6_0==15) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalPersistence.g:486:2: ( ( rule__PersistenceConfiguration__Group_3_0__0 ) )
                    {
                    // InternalPersistence.g:486:2: ( ( rule__PersistenceConfiguration__Group_3_0__0 ) )
                    // InternalPersistence.g:487:3: ( rule__PersistenceConfiguration__Group_3_0__0 )
                    {
                     before(grammarAccess.getPersistenceConfigurationAccess().getGroup_3_0()); 
                    // InternalPersistence.g:488:3: ( rule__PersistenceConfiguration__Group_3_0__0 )
                    // InternalPersistence.g:488:4: rule__PersistenceConfiguration__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PersistenceConfiguration__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPersistenceConfigurationAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPersistence.g:492:2: ( ';' )
                    {
                    // InternalPersistence.g:492:2: ( ';' )
                    // InternalPersistence.g:493:3: ';'
                    {
                     before(grammarAccess.getPersistenceConfigurationAccess().getSemicolonKeyword_3_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getPersistenceConfigurationAccess().getSemicolonKeyword_3_1()); 

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
    // $ANTLR end "rule__PersistenceConfiguration__Alternatives_3"


    // $ANTLR start "rule__PersistenceModel__Group__0"
    // InternalPersistence.g:502:1: rule__PersistenceModel__Group__0 : rule__PersistenceModel__Group__0__Impl rule__PersistenceModel__Group__1 ;
    public final void rule__PersistenceModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:506:1: ( rule__PersistenceModel__Group__0__Impl rule__PersistenceModel__Group__1 )
            // InternalPersistence.g:507:2: rule__PersistenceModel__Group__0__Impl rule__PersistenceModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__PersistenceModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersistenceModel__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__PersistenceModel__Group__0"


    // $ANTLR start "rule__PersistenceModel__Group__0__Impl"
    // InternalPersistence.g:514:1: rule__PersistenceModel__Group__0__Impl : ( () ) ;
    public final void rule__PersistenceModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:518:1: ( ( () ) )
            // InternalPersistence.g:519:1: ( () )
            {
            // InternalPersistence.g:519:1: ( () )
            // InternalPersistence.g:520:2: ()
            {
             before(grammarAccess.getPersistenceModelAccess().getPersistenceModelAction_0()); 
            // InternalPersistence.g:521:2: ()
            // InternalPersistence.g:521:3: 
            {
            }

             after(grammarAccess.getPersistenceModelAccess().getPersistenceModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PersistenceModel__Group__0__Impl"


    // $ANTLR start "rule__PersistenceModel__Group__1"
    // InternalPersistence.g:529:1: rule__PersistenceModel__Group__1 : rule__PersistenceModel__Group__1__Impl rule__PersistenceModel__Group__2 ;
    public final void rule__PersistenceModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:533:1: ( rule__PersistenceModel__Group__1__Impl rule__PersistenceModel__Group__2 )
            // InternalPersistence.g:534:2: rule__PersistenceModel__Group__1__Impl rule__PersistenceModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__PersistenceModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersistenceModel__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__PersistenceModel__Group__1"


    // $ANTLR start "rule__PersistenceModel__Group__1__Impl"
    // InternalPersistence.g:541:1: rule__PersistenceModel__Group__1__Impl : ( 'Strategies' ) ;
    public final void rule__PersistenceModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:545:1: ( ( 'Strategies' ) )
            // InternalPersistence.g:546:1: ( 'Strategies' )
            {
            // InternalPersistence.g:546:1: ( 'Strategies' )
            // InternalPersistence.g:547:2: 'Strategies'
            {
             before(grammarAccess.getPersistenceModelAccess().getStrategiesKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPersistenceModelAccess().getStrategiesKeyword_1()); 

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
    // $ANTLR end "rule__PersistenceModel__Group__1__Impl"


    // $ANTLR start "rule__PersistenceModel__Group__2"
    // InternalPersistence.g:556:1: rule__PersistenceModel__Group__2 : rule__PersistenceModel__Group__2__Impl rule__PersistenceModel__Group__3 ;
    public final void rule__PersistenceModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:560:1: ( rule__PersistenceModel__Group__2__Impl rule__PersistenceModel__Group__3 )
            // InternalPersistence.g:561:2: rule__PersistenceModel__Group__2__Impl rule__PersistenceModel__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__PersistenceModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersistenceModel__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__PersistenceModel__Group__2"


    // $ANTLR start "rule__PersistenceModel__Group__2__Impl"
    // InternalPersistence.g:568:1: rule__PersistenceModel__Group__2__Impl : ( '{' ) ;
    public final void rule__PersistenceModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:572:1: ( ( '{' ) )
            // InternalPersistence.g:573:1: ( '{' )
            {
            // InternalPersistence.g:573:1: ( '{' )
            // InternalPersistence.g:574:2: '{'
            {
             before(grammarAccess.getPersistenceModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPersistenceModelAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__PersistenceModel__Group__2__Impl"


    // $ANTLR start "rule__PersistenceModel__Group__3"
    // InternalPersistence.g:583:1: rule__PersistenceModel__Group__3 : rule__PersistenceModel__Group__3__Impl rule__PersistenceModel__Group__4 ;
    public final void rule__PersistenceModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:587:1: ( rule__PersistenceModel__Group__3__Impl rule__PersistenceModel__Group__4 )
            // InternalPersistence.g:588:2: rule__PersistenceModel__Group__3__Impl rule__PersistenceModel__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__PersistenceModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersistenceModel__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__PersistenceModel__Group__3"


    // $ANTLR start "rule__PersistenceModel__Group__3__Impl"
    // InternalPersistence.g:595:1: rule__PersistenceModel__Group__3__Impl : ( ( rule__PersistenceModel__StrategiesAssignment_3 )* ) ;
    public final void rule__PersistenceModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:599:1: ( ( ( rule__PersistenceModel__StrategiesAssignment_3 )* ) )
            // InternalPersistence.g:600:1: ( ( rule__PersistenceModel__StrategiesAssignment_3 )* )
            {
            // InternalPersistence.g:600:1: ( ( rule__PersistenceModel__StrategiesAssignment_3 )* )
            // InternalPersistence.g:601:2: ( rule__PersistenceModel__StrategiesAssignment_3 )*
            {
             before(grammarAccess.getPersistenceModelAccess().getStrategiesAssignment_3()); 
            // InternalPersistence.g:602:2: ( rule__PersistenceModel__StrategiesAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPersistence.g:602:3: rule__PersistenceModel__StrategiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__PersistenceModel__StrategiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getPersistenceModelAccess().getStrategiesAssignment_3()); 

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
    // $ANTLR end "rule__PersistenceModel__Group__3__Impl"


    // $ANTLR start "rule__PersistenceModel__Group__4"
    // InternalPersistence.g:610:1: rule__PersistenceModel__Group__4 : rule__PersistenceModel__Group__4__Impl rule__PersistenceModel__Group__5 ;
    public final void rule__PersistenceModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:614:1: ( rule__PersistenceModel__Group__4__Impl rule__PersistenceModel__Group__5 )
            // InternalPersistence.g:615:2: rule__PersistenceModel__Group__4__Impl rule__PersistenceModel__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__PersistenceModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersistenceModel__Group__5();

            state._fsp--;


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
    // $ANTLR end "rule__PersistenceModel__Group__4"


    // $ANTLR start "rule__PersistenceModel__Group__4__Impl"
    // InternalPersistence.g:622:1: rule__PersistenceModel__Group__4__Impl : ( ( rule__PersistenceModel__Group_4__0 )? ) ;
    public final void rule__PersistenceModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:626:1: ( ( ( rule__PersistenceModel__Group_4__0 )? ) )
            // InternalPersistence.g:627:1: ( ( rule__PersistenceModel__Group_4__0 )? )
            {
            // InternalPersistence.g:627:1: ( ( rule__PersistenceModel__Group_4__0 )? )
            // InternalPersistence.g:628:2: ( rule__PersistenceModel__Group_4__0 )?
            {
             before(grammarAccess.getPersistenceModelAccess().getGroup_4()); 
            // InternalPersistence.g:629:2: ( rule__PersistenceModel__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPersistence.g:629:3: rule__PersistenceModel__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PersistenceModel__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPersistenceModelAccess().getGroup_4()); 

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
    // $ANTLR end "rule__PersistenceModel__Group__4__Impl"


    // $ANTLR start "rule__PersistenceModel__Group__5"
    // InternalPersistence.g:637:1: rule__PersistenceModel__Group__5 : rule__PersistenceModel__Group__5__Impl rule__PersistenceModel__Group__6 ;
    public final void rule__PersistenceModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:641:1: ( rule__PersistenceModel__Group__5__Impl rule__PersistenceModel__Group__6 )
            // InternalPersistence.g:642:2: rule__PersistenceModel__Group__5__Impl rule__PersistenceModel__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__PersistenceModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersistenceModel__Group__6();

            state._fsp--;


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
    // $ANTLR end "rule__PersistenceModel__Group__5"


    // $ANTLR start "rule__PersistenceModel__Group__5__Impl"
    // InternalPersistence.g:649:1: rule__PersistenceModel__Group__5__Impl : ( '}' ) ;
    public final void rule__PersistenceModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:653:1: ( ( '}' ) )
            // InternalPersistence.g:654:1: ( '}' )
            {
            // InternalPersistence.g:654:1: ( '}' )
            // InternalPersistence.g:655:2: '}'
            {
             before(grammarAccess.getPersistenceModelAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPersistenceModelAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__PersistenceModel__Group__5__Impl"


    // $ANTLR start "rule__PersistenceModel__Group__6"
    // InternalPersistence.g:664:1: rule__PersistenceModel__Group__6 : rule__PersistenceModel__Group__6__Impl rule__PersistenceModel__Group__7 ;
    public final void rule__PersistenceModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:668:1: ( rule__PersistenceModel__Group__6__Impl rule__PersistenceModel__Group__7 )
            // InternalPersistence.g:669:2: rule__PersistenceModel__Group__6__Impl rule__PersistenceModel__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__PersistenceModel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersistenceModel__Group__7();

            state._fsp--;


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
    // $ANTLR end "rule__PersistenceModel__Group__6"


    // $ANTLR start "rule__PersistenceModel__Group__6__Impl"
    // InternalPersistence.g:676:1: rule__PersistenceModel__Group__6__Impl : ( ( rule__PersistenceModel__Group_6__0 )? ) ;
    public final void rule__PersistenceModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:680:1: ( ( ( rule__PersistenceModel__Group_6__0 )? ) )
            // InternalPersistence.g:681:1: ( ( rule__PersistenceModel__Group_6__0 )? )
            {
            // InternalPersistence.g:681:1: ( ( rule__PersistenceModel__Group_6__0 )? )
            // InternalPersistence.g:682:2: ( rule__PersistenceModel__Group_6__0 )?
            {
             before(grammarAccess.getPersistenceModelAccess().getGroup_6()); 
            // InternalPersistence.g:683:2: ( rule__PersistenceModel__Group_6__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPersistence.g:683:3: rule__PersistenceModel__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PersistenceModel__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPersistenceModelAccess().getGroup_6()); 

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
    // $ANTLR end "rule__PersistenceModel__Group__6__Impl"


    // $ANTLR start "rule__PersistenceModel__Group__7"
    // InternalPersistence.g:691:1: rule__PersistenceModel__Group__7 : rule__PersistenceModel__Group__7__Impl ;
    public final void rule__PersistenceModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:695:1: ( rule__PersistenceModel__Group__7__Impl )
            // InternalPersistence.g:696:2: rule__PersistenceModel__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PersistenceModel__Group__7__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__PersistenceModel__Group__7"


    // $ANTLR start "rule__PersistenceModel__Group__7__Impl"
    // InternalPersistence.g:702:1: rule__PersistenceModel__Group__7__Impl : ( ( rule__PersistenceModel__Group_7__0 )? ) ;
    public final void rule__PersistenceModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:706:1: ( ( ( rule__PersistenceModel__Group_7__0 )? ) )
            // InternalPersistence.g:707:1: ( ( rule__PersistenceModel__Group_7__0 )? )
            {
            // InternalPersistence.g:707:1: ( ( rule__PersistenceModel__Group_7__0 )? )
            // InternalPersistence.g:708:2: ( rule__PersistenceModel__Group_7__0 )?
            {
             before(grammarAccess.getPersistenceModelAccess().getGroup_7()); 
            // InternalPersistence.g:709:2: ( rule__PersistenceModel__Group_7__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPersistence.g:709:3: rule__PersistenceModel__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PersistenceModel__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPersistenceModelAccess().getGroup_7()); 

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
    // $ANTLR end "rule__PersistenceModel__Group__7__Impl"


    // $ANTLR start "rule__PersistenceModel__Group_4__0"
    // InternalPersistence.g:718:1: rule__PersistenceModel__Group_4__0 : rule__PersistenceModel__Group_4__0__Impl rule__PersistenceModel__Group_4__1 ;
    public final void rule__PersistenceModel__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:722:1: ( rule__PersistenceModel__Group_4__0__Impl rule__PersistenceModel__Group_4__1 )
            // InternalPersistence.g:723:2: rule__PersistenceModel__Group_4__0__Impl rule__PersistenceModel__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__PersistenceModel__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersistenceModel__Group_4__1();

            state._fsp--;


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
    // $ANTLR end "rule__PersistenceModel__Group_4__0"


    // $ANTLR start "rule__PersistenceModel__Group_4__0__Impl"
    // InternalPersistence.g:730:1: rule__PersistenceModel__Group_4__0__Impl : ( 'default' ) ;
    public final void rule__PersistenceModel__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:734:1: ( ( 'default' ) )
            // InternalPersistence.g:735:1: ( 'default' )
            {
            // InternalPersistence.g:735:1: ( 'default' )
            // InternalPersistence.g:736:2: 'default'
            {
             before(grammarAccess.getPersistenceModelAccess().getDefaultKeyword_4_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPersistenceModelAccess().getDefaultKeyword_4_0()); 

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
    // $ANTLR end "rule__PersistenceModel__Group_4__0__Impl"


    // $ANTLR start "rule__PersistenceModel__Group_4__1"
    // InternalPersistence.g:745:1: rule__PersistenceModel__Group_4__1 : rule__PersistenceModel__Group_4__1__Impl rule__PersistenceModel__Group_4__2 ;
    public final void rule__PersistenceModel__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:749:1: ( rule__PersistenceModel__Group_4__1__Impl rule__PersistenceModel__Group_4__2 )
            // InternalPersistence.g:750:2: rule__PersistenceModel__Group_4__1__Impl rule__PersistenceModel__Group_4__2
            {
            pushFollow(FOLLOW_9);
            rule__PersistenceModel__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersistenceModel__Group_4__2();

            state._fsp--;


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
    // $ANTLR end "rule__PersistenceModel__Group_4__1"


    // $ANTLR start "rule__PersistenceModel__Group_4__1__Impl"
    // InternalPersistence.g:757:1: rule__PersistenceModel__Group_4__1__Impl : ( '=' ) ;
    public final void rule__PersistenceModel__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:761:1: ( ( '=' ) )
            // InternalPersistence.g:762:1: ( '=' )
            {
            // InternalPersistence.g:762:1: ( '=' )
            // InternalPersistence.g:763:2: '='
            {
             before(grammarAccess.getPersistenceModelAccess().getEqualsSignKeyword_4_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPersistenceModelAccess().getEqualsSignKeyword_4_1()); 

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
    // $ANTLR end "rule__PersistenceModel__Group_4__1__Impl"


    // $ANTLR start "rule__PersistenceModel__Group_4__2"
    // InternalPersistence.g:772:1: rule__PersistenceModel__Group_4__2 : rule__PersistenceModel__Group_4__2__Impl rule__PersistenceModel__Group_4__3 ;
    public final void rule__PersistenceModel__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:776:1: ( rule__PersistenceModel__Group_4__2__Impl rule__PersistenceModel__Group_4__3 )
            // InternalPersistence.g:777:2: rule__PersistenceModel__Group_4__2__Impl rule__PersistenceModel__Group_4__3
            {
            pushFollow(FOLLOW_10);
            rule__PersistenceModel__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersistenceModel__Group_4__3();

            state._fsp--;


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
    // $ANTLR end "rule__PersistenceModel__Group_4__2"


    // $ANTLR start "rule__PersistenceModel__Group_4__2__Impl"
    // InternalPersistence.g:784:1: rule__PersistenceModel__Group_4__2__Impl : ( ( rule__PersistenceModel__DefaultsAssignment_4_2 ) ) ;
    public final void rule__PersistenceModel__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:788:1: ( ( ( rule__PersistenceModel__DefaultsAssignment_4_2 ) ) )
            // InternalPersistence.g:789:1: ( ( rule__PersistenceModel__DefaultsAssignment_4_2 ) )
            {
            // InternalPersistence.g:789:1: ( ( rule__PersistenceModel__DefaultsAssignment_4_2 ) )
            // InternalPersistence.g:790:2: ( rule__PersistenceModel__DefaultsAssignment_4_2 )
            {
             before(grammarAccess.getPersistenceModelAccess().getDefaultsAssignment_4_2()); 
            // InternalPersistence.g:791:2: ( rule__PersistenceModel__DefaultsAssignment_4_2 )
            // InternalPersistence.g:791:3: rule__PersistenceModel__DefaultsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__PersistenceModel__DefaultsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getPersistenceModelAccess().getDefaultsAssignment_4_2()); 

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
    // $ANTLR end "rule__PersistenceModel__Group_4__2__Impl"


    // $ANTLR start "rule__PersistenceModel__Group_4__3"
    // InternalPersistence.g:799:1: rule__PersistenceModel__Group_4__3 : rule__PersistenceModel__Group_4__3__Impl ;
    public final void rule__PersistenceModel__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:803:1: ( rule__PersistenceModel__Group_4__3__Impl )
            // InternalPersistence.g:804:2: rule__PersistenceModel__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PersistenceModel__Group_4__3__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__PersistenceModel__Group_4__3"


    // $ANTLR start "rule__PersistenceModel__Group_4__3__Impl"
    // InternalPersistence.g:810:1: rule__PersistenceModel__Group_4__3__Impl : ( ( rule__PersistenceModel__Group_4_3__0 )* ) ;
    public final void rule__PersistenceModel__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:814:1: ( ( ( rule__PersistenceModel__Group_4_3__0 )* ) )
            // InternalPersistence.g:815:1: ( ( rule__PersistenceModel__Group_4_3__0 )* )
            {
            // InternalPersistence.g:815:1: ( ( rule__PersistenceModel__Group_4_3__0 )* )
            // InternalPersistence.g:816:2: ( rule__PersistenceModel__Group_4_3__0 )*
            {
             before(grammarAccess.getPersistenceModelAccess().getGroup_4_3()); 
            // InternalPersistence.g:817:2: ( rule__PersistenceModel__Group_4_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPersistence.g:817:3: rule__PersistenceModel__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__PersistenceModel__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getPersistenceModelAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__PersistenceModel__Group_4__3__Impl"


    // $ANTLR start "rule__PersistenceModel__Group_4_3__0"
    // InternalPersistence.g:826:1: rule__PersistenceModel__Group_4_3__0 : rule__PersistenceModel__Group_4_3__0__Impl rule__PersistenceModel__Group_4_3__1 ;
    public final void rule__PersistenceModel__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:830:1: ( rule__PersistenceModel__Group_4_3__0__Impl rule__PersistenceModel__Group_4_3__1 )
            // InternalPersistence.g:831:2: rule__PersistenceModel__Group_4_3__0__Impl rule__PersistenceModel__Group_4_3__1
            {
            pushFollow(FOLLOW_9);
            rule__PersistenceModel__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersistenceModel__Group_4_3__1();

            state._fsp--;


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
    // $ANTLR end "rule__PersistenceModel__Group_4_3__0"


    // $ANTLR start "rule__PersistenceModel__Group_4_3__0__Impl"
    // InternalPersistence.g:838:1: rule__PersistenceModel__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__PersistenceModel__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:842:1: ( ( ',' ) )
            // InternalPersistence.g:843:1: ( ',' )
            {
            // InternalPersistence.g:843:1: ( ',' )
            // InternalPersistence.g:844:2: ','
            {
             before(grammarAccess.getPersistenceModelAccess().getCommaKeyword_4_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPersistenceModelAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__PersistenceModel__Group_4_3__0__Impl"


    // $ANTLR start "rule__PersistenceModel__Group_4_3__1"
    // InternalPersistence.g:853:1: rule__PersistenceModel__Group_4_3__1 : rule__PersistenceModel__Group_4_3__1__Impl ;
    public final void rule__PersistenceModel__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:857:1: ( rule__PersistenceModel__Group_4_3__1__Impl )
            // InternalPersistence.g:858:2: rule__PersistenceModel__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PersistenceModel__Group_4_3__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__PersistenceModel__Group_4_3__1"


    // $ANTLR start "rule__PersistenceModel__Group_4_3__1__Impl"
    // InternalPersistence.g:864:1: rule__PersistenceModel__Group_4_3__1__Impl : ( ( rule__PersistenceModel__DefaultsAssignment_4_3_1 ) ) ;
    public final void rule__PersistenceModel__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:868:1: ( ( ( rule__PersistenceModel__DefaultsAssignment_4_3_1 ) ) )
            // InternalPersistence.g:869:1: ( ( rule__PersistenceModel__DefaultsAssignment_4_3_1 ) )
            {
            // InternalPersistence.g:869:1: ( ( rule__PersistenceModel__DefaultsAssignment_4_3_1 ) )
            // InternalPersistence.g:870:2: ( rule__PersistenceModel__DefaultsAssignment_4_3_1 )
            {
             before(grammarAccess.getPersistenceModelAccess().getDefaultsAssignment_4_3_1()); 
            // InternalPersistence.g:871:2: ( rule__PersistenceModel__DefaultsAssignment_4_3_1 )
            // InternalPersistence.g:871:3: rule__PersistenceModel__DefaultsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__PersistenceModel__DefaultsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPersistenceModelAccess().getDefaultsAssignment_4_3_1()); 

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
    // $ANTLR end "rule__PersistenceModel__Group_4_3__1__Impl"


    // $ANTLR start "rule__PersistenceModel__Group_6__0"
    // InternalPersistence.g:880:1: rule__PersistenceModel__Group_6__0 : rule__PersistenceModel__Group_6__0__Impl rule__PersistenceModel__Group_6__1 ;
    public final void rule__PersistenceModel__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:884:1: ( rule__PersistenceModel__Group_6__0__Impl rule__PersistenceModel__Group_6__1 )
            // InternalPersistence.g:885:2: rule__PersistenceModel__Group_6__0__Impl rule__PersistenceModel__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__PersistenceModel__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersistenceModel__Group_6__1();

            state._fsp--;


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
    // $ANTLR end "rule__PersistenceModel__Group_6__0"


    // $ANTLR start "rule__PersistenceModel__Group_6__0__Impl"
    // InternalPersistence.g:892:1: rule__PersistenceModel__Group_6__0__Impl : ( 'Filters' ) ;
    public final void rule__PersistenceModel__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:896:1: ( ( 'Filters' ) )
            // InternalPersistence.g:897:1: ( 'Filters' )
            {
            // InternalPersistence.g:897:1: ( 'Filters' )
            // InternalPersistence.g:898:2: 'Filters'
            {
             before(grammarAccess.getPersistenceModelAccess().getFiltersKeyword_6_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPersistenceModelAccess().getFiltersKeyword_6_0()); 

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
    // $ANTLR end "rule__PersistenceModel__Group_6__0__Impl"


    // $ANTLR start "rule__PersistenceModel__Group_6__1"
    // InternalPersistence.g:907:1: rule__PersistenceModel__Group_6__1 : rule__PersistenceModel__Group_6__1__Impl rule__PersistenceModel__Group_6__2 ;
    public final void rule__PersistenceModel__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:911:1: ( rule__PersistenceModel__Group_6__1__Impl rule__PersistenceModel__Group_6__2 )
            // InternalPersistence.g:912:2: rule__PersistenceModel__Group_6__1__Impl rule__PersistenceModel__Group_6__2
            {
            pushFollow(FOLLOW_12);
            rule__PersistenceModel__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersistenceModel__Group_6__2();

            state._fsp--;


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
    // $ANTLR end "rule__PersistenceModel__Group_6__1"


    // $ANTLR start "rule__PersistenceModel__Group_6__1__Impl"
    // InternalPersistence.g:919:1: rule__PersistenceModel__Group_6__1__Impl : ( '{' ) ;
    public final void rule__PersistenceModel__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:923:1: ( ( '{' ) )
            // InternalPersistence.g:924:1: ( '{' )
            {
            // InternalPersistence.g:924:1: ( '{' )
            // InternalPersistence.g:925:2: '{'
            {
             before(grammarAccess.getPersistenceModelAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPersistenceModelAccess().getLeftCurlyBracketKeyword_6_1()); 

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
    // $ANTLR end "rule__PersistenceModel__Group_6__1__Impl"


    // $ANTLR start "rule__PersistenceModel__Group_6__2"
    // InternalPersistence.g:934:1: rule__PersistenceModel__Group_6__2 : rule__PersistenceModel__Group_6__2__Impl rule__PersistenceModel__Group_6__3 ;
    public final void rule__PersistenceModel__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:938:1: ( rule__PersistenceModel__Group_6__2__Impl rule__PersistenceModel__Group_6__3 )
            // InternalPersistence.g:939:2: rule__PersistenceModel__Group_6__2__Impl rule__PersistenceModel__Group_6__3
            {
            pushFollow(FOLLOW_12);
            rule__PersistenceModel__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersistenceModel__Group_6__3();

            state._fsp--;


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
    // $ANTLR end "rule__PersistenceModel__Group_6__2"


    // $ANTLR start "rule__PersistenceModel__Group_6__2__Impl"
    // InternalPersistence.g:946:1: rule__PersistenceModel__Group_6__2__Impl : ( ( rule__PersistenceModel__FiltersAssignment_6_2 )* ) ;
    public final void rule__PersistenceModel__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:950:1: ( ( ( rule__PersistenceModel__FiltersAssignment_6_2 )* ) )
            // InternalPersistence.g:951:1: ( ( rule__PersistenceModel__FiltersAssignment_6_2 )* )
            {
            // InternalPersistence.g:951:1: ( ( rule__PersistenceModel__FiltersAssignment_6_2 )* )
            // InternalPersistence.g:952:2: ( rule__PersistenceModel__FiltersAssignment_6_2 )*
            {
             before(grammarAccess.getPersistenceModelAccess().getFiltersAssignment_6_2()); 
            // InternalPersistence.g:953:2: ( rule__PersistenceModel__FiltersAssignment_6_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPersistence.g:953:3: rule__PersistenceModel__FiltersAssignment_6_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__PersistenceModel__FiltersAssignment_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getPersistenceModelAccess().getFiltersAssignment_6_2()); 

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
    // $ANTLR end "rule__PersistenceModel__Group_6__2__Impl"


    // $ANTLR start "rule__PersistenceModel__Group_6__3"
    // InternalPersistence.g:961:1: rule__PersistenceModel__Group_6__3 : rule__PersistenceModel__Group_6__3__Impl ;
    public final void rule__PersistenceModel__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:965:1: ( rule__PersistenceModel__Group_6__3__Impl )
            // InternalPersistence.g:966:2: rule__PersistenceModel__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PersistenceModel__Group_6__3__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__PersistenceModel__Group_6__3"


    // $ANTLR start "rule__PersistenceModel__Group_6__3__Impl"
    // InternalPersistence.g:972:1: rule__PersistenceModel__Group_6__3__Impl : ( '}' ) ;
    public final void rule__PersistenceModel__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:976:1: ( ( '}' ) )
            // InternalPersistence.g:977:1: ( '}' )
            {
            // InternalPersistence.g:977:1: ( '}' )
            // InternalPersistence.g:978:2: '}'
            {
             before(grammarAccess.getPersistenceModelAccess().getRightCurlyBracketKeyword_6_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPersistenceModelAccess().getRightCurlyBracketKeyword_6_3()); 

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
    // $ANTLR end "rule__PersistenceModel__Group_6__3__Impl"


    // $ANTLR start "rule__PersistenceModel__Group_7__0"
    // InternalPersistence.g:988:1: rule__PersistenceModel__Group_7__0 : rule__PersistenceModel__Group_7__0__Impl rule__PersistenceModel__Group_7__1 ;
    public final void rule__PersistenceModel__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:992:1: ( rule__PersistenceModel__Group_7__0__Impl rule__PersistenceModel__Group_7__1 )
            // InternalPersistence.g:993:2: rule__PersistenceModel__Group_7__0__Impl rule__PersistenceModel__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__PersistenceModel__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersistenceModel__Group_7__1();

            state._fsp--;


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
    // $ANTLR end "rule__PersistenceModel__Group_7__0"


    // $ANTLR start "rule__PersistenceModel__Group_7__0__Impl"
    // InternalPersistence.g:1000:1: rule__PersistenceModel__Group_7__0__Impl : ( 'Items' ) ;
    public final void rule__PersistenceModel__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1004:1: ( ( 'Items' ) )
            // InternalPersistence.g:1005:1: ( 'Items' )
            {
            // InternalPersistence.g:1005:1: ( 'Items' )
            // InternalPersistence.g:1006:2: 'Items'
            {
             before(grammarAccess.getPersistenceModelAccess().getItemsKeyword_7_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPersistenceModelAccess().getItemsKeyword_7_0()); 

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
    // $ANTLR end "rule__PersistenceModel__Group_7__0__Impl"


    // $ANTLR start "rule__PersistenceModel__Group_7__1"
    // InternalPersistence.g:1015:1: rule__PersistenceModel__Group_7__1 : rule__PersistenceModel__Group_7__1__Impl rule__PersistenceModel__Group_7__2 ;
    public final void rule__PersistenceModel__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1019:1: ( rule__PersistenceModel__Group_7__1__Impl rule__PersistenceModel__Group_7__2 )
            // InternalPersistence.g:1020:2: rule__PersistenceModel__Group_7__1__Impl rule__PersistenceModel__Group_7__2
            {
            pushFollow(FOLLOW_13);
            rule__PersistenceModel__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersistenceModel__Group_7__2();

            state._fsp--;


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
    // $ANTLR end "rule__PersistenceModel__Group_7__1"


    // $ANTLR start "rule__PersistenceModel__Group_7__1__Impl"
    // InternalPersistence.g:1027:1: rule__PersistenceModel__Group_7__1__Impl : ( '{' ) ;
    public final void rule__PersistenceModel__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1031:1: ( ( '{' ) )
            // InternalPersistence.g:1032:1: ( '{' )
            {
            // InternalPersistence.g:1032:1: ( '{' )
            // InternalPersistence.g:1033:2: '{'
            {
             before(grammarAccess.getPersistenceModelAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPersistenceModelAccess().getLeftCurlyBracketKeyword_7_1()); 

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
    // $ANTLR end "rule__PersistenceModel__Group_7__1__Impl"


    // $ANTLR start "rule__PersistenceModel__Group_7__2"
    // InternalPersistence.g:1042:1: rule__PersistenceModel__Group_7__2 : rule__PersistenceModel__Group_7__2__Impl rule__PersistenceModel__Group_7__3 ;
    public final void rule__PersistenceModel__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1046:1: ( rule__PersistenceModel__Group_7__2__Impl rule__PersistenceModel__Group_7__3 )
            // InternalPersistence.g:1047:2: rule__PersistenceModel__Group_7__2__Impl rule__PersistenceModel__Group_7__3
            {
            pushFollow(FOLLOW_13);
            rule__PersistenceModel__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersistenceModel__Group_7__3();

            state._fsp--;


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
    // $ANTLR end "rule__PersistenceModel__Group_7__2"


    // $ANTLR start "rule__PersistenceModel__Group_7__2__Impl"
    // InternalPersistence.g:1054:1: rule__PersistenceModel__Group_7__2__Impl : ( ( rule__PersistenceModel__ConfigsAssignment_7_2 )* ) ;
    public final void rule__PersistenceModel__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1058:1: ( ( ( rule__PersistenceModel__ConfigsAssignment_7_2 )* ) )
            // InternalPersistence.g:1059:1: ( ( rule__PersistenceModel__ConfigsAssignment_7_2 )* )
            {
            // InternalPersistence.g:1059:1: ( ( rule__PersistenceModel__ConfigsAssignment_7_2 )* )
            // InternalPersistence.g:1060:2: ( rule__PersistenceModel__ConfigsAssignment_7_2 )*
            {
             before(grammarAccess.getPersistenceModelAccess().getConfigsAssignment_7_2()); 
            // InternalPersistence.g:1061:2: ( rule__PersistenceModel__ConfigsAssignment_7_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==29) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPersistence.g:1061:3: rule__PersistenceModel__ConfigsAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__PersistenceModel__ConfigsAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getPersistenceModelAccess().getConfigsAssignment_7_2()); 

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
    // $ANTLR end "rule__PersistenceModel__Group_7__2__Impl"


    // $ANTLR start "rule__PersistenceModel__Group_7__3"
    // InternalPersistence.g:1069:1: rule__PersistenceModel__Group_7__3 : rule__PersistenceModel__Group_7__3__Impl ;
    public final void rule__PersistenceModel__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1073:1: ( rule__PersistenceModel__Group_7__3__Impl )
            // InternalPersistence.g:1074:2: rule__PersistenceModel__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PersistenceModel__Group_7__3__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__PersistenceModel__Group_7__3"


    // $ANTLR start "rule__PersistenceModel__Group_7__3__Impl"
    // InternalPersistence.g:1080:1: rule__PersistenceModel__Group_7__3__Impl : ( '}' ) ;
    public final void rule__PersistenceModel__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1084:1: ( ( '}' ) )
            // InternalPersistence.g:1085:1: ( '}' )
            {
            // InternalPersistence.g:1085:1: ( '}' )
            // InternalPersistence.g:1086:2: '}'
            {
             before(grammarAccess.getPersistenceModelAccess().getRightCurlyBracketKeyword_7_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPersistenceModelAccess().getRightCurlyBracketKeyword_7_3()); 

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
    // $ANTLR end "rule__PersistenceModel__Group_7__3__Impl"


    // $ANTLR start "rule__CronStrategy__Group__0"
    // InternalPersistence.g:1096:1: rule__CronStrategy__Group__0 : rule__CronStrategy__Group__0__Impl rule__CronStrategy__Group__1 ;
    public final void rule__CronStrategy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1100:1: ( rule__CronStrategy__Group__0__Impl rule__CronStrategy__Group__1 )
            // InternalPersistence.g:1101:2: rule__CronStrategy__Group__0__Impl rule__CronStrategy__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__CronStrategy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CronStrategy__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__CronStrategy__Group__0"


    // $ANTLR start "rule__CronStrategy__Group__0__Impl"
    // InternalPersistence.g:1108:1: rule__CronStrategy__Group__0__Impl : ( () ) ;
    public final void rule__CronStrategy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1112:1: ( ( () ) )
            // InternalPersistence.g:1113:1: ( () )
            {
            // InternalPersistence.g:1113:1: ( () )
            // InternalPersistence.g:1114:2: ()
            {
             before(grammarAccess.getCronStrategyAccess().getCronStrategyAction_0()); 
            // InternalPersistence.g:1115:2: ()
            // InternalPersistence.g:1115:3: 
            {
            }

             after(grammarAccess.getCronStrategyAccess().getCronStrategyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CronStrategy__Group__0__Impl"


    // $ANTLR start "rule__CronStrategy__Group__1"
    // InternalPersistence.g:1123:1: rule__CronStrategy__Group__1 : rule__CronStrategy__Group__1__Impl rule__CronStrategy__Group__2 ;
    public final void rule__CronStrategy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1127:1: ( rule__CronStrategy__Group__1__Impl rule__CronStrategy__Group__2 )
            // InternalPersistence.g:1128:2: rule__CronStrategy__Group__1__Impl rule__CronStrategy__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__CronStrategy__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CronStrategy__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__CronStrategy__Group__1"


    // $ANTLR start "rule__CronStrategy__Group__1__Impl"
    // InternalPersistence.g:1135:1: rule__CronStrategy__Group__1__Impl : ( ( rule__CronStrategy__NameAssignment_1 ) ) ;
    public final void rule__CronStrategy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1139:1: ( ( ( rule__CronStrategy__NameAssignment_1 ) ) )
            // InternalPersistence.g:1140:1: ( ( rule__CronStrategy__NameAssignment_1 ) )
            {
            // InternalPersistence.g:1140:1: ( ( rule__CronStrategy__NameAssignment_1 ) )
            // InternalPersistence.g:1141:2: ( rule__CronStrategy__NameAssignment_1 )
            {
             before(grammarAccess.getCronStrategyAccess().getNameAssignment_1()); 
            // InternalPersistence.g:1142:2: ( rule__CronStrategy__NameAssignment_1 )
            // InternalPersistence.g:1142:3: rule__CronStrategy__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CronStrategy__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCronStrategyAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__CronStrategy__Group__1__Impl"


    // $ANTLR start "rule__CronStrategy__Group__2"
    // InternalPersistence.g:1150:1: rule__CronStrategy__Group__2 : rule__CronStrategy__Group__2__Impl rule__CronStrategy__Group__3 ;
    public final void rule__CronStrategy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1154:1: ( rule__CronStrategy__Group__2__Impl rule__CronStrategy__Group__3 )
            // InternalPersistence.g:1155:2: rule__CronStrategy__Group__2__Impl rule__CronStrategy__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__CronStrategy__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CronStrategy__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__CronStrategy__Group__2"


    // $ANTLR start "rule__CronStrategy__Group__2__Impl"
    // InternalPersistence.g:1162:1: rule__CronStrategy__Group__2__Impl : ( ':' ) ;
    public final void rule__CronStrategy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1166:1: ( ( ':' ) )
            // InternalPersistence.g:1167:1: ( ':' )
            {
            // InternalPersistence.g:1167:1: ( ':' )
            // InternalPersistence.g:1168:2: ':'
            {
             before(grammarAccess.getCronStrategyAccess().getColonKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCronStrategyAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__CronStrategy__Group__2__Impl"


    // $ANTLR start "rule__CronStrategy__Group__3"
    // InternalPersistence.g:1177:1: rule__CronStrategy__Group__3 : rule__CronStrategy__Group__3__Impl ;
    public final void rule__CronStrategy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1181:1: ( rule__CronStrategy__Group__3__Impl )
            // InternalPersistence.g:1182:2: rule__CronStrategy__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CronStrategy__Group__3__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__CronStrategy__Group__3"


    // $ANTLR start "rule__CronStrategy__Group__3__Impl"
    // InternalPersistence.g:1188:1: rule__CronStrategy__Group__3__Impl : ( ( rule__CronStrategy__CronExpressionAssignment_3 ) ) ;
    public final void rule__CronStrategy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1192:1: ( ( ( rule__CronStrategy__CronExpressionAssignment_3 ) ) )
            // InternalPersistence.g:1193:1: ( ( rule__CronStrategy__CronExpressionAssignment_3 ) )
            {
            // InternalPersistence.g:1193:1: ( ( rule__CronStrategy__CronExpressionAssignment_3 ) )
            // InternalPersistence.g:1194:2: ( rule__CronStrategy__CronExpressionAssignment_3 )
            {
             before(grammarAccess.getCronStrategyAccess().getCronExpressionAssignment_3()); 
            // InternalPersistence.g:1195:2: ( rule__CronStrategy__CronExpressionAssignment_3 )
            // InternalPersistence.g:1195:3: rule__CronStrategy__CronExpressionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CronStrategy__CronExpressionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCronStrategyAccess().getCronExpressionAssignment_3()); 

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
    // $ANTLR end "rule__CronStrategy__Group__3__Impl"


    // $ANTLR start "rule__Filter__Group__0"
    // InternalPersistence.g:1204:1: rule__Filter__Group__0 : rule__Filter__Group__0__Impl rule__Filter__Group__1 ;
    public final void rule__Filter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1208:1: ( rule__Filter__Group__0__Impl rule__Filter__Group__1 )
            // InternalPersistence.g:1209:2: rule__Filter__Group__0__Impl rule__Filter__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Filter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Filter__Group__0"


    // $ANTLR start "rule__Filter__Group__0__Impl"
    // InternalPersistence.g:1216:1: rule__Filter__Group__0__Impl : ( ( rule__Filter__NameAssignment_0 ) ) ;
    public final void rule__Filter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1220:1: ( ( ( rule__Filter__NameAssignment_0 ) ) )
            // InternalPersistence.g:1221:1: ( ( rule__Filter__NameAssignment_0 ) )
            {
            // InternalPersistence.g:1221:1: ( ( rule__Filter__NameAssignment_0 ) )
            // InternalPersistence.g:1222:2: ( rule__Filter__NameAssignment_0 )
            {
             before(grammarAccess.getFilterAccess().getNameAssignment_0()); 
            // InternalPersistence.g:1223:2: ( rule__Filter__NameAssignment_0 )
            // InternalPersistence.g:1223:3: rule__Filter__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Filter__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFilterAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Filter__Group__0__Impl"


    // $ANTLR start "rule__Filter__Group__1"
    // InternalPersistence.g:1231:1: rule__Filter__Group__1 : rule__Filter__Group__1__Impl rule__Filter__Group__2 ;
    public final void rule__Filter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1235:1: ( rule__Filter__Group__1__Impl rule__Filter__Group__2 )
            // InternalPersistence.g:1236:2: rule__Filter__Group__1__Impl rule__Filter__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Filter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Filter__Group__1"


    // $ANTLR start "rule__Filter__Group__1__Impl"
    // InternalPersistence.g:1243:1: rule__Filter__Group__1__Impl : ( ':' ) ;
    public final void rule__Filter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1247:1: ( ( ':' ) )
            // InternalPersistence.g:1248:1: ( ':' )
            {
            // InternalPersistence.g:1248:1: ( ':' )
            // InternalPersistence.g:1249:2: ':'
            {
             before(grammarAccess.getFilterAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Filter__Group__1__Impl"


    // $ANTLR start "rule__Filter__Group__2"
    // InternalPersistence.g:1258:1: rule__Filter__Group__2 : rule__Filter__Group__2__Impl ;
    public final void rule__Filter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1262:1: ( rule__Filter__Group__2__Impl )
            // InternalPersistence.g:1263:2: rule__Filter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Filter__Group__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Filter__Group__2"


    // $ANTLR start "rule__Filter__Group__2__Impl"
    // InternalPersistence.g:1269:1: rule__Filter__Group__2__Impl : ( ( rule__Filter__DefinitionAssignment_2 ) ) ;
    public final void rule__Filter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1273:1: ( ( ( rule__Filter__DefinitionAssignment_2 ) ) )
            // InternalPersistence.g:1274:1: ( ( rule__Filter__DefinitionAssignment_2 ) )
            {
            // InternalPersistence.g:1274:1: ( ( rule__Filter__DefinitionAssignment_2 ) )
            // InternalPersistence.g:1275:2: ( rule__Filter__DefinitionAssignment_2 )
            {
             before(grammarAccess.getFilterAccess().getDefinitionAssignment_2()); 
            // InternalPersistence.g:1276:2: ( rule__Filter__DefinitionAssignment_2 )
            // InternalPersistence.g:1276:3: rule__Filter__DefinitionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Filter__DefinitionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFilterAccess().getDefinitionAssignment_2()); 

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
    // $ANTLR end "rule__Filter__Group__2__Impl"


    // $ANTLR start "rule__ThresholdFilter__Group__0"
    // InternalPersistence.g:1285:1: rule__ThresholdFilter__Group__0 : rule__ThresholdFilter__Group__0__Impl rule__ThresholdFilter__Group__1 ;
    public final void rule__ThresholdFilter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1289:1: ( rule__ThresholdFilter__Group__0__Impl rule__ThresholdFilter__Group__1 )
            // InternalPersistence.g:1290:2: rule__ThresholdFilter__Group__0__Impl rule__ThresholdFilter__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__ThresholdFilter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ThresholdFilter__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__ThresholdFilter__Group__0"


    // $ANTLR start "rule__ThresholdFilter__Group__0__Impl"
    // InternalPersistence.g:1297:1: rule__ThresholdFilter__Group__0__Impl : ( '>' ) ;
    public final void rule__ThresholdFilter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1301:1: ( ( '>' ) )
            // InternalPersistence.g:1302:1: ( '>' )
            {
            // InternalPersistence.g:1302:1: ( '>' )
            // InternalPersistence.g:1303:2: '>'
            {
             before(grammarAccess.getThresholdFilterAccess().getGreaterThanSignKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getThresholdFilterAccess().getGreaterThanSignKeyword_0()); 

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
    // $ANTLR end "rule__ThresholdFilter__Group__0__Impl"


    // $ANTLR start "rule__ThresholdFilter__Group__1"
    // InternalPersistence.g:1312:1: rule__ThresholdFilter__Group__1 : rule__ThresholdFilter__Group__1__Impl rule__ThresholdFilter__Group__2 ;
    public final void rule__ThresholdFilter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1316:1: ( rule__ThresholdFilter__Group__1__Impl rule__ThresholdFilter__Group__2 )
            // InternalPersistence.g:1317:2: rule__ThresholdFilter__Group__1__Impl rule__ThresholdFilter__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__ThresholdFilter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ThresholdFilter__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__ThresholdFilter__Group__1"


    // $ANTLR start "rule__ThresholdFilter__Group__1__Impl"
    // InternalPersistence.g:1324:1: rule__ThresholdFilter__Group__1__Impl : ( ( rule__ThresholdFilter__ValueAssignment_1 ) ) ;
    public final void rule__ThresholdFilter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1328:1: ( ( ( rule__ThresholdFilter__ValueAssignment_1 ) ) )
            // InternalPersistence.g:1329:1: ( ( rule__ThresholdFilter__ValueAssignment_1 ) )
            {
            // InternalPersistence.g:1329:1: ( ( rule__ThresholdFilter__ValueAssignment_1 ) )
            // InternalPersistence.g:1330:2: ( rule__ThresholdFilter__ValueAssignment_1 )
            {
             before(grammarAccess.getThresholdFilterAccess().getValueAssignment_1()); 
            // InternalPersistence.g:1331:2: ( rule__ThresholdFilter__ValueAssignment_1 )
            // InternalPersistence.g:1331:3: rule__ThresholdFilter__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ThresholdFilter__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getThresholdFilterAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__ThresholdFilter__Group__1__Impl"


    // $ANTLR start "rule__ThresholdFilter__Group__2"
    // InternalPersistence.g:1339:1: rule__ThresholdFilter__Group__2 : rule__ThresholdFilter__Group__2__Impl ;
    public final void rule__ThresholdFilter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1343:1: ( rule__ThresholdFilter__Group__2__Impl )
            // InternalPersistence.g:1344:2: rule__ThresholdFilter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ThresholdFilter__Group__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__ThresholdFilter__Group__2"


    // $ANTLR start "rule__ThresholdFilter__Group__2__Impl"
    // InternalPersistence.g:1350:1: rule__ThresholdFilter__Group__2__Impl : ( ( rule__ThresholdFilter__PercentAssignment_2 ) ) ;
    public final void rule__ThresholdFilter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1354:1: ( ( ( rule__ThresholdFilter__PercentAssignment_2 ) ) )
            // InternalPersistence.g:1355:1: ( ( rule__ThresholdFilter__PercentAssignment_2 ) )
            {
            // InternalPersistence.g:1355:1: ( ( rule__ThresholdFilter__PercentAssignment_2 ) )
            // InternalPersistence.g:1356:2: ( rule__ThresholdFilter__PercentAssignment_2 )
            {
             before(grammarAccess.getThresholdFilterAccess().getPercentAssignment_2()); 
            // InternalPersistence.g:1357:2: ( rule__ThresholdFilter__PercentAssignment_2 )
            // InternalPersistence.g:1357:3: rule__ThresholdFilter__PercentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ThresholdFilter__PercentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getThresholdFilterAccess().getPercentAssignment_2()); 

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
    // $ANTLR end "rule__ThresholdFilter__Group__2__Impl"


    // $ANTLR start "rule__TimeFilter__Group__0"
    // InternalPersistence.g:1366:1: rule__TimeFilter__Group__0 : rule__TimeFilter__Group__0__Impl rule__TimeFilter__Group__1 ;
    public final void rule__TimeFilter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1370:1: ( rule__TimeFilter__Group__0__Impl rule__TimeFilter__Group__1 )
            // InternalPersistence.g:1371:2: rule__TimeFilter__Group__0__Impl rule__TimeFilter__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__TimeFilter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeFilter__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__TimeFilter__Group__0"


    // $ANTLR start "rule__TimeFilter__Group__0__Impl"
    // InternalPersistence.g:1378:1: rule__TimeFilter__Group__0__Impl : ( ( rule__TimeFilter__ValueAssignment_0 ) ) ;
    public final void rule__TimeFilter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1382:1: ( ( ( rule__TimeFilter__ValueAssignment_0 ) ) )
            // InternalPersistence.g:1383:1: ( ( rule__TimeFilter__ValueAssignment_0 ) )
            {
            // InternalPersistence.g:1383:1: ( ( rule__TimeFilter__ValueAssignment_0 ) )
            // InternalPersistence.g:1384:2: ( rule__TimeFilter__ValueAssignment_0 )
            {
             before(grammarAccess.getTimeFilterAccess().getValueAssignment_0()); 
            // InternalPersistence.g:1385:2: ( rule__TimeFilter__ValueAssignment_0 )
            // InternalPersistence.g:1385:3: rule__TimeFilter__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TimeFilter__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTimeFilterAccess().getValueAssignment_0()); 

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
    // $ANTLR end "rule__TimeFilter__Group__0__Impl"


    // $ANTLR start "rule__TimeFilter__Group__1"
    // InternalPersistence.g:1393:1: rule__TimeFilter__Group__1 : rule__TimeFilter__Group__1__Impl ;
    public final void rule__TimeFilter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1397:1: ( rule__TimeFilter__Group__1__Impl )
            // InternalPersistence.g:1398:2: rule__TimeFilter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TimeFilter__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__TimeFilter__Group__1"


    // $ANTLR start "rule__TimeFilter__Group__1__Impl"
    // InternalPersistence.g:1404:1: rule__TimeFilter__Group__1__Impl : ( ( rule__TimeFilter__UnitAssignment_1 ) ) ;
    public final void rule__TimeFilter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1408:1: ( ( ( rule__TimeFilter__UnitAssignment_1 ) ) )
            // InternalPersistence.g:1409:1: ( ( rule__TimeFilter__UnitAssignment_1 ) )
            {
            // InternalPersistence.g:1409:1: ( ( rule__TimeFilter__UnitAssignment_1 ) )
            // InternalPersistence.g:1410:2: ( rule__TimeFilter__UnitAssignment_1 )
            {
             before(grammarAccess.getTimeFilterAccess().getUnitAssignment_1()); 
            // InternalPersistence.g:1411:2: ( rule__TimeFilter__UnitAssignment_1 )
            // InternalPersistence.g:1411:3: rule__TimeFilter__UnitAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TimeFilter__UnitAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTimeFilterAccess().getUnitAssignment_1()); 

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
    // $ANTLR end "rule__TimeFilter__Group__1__Impl"


    // $ANTLR start "rule__PersistenceConfiguration__Group__0"
    // InternalPersistence.g:1420:1: rule__PersistenceConfiguration__Group__0 : rule__PersistenceConfiguration__Group__0__Impl rule__PersistenceConfiguration__Group__1 ;
    public final void rule__PersistenceConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1424:1: ( rule__PersistenceConfiguration__Group__0__Impl rule__PersistenceConfiguration__Group__1 )
            // InternalPersistence.g:1425:2: rule__PersistenceConfiguration__Group__0__Impl rule__PersistenceConfiguration__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__PersistenceConfiguration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersistenceConfiguration__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__PersistenceConfiguration__Group__0"


    // $ANTLR start "rule__PersistenceConfiguration__Group__0__Impl"
    // InternalPersistence.g:1432:1: rule__PersistenceConfiguration__Group__0__Impl : ( ( rule__PersistenceConfiguration__ItemsAssignment_0 ) ) ;
    public final void rule__PersistenceConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1436:1: ( ( ( rule__PersistenceConfiguration__ItemsAssignment_0 ) ) )
            // InternalPersistence.g:1437:1: ( ( rule__PersistenceConfiguration__ItemsAssignment_0 ) )
            {
            // InternalPersistence.g:1437:1: ( ( rule__PersistenceConfiguration__ItemsAssignment_0 ) )
            // InternalPersistence.g:1438:2: ( rule__PersistenceConfiguration__ItemsAssignment_0 )
            {
             before(grammarAccess.getPersistenceConfigurationAccess().getItemsAssignment_0()); 
            // InternalPersistence.g:1439:2: ( rule__PersistenceConfiguration__ItemsAssignment_0 )
            // InternalPersistence.g:1439:3: rule__PersistenceConfiguration__ItemsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PersistenceConfiguration__ItemsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPersistenceConfigurationAccess().getItemsAssignment_0()); 

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
    // $ANTLR end "rule__PersistenceConfiguration__Group__0__Impl"


    // $ANTLR start "rule__PersistenceConfiguration__Group__1"
    // InternalPersistence.g:1447:1: rule__PersistenceConfiguration__Group__1 : rule__PersistenceConfiguration__Group__1__Impl rule__PersistenceConfiguration__Group__2 ;
    public final void rule__PersistenceConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1451:1: ( rule__PersistenceConfiguration__Group__1__Impl rule__PersistenceConfiguration__Group__2 )
            // InternalPersistence.g:1452:2: rule__PersistenceConfiguration__Group__1__Impl rule__PersistenceConfiguration__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__PersistenceConfiguration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersistenceConfiguration__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__PersistenceConfiguration__Group__1"


    // $ANTLR start "rule__PersistenceConfiguration__Group__1__Impl"
    // InternalPersistence.g:1459:1: rule__PersistenceConfiguration__Group__1__Impl : ( ( rule__PersistenceConfiguration__Group_1__0 )* ) ;
    public final void rule__PersistenceConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1463:1: ( ( ( rule__PersistenceConfiguration__Group_1__0 )* ) )
            // InternalPersistence.g:1464:1: ( ( rule__PersistenceConfiguration__Group_1__0 )* )
            {
            // InternalPersistence.g:1464:1: ( ( rule__PersistenceConfiguration__Group_1__0 )* )
            // InternalPersistence.g:1465:2: ( rule__PersistenceConfiguration__Group_1__0 )*
            {
             before(grammarAccess.getPersistenceConfigurationAccess().getGroup_1()); 
            // InternalPersistence.g:1466:2: ( rule__PersistenceConfiguration__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPersistence.g:1466:3: rule__PersistenceConfiguration__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__PersistenceConfiguration__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getPersistenceConfigurationAccess().getGroup_1()); 

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
    // $ANTLR end "rule__PersistenceConfiguration__Group__1__Impl"


    // $ANTLR start "rule__PersistenceConfiguration__Group__2"
    // InternalPersistence.g:1474:1: rule__PersistenceConfiguration__Group__2 : rule__PersistenceConfiguration__Group__2__Impl rule__PersistenceConfiguration__Group__3 ;
    public final void rule__PersistenceConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1478:1: ( rule__PersistenceConfiguration__Group__2__Impl rule__PersistenceConfiguration__Group__3 )
            // InternalPersistence.g:1479:2: rule__PersistenceConfiguration__Group__2__Impl rule__PersistenceConfiguration__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__PersistenceConfiguration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersistenceConfiguration__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__PersistenceConfiguration__Group__2"


    // $ANTLR start "rule__PersistenceConfiguration__Group__2__Impl"
    // InternalPersistence.g:1486:1: rule__PersistenceConfiguration__Group__2__Impl : ( ( rule__PersistenceConfiguration__Group_2__0 )? ) ;
    public final void rule__PersistenceConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1490:1: ( ( ( rule__PersistenceConfiguration__Group_2__0 )? ) )
            // InternalPersistence.g:1491:1: ( ( rule__PersistenceConfiguration__Group_2__0 )? )
            {
            // InternalPersistence.g:1491:1: ( ( rule__PersistenceConfiguration__Group_2__0 )? )
            // InternalPersistence.g:1492:2: ( rule__PersistenceConfiguration__Group_2__0 )?
            {
             before(grammarAccess.getPersistenceConfigurationAccess().getGroup_2()); 
            // InternalPersistence.g:1493:2: ( rule__PersistenceConfiguration__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPersistence.g:1493:3: rule__PersistenceConfiguration__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PersistenceConfiguration__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPersistenceConfigurationAccess().getGroup_2()); 

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
    // $ANTLR end "rule__PersistenceConfiguration__Group__2__Impl"


    // $ANTLR start "rule__PersistenceConfiguration__Group__3"
    // InternalPersistence.g:1501:1: rule__PersistenceConfiguration__Group__3 : rule__PersistenceConfiguration__Group__3__Impl ;
    public final void rule__PersistenceConfiguration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1505:1: ( rule__PersistenceConfiguration__Group__3__Impl )
            // InternalPersistence.g:1506:2: rule__PersistenceConfiguration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PersistenceConfiguration__Group__3__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__PersistenceConfiguration__Group__3"


    // $ANTLR start "rule__PersistenceConfiguration__Group__3__Impl"
    // InternalPersistence.g:1512:1: rule__PersistenceConfiguration__Group__3__Impl : ( ( rule__PersistenceConfiguration__Alternatives_3 ) ) ;
    public final void rule__PersistenceConfiguration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1516:1: ( ( ( rule__PersistenceConfiguration__Alternatives_3 ) ) )
            // InternalPersistence.g:1517:1: ( ( rule__PersistenceConfiguration__Alternatives_3 ) )
            {
            // InternalPersistence.g:1517:1: ( ( rule__PersistenceConfiguration__Alternatives_3 ) )
            // InternalPersistence.g:1518:2: ( rule__PersistenceConfiguration__Alternatives_3 )
            {
             before(grammarAccess.getPersistenceConfigurationAccess().getAlternatives_3()); 
            // InternalPersistence.g:1519:2: ( rule__PersistenceConfiguration__Alternatives_3 )
            // InternalPersistence.g:1519:3: rule__PersistenceConfiguration__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__PersistenceConfiguration__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getPersistenceConfigurationAccess().getAlternatives_3()); 

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
    // $ANTLR end "rule__PersistenceConfiguration__Group__3__Impl"


    // $ANTLR start "rule__PersistenceConfiguration__Group_1__0"
    // InternalPersistence.g:1528:1: rule__PersistenceConfiguration__Group_1__0 : rule__PersistenceConfiguration__Group_1__0__Impl rule__PersistenceConfiguration__Group_1__1 ;
    public final void rule__PersistenceConfiguration__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1532:1: ( rule__PersistenceConfiguration__Group_1__0__Impl rule__PersistenceConfiguration__Group_1__1 )
            // InternalPersistence.g:1533:2: rule__PersistenceConfiguration__Group_1__0__Impl rule__PersistenceConfiguration__Group_1__1
            {
            pushFollow(FOLLOW_22);
            rule__PersistenceConfiguration__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersistenceConfiguration__Group_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__PersistenceConfiguration__Group_1__0"


    // $ANTLR start "rule__PersistenceConfiguration__Group_1__0__Impl"
    // InternalPersistence.g:1540:1: rule__PersistenceConfiguration__Group_1__0__Impl : ( ',' ) ;
    public final void rule__PersistenceConfiguration__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1544:1: ( ( ',' ) )
            // InternalPersistence.g:1545:1: ( ',' )
            {
            // InternalPersistence.g:1545:1: ( ',' )
            // InternalPersistence.g:1546:2: ','
            {
             before(grammarAccess.getPersistenceConfigurationAccess().getCommaKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPersistenceConfigurationAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__PersistenceConfiguration__Group_1__0__Impl"


    // $ANTLR start "rule__PersistenceConfiguration__Group_1__1"
    // InternalPersistence.g:1555:1: rule__PersistenceConfiguration__Group_1__1 : rule__PersistenceConfiguration__Group_1__1__Impl ;
    public final void rule__PersistenceConfiguration__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1559:1: ( rule__PersistenceConfiguration__Group_1__1__Impl )
            // InternalPersistence.g:1560:2: rule__PersistenceConfiguration__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PersistenceConfiguration__Group_1__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__PersistenceConfiguration__Group_1__1"


    // $ANTLR start "rule__PersistenceConfiguration__Group_1__1__Impl"
    // InternalPersistence.g:1566:1: rule__PersistenceConfiguration__Group_1__1__Impl : ( ( rule__PersistenceConfiguration__ItemsAssignment_1_1 ) ) ;
    public final void rule__PersistenceConfiguration__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1570:1: ( ( ( rule__PersistenceConfiguration__ItemsAssignment_1_1 ) ) )
            // InternalPersistence.g:1571:1: ( ( rule__PersistenceConfiguration__ItemsAssignment_1_1 ) )
            {
            // InternalPersistence.g:1571:1: ( ( rule__PersistenceConfiguration__ItemsAssignment_1_1 ) )
            // InternalPersistence.g:1572:2: ( rule__PersistenceConfiguration__ItemsAssignment_1_1 )
            {
             before(grammarAccess.getPersistenceConfigurationAccess().getItemsAssignment_1_1()); 
            // InternalPersistence.g:1573:2: ( rule__PersistenceConfiguration__ItemsAssignment_1_1 )
            // InternalPersistence.g:1573:3: rule__PersistenceConfiguration__ItemsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PersistenceConfiguration__ItemsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPersistenceConfigurationAccess().getItemsAssignment_1_1()); 

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
    // $ANTLR end "rule__PersistenceConfiguration__Group_1__1__Impl"


    // $ANTLR start "rule__PersistenceConfiguration__Group_2__0"
    // InternalPersistence.g:1582:1: rule__PersistenceConfiguration__Group_2__0 : rule__PersistenceConfiguration__Group_2__0__Impl rule__PersistenceConfiguration__Group_2__1 ;
    public final void rule__PersistenceConfiguration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1586:1: ( rule__PersistenceConfiguration__Group_2__0__Impl rule__PersistenceConfiguration__Group_2__1 )
            // InternalPersistence.g:1587:2: rule__PersistenceConfiguration__Group_2__0__Impl rule__PersistenceConfiguration__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__PersistenceConfiguration__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersistenceConfiguration__Group_2__1();

            state._fsp--;


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
    // $ANTLR end "rule__PersistenceConfiguration__Group_2__0"


    // $ANTLR start "rule__PersistenceConfiguration__Group_2__0__Impl"
    // InternalPersistence.g:1594:1: rule__PersistenceConfiguration__Group_2__0__Impl : ( '->' ) ;
    public final void rule__PersistenceConfiguration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1598:1: ( ( '->' ) )
            // InternalPersistence.g:1599:1: ( '->' )
            {
            // InternalPersistence.g:1599:1: ( '->' )
            // InternalPersistence.g:1600:2: '->'
            {
             before(grammarAccess.getPersistenceConfigurationAccess().getHyphenMinusGreaterThanSignKeyword_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPersistenceConfigurationAccess().getHyphenMinusGreaterThanSignKeyword_2_0()); 

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
    // $ANTLR end "rule__PersistenceConfiguration__Group_2__0__Impl"


    // $ANTLR start "rule__PersistenceConfiguration__Group_2__1"
    // InternalPersistence.g:1609:1: rule__PersistenceConfiguration__Group_2__1 : rule__PersistenceConfiguration__Group_2__1__Impl ;
    public final void rule__PersistenceConfiguration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1613:1: ( rule__PersistenceConfiguration__Group_2__1__Impl )
            // InternalPersistence.g:1614:2: rule__PersistenceConfiguration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PersistenceConfiguration__Group_2__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__PersistenceConfiguration__Group_2__1"


    // $ANTLR start "rule__PersistenceConfiguration__Group_2__1__Impl"
    // InternalPersistence.g:1620:1: rule__PersistenceConfiguration__Group_2__1__Impl : ( ( rule__PersistenceConfiguration__AliasAssignment_2_1 ) ) ;
    public final void rule__PersistenceConfiguration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1624:1: ( ( ( rule__PersistenceConfiguration__AliasAssignment_2_1 ) ) )
            // InternalPersistence.g:1625:1: ( ( rule__PersistenceConfiguration__AliasAssignment_2_1 ) )
            {
            // InternalPersistence.g:1625:1: ( ( rule__PersistenceConfiguration__AliasAssignment_2_1 ) )
            // InternalPersistence.g:1626:2: ( rule__PersistenceConfiguration__AliasAssignment_2_1 )
            {
             before(grammarAccess.getPersistenceConfigurationAccess().getAliasAssignment_2_1()); 
            // InternalPersistence.g:1627:2: ( rule__PersistenceConfiguration__AliasAssignment_2_1 )
            // InternalPersistence.g:1627:3: rule__PersistenceConfiguration__AliasAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PersistenceConfiguration__AliasAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPersistenceConfigurationAccess().getAliasAssignment_2_1()); 

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
    // $ANTLR end "rule__PersistenceConfiguration__Group_2__1__Impl"


    // $ANTLR start "rule__PersistenceConfiguration__Group_3_0__0"
    // InternalPersistence.g:1636:1: rule__PersistenceConfiguration__Group_3_0__0 : rule__PersistenceConfiguration__Group_3_0__0__Impl rule__PersistenceConfiguration__Group_3_0__1 ;
    public final void rule__PersistenceConfiguration__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1640:1: ( rule__PersistenceConfiguration__Group_3_0__0__Impl rule__PersistenceConfiguration__Group_3_0__1 )
            // InternalPersistence.g:1641:2: rule__PersistenceConfiguration__Group_3_0__0__Impl rule__PersistenceConfiguration__Group_3_0__1
            {
            pushFollow(FOLLOW_23);
            rule__PersistenceConfiguration__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersistenceConfiguration__Group_3_0__1();

            state._fsp--;


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
    // $ANTLR end "rule__PersistenceConfiguration__Group_3_0__0"


    // $ANTLR start "rule__PersistenceConfiguration__Group_3_0__0__Impl"
    // InternalPersistence.g:1648:1: rule__PersistenceConfiguration__Group_3_0__0__Impl : ( ':' ) ;
    public final void rule__PersistenceConfiguration__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1652:1: ( ( ':' ) )
            // InternalPersistence.g:1653:1: ( ':' )
            {
            // InternalPersistence.g:1653:1: ( ':' )
            // InternalPersistence.g:1654:2: ':'
            {
             before(grammarAccess.getPersistenceConfigurationAccess().getColonKeyword_3_0_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPersistenceConfigurationAccess().getColonKeyword_3_0_0()); 

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
    // $ANTLR end "rule__PersistenceConfiguration__Group_3_0__0__Impl"


    // $ANTLR start "rule__PersistenceConfiguration__Group_3_0__1"
    // InternalPersistence.g:1663:1: rule__PersistenceConfiguration__Group_3_0__1 : rule__PersistenceConfiguration__Group_3_0__1__Impl rule__PersistenceConfiguration__Group_3_0__2 ;
    public final void rule__PersistenceConfiguration__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1667:1: ( rule__PersistenceConfiguration__Group_3_0__1__Impl rule__PersistenceConfiguration__Group_3_0__2 )
            // InternalPersistence.g:1668:2: rule__PersistenceConfiguration__Group_3_0__1__Impl rule__PersistenceConfiguration__Group_3_0__2
            {
            pushFollow(FOLLOW_23);
            rule__PersistenceConfiguration__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersistenceConfiguration__Group_3_0__2();

            state._fsp--;


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
    // $ANTLR end "rule__PersistenceConfiguration__Group_3_0__1"


    // $ANTLR start "rule__PersistenceConfiguration__Group_3_0__1__Impl"
    // InternalPersistence.g:1675:1: rule__PersistenceConfiguration__Group_3_0__1__Impl : ( ( rule__PersistenceConfiguration__Group_3_0_1__0 )? ) ;
    public final void rule__PersistenceConfiguration__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1679:1: ( ( ( rule__PersistenceConfiguration__Group_3_0_1__0 )? ) )
            // InternalPersistence.g:1680:1: ( ( rule__PersistenceConfiguration__Group_3_0_1__0 )? )
            {
            // InternalPersistence.g:1680:1: ( ( rule__PersistenceConfiguration__Group_3_0_1__0 )? )
            // InternalPersistence.g:1681:2: ( rule__PersistenceConfiguration__Group_3_0_1__0 )?
            {
             before(grammarAccess.getPersistenceConfigurationAccess().getGroup_3_0_1()); 
            // InternalPersistence.g:1682:2: ( rule__PersistenceConfiguration__Group_3_0_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPersistence.g:1682:3: rule__PersistenceConfiguration__Group_3_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PersistenceConfiguration__Group_3_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPersistenceConfigurationAccess().getGroup_3_0_1()); 

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
    // $ANTLR end "rule__PersistenceConfiguration__Group_3_0__1__Impl"


    // $ANTLR start "rule__PersistenceConfiguration__Group_3_0__2"
    // InternalPersistence.g:1690:1: rule__PersistenceConfiguration__Group_3_0__2 : rule__PersistenceConfiguration__Group_3_0__2__Impl ;
    public final void rule__PersistenceConfiguration__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1694:1: ( rule__PersistenceConfiguration__Group_3_0__2__Impl )
            // InternalPersistence.g:1695:2: rule__PersistenceConfiguration__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PersistenceConfiguration__Group_3_0__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__PersistenceConfiguration__Group_3_0__2"


    // $ANTLR start "rule__PersistenceConfiguration__Group_3_0__2__Impl"
    // InternalPersistence.g:1701:1: rule__PersistenceConfiguration__Group_3_0__2__Impl : ( ( rule__PersistenceConfiguration__Group_3_0_2__0 )? ) ;
    public final void rule__PersistenceConfiguration__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1705:1: ( ( ( rule__PersistenceConfiguration__Group_3_0_2__0 )? ) )
            // InternalPersistence.g:1706:1: ( ( rule__PersistenceConfiguration__Group_3_0_2__0 )? )
            {
            // InternalPersistence.g:1706:1: ( ( rule__PersistenceConfiguration__Group_3_0_2__0 )? )
            // InternalPersistence.g:1707:2: ( rule__PersistenceConfiguration__Group_3_0_2__0 )?
            {
             before(grammarAccess.getPersistenceConfigurationAccess().getGroup_3_0_2()); 
            // InternalPersistence.g:1708:2: ( rule__PersistenceConfiguration__Group_3_0_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPersistence.g:1708:3: rule__PersistenceConfiguration__Group_3_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PersistenceConfiguration__Group_3_0_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPersistenceConfigurationAccess().getGroup_3_0_2()); 

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
    // $ANTLR end "rule__PersistenceConfiguration__Group_3_0__2__Impl"


    // $ANTLR start "rule__PersistenceConfiguration__Group_3_0_1__0"
    // InternalPersistence.g:1717:1: rule__PersistenceConfiguration__Group_3_0_1__0 : rule__PersistenceConfiguration__Group_3_0_1__0__Impl rule__PersistenceConfiguration__Group_3_0_1__1 ;
    public final void rule__PersistenceConfiguration__Group_3_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1721:1: ( rule__PersistenceConfiguration__Group_3_0_1__0__Impl rule__PersistenceConfiguration__Group_3_0_1__1 )
            // InternalPersistence.g:1722:2: rule__PersistenceConfiguration__Group_3_0_1__0__Impl rule__PersistenceConfiguration__Group_3_0_1__1
            {
            pushFollow(FOLLOW_8);
            rule__PersistenceConfiguration__Group_3_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersistenceConfiguration__Group_3_0_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__PersistenceConfiguration__Group_3_0_1__0"


    // $ANTLR start "rule__PersistenceConfiguration__Group_3_0_1__0__Impl"
    // InternalPersistence.g:1729:1: rule__PersistenceConfiguration__Group_3_0_1__0__Impl : ( 'strategy' ) ;
    public final void rule__PersistenceConfiguration__Group_3_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1733:1: ( ( 'strategy' ) )
            // InternalPersistence.g:1734:1: ( 'strategy' )
            {
            // InternalPersistence.g:1734:1: ( 'strategy' )
            // InternalPersistence.g:1735:2: 'strategy'
            {
             before(grammarAccess.getPersistenceConfigurationAccess().getStrategyKeyword_3_0_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPersistenceConfigurationAccess().getStrategyKeyword_3_0_1_0()); 

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
    // $ANTLR end "rule__PersistenceConfiguration__Group_3_0_1__0__Impl"


    // $ANTLR start "rule__PersistenceConfiguration__Group_3_0_1__1"
    // InternalPersistence.g:1744:1: rule__PersistenceConfiguration__Group_3_0_1__1 : rule__PersistenceConfiguration__Group_3_0_1__1__Impl rule__PersistenceConfiguration__Group_3_0_1__2 ;
    public final void rule__PersistenceConfiguration__Group_3_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1748:1: ( rule__PersistenceConfiguration__Group_3_0_1__1__Impl rule__PersistenceConfiguration__Group_3_0_1__2 )
            // InternalPersistence.g:1749:2: rule__PersistenceConfiguration__Group_3_0_1__1__Impl rule__PersistenceConfiguration__Group_3_0_1__2
            {
            pushFollow(FOLLOW_9);
            rule__PersistenceConfiguration__Group_3_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersistenceConfiguration__Group_3_0_1__2();

            state._fsp--;


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
    // $ANTLR end "rule__PersistenceConfiguration__Group_3_0_1__1"


    // $ANTLR start "rule__PersistenceConfiguration__Group_3_0_1__1__Impl"
    // InternalPersistence.g:1756:1: rule__PersistenceConfiguration__Group_3_0_1__1__Impl : ( '=' ) ;
    public final void rule__PersistenceConfiguration__Group_3_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1760:1: ( ( '=' ) )
            // InternalPersistence.g:1761:1: ( '=' )
            {
            // InternalPersistence.g:1761:1: ( '=' )
            // InternalPersistence.g:1762:2: '='
            {
             before(grammarAccess.getPersistenceConfigurationAccess().getEqualsSignKeyword_3_0_1_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPersistenceConfigurationAccess().getEqualsSignKeyword_3_0_1_1()); 

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
    // $ANTLR end "rule__PersistenceConfiguration__Group_3_0_1__1__Impl"


    // $ANTLR start "rule__PersistenceConfiguration__Group_3_0_1__2"
    // InternalPersistence.g:1771:1: rule__PersistenceConfiguration__Group_3_0_1__2 : rule__PersistenceConfiguration__Group_3_0_1__2__Impl rule__PersistenceConfiguration__Group_3_0_1__3 ;
    public final void rule__PersistenceConfiguration__Group_3_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1775:1: ( rule__PersistenceConfiguration__Group_3_0_1__2__Impl rule__PersistenceConfiguration__Group_3_0_1__3 )
            // InternalPersistence.g:1776:2: rule__PersistenceConfiguration__Group_3_0_1__2__Impl rule__PersistenceConfiguration__Group_3_0_1__3
            {
            pushFollow(FOLLOW_10);
            rule__PersistenceConfiguration__Group_3_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersistenceConfiguration__Group_3_0_1__3();

            state._fsp--;


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
    // $ANTLR end "rule__PersistenceConfiguration__Group_3_0_1__2"


    // $ANTLR start "rule__PersistenceConfiguration__Group_3_0_1__2__Impl"
    // InternalPersistence.g:1783:1: rule__PersistenceConfiguration__Group_3_0_1__2__Impl : ( ( rule__PersistenceConfiguration__StrategiesAssignment_3_0_1_2 ) ) ;
    public final void rule__PersistenceConfiguration__Group_3_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1787:1: ( ( ( rule__PersistenceConfiguration__StrategiesAssignment_3_0_1_2 ) ) )
            // InternalPersistence.g:1788:1: ( ( rule__PersistenceConfiguration__StrategiesAssignment_3_0_1_2 ) )
            {
            // InternalPersistence.g:1788:1: ( ( rule__PersistenceConfiguration__StrategiesAssignment_3_0_1_2 ) )
            // InternalPersistence.g:1789:2: ( rule__PersistenceConfiguration__StrategiesAssignment_3_0_1_2 )
            {
             before(grammarAccess.getPersistenceConfigurationAccess().getStrategiesAssignment_3_0_1_2()); 
            // InternalPersistence.g:1790:2: ( rule__PersistenceConfiguration__StrategiesAssignment_3_0_1_2 )
            // InternalPersistence.g:1790:3: rule__PersistenceConfiguration__StrategiesAssignment_3_0_1_2
            {
            pushFollow(FOLLOW_2);
            rule__PersistenceConfiguration__StrategiesAssignment_3_0_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPersistenceConfigurationAccess().getStrategiesAssignment_3_0_1_2()); 

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
    // $ANTLR end "rule__PersistenceConfiguration__Group_3_0_1__2__Impl"


    // $ANTLR start "rule__PersistenceConfiguration__Group_3_0_1__3"
    // InternalPersistence.g:1798:1: rule__PersistenceConfiguration__Group_3_0_1__3 : rule__PersistenceConfiguration__Group_3_0_1__3__Impl ;
    public final void rule__PersistenceConfiguration__Group_3_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1802:1: ( rule__PersistenceConfiguration__Group_3_0_1__3__Impl )
            // InternalPersistence.g:1803:2: rule__PersistenceConfiguration__Group_3_0_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PersistenceConfiguration__Group_3_0_1__3__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__PersistenceConfiguration__Group_3_0_1__3"


    // $ANTLR start "rule__PersistenceConfiguration__Group_3_0_1__3__Impl"
    // InternalPersistence.g:1809:1: rule__PersistenceConfiguration__Group_3_0_1__3__Impl : ( ( rule__PersistenceConfiguration__Group_3_0_1_3__0 )* ) ;
    public final void rule__PersistenceConfiguration__Group_3_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1813:1: ( ( ( rule__PersistenceConfiguration__Group_3_0_1_3__0 )* ) )
            // InternalPersistence.g:1814:1: ( ( rule__PersistenceConfiguration__Group_3_0_1_3__0 )* )
            {
            // InternalPersistence.g:1814:1: ( ( rule__PersistenceConfiguration__Group_3_0_1_3__0 )* )
            // InternalPersistence.g:1815:2: ( rule__PersistenceConfiguration__Group_3_0_1_3__0 )*
            {
             before(grammarAccess.getPersistenceConfigurationAccess().getGroup_3_0_1_3()); 
            // InternalPersistence.g:1816:2: ( rule__PersistenceConfiguration__Group_3_0_1_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==21) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPersistence.g:1816:3: rule__PersistenceConfiguration__Group_3_0_1_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__PersistenceConfiguration__Group_3_0_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getPersistenceConfigurationAccess().getGroup_3_0_1_3()); 

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
    // $ANTLR end "rule__PersistenceConfiguration__Group_3_0_1__3__Impl"


    // $ANTLR start "rule__PersistenceConfiguration__Group_3_0_1_3__0"
    // InternalPersistence.g:1825:1: rule__PersistenceConfiguration__Group_3_0_1_3__0 : rule__PersistenceConfiguration__Group_3_0_1_3__0__Impl rule__PersistenceConfiguration__Group_3_0_1_3__1 ;
    public final void rule__PersistenceConfiguration__Group_3_0_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1829:1: ( rule__PersistenceConfiguration__Group_3_0_1_3__0__Impl rule__PersistenceConfiguration__Group_3_0_1_3__1 )
            // InternalPersistence.g:1830:2: rule__PersistenceConfiguration__Group_3_0_1_3__0__Impl rule__PersistenceConfiguration__Group_3_0_1_3__1
            {
            pushFollow(FOLLOW_9);
            rule__PersistenceConfiguration__Group_3_0_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersistenceConfiguration__Group_3_0_1_3__1();

            state._fsp--;


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
    // $ANTLR end "rule__PersistenceConfiguration__Group_3_0_1_3__0"


    // $ANTLR start "rule__PersistenceConfiguration__Group_3_0_1_3__0__Impl"
    // InternalPersistence.g:1837:1: rule__PersistenceConfiguration__Group_3_0_1_3__0__Impl : ( ',' ) ;
    public final void rule__PersistenceConfiguration__Group_3_0_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1841:1: ( ( ',' ) )
            // InternalPersistence.g:1842:1: ( ',' )
            {
            // InternalPersistence.g:1842:1: ( ',' )
            // InternalPersistence.g:1843:2: ','
            {
             before(grammarAccess.getPersistenceConfigurationAccess().getCommaKeyword_3_0_1_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPersistenceConfigurationAccess().getCommaKeyword_3_0_1_3_0()); 

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
    // $ANTLR end "rule__PersistenceConfiguration__Group_3_0_1_3__0__Impl"


    // $ANTLR start "rule__PersistenceConfiguration__Group_3_0_1_3__1"
    // InternalPersistence.g:1852:1: rule__PersistenceConfiguration__Group_3_0_1_3__1 : rule__PersistenceConfiguration__Group_3_0_1_3__1__Impl ;
    public final void rule__PersistenceConfiguration__Group_3_0_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1856:1: ( rule__PersistenceConfiguration__Group_3_0_1_3__1__Impl )
            // InternalPersistence.g:1857:2: rule__PersistenceConfiguration__Group_3_0_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PersistenceConfiguration__Group_3_0_1_3__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__PersistenceConfiguration__Group_3_0_1_3__1"


    // $ANTLR start "rule__PersistenceConfiguration__Group_3_0_1_3__1__Impl"
    // InternalPersistence.g:1863:1: rule__PersistenceConfiguration__Group_3_0_1_3__1__Impl : ( ( rule__PersistenceConfiguration__StrategiesAssignment_3_0_1_3_1 ) ) ;
    public final void rule__PersistenceConfiguration__Group_3_0_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1867:1: ( ( ( rule__PersistenceConfiguration__StrategiesAssignment_3_0_1_3_1 ) ) )
            // InternalPersistence.g:1868:1: ( ( rule__PersistenceConfiguration__StrategiesAssignment_3_0_1_3_1 ) )
            {
            // InternalPersistence.g:1868:1: ( ( rule__PersistenceConfiguration__StrategiesAssignment_3_0_1_3_1 ) )
            // InternalPersistence.g:1869:2: ( rule__PersistenceConfiguration__StrategiesAssignment_3_0_1_3_1 )
            {
             before(grammarAccess.getPersistenceConfigurationAccess().getStrategiesAssignment_3_0_1_3_1()); 
            // InternalPersistence.g:1870:2: ( rule__PersistenceConfiguration__StrategiesAssignment_3_0_1_3_1 )
            // InternalPersistence.g:1870:3: rule__PersistenceConfiguration__StrategiesAssignment_3_0_1_3_1
            {
            pushFollow(FOLLOW_2);
            rule__PersistenceConfiguration__StrategiesAssignment_3_0_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPersistenceConfigurationAccess().getStrategiesAssignment_3_0_1_3_1()); 

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
    // $ANTLR end "rule__PersistenceConfiguration__Group_3_0_1_3__1__Impl"


    // $ANTLR start "rule__PersistenceConfiguration__Group_3_0_2__0"
    // InternalPersistence.g:1879:1: rule__PersistenceConfiguration__Group_3_0_2__0 : rule__PersistenceConfiguration__Group_3_0_2__0__Impl rule__PersistenceConfiguration__Group_3_0_2__1 ;
    public final void rule__PersistenceConfiguration__Group_3_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1883:1: ( rule__PersistenceConfiguration__Group_3_0_2__0__Impl rule__PersistenceConfiguration__Group_3_0_2__1 )
            // InternalPersistence.g:1884:2: rule__PersistenceConfiguration__Group_3_0_2__0__Impl rule__PersistenceConfiguration__Group_3_0_2__1
            {
            pushFollow(FOLLOW_8);
            rule__PersistenceConfiguration__Group_3_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersistenceConfiguration__Group_3_0_2__1();

            state._fsp--;


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
    // $ANTLR end "rule__PersistenceConfiguration__Group_3_0_2__0"


    // $ANTLR start "rule__PersistenceConfiguration__Group_3_0_2__0__Impl"
    // InternalPersistence.g:1891:1: rule__PersistenceConfiguration__Group_3_0_2__0__Impl : ( 'filter' ) ;
    public final void rule__PersistenceConfiguration__Group_3_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1895:1: ( ( 'filter' ) )
            // InternalPersistence.g:1896:1: ( 'filter' )
            {
            // InternalPersistence.g:1896:1: ( 'filter' )
            // InternalPersistence.g:1897:2: 'filter'
            {
             before(grammarAccess.getPersistenceConfigurationAccess().getFilterKeyword_3_0_2_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPersistenceConfigurationAccess().getFilterKeyword_3_0_2_0()); 

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
    // $ANTLR end "rule__PersistenceConfiguration__Group_3_0_2__0__Impl"


    // $ANTLR start "rule__PersistenceConfiguration__Group_3_0_2__1"
    // InternalPersistence.g:1906:1: rule__PersistenceConfiguration__Group_3_0_2__1 : rule__PersistenceConfiguration__Group_3_0_2__1__Impl rule__PersistenceConfiguration__Group_3_0_2__2 ;
    public final void rule__PersistenceConfiguration__Group_3_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1910:1: ( rule__PersistenceConfiguration__Group_3_0_2__1__Impl rule__PersistenceConfiguration__Group_3_0_2__2 )
            // InternalPersistence.g:1911:2: rule__PersistenceConfiguration__Group_3_0_2__1__Impl rule__PersistenceConfiguration__Group_3_0_2__2
            {
            pushFollow(FOLLOW_9);
            rule__PersistenceConfiguration__Group_3_0_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersistenceConfiguration__Group_3_0_2__2();

            state._fsp--;


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
    // $ANTLR end "rule__PersistenceConfiguration__Group_3_0_2__1"


    // $ANTLR start "rule__PersistenceConfiguration__Group_3_0_2__1__Impl"
    // InternalPersistence.g:1918:1: rule__PersistenceConfiguration__Group_3_0_2__1__Impl : ( '=' ) ;
    public final void rule__PersistenceConfiguration__Group_3_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1922:1: ( ( '=' ) )
            // InternalPersistence.g:1923:1: ( '=' )
            {
            // InternalPersistence.g:1923:1: ( '=' )
            // InternalPersistence.g:1924:2: '='
            {
             before(grammarAccess.getPersistenceConfigurationAccess().getEqualsSignKeyword_3_0_2_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPersistenceConfigurationAccess().getEqualsSignKeyword_3_0_2_1()); 

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
    // $ANTLR end "rule__PersistenceConfiguration__Group_3_0_2__1__Impl"


    // $ANTLR start "rule__PersistenceConfiguration__Group_3_0_2__2"
    // InternalPersistence.g:1933:1: rule__PersistenceConfiguration__Group_3_0_2__2 : rule__PersistenceConfiguration__Group_3_0_2__2__Impl rule__PersistenceConfiguration__Group_3_0_2__3 ;
    public final void rule__PersistenceConfiguration__Group_3_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1937:1: ( rule__PersistenceConfiguration__Group_3_0_2__2__Impl rule__PersistenceConfiguration__Group_3_0_2__3 )
            // InternalPersistence.g:1938:2: rule__PersistenceConfiguration__Group_3_0_2__2__Impl rule__PersistenceConfiguration__Group_3_0_2__3
            {
            pushFollow(FOLLOW_10);
            rule__PersistenceConfiguration__Group_3_0_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersistenceConfiguration__Group_3_0_2__3();

            state._fsp--;


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
    // $ANTLR end "rule__PersistenceConfiguration__Group_3_0_2__2"


    // $ANTLR start "rule__PersistenceConfiguration__Group_3_0_2__2__Impl"
    // InternalPersistence.g:1945:1: rule__PersistenceConfiguration__Group_3_0_2__2__Impl : ( ( rule__PersistenceConfiguration__FiltersAssignment_3_0_2_2 ) ) ;
    public final void rule__PersistenceConfiguration__Group_3_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1949:1: ( ( ( rule__PersistenceConfiguration__FiltersAssignment_3_0_2_2 ) ) )
            // InternalPersistence.g:1950:1: ( ( rule__PersistenceConfiguration__FiltersAssignment_3_0_2_2 ) )
            {
            // InternalPersistence.g:1950:1: ( ( rule__PersistenceConfiguration__FiltersAssignment_3_0_2_2 ) )
            // InternalPersistence.g:1951:2: ( rule__PersistenceConfiguration__FiltersAssignment_3_0_2_2 )
            {
             before(grammarAccess.getPersistenceConfigurationAccess().getFiltersAssignment_3_0_2_2()); 
            // InternalPersistence.g:1952:2: ( rule__PersistenceConfiguration__FiltersAssignment_3_0_2_2 )
            // InternalPersistence.g:1952:3: rule__PersistenceConfiguration__FiltersAssignment_3_0_2_2
            {
            pushFollow(FOLLOW_2);
            rule__PersistenceConfiguration__FiltersAssignment_3_0_2_2();

            state._fsp--;


            }

             after(grammarAccess.getPersistenceConfigurationAccess().getFiltersAssignment_3_0_2_2()); 

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
    // $ANTLR end "rule__PersistenceConfiguration__Group_3_0_2__2__Impl"


    // $ANTLR start "rule__PersistenceConfiguration__Group_3_0_2__3"
    // InternalPersistence.g:1960:1: rule__PersistenceConfiguration__Group_3_0_2__3 : rule__PersistenceConfiguration__Group_3_0_2__3__Impl ;
    public final void rule__PersistenceConfiguration__Group_3_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1964:1: ( rule__PersistenceConfiguration__Group_3_0_2__3__Impl )
            // InternalPersistence.g:1965:2: rule__PersistenceConfiguration__Group_3_0_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PersistenceConfiguration__Group_3_0_2__3__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__PersistenceConfiguration__Group_3_0_2__3"


    // $ANTLR start "rule__PersistenceConfiguration__Group_3_0_2__3__Impl"
    // InternalPersistence.g:1971:1: rule__PersistenceConfiguration__Group_3_0_2__3__Impl : ( ( rule__PersistenceConfiguration__Group_3_0_2_3__0 )* ) ;
    public final void rule__PersistenceConfiguration__Group_3_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1975:1: ( ( ( rule__PersistenceConfiguration__Group_3_0_2_3__0 )* ) )
            // InternalPersistence.g:1976:1: ( ( rule__PersistenceConfiguration__Group_3_0_2_3__0 )* )
            {
            // InternalPersistence.g:1976:1: ( ( rule__PersistenceConfiguration__Group_3_0_2_3__0 )* )
            // InternalPersistence.g:1977:2: ( rule__PersistenceConfiguration__Group_3_0_2_3__0 )*
            {
             before(grammarAccess.getPersistenceConfigurationAccess().getGroup_3_0_2_3()); 
            // InternalPersistence.g:1978:2: ( rule__PersistenceConfiguration__Group_3_0_2_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==21) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalPersistence.g:1978:3: rule__PersistenceConfiguration__Group_3_0_2_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__PersistenceConfiguration__Group_3_0_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getPersistenceConfigurationAccess().getGroup_3_0_2_3()); 

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
    // $ANTLR end "rule__PersistenceConfiguration__Group_3_0_2__3__Impl"


    // $ANTLR start "rule__PersistenceConfiguration__Group_3_0_2_3__0"
    // InternalPersistence.g:1987:1: rule__PersistenceConfiguration__Group_3_0_2_3__0 : rule__PersistenceConfiguration__Group_3_0_2_3__0__Impl rule__PersistenceConfiguration__Group_3_0_2_3__1 ;
    public final void rule__PersistenceConfiguration__Group_3_0_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:1991:1: ( rule__PersistenceConfiguration__Group_3_0_2_3__0__Impl rule__PersistenceConfiguration__Group_3_0_2_3__1 )
            // InternalPersistence.g:1992:2: rule__PersistenceConfiguration__Group_3_0_2_3__0__Impl rule__PersistenceConfiguration__Group_3_0_2_3__1
            {
            pushFollow(FOLLOW_9);
            rule__PersistenceConfiguration__Group_3_0_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersistenceConfiguration__Group_3_0_2_3__1();

            state._fsp--;


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
    // $ANTLR end "rule__PersistenceConfiguration__Group_3_0_2_3__0"


    // $ANTLR start "rule__PersistenceConfiguration__Group_3_0_2_3__0__Impl"
    // InternalPersistence.g:1999:1: rule__PersistenceConfiguration__Group_3_0_2_3__0__Impl : ( ',' ) ;
    public final void rule__PersistenceConfiguration__Group_3_0_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:2003:1: ( ( ',' ) )
            // InternalPersistence.g:2004:1: ( ',' )
            {
            // InternalPersistence.g:2004:1: ( ',' )
            // InternalPersistence.g:2005:2: ','
            {
             before(grammarAccess.getPersistenceConfigurationAccess().getCommaKeyword_3_0_2_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPersistenceConfigurationAccess().getCommaKeyword_3_0_2_3_0()); 

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
    // $ANTLR end "rule__PersistenceConfiguration__Group_3_0_2_3__0__Impl"


    // $ANTLR start "rule__PersistenceConfiguration__Group_3_0_2_3__1"
    // InternalPersistence.g:2014:1: rule__PersistenceConfiguration__Group_3_0_2_3__1 : rule__PersistenceConfiguration__Group_3_0_2_3__1__Impl ;
    public final void rule__PersistenceConfiguration__Group_3_0_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:2018:1: ( rule__PersistenceConfiguration__Group_3_0_2_3__1__Impl )
            // InternalPersistence.g:2019:2: rule__PersistenceConfiguration__Group_3_0_2_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PersistenceConfiguration__Group_3_0_2_3__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__PersistenceConfiguration__Group_3_0_2_3__1"


    // $ANTLR start "rule__PersistenceConfiguration__Group_3_0_2_3__1__Impl"
    // InternalPersistence.g:2025:1: rule__PersistenceConfiguration__Group_3_0_2_3__1__Impl : ( ( rule__PersistenceConfiguration__FiltersAssignment_3_0_2_3_1 ) ) ;
    public final void rule__PersistenceConfiguration__Group_3_0_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:2029:1: ( ( ( rule__PersistenceConfiguration__FiltersAssignment_3_0_2_3_1 ) ) )
            // InternalPersistence.g:2030:1: ( ( rule__PersistenceConfiguration__FiltersAssignment_3_0_2_3_1 ) )
            {
            // InternalPersistence.g:2030:1: ( ( rule__PersistenceConfiguration__FiltersAssignment_3_0_2_3_1 ) )
            // InternalPersistence.g:2031:2: ( rule__PersistenceConfiguration__FiltersAssignment_3_0_2_3_1 )
            {
             before(grammarAccess.getPersistenceConfigurationAccess().getFiltersAssignment_3_0_2_3_1()); 
            // InternalPersistence.g:2032:2: ( rule__PersistenceConfiguration__FiltersAssignment_3_0_2_3_1 )
            // InternalPersistence.g:2032:3: rule__PersistenceConfiguration__FiltersAssignment_3_0_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__PersistenceConfiguration__FiltersAssignment_3_0_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPersistenceConfigurationAccess().getFiltersAssignment_3_0_2_3_1()); 

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
    // $ANTLR end "rule__PersistenceConfiguration__Group_3_0_2_3__1__Impl"


    // $ANTLR start "rule__AllConfig__Group__0"
    // InternalPersistence.g:2041:1: rule__AllConfig__Group__0 : rule__AllConfig__Group__0__Impl rule__AllConfig__Group__1 ;
    public final void rule__AllConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:2045:1: ( rule__AllConfig__Group__0__Impl rule__AllConfig__Group__1 )
            // InternalPersistence.g:2046:2: rule__AllConfig__Group__0__Impl rule__AllConfig__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__AllConfig__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllConfig__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__AllConfig__Group__0"


    // $ANTLR start "rule__AllConfig__Group__0__Impl"
    // InternalPersistence.g:2053:1: rule__AllConfig__Group__0__Impl : ( () ) ;
    public final void rule__AllConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:2057:1: ( ( () ) )
            // InternalPersistence.g:2058:1: ( () )
            {
            // InternalPersistence.g:2058:1: ( () )
            // InternalPersistence.g:2059:2: ()
            {
             before(grammarAccess.getAllConfigAccess().getAllConfigAction_0()); 
            // InternalPersistence.g:2060:2: ()
            // InternalPersistence.g:2060:3: 
            {
            }

             after(grammarAccess.getAllConfigAccess().getAllConfigAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConfig__Group__0__Impl"


    // $ANTLR start "rule__AllConfig__Group__1"
    // InternalPersistence.g:2068:1: rule__AllConfig__Group__1 : rule__AllConfig__Group__1__Impl ;
    public final void rule__AllConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:2072:1: ( rule__AllConfig__Group__1__Impl )
            // InternalPersistence.g:2073:2: rule__AllConfig__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllConfig__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__AllConfig__Group__1"


    // $ANTLR start "rule__AllConfig__Group__1__Impl"
    // InternalPersistence.g:2079:1: rule__AllConfig__Group__1__Impl : ( '*' ) ;
    public final void rule__AllConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:2083:1: ( ( '*' ) )
            // InternalPersistence.g:2084:1: ( '*' )
            {
            // InternalPersistence.g:2084:1: ( '*' )
            // InternalPersistence.g:2085:2: '*'
            {
             before(grammarAccess.getAllConfigAccess().getAsteriskKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAllConfigAccess().getAsteriskKeyword_1()); 

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
    // $ANTLR end "rule__AllConfig__Group__1__Impl"


    // $ANTLR start "rule__GroupConfig__Group__0"
    // InternalPersistence.g:2095:1: rule__GroupConfig__Group__0 : rule__GroupConfig__Group__0__Impl rule__GroupConfig__Group__1 ;
    public final void rule__GroupConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:2099:1: ( rule__GroupConfig__Group__0__Impl rule__GroupConfig__Group__1 )
            // InternalPersistence.g:2100:2: rule__GroupConfig__Group__0__Impl rule__GroupConfig__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__GroupConfig__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupConfig__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__GroupConfig__Group__0"


    // $ANTLR start "rule__GroupConfig__Group__0__Impl"
    // InternalPersistence.g:2107:1: rule__GroupConfig__Group__0__Impl : ( ( rule__GroupConfig__GroupAssignment_0 ) ) ;
    public final void rule__GroupConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:2111:1: ( ( ( rule__GroupConfig__GroupAssignment_0 ) ) )
            // InternalPersistence.g:2112:1: ( ( rule__GroupConfig__GroupAssignment_0 ) )
            {
            // InternalPersistence.g:2112:1: ( ( rule__GroupConfig__GroupAssignment_0 ) )
            // InternalPersistence.g:2113:2: ( rule__GroupConfig__GroupAssignment_0 )
            {
             before(grammarAccess.getGroupConfigAccess().getGroupAssignment_0()); 
            // InternalPersistence.g:2114:2: ( rule__GroupConfig__GroupAssignment_0 )
            // InternalPersistence.g:2114:3: rule__GroupConfig__GroupAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__GroupConfig__GroupAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGroupConfigAccess().getGroupAssignment_0()); 

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
    // $ANTLR end "rule__GroupConfig__Group__0__Impl"


    // $ANTLR start "rule__GroupConfig__Group__1"
    // InternalPersistence.g:2122:1: rule__GroupConfig__Group__1 : rule__GroupConfig__Group__1__Impl ;
    public final void rule__GroupConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:2126:1: ( rule__GroupConfig__Group__1__Impl )
            // InternalPersistence.g:2127:2: rule__GroupConfig__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GroupConfig__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__GroupConfig__Group__1"


    // $ANTLR start "rule__GroupConfig__Group__1__Impl"
    // InternalPersistence.g:2133:1: rule__GroupConfig__Group__1__Impl : ( '*' ) ;
    public final void rule__GroupConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:2137:1: ( ( '*' ) )
            // InternalPersistence.g:2138:1: ( '*' )
            {
            // InternalPersistence.g:2138:1: ( '*' )
            // InternalPersistence.g:2139:2: '*'
            {
             before(grammarAccess.getGroupConfigAccess().getAsteriskKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getGroupConfigAccess().getAsteriskKeyword_1()); 

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
    // $ANTLR end "rule__GroupConfig__Group__1__Impl"


    // $ANTLR start "rule__DECIMAL__Group__0"
    // InternalPersistence.g:2149:1: rule__DECIMAL__Group__0 : rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1 ;
    public final void rule__DECIMAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:2153:1: ( rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1 )
            // InternalPersistence.g:2154:2: rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__DECIMAL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DECIMAL__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__DECIMAL__Group__0"


    // $ANTLR start "rule__DECIMAL__Group__0__Impl"
    // InternalPersistence.g:2161:1: rule__DECIMAL__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DECIMAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:2165:1: ( ( RULE_INT ) )
            // InternalPersistence.g:2166:1: ( RULE_INT )
            {
            // InternalPersistence.g:2166:1: ( RULE_INT )
            // InternalPersistence.g:2167:2: RULE_INT
            {
             before(grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__DECIMAL__Group__0__Impl"


    // $ANTLR start "rule__DECIMAL__Group__1"
    // InternalPersistence.g:2176:1: rule__DECIMAL__Group__1 : rule__DECIMAL__Group__1__Impl ;
    public final void rule__DECIMAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:2180:1: ( rule__DECIMAL__Group__1__Impl )
            // InternalPersistence.g:2181:2: rule__DECIMAL__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DECIMAL__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__DECIMAL__Group__1"


    // $ANTLR start "rule__DECIMAL__Group__1__Impl"
    // InternalPersistence.g:2187:1: rule__DECIMAL__Group__1__Impl : ( ( rule__DECIMAL__Group_1__0 )? ) ;
    public final void rule__DECIMAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:2191:1: ( ( ( rule__DECIMAL__Group_1__0 )? ) )
            // InternalPersistence.g:2192:1: ( ( rule__DECIMAL__Group_1__0 )? )
            {
            // InternalPersistence.g:2192:1: ( ( rule__DECIMAL__Group_1__0 )? )
            // InternalPersistence.g:2193:2: ( rule__DECIMAL__Group_1__0 )?
            {
             before(grammarAccess.getDECIMALAccess().getGroup_1()); 
            // InternalPersistence.g:2194:2: ( rule__DECIMAL__Group_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPersistence.g:2194:3: rule__DECIMAL__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DECIMAL__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDECIMALAccess().getGroup_1()); 

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
    // $ANTLR end "rule__DECIMAL__Group__1__Impl"


    // $ANTLR start "rule__DECIMAL__Group_1__0"
    // InternalPersistence.g:2203:1: rule__DECIMAL__Group_1__0 : rule__DECIMAL__Group_1__0__Impl rule__DECIMAL__Group_1__1 ;
    public final void rule__DECIMAL__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:2207:1: ( rule__DECIMAL__Group_1__0__Impl rule__DECIMAL__Group_1__1 )
            // InternalPersistence.g:2208:2: rule__DECIMAL__Group_1__0__Impl rule__DECIMAL__Group_1__1
            {
            pushFollow(FOLLOW_18);
            rule__DECIMAL__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DECIMAL__Group_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__DECIMAL__Group_1__0"


    // $ANTLR start "rule__DECIMAL__Group_1__0__Impl"
    // InternalPersistence.g:2215:1: rule__DECIMAL__Group_1__0__Impl : ( '.' ) ;
    public final void rule__DECIMAL__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:2219:1: ( ( '.' ) )
            // InternalPersistence.g:2220:1: ( '.' )
            {
            // InternalPersistence.g:2220:1: ( '.' )
            // InternalPersistence.g:2221:2: '.'
            {
             before(grammarAccess.getDECIMALAccess().getFullStopKeyword_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDECIMALAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__DECIMAL__Group_1__0__Impl"


    // $ANTLR start "rule__DECIMAL__Group_1__1"
    // InternalPersistence.g:2230:1: rule__DECIMAL__Group_1__1 : rule__DECIMAL__Group_1__1__Impl ;
    public final void rule__DECIMAL__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:2234:1: ( rule__DECIMAL__Group_1__1__Impl )
            // InternalPersistence.g:2235:2: rule__DECIMAL__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DECIMAL__Group_1__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__DECIMAL__Group_1__1"


    // $ANTLR start "rule__DECIMAL__Group_1__1__Impl"
    // InternalPersistence.g:2241:1: rule__DECIMAL__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__DECIMAL__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:2245:1: ( ( RULE_INT ) )
            // InternalPersistence.g:2246:1: ( RULE_INT )
            {
            // InternalPersistence.g:2246:1: ( RULE_INT )
            // InternalPersistence.g:2247:2: RULE_INT
            {
             before(grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__DECIMAL__Group_1__1__Impl"


    // $ANTLR start "rule__PersistenceModel__StrategiesAssignment_3"
    // InternalPersistence.g:2257:1: rule__PersistenceModel__StrategiesAssignment_3 : ( ruleStrategy ) ;
    public final void rule__PersistenceModel__StrategiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:2261:1: ( ( ruleStrategy ) )
            // InternalPersistence.g:2262:2: ( ruleStrategy )
            {
            // InternalPersistence.g:2262:2: ( ruleStrategy )
            // InternalPersistence.g:2263:3: ruleStrategy
            {
             before(grammarAccess.getPersistenceModelAccess().getStrategiesStrategyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStrategy();

            state._fsp--;

             after(grammarAccess.getPersistenceModelAccess().getStrategiesStrategyParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__PersistenceModel__StrategiesAssignment_3"


    // $ANTLR start "rule__PersistenceModel__DefaultsAssignment_4_2"
    // InternalPersistence.g:2272:1: rule__PersistenceModel__DefaultsAssignment_4_2 : ( ( RULE_ID ) ) ;
    public final void rule__PersistenceModel__DefaultsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:2276:1: ( ( ( RULE_ID ) ) )
            // InternalPersistence.g:2277:2: ( ( RULE_ID ) )
            {
            // InternalPersistence.g:2277:2: ( ( RULE_ID ) )
            // InternalPersistence.g:2278:3: ( RULE_ID )
            {
             before(grammarAccess.getPersistenceModelAccess().getDefaultsStrategyCrossReference_4_2_0()); 
            // InternalPersistence.g:2279:3: ( RULE_ID )
            // InternalPersistence.g:2280:4: RULE_ID
            {
             before(grammarAccess.getPersistenceModelAccess().getDefaultsStrategyIDTerminalRuleCall_4_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPersistenceModelAccess().getDefaultsStrategyIDTerminalRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getPersistenceModelAccess().getDefaultsStrategyCrossReference_4_2_0()); 

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
    // $ANTLR end "rule__PersistenceModel__DefaultsAssignment_4_2"


    // $ANTLR start "rule__PersistenceModel__DefaultsAssignment_4_3_1"
    // InternalPersistence.g:2291:1: rule__PersistenceModel__DefaultsAssignment_4_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__PersistenceModel__DefaultsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:2295:1: ( ( ( RULE_ID ) ) )
            // InternalPersistence.g:2296:2: ( ( RULE_ID ) )
            {
            // InternalPersistence.g:2296:2: ( ( RULE_ID ) )
            // InternalPersistence.g:2297:3: ( RULE_ID )
            {
             before(grammarAccess.getPersistenceModelAccess().getDefaultsStrategyCrossReference_4_3_1_0()); 
            // InternalPersistence.g:2298:3: ( RULE_ID )
            // InternalPersistence.g:2299:4: RULE_ID
            {
             before(grammarAccess.getPersistenceModelAccess().getDefaultsStrategyIDTerminalRuleCall_4_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPersistenceModelAccess().getDefaultsStrategyIDTerminalRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getPersistenceModelAccess().getDefaultsStrategyCrossReference_4_3_1_0()); 

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
    // $ANTLR end "rule__PersistenceModel__DefaultsAssignment_4_3_1"


    // $ANTLR start "rule__PersistenceModel__FiltersAssignment_6_2"
    // InternalPersistence.g:2310:1: rule__PersistenceModel__FiltersAssignment_6_2 : ( ruleFilter ) ;
    public final void rule__PersistenceModel__FiltersAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:2314:1: ( ( ruleFilter ) )
            // InternalPersistence.g:2315:2: ( ruleFilter )
            {
            // InternalPersistence.g:2315:2: ( ruleFilter )
            // InternalPersistence.g:2316:3: ruleFilter
            {
             before(grammarAccess.getPersistenceModelAccess().getFiltersFilterParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFilter();

            state._fsp--;

             after(grammarAccess.getPersistenceModelAccess().getFiltersFilterParserRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__PersistenceModel__FiltersAssignment_6_2"


    // $ANTLR start "rule__PersistenceModel__ConfigsAssignment_7_2"
    // InternalPersistence.g:2325:1: rule__PersistenceModel__ConfigsAssignment_7_2 : ( rulePersistenceConfiguration ) ;
    public final void rule__PersistenceModel__ConfigsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:2329:1: ( ( rulePersistenceConfiguration ) )
            // InternalPersistence.g:2330:2: ( rulePersistenceConfiguration )
            {
            // InternalPersistence.g:2330:2: ( rulePersistenceConfiguration )
            // InternalPersistence.g:2331:3: rulePersistenceConfiguration
            {
             before(grammarAccess.getPersistenceModelAccess().getConfigsPersistenceConfigurationParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            rulePersistenceConfiguration();

            state._fsp--;

             after(grammarAccess.getPersistenceModelAccess().getConfigsPersistenceConfigurationParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__PersistenceModel__ConfigsAssignment_7_2"


    // $ANTLR start "rule__Strategy__NameAssignment_1"
    // InternalPersistence.g:2340:1: rule__Strategy__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Strategy__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:2344:1: ( ( RULE_ID ) )
            // InternalPersistence.g:2345:2: ( RULE_ID )
            {
            // InternalPersistence.g:2345:2: ( RULE_ID )
            // InternalPersistence.g:2346:3: RULE_ID
            {
             before(grammarAccess.getStrategyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStrategyAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Strategy__NameAssignment_1"


    // $ANTLR start "rule__CronStrategy__NameAssignment_1"
    // InternalPersistence.g:2355:1: rule__CronStrategy__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CronStrategy__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:2359:1: ( ( RULE_ID ) )
            // InternalPersistence.g:2360:2: ( RULE_ID )
            {
            // InternalPersistence.g:2360:2: ( RULE_ID )
            // InternalPersistence.g:2361:3: RULE_ID
            {
             before(grammarAccess.getCronStrategyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCronStrategyAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__CronStrategy__NameAssignment_1"


    // $ANTLR start "rule__CronStrategy__CronExpressionAssignment_3"
    // InternalPersistence.g:2370:1: rule__CronStrategy__CronExpressionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__CronStrategy__CronExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:2374:1: ( ( RULE_STRING ) )
            // InternalPersistence.g:2375:2: ( RULE_STRING )
            {
            // InternalPersistence.g:2375:2: ( RULE_STRING )
            // InternalPersistence.g:2376:3: RULE_STRING
            {
             before(grammarAccess.getCronStrategyAccess().getCronExpressionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCronStrategyAccess().getCronExpressionSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__CronStrategy__CronExpressionAssignment_3"


    // $ANTLR start "rule__Filter__NameAssignment_0"
    // InternalPersistence.g:2385:1: rule__Filter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Filter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:2389:1: ( ( RULE_ID ) )
            // InternalPersistence.g:2390:2: ( RULE_ID )
            {
            // InternalPersistence.g:2390:2: ( RULE_ID )
            // InternalPersistence.g:2391:3: RULE_ID
            {
             before(grammarAccess.getFilterAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Filter__NameAssignment_0"


    // $ANTLR start "rule__Filter__DefinitionAssignment_2"
    // InternalPersistence.g:2400:1: rule__Filter__DefinitionAssignment_2 : ( ruleFilterDetails ) ;
    public final void rule__Filter__DefinitionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:2404:1: ( ( ruleFilterDetails ) )
            // InternalPersistence.g:2405:2: ( ruleFilterDetails )
            {
            // InternalPersistence.g:2405:2: ( ruleFilterDetails )
            // InternalPersistence.g:2406:3: ruleFilterDetails
            {
             before(grammarAccess.getFilterAccess().getDefinitionFilterDetailsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFilterDetails();

            state._fsp--;

             after(grammarAccess.getFilterAccess().getDefinitionFilterDetailsParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Filter__DefinitionAssignment_2"


    // $ANTLR start "rule__ThresholdFilter__ValueAssignment_1"
    // InternalPersistence.g:2415:1: rule__ThresholdFilter__ValueAssignment_1 : ( ruleDECIMAL ) ;
    public final void rule__ThresholdFilter__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:2419:1: ( ( ruleDECIMAL ) )
            // InternalPersistence.g:2420:2: ( ruleDECIMAL )
            {
            // InternalPersistence.g:2420:2: ( ruleDECIMAL )
            // InternalPersistence.g:2421:3: ruleDECIMAL
            {
             before(grammarAccess.getThresholdFilterAccess().getValueDECIMALParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDECIMAL();

            state._fsp--;

             after(grammarAccess.getThresholdFilterAccess().getValueDECIMALParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ThresholdFilter__ValueAssignment_1"


    // $ANTLR start "rule__ThresholdFilter__PercentAssignment_2"
    // InternalPersistence.g:2430:1: rule__ThresholdFilter__PercentAssignment_2 : ( ( '%' ) ) ;
    public final void rule__ThresholdFilter__PercentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:2434:1: ( ( ( '%' ) ) )
            // InternalPersistence.g:2435:2: ( ( '%' ) )
            {
            // InternalPersistence.g:2435:2: ( ( '%' ) )
            // InternalPersistence.g:2436:3: ( '%' )
            {
             before(grammarAccess.getThresholdFilterAccess().getPercentPercentSignKeyword_2_0()); 
            // InternalPersistence.g:2437:3: ( '%' )
            // InternalPersistence.g:2438:4: '%'
            {
             before(grammarAccess.getThresholdFilterAccess().getPercentPercentSignKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getThresholdFilterAccess().getPercentPercentSignKeyword_2_0()); 

            }

             after(grammarAccess.getThresholdFilterAccess().getPercentPercentSignKeyword_2_0()); 

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
    // $ANTLR end "rule__ThresholdFilter__PercentAssignment_2"


    // $ANTLR start "rule__TimeFilter__ValueAssignment_0"
    // InternalPersistence.g:2449:1: rule__TimeFilter__ValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__TimeFilter__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:2453:1: ( ( RULE_INT ) )
            // InternalPersistence.g:2454:2: ( RULE_INT )
            {
            // InternalPersistence.g:2454:2: ( RULE_INT )
            // InternalPersistence.g:2455:3: RULE_INT
            {
             before(grammarAccess.getTimeFilterAccess().getValueINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTimeFilterAccess().getValueINTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__TimeFilter__ValueAssignment_0"


    // $ANTLR start "rule__TimeFilter__UnitAssignment_1"
    // InternalPersistence.g:2464:1: rule__TimeFilter__UnitAssignment_1 : ( ( rule__TimeFilter__UnitAlternatives_1_0 ) ) ;
    public final void rule__TimeFilter__UnitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:2468:1: ( ( ( rule__TimeFilter__UnitAlternatives_1_0 ) ) )
            // InternalPersistence.g:2469:2: ( ( rule__TimeFilter__UnitAlternatives_1_0 ) )
            {
            // InternalPersistence.g:2469:2: ( ( rule__TimeFilter__UnitAlternatives_1_0 ) )
            // InternalPersistence.g:2470:3: ( rule__TimeFilter__UnitAlternatives_1_0 )
            {
             before(grammarAccess.getTimeFilterAccess().getUnitAlternatives_1_0()); 
            // InternalPersistence.g:2471:3: ( rule__TimeFilter__UnitAlternatives_1_0 )
            // InternalPersistence.g:2471:4: rule__TimeFilter__UnitAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__TimeFilter__UnitAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTimeFilterAccess().getUnitAlternatives_1_0()); 

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
    // $ANTLR end "rule__TimeFilter__UnitAssignment_1"


    // $ANTLR start "rule__PersistenceConfiguration__ItemsAssignment_0"
    // InternalPersistence.g:2479:1: rule__PersistenceConfiguration__ItemsAssignment_0 : ( ( rule__PersistenceConfiguration__ItemsAlternatives_0_0 ) ) ;
    public final void rule__PersistenceConfiguration__ItemsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:2483:1: ( ( ( rule__PersistenceConfiguration__ItemsAlternatives_0_0 ) ) )
            // InternalPersistence.g:2484:2: ( ( rule__PersistenceConfiguration__ItemsAlternatives_0_0 ) )
            {
            // InternalPersistence.g:2484:2: ( ( rule__PersistenceConfiguration__ItemsAlternatives_0_0 ) )
            // InternalPersistence.g:2485:3: ( rule__PersistenceConfiguration__ItemsAlternatives_0_0 )
            {
             before(grammarAccess.getPersistenceConfigurationAccess().getItemsAlternatives_0_0()); 
            // InternalPersistence.g:2486:3: ( rule__PersistenceConfiguration__ItemsAlternatives_0_0 )
            // InternalPersistence.g:2486:4: rule__PersistenceConfiguration__ItemsAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__PersistenceConfiguration__ItemsAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getPersistenceConfigurationAccess().getItemsAlternatives_0_0()); 

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
    // $ANTLR end "rule__PersistenceConfiguration__ItemsAssignment_0"


    // $ANTLR start "rule__PersistenceConfiguration__ItemsAssignment_1_1"
    // InternalPersistence.g:2494:1: rule__PersistenceConfiguration__ItemsAssignment_1_1 : ( ( rule__PersistenceConfiguration__ItemsAlternatives_1_1_0 ) ) ;
    public final void rule__PersistenceConfiguration__ItemsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:2498:1: ( ( ( rule__PersistenceConfiguration__ItemsAlternatives_1_1_0 ) ) )
            // InternalPersistence.g:2499:2: ( ( rule__PersistenceConfiguration__ItemsAlternatives_1_1_0 ) )
            {
            // InternalPersistence.g:2499:2: ( ( rule__PersistenceConfiguration__ItemsAlternatives_1_1_0 ) )
            // InternalPersistence.g:2500:3: ( rule__PersistenceConfiguration__ItemsAlternatives_1_1_0 )
            {
             before(grammarAccess.getPersistenceConfigurationAccess().getItemsAlternatives_1_1_0()); 
            // InternalPersistence.g:2501:3: ( rule__PersistenceConfiguration__ItemsAlternatives_1_1_0 )
            // InternalPersistence.g:2501:4: rule__PersistenceConfiguration__ItemsAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__PersistenceConfiguration__ItemsAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPersistenceConfigurationAccess().getItemsAlternatives_1_1_0()); 

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
    // $ANTLR end "rule__PersistenceConfiguration__ItemsAssignment_1_1"


    // $ANTLR start "rule__PersistenceConfiguration__AliasAssignment_2_1"
    // InternalPersistence.g:2509:1: rule__PersistenceConfiguration__AliasAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__PersistenceConfiguration__AliasAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:2513:1: ( ( RULE_STRING ) )
            // InternalPersistence.g:2514:2: ( RULE_STRING )
            {
            // InternalPersistence.g:2514:2: ( RULE_STRING )
            // InternalPersistence.g:2515:3: RULE_STRING
            {
             before(grammarAccess.getPersistenceConfigurationAccess().getAliasSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPersistenceConfigurationAccess().getAliasSTRINGTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__PersistenceConfiguration__AliasAssignment_2_1"


    // $ANTLR start "rule__PersistenceConfiguration__StrategiesAssignment_3_0_1_2"
    // InternalPersistence.g:2524:1: rule__PersistenceConfiguration__StrategiesAssignment_3_0_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__PersistenceConfiguration__StrategiesAssignment_3_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:2528:1: ( ( ( RULE_ID ) ) )
            // InternalPersistence.g:2529:2: ( ( RULE_ID ) )
            {
            // InternalPersistence.g:2529:2: ( ( RULE_ID ) )
            // InternalPersistence.g:2530:3: ( RULE_ID )
            {
             before(grammarAccess.getPersistenceConfigurationAccess().getStrategiesStrategyCrossReference_3_0_1_2_0()); 
            // InternalPersistence.g:2531:3: ( RULE_ID )
            // InternalPersistence.g:2532:4: RULE_ID
            {
             before(grammarAccess.getPersistenceConfigurationAccess().getStrategiesStrategyIDTerminalRuleCall_3_0_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPersistenceConfigurationAccess().getStrategiesStrategyIDTerminalRuleCall_3_0_1_2_0_1()); 

            }

             after(grammarAccess.getPersistenceConfigurationAccess().getStrategiesStrategyCrossReference_3_0_1_2_0()); 

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
    // $ANTLR end "rule__PersistenceConfiguration__StrategiesAssignment_3_0_1_2"


    // $ANTLR start "rule__PersistenceConfiguration__StrategiesAssignment_3_0_1_3_1"
    // InternalPersistence.g:2543:1: rule__PersistenceConfiguration__StrategiesAssignment_3_0_1_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__PersistenceConfiguration__StrategiesAssignment_3_0_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:2547:1: ( ( ( RULE_ID ) ) )
            // InternalPersistence.g:2548:2: ( ( RULE_ID ) )
            {
            // InternalPersistence.g:2548:2: ( ( RULE_ID ) )
            // InternalPersistence.g:2549:3: ( RULE_ID )
            {
             before(grammarAccess.getPersistenceConfigurationAccess().getStrategiesStrategyCrossReference_3_0_1_3_1_0()); 
            // InternalPersistence.g:2550:3: ( RULE_ID )
            // InternalPersistence.g:2551:4: RULE_ID
            {
             before(grammarAccess.getPersistenceConfigurationAccess().getStrategiesStrategyIDTerminalRuleCall_3_0_1_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPersistenceConfigurationAccess().getStrategiesStrategyIDTerminalRuleCall_3_0_1_3_1_0_1()); 

            }

             after(grammarAccess.getPersistenceConfigurationAccess().getStrategiesStrategyCrossReference_3_0_1_3_1_0()); 

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
    // $ANTLR end "rule__PersistenceConfiguration__StrategiesAssignment_3_0_1_3_1"


    // $ANTLR start "rule__PersistenceConfiguration__FiltersAssignment_3_0_2_2"
    // InternalPersistence.g:2562:1: rule__PersistenceConfiguration__FiltersAssignment_3_0_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__PersistenceConfiguration__FiltersAssignment_3_0_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:2566:1: ( ( ( RULE_ID ) ) )
            // InternalPersistence.g:2567:2: ( ( RULE_ID ) )
            {
            // InternalPersistence.g:2567:2: ( ( RULE_ID ) )
            // InternalPersistence.g:2568:3: ( RULE_ID )
            {
             before(grammarAccess.getPersistenceConfigurationAccess().getFiltersFilterCrossReference_3_0_2_2_0()); 
            // InternalPersistence.g:2569:3: ( RULE_ID )
            // InternalPersistence.g:2570:4: RULE_ID
            {
             before(grammarAccess.getPersistenceConfigurationAccess().getFiltersFilterIDTerminalRuleCall_3_0_2_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPersistenceConfigurationAccess().getFiltersFilterIDTerminalRuleCall_3_0_2_2_0_1()); 

            }

             after(grammarAccess.getPersistenceConfigurationAccess().getFiltersFilterCrossReference_3_0_2_2_0()); 

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
    // $ANTLR end "rule__PersistenceConfiguration__FiltersAssignment_3_0_2_2"


    // $ANTLR start "rule__PersistenceConfiguration__FiltersAssignment_3_0_2_3_1"
    // InternalPersistence.g:2581:1: rule__PersistenceConfiguration__FiltersAssignment_3_0_2_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__PersistenceConfiguration__FiltersAssignment_3_0_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:2585:1: ( ( ( RULE_ID ) ) )
            // InternalPersistence.g:2586:2: ( ( RULE_ID ) )
            {
            // InternalPersistence.g:2586:2: ( ( RULE_ID ) )
            // InternalPersistence.g:2587:3: ( RULE_ID )
            {
             before(grammarAccess.getPersistenceConfigurationAccess().getFiltersFilterCrossReference_3_0_2_3_1_0()); 
            // InternalPersistence.g:2588:3: ( RULE_ID )
            // InternalPersistence.g:2589:4: RULE_ID
            {
             before(grammarAccess.getPersistenceConfigurationAccess().getFiltersFilterIDTerminalRuleCall_3_0_2_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPersistenceConfigurationAccess().getFiltersFilterIDTerminalRuleCall_3_0_2_3_1_0_1()); 

            }

             after(grammarAccess.getPersistenceConfigurationAccess().getFiltersFilterCrossReference_3_0_2_3_1_0()); 

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
    // $ANTLR end "rule__PersistenceConfiguration__FiltersAssignment_3_0_2_3_1"


    // $ANTLR start "rule__ItemConfig__ItemAssignment"
    // InternalPersistence.g:2600:1: rule__ItemConfig__ItemAssignment : ( RULE_ID ) ;
    public final void rule__ItemConfig__ItemAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:2604:1: ( ( RULE_ID ) )
            // InternalPersistence.g:2605:2: ( RULE_ID )
            {
            // InternalPersistence.g:2605:2: ( RULE_ID )
            // InternalPersistence.g:2606:3: RULE_ID
            {
             before(grammarAccess.getItemConfigAccess().getItemIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getItemConfigAccess().getItemIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__ItemConfig__ItemAssignment"


    // $ANTLR start "rule__GroupConfig__GroupAssignment_0"
    // InternalPersistence.g:2615:1: rule__GroupConfig__GroupAssignment_0 : ( RULE_ID ) ;
    public final void rule__GroupConfig__GroupAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPersistence.g:2619:1: ( ( RULE_ID ) )
            // InternalPersistence.g:2620:2: ( RULE_ID )
            {
            // InternalPersistence.g:2620:2: ( RULE_ID )
            // InternalPersistence.g:2621:3: RULE_ID
            {
             before(grammarAccess.getGroupConfigAccess().getGroupIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGroupConfigAccess().getGroupIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__GroupConfig__GroupAssignment_0"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000C0020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020040020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000022L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000005208000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});

}