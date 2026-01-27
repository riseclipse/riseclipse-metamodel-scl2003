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
package fr.centralesupelec.edf.riseclipse.iec61850.asd;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>L2 Comm Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Communication parameters for layer 2 (non routable) Goose and SMV service specification
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.L2CommParameters#getMacAddr <em>Mac Addr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.L2CommParameters#getParentGooseParameters <em>Parent Goose Parameters</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.L2CommParameters#getParentSMVParameters <em>Parent SMV Parameters</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getL2CommParameters()
 * @model
 * @generated
 */
public interface L2CommParameters extends CommParameters {
    /**
     * Returns the value of the '<em><b>Mac Addr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * MAC-Address to be used on implementation
     * <!-- end-model-doc -->
     * @return the value of the '<em>Mac Addr</em>' attribute.
     * @see #setMacAddr(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getL2CommParameters_MacAddr()
     * @model extendedMetaData="kind='attribute' name='macAddr'"
     * @generated
     */
    String getMacAddr();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.L2CommParameters#getMacAddr <em>Mac Addr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mac Addr</em>' attribute.
     * @see #getMacAddr()
     * @generated
     */
    void setMacAddr( String value );

    /**
     * Returns the value of the '<em><b>Parent Goose Parameters</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getL2CommParameters <em>L2 Comm Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Goose Parameters</em>' container reference.
     * @see #setParentGooseParameters(GooseParameters)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getL2CommParameters_ParentGooseParameters()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getL2CommParameters
     * @model opposite="L2CommParameters" unsettable="true" ordered="false"
     * @generated
     */
    GooseParameters getParentGooseParameters();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.L2CommParameters#getParentGooseParameters <em>Parent Goose Parameters</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Goose Parameters</em>' container reference.
     * @see #getParentGooseParameters()
     * @generated
     */
    void setParentGooseParameters( GooseParameters value );

    /**
     * Returns the value of the '<em><b>Parent SMV Parameters</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getL2CommParameters <em>L2 Comm Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent SMV Parameters</em>' container reference.
     * @see #setParentSMVParameters(SMVParameters)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getL2CommParameters_ParentSMVParameters()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getL2CommParameters
     * @model opposite="L2CommParameters" unsettable="true" ordered="false"
     * @generated
     */
    SMVParameters getParentSMVParameters();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.L2CommParameters#getParentSMVParameters <em>Parent SMV Parameters</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent SMV Parameters</em>' container reference.
     * @see #getParentSMVParameters()
     * @generated
     */
    void setParentSMVParameters( SMVParameters value );

} // L2CommParameters
