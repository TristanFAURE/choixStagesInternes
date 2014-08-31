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
 * A representation of the model object '<em><b>Interne</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.coordipsy.prechoice.prechoice.Interne#getPrenom <em>Prenom</em>}</li>
 *   <li>{@link org.coordipsy.prechoice.prechoice.Interne#getPromotion <em>Promotion</em>}</li>
 *   <li>{@link org.coordipsy.prechoice.prechoice.Interne#getClassement <em>Classement</em>}</li>
 *   <li>{@link org.coordipsy.prechoice.prechoice.Interne#getChoix <em>Choix</em>}</li>
 *   <li>{@link org.coordipsy.prechoice.prechoice.Interne#getAffectation <em>Affectation</em>}</li>
 *   <li>{@link org.coordipsy.prechoice.prechoice.Interne#getAnnee <em>Annee</em>}</li>
 *   <li>{@link org.coordipsy.prechoice.prechoice.Interne#getEtat <em>Etat</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.coordipsy.prechoice.prechoice.PrechoicePackage#getInterne()
 * @model
 * @generated
 */
public interface Interne extends ElementNomme {
	/**
	 * Returns the value of the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prenom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prenom</em>' attribute.
	 * @see #setPrenom(String)
	 * @see org.coordipsy.prechoice.prechoice.PrechoicePackage#getInterne_Prenom()
	 * @model
	 * @generated
	 */
	String getPrenom();

	/**
	 * Sets the value of the '{@link org.coordipsy.prechoice.prechoice.Interne#getPrenom <em>Prenom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prenom</em>' attribute.
	 * @see #getPrenom()
	 * @generated
	 */
	void setPrenom(String value);

	/**
	 * Returns the value of the '<em><b>Promotion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Promotion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Promotion</em>' attribute.
	 * @see #setPromotion(int)
	 * @see org.coordipsy.prechoice.prechoice.PrechoicePackage#getInterne_Promotion()
	 * @model
	 * @generated
	 */
	int getPromotion();

	/**
	 * Sets the value of the '{@link org.coordipsy.prechoice.prechoice.Interne#getPromotion <em>Promotion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Promotion</em>' attribute.
	 * @see #getPromotion()
	 * @generated
	 */
	void setPromotion(int value);

	/**
	 * Returns the value of the '<em><b>Classement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classement</em>' attribute.
	 * @see #setClassement(int)
	 * @see org.coordipsy.prechoice.prechoice.PrechoicePackage#getInterne_Classement()
	 * @model
	 * @generated
	 */
	int getClassement();

	/**
	 * Sets the value of the '{@link org.coordipsy.prechoice.prechoice.Interne#getClassement <em>Classement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classement</em>' attribute.
	 * @see #getClassement()
	 * @generated
	 */
	void setClassement(int value);

	/**
	 * Returns the value of the '<em><b>Choix</b></em>' reference list.
	 * The list contents are of type {@link org.coordipsy.prechoice.prechoice.Stage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choix</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choix</em>' reference list.
	 * @see org.coordipsy.prechoice.prechoice.PrechoicePackage#getInterne_Choix()
	 * @model
	 * @generated
	 */
	EList<Stage> getChoix();

	/**
	 * Returns the value of the '<em><b>Affectation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.coordipsy.prechoice.prechoice.Stage#getInterneAffecte <em>Interne Affecte</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Affectation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affectation</em>' reference.
	 * @see #setAffectation(Stage)
	 * @see org.coordipsy.prechoice.prechoice.PrechoicePackage#getInterne_Affectation()
	 * @see org.coordipsy.prechoice.prechoice.Stage#getInterneAffecte
	 * @model opposite="interneAffecte"
	 * @generated
	 */
	Stage getAffectation();

	/**
	 * Sets the value of the '{@link org.coordipsy.prechoice.prechoice.Interne#getAffectation <em>Affectation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affectation</em>' reference.
	 * @see #getAffectation()
	 * @generated
	 */
	void setAffectation(Stage value);

	/**
	 * Returns the value of the '<em><b>Annee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annee</em>' attribute.
	 * @see #setAnnee(int)
	 * @see org.coordipsy.prechoice.prechoice.PrechoicePackage#getInterne_Annee()
	 * @model
	 * @generated
	 */
	int getAnnee();

	/**
	 * Sets the value of the '{@link org.coordipsy.prechoice.prechoice.Interne#getAnnee <em>Annee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annee</em>' attribute.
	 * @see #getAnnee()
	 * @generated
	 */
	void setAnnee(int value);

	/**
	 * Returns the value of the '<em><b>Etat</b></em>' attribute.
	 * The literals are from the enumeration {@link org.coordipsy.prechoice.prechoice.ETAT_INTERNE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat</em>' attribute.
	 * @see org.coordipsy.prechoice.prechoice.ETAT_INTERNE
	 * @see #setEtat(ETAT_INTERNE)
	 * @see org.coordipsy.prechoice.prechoice.PrechoicePackage#getInterne_Etat()
	 * @model
	 * @generated
	 */
	ETAT_INTERNE getEtat();

	/**
	 * Sets the value of the '{@link org.coordipsy.prechoice.prechoice.Interne#getEtat <em>Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat</em>' attribute.
	 * @see org.coordipsy.prechoice.prechoice.ETAT_INTERNE
	 * @see #getEtat()
	 * @generated
	 */
	void setEtat(ETAT_INTERNE value);

} // Interne
