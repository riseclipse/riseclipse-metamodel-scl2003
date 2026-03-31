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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DOS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specification of data object to be implemented by a device
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getSDS <em>SDS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getDAS <em>DAS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getSubscriberLNode <em>Subscriber LNode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getControllingLNode <em>Controlling LNode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getProcessEcho <em>Process Echo</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getLogParametersRef <em>Log Parameters Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getLabels <em>Labels</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getMappedDoName <em>Mapped Do Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getMappedLnUuid <em>Mapped Ln Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getRefersToAnyLN <em>Refers To Any LN</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getDOS()
 * @model extendedMetaData="name='DOS' kind='elementOnly'"
 * @generated
 */
public interface DOS extends BaseExtensionElementWithDesc {
    /**
     * Returns the value of the '<em><b>SDS</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS#getParentDOS <em>Parent DOS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specification of a sub-Data Object
     * <!-- end-model-doc -->
     * @return the value of the '<em>SDS</em>' containment reference list.
     * @see #isSetSDS()
     * @see #unsetSDS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getDOS_SDS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS#getParentDOS
     * @model opposite="ParentDOS" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='SDS' namespace='##targetNamespace'"
     * @generated
     */
    EList< SDS > getSDS();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getSDS <em>SDS</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSDS()
     * @see #getSDS()
     * @generated
     */
    void unsetSDS();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getSDS <em>SDS</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>SDS</em>' containment reference list is set.
     * @see #unsetSDS()
     * @see #getSDS()
     * @generated
     */
    boolean isSetSDS();

    /**
     * Returns the value of the '<em><b>DAS</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getParentDOS <em>Parent DOS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specification of a Data attribute
     * <!-- end-model-doc -->
     * @return the value of the '<em>DAS</em>' containment reference list.
     * @see #isSetDAS()
     * @see #unsetDAS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getDOS_DAS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getParentDOS
     * @model opposite="ParentDOS" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='DAS' namespace='##targetNamespace'"
     * @generated
     */
    EList< DAS > getDAS();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getDAS <em>DAS</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDAS()
     * @see #getDAS()
     * @generated
     */
    void unsetDAS();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getDAS <em>DAS</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>DAS</em>' containment reference list is set.
     * @see #unsetDAS()
     * @see #getDAS()
     * @generated
     */
    boolean isSetDAS();

    /**
     * Returns the value of the '<em><b>Subscriber LNode</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getParentDOS <em>Parent DOS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Subscriber LNode</em>' containment reference list.
     * @see #isSetSubscriberLNode()
     * @see #unsetSubscriberLNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getDOS_SubscriberLNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getParentDOS
     * @model opposite="ParentDOS" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='SubscriberLNode' namespace='##targetNamespace'"
     * @generated
     */
    EList< SubscriberLNode > getSubscriberLNode();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getSubscriberLNode <em>Subscriber LNode</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSubscriberLNode()
     * @see #getSubscriberLNode()
     * @generated
     */
    void unsetSubscriberLNode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getSubscriberLNode <em>Subscriber LNode</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Subscriber LNode</em>' containment reference list is set.
     * @see #unsetSubscriberLNode()
     * @see #getSubscriberLNode()
     * @generated
     */
    boolean isSetSubscriberLNode();

    /**
     * Returns the value of the '<em><b>Controlling LNode</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getParentDOS <em>Parent DOS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Controlling LNode</em>' containment reference list.
     * @see #isSetControllingLNode()
     * @see #unsetControllingLNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getDOS_ControllingLNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getParentDOS
     * @model opposite="ParentDOS" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='ControllingLNode' namespace='##targetNamespace'"
     * @generated
     */
    EList< ControllingLNode > getControllingLNode();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getControllingLNode <em>Controlling LNode</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetControllingLNode()
     * @see #getControllingLNode()
     * @generated
     */
    void unsetControllingLNode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getControllingLNode <em>Controlling LNode</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Controlling LNode</em>' containment reference list is set.
     * @see #unsetControllingLNode()
     * @see #getControllingLNode()
     * @generated
     */
    boolean isSetControllingLNode();

    /**
     * Returns the value of the '<em><b>Process Echo</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho#getParentDOS <em>Parent DOS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Process Echo</em>' containment reference list.
     * @see #isSetProcessEcho()
     * @see #unsetProcessEcho()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getDOS_ProcessEcho()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho#getParentDOS
     * @model opposite="ParentDOS" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='ProcessEcho' namespace='##targetNamespace'"
     * @generated
     */
    EList< ProcessEcho > getProcessEcho();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getProcessEcho <em>Process Echo</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetProcessEcho()
     * @see #getProcessEcho()
     * @generated
     */
    void unsetProcessEcho();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getProcessEcho <em>Process Echo</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Process Echo</em>' containment reference list is set.
     * @see #unsetProcessEcho()
     * @see #getProcessEcho()
     * @generated
     */
    boolean isSetProcessEcho();

