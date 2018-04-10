/**
 *  Copyright (c) 2018 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
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
 *      http://wdi.supelec.fr/software/RiseClipse/
 */
package fr.centralesupelec.edf.riseclipse.iec61850.scl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eq Sub Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqSubFunction#getAbstractEqFuncSubFunc <em>Abstract Eq Func Sub Func</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getEqSubFunction()
 * @model
 * @generated
 */
public interface EqSubFunction extends AbstractEqFuncSubFunc {
    /**
     * Returns the value of the '<em><b>Abstract Eq Func Sub Func</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractEqFuncSubFunc#getEqSubFunction <em>Eq Sub Function</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Abstract Eq Func Sub Func</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Abstract Eq Func Sub Func</em>' container reference.
     * @see #setAbstractEqFuncSubFunc(AbstractEqFuncSubFunc)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getEqSubFunction_AbstractEqFuncSubFunc()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractEqFuncSubFunc#getEqSubFunction
     * @model opposite="EqSubFunction" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    AbstractEqFuncSubFunc getAbstractEqFuncSubFunc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqSubFunction#getAbstractEqFuncSubFunc <em>Abstract Eq Func Sub Func</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Abstract Eq Func Sub Func</em>' container reference.
     * @see #getAbstractEqFuncSubFunc()
     * @generated
     */
    void setAbstractEqFuncSubFunc( AbstractEqFuncSubFunc value );

} // EqSubFunction
