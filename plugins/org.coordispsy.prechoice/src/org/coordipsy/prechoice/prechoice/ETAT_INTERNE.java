/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.coordipsy.prechoice.prechoice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ETAT INTERNE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.coordipsy.prechoice.prechoice.PrechoicePackage#getETAT_INTERNE()
 * @model
 * @generated
 */
public enum ETAT_INTERNE implements Enumerator {
	/**
	 * The '<em><b>NORMAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMAL_VALUE
	 * @generated
	 * @ordered
	 */
	NORMAL(0, "NORMAL", " "), /**
	 * The '<em><b>Fin Cursus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIN_CURSUS_VALUE
	 * @generated
	 * @ordered
	 */
	FIN_CURSUS(1, "FinCursus", "FinCursus"), /**
	 * The '<em><b>Dispo CP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISPO_CP_VALUE
	 * @generated
	 * @ordered
	 */
	DISPO_CP(2, "DispoCP", "DISPO CP"), /**
	 * The '<em><b>Dispo M</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISPO_M_VALUE
	 * @generated
	 * @ordered
	 */
	DISPO_M(3, "DispoM", "DISPO MASTER"), /**
	 * The '<em><b>Surnombre NV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SURNOMBRE_NV_VALUE
	 * @generated
	 * @ordered
	 */
	SURNOMBRE_NV(4, "SurnombreNV", "Surnombre NV"), /**
	 * The '<em><b>DOM TOM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOM_TOM_VALUE
	 * @generated
	 * @ordered
	 */
	DOM_TOM(5, "DOM_TOM", "DOM TOM"), /**
	 * The '<em><b>DROITREMORD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DROITREMORD_VALUE
	 * @generated
	 * @ordered
	 */
	DROITREMORD(8, "DROITREMORD", "DROIT REMORD"), /**
	 * The '<em><b>Surnombre V</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SURNOMBRE_V_VALUE
	 * @generated
	 * @ordered
	 */
	SURNOMBRE_V(7, "SurnombreV", "Surnombre V");

	/**
	 * The '<em><b>NORMAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NORMAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NORMAL
	 * @model literal=" "
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_VALUE = 0;

	/**
	 * The '<em><b>Fin Cursus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fin Cursus</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIN_CURSUS
	 * @model name="FinCursus"
	 * @generated
	 * @ordered
	 */
	public static final int FIN_CURSUS_VALUE = 1;

	/**
	 * The '<em><b>Dispo CP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dispo CP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISPO_CP
	 * @model name="DispoCP" literal="DISPO CP"
	 * @generated
	 * @ordered
	 */
	public static final int DISPO_CP_VALUE = 2;

	/**
	 * The '<em><b>Dispo M</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dispo M</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISPO_M
	 * @model name="DispoM" literal="DISPO MASTER"
	 * @generated
	 * @ordered
	 */
	public static final int DISPO_M_VALUE = 3;

	/**
	 * The '<em><b>Surnombre NV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Surnombre NV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SURNOMBRE_NV
	 * @model name="SurnombreNV" literal="Surnombre NV"
	 * @generated
	 * @ordered
	 */
	public static final int SURNOMBRE_NV_VALUE = 4;

	/**
	 * The '<em><b>DOM TOM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DOM TOM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOM_TOM
	 * @model literal="DOM TOM"
	 * @generated
	 * @ordered
	 */
	public static final int DOM_TOM_VALUE = 5;

	/**
	 * The '<em><b>DROITREMORD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DROITREMORD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DROITREMORD
	 * @model literal="DROIT REMORD"
	 * @generated
	 * @ordered
	 */
	public static final int DROITREMORD_VALUE = 8;

	/**
	 * The '<em><b>Surnombre V</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Surnombre V</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SURNOMBRE_V
	 * @model name="SurnombreV" literal="Surnombre V"
	 * @generated
	 * @ordered
	 */
	public static final int SURNOMBRE_V_VALUE = 7;

	/**
	 * An array of all the '<em><b>ETAT INTERNE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ETAT_INTERNE[] VALUES_ARRAY =
		new ETAT_INTERNE[] {
			NORMAL,
			FIN_CURSUS,
			DISPO_CP,
			DISPO_M,
			SURNOMBRE_NV,
			DOM_TOM,
			DROITREMORD,
			SURNOMBRE_V,
		};

	/**
	 * A public read-only list of all the '<em><b>ETAT INTERNE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ETAT_INTERNE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ETAT INTERNE</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ETAT_INTERNE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ETAT_INTERNE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ETAT INTERNE</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ETAT_INTERNE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ETAT_INTERNE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ETAT INTERNE</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ETAT_INTERNE get(int value) {
		switch (value) {
			case NORMAL_VALUE: return NORMAL;
			case FIN_CURSUS_VALUE: return FIN_CURSUS;
			case DISPO_CP_VALUE: return DISPO_CP;
			case DISPO_M_VALUE: return DISPO_M;
			case SURNOMBRE_NV_VALUE: return SURNOMBRE_NV;
			case DOM_TOM_VALUE: return DOM_TOM;
			case DROITREMORD_VALUE: return DROITREMORD;
			case SURNOMBRE_V_VALUE: return SURNOMBRE_V;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ETAT_INTERNE(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ETAT_INTERNE
