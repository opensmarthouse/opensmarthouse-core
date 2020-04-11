package org.openhab.core.model.persistence.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.openhab.core.model.persistence.services.PersistenceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPersistenceParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Strategies'", "'{'", "'default'", "'='", "','", "'}'", "'Filters'", "'Items'", "':'", "'>'", "'%'", "'s'", "'m'", "'h'", "'d'", "'->'", "'strategy'", "'filter'", "';'", "'*'", "'.'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
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

        public InternalPersistenceParser(TokenStream input, PersistenceGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "PersistenceModel";
       	}

       	@Override
       	protected PersistenceGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePersistenceModel"
    // InternalPersistence.g:64:1: entryRulePersistenceModel returns [EObject current=null] : iv_rulePersistenceModel= rulePersistenceModel EOF ;
    public final EObject entryRulePersistenceModel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersistenceModel = null;


        try {
            // InternalPersistence.g:64:57: (iv_rulePersistenceModel= rulePersistenceModel EOF )
            // InternalPersistence.g:65:2: iv_rulePersistenceModel= rulePersistenceModel EOF
            {
             newCompositeNode(grammarAccess.getPersistenceModelRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePersistenceModel=rulePersistenceModel();

            state._fsp--;

             current =iv_rulePersistenceModel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePersistenceModel"


    // $ANTLR start "rulePersistenceModel"
    // InternalPersistence.g:71:1: rulePersistenceModel returns [EObject current=null] : ( () otherlv_1= 'Strategies' otherlv_2= '{' ( (lv_strategies_3_0= ruleStrategy ) )* (otherlv_4= 'default' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= '}' (otherlv_10= 'Filters' otherlv_11= '{' ( (lv_filters_12_0= ruleFilter ) )* otherlv_13= '}' )? (otherlv_14= 'Items' otherlv_15= '{' ( (lv_configs_16_0= rulePersistenceConfiguration ) )* otherlv_17= '}' )? ) ;
    public final EObject rulePersistenceModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject lv_strategies_3_0 = null;

        EObject lv_filters_12_0 = null;

        EObject lv_configs_16_0 = null;



        	enterRule();

        try {
            // InternalPersistence.g:77:2: ( ( () otherlv_1= 'Strategies' otherlv_2= '{' ( (lv_strategies_3_0= ruleStrategy ) )* (otherlv_4= 'default' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= '}' (otherlv_10= 'Filters' otherlv_11= '{' ( (lv_filters_12_0= ruleFilter ) )* otherlv_13= '}' )? (otherlv_14= 'Items' otherlv_15= '{' ( (lv_configs_16_0= rulePersistenceConfiguration ) )* otherlv_17= '}' )? ) )
            // InternalPersistence.g:78:2: ( () otherlv_1= 'Strategies' otherlv_2= '{' ( (lv_strategies_3_0= ruleStrategy ) )* (otherlv_4= 'default' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= '}' (otherlv_10= 'Filters' otherlv_11= '{' ( (lv_filters_12_0= ruleFilter ) )* otherlv_13= '}' )? (otherlv_14= 'Items' otherlv_15= '{' ( (lv_configs_16_0= rulePersistenceConfiguration ) )* otherlv_17= '}' )? )
            {
            // InternalPersistence.g:78:2: ( () otherlv_1= 'Strategies' otherlv_2= '{' ( (lv_strategies_3_0= ruleStrategy ) )* (otherlv_4= 'default' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= '}' (otherlv_10= 'Filters' otherlv_11= '{' ( (lv_filters_12_0= ruleFilter ) )* otherlv_13= '}' )? (otherlv_14= 'Items' otherlv_15= '{' ( (lv_configs_16_0= rulePersistenceConfiguration ) )* otherlv_17= '}' )? )
            // InternalPersistence.g:79:3: () otherlv_1= 'Strategies' otherlv_2= '{' ( (lv_strategies_3_0= ruleStrategy ) )* (otherlv_4= 'default' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= '}' (otherlv_10= 'Filters' otherlv_11= '{' ( (lv_filters_12_0= ruleFilter ) )* otherlv_13= '}' )? (otherlv_14= 'Items' otherlv_15= '{' ( (lv_configs_16_0= rulePersistenceConfiguration ) )* otherlv_17= '}' )?
            {
            // InternalPersistence.g:79:3: ()
            // InternalPersistence.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPersistenceModelAccess().getPersistenceModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPersistenceModelAccess().getStrategiesKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPersistenceModelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPersistence.g:94:3: ( (lv_strategies_3_0= ruleStrategy ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPersistence.g:95:4: (lv_strategies_3_0= ruleStrategy )
            	    {
            	    // InternalPersistence.g:95:4: (lv_strategies_3_0= ruleStrategy )
            	    // InternalPersistence.g:96:5: lv_strategies_3_0= ruleStrategy
            	    {

            	    					newCompositeNode(grammarAccess.getPersistenceModelAccess().getStrategiesStrategyParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_strategies_3_0=ruleStrategy();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPersistenceModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"strategies",
            	    						lv_strategies_3_0,
            	    						"org.openhab.core.model.persistence.Persistence.Strategy");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalPersistence.g:113:3: (otherlv_4= 'default' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPersistence.g:114:4: otherlv_4= 'default' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getPersistenceModelAccess().getDefaultKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getPersistenceModelAccess().getEqualsSignKeyword_4_1());
                    			
                    // InternalPersistence.g:122:4: ( (otherlv_6= RULE_ID ) )
                    // InternalPersistence.g:123:5: (otherlv_6= RULE_ID )
                    {
                    // InternalPersistence.g:123:5: (otherlv_6= RULE_ID )
                    // InternalPersistence.g:124:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPersistenceModelRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(otherlv_6, grammarAccess.getPersistenceModelAccess().getDefaultsStrategyCrossReference_4_2_0());
                    					

                    }


                    }

                    // InternalPersistence.g:135:4: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalPersistence.g:136:5: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getPersistenceModelAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalPersistence.g:140:5: ( (otherlv_8= RULE_ID ) )
                    	    // InternalPersistence.g:141:6: (otherlv_8= RULE_ID )
                    	    {
                    	    // InternalPersistence.g:141:6: (otherlv_8= RULE_ID )
                    	    // InternalPersistence.g:142:7: otherlv_8= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getPersistenceModelRule());
                    	    							}
                    	    						
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_7); 

                    	    							newLeafNode(otherlv_8, grammarAccess.getPersistenceModelAccess().getDefaultsStrategyCrossReference_4_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getPersistenceModelAccess().getRightCurlyBracketKeyword_5());
            		
            // InternalPersistence.g:159:3: (otherlv_10= 'Filters' otherlv_11= '{' ( (lv_filters_12_0= ruleFilter ) )* otherlv_13= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPersistence.g:160:4: otherlv_10= 'Filters' otherlv_11= '{' ( (lv_filters_12_0= ruleFilter ) )* otherlv_13= '}'
                    {
                    otherlv_10=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getPersistenceModelAccess().getFiltersKeyword_6_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getPersistenceModelAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalPersistence.g:168:4: ( (lv_filters_12_0= ruleFilter ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalPersistence.g:169:5: (lv_filters_12_0= ruleFilter )
                    	    {
                    	    // InternalPersistence.g:169:5: (lv_filters_12_0= ruleFilter )
                    	    // InternalPersistence.g:170:6: lv_filters_12_0= ruleFilter
                    	    {

                    	    						newCompositeNode(grammarAccess.getPersistenceModelAccess().getFiltersFilterParserRuleCall_6_2_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_filters_12_0=ruleFilter();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPersistenceModelRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"filters",
                    	    							lv_filters_12_0,
                    	    							"org.openhab.core.model.persistence.Persistence.Filter");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_13, grammarAccess.getPersistenceModelAccess().getRightCurlyBracketKeyword_6_3());
                    			

                    }
                    break;

            }

            // InternalPersistence.g:192:3: (otherlv_14= 'Items' otherlv_15= '{' ( (lv_configs_16_0= rulePersistenceConfiguration ) )* otherlv_17= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPersistence.g:193:4: otherlv_14= 'Items' otherlv_15= '{' ( (lv_configs_16_0= rulePersistenceConfiguration ) )* otherlv_17= '}'
                    {
                    otherlv_14=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getPersistenceModelAccess().getItemsKeyword_7_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_15, grammarAccess.getPersistenceModelAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalPersistence.g:201:4: ( (lv_configs_16_0= rulePersistenceConfiguration ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID||LA6_0==30) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalPersistence.g:202:5: (lv_configs_16_0= rulePersistenceConfiguration )
                    	    {
                    	    // InternalPersistence.g:202:5: (lv_configs_16_0= rulePersistenceConfiguration )
                    	    // InternalPersistence.g:203:6: lv_configs_16_0= rulePersistenceConfiguration
                    	    {

                    	    						newCompositeNode(grammarAccess.getPersistenceModelAccess().getConfigsPersistenceConfigurationParserRuleCall_7_2_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_configs_16_0=rulePersistenceConfiguration();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPersistenceModelRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"configs",
                    	    							lv_configs_16_0,
                    	    							"org.openhab.core.model.persistence.Persistence.PersistenceConfiguration");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_17, grammarAccess.getPersistenceModelAccess().getRightCurlyBracketKeyword_7_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePersistenceModel"


    // $ANTLR start "entryRuleStrategy"
    // InternalPersistence.g:229:1: entryRuleStrategy returns [EObject current=null] : iv_ruleStrategy= ruleStrategy EOF ;
    public final EObject entryRuleStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrategy = null;


        try {
            // InternalPersistence.g:229:49: (iv_ruleStrategy= ruleStrategy EOF )
            // InternalPersistence.g:230:2: iv_ruleStrategy= ruleStrategy EOF
            {
             newCompositeNode(grammarAccess.getStrategyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStrategy=ruleStrategy();

            state._fsp--;

             current =iv_ruleStrategy; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStrategy"


    // $ANTLR start "ruleStrategy"
    // InternalPersistence.g:236:1: ruleStrategy returns [EObject current=null] : (this_CronStrategy_0= ruleCronStrategy | ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleStrategy() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject this_CronStrategy_0 = null;



        	enterRule();

        try {
            // InternalPersistence.g:242:2: ( (this_CronStrategy_0= ruleCronStrategy | ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalPersistence.g:243:2: (this_CronStrategy_0= ruleCronStrategy | ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalPersistence.g:243:2: (this_CronStrategy_0= ruleCronStrategy | ( (lv_name_1_0= RULE_ID ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==19) ) {
                    alt8=1;
                }
                else if ( (LA8_1==EOF||LA8_1==RULE_ID||LA8_1==13||LA8_1==16) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalPersistence.g:244:3: this_CronStrategy_0= ruleCronStrategy
                    {

                    			newCompositeNode(grammarAccess.getStrategyAccess().getCronStrategyParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CronStrategy_0=ruleCronStrategy();

                    state._fsp--;


                    			current = this_CronStrategy_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPersistence.g:253:3: ( (lv_name_1_0= RULE_ID ) )
                    {
                    // InternalPersistence.g:253:3: ( (lv_name_1_0= RULE_ID ) )
                    // InternalPersistence.g:254:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalPersistence.g:254:4: (lv_name_1_0= RULE_ID )
                    // InternalPersistence.g:255:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getStrategyAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStrategyRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStrategy"


    // $ANTLR start "entryRuleCronStrategy"
    // InternalPersistence.g:275:1: entryRuleCronStrategy returns [EObject current=null] : iv_ruleCronStrategy= ruleCronStrategy EOF ;
    public final EObject entryRuleCronStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCronStrategy = null;


        try {
            // InternalPersistence.g:275:53: (iv_ruleCronStrategy= ruleCronStrategy EOF )
            // InternalPersistence.g:276:2: iv_ruleCronStrategy= ruleCronStrategy EOF
            {
             newCompositeNode(grammarAccess.getCronStrategyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCronStrategy=ruleCronStrategy();

            state._fsp--;

             current =iv_ruleCronStrategy; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCronStrategy"


    // $ANTLR start "ruleCronStrategy"
    // InternalPersistence.g:282:1: ruleCronStrategy returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_cronExpression_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleCronStrategy() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_cronExpression_3_0=null;


        	enterRule();

        try {
            // InternalPersistence.g:288:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_cronExpression_3_0= RULE_STRING ) ) ) )
            // InternalPersistence.g:289:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_cronExpression_3_0= RULE_STRING ) ) )
            {
            // InternalPersistence.g:289:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_cronExpression_3_0= RULE_STRING ) ) )
            // InternalPersistence.g:290:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_cronExpression_3_0= RULE_STRING ) )
            {
            // InternalPersistence.g:290:3: ()
            // InternalPersistence.g:291:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCronStrategyAccess().getCronStrategyAction_0(),
            					current);
            			

            }

            // InternalPersistence.g:297:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPersistence.g:298:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPersistence.g:298:4: (lv_name_1_0= RULE_ID )
            // InternalPersistence.g:299:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCronStrategyAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCronStrategyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getCronStrategyAccess().getColonKeyword_2());
            		
            // InternalPersistence.g:319:3: ( (lv_cronExpression_3_0= RULE_STRING ) )
            // InternalPersistence.g:320:4: (lv_cronExpression_3_0= RULE_STRING )
            {
            // InternalPersistence.g:320:4: (lv_cronExpression_3_0= RULE_STRING )
            // InternalPersistence.g:321:5: lv_cronExpression_3_0= RULE_STRING
            {
            lv_cronExpression_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_cronExpression_3_0, grammarAccess.getCronStrategyAccess().getCronExpressionSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCronStrategyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cronExpression",
            						lv_cronExpression_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCronStrategy"


    // $ANTLR start "entryRuleFilter"
    // InternalPersistence.g:341:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // InternalPersistence.g:341:47: (iv_ruleFilter= ruleFilter EOF )
            // InternalPersistence.g:342:2: iv_ruleFilter= ruleFilter EOF
            {
             newCompositeNode(grammarAccess.getFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilter=ruleFilter();

            state._fsp--;

             current =iv_ruleFilter; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // InternalPersistence.g:348:1: ruleFilter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_definition_2_0= ruleFilterDetails ) ) ) ;
    public final EObject ruleFilter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_definition_2_0 = null;



        	enterRule();

        try {
            // InternalPersistence.g:354:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_definition_2_0= ruleFilterDetails ) ) ) )
            // InternalPersistence.g:355:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_definition_2_0= ruleFilterDetails ) ) )
            {
            // InternalPersistence.g:355:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_definition_2_0= ruleFilterDetails ) ) )
            // InternalPersistence.g:356:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_definition_2_0= ruleFilterDetails ) )
            {
            // InternalPersistence.g:356:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPersistence.g:357:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPersistence.g:357:4: (lv_name_0_0= RULE_ID )
            // InternalPersistence.g:358:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFilterAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFilterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getFilterAccess().getColonKeyword_1());
            		
            // InternalPersistence.g:378:3: ( (lv_definition_2_0= ruleFilterDetails ) )
            // InternalPersistence.g:379:4: (lv_definition_2_0= ruleFilterDetails )
            {
            // InternalPersistence.g:379:4: (lv_definition_2_0= ruleFilterDetails )
            // InternalPersistence.g:380:5: lv_definition_2_0= ruleFilterDetails
            {

            					newCompositeNode(grammarAccess.getFilterAccess().getDefinitionFilterDetailsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_definition_2_0=ruleFilterDetails();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFilterRule());
            					}
            					set(
            						current,
            						"definition",
            						lv_definition_2_0,
            						"org.openhab.core.model.persistence.Persistence.FilterDetails");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleFilterDetails"
    // InternalPersistence.g:401:1: entryRuleFilterDetails returns [EObject current=null] : iv_ruleFilterDetails= ruleFilterDetails EOF ;
    public final EObject entryRuleFilterDetails() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterDetails = null;


        try {
            // InternalPersistence.g:401:54: (iv_ruleFilterDetails= ruleFilterDetails EOF )
            // InternalPersistence.g:402:2: iv_ruleFilterDetails= ruleFilterDetails EOF
            {
             newCompositeNode(grammarAccess.getFilterDetailsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilterDetails=ruleFilterDetails();

            state._fsp--;

             current =iv_ruleFilterDetails; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFilterDetails"


    // $ANTLR start "ruleFilterDetails"
    // InternalPersistence.g:408:1: ruleFilterDetails returns [EObject current=null] : (this_ThresholdFilter_0= ruleThresholdFilter | this_TimeFilter_1= ruleTimeFilter ) ;
    public final EObject ruleFilterDetails() throws RecognitionException {
        EObject current = null;

        EObject this_ThresholdFilter_0 = null;

        EObject this_TimeFilter_1 = null;



        	enterRule();

        try {
            // InternalPersistence.g:414:2: ( (this_ThresholdFilter_0= ruleThresholdFilter | this_TimeFilter_1= ruleTimeFilter ) )
            // InternalPersistence.g:415:2: (this_ThresholdFilter_0= ruleThresholdFilter | this_TimeFilter_1= ruleTimeFilter )
            {
            // InternalPersistence.g:415:2: (this_ThresholdFilter_0= ruleThresholdFilter | this_TimeFilter_1= ruleTimeFilter )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_INT) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalPersistence.g:416:3: this_ThresholdFilter_0= ruleThresholdFilter
                    {

                    			newCompositeNode(grammarAccess.getFilterDetailsAccess().getThresholdFilterParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ThresholdFilter_0=ruleThresholdFilter();

                    state._fsp--;


                    			current = this_ThresholdFilter_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPersistence.g:425:3: this_TimeFilter_1= ruleTimeFilter
                    {

                    			newCompositeNode(grammarAccess.getFilterDetailsAccess().getTimeFilterParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TimeFilter_1=ruleTimeFilter();

                    state._fsp--;


                    			current = this_TimeFilter_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFilterDetails"


    // $ANTLR start "entryRuleThresholdFilter"
    // InternalPersistence.g:437:1: entryRuleThresholdFilter returns [EObject current=null] : iv_ruleThresholdFilter= ruleThresholdFilter EOF ;
    public final EObject entryRuleThresholdFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThresholdFilter = null;


        try {
            // InternalPersistence.g:437:56: (iv_ruleThresholdFilter= ruleThresholdFilter EOF )
            // InternalPersistence.g:438:2: iv_ruleThresholdFilter= ruleThresholdFilter EOF
            {
             newCompositeNode(grammarAccess.getThresholdFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThresholdFilter=ruleThresholdFilter();

            state._fsp--;

             current =iv_ruleThresholdFilter; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleThresholdFilter"


    // $ANTLR start "ruleThresholdFilter"
    // InternalPersistence.g:444:1: ruleThresholdFilter returns [EObject current=null] : (otherlv_0= '>' ( (lv_value_1_0= ruleDECIMAL ) ) ( (lv_percent_2_0= '%' ) ) ) ;
    public final EObject ruleThresholdFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_percent_2_0=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalPersistence.g:450:2: ( (otherlv_0= '>' ( (lv_value_1_0= ruleDECIMAL ) ) ( (lv_percent_2_0= '%' ) ) ) )
            // InternalPersistence.g:451:2: (otherlv_0= '>' ( (lv_value_1_0= ruleDECIMAL ) ) ( (lv_percent_2_0= '%' ) ) )
            {
            // InternalPersistence.g:451:2: (otherlv_0= '>' ( (lv_value_1_0= ruleDECIMAL ) ) ( (lv_percent_2_0= '%' ) ) )
            // InternalPersistence.g:452:3: otherlv_0= '>' ( (lv_value_1_0= ruleDECIMAL ) ) ( (lv_percent_2_0= '%' ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getThresholdFilterAccess().getGreaterThanSignKeyword_0());
            		
            // InternalPersistence.g:456:3: ( (lv_value_1_0= ruleDECIMAL ) )
            // InternalPersistence.g:457:4: (lv_value_1_0= ruleDECIMAL )
            {
            // InternalPersistence.g:457:4: (lv_value_1_0= ruleDECIMAL )
            // InternalPersistence.g:458:5: lv_value_1_0= ruleDECIMAL
            {

            					newCompositeNode(grammarAccess.getThresholdFilterAccess().getValueDECIMALParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_value_1_0=ruleDECIMAL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getThresholdFilterRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.openhab.core.model.persistence.Persistence.DECIMAL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPersistence.g:475:3: ( (lv_percent_2_0= '%' ) )
            // InternalPersistence.g:476:4: (lv_percent_2_0= '%' )
            {
            // InternalPersistence.g:476:4: (lv_percent_2_0= '%' )
            // InternalPersistence.g:477:5: lv_percent_2_0= '%'
            {
            lv_percent_2_0=(Token)match(input,21,FOLLOW_2); 

            					newLeafNode(lv_percent_2_0, grammarAccess.getThresholdFilterAccess().getPercentPercentSignKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getThresholdFilterRule());
            					}
            					setWithLastConsumed(current, "percent", true, "%");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleThresholdFilter"


    // $ANTLR start "entryRuleTimeFilter"
    // InternalPersistence.g:493:1: entryRuleTimeFilter returns [EObject current=null] : iv_ruleTimeFilter= ruleTimeFilter EOF ;
    public final EObject entryRuleTimeFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeFilter = null;


        try {
            // InternalPersistence.g:493:51: (iv_ruleTimeFilter= ruleTimeFilter EOF )
            // InternalPersistence.g:494:2: iv_ruleTimeFilter= ruleTimeFilter EOF
            {
             newCompositeNode(grammarAccess.getTimeFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeFilter=ruleTimeFilter();

            state._fsp--;

             current =iv_ruleTimeFilter; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTimeFilter"


    // $ANTLR start "ruleTimeFilter"
    // InternalPersistence.g:500:1: ruleTimeFilter returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) ( ( (lv_unit_1_1= 's' | lv_unit_1_2= 'm' | lv_unit_1_3= 'h' | lv_unit_1_4= 'd' ) ) ) ) ;
    public final EObject ruleTimeFilter() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_unit_1_1=null;
        Token lv_unit_1_2=null;
        Token lv_unit_1_3=null;
        Token lv_unit_1_4=null;


        	enterRule();

        try {
            // InternalPersistence.g:506:2: ( ( ( (lv_value_0_0= RULE_INT ) ) ( ( (lv_unit_1_1= 's' | lv_unit_1_2= 'm' | lv_unit_1_3= 'h' | lv_unit_1_4= 'd' ) ) ) ) )
            // InternalPersistence.g:507:2: ( ( (lv_value_0_0= RULE_INT ) ) ( ( (lv_unit_1_1= 's' | lv_unit_1_2= 'm' | lv_unit_1_3= 'h' | lv_unit_1_4= 'd' ) ) ) )
            {
            // InternalPersistence.g:507:2: ( ( (lv_value_0_0= RULE_INT ) ) ( ( (lv_unit_1_1= 's' | lv_unit_1_2= 'm' | lv_unit_1_3= 'h' | lv_unit_1_4= 'd' ) ) ) )
            // InternalPersistence.g:508:3: ( (lv_value_0_0= RULE_INT ) ) ( ( (lv_unit_1_1= 's' | lv_unit_1_2= 'm' | lv_unit_1_3= 'h' | lv_unit_1_4= 'd' ) ) )
            {
            // InternalPersistence.g:508:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalPersistence.g:509:4: (lv_value_0_0= RULE_INT )
            {
            // InternalPersistence.g:509:4: (lv_value_0_0= RULE_INT )
            // InternalPersistence.g:510:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            					newLeafNode(lv_value_0_0, grammarAccess.getTimeFilterAccess().getValueINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeFilterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalPersistence.g:526:3: ( ( (lv_unit_1_1= 's' | lv_unit_1_2= 'm' | lv_unit_1_3= 'h' | lv_unit_1_4= 'd' ) ) )
            // InternalPersistence.g:527:4: ( (lv_unit_1_1= 's' | lv_unit_1_2= 'm' | lv_unit_1_3= 'h' | lv_unit_1_4= 'd' ) )
            {
            // InternalPersistence.g:527:4: ( (lv_unit_1_1= 's' | lv_unit_1_2= 'm' | lv_unit_1_3= 'h' | lv_unit_1_4= 'd' ) )
            // InternalPersistence.g:528:5: (lv_unit_1_1= 's' | lv_unit_1_2= 'm' | lv_unit_1_3= 'h' | lv_unit_1_4= 'd' )
            {
            // InternalPersistence.g:528:5: (lv_unit_1_1= 's' | lv_unit_1_2= 'm' | lv_unit_1_3= 'h' | lv_unit_1_4= 'd' )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt10=1;
                }
                break;
            case 23:
                {
                alt10=2;
                }
                break;
            case 24:
                {
                alt10=3;
                }
                break;
            case 25:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalPersistence.g:529:6: lv_unit_1_1= 's'
                    {
                    lv_unit_1_1=(Token)match(input,22,FOLLOW_2); 

                    						newLeafNode(lv_unit_1_1, grammarAccess.getTimeFilterAccess().getUnitSKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTimeFilterRule());
                    						}
                    						setWithLastConsumed(current, "unit", lv_unit_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalPersistence.g:540:6: lv_unit_1_2= 'm'
                    {
                    lv_unit_1_2=(Token)match(input,23,FOLLOW_2); 

                    						newLeafNode(lv_unit_1_2, grammarAccess.getTimeFilterAccess().getUnitMKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTimeFilterRule());
                    						}
                    						setWithLastConsumed(current, "unit", lv_unit_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalPersistence.g:551:6: lv_unit_1_3= 'h'
                    {
                    lv_unit_1_3=(Token)match(input,24,FOLLOW_2); 

                    						newLeafNode(lv_unit_1_3, grammarAccess.getTimeFilterAccess().getUnitHKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTimeFilterRule());
                    						}
                    						setWithLastConsumed(current, "unit", lv_unit_1_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalPersistence.g:562:6: lv_unit_1_4= 'd'
                    {
                    lv_unit_1_4=(Token)match(input,25,FOLLOW_2); 

                    						newLeafNode(lv_unit_1_4, grammarAccess.getTimeFilterAccess().getUnitDKeyword_1_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTimeFilterRule());
                    						}
                    						setWithLastConsumed(current, "unit", lv_unit_1_4, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeFilter"


    // $ANTLR start "entryRulePersistenceConfiguration"
    // InternalPersistence.g:579:1: entryRulePersistenceConfiguration returns [EObject current=null] : iv_rulePersistenceConfiguration= rulePersistenceConfiguration EOF ;
    public final EObject entryRulePersistenceConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersistenceConfiguration = null;


        try {
            // InternalPersistence.g:579:65: (iv_rulePersistenceConfiguration= rulePersistenceConfiguration EOF )
            // InternalPersistence.g:580:2: iv_rulePersistenceConfiguration= rulePersistenceConfiguration EOF
            {
             newCompositeNode(grammarAccess.getPersistenceConfigurationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePersistenceConfiguration=rulePersistenceConfiguration();

            state._fsp--;

             current =iv_rulePersistenceConfiguration; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePersistenceConfiguration"


    // $ANTLR start "rulePersistenceConfiguration"
    // InternalPersistence.g:586:1: rulePersistenceConfiguration returns [EObject current=null] : ( ( ( (lv_items_0_1= ruleAllConfig | lv_items_0_2= ruleItemConfig | lv_items_0_3= ruleGroupConfig ) ) ) (otherlv_1= ',' ( ( (lv_items_2_1= ruleAllConfig | lv_items_2_2= ruleItemConfig | lv_items_2_3= ruleGroupConfig ) ) ) )* (otherlv_3= '->' ( (lv_alias_4_0= RULE_STRING ) ) )? ( (otherlv_5= ':' (otherlv_6= 'strategy' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? (otherlv_11= 'filter' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* )? ) | otherlv_16= ';' ) ) ;
    public final EObject rulePersistenceConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_alias_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_items_0_1 = null;

        EObject lv_items_0_2 = null;

        EObject lv_items_0_3 = null;

        EObject lv_items_2_1 = null;

        EObject lv_items_2_2 = null;

        EObject lv_items_2_3 = null;



        	enterRule();

        try {
            // InternalPersistence.g:592:2: ( ( ( ( (lv_items_0_1= ruleAllConfig | lv_items_0_2= ruleItemConfig | lv_items_0_3= ruleGroupConfig ) ) ) (otherlv_1= ',' ( ( (lv_items_2_1= ruleAllConfig | lv_items_2_2= ruleItemConfig | lv_items_2_3= ruleGroupConfig ) ) ) )* (otherlv_3= '->' ( (lv_alias_4_0= RULE_STRING ) ) )? ( (otherlv_5= ':' (otherlv_6= 'strategy' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? (otherlv_11= 'filter' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* )? ) | otherlv_16= ';' ) ) )
            // InternalPersistence.g:593:2: ( ( ( (lv_items_0_1= ruleAllConfig | lv_items_0_2= ruleItemConfig | lv_items_0_3= ruleGroupConfig ) ) ) (otherlv_1= ',' ( ( (lv_items_2_1= ruleAllConfig | lv_items_2_2= ruleItemConfig | lv_items_2_3= ruleGroupConfig ) ) ) )* (otherlv_3= '->' ( (lv_alias_4_0= RULE_STRING ) ) )? ( (otherlv_5= ':' (otherlv_6= 'strategy' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? (otherlv_11= 'filter' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* )? ) | otherlv_16= ';' ) )
            {
            // InternalPersistence.g:593:2: ( ( ( (lv_items_0_1= ruleAllConfig | lv_items_0_2= ruleItemConfig | lv_items_0_3= ruleGroupConfig ) ) ) (otherlv_1= ',' ( ( (lv_items_2_1= ruleAllConfig | lv_items_2_2= ruleItemConfig | lv_items_2_3= ruleGroupConfig ) ) ) )* (otherlv_3= '->' ( (lv_alias_4_0= RULE_STRING ) ) )? ( (otherlv_5= ':' (otherlv_6= 'strategy' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? (otherlv_11= 'filter' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* )? ) | otherlv_16= ';' ) )
            // InternalPersistence.g:594:3: ( ( (lv_items_0_1= ruleAllConfig | lv_items_0_2= ruleItemConfig | lv_items_0_3= ruleGroupConfig ) ) ) (otherlv_1= ',' ( ( (lv_items_2_1= ruleAllConfig | lv_items_2_2= ruleItemConfig | lv_items_2_3= ruleGroupConfig ) ) ) )* (otherlv_3= '->' ( (lv_alias_4_0= RULE_STRING ) ) )? ( (otherlv_5= ':' (otherlv_6= 'strategy' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? (otherlv_11= 'filter' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* )? ) | otherlv_16= ';' )
            {
            // InternalPersistence.g:594:3: ( ( (lv_items_0_1= ruleAllConfig | lv_items_0_2= ruleItemConfig | lv_items_0_3= ruleGroupConfig ) ) )
            // InternalPersistence.g:595:4: ( (lv_items_0_1= ruleAllConfig | lv_items_0_2= ruleItemConfig | lv_items_0_3= ruleGroupConfig ) )
            {
            // InternalPersistence.g:595:4: ( (lv_items_0_1= ruleAllConfig | lv_items_0_2= ruleItemConfig | lv_items_0_3= ruleGroupConfig ) )
            // InternalPersistence.g:596:5: (lv_items_0_1= ruleAllConfig | lv_items_0_2= ruleItemConfig | lv_items_0_3= ruleGroupConfig )
            {
            // InternalPersistence.g:596:5: (lv_items_0_1= ruleAllConfig | lv_items_0_2= ruleItemConfig | lv_items_0_3= ruleGroupConfig )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==30) ) {
                    alt11=3;
                }
                else if ( (LA11_2==15||LA11_2==19||LA11_2==26||LA11_2==29) ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalPersistence.g:597:6: lv_items_0_1= ruleAllConfig
                    {

                    						newCompositeNode(grammarAccess.getPersistenceConfigurationAccess().getItemsAllConfigParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_items_0_1=ruleAllConfig();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersistenceConfigurationRule());
                    						}
                    						add(
                    							current,
                    							"items",
                    							lv_items_0_1,
                    							"org.openhab.core.model.persistence.Persistence.AllConfig");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalPersistence.g:613:6: lv_items_0_2= ruleItemConfig
                    {

                    						newCompositeNode(grammarAccess.getPersistenceConfigurationAccess().getItemsItemConfigParserRuleCall_0_0_1());
                    					
                    pushFollow(FOLLOW_18);
                    lv_items_0_2=ruleItemConfig();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersistenceConfigurationRule());
                    						}
                    						add(
                    							current,
                    							"items",
                    							lv_items_0_2,
                    							"org.openhab.core.model.persistence.Persistence.ItemConfig");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalPersistence.g:629:6: lv_items_0_3= ruleGroupConfig
                    {

                    						newCompositeNode(grammarAccess.getPersistenceConfigurationAccess().getItemsGroupConfigParserRuleCall_0_0_2());
                    					
                    pushFollow(FOLLOW_18);
                    lv_items_0_3=ruleGroupConfig();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersistenceConfigurationRule());
                    						}
                    						add(
                    							current,
                    							"items",
                    							lv_items_0_3,
                    							"org.openhab.core.model.persistence.Persistence.GroupConfig");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalPersistence.g:647:3: (otherlv_1= ',' ( ( (lv_items_2_1= ruleAllConfig | lv_items_2_2= ruleItemConfig | lv_items_2_3= ruleGroupConfig ) ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==15) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPersistence.g:648:4: otherlv_1= ',' ( ( (lv_items_2_1= ruleAllConfig | lv_items_2_2= ruleItemConfig | lv_items_2_3= ruleGroupConfig ) ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_19); 

            	    				newLeafNode(otherlv_1, grammarAccess.getPersistenceConfigurationAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalPersistence.g:652:4: ( ( (lv_items_2_1= ruleAllConfig | lv_items_2_2= ruleItemConfig | lv_items_2_3= ruleGroupConfig ) ) )
            	    // InternalPersistence.g:653:5: ( (lv_items_2_1= ruleAllConfig | lv_items_2_2= ruleItemConfig | lv_items_2_3= ruleGroupConfig ) )
            	    {
            	    // InternalPersistence.g:653:5: ( (lv_items_2_1= ruleAllConfig | lv_items_2_2= ruleItemConfig | lv_items_2_3= ruleGroupConfig ) )
            	    // InternalPersistence.g:654:6: (lv_items_2_1= ruleAllConfig | lv_items_2_2= ruleItemConfig | lv_items_2_3= ruleGroupConfig )
            	    {
            	    // InternalPersistence.g:654:6: (lv_items_2_1= ruleAllConfig | lv_items_2_2= ruleItemConfig | lv_items_2_3= ruleGroupConfig )
            	    int alt12=3;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==30) ) {
            	        alt12=1;
            	    }
            	    else if ( (LA12_0==RULE_ID) ) {
            	        int LA12_2 = input.LA(2);

            	        if ( (LA12_2==30) ) {
            	            alt12=3;
            	        }
            	        else if ( (LA12_2==15||LA12_2==19||LA12_2==26||LA12_2==29) ) {
            	            alt12=2;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 12, 2, input);

            	            throw nvae;
            	        }
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // InternalPersistence.g:655:7: lv_items_2_1= ruleAllConfig
            	            {

            	            							newCompositeNode(grammarAccess.getPersistenceConfigurationAccess().getItemsAllConfigParserRuleCall_1_1_0_0());
            	            						
            	            pushFollow(FOLLOW_18);
            	            lv_items_2_1=ruleAllConfig();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getPersistenceConfigurationRule());
            	            							}
            	            							add(
            	            								current,
            	            								"items",
            	            								lv_items_2_1,
            	            								"org.openhab.core.model.persistence.Persistence.AllConfig");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalPersistence.g:671:7: lv_items_2_2= ruleItemConfig
            	            {

            	            							newCompositeNode(grammarAccess.getPersistenceConfigurationAccess().getItemsItemConfigParserRuleCall_1_1_0_1());
            	            						
            	            pushFollow(FOLLOW_18);
            	            lv_items_2_2=ruleItemConfig();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getPersistenceConfigurationRule());
            	            							}
            	            							add(
            	            								current,
            	            								"items",
            	            								lv_items_2_2,
            	            								"org.openhab.core.model.persistence.Persistence.ItemConfig");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalPersistence.g:687:7: lv_items_2_3= ruleGroupConfig
            	            {

            	            							newCompositeNode(grammarAccess.getPersistenceConfigurationAccess().getItemsGroupConfigParserRuleCall_1_1_0_2());
            	            						
            	            pushFollow(FOLLOW_18);
            	            lv_items_2_3=ruleGroupConfig();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getPersistenceConfigurationRule());
            	            							}
            	            							add(
            	            								current,
            	            								"items",
            	            								lv_items_2_3,
            	            								"org.openhab.core.model.persistence.Persistence.GroupConfig");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalPersistence.g:706:3: (otherlv_3= '->' ( (lv_alias_4_0= RULE_STRING ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPersistence.g:707:4: otherlv_3= '->' ( (lv_alias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getPersistenceConfigurationAccess().getHyphenMinusGreaterThanSignKeyword_2_0());
                    			
                    // InternalPersistence.g:711:4: ( (lv_alias_4_0= RULE_STRING ) )
                    // InternalPersistence.g:712:5: (lv_alias_4_0= RULE_STRING )
                    {
                    // InternalPersistence.g:712:5: (lv_alias_4_0= RULE_STRING )
                    // InternalPersistence.g:713:6: lv_alias_4_0= RULE_STRING
                    {
                    lv_alias_4_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

                    						newLeafNode(lv_alias_4_0, grammarAccess.getPersistenceConfigurationAccess().getAliasSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPersistenceConfigurationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"alias",
                    							lv_alias_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPersistence.g:730:3: ( (otherlv_5= ':' (otherlv_6= 'strategy' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? (otherlv_11= 'filter' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* )? ) | otherlv_16= ';' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==19) ) {
                alt19=1;
            }
            else if ( (LA19_0==29) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalPersistence.g:731:4: (otherlv_5= ':' (otherlv_6= 'strategy' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? (otherlv_11= 'filter' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* )? )
                    {
                    // InternalPersistence.g:731:4: (otherlv_5= ':' (otherlv_6= 'strategy' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? (otherlv_11= 'filter' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* )? )
                    // InternalPersistence.g:732:5: otherlv_5= ':' (otherlv_6= 'strategy' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? (otherlv_11= 'filter' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* )?
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_21); 

                    					newLeafNode(otherlv_5, grammarAccess.getPersistenceConfigurationAccess().getColonKeyword_3_0_0());
                    				
                    // InternalPersistence.g:736:5: (otherlv_6= 'strategy' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==27) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalPersistence.g:737:6: otherlv_6= 'strategy' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                            {
                            otherlv_6=(Token)match(input,27,FOLLOW_5); 

                            						newLeafNode(otherlv_6, grammarAccess.getPersistenceConfigurationAccess().getStrategyKeyword_3_0_1_0());
                            					
                            otherlv_7=(Token)match(input,14,FOLLOW_6); 

                            						newLeafNode(otherlv_7, grammarAccess.getPersistenceConfigurationAccess().getEqualsSignKeyword_3_0_1_1());
                            					
                            // InternalPersistence.g:745:6: ( (otherlv_8= RULE_ID ) )
                            // InternalPersistence.g:746:7: (otherlv_8= RULE_ID )
                            {
                            // InternalPersistence.g:746:7: (otherlv_8= RULE_ID )
                            // InternalPersistence.g:747:8: otherlv_8= RULE_ID
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getPersistenceConfigurationRule());
                            								}
                            							
                            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_22); 

                            								newLeafNode(otherlv_8, grammarAccess.getPersistenceConfigurationAccess().getStrategiesStrategyCrossReference_3_0_1_2_0());
                            							

                            }


                            }

                            // InternalPersistence.g:758:6: (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                            loop15:
                            do {
                                int alt15=2;
                                int LA15_0 = input.LA(1);

                                if ( (LA15_0==15) ) {
                                    alt15=1;
                                }


                                switch (alt15) {
                            	case 1 :
                            	    // InternalPersistence.g:759:7: otherlv_9= ',' ( (otherlv_10= RULE_ID ) )
                            	    {
                            	    otherlv_9=(Token)match(input,15,FOLLOW_6); 

                            	    							newLeafNode(otherlv_9, grammarAccess.getPersistenceConfigurationAccess().getCommaKeyword_3_0_1_3_0());
                            	    						
                            	    // InternalPersistence.g:763:7: ( (otherlv_10= RULE_ID ) )
                            	    // InternalPersistence.g:764:8: (otherlv_10= RULE_ID )
                            	    {
                            	    // InternalPersistence.g:764:8: (otherlv_10= RULE_ID )
                            	    // InternalPersistence.g:765:9: otherlv_10= RULE_ID
                            	    {

                            	    									if (current==null) {
                            	    										current = createModelElement(grammarAccess.getPersistenceConfigurationRule());
                            	    									}
                            	    								
                            	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_22); 

                            	    									newLeafNode(otherlv_10, grammarAccess.getPersistenceConfigurationAccess().getStrategiesStrategyCrossReference_3_0_1_3_1_0());
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop15;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // InternalPersistence.g:778:5: (otherlv_11= 'filter' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )* )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==28) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalPersistence.g:779:6: otherlv_11= 'filter' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )*
                            {
                            otherlv_11=(Token)match(input,28,FOLLOW_5); 

                            						newLeafNode(otherlv_11, grammarAccess.getPersistenceConfigurationAccess().getFilterKeyword_3_0_2_0());
                            					
                            otherlv_12=(Token)match(input,14,FOLLOW_6); 

                            						newLeafNode(otherlv_12, grammarAccess.getPersistenceConfigurationAccess().getEqualsSignKeyword_3_0_2_1());
                            					
                            // InternalPersistence.g:787:6: ( (otherlv_13= RULE_ID ) )
                            // InternalPersistence.g:788:7: (otherlv_13= RULE_ID )
                            {
                            // InternalPersistence.g:788:7: (otherlv_13= RULE_ID )
                            // InternalPersistence.g:789:8: otherlv_13= RULE_ID
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getPersistenceConfigurationRule());
                            								}
                            							
                            otherlv_13=(Token)match(input,RULE_ID,FOLLOW_23); 

                            								newLeafNode(otherlv_13, grammarAccess.getPersistenceConfigurationAccess().getFiltersFilterCrossReference_3_0_2_2_0());
                            							

                            }


                            }

                            // InternalPersistence.g:800:6: (otherlv_14= ',' ( (otherlv_15= RULE_ID ) ) )*
                            loop17:
                            do {
                                int alt17=2;
                                int LA17_0 = input.LA(1);

                                if ( (LA17_0==15) ) {
                                    alt17=1;
                                }


                                switch (alt17) {
                            	case 1 :
                            	    // InternalPersistence.g:801:7: otherlv_14= ',' ( (otherlv_15= RULE_ID ) )
                            	    {
                            	    otherlv_14=(Token)match(input,15,FOLLOW_6); 

                            	    							newLeafNode(otherlv_14, grammarAccess.getPersistenceConfigurationAccess().getCommaKeyword_3_0_2_3_0());
                            	    						
                            	    // InternalPersistence.g:805:7: ( (otherlv_15= RULE_ID ) )
                            	    // InternalPersistence.g:806:8: (otherlv_15= RULE_ID )
                            	    {
                            	    // InternalPersistence.g:806:8: (otherlv_15= RULE_ID )
                            	    // InternalPersistence.g:807:9: otherlv_15= RULE_ID
                            	    {

                            	    									if (current==null) {
                            	    										current = createModelElement(grammarAccess.getPersistenceConfigurationRule());
                            	    									}
                            	    								
                            	    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_23); 

                            	    									newLeafNode(otherlv_15, grammarAccess.getPersistenceConfigurationAccess().getFiltersFilterCrossReference_3_0_2_3_1_0());
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop17;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPersistence.g:822:4: otherlv_16= ';'
                    {
                    otherlv_16=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_16, grammarAccess.getPersistenceConfigurationAccess().getSemicolonKeyword_3_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePersistenceConfiguration"


    // $ANTLR start "entryRuleAllConfig"
    // InternalPersistence.g:831:1: entryRuleAllConfig returns [EObject current=null] : iv_ruleAllConfig= ruleAllConfig EOF ;
    public final EObject entryRuleAllConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllConfig = null;


        try {
            // InternalPersistence.g:831:50: (iv_ruleAllConfig= ruleAllConfig EOF )
            // InternalPersistence.g:832:2: iv_ruleAllConfig= ruleAllConfig EOF
            {
             newCompositeNode(grammarAccess.getAllConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllConfig=ruleAllConfig();

            state._fsp--;

             current =iv_ruleAllConfig; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAllConfig"


    // $ANTLR start "ruleAllConfig"
    // InternalPersistence.g:838:1: ruleAllConfig returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleAllConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPersistence.g:844:2: ( ( () otherlv_1= '*' ) )
            // InternalPersistence.g:845:2: ( () otherlv_1= '*' )
            {
            // InternalPersistence.g:845:2: ( () otherlv_1= '*' )
            // InternalPersistence.g:846:3: () otherlv_1= '*'
            {
            // InternalPersistence.g:846:3: ()
            // InternalPersistence.g:847:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAllConfigAccess().getAllConfigAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getAllConfigAccess().getAsteriskKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAllConfig"


    // $ANTLR start "entryRuleItemConfig"
    // InternalPersistence.g:861:1: entryRuleItemConfig returns [EObject current=null] : iv_ruleItemConfig= ruleItemConfig EOF ;
    public final EObject entryRuleItemConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemConfig = null;


        try {
            // InternalPersistence.g:861:51: (iv_ruleItemConfig= ruleItemConfig EOF )
            // InternalPersistence.g:862:2: iv_ruleItemConfig= ruleItemConfig EOF
            {
             newCompositeNode(grammarAccess.getItemConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleItemConfig=ruleItemConfig();

            state._fsp--;

             current =iv_ruleItemConfig; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleItemConfig"


    // $ANTLR start "ruleItemConfig"
    // InternalPersistence.g:868:1: ruleItemConfig returns [EObject current=null] : ( (lv_item_0_0= RULE_ID ) ) ;
    public final EObject ruleItemConfig() throws RecognitionException {
        EObject current = null;

        Token lv_item_0_0=null;


        	enterRule();

        try {
            // InternalPersistence.g:874:2: ( ( (lv_item_0_0= RULE_ID ) ) )
            // InternalPersistence.g:875:2: ( (lv_item_0_0= RULE_ID ) )
            {
            // InternalPersistence.g:875:2: ( (lv_item_0_0= RULE_ID ) )
            // InternalPersistence.g:876:3: (lv_item_0_0= RULE_ID )
            {
            // InternalPersistence.g:876:3: (lv_item_0_0= RULE_ID )
            // InternalPersistence.g:877:4: lv_item_0_0= RULE_ID
            {
            lv_item_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_item_0_0, grammarAccess.getItemConfigAccess().getItemIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getItemConfigRule());
            				}
            				setWithLastConsumed(
            					current,
            					"item",
            					lv_item_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleItemConfig"


    // $ANTLR start "entryRuleGroupConfig"
    // InternalPersistence.g:896:1: entryRuleGroupConfig returns [EObject current=null] : iv_ruleGroupConfig= ruleGroupConfig EOF ;
    public final EObject entryRuleGroupConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupConfig = null;


        try {
            // InternalPersistence.g:896:52: (iv_ruleGroupConfig= ruleGroupConfig EOF )
            // InternalPersistence.g:897:2: iv_ruleGroupConfig= ruleGroupConfig EOF
            {
             newCompositeNode(grammarAccess.getGroupConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroupConfig=ruleGroupConfig();

            state._fsp--;

             current =iv_ruleGroupConfig; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGroupConfig"


    // $ANTLR start "ruleGroupConfig"
    // InternalPersistence.g:903:1: ruleGroupConfig returns [EObject current=null] : ( ( (lv_group_0_0= RULE_ID ) ) otherlv_1= '*' ) ;
    public final EObject ruleGroupConfig() throws RecognitionException {
        EObject current = null;

        Token lv_group_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPersistence.g:909:2: ( ( ( (lv_group_0_0= RULE_ID ) ) otherlv_1= '*' ) )
            // InternalPersistence.g:910:2: ( ( (lv_group_0_0= RULE_ID ) ) otherlv_1= '*' )
            {
            // InternalPersistence.g:910:2: ( ( (lv_group_0_0= RULE_ID ) ) otherlv_1= '*' )
            // InternalPersistence.g:911:3: ( (lv_group_0_0= RULE_ID ) ) otherlv_1= '*'
            {
            // InternalPersistence.g:911:3: ( (lv_group_0_0= RULE_ID ) )
            // InternalPersistence.g:912:4: (lv_group_0_0= RULE_ID )
            {
            // InternalPersistence.g:912:4: (lv_group_0_0= RULE_ID )
            // InternalPersistence.g:913:5: lv_group_0_0= RULE_ID
            {
            lv_group_0_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_group_0_0, grammarAccess.getGroupConfigAccess().getGroupIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupConfigRule());
            					}
            					setWithLastConsumed(
            						current,
            						"group",
            						lv_group_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getGroupConfigAccess().getAsteriskKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroupConfig"


    // $ANTLR start "entryRuleDECIMAL"
    // InternalPersistence.g:937:1: entryRuleDECIMAL returns [String current=null] : iv_ruleDECIMAL= ruleDECIMAL EOF ;
    public final String entryRuleDECIMAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDECIMAL = null;


        try {
            // InternalPersistence.g:937:47: (iv_ruleDECIMAL= ruleDECIMAL EOF )
            // InternalPersistence.g:938:2: iv_ruleDECIMAL= ruleDECIMAL EOF
            {
             newCompositeNode(grammarAccess.getDECIMALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDECIMAL=ruleDECIMAL();

            state._fsp--;

             current =iv_ruleDECIMAL.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDECIMAL"


    // $ANTLR start "ruleDECIMAL"
    // InternalPersistence.g:944:1: ruleDECIMAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleDECIMAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalPersistence.g:950:2: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // InternalPersistence.g:951:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // InternalPersistence.g:951:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // InternalPersistence.g:952:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_25); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_0());
            		
            // InternalPersistence.g:959:3: (kw= '.' this_INT_2= RULE_INT )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPersistence.g:960:4: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,31,FOLLOW_15); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDECIMALAccess().getFullStopKeyword_1_0());
                    			
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDECIMAL"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000012010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040010010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003C00000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000024088000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010008002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000002L});

}