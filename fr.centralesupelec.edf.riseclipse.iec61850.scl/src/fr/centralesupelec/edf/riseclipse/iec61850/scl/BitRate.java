/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
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
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.iec61850.scl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bit Rate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BitRate#getParentSubNetwork <em>Parent Sub Network</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getBitRate()
 * @model extendedMetaData="kind='simple'"
 * @generated
 */
public interface BitRate extends BitRateInMbPerSec {

    /**
     * Returns the value of the '<em><b>Parent Sub Network</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubNetwork#getBitRate <em>Bit Rate</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Sub Network</em>' container reference.
     * @see #setParentSubNetwork(SubNetwork)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getBitRate_ParentSubNetwork()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SubNetwork#getBitRate
     * @model opposite="BitRate" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    SubNetwork getParentSubNetwork();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BitRate#getParentSubNetwork <em>Parent Sub Network</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Sub Network</em>' container reference.
     * @see #getParentSubNetwork()
     * @generated
     */
    void setParentSubNetwork( SubNetwork value );
} // BitRate
