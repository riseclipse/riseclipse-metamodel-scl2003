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
 * A representation of the model object '<em><b>GSE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSE#getConnectedAP <em>Connected AP</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSE#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSE#getMaxTime <em>Max Time</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGSE()
 * @model
 * @generated
 */
public interface GSE extends ControlBlock {
    /**
	 * Returns the value of the '<em><b>Max Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Time</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Time</em>' containment reference.
	 * @see #isSetMaxTime()
	 * @see #unsetMaxTime()
	 * @see #setMaxTime(MaxTime)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGSE_MaxTime()
	 * @model containment="true" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!GSE!MaxTime'"
	 * @generated
	 */
    MaxTime getMaxTime();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSE#getMaxTime <em>Max Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Time</em>' containment reference.
	 * @see #isSetMaxTime()
	 * @see #unsetMaxTime()
	 * @see #getMaxTime()
	 * @generated
	 */
    void setMaxTime(MaxTime value);

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSE#getMaxTime <em>Max Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetMaxTime()
	 * @see #getMaxTime()
	 * @see #setMaxTime(MaxTime)
	 * @generated
	 */
    void unsetMaxTime();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSE#getMaxTime <em>Max Time</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Time</em>' containment reference is set.
	 * @see #unsetMaxTime()
	 * @see #getMaxTime()
	 * @see #setMaxTime(MaxTime)
	 * @generated
	 */
    boolean isSetMaxTime();

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='GSE_nothing'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * inv GSE_nothing: true\n \052/\nreturn &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;'"
	 * @generated
	 */
	boolean validateGSE_nothing(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * Returns the value of the '<em><b>Min Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Min Time</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Time</em>' containment reference.
	 * @see #isSetMinTime()
	 * @see #unsetMinTime()
	 * @see #setMinTime(MinTime)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGSE_MinTime()
	 * @model containment="true" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!GSE!MinTime'"
	 * @generated
	 */
    MinTime getMinTime();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSE#getMinTime <em>Min Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Time</em>' containment reference.
	 * @see #isSetMinTime()
	 * @see #unsetMinTime()
	 * @see #getMinTime()
	 * @generated
	 */
    void setMinTime(MinTime value);

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSE#getMinTime <em>Min Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetMinTime()
	 * @see #getMinTime()
	 * @see #setMinTime(MinTime)
	 * @generated
	 */
    void unsetMinTime();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSE#getMinTime <em>Min Time</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Time</em>' containment reference is set.
	 * @see #unsetMinTime()
	 * @see #getMinTime()
	 * @see #setMinTime(MinTime)
	 * @generated
	 */
    boolean isSetMinTime();

    /**
	 * Returns the value of the '<em><b>Connected AP</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getGSE <em>GSE</em>}'.
	 * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Connected AP</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected AP</em>' container reference.
	 * @see #setConnectedAP(ConnectedAP)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGSE_ConnectedAP()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getGSE
	 * @model opposite="GSE" resolveProxies="false" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!GSE!ConnectedAP'"
	 * @generated
	 */
    ConnectedAP getConnectedAP();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSE#getConnectedAP <em>Connected AP</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connected AP</em>' container reference.
	 * @see #getConnectedAP()
	 * @generated
	 */
    void setConnectedAP( ConnectedAP value );

} // GSE
