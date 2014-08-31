/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.coordipsy.prechoice.prechoice;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.coordipsy.prechoice.prechoice.PrechoiceFactory
 * @model kind="package"
 * @generated
 */
public interface PrechoicePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "prechoice";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://coordipsy/prechoice/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "prechoice";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PrechoicePackage eINSTANCE = org.coordipsy.prechoice.prechoice.impl.PrechoicePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.coordipsy.prechoice.prechoice.impl.ElementNommeImpl <em>Element Nomme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.coordipsy.prechoice.prechoice.impl.ElementNommeImpl
	 * @see org.coordipsy.prechoice.prechoice.impl.PrechoicePackageImpl#getElementNomme()
	 * @generated
	 */
	int ELEMENT_NOMME = 2;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NOMME__NOM = 0;

	/**
	 * The number of structural features of the '<em>Element Nomme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NOMME_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.coordipsy.prechoice.prechoice.impl.InterneImpl <em>Interne</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.coordipsy.prechoice.prechoice.impl.InterneImpl
	 * @see org.coordipsy.prechoice.prechoice.impl.PrechoicePackageImpl#getInterne()
	 * @generated
	 */
	int INTERNE = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNE__NOM = ELEMENT_NOMME__NOM;

	/**
	 * The feature id for the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNE__PRENOM = ELEMENT_NOMME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Promotion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNE__PROMOTION = ELEMENT_NOMME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Classement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNE__CLASSEMENT = ELEMENT_NOMME_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Choix</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNE__CHOIX = ELEMENT_NOMME_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Affectation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNE__AFFECTATION = ELEMENT_NOMME_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Annee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNE__ANNEE = ELEMENT_NOMME_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Etat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNE__ETAT = ELEMENT_NOMME_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Interne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNE_FEATURE_COUNT = ELEMENT_NOMME_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.coordipsy.prechoice.prechoice.impl.StageImpl <em>Stage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.coordipsy.prechoice.prechoice.impl.StageImpl
	 * @see org.coordipsy.prechoice.prechoice.impl.PrechoicePackageImpl#getStage()
	 * @generated
	 */
	int STAGE = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__NOM = ELEMENT_NOMME__NOM;

	/**
	 * The feature id for the '<em><b>Nombre De Postes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__NOMBRE_DE_POSTES = ELEMENT_NOMME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interne Affecte</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__INTERNE_AFFECTE = ELEMENT_NOMME_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_FEATURE_COUNT = ELEMENT_NOMME_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.coordipsy.prechoice.prechoice.impl.PreChoixImpl <em>Pre Choix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.coordipsy.prechoice.prechoice.impl.PreChoixImpl
	 * @see org.coordipsy.prechoice.prechoice.impl.PrechoicePackageImpl#getPreChoix()
	 * @generated
	 */
	int PRE_CHOIX = 3;

	/**
	 * The meta object id for the '{@link org.coordipsy.prechoice.prechoice.impl.DossierImpl <em>Dossier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.coordipsy.prechoice.prechoice.impl.DossierImpl
	 * @see org.coordipsy.prechoice.prechoice.impl.PrechoicePackageImpl#getDossier()
	 * @generated
	 */
	int DOSSIER = 4;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER__NOM = ELEMENT_NOMME__NOM;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER__ELEMENTS = ELEMENT_NOMME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER__LOCATIONS = ELEMENT_NOMME_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dossier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER_FEATURE_COUNT = ELEMENT_NOMME_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CHOIX__NOM = DOSSIER__NOM;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CHOIX__ELEMENTS = DOSSIER__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CHOIX__LOCATIONS = DOSSIER__LOCATIONS;

	/**
	 * The number of structural features of the '<em>Pre Choix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CHOIX_FEATURE_COUNT = DOSSIER_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.coordipsy.prechoice.prechoice.impl.DocteurLocationImpl <em>Docteur Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.coordipsy.prechoice.prechoice.impl.DocteurLocationImpl
	 * @see org.coordipsy.prechoice.prechoice.impl.PrechoicePackageImpl#getDocteurLocation()
	 * @generated
	 */
	int DOCTEUR_LOCATION = 5;

	/**
	 * The feature id for the '<em><b>Nom Du Docteur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTEUR_LOCATION__NOM_DU_DOCTEUR = 0;

	/**
	 * The feature id for the '<em><b>Localisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTEUR_LOCATION__LOCALISATION = 1;

	/**
	 * The number of structural features of the '<em>Docteur Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTEUR_LOCATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.coordipsy.prechoice.prechoice.TypeStage <em>Type Stage</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.coordipsy.prechoice.prechoice.TypeStage
	 * @see org.coordipsy.prechoice.prechoice.impl.PrechoicePackageImpl#getTypeStage()
	 * @generated
	 */
	int TYPE_STAGE = 6;

	/**
	 * The meta object id for the '{@link org.coordipsy.prechoice.prechoice.Localisation <em>Localisation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.coordipsy.prechoice.prechoice.Localisation
	 * @see org.coordipsy.prechoice.prechoice.impl.PrechoicePackageImpl#getLocalisation()
	 * @generated
	 */
	int LOCALISATION = 7;


	/**
	 * The meta object id for the '{@link org.coordipsy.prechoice.prechoice.ETAT_INTERNE <em>ETAT INTERNE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.coordipsy.prechoice.prechoice.ETAT_INTERNE
	 * @see org.coordipsy.prechoice.prechoice.impl.PrechoicePackageImpl#getETAT_INTERNE()
	 * @generated
	 */
	int ETAT_INTERNE = 8;


	/**
	 * Returns the meta object for class '{@link org.coordipsy.prechoice.prechoice.Interne <em>Interne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interne</em>'.
	 * @see org.coordipsy.prechoice.prechoice.Interne
	 * @generated
	 */
	EClass getInterne();

	/**
	 * Returns the meta object for the attribute '{@link org.coordipsy.prechoice.prechoice.Interne#getPrenom <em>Prenom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prenom</em>'.
	 * @see org.coordipsy.prechoice.prechoice.Interne#getPrenom()
	 * @see #getInterne()
	 * @generated
	 */
	EAttribute getInterne_Prenom();

	/**
	 * Returns the meta object for the attribute '{@link org.coordipsy.prechoice.prechoice.Interne#getPromotion <em>Promotion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Promotion</em>'.
	 * @see org.coordipsy.prechoice.prechoice.Interne#getPromotion()
	 * @see #getInterne()
	 * @generated
	 */
	EAttribute getInterne_Promotion();

	/**
	 * Returns the meta object for the attribute '{@link org.coordipsy.prechoice.prechoice.Interne#getClassement <em>Classement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classement</em>'.
	 * @see org.coordipsy.prechoice.prechoice.Interne#getClassement()
	 * @see #getInterne()
	 * @generated
	 */
	EAttribute getInterne_Classement();

	/**
	 * Returns the meta object for the reference list '{@link org.coordipsy.prechoice.prechoice.Interne#getChoix <em>Choix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Choix</em>'.
	 * @see org.coordipsy.prechoice.prechoice.Interne#getChoix()
	 * @see #getInterne()
	 * @generated
	 */
	EReference getInterne_Choix();

	/**
	 * Returns the meta object for the reference '{@link org.coordipsy.prechoice.prechoice.Interne#getAffectation <em>Affectation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Affectation</em>'.
	 * @see org.coordipsy.prechoice.prechoice.Interne#getAffectation()
	 * @see #getInterne()
	 * @generated
	 */
	EReference getInterne_Affectation();

	/**
	 * Returns the meta object for the attribute '{@link org.coordipsy.prechoice.prechoice.Interne#getAnnee <em>Annee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annee</em>'.
	 * @see org.coordipsy.prechoice.prechoice.Interne#getAnnee()
	 * @see #getInterne()
	 * @generated
	 */
	EAttribute getInterne_Annee();

	/**
	 * Returns the meta object for the attribute '{@link org.coordipsy.prechoice.prechoice.Interne#getEtat <em>Etat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etat</em>'.
	 * @see org.coordipsy.prechoice.prechoice.Interne#getEtat()
	 * @see #getInterne()
	 * @generated
	 */
	EAttribute getInterne_Etat();

	/**
	 * Returns the meta object for class '{@link org.coordipsy.prechoice.prechoice.Stage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stage</em>'.
	 * @see org.coordipsy.prechoice.prechoice.Stage
	 * @generated
	 */
	EClass getStage();

	/**
	 * Returns the meta object for the attribute '{@link org.coordipsy.prechoice.prechoice.Stage#getNombreDePostes <em>Nombre De Postes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre De Postes</em>'.
	 * @see org.coordipsy.prechoice.prechoice.Stage#getNombreDePostes()
	 * @see #getStage()
	 * @generated
	 */
	EAttribute getStage_NombreDePostes();

	/**
	 * Returns the meta object for the reference list '{@link org.coordipsy.prechoice.prechoice.Stage#getInterneAffecte <em>Interne Affecte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interne Affecte</em>'.
	 * @see org.coordipsy.prechoice.prechoice.Stage#getInterneAffecte()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_InterneAffecte();

	/**
	 * Returns the meta object for class '{@link org.coordipsy.prechoice.prechoice.ElementNomme <em>Element Nomme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Nomme</em>'.
	 * @see org.coordipsy.prechoice.prechoice.ElementNomme
	 * @generated
	 */
	EClass getElementNomme();

	/**
	 * Returns the meta object for the attribute '{@link org.coordipsy.prechoice.prechoice.ElementNomme#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see org.coordipsy.prechoice.prechoice.ElementNomme#getNom()
	 * @see #getElementNomme()
	 * @generated
	 */
	EAttribute getElementNomme_Nom();

	/**
	 * Returns the meta object for class '{@link org.coordipsy.prechoice.prechoice.PreChoix <em>Pre Choix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Choix</em>'.
	 * @see org.coordipsy.prechoice.prechoice.PreChoix
	 * @generated
	 */
	EClass getPreChoix();

	/**
	 * Returns the meta object for class '{@link org.coordipsy.prechoice.prechoice.Dossier <em>Dossier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dossier</em>'.
	 * @see org.coordipsy.prechoice.prechoice.Dossier
	 * @generated
	 */
	EClass getDossier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.coordipsy.prechoice.prechoice.Dossier#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.coordipsy.prechoice.prechoice.Dossier#getElements()
	 * @see #getDossier()
	 * @generated
	 */
	EReference getDossier_Elements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.coordipsy.prechoice.prechoice.Dossier#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locations</em>'.
	 * @see org.coordipsy.prechoice.prechoice.Dossier#getLocations()
	 * @see #getDossier()
	 * @generated
	 */
	EReference getDossier_Locations();

	/**
	 * Returns the meta object for class '{@link org.coordipsy.prechoice.prechoice.DocteurLocation <em>Docteur Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Docteur Location</em>'.
	 * @see org.coordipsy.prechoice.prechoice.DocteurLocation
	 * @generated
	 */
	EClass getDocteurLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.coordipsy.prechoice.prechoice.DocteurLocation#getNomDuDocteur <em>Nom Du Docteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom Du Docteur</em>'.
	 * @see org.coordipsy.prechoice.prechoice.DocteurLocation#getNomDuDocteur()
	 * @see #getDocteurLocation()
	 * @generated
	 */
	EAttribute getDocteurLocation_NomDuDocteur();

	/**
	 * Returns the meta object for the attribute '{@link org.coordipsy.prechoice.prechoice.DocteurLocation#getLocalisation <em>Localisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Localisation</em>'.
	 * @see org.coordipsy.prechoice.prechoice.DocteurLocation#getLocalisation()
	 * @see #getDocteurLocation()
	 * @generated
	 */
	EAttribute getDocteurLocation_Localisation();

	/**
	 * Returns the meta object for enum '{@link org.coordipsy.prechoice.prechoice.TypeStage <em>Type Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Stage</em>'.
	 * @see org.coordipsy.prechoice.prechoice.TypeStage
	 * @generated
	 */
	EEnum getTypeStage();

	/**
	 * Returns the meta object for enum '{@link org.coordipsy.prechoice.prechoice.Localisation <em>Localisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Localisation</em>'.
	 * @see org.coordipsy.prechoice.prechoice.Localisation
	 * @generated
	 */
	EEnum getLocalisation();

	/**
	 * Returns the meta object for enum '{@link org.coordipsy.prechoice.prechoice.ETAT_INTERNE <em>ETAT INTERNE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ETAT INTERNE</em>'.
	 * @see org.coordipsy.prechoice.prechoice.ETAT_INTERNE
	 * @generated
	 */
	EEnum getETAT_INTERNE();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PrechoiceFactory getPrechoiceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.coordipsy.prechoice.prechoice.impl.InterneImpl <em>Interne</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.coordipsy.prechoice.prechoice.impl.InterneImpl
		 * @see org.coordipsy.prechoice.prechoice.impl.PrechoicePackageImpl#getInterne()
		 * @generated
		 */
		EClass INTERNE = eINSTANCE.getInterne();

		/**
		 * The meta object literal for the '<em><b>Prenom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNE__PRENOM = eINSTANCE.getInterne_Prenom();

		/**
		 * The meta object literal for the '<em><b>Promotion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNE__PROMOTION = eINSTANCE.getInterne_Promotion();

		/**
		 * The meta object literal for the '<em><b>Classement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNE__CLASSEMENT = eINSTANCE.getInterne_Classement();

		/**
		 * The meta object literal for the '<em><b>Choix</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNE__CHOIX = eINSTANCE.getInterne_Choix();

		/**
		 * The meta object literal for the '<em><b>Affectation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNE__AFFECTATION = eINSTANCE.getInterne_Affectation();

		/**
		 * The meta object literal for the '<em><b>Annee</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNE__ANNEE = eINSTANCE.getInterne_Annee();

		/**
		 * The meta object literal for the '<em><b>Etat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNE__ETAT = eINSTANCE.getInterne_Etat();

		/**
		 * The meta object literal for the '{@link org.coordipsy.prechoice.prechoice.impl.StageImpl <em>Stage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.coordipsy.prechoice.prechoice.impl.StageImpl
		 * @see org.coordipsy.prechoice.prechoice.impl.PrechoicePackageImpl#getStage()
		 * @generated
		 */
		EClass STAGE = eINSTANCE.getStage();

		/**
		 * The meta object literal for the '<em><b>Nombre De Postes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAGE__NOMBRE_DE_POSTES = eINSTANCE.getStage_NombreDePostes();

		/**
		 * The meta object literal for the '<em><b>Interne Affecte</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__INTERNE_AFFECTE = eINSTANCE.getStage_InterneAffecte();

		/**
		 * The meta object literal for the '{@link org.coordipsy.prechoice.prechoice.impl.ElementNommeImpl <em>Element Nomme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.coordipsy.prechoice.prechoice.impl.ElementNommeImpl
		 * @see org.coordipsy.prechoice.prechoice.impl.PrechoicePackageImpl#getElementNomme()
		 * @generated
		 */
		EClass ELEMENT_NOMME = eINSTANCE.getElementNomme();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_NOMME__NOM = eINSTANCE.getElementNomme_Nom();

		/**
		 * The meta object literal for the '{@link org.coordipsy.prechoice.prechoice.impl.PreChoixImpl <em>Pre Choix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.coordipsy.prechoice.prechoice.impl.PreChoixImpl
		 * @see org.coordipsy.prechoice.prechoice.impl.PrechoicePackageImpl#getPreChoix()
		 * @generated
		 */
		EClass PRE_CHOIX = eINSTANCE.getPreChoix();

		/**
		 * The meta object literal for the '{@link org.coordipsy.prechoice.prechoice.impl.DossierImpl <em>Dossier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.coordipsy.prechoice.prechoice.impl.DossierImpl
		 * @see org.coordipsy.prechoice.prechoice.impl.PrechoicePackageImpl#getDossier()
		 * @generated
		 */
		EClass DOSSIER = eINSTANCE.getDossier();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSSIER__ELEMENTS = eINSTANCE.getDossier_Elements();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSSIER__LOCATIONS = eINSTANCE.getDossier_Locations();

		/**
		 * The meta object literal for the '{@link org.coordipsy.prechoice.prechoice.impl.DocteurLocationImpl <em>Docteur Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.coordipsy.prechoice.prechoice.impl.DocteurLocationImpl
		 * @see org.coordipsy.prechoice.prechoice.impl.PrechoicePackageImpl#getDocteurLocation()
		 * @generated
		 */
		EClass DOCTEUR_LOCATION = eINSTANCE.getDocteurLocation();

		/**
		 * The meta object literal for the '<em><b>Nom Du Docteur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCTEUR_LOCATION__NOM_DU_DOCTEUR = eINSTANCE.getDocteurLocation_NomDuDocteur();

		/**
		 * The meta object literal for the '<em><b>Localisation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCTEUR_LOCATION__LOCALISATION = eINSTANCE.getDocteurLocation_Localisation();

		/**
		 * The meta object literal for the '{@link org.coordipsy.prechoice.prechoice.TypeStage <em>Type Stage</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.coordipsy.prechoice.prechoice.TypeStage
		 * @see org.coordipsy.prechoice.prechoice.impl.PrechoicePackageImpl#getTypeStage()
		 * @generated
		 */
		EEnum TYPE_STAGE = eINSTANCE.getTypeStage();

		/**
		 * The meta object literal for the '{@link org.coordipsy.prechoice.prechoice.Localisation <em>Localisation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.coordipsy.prechoice.prechoice.Localisation
		 * @see org.coordipsy.prechoice.prechoice.impl.PrechoicePackageImpl#getLocalisation()
		 * @generated
		 */
		EEnum LOCALISATION = eINSTANCE.getLocalisation();

		/**
		 * The meta object literal for the '{@link org.coordipsy.prechoice.prechoice.ETAT_INTERNE <em>ETAT INTERNE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.coordipsy.prechoice.prechoice.ETAT_INTERNE
		 * @see org.coordipsy.prechoice.prechoice.impl.PrechoicePackageImpl#getETAT_INTERNE()
		 * @generated
		 */
		EEnum ETAT_INTERNE = eINSTANCE.getETAT_INTERNE();

	}

} //PrechoicePackage
