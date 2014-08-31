/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.coordipsy.prechoice.prechoice;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.coordipsy.prechoice.prechoice.PrechoicePackage
 * @generated
 */
public interface PrechoiceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PrechoiceFactory eINSTANCE = org.coordipsy.prechoice.prechoice.impl.PrechoiceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Interne</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interne</em>'.
	 * @generated
	 */
	Interne createInterne();

	/**
	 * Returns a new object of class '<em>Stage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stage</em>'.
	 * @generated
	 */
	Stage createStage();

	/**
	 * Returns a new object of class '<em>Pre Choix</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pre Choix</em>'.
	 * @generated
	 */
	PreChoix createPreChoix();

	/**
	 * Returns a new object of class '<em>Dossier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dossier</em>'.
	 * @generated
	 */
	Dossier createDossier();

	/**
	 * Returns a new object of class '<em>Docteur Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Docteur Location</em>'.
	 * @generated
	 */
	DocteurLocation createDocteurLocation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PrechoicePackage getPrechoicePackage();

} //PrechoiceFactory
