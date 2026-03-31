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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specification of a control required by a LNode
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getBinaryWiringParametersRef <em>Binary Wiring Parameters Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getAnalogueWiringParametersRef <em>Analogue Wiring Parameters Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getControlled <em>Controlled</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getControlledDoName <em>Controlled Do Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getControlledLNodeUuid <em>Controlled LNode Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getExtCtrlAddr <em>Ext Ctrl Addr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getExtCtrlUuid <em>Ext Ctrl Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getOutput <em>Output</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getOutputInst <em>Output Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getParentLNodeOutputs <em>Parent LNode Outputs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getReferredByLNodeOutputRef <em>Referred By LNode Output Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getRefersToControllingLNode <em>Refers To Controlling LNode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getRefersToProcessResource <em>Refers To Process Resource</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getReferredByOutputVar <em>Referred By Output Var</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getRefersToLNode <em>Refers To LNode</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getControlRef()
 * @model
 * @generated
 */
public interface ControlRef extends LinkFCDRef {
    /**
     * Returns the value of the '<em><b>Binary Wiring Parameters Ref</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParametersRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParametersRef#getParentControlRef <em>Parent Control Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specification of the binary wiring parameters expected for the current SourceRef when ServiceType is Wired
     * <!-- end-model-doc -->
     * @return the value of the '<em>Binary Wiring Parameters Ref</em>' containment reference list.
     * @see #isSetBinaryWiringParametersRef()
     * @see #unsetBinaryWiringParametersRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getControlRef_BinaryWiringParametersRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParametersRef#getParentControlRef
     * @model opposite="ParentControlRef" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='BinaryWiringParametersRef' namespace='##targetNamespace'"
     * @generated
     */
    EList< BinaryWiringParametersRef > getBinaryWiringParametersRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getBinaryWiringParametersRef <em>Binary Wiring Parameters Ref</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBinaryWiringParametersRef()
     * @see #getBinaryWiringParametersRef()
     * @generated
     */
    void unsetBinaryWiringParametersRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getBinaryWiringParametersRef <em>Binary Wiring Parameters Ref</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Binary Wiring Parameters Ref</em>' containment reference list is set.
     * @see #unsetBinaryWiringParametersRef()
     * @see #getBinaryWiringParametersRef()
     * @generated
     */
    boolean isSetBinaryWiringParametersRef();

    /**
     * Returns the value of the '<em><b>Analogue Wiring Parameters Ref</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParametersRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParametersRef#getParentControlRef <em>Parent Control Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specification of the analogue wiring parameters expected for the current SourceRef when ServiceType is Wired
     * <!-- end-model-doc -->
     * @return the value of the '<em>Analogue Wiring Parameters Ref</em>' containment reference list.
     * @see #isSetAnalogueWiringParametersRef()
     * @see #unsetAnalogueWiringParametersRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getControlRef_AnalogueWiringParametersRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParametersRef#getParentControlRef
     * @model opposite="ParentControlRef" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='AnalogueWiringParametersRef' namespace='##targetNamespace'"
     * @generated
     */
    EList< AnalogueWiringParametersRef > getAnalogueWiringParametersRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getAnalogueWiringParametersRef <em>Analogue Wiring Parameters Ref</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAnalogueWiringParametersRef()
     * @see #getAnalogueWiringParametersRef()
     * @generated
     */
    void unsetAnalogueWiringParametersRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getAnalogueWiringParametersRef <em>Analogue Wiring Parameters Ref</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Analogue Wiring Parameters Ref</em>' containment reference list is set.
     * @see #unsetAnalogueWiringParametersRef()
     * @see #getAnalogueWiringParametersRef()
     * @generated
     */
    boolean isSetAnalogueWiringParametersRef();

    /**
     * Returns the value of the '<em><b>Controlled</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Process data to be used on implementation as controlled DO for the controlRef
     * <!-- end-model-doc -->
     * @return the value of the '<em>Controlled</em>' attribute.
     * @see #setControlled(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getControlRef_Controlled()
     * @model extendedMetaData="kind='attribute' name='controlled'"
     * @generated
     */
    String getControlled();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getControlled <em>Controlled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Controlled</em>' attribute.
     * @see #getControlled()
     * @generated
     */
    void setControlled( String value );

    /**
     * Returns the value of the '<em><b>Controlled Do Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Name of the DO of the LNode to be used on implementation as controlled DO for the controlRef
     * <!-- end-model-doc -->
     * @return the value of the '<em>Controlled Do Name</em>' attribute.
     * @see #setControlledDoName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getControlRef_ControlledDoName()
     * @model extendedMetaData="kind='attribute' name='controlledDoName'"
     * @generated
     */
    String getControlledDoName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getControlledDoName <em>Controlled Do Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Controlled Do Name</em>' attribute.
     * @see #getControlledDoName()
     * @generated
     */
    void setControlledDoName( String value );

