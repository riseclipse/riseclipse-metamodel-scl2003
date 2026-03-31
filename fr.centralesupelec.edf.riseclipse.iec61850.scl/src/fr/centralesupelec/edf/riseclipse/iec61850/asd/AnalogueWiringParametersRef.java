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
 * A representation of the model object '<em><b>Analogue Wiring Parameters Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParametersRef#getParentControlRef <em>Parent Control Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParametersRef#getParentControllingLNode <em>Parent Controlling LNode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParametersRef#getParentSourceRef <em>Parent Source Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParametersRef#getRefersToAnalogueWiringParameters <em>Refers To Analogue Wiring Parameters</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getAnalogueWiringParametersRef()
 * @model
 * @generated
 */
public interface AnalogueWiringParametersRef extends ServiceParametersRef {
    /**
     * Returns the value of the '<em><b>Parent Control Ref</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getAnalogueWiringParametersRef <em>Analogue Wiring Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Control Ref</em>' container reference.
     * @see #setParentControlRef(ControlRef)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getAnalogueWiringParametersRef_ParentControlRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getAnalogueWiringParametersRef
     * @model opposite="AnalogueWiringParametersRef" unsettable="true" ordered="false"
     * @generated
     */
    ControlRef getParentControlRef();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParametersRef#getParentControlRef <em>Parent Control Ref</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Control Ref</em>' container reference.
     * @see #getParentControlRef()
     * @generated
     */
    void setParentControlRef( ControlRef value );

    /**
     * Returns the value of the '<em><b>Parent Controlling LNode</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getAnalogueWiringParametersRef <em>Analogue Wiring Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Controlling LNode</em>' container reference.
     * @see #setParentControllingLNode(ControllingLNode)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getAnalogueWiringParametersRef_ParentControllingLNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getAnalogueWiringParametersRef
     * @model opposite="AnalogueWiringParametersRef" unsettable="true" ordered="false"
     * @generated
     */
    ControllingLNode getParentControllingLNode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParametersRef#getParentControllingLNode <em>Parent Controlling LNode</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Controlling LNode</em>' container reference.
     * @see #getParentControllingLNode()
     * @generated
     */
    void setParentControllingLNode( ControllingLNode value );

    /**
     * Returns the value of the '<em><b>Parent Source Ref</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getAnalogueWiringParametersRef <em>Analogue Wiring Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Source Ref</em>' container reference.
     * @see #setParentSourceRef(SourceRef)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getAnalogueWiringParametersRef_ParentSourceRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getAnalogueWiringParametersRef
     * @model opposite="AnalogueWiringParametersRef" unsettable="true" ordered="false"
     * @generated
     */
    SourceRef getParentSourceRef();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParametersRef#getParentSourceRef <em>Parent Source Ref</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Source Ref</em>' container reference.
     * @see #getParentSourceRef()
     * @generated
     */
    void setParentSourceRef( SourceRef value );

    /**
     * Returns the value of the '<em><b>Refers To Analogue Wiring Parameters</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParameters#getReferredByAnalogueWiringParametersRef <em>Referred By Analogue Wiring Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Analogue Wiring Parameters</em>' reference.
     * @see #isSetRefersToAnalogueWiringParameters()
     * @see #unsetRefersToAnalogueWiringParameters()
     * @see #setRefersToAnalogueWiringParameters(AnalogueWiringParameters)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getAnalogueWiringParametersRef_RefersToAnalogueWiringParameters()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParameters#getReferredByAnalogueWiringParametersRef
     * @model opposite="ReferredByAnalogueWiringParametersRef" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    AnalogueWiringParameters getRefersToAnalogueWiringParameters();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParametersRef#getRefersToAnalogueWiringParameters <em>Refers To Analogue Wiring Parameters</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Analogue Wiring Parameters</em>' reference.
     * @see #isSetRefersToAnalogueWiringParameters()
     * @see #unsetRefersToAnalogueWiringParameters()
     * @see #getRefersToAnalogueWiringParameters()
     * @generated
     */
    void setRefersToAnalogueWiringParameters( AnalogueWiringParameters value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParametersRef#getRefersToAnalogueWiringParameters <em>Refers To Analogue Wiring Parameters</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToAnalogueWiringParameters()
     * @see #getRefersToAnalogueWiringParameters()
     * @see #setRefersToAnalogueWiringParameters(AnalogueWiringParameters)
     * @generated
     */
    void unsetRefersToAnalogueWiringParameters();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParametersRef#getRefersToAnalogueWiringParameters <em>Refers To Analogue Wiring Parameters</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Analogue Wiring Parameters</em>' reference is set.
     * @see #unsetRefersToAnalogueWiringParameters()
     * @see #getRefersToAnalogueWiringParameters()
     * @see #setRefersToAnalogueWiringParameters(AnalogueWiringParameters)
     * @generated
     */
    boolean isSetRefersToAnalogueWiringParameters();

} // AnalogueWiringParametersRef
