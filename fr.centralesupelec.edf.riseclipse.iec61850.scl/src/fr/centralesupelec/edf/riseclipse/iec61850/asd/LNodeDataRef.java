/**
 *  Copyright (c) 2016-2024 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-v20.html
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
 *      https://riseclipse.github.io/
 *
 */
package fr.centralesupelec.edf.riseclipse.iec61850.asd;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SignalRole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LNode Data Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of the LNodeDataRef element
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeDataRef#getDaName <em>Da Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeDataRef#getData <em>Data</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeDataRef#getDoName <em>Do Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeDataRef#getLnodeUuid <em>Lnode Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeDataRef#getRefersToLNode <em>Refers To LNode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeDataRef#getParentSignalRole <em>Parent Signal Role</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLNodeDataRef()
 * @model
 * @generated
 */
public interface LNodeDataRef extends FunctionalVariantRefContainer {
    /**
     * Returns the value of the '<em><b>Da Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Name of the DA of the LNode belonging to the current role
     * <!-- end-model-doc -->
     * @return the value of the '<em>Da Name</em>' attribute.
     * @see #setDaName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLNodeDataRef_DaName()
     * @model extendedMetaData="kind='attribute' name='daName'"
     * @generated
     */
    String getDaName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeDataRef#getDaName <em>Da Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Da Name</em>' attribute.
     * @see #getDaName()
     * @generated
     */
    void setDaName( String value );

    /**
     * Returns the value of the '<em><b>Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Identification of the Data (DO/DA) belonging to the current role (reference the Data name)
     * <!-- end-model-doc -->
     * @return the value of the '<em>Data</em>' attribute.
     * @see #setData(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLNodeDataRef_Data()
     * @model extendedMetaData="kind='attribute' name='data'"
     * @generated
     */
    String getData();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeDataRef#getData <em>Data</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data</em>' attribute.
     * @see #getData()
     * @generated
     */
    void setData( String value );

    /**
     * Returns the value of the '<em><b>Do Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Name of the DO of the LNode belonging to the current role
     * <!-- end-model-doc -->
     * @return the value of the '<em>Do Name</em>' attribute.
     * @see #setDoName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLNodeDataRef_DoName()
     * @model extendedMetaData="kind='attribute' name='doName'"
     * @generated
     */
    String getDoName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeDataRef#getDoName <em>Do Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Do Name</em>' attribute.
     * @see #getDoName()
     * @generated
     */
    void setDoName( String value );

    /**
     * Returns the value of the '<em><b>Lnode Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UUID of the LNode belonging to the current role
     * <!-- end-model-doc -->
     * @return the value of the '<em>Lnode Uuid</em>' attribute.
     * @see #setLnodeUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLNodeDataRef_LnodeUuid()
     * @model extendedMetaData="kind='attribute' name='lnodeUuid'"
     * @generated
     */
    String getLnodeUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeDataRef#getLnodeUuid <em>Lnode Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lnode Uuid</em>' attribute.
     * @see #getLnodeUuid()
     * @generated
     */
    void setLnodeUuid( String value );

    /**
     * Returns the value of the '<em><b>Refers To LNode</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getReferredByLNodeDataRef <em>Referred By LNode Data Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To LNode</em>' reference.
     * @see #isSetRefersToLNode()
     * @see #unsetRefersToLNode()
     * @see #setRefersToLNode(LNode)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLNodeDataRef_RefersToLNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getReferredByLNodeDataRef
     * @model opposite="ReferredByLNodeDataRef" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    LNode getRefersToLNode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeDataRef#getRefersToLNode <em>Refers To LNode</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To LNode</em>' reference.
     * @see #isSetRefersToLNode()
     * @see #unsetRefersToLNode()
     * @see #getRefersToLNode()
     * @generated
     */
    void setRefersToLNode( LNode value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeDataRef#getRefersToLNode <em>Refers To LNode</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToLNode()
     * @see #getRefersToLNode()
     * @see #setRefersToLNode(LNode)
     * @generated
     */
    void unsetRefersToLNode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeDataRef#getRefersToLNode <em>Refers To LNode</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To LNode</em>' reference is set.
     * @see #unsetRefersToLNode()
     * @see #getRefersToLNode()
     * @see #setRefersToLNode(LNode)
     * @generated
     */
    boolean isSetRefersToLNode();

    /**
     * Returns the value of the '<em><b>Parent Signal Role</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SignalRole#getLNodeDataRef <em>LNode Data Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Signal Role</em>' container reference.
     * @see #setParentSignalRole(SignalRole)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLNodeDataRef_ParentSignalRole()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SignalRole#getLNodeDataRef
     * @model opposite="LNodeDataRef" unsettable="true" ordered="false"
     * @generated
     */
    SignalRole getParentSignalRole();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeDataRef#getParentSignalRole <em>Parent Signal Role</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Signal Role</em>' container reference.
     * @see #getParentSignalRole()
     * @generated
     */
    void setParentSignalRole( SignalRole value );

} // LNodeDataRef
