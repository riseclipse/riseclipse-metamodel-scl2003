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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.SmpMod;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SMV Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * SMV parameters for service specification
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getL2CommParameters <em>L2 Comm Parameters</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getL3IPv4CommParameters <em>L3I Pv4 Comm Parameters</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getL3IPv6CommParameters <em>L3I Pv6 Comm Parameters</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#isMulticast <em>Multicast</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getNofASDU <em>Nof ASDU</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#isSecurityEnabled <em>Security Enabled</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getSmpMod <em>Smp Mod</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getSmpRate <em>Smp Rate</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getSmvId <em>Smv Id</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getParentCommServiceSpecifications <em>Parent Comm Service Specifications</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getParentServiceSpecifications <em>Parent Service Specifications</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getReferredBySMVParametersRef <em>Referred By SMV Parameters Ref</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSMVParameters()
 * @model extendedMetaData="name='tSMVParameters' kind='elementOnly'"
 * @generated
 */
public interface SMVParameters extends ControlBlockParameters {
    /**
     * Returns the value of the '<em><b>L2 Comm Parameters</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.L2CommParameters#getParentSMVParameters <em>Parent SMV Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>L2 Comm Parameters</em>' containment reference.
     * @see #isSetL2CommParameters()
     * @see #unsetL2CommParameters()
     * @see #setL2CommParameters(L2CommParameters)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSMVParameters_L2CommParameters()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.L2CommParameters#getParentSMVParameters
     * @model opposite="ParentSMVParameters" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='L2CommParameters' namespace='##targetNamespace'"
     * @generated
     */
    L2CommParameters getL2CommParameters();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getL2CommParameters <em>L2 Comm Parameters</em>}' containment reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getL2CommParameters <em>L2 Comm Parameters</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetL2CommParameters()
     * @see #getL2CommParameters()
     * @see #setL2CommParameters(L2CommParameters)
     * @generated
     */
    void unsetL2CommParameters();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getL2CommParameters <em>L2 Comm Parameters</em>}' containment reference is set.
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
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv4CommParameters#getParentSMVParameters <em>Parent SMV Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>L3I Pv4 Comm Parameters</em>' containment reference.
     * @see #isSetL3IPv4CommParameters()
     * @see #unsetL3IPv4CommParameters()
     * @see #setL3IPv4CommParameters(L3IPv4CommParameters)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSMVParameters_L3IPv4CommParameters()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv4CommParameters#getParentSMVParameters
     * @model opposite="ParentSMVParameters" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='L3IPv4CommParameters' namespace='##targetNamespace'"
     * @generated
     */
    L3IPv4CommParameters getL3IPv4CommParameters();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getL3IPv4CommParameters <em>L3I Pv4 Comm Parameters</em>}' containment reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getL3IPv4CommParameters <em>L3I Pv4 Comm Parameters</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetL3IPv4CommParameters()
     * @see #getL3IPv4CommParameters()
     * @see #setL3IPv4CommParameters(L3IPv4CommParameters)
     * @generated
     */
    void unsetL3IPv4CommParameters();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getL3IPv4CommParameters <em>L3I Pv4 Comm Parameters</em>}' containment reference is set.
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
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv6CommParameters#getParentSMVParameters <em>Parent SMV Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>L3I Pv6 Comm Parameters</em>' containment reference.
     * @see #isSetL3IPv6CommParameters()
     * @see #unsetL3IPv6CommParameters()
     * @see #setL3IPv6CommParameters(L3IPv6CommParameters)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSMVParameters_L3IPv6CommParameters()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv6CommParameters#getParentSMVParameters
     * @model opposite="ParentSMVParameters" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='L3IPv6CommParameters' namespace='##targetNamespace'"
     * @generated
     */
    L3IPv6CommParameters getL3IPv6CommParameters();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getL3IPv6CommParameters <em>L3I Pv6 Comm Parameters</em>}' containment reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getL3IPv6CommParameters <em>L3I Pv6 Comm Parameters</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetL3IPv6CommParameters()
     * @see #getL3IPv6CommParameters()
     * @see #setL3IPv6CommParameters(L3IPv6CommParameters)
     * @generated
     */
    void unsetL3IPv6CommParameters();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getL3IPv6CommParameters <em>L3I Pv6 Comm Parameters</em>}' containment reference is set.
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
     * Returns the value of the '<em><b>Multicast</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * value to use for the multicast
     * <!-- end-model-doc -->
     * @return the value of the '<em>Multicast</em>' attribute.
     * @see #isSetMulticast()
     * @see #unsetMulticast()
     * @see #setMulticast(boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSMVParameters_Multicast()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='multicast'"
     * @generated
     */
    boolean isMulticast();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#isMulticast <em>Multicast</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Multicast</em>' attribute.
     * @see #isSetMulticast()
     * @see #unsetMulticast()
     * @see #isMulticast()
     * @generated
     */
    void setMulticast( boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#isMulticast <em>Multicast</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMulticast()
     * @see #isMulticast()
     * @see #setMulticast(boolean)
     * @generated
     */
    void unsetMulticast();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#isMulticast <em>Multicast</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Multicast</em>' attribute is set.
     * @see #unsetMulticast()
     * @see #isMulticast()
     * @see #setMulticast(boolean)
     * @generated
     */
    boolean isSetMulticast();

    /**
     * Returns the value of the '<em><b>Nof ASDU</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * value to use for the nofASDU
     * <!-- end-model-doc -->
     * @return the value of the '<em>Nof ASDU</em>' attribute.
     * @see #isSetNofASDU()
     * @see #unsetNofASDU()
     * @see #setNofASDU(long)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSMVParameters_NofASDU()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
     *        extendedMetaData="kind='attribute' name='nofASDU'"
     * @generated
     */
    long getNofASDU();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getNofASDU <em>Nof ASDU</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Nof ASDU</em>' attribute.
     * @see #isSetNofASDU()
     * @see #unsetNofASDU()
     * @see #getNofASDU()
     * @generated
     */
    void setNofASDU( long value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getNofASDU <em>Nof ASDU</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNofASDU()
     * @see #getNofASDU()
     * @see #setNofASDU(long)
     * @generated
     */
    void unsetNofASDU();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getNofASDU <em>Nof ASDU</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Nof ASDU</em>' attribute is set.
     * @see #unsetNofASDU()
     * @see #getNofASDU()
     * @see #setNofASDU(long)
     * @generated
     */
    boolean isSetNofASDU();

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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSMVParameters_SecurityEnabled()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='securityEnabled'"
     * @generated
     */
    boolean isSecurityEnabled();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#isSecurityEnabled <em>Security Enabled</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#isSecurityEnabled <em>Security Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSecurityEnabled()
     * @see #isSecurityEnabled()
     * @see #setSecurityEnabled(boolean)
     * @generated
     */
    void unsetSecurityEnabled();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#isSecurityEnabled <em>Security Enabled</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Smp Mod</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmpMod}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * value to use for the smpMod
     * <!-- end-model-doc -->
     * @return the value of the '<em>Smp Mod</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SmpMod
     * @see #isSetSmpMod()
     * @see #unsetSmpMod()
     * @see #setSmpMod(SmpMod)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSMVParameters_SmpMod()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='smpMod'"
     * @generated
     */
    SmpMod getSmpMod();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getSmpMod <em>Smp Mod</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Smp Mod</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SmpMod
     * @see #isSetSmpMod()
     * @see #unsetSmpMod()
     * @see #getSmpMod()
     * @generated
     */
    void setSmpMod( SmpMod value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getSmpMod <em>Smp Mod</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSmpMod()
     * @see #getSmpMod()
     * @see #setSmpMod(SmpMod)
     * @generated
     */
    void unsetSmpMod();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getSmpMod <em>Smp Mod</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Smp Mod</em>' attribute is set.
     * @see #unsetSmpMod()
     * @see #getSmpMod()
     * @see #setSmpMod(SmpMod)
     * @generated
     */
    boolean isSetSmpMod();

    /**
     * Returns the value of the '<em><b>Smp Rate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * value to use for the smpRate
     * <!-- end-model-doc -->
     * @return the value of the '<em>Smp Rate</em>' attribute.
     * @see #isSetSmpRate()
     * @see #unsetSmpRate()
     * @see #setSmpRate(long)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSMVParameters_SmpRate()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
     *        extendedMetaData="kind='attribute' name='smpRate'"
     * @generated
     */
    long getSmpRate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getSmpRate <em>Smp Rate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Smp Rate</em>' attribute.
     * @see #isSetSmpRate()
     * @see #unsetSmpRate()
     * @see #getSmpRate()
     * @generated
     */
    void setSmpRate( long value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getSmpRate <em>Smp Rate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSmpRate()
     * @see #getSmpRate()
     * @see #setSmpRate(long)
     * @generated
     */
    void unsetSmpRate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getSmpRate <em>Smp Rate</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Smp Rate</em>' attribute is set.
     * @see #unsetSmpRate()
     * @see #getSmpRate()
     * @see #setSmpRate(long)
     * @generated
     */
    boolean isSetSmpRate();

    /**
     * Returns the value of the '<em><b>Smv Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * SMV identifier to be used
     * <!-- end-model-doc -->
     * @return the value of the '<em>Smv Id</em>' attribute.
     * @see #setSmvId(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSMVParameters_SmvId()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
     *        extendedMetaData="kind='attribute' name='smvId'"
     * @generated
     */
    String getSmvId();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getSmvId <em>Smv Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Smv Id</em>' attribute.
     * @see #getSmvId()
     * @generated
     */
    void setSmvId( String value );

    /**
     * Returns the value of the '<em><b>Parent Comm Service Specifications</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CommServiceSpecifications#getSMVParameters <em>SMV Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Comm Service Specifications</em>' container reference.
     * @see #setParentCommServiceSpecifications(CommServiceSpecifications)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSMVParameters_ParentCommServiceSpecifications()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.CommServiceSpecifications#getSMVParameters
     * @model opposite="sMVParameters" unsettable="true" ordered="false"
     * @generated
     */
    CommServiceSpecifications getParentCommServiceSpecifications();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getParentCommServiceSpecifications <em>Parent Comm Service Specifications</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Comm Service Specifications</em>' container reference.
     * @see #getParentCommServiceSpecifications()
     * @generated
     */
    void setParentCommServiceSpecifications( CommServiceSpecifications value );

    /**
     * Returns the value of the '<em><b>Parent Service Specifications</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications#getSMVParameters <em>SMV Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Service Specifications</em>' container reference.
     * @see #setParentServiceSpecifications(ServiceSpecifications)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSMVParameters_ParentServiceSpecifications()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications#getSMVParameters
     * @model opposite="sMVParameters" unsettable="true" ordered="false"
     * @generated
     */
    ServiceSpecifications getParentServiceSpecifications();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getParentServiceSpecifications <em>Parent Service Specifications</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Service Specifications</em>' container reference.
     * @see #getParentServiceSpecifications()
     * @generated
     */
    void setParentServiceSpecifications( ServiceSpecifications value );

    /**
     * Returns the value of the '<em><b>Referred By SMV Parameters Ref</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParametersRef#getRefersToSMVParameters <em>Refers To SMV Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By SMV Parameters Ref</em>' reference.
     * @see #isSetReferredBySMVParametersRef()
     * @see #unsetReferredBySMVParametersRef()
     * @see #setReferredBySMVParametersRef(SMVParametersRef)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSMVParameters_ReferredBySMVParametersRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParametersRef#getRefersToSMVParameters
     * @model opposite="RefersToSMVParameters" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    SMVParametersRef getReferredBySMVParametersRef();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getReferredBySMVParametersRef <em>Referred By SMV Parameters Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Referred By SMV Parameters Ref</em>' reference.
     * @see #isSetReferredBySMVParametersRef()
     * @see #unsetReferredBySMVParametersRef()
     * @see #getReferredBySMVParametersRef()
     * @generated
     */
    void setReferredBySMVParametersRef( SMVParametersRef value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getReferredBySMVParametersRef <em>Referred By SMV Parameters Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredBySMVParametersRef()
     * @see #getReferredBySMVParametersRef()
     * @see #setReferredBySMVParametersRef(SMVParametersRef)
     * @generated
     */
    void unsetReferredBySMVParametersRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getReferredBySMVParametersRef <em>Referred By SMV Parameters Ref</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By SMV Parameters Ref</em>' reference is set.
     * @see #unsetReferredBySMVParametersRef()
     * @see #getReferredBySMVParametersRef()
     * @see #setReferredBySMVParametersRef(SMVParametersRef)
     * @generated
     */
    boolean isSetReferredBySMVParametersRef();

} // SMVParameters
