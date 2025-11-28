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
 * A representation of the model object '<em><b>Behavior Description Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of the BehaviorDescriptionRef element
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescriptionRef#getInputVarRef <em>Input Var Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescriptionRef#getOutputVarRef <em>Output Var Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescriptionRef#getBehaviorDescription <em>Behavior Description</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescriptionRef#getBehaviorDescriptionUuid <em>Behavior Description Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescriptionRef#getParentFunctionRoleContent <em>Parent Function Role Content</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescriptionRef#getRefersToBehaviorDescription <em>Refers To Behavior Description</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getBehaviorDescriptionRef()
 * @model
 * @generated
 */
public interface BehaviorDescriptionRef extends FunctionalVariantRefContainer {
    /**
     * Returns the value of the '<em><b>Input Var Ref</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.InputVarRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.InputVarRef#getParentBehaviorDescriptionRef <em>Parent Behavior Description Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reference to InputVar belonging to current behavior description
     * <!-- end-model-doc -->
     * @return the value of the '<em>Input Var Ref</em>' containment reference list.
     * @see #isSetInputVarRef()
     * @see #unsetInputVarRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getBehaviorDescriptionRef_InputVarRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.InputVarRef#getParentBehaviorDescriptionRef
     * @model opposite="ParentBehaviorDescriptionRef" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='InputVarRef' namespace='##targetNamespace'"
     * @generated
     */
    EList< InputVarRef > getInputVarRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescriptionRef#getInputVarRef <em>Input Var Ref</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInputVarRef()
     * @see #getInputVarRef()
     * @generated
     */
    void unsetInputVarRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescriptionRef#getInputVarRef <em>Input Var Ref</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Input Var Ref</em>' containment reference list is set.
     * @see #unsetInputVarRef()
     * @see #getInputVarRef()
     * @generated
     */
    boolean isSetInputVarRef();

    /**
     * Returns the value of the '<em><b>Output Var Ref</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.OutputVarRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.OutputVarRef#getParentBehaviorDescriptionRef <em>Parent Behavior Description Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reference to OutputVar belonging to current behavior description
     * <!-- end-model-doc -->
     * @return the value of the '<em>Output Var Ref</em>' containment reference list.
     * @see #isSetOutputVarRef()
     * @see #unsetOutputVarRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getBehaviorDescriptionRef_OutputVarRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.OutputVarRef#getParentBehaviorDescriptionRef
     * @model opposite="ParentBehaviorDescriptionRef" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='OutputVarRef' namespace='##targetNamespace'"
     * @generated
     */
    EList< OutputVarRef > getOutputVarRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescriptionRef#getOutputVarRef <em>Output Var Ref</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOutputVarRef()
     * @see #getOutputVarRef()
     * @generated
     */
    void unsetOutputVarRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescriptionRef#getOutputVarRef <em>Output Var Ref</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Output Var Ref</em>' containment reference list is set.
     * @see #unsetOutputVarRef()
     * @see #getOutputVarRef()
     * @generated
     */
    boolean isSetOutputVarRef();

    /**
     * Returns the value of the '<em><b>Behavior Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Path to the behavior description referenced
     * <!-- end-model-doc -->
     * @return the value of the '<em>Behavior Description</em>' attribute.
     * @see #setBehaviorDescription(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getBehaviorDescriptionRef_BehaviorDescription()
     * @model extendedMetaData="kind='attribute' name='behaviorDescription'"
     * @generated
     */
    String getBehaviorDescription();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescriptionRef#getBehaviorDescription <em>Behavior Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Behavior Description</em>' attribute.
     * @see #getBehaviorDescription()
     * @generated
     */
    void setBehaviorDescription( String value );

    /**
     * Returns the value of the '<em><b>Behavior Description Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UUID of the behavior description referenced
     * <!-- end-model-doc -->
     * @return the value of the '<em>Behavior Description Uuid</em>' attribute.
     * @see #setBehaviorDescriptionUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getBehaviorDescriptionRef_BehaviorDescriptionUuid()
     * @model extendedMetaData="kind='attribute' name='behaviorDescriptionUuid'"
     * @generated
     */
    String getBehaviorDescriptionUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescriptionRef#getBehaviorDescriptionUuid <em>Behavior Description Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Behavior Description Uuid</em>' attribute.
     * @see #getBehaviorDescriptionUuid()
     * @generated
     */
    void setBehaviorDescriptionUuid( String value );

    /**
     * Returns the value of the '<em><b>Parent Function Role Content</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getBehaviorDescriptionRef <em>Behavior Description Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Function Role Content</em>' container reference.
     * @see #setParentFunctionRoleContent(FunctionRoleContent)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getBehaviorDescriptionRef_ParentFunctionRoleContent()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getBehaviorDescriptionRef
     * @model opposite="behaviorDescriptionRef" unsettable="true" ordered="false"
     * @generated
     */
    FunctionRoleContent getParentFunctionRoleContent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescriptionRef#getParentFunctionRoleContent <em>Parent Function Role Content</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Function Role Content</em>' container reference.
     * @see #getParentFunctionRoleContent()
     * @generated
     */
    void setParentFunctionRoleContent( FunctionRoleContent value );

    /**
     * Returns the value of the '<em><b>Refers To Behavior Description</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getReferredByBehaviorDescriptionRef <em>Referred By Behavior Description Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Behavior Description</em>' reference.
     * @see #isSetRefersToBehaviorDescription()
     * @see #unsetRefersToBehaviorDescription()
     * @see #setRefersToBehaviorDescription(BehaviorDescription)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getBehaviorDescriptionRef_RefersToBehaviorDescription()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getReferredByBehaviorDescriptionRef
     * @model opposite="ReferredByBehaviorDescriptionRef" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    BehaviorDescription getRefersToBehaviorDescription();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescriptionRef#getRefersToBehaviorDescription <em>Refers To Behavior Description</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Behavior Description</em>' reference.
     * @see #isSetRefersToBehaviorDescription()
     * @see #unsetRefersToBehaviorDescription()
     * @see #getRefersToBehaviorDescription()
     * @generated
     */
    void setRefersToBehaviorDescription( BehaviorDescription value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescriptionRef#getRefersToBehaviorDescription <em>Refers To Behavior Description</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToBehaviorDescription()
     * @see #getRefersToBehaviorDescription()
     * @see #setRefersToBehaviorDescription(BehaviorDescription)
     * @generated
     */
    void unsetRefersToBehaviorDescription();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescriptionRef#getRefersToBehaviorDescription <em>Refers To Behavior Description</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Behavior Description</em>' reference is set.
     * @see #unsetRefersToBehaviorDescription()
     * @see #getRefersToBehaviorDescription()
     * @see #setRefersToBehaviorDescription(BehaviorDescription)
     * @generated
     */
    boolean isSetRefersToBehaviorDescription();

} // BehaviorDescriptionRef
