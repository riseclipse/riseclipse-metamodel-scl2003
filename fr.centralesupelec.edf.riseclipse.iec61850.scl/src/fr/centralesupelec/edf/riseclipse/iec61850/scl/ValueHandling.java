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
 * A representation of the model object '<em><b>Value Handling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ValueHandling#getSetToRO <em>Set To RO</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ValueHandling#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getValueHandling()
 * @model
 * @generated
 */
public interface ValueHandling extends SclObject {
    /**
	 * Returns the value of the '<em><b>Set To RO</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Set To RO</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Set To RO</em>' attribute.
	 * @see #isSetSetToRO()
	 * @see #unsetSetToRO()
	 * @see #setSetToRO(Boolean)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getValueHandling_SetToRO()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!ValueHandling!setToRO'"
	 * @generated
	 */
    Boolean getSetToRO();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ValueHandling#getSetToRO <em>Set To RO</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set To RO</em>' attribute.
	 * @see #isSetSetToRO()
	 * @see #unsetSetToRO()
	 * @see #getSetToRO()
	 * @generated
	 */
    void setSetToRO( Boolean value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ValueHandling#getSetToRO <em>Set To RO</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetSetToRO()
	 * @see #getSetToRO()
	 * @see #setSetToRO(Boolean)
	 * @generated
	 */
    void unsetSetToRO();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ValueHandling#getSetToRO <em>Set To RO</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Set To RO</em>' attribute is set.
	 * @see #unsetSetToRO()
	 * @see #getSetToRO()
	 * @see #setSetToRO(Boolean)
	 * @generated
	 */
    boolean isSetSetToRO();

    /**
	 * Returns the value of the '<em><b>Services</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getValueHandling <em>Value Handling</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Services</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' container reference.
	 * @see #setServices(Services)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getValueHandling_Services()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getValueHandling
	 * @model opposite="ValueHandling" resolveProxies="false" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!ValueHandling!Services'"
	 * @generated
	 */
    Services getServices();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ValueHandling#getServices <em>Services</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Services</em>' container reference.
	 * @see #getServices()
	 * @generated
	 */
    void setServices( Services value );

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ValueHandling_nothing'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * inv ValueHandling_nothing: true\n \052/\nreturn &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;'"
	 * @generated
	 */
	boolean validateValueHandling_nothing(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ValueHandling
