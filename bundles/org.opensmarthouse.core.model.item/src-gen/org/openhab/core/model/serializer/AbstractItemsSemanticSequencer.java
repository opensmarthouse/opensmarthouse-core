/*
 * generated by Xtext 2.19.0
 */
package org.openhab.core.model.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.openhab.core.model.items.ItemModel;
import org.openhab.core.model.items.ItemsPackage;
import org.openhab.core.model.items.ModelBinding;
import org.openhab.core.model.items.ModelGroupItem;
import org.openhab.core.model.items.ModelNormalItem;
import org.openhab.core.model.items.ModelProperty;
import org.openhab.core.model.services.ItemsGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractItemsSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ItemsGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ItemsPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ItemsPackage.ITEM_MODEL:
				sequence_ItemModel(context, (ItemModel) semanticObject); 
				return; 
			case ItemsPackage.MODEL_BINDING:
				sequence_ModelBinding(context, (ModelBinding) semanticObject); 
				return; 
			case ItemsPackage.MODEL_GROUP_ITEM:
				if (rule == grammarAccess.getModelGroupItemRule()) {
					sequence_ModelGroupItem(context, (ModelGroupItem) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getModelItemRule()) {
					sequence_ModelGroupItem_ModelItem(context, (ModelGroupItem) semanticObject); 
					return; 
				}
				else break;
			case ItemsPackage.MODEL_NORMAL_ITEM:
				if (rule == grammarAccess.getModelItemRule()) {
					sequence_ModelItem_ModelNormalItem(context, (ModelNormalItem) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getModelNormalItemRule()) {
					sequence_ModelNormalItem(context, (ModelNormalItem) semanticObject); 
					return; 
				}
				else break;
			case ItemsPackage.MODEL_PROPERTY:
				sequence_ModelProperty(context, (ModelProperty) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ItemModel returns ItemModel
	 *
	 * Constraint:
	 *     items+=ModelItem*
	 */
	protected void sequence_ItemModel(ISerializationContext context, ItemModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ModelBinding returns ModelBinding
	 *
	 * Constraint:
	 *     (type=ID configuration=STRING properties+=ModelProperty? properties+=ModelProperty*)
	 */
	protected void sequence_ModelBinding(ISerializationContext context, ModelBinding semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ModelGroupItem returns ModelGroupItem
	 *
	 * Constraint:
	 *     (
	 *         (type=ModelItemType function=ModelGroupFunction?) | 
	 *         (type=ModelItemType function=ModelGroupFunction? (args+=ID | args+=STRING) args+=ID? (args+=STRING? args+=ID?)*)
	 *     )?
	 */
	protected void sequence_ModelGroupItem(ISerializationContext context, ModelGroupItem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ModelItem returns ModelGroupItem
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             (type=ModelItemType function=ModelGroupFunction?) | 
	 *             (type=ModelItemType function=ModelGroupFunction? (args+=ID | args+=STRING) args+=ID? (args+=STRING? args+=ID?)*)
	 *         )? 
	 *         name=ID 
	 *         label=STRING? 
	 *         (icon=ID | icon=STRING)? 
	 *         (groups+=ID groups+=ID*)? 
	 *         ((tags+=ID | tags+=STRING) tags+=ID? (tags+=STRING? tags+=ID?)*)? 
	 *         (bindings+=ModelBinding bindings+=ModelBinding*)?
	 *     )
	 */
	protected void sequence_ModelGroupItem_ModelItem(ISerializationContext context, ModelGroupItem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ModelItem returns ModelNormalItem
	 *
	 * Constraint:
	 *     (
	 *         type=ModelItemType 
	 *         name=ID 
	 *         label=STRING? 
	 *         (icon=ID | icon=STRING)? 
	 *         (groups+=ID groups+=ID*)? 
	 *         ((tags+=ID | tags+=STRING) tags+=ID? (tags+=STRING? tags+=ID?)*)? 
	 *         (bindings+=ModelBinding bindings+=ModelBinding*)?
	 *     )
	 */
	protected void sequence_ModelItem_ModelNormalItem(ISerializationContext context, ModelNormalItem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ModelNormalItem returns ModelNormalItem
	 *
	 * Constraint:
	 *     type=ModelItemType
	 */
	protected void sequence_ModelNormalItem(ISerializationContext context, ModelNormalItem semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ItemsPackage.Literals.MODEL_ITEM__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ItemsPackage.Literals.MODEL_ITEM__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getModelNormalItemAccess().getTypeModelItemTypeParserRuleCall_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ModelProperty returns ModelProperty
	 *
	 * Constraint:
	 *     (key=ID value=ValueType)
	 */
	protected void sequence_ModelProperty(ISerializationContext context, ModelProperty semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ItemsPackage.Literals.MODEL_PROPERTY__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ItemsPackage.Literals.MODEL_PROPERTY__KEY));
			if (transientValues.isValueTransient(semanticObject, ItemsPackage.Literals.MODEL_PROPERTY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ItemsPackage.Literals.MODEL_PROPERTY__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getModelPropertyAccess().getKeyIDTerminalRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getModelPropertyAccess().getValueValueTypeParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
}
