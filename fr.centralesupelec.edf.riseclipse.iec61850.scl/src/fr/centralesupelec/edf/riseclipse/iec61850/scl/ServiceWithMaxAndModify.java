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
 * A representation of the model object '<em><b>Service With Max And Modify</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithMaxAndModify#getModify <em>Modify</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServiceWithMaxAndModify()
 * @model
 * @generated
 */
public interface ServiceWithMaxAndModify extends ServiceWithMax {
    /**
	 * Returns the value of the '<em><b>Modify</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Modify</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Modify</em>' attribute.
	 * @see #isSetModify()
	 * @see #unsetModify()
	 * @see #setModify(Boolean)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServiceWithMaxAndModify_Modify()
	 * @model unsettable="true"
	 * @generated
	 */
    Boolean getModify();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithMaxAndModify#getModify <em>Modify</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modify</em>' attribute.
	 * @see #isSetModify()
	 * @see #unsetModify()
	 * @see #getModify()
	 * @generated
	 */
    void setModify(Boolean value);

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithMaxAndModify#getModify <em>Modify</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetModify()
	 * @see #getModify()
	 * @see #setModify(Boolean)
	 * @generated
	 */
    void unsetModify();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithMaxAndModify#getModify <em>Modify</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Modify</em>' attribute is set.
	 * @see #unsetModify()
	 * @see #getModify()
	 * @see #setModify(Boolean)
	 * @generated
	 */
    boolean isSetModify();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ServiceWithMaxAndModify_nothing'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n        true\n\n\n'"
	 * @generated
	 */
	boolean validateServiceWithMaxAndModify_nothing(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ServiceWithMaxAndModify
