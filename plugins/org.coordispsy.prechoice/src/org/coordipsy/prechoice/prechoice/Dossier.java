/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.coordipsy.prechoice.prechoice;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dossier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.coordipsy.prechoice.prechoice.Dossier#getElements <em>Elements</em>}</li>
 *   <li>{@link org.coordipsy.prechoice.prechoice.Dossier#getLocations <em>Locations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.coordipsy.prechoice.prechoice.PrechoicePackage#getDossier()
 * @model
 * @generated
 */
public interface Dossier extends ElementNomme {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.coordipsy.prechoice.prechoice.ElementNomme}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.coordipsy.prechoice.prechoice.PrechoicePackage#getDossier_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementNomme> getElements();

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' containment reference list.
	 * The list contents are of type {@link org.coordipsy.prechoice.prechoice.DocteurLocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' containment reference list.
	 * @see org.coordipsy.prechoice.prechoice.PrechoicePackage#getDossier_Locations()
	 * @model containment="true"
	 * @generated
	 */
	EList<DocteurLocation> getLocations();

} // Dossier
