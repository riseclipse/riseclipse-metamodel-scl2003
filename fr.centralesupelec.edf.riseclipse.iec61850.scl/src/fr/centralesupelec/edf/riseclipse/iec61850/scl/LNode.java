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

import fr.centralesupelec.edf.riseclipse.iec61850.asd.Abstract6100LNodeContainer;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeDataRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.LogicVarRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LNode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getIedName <em>Ied Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLdInst <em>Ld Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLnClass <em>Ln Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLnInst <em>Ln Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLnType <em>Ln Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getRefersToAnyLN <em>Refers To Any LN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getParentLNodeContainer <em>Parent LNode Container</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getRefersToLNodeType <em>Refers To LNode Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLabels <em>Labels</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLnUuid <em>Ln Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getParentAbstract6100LNodeContainer <em>Parent Abstract6100 LNode Container</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getReferredByLNodeDataRef <em>Referred By LNode Data Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getReferredByLogicVarRef <em>Referred By Logic Var Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getReferredByProcessEcho <em>Referred By Process Echo</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getReferredByControlRef <em>Referred By Control Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getReferredBySourceRef <em>Referred By Source Ref</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLNode()
 * @model
 * @generated
 */
public interface LNode extends UnNaming, AgUuid {
    /**
     * Returns the value of the '<em><b>Ied Name</b></em>' attribute.
     * The default value is <code>"None"</code>.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLNode_IedName()
     * @model default="None" unsettable="true"
     * @generated
     */
    String getIedName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getIedName <em>Ied Name</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getIedName <em>Ied Name</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetIedName()
     * @see #getIedName()
     * @see #setIedName(String)
     * @generated
     */
    void unsetIedName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getIedName <em>Ied Name</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Ld Inst</b></em>' attribute.
     * The default value is <code>""</code>.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLNode_LdInst()
     * @model default="" unique="false" unsettable="true"
     * @generated
     */
    String getLdInst();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLdInst <em>Ld Inst</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLdInst <em>Ld Inst</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetLdInst()
     * @see #getLdInst()
     * @see #setLdInst(String)
     * @generated
     */
    void unsetLdInst();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLdInst <em>Ld Inst</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Ln Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ln Class</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ln Class</em>' attribute.
     * @see #isSetLnClass()
     * @see #unsetLnClass()
     * @see #setLnClass(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLNode_LnClass()
     * @model unique="false" unsettable="true"
     * @generated
     */
    String getLnClass();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLnClass <em>Ln Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ln Class</em>' attribute.
     * @see #isSetLnClass()
     * @see #unsetLnClass()
     * @see #getLnClass()
     * @generated
     */
    void setLnClass( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLnClass <em>Ln Class</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetLnClass()
     * @see #getLnClass()
     * @see #setLnClass(String)
     * @generated
     */
    void unsetLnClass();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLnClass <em>Ln Class</em>}' attribute is set.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ln Class</em>' attribute is set.
     * @see #unsetLnClass()
     * @see #getLnClass()
     * @see #setLnClass(String)
     * @generated
     */
    boolean isSetLnClass();

    /**
     * Returns the value of the '<em><b>Ln Inst</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ln Inst</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ln Inst</em>' attribute.
     * @see #isSetLnInst()
     * @see #unsetLnInst()
     * @see #setLnInst(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLNode_LnInst()
     * @model default="" unique="false" unsettable="true"
     * @generated
     */
    String getLnInst();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLnInst <em>Ln Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ln Inst</em>' attribute.
     * @see #isSetLnInst()
     * @see #unsetLnInst()
     * @see #getLnInst()
     * @generated
     */
    void setLnInst( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLnInst <em>Ln Inst</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetLnInst()
     * @see #getLnInst()
     * @see #setLnInst(String)
     * @generated
     */
    void unsetLnInst();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLnInst <em>Ln Inst</em>}' attribute is set.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ln Inst</em>' attribute is set.
     * @see #unsetLnInst()
     * @see #getLnInst()
     * @see #setLnInst(String)
     * @generated
     */
    boolean isSetLnInst();

