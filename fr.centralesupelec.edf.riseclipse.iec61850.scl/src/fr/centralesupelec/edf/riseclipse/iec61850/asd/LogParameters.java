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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Log Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Log control parameters for service specification
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#getIntgPd <em>Intg Pd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#isLogEna <em>Log Ena</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#getLogLdInst <em>Log Ld Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#getLogLnClass <em>Log Ln Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#getLogLnInst <em>Log Ln Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#getLogName <em>Log Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#getLogPrefix <em>Log Prefix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#isReasonCode <em>Reason Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#getParentServiceSpecifications <em>Parent Service Specifications</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#getReferredByLogParametersRef <em>Referred By Log Parameters Ref</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLogParameters()
 * @model extendedMetaData="name='tLogParameters' kind='elementOnly'"
 * @generated
 */
public interface LogParameters extends ControlBlockParameters {
    /**
     * Returns the value of the '<em><b>Intg Pd</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * value to use for the intgPd
     * <!-- end-model-doc -->
     * @return the value of the '<em>Intg Pd</em>' attribute.
     * @see #isSetIntgPd()
     * @see #unsetIntgPd()
     * @see #setIntgPd(long)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLogParameters_IntgPd()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
     *        extendedMetaData="kind='attribute' name='intgPd'"
     * @generated
     */
    long getIntgPd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#getIntgPd <em>Intg Pd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Intg Pd</em>' attribute.
     * @see #isSetIntgPd()
     * @see #unsetIntgPd()
     * @see #getIntgPd()
     * @generated
     */
    void setIntgPd( long value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#getIntgPd <em>Intg Pd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIntgPd()
     * @see #getIntgPd()
     * @see #setIntgPd(long)
     * @generated
     */
    void unsetIntgPd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#getIntgPd <em>Intg Pd</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Intg Pd</em>' attribute is set.
     * @see #unsetIntgPd()
     * @see #getIntgPd()
     * @see #setIntgPd(long)
     * @generated
     */
    boolean isSetIntgPd();

    /**
     * Returns the value of the '<em><b>Log Ena</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * default value for Log enabling
     * <!-- end-model-doc -->
     * @return the value of the '<em>Log Ena</em>' attribute.
     * @see #isSetLogEna()
     * @see #unsetLogEna()
     * @see #setLogEna(boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLogParameters_LogEna()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='logEna'"
     * @generated
     */
    boolean isLogEna();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#isLogEna <em>Log Ena</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Log Ena</em>' attribute.
     * @see #isSetLogEna()
     * @see #unsetLogEna()
     * @see #isLogEna()
     * @generated
     */
    void setLogEna( boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#isLogEna <em>Log Ena</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLogEna()
     * @see #isLogEna()
     * @see #setLogEna(boolean)
     * @generated
     */
    void unsetLogEna();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#isLogEna <em>Log Ena</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Log Ena</em>' attribute is set.
     * @see #unsetLogEna()
     * @see #isLogEna()
     * @see #setLogEna(boolean)
     * @generated
     */
    boolean isSetLogEna();

    /**
     * Returns the value of the '<em><b>Log Ld Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * if logName is provided, indication of the LDevice to locate the Log
     * <!-- end-model-doc -->
     * @return the value of the '<em>Log Ld Inst</em>' attribute.
     * @see #setLogLdInst(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLogParameters_LogLdInst()
     * @model extendedMetaData="kind='attribute' name='logLdInst'"
     * @generated
     */
    String getLogLdInst();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#getLogLdInst <em>Log Ld Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Log Ld Inst</em>' attribute.
     * @see #getLogLdInst()
     * @generated
     */
    void setLogLdInst( String value );

    /**
     * Returns the value of the '<em><b>Log Ln Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * if logName is provided, indication of the LNode Class to locate the Log
     * <!-- end-model-doc -->
     * @return the value of the '<em>Log Ln Class</em>' attribute.
     * @see #setLogLnClass(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLogParameters_LogLnClass()
     * @model extendedMetaData="kind='attribute' name='logLnClass'"
     * @generated
     */
    String getLogLnClass();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#getLogLnClass <em>Log Ln Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Log Ln Class</em>' attribute.
     * @see #getLogLnClass()
     * @generated
     */
    void setLogLnClass( String value );

    /**
     * Returns the value of the '<em><b>Log Ln Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * if logName is provided, indication of the LNode instance to locate the Log
     * <!-- end-model-doc -->
     * @return the value of the '<em>Log Ln Inst</em>' attribute.
     * @see #setLogLnInst(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLogParameters_LogLnInst()
     * @model extendedMetaData="kind='attribute' name='logLnInst'"
     * @generated
     */
    String getLogLnInst();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#getLogLnInst <em>Log Ln Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Log Ln Inst</em>' attribute.
     * @see #getLogLnInst()
     * @generated
     */
    void setLogLnInst( String value );

    /**
     * Returns the value of the '<em><b>Log Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * name of the Log to use
     * <!-- end-model-doc -->
     * @return the value of the '<em>Log Name</em>' attribute.
     * @see #setLogName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLogParameters_LogName()
     * @model extendedMetaData="kind='attribute' name='logName'"
     * @generated
     */
    String getLogName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#getLogName <em>Log Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Log Name</em>' attribute.
     * @see #getLogName()
     * @generated
     */
    void setLogName( String value );

    /**
     * Returns the value of the '<em><b>Log Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * if logName is provided, indication of the LNode prefix to locate the Log
     * <!-- end-model-doc -->
     * @return the value of the '<em>Log Prefix</em>' attribute.
     * @see #setLogPrefix(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLogParameters_LogPrefix()
     * @model extendedMetaData="kind='attribute' name='logPrefix'"
     * @generated
     */
    String getLogPrefix();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#getLogPrefix <em>Log Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Log Prefix</em>' attribute.
     * @see #getLogPrefix()
     * @generated
     */
    void setLogPrefix( String value );

    /**
     * Returns the value of the '<em><b>Reason Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * value tu use for reasonCode
     * <!-- end-model-doc -->
     * @return the value of the '<em>Reason Code</em>' attribute.
     * @see #isSetReasonCode()
     * @see #unsetReasonCode()
     * @see #setReasonCode(boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLogParameters_ReasonCode()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='reasonCode'"
     * @generated
     */
    boolean isReasonCode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#isReasonCode <em>Reason Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reason Code</em>' attribute.
     * @see #isSetReasonCode()
     * @see #unsetReasonCode()
     * @see #isReasonCode()
     * @generated
     */
    void setReasonCode( boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#isReasonCode <em>Reason Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReasonCode()
     * @see #isReasonCode()
     * @see #setReasonCode(boolean)
     * @generated
     */
    void unsetReasonCode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#isReasonCode <em>Reason Code</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Reason Code</em>' attribute is set.
     * @see #unsetReasonCode()
     * @see #isReasonCode()
     * @see #setReasonCode(boolean)
     * @generated
     */
    boolean isSetReasonCode();

    /**
     * Returns the value of the '<em><b>Parent Service Specifications</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications#getLogParameters <em>Log Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Service Specifications</em>' container reference.
     * @see #setParentServiceSpecifications(ServiceSpecifications)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLogParameters_ParentServiceSpecifications()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications#getLogParameters
     * @model opposite="logParameters" unsettable="true" ordered="false"
     * @generated
     */
    ServiceSpecifications getParentServiceSpecifications();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#getParentServiceSpecifications <em>Parent Service Specifications</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Service Specifications</em>' container reference.
     * @see #getParentServiceSpecifications()
     * @generated
     */
    void setParentServiceSpecifications( ServiceSpecifications value );

    /**
     * Returns the value of the '<em><b>Referred By Log Parameters Ref</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParametersRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParametersRef#getRefersToLogParameters <em>Refers To Log Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Log Parameters Ref</em>' reference list.
     * @see #isSetReferredByLogParametersRef()
     * @see #unsetReferredByLogParametersRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLogParameters_ReferredByLogParametersRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParametersRef#getRefersToLogParameters
     * @model opposite="RefersToLogParameters" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< LogParametersRef > getReferredByLogParametersRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#getReferredByLogParametersRef <em>Referred By Log Parameters Ref</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByLogParametersRef()
     * @see #getReferredByLogParametersRef()
     * @generated
     */
    void unsetReferredByLogParametersRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#getReferredByLogParametersRef <em>Referred By Log Parameters Ref</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Log Parameters Ref</em>' reference list is set.
     * @see #unsetReferredByLogParametersRef()
     * @see #getReferredByLogParametersRef()
     * @generated
     */
    boolean isSetReferredByLogParametersRef();

} // LogParameters
