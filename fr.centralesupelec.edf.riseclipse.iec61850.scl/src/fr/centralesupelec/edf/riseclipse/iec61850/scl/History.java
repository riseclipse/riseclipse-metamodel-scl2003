/*
*************************************************************************
**  Copyright (c) 2016-2021 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
**
**  This file is part of the RiseClipse tool
**
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      https://riseclipse.github.io/
*************************************************************************
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
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.History#getParentHeader <em>Parent Header</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.History#getHitem <em>Hitem</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getHistory()
 * @model
 * @generated
 */
public interface History extends SclObject {
    /**
     * Returns the value of the '<em><b>Parent Header</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getHistory <em>History</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Header</em>' container reference.
     * @see #setParentHeader(Header)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getHistory_ParentHeader()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getHistory
     * @model opposite="History" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    Header getParentHeader();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.History#getParentHeader <em>Parent Header</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Header</em>' container reference.
     * @see #getParentHeader()
     * @generated
     */
    void setParentHeader( Header value );

    /**
     * Returns the value of the '<em><b>Hitem</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getParentHistory <em>Parent History</em>}'.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getParentHistory
     * @model opposite="ParentHistory" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='##targetNamespace' kind='element'"
     * @generated
     */
    EList< Hitem > getHitem();

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
