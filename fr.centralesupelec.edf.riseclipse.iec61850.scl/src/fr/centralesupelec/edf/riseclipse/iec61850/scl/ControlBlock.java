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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock#getCbName <em>Cb Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock#getLdInst <em>Ld Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock#getAddress <em>Address</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock#getRefersToControlWithIEDName <em>Refers To Control With IED Name</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getControlBlock()
 * @model abstract="true"
 * @generated
 */
public interface ControlBlock extends UnNaming {
    /**
     * Returns the value of the '<em><b>Cb Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cb Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cb Name</em>' attribute.
     * @see #isSetCbName()
     * @see #unsetCbName()
     * @see #setCbName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getControlBlock_CbName()
     * @model unsettable="true"
     * @generated
     */
    String getCbName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock#getCbName <em>Cb Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cb Name</em>' attribute.
     * @see #isSetCbName()
     * @see #unsetCbName()
     * @see #getCbName()
     * @generated
     */
    void setCbName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock#getCbName <em>Cb Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCbName()
     * @see #getCbName()
     * @see #setCbName(String)
     * @generated
     */
    void unsetCbName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock#getCbName <em>Cb Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cb Name</em>' attribute is set.
     * @see #unsetCbName()
     * @see #getCbName()
     * @see #setCbName(String)
     * @generated
     */
    boolean isSetCbName();

    /**
     * Returns the value of the '<em><b>Ld Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ld Inst</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ld Inst</em>' attribute.
     * @see #isSetLdInst()
     * @see #unsetLdInst()
     * @see #setLdInst(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getControlBlock_LdInst()
     * @model unsettable="true"
     * @generated
     */
    String getLdInst();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock#getLdInst <em>Ld Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ld Inst</em>' attribute.
     * @see #isSetLdInst()
     * @see #unsetLdInst()
     * @see #getLdInst()
     * @generated
     */
    void setLdInst( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock#getLdInst <em>Ld Inst</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetLdInst()
     * @see #getLdInst()
     * @see #setLdInst(String)
     * @generated
     */
    void unsetLdInst();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock#getLdInst <em>Ld Inst</em>}' attribute is set.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ld Inst</em>' attribute is set.
     * @see #unsetLdInst()
     * @see #getLdInst()
     * @see #setLdInst(String)
     * @generated
     */
    boolean isSetLdInst();

    /**
     * Returns the value of the '<em><b>Address</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Address#getParentControlBlock <em>Parent Control Block</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Address</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Address</em>' containment reference.
     * @see #isSetAddress()
     * @see #unsetAddress()
     * @see #setAddress(Address)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getControlBlock_Address()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Address#getParentControlBlock
     * @model opposite="ParentControlBlock" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    Address getAddress();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock#getAddress <em>Address</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Address</em>' containment reference.
     * @see #isSetAddress()
     * @see #unsetAddress()
     * @see #getAddress()
     * @generated
     */
    void setAddress( Address value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock#getAddress <em>Address</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAddress()
     * @see #getAddress()
     * @see #setAddress(Address)
     * @generated
     */
    void unsetAddress();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock#getAddress <em>Address</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Address</em>' containment reference is set.
     * @see #unsetAddress()
     * @see #getAddress()
     * @see #setAddress(Address)
     * @generated
     */
    boolean isSetAddress();

    /**
     * Returns the value of the '<em><b>Refers To Control With IED Name</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName#getReferredByControlBlock <em>Referred By Control Block</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Refers To Control With IED Name</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Control With IED Name</em>' reference.
     * @see #isSetRefersToControlWithIEDName()
     * @see #unsetRefersToControlWithIEDName()
     * @see #setRefersToControlWithIEDName(ControlWithIEDName)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getControlBlock_RefersToControlWithIEDName()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName#getReferredByControlBlock
     * @model opposite="ReferredByControlBlock" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    ControlWithIEDName getRefersToControlWithIEDName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock#getRefersToControlWithIEDName <em>Refers To Control With IED Name</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Control With IED Name</em>' reference.
     * @see #isSetRefersToControlWithIEDName()
     * @see #unsetRefersToControlWithIEDName()
     * @see #getRefersToControlWithIEDName()
     * @generated
     */
    void setRefersToControlWithIEDName(ControlWithIEDName value);

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock#getRefersToControlWithIEDName <em>Refers To Control With IED Name</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToControlWithIEDName()
     * @see #getRefersToControlWithIEDName()
     * @see #setRefersToControlWithIEDName(ControlWithIEDName)
     * @generated
     */
    void unsetRefersToControlWithIEDName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock#getRefersToControlWithIEDName <em>Refers To Control With IED Name</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Control With IED Name</em>' reference is set.
     * @see #unsetRefersToControlWithIEDName()
     * @see #getRefersToControlWithIEDName()
     * @see #setRefersToControlWithIEDName(ControlWithIEDName)
     * @generated
     */
    boolean isSetRefersToControlWithIEDName();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation"
     * @generated
     */
    ConnectedAP getParentConnectedAP();

} // ControlBlock
