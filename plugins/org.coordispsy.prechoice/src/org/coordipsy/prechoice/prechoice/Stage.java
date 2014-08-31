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
 * A representation of the model object '<em><b>Stage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.coordipsy.prechoice.prechoice.Stage#getNombreDePostes <em>Nombre De Postes</em>}</li>
 *   <li>{@link org.coordipsy.prechoice.prechoice.Stage#getInterneAffecte <em>Interne Affecte</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.coordipsy.prechoice.prechoice.PrechoicePackage#getStage()
 * @model
 * @generated
 */
public interface Stage extends ElementNomme {

	/**
	 * Returns the value of the '<em><b>Nombre De Postes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre De Postes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre De Postes</em>' attribute.
	 * @see #setNombreDePostes(int)
	 * @see org.coordipsy.prechoice.prechoice.PrechoicePackage#getStage_NombreDePostes()
	 * @model
	 * @generated
	 */
	int getNombreDePostes();

	/**
	 * Sets the value of the '{@link org.coordipsy.prechoice.prechoice.Stage#getNombreDePostes <em>Nombre De Postes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre De Postes</em>' attribute.
	 * @see #getNombreDePostes()
	 * @generated
	 */
	void setNombreDePostes(int value);

	/**
	 * Returns the value of the '<em><b>Interne Affecte</b></em>' reference list.
	 * The list contents are of type {@link org.coordipsy.prechoice.prechoice.Interne}.
	 * It is bidirectional and its opposite is '{@link org.coordipsy.prechoice.prechoice.Interne#getAffectation <em>Affectation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interne Affecte</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interne Affecte</em>' reference list.
	 * @see org.coordipsy.prechoice.prechoice.PrechoicePackage#getStage_InterneAffecte()
	 * @see org.coordipsy.prechoice.prechoice.Interne#getAffectation
	 * @model opposite="affectation"
	 * @generated
	 */
	EList<Interne> getInterneAffecte();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	int getNumber();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getLabel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getLocation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getDocteur();
} // Stage
