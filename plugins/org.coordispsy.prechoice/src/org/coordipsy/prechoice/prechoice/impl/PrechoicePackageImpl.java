/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.coordipsy.prechoice.prechoice.impl;

import org.coordipsy.prechoice.prechoice.DocteurLocation;
import org.coordipsy.prechoice.prechoice.Dossier;
import org.coordipsy.prechoice.prechoice.ElementNomme;
import org.coordipsy.prechoice.prechoice.Interne;
import org.coordipsy.prechoice.prechoice.Localisation;
import org.coordipsy.prechoice.prechoice.PreChoix;
import org.coordipsy.prechoice.prechoice.PrechoiceFactory;
import org.coordipsy.prechoice.prechoice.PrechoicePackage;
import org.coordipsy.prechoice.prechoice.Stage;
import org.coordipsy.prechoice.prechoice.TypeStage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrechoicePackageImpl extends EPackageImpl implements PrechoicePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementNommeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preChoixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dossierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass docteurLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeStageEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum localisationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum etaT_INTERNEEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.coordipsy.prechoice.prechoice.PrechoicePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PrechoicePackageImpl() {
		super(eNS_URI, PrechoiceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PrechoicePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PrechoicePackage init() {
		if (isInited) return (PrechoicePackage)EPackage.Registry.INSTANCE.getEPackage(PrechoicePackage.eNS_URI);

		// Obtain or create and register package
		PrechoicePackageImpl thePrechoicePackage = (PrechoicePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PrechoicePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PrechoicePackageImpl());

		isInited = true;

		// Create package meta-data objects
		thePrechoicePackage.createPackageContents();

		// Initialize created meta-data
		thePrechoicePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePrechoicePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PrechoicePackage.eNS_URI, thePrechoicePackage);
		return thePrechoicePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterne() {
		return interneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterne_Prenom() {
		return (EAttribute)interneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterne_Promotion() {
		return (EAttribute)interneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterne_Classement() {
		return (EAttribute)interneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterne_Choix() {
		return (EReference)interneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterne_Affectation() {
		return (EReference)interneEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterne_Annee() {
		return (EAttribute)interneEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterne_Etat() {
		return (EAttribute)interneEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStage() {
		return stageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStage_NombreDePostes() {
		return (EAttribute)stageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStage_InterneAffecte() {
		return (EReference)stageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementNomme() {
		return elementNommeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementNomme_Nom() {
		return (EAttribute)elementNommeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreChoix() {
		return preChoixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDossier() {
		return dossierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDossier_Elements() {
		return (EReference)dossierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDossier_Locations() {
		return (EReference)dossierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocteurLocation() {
		return docteurLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocteurLocation_NomDuDocteur() {
		return (EAttribute)docteurLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocteurLocation_Localisation() {
		return (EAttribute)docteurLocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeStage() {
		return typeStageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLocalisation() {
		return localisationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getETAT_INTERNE() {
		return etaT_INTERNEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrechoiceFactory getPrechoiceFactory() {
		return (PrechoiceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		interneEClass = createEClass(INTERNE);
		createEAttribute(interneEClass, INTERNE__PRENOM);
		createEAttribute(interneEClass, INTERNE__PROMOTION);
		createEAttribute(interneEClass, INTERNE__CLASSEMENT);
		createEReference(interneEClass, INTERNE__CHOIX);
		createEReference(interneEClass, INTERNE__AFFECTATION);
		createEAttribute(interneEClass, INTERNE__ANNEE);
		createEAttribute(interneEClass, INTERNE__ETAT);

		stageEClass = createEClass(STAGE);
		createEAttribute(stageEClass, STAGE__NOMBRE_DE_POSTES);
		createEReference(stageEClass, STAGE__INTERNE_AFFECTE);

		elementNommeEClass = createEClass(ELEMENT_NOMME);
		createEAttribute(elementNommeEClass, ELEMENT_NOMME__NOM);

		preChoixEClass = createEClass(PRE_CHOIX);

		dossierEClass = createEClass(DOSSIER);
		createEReference(dossierEClass, DOSSIER__ELEMENTS);
		createEReference(dossierEClass, DOSSIER__LOCATIONS);

		docteurLocationEClass = createEClass(DOCTEUR_LOCATION);
		createEAttribute(docteurLocationEClass, DOCTEUR_LOCATION__NOM_DU_DOCTEUR);
		createEAttribute(docteurLocationEClass, DOCTEUR_LOCATION__LOCALISATION);

		// Create enums
		typeStageEEnum = createEEnum(TYPE_STAGE);
		localisationEEnum = createEEnum(LOCALISATION);
		etaT_INTERNEEEnum = createEEnum(ETAT_INTERNE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		interneEClass.getESuperTypes().add(this.getElementNomme());
		stageEClass.getESuperTypes().add(this.getElementNomme());
		preChoixEClass.getESuperTypes().add(this.getDossier());
		dossierEClass.getESuperTypes().add(this.getElementNomme());

		// Initialize classes and features; add operations and parameters
		initEClass(interneEClass, Interne.class, "Interne", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterne_Prenom(), ecorePackage.getEString(), "prenom", null, 0, 1, Interne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterne_Promotion(), ecorePackage.getEInt(), "promotion", null, 0, 1, Interne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterne_Classement(), ecorePackage.getEInt(), "classement", null, 0, 1, Interne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterne_Choix(), this.getStage(), null, "choix", null, 0, -1, Interne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterne_Affectation(), this.getStage(), this.getStage_InterneAffecte(), "affectation", null, 0, 1, Interne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterne_Annee(), ecorePackage.getEInt(), "annee", null, 0, 1, Interne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterne_Etat(), this.getETAT_INTERNE(), "etat", null, 0, 1, Interne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stageEClass, Stage.class, "Stage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStage_NombreDePostes(), ecorePackage.getEInt(), "nombreDePostes", null, 0, 1, Stage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStage_InterneAffecte(), this.getInterne(), this.getInterne_Affectation(), "interneAffecte", null, 0, -1, Stage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(stageEClass, ecorePackage.getEInt(), "getNumber", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(stageEClass, ecorePackage.getEString(), "getLabel", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(stageEClass, ecorePackage.getEString(), "getLocation", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(stageEClass, ecorePackage.getEString(), "getDocteur", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(elementNommeEClass, ElementNomme.class, "ElementNomme", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementNomme_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, ElementNomme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preChoixEClass, PreChoix.class, "PreChoix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dossierEClass, Dossier.class, "Dossier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDossier_Elements(), this.getElementNomme(), null, "elements", null, 0, -1, Dossier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDossier_Locations(), this.getDocteurLocation(), null, "locations", null, 0, -1, Dossier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(docteurLocationEClass, DocteurLocation.class, "DocteurLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocteurLocation_NomDuDocteur(), ecorePackage.getEString(), "nomDuDocteur", null, 0, 1, DocteurLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocteurLocation_Localisation(), ecorePackage.getEString(), "localisation", null, 0, 1, DocteurLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeStageEEnum, TypeStage.class, "TypeStage");
		addEEnumLiteral(typeStageEEnum, TypeStage.PEDOPSY);
		addEEnumLiteral(typeStageEEnum, TypeStage.ADULTE);

		initEEnum(localisationEEnum, Localisation.class, "Localisation");
		addEEnumLiteral(localisationEEnum, Localisation.PERIPHERIQUE);
		addEEnumLiteral(localisationEEnum, Localisation.MARCHANT);
		addEEnumLiteral(localisationEEnum, Localisation.CHU);
		addEEnumLiteral(localisationEEnum, Localisation.AUTRE);

		initEEnum(etaT_INTERNEEEnum, org.coordipsy.prechoice.prechoice.ETAT_INTERNE.class, "ETAT_INTERNE");
		addEEnumLiteral(etaT_INTERNEEEnum, org.coordipsy.prechoice.prechoice.ETAT_INTERNE.NORMAL);
		addEEnumLiteral(etaT_INTERNEEEnum, org.coordipsy.prechoice.prechoice.ETAT_INTERNE.FIN_CURSUS);
		addEEnumLiteral(etaT_INTERNEEEnum, org.coordipsy.prechoice.prechoice.ETAT_INTERNE.DISPO_CP);
		addEEnumLiteral(etaT_INTERNEEEnum, org.coordipsy.prechoice.prechoice.ETAT_INTERNE.DISPO_M);
		addEEnumLiteral(etaT_INTERNEEEnum, org.coordipsy.prechoice.prechoice.ETAT_INTERNE.SURNOMBRE_NV);
		addEEnumLiteral(etaT_INTERNEEEnum, org.coordipsy.prechoice.prechoice.ETAT_INTERNE.DOM_TOM);
		addEEnumLiteral(etaT_INTERNEEEnum, org.coordipsy.prechoice.prechoice.ETAT_INTERNE.DROITREMORD);
		addEEnumLiteral(etaT_INTERNEEEnum, org.coordipsy.prechoice.prechoice.ETAT_INTERNE.SURNOMBRE_V);

		// Create resource
		createResource(eNS_URI);
	}

} //PrechoicePackageImpl
