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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.SignalRole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LNode Input Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of the LNodeInputRef element
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputRef#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputRef#getSourceRefUuid <em>Source Ref Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputRef#getRefersToSourceRef <em>Refers To Source Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputRef#getParentSignalRole <em>Parent Signal Role</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLNodeInputRef()
 * @model
 * @generated
 */
public interface LNodeInputRef extends FunctionalVariantRefContainer {
    /**
     * Returns the value of the '<em><b>Source Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Identification of the SourceRef belonging to the current role (reference the input attribute of the SourceRef)
     * <!-- end-model-doc -->
     * @return the value of the '<em>Source Ref</em>' attribute.
     * @see #setSourceRef(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLNodeInputRef_SourceRef()
     * @model extendedMetaData="kind='attribute' name='sourceRef'"
     * @generated
     */
    String getSourceRef();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputRef#getSourceRef <em>Source Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source Ref</em>' attribute.
     * @see #getSourceRef()
     * @generated
     */
    void setSourceRef( String value );

    /**
     * Returns the value of the '<em><b>Source Ref Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UUID of the SourceRef belonging to the current role
     * <!-- end-model-doc -->
     * @return the value of the '<em>Source Ref Uuid</em>' attribute.
     * @see #setSourceRefUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLNodeInputRef_SourceRefUuid()
     * @model extendedMetaData="kind='attribute' name='sourceRefUuid'"
     * @generated
     */
    String getSourceRefUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputRef#getSourceRefUuid <em>Source Ref Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source Ref Uuid</em>' attribute.
     * @see #getSourceRefUuid()
     * @generated
     */
    void setSourceRefUuid( String value );

    /**
     * Returns the value of the '<em><b>Refers To Source Ref</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getReferredByLNodeInputRef <em>Referred By LNode Input Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Source Ref</em>' reference.
     * @see #isSetRefersToSourceRef()
     * @see #unsetRefersToSourceRef()
     * @see #setRefersToSourceRef(SourceRef)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLNodeInputRef_RefersToSourceRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getReferredByLNodeInputRef
     * @model opposite="ReferredByLNodeInputRef" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    SourceRef getRefersToSourceRef();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputRef#getRefersToSourceRef <em>Refers To Source Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Source Ref</em>' reference.
     * @see #isSetRefersToSourceRef()
     * @see #unsetRefersToSourceRef()
     * @see #getRefersToSourceRef()
     * @generated
     */
    void setRefersToSourceRef( SourceRef value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputRef#getRefersToSourceRef <em>Refers To Source Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToSourceRef()
     * @see #getRefersToSourceRef()
     * @see #setRefersToSourceRef(SourceRef)
     * @generated
     */
    void unsetRefersToSourceRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputRef#getRefersToSourceRef <em>Refers To Source Ref</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Source Ref</em>' reference is set.
     * @see #unsetRefersToSourceRef()
     * @see #getRefersToSourceRef()
     * @see #setRefersToSourceRef(SourceRef)
     * @generated
     */
    boolean isSetRefersToSourceRef();

    /**
     * Returns the value of the '<em><b>Parent Signal Role</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SignalRole#getLNodeInputRef <em>LNode Input Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Signal Role</em>' container reference.
     * @see #setParentSignalRole(SignalRole)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLNodeInputRef_ParentSignalRole()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SignalRole#getLNodeInputRef
     * @model opposite="LNodeInputRef"
     * @generated
     */
    SignalRole getParentSignalRole();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputRef#getParentSignalRole <em>Parent Signal Role</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Signal Role</em>' container reference.
     * @see #getParentSignalRole()
     * @generated
     */
    void setParentSignalRole( SignalRole value );

} // LNodeInputRef
