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
 * A representation of the model object '<em><b>Voltage</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getVoltage()
 * @model extendedMetaData="kind='simple'"
 * @generated
 */
public interface Voltage extends ValueWithUnit {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Voltage_unit_value_fixed'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'unit attribute shall be V in Voltage (line \' + self.lineNumber.toString() + \'). \'\n          + \'Current value is \' + self.unit.toString()\n        ,\n\tstatus : Boolean = \n        self.unit &lt;&gt; null implies self.unit = \'V\'\n\n\n\n}.status'"
	 * @generated
	 */
	boolean validateVoltage_unit_value_fixed(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Voltage
