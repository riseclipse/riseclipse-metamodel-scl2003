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
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Communication#getSubNetwork <em>Sub Network</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Communication#getSCL <em>SCL</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getCommunication()
 * @model
 * @generated
 */
public interface Communication extends UnNaming {
    /**
	 * Returns the value of the '<em><b>Sub Network</b></em>' containment reference list.
	 * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubNetwork}.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubNetwork#getCommunication <em>Communication</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sub Network</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Network</em>' containment reference list.
	 * @see #isSetSubNetwork()
	 * @see #unsetSubNetwork()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getCommunication_SubNetwork()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SubNetwork#getCommunication
	 * @model opposite="Communication" containment="true" unsettable="true" ordered="false"
	 * @generated
	 */
    EList<SubNetwork> getSubNetwork();

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Communication#getSubNetwork <em>Sub Network</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetSubNetwork()
	 * @see #getSubNetwork()
	 * @generated
	 */
    void unsetSubNetwork();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Communication#getSubNetwork <em>Sub Network</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sub Network</em>' containment reference list is set.
	 * @see #unsetSubNetwork()
	 * @see #getSubNetwork()
	 * @generated
	 */
    boolean isSetSubNetwork();

    /**
	 * Returns the value of the '<em><b>SCL</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getCommunication <em>Communication</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SCL</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>SCL</em>' container reference.
	 * @see #setSCL(SCL)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getCommunication_SCL()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getCommunication
	 * @model opposite="Communication" resolveProxies="false" unsettable="true"
	 * @generated
	 */
    SCL getSCL();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Communication#getSCL <em>SCL</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SCL</em>' container reference.
	 * @see #getSCL()
	 * @generated
	 */
    void setSCL( SCL value );

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Communication_nothing'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n        true\n\n\n'"
	 * @generated
	 */
	boolean validateCommunication_nothing(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Communication_at_least_one_SubNetwork_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Communication shall contain at least one SubNetwork (line \' + self.lineNumber.toString() + \')\' ,\n\tstatus : Boolean = \n        self.SubNetwork-&gt;notEmpty()\n\n\n\n}.status'"
	 * @generated
	 */
	boolean validateCommunication_at_least_one_SubNetwork_required(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Communication
