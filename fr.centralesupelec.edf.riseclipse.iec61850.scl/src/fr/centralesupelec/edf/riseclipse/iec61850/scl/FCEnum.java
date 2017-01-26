/**
 *  Copyright (c) 2017 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.iec61850.scl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>FC Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getFCEnum()
 * @model
 * @generated
 */
public enum FCEnum implements Enumerator {
    /**
     * The '<em><b>ST</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ST_VALUE
     * @generated
     * @ordered
     */
    ST( 0, "ST", "ST" ),

    /**
     * The '<em><b>MX</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MX_VALUE
     * @generated
     * @ordered
     */
    MX( 1, "MX", "MX" ),

    /**
     * The '<em><b>CO</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CO_VALUE
     * @generated
     * @ordered
     */
    CO( 2, "CO", "CO" ),

    /**
     * The '<em><b>SP</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SP_VALUE
     * @generated
     * @ordered
     */
    SP( 3, "SP", "SP" ),

    /**
     * The '<em><b>SG</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SG_VALUE
     * @generated
     * @ordered
     */
    SG( 4, "SG", "SG" ),

    /**
     * The '<em><b>SE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SE_VALUE
     * @generated
     * @ordered
     */
    SE( 5, "SE", "SE" ),

    /**
     * The '<em><b>SV</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SV_VALUE
     * @generated
     * @ordered
     */
    SV( 6, "SV", "SV" ),

    /**
     * The '<em><b>CF</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CF_VALUE
     * @generated
     * @ordered
     */
    CF( 7, "CF", "CF" ),

    /**
     * The '<em><b>DC</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DC_VALUE
     * @generated
     * @ordered
     */
    DC( 8, "DC", "DC" ),

    /**
     * The '<em><b>EX</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #EX_VALUE
     * @generated
     * @ordered
     */
    EX( 9, "EX", "EX" ),

    /**
     * The '<em><b>SR</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SR_VALUE
     * @generated
     * @ordered
     */
    SR( 10, "SR", "SR" ),

    /**
     * The '<em><b>BL</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BL_VALUE
     * @generated
     * @ordered
     */
    BL( 11, "BL", "BL" ),

    /**
     * The '<em><b>OR</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OR_VALUE
     * @generated
     * @ordered
     */
    OR( 12, "OR", "OR" );

    /**
     * The '<em><b>ST</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>ST</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ST
     * @model
     * @generated
     * @ordered
     */
    public static final int ST_VALUE = 0;

    /**
     * The '<em><b>MX</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>MX</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MX
     * @model
     * @generated
     * @ordered
     */
    public static final int MX_VALUE = 1;

    /**
     * The '<em><b>CO</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>CO</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CO
     * @model
     * @generated
     * @ordered
     */
    public static final int CO_VALUE = 2;

    /**
     * The '<em><b>SP</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SP</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SP
     * @model
     * @generated
     * @ordered
     */
    public static final int SP_VALUE = 3;

    /**
     * The '<em><b>SG</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SG</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SG
     * @model
     * @generated
     * @ordered
     */
    public static final int SG_VALUE = 4;

    /**
     * The '<em><b>SE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SE
     * @model
     * @generated
     * @ordered
     */
    public static final int SE_VALUE = 5;

    /**
     * The '<em><b>SV</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SV</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SV
     * @model
     * @generated
     * @ordered
     */
    public static final int SV_VALUE = 6;

    /**
     * The '<em><b>CF</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>CF</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CF
     * @model
     * @generated
     * @ordered
     */
    public static final int CF_VALUE = 7;

    /**
     * The '<em><b>DC</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>DC</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DC
     * @model
     * @generated
     * @ordered
     */
    public static final int DC_VALUE = 8;

    /**
     * The '<em><b>EX</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>EX</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #EX
     * @model
     * @generated
     * @ordered
     */
    public static final int EX_VALUE = 9;

    /**
     * The '<em><b>SR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SR</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SR
     * @model
     * @generated
     * @ordered
     */
    public static final int SR_VALUE = 10;

    /**
     * The '<em><b>BL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>BL</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BL
     * @model
     * @generated
     * @ordered
     */
    public static final int BL_VALUE = 11;

    /**
     * The '<em><b>OR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>OR</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #OR
     * @model
     * @generated
     * @ordered
     */
    public static final int OR_VALUE = 12;

    /**
     * An array of all the '<em><b>FC Enum</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final FCEnum[] VALUES_ARRAY = new FCEnum[] {
            ST,
            MX,
            CO,
            SP,
            SG,
            SE,
            SV,
            CF,
            DC,
            EX,
            SR,
            BL,
            OR,
        };

    /**
     * A public read-only list of all the '<em><b>FC Enum</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<FCEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>FC Enum</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static FCEnum get( String literal ) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            FCEnum result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>FC Enum</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static FCEnum getByName( String name ) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            FCEnum result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>FC Enum</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static FCEnum get( int value ) {
        switch (value) {
            case ST_VALUE: return ST;
            case MX_VALUE: return MX;
            case CO_VALUE: return CO;
            case SP_VALUE: return SP;
            case SG_VALUE: return SG;
            case SE_VALUE: return SE;
            case SV_VALUE: return SV;
            case CF_VALUE: return CF;
            case DC_VALUE: return DC;
            case EX_VALUE: return EX;
            case SR_VALUE: return SR;
            case BL_VALUE: return BL;
            case OR_VALUE: return OR;
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
    private FCEnum( int value, String name, String literal ) {
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

} //FCEnum
