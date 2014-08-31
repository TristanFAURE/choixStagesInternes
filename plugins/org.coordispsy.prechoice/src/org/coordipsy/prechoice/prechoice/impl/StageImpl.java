/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.coordipsy.prechoice.prechoice.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.coordipsy.prechoice.prechoice.DocteurLocation;
import org.coordipsy.prechoice.prechoice.Dossier;
import org.coordipsy.prechoice.prechoice.Interne;
import org.coordipsy.prechoice.prechoice.PrechoicePackage;
import org.coordipsy.prechoice.prechoice.Stage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.coordipsy.prechoice.prechoice.impl.StageImpl#getNombreDePostes <em>Nombre De Postes</em>}</li>
 *   <li>{@link org.coordipsy.prechoice.prechoice.impl.StageImpl#getInterneAffecte <em>Interne Affecte</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StageImpl extends ElementNommeImpl implements Stage {
	/**
	 * The default value of the '{@link #getNombreDePostes() <em>Nombre De Postes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreDePostes()
	 * @generated
	 * @ordered
	 */
	protected static final int NOMBRE_DE_POSTES_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getNombreDePostes() <em>Nombre De Postes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreDePostes()
	 * @generated
	 * @ordered
	 */
	protected int nombreDePostes = NOMBRE_DE_POSTES_EDEFAULT;
	/**
	 * The cached value of the '{@link #getInterneAffecte() <em>Interne Affecte</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterneAffecte()
	 * @generated
	 * @ordered
	 */
	protected EList<Interne> interneAffecte;

	protected static Pattern PATTERN_FOR_OP = Pattern.compile("(\\d.*)\\s*-(.*)\\s*-\\s*(.*)\\s*");
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrechoicePackage.Literals.STAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNombreDePostes() {
		return nombreDePostes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreDePostes(int newNombreDePostes) {
		int oldNombreDePostes = nombreDePostes;
		nombreDePostes = newNombreDePostes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrechoicePackage.STAGE__NOMBRE_DE_POSTES, oldNombreDePostes, nombreDePostes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interne> getInterneAffecte() {
		if (interneAffecte == null) {
			interneAffecte = new EObjectWithInverseResolvingEList<Interne>(Interne.class, this, PrechoicePackage.STAGE__INTERNE_AFFECTE, PrechoicePackage.INTERNE__AFFECTATION);
		}
		return interneAffecte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public int getNumber() {
		Matcher matcher = PATTERN_FOR_OP.matcher(getNom());
		if (matcher.matches()){
			return Integer.valueOf(matcher.group(1).trim());
		}
		return -1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String getLabel() {
		Matcher matcher = PATTERN_FOR_OP.matcher(getNom());
		if (matcher.matches()){
			return matcher.group(2);
		}
		return "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String getLocation() {
		List<DocteurLocation> locations = new ArrayList<DocteurLocation>();
		EObject parent = eContainer() ;
		while (parent != null){
			if (parent instanceof Dossier) {
				Dossier dossier = (Dossier) parent;
				if (dossier.getLocations() != null){
					locations.addAll(dossier.getLocations());
				}
			}
			parent = parent.eContainer();
		}
		if (!locations.isEmpty()){
			for (DocteurLocation d : locations){
				if (d.getNomDuDocteur().equals(getDocteur())){
					return d.getLocalisation();
				}
			}
		}
		return "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String getDocteur() {
		Matcher matcher = PATTERN_FOR_OP.matcher(getNom());
		if (matcher.matches()){
			return matcher.group(3);
		}
		return "";
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PrechoicePackage.STAGE__INTERNE_AFFECTE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInterneAffecte()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PrechoicePackage.STAGE__INTERNE_AFFECTE:
				return ((InternalEList<?>)getInterneAffecte()).basicRemove(otherEnd, msgs);
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
			case PrechoicePackage.STAGE__NOMBRE_DE_POSTES:
				return getNombreDePostes();
			case PrechoicePackage.STAGE__INTERNE_AFFECTE:
				return getInterneAffecte();
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
			case PrechoicePackage.STAGE__NOMBRE_DE_POSTES:
				setNombreDePostes((Integer)newValue);
				return;
			case PrechoicePackage.STAGE__INTERNE_AFFECTE:
				getInterneAffecte().clear();
				getInterneAffecte().addAll((Collection<? extends Interne>)newValue);
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
			case PrechoicePackage.STAGE__NOMBRE_DE_POSTES:
				setNombreDePostes(NOMBRE_DE_POSTES_EDEFAULT);
				return;
			case PrechoicePackage.STAGE__INTERNE_AFFECTE:
				getInterneAffecte().clear();
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
			case PrechoicePackage.STAGE__NOMBRE_DE_POSTES:
				return nombreDePostes != NOMBRE_DE_POSTES_EDEFAULT;
			case PrechoicePackage.STAGE__INTERNE_AFFECTE:
				return interneAffecte != null && !interneAffecte.isEmpty();
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
		result.append(" (nombreDePostes: ");
		result.append(nombreDePostes);
		result.append(')');
		return result.toString();
	}

} //StageImpl
