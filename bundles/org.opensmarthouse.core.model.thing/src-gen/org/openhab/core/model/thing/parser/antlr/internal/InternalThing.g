/*
 * generated by Xtext 2.19.0
 */
grammar InternalThing;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.openhab.core.model.thing.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleThingModel
entryRuleThingModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getThingModelRule()); }
	iv_ruleThingModel=ruleThingModel
	{ $current=$iv_ruleThingModel.current; }
	EOF;

// Rule ThingModel
ruleThingModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getThingModelAccess().getThingsModelThingParserRuleCall_0_0());
				}
				lv_things_0_1=ruleModelThing
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getThingModelRule());
					}
					add(
						$current,
						"things",
						lv_things_0_1,
						"org.openhab.core.model.thing.Thing.ModelThing");
					afterParserOrEnumRuleCall();
				}
				    |
				{
					newCompositeNode(grammarAccess.getThingModelAccess().getThingsModelBridgeParserRuleCall_0_1());
				}
				lv_things_0_2=ruleModelBridge
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getThingModelRule());
					}
					add(
						$current,
						"things",
						lv_things_0_2,
						"org.openhab.core.model.thing.Thing.ModelBridge");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)*
;

// Entry rule entryRuleModelBridge
entryRuleModelBridge returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelBridgeRule()); }
	iv_ruleModelBridge=ruleModelBridge
	{ $current=$iv_ruleModelBridge.current; }
	EOF;

