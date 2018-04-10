/**
 *  Copyright (c) 2018 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
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
 *      http://wdi.supelec.fr/software/RiseClipse/
 */
package fr.centralesupelec.edf.riseclipse.iec61850.scl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Unit Multiplier Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getUnitMultiplierEnum()
 * @model
 * @generated
 */
public enum UnitMultiplierEnum implements Enumerator {
    /**
     * The '<em><b>Milli</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MILLI_VALUE
     * @generated
     * @ordered
     */
    MILLI( 0, "milli", "m" ),

    /**
     * The '<em><b>K</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #K_VALUE
     * @generated
     * @ordered
     */
    K( 1, "k", "k" ),

    /**
     * The '<em><b>M</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #M_VALUE
     * @generated
     * @ordered
     */
    M( 2, "M", "M" ),

    /**
     * The '<em><b>Mu</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MU_VALUE
     * @generated
     * @ordered
     */
    MU( 3, "mu", "mu" ),

    /**
     * The '<em><b>Yocto</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #YOCTO_VALUE
     * @generated
     * @ordered
     */
    YOCTO( 4, "yocto", "y" ),

    /**
     * The '<em><b>Zepto</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ZEPTO_VALUE
     * @generated
     * @ordered
     */
    ZEPTO( 5, "zepto", "z" ),

    /**
     * The '<em><b>A</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #A_VALUE
     * @generated
     * @ordered
     */
    A( 6, "a", "a" ),

    /**
     * The '<em><b>F</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #F_VALUE
     * @generated
     * @ordered
     */
    F( 7, "f", "f" ),

    /**
     * The '<em><b>Pico</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PICO_VALUE
     * @generated
     * @ordered
     */
    PICO( 8, "pico", "p" ),

    /**
     * The '<em><b>N</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #N_VALUE
     * @generated
     * @ordered
     */
    N( 9, "n", "n" ),

    /**
     * The '<em><b>C</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #C_VALUE
     * @generated
     * @ordered
     */
    C( 10, "c", "c" ),

    /**
     * The '<em><b>D</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #D_VALUE
     * @generated
     * @ordered
     */
    D( 11, "d", "d" ),

    /**
     * The '<em><b>Da</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DA_VALUE
     * @generated
     * @ordered
     */
    DA( 12, "da", "da" ),

    /**
     * The '<em><b>H</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #H_VALUE
     * @generated
     * @ordered
     */
    H( 13, "h", "h" ),

    /**
     * The '<em><b>G</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #G_VALUE
     * @generated
     * @ordered
     */
    G( 14, "G", "G" ),

    /**
     * The '<em><b>T</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #T_VALUE
     * @generated
     * @ordered
     */
    T( 15, "T", "T" ),

    /**
     * The '<em><b>P</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #P_VALUE
     * @generated
     * @ordered
     */
    P( 16, "P", "P" ),

    /**
     * The '<em><b>E</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #E_VALUE
     * @generated
     * @ordered
     */
    E( 17, "E", "E" ),

    /**
     * The '<em><b>Z</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #Z_VALUE
     * @generated
     * @ordered
     */
    Z( 18, "Z", "Z" ),

    /**
     * The '<em><b>Y</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #Y_VALUE
     * @generated
     * @ordered
     */
    Y( 19, "Y", "Y" ),

    /**
     * The '<em><b>None</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NONE_VALUE
     * @generated
     * @ordered
     */
    NONE( 20, "None", "None" );

    /**
     * The '<em><b>Milli</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Milli</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MILLI
     * @model name="milli" literal="m"
     * @generated
     * @ordered
     */
    public static final int MILLI_VALUE = 0;

    /**
     * The '<em><b>K</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>K</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #K
     * @model name="k"
     * @generated
     * @ordered
     */
    public static final int K_VALUE = 1;

    /**
     * The '<em><b>M</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>M</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #M
     * @model
     * @generated
     * @ordered
     */
    public static final int M_VALUE = 2;

    /**
     * The '<em><b>Mu</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Mu</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MU
     * @model name="mu"
     * @generated
     * @ordered
     */
    public static final int MU_VALUE = 3;

    /**
     * The '<em><b>Yocto</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Yocto</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #YOCTO
     * @model name="yocto" literal="y"
     * @generated
     * @ordered
     */
    public static final int YOCTO_VALUE = 4;

