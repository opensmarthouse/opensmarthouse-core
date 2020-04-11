/*
 * generated by Xtext 2.19.0
 */
package org.openhab.core.model.persistence.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class PersistenceGrammarAccess extends AbstractGrammarElementFinder {
	
	public class PersistenceModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.openhab.core.model.persistence.Persistence.PersistenceModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cPersistenceModelAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cStrategiesKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cStrategiesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cStrategiesStrategyParserRuleCall_3_0 = (RuleCall)cStrategiesAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cDefaultKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cEqualsSignKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cDefaultsAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final CrossReference cDefaultsStrategyCrossReference_4_2_0 = (CrossReference)cDefaultsAssignment_4_2.eContents().get(0);
		private final RuleCall cDefaultsStrategyIDTerminalRuleCall_4_2_0_1 = (RuleCall)cDefaultsStrategyCrossReference_4_2_0.eContents().get(1);
		private final Group cGroup_4_3 = (Group)cGroup_4.eContents().get(3);
		private final Keyword cCommaKeyword_4_3_0 = (Keyword)cGroup_4_3.eContents().get(0);
		private final Assignment cDefaultsAssignment_4_3_1 = (Assignment)cGroup_4_3.eContents().get(1);
		private final CrossReference cDefaultsStrategyCrossReference_4_3_1_0 = (CrossReference)cDefaultsAssignment_4_3_1.eContents().get(0);
		private final RuleCall cDefaultsStrategyIDTerminalRuleCall_4_3_1_0_1 = (RuleCall)cDefaultsStrategyCrossReference_4_3_1_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cFiltersKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final Assignment cFiltersAssignment_6_2 = (Assignment)cGroup_6.eContents().get(2);
		private final RuleCall cFiltersFilterParserRuleCall_6_2_0 = (RuleCall)cFiltersAssignment_6_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6_3 = (Keyword)cGroup_6.eContents().get(3);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cItemsKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_7_1 = (Keyword)cGroup_7.eContents().get(1);
		private final Assignment cConfigsAssignment_7_2 = (Assignment)cGroup_7.eContents().get(2);
		private final RuleCall cConfigsPersistenceConfigurationParserRuleCall_7_2_0 = (RuleCall)cConfigsAssignment_7_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7_3 = (Keyword)cGroup_7.eContents().get(3);
		
		//PersistenceModel:
		//	{PersistenceModel}
		//	'Strategies' '{' strategies+=Strategy* ('default' '=' defaults+=[Strategy] (',' defaults+=[Strategy])*)?
		//	'}' ('Filters' '{' filters+=Filter* '}')? ('Items' '{' configs+=PersistenceConfiguration* '}')?;
		@Override public ParserRule getRule() { return rule; }
		
		//{PersistenceModel} 'Strategies' '{' strategies+=Strategy* ('default' '=' defaults+=[Strategy] (','
		//defaults+=[Strategy])*)? '}' ('Filters' '{' filters+=Filter* '}')? ('Items' '{' configs+=PersistenceConfiguration*
		//'}')?
		public Group getGroup() { return cGroup; }
		
		//{PersistenceModel}
		public Action getPersistenceModelAction_0() { return cPersistenceModelAction_0; }
		
		//'Strategies'
		public Keyword getStrategiesKeyword_1() { return cStrategiesKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//strategies+=Strategy*
		public Assignment getStrategiesAssignment_3() { return cStrategiesAssignment_3; }
		
		//Strategy
		public RuleCall getStrategiesStrategyParserRuleCall_3_0() { return cStrategiesStrategyParserRuleCall_3_0; }
		
		//('default' '=' defaults+=[Strategy] (',' defaults+=[Strategy])*)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'default'
		public Keyword getDefaultKeyword_4_0() { return cDefaultKeyword_4_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_4_1() { return cEqualsSignKeyword_4_1; }
		
		//defaults+=[Strategy]
		public Assignment getDefaultsAssignment_4_2() { return cDefaultsAssignment_4_2; }
		
		//[Strategy]
		public CrossReference getDefaultsStrategyCrossReference_4_2_0() { return cDefaultsStrategyCrossReference_4_2_0; }
		
		//ID
		public RuleCall getDefaultsStrategyIDTerminalRuleCall_4_2_0_1() { return cDefaultsStrategyIDTerminalRuleCall_4_2_0_1; }
		
		//(',' defaults+=[Strategy])*
		public Group getGroup_4_3() { return cGroup_4_3; }
		
		//','
		public Keyword getCommaKeyword_4_3_0() { return cCommaKeyword_4_3_0; }
		
		//defaults+=[Strategy]
		public Assignment getDefaultsAssignment_4_3_1() { return cDefaultsAssignment_4_3_1; }
		
		//[Strategy]
		public CrossReference getDefaultsStrategyCrossReference_4_3_1_0() { return cDefaultsStrategyCrossReference_4_3_1_0; }
		
		//ID
		public RuleCall getDefaultsStrategyIDTerminalRuleCall_4_3_1_0_1() { return cDefaultsStrategyIDTerminalRuleCall_4_3_1_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
		
		//('Filters' '{' filters+=Filter* '}')?
		public Group getGroup_6() { return cGroup_6; }
		
		//'Filters'
		public Keyword getFiltersKeyword_6_0() { return cFiltersKeyword_6_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_6_1() { return cLeftCurlyBracketKeyword_6_1; }
		
		//filters+=Filter*
		public Assignment getFiltersAssignment_6_2() { return cFiltersAssignment_6_2; }
		
		//Filter
		public RuleCall getFiltersFilterParserRuleCall_6_2_0() { return cFiltersFilterParserRuleCall_6_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6_3() { return cRightCurlyBracketKeyword_6_3; }
		
		//('Items' '{' configs+=PersistenceConfiguration* '}')?
		public Group getGroup_7() { return cGroup_7; }
		
		//'Items'
		public Keyword getItemsKeyword_7_0() { return cItemsKeyword_7_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_7_1() { return cLeftCurlyBracketKeyword_7_1; }
		
		//configs+=PersistenceConfiguration*
		public Assignment getConfigsAssignment_7_2() { return cConfigsAssignment_7_2; }
		
		//PersistenceConfiguration
		public RuleCall getConfigsPersistenceConfigurationParserRuleCall_7_2_0() { return cConfigsPersistenceConfigurationParserRuleCall_7_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7_3() { return cRightCurlyBracketKeyword_7_3; }
	}
	public class StrategyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.openhab.core.model.persistence.Persistence.Strategy");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cCronStrategyParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Strategy:
		//	CronStrategy | name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//CronStrategy | name=ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//CronStrategy
		public RuleCall getCronStrategyParserRuleCall_0() { return cCronStrategyParserRuleCall_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class CronStrategyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.openhab.core.model.persistence.Persistence.CronStrategy");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cCronStrategyAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cCronExpressionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cCronExpressionSTRINGTerminalRuleCall_3_0 = (RuleCall)cCronExpressionAssignment_3.eContents().get(0);
		
		//CronStrategy Strategy:
		//	{CronStrategy} name=ID ':' cronExpression=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//{CronStrategy} name=ID ':' cronExpression=STRING
		public Group getGroup() { return cGroup; }
		
		//{CronStrategy}
		public Action getCronStrategyAction_0() { return cCronStrategyAction_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//cronExpression=STRING
		public Assignment getCronExpressionAssignment_3() { return cCronExpressionAssignment_3; }
		
		//STRING
		public RuleCall getCronExpressionSTRINGTerminalRuleCall_3_0() { return cCronExpressionSTRINGTerminalRuleCall_3_0; }
	}
	public class FilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.openhab.core.model.persistence.Persistence.Filter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cDefinitionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDefinitionFilterDetailsParserRuleCall_2_0 = (RuleCall)cDefinitionAssignment_2.eContents().get(0);
		
		//Filter:
		//	name=ID ':' definition=FilterDetails;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' definition=FilterDetails
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//definition=FilterDetails
		public Assignment getDefinitionAssignment_2() { return cDefinitionAssignment_2; }
		
		//FilterDetails
		public RuleCall getDefinitionFilterDetailsParserRuleCall_2_0() { return cDefinitionFilterDetailsParserRuleCall_2_0; }
	}
	public class FilterDetailsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.openhab.core.model.persistence.Persistence.FilterDetails");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cThresholdFilterParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTimeFilterParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//FilterDetails:
		//	ThresholdFilter | TimeFilter;
		@Override public ParserRule getRule() { return rule; }
		
		//ThresholdFilter | TimeFilter
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ThresholdFilter
		public RuleCall getThresholdFilterParserRuleCall_0() { return cThresholdFilterParserRuleCall_0; }
		
		//TimeFilter
		public RuleCall getTimeFilterParserRuleCall_1() { return cTimeFilterParserRuleCall_1; }
	}
	public class ThresholdFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.openhab.core.model.persistence.Persistence.ThresholdFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGreaterThanSignKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueDECIMALParserRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		private final Assignment cPercentAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cPercentPercentSignKeyword_2_0 = (Keyword)cPercentAssignment_2.eContents().get(0);
		
		//ThresholdFilter:
		//	'>' value=DECIMAL percent?='%';
		@Override public ParserRule getRule() { return rule; }
		
		//'>' value=DECIMAL percent?='%'
		public Group getGroup() { return cGroup; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_0() { return cGreaterThanSignKeyword_0; }
		
		//value=DECIMAL
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//DECIMAL
		public RuleCall getValueDECIMALParserRuleCall_1_0() { return cValueDECIMALParserRuleCall_1_0; }
		
		//percent?='%'
		public Assignment getPercentAssignment_2() { return cPercentAssignment_2; }
		
		//'%'
		public Keyword getPercentPercentSignKeyword_2_0() { return cPercentPercentSignKeyword_2_0; }
	}
	public class TimeFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.openhab.core.model.persistence.Persistence.TimeFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cValueAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cValueINTTerminalRuleCall_0_0 = (RuleCall)cValueAssignment_0.eContents().get(0);
		private final Assignment cUnitAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cUnitAlternatives_1_0 = (Alternatives)cUnitAssignment_1.eContents().get(0);
		private final Keyword cUnitSKeyword_1_0_0 = (Keyword)cUnitAlternatives_1_0.eContents().get(0);
		private final Keyword cUnitMKeyword_1_0_1 = (Keyword)cUnitAlternatives_1_0.eContents().get(1);
		private final Keyword cUnitHKeyword_1_0_2 = (Keyword)cUnitAlternatives_1_0.eContents().get(2);
		private final Keyword cUnitDKeyword_1_0_3 = (Keyword)cUnitAlternatives_1_0.eContents().get(3);
		
		//TimeFilter:
		//	value=INT unit=('s' | 'm' | 'h' | 'd');
		@Override public ParserRule getRule() { return rule; }
		
		//value=INT unit=('s' | 'm' | 'h' | 'd')
		public Group getGroup() { return cGroup; }
		
		//value=INT
		public Assignment getValueAssignment_0() { return cValueAssignment_0; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_0_0() { return cValueINTTerminalRuleCall_0_0; }
		
		//unit=('s' | 'm' | 'h' | 'd')
		public Assignment getUnitAssignment_1() { return cUnitAssignment_1; }
		
		//('s' | 'm' | 'h' | 'd')
		public Alternatives getUnitAlternatives_1_0() { return cUnitAlternatives_1_0; }
		
		//'s'
		public Keyword getUnitSKeyword_1_0_0() { return cUnitSKeyword_1_0_0; }
		
		//'m'
		public Keyword getUnitMKeyword_1_0_1() { return cUnitMKeyword_1_0_1; }
		
		//'h'
		public Keyword getUnitHKeyword_1_0_2() { return cUnitHKeyword_1_0_2; }
		
		//'d'
		public Keyword getUnitDKeyword_1_0_3() { return cUnitDKeyword_1_0_3; }
	}
	public class PersistenceConfigurationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.openhab.core.model.persistence.Persistence.PersistenceConfiguration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cItemsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Alternatives cItemsAlternatives_0_0 = (Alternatives)cItemsAssignment_0.eContents().get(0);
		private final RuleCall cItemsAllConfigParserRuleCall_0_0_0 = (RuleCall)cItemsAlternatives_0_0.eContents().get(0);
		private final RuleCall cItemsItemConfigParserRuleCall_0_0_1 = (RuleCall)cItemsAlternatives_0_0.eContents().get(1);
		private final RuleCall cItemsGroupConfigParserRuleCall_0_0_2 = (RuleCall)cItemsAlternatives_0_0.eContents().get(2);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCommaKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cItemsAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Alternatives cItemsAlternatives_1_1_0 = (Alternatives)cItemsAssignment_1_1.eContents().get(0);
		private final RuleCall cItemsAllConfigParserRuleCall_1_1_0_0 = (RuleCall)cItemsAlternatives_1_1_0.eContents().get(0);
		private final RuleCall cItemsItemConfigParserRuleCall_1_1_0_1 = (RuleCall)cItemsAlternatives_1_1_0.eContents().get(1);
		private final RuleCall cItemsGroupConfigParserRuleCall_1_1_0_2 = (RuleCall)cItemsAlternatives_1_1_0.eContents().get(2);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cAliasAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cAliasSTRINGTerminalRuleCall_2_1_0 = (RuleCall)cAliasAssignment_2_1.eContents().get(0);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cAlternatives_3.eContents().get(0);
		private final Keyword cColonKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Group cGroup_3_0_1 = (Group)cGroup_3_0.eContents().get(1);
		private final Keyword cStrategyKeyword_3_0_1_0 = (Keyword)cGroup_3_0_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_3_0_1_1 = (Keyword)cGroup_3_0_1.eContents().get(1);
		private final Assignment cStrategiesAssignment_3_0_1_2 = (Assignment)cGroup_3_0_1.eContents().get(2);
		private final CrossReference cStrategiesStrategyCrossReference_3_0_1_2_0 = (CrossReference)cStrategiesAssignment_3_0_1_2.eContents().get(0);
		private final RuleCall cStrategiesStrategyIDTerminalRuleCall_3_0_1_2_0_1 = (RuleCall)cStrategiesStrategyCrossReference_3_0_1_2_0.eContents().get(1);
		private final Group cGroup_3_0_1_3 = (Group)cGroup_3_0_1.eContents().get(3);
		private final Keyword cCommaKeyword_3_0_1_3_0 = (Keyword)cGroup_3_0_1_3.eContents().get(0);
		private final Assignment cStrategiesAssignment_3_0_1_3_1 = (Assignment)cGroup_3_0_1_3.eContents().get(1);
		private final CrossReference cStrategiesStrategyCrossReference_3_0_1_3_1_0 = (CrossReference)cStrategiesAssignment_3_0_1_3_1.eContents().get(0);
		private final RuleCall cStrategiesStrategyIDTerminalRuleCall_3_0_1_3_1_0_1 = (RuleCall)cStrategiesStrategyCrossReference_3_0_1_3_1_0.eContents().get(1);
		private final Group cGroup_3_0_2 = (Group)cGroup_3_0.eContents().get(2);
		private final Keyword cFilterKeyword_3_0_2_0 = (Keyword)cGroup_3_0_2.eContents().get(0);
		private final Keyword cEqualsSignKeyword_3_0_2_1 = (Keyword)cGroup_3_0_2.eContents().get(1);
		private final Assignment cFiltersAssignment_3_0_2_2 = (Assignment)cGroup_3_0_2.eContents().get(2);
		private final CrossReference cFiltersFilterCrossReference_3_0_2_2_0 = (CrossReference)cFiltersAssignment_3_0_2_2.eContents().get(0);
		private final RuleCall cFiltersFilterIDTerminalRuleCall_3_0_2_2_0_1 = (RuleCall)cFiltersFilterCrossReference_3_0_2_2_0.eContents().get(1);
		private final Group cGroup_3_0_2_3 = (Group)cGroup_3_0_2.eContents().get(3);
		private final Keyword cCommaKeyword_3_0_2_3_0 = (Keyword)cGroup_3_0_2_3.eContents().get(0);
		private final Assignment cFiltersAssignment_3_0_2_3_1 = (Assignment)cGroup_3_0_2_3.eContents().get(1);
		private final CrossReference cFiltersFilterCrossReference_3_0_2_3_1_0 = (CrossReference)cFiltersAssignment_3_0_2_3_1.eContents().get(0);
		private final RuleCall cFiltersFilterIDTerminalRuleCall_3_0_2_3_1_0_1 = (RuleCall)cFiltersFilterCrossReference_3_0_2_3_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_3_1 = (Keyword)cAlternatives_3.eContents().get(1);
		
		//PersistenceConfiguration:
		//	items+=(AllConfig | ItemConfig | GroupConfig) (',' items+=(AllConfig | ItemConfig | GroupConfig))* ('->'
		//	alias=STRING)? (':' ('strategy' '=' strategies+=[Strategy] (',' strategies+=[Strategy])*)? ('filter' '='
		//	filters+=[Filter] (',' filters+=[Filter])*)? | ';');
		@Override public ParserRule getRule() { return rule; }
		
		//items+=(AllConfig | ItemConfig | GroupConfig) (',' items+=(AllConfig | ItemConfig | GroupConfig))* ('->' alias=STRING)?
		//(':' ('strategy' '=' strategies+=[Strategy] (',' strategies+=[Strategy])*)? ('filter' '=' filters+=[Filter] (','
		//filters+=[Filter])*)? | ';')
		public Group getGroup() { return cGroup; }
		
		//items+=(AllConfig | ItemConfig | GroupConfig)
		public Assignment getItemsAssignment_0() { return cItemsAssignment_0; }
		
		//(AllConfig | ItemConfig | GroupConfig)
		public Alternatives getItemsAlternatives_0_0() { return cItemsAlternatives_0_0; }
		
		//AllConfig
		public RuleCall getItemsAllConfigParserRuleCall_0_0_0() { return cItemsAllConfigParserRuleCall_0_0_0; }
		
		//ItemConfig
		public RuleCall getItemsItemConfigParserRuleCall_0_0_1() { return cItemsItemConfigParserRuleCall_0_0_1; }
		
		//GroupConfig
		public RuleCall getItemsGroupConfigParserRuleCall_0_0_2() { return cItemsGroupConfigParserRuleCall_0_0_2; }
		
		//(',' items+=(AllConfig | ItemConfig | GroupConfig))*
		public Group getGroup_1() { return cGroup_1; }
		
		//','
		public Keyword getCommaKeyword_1_0() { return cCommaKeyword_1_0; }
		
		//items+=(AllConfig | ItemConfig | GroupConfig)
		public Assignment getItemsAssignment_1_1() { return cItemsAssignment_1_1; }
		
		//(AllConfig | ItemConfig | GroupConfig)
		public Alternatives getItemsAlternatives_1_1_0() { return cItemsAlternatives_1_1_0; }
		
		//AllConfig
		public RuleCall getItemsAllConfigParserRuleCall_1_1_0_0() { return cItemsAllConfigParserRuleCall_1_1_0_0; }
		
		//ItemConfig
		public RuleCall getItemsItemConfigParserRuleCall_1_1_0_1() { return cItemsItemConfigParserRuleCall_1_1_0_1; }
		
		//GroupConfig
		public RuleCall getItemsGroupConfigParserRuleCall_1_1_0_2() { return cItemsGroupConfigParserRuleCall_1_1_0_2; }
		
		//('->' alias=STRING)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_2_0() { return cHyphenMinusGreaterThanSignKeyword_2_0; }
		
		//alias=STRING
		public Assignment getAliasAssignment_2_1() { return cAliasAssignment_2_1; }
		
		//STRING
		public RuleCall getAliasSTRINGTerminalRuleCall_2_1_0() { return cAliasSTRINGTerminalRuleCall_2_1_0; }
		
		//(':' ('strategy' '=' strategies+=[Strategy] (',' strategies+=[Strategy])*)? ('filter' '=' filters+=[Filter] (','
		//filters+=[Filter])*)? | ';')
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//':' ('strategy' '=' strategies+=[Strategy] (',' strategies+=[Strategy])*)? ('filter' '=' filters+=[Filter] (','
		//filters+=[Filter])*)?
		public Group getGroup_3_0() { return cGroup_3_0; }
		
		//':'
		public Keyword getColonKeyword_3_0_0() { return cColonKeyword_3_0_0; }
		
		//('strategy' '=' strategies+=[Strategy] (',' strategies+=[Strategy])*)?
		public Group getGroup_3_0_1() { return cGroup_3_0_1; }
		
		//'strategy'
		public Keyword getStrategyKeyword_3_0_1_0() { return cStrategyKeyword_3_0_1_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_3_0_1_1() { return cEqualsSignKeyword_3_0_1_1; }
		
		//strategies+=[Strategy]
		public Assignment getStrategiesAssignment_3_0_1_2() { return cStrategiesAssignment_3_0_1_2; }
		
		//[Strategy]
		public CrossReference getStrategiesStrategyCrossReference_3_0_1_2_0() { return cStrategiesStrategyCrossReference_3_0_1_2_0; }
		
		//ID
		public RuleCall getStrategiesStrategyIDTerminalRuleCall_3_0_1_2_0_1() { return cStrategiesStrategyIDTerminalRuleCall_3_0_1_2_0_1; }
		
		//(',' strategies+=[Strategy])*
		public Group getGroup_3_0_1_3() { return cGroup_3_0_1_3; }
		
		//','
		public Keyword getCommaKeyword_3_0_1_3_0() { return cCommaKeyword_3_0_1_3_0; }
		
		//strategies+=[Strategy]
		public Assignment getStrategiesAssignment_3_0_1_3_1() { return cStrategiesAssignment_3_0_1_3_1; }
		
		//[Strategy]
		public CrossReference getStrategiesStrategyCrossReference_3_0_1_3_1_0() { return cStrategiesStrategyCrossReference_3_0_1_3_1_0; }
		
		//ID
		public RuleCall getStrategiesStrategyIDTerminalRuleCall_3_0_1_3_1_0_1() { return cStrategiesStrategyIDTerminalRuleCall_3_0_1_3_1_0_1; }
		
		//('filter' '=' filters+=[Filter] (',' filters+=[Filter])*)?
		public Group getGroup_3_0_2() { return cGroup_3_0_2; }
		
		//'filter'
		public Keyword getFilterKeyword_3_0_2_0() { return cFilterKeyword_3_0_2_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_3_0_2_1() { return cEqualsSignKeyword_3_0_2_1; }
		
		//filters+=[Filter]
		public Assignment getFiltersAssignment_3_0_2_2() { return cFiltersAssignment_3_0_2_2; }
		
		//[Filter]
		public CrossReference getFiltersFilterCrossReference_3_0_2_2_0() { return cFiltersFilterCrossReference_3_0_2_2_0; }
		
		//ID
		public RuleCall getFiltersFilterIDTerminalRuleCall_3_0_2_2_0_1() { return cFiltersFilterIDTerminalRuleCall_3_0_2_2_0_1; }
		
		//(',' filters+=[Filter])*
		public Group getGroup_3_0_2_3() { return cGroup_3_0_2_3; }
		
		//','
		public Keyword getCommaKeyword_3_0_2_3_0() { return cCommaKeyword_3_0_2_3_0; }
		
		//filters+=[Filter]
		public Assignment getFiltersAssignment_3_0_2_3_1() { return cFiltersAssignment_3_0_2_3_1; }
		
		//[Filter]
		public CrossReference getFiltersFilterCrossReference_3_0_2_3_1_0() { return cFiltersFilterCrossReference_3_0_2_3_1_0; }
		
		//ID
		public RuleCall getFiltersFilterIDTerminalRuleCall_3_0_2_3_1_0_1() { return cFiltersFilterIDTerminalRuleCall_3_0_2_3_1_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_3_1() { return cSemicolonKeyword_3_1; }
	}
	public class AllConfigElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.openhab.core.model.persistence.Persistence.AllConfig");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cAllConfigAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cAsteriskKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//AllConfig:
		//	{AllConfig}
		//	'*';
		@Override public ParserRule getRule() { return rule; }
		
		//{AllConfig} '*'
		public Group getGroup() { return cGroup; }
		
		//{AllConfig}
		public Action getAllConfigAction_0() { return cAllConfigAction_0; }
		
		//'*'
		public Keyword getAsteriskKeyword_1() { return cAsteriskKeyword_1; }
	}
	public class ItemConfigElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.openhab.core.model.persistence.Persistence.ItemConfig");
		private final Assignment cItemAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cItemIDTerminalRuleCall_0 = (RuleCall)cItemAssignment.eContents().get(0);
		
		//ItemConfig:
		//	item=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//item=ID
		public Assignment getItemAssignment() { return cItemAssignment; }
		
		//ID
		public RuleCall getItemIDTerminalRuleCall_0() { return cItemIDTerminalRuleCall_0; }
	}
	public class GroupConfigElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.openhab.core.model.persistence.Persistence.GroupConfig");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cGroupAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cGroupIDTerminalRuleCall_0_0 = (RuleCall)cGroupAssignment_0.eContents().get(0);
		private final Keyword cAsteriskKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//GroupConfig:
		//	group=ID '*';
		@Override public ParserRule getRule() { return rule; }
		
		//group=ID '*'
		public Group getGroup() { return cGroup; }
		
		//group=ID
		public Assignment getGroupAssignment_0() { return cGroupAssignment_0; }
		
		//ID
		public RuleCall getGroupIDTerminalRuleCall_0_0() { return cGroupIDTerminalRuleCall_0_0; }
		
		//'*'
		public Keyword getAsteriskKeyword_1() { return cAsteriskKeyword_1; }
	}
	public class DECIMALElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.openhab.core.model.persistence.Persistence.DECIMAL");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//DECIMAL ecore::EBigDecimal:
		//	INT ('.' INT)?;
		@Override public ParserRule getRule() { return rule; }
		
		//INT ('.' INT)?
		public Group getGroup() { return cGroup; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_0() { return cINTTerminalRuleCall_0; }
		
		//('.' INT)?
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1_1() { return cINTTerminalRuleCall_1_1; }
	}
	
	
	private final PersistenceModelElements pPersistenceModel;
	private final StrategyElements pStrategy;
	private final CronStrategyElements pCronStrategy;
	private final FilterElements pFilter;
	private final FilterDetailsElements pFilterDetails;
	private final ThresholdFilterElements pThresholdFilter;
	private final TimeFilterElements pTimeFilter;
	private final PersistenceConfigurationElements pPersistenceConfiguration;
	private final AllConfigElements pAllConfig;
	private final ItemConfigElements pItemConfig;
	private final GroupConfigElements pGroupConfig;
	private final DECIMALElements pDECIMAL;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public PersistenceGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pPersistenceModel = new PersistenceModelElements();
		this.pStrategy = new StrategyElements();
		this.pCronStrategy = new CronStrategyElements();
		this.pFilter = new FilterElements();
		this.pFilterDetails = new FilterDetailsElements();
		this.pThresholdFilter = new ThresholdFilterElements();
		this.pTimeFilter = new TimeFilterElements();
		this.pPersistenceConfiguration = new PersistenceConfigurationElements();
		this.pAllConfig = new AllConfigElements();
		this.pItemConfig = new ItemConfigElements();
		this.pGroupConfig = new GroupConfigElements();
		this.pDECIMAL = new DECIMALElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.openhab.core.model.persistence.Persistence".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//PersistenceModel:
	//	{PersistenceModel}
	//	'Strategies' '{' strategies+=Strategy* ('default' '=' defaults+=[Strategy] (',' defaults+=[Strategy])*)?
	//	'}' ('Filters' '{' filters+=Filter* '}')? ('Items' '{' configs+=PersistenceConfiguration* '}')?;
	public PersistenceModelElements getPersistenceModelAccess() {
		return pPersistenceModel;
	}
	
	public ParserRule getPersistenceModelRule() {
		return getPersistenceModelAccess().getRule();
	}
	
	//Strategy:
	//	CronStrategy | name=ID;
	public StrategyElements getStrategyAccess() {
		return pStrategy;
	}
	
	public ParserRule getStrategyRule() {
		return getStrategyAccess().getRule();
	}
	
	//CronStrategy Strategy:
	//	{CronStrategy} name=ID ':' cronExpression=STRING;
	public CronStrategyElements getCronStrategyAccess() {
		return pCronStrategy;
	}
	
	public ParserRule getCronStrategyRule() {
		return getCronStrategyAccess().getRule();
	}
	
	//Filter:
	//	name=ID ':' definition=FilterDetails;
	public FilterElements getFilterAccess() {
		return pFilter;
	}
	
	public ParserRule getFilterRule() {
		return getFilterAccess().getRule();
	}
	
	//FilterDetails:
	//	ThresholdFilter | TimeFilter;
	public FilterDetailsElements getFilterDetailsAccess() {
		return pFilterDetails;
	}
	
	public ParserRule getFilterDetailsRule() {
		return getFilterDetailsAccess().getRule();
	}
	
	//ThresholdFilter:
	//	'>' value=DECIMAL percent?='%';
	public ThresholdFilterElements getThresholdFilterAccess() {
		return pThresholdFilter;
	}
	
	public ParserRule getThresholdFilterRule() {
		return getThresholdFilterAccess().getRule();
	}
	
	//TimeFilter:
	//	value=INT unit=('s' | 'm' | 'h' | 'd');
	public TimeFilterElements getTimeFilterAccess() {
		return pTimeFilter;
	}
	
	public ParserRule getTimeFilterRule() {
		return getTimeFilterAccess().getRule();
	}
	
	//PersistenceConfiguration:
	//	items+=(AllConfig | ItemConfig | GroupConfig) (',' items+=(AllConfig | ItemConfig | GroupConfig))* ('->'
	//	alias=STRING)? (':' ('strategy' '=' strategies+=[Strategy] (',' strategies+=[Strategy])*)? ('filter' '='
	//	filters+=[Filter] (',' filters+=[Filter])*)? | ';');
	public PersistenceConfigurationElements getPersistenceConfigurationAccess() {
		return pPersistenceConfiguration;
	}
	
	public ParserRule getPersistenceConfigurationRule() {
		return getPersistenceConfigurationAccess().getRule();
	}
	
	//AllConfig:
	//	{AllConfig}
	//	'*';
	public AllConfigElements getAllConfigAccess() {
		return pAllConfig;
	}
	
	public ParserRule getAllConfigRule() {
		return getAllConfigAccess().getRule();
	}
	
	//ItemConfig:
	//	item=ID;
	public ItemConfigElements getItemConfigAccess() {
		return pItemConfig;
	}
	
	public ParserRule getItemConfigRule() {
		return getItemConfigAccess().getRule();
	}
	
	//GroupConfig:
	//	group=ID '*';
	public GroupConfigElements getGroupConfigAccess() {
		return pGroupConfig;
	}
	
	public ParserRule getGroupConfigRule() {
		return getGroupConfigAccess().getRule();
	}
	
	//DECIMAL ecore::EBigDecimal:
	//	INT ('.' INT)?;
	public DECIMALElements getDECIMALAccess() {
		return pDECIMAL;
	}
	
	public ParserRule getDECIMALRule() {
		return getDECIMALAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
