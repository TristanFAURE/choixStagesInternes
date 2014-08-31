/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.coordipsy.prechoice.prechoice.impl;

import org.coordipsy.prechoice.prechoice.*;
import org.coordipsy.prechoice.prechoice.Dossier;
import org.coordipsy.prechoice.prechoice.Interne;
import org.coordipsy.prechoice.prechoice.Localisation;
import org.coordipsy.prechoice.prechoice.PreChoix;
import org.coordipsy.prechoice.prechoice.PrechoiceFactory;
import org.coordipsy.prechoice.prechoice.PrechoicePackage;
import org.coordipsy.prechoice.prechoice.Stage;
import org.coordipsy.prechoice.prechoice.TypeStage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrechoiceFactoryImpl extends EFactoryImpl implements PrechoiceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrechoiceFactory init() {
		try {
			PrechoiceFactory thePrechoiceFactory = (PrechoiceFactory)EPackage.Registry.INSTANCE.getEFactory("http://coordipsy/prechoice/1.0"); 
			if (thePrechoiceFactory != null) {
				return thePrechoiceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PrechoiceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrechoiceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PrechoicePackage.INTERNE: return createInterne();
			case PrechoicePackage.STAGE: return createStage();
			case PrechoicePackage.PRE_CHOIX: return createPreChoix();
			case PrechoicePackage.DOSSIER: return createDossier();
			case PrechoicePackage.DOCTEUR_LOCATION: return createDocteurLocation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PrechoicePackage.TYPE_STAGE:
				return createTypeStageFromString(eDataType, initialValue);
			case PrechoicePackage.LOCALISATION:
				return createLocalisationFromString(eDataType, initialValue);
			case PrechoicePackage.ETAT_INTERNE:
				return createETAT_INTERNEFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PrechoicePackage.TYPE_STAGE:
				return convertTypeStageToString(eDataType, instanceValue);
			case PrechoicePackage.LOCALISATION:
				return convertLocalisationToString(eDataType, instanceValue);
			case PrechoicePackage.ETAT_INTERNE:
				return convertETAT_INTERNEToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interne createInterne() {
		InterneImpl interne = new InterneImpl();
		return interne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stage createStage() {
		StageImpl stage = new StageImpl();
		return stage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreChoix createPreChoix() {
		PreChoixImpl preChoix = new PreChoixImpl();
		return preChoix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dossier createDossier() {
		DossierImpl dossier = new DossierImpl();
		return dossier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocteurLocation createDocteurLocation() {
		DocteurLocationImpl docteurLocation = new DocteurLocationImpl();
		return docteurLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeStage createTypeStageFromString(EDataType eDataType, String initialValue) {
		TypeStage result = TypeStage.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeStageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Localisation createLocalisationFromString(EDataType eDataType, String initialValue) {
		Localisation result = Localisation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocalisationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETAT_INTERNE createETAT_INTERNEFromString(EDataType eDataType, String initialValue) {
		ETAT_INTERNE result = ETAT_INTERNE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertETAT_INTERNEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrechoicePackage getPrechoicePackage() {
		return (PrechoicePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PrechoicePackage getPackage() {
		return PrechoicePackage.eINSTANCE;
	}

} //PrechoiceFactoryImpl
