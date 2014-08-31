/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.coordipsy.prechoice.prechoice.util;

import org.coordipsy.prechoice.prechoice.*;
import org.coordipsy.prechoice.prechoice.Dossier;
import org.coordipsy.prechoice.prechoice.ElementNomme;
import org.coordipsy.prechoice.prechoice.Interne;
import org.coordipsy.prechoice.prechoice.PreChoix;
import org.coordipsy.prechoice.prechoice.PrechoicePackage;
import org.coordipsy.prechoice.prechoice.Stage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.coordipsy.prechoice.prechoice.PrechoicePackage
 * @generated
 */
public class PrechoiceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PrechoicePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrechoiceSwitch() {
		if (modelPackage == null) {
			modelPackage = PrechoicePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PrechoicePackage.INTERNE: {
				Interne interne = (Interne)theEObject;
				T result = caseInterne(interne);
				if (result == null) result = caseElementNomme(interne);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PrechoicePackage.STAGE: {
				Stage stage = (Stage)theEObject;
				T result = caseStage(stage);
				if (result == null) result = caseElementNomme(stage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PrechoicePackage.ELEMENT_NOMME: {
				ElementNomme elementNomme = (ElementNomme)theEObject;
				T result = caseElementNomme(elementNomme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PrechoicePackage.PRE_CHOIX: {
				PreChoix preChoix = (PreChoix)theEObject;
				T result = casePreChoix(preChoix);
				if (result == null) result = caseDossier(preChoix);
				if (result == null) result = caseElementNomme(preChoix);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PrechoicePackage.DOSSIER: {
				Dossier dossier = (Dossier)theEObject;
				T result = caseDossier(dossier);
				if (result == null) result = caseElementNomme(dossier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PrechoicePackage.DOCTEUR_LOCATION: {
				DocteurLocation docteurLocation = (DocteurLocation)theEObject;
				T result = caseDocteurLocation(docteurLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interne</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interne</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterne(Interne object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStage(Stage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Nomme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Nomme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementNomme(ElementNomme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pre Choix</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pre Choix</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreChoix(PreChoix object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dossier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dossier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDossier(Dossier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Docteur Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Docteur Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocteurLocation(DocteurLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PrechoiceSwitch
