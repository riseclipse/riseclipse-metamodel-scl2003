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
 * A representation of the model object '<em><b>Output Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A binding between a variable in the behavior description and a specification data object or output in the behavior description hierarchy.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.OutputVar#getOutputName <em>Output Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.OutputVar#getOutputUuid <em>Output Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.OutputVar#getRefersToControlRef <em>Refers To Control Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.OutputVar#getParentBehaviorDescription <em>Parent Behavior Description</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getOutputVar()
 * @model extendedMetaData="name='tOutputVar' kind='elementOnly'"
 * @generated
 */
public interface OutputVar extends LogicVarRef {
    /**
     * Returns the value of the '<em><b>Output Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * local path to an LNode ControlRef to be used as output of the logic
     * <!-- end-model-doc -->
     * @return the value of the '<em>Output Name</em>' attribute.
     * @see #setOutputName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getOutputVar_OutputName()
     * @model extendedMetaData="kind='attribute' name='outputName'"
     * @generated
     */
    String getOutputName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.OutputVar#getOutputName <em>Output Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Output Name</em>' attribute.
     * @see #getOutputName()
     * @generated
     */
    void setOutputName( String value );

    /**
     * Returns the value of the '<em><b>Output Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UUID of the LNode ControlRef to be used as output of the logic
     * <!-- end-model-doc -->
     * @return the value of the '<em>Output Uuid</em>' attribute.
     * @see #setOutputUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getOutputVar_OutputUuid()
     * @model extendedMetaData="kind='attribute' name='outputUuid'"
     * @generated
     */
    String getOutputUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.OutputVar#getOutputUuid <em>Output Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Output Uuid</em>' attribute.
     * @see #getOutputUuid()
     * @generated
     */
    void setOutputUuid( String value );

    /**
     * Returns the value of the '<em><b>Refers To Control Ref</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getReferredByOutputVar <em>Referred By Output Var</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Control Ref</em>' reference.
     * @see #isSetRefersToControlRef()
     * @see #unsetRefersToControlRef()
     * @see #setRefersToControlRef(ControlRef)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getOutputVar_RefersToControlRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getReferredByOutputVar
     * @model opposite="ReferredByOutputVar" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    ControlRef getRefersToControlRef();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.OutputVar#getRefersToControlRef <em>Refers To Control Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Control Ref</em>' reference.
     * @see #isSetRefersToControlRef()
     * @see #unsetRefersToControlRef()
     * @see #getRefersToControlRef()
     * @generated
     */
    void setRefersToControlRef( ControlRef value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.OutputVar#getRefersToControlRef <em>Refers To Control Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToControlRef()
     * @see #getRefersToControlRef()
     * @see #setRefersToControlRef(ControlRef)
     * @generated
     */
    void unsetRefersToControlRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.OutputVar#getRefersToControlRef <em>Refers To Control Ref</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Control Ref</em>' reference is set.
     * @see #unsetRefersToControlRef()
     * @see #getRefersToControlRef()
     * @see #setRefersToControlRef(ControlRef)
     * @generated
     */
    boolean isSetRefersToControlRef();

    /**
     * Returns the value of the '<em><b>Parent Behavior Description</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getOutputVar <em>Output Var</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Behavior Description</em>' container reference.
     * @see #setParentBehaviorDescription(BehaviorDescription)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getOutputVar_ParentBehaviorDescription()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getOutputVar
     * @model opposite="outputVar" unsettable="true" ordered="false"
     * @generated
     */
    BehaviorDescription getParentBehaviorDescription();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.OutputVar#getParentBehaviorDescription <em>Parent Behavior Description</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Behavior Description</em>' container reference.
     * @see #getParentBehaviorDescription()
     * @generated
     */
    void setParentBehaviorDescription( BehaviorDescription value );

} // OutputVar