    /**
     * Returns the value of the '<em><b>Ln Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ln Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ln Type</em>' attribute.
     * @see #isSetLnType()
     * @see #unsetLnType()
     * @see #setLnType(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLNode_LnType()
     * @model unsettable="true"
     * @generated
     */
    String getLnType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLnType <em>Ln Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ln Type</em>' attribute.
     * @see #isSetLnType()
     * @see #unsetLnType()
     * @see #getLnType()
     * @generated
     */
    void setLnType( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLnType <em>Ln Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLnType()
     * @see #getLnType()
     * @see #setLnType(String)
     * @generated
     */
    void unsetLnType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLnType <em>Ln Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ln Type</em>' attribute is set.
     * @see #unsetLnType()
     * @see #getLnType()
     * @see #setLnType(String)
     * @generated
     */
    boolean isSetLnType();

    /**
     * Returns the value of the '<em><b>Prefix</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Prefix</em>' attribute.
     * @see #isSetPrefix()
     * @see #unsetPrefix()
     * @see #setPrefix(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLNode_Prefix()
     * @model default="" unsettable="true"
     * @generated
     */
    String getPrefix();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getPrefix <em>Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Prefix</em>' attribute.
     * @see #isSetPrefix()
     * @see #unsetPrefix()
     * @see #getPrefix()
     * @generated
     */
    void setPrefix( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getPrefix <em>Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPrefix()
     * @see #getPrefix()
     * @see #setPrefix(String)
     * @generated
     */
    void unsetPrefix();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getPrefix <em>Prefix</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Prefix</em>' attribute is set.
     * @see #unsetPrefix()
     * @see #getPrefix()
     * @see #setPrefix(String)
     * @generated
     */
    boolean isSetPrefix();

    /**
     * Returns the value of the '<em><b>Refers To Any LN</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReferredByLNode <em>Referred By LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Any LN</em>' reference.
     * @see #isSetRefersToAnyLN()
     * @see #unsetRefersToAnyLN()
     * @see #setRefersToAnyLN(AnyLN)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLNode_RefersToAnyLN()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReferredByLNode
     * @model opposite="ReferredByLNode" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    AnyLN getRefersToAnyLN();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getRefersToAnyLN <em>Refers To Any LN</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getRefersToAnyLN <em>Refers To Any LN</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToAnyLN()
     * @see #getRefersToAnyLN()
     * @see #setRefersToAnyLN(AnyLN)
     * @generated
     */
    void unsetRefersToAnyLN();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getRefersToAnyLN <em>Refers To Any LN</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Any LN</em>' reference is set.
     * @see #unsetRefersToAnyLN()
     * @see #getRefersToAnyLN()
     * @see #setRefersToAnyLN(AnyLN)
     * @generated
     */
    boolean isSetRefersToAnyLN();

    /**
     * Returns the value of the '<em><b>Parent LNode Container</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeContainer#getLNode <em>LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent LNode Container</em>' container reference.
     * @see #setParentLNodeContainer(LNodeContainer)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLNode_ParentLNodeContainer()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeContainer#getLNode
     * @model opposite="LNode" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    LNodeContainer getParentLNodeContainer();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getParentLNodeContainer <em>Parent LNode Container</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent LNode Container</em>' container reference.
     * @see #getParentLNodeContainer()
     * @generated
     */
    void setParentLNodeContainer( LNodeContainer value );

    /**
     * Returns the value of the '<em><b>Refers To LNode Type</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType#getReferredByLNode <em>Referred By LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To LNode Type</em>' reference.
     * @see #isSetRefersToLNodeType()
     * @see #unsetRefersToLNodeType()
     * @see #setRefersToLNodeType(LNodeType)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLNode_RefersToLNodeType()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType#getReferredByLNode
     * @model opposite="ReferredByLNode" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    LNodeType getRefersToLNodeType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getRefersToLNodeType <em>Refers To LNode Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To LNode Type</em>' reference.
     * @see #isSetRefersToLNodeType()
     * @see #unsetRefersToLNodeType()
     * @see #getRefersToLNodeType()
     * @generated
     */
    void setRefersToLNodeType( LNodeType value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getRefersToLNodeType <em>Refers To LNode Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToLNodeType()
     * @see #getRefersToLNodeType()
     * @see #setRefersToLNodeType(LNodeType)
     * @generated
     */
    void unsetRefersToLNodeType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getRefersToLNodeType <em>Refers To LNode Type</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To LNode Type</em>' reference is set.
     * @see #unsetRefersToLNodeType()
     * @see #getRefersToLNodeType()
     * @see #setRefersToLNodeType(LNodeType)
     * @generated
     */
    boolean isSetRefersToLNodeType();

    /**
     * Returns the value of the '<em><b>Labels</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels#getParentLNode <em>Parent LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Labels</em>' containment reference.
     * @see #isSetLabels()
     * @see #unsetLabels()
     * @see #setLabels(Labels)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLNode_Labels()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels#getParentLNode
     * @model opposite="ParentLNode" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    Labels getLabels();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLabels <em>Labels</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Labels</em>' containment reference.
     * @see #isSetLabels()
     * @see #unsetLabels()
     * @see #getLabels()
     * @generated
     */
    void setLabels( Labels value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLabels <em>Labels</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLabels()
     * @see #getLabels()
     * @see #setLabels(Labels)
     * @generated
     */
    void unsetLabels();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLabels <em>Labels</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Labels</em>' containment reference is set.
     * @see #unsetLabels()
     * @see #getLabels()
     * @see #setLabels(Labels)
     * @generated
     */
    boolean isSetLabels();

    /**
     * Returns the value of the '<em><b>Ln Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ln Uuid</em>' attribute.
     * @see #setLnUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLNode_LnUuid()
     * @model
     * @generated
     */
    String getLnUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLnUuid <em>Ln Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ln Uuid</em>' attribute.
     * @see #getLnUuid()
     * @generated
     */
    void setLnUuid( String value );

    /**
     * Returns the value of the '<em><b>Parent Abstract6100 LNode Container</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Abstract6100LNodeContainer#getLNode <em>LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Abstract6100 LNode Container</em>' container reference.
     * @see #setParentAbstract6100LNodeContainer(Abstract6100LNodeContainer)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLNode_ParentAbstract6100LNodeContainer()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Abstract6100LNodeContainer#getLNode
     * @model opposite="LNode" unsettable="true" ordered="false"
     * @generated
     */
    Abstract6100LNodeContainer getParentAbstract6100LNodeContainer();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getParentAbstract6100LNodeContainer <em>Parent Abstract6100 LNode Container</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Abstract6100 LNode Container</em>' container reference.
     * @see #getParentAbstract6100LNodeContainer()
     * @generated
     */
    void setParentAbstract6100LNodeContainer( Abstract6100LNodeContainer value );

    /**
     * Returns the value of the '<em><b>Referred By LNode Data Ref</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeDataRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeDataRef#getRefersToLNode <em>Refers To LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By LNode Data Ref</em>' reference list.
     * @see #isSetReferredByLNodeDataRef()
     * @see #unsetReferredByLNodeDataRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLNode_ReferredByLNodeDataRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeDataRef#getRefersToLNode
     * @model opposite="RefersToLNode" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< LNodeDataRef > getReferredByLNodeDataRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getReferredByLNodeDataRef <em>Referred By LNode Data Ref</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByLNodeDataRef()
     * @see #getReferredByLNodeDataRef()
     * @generated
     */
    void unsetReferredByLNodeDataRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getReferredByLNodeDataRef <em>Referred By LNode Data Ref</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By LNode Data Ref</em>' reference list is set.
     * @see #unsetReferredByLNodeDataRef()
     * @see #getReferredByLNodeDataRef()
     * @generated
     */
    boolean isSetReferredByLNodeDataRef();

    /**
     * Returns the value of the '<em><b>Referred By Logic Var Ref</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogicVarRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogicVarRef#getRefersToLNode <em>Refers To LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Logic Var Ref</em>' reference list.
     * @see #isSetReferredByLogicVarRef()
     * @see #unsetReferredByLogicVarRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLNode_ReferredByLogicVarRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LogicVarRef#getRefersToLNode
     * @model opposite="RefersToLNode" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< LogicVarRef > getReferredByLogicVarRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getReferredByLogicVarRef <em>Referred By Logic Var Ref</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByLogicVarRef()
     * @see #getReferredByLogicVarRef()
     * @generated
     */
    void unsetReferredByLogicVarRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getReferredByLogicVarRef <em>Referred By Logic Var Ref</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Logic Var Ref</em>' reference list is set.
     * @see #unsetReferredByLogicVarRef()
     * @see #getReferredByLogicVarRef()
     * @generated
     */
    boolean isSetReferredByLogicVarRef();

    /**
     * Returns the value of the '<em><b>Referred By Process Echo</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho#getRefersToLNode <em>Refers To LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Process Echo</em>' reference list.
     * @see #isSetReferredByProcessEcho()
     * @see #unsetReferredByProcessEcho()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLNode_ReferredByProcessEcho()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho#getRefersToLNode
     * @model opposite="RefersToLNode" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< ProcessEcho > getReferredByProcessEcho();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getReferredByProcessEcho <em>Referred By Process Echo</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByProcessEcho()
     * @see #getReferredByProcessEcho()
     * @generated
     */
    void unsetReferredByProcessEcho();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getReferredByProcessEcho <em>Referred By Process Echo</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Process Echo</em>' reference list is set.
     * @see #unsetReferredByProcessEcho()
     * @see #getReferredByProcessEcho()
     * @generated
     */
    boolean isSetReferredByProcessEcho();

    /**
     * Returns the value of the '<em><b>Referred By Control Ref</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getRefersToLNode <em>Refers To LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Control Ref</em>' reference list.
     * @see #isSetReferredByControlRef()
     * @see #unsetReferredByControlRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLNode_ReferredByControlRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getRefersToLNode
     * @model opposite="RefersToLNode" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< ControlRef > getReferredByControlRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getReferredByControlRef <em>Referred By Control Ref</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByControlRef()
     * @see #getReferredByControlRef()
     * @generated
     */
    void unsetReferredByControlRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getReferredByControlRef <em>Referred By Control Ref</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Control Ref</em>' reference list is set.
     * @see #unsetReferredByControlRef()
     * @see #getReferredByControlRef()
     * @generated
     */
    boolean isSetReferredByControlRef();

    /**
     * Returns the value of the '<em><b>Referred By Source Ref</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getRefersToLNode <em>Refers To LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Source Ref</em>' reference list.
     * @see #isSetReferredBySourceRef()
     * @see #unsetReferredBySourceRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLNode_ReferredBySourceRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getRefersToLNode
     * @model opposite="RefersToLNode" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< SourceRef > getReferredBySourceRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getReferredBySourceRef <em>Referred By Source Ref</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredBySourceRef()
     * @see #getReferredBySourceRef()
     * @generated
     */
    void unsetReferredBySourceRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getReferredBySourceRef <em>Referred By Source Ref</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Source Ref</em>' reference list is set.
     * @see #unsetReferredBySourceRef()
     * @see #getReferredBySourceRef()
     * @generated
     */
    boolean isSetReferredBySourceRef();

} // LNode
