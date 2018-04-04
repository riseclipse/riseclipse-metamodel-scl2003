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
 * A representation of the model object '<em><b>PPhys Conn</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.P_PhysConn#getPhysConn <em>Phys Conn</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getP_PhysConn()
 * @model
 * @generated
 */
public interface P_PhysConn extends PAddr {
    /**
	 * Returns the value of the '<em><b>Phys Conn</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.PhysConn#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Phys Conn</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Phys Conn</em>' container reference.
	 * @see #setPhysConn(PhysConn)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getP_PhysConn_PhysConn()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.PhysConn#getP
	 * @model opposite="P" resolveProxies="false" unsettable="true"
	 * @generated
	 */
    PhysConn getPhysConn();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.P_PhysConn#getPhysConn <em>Phys Conn</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phys Conn</em>' container reference.
	 * @see #getPhysConn()
	 * @generated
	 */
    void setPhysConn( PhysConn value );

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='P_PhysConn_type_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'type attribute shall be present in P_PhysConn (line \' + self.lineNumber.toString() + \')\' ,\n\tstatus : Boolean = \n        self.type &lt;&gt; null\n\n    \n}.status'"
	 * @generated
	 */
	boolean validateP_PhysConn_type_required(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='P_PhysConn_type_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'type attribute shall be valid in P_PhysConn (line \' + self.lineNumber.toString() + \'). \'\n          + \'Current value is \' + self.type.toString()\n        ,\n\tstatus : Boolean = \n        self.type &lt;&gt; null implies self.validSclPTypePhysConnEnum( type )\n\n\n\n}.status'"
	 * @generated
	 */
	boolean validateP_PhysConn_type_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

} // P_PhysConn