    /**
     * Returns the value of the '<em><b>Controlled LNode Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UUID of the LNode to be used on implementation as controlled DO for the controlRef
     * <!-- end-model-doc -->
     * @return the value of the '<em>Controlled LNode Uuid</em>' attribute.
     * @see #setControlledLNodeUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getControlRef_ControlledLNodeUuid()
     * @model extendedMetaData="kind='attribute' name='controlledLNodeUuid'"
     * @generated
     */
    String getControlledLNodeUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getControlledLNodeUuid <em>Controlled LNode Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Controlled LNode Uuid</em>' attribute.
     * @see #getControlledLNodeUuid()
     * @generated
     */
    void setControlledLNodeUuid( String value );

    /**
     * Returns the value of the '<em><b>Ext Ctrl Addr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * IntAddr of the ExtCtrl used to implement the given control ref specification
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ext Ctrl Addr</em>' attribute.
     * @see #setExtCtrlAddr(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getControlRef_ExtCtrlAddr()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
     *        extendedMetaData="kind='attribute' name='extCtrlAddr'"
     * @generated
     */
    String getExtCtrlAddr();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getExtCtrlAddr <em>Ext Ctrl Addr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ext Ctrl Addr</em>' attribute.
     * @see #getExtCtrlAddr()
     * @generated
     */
    void setExtCtrlAddr( String value );

    /**
     * Returns the value of the '<em><b>Ext Ctrl Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UUID of the ExtCtrl used to implement the given control ref specification
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ext Ctrl Uuid</em>' attribute.
     * @see #setExtCtrlUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getControlRef_ExtCtrlUuid()
     * @model extendedMetaData="kind='attribute' name='extCtrlUuid'"
     * @generated
     */
    String getExtCtrlUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getExtCtrlUuid <em>Ext Ctrl Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ext Ctrl Uuid</em>' attribute.
     * @see #getExtCtrlUuid()
     * @generated
     */
    void setExtCtrlUuid( String value );

    /**
     * Returns the value of the '<em><b>Output</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Identifier of the output, mandatory. Uniqueness of the 'output'+'outputInst" among the LNodeOutputs shall be ensure
     * <!-- end-model-doc -->
     * @return the value of the '<em>Output</em>' attribute.
     * @see #setOutput(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getControlRef_Output()
     * @model extendedMetaData="kind='attribute' name='output'"
     * @generated
     */
    String getOutput();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getOutput <em>Output</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Output</em>' attribute.
     * @see #getOutput()
     * @generated
     */
    void setOutput( String value );

