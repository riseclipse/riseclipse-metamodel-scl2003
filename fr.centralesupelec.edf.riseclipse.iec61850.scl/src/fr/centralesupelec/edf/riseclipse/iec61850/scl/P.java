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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>P</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.P#getParentAddress <em>Parent Address</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getP()
 * @model extendedMetaData="kind='simple'"
 * @generated
 */
public interface P extends PAddr {
    /**
     * Returns the value of the '<em><b>Parent Address</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Address#getP <em>P</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Address</em>' container reference.
     * @see #setParentAddress(Address)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getP_ParentAddress()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Address#getP
     * @model opposite="P" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    Address getParentAddress();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.P#getParentAddress <em>Parent Address</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Address</em>' container reference.
     * @see #getParentAddress()
     * @generated
     */
    void setParentAddress( Address value );

} // P
