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

import org.eclipse.emf.ecore.util.FeatureMap;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IED;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LDevice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getInst <em>Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getLdName <em>Ld Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getReferredByControlBlock <em>Referred By Control Block</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getAccessControl <em>Access Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getServer <em>Server</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getLNode <em>LNode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getAnyLN <em>Any LN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getLN0 <em>LN0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getLN <em>LN</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLDevice()
 * @model
 * @generated
 */
public interface LDevice extends UnNaming {
    /**
     * Returns the value of the '<em><b>Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Inst</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Inst</em>' attribute.
     * @see #isSetInst()
     * @see #unsetInst()
     * @see #setInst(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLDevice_Inst()
     * @model unsettable="true"
     * @generated
     */
    String getInst();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getInst <em>Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Inst</em>' attribute.
     * @see #isSetInst()
     * @see #unsetInst()
     * @see #getInst()
     * @generated
     */
    void setInst( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getInst <em>Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInst()
     * @see #getInst()
     * @see #setInst(String)
     * @generated
     */
    void unsetInst();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getInst <em>Inst</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Inst</em>' attribute is set.
     * @see #unsetInst()
     * @see #getInst()
     * @see #setInst(String)
     * @generated
     */
    boolean isSetInst();

    /**
     * Returns the value of the '<em><b>Ld Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ld Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ld Name</em>' attribute.
     * @see #isSetLdName()
     * @see #unsetLdName()
     * @see #setLdName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLDevice_LdName()
     * @model unsettable="true"
     * @generated
     */
    String getLdName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getLdName <em>Ld Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ld Name</em>' attribute.
     * @see #isSetLdName()
     * @see #unsetLdName()
     * @see #getLdName()
     * @generated
     */
    void setLdName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getLdName <em>Ld Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLdName()
     * @see #getLdName()
     * @see #setLdName(String)
     * @generated
     */
    void unsetLdName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getLdName <em>Ld Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ld Name</em>' attribute is set.
     * @see #unsetLdName()
     * @see #getLdName()
     * @see #setLdName(String)
     * @generated
     */
    boolean isSetLdName();

    /**
     * Returns the value of the '<em><b>Referred By Control Block</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock#getRefersToLDevice <em>Refers To LDevice</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referred By Control Block</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Control Block</em>' reference list.
     * @see #isSetReferredByControlBlock()
     * @see #unsetReferredByControlBlock()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLDevice_ReferredByControlBlock()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock#getRefersToLDevice
     * @model opposite="RefersToLDevice" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList<ControlBlock> getReferredByControlBlock();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getReferredByControlBlock <em>Referred By Control Block</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByControlBlock()
     * @see #getReferredByControlBlock()
     * @generated
     */
    void unsetReferredByControlBlock();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getReferredByControlBlock <em>Referred By Control Block</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Control Block</em>' reference list is set.
     * @see #unsetReferredByControlBlock()
     * @see #getReferredByControlBlock()
     * @generated
     */
    boolean isSetReferredByControlBlock();

    /**
     * Returns the value of the '<em><b>Access Control</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessControl#getLDevice <em>LDevice</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Access Control</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Access Control</em>' containment reference.
     * @see #isSetAccessControl()
     * @see #unsetAccessControl()
     * @see #setAccessControl(AccessControl)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLDevice_AccessControl()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessControl#getLDevice
     * @model opposite="LDevice" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    AccessControl getAccessControl();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getAccessControl <em>Access Control</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Access Control</em>' containment reference.
     * @see #isSetAccessControl()
     * @see #unsetAccessControl()
     * @see #getAccessControl()
     * @generated
     */
    void setAccessControl( AccessControl value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getAccessControl <em>Access Control</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAccessControl()
     * @see #getAccessControl()
     * @see #setAccessControl(AccessControl)
     * @generated
     */
    void unsetAccessControl();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getAccessControl <em>Access Control</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Access Control</em>' containment reference is set.
     * @see #unsetAccessControl()
     * @see #getAccessControl()
     * @see #setAccessControl(AccessControl)
     * @generated
     */
    boolean isSetAccessControl();

    /**
     * Returns the value of the '<em><b>Server</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getLDevice <em>LDevice</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Server</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Server</em>' container reference.
     * @see #setServer(Server)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLDevice_Server()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getLDevice
     * @model opposite="LDevice" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    Server getServer();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getServer <em>Server</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Server</em>' container reference.
     * @see #getServer()
     * @generated
     */
    void setServer( Server value );

    /**
     * Returns the value of the '<em><b>LNode</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLDevice <em>LDevice</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>LNode</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>LNode</em>' reference list.
     * @see #isSetLNode()
     * @see #unsetLNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLDevice_LNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLDevice
     * @model opposite="LDevice" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList<LNode> getLNode();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getLNode <em>LNode</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLNode()
     * @see #getLNode()
     * @generated
     */
    void unsetLNode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getLNode <em>LNode</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>LNode</em>' reference list is set.
     * @see #unsetLNode()
     * @see #getLNode()
     * @generated
     */
    boolean isSetLNode();

    /**
     * Returns the value of the '<em><b>Any LN</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Any LN</em>' attribute list.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLDevice_AnyLN()
     * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" ordered="false"
     *        extendedMetaData="kind='group'"
     * @generated
     */
    FeatureMap getAnyLN();

    /**
     * Returns the value of the '<em><b>LN</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN#getLDevice <em>LDevice</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>LN</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>LN</em>' containment reference list.
     * @see #isSetLN()
     * @see #unsetLN()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLDevice_LN()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LN#getLDevice
     * @model opposite="LDevice" containment="true" unsettable="true" volatile="true"
     *        extendedMetaData="group='#AnyLN'"
     * @generated
     */
    EList<LN> getLN();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getLN <em>LN</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLN()
     * @see #getLN()
     * @generated
     */
    void unsetLN();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getLN <em>LN</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>LN</em>' containment reference list is set.
     * @see #unsetLN()
     * @see #getLN()
     * @generated
     */
    boolean isSetLN();

    /**
     * Returns the value of the '<em><b>LN0</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0#getLDevice <em>LDevice</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>LN0</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>LN0</em>' containment reference.
     * @see #isSetLN0()
     * @see #unsetLN0()
     * @see #setLN0(LN0)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLDevice_LN0()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0#getLDevice
     * @model opposite="LDevice" containment="true" unsettable="true" volatile="true"
     *        extendedMetaData="group='#AnyLN'"
     * @generated
     */
    LN0 getLN0();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getLN0 <em>LN0</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>LN0</em>' containment reference.
     * @see #isSetLN0()
     * @see #unsetLN0()
     * @see #getLN0()
     * @generated
     */
    void setLN0( LN0 value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getLN0 <em>LN0</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLN0()
     * @see #getLN0()
     * @see #setLN0(LN0)
     * @generated
     */
    void unsetLN0();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getLN0 <em>LN0</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>LN0</em>' containment reference is set.
     * @see #unsetLN0()
     * @see #getLN0()
     * @see #setLN0(LN0)
     * @generated
     */
    boolean isSetLN0();

    IED getIED();

} // LDevice
