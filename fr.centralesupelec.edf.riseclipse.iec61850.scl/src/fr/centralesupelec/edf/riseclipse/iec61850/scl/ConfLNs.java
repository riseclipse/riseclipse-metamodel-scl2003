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
 * A representation of the model object '<em><b>Conf LNs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfLNs#getFixLnInst <em>Fix Ln Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfLNs#getFixPrefix <em>Fix Prefix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfLNs#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getConfLNs()
 * @model
 * @generated
 */
public interface ConfLNs extends SclObject {
    /**
	 * Returns the value of the '<em><b>Fix Ln Inst</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fix Ln Inst</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Fix Ln Inst</em>' attribute.
	 * @see #isSetFixLnInst()
	 * @see #unsetFixLnInst()
	 * @see #setFixLnInst(Boolean)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getConfLNs_FixLnInst()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!ConfLNs!fixLnInst'"
	 * @generated
	 */
    Boolean getFixLnInst();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfLNs#getFixLnInst <em>Fix Ln Inst</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fix Ln Inst</em>' attribute.
	 * @see #isSetFixLnInst()
	 * @see #unsetFixLnInst()
	 * @see #getFixLnInst()
	 * @generated
	 */
    void setFixLnInst( Boolean value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfLNs#getFixLnInst <em>Fix Ln Inst</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetFixLnInst()
	 * @see #getFixLnInst()
	 * @see #setFixLnInst(Boolean)
	 * @generated
	 */
    void unsetFixLnInst();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfLNs#getFixLnInst <em>Fix Ln Inst</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fix Ln Inst</em>' attribute is set.
	 * @see #unsetFixLnInst()
	 * @see #getFixLnInst()
	 * @see #setFixLnInst(Boolean)
	 * @generated
	 */
    boolean isSetFixLnInst();

    /**
	 * Returns the value of the '<em><b>Fix Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fix Prefix</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Fix Prefix</em>' attribute.
	 * @see #isSetFixPrefix()
	 * @see #unsetFixPrefix()
	 * @see #setFixPrefix(Boolean)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getConfLNs_FixPrefix()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!ConfLNs!fixPrefix'"
	 * @generated
	 */
    Boolean getFixPrefix();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfLNs#getFixPrefix <em>Fix Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fix Prefix</em>' attribute.
	 * @see #isSetFixPrefix()
	 * @see #unsetFixPrefix()
	 * @see #getFixPrefix()
	 * @generated
	 */
    void setFixPrefix( Boolean value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfLNs#getFixPrefix <em>Fix Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetFixPrefix()
	 * @see #getFixPrefix()
	 * @see #setFixPrefix(Boolean)
	 * @generated
	 */
    void unsetFixPrefix();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfLNs#getFixPrefix <em>Fix Prefix</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fix Prefix</em>' attribute is set.
	 * @see #unsetFixPrefix()
	 * @see #getFixPrefix()
	 * @see #setFixPrefix(Boolean)
	 * @generated
	 */
    boolean isSetFixPrefix();

    /**
	 * Returns the value of the '<em><b>Services</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getConfLNs <em>Conf LNs</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Services</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' container reference.
	 * @see #setServices(Services)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getConfLNs_Services()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getConfLNs
	 * @model opposite="ConfLNs" resolveProxies="false" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!ConfLNs!Services'"
	 * @generated
	 */
    Services getServices();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfLNs#getServices <em>Services</em>}' container reference.
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
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ConfLNs_nothing'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * inv ConfLNs_nothing: true\n \052/\nreturn &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;'"
	 * @generated
	 */
	boolean validateConfLNs_nothing(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ConfLNs
