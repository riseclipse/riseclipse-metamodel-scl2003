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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.History#getHeader <em>Header</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.History#getHitem <em>Hitem</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getHistory()
 * @model
 * @generated
 */
public interface History extends SclObject {
    /**
     * Returns the value of the '<em><b>Header</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getHistory <em>History</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Header</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Header</em>' container reference.
     * @see #setHeader(Header)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getHistory_Header()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getHistory
     * @model opposite="History" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    Header getHeader();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.History#getHeader <em>Header</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Header</em>' container reference.
     * @see #getHeader()
     * @generated
     */
    void setHeader( Header value );

    /**
     * Returns the value of the '<em><b>Hitem</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getHistory <em>History</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hitem</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hitem</em>' containment reference list.
     * @see #isSetHitem()
     * @see #unsetHitem()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getHistory_Hitem()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getHistory
     * @model opposite="History" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList<Hitem> getHitem();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.History#getHitem <em>Hitem</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHitem()
     * @see #getHitem()
     * @generated
     */
    void unsetHitem();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.History#getHitem <em>Hitem</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Hitem</em>' containment reference list is set.
     * @see #unsetHitem()
     * @see #getHitem()
     * @generated
     */
    boolean isSetHitem();

} // History
