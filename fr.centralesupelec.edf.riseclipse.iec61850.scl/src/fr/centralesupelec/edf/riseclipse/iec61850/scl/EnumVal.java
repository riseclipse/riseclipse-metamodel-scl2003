/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
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
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.iec61850.scl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Val</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumVal#getOrd <em>Ord</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumVal#getParentEnumType <em>Parent Enum Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumVal#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getEnumVal()
 * @model extendedMetaData="kind='simple'"
 * @generated
 */
public interface EnumVal extends SclObject, AgDesc {
    /**
     * Returns the value of the '<em><b>Ord</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ord</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ord</em>' attribute.
     * @see #isSetOrd()
     * @see #unsetOrd()
     * @see #setOrd(Integer)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getEnumVal_Ord()
     * @model unsettable="true"
     * @generated
     */
    Integer getOrd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumVal#getOrd <em>Ord</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ord</em>' attribute.
     * @see #isSetOrd()
     * @see #unsetOrd()
     * @see #getOrd()
     * @generated
     */
    void setOrd( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumVal#getOrd <em>Ord</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetOrd()
     * @see #getOrd()
     * @see #setOrd(Integer)
     * @generated
     */
    void unsetOrd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumVal#getOrd <em>Ord</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ord</em>' attribute is set.
     * @see #unsetOrd()
     * @see #getOrd()
     * @see #setOrd(Integer)
     * @generated
     */
    boolean isSetOrd();

    /**
     * Returns the value of the '<em><b>Parent Enum Type</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumType#getEnumVal <em>Enum Val</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Enum Type</em>' container reference.
     * @see #setParentEnumType(EnumType)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getEnumVal_ParentEnumType()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumType#getEnumVal
     * @model opposite="EnumVal" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    EnumType getParentEnumType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumVal#getParentEnumType <em>Parent Enum Type</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Enum Type</em>' container reference.
     * @see #getParentEnumType()
     * @generated
     */
    void setParentEnumType( EnumType value );

    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Value</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getEnumVal_Value()
     * @model default="" required="true"
     *        extendedMetaData="kind='simple'"
     * @generated
     */
    String getValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumVal#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue( String value );

} // EnumVal
