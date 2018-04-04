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
 * A representation of the model object '<em><b>Access Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessControl#getLDevice <em>LDevice</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAccessControl()
 * @model
 * @generated
 */
public interface AccessControl extends SclObject {
    /**
	 * Returns the value of the '<em><b>LDevice</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getAccessControl <em>Access Control</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>LDevice</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>LDevice</em>' container reference.
	 * @see #setLDevice(LDevice)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAccessControl_LDevice()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getAccessControl
	 * @model opposite="AccessControl" resolveProxies="false" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!AccessControl!LDevice'"
	 * @generated
	 */
    LDevice getLDevice();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessControl#getLDevice <em>LDevice</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LDevice</em>' container reference.
	 * @see #getLDevice()
	 * @generated
	 */
    void setLDevice( LDevice value );

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='AccessControl_nothing'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * inv AccessControl_nothing: true\n \052/\nreturn &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;'"
	 * @generated
	 */
	boolean validateAccessControl_nothing(DiagnosticChain diagnostics, Map<Object, Object> context);

} // AccessControl