    /**
     * Returns the value of the '<em><b>Output Inst</b></em>' attribute.
     * The default value is <code>"1"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Instance of the output in case of multiplicity is allowed
     * <!-- end-model-doc -->
     * @return the value of the '<em>Output Inst</em>' attribute.
     * @see #isSetOutputInst()
     * @see #unsetOutputInst()
     * @see #setOutputInst(int)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getControlRef_OutputInst()
     * @model default="1" unsettable="true"
     *        extendedMetaData="kind='attribute' name='outputInst'"
     * @generated
     */
    int getOutputInst();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getOutputInst <em>Output Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Output Inst</em>' attribute.
     * @see #isSetOutputInst()
     * @see #unsetOutputInst()
     * @see #getOutputInst()
     * @generated
     */
    void setOutputInst( int value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getOutputInst <em>Output Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOutputInst()
     * @see #getOutputInst()
     * @see #setOutputInst(int)
     * @generated
     */
    void unsetOutputInst();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getOutputInst <em>Output Inst</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Output Inst</em>' attribute is set.
     * @see #unsetOutputInst()
     * @see #getOutputInst()
     * @see #setOutputInst(int)
     * @generated
     */
    boolean isSetOutputInst();

    /**
     * Returns the value of the '<em><b>Parent LNode Outputs</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputs#getControlRef <em>Control Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent LNode Outputs</em>' container reference.
     * @see #setParentLNodeOutputs(LNodeOutputs)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getControlRef_ParentLNodeOutputs()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputs#getControlRef
     * @model opposite="ControlRef" unsettable="true" ordered="false"
     * @generated
     */
    LNodeOutputs getParentLNodeOutputs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getParentLNodeOutputs <em>Parent LNode Outputs</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent LNode Outputs</em>' container reference.
     * @see #getParentLNodeOutputs()
     * @generated
     */
    void setParentLNodeOutputs( LNodeOutputs value );

    /**
     * Returns the value of the '<em><b>Referred By LNode Output Ref</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputRef#getRefersToControlRef <em>Refers To Control Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By LNode Output Ref</em>' reference list.
     * @see #isSetReferredByLNodeOutputRef()
     * @see #unsetReferredByLNodeOutputRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getControlRef_ReferredByLNodeOutputRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputRef#getRefersToControlRef
     * @model opposite="RefersToControlRef" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< LNodeOutputRef > getReferredByLNodeOutputRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getReferredByLNodeOutputRef <em>Referred By LNode Output Ref</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByLNodeOutputRef()
     * @see #getReferredByLNodeOutputRef()
     * @generated
     */
    void unsetReferredByLNodeOutputRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getReferredByLNodeOutputRef <em>Referred By LNode Output Ref</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By LNode Output Ref</em>' reference list is set.
     * @see #unsetReferredByLNodeOutputRef()
     * @see #getReferredByLNodeOutputRef()
     * @generated
     */
    boolean isSetReferredByLNodeOutputRef();

    /**
     * Returns the value of the '<em><b>Refers To Controlling LNode</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getReferredByControlRef <em>Referred By Control Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Controlling LNode</em>' reference.
     * @see #isSetRefersToControllingLNode()
     * @see #unsetRefersToControllingLNode()
     * @see #setRefersToControllingLNode(ControllingLNode)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getControlRef_RefersToControllingLNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getReferredByControlRef
     * @model opposite="ReferredByControlRef" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    ControllingLNode getRefersToControllingLNode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getRefersToControllingLNode <em>Refers To Controlling LNode</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Controlling LNode</em>' reference.
     * @see #isSetRefersToControllingLNode()
     * @see #unsetRefersToControllingLNode()
     * @see #getRefersToControllingLNode()
     * @generated
     */
    void setRefersToControllingLNode( ControllingLNode value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getRefersToControllingLNode <em>Refers To Controlling LNode</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToControllingLNode()
     * @see #getRefersToControllingLNode()
     * @see #setRefersToControllingLNode(ControllingLNode)
     * @generated
     */
    void unsetRefersToControllingLNode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getRefersToControllingLNode <em>Refers To Controlling LNode</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Controlling LNode</em>' reference is set.
     * @see #unsetRefersToControllingLNode()
     * @see #getRefersToControllingLNode()
     * @see #setRefersToControllingLNode(ControllingLNode)
     * @generated
     */
    boolean isSetRefersToControllingLNode();

    /**
     * Returns the value of the '<em><b>Refers To Process Resource</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredByControlRef <em>Referred By Control Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Process Resource</em>' reference.
     * @see #isSetRefersToProcessResource()
     * @see #unsetRefersToProcessResource()
     * @see #setRefersToProcessResource(ProcessResource)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getControlRef_RefersToProcessResource()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredByControlRef
     * @model opposite="ReferredByControlRef" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    ProcessResource getRefersToProcessResource();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getRefersToProcessResource <em>Refers To Process Resource</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getRefersToProcessResource <em>Refers To Process Resource</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToProcessResource()
     * @see #getRefersToProcessResource()
     * @see #setRefersToProcessResource(ProcessResource)
     * @generated
     */
    void unsetRefersToProcessResource();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getRefersToProcessResource <em>Refers To Process Resource</em>}' reference is set.
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
     * Returns the value of the '<em><b>Referred By Output Var</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.OutputVar}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.OutputVar#getRefersToControlRef <em>Refers To Control Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Output Var</em>' reference list.
     * @see #isSetReferredByOutputVar()
     * @see #unsetReferredByOutputVar()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getControlRef_ReferredByOutputVar()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.OutputVar#getRefersToControlRef
     * @model opposite="RefersToControlRef" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< OutputVar > getReferredByOutputVar();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getReferredByOutputVar <em>Referred By Output Var</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByOutputVar()
     * @see #getReferredByOutputVar()
     * @generated
     */
    void unsetReferredByOutputVar();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getReferredByOutputVar <em>Referred By Output Var</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Output Var</em>' reference list is set.
     * @see #unsetReferredByOutputVar()
     * @see #getReferredByOutputVar()
     * @generated
     */
    boolean isSetReferredByOutputVar();

    /**
     * Returns the value of the '<em><b>Refers To LNode</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getReferredByControlRef <em>Referred By Control Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To LNode</em>' reference.
     * @see #isSetRefersToLNode()
     * @see #unsetRefersToLNode()
     * @see #setRefersToLNode(LNode)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getControlRef_RefersToLNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getReferredByControlRef
     * @model opposite="ReferredByControlRef" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    LNode getRefersToLNode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getRefersToLNode <em>Refers To LNode</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getRefersToLNode <em>Refers To LNode</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToLNode()
     * @see #getRefersToLNode()
     * @see #setRefersToLNode(LNode)
     * @generated
     */
    void unsetRefersToLNode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getRefersToLNode <em>Refers To LNode</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To LNode</em>' reference is set.
     * @see #unsetRefersToLNode()
     * @see #getRefersToLNode()
     * @see #setRefersToLNode(LNode)
     * @generated
     */
    boolean isSetRefersToLNode();

} // ControlRef
