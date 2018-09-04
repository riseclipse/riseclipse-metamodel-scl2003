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
 * A representation of the model object '<em><b>Smv Opts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts#getDataSet <em>Data Set</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts#getRefreshTime <em>Refresh Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts#getSampleRate <em>Sample Rate</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts#getSampleSynchronized <em>Sample Synchronized</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts#getSecurity <em>Security</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts#getSampledValueControl <em>Sampled Value Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts#getSynchSourceId <em>Synch Source Id</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSmvOpts()
 * @model
 * @generated
 */
public interface SmvOpts extends SclObject {
    /**
     * Returns the value of the '<em><b>Data Set</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Set</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Set</em>' attribute.
     * @see #isSetDataSet()
     * @see #unsetDataSet()
     * @see #setDataSet(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSmvOpts_DataSet()
     * @model unsettable="true"
     * @generated
     */
    Boolean getDataSet();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts#getDataSet <em>Data Set</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Set</em>' attribute.
     * @see #isSetDataSet()
     * @see #unsetDataSet()
     * @see #getDataSet()
     * @generated
     */
    void setDataSet( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts#getDataSet <em>Data Set</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetDataSet()
     * @see #getDataSet()
     * @see #setDataSet(Boolean)
     * @generated
     */
    void unsetDataSet();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts#getDataSet <em>Data Set</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Data Set</em>' attribute is set.
     * @see #unsetDataSet()
     * @see #getDataSet()
     * @see #setDataSet(Boolean)
     * @generated
     */
    boolean isSetDataSet();

    /**
     * Returns the value of the '<em><b>Refresh Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Refresh Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refresh Time</em>' attribute.
     * @see #isSetRefreshTime()
     * @see #unsetRefreshTime()
     * @see #setRefreshTime(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSmvOpts_RefreshTime()
     * @model unsettable="true"
     * @generated
     */
    Boolean getRefreshTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts#getRefreshTime <em>Refresh Time</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refresh Time</em>' attribute.
     * @see #isSetRefreshTime()
     * @see #unsetRefreshTime()
     * @see #getRefreshTime()
     * @generated
     */
    void setRefreshTime( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts#getRefreshTime <em>Refresh Time</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetRefreshTime()
     * @see #getRefreshTime()
     * @see #setRefreshTime(Boolean)
     * @generated
     */
    void unsetRefreshTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts#getRefreshTime <em>Refresh Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refresh Time</em>' attribute is set.
     * @see #unsetRefreshTime()
     * @see #getRefreshTime()
     * @see #setRefreshTime(Boolean)
     * @generated
     */
    boolean isSetRefreshTime();

    /**
     * Returns the value of the '<em><b>Sample Rate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sample Rate</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sample Rate</em>' attribute.
     * @see #isSetSampleRate()
     * @see #unsetSampleRate()
     * @see #setSampleRate(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSmvOpts_SampleRate()
     * @model unsettable="true"
     * @generated
     */
    Boolean getSampleRate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts#getSampleRate <em>Sample Rate</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sample Rate</em>' attribute.
     * @see #isSetSampleRate()
     * @see #unsetSampleRate()
     * @see #getSampleRate()
     * @generated
     */
    void setSampleRate( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts#getSampleRate <em>Sample Rate</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetSampleRate()
     * @see #getSampleRate()
     * @see #setSampleRate(Boolean)
     * @generated
     */
    void unsetSampleRate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts#getSampleRate <em>Sample Rate</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sample Rate</em>' attribute is set.
     * @see #unsetSampleRate()
     * @see #getSampleRate()
     * @see #setSampleRate(Boolean)
     * @generated
     */
    boolean isSetSampleRate();

    /**
     * Returns the value of the '<em><b>Sample Synchronized</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sample Synchronized</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sample Synchronized</em>' attribute.
     * @see #isSetSampleSynchronized()
     * @see #unsetSampleSynchronized()
     * @see #setSampleSynchronized(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSmvOpts_SampleSynchronized()
     * @model unsettable="true"
     * @generated
     */
    Boolean getSampleSynchronized();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts#getSampleSynchronized <em>Sample Synchronized</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sample Synchronized</em>' attribute.
     * @see #isSetSampleSynchronized()
     * @see #unsetSampleSynchronized()
     * @see #getSampleSynchronized()
     * @generated
     */
    void setSampleSynchronized( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts#getSampleSynchronized <em>Sample Synchronized</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetSampleSynchronized()
     * @see #getSampleSynchronized()
     * @see #setSampleSynchronized(Boolean)
     * @generated
     */
    void unsetSampleSynchronized();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts#getSampleSynchronized <em>Sample Synchronized</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sample Synchronized</em>' attribute is set.
     * @see #unsetSampleSynchronized()
     * @see #getSampleSynchronized()
     * @see #setSampleSynchronized(Boolean)
     * @generated
     */
    boolean isSetSampleSynchronized();

    /**
     * Returns the value of the '<em><b>Security</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Security</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Security</em>' attribute.
     * @see #isSetSecurity()
     * @see #unsetSecurity()
     * @see #setSecurity(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSmvOpts_Security()
     * @model unsettable="true"
     * @generated
     */
    Boolean getSecurity();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts#getSecurity <em>Security</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @param value the new value of the '<em>Security</em>' attribute.
     * @see #isSetSecurity()
     * @see #unsetSecurity()
     * @see #getSecurity()
     * @generated
     */
    void setSecurity( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts#getSecurity <em>Security</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetSecurity()
     * @see #getSecurity()
     * @see #setSecurity(Boolean)
     * @generated
     */
    void unsetSecurity();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts#getSecurity <em>Security</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Security</em>' attribute is set.
     * @see #unsetSecurity()
     * @see #getSecurity()
     * @see #setSecurity(Boolean)
     * @generated
     */
    boolean isSetSecurity();

    /**
     * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Timestamp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Timestamp</em>' attribute.
     * @see #isSetTimestamp()
     * @see #unsetTimestamp()
     * @see #setTimestamp(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSmvOpts_Timestamp()
     * @model unsettable="true"
     * @generated
     */
    Boolean getTimestamp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts#getTimestamp <em>Timestamp</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @param value the new value of the '<em>Timestamp</em>' attribute.
     * @see #isSetTimestamp()
     * @see #unsetTimestamp()
     * @see #getTimestamp()
     * @generated
     */
    void setTimestamp( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts#getTimestamp <em>Timestamp</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetTimestamp()
     * @see #getTimestamp()
     * @see #setTimestamp(Boolean)
     * @generated
     */
    void unsetTimestamp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts#getTimestamp <em>Timestamp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Timestamp</em>' attribute is set.
     * @see #unsetTimestamp()
     * @see #getTimestamp()
     * @see #setTimestamp(Boolean)
     * @generated
     */
    boolean isSetTimestamp();

    /**
     * Returns the value of the '<em><b>Sampled Value Control</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getSmvOpts <em>Smv Opts</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sampled Value Control</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sampled Value Control</em>' container reference.
     * @see #setSampledValueControl(SampledValueControl)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSmvOpts_SampledValueControl()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getSmvOpts
     * @model opposite="SmvOpts" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    SampledValueControl getSampledValueControl();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts#getSampledValueControl <em>Sampled Value Control</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sampled Value Control</em>' container reference.
     * @see #getSampledValueControl()
     * @generated
     */
    void setSampledValueControl( SampledValueControl value );

    /**
     * Returns the value of the '<em><b>Synch Source Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Synch Source Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Synch Source Id</em>' attribute.
     * @see #isSetSynchSourceId()
     * @see #unsetSynchSourceId()
     * @see #setSynchSourceId(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSmvOpts_SynchSourceId()
     * @model unsettable="true"
     * @generated
     */
    Boolean getSynchSourceId();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts#getSynchSourceId <em>Synch Source Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Synch Source Id</em>' attribute.
     * @see #isSetSynchSourceId()
     * @see #unsetSynchSourceId()
     * @see #getSynchSourceId()
     * @generated
     */
    void setSynchSourceId(Boolean value);

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts#getSynchSourceId <em>Synch Source Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSynchSourceId()
     * @see #getSynchSourceId()
     * @see #setSynchSourceId(Boolean)
     * @generated
     */
    void unsetSynchSourceId();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts#getSynchSourceId <em>Synch Source Id</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Synch Source Id</em>' attribute is set.
     * @see #unsetSynchSourceId()
     * @see #getSynchSourceId()
     * @see #setSynchSourceId(Boolean)
     * @generated
     */
    boolean isSetSynchSourceId();

} // SmvOpts
