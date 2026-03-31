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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specification of a data required by a LNode
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getGooseParametersRef <em>Goose Parameters Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getSMVParametersRef <em>SMV Parameters Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getReportParametersRef <em>Report Parameters Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getBinaryWiringParametersRef <em>Binary Wiring Parameters Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getAnalogueWiringParametersRef <em>Analogue Wiring Parameters Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getExtRefAddr <em>Ext Ref Addr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getExtRefUuid <em>Ext Ref Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getInput <em>Input</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getInputInst <em>Input Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getService <em>Service</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getSource <em>Source</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getSourceDaName <em>Source Da Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getSourceDoName <em>Source Do Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getSourceLNodeUuid <em>Source LNode Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getParentLNodeInputs <em>Parent LNode Inputs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getReferredByInputVar <em>Referred By Input Var</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getReferredByLNodeInputRef <em>Referred By LNode Input Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getRefersToSubscriberLNode <em>Refers To Subscriber LNode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getRefersToProcessResource <em>Refers To Process Resource</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getRefersToLNode <em>Refers To LNode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getRefersToExtRef <em>Refers To Ext Ref</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSourceRef()
 * @model extendedMetaData="name='tSourceRef' kind='elementOnly'"
 * @generated
 */
public interface SourceRef extends LinkFCDARef {
    /**
     * Returns the value of the '<em><b>Goose Parameters Ref</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParametersRef#getParentSourceRef <em>Parent Source Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specification of the communication parameters expected for the current SourceRef when ServiceType is GOOSE
     * <!-- end-model-doc -->
     * @return the value of the '<em>Goose Parameters Ref</em>' containment reference.
     * @see #isSetGooseParametersRef()
     * @see #unsetGooseParametersRef()
     * @see #setGooseParametersRef(GooseParametersRef)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSourceRef_GooseParametersRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParametersRef#getParentSourceRef
     * @model opposite="ParentSourceRef" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='GooseParametersRef' namespace='##targetNamespace'"
     * @generated
     */
    GooseParametersRef getGooseParametersRef();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getGooseParametersRef <em>Goose Parameters Ref</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Goose Parameters Ref</em>' containment reference.
     * @see #isSetGooseParametersRef()
     * @see #unsetGooseParametersRef()
     * @see #getGooseParametersRef()
     * @generated
     */
    void setGooseParametersRef( GooseParametersRef value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getGooseParametersRef <em>Goose Parameters Ref</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGooseParametersRef()
     * @see #getGooseParametersRef()
     * @see #setGooseParametersRef(GooseParametersRef)
     * @generated
     */
    void unsetGooseParametersRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getGooseParametersRef <em>Goose Parameters Ref</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Goose Parameters Ref</em>' containment reference is set.
     * @see #unsetGooseParametersRef()
     * @see #getGooseParametersRef()
     * @see #setGooseParametersRef(GooseParametersRef)
     * @generated
     */
    boolean isSetGooseParametersRef();

    /**
     * Returns the value of the '<em><b>SMV Parameters Ref</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParametersRef#getParentSourceRef <em>Parent Source Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specification of the communication parameters expected for the current SourceRef when ServiceType is SMV
     * <!-- end-model-doc -->
     * @return the value of the '<em>SMV Parameters Ref</em>' containment reference.
     * @see #isSetSMVParametersRef()
     * @see #unsetSMVParametersRef()
     * @see #setSMVParametersRef(SMVParametersRef)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSourceRef_SMVParametersRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParametersRef#getParentSourceRef
     * @model opposite="ParentSourceRef" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='SMVParametersRef' namespace='##targetNamespace'"
     * @generated
     */
    SMVParametersRef getSMVParametersRef();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getSMVParametersRef <em>SMV Parameters Ref</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SMV Parameters Ref</em>' containment reference.
     * @see #isSetSMVParametersRef()
     * @see #unsetSMVParametersRef()
     * @see #getSMVParametersRef()
     * @generated
     */
    void setSMVParametersRef( SMVParametersRef value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getSMVParametersRef <em>SMV Parameters Ref</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSMVParametersRef()
     * @see #getSMVParametersRef()
     * @see #setSMVParametersRef(SMVParametersRef)
     * @generated
     */
    void unsetSMVParametersRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getSMVParametersRef <em>SMV Parameters Ref</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>SMV Parameters Ref</em>' containment reference is set.
     * @see #unsetSMVParametersRef()
     * @see #getSMVParametersRef()
     * @see #setSMVParametersRef(SMVParametersRef)
     * @generated
     */
    boolean isSetSMVParametersRef();

    /**
     * Returns the value of the '<em><b>Report Parameters Ref</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParametersRef#getParentSourceRef <em>Parent Source Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specification of the communication parameters expected for the current SourceRef when ServiceType is Report
     * <!-- end-model-doc -->
     * @return the value of the '<em>Report Parameters Ref</em>' containment reference.
     * @see #isSetReportParametersRef()
     * @see #unsetReportParametersRef()
     * @see #setReportParametersRef(ReportParametersRef)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSourceRef_ReportParametersRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParametersRef#getParentSourceRef
     * @model opposite="ParentSourceRef" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='ReportParametersRef' namespace='##targetNamespace'"
     * @generated
     */
    ReportParametersRef getReportParametersRef();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getReportParametersRef <em>Report Parameters Ref</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Report Parameters Ref</em>' containment reference.
     * @see #isSetReportParametersRef()
     * @see #unsetReportParametersRef()
     * @see #getReportParametersRef()
     * @generated
     */
    void setReportParametersRef( ReportParametersRef value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getReportParametersRef <em>Report Parameters Ref</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReportParametersRef()
     * @see #getReportParametersRef()
     * @see #setReportParametersRef(ReportParametersRef)
     * @generated
     */
    void unsetReportParametersRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getReportParametersRef <em>Report Parameters Ref</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Report Parameters Ref</em>' containment reference is set.
     * @see #unsetReportParametersRef()
     * @see #getReportParametersRef()
     * @see #setReportParametersRef(ReportParametersRef)
     * @generated
     */
    boolean isSetReportParametersRef();

    /**
     * Returns the value of the '<em><b>Binary Wiring Parameters Ref</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParametersRef#getParentSourceRef <em>Parent Source Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specification of the binary wiring parameters expected for the current SourceRef when ServiceType is Wired
     * <!-- end-model-doc -->
     * @return the value of the '<em>Binary Wiring Parameters Ref</em>' containment reference.
     * @see #isSetBinaryWiringParametersRef()
     * @see #unsetBinaryWiringParametersRef()
     * @see #setBinaryWiringParametersRef(BinaryWiringParametersRef)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSourceRef_BinaryWiringParametersRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParametersRef#getParentSourceRef
     * @model opposite="ParentSourceRef" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='BinaryWiringParametersRef' namespace='##targetNamespace'"
     * @generated
     */
    BinaryWiringParametersRef getBinaryWiringParametersRef();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getBinaryWiringParametersRef <em>Binary Wiring Parameters Ref</em>}' containment reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getBinaryWiringParametersRef <em>Binary Wiring Parameters Ref</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBinaryWiringParametersRef()
     * @see #getBinaryWiringParametersRef()
     * @see #setBinaryWiringParametersRef(BinaryWiringParametersRef)
     * @generated
     */
    void unsetBinaryWiringParametersRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getBinaryWiringParametersRef <em>Binary Wiring Parameters Ref</em>}' containment reference is set.
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
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParametersRef#getParentSourceRef <em>Parent Source Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specification of the analogue wiring parameters expected for the current SourceRef when ServiceType is Wired
     * <!-- end-model-doc -->
     * @return the value of the '<em>Analogue Wiring Parameters Ref</em>' containment reference.
     * @see #isSetAnalogueWiringParametersRef()
     * @see #unsetAnalogueWiringParametersRef()
     * @see #setAnalogueWiringParametersRef(AnalogueWiringParametersRef)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSourceRef_AnalogueWiringParametersRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParametersRef#getParentSourceRef
     * @model opposite="ParentSourceRef" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='AnalogueWiringParametersRef' namespace='##targetNamespace'"
     * @generated
     */
    AnalogueWiringParametersRef getAnalogueWiringParametersRef();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getAnalogueWiringParametersRef <em>Analogue Wiring Parameters Ref</em>}' containment reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getAnalogueWiringParametersRef <em>Analogue Wiring Parameters Ref</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAnalogueWiringParametersRef()
     * @see #getAnalogueWiringParametersRef()
     * @see #setAnalogueWiringParametersRef(AnalogueWiringParametersRef)
     * @generated
     */
    void unsetAnalogueWiringParametersRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getAnalogueWiringParametersRef <em>Analogue Wiring Parameters Ref</em>}' containment reference is set.
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
     * Returns the value of the '<em><b>Ext Ref Addr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * IntAddr of the ExtRef used to implement the given source ref specification
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ext Ref Addr</em>' attribute.
     * @see #setExtRefAddr(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSourceRef_ExtRefAddr()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
     *        extendedMetaData="kind='attribute' name='extRefAddr'"
     * @generated
     */
    String getExtRefAddr();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getExtRefAddr <em>Ext Ref Addr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ext Ref Addr</em>' attribute.
     * @see #getExtRefAddr()
     * @generated
     */
    void setExtRefAddr( String value );

    /**
     * Returns the value of the '<em><b>Ext Ref Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UUID of the ExtRef used to implement the given source ref specification
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ext Ref Uuid</em>' attribute.
     * @see #setExtRefUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSourceRef_ExtRefUuid()
     * @model extendedMetaData="kind='attribute' name='extRefUuid'"
     * @generated
     */
    String getExtRefUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getExtRefUuid <em>Ext Ref Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ext Ref Uuid</em>' attribute.
     * @see #getExtRefUuid()
     * @generated
     */
    void setExtRefUuid( String value );

    /**
     * Returns the value of the '<em><b>Input</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Identifier of the input, mandatory. Uniqueness of the 'input'+'inputInst" among the LNodeInputs shall be ensure
     * <!-- end-model-doc -->
     * @return the value of the '<em>Input</em>' attribute.
     * @see #setInput(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSourceRef_Input()
     * @model extendedMetaData="kind='attribute' name='input'"
     * @generated
     */
    String getInput();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getInput <em>Input</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Input</em>' attribute.
     * @see #getInput()
     * @generated
     */
    void setInput( String value );

    /**
     * Returns the value of the '<em><b>Input Inst</b></em>' attribute.
     * The default value is <code>"1"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Instance of the input in case of multiplicity is allowed
     * <!-- end-model-doc -->
     * @return the value of the '<em>Input Inst</em>' attribute.
     * @see #isSetInputInst()
     * @see #unsetInputInst()
     * @see #setInputInst(int)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSourceRef_InputInst()
     * @model default="1" unsettable="true"
     *        extendedMetaData="kind='attribute' name='inputInst'"
     * @generated
     */
    int getInputInst();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getInputInst <em>Input Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Input Inst</em>' attribute.
     * @see #isSetInputInst()
     * @see #unsetInputInst()
     * @see #getInputInst()
     * @generated
     */
    void setInputInst( int value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getInputInst <em>Input Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInputInst()
     * @see #getInputInst()
     * @see #setInputInst(int)
     * @generated
     */
    void unsetInputInst();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getInputInst <em>Input Inst</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Input Inst</em>' attribute is set.
     * @see #unsetInputInst()
     * @see #getInputInst()
     * @see #setInputInst(int)
     * @generated
     */
    boolean isSetInputInst();

    /**
     * Returns the value of the '<em><b>Service</b></em>' attribute.
     * The default value is <code>"GOOSE"</code>.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SpecServiceEnum}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Service to be used on implementation
     * <!-- end-model-doc -->
     * @return the value of the '<em>Service</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SpecServiceEnum
     * @see #isSetService()
     * @see #unsetService()
     * @see #setService(SpecServiceEnum)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSourceRef_Service()
     * @model default="GOOSE" unsettable="true"
     *        extendedMetaData="kind='attribute' name='service'"
     * @generated
     */
    SpecServiceEnum getService();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getService <em>Service</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Service</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SpecServiceEnum
     * @see #isSetService()
     * @see #unsetService()
     * @see #getService()
     * @generated
     */
    void setService( SpecServiceEnum value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getService <em>Service</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetService()
     * @see #getService()
     * @see #setService(SpecServiceEnum)
     * @generated
     */
    void unsetService();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getService <em>Service</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Service</em>' attribute is set.
     * @see #unsetService()
     * @see #getService()
     * @see #setService(SpecServiceEnum)
     * @generated
     */
    boolean isSetService();

    /**
     * Returns the value of the '<em><b>Source</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Process data to be used on implementation as source for the sourceRef
     * <!-- end-model-doc -->
     * @return the value of the '<em>Source</em>' attribute.
     * @see #setSource(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSourceRef_Source()
     * @model extendedMetaData="kind='attribute' name='source'"
     * @generated
     */
    String getSource();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getSource <em>Source</em>}' attribute.
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
     * Name of the DA of the LNode to be used on implementation as source for the sourceRef
     * <!-- end-model-doc -->
     * @return the value of the '<em>Source Da Name</em>' attribute.
     * @see #setSourceDaName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSourceRef_SourceDaName()
     * @model extendedMetaData="kind='attribute' name='sourceDaName'"
     * @generated
     */
    String getSourceDaName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getSourceDaName <em>Source Da Name</em>}' attribute.
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
     * Name of the DO of the LNode to be used on implementation as source for the sourceRef
     * <!-- end-model-doc -->
     * @return the value of the '<em>Source Do Name</em>' attribute.
     * @see #setSourceDoName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSourceRef_SourceDoName()
     * @model extendedMetaData="kind='attribute' name='sourceDoName'"
     * @generated
     */
    String getSourceDoName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getSourceDoName <em>Source Do Name</em>}' attribute.
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
     * UUID of the LNode to be used on implementation as source for the sourceRef
     * <!-- end-model-doc -->
     * @return the value of the '<em>Source LNode Uuid</em>' attribute.
     * @see #setSourceLNodeUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSourceRef_SourceLNodeUuid()
     * @model extendedMetaData="kind='attribute' name='sourceLNodeUuid'"
     * @generated
     */
    String getSourceLNodeUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getSourceLNodeUuid <em>Source LNode Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source LNode Uuid</em>' attribute.
     * @see #getSourceLNodeUuid()
     * @generated
     */
    void setSourceLNodeUuid( String value );

    /**
     * Returns the value of the '<em><b>Parent LNode Inputs</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputs#getSourceRef <em>Source Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent LNode Inputs</em>' container reference.
     * @see #setParentLNodeInputs(LNodeInputs)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSourceRef_ParentLNodeInputs()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputs#getSourceRef
     * @model opposite="SourceRef" unsettable="true" ordered="false"
     * @generated
     */
    LNodeInputs getParentLNodeInputs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getParentLNodeInputs <em>Parent LNode Inputs</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent LNode Inputs</em>' container reference.
     * @see #getParentLNodeInputs()
     * @generated
     */
    void setParentLNodeInputs( LNodeInputs value );

    /**
     * Returns the value of the '<em><b>Referred By Input Var</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.InputVar}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.InputVar#getRefersToSourceRef <em>Refers To Source Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Input Var</em>' reference list.
     * @see #isSetReferredByInputVar()
     * @see #unsetReferredByInputVar()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSourceRef_ReferredByInputVar()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.InputVar#getRefersToSourceRef
     * @model opposite="RefersToSourceRef" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< InputVar > getReferredByInputVar();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getReferredByInputVar <em>Referred By Input Var</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByInputVar()
     * @see #getReferredByInputVar()
     * @generated
     */
    void unsetReferredByInputVar();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getReferredByInputVar <em>Referred By Input Var</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Input Var</em>' reference list is set.
     * @see #unsetReferredByInputVar()
     * @see #getReferredByInputVar()
     * @generated
     */
    boolean isSetReferredByInputVar();

    /**
     * Returns the value of the '<em><b>Referred By LNode Input Ref</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputRef#getRefersToSourceRef <em>Refers To Source Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By LNode Input Ref</em>' reference list.
     * @see #isSetReferredByLNodeInputRef()
     * @see #unsetReferredByLNodeInputRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSourceRef_ReferredByLNodeInputRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputRef#getRefersToSourceRef
     * @model opposite="RefersToSourceRef" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< LNodeInputRef > getReferredByLNodeInputRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getReferredByLNodeInputRef <em>Referred By LNode Input Ref</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByLNodeInputRef()
     * @see #getReferredByLNodeInputRef()
     * @generated
     */
    void unsetReferredByLNodeInputRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getReferredByLNodeInputRef <em>Referred By LNode Input Ref</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By LNode Input Ref</em>' reference list is set.
     * @see #unsetReferredByLNodeInputRef()
     * @see #getReferredByLNodeInputRef()
     * @generated
     */
    boolean isSetReferredByLNodeInputRef();

    /**
     * Returns the value of the '<em><b>Refers To Subscriber LNode</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getReferredBySourceRef <em>Referred By Source Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Subscriber LNode</em>' reference.
     * @see #isSetRefersToSubscriberLNode()
     * @see #unsetRefersToSubscriberLNode()
     * @see #setRefersToSubscriberLNode(SubscriberLNode)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSourceRef_RefersToSubscriberLNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getReferredBySourceRef
     * @model opposite="ReferredBySourceRef" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    SubscriberLNode getRefersToSubscriberLNode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getRefersToSubscriberLNode <em>Refers To Subscriber LNode</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Subscriber LNode</em>' reference.
     * @see #isSetRefersToSubscriberLNode()
     * @see #unsetRefersToSubscriberLNode()
     * @see #getRefersToSubscriberLNode()
     * @generated
     */
    void setRefersToSubscriberLNode( SubscriberLNode value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getRefersToSubscriberLNode <em>Refers To Subscriber LNode</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToSubscriberLNode()
     * @see #getRefersToSubscriberLNode()
     * @see #setRefersToSubscriberLNode(SubscriberLNode)
     * @generated
     */
    void unsetRefersToSubscriberLNode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getRefersToSubscriberLNode <em>Refers To Subscriber LNode</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Subscriber LNode</em>' reference is set.
     * @see #unsetRefersToSubscriberLNode()
     * @see #getRefersToSubscriberLNode()
     * @see #setRefersToSubscriberLNode(SubscriberLNode)
     * @generated
     */
    boolean isSetRefersToSubscriberLNode();

    /**
     * Returns the value of the '<em><b>Refers To Process Resource</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredbySourceRef <em>Referredby Source Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Process Resource</em>' reference.
     * @see #isSetRefersToProcessResource()
     * @see #unsetRefersToProcessResource()
     * @see #setRefersToProcessResource(ProcessResource)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSourceRef_RefersToProcessResource()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredbySourceRef
     * @model opposite="ReferredbySourceRef" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    ProcessResource getRefersToProcessResource();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getRefersToProcessResource <em>Refers To Process Resource</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getRefersToProcessResource <em>Refers To Process Resource</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToProcessResource()
     * @see #getRefersToProcessResource()
     * @see #setRefersToProcessResource(ProcessResource)
     * @generated
     */
    void unsetRefersToProcessResource();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getRefersToProcessResource <em>Refers To Process Resource</em>}' reference is set.
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
     * Returns the value of the '<em><b>Refers To LNode</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getReferredBySourceRef <em>Referred By Source Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To LNode</em>' reference.
     * @see #isSetRefersToLNode()
     * @see #unsetRefersToLNode()
     * @see #setRefersToLNode(LNode)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSourceRef_RefersToLNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getReferredBySourceRef
     * @model opposite="ReferredBySourceRef" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    LNode getRefersToLNode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getRefersToLNode <em>Refers To LNode</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getRefersToLNode <em>Refers To LNode</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToLNode()
     * @see #getRefersToLNode()
     * @see #setRefersToLNode(LNode)
     * @generated
     */
    void unsetRefersToLNode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getRefersToLNode <em>Refers To LNode</em>}' reference is set.
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
     * Returns the value of the '<em><b>Refers To Ext Ref</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getReferredBySourceRef <em>Referred By Source Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Ext Ref</em>' reference.
     * @see #isSetRefersToExtRef()
     * @see #unsetRefersToExtRef()
     * @see #setRefersToExtRef(ExtRef)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSourceRef_RefersToExtRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getReferredBySourceRef
     * @model opposite="ReferredBySourceRef" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    ExtRef getRefersToExtRef();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getRefersToExtRef <em>Refers To Ext Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Ext Ref</em>' reference.
     * @see #isSetRefersToExtRef()
     * @see #unsetRefersToExtRef()
     * @see #getRefersToExtRef()
     * @generated
     */
    void setRefersToExtRef( ExtRef value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getRefersToExtRef <em>Refers To Ext Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToExtRef()
     * @see #getRefersToExtRef()
     * @see #setRefersToExtRef(ExtRef)
     * @generated
     */
    void unsetRefersToExtRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getRefersToExtRef <em>Refers To Ext Ref</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Ext Ref</em>' reference is set.
     * @see #unsetRefersToExtRef()
     * @see #getRefersToExtRef()
     * @see #setRefersToExtRef(ExtRef)
     * @generated
     */
    boolean isSetRefersToExtRef();

} // SourceRef
