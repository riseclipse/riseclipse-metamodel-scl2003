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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A binding between a variable in the behavior description and a specification data object or input in the behavior description hierarchy.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.InputVar#getInputName <em>Input Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.InputVar#getInputUuid <em>Input Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.InputVar#getRefersToSourceRef <em>Refers To Source Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.InputVar#getParentBehaviorDescription <em>Parent Behavior Description</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getInputVar()
 * @model
 * @generated
 */
public interface InputVar extends LogicVarRef {
    /**
     * Returns the value of the '<em><b>Input Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * local path to an LNode SourceRef to be used as input of the logic
     * <!-- end-model-doc -->
     * @return the value of the '<em>Input Name</em>' attribute.
     * @see #setInputName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getInputVar_InputName()
     * @model extendedMetaData="kind='attribute' name='inputName'"
     * @generated
     */
    String getInputName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.InputVar#getInputName <em>Input Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Input Name</em>' attribute.
     * @see #getInputName()
     * @generated
     */
    void setInputName( String value );

    /**
     * Returns the value of the '<em><b>Input Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UUID of the LNode SourceRef to be used as input of the logic
     * <!-- end-model-doc -->
     * @return the value of the '<em>Input Uuid</em>' attribute.
     * @see #setInputUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getInputVar_InputUuid()
     * @model extendedMetaData="kind='attribute' name='inputUuid'"
     * @generated
     */
    String getInputUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.InputVar#getInputUuid <em>Input Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Input Uuid</em>' attribute.
     * @see #getInputUuid()
     * @generated
     */
    void setInputUuid( String value );

    /**
     * Returns the value of the '<em><b>Refers To Source Ref</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getReferredByInputVar <em>Referred By Input Var</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Source Ref</em>' reference.
     * @see #isSetRefersToSourceRef()
     * @see #unsetRefersToSourceRef()
     * @see #setRefersToSourceRef(SourceRef)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getInputVar_RefersToSourceRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getReferredByInputVar
     * @model opposite="ReferredByInputVar" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    SourceRef getRefersToSourceRef();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.InputVar#getRefersToSourceRef <em>Refers To Source Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Source Ref</em>' reference.
     * @see #isSetRefersToSourceRef()
     * @see #unsetRefersToSourceRef()
     * @see #getRefersToSourceRef()
     * @generated
     */
    void setRefersToSourceRef( SourceRef value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.InputVar#getRefersToSourceRef <em>Refers To Source Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToSourceRef()
     * @see #getRefersToSourceRef()
     * @see #setRefersToSourceRef(SourceRef)
     * @generated
     */
    void unsetRefersToSourceRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.InputVar#getRefersToSourceRef <em>Refers To Source Ref</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Source Ref</em>' reference is set.
     * @see #unsetRefersToSourceRef()
     * @see #getRefersToSourceRef()
     * @see #setRefersToSourceRef(SourceRef)
     * @generated
     */
    boolean isSetRefersToSourceRef();

    /**
     * Returns the value of the '<em><b>Parent Behavior Description</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getInputVar <em>Input Var</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Behavior Description</em>' container reference.
     * @see #setParentBehaviorDescription(BehaviorDescription)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getInputVar_ParentBehaviorDescription()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getInputVar
     * @model opposite="InputVar" unsettable="true" ordered="false"
     * @generated
     */
    BehaviorDescription getParentBehaviorDescription();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.InputVar#getParentBehaviorDescription <em>Parent Behavior Description</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Behavior Description</em>' container reference.
     * @see #getParentBehaviorDescription()
     * @generated
     */
    void setParentBehaviorDescription( BehaviorDescription value );

} // InputVar