// Rule ModelBridge
ruleModelBridge returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getModelBridgeAccess().getModelBridgeAction_0(),
					$current);
			}
		)
		(
			(
				lv_bridge_1_0='Bridge'
				{
					newLeafNode(lv_bridge_1_0, grammarAccess.getModelBridgeAccess().getBridgeBridgeKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModelBridgeRule());
					}
					setWithLastConsumed($current, "bridge", true, "Bridge");
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getModelBridgeAccess().getIdUIDParserRuleCall_2_0_0());
					}
					lv_id_2_0=ruleUID
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelBridgeRule());
						}
						set(
							$current,
							"id",
							lv_id_2_0,
							"org.openhab.core.model.thing.Thing.UID");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getModelBridgeAccess().getThingTypeIdUID_SEGMENTParserRuleCall_2_1_0_0());
						}
						lv_thingTypeId_3_0=ruleUID_SEGMENT
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModelBridgeRule());
							}
							set(
								$current,
								"thingTypeId",
								lv_thingTypeId_3_0,
								"org.openhab.core.model.thing.Thing.UID_SEGMENT");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					(
						{
							newCompositeNode(grammarAccess.getModelBridgeAccess().getThingIdUID_SEGMENTParserRuleCall_2_1_1_0());
						}
						lv_thingId_4_0=ruleUID_SEGMENT
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModelBridgeRule());
							}
							set(
								$current,
								"thingId",
								lv_thingId_4_0,
								"org.openhab.core.model.thing.Thing.UID_SEGMENT");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)
		(
			(
				lv_label_5_0=RULE_STRING
				{
					newLeafNode(lv_label_5_0, grammarAccess.getModelBridgeAccess().getLabelSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModelBridgeRule());
					}
					setWithLastConsumed(
						$current,
						"label",
						lv_label_5_0,
						"org.openhab.core.model.thing.Thing.STRING");
				}
			)
		)?
		(
			otherlv_6='@'
			{
				newLeafNode(otherlv_6, grammarAccess.getModelBridgeAccess().getCommercialAtKeyword_4_0());
			}
			(
				(
					lv_location_7_0=RULE_STRING
					{
						newLeafNode(lv_location_7_0, grammarAccess.getModelBridgeAccess().getLocationSTRINGTerminalRuleCall_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getModelBridgeRule());
						}
						setWithLastConsumed(
							$current,
							"location",
							lv_location_7_0,
							"org.openhab.core.model.thing.Thing.STRING");
					}
				)
			)
		)?
		(
			otherlv_8='['
			{
				newLeafNode(otherlv_8, grammarAccess.getModelBridgeAccess().getLeftSquareBracketKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelBridgeAccess().getPropertiesModelPropertyParserRuleCall_5_1_0());
					}
					lv_properties_9_0=ruleModelProperty
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelBridgeRule());
						}
						add(
							$current,
							"properties",
							lv_properties_9_0,
							"org.openhab.core.model.thing.Thing.ModelProperty");
						afterParserOrEnumRuleCall();
					}
				)
			)?
			(
				otherlv_10=','
				{
					newLeafNode(otherlv_10, grammarAccess.getModelBridgeAccess().getCommaKeyword_5_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getModelBridgeAccess().getPropertiesModelPropertyParserRuleCall_5_2_1_0());
						}
						lv_properties_11_0=ruleModelProperty
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModelBridgeRule());
							}
							add(
								$current,
								"properties",
								lv_properties_11_0,
								"org.openhab.core.model.thing.Thing.ModelProperty");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_12=']'
			{
				newLeafNode(otherlv_12, grammarAccess.getModelBridgeAccess().getRightSquareBracketKeyword_5_3());
			}
		)?
		(
			otherlv_13='{'
			{
				newLeafNode(otherlv_13, grammarAccess.getModelBridgeAccess().getLeftCurlyBracketKeyword_6_0());
			}
			(
				otherlv_14='Things:'
				{
					newLeafNode(otherlv_14, grammarAccess.getModelBridgeAccess().getThingsKeyword_6_1());
				}
			)?
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getModelBridgeAccess().getThingsModelThingParserRuleCall_6_2_0_0());
						}
						lv_things_15_1=ruleModelThing
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModelBridgeRule());
							}
							add(
								$current,
								"things",
								lv_things_15_1,
								"org.openhab.core.model.thing.Thing.ModelThing");
							afterParserOrEnumRuleCall();
						}
						    |
						{
							newCompositeNode(grammarAccess.getModelBridgeAccess().getThingsModelBridgeParserRuleCall_6_2_0_1());
						}
						lv_things_15_2=ruleModelBridge
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModelBridgeRule());
							}
							add(
								$current,
								"things",
								lv_things_15_2,
								"org.openhab.core.model.thing.Thing.ModelBridge");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			(
				otherlv_16='Channels:'
				{
					newLeafNode(otherlv_16, grammarAccess.getModelBridgeAccess().getChannelsKeyword_6_3());
				}
			)?
			(
				(
					{
						newCompositeNode(grammarAccess.getModelBridgeAccess().getChannelsModelChannelParserRuleCall_6_4_0());
					}
					lv_channels_17_0=ruleModelChannel
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelBridgeRule());
						}
						add(
							$current,
							"channels",
							lv_channels_17_0,
							"org.openhab.core.model.thing.Thing.ModelChannel");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_18='}'
			{
				newLeafNode(otherlv_18, grammarAccess.getModelBridgeAccess().getRightCurlyBracketKeyword_6_5());
			}
		)?
	)
;

// Entry rule entryRuleModelThing
entryRuleModelThing returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelThingRule()); }
	iv_ruleModelThing=ruleModelThing
	{ $current=$iv_ruleModelThing.current; }
	EOF;

