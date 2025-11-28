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
 * A representation of the model object '<em><b>Report Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Report control parameters for service specification
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters#isBuffered <em>Buffered</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters#getBufTime <em>Buf Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters#getIntgPd <em>Intg Pd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters#getParentCommServiceSpecifications <em>Parent Comm Service Specifications</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters#getParentServiceSpecifications <em>Parent Service Specifications</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters#getReferredByReportParametersRef <em>Referred By Report Parameters Ref</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getReportParameters()
 * @model extendedMetaData="name='tReportParameters' kind='elementOnly'"
 * @generated
 */
public interface ReportParameters extends ControlBlockParameters {
    /**
     * Returns the value of the '<em><b>Buffered</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * value to use for the buffered
     * <!-- end-model-doc -->
     * @return the value of the '<em>Buffered</em>' attribute.
     * @see #isSetBuffered()
     * @see #unsetBuffered()
     * @see #setBuffered(boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getReportParameters_Buffered()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='buffered'"
     * @generated
     */
    boolean isBuffered();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters#isBuffered <em>Buffered</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Buffered</em>' attribute.
     * @see #isSetBuffered()
     * @see #unsetBuffered()
     * @see #isBuffered()
     * @generated
     */
    void setBuffered( boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters#isBuffered <em>Buffered</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBuffered()
     * @see #isBuffered()
     * @see #setBuffered(boolean)
     * @generated
     */
    void unsetBuffered();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters#isBuffered <em>Buffered</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Buffered</em>' attribute is set.
     * @see #unsetBuffered()
     * @see #isBuffered()
     * @see #setBuffered(boolean)
     * @generated
     */
    boolean isSetBuffered();

    /**
     * Returns the value of the '<em><b>Buf Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * value to use for the bufTime
     * <!-- end-model-doc -->
     * @return the value of the '<em>Buf Time</em>' attribute.
     * @see #isSetBufTime()
     * @see #unsetBufTime()
     * @see #setBufTime(long)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getReportParameters_BufTime()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
     *        extendedMetaData="kind='attribute' name='bufTime'"
     * @generated
     */
    long getBufTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters#getBufTime <em>Buf Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Buf Time</em>' attribute.
     * @see #isSetBufTime()
     * @see #unsetBufTime()
     * @see #getBufTime()
     * @generated
     */
    void setBufTime( long value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters#getBufTime <em>Buf Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBufTime()
     * @see #getBufTime()
     * @see #setBufTime(long)
     * @generated
     */
    void unsetBufTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters#getBufTime <em>Buf Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Buf Time</em>' attribute is set.
     * @see #unsetBufTime()
     * @see #getBufTime()
     * @see #setBufTime(long)
     * @generated
     */
    boolean isSetBufTime();

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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getReportParameters_IntgPd()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
     *        extendedMetaData="kind='attribute' name='intgPd'"
     * @generated
     */
    long getIntgPd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters#getIntgPd <em>Intg Pd</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters#getIntgPd <em>Intg Pd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIntgPd()
     * @see #getIntgPd()
     * @see #setIntgPd(long)
     * @generated
     */
    void unsetIntgPd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters#getIntgPd <em>Intg Pd</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Parent Comm Service Specifications</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CommServiceSpecifications#getReportParameters <em>Report Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Comm Service Specifications</em>' container reference.
     * @see #setParentCommServiceSpecifications(CommServiceSpecifications)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getReportParameters_ParentCommServiceSpecifications()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.CommServiceSpecifications#getReportParameters
     * @model opposite="reportParameters" unsettable="true" ordered="false"
     * @generated
     */
    CommServiceSpecifications getParentCommServiceSpecifications();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters#getParentCommServiceSpecifications <em>Parent Comm Service Specifications</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Comm Service Specifications</em>' container reference.
     * @see #getParentCommServiceSpecifications()
     * @generated
     */
    void setParentCommServiceSpecifications( CommServiceSpecifications value );

    /**
     * Returns the value of the '<em><b>Parent Service Specifications</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications#getReportParameters <em>Report Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Service Specifications</em>' container reference.
     * @see #setParentServiceSpecifications(ServiceSpecifications)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getReportParameters_ParentServiceSpecifications()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications#getReportParameters
     * @model opposite="reportParameters" unsettable="true" ordered="false"
     * @generated
     */
    ServiceSpecifications getParentServiceSpecifications();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters#getParentServiceSpecifications <em>Parent Service Specifications</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Service Specifications</em>' container reference.
     * @see #getParentServiceSpecifications()
     * @generated
     */
    void setParentServiceSpecifications( ServiceSpecifications value );

    /**
     * Returns the value of the '<em><b>Referred By Report Parameters Ref</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParametersRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParametersRef#getRefersToReportParameters <em>Refers To Report Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Report Parameters Ref</em>' reference list.
     * @see #isSetReferredByReportParametersRef()
     * @see #unsetReferredByReportParametersRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getReportParameters_ReferredByReportParametersRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParametersRef#getRefersToReportParameters
     * @model opposite="RefersToReportParameters" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< ReportParametersRef > getReferredByReportParametersRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters#getReferredByReportParametersRef <em>Referred By Report Parameters Ref</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByReportParametersRef()
     * @see #getReferredByReportParametersRef()
     * @generated
     */
    void unsetReferredByReportParametersRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters#getReferredByReportParametersRef <em>Referred By Report Parameters Ref</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Report Parameters Ref</em>' reference list is set.
     * @see #unsetReferredByReportParametersRef()
     * @see #getReferredByReportParametersRef()
     * @generated
     */
    boolean isSetReferredByReportParametersRef();

} // ReportParameters
