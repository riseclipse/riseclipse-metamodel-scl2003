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
 * A representation of the model object '<em><b>SMV Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getSvID <em>Sv ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getOptFields <em>Opt Fields</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getSmpRateAttribute <em>Smp Rate Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#isSamplesPerSecAttribute <em>Samples Per Sec Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#isPdcTimeStamp <em>Pdc Time Stamp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getSmpRate <em>Smp Rate</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getSamplesPerSec <em>Samples Per Sec</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getSecPerSamples <em>Sec Per Samples</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getServices <em>Services</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getSynchSrcId <em>Synch Src Id</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getNofASDU <em>Nof ASDU</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getKdaParticipant <em>Kda Participant</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getMcSecurity <em>Mc Security</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSMVSettings()
 * @model
 * @generated
 */
public interface SMVSettings extends ServiceSettings {

    /**
     * Returns the value of the '<em><b>Sv ID</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sv ID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sv ID</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum
     * @see #isSetSvID()
     * @see #unsetSvID()
     * @see #setSvID(ServiceSettingsEnum)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSMVSettings_SvID()
     * @model unsettable="true" ordered="false"
     * @generated
     */
    ServiceSettingsEnum getSvID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getSvID <em>Sv ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sv ID</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum
     * @see #isSetSvID()
     * @see #unsetSvID()
     * @see #getSvID()
     * @generated
     */
    void setSvID(ServiceSettingsEnum value);

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getSvID <em>Sv ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSvID()
     * @see #getSvID()
     * @see #setSvID(ServiceSettingsEnum)
     * @generated
     */
    void unsetSvID();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getSvID <em>Sv ID</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sv ID</em>' attribute is set.
     * @see #unsetSvID()
     * @see #getSvID()
     * @see #setSvID(ServiceSettingsEnum)
     * @generated
     */
    boolean isSetSvID();

    /**
     * Returns the value of the '<em><b>Opt Fields</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Opt Fields</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Opt Fields</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum
     * @see #isSetOptFields()
     * @see #unsetOptFields()
     * @see #setOptFields(ServiceSettingsEnum)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSMVSettings_OptFields()
     * @model unsettable="true" ordered="false"
     * @generated
     */
    ServiceSettingsEnum getOptFields();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getOptFields <em>Opt Fields</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Opt Fields</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum
     * @see #isSetOptFields()
     * @see #unsetOptFields()
     * @see #getOptFields()
     * @generated
     */
    void setOptFields(ServiceSettingsEnum value);

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getOptFields <em>Opt Fields</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOptFields()
     * @see #getOptFields()
     * @see #setOptFields(ServiceSettingsEnum)
     * @generated
     */
    void unsetOptFields();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getOptFields <em>Opt Fields</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Opt Fields</em>' attribute is set.
     * @see #unsetOptFields()
     * @see #getOptFields()
     * @see #setOptFields(ServiceSettingsEnum)
     * @generated
     */
    boolean isSetOptFields();

    /**
     * Returns the value of the '<em><b>Smp Rate Attribute</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Smp Rate Attribute</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Smp Rate Attribute</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum
     * @see #isSetSmpRateAttribute()
     * @see #unsetSmpRateAttribute()
     * @see #setSmpRateAttribute(ServiceSettingsEnum)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSMVSettings_SmpRateAttribute()
     * @model unsettable="true" ordered="false"
     *        extendedMetaData="name='smpRate'"
     * @generated
     */
    ServiceSettingsEnum getSmpRateAttribute();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getSmpRateAttribute <em>Smp Rate Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Smp Rate Attribute</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum
     * @see #isSetSmpRateAttribute()
     * @see #unsetSmpRateAttribute()
     * @see #getSmpRateAttribute()
     * @generated
     */
    void setSmpRateAttribute(ServiceSettingsEnum value);

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getSmpRateAttribute <em>Smp Rate Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSmpRateAttribute()
     * @see #getSmpRateAttribute()
     * @see #setSmpRateAttribute(ServiceSettingsEnum)
     * @generated
     */
    void unsetSmpRateAttribute();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getSmpRateAttribute <em>Smp Rate Attribute</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Smp Rate Attribute</em>' attribute is set.
     * @see #unsetSmpRateAttribute()
     * @see #getSmpRateAttribute()
     * @see #setSmpRateAttribute(ServiceSettingsEnum)
     * @generated
     */
    boolean isSetSmpRateAttribute();

