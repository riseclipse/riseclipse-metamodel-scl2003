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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.Function;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SignalRole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of the FunctionRef element
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRef#getSignalRole <em>Signal Role</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRef#getFunction <em>Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRef#getFunctionUuid <em>Function Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRef#getParentAllocationRole <em>Parent Allocation Role</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRef#getParentFunctionRoleContent <em>Parent Function Role Content</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRef#getRefersToFunction <em>Refers To Function</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionRef()
 * @model
 * @generated
 */
public interface FunctionRef extends FunctionalVariantRefContainer {
    /**
     * Returns the value of the '<em><b>Signal Role</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SignalRole}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SignalRole#getParentFunctionRef <em>Parent Function Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Signal list attached to the referenced function in the context of the cureent Role definition
     * <!-- end-model-doc -->
     * @return the value of the '<em>Signal Role</em>' containment reference list.
     * @see #isSetSignalRole()
     * @see #unsetSignalRole()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionRef_SignalRole()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SignalRole#getParentFunctionRef
     * @model opposite="ParentFunctionRef" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='SignalRole' namespace='##targetNamespace'"
     * @generated
     */
    EList< SignalRole > getSignalRole();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRef#getSignalRole <em>Signal Role</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSignalRole()
     * @see #getSignalRole()
     * @generated
     */
    void unsetSignalRole();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRef#getSignalRole <em>Signal Role</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Signal Role</em>' containment reference list is set.
     * @see #unsetSignalRole()
     * @see #getSignalRole()
     * @generated
     */
    boolean isSetSignalRole();

    /**
     * Returns the value of the '<em><b>Function</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Path to the function referenced
     * <!-- end-model-doc -->
     * @return the value of the '<em>Function</em>' attribute.
     * @see #setFunction(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionRef_Function()
     * @model extendedMetaData="kind='attribute' name='function'"
     * @generated
     */
    String getFunction();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRef#getFunction <em>Function</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Function</em>' attribute.
     * @see #getFunction()
     * @generated
     */
    void setFunction( String value );

    /**
     * Returns the value of the '<em><b>Function Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UUID of the function referenced
     * <!-- end-model-doc -->
     * @return the value of the '<em>Function Uuid</em>' attribute.
     * @see #setFunctionUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionRef_FunctionUuid()
     * @model extendedMetaData="kind='attribute' name='functionUuid'"
     * @generated
     */
    String getFunctionUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRef#getFunctionUuid <em>Function Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Function Uuid</em>' attribute.
     * @see #getFunctionUuid()
     * @generated
     */
    void setFunctionUuid( String value );

    /**
     * Returns the value of the '<em><b>Parent Allocation Role</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRole#getFunctionRef <em>Function Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Allocation Role</em>' container reference.
     * @see #setParentAllocationRole(AllocationRole)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionRef_ParentAllocationRole()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRole#getFunctionRef
     * @model opposite="FunctionRef" unsettable="true" ordered="false"
     * @generated
     */
    AllocationRole getParentAllocationRole();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRef#getParentAllocationRole <em>Parent Allocation Role</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Allocation Role</em>' container reference.
     * @see #getParentAllocationRole()
     * @generated
     */
    void setParentAllocationRole( AllocationRole value );

    /**
     * Returns the value of the '<em><b>Parent Function Role Content</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getFunctionRef <em>Function Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Function Role Content</em>' container reference.
     * @see #setParentFunctionRoleContent(FunctionRoleContent)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionRef_ParentFunctionRoleContent()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getFunctionRef
     * @model opposite="FunctionRef" unsettable="true" ordered="false"
     * @generated
     */
    FunctionRoleContent getParentFunctionRoleContent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRef#getParentFunctionRoleContent <em>Parent Function Role Content</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Function Role Content</em>' container reference.
     * @see #getParentFunctionRoleContent()
     * @generated
     */
    void setParentFunctionRoleContent( FunctionRoleContent value );

    /**
     * Returns the value of the '<em><b>Refers To Function</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getReferredByFunctionRef <em>Referred By Function Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Function</em>' reference.
     * @see #isSetRefersToFunction()
     * @see #unsetRefersToFunction()
     * @see #setRefersToFunction(Function)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionRef_RefersToFunction()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getReferredByFunctionRef
     * @model opposite="ReferredByFunctionRef" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    Function getRefersToFunction();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRef#getRefersToFunction <em>Refers To Function</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Function</em>' reference.
     * @see #isSetRefersToFunction()
     * @see #unsetRefersToFunction()
     * @see #getRefersToFunction()
     * @generated
     */
    void setRefersToFunction( Function value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRef#getRefersToFunction <em>Refers To Function</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToFunction()
     * @see #getRefersToFunction()
     * @see #setRefersToFunction(Function)
     * @generated
     */
    void unsetRefersToFunction();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRef#getRefersToFunction <em>Refers To Function</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Function</em>' reference is set.
     * @see #unsetRefersToFunction()
     * @see #getRefersToFunction()
     * @see #setRefersToFunction(Function)
     * @generated
     */
    boolean isSetRefersToFunction();

} // FunctionRef
