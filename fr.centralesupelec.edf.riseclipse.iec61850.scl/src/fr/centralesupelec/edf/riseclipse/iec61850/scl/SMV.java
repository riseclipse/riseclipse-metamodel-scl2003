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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SMV</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMV#getConnectedAP <em>Connected AP</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSMV()
 * @model
 * @generated
 */
public interface SMV extends ControlBlock {
    /**
     * Returns the value of the '<em><b>Connected AP</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getSMV <em>SMV</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connected AP</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connected AP</em>' container reference.
     * @see #setConnectedAP(ConnectedAP)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSMV_ConnectedAP()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getSMV
     * @model opposite="SMV" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    ConnectedAP getConnectedAP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMV#getConnectedAP <em>Connected AP</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connected AP</em>' container reference.
     * @see #getConnectedAP()
     * @generated
     */
    void setConnectedAP( ConnectedAP value );

} // SMV
