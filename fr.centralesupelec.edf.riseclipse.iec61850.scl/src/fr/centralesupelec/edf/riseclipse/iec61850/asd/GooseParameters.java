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

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goose Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * GOOSE parameters for service specification
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getL2CommParameters <em>L2 Comm Parameters</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getL3IPv4CommParameters <em>L3I Pv4 Comm Parameters</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getL3IPv6CommParameters <em>L3I Pv6 Comm Parameters</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getGoId <em>Go Id</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#isSecurityEnabled <em>Security Enabled</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getParentCommServiceSpecifications <em>Parent Comm Service Specifications</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getParentServiceSpecifications <em>Parent Service Specifications</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getReferredByGooseParametersRef <em>Referred By Goose Parameters Ref</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getGooseParameters()
 * @model
 * @generated
 */
public interface GooseParameters extends ControlBlockParameters {
    /**
     * Returns the value of the '<em><b>L2 Comm Parameters</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.L2CommParameters#getParentGooseParameters <em>Parent Goose Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>L2 Comm Parameters</em>' containment reference.
     * @see #isSetL2CommParameters()
     * @see #unsetL2CommParameters()
     * @see #setL2CommParameters(L2CommParameters)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getGooseParameters_L2CommParameters()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.L2CommParameters#getParentGooseParameters
     * @model opposite="ParentGooseParameters" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='L2CommParameters' namespace='##targetNamespace'"
     * @generated
     */
    L2CommParameters getL2CommParameters();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getL2CommParameters <em>L2 Comm Parameters</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>L2 Comm Parameters</em>' containment reference.
     * @see #isSetL2CommParameters()
     * @see #unsetL2CommParameters()
     * @see #getL2CommParameters()
     * @generated
     */
    void setL2CommParameters( L2CommParameters value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getL2CommParameters <em>L2 Comm Parameters</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetL2CommParameters()
     * @see #getL2CommParameters()
     * @see #setL2CommParameters(L2CommParameters)
     * @generated
     */
    void unsetL2CommParameters();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getL2CommParameters <em>L2 Comm Parameters</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>L2 Comm Parameters</em>' containment reference is set.
     * @see #unsetL2CommParameters()
     * @see #getL2CommParameters()
     * @see #setL2CommParameters(L2CommParameters)
     * @generated
     */
    boolean isSetL2CommParameters();

    /**
     * Returns the value of the '<em><b>L3I Pv4 Comm Parameters</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv4CommParameters#getParentGooseParameters <em>Parent Goose Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>L3I Pv4 Comm Parameters</em>' containment reference.
     * @see #isSetL3IPv4CommParameters()
     * @see #unsetL3IPv4CommParameters()
     * @see #setL3IPv4CommParameters(L3IPv4CommParameters)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getGooseParameters_L3IPv4CommParameters()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv4CommParameters#getParentGooseParameters
     * @model opposite="ParentGooseParameters" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='L3IPv4CommParameters' namespace='##targetNamespace'"
     * @generated
     */
    L3IPv4CommParameters getL3IPv4CommParameters();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getL3IPv4CommParameters <em>L3I Pv4 Comm Parameters</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>L3I Pv4 Comm Parameters</em>' containment reference.
     * @see #isSetL3IPv4CommParameters()
     * @see #unsetL3IPv4CommParameters()
     * @see #getL3IPv4CommParameters()
     * @generated
     */
    void setL3IPv4CommParameters( L3IPv4CommParameters value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getL3IPv4CommParameters <em>L3I Pv4 Comm Parameters</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetL3IPv4CommParameters()
     * @see #getL3IPv4CommParameters()
     * @see #setL3IPv4CommParameters(L3IPv4CommParameters)
     * @generated
     */
    void unsetL3IPv4CommParameters();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getL3IPv4CommParameters <em>L3I Pv4 Comm Parameters</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>L3I Pv4 Comm Parameters</em>' containment reference is set.
     * @see #unsetL3IPv4CommParameters()
     * @see #getL3IPv4CommParameters()
     * @see #setL3IPv4CommParameters(L3IPv4CommParameters)
     * @generated
     */
    boolean isSetL3IPv4CommParameters();

    /**
     * Returns the value of the '<em><b>L3I Pv6 Comm Parameters</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv6CommParameters#getParentGooseParameters <em>Parent Goose Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>L3I Pv6 Comm Parameters</em>' containment reference.
     * @see #isSetL3IPv6CommParameters()
     * @see #unsetL3IPv6CommParameters()
     * @see #setL3IPv6CommParameters(L3IPv6CommParameters)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getGooseParameters_L3IPv6CommParameters()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv6CommParameters#getParentGooseParameters
     * @model opposite="ParentGooseParameters" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='L3IPv6CommParameters' namespace='##targetNamespace'"
     * @generated
     */
    L3IPv6CommParameters getL3IPv6CommParameters();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getL3IPv6CommParameters <em>L3I Pv6 Comm Parameters</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>L3I Pv6 Comm Parameters</em>' containment reference.
     * @see #isSetL3IPv6CommParameters()
     * @see #unsetL3IPv6CommParameters()
     * @see #getL3IPv6CommParameters()
     * @generated
     */
    void setL3IPv6CommParameters( L3IPv6CommParameters value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getL3IPv6CommParameters <em>L3I Pv6 Comm Parameters</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetL3IPv6CommParameters()
     * @see #getL3IPv6CommParameters()
     * @see #setL3IPv6CommParameters(L3IPv6CommParameters)
     * @generated
     */
    void unsetL3IPv6CommParameters();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getL3IPv6CommParameters <em>L3I Pv6 Comm Parameters</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>L3I Pv6 Comm Parameters</em>' containment reference is set.
     * @see #unsetL3IPv6CommParameters()
     * @see #getL3IPv6CommParameters()
     * @see #setL3IPv6CommParameters(L3IPv6CommParameters)
     * @generated
     */
    boolean isSetL3IPv6CommParameters();

    /**
     * Returns the value of the '<em><b>Go Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * GOOSE identifier to be used
     * <!-- end-model-doc -->
     * @return the value of the '<em>Go Id</em>' attribute.
     * @see #setGoId(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getGooseParameters_GoId()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
     *        extendedMetaData="kind='attribute' name='goId'"
     * @generated
     */
    String getGoId();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getGoId <em>Go Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Go Id</em>' attribute.
     * @see #getGoId()
     * @generated
     */
    void setGoId( String value );

    /**
     * Returns the value of the '<em><b>Max Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * value to use for the maxTime
     * <!-- end-model-doc -->
     * @return the value of the '<em>Max Time</em>' attribute.
     * @see #setMaxTime(BigDecimal)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getGooseParameters_MaxTime()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
     *        extendedMetaData="kind='attribute' name='maxTime'"
     * @generated
     */
    BigDecimal getMaxTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getMaxTime <em>Max Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Time</em>' attribute.
     * @see #getMaxTime()
     * @generated
     */
    void setMaxTime( BigDecimal value );

    /**
     * Returns the value of the '<em><b>Min Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * value to use for the minTime
     * <!-- end-model-doc -->
     * @return the value of the '<em>Min Time</em>' attribute.
     * @see #setMinTime(BigDecimal)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getGooseParameters_MinTime()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
     *        extendedMetaData="kind='attribute' name='minTime'"
     * @generated
     */
    BigDecimal getMinTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getMinTime <em>Min Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Time</em>' attribute.
     * @see #getMinTime()
     * @generated
     */
    void setMinTime( BigDecimal value );

    /**
     * Returns the value of the '<em><b>Security Enabled</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * indicates if the security is enable. The choice of kind of security is done based on supported security
     * <!-- end-model-doc -->
     * @return the value of the '<em>Security Enabled</em>' attribute.
     * @see #isSetSecurityEnabled()
     * @see #unsetSecurityEnabled()
     * @see #setSecurityEnabled(boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getGooseParameters_SecurityEnabled()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='securityEnabled'"
     * @generated
     */
    boolean isSecurityEnabled();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#isSecurityEnabled <em>Security Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Security Enabled</em>' attribute.
     * @see #isSetSecurityEnabled()
     * @see #unsetSecurityEnabled()
     * @see #isSecurityEnabled()
     * @generated
     */
    void setSecurityEnabled( boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#isSecurityEnabled <em>Security Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSecurityEnabled()
     * @see #isSecurityEnabled()
     * @see #setSecurityEnabled(boolean)
     * @generated
     */
    void unsetSecurityEnabled();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#isSecurityEnabled <em>Security Enabled</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Security Enabled</em>' attribute is set.
     * @see #unsetSecurityEnabled()
     * @see #isSecurityEnabled()
     * @see #setSecurityEnabled(boolean)
     * @generated
     */
    boolean isSetSecurityEnabled();

    /**
     * Returns the value of the '<em><b>Parent Comm Service Specifications</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CommServiceSpecifications#getGooseParameters <em>Goose Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Comm Service Specifications</em>' container reference.
     * @see #setParentCommServiceSpecifications(CommServiceSpecifications)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getGooseParameters_ParentCommServiceSpecifications()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.CommServiceSpecifications#getGooseParameters
     * @model opposite="gooseParameters" unsettable="true" ordered="false"
     * @generated
     */
    CommServiceSpecifications getParentCommServiceSpecifications();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getParentCommServiceSpecifications <em>Parent Comm Service Specifications</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Comm Service Specifications</em>' container reference.
     * @see #getParentCommServiceSpecifications()
     * @generated
     */
    void setParentCommServiceSpecifications( CommServiceSpecifications value );

    /**
     * Returns the value of the '<em><b>Parent Service Specifications</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications#getGooseParameters <em>Goose Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Service Specifications</em>' container reference.
     * @see #setParentServiceSpecifications(ServiceSpecifications)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getGooseParameters_ParentServiceSpecifications()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications#getGooseParameters
     * @model opposite="gooseParameters" unsettable="true" ordered="false"
     * @generated
     */
    ServiceSpecifications getParentServiceSpecifications();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getParentServiceSpecifications <em>Parent Service Specifications</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Service Specifications</em>' container reference.
     * @see #getParentServiceSpecifications()
     * @generated
     */
    void setParentServiceSpecifications( ServiceSpecifications value );

    /**
     * Returns the value of the '<em><b>Referred By Goose Parameters Ref</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParametersRef#getRefersToGooseParameters <em>Refers To Goose Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Goose Parameters Ref</em>' reference.
     * @see #isSetReferredByGooseParametersRef()
     * @see #unsetReferredByGooseParametersRef()
     * @see #setReferredByGooseParametersRef(GooseParametersRef)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getGooseParameters_ReferredByGooseParametersRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParametersRef#getRefersToGooseParameters
     * @model opposite="RefersToGooseParameters" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    GooseParametersRef getReferredByGooseParametersRef();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getReferredByGooseParametersRef <em>Referred By Goose Parameters Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Referred By Goose Parameters Ref</em>' reference.
     * @see #isSetReferredByGooseParametersRef()
     * @see #unsetReferredByGooseParametersRef()
     * @see #getReferredByGooseParametersRef()
     * @generated
     */
    void setReferredByGooseParametersRef( GooseParametersRef value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getReferredByGooseParametersRef <em>Referred By Goose Parameters Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByGooseParametersRef()
     * @see #getReferredByGooseParametersRef()
     * @see #setReferredByGooseParametersRef(GooseParametersRef)
     * @generated
     */
    void unsetReferredByGooseParametersRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getReferredByGooseParametersRef <em>Referred By Goose Parameters Ref</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Goose Parameters Ref</em>' reference is set.
     * @see #unsetReferredByGooseParametersRef()
     * @see #getReferredByGooseParametersRef()
     * @see #setReferredByGooseParametersRef(GooseParametersRef)
     * @generated
     */
    boolean isSetReferredByGooseParametersRef();

} // GooseParameters
