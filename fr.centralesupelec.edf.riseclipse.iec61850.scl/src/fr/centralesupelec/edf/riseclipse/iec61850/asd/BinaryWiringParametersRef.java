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
 * A representation of the model object '<em><b>Binary Wiring Parameters Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParametersRef#getParentControlRef <em>Parent Control Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParametersRef#getParentControllingLNode <em>Parent Controlling LNode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParametersRef#getParentSourceRef <em>Parent Source Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParametersRef#getParentSubscriberLNode <em>Parent Subscriber LNode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParametersRef#getRefersToBinaryWiringParameters <em>Refers To Binary Wiring Parameters</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getBinaryWiringParametersRef()
 * @model
 * @generated
 */
public interface BinaryWiringParametersRef extends ServiceParametersRef {
    /**
     * Returns the value of the '<em><b>Parent Control Ref</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getBinaryWiringParametersRef <em>Binary Wiring Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Control Ref</em>' container reference.
     * @see #setParentControlRef(ControlRef)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getBinaryWiringParametersRef_ParentControlRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getBinaryWiringParametersRef
     * @model opposite="BinaryWiringParametersRef" unsettable="true" ordered="false"
     * @generated
     */
    ControlRef getParentControlRef();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParametersRef#getParentControlRef <em>Parent Control Ref</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Control Ref</em>' container reference.
     * @see #getParentControlRef()
     * @generated
     */
    void setParentControlRef( ControlRef value );

    /**
     * Returns the value of the '<em><b>Parent Controlling LNode</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getBinaryWiringParametersRef <em>Binary Wiring Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Controlling LNode</em>' container reference.
     * @see #setParentControllingLNode(ControllingLNode)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getBinaryWiringParametersRef_ParentControllingLNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getBinaryWiringParametersRef
     * @model opposite="BinaryWiringParametersRef" unsettable="true" ordered="false"
     * @generated
     */
    ControllingLNode getParentControllingLNode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParametersRef#getParentControllingLNode <em>Parent Controlling LNode</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Controlling LNode</em>' container reference.
     * @see #getParentControllingLNode()
     * @generated
     */
    void setParentControllingLNode( ControllingLNode value );

    /**
     * Returns the value of the '<em><b>Parent Source Ref</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getBinaryWiringParametersRef <em>Binary Wiring Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Source Ref</em>' container reference.
     * @see #setParentSourceRef(SourceRef)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getBinaryWiringParametersRef_ParentSourceRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getBinaryWiringParametersRef
     * @model opposite="BinaryWiringParametersRef" unsettable="true" ordered="false"
     * @generated
     */
    SourceRef getParentSourceRef();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParametersRef#getParentSourceRef <em>Parent Source Ref</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Source Ref</em>' container reference.
     * @see #getParentSourceRef()
     * @generated
     */
    void setParentSourceRef( SourceRef value );

    /**
     * Returns the value of the '<em><b>Parent Subscriber LNode</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getBinaryWiringParametersRef <em>Binary Wiring Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Subscriber LNode</em>' container reference.
     * @see #setParentSubscriberLNode(SubscriberLNode)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getBinaryWiringParametersRef_ParentSubscriberLNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getBinaryWiringParametersRef
     * @model opposite="BinaryWiringParametersRef" unsettable="true" ordered="false"
     * @generated
     */
    SubscriberLNode getParentSubscriberLNode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParametersRef#getParentSubscriberLNode <em>Parent Subscriber LNode</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Subscriber LNode</em>' container reference.
     * @see #getParentSubscriberLNode()
     * @generated
     */
    void setParentSubscriberLNode( SubscriberLNode value );

    /**
     * Returns the value of the '<em><b>Refers To Binary Wiring Parameters</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getReferredByBinaryWiringParametersRef <em>Referred By Binary Wiring Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Binary Wiring Parameters</em>' reference.
     * @see #isSetRefersToBinaryWiringParameters()
     * @see #unsetRefersToBinaryWiringParameters()
     * @see #setRefersToBinaryWiringParameters(BinaryWiringParameters)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getBinaryWiringParametersRef_RefersToBinaryWiringParameters()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getReferredByBinaryWiringParametersRef
     * @model opposite="ReferredByBinaryWiringParametersRef" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    BinaryWiringParameters getRefersToBinaryWiringParameters();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParametersRef#getRefersToBinaryWiringParameters <em>Refers To Binary Wiring Parameters</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Binary Wiring Parameters</em>' reference.
     * @see #isSetRefersToBinaryWiringParameters()
     * @see #unsetRefersToBinaryWiringParameters()
     * @see #getRefersToBinaryWiringParameters()
     * @generated
     */
    void setRefersToBinaryWiringParameters( BinaryWiringParameters value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParametersRef#getRefersToBinaryWiringParameters <em>Refers To Binary Wiring Parameters</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToBinaryWiringParameters()
     * @see #getRefersToBinaryWiringParameters()
     * @see #setRefersToBinaryWiringParameters(BinaryWiringParameters)
     * @generated
     */
    void unsetRefersToBinaryWiringParameters();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParametersRef#getRefersToBinaryWiringParameters <em>Refers To Binary Wiring Parameters</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Binary Wiring Parameters</em>' reference is set.
     * @see #unsetRefersToBinaryWiringParameters()
     * @see #getRefersToBinaryWiringParameters()
     * @see #setRefersToBinaryWiringParameters(BinaryWiringParameters)
     * @generated
     */
    boolean isSetRefersToBinaryWiringParameters();

} // BinaryWiringParametersRef
