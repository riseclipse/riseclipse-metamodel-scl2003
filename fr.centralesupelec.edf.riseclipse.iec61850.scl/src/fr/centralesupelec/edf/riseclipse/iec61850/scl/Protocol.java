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
 * A representation of the model object '<em><b>Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Protocol#getMustUnderstand <em>Must Understand</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Protocol#getControlWithIEDName <em>Control With IED Name</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getProtocol()
 * @model
 * @generated
 */
public interface Protocol extends SclObject {
    /**
	 * Returns the value of the '<em><b>Must Understand</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Must Understand</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Must Understand</em>' attribute.
	 * @see #isSetMustUnderstand()
	 * @see #unsetMustUnderstand()
	 * @see #setMustUnderstand(Boolean)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getProtocol_MustUnderstand()
	 * @model unsettable="true"
	 * @generated
	 */
    Boolean getMustUnderstand();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Protocol#getMustUnderstand <em>Must Understand</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Understand</em>' attribute.
	 * @see #isSetMustUnderstand()
	 * @see #unsetMustUnderstand()
	 * @see #getMustUnderstand()
	 * @generated
	 */
    void setMustUnderstand( Boolean value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Protocol#getMustUnderstand <em>Must Understand</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetMustUnderstand()
	 * @see #getMustUnderstand()
	 * @see #setMustUnderstand(Boolean)
	 * @generated
	 */
    void unsetMustUnderstand();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Protocol#getMustUnderstand <em>Must Understand</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Must Understand</em>' attribute is set.
	 * @see #unsetMustUnderstand()
	 * @see #getMustUnderstand()
	 * @see #setMustUnderstand(Boolean)
	 * @generated
	 */
    boolean isSetMustUnderstand();

    /**
	 * Returns the value of the '<em><b>Control With IED Name</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Control With IED Name</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Control With IED Name</em>' container reference.
	 * @see #setControlWithIEDName(ControlWithIEDName)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getProtocol_ControlWithIEDName()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName#getProtocol
	 * @model opposite="Protocol" resolveProxies="false" unsettable="true"
	 * @generated
	 */
    ControlWithIEDName getControlWithIEDName();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Protocol#getControlWithIEDName <em>Control With IED Name</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control With IED Name</em>' container reference.
	 * @see #getControlWithIEDName()
	 * @generated
	 */
    void setControlWithIEDName( ControlWithIEDName value );

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Voltage_mustUnderstand_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'mustUnderstand attribute shall be present in Protocol (line \' + self.lineNumber.toString() + \')\' ,\n\tstatus : Boolean = \n        self.mustUnderstand &lt;&gt; null\n\n    \n}.status'"
	 * @generated
	 */
	boolean validateVoltage_mustUnderstand_required(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Voltage_mustUnderstand_value_fixed'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'mustUnderstand attribute shall be V in Protocol (line \' + self.lineNumber.toString() + \'). \'\n          + \'Current value is \' + self.mustUnderstand.toString()\n        ,\n\tstatus : Boolean = \n        self.mustUnderstand &lt;&gt; null implies self.mustUnderstand = true\n\n\n\n}.status'"
	 * @generated
	 */
	boolean validateVoltage_mustUnderstand_value_fixed(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Protocol
