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
 * A representation of the model object '<em><b>Comm Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Communication parameters for Goose and SMV service specification
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CommParameters#getAppId <em>App Id</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CommParameters#getVlanId <em>Vlan Id</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CommParameters#getVlanPriority <em>Vlan Priority</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getCommParameters()
 * @model abstract="true"
 * @generated
 */
public interface CommParameters extends BaseExtensionElementWithDesc {
    /**
     * Returns the value of the '<em><b>App Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * APPID to be used on implementation
     * <!-- end-model-doc -->
     * @return the value of the '<em>App Id</em>' attribute.
     * @see #setAppId(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getCommParameters_AppId()
     * @model extendedMetaData="kind='attribute' name='appId'"
     * @generated
     */
    String getAppId();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CommParameters#getAppId <em>App Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>App Id</em>' attribute.
     * @see #getAppId()
     * @generated
     */
    void setAppId( String value );

    /**
     * Returns the value of the '<em><b>Vlan Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * VLAN ID to be used on implementation
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vlan Id</em>' attribute.
     * @see #setVlanId(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getCommParameters_VlanId()
     * @model extendedMetaData="kind='attribute' name='vlanId'"
     * @generated
     */
    String getVlanId();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CommParameters#getVlanId <em>Vlan Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vlan Id</em>' attribute.
     * @see #getVlanId()
     * @generated
     */
    void setVlanId( String value );

    /**
     * Returns the value of the '<em><b>Vlan Priority</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * VLAN Priority to be used on implementation
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vlan Priority</em>' attribute.
     * @see #setVlanPriority(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getCommParameters_VlanPriority()
     * @model extendedMetaData="kind='attribute' name='vlanPriority'"
     * @generated
     */
    String getVlanPriority();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CommParameters#getVlanPriority <em>Vlan Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vlan Priority</em>' attribute.
     * @see #getVlanPriority()
     * @generated
     */
    void setVlanPriority( String value );

} // CommParameters