    /**
     * Returns the value of the '<em><b>Samples Per Sec Attribute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Samples Per Sec Attribute</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Samples Per Sec Attribute</em>' attribute.
     * @see #isSetSamplesPerSecAttribute()
     * @see #unsetSamplesPerSecAttribute()
     * @see #setSamplesPerSecAttribute(boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSMVSettings_SamplesPerSecAttribute()
     * @model unsettable="true" ordered="false"
     *        extendedMetaData="name='SamplesPerSec'"
     * @generated
     */
    boolean isSamplesPerSecAttribute();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#isSamplesPerSecAttribute <em>Samples Per Sec Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Samples Per Sec Attribute</em>' attribute.
     * @see #isSetSamplesPerSecAttribute()
     * @see #unsetSamplesPerSecAttribute()
     * @see #isSamplesPerSecAttribute()
     * @generated
     */
    void setSamplesPerSecAttribute(boolean value);

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#isSamplesPerSecAttribute <em>Samples Per Sec Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSamplesPerSecAttribute()
     * @see #isSamplesPerSecAttribute()
     * @see #setSamplesPerSecAttribute(boolean)
     * @generated
     */
    void unsetSamplesPerSecAttribute();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#isSamplesPerSecAttribute <em>Samples Per Sec Attribute</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Samples Per Sec Attribute</em>' attribute is set.
     * @see #unsetSamplesPerSecAttribute()
     * @see #isSamplesPerSecAttribute()
     * @see #setSamplesPerSecAttribute(boolean)
     * @generated
     */
    boolean isSetSamplesPerSecAttribute();

    /**
     * Returns the value of the '<em><b>Pdc Time Stamp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pdc Time Stamp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pdc Time Stamp</em>' attribute.
     * @see #isSetPdcTimeStamp()
     * @see #unsetPdcTimeStamp()
     * @see #setPdcTimeStamp(boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSMVSettings_PdcTimeStamp()
     * @model unsettable="true" ordered="false"
     * @generated
     */
    boolean isPdcTimeStamp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#isPdcTimeStamp <em>Pdc Time Stamp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pdc Time Stamp</em>' attribute.
     * @see #isSetPdcTimeStamp()
     * @see #unsetPdcTimeStamp()
     * @see #isPdcTimeStamp()
     * @generated
     */
    void setPdcTimeStamp(boolean value);

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#isPdcTimeStamp <em>Pdc Time Stamp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPdcTimeStamp()
     * @see #isPdcTimeStamp()
     * @see #setPdcTimeStamp(boolean)
     * @generated
     */
    void unsetPdcTimeStamp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#isPdcTimeStamp <em>Pdc Time Stamp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pdc Time Stamp</em>' attribute is set.
     * @see #unsetPdcTimeStamp()
     * @see #isPdcTimeStamp()
     * @see #setPdcTimeStamp(boolean)
     * @generated
     */
    boolean isSetPdcTimeStamp();

    /**
     * Returns the value of the '<em><b>Smp Rate</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmpRate}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Smp Rate</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Smp Rate</em>' containment reference list.
     * @see #isSetSmpRate()
     * @see #unsetSmpRate()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSMVSettings_SmpRate()
     * @model containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList<SmpRate> getSmpRate();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getSmpRate <em>Smp Rate</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSmpRate()
     * @see #getSmpRate()
     * @generated
     */
    void unsetSmpRate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getSmpRate <em>Smp Rate</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Smp Rate</em>' containment reference list is set.
     * @see #unsetSmpRate()
     * @see #getSmpRate()
     * @generated
     */
    boolean isSetSmpRate();

    /**
     * Returns the value of the '<em><b>Samples Per Sec</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SamplesPerSec}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Samples Per Sec</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Samples Per Sec</em>' containment reference list.
     * @see #isSetSamplesPerSec()
     * @see #unsetSamplesPerSec()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSMVSettings_SamplesPerSec()
     * @model containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList<SamplesPerSec> getSamplesPerSec();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getSamplesPerSec <em>Samples Per Sec</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSamplesPerSec()
     * @see #getSamplesPerSec()
     * @generated
     */
    void unsetSamplesPerSec();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getSamplesPerSec <em>Samples Per Sec</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Samples Per Sec</em>' containment reference list is set.
     * @see #unsetSamplesPerSec()
     * @see #getSamplesPerSec()
     * @generated
     */
    boolean isSetSamplesPerSec();

    /**
     * Returns the value of the '<em><b>Sec Per Samples</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SecPerSamples}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sec Per Samples</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sec Per Samples</em>' containment reference list.
     * @see #isSetSecPerSamples()
     * @see #unsetSecPerSamples()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSMVSettings_SecPerSamples()
     * @model containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList<SecPerSamples> getSecPerSamples();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getSecPerSamples <em>Sec Per Samples</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSecPerSamples()
     * @see #getSecPerSamples()
     * @generated
     */
    void unsetSecPerSamples();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getSecPerSamples <em>Sec Per Samples</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sec Per Samples</em>' containment reference list is set.
     * @see #unsetSecPerSamples()
     * @see #getSecPerSamples()
     * @generated
     */
    boolean isSetSecPerSamples();

    /**
     * Returns the value of the '<em><b>Services</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getSMVSettings <em>SMV Settings</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Services</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Services</em>' container reference.
     * @see #setServices(Services)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSMVSettings_Services()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getSMVSettings
     * @model opposite="SMVSettings" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    Services getServices();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getServices <em>Services</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Services</em>' container reference.
     * @see #getServices()
     * @generated
     */
    void setServices(Services value);

