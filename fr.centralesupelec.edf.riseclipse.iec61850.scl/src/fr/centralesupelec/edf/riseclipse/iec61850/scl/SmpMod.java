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
 * A representation of the literals of the enumeration '<em><b>Smp Mod</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSmpMod()
 * @model
 * @generated
 */
public enum SmpMod implements Enumerator {
    /**
     * The '<em><b>Smp Per Period</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SMP_PER_PERIOD_VALUE
     * @generated
     * @ordered
     */
    SMP_PER_PERIOD( 0, "SmpPerPeriod", "SmpPerPeriod" ),

    /**
     * The '<em><b>Smp Per Sec</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SMP_PER_SEC_VALUE
     * @generated
     * @ordered
     */
    SMP_PER_SEC( 1, "SmpPerSec", "SmpPerSec" ),

    /**
     * The '<em><b>Sec Per Smp</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SEC_PER_SMP_VALUE
     * @generated
     * @ordered
     */
    SEC_PER_SMP( 2, "SecPerSmp", "SecPerSmp" );

    /**
     * The '<em><b>Smp Per Period</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Smp Per Period</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SMP_PER_PERIOD
     * @model name="SmpPerPeriod"
     * @generated
     * @ordered
     */
    public static final int SMP_PER_PERIOD_VALUE = 0;

    /**
     * The '<em><b>Smp Per Sec</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Smp Per Sec</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SMP_PER_SEC
     * @model name="SmpPerSec"
     * @generated
     * @ordered
     */
    public static final int SMP_PER_SEC_VALUE = 1;

    /**
     * The '<em><b>Sec Per Smp</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Sec Per Smp</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SEC_PER_SMP
     * @model name="SecPerSmp"
     * @generated
     * @ordered
     */
    public static final int SEC_PER_SMP_VALUE = 2;

    /**
     * An array of all the '<em><b>Smp Mod</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final SmpMod[] VALUES_ARRAY = new SmpMod[] {
            SMP_PER_PERIOD,
            SMP_PER_SEC,
            SEC_PER_SMP,
        };

    /**
     * A public read-only list of all the '<em><b>Smp Mod</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<SmpMod> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Smp Mod</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static SmpMod get( String literal ) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            SmpMod result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Smp Mod</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static SmpMod getByName( String name ) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            SmpMod result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Smp Mod</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static SmpMod get( int value ) {
        switch (value) {
            case SMP_PER_PERIOD_VALUE: return SMP_PER_PERIOD;
            case SMP_PER_SEC_VALUE: return SMP_PER_SEC;
            case SEC_PER_SMP_VALUE: return SEC_PER_SMP;
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
    private SmpMod( int value, String name, String literal ) {
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

} //SmpMod
