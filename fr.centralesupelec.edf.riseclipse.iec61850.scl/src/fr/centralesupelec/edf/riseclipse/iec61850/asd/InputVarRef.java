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
 * A representation of the model object '<em><b>Input Var Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.InputVarRef#getParentBehaviorDescriptionRef <em>Parent Behavior Description Ref</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getInputVarRef()
 * @model
 * @generated
 */
public interface InputVarRef extends VariableRef {
    /**
     * Returns the value of the '<em><b>Parent Behavior Description Ref</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescriptionRef#getInputVarRef <em>Input Var Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Behavior Description Ref</em>' container reference.
     * @see #setParentBehaviorDescriptionRef(BehaviorDescriptionRef)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getInputVarRef_ParentBehaviorDescriptionRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescriptionRef#getInputVarRef
     * @model opposite="InputVarRef" unsettable="true" ordered="false"
     * @generated
     */
    BehaviorDescriptionRef getParentBehaviorDescriptionRef();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.InputVarRef#getParentBehaviorDescriptionRef <em>Parent Behavior Description Ref</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Behavior Description Ref</em>' container reference.
     * @see #getParentBehaviorDescriptionRef()
     * @generated
     */
    void setParentBehaviorDescriptionRef( BehaviorDescriptionRef value );

} // InputVarRef