// Rule ModelThing
ruleModelThing returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='Thing'
			{
				newLeafNode(otherlv_0, grammarAccess.getModelThingAccess().getThingKeyword_0());
			}
		)?
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getModelThingAccess().getIdUIDParserRuleCall_1_0_0());
					}
					lv_id_1_0=ruleUID
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelThingRule());
						}
						set(
							$current,
							"id",
							lv_id_1_0,
							"org.openhab.core.model.thing.Thing.UID");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getModelThingAccess().getThingTypeIdUID_SEGMENTParserRuleCall_1_1_0_0());
						}
						lv_thingTypeId_2_0=ruleUID_SEGMENT
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModelThingRule());
							}
							set(
								$current,
								"thingTypeId",
								lv_thingTypeId_2_0,
								"org.openhab.core.model.thing.Thing.UID_SEGMENT");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					(
						{
							newCompositeNode(grammarAccess.getModelThingAccess().getThingIdUID_SEGMENTParserRuleCall_1_1_1_0());
						}
						lv_thingId_3_0=ruleUID_SEGMENT
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModelThingRule());
							}
							set(
								$current,
								"thingId",
								lv_thingId_3_0,
								"org.openhab.core.model.thing.Thing.UID_SEGMENT");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)
		(
			(
				lv_label_4_0=RULE_STRING
				{
					newLeafNode(lv_label_4_0, grammarAccess.getModelThingAccess().getLabelSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModelThingRule());
					}
					setWithLastConsumed(
						$current,
						"label",
						lv_label_4_0,
						"org.openhab.core.model.thing.Thing.STRING");
				}
			)
		)?
		(
			otherlv_5='('
			{
				newLeafNode(otherlv_5, grammarAccess.getModelThingAccess().getLeftParenthesisKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelThingAccess().getBridgeUIDUIDParserRuleCall_3_1_0());
					}
					lv_bridgeUID_6_0=ruleUID
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelThingRule());
						}
						set(
							$current,
							"bridgeUID",
							lv_bridgeUID_6_0,
							"org.openhab.core.model.thing.Thing.UID");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_7=')'
			{
				newLeafNode(otherlv_7, grammarAccess.getModelThingAccess().getRightParenthesisKeyword_3_2());
			}
		)?
		(
			otherlv_8='@'
			{
				newLeafNode(otherlv_8, grammarAccess.getModelThingAccess().getCommercialAtKeyword_4_0());
			}
			(
				(
					lv_location_9_0=RULE_STRING
					{
						newLeafNode(lv_location_9_0, grammarAccess.getModelThingAccess().getLocationSTRINGTerminalRuleCall_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getModelThingRule());
						}
						setWithLastConsumed(
							$current,
							"location",
							lv_location_9_0,
							"org.openhab.core.model.thing.Thing.STRING");
					}
				)
			)
		)?
		(
			otherlv_10='['
			{
				newLeafNode(otherlv_10, grammarAccess.getModelThingAccess().getLeftSquareBracketKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelThingAccess().getPropertiesModelPropertyParserRuleCall_5_1_0());
					}
					lv_properties_11_0=ruleModelProperty
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelThingRule());
						}
						add(
							$current,
							"properties",
							lv_properties_11_0,
							"org.openhab.core.model.thing.Thing.ModelProperty");
						afterParserOrEnumRuleCall();
					}
				)
			)?
			(
				otherlv_12=','
				{
					newLeafNode(otherlv_12, grammarAccess.getModelThingAccess().getCommaKeyword_5_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getModelThingAccess().getPropertiesModelPropertyParserRuleCall_5_2_1_0());
						}
						lv_properties_13_0=ruleModelProperty
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModelThingRule());
							}
							add(
								$current,
								"properties",
								lv_properties_13_0,
								"org.openhab.core.model.thing.Thing.ModelProperty");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_14=']'
			{
				newLeafNode(otherlv_14, grammarAccess.getModelThingAccess().getRightSquareBracketKeyword_5_3());
			}
		)?
		(
			otherlv_15='{'
			{
				newLeafNode(otherlv_15, grammarAccess.getModelThingAccess().getLeftCurlyBracketKeyword_6_0());
			}
			(
				otherlv_16='Channels:'
				{
					newLeafNode(otherlv_16, grammarAccess.getModelThingAccess().getChannelsKeyword_6_1());
				}
			)?
			(
				(
					{
						newCompositeNode(grammarAccess.getModelThingAccess().getChannelsModelChannelParserRuleCall_6_2_0());
					}
					lv_channels_17_0=ruleModelChannel
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelThingRule());
						}
						add(
							$current,
							"channels",
							lv_channels_17_0,
							"org.openhab.core.model.thing.Thing.ModelChannel");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_18='}'
			{
				newLeafNode(otherlv_18, grammarAccess.getModelThingAccess().getRightCurlyBracketKeyword_6_3());
			}
		)?
	)
;

// Entry rule entryRuleModelChannel
entryRuleModelChannel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelChannelRule()); }
	iv_ruleModelChannel=ruleModelChannel
	{ $current=$iv_ruleModelChannel.current; }
	EOF;

