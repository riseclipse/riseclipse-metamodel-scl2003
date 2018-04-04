/**
 *  Copyright (c) 2017 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.iec61850.scl;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;

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
	 * @model opposite="EqSubFunction" resolveProxies="false" unsettable="true"
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

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='EqSubFunction_nothing'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n        true\n\n\n'"
	 * @generated
	 */
	boolean validateEqSubFunction_nothing(DiagnosticChain diagnostics, Map<Object, Object> context);

} // EqSubFunction
