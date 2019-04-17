/**
 *  Copyright (c) 2018 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec
 *      EDF R&D
 *  Contacts:
 *      dominique.marcadet@centralesupelec.fr
 *      aurelie.dehouck-neveu@edf.fr
 *  Web site:
 *      http://wdi.supelec.fr/software/RiseClipse/
 */
package fr.centralesupelec.edf.riseclipse.iec61850.scl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connectivity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode#getPathName <em>Path Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode#getParentBay <em>Parent Bay</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode#getReferredByTerminal <em>Referred By Terminal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode#getParentLine <em>Parent Line</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getConnectivityNode()
 * @model
 * @generated
 */
public interface ConnectivityNode extends LNodeContainer {
    /**
     * Returns the value of the '<em><b>Path Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Path Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Path Name</em>' attribute.
     * @see #isSetPathName()
     * @see #unsetPathName()
     * @see #setPathName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getConnectivityNode_PathName()
     * @model unsettable="true"
     * @generated
     */
    String getPathName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode#getPathName <em>Path Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Path Name</em>' attribute.
     * @see #isSetPathName()
     * @see #unsetPathName()
     * @see #getPathName()
     * @generated
     */
    void setPathName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode#getPathName <em>Path Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPathName()
     * @see #getPathName()
     * @see #setPathName(String)
     * @generated
     */
    void unsetPathName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode#getPathName <em>Path Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Path Name</em>' attribute is set.
     * @see #unsetPathName()
     * @see #getPathName()
     * @see #setPathName(String)
     * @generated
     */
    boolean isSetPathName();

    /**
     * Returns the value of the '<em><b>Parent Bay</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay#getConnectivityNode <em>Connectivity Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Bay</em>' container reference.
     * @see #setParentBay(Bay)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getConnectivityNode_ParentBay()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay#getConnectivityNode
     * @model opposite="ConnectivityNode" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    Bay getParentBay();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode#getParentBay <em>Parent Bay</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Bay</em>' container reference.
     * @see #getParentBay()
     * @generated
     */
    void setParentBay(Bay value);

    /**
     * Returns the value of the '<em><b>Referred By Terminal</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getRefersToConnectivityNode <em>Refers To Connectivity Node</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referred By Terminal</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Terminal</em>' reference list.
     * @see #isSetReferredByTerminal()
     * @see #unsetReferredByTerminal()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getConnectivityNode_ReferredByTerminal()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getRefersToConnectivityNode
     * @model opposite="RefersToConnectivityNode" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList<Terminal> getReferredByTerminal();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode#getReferredByTerminal <em>Referred By Terminal</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByTerminal()
     * @see #getReferredByTerminal()
     * @generated
     */
    void unsetReferredByTerminal();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode#getReferredByTerminal <em>Referred By Terminal</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Terminal</em>' reference list is set.
     * @see #unsetReferredByTerminal()
     * @see #getReferredByTerminal()
     * @generated
     */
    boolean isSetReferredByTerminal();

    /**
     * Returns the value of the '<em><b>Parent Line</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getConnectivityNode <em>Connectivity Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Line</em>' container reference.
     * @see #setParentLine(Line)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getConnectivityNode_ParentLine()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getConnectivityNode
     * @model opposite="ConnectivityNode" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    Line getParentLine();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode#getParentLine <em>Parent Line</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Line</em>' container reference.
     * @see #getParentLine()
     * @generated
     */
    void setParentLine(Line value);

} // ConnectivityNode
