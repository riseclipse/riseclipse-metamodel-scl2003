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
 * A representation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Address#getConnectedAP <em>Connected AP</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Address#getControlBlock <em>Control Block</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Address#getP <em>P</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAddress()
 * @model
 * @generated
 */
public interface Address extends SclObject {
    /**
	 * Returns the value of the '<em><b>Connected AP</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connected AP</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected AP</em>' container reference.
	 * @see #setConnectedAP(ConnectedAP)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAddress_ConnectedAP()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getAddress
	 * @model opposite="Address" resolveProxies="false" unsettable="true"
	 * @generated
	 */
    ConnectedAP getConnectedAP();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Address#getConnectedAP <em>Connected AP</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connected AP</em>' container reference.
	 * @see #getConnectedAP()
	 * @generated
	 */
    void setConnectedAP( ConnectedAP value );

    /**
	 * Returns the value of the '<em><b>Control Block</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Control Block</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Block</em>' container reference.
	 * @see #setControlBlock(ControlBlock)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAddress_ControlBlock()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock#getAddress
	 * @model opposite="Address" resolveProxies="false" unsettable="true"
	 * @generated
	 */
    ControlBlock getControlBlock();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Address#getControlBlock <em>Control Block</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Block</em>' container reference.
	 * @see #getControlBlock()
	 * @generated
	 */
    void setControlBlock( ControlBlock value );

    /**
	 * Returns the value of the '<em><b>P</b></em>' containment reference list.
	 * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.P}.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.P#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>P</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' containment reference list.
	 * @see #isSetP()
	 * @see #unsetP()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAddress_P()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.P#getAddress
	 * @model opposite="Address" containment="true" unsettable="true" ordered="false"
	 * @generated
	 */
    EList<P> getP();

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Address#getP <em>P</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetP()
	 * @see #getP()
	 * @generated
	 */
    void unsetP();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Address#getP <em>P</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>P</em>' containment reference list is set.
	 * @see #unsetP()
	 * @see #getP()
	 * @generated
	 */
    boolean isSetP();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Address_nothing'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n        true\n\n\n'"
	 * @generated
	 */
	boolean validateAddress_nothing(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Address_at_least_one_P_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Address shall contain at least one P (line \' + self.lineNumber.toString() + \')\' ,\n\tstatus : Boolean = \n        self.P-&gt;notEmpty()\n\n\n\n}.status'"
	 * @generated
	 */
	boolean validateAddress_at_least_one_P_required(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Address
