/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.coordipsy.prechoice.prechoice.impl;

import java.util.Collection;

import org.coordipsy.prechoice.prechoice.ETAT_INTERNE;
import org.coordipsy.prechoice.prechoice.Interne;
import org.coordipsy.prechoice.prechoice.PrechoicePackage;
import org.coordipsy.prechoice.prechoice.Stage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interne</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.coordipsy.prechoice.prechoice.impl.InterneImpl#getPrenom <em>Prenom</em>}</li>
 *   <li>{@link org.coordipsy.prechoice.prechoice.impl.InterneImpl#getPromotion <em>Promotion</em>}</li>
 *   <li>{@link org.coordipsy.prechoice.prechoice.impl.InterneImpl#getClassement <em>Classement</em>}</li>
 *   <li>{@link org.coordipsy.prechoice.prechoice.impl.InterneImpl#getChoix <em>Choix</em>}</li>
 *   <li>{@link org.coordipsy.prechoice.prechoice.impl.InterneImpl#getAffectation <em>Affectation</em>}</li>
 *   <li>{@link org.coordipsy.prechoice.prechoice.impl.InterneImpl#getAnnee <em>Annee</em>}</li>
 *   <li>{@link org.coordipsy.prechoice.prechoice.impl.InterneImpl#getEtat <em>Etat</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterneImpl extends ElementNommeImpl implements Interne {
	/**
	 * The default value of the '{@link #getPrenom() <em>Prenom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrenom()
	 * @generated
	 * @ordered
	 */
	protected static final String PRENOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrenom() <em>Prenom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrenom()
	 * @generated
	 * @ordered
	 */
	protected String prenom = PRENOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getPromotion() <em>Promotion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPromotion()
	 * @generated
	 * @ordered
	 */
	protected static final int PROMOTION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPromotion() <em>Promotion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPromotion()
	 * @generated
	 * @ordered
	 */
	protected int promotion = PROMOTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassement() <em>Classement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassement()
	 * @generated
	 * @ordered
	 */
	protected static final int CLASSEMENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getClassement() <em>Classement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassement()
	 * @generated
	 * @ordered
	 */
	protected int classement = CLASSEMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChoix() <em>Choix</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoix()
	 * @generated
	 * @ordered
	 */
	protected EList<Stage> choix;

	/**
	 * The cached value of the '{@link #getAffectation() <em>Affectation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectation()
	 * @generated
	 * @ordered
	 */
	protected Stage affectation;

	/**
	 * The default value of the '{@link #getAnnee() <em>Annee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnee()
	 * @generated
	 * @ordered
	 */
	protected static final int ANNEE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAnnee() <em>Annee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnee()
	 * @generated
	 * @ordered
	 */
	protected int annee = ANNEE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEtat() <em>Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtat()
	 * @generated
	 * @ordered
	 */
	protected static final ETAT_INTERNE ETAT_EDEFAULT = ETAT_INTERNE.NORMAL;

	/**
	 * The cached value of the '{@link #getEtat() <em>Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtat()
	 * @generated
	 * @ordered
	 */
	protected ETAT_INTERNE etat = ETAT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrechoicePackage.Literals.INTERNE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrenom(String newPrenom) {
		String oldPrenom = prenom;
		prenom = newPrenom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrechoicePackage.INTERNE__PRENOM, oldPrenom, prenom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPromotion() {
		return promotion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPromotion(int newPromotion) {
		int oldPromotion = promotion;
		promotion = newPromotion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrechoicePackage.INTERNE__PROMOTION, oldPromotion, promotion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getClassement() {
		return classement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassement(int newClassement) {
		int oldClassement = classement;
		classement = newClassement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrechoicePackage.INTERNE__CLASSEMENT, oldClassement, classement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stage> getChoix() {
		if (choix == null) {
			choix = new EObjectResolvingEList<Stage>(Stage.class, this, PrechoicePackage.INTERNE__CHOIX);
		}
		return choix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stage getAffectation() {
		if (affectation != null && affectation.eIsProxy()) {
			InternalEObject oldAffectation = (InternalEObject)affectation;
			affectation = (Stage)eResolveProxy(oldAffectation);
			if (affectation != oldAffectation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PrechoicePackage.INTERNE__AFFECTATION, oldAffectation, affectation));
			}
		}
		return affectation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stage basicGetAffectation() {
		return affectation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAffectation(Stage newAffectation, NotificationChain msgs) {
		Stage oldAffectation = affectation;
		affectation = newAffectation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PrechoicePackage.INTERNE__AFFECTATION, oldAffectation, newAffectation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAffectation(Stage newAffectation) {
		if (newAffectation != affectation) {
			NotificationChain msgs = null;
			if (affectation != null)
				msgs = ((InternalEObject)affectation).eInverseRemove(this, PrechoicePackage.STAGE__INTERNE_AFFECTE, Stage.class, msgs);
			if (newAffectation != null)
				msgs = ((InternalEObject)newAffectation).eInverseAdd(this, PrechoicePackage.STAGE__INTERNE_AFFECTE, Stage.class, msgs);
			msgs = basicSetAffectation(newAffectation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrechoicePackage.INTERNE__AFFECTATION, newAffectation, newAffectation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAnnee() {
		return annee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnee(int newAnnee) {
		int oldAnnee = annee;
		annee = newAnnee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrechoicePackage.INTERNE__ANNEE, oldAnnee, annee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETAT_INTERNE getEtat() {
		return etat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtat(ETAT_INTERNE newEtat) {
		ETAT_INTERNE oldEtat = etat;
		etat = newEtat == null ? ETAT_EDEFAULT : newEtat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrechoicePackage.INTERNE__ETAT, oldEtat, etat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PrechoicePackage.INTERNE__AFFECTATION:
				if (affectation != null)
					msgs = ((InternalEObject)affectation).eInverseRemove(this, PrechoicePackage.STAGE__INTERNE_AFFECTE, Stage.class, msgs);
				return basicSetAffectation((Stage)otherEnd, msgs);
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
			case PrechoicePackage.INTERNE__AFFECTATION:
				return basicSetAffectation(null, msgs);
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
			case PrechoicePackage.INTERNE__PRENOM:
				return getPrenom();
			case PrechoicePackage.INTERNE__PROMOTION:
				return getPromotion();
			case PrechoicePackage.INTERNE__CLASSEMENT:
				return getClassement();
			case PrechoicePackage.INTERNE__CHOIX:
				return getChoix();
			case PrechoicePackage.INTERNE__AFFECTATION:
				if (resolve) return getAffectation();
				return basicGetAffectation();
			case PrechoicePackage.INTERNE__ANNEE:
				return getAnnee();
			case PrechoicePackage.INTERNE__ETAT:
				return getEtat();
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
			case PrechoicePackage.INTERNE__PRENOM:
				setPrenom((String)newValue);
				return;
			case PrechoicePackage.INTERNE__PROMOTION:
				setPromotion((Integer)newValue);
				return;
			case PrechoicePackage.INTERNE__CLASSEMENT:
				setClassement((Integer)newValue);
				return;
			case PrechoicePackage.INTERNE__CHOIX:
				getChoix().clear();
				getChoix().addAll((Collection<? extends Stage>)newValue);
				return;
			case PrechoicePackage.INTERNE__AFFECTATION:
				setAffectation((Stage)newValue);
				return;
			case PrechoicePackage.INTERNE__ANNEE:
				setAnnee((Integer)newValue);
				return;
			case PrechoicePackage.INTERNE__ETAT:
				setEtat((ETAT_INTERNE)newValue);
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
			case PrechoicePackage.INTERNE__PRENOM:
				setPrenom(PRENOM_EDEFAULT);
				return;
			case PrechoicePackage.INTERNE__PROMOTION:
				setPromotion(PROMOTION_EDEFAULT);
				return;
			case PrechoicePackage.INTERNE__CLASSEMENT:
				setClassement(CLASSEMENT_EDEFAULT);
				return;
			case PrechoicePackage.INTERNE__CHOIX:
				getChoix().clear();
				return;
			case PrechoicePackage.INTERNE__AFFECTATION:
				setAffectation((Stage)null);
				return;
			case PrechoicePackage.INTERNE__ANNEE:
				setAnnee(ANNEE_EDEFAULT);
				return;
			case PrechoicePackage.INTERNE__ETAT:
				setEtat(ETAT_EDEFAULT);
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
			case PrechoicePackage.INTERNE__PRENOM:
				return PRENOM_EDEFAULT == null ? prenom != null : !PRENOM_EDEFAULT.equals(prenom);
			case PrechoicePackage.INTERNE__PROMOTION:
				return promotion != PROMOTION_EDEFAULT;
			case PrechoicePackage.INTERNE__CLASSEMENT:
				return classement != CLASSEMENT_EDEFAULT;
			case PrechoicePackage.INTERNE__CHOIX:
				return choix != null && !choix.isEmpty();
			case PrechoicePackage.INTERNE__AFFECTATION:
				return affectation != null;
			case PrechoicePackage.INTERNE__ANNEE:
				return annee != ANNEE_EDEFAULT;
			case PrechoicePackage.INTERNE__ETAT:
				return etat != ETAT_EDEFAULT;
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
		result.append(" (prenom: ");
		result.append(prenom);
		result.append(", promotion: ");
		result.append(promotion);
		result.append(", classement: ");
		result.append(classement);
		result.append(", annee: ");
		result.append(annee);
		result.append(", etat: ");
		result.append(etat);
		result.append(')');
		return result.toString();
	}

} //InterneImpl
