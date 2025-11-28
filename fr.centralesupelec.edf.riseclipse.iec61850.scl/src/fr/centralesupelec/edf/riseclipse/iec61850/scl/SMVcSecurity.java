/**
 *  Copyright (c) 2016-2024 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-v20.html
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
 *      https://riseclipse.github.io/
 * 
 */
package fr.centralesupelec.edf.riseclipse.iec61850.scl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SM Vc Security</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVcSecurity#getParentClientServicesFromSMVcSecurity <em>Parent Client Services From SM Vc Security</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSMVcSecurity()
 * @model
 * @generated
 */
public interface SMVcSecurity extends McSecurity {
    /**
     * Returns the value of the '<em><b>Parent Client Services From SM Vc Security</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getSMVcSecurity <em>SM Vc Security</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Client Services From SM Vc Security</em>' container reference.
     * @see #setParentClientServicesFromSMVcSecurity(ClientServices)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSMVcSecurity_ParentClientServicesFromSMVcSecurity()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getSMVcSecurity
     * @model opposite="SMVcSecurity" unsettable="true" ordered="false"
     * @generated
     */
    ClientServices getParentClientServicesFromSMVcSecurity();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVcSecurity#getParentClientServicesFromSMVcSecurity <em>Parent Client Services From SM Vc Security</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Client Services From SM Vc Security</em>' container reference.
     * @see #getParentClientServicesFromSMVcSecurity()
     * @generated
     */
    void setParentClientServicesFromSMVcSecurity( ClientServices value );

} // SMVcSecurity
