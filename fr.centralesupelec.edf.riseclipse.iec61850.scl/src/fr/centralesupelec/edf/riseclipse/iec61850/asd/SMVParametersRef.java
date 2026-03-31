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
 * A representation of the model object '<em><b>SMV Parameters Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParametersRef#getRefersToSMVParameters <em>Refers To SMV Parameters</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParametersRef#getParentSourceRef <em>Parent Source Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParametersRef#getParentSubscriberLNode <em>Parent Subscriber LNode</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSMVParametersRef()
 * @model
 * @generated
 */
public interface SMVParametersRef extends ServiceParametersRef {
    /**
     * Returns the value of the '<em><b>Refers To SMV Parameters</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getReferredBySMVParametersRef <em>Referred By SMV Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To SMV Parameters</em>' reference.
     * @see #isSetRefersToSMVParameters()
     * @see #unsetRefersToSMVParameters()
     * @see #setRefersToSMVParameters(SMVParameters)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSMVParametersRef_RefersToSMVParameters()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getReferredBySMVParametersRef
     * @model opposite="ReferredBySMVParametersRef" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    SMVParameters getRefersToSMVParameters();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParametersRef#getRefersToSMVParameters <em>Refers To SMV Parameters</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To SMV Parameters</em>' reference.
     * @see #isSetRefersToSMVParameters()
     * @see #unsetRefersToSMVParameters()
     * @see #getRefersToSMVParameters()
     * @generated
     */
    void setRefersToSMVParameters( SMVParameters value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParametersRef#getRefersToSMVParameters <em>Refers To SMV Parameters</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToSMVParameters()
     * @see #getRefersToSMVParameters()
     * @see #setRefersToSMVParameters(SMVParameters)
     * @generated
     */
    void unsetRefersToSMVParameters();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParametersRef#getRefersToSMVParameters <em>Refers To SMV Parameters</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To SMV Parameters</em>' reference is set.
     * @see #unsetRefersToSMVParameters()
     * @see #getRefersToSMVParameters()
     * @see #setRefersToSMVParameters(SMVParameters)
     * @generated
     */
    boolean isSetRefersToSMVParameters();

    /**
     * Returns the value of the '<em><b>Parent Source Ref</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getSMVParametersRef <em>SMV Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Source Ref</em>' container reference.
     * @see #setParentSourceRef(SourceRef)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSMVParametersRef_ParentSourceRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getSMVParametersRef
     * @model opposite="SMVParametersRef" unsettable="true" ordered="false"
     * @generated
     */
    SourceRef getParentSourceRef();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParametersRef#getParentSourceRef <em>Parent Source Ref</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Source Ref</em>' container reference.
     * @see #getParentSourceRef()
     * @generated
     */
    void setParentSourceRef( SourceRef value );

    /**
     * Returns the value of the '<em><b>Parent Subscriber LNode</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getSMVParametersRef <em>SMV Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Subscriber LNode</em>' container reference.
     * @see #setParentSubscriberLNode(SubscriberLNode)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSMVParametersRef_ParentSubscriberLNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getSMVParametersRef
     * @model opposite="SMVParametersRef" unsettable="true" ordered="false"
     * @generated
     */
    SubscriberLNode getParentSubscriberLNode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParametersRef#getParentSubscriberLNode <em>Parent Subscriber LNode</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Subscriber LNode</em>' container reference.
     * @see #getParentSubscriberLNode()
     * @generated
     */
    void setParentSubscriberLNode( SubscriberLNode value );

} // SMVParametersRef
