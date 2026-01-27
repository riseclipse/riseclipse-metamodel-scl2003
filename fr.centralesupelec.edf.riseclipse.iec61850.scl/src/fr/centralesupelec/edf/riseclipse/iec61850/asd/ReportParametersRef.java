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
 * A representation of the model object '<em><b>Report Parameters Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParametersRef#getRefersToReportParameters <em>Refers To Report Parameters</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParametersRef#getParentSourceRef <em>Parent Source Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParametersRef#getParentSubscriberLNode <em>Parent Subscriber LNode</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getReportParametersRef()
 * @model
 * @generated
 */
public interface ReportParametersRef extends ServiceParametersRef {
    /**
     * Returns the value of the '<em><b>Refers To Report Parameters</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters#getReferredByReportParametersRef <em>Referred By Report Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Report Parameters</em>' reference.
     * @see #isSetRefersToReportParameters()
     * @see #unsetRefersToReportParameters()
     * @see #setRefersToReportParameters(ReportParameters)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getReportParametersRef_RefersToReportParameters()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters#getReferredByReportParametersRef
     * @model opposite="ReferredByReportParametersRef" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    ReportParameters getRefersToReportParameters();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParametersRef#getRefersToReportParameters <em>Refers To Report Parameters</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Report Parameters</em>' reference.
     * @see #isSetRefersToReportParameters()
     * @see #unsetRefersToReportParameters()
     * @see #getRefersToReportParameters()
     * @generated
     */
    void setRefersToReportParameters( ReportParameters value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParametersRef#getRefersToReportParameters <em>Refers To Report Parameters</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToReportParameters()
     * @see #getRefersToReportParameters()
     * @see #setRefersToReportParameters(ReportParameters)
     * @generated
     */
    void unsetRefersToReportParameters();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParametersRef#getRefersToReportParameters <em>Refers To Report Parameters</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Report Parameters</em>' reference is set.
     * @see #unsetRefersToReportParameters()
     * @see #getRefersToReportParameters()
     * @see #setRefersToReportParameters(ReportParameters)
     * @generated
     */
    boolean isSetRefersToReportParameters();

    /**
     * Returns the value of the '<em><b>Parent Source Ref</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getReportParametersRef <em>Report Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Source Ref</em>' container reference.
     * @see #setParentSourceRef(SourceRef)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getReportParametersRef_ParentSourceRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getReportParametersRef
     * @model opposite="ReportParametersRef" unsettable="true" ordered="false"
     * @generated
     */
    SourceRef getParentSourceRef();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParametersRef#getParentSourceRef <em>Parent Source Ref</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Source Ref</em>' container reference.
     * @see #getParentSourceRef()
     * @generated
     */
    void setParentSourceRef( SourceRef value );

    /**
     * Returns the value of the '<em><b>Parent Subscriber LNode</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getReportParametersRef <em>Report Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Subscriber LNode</em>' container reference.
     * @see #setParentSubscriberLNode(SubscriberLNode)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getReportParametersRef_ParentSubscriberLNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getReportParametersRef
     * @model opposite="ReportParametersRef" unsettable="true" ordered="false"
     * @generated
     */
    SubscriberLNode getParentSubscriberLNode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParametersRef#getParentSubscriberLNode <em>Parent Subscriber LNode</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Subscriber LNode</em>' container reference.
     * @see #getParentSubscriberLNode()
     * @generated
     */
    void setParentSubscriberLNode( SubscriberLNode value );

} // ReportParametersRef