// Rule ModelChannel
ruleModelChannel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					(
						(
							lv_channelKind_0_1='State'
							{
								newLeafNode(lv_channelKind_0_1, grammarAccess.getModelChannelAccess().getChannelKindStateKeyword_0_0_0_0_0());
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getModelChannelRule());
								}
								setWithLastConsumed($current, "channelKind", lv_channelKind_0_1, null);
							}
							    |
							lv_channelKind_0_2='Trigger'
							{
								newLeafNode(lv_channelKind_0_2, grammarAccess.getModelChannelAccess().getChannelKindTriggerKeyword_0_0_0_0_1());
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getModelChannelRule());
								}
								setWithLastConsumed($current, "channelKind", lv_channelKind_0_2, null);
							}
						)
					)
				)?
				(
					(
						{
							newCompositeNode(grammarAccess.getModelChannelAccess().getTypeModelItemTypeParserRuleCall_0_0_1_0());
						}
						lv_type_1_0=ruleModelItemType
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModelChannelRule());
							}
							set(
								$current,
								"type",
								lv_type_1_0,
								"org.openhab.core.model.thing.Thing.ModelItemType");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				otherlv_2='Type'
				{
					newLeafNode(otherlv_2, grammarAccess.getModelChannelAccess().getTypeKeyword_0_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getModelChannelAccess().getChannelTypeUID_SEGMENTParserRuleCall_0_1_1_0());
						}
						lv_channelType_3_0=ruleUID_SEGMENT
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModelChannelRule());
							}
							set(
								$current,
								"channelType",
								lv_channelType_3_0,
								"org.openhab.core.model.thing.Thing.UID_SEGMENT");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)
		otherlv_4=':'
		{
			newLeafNode(otherlv_4, grammarAccess.getModelChannelAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getModelChannelAccess().getIdCHANNEL_IDParserRuleCall_2_0());
				}
				lv_id_5_0=ruleCHANNEL_ID
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelChannelRule());
					}
					set(
						$current,
						"id",
						lv_id_5_0,
						"org.openhab.core.model.thing.Thing.CHANNEL_ID");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_label_6_0=RULE_STRING
				{
					newLeafNode(lv_label_6_0, grammarAccess.getModelChannelAccess().getLabelSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModelChannelRule());
					}
					setWithLastConsumed(
						$current,
						"label",
						lv_label_6_0,
						"org.openhab.core.model.thing.Thing.STRING");
				}
			)
		)?
		(
			otherlv_7='['
			{
				newLeafNode(otherlv_7, grammarAccess.getModelChannelAccess().getLeftSquareBracketKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelChannelAccess().getPropertiesModelPropertyParserRuleCall_4_1_0());
					}
					lv_properties_8_0=ruleModelProperty
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelChannelRule());
						}
						add(
							$current,
							"properties",
							lv_properties_8_0,
							"org.openhab.core.model.thing.Thing.ModelProperty");
						afterParserOrEnumRuleCall();
					}
				)
			)?
			(
				otherlv_9=','
				{
					newLeafNode(otherlv_9, grammarAccess.getModelChannelAccess().getCommaKeyword_4_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getModelChannelAccess().getPropertiesModelPropertyParserRuleCall_4_2_1_0());
						}
						lv_properties_10_0=ruleModelProperty
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModelChannelRule());
							}
							add(
								$current,
								"properties",
								lv_properties_10_0,
								"org.openhab.core.model.thing.Thing.ModelProperty");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_11=']'
			{
				newLeafNode(otherlv_11, grammarAccess.getModelChannelAccess().getRightSquareBracketKeyword_4_3());
			}
		)?
	)
;

// Entry rule entryRuleModelItemType
entryRuleModelItemType returns [String current=null]:
	{ newCompositeNode(grammarAccess.getModelItemTypeRule()); }
	iv_ruleModelItemType=ruleModelItemType
	{ $current=$iv_ruleModelItemType.current.getText(); }
	EOF;

// Rule ModelItemType
ruleModelItemType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getModelItemTypeAccess().getBaseModelItemTypeParserRuleCall_0());
		}
		this_BaseModelItemType_0=ruleBaseModelItemType
		{
			$current.merge(this_BaseModelItemType_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		(
			kw='Number:'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getModelItemTypeAccess().getNumberKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getModelItemTypeAccess().getIDTerminalRuleCall_1_1());
			}
		)
	)
;

