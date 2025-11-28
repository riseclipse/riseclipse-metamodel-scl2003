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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.Function;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Cat Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Logical reference to a function. A function may be referenced by multiple categories
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCatRef#getFunction <em>Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCatRef#getFunctionUuid <em>Function Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCatRef#getParentFunctionCategory <em>Parent Function Category</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCatRef#getRefersToFunction <em>Refers To Function</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionCatRef()
 * @model
 * @generated
 */
public interface FunctionCatRef extends BaseExtensionElement {
    /**
     * Returns the value of the '<em><b>Function</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * SCL path of the function associated to the Function Category
     * <!-- end-model-doc -->
     * @return the value of the '<em>Function</em>' attribute.
     * @see #setFunction(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionCatRef_Function()
     * @model extendedMetaData="kind='attribute' name='function'"
     * @generated
     */
    String getFunction();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCatRef#getFunction <em>Function</em>}' attribute.
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
     * UUID of the function associated to the Function Category
     * <!-- end-model-doc -->
     * @return the value of the '<em>Function Uuid</em>' attribute.
     * @see #setFunctionUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionCatRef_FunctionUuid()
     * @model extendedMetaData="kind='attribute' name='functionUuid'"
     * @generated
     */
    String getFunctionUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCatRef#getFunctionUuid <em>Function Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Function Uuid</em>' attribute.
     * @see #getFunctionUuid()
     * @generated
     */
    void setFunctionUuid( String value );

    /**
     * Returns the value of the '<em><b>Parent Function Category</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategory#getFunctionCatRef <em>Function Cat Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Function Category</em>' container reference.
     * @see #setParentFunctionCategory(FunctionCategory)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionCatRef_ParentFunctionCategory()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategory#getFunctionCatRef
     * @model opposite="functionCatRef" unsettable="true" ordered="false"
     * @generated
     */
    FunctionCategory getParentFunctionCategory();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCatRef#getParentFunctionCategory <em>Parent Function Category</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Function Category</em>' container reference.
     * @see #getParentFunctionCategory()
     * @generated
     */
    void setParentFunctionCategory( FunctionCategory value );

    /**
     * Returns the value of the '<em><b>Refers To Function</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getReferredByFunctionCatRef <em>Referred By Function Cat Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Function</em>' reference.
     * @see #isSetRefersToFunction()
     * @see #unsetRefersToFunction()
     * @see #setRefersToFunction(Function)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionCatRef_RefersToFunction()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getReferredByFunctionCatRef
     * @model opposite="ReferredByFunctionCatRef" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    Function getRefersToFunction();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCatRef#getRefersToFunction <em>Refers To Function</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCatRef#getRefersToFunction <em>Refers To Function</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToFunction()
     * @see #getRefersToFunction()
     * @see #setRefersToFunction(Function)
     * @generated
     */
    void unsetRefersToFunction();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCatRef#getRefersToFunction <em>Refers To Function</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Function</em>' reference is set.
     * @see #unsetRefersToFunction()
     * @see #getRefersToFunction()
     * @see #setRefersToFunction(Function)
     * @generated
     */
    boolean isSetRefersToFunction();

} // FunctionCatRef
