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
 * A representation of the model object '<em><b>Connected AP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getApName <em>Ap Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getIedName <em>Ied Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getRedProt <em>Red Prot</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getAddress <em>Address</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getParentSubNetwork <em>Parent Sub Network</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getRefersToAccessPoint <em>Refers To Access Point</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getPhysConn <em>Phys Conn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getGSE <em>GSE</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getSMV <em>SMV</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getConnectedAP()
 * @model
 * @generated
 */
public interface ConnectedAP extends UnNaming {
    /**
     * Returns the value of the '<em><b>Ap Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ap Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ap Name</em>' attribute.
     * @see #isSetApName()
     * @see #unsetApName()
     * @see #setApName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getConnectedAP_ApName()
     * @model unsettable="true"
     * @generated
     */
    String getApName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getApName <em>Ap Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ap Name</em>' attribute.
     * @see #isSetApName()
     * @see #unsetApName()
     * @see #getApName()
     * @generated
     */
    void setApName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getApName <em>Ap Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetApName()
     * @see #getApName()
     * @see #setApName(String)
     * @generated
     */
    void unsetApName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getApName <em>Ap Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ap Name</em>' attribute is set.
     * @see #unsetApName()
     * @see #getApName()
     * @see #setApName(String)
     * @generated
     */
    boolean isSetApName();

    /**
     * Returns the value of the '<em><b>Ied Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ied Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ied Name</em>' attribute.
     * @see #isSetIedName()
     * @see #unsetIedName()
     * @see #setIedName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getConnectedAP_IedName()
     * @model unsettable="true"
     * @generated
     */
    String getIedName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getIedName <em>Ied Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ied Name</em>' attribute.
     * @see #isSetIedName()
     * @see #unsetIedName()
     * @see #getIedName()
     * @generated
     */
    void setIedName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getIedName <em>Ied Name</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetIedName()
     * @see #getIedName()
     * @see #setIedName(String)
     * @generated
     */
    void unsetIedName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getIedName <em>Ied Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ied Name</em>' attribute is set.
     * @see #unsetIedName()
     * @see #getIedName()
     * @see #setIedName(String)
     * @generated
     */
    boolean isSetIedName();

    /**
     * Returns the value of the '<em><b>Red Prot</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Red Prot</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Red Prot</em>' attribute.
     * @see #isSetRedProt()
     * @see #unsetRedProt()
     * @see #setRedProt(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getConnectedAP_RedProt()
     * @model unsettable="true"
     * @generated
     */
    String getRedProt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getRedProt <em>Red Prot</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Red Prot</em>' attribute.
     * @see #isSetRedProt()
     * @see #unsetRedProt()
     * @see #getRedProt()
     * @generated
     */
    void setRedProt( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getRedProt <em>Red Prot</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetRedProt()
     * @see #getRedProt()
     * @see #setRedProt(String)
     * @generated
     */
    void unsetRedProt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getRedProt <em>Red Prot</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Red Prot</em>' attribute is set.
     * @see #unsetRedProt()
     * @see #getRedProt()
     * @see #setRedProt(String)
     * @generated
     */
    boolean isSetRedProt();

    /**
     * Returns the value of the '<em><b>Address</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Address#getParentConnectedAP <em>Parent Connected AP</em>}'.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getConnectedAP_Address()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Address#getParentConnectedAP
     * @model opposite="ParentConnectedAP" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    Address getAddress();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getAddress <em>Address</em>}' containment reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getAddress <em>Address</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAddress()
     * @see #getAddress()
     * @see #setAddress(Address)
     * @generated
     */
    void unsetAddress();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getAddress <em>Address</em>}' containment reference is set.
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
     * Returns the value of the '<em><b>Parent Sub Network</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubNetwork#getConnectedAP <em>Connected AP</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Sub Network</em>' container reference.
     * @see #setParentSubNetwork(SubNetwork)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getConnectedAP_ParentSubNetwork()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SubNetwork#getConnectedAP
     * @model opposite="ConnectedAP" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    SubNetwork getParentSubNetwork();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getParentSubNetwork <em>Parent Sub Network</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Sub Network</em>' container reference.
     * @see #getParentSubNetwork()
     * @generated
     */
    void setParentSubNetwork( SubNetwork value );

