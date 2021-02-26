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
 * A representation of the model object '<em><b>LDevice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getInst <em>Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getLdName <em>Ld Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getAccessControl <em>Access Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getParentServer <em>Parent Server</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getLN0 <em>LN0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getLN <em>LN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getReferredByIEDName <em>Referred By IED Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getRefersToHigherLevelLDevice <em>Refers To Higher Level LDevice</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getRefersToLowerLevelLDevices <em>Refers To Lower Level LDevices</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLDevice()
 * @model
 * @generated
 */
public interface LDevice extends UnNaming, INamespaceGetter {
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
     * Returns the value of the '<em><b>Access Control</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessControl#getParentLDevice <em>Parent LDevice</em>}'.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessControl#getParentLDevice
     * @model opposite="ParentLDevice" containment="true" unsettable="true" ordered="false"
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
     * Returns the value of the '<em><b>Parent Server</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getLDevice <em>LDevice</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Server</em>' container reference.
     * @see #setParentServer(Server)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLDevice_ParentServer()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getLDevice
     * @model opposite="LDevice" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    Server getParentServer();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getParentServer <em>Parent Server</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Server</em>' container reference.
     * @see #getParentServer()
     * @generated
     */
    void setParentServer( Server value );

    /**
     * Returns the value of the '<em><b>LN</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN#getParentLDevice <em>Parent LDevice</em>}'.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LN#getParentLDevice
     * @model opposite="ParentLDevice" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList< LN > getLN();

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
     * Returns the value of the '<em><b>Referred By IED Name</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDName#getRefersToLDevice <em>Refers To LDevice</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By IED Name</em>' reference.
     * @see #isSetReferredByIEDName()
     * @see #unsetReferredByIEDName()
     * @see #setReferredByIEDName(IEDName)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLDevice_ReferredByIEDName()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDName#getRefersToLDevice
     * @model opposite="RefersToLDevice" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    IEDName getReferredByIEDName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getReferredByIEDName <em>Referred By IED Name</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Referred By IED Name</em>' reference.
     * @see #isSetReferredByIEDName()
     * @see #unsetReferredByIEDName()
     * @see #getReferredByIEDName()
     * @generated
     */
    void setReferredByIEDName( IEDName value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getReferredByIEDName <em>Referred By IED Name</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByIEDName()
     * @see #getReferredByIEDName()
     * @see #setReferredByIEDName(IEDName)
     * @generated
     */
    void unsetReferredByIEDName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getReferredByIEDName <em>Referred By IED Name</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By IED Name</em>' reference is set.
     * @see #unsetReferredByIEDName()
     * @see #getReferredByIEDName()
     * @see #setReferredByIEDName(IEDName)
     * @generated
     */
    boolean isSetReferredByIEDName();

    /**
     * Returns the value of the '<em><b>Refers To Higher Level LDevice</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getRefersToLowerLevelLDevices <em>Refers To Lower Level LDevices</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Higher Level LDevice</em>' reference.
     * @see #isSetRefersToHigherLevelLDevice()
     * @see #unsetRefersToHigherLevelLDevice()
     * @see #setRefersToHigherLevelLDevice(LDevice)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLDevice_RefersToHigherLevelLDevice()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getRefersToLowerLevelLDevices
     * @model opposite="RefersToLowerLevelLDevices" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    LDevice getRefersToHigherLevelLDevice();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getRefersToHigherLevelLDevice <em>Refers To Higher Level LDevice</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Higher Level LDevice</em>' reference.
     * @see #isSetRefersToHigherLevelLDevice()
     * @see #unsetRefersToHigherLevelLDevice()
     * @see #getRefersToHigherLevelLDevice()
     * @generated
     */
    void setRefersToHigherLevelLDevice( LDevice value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getRefersToHigherLevelLDevice <em>Refers To Higher Level LDevice</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToHigherLevelLDevice()
     * @see #getRefersToHigherLevelLDevice()
     * @see #setRefersToHigherLevelLDevice(LDevice)
     * @generated
     */
    void unsetRefersToHigherLevelLDevice();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getRefersToHigherLevelLDevice <em>Refers To Higher Level LDevice</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Higher Level LDevice</em>' reference is set.
     * @see #unsetRefersToHigherLevelLDevice()
     * @see #getRefersToHigherLevelLDevice()
     * @see #setRefersToHigherLevelLDevice(LDevice)
     * @generated
     */
    boolean isSetRefersToHigherLevelLDevice();

    /**
     * Returns the value of the '<em><b>Refers To Lower Level LDevices</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getRefersToHigherLevelLDevice <em>Refers To Higher Level LDevice</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Lower Level LDevices</em>' reference list.
     * @see #isSetRefersToLowerLevelLDevices()
     * @see #unsetRefersToLowerLevelLDevices()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLDevice_RefersToLowerLevelLDevices()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getRefersToHigherLevelLDevice
     * @model opposite="RefersToHigherLevelLDevice" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< LDevice > getRefersToLowerLevelLDevices();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getRefersToLowerLevelLDevices <em>Refers To Lower Level LDevices</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToLowerLevelLDevices()
     * @see #getRefersToLowerLevelLDevices()
     * @generated
     */
    void unsetRefersToLowerLevelLDevices();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getRefersToLowerLevelLDevices <em>Refers To Lower Level LDevices</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Lower Level LDevices</em>' reference list is set.
     * @see #unsetRefersToLowerLevelLDevices()
     * @see #getRefersToLowerLevelLDevices()
     * @generated
     */
    boolean isSetRefersToLowerLevelLDevices();

    /**
     * Returns the value of the '<em><b>LN0</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0#getParentLDevice <em>Parent LDevice</em>}'.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0#getParentLDevice
     * @model opposite="ParentLDevice" containment="true" unsettable="true" ordered="false"
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
