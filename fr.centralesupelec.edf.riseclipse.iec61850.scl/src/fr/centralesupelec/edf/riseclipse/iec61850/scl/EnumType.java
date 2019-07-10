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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumType#getReferredByAbstractDataAttribute <em>Referred By Abstract Data Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumType#getParentDataTypeTemplates <em>Parent Data Type Templates</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumType#getEnumVal <em>Enum Val</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getEnumType()
 * @model
 * @generated
 */
public interface EnumType extends IDNaming {
    /**
     * Returns the value of the '<em><b>Referred By Abstract Data Attribute</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getRefersToEnumType <em>Refers To Enum Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referred By Abstract Data Attribute</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Abstract Data Attribute</em>' reference list.
     * @see #isSetReferredByAbstractDataAttribute()
     * @see #unsetReferredByAbstractDataAttribute()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getEnumType_ReferredByAbstractDataAttribute()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getRefersToEnumType
     * @model opposite="RefersToEnumType" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< AbstractDataAttribute > getReferredByAbstractDataAttribute();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumType#getReferredByAbstractDataAttribute <em>Referred By Abstract Data Attribute</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByAbstractDataAttribute()
     * @see #getReferredByAbstractDataAttribute()
     * @generated
     */
    void unsetReferredByAbstractDataAttribute();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumType#getReferredByAbstractDataAttribute <em>Referred By Abstract Data Attribute</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Abstract Data Attribute</em>' reference list is set.
     * @see #unsetReferredByAbstractDataAttribute()
     * @see #getReferredByAbstractDataAttribute()
     * @generated
     */
    boolean isSetReferredByAbstractDataAttribute();

    /**
     * Returns the value of the '<em><b>Parent Data Type Templates</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates#getEnumType <em>Enum Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Data Type Templates</em>' container reference.
     * @see #setParentDataTypeTemplates(DataTypeTemplates)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getEnumType_ParentDataTypeTemplates()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates#getEnumType
     * @model opposite="EnumType" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    DataTypeTemplates getParentDataTypeTemplates();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumType#getParentDataTypeTemplates <em>Parent Data Type Templates</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Data Type Templates</em>' container reference.
     * @see #getParentDataTypeTemplates()
     * @generated
     */
    void setParentDataTypeTemplates( DataTypeTemplates value );

    /**
     * Returns the value of the '<em><b>Enum Val</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumVal}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumVal#getParentEnumType <em>Parent Enum Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Enum Val</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Enum Val</em>' containment reference list.
     * @see #isSetEnumVal()
     * @see #unsetEnumVal()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getEnumType_EnumVal()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumVal#getParentEnumType
     * @model opposite="ParentEnumType" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList< EnumVal > getEnumVal();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumType#getEnumVal <em>Enum Val</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnumVal()
     * @see #getEnumVal()
     * @generated
     */
    void unsetEnumVal();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumType#getEnumVal <em>Enum Val</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Enum Val</em>' containment reference list is set.
     * @see #unsetEnumVal()
     * @see #getEnumVal()
     * @generated
     */
    boolean isSetEnumVal();

} // EnumType
