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
 * A representation of the model object '<em><b>Abstract Data Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataObject#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataObject#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataObject#getRefersToDOType <em>Refers To DO Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataObject#getReferredByExtRef <em>Referred By Ext Ref</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAbstractDataObject()
 * @model abstract="true"
 * @generated
 */
public interface AbstractDataObject extends UnNaming {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #setName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAbstractDataObject_Name()
     * @model unsettable="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataObject#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #getName()
     * @generated
     */
    void setName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataObject#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    void unsetName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataObject#getName <em>Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Name</em>' attribute is set.
     * @see #unsetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    boolean isSetName();

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAbstractDataObject_Type()
     * @model unsettable="true"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataObject#getType <em>Type</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataObject#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(String)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataObject#getType <em>Type</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Refers To DO Type</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getReferredByAbstractDataObject <em>Referred By Abstract Data Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To DO Type</em>' reference.
     * @see #isSetRefersToDOType()
     * @see #unsetRefersToDOType()
     * @see #setRefersToDOType(DOType)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAbstractDataObject_RefersToDOType()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getReferredByAbstractDataObject
     * @model opposite="ReferredByAbstractDataObject" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    DOType getRefersToDOType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataObject#getRefersToDOType <em>Refers To DO Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To DO Type</em>' reference.
     * @see #isSetRefersToDOType()
     * @see #unsetRefersToDOType()
     * @see #getRefersToDOType()
     * @generated
     */
    void setRefersToDOType( DOType value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataObject#getRefersToDOType <em>Refers To DO Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToDOType()
     * @see #getRefersToDOType()
     * @see #setRefersToDOType(DOType)
     * @generated
     */
    void unsetRefersToDOType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataObject#getRefersToDOType <em>Refers To DO Type</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To DO Type</em>' reference is set.
     * @see #unsetRefersToDOType()
     * @see #getRefersToDOType()
     * @see #setRefersToDOType(DOType)
     * @generated
     */
    boolean isSetRefersToDOType();

    /**
     * Returns the value of the '<em><b>Referred By Ext Ref</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getRefersToAbstractDataObject <em>Refers To Abstract Data Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Ext Ref</em>' reference list.
     * @see #isSetReferredByExtRef()
     * @see #unsetReferredByExtRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAbstractDataObject_ReferredByExtRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getRefersToAbstractDataObject
     * @model opposite="RefersToAbstractDataObject" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< ExtRef > getReferredByExtRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataObject#getReferredByExtRef <em>Referred By Ext Ref</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByExtRef()
     * @see #getReferredByExtRef()
     * @generated
     */
    void unsetReferredByExtRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataObject#getReferredByExtRef <em>Referred By Ext Ref</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Ext Ref</em>' reference list is set.
     * @see #unsetReferredByExtRef()
     * @see #getReferredByExtRef()
     * @generated
     */
    boolean isSetReferredByExtRef();

} // AbstractDataObject
