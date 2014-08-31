/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.coordipsy.prechoice.prechoice;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Docteur Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.coordipsy.prechoice.prechoice.DocteurLocation#getNomDuDocteur <em>Nom Du Docteur</em>}</li>
 *   <li>{@link org.coordipsy.prechoice.prechoice.DocteurLocation#getLocalisation <em>Localisation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.coordipsy.prechoice.prechoice.PrechoicePackage#getDocteurLocation()
 * @model
 * @generated
 */
public interface DocteurLocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom Du Docteur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Du Docteur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Du Docteur</em>' attribute.
	 * @see #setNomDuDocteur(String)
	 * @see org.coordipsy.prechoice.prechoice.PrechoicePackage#getDocteurLocation_NomDuDocteur()
	 * @model
	 * @generated
	 */
	String getNomDuDocteur();

	/**
	 * Sets the value of the '{@link org.coordipsy.prechoice.prechoice.DocteurLocation#getNomDuDocteur <em>Nom Du Docteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Du Docteur</em>' attribute.
	 * @see #getNomDuDocteur()
	 * @generated
	 */
	void setNomDuDocteur(String value);

	/**
	 * Returns the value of the '<em><b>Localisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Localisation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Localisation</em>' attribute.
	 * @see #setLocalisation(String)
	 * @see org.coordipsy.prechoice.prechoice.PrechoicePackage#getDocteurLocation_Localisation()
	 * @model
	 * @generated
	 */
	String getLocalisation();

	/**
	 * Sets the value of the '{@link org.coordipsy.prechoice.prechoice.DocteurLocation#getLocalisation <em>Localisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Localisation</em>' attribute.
	 * @see #getLocalisation()
	 * @generated
	 */
	void setLocalisation(String value);

} // DocteurLocation
