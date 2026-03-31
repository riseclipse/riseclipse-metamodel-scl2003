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
 * A representation of the literals of the enumeration '<em><b>Out Typ Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getOutTypEnum()
 * @model extendedMetaData="name='outTyp_._type'"
 * @generated
 */
public enum OutTypEnum implements Enumerator {
    /**
     * The '<em><b>Normally Open</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NORMALLY_OPEN_VALUE
     * @generated
     * @ordered
     */
    NORMALLY_OPEN( 0, "NormallyOpen", "Normally open" ),

    /**
     * The '<em><b>Normally Closed</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NORMALLY_CLOSED_VALUE
     * @generated
     * @ordered
     */
    NORMALLY_CLOSED( 1, "NormallyClosed", "Normally closed" ),

    /**
     * The '<em><b>Change Over</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CHANGE_OVER_VALUE
     * @generated
     * @ordered
     */
    CHANGE_OVER( 2, "ChangeOver", "Change over" );

    /**
     * The '<em><b>Normally Open</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NORMALLY_OPEN
     * @model name="NormallyOpen" literal="Normally open"
     * @generated
     * @ordered
     */
    public static final int NORMALLY_OPEN_VALUE = 0;

    /**
     * The '<em><b>Normally Closed</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NORMALLY_CLOSED
     * @model name="NormallyClosed" literal="Normally closed"
     * @generated
     * @ordered
     */
    public static final int NORMALLY_CLOSED_VALUE = 1;

    /**
     * The '<em><b>Change Over</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CHANGE_OVER
     * @model name="ChangeOver" literal="Change over"
     * @generated
     * @ordered
     */
    public static final int CHANGE_OVER_VALUE = 2;

    /**
     * An array of all the '<em><b>Out Typ Enum</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final OutTypEnum[] VALUES_ARRAY = new OutTypEnum[] {
            NORMALLY_OPEN,
            NORMALLY_CLOSED,
            CHANGE_OVER,
    };

    /**
     * A public read-only list of all the '<em><b>Out Typ Enum</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< OutTypEnum > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Out Typ Enum</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static OutTypEnum get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            OutTypEnum result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Out Typ Enum</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static OutTypEnum getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            OutTypEnum result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Out Typ Enum</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static OutTypEnum get( int value ) {
        switch( value ) {
        case NORMALLY_OPEN_VALUE:
            return NORMALLY_OPEN;
        case NORMALLY_CLOSED_VALUE:
            return NORMALLY_CLOSED;
        case CHANGE_OVER_VALUE:
            return CHANGE_OVER;
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
    private OutTypEnum( int value, String name, String literal ) {
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

} //OutTypEnum
