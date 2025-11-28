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
 * A representation of the model object '<em><b>L3I Pv4 Comm Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Communication parameters for layer 3 (routable) Goose and SMV service specification
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv4CommParameters#getIPv4 <em>IPv4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv4CommParameters#getIPv4IGMPv3Src <em>IPv4 IGM Pv3 Src</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv4CommParameters#getParentGooseParameters <em>Parent Goose Parameters</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv4CommParameters#getParentSMVParameters <em>Parent SMV Parameters</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getL3IPv4CommParameters()
 * @model
 * @generated
 */
public interface L3IPv4CommParameters extends CommParameters {
    /**
     * Returns the value of the '<em><b>IPv4</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * IPv4 destination address
     * <!-- end-model-doc -->
     * @return the value of the '<em>IPv4</em>' attribute.
     * @see #setIPv4(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getL3IPv4CommParameters_IPv4()
     * @model extendedMetaData="kind='attribute' name='IPv4'"
     * @generated
     */
    String getIPv4();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv4CommParameters#getIPv4 <em>IPv4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>IPv4</em>' attribute.
     * @see #getIPv4()
     * @generated
     */
    void setIPv4( String value );

    /**
     * Returns the value of the '<em><b>IPv4 IGM Pv3 Src</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Unicast IPv4 address to be used for IGMPv3 subscription
     * <!-- end-model-doc -->
     * @return the value of the '<em>IPv4 IGM Pv3 Src</em>' attribute.
     * @see #setIPv4IGMPv3Src(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getL3IPv4CommParameters_IPv4IGMPv3Src()
     * @model extendedMetaData="kind='attribute' name='IPv4-IGMPv3Src'"
     * @generated
     */
    String getIPv4IGMPv3Src();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv4CommParameters#getIPv4IGMPv3Src <em>IPv4 IGM Pv3 Src</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>IPv4 IGM Pv3 Src</em>' attribute.
     * @see #getIPv4IGMPv3Src()
     * @generated
     */
    void setIPv4IGMPv3Src( String value );

    /**
     * Returns the value of the '<em><b>Parent Goose Parameters</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getL3IPv4CommParameters <em>L3I Pv4 Comm Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Goose Parameters</em>' container reference.
     * @see #setParentGooseParameters(GooseParameters)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getL3IPv4CommParameters_ParentGooseParameters()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getL3IPv4CommParameters
     * @model opposite="l3IPv4CommParameters" unsettable="true" ordered="false"
     * @generated
     */
    GooseParameters getParentGooseParameters();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv4CommParameters#getParentGooseParameters <em>Parent Goose Parameters</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Goose Parameters</em>' container reference.
     * @see #getParentGooseParameters()
     * @generated
     */
    void setParentGooseParameters( GooseParameters value );

    /**
     * Returns the value of the '<em><b>Parent SMV Parameters</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getL3IPv4CommParameters <em>L3I Pv4 Comm Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent SMV Parameters</em>' container reference.
     * @see #setParentSMVParameters(SMVParameters)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getL3IPv4CommParameters_ParentSMVParameters()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getL3IPv4CommParameters
     * @model opposite="l3IPv4CommParameters" unsettable="true" ordered="false"
     * @generated
     */
    SMVParameters getParentSMVParameters();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv4CommParameters#getParentSMVParameters <em>Parent SMV Parameters</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent SMV Parameters</em>' container reference.
     * @see #getParentSMVParameters()
     * @generated
     */
    void setParentSMVParameters( SMVParameters value );

} // L3IPv4CommParameters
