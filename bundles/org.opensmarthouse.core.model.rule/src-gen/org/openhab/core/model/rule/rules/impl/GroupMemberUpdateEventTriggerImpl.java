/**
 * generated by Xtext 2.19.0
 */
package org.openhab.core.model.rule.rules.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhab.core.model.rule.rules.GroupMemberUpdateEventTrigger;
import org.openhab.core.model.rule.rules.RulesPackage;
import org.openhab.core.model.rule.rules.ValidState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group Member Update Event Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openhab.core.model.rule.rules.impl.GroupMemberUpdateEventTriggerImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.openhab.core.model.rule.rules.impl.GroupMemberUpdateEventTriggerImpl#getState <em>State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupMemberUpdateEventTriggerImpl extends EventTriggerImpl implements GroupMemberUpdateEventTrigger
{
  /**
   * The default value of the '{@link #getGroup() <em>Group</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroup()
   * @generated
   * @ordered
   */
  protected static final String GROUP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroup()
   * @generated
   * @ordered
   */
  protected String group = GROUP_EDEFAULT;

  /**
   * The cached value of the '{@link #getState() <em>State</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
  protected ValidState state;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GroupMemberUpdateEventTriggerImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RulesPackage.Literals.GROUP_MEMBER_UPDATE_EVENT_TRIGGER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGroup()
  {
    return group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGroup(String newGroup)
  {
    String oldGroup = group;
    group = newGroup;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.GROUP_MEMBER_UPDATE_EVENT_TRIGGER__GROUP, oldGroup, group));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValidState getState()
  {
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetState(ValidState newState, NotificationChain msgs)
  {
    ValidState oldState = state;
    state = newState;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RulesPackage.GROUP_MEMBER_UPDATE_EVENT_TRIGGER__STATE, oldState, newState);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setState(ValidState newState)
  {
    if (newState != state)
    {
      NotificationChain msgs = null;
      if (state != null)
        msgs = ((InternalEObject)state).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RulesPackage.GROUP_MEMBER_UPDATE_EVENT_TRIGGER__STATE, null, msgs);
      if (newState != null)
        msgs = ((InternalEObject)newState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RulesPackage.GROUP_MEMBER_UPDATE_EVENT_TRIGGER__STATE, null, msgs);
      msgs = basicSetState(newState, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.GROUP_MEMBER_UPDATE_EVENT_TRIGGER__STATE, newState, newState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RulesPackage.GROUP_MEMBER_UPDATE_EVENT_TRIGGER__STATE:
        return basicSetState(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RulesPackage.GROUP_MEMBER_UPDATE_EVENT_TRIGGER__GROUP:
        return getGroup();
      case RulesPackage.GROUP_MEMBER_UPDATE_EVENT_TRIGGER__STATE:
        return getState();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RulesPackage.GROUP_MEMBER_UPDATE_EVENT_TRIGGER__GROUP:
        setGroup((String)newValue);
        return;
      case RulesPackage.GROUP_MEMBER_UPDATE_EVENT_TRIGGER__STATE:
        setState((ValidState)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RulesPackage.GROUP_MEMBER_UPDATE_EVENT_TRIGGER__GROUP:
        setGroup(GROUP_EDEFAULT);
        return;
      case RulesPackage.GROUP_MEMBER_UPDATE_EVENT_TRIGGER__STATE:
        setState((ValidState)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RulesPackage.GROUP_MEMBER_UPDATE_EVENT_TRIGGER__GROUP:
        return GROUP_EDEFAULT == null ? group != null : !GROUP_EDEFAULT.equals(group);
      case RulesPackage.GROUP_MEMBER_UPDATE_EVENT_TRIGGER__STATE:
        return state != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (group: ");
    result.append(group);
    result.append(')');
    return result.toString();
  }

} //GroupMemberUpdateEventTriggerImpl
