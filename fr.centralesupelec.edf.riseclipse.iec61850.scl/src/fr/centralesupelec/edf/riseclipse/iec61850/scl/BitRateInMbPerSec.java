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

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bit Rate In Mb Per Sec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BitRateInMbPerSec#getValue <em>Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BitRateInMbPerSec#getMultiplier <em>Multiplier</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BitRateInMbPerSec#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getBitRateInMbPerSec()
 * @model extendedMetaData="kind='simple'"
 * @generated
 */
public interface BitRateInMbPerSec extends SclObject {

    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(BigDecimal)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getBitRateInMbPerSec_Value()
     * @model required="true"
     *        extendedMetaData="kind='simple'"
     * @generated
     */
    BigDecimal getValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BitRateInMbPerSec#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue( BigDecimal value );

    /**
     * Returns the value of the '<em><b>Multiplier</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.UnitMultiplierEnum}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Multiplier</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Multiplier</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.UnitMultiplierEnum
     * @see #isSetMultiplier()
     * @see #unsetMultiplier()
     * @see #setMultiplier(UnitMultiplierEnum)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getBitRateInMbPerSec_Multiplier()
     * @model unsettable="true"
     * @generated
     */
    UnitMultiplierEnum getMultiplier();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BitRateInMbPerSec#getMultiplier <em>Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Multiplier</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.UnitMultiplierEnum
     * @see #isSetMultiplier()
     * @see #unsetMultiplier()
     * @see #getMultiplier()
     * @generated
     */
    void setMultiplier( UnitMultiplierEnum value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BitRateInMbPerSec#getMultiplier <em>Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMultiplier()
     * @see #getMultiplier()
     * @see #setMultiplier(UnitMultiplierEnum)
     * @generated
     */
    void unsetMultiplier();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BitRateInMbPerSec#getMultiplier <em>Multiplier</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Multiplier</em>' attribute is set.
     * @see #unsetMultiplier()
     * @see #getMultiplier()
     * @see #setMultiplier(UnitMultiplierEnum)
     * @generated
     */
    boolean isSetMultiplier();

    /**
     * Returns the value of the '<em><b>Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Unit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Unit</em>' attribute.
     * @see #isSetUnit()
     * @see #unsetUnit()
     * @see #setUnit(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getBitRateInMbPerSec_Unit()
     * @model unsettable="true"
     * @generated
     */
    String getUnit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BitRateInMbPerSec#getUnit <em>Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Unit</em>' attribute.
     * @see #isSetUnit()
     * @see #unsetUnit()
     * @see #getUnit()
     * @generated
     */
    void setUnit( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BitRateInMbPerSec#getUnit <em>Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUnit()
     * @see #getUnit()
     * @see #setUnit(String)
     * @generated
     */
    void unsetUnit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BitRateInMbPerSec#getUnit <em>Unit</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Unit</em>' attribute is set.
     * @see #unsetUnit()
     * @see #getUnit()
     * @see #setUnit(String)
     * @generated
     */
    boolean isSetUnit();

} // BitRateInMbPerSec
