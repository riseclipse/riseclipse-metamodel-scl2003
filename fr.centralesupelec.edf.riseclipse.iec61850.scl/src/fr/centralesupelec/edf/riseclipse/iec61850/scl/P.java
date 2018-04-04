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
 * A representation of the model object '<em><b>P</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.P#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getP()
 * @model extendedMetaData="kind='simple'"
 * @generated
 */
public interface P extends PAddr {
    /**
	 * Returns the value of the '<em><b>Address</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Address#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Address</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' container reference.
	 * @see #setAddress(Address)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getP_Address()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Address#getP
	 * @model opposite="P" resolveProxies="false" unsettable="true"
	 * @generated
	 */
    Address getAddress();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.P#getAddress <em>Address</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' container reference.
	 * @see #getAddress()
	 * @generated
	 */
    void setAddress( Address value );

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='P_type_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'type attribute shall be present in P (line \' + self.lineNumber.toString() + \')\' ,\n\tstatus : Boolean = \n        self.type &lt;&gt; null\n\n    \n}.status'"
	 * @generated
	 */
	boolean validateP_type_required(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='P_type_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'type attribute shall be valid in P (line \' + self.lineNumber.toString() + \')). \'\n          + \'Current value is \' + self.type.toString()\n        ,\n\tstatus : Boolean = \n        self.type &lt;&gt; null implies self.validSclPTypeEnum( type )\n    \n    \n}.status'"
	 * @generated
	 */
	boolean validateP_type_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='P_value'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'content shall be valid according to its type in P (line \' + self.lineNumber.toString() + \')). \'\n          + \'Current value is \' + self.value.toString() + \' for type \' + self.type.toString()\n        ,\n\tstatus : Boolean = \n        if self.type = \'IP\' or self.type = \'IP-SUBNET\' or self.type = \'IP-GATEWAY\' then\n            -- XSD: &lt;xs:pattern value=\"([0-9]{1,2}|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.([0-9]{1,2}|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.([0-9]{1,2}|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.([0-9]{1,2}|1[0-9]{2}|2[0-4][0-9]|25[0-5])\"/&gt;\n            self.value.matches( \'([0-9]{1,2}|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\u002E([0-9]{1,2}|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\u002E([0-9]{1,2}|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\u002E([0-9]{1,2}|1[0-9]{2}|2[0-4][0-9]|25[0-5])\' )\n        else if self.type = \'IPv6\' or self.type = \'IPv6-GATEWAY\' then\n            self.value.matches( \'([0-9a-f]{1,4}:){7}[0-9a-f]{1,4}\' )\n        else if self.type = \'IPv6-SUBNET\' then\n            self.value.matches( \'/[1-9]|/[1-9][0-9]|/1[0-1][0-9]|/12[0-7]\' )\n        else if self.type = \'DNSName\' then\n            -- XSD: &lt;xs:pattern value=\"\\S*\"/&gt;\n            -- \\s and \\S not recognized ? \n            self.value.matches( \'[- \\t\\n\\u000B\\f\\r]*\' )\n        else if self.type = \'IPv6FlowLabel\' then\n            self.value.matches( \'[0-9a-fA-F]{1,5}\' )\n        else if self.type = \'OSI-NSAP\' then\n            self.value.matches( \'[0-9A-F]{1,40}\' )\n        else if self.type = \'OSI-TSEL\' then\n            self.value.matches( \'[0-9A-F]{1,8}\' )\n        else\n            -- TODO: others kind of adresses\n            true\n        endif endif endif endif endif endif endif\n\n\n\n}.status'"
	 * @generated
	 */
	boolean validateP_value(DiagnosticChain diagnostics, Map<Object, Object> context);

} // P
