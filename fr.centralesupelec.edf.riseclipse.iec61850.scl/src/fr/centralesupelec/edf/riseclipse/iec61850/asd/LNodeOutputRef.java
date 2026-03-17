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
 * A representation of the model object '<em><b>LNode Output Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of the LNodeOutputRef element
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputRef#getControlRef <em>Control Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputRef#getControlRefUuid <em>Control Ref Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputRef#getRefersToControlRef <em>Refers To Control Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputRef#getParentSignalRole <em>Parent Signal Role</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLNodeOutputRef()
 * @model
 * @generated
 */
public interface LNodeOutputRef extends FunctionalVariantRefContainer {
    /**
     * Returns the value of the '<em><b>Control Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Identification of the ControlRef belonging to the current role (reference the output attribute of the ControlRef)
     * <!-- end-model-doc -->
     * @return the value of the '<em>Control Ref</em>' attribute.
     * @see #setControlRef(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLNodeOutputRef_ControlRef()
     * @model extendedMetaData="kind='attribute' name='controlRef'"
     * @generated
     */
    String getControlRef();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputRef#getControlRef <em>Control Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Control Ref</em>' attribute.
     * @see #getControlRef()
     * @generated
     */
    void setControlRef( String value );

    /**
     * Returns the value of the '<em><b>Control Ref Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UUID of the ControlRef belonging to the current role
     * <!-- end-model-doc -->
     * @return the value of the '<em>Control Ref Uuid</em>' attribute.
     * @see #setControlRefUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLNodeOutputRef_ControlRefUuid()
     * @model extendedMetaData="kind='attribute' name='controlRefUuid'"
     * @generated
     */
    String getControlRefUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputRef#getControlRefUuid <em>Control Ref Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Control Ref Uuid</em>' attribute.
     * @see #getControlRefUuid()
     * @generated
     */
    void setControlRefUuid( String value );

    /**
     * Returns the value of the '<em><b>Refers To Control Ref</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getReferredByLNodeOutputRef <em>Referred By LNode Output Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Control Ref</em>' reference.
     * @see #isSetRefersToControlRef()
     * @see #unsetRefersToControlRef()
     * @see #setRefersToControlRef(ControlRef)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLNodeOutputRef_RefersToControlRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getReferredByLNodeOutputRef
     * @model opposite="ReferredByLNodeOutputRef" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    ControlRef getRefersToControlRef();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputRef#getRefersToControlRef <em>Refers To Control Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Control Ref</em>' reference.
     * @see #isSetRefersToControlRef()
     * @see #unsetRefersToControlRef()
     * @see #getRefersToControlRef()
     * @generated
     */
    void setRefersToControlRef( ControlRef value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputRef#getRefersToControlRef <em>Refers To Control Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToControlRef()
     * @see #getRefersToControlRef()
     * @see #setRefersToControlRef(ControlRef)
     * @generated
     */
    void unsetRefersToControlRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputRef#getRefersToControlRef <em>Refers To Control Ref</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Control Ref</em>' reference is set.
     * @see #unsetRefersToControlRef()
     * @see #getRefersToControlRef()
     * @see #setRefersToControlRef(ControlRef)
     * @generated
     */
    boolean isSetRefersToControlRef();

    /**
     * Returns the value of the '<em><b>Parent Signal Role</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SignalRole#getLNodeOutputRef <em>LNode Output Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Signal Role</em>' container reference.
     * @see #setParentSignalRole(SignalRole)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLNodeOutputRef_ParentSignalRole()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SignalRole#getLNodeOutputRef
     * @model opposite="LNodeOutputRef" unsettable="true" ordered="false"
     * @generated
     */
    SignalRole getParentSignalRole();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputRef#getParentSignalRole <em>Parent Signal Role</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Signal Role</em>' container reference.
     * @see #getParentSignalRole()
     * @generated
     */
    void setParentSignalRole( SignalRole value );

} // LNodeOutputRef
