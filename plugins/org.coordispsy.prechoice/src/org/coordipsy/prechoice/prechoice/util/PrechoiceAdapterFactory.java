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
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.coordipsy.prechoice.prechoice.PrechoicePackage
 * @generated
 */
public class PrechoiceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PrechoicePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrechoiceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PrechoicePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrechoiceSwitch<Adapter> modelSwitch =
		new PrechoiceSwitch<Adapter>() {
			@Override
			public Adapter caseInterne(Interne object) {
				return createInterneAdapter();
			}
			@Override
			public Adapter caseStage(Stage object) {
				return createStageAdapter();
			}
			@Override
			public Adapter caseElementNomme(ElementNomme object) {
				return createElementNommeAdapter();
			}
			@Override
			public Adapter casePreChoix(PreChoix object) {
				return createPreChoixAdapter();
			}
			@Override
			public Adapter caseDossier(Dossier object) {
				return createDossierAdapter();
			}
			@Override
			public Adapter caseDocteurLocation(DocteurLocation object) {
				return createDocteurLocationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.coordipsy.prechoice.prechoice.Interne <em>Interne</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.coordipsy.prechoice.prechoice.Interne
	 * @generated
	 */
	public Adapter createInterneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.coordipsy.prechoice.prechoice.Stage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.coordipsy.prechoice.prechoice.Stage
	 * @generated
	 */
	public Adapter createStageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.coordipsy.prechoice.prechoice.ElementNomme <em>Element Nomme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.coordipsy.prechoice.prechoice.ElementNomme
	 * @generated
	 */
	public Adapter createElementNommeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.coordipsy.prechoice.prechoice.PreChoix <em>Pre Choix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.coordipsy.prechoice.prechoice.PreChoix
	 * @generated
	 */
	public Adapter createPreChoixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.coordipsy.prechoice.prechoice.Dossier <em>Dossier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.coordipsy.prechoice.prechoice.Dossier
	 * @generated
	 */
	public Adapter createDossierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.coordipsy.prechoice.prechoice.DocteurLocation <em>Docteur Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.coordipsy.prechoice.prechoice.DocteurLocation
	 * @generated
	 */
	public Adapter createDocteurLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PrechoiceAdapterFactory
