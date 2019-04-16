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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Data Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getBType <em>BType</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getCount <em>Count</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getSAddr <em>SAddr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getValImport <em>Val Import</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getValKind <em>Val Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getRefersToEnumType <em>Refers To Enum Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getVal <em>Val</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getRefersToDAType <em>Refers To DA Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getReferredByFCDA <em>Referred By FCDA</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getReferredByExtRef <em>Referred By Ext Ref</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAbstractDataAttribute()
 * @model abstract="true"
 * @generated
 */
public interface AbstractDataAttribute extends DataAttribute {
    /**
     * Returns the value of the '<em><b>BType</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>BType</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>BType</em>' attribute.
     * @see #isSetBType()
     * @see #unsetBType()
     * @see #setBType(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAbstractDataAttribute_BType()
     * @model unsettable="true"
     * @generated
     */
    String getBType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getBType <em>BType</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>BType</em>' attribute.
     * @see #isSetBType()
     * @see #unsetBType()
     * @see #getBType()
     * @generated
     */
    void setBType( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getBType <em>BType</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBType()
     * @see #getBType()
     * @see #setBType(String)
     * @generated
     */
    void unsetBType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getBType <em>BType</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>BType</em>' attribute is set.
     * @see #unsetBType()
     * @see #getBType()
     * @see #setBType(String)
     * @generated
     */
    boolean isSetBType();

    /**
     * Returns the value of the '<em><b>Count</b></em>' attribute.
     * The default value is <code>"0"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Count</em>' attribute.
     * @see #isSetCount()
     * @see #unsetCount()
     * @see #setCount(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAbstractDataAttribute_Count()
     * @model default="0" unsettable="true"
     * @generated
     */
    String getCount();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getCount <em>Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Count</em>' attribute.
     * @see #isSetCount()
     * @see #unsetCount()
     * @see #getCount()
     * @generated
     */
    void setCount(String value);

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getCount <em>Count</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetCount()
     * @see #getCount()
     * @see #setCount(String)
     * @generated
     */
    void unsetCount();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getCount <em>Count</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Count</em>' attribute is set.
     * @see #unsetCount()
     * @see #getCount()
     * @see #setCount(String)
     * @generated
     */
    boolean isSetCount();

    /**
     * Returns the value of the '<em><b>SAddr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SAddr</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SAddr</em>' attribute.
     * @see #isSetSAddr()
     * @see #unsetSAddr()
     * @see #setSAddr(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAbstractDataAttribute_SAddr()
     * @model unsettable="true"
     * @generated
     */
    String getSAddr();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getSAddr <em>SAddr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SAddr</em>' attribute.
     * @see #isSetSAddr()
     * @see #unsetSAddr()
     * @see #getSAddr()
     * @generated
     */
    void setSAddr( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getSAddr <em>SAddr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSAddr()
     * @see #getSAddr()
     * @see #setSAddr(String)
     * @generated
     */
    void unsetSAddr();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getSAddr <em>SAddr</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>SAddr</em>' attribute is set.
     * @see #unsetSAddr()
     * @see #getSAddr()
     * @see #setSAddr(String)
     * @generated
     */
    boolean isSetSAddr();

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAbstractDataAttribute_Type()
     * @model unsettable="true"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     * @generated
     */
    void setType( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(String)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getType <em>Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type</em>' attribute is set.
     * @see #unsetType()
     * @see #getType()
     * @see #setType(String)
     * @generated
     */
    boolean isSetType();

    /**
     * Returns the value of the '<em><b>Val Import</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Val Import</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Val Import</em>' attribute.
     * @see #isSetValImport()
     * @see #unsetValImport()
     * @see #setValImport(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAbstractDataAttribute_ValImport()
     * @model default="false" unsettable="true"
     * @generated
     */
    Boolean getValImport();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getValImport <em>Val Import</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @param value the new value of the '<em>Val Import</em>' attribute.
     * @see #isSetValImport()
     * @see #unsetValImport()
     * @see #getValImport()
     * @generated
     */
    void setValImport( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getValImport <em>Val Import</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetValImport()
     * @see #getValImport()
     * @see #setValImport(Boolean)
     * @generated
     */
    void unsetValImport();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getValImport <em>Val Import</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Val Import</em>' attribute is set.
     * @see #unsetValImport()
     * @see #getValImport()
     * @see #setValImport(Boolean)
     * @generated
     */
    boolean isSetValImport();

    /**
     * Returns the value of the '<em><b>Val Kind</b></em>' attribute.
     * The default value is <code>"Set"</code>.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ValKindEnum}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Val Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Val Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ValKindEnum
     * @see #isSetValKind()
     * @see #unsetValKind()
     * @see #setValKind(ValKindEnum)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAbstractDataAttribute_ValKind()
     * @model default="Set" unsettable="true"
     * @generated
     */
    ValKindEnum getValKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getValKind <em>Val Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Val Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ValKindEnum
     * @see #isSetValKind()
     * @see #unsetValKind()
     * @see #getValKind()
     * @generated
     */
    void setValKind( ValKindEnum value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getValKind <em>Val Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetValKind()
     * @see #getValKind()
     * @see #setValKind(ValKindEnum)
     * @generated
     */
    void unsetValKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getValKind <em>Val Kind</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Val Kind</em>' attribute is set.
     * @see #unsetValKind()
     * @see #getValKind()
     * @see #setValKind(ValKindEnum)
     * @generated
     */
    boolean isSetValKind();

    /**
     * Returns the value of the '<em><b>Refers To Enum Type</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumType#getReferredByAbstractDataAttribute <em>Referred By Abstract Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Refers To Enum Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Enum Type</em>' reference.
     * @see #isSetRefersToEnumType()
     * @see #unsetRefersToEnumType()
     * @see #setRefersToEnumType(EnumType)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAbstractDataAttribute_RefersToEnumType()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumType#getReferredByAbstractDataAttribute
     * @model opposite="ReferredByAbstractDataAttribute" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    EnumType getRefersToEnumType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getRefersToEnumType <em>Refers To Enum Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Enum Type</em>' reference.
     * @see #isSetRefersToEnumType()
     * @see #unsetRefersToEnumType()
     * @see #getRefersToEnumType()
     * @generated
     */
    void setRefersToEnumType(EnumType value);

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getRefersToEnumType <em>Refers To Enum Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToEnumType()
     * @see #getRefersToEnumType()
     * @see #setRefersToEnumType(EnumType)
     * @generated
     */
    void unsetRefersToEnumType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getRefersToEnumType <em>Refers To Enum Type</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Enum Type</em>' reference is set.
     * @see #unsetRefersToEnumType()
     * @see #getRefersToEnumType()
     * @see #setRefersToEnumType(EnumType)
     * @generated
     */
    boolean isSetRefersToEnumType();

    /**
     * Returns the value of the '<em><b>Val</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Val}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Val#getAbstractDataAttribute <em>Abstract Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Val</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Val</em>' containment reference list.
     * @see #isSetVal()
     * @see #unsetVal()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAbstractDataAttribute_Val()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Val#getAbstractDataAttribute
     * @model opposite="AbstractDataAttribute" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList<Val> getVal();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getVal <em>Val</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVal()
     * @see #getVal()
     * @generated
     */
    void unsetVal();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getVal <em>Val</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Val</em>' containment reference list is set.
     * @see #unsetVal()
     * @see #getVal()
     * @generated
     */
    boolean isSetVal();

    /**
     * Returns the value of the '<em><b>Refers To DA Type</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getReferredByAbstractDataAttribute <em>Referred By Abstract Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To DA Type</em>' reference.
     * @see #isSetRefersToDAType()
     * @see #unsetRefersToDAType()
     * @see #setRefersToDAType(DAType)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAbstractDataAttribute_RefersToDAType()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getReferredByAbstractDataAttribute
     * @model opposite="ReferredByAbstractDataAttribute" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    DAType getRefersToDAType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getRefersToDAType <em>Refers To DA Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To DA Type</em>' reference.
     * @see #isSetRefersToDAType()
     * @see #unsetRefersToDAType()
     * @see #getRefersToDAType()
     * @generated
     */
    void setRefersToDAType(DAType value);

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getRefersToDAType <em>Refers To DA Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToDAType()
     * @see #getRefersToDAType()
     * @see #setRefersToDAType(DAType)
     * @generated
     */
    void unsetRefersToDAType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getRefersToDAType <em>Refers To DA Type</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To DA Type</em>' reference is set.
     * @see #unsetRefersToDAType()
     * @see #getRefersToDAType()
     * @see #setRefersToDAType(DAType)
     * @generated
     */
    boolean isSetRefersToDAType();

    /**
     * Returns the value of the '<em><b>Referred By FCDA</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getRefersToAbstractDataAttribute <em>Refers To Abstract Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By FCDA</em>' reference list.
     * @see #isSetReferredByFCDA()
     * @see #unsetReferredByFCDA()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAbstractDataAttribute_ReferredByFCDA()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getRefersToAbstractDataAttribute
     * @model opposite="RefersToAbstractDataAttribute" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList<FCDA> getReferredByFCDA();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getReferredByFCDA <em>Referred By FCDA</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByFCDA()
     * @see #getReferredByFCDA()
     * @generated
     */
    void unsetReferredByFCDA();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getReferredByFCDA <em>Referred By FCDA</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By FCDA</em>' reference list is set.
     * @see #unsetReferredByFCDA()
     * @see #getReferredByFCDA()
     * @generated
     */
    boolean isSetReferredByFCDA();

    /**
     * Returns the value of the '<em><b>Referred By Ext Ref</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getRefersToAbstractDataAttribute <em>Refers To Abstract Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Ext Ref</em>' reference list.
     * @see #isSetReferredByExtRef()
     * @see #unsetReferredByExtRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAbstractDataAttribute_ReferredByExtRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getRefersToAbstractDataAttribute
     * @model opposite="RefersToAbstractDataAttribute" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList<ExtRef> getReferredByExtRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getReferredByExtRef <em>Referred By Ext Ref</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByExtRef()
     * @see #getReferredByExtRef()
     * @generated
     */
    void unsetReferredByExtRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getReferredByExtRef <em>Referred By Ext Ref</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Ext Ref</em>' reference list is set.
     * @see #unsetReferredByExtRef()
     * @see #getReferredByExtRef()
     * @generated
     */
    boolean isSetReferredByExtRef();

} // AbstractDataAttribute
