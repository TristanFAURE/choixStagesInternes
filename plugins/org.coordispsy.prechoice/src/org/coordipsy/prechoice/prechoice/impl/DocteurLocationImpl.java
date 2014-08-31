/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.coordipsy.prechoice.prechoice.impl;

import org.coordipsy.prechoice.prechoice.DocteurLocation;
import org.coordipsy.prechoice.prechoice.PrechoicePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Docteur Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.coordipsy.prechoice.prechoice.impl.DocteurLocationImpl#getNomDuDocteur <em>Nom Du Docteur</em>}</li>
 *   <li>{@link org.coordipsy.prechoice.prechoice.impl.DocteurLocationImpl#getLocalisation <em>Localisation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocteurLocationImpl extends EObjectImpl implements DocteurLocation {
	/**
	 * The default value of the '{@link #getNomDuDocteur() <em>Nom Du Docteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomDuDocteur()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_DU_DOCTEUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomDuDocteur() <em>Nom Du Docteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomDuDocteur()
	 * @generated
	 * @ordered
	 */
	protected String nomDuDocteur = NOM_DU_DOCTEUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalisation() <em>Localisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalisation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCALISATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalisation() <em>Localisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalisation()
	 * @generated
	 * @ordered
	 */
	protected String localisation = LOCALISATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocteurLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrechoicePackage.Literals.DOCTEUR_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomDuDocteur() {
		return nomDuDocteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomDuDocteur(String newNomDuDocteur) {
		String oldNomDuDocteur = nomDuDocteur;
		nomDuDocteur = newNomDuDocteur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrechoicePackage.DOCTEUR_LOCATION__NOM_DU_DOCTEUR, oldNomDuDocteur, nomDuDocteur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocalisation() {
		return localisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalisation(String newLocalisation) {
		String oldLocalisation = localisation;
		localisation = newLocalisation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrechoicePackage.DOCTEUR_LOCATION__LOCALISATION, oldLocalisation, localisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PrechoicePackage.DOCTEUR_LOCATION__NOM_DU_DOCTEUR:
				return getNomDuDocteur();
			case PrechoicePackage.DOCTEUR_LOCATION__LOCALISATION:
				return getLocalisation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PrechoicePackage.DOCTEUR_LOCATION__NOM_DU_DOCTEUR:
				setNomDuDocteur((String)newValue);
				return;
			case PrechoicePackage.DOCTEUR_LOCATION__LOCALISATION:
				setLocalisation((String)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case PrechoicePackage.DOCTEUR_LOCATION__NOM_DU_DOCTEUR:
				setNomDuDocteur(NOM_DU_DOCTEUR_EDEFAULT);
				return;
			case PrechoicePackage.DOCTEUR_LOCATION__LOCALISATION:
				setLocalisation(LOCALISATION_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PrechoicePackage.DOCTEUR_LOCATION__NOM_DU_DOCTEUR:
				return NOM_DU_DOCTEUR_EDEFAULT == null ? nomDuDocteur != null : !NOM_DU_DOCTEUR_EDEFAULT.equals(nomDuDocteur);
			case PrechoicePackage.DOCTEUR_LOCATION__LOCALISATION:
				return LOCALISATION_EDEFAULT == null ? localisation != null : !LOCALISATION_EDEFAULT.equals(localisation);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nomDuDocteur: ");
		result.append(nomDuDocteur);
		result.append(", localisation: ");
		result.append(localisation);
		result.append(')');
		return result.toString();
	}

} //DocteurLocationImpl
