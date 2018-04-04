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
 * A representation of the model object '<em><b>BDA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BDA#getDAType <em>DA Type</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getBDA()
 * @model
 * @generated
 */
public interface BDA extends AbstractDataAttribute {
    /**
	 * Returns the value of the '<em><b>DA Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getBDA <em>BDA</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DA Type</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>DA Type</em>' container reference.
	 * @see #setDAType(DAType)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getBDA_DAType()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getBDA
	 * @model opposite="BDA" resolveProxies="false" unsettable="true"
	 * @generated
	 */
    DAType getDAType();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BDA#getDAType <em>DA Type</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DA Type</em>' container reference.
	 * @see #getDAType()
	 * @generated
	 */
    void setDAType( DAType value );

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BDA_nothing'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n        true\n\n\n'"
	 * @generated
	 */
	boolean validateBDA_nothing(DiagnosticChain diagnostics, Map<Object, Object> context);

} // BDA
