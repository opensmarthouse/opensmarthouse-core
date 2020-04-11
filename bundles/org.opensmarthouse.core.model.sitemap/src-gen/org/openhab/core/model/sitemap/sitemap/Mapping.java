/**
 * generated by Xtext 2.19.0
 */
package org.openhab.core.model.sitemap.sitemap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openhab.core.model.sitemap.sitemap.Mapping#getCmd <em>Cmd</em>}</li>
 *   <li>{@link org.openhab.core.model.sitemap.sitemap.Mapping#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see org.openhab.core.model.sitemap.sitemap.SitemapPackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends EObject
{
  /**
   * Returns the value of the '<em><b>Cmd</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cmd</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cmd</em>' attribute.
   * @see #setCmd(String)
   * @see org.openhab.core.model.sitemap.sitemap.SitemapPackage#getMapping_Cmd()
   * @model
   * @generated
   */
  String getCmd();

  /**
   * Sets the value of the '{@link org.openhab.core.model.sitemap.sitemap.Mapping#getCmd <em>Cmd</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cmd</em>' attribute.
   * @see #getCmd()
   * @generated
   */
  void setCmd(String value);

  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute.
   * @see #setLabel(String)
   * @see org.openhab.core.model.sitemap.sitemap.SitemapPackage#getMapping_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link org.openhab.core.model.sitemap.sitemap.Mapping#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

} // Mapping
