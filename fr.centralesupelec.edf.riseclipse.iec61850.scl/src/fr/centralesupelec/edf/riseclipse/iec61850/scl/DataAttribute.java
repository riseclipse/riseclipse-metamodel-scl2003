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
 * A representation of the model object '<em><b>Data Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataAttribute#getReferredByFCDA <em>Referred By FCDA</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataAttribute#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataAttribute#getReferredByExtRef <em>Referred By Ext Ref</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDataAttribute()
 * @model abstract="true"
 * @generated
 */
public interface DataAttribute extends UnNaming {
    /**
     * Returns the value of the '<em><b>Referred By FCDA</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getRefersToDataAttribute <em>Refers To Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referred By FCDA</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By FCDA</em>' reference list.
     * @see #isSetReferredByFCDA()
     * @see #unsetReferredByFCDA()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDataAttribute_ReferredByFCDA()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getRefersToDataAttribute
     * @model opposite="RefersToDataAttribute" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList<FCDA> getReferredByFCDA();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataAttribute#getReferredByFCDA <em>Referred By FCDA</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByFCDA()
     * @see #getReferredByFCDA()
     * @generated
     */
    void unsetReferredByFCDA();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataAttribute#getReferredByFCDA <em>Referred By FCDA</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By FCDA</em>' reference list is set.
     * @see #unsetReferredByFCDA()
     * @see #getReferredByFCDA()
     * @generated
     */
    boolean isSetReferredByFCDA();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #setName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDataAttribute_Name()
     * @model unsettable="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataAttribute#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataAttribute#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    void unsetName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataAttribute#getName <em>Name</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Referred By Ext Ref</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getRefersToDataAttribute <em>Refers To Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referred By Ext Ref</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Ext Ref</em>' reference list.
     * @see #isSetReferredByExtRef()
     * @see #unsetReferredByExtRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDataAttribute_ReferredByExtRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getRefersToDataAttribute
     * @model opposite="RefersToDataAttribute" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList<ExtRef> getReferredByExtRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataAttribute#getReferredByExtRef <em>Referred By Ext Ref</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByExtRef()
     * @see #getReferredByExtRef()
     * @generated
     */
    void unsetReferredByExtRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataAttribute#getReferredByExtRef <em>Referred By Ext Ref</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Ext Ref</em>' reference list is set.
     * @see #unsetReferredByExtRef()
     * @see #getReferredByExtRef()
     * @generated
     */
    boolean isSetReferredByExtRef();

} // DataAttribute
