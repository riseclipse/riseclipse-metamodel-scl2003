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
 * A representation of the model object '<em><b>Sub Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubCategory#getParentFunctionCategory <em>Parent Function Category</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSubCategory()
 * @model
 * @generated
 */
public interface SubCategory extends FunctionCategory {
    /**
     * Returns the value of the '<em><b>Parent Function Category</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategory#getSubCategory <em>Sub Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Function Category</em>' container reference.
     * @see #setParentFunctionCategory(FunctionCategory)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSubCategory_ParentFunctionCategory()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategory#getSubCategory
     * @model opposite="SubCategory" unsettable="true" ordered="false"
     * @generated
     */
    FunctionCategory getParentFunctionCategory();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubCategory#getParentFunctionCategory <em>Parent Function Category</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Function Category</em>' container reference.
     * @see #getParentFunctionCategory()
     * @generated
     */
    void setParentFunctionCategory( FunctionCategory value );

} // SubCategory
