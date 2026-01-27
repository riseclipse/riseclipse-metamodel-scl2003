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
 * A representation of the model object '<em><b>Controlling LNode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ControllingLNode can now where to be create with resource or pLN. At least one of them shall be filled in
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getBinaryWiringParametersRef <em>Binary Wiring Parameters Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getAnalogueWiringParametersRef <em>Analogue Wiring Parameters Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getOutputName <em>Output Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getPLN <em>PLN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getResourceName <em>Resource Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getResourceUuid <em>Resource Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getParentDAS <em>Parent DAS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getParentDOS <em>Parent DOS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getParentSDS <em>Parent SDS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getRefersToProcessResource <em>Refers To Process Resource</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getReferredByControlRef <em>Referred By Control Ref</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getControllingLNode()
 * @model
 * @generated
 */
public interface ControllingLNode extends BaseExtensionElementWithDesc {
    /**
     * Returns the value of the '<em><b>Binary Wiring Parameters Ref</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParametersRef#getParentControllingLNode <em>Parent Controlling LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specification of the binary wiring parameters expected for the current SourceRef when ServiceType is Wired
     * <!-- end-model-doc -->
     * @return the value of the '<em>Binary Wiring Parameters Ref</em>' containment reference.
     * @see #isSetBinaryWiringParametersRef()
     * @see #unsetBinaryWiringParametersRef()
     * @see #setBinaryWiringParametersRef(BinaryWiringParametersRef)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getControllingLNode_BinaryWiringParametersRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParametersRef#getParentControllingLNode
     * @model opposite="ParentControllingLNode" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='BinaryWiringParametersRef' namespace='##targetNamespace'"
     * @generated
     */
    BinaryWiringParametersRef getBinaryWiringParametersRef();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getBinaryWiringParametersRef <em>Binary Wiring Parameters Ref</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Binary Wiring Parameters Ref</em>' containment reference.
     * @see #isSetBinaryWiringParametersRef()
     * @see #unsetBinaryWiringParametersRef()
     * @see #getBinaryWiringParametersRef()
     * @generated
     */
    void setBinaryWiringParametersRef( BinaryWiringParametersRef value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getBinaryWiringParametersRef <em>Binary Wiring Parameters Ref</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBinaryWiringParametersRef()
     * @see #getBinaryWiringParametersRef()
     * @see #setBinaryWiringParametersRef(BinaryWiringParametersRef)
     * @generated
     */
    void unsetBinaryWiringParametersRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getBinaryWiringParametersRef <em>Binary Wiring Parameters Ref</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Binary Wiring Parameters Ref</em>' containment reference is set.
     * @see #unsetBinaryWiringParametersRef()
     * @see #getBinaryWiringParametersRef()
     * @see #setBinaryWiringParametersRef(BinaryWiringParametersRef)
     * @generated
     */
    boolean isSetBinaryWiringParametersRef();

    /**
     * Returns the value of the '<em><b>Analogue Wiring Parameters Ref</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParametersRef#getParentControllingLNode <em>Parent Controlling LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specification of the analogue wiring parameters expected for the current SourceRef when ServiceType is Wired
     * <!-- end-model-doc -->
     * @return the value of the '<em>Analogue Wiring Parameters Ref</em>' containment reference.
     * @see #isSetAnalogueWiringParametersRef()
     * @see #unsetAnalogueWiringParametersRef()
     * @see #setAnalogueWiringParametersRef(AnalogueWiringParametersRef)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getControllingLNode_AnalogueWiringParametersRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParametersRef#getParentControllingLNode
     * @model opposite="ParentControllingLNode" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='AnalogueWiringParametersRef' namespace='##targetNamespace'"
     * @generated
     */
    AnalogueWiringParametersRef getAnalogueWiringParametersRef();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getAnalogueWiringParametersRef <em>Analogue Wiring Parameters Ref</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Analogue Wiring Parameters Ref</em>' containment reference.
     * @see #isSetAnalogueWiringParametersRef()
     * @see #unsetAnalogueWiringParametersRef()
     * @see #getAnalogueWiringParametersRef()
     * @generated
     */
    void setAnalogueWiringParametersRef( AnalogueWiringParametersRef value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getAnalogueWiringParametersRef <em>Analogue Wiring Parameters Ref</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAnalogueWiringParametersRef()
     * @see #getAnalogueWiringParametersRef()
     * @see #setAnalogueWiringParametersRef(AnalogueWiringParametersRef)
     * @generated
     */
    void unsetAnalogueWiringParametersRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getAnalogueWiringParametersRef <em>Analogue Wiring Parameters Ref</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Analogue Wiring Parameters Ref</em>' containment reference is set.
     * @see #unsetAnalogueWiringParametersRef()
     * @see #getAnalogueWiringParametersRef()
     * @see #setAnalogueWiringParametersRef(AnalogueWiringParametersRef)
     * @generated
     */
    boolean isSetAnalogueWiringParametersRef();

    /**
     * Returns the value of the '<em><b>Output Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * output name to use in ControlRef created to answer to the ControllingLNode
     * <!-- end-model-doc -->
     * @return the value of the '<em>Output Name</em>' attribute.
     * @see #setOutputName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getControllingLNode_OutputName()
     * @model extendedMetaData="kind='attribute' name='outputName'"
     * @generated
     */
    String getOutputName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getOutputName <em>Output Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Output Name</em>' attribute.
     * @see #getOutputName()
     * @generated
     */
    void setOutputName( String value );

    /**
     * Returns the value of the '<em><b>PLN</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * class of the LNode to select to create ControlRef to answer to the ControllingLNode
     * <!-- end-model-doc -->
     * @return the value of the '<em>PLN</em>' attribute.
     * @see #setPLN(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getControllingLNode_PLN()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
     *        extendedMetaData="kind='attribute' name='pLN'"
     * @generated
     */
    String getPLN();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getPLN <em>PLN</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PLN</em>' attribute.
     * @see #getPLN()
     * @generated
     */
    void setPLN( String value );

    /**
     * Returns the value of the '<em><b>Resource Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Process resource used to instantiate the controlling LNodes
     * <!-- end-model-doc -->
     * @return the value of the '<em>Resource Name</em>' attribute.
     * @see #setResourceName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getControllingLNode_ResourceName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
     *        extendedMetaData="kind='attribute' name='resourceName'"
     * @generated
     */
    String getResourceName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getResourceName <em>Resource Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resource Name</em>' attribute.
     * @see #getResourceName()
     * @generated
     */
    void setResourceName( String value );

    /**
     * Returns the value of the '<em><b>Resource Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UUID of the ProcessResource used to instantiate the controlling LNodes
     * <!-- end-model-doc -->
     * @return the value of the '<em>Resource Uuid</em>' attribute.
     * @see #setResourceUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getControllingLNode_ResourceUuid()
     * @model extendedMetaData="kind='attribute' name='resourceUuid'"
     * @generated
     */
    String getResourceUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getResourceUuid <em>Resource Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resource Uuid</em>' attribute.
     * @see #getResourceUuid()
     * @generated
     */
    void setResourceUuid( String value );

    /**
     * Returns the value of the '<em><b>Parent DAS</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getControllingLNode <em>Controlling LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent DAS</em>' container reference.
     * @see #setParentDAS(DAS)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getControllingLNode_ParentDAS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getControllingLNode
     * @model opposite="ControllingLNode" unsettable="true" ordered="false"
     * @generated
     */
    DAS getParentDAS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getParentDAS <em>Parent DAS</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent DAS</em>' container reference.
     * @see #getParentDAS()
     * @generated
     */
    void setParentDAS( DAS value );

    /**
     * Returns the value of the '<em><b>Parent DOS</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getControllingLNode <em>Controlling LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent DOS</em>' container reference.
     * @see #setParentDOS(DOS)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getControllingLNode_ParentDOS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getControllingLNode
     * @model opposite="ControllingLNode" unsettable="true" ordered="false"
     * @generated
     */
    DOS getParentDOS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getParentDOS <em>Parent DOS</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent DOS</em>' container reference.
     * @see #getParentDOS()
     * @generated
     */
    void setParentDOS( DOS value );

    /**
     * Returns the value of the '<em><b>Parent SDS</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS#getControllingLNode <em>Controlling LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent SDS</em>' container reference.
     * @see #setParentSDS(SDS)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getControllingLNode_ParentSDS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS#getControllingLNode
     * @model opposite="controllingLNode" unsettable="true" ordered="false"
     * @generated
     */
    SDS getParentSDS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getParentSDS <em>Parent SDS</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent SDS</em>' container reference.
     * @see #getParentSDS()
     * @generated
     */
    void setParentSDS( SDS value );

    /**
     * Returns the value of the '<em><b>Refers To Process Resource</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredByControllingLNode <em>Referred By Controlling LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Process Resource</em>' reference.
     * @see #isSetRefersToProcessResource()
     * @see #unsetRefersToProcessResource()
     * @see #setRefersToProcessResource(ProcessResource)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getControllingLNode_RefersToProcessResource()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredByControllingLNode
     * @model opposite="ReferredByControllingLNode" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    ProcessResource getRefersToProcessResource();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getRefersToProcessResource <em>Refers To Process Resource</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Process Resource</em>' reference.
     * @see #isSetRefersToProcessResource()
     * @see #unsetRefersToProcessResource()
     * @see #getRefersToProcessResource()
     * @generated
     */
    void setRefersToProcessResource( ProcessResource value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getRefersToProcessResource <em>Refers To Process Resource</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToProcessResource()
     * @see #getRefersToProcessResource()
     * @see #setRefersToProcessResource(ProcessResource)
     * @generated
     */
    void unsetRefersToProcessResource();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getRefersToProcessResource <em>Refers To Process Resource</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Process Resource</em>' reference is set.
     * @see #unsetRefersToProcessResource()
     * @see #getRefersToProcessResource()
     * @see #setRefersToProcessResource(ProcessResource)
     * @generated
     */
    boolean isSetRefersToProcessResource();

    /**
     * Returns the value of the '<em><b>Referred By Control Ref</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getRefersToControllingLNode <em>Refers To Controlling LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Control Ref</em>' reference list.
     * @see #isSetReferredByControlRef()
     * @see #unsetReferredByControlRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getControllingLNode_ReferredByControlRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getRefersToControllingLNode
     * @model opposite="RefersToControllingLNode" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< ControlRef > getReferredByControlRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getReferredByControlRef <em>Referred By Control Ref</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByControlRef()
     * @see #getReferredByControlRef()
     * @generated
     */
    void unsetReferredByControlRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getReferredByControlRef <em>Referred By Control Ref</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Control Ref</em>' reference list is set.
     * @see #unsetReferredByControlRef()
     * @see #getReferredByControlRef()
     * @generated
     */
    boolean isSetReferredByControlRef();

} // ControllingLNode
