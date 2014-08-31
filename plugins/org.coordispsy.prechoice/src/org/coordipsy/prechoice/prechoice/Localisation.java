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
 * A representation of the literals of the enumeration '<em><b>Localisation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.coordipsy.prechoice.prechoice.PrechoicePackage#getLocalisation()
 * @model
 * @generated
 */
public enum Localisation implements Enumerator {
	/**
	 * The '<em><b>PERIPHERIQUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERIPHERIQUE_VALUE
	 * @generated
	 * @ordered
	 */
	PERIPHERIQUE(0, "PERIPHERIQUE", "PERIPHERIQUE"),

	/**
	 * The '<em><b>MARCHANT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARCHANT_VALUE
	 * @generated
	 * @ordered
	 */
	MARCHANT(1, "MARCHANT", "MARCHANT"),

	/**
	 * The '<em><b>CHU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHU_VALUE
	 * @generated
	 * @ordered
	 */
	CHU(2, "CHU", "CHU"), /**
	 * The '<em><b>AUTRE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTRE_VALUE
	 * @generated
	 * @ordered
	 */
	AUTRE(3, "AUTRE", "AUTRE");

	/**
	 * The '<em><b>PERIPHERIQUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PERIPHERIQUE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERIPHERIQUE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PERIPHERIQUE_VALUE = 0;

	/**
	 * The '<em><b>MARCHANT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MARCHANT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MARCHANT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MARCHANT_VALUE = 1;

	/**
	 * The '<em><b>CHU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHU</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHU_VALUE = 2;

	/**
	 * The '<em><b>AUTRE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AUTRE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTRE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AUTRE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Localisation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Localisation[] VALUES_ARRAY =
		new Localisation[] {
			PERIPHERIQUE,
			MARCHANT,
			CHU,
			AUTRE,
		};

	/**
	 * A public read-only list of all the '<em><b>Localisation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Localisation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Localisation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Localisation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Localisation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Localisation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Localisation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Localisation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Localisation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Localisation get(int value) {
		switch (value) {
			case PERIPHERIQUE_VALUE: return PERIPHERIQUE;
			case MARCHANT_VALUE: return MARCHANT;
			case CHU_VALUE: return CHU;
			case AUTRE_VALUE: return AUTRE;
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
	private Localisation(int value, String name, String literal) {
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
	
} //Localisation