    /**
     * Returns the value of the '<em><b>Synch Src Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Synch Src Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Synch Src Id</em>' attribute.
     * @see #isSetSynchSrcId()
     * @see #unsetSynchSrcId()
     * @see #setSynchSrcId(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSMVSettings_SynchSrcId()
     * @model unsettable="true"
     * @generated
     */
    Boolean getSynchSrcId();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getSynchSrcId <em>Synch Src Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Synch Src Id</em>' attribute.
     * @see #isSetSynchSrcId()
     * @see #unsetSynchSrcId()
     * @see #getSynchSrcId()
     * @generated
     */
    void setSynchSrcId(Boolean value);

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getSynchSrcId <em>Synch Src Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSynchSrcId()
     * @see #getSynchSrcId()
     * @see #setSynchSrcId(Boolean)
     * @generated
     */
    void unsetSynchSrcId();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getSynchSrcId <em>Synch Src Id</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Synch Src Id</em>' attribute is set.
     * @see #unsetSynchSrcId()
     * @see #getSynchSrcId()
     * @see #setSynchSrcId(Boolean)
     * @generated
     */
    boolean isSetSynchSrcId();

    /**
     * Returns the value of the '<em><b>Nof ASDU</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsNoDynEnum}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Nof ASDU</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Nof ASDU</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsNoDynEnum
     * @see #isSetNofASDU()
     * @see #unsetNofASDU()
     * @see #setNofASDU(ServiceSettingsNoDynEnum)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSMVSettings_NofASDU()
     * @model unsettable="true"
     * @generated
     */
    ServiceSettingsNoDynEnum getNofASDU();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getNofASDU <em>Nof ASDU</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Nof ASDU</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsNoDynEnum
     * @see #isSetNofASDU()
     * @see #unsetNofASDU()
     * @see #getNofASDU()
     * @generated
     */
    void setNofASDU(ServiceSettingsNoDynEnum value);

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getNofASDU <em>Nof ASDU</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNofASDU()
     * @see #getNofASDU()
     * @see #setNofASDU(ServiceSettingsNoDynEnum)
     * @generated
     */
    void unsetNofASDU();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getNofASDU <em>Nof ASDU</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Nof ASDU</em>' attribute is set.
     * @see #unsetNofASDU()
     * @see #getNofASDU()
     * @see #setNofASDU(ServiceSettingsNoDynEnum)
     * @generated
     */
    boolean isSetNofASDU();

    /**
     * Returns the value of the '<em><b>Kda Participant</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kda Participant</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kda Participant</em>' attribute.
     * @see #isSetKdaParticipant()
     * @see #unsetKdaParticipant()
     * @see #setKdaParticipant(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSMVSettings_KdaParticipant()
     * @model unsettable="true"
     * @generated
     */
    Boolean getKdaParticipant();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getKdaParticipant <em>Kda Participant</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kda Participant</em>' attribute.
     * @see #isSetKdaParticipant()
     * @see #unsetKdaParticipant()
     * @see #getKdaParticipant()
     * @generated
     */
    void setKdaParticipant(Boolean value);

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getKdaParticipant <em>Kda Participant</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKdaParticipant()
     * @see #getKdaParticipant()
     * @see #setKdaParticipant(Boolean)
     * @generated
     */
    void unsetKdaParticipant();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getKdaParticipant <em>Kda Participant</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kda Participant</em>' attribute is set.
     * @see #unsetKdaParticipant()
     * @see #getKdaParticipant()
     * @see #setKdaParticipant(Boolean)
     * @generated
     */
    boolean isSetKdaParticipant();

    /**
     * Returns the value of the '<em><b>Mc Security</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.McSecurity#getSMVSettings <em>SMV Settings</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mc Security</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mc Security</em>' containment reference.
     * @see #isSetMcSecurity()
     * @see #unsetMcSecurity()
     * @see #setMcSecurity(McSecurity)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSMVSettings_McSecurity()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.McSecurity#getSMVSettings
     * @model opposite="SMVSettings" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    McSecurity getMcSecurity();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getMcSecurity <em>Mc Security</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mc Security</em>' containment reference.
     * @see #isSetMcSecurity()
     * @see #unsetMcSecurity()
     * @see #getMcSecurity()
     * @generated
     */
    void setMcSecurity(McSecurity value);

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getMcSecurity <em>Mc Security</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMcSecurity()
     * @see #getMcSecurity()
     * @see #setMcSecurity(McSecurity)
     * @generated
     */
    void unsetMcSecurity();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getMcSecurity <em>Mc Security</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Mc Security</em>' containment reference is set.
     * @see #unsetMcSecurity()
     * @see #getMcSecurity()
     * @see #setMcSecurity(McSecurity)
     * @generated
     */
    boolean isSetMcSecurity();
} // SMVSettings