// Entry rule entryRuleBaseModelItemType
entryRuleBaseModelItemType returns [String current=null]:
	{ newCompositeNode(grammarAccess.getBaseModelItemTypeRule()); }
	iv_ruleBaseModelItemType=ruleBaseModelItemType
	{ $current=$iv_ruleBaseModelItemType.current.getText(); }
	EOF;

// Rule BaseModelItemType
ruleBaseModelItemType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='Switch'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBaseModelItemTypeAccess().getSwitchKeyword_0());
		}
		    |
		kw='Rollershutter'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBaseModelItemTypeAccess().getRollershutterKeyword_1());
		}
		    |
		kw='Number'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBaseModelItemTypeAccess().getNumberKeyword_2());
		}
		    |
		kw='String'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBaseModelItemTypeAccess().getStringKeyword_3());
		}
		    |
		kw='Dimmer'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBaseModelItemTypeAccess().getDimmerKeyword_4());
		}
		    |
		kw='Contact'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBaseModelItemTypeAccess().getContactKeyword_5());
		}
		    |
		kw='DateTime'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBaseModelItemTypeAccess().getDateTimeKeyword_6());
		}
		    |
		kw='Color'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBaseModelItemTypeAccess().getColorKeyword_7());
		}
		    |
		kw='Player'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBaseModelItemTypeAccess().getPlayerKeyword_8());
		}
		    |
		kw='Location'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBaseModelItemTypeAccess().getLocationKeyword_9());
		}
		    |
		kw='Call'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBaseModelItemTypeAccess().getCallKeyword_10());
		}
		    |
		kw='Image'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBaseModelItemTypeAccess().getImageKeyword_11());
		}
	)
;

// Entry rule entryRuleModelProperty
entryRuleModelProperty returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelPropertyRule()); }
	iv_ruleModelProperty=ruleModelProperty
	{ $current=$iv_ruleModelProperty.current; }
	EOF;

// Rule ModelProperty
ruleModelProperty returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_key_0_0=RULE_ID
				{
					newLeafNode(lv_key_0_0, grammarAccess.getModelPropertyAccess().getKeyIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModelPropertyRule());
					}
					setWithLastConsumed(
						$current,
						"key",
						lv_key_0_0,
						"org.openhab.core.model.thing.Thing.ID");
				}
			)
		)
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getModelPropertyAccess().getEqualsSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getModelPropertyAccess().getValueValueTypeParserRuleCall_2_0());
				}
				lv_value_2_0=ruleValueType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelPropertyRule());
					}
					add(
						$current,
						"value",
						lv_value_2_0,
						"org.openhab.core.model.thing.Thing.ValueType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3=','
			{
				newLeafNode(otherlv_3, grammarAccess.getModelPropertyAccess().getCommaKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelPropertyAccess().getValueValueTypeParserRuleCall_3_1_0());
					}
					lv_value_4_0=ruleValueType
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelPropertyRule());
						}
						add(
							$current,
							"value",
							lv_value_4_0,
							"org.openhab.core.model.thing.Thing.ValueType");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleCHANNEL_ID
entryRuleCHANNEL_ID returns [String current=null]:
	{ newCompositeNode(grammarAccess.getCHANNEL_IDRule()); }
	iv_ruleCHANNEL_ID=ruleCHANNEL_ID
	{ $current=$iv_ruleCHANNEL_ID.current.getText(); }
	EOF;

// Rule CHANNEL_ID
ruleCHANNEL_ID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getCHANNEL_IDAccess().getUID_SEGMENTParserRuleCall_0());
		}
		this_UID_SEGMENT_0=ruleUID_SEGMENT
		{
			$current.merge(this_UID_SEGMENT_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		(
			kw='#'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getCHANNEL_IDAccess().getNumberSignKeyword_1_0());
			}
			{
				newCompositeNode(grammarAccess.getCHANNEL_IDAccess().getUID_SEGMENTParserRuleCall_1_1());
			}
			this_UID_SEGMENT_2=ruleUID_SEGMENT
			{
				$current.merge(this_UID_SEGMENT_2);
			}
			{
				afterParserOrEnumRuleCall();
			}
		)?
	)
;

// Entry rule entryRuleUID
entryRuleUID returns [String current=null]:
	{ newCompositeNode(grammarAccess.getUIDRule()); }
	iv_ruleUID=ruleUID
	{ $current=$iv_ruleUID.current.getText(); }
	EOF;

