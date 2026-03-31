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
 * A representation of the model object '<em><b>Goose Parameters Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParametersRef#getParentSubscriberLNode <em>Parent Subscriber LNode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParametersRef#getParentSourceRef <em>Parent Source Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParametersRef#getRefersToGooseParameters <em>Refers To Goose Parameters</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getGooseParametersRef()
 * @model
 * @generated
 */
public interface GooseParametersRef extends ServiceParametersRef {
    /**
     * Returns the value of the '<em><b>Parent Subscriber LNode</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getGooseParametersRef <em>Goose Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Subscriber LNode</em>' container reference.
     * @see #setParentSubscriberLNode(SubscriberLNode)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getGooseParametersRef_ParentSubscriberLNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getGooseParametersRef
     * @model opposite="GooseParametersRef" unsettable="true" ordered="false"
     * @generated
     */
    SubscriberLNode getParentSubscriberLNode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParametersRef#getParentSubscriberLNode <em>Parent Subscriber LNode</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Subscriber LNode</em>' container reference.
     * @see #getParentSubscriberLNode()
     * @generated
     */
    void setParentSubscriberLNode( SubscriberLNode value );

    /**
     * Returns the value of the '<em><b>Parent Source Ref</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getGooseParametersRef <em>Goose Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Source Ref</em>' container reference.
     * @see #setParentSourceRef(SourceRef)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getGooseParametersRef_ParentSourceRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getGooseParametersRef
     * @model opposite="GooseParametersRef" unsettable="true" ordered="false"
     * @generated
     */
    SourceRef getParentSourceRef();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParametersRef#getParentSourceRef <em>Parent Source Ref</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Source Ref</em>' container reference.
     * @see #getParentSourceRef()
     * @generated
     */
    void setParentSourceRef( SourceRef value );

    /**
     * Returns the value of the '<em><b>Refers To Goose Parameters</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getReferredByGooseParametersRef <em>Referred By Goose Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Goose Parameters</em>' reference.
     * @see #isSetRefersToGooseParameters()
     * @see #unsetRefersToGooseParameters()
     * @see #setRefersToGooseParameters(GooseParameters)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getGooseParametersRef_RefersToGooseParameters()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getReferredByGooseParametersRef
     * @model opposite="ReferredByGooseParametersRef" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    GooseParameters getRefersToGooseParameters();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParametersRef#getRefersToGooseParameters <em>Refers To Goose Parameters</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Goose Parameters</em>' reference.
     * @see #isSetRefersToGooseParameters()
     * @see #unsetRefersToGooseParameters()
     * @see #getRefersToGooseParameters()
     * @generated
     */
    void setRefersToGooseParameters( GooseParameters value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParametersRef#getRefersToGooseParameters <em>Refers To Goose Parameters</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToGooseParameters()
     * @see #getRefersToGooseParameters()
     * @see #setRefersToGooseParameters(GooseParameters)
     * @generated
     */
    void unsetRefersToGooseParameters();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParametersRef#getRefersToGooseParameters <em>Refers To Goose Parameters</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Goose Parameters</em>' reference is set.
     * @see #unsetRefersToGooseParameters()
     * @see #getRefersToGooseParameters()
     * @see #setRefersToGooseParameters(GooseParameters)
     * @generated
     */
    boolean isSetRefersToGooseParameters();

} // GooseParametersRef