    /**
     * Returns the value of the '<em><b>Log Parameters Ref</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParametersRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParametersRef#getParentDOS <em>Parent DOS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specification of the Log parameters expected for the current DOS when Log capability is required
     * <!-- end-model-doc -->
     * @return the value of the '<em>Log Parameters Ref</em>' containment reference list.
     * @see #isSetLogParametersRef()
     * @see #unsetLogParametersRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getDOS_LogParametersRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParametersRef#getParentDOS
     * @model opposite="ParentDOS" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='LogParametersRef' namespace='##targetNamespace'"
     * @generated
     */
    EList< LogParametersRef > getLogParametersRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getLogParametersRef <em>Log Parameters Ref</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLogParametersRef()
     * @see #getLogParametersRef()
     * @generated
     */
    void unsetLogParametersRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getLogParametersRef <em>Log Parameters Ref</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Log Parameters Ref</em>' containment reference list is set.
     * @see #unsetLogParametersRef()
     * @see #getLogParametersRef()
     * @generated
     */
    boolean isSetLogParametersRef();

    /**
     * Returns the value of the '<em><b>Labels</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels#getParentDOS <em>Parent DOS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Labels</em>' containment reference.
     * @see #setLabels(Labels)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getDOS_Labels()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels#getParentDOS
     * @model opposite="ParentDOS" containment="true"
     *        extendedMetaData="kind='element' name='Labels' namespace='##targetNamespace'"
     * @generated
     */
    Labels getLabels();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getLabels <em>Labels</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Labels</em>' containment reference.
     * @see #getLabels()
     * @generated
     */
    void setLabels( Labels value );

    /**
     * Returns the value of the '<em><b>Mapped Do Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * DoName in the IED which implements the DOS. If mappedLnUuid is defined or LNode mapped to an LN, the DoName is internal to the referenced LN. If not defined, the mappedDoName shall be an absolute reference to a DO in an IED
     * <!-- end-model-doc -->
     * @return the value of the '<em>Mapped Do Name</em>' attribute.
     * @see #setMappedDoName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getDOS_MappedDoName()
     * @model extendedMetaData="kind='attribute' name='mappedDoName'"
     * @generated
     */
    String getMappedDoName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getMappedDoName <em>Mapped Do Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mapped Do Name</em>' attribute.
     * @see #getMappedDoName()
     * @generated
     */
    void setMappedDoName( String value );

    /**
     * Returns the value of the '<em><b>Mapped Ln Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UUID of the LN which implements the DOS
     * <!-- end-model-doc -->
     * @return the value of the '<em>Mapped Ln Uuid</em>' attribute.
     * @see #setMappedLnUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getDOS_MappedLnUuid()
     * @model extendedMetaData="kind='attribute' name='mappedLnUuid'"
     * @generated
     */
    String getMappedLnUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getMappedLnUuid <em>Mapped Ln Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mapped Ln Uuid</em>' attribute.
     * @see #getMappedLnUuid()
     * @generated
     */
    void setMappedLnUuid( String value );

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getDOS_Name()
     * @model extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName( String value );

    /**
     * Returns the value of the '<em><b>Refers To Any LN</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReferredByDOS <em>Referred By DOS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Any LN</em>' reference.
     * @see #isSetRefersToAnyLN()
     * @see #unsetRefersToAnyLN()
     * @see #setRefersToAnyLN(AnyLN)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getDOS_RefersToAnyLN()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReferredByDOS
     * @model opposite="ReferredByDOS" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    AnyLN getRefersToAnyLN();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getRefersToAnyLN <em>Refers To Any LN</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Any LN</em>' reference.
     * @see #isSetRefersToAnyLN()
     * @see #unsetRefersToAnyLN()
     * @see #getRefersToAnyLN()
     * @generated
     */
    void setRefersToAnyLN( AnyLN value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getRefersToAnyLN <em>Refers To Any LN</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToAnyLN()
     * @see #getRefersToAnyLN()
     * @see #setRefersToAnyLN(AnyLN)
     * @generated
     */
    void unsetRefersToAnyLN();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getRefersToAnyLN <em>Refers To Any LN</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Any LN</em>' reference is set.
     * @see #unsetRefersToAnyLN()
     * @see #getRefersToAnyLN()
     * @see #setRefersToAnyLN(AnyLN)
     * @generated
     */
    boolean isSetRefersToAnyLN();

} // DOS
