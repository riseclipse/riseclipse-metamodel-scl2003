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
 * A representation of the model object '<em><b>Function Category Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of the FunctionCategoryRef element
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategoryRef#getFunctionCategory <em>Function Category</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategoryRef#getFunctionCategoryUuid <em>Function Category Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategoryRef#getParentFunctionRoleContent <em>Parent Function Role Content</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategoryRef#getRefersToFunctionCategory <em>Refers To Function Category</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionCategoryRef()
 * @model
 * @generated
 */
public interface FunctionCategoryRef extends FunctionalVariantRefContainer {
    /**
     * Returns the value of the '<em><b>Function Category</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Path to the function category referenced
     * <!-- end-model-doc -->
     * @return the value of the '<em>Function Category</em>' attribute.
     * @see #setFunctionCategory(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionCategoryRef_FunctionCategory()
     * @model extendedMetaData="kind='attribute' name='functionCategory'"
     * @generated
     */
    String getFunctionCategory();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategoryRef#getFunctionCategory <em>Function Category</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Function Category</em>' attribute.
     * @see #getFunctionCategory()
     * @generated
     */
    void setFunctionCategory( String value );

    /**
     * Returns the value of the '<em><b>Function Category Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UUID of the function category referenced
     * <!-- end-model-doc -->
     * @return the value of the '<em>Function Category Uuid</em>' attribute.
     * @see #setFunctionCategoryUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionCategoryRef_FunctionCategoryUuid()
     * @model extendedMetaData="kind='attribute' name='functionCategoryUuid'"
     * @generated
     */
    String getFunctionCategoryUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategoryRef#getFunctionCategoryUuid <em>Function Category Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Function Category Uuid</em>' attribute.
     * @see #getFunctionCategoryUuid()
     * @generated
     */
    void setFunctionCategoryUuid( String value );

    /**
     * Returns the value of the '<em><b>Parent Function Role Content</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getFunctionCategoryRef <em>Function Category Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Function Role Content</em>' container reference.
     * @see #setParentFunctionRoleContent(FunctionRoleContent)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionCategoryRef_ParentFunctionRoleContent()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getFunctionCategoryRef
     * @model opposite="functionCategoryRef" unsettable="true" ordered="false"
     * @generated
     */
    FunctionRoleContent getParentFunctionRoleContent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategoryRef#getParentFunctionRoleContent <em>Parent Function Role Content</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Function Role Content</em>' container reference.
     * @see #getParentFunctionRoleContent()
     * @generated
     */
    void setParentFunctionRoleContent( FunctionRoleContent value );

    /**
     * Returns the value of the '<em><b>Refers To Function Category</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategory#getReferredByFunctionCategoryRef <em>Referred By Function Category Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Function Category</em>' reference.
     * @see #isSetRefersToFunctionCategory()
     * @see #unsetRefersToFunctionCategory()
     * @see #setRefersToFunctionCategory(FunctionCategory)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionCategoryRef_RefersToFunctionCategory()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategory#getReferredByFunctionCategoryRef
     * @model opposite="ReferredByFunctionCategoryRef" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    FunctionCategory getRefersToFunctionCategory();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategoryRef#getRefersToFunctionCategory <em>Refers To Function Category</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Function Category</em>' reference.
     * @see #isSetRefersToFunctionCategory()
     * @see #unsetRefersToFunctionCategory()
     * @see #getRefersToFunctionCategory()
     * @generated
     */
    void setRefersToFunctionCategory( FunctionCategory value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategoryRef#getRefersToFunctionCategory <em>Refers To Function Category</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToFunctionCategory()
     * @see #getRefersToFunctionCategory()
     * @see #setRefersToFunctionCategory(FunctionCategory)
     * @generated
     */
    void unsetRefersToFunctionCategory();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategoryRef#getRefersToFunctionCategory <em>Refers To Function Category</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Function Category</em>' reference is set.
     * @see #unsetRefersToFunctionCategory()
     * @see #getRefersToFunctionCategory()
     * @see #setRefersToFunctionCategory(FunctionCategory)
     * @generated
     */
    boolean isSetRefersToFunctionCategory();

} // FunctionCategoryRef
