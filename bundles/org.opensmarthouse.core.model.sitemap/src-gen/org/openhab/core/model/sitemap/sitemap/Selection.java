/**
 * generated by Xtext 2.19.0
 */
package org.openhab.core.model.sitemap.sitemap;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openhab.core.model.sitemap.sitemap.Selection#getMappings <em>Mappings</em>}</li>
 * </ul>
 *
 * @see org.openhab.core.model.sitemap.sitemap.SitemapPackage#getSelection()
 * @model
 * @generated
 */
public interface Selection extends NonLinkableWidget
{
  /**
   * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
   * The list contents are of type {@link org.openhab.core.model.sitemap.sitemap.Mapping}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mappings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mappings</em>' containment reference list.
   * @see org.openhab.core.model.sitemap.sitemap.SitemapPackage#getSelection_Mappings()
   * @model containment="true"
   * @generated
   */
  EList<Mapping> getMappings();

} // Selection
