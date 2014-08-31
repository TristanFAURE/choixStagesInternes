/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.coordipsy.prechoice.prechoice.impl;

import java.util.Collection;

import org.coordipsy.prechoice.prechoice.DocteurLocation;
import org.coordipsy.prechoice.prechoice.Dossier;
import org.coordipsy.prechoice.prechoice.ElementNomme;
import org.coordipsy.prechoice.prechoice.PrechoicePackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dossier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.coordipsy.prechoice.prechoice.impl.DossierImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.coordipsy.prechoice.prechoice.impl.DossierImpl#getLocations <em>Locations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DossierImpl extends ElementNommeImpl implements Dossier {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementNomme> elements;

	/**
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<DocteurLocation> locations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DossierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrechoicePackage.Literals.DOSSIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementNomme> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<ElementNomme>(ElementNomme.class, this, PrechoicePackage.DOSSIER__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocteurLocation> getLocations() {
		if (locations == null) {
			locations = new EObjectContainmentEList<DocteurLocation>(DocteurLocation.class, this, PrechoicePackage.DOSSIER__LOCATIONS);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PrechoicePackage.DOSSIER__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case PrechoicePackage.DOSSIER__LOCATIONS:
				return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PrechoicePackage.DOSSIER__ELEMENTS:
				return getElements();
			case PrechoicePackage.DOSSIER__LOCATIONS:
				return getLocations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PrechoicePackage.DOSSIER__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends ElementNomme>)newValue);
				return;
			case PrechoicePackage.DOSSIER__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends DocteurLocation>)newValue);
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
			case PrechoicePackage.DOSSIER__ELEMENTS:
				getElements().clear();
				return;
			case PrechoicePackage.DOSSIER__LOCATIONS:
				getLocations().clear();
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
			case PrechoicePackage.DOSSIER__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case PrechoicePackage.DOSSIER__LOCATIONS:
				return locations != null && !locations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DossierImpl
