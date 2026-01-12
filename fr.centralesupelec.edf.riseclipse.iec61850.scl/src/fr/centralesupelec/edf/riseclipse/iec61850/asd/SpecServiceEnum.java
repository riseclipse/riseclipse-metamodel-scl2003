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
 * A representation of the literals of the enumeration '<em><b>Spec Service Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSpecServiceEnum()
 * @model
 * @generated
 */
public enum SpecServiceEnum implements Enumerator {
    /**
     * The '<em><b>GOOSE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GOOSE_VALUE
     * @generated
     * @ordered
     */
    GOOSE( 0, "GOOSE", "GOOSE" ),

    /**
     * The '<em><b>Internal</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INTERNAL_VALUE
     * @generated
     * @ordered
     */
    INTERNAL( 1, "Internal", "Internal" ),

    /**
     * The '<em><b>Poll</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #POLL_VALUE
     * @generated
     * @ordered
     */
    POLL( 2, "Poll", "Poll" ),

    /**
     * The '<em><b>Report</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REPORT_VALUE
     * @generated
     * @ordered
     */
    REPORT( 4, "Report", "Report" ),

    /**
     * The '<em><b>SMV</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SMV_VALUE
     * @generated
     * @ordered
     */
    SMV( 5, "SMV", "SMV" ),

    /**
     * The '<em><b>Wired</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WIRED_VALUE
     * @generated
     * @ordered
     */
    WIRED( 6, "Wired", "Wired" );

    /**
     * The '<em><b>GOOSE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GOOSE
     * @model
     * @generated
     * @ordered
     */
    public static final int GOOSE_VALUE = 0;

    /**
     * The '<em><b>Internal</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INTERNAL
     * @model name="Internal"
     * @generated
     * @ordered
     */
    public static final int INTERNAL_VALUE = 1;

    /**
     * The '<em><b>Poll</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #POLL
     * @model name="Poll"
     * @generated
     * @ordered
     */
    public static final int POLL_VALUE = 2;

    /**
     * The '<em><b>Report</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REPORT
     * @model name="Report"
     * @generated
     * @ordered
     */
    public static final int REPORT_VALUE = 4;

    /**
     * The '<em><b>SMV</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SMV
     * @model
     * @generated
     * @ordered
     */
    public static final int SMV_VALUE = 5;

    /**
     * The '<em><b>Wired</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WIRED
     * @model name="Wired"
     * @generated
     * @ordered
     */
    public static final int WIRED_VALUE = 6;

    /**
     * An array of all the '<em><b>Spec Service Enum</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final SpecServiceEnum[] VALUES_ARRAY = new SpecServiceEnum[] {
            GOOSE,
            INTERNAL,
            POLL,
            REPORT,
            SMV,
            WIRED,
    };

    /**
     * A public read-only list of all the '<em><b>Spec Service Enum</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< SpecServiceEnum > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Spec Service Enum</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static SpecServiceEnum get( String literal ) {
        for( SpecServiceEnum result : VALUES_ARRAY ) {
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Spec Service Enum</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static SpecServiceEnum getByName( String name ) {
        for( SpecServiceEnum result : VALUES_ARRAY ) {
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Spec Service Enum</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static SpecServiceEnum get( int value ) {
        switch( value ) {
        case GOOSE_VALUE:
            return GOOSE;
        case INTERNAL_VALUE:
            return INTERNAL;
        case POLL_VALUE:
            return POLL;
        case REPORT_VALUE:
            return REPORT;
        case SMV_VALUE:
            return SMV;
        case WIRED_VALUE:
            return WIRED;
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
    private SpecServiceEnum( int value, String name, String literal ) {
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

} //SpecServiceEnum
