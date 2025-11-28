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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Echo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specification of an echo LNode/DOS/DAS
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho#getSource <em>Source</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho#getSourceDaName <em>Source Da Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho#getSourceDoName <em>Source Do Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho#getSourceLNodeUuid <em>Source LNode Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho#getParentDAS <em>Parent DAS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho#getParentDOS <em>Parent DOS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho#getParentSDS <em>Parent SDS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho#getRefersToLNode <em>Refers To LNode</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getProcessEcho()
 * @model extendedMetaData="name='ProcessEcho' kind='elementOnly'"
 * @generated
 */
public interface ProcessEcho extends BaseExtensionElementWithDesc {
    /**
     * Returns the value of the '<em><b>Source</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * source LNode/DOS/DAS of the echo
     * <!-- end-model-doc -->
     * @return the value of the '<em>Source</em>' attribute.
     * @see #setSource(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getProcessEcho_Source()
     * @model extendedMetaData="kind='attribute' name='source'"
     * @generated
     */
    String getSource();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho#getSource <em>Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source</em>' attribute.
     * @see #getSource()
     * @generated
     */
    void setSource( String value );

    /**
     * Returns the value of the '<em><b>Source Da Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Name of the DA of the LNode of the echo
     * <!-- end-model-doc -->
     * @return the value of the '<em>Source Da Name</em>' attribute.
     * @see #setSourceDaName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getProcessEcho_SourceDaName()
     * @model extendedMetaData="kind='attribute' name='sourceDaName'"
     * @generated
     */
    String getSourceDaName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho#getSourceDaName <em>Source Da Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source Da Name</em>' attribute.
     * @see #getSourceDaName()
     * @generated
     */
    void setSourceDaName( String value );

    /**
     * Returns the value of the '<em><b>Source Do Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Name of the DO of the LNode of the echo
     * <!-- end-model-doc -->
     * @return the value of the '<em>Source Do Name</em>' attribute.
     * @see #setSourceDoName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getProcessEcho_SourceDoName()
     * @model extendedMetaData="kind='attribute' name='sourceDoName'"
     * @generated
     */
    String getSourceDoName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho#getSourceDoName <em>Source Do Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source Do Name</em>' attribute.
     * @see #getSourceDoName()
     * @generated
     */
    void setSourceDoName( String value );

    /**
     * Returns the value of the '<em><b>Source LNode Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UUID of the LNode of the echo
     * <!-- end-model-doc -->
     * @return the value of the '<em>Source LNode Uuid</em>' attribute.
     * @see #setSourceLNodeUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getProcessEcho_SourceLNodeUuid()
     * @model extendedMetaData="kind='attribute' name='sourceLNodeUuid'"
     * @generated
     */
    String getSourceLNodeUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho#getSourceLNodeUuid <em>Source LNode Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source LNode Uuid</em>' attribute.
     * @see #getSourceLNodeUuid()
     * @generated
     */
    void setSourceLNodeUuid( String value );

    /**
     * Returns the value of the '<em><b>Parent DAS</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getProcessEcho <em>Process Echo</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent DAS</em>' container reference.
     * @see #setParentDAS(DAS)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getProcessEcho_ParentDAS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getProcessEcho
     * @model opposite="processEcho" unsettable="true" ordered="false"
     * @generated
     */
    DAS getParentDAS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho#getParentDAS <em>Parent DAS</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent DAS</em>' container reference.
     * @see #getParentDAS()
     * @generated
     */
    void setParentDAS( DAS value );

    /**
     * Returns the value of the '<em><b>Parent DOS</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getProcessEcho <em>Process Echo</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent DOS</em>' container reference.
     * @see #setParentDOS(DOS)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getProcessEcho_ParentDOS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getProcessEcho
     * @model opposite="processEcho" unsettable="true" ordered="false"
     * @generated
     */
    DOS getParentDOS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho#getParentDOS <em>Parent DOS</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent DOS</em>' container reference.
     * @see #getParentDOS()
     * @generated
     */
    void setParentDOS( DOS value );

    /**
     * Returns the value of the '<em><b>Parent SDS</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS#getProcessEcho <em>Process Echo</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent SDS</em>' container reference.
     * @see #setParentSDS(SDS)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getProcessEcho_ParentSDS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS#getProcessEcho
     * @model opposite="processEcho" unsettable="true" ordered="false"
     * @generated
     */
    SDS getParentSDS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho#getParentSDS <em>Parent SDS</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent SDS</em>' container reference.
     * @see #getParentSDS()
     * @generated
     */
    void setParentSDS( SDS value );

    /**
     * Returns the value of the '<em><b>Refers To LNode</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getReferredByProcessEcho <em>Referred By Process Echo</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To LNode</em>' reference.
     * @see #isSetRefersToLNode()
     * @see #unsetRefersToLNode()
     * @see #setRefersToLNode(LNode)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getProcessEcho_RefersToLNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getReferredByProcessEcho
     * @model opposite="ReferredByProcessEcho" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    LNode getRefersToLNode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho#getRefersToLNode <em>Refers To LNode</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho#getRefersToLNode <em>Refers To LNode</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToLNode()
     * @see #getRefersToLNode()
     * @see #setRefersToLNode(LNode)
     * @generated
     */
    void unsetRefersToLNode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho#getRefersToLNode <em>Refers To LNode</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To LNode</em>' reference is set.
     * @see #unsetRefersToLNode()
     * @see #getRefersToLNode()
     * @see #setRefersToLNode(LNode)
     * @generated
     */
    boolean isSetRefersToLNode();

} // ProcessEcho
