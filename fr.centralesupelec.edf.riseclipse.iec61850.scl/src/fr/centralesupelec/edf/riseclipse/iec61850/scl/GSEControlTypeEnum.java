/*
*************************************************************************
**  Copyright (c) 2016-2021 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      https://riseclipse.github.io/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.iec61850.scl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>GSE Control Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGSEControlTypeEnum()
 * @model
 * @generated
 */
public enum GSEControlTypeEnum implements Enumerator {
    /**
     * The '<em><b>GSSE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GSSE_VALUE
     * @generated
     * @ordered
     */
    GSSE( 0, "GSSE", "GSSE" ),

    /**
     * The '<em><b>GOOSE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GOOSE_VALUE
     * @generated
     * @ordered
     */
    GOOSE( 1, "GOOSE", "GOOSE" );

    /**
     * The '<em><b>GSSE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>GSSE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GSSE
     * @model
     * @generated
     * @ordered
     */
    public static final int GSSE_VALUE = 0;

    /**
     * The '<em><b>GOOSE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>GOOSE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GOOSE
     * @model
     * @generated
     * @ordered
     */
    public static final int GOOSE_VALUE = 1;

    /**
     * An array of all the '<em><b>GSE Control Type Enum</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final GSEControlTypeEnum[] VALUES_ARRAY = new GSEControlTypeEnum[] {
            GSSE,
            GOOSE,
    };

    /**
     * A public read-only list of all the '<em><b>GSE Control Type Enum</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< GSEControlTypeEnum > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>GSE Control Type Enum</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static GSEControlTypeEnum get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            GSEControlTypeEnum result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>GSE Control Type Enum</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static GSEControlTypeEnum getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            GSEControlTypeEnum result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>GSE Control Type Enum</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static GSEControlTypeEnum get( int value ) {
        switch( value ) {
        case GSSE_VALUE:
            return GSSE;
        case GOOSE_VALUE:
            return GOOSE;
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
    private GSEControlTypeEnum( int value, String name, String literal ) {
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

} //GSEControlTypeEnum
