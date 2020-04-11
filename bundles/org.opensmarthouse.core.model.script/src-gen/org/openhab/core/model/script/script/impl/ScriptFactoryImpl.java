/**
 * generated by Xtext 2.19.0
 */
package org.openhab.core.model.script.script.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openhab.core.model.script.script.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScriptFactoryImpl extends EFactoryImpl implements ScriptFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ScriptFactory init()
  {
    try
    {
      ScriptFactory theScriptFactory = (ScriptFactory)EPackage.Registry.INSTANCE.getEFactory(ScriptPackage.eNS_URI);
      if (theScriptFactory != null)
      {
        return theScriptFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ScriptFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScriptFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ScriptPackage.ABSTRACT_UNIT: return createAbstractUnit();
      case ScriptPackage.STRING_UNIT: return createStringUnit();
      case ScriptPackage.ID_UNIT: return createIDUnit();
      case ScriptPackage.SPECIFIC_UNIT: return createSpecificUnit();
      case ScriptPackage.SCRIPT: return createScript();
      case ScriptPackage.QUANTITY_LITERAL: return createQuantityLiteral();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractUnit createAbstractUnit()
  {
    AbstractUnitImpl abstractUnit = new AbstractUnitImpl();
    return abstractUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringUnit createStringUnit()
  {
    StringUnitImpl stringUnit = new StringUnitImpl();
    return stringUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IDUnit createIDUnit()
  {
    IDUnitImpl idUnit = new IDUnitImpl();
    return idUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpecificUnit createSpecificUnit()
  {
    SpecificUnitImpl specificUnit = new SpecificUnitImpl();
    return specificUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Script createScript()
  {
    ScriptImpl script = new ScriptImpl();
    return script;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuantityLiteral createQuantityLiteral()
  {
    QuantityLiteralImpl quantityLiteral = new QuantityLiteralImpl();
    return quantityLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScriptPackage getScriptPackage()
  {
    return (ScriptPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ScriptPackage getPackage()
  {
    return ScriptPackage.eINSTANCE;
  }

} //ScriptFactoryImpl