// Rule UID
ruleUID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getUIDAccess().getUID_SEGMENTParserRuleCall_0());
		}
		this_UID_SEGMENT_0=ruleUID_SEGMENT
		{
			$current.merge(this_UID_SEGMENT_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		kw=':'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getUIDAccess().getColonKeyword_1());
		}
		{
			newCompositeNode(grammarAccess.getUIDAccess().getUID_SEGMENTParserRuleCall_2());
		}
		this_UID_SEGMENT_2=ruleUID_SEGMENT
		{
			$current.merge(this_UID_SEGMENT_2);
		}
		{
			afterParserOrEnumRuleCall();
		}
		kw=':'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getUIDAccess().getColonKeyword_3());
		}
		{
			newCompositeNode(grammarAccess.getUIDAccess().getUID_SEGMENTParserRuleCall_4());
		}
		this_UID_SEGMENT_4=ruleUID_SEGMENT
		{
			$current.merge(this_UID_SEGMENT_4);
		}
		{
			afterParserOrEnumRuleCall();
		}
		(
			(
				(':')=>
				kw=':'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getUIDAccess().getColonKeyword_5_0());
				}
			)
			{
				newCompositeNode(grammarAccess.getUIDAccess().getUID_SEGMENTParserRuleCall_5_1());
			}
			this_UID_SEGMENT_6=ruleUID_SEGMENT
			{
				$current.merge(this_UID_SEGMENT_6);
			}
			{
				afterParserOrEnumRuleCall();
			}
		)*
	)
;

// Entry rule entryRuleUID_SEGMENT
entryRuleUID_SEGMENT returns [String current=null]:
	{ newCompositeNode(grammarAccess.getUID_SEGMENTRule()); }
	iv_ruleUID_SEGMENT=ruleUID_SEGMENT
	{ $current=$iv_ruleUID_SEGMENT.current.getText(); }
	EOF;

// Rule UID_SEGMENT
ruleUID_SEGMENT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_ID_0=RULE_ID
	{
		$current.merge(this_ID_0);
	}
	{
		newLeafNode(this_ID_0, grammarAccess.getUID_SEGMENTAccess().getIDTerminalRuleCall());
	}
;

// Entry rule entryRuleValueType
entryRuleValueType returns [String current=null]:
	{ newCompositeNode(grammarAccess.getValueTypeRule()); }
	iv_ruleValueType=ruleValueType
	{ $current=$iv_ruleValueType.current.getText(); }
	EOF;

// Rule ValueType
ruleValueType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getValueTypeAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		{
			newCompositeNode(grammarAccess.getValueTypeAccess().getNUMBERParserRuleCall_1());
		}
		this_NUMBER_1=ruleNUMBER
		{
			$current.merge(this_NUMBER_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getValueTypeAccess().getBOOLEANParserRuleCall_2());
		}
		this_BOOLEAN_2=ruleBOOLEAN
		{
			$current.merge(this_BOOLEAN_2);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleBOOLEAN
entryRuleBOOLEAN returns [String current=null]:
	{ newCompositeNode(grammarAccess.getBOOLEANRule()); }
	iv_ruleBOOLEAN=ruleBOOLEAN
	{ $current=$iv_ruleBOOLEAN.current.getText(); }
	EOF;

// Rule BOOLEAN
ruleBOOLEAN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='true'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBOOLEANAccess().getTrueKeyword_0());
		}
		    |
		kw='false'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBOOLEANAccess().getFalseKeyword_1());
		}
	)
;

// Entry rule entryRuleNUMBER
entryRuleNUMBER returns [String current=null]:
	{ newCompositeNode(grammarAccess.getNUMBERRule()); }
	iv_ruleNUMBER=ruleNUMBER
	{ $current=$iv_ruleNUMBER.current.getText(); }
	EOF;

// Rule NUMBER
ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getNUMBERAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getNUMBERAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getNUMBERAccess().getIDTerminalRuleCall_1_1());
			}
		)?
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_'|'-'|'0'..'9') ('a'..'z'|'A'..'Z'|'_'|'-'|'0'..'9')*;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
