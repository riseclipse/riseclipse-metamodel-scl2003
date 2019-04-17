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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authentication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Authentication#getParentServer <em>Parent Server</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAuthentication()
 * @model
 * @generated
 */
public interface Authentication extends SclObject, AgAuthentication {
    /**
     * Returns the value of the '<em><b>Parent Server</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getAuthentication <em>Authentication</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Server</em>' container reference.
     * @see #setParentServer(Server)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAuthentication_ParentServer()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getAuthentication
     * @model opposite="Authentication" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    Server getParentServer();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Authentication#getParentServer <em>Parent Server</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Server</em>' container reference.
     * @see #getParentServer()
     * @generated
     */
    void setParentServer(Server value);

} // Authentication