    /**
     * Returns the value of the '<em><b>Refers To Access Point</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getReferredByConnectedAP <em>Referred By Connected AP</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Refers To Access Point</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Access Point</em>' reference.
     * @see #isSetRefersToAccessPoint()
     * @see #unsetRefersToAccessPoint()
     * @see #setRefersToAccessPoint(AccessPoint)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getConnectedAP_RefersToAccessPoint()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getReferredByConnectedAP
     * @model opposite="ReferredByConnectedAP" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    AccessPoint getRefersToAccessPoint();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getRefersToAccessPoint <em>Refers To Access Point</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Access Point</em>' reference.
     * @see #isSetRefersToAccessPoint()
     * @see #unsetRefersToAccessPoint()
     * @see #getRefersToAccessPoint()
     * @generated
     */
    void setRefersToAccessPoint( AccessPoint value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getRefersToAccessPoint <em>Refers To Access Point</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToAccessPoint()
     * @see #getRefersToAccessPoint()
     * @see #setRefersToAccessPoint(AccessPoint)
     * @generated
     */
    void unsetRefersToAccessPoint();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getRefersToAccessPoint <em>Refers To Access Point</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Access Point</em>' reference is set.
     * @see #unsetRefersToAccessPoint()
     * @see #getRefersToAccessPoint()
     * @see #setRefersToAccessPoint(AccessPoint)
     * @generated
     */
    boolean isSetRefersToAccessPoint();

    /**
     * Returns the value of the '<em><b>Phys Conn</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.PhysConn}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.PhysConn#getParentConnectedAP <em>Parent Connected AP</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Phys Conn</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Phys Conn</em>' containment reference list.
     * @see #isSetPhysConn()
     * @see #unsetPhysConn()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getConnectedAP_PhysConn()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.PhysConn#getParentConnectedAP
     * @model opposite="ParentConnectedAP" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList< PhysConn > getPhysConn();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getPhysConn <em>Phys Conn</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPhysConn()
     * @see #getPhysConn()
     * @generated
     */
    void unsetPhysConn();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getPhysConn <em>Phys Conn</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Phys Conn</em>' containment reference list is set.
     * @see #unsetPhysConn()
     * @see #getPhysConn()
     * @generated
     */
    boolean isSetPhysConn();

    /**
     * Returns the value of the '<em><b>GSE</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSE}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSE#getParentConnectedAP <em>Parent Connected AP</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>GSE</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>GSE</em>' containment reference list.
     * @see #isSetGSE()
     * @see #unsetGSE()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getConnectedAP_GSE()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GSE#getParentConnectedAP
     * @model opposite="ParentConnectedAP" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList< GSE > getGSE();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getGSE <em>GSE</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGSE()
     * @see #getGSE()
     * @generated
     */
    void unsetGSE();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getGSE <em>GSE</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>GSE</em>' containment reference list is set.
     * @see #unsetGSE()
     * @see #getGSE()
     * @generated
     */
    boolean isSetGSE();

    /**
     * Returns the value of the '<em><b>SMV</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMV}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMV#getParentConnectedAP <em>Parent Connected AP</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SMV</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SMV</em>' containment reference list.
     * @see #isSetSMV()
     * @see #unsetSMV()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getConnectedAP_SMV()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SMV#getParentConnectedAP
     * @model opposite="ParentConnectedAP" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList< SMV > getSMV();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getSMV <em>SMV</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSMV()
     * @see #getSMV()
     * @generated
     */
    void unsetSMV();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getSMV <em>SMV</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>SMV</em>' containment reference list is set.
     * @see #unsetSMV()
     * @see #getSMV()
     * @generated
     */
    boolean isSetSMV();

} // ConnectedAP
