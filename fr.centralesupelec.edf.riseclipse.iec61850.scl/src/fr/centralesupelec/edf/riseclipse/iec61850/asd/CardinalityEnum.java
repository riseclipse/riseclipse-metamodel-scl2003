/**
 *  Copyright (c) 2016-2024 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-v20.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec
 *      EDF R&D
 *  Contacts:
 *      dominique.marcadet@centralesupelec.fr
 *      aurelie.dehouck-neveu@edf.fr
 *  Web site:
 *      https://riseclipse.github.io/
 * 
 */
package fr.centralesupelec.edf.riseclipse.iec61850.asd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cardinality Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getCardinalityEnum()
 * @model extendedMetaData="name='tCardinalityEnum'"
 * @generated
 */
public enum CardinalityEnum implements Enumerator {
    /**
     * The '<em><b>01</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indicates that the element is optional and cannot be multiplied
     * <!-- end-model-doc -->
     * @see #_01_VALUE
     * @generated
     * @ordered
     */
    _01( 0, "_01", "0..1" ),

    /**
     * The '<em><b>11</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indicates that the element is not optional and cannot be multiplied
     * <!-- end-model-doc -->
     * @see #_11_VALUE
     * @generated
     * @ordered
     */
    _11( 1, "_11", "1..1" ),

    /**
     * The '<em><b>0N</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indicates that the element is optional and can be multiplied
     * <!-- end-model-doc -->
     * @see #_0N_VALUE
     * @generated
     * @ordered
     */
    _0N( 2, "_0N", "0..n" ),

    /**
     * The '<em><b>1N</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indicates that the element is not optional and can be multiplied
     * <!-- end-model-doc -->
     * @see #_1N_VALUE
     * @generated
     * @ordered
     */
    _1N( 3, "_1N", "1..n" );

    /**
     * The '<em><b>01</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indicates that the element is optional and cannot be multiplied
     * <!-- end-model-doc -->
     * @see #_01
     * @model literal="0..1"
     * @generated
     * @ordered
     */
    public static final int _01_VALUE = 0;

    /**
     * The '<em><b>11</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indicates that the element is not optional and cannot be multiplied
     * <!-- end-model-doc -->
     * @see #_11
     * @model literal="1..1"
     * @generated
     * @ordered
     */
    public static final int _11_VALUE = 1;

    /**
     * The '<em><b>0N</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indicates that the element is optional and can be multiplied
     * <!-- end-model-doc -->
     * @see #_0N
     * @model literal="0..n"
     * @generated
     * @ordered
     */
    public static final int _0N_VALUE = 2;

    /**
     * The '<em><b>1N</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indicates that the element is not optional and can be multiplied
     * <!-- end-model-doc -->
     * @see #_1N
     * @model literal="1..n"
     * @generated
     * @ordered
     */
    public static final int _1N_VALUE = 3;

    /**
     * An array of all the '<em><b>Cardinality Enum</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final CardinalityEnum[] VALUES_ARRAY = new CardinalityEnum[] {
            _01,
            _11,
            _0N,
            _1N,
    };

    /**
     * A public read-only list of all the '<em><b>Cardinality Enum</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< CardinalityEnum > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Cardinality Enum</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static CardinalityEnum get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            CardinalityEnum result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Cardinality Enum</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static CardinalityEnum getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            CardinalityEnum result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Cardinality Enum</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static CardinalityEnum get( int value ) {
        switch( value ) {
        case _01_VALUE:
            return _01;
        case _11_VALUE:
            return _11;
        case _0N_VALUE:
            return _0N;
        case _1N_VALUE:
            return _1N;
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
    private CardinalityEnum( int value, String name, String literal ) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
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

} //CardinalityEnum
