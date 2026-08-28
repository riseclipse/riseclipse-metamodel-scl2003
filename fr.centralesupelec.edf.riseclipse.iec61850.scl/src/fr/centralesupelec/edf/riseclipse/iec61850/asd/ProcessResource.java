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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Reference to resources. Could refer any named process element or LNode
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getResource <em>Resource</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getParentProcessResources <em>Parent Process Resources</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredByProcessResourceRef <em>Referred By Process Resource Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredByControllingLNode <em>Referred By Controlling LNode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredBySubscriberLNode <em>Referred By Subscriber LNode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredByControlRef <em>Referred By Control Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredbySourceRef <em>Referredby Source Ref</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getProcessResource()
 * @model extendedMetaData="name='tProcessResource' kind='elementOnly'"
 * @generated
 */
public interface ProcessResource extends BaseExtensionElementWithDesc, AgCardinalityWithSelector, AgUuidWithOrigin {
    /**
     * Returns the value of the '<em><b>Resource</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Resource}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Resource#getParentProcessResource <em>Parent Process Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * resource bound to this element could be multi
     * <!-- end-model-doc -->
     * @return the value of the '<em>Resource</em>' containment reference list.
     * @see #isSetResource()
     * @see #unsetResource()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getProcessResource_Resource()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Resource#getParentProcessResource
     * @model opposite="ParentProcessResource" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='Resource' namespace='##targetNamespace'"
     * @generated
     */
    EList< Resource > getResource();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getResource <em>Resource</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetResource()
     * @see #getResource()
     * @generated
     */
    void unsetResource();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getResource <em>Resource</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Resource</em>' containment reference list is set.
     * @see #unsetResource()
     * @see #getResource()
     * @generated
     */
    boolean isSetResource();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * a name used to identify the process resource in the rest of the SCL elements
     * <!-- end-model-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getProcessResource_Name()
     * @model extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName( String value );

    /**
     * Returns the value of the '<em><b>Parent Process Resources</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResources#getProcessResource <em>Process Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Process Resources</em>' container reference.
     * @see #setParentProcessResources(ProcessResources)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getProcessResource_ParentProcessResources()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResources#getProcessResource
     * @model opposite="ProcessResource" unsettable="true" ordered="false"
     * @generated
     */
    ProcessResources getParentProcessResources();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getParentProcessResources <em>Parent Process Resources</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Process Resources</em>' container reference.
     * @see #getParentProcessResources()
     * @generated
     */
    void setParentProcessResources( ProcessResources value );

    /**
     * Returns the value of the '<em><b>Referred By Process Resource Ref</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResourceRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResourceRef#getRefersToProcessResource <em>Refers To Process Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Process Resource Ref</em>' reference list.
     * @see #isSetReferredByProcessResourceRef()
     * @see #unsetReferredByProcessResourceRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getProcessResource_ReferredByProcessResourceRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResourceRef#getRefersToProcessResource
     * @model opposite="RefersToProcessResource" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< ProcessResourceRef > getReferredByProcessResourceRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredByProcessResourceRef <em>Referred By Process Resource Ref</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByProcessResourceRef()
     * @see #getReferredByProcessResourceRef()
     * @generated
     */
    void unsetReferredByProcessResourceRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredByProcessResourceRef <em>Referred By Process Resource Ref</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Process Resource Ref</em>' reference list is set.
     * @see #unsetReferredByProcessResourceRef()
     * @see #getReferredByProcessResourceRef()
     * @generated
     */
    boolean isSetReferredByProcessResourceRef();

    /**
     * Returns the value of the '<em><b>Referred By Controlling LNode</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getRefersToProcessResource <em>Refers To Process Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Controlling LNode</em>' reference list.
     * @see #isSetReferredByControllingLNode()
     * @see #unsetReferredByControllingLNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getProcessResource_ReferredByControllingLNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getRefersToProcessResource
     * @model opposite="RefersToProcessResource" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< ControllingLNode > getReferredByControllingLNode();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredByControllingLNode <em>Referred By Controlling LNode</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByControllingLNode()
     * @see #getReferredByControllingLNode()
     * @generated
     */
    void unsetReferredByControllingLNode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredByControllingLNode <em>Referred By Controlling LNode</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Controlling LNode</em>' reference list is set.
     * @see #unsetReferredByControllingLNode()
     * @see #getReferredByControllingLNode()
     * @generated
     */
    boolean isSetReferredByControllingLNode();

    /**
     * Returns the value of the '<em><b>Referred By Subscriber LNode</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getRefersToProcessResource <em>Refers To Process Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Subscriber LNode</em>' reference list.
     * @see #isSetReferredBySubscriberLNode()
     * @see #unsetReferredBySubscriberLNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getProcessResource_ReferredBySubscriberLNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getRefersToProcessResource
     * @model opposite="RefersToProcessResource" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< SubscriberLNode > getReferredBySubscriberLNode();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredBySubscriberLNode <em>Referred By Subscriber LNode</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredBySubscriberLNode()
     * @see #getReferredBySubscriberLNode()
     * @generated
     */
    void unsetReferredBySubscriberLNode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredBySubscriberLNode <em>Referred By Subscriber LNode</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Subscriber LNode</em>' reference list is set.
     * @see #unsetReferredBySubscriberLNode()
     * @see #getReferredBySubscriberLNode()
     * @generated
     */
    boolean isSetReferredBySubscriberLNode();

    /**
     * Returns the value of the '<em><b>Referred By Control Ref</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getRefersToProcessResource <em>Refers To Process Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Control Ref</em>' reference list.
     * @see #isSetReferredByControlRef()
     * @see #unsetReferredByControlRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getProcessResource_ReferredByControlRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getRefersToProcessResource
     * @model opposite="RefersToProcessResource" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< ControlRef > getReferredByControlRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredByControlRef <em>Referred By Control Ref</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByControlRef()
     * @see #getReferredByControlRef()
     * @generated
     */
    void unsetReferredByControlRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredByControlRef <em>Referred By Control Ref</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Control Ref</em>' reference list is set.
     * @see #unsetReferredByControlRef()
     * @see #getReferredByControlRef()
     * @generated
     */
    boolean isSetReferredByControlRef();

    /**
     * Returns the value of the '<em><b>Referredby Source Ref</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getRefersToProcessResource <em>Refers To Process Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referredby Source Ref</em>' reference list.
     * @see #isSetReferredbySourceRef()
     * @see #unsetReferredbySourceRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getProcessResource_ReferredbySourceRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getRefersToProcessResource
     * @model opposite="RefersToProcessResource" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< SourceRef > getReferredbySourceRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredbySourceRef <em>Referredby Source Ref</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredbySourceRef()
     * @see #getReferredbySourceRef()
     * @generated
     */
    void unsetReferredbySourceRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredbySourceRef <em>Referredby Source Ref</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referredby Source Ref</em>' reference list is set.
     * @see #unsetReferredbySourceRef()
     * @see #getReferredbySourceRef()
     * @generated
     */
    boolean isSetReferredbySourceRef();

} // ProcessResource
