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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DA Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getIedType <em>Ied Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getBDA <em>BDA</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getReferredByAbstractDataAttribute <em>Referred By Abstract Data Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getParentDataTypeTemplates <em>Parent Data Type Templates</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getProtNs <em>Prot Ns</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDAType()
 * @model
 * @generated
 */
public interface DAType extends IDNaming {
    /**
     * Returns the value of the '<em><b>Ied Type</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ied Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ied Type</em>' attribute.
     * @see #isSetIedType()
     * @see #unsetIedType()
     * @see #setIedType(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDAType_IedType()
     * @model default="" unsettable="true"
     * @generated
     */
    String getIedType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getIedType <em>Ied Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ied Type</em>' attribute.
     * @see #isSetIedType()
     * @see #unsetIedType()
     * @see #getIedType()
     * @generated
     */
    void setIedType( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getIedType <em>Ied Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIedType()
     * @see #getIedType()
     * @see #setIedType(String)
     * @generated
     */
    void unsetIedType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getIedType <em>Ied Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ied Type</em>' attribute is set.
     * @see #unsetIedType()
     * @see #getIedType()
     * @see #setIedType(String)
     * @generated
     */
    boolean isSetIedType();

    /**
     * Returns the value of the '<em><b>BDA</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BDA}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BDA#getParentDAType <em>Parent DA Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>BDA</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>BDA</em>' containment reference list.
     * @see #isSetBDA()
     * @see #unsetBDA()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDAType_BDA()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.BDA#getParentDAType
     * @model opposite="ParentDAType" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList< BDA > getBDA();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getBDA <em>BDA</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBDA()
     * @see #getBDA()
     * @generated
     */
    void unsetBDA();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getBDA <em>BDA</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>BDA</em>' containment reference list is set.
     * @see #unsetBDA()
     * @see #getBDA()
     * @generated
     */
    boolean isSetBDA();

    /**
     * Returns the value of the '<em><b>Referred By Abstract Data Attribute</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getRefersToDAType <em>Refers To DA Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Abstract Data Attribute</em>' reference list.
     * @see #isSetReferredByAbstractDataAttribute()
     * @see #unsetReferredByAbstractDataAttribute()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDAType_ReferredByAbstractDataAttribute()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getRefersToDAType
     * @model opposite="RefersToDAType" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< AbstractDataAttribute > getReferredByAbstractDataAttribute();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getReferredByAbstractDataAttribute <em>Referred By Abstract Data Attribute</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByAbstractDataAttribute()
     * @see #getReferredByAbstractDataAttribute()
     * @generated
     */
    void unsetReferredByAbstractDataAttribute();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getReferredByAbstractDataAttribute <em>Referred By Abstract Data Attribute</em>}' reference list is set.
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
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates#getDAType <em>DA Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Data Type Templates</em>' container reference.
     * @see #setParentDataTypeTemplates(DataTypeTemplates)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDAType_ParentDataTypeTemplates()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates#getDAType
     * @model opposite="DAType" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    DataTypeTemplates getParentDataTypeTemplates();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getParentDataTypeTemplates <em>Parent Data Type Templates</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Data Type Templates</em>' container reference.
     * @see #getParentDataTypeTemplates()
     * @generated
     */
    void setParentDataTypeTemplates( DataTypeTemplates value );

    /**
     * Returns the value of the '<em><b>Prot Ns</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ProtNs}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ProtNs#getParentDAType <em>Parent DA Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Prot Ns</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Prot Ns</em>' containment reference list.
     * @see #isSetProtNs()
     * @see #unsetProtNs()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDAType_ProtNs()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ProtNs#getParentDAType
     * @model opposite="ParentDAType" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList< ProtNs > getProtNs();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getProtNs <em>Prot Ns</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetProtNs()
     * @see #getProtNs()
     * @generated
     */
    void unsetProtNs();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getProtNs <em>Prot Ns</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Prot Ns</em>' containment reference list is set.
     * @see #unsetProtNs()
     * @see #getProtNs()
     * @generated
     */
    boolean isSetProtNs();

} // DAType