    /**
     * The '<em><b>Zepto</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Zepto</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ZEPTO
     * @model name="zepto" literal="z"
     * @generated
     * @ordered
     */
    public static final int ZEPTO_VALUE = 5;

    /**
     * The '<em><b>A</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>A</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #A
     * @model name="a"
     * @generated
     * @ordered
     */
    public static final int A_VALUE = 6;

    /**
     * The '<em><b>F</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>F</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #F
     * @model name="f"
     * @generated
     * @ordered
     */
    public static final int F_VALUE = 7;

    /**
     * The '<em><b>Pico</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Pico</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PICO
     * @model name="pico" literal="p"
     * @generated
     * @ordered
     */
    public static final int PICO_VALUE = 8;

    /**
     * The '<em><b>N</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>N</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #N
     * @model name="n"
     * @generated
     * @ordered
     */
    public static final int N_VALUE = 9;

    /**
     * The '<em><b>C</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>C</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #C
     * @model name="c"
     * @generated
     * @ordered
     */
    public static final int C_VALUE = 10;

    /**
     * The '<em><b>D</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>D</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #D
     * @model name="d"
     * @generated
     * @ordered
     */
    public static final int D_VALUE = 11;

    /**
     * The '<em><b>Da</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Da</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DA
     * @model name="da"
     * @generated
     * @ordered
     */
    public static final int DA_VALUE = 12;

    /**
     * The '<em><b>H</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>H</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #H
     * @model name="h"
     * @generated
     * @ordered
     */
    public static final int H_VALUE = 13;

    /**
     * The '<em><b>G</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>G</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #G
     * @model
     * @generated
     * @ordered
     */
    public static final int G_VALUE = 14;

    /**
     * The '<em><b>T</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>T</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #T
     * @model
     * @generated
     * @ordered
     */
    public static final int T_VALUE = 15;

    /**
     * The '<em><b>P</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>P</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #P
     * @model
     * @generated
     * @ordered
     */
    public static final int P_VALUE = 16;

    /**
     * The '<em><b>E</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>E</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #E
     * @model
     * @generated
     * @ordered
     */
    public static final int E_VALUE = 17;

    /**
     * The '<em><b>Z</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Z</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #Z
     * @model
     * @generated
     * @ordered
     */
    public static final int Z_VALUE = 18;

    /**
     * The '<em><b>Y</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Y</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #Y
     * @model
     * @generated
     * @ordered
     */
    public static final int Y_VALUE = 19;

    /**
     * The '<em><b>None</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NONE
     * @model name="None"
     * @generated
     * @ordered
     */
    public static final int NONE_VALUE = 20;

    /**
     * An array of all the '<em><b>Unit Multiplier Enum</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final UnitMultiplierEnum[] VALUES_ARRAY = new UnitMultiplierEnum[] {
            MILLI,
            K,
            M,
            MU,
            YOCTO,
            ZEPTO,
            A,
            F,
            PICO,
            N,
            C,
            D,
            DA,
            H,
            G,
            T,
            P,
            E,
            Z,
            Y,
            NONE,
        };

    /**
     * A public read-only list of all the '<em><b>Unit Multiplier Enum</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<UnitMultiplierEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Unit Multiplier Enum</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static UnitMultiplierEnum get( String literal ) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            UnitMultiplierEnum result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Unit Multiplier Enum</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static UnitMultiplierEnum getByName( String name ) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            UnitMultiplierEnum result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Unit Multiplier Enum</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static UnitMultiplierEnum get( int value ) {
        switch (value) {
            case MILLI_VALUE: return MILLI;
            case K_VALUE: return K;
            case M_VALUE: return M;
            case MU_VALUE: return MU;
            case YOCTO_VALUE: return YOCTO;
            case ZEPTO_VALUE: return ZEPTO;
            case A_VALUE: return A;
            case F_VALUE: return F;
            case PICO_VALUE: return PICO;
            case N_VALUE: return N;
            case C_VALUE: return C;
            case D_VALUE: return D;
            case DA_VALUE: return DA;
            case H_VALUE: return H;
            case G_VALUE: return G;
            case T_VALUE: return T;
            case P_VALUE: return P;
            case E_VALUE: return E;
            case Z_VALUE: return Z;
            case Y_VALUE: return Y;
            case NONE_VALUE: return NONE;
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
    private UnitMultiplierEnum( int value, String name, String literal ) {
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

} //UnitMultiplierEnum
