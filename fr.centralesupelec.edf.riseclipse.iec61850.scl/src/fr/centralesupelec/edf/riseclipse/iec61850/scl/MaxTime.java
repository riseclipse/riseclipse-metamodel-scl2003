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
 * A representation of the model object '<em><b>Max Time</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getMaxTime()
 * @model extendedMetaData="kind='simple'"
 * @generated
 */
public interface MaxTime extends DurationInMilliSec {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MaxTime_nothing'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * inv MaxTime_nothing: true\n \052/\nreturn &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;'"
	 * @generated
	 */
	boolean validateMaxTime_nothing(DiagnosticChain diagnostics, Map<Object, Object> context);
} // MaxTime
