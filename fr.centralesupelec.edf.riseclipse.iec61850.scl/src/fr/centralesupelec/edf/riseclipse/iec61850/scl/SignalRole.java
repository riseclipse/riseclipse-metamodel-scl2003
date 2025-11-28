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
package fr.centralesupelec.edf.riseclipse.iec61850.scl;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRefContainer;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeDataRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputRef;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SignalRole#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SignalRole#getOriginUuid <em>Origin Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SignalRole#getParentFunctionRef <em>Parent Function Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SignalRole#getLNodeInputRef <em>LNode Input Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SignalRole#getLNodeOutputRef <em>LNode Output Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SignalRole#getLNodeDataRef <em>LNode Data Ref</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSignalRole()
 * @model
 * @generated
 */
public interface SignalRole extends FunctionalVariantRefContainer {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #setName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSignalRole_Name()
     * @model unsettable="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SignalRole#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #getName()
     * @generated
     */
    void setName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SignalRole#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    void unsetName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SignalRole#getName <em>Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Name</em>' attribute is set.
     * @see #unsetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    boolean isSetName();

    /**
     * Returns the value of the '<em><b>Origin Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Origin Uuid</em>' attribute.
     * @see #isSetOriginUuid()
     * @see #unsetOriginUuid()
     * @see #setOriginUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSignalRole_OriginUuid()
     * @model unsettable="true"
     * @generated
     */
    String getOriginUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SignalRole#getOriginUuid <em>Origin Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Origin Uuid</em>' attribute.
     * @see #isSetOriginUuid()
     * @see #unsetOriginUuid()
     * @see #getOriginUuid()
     * @generated
     */
    void setOriginUuid( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SignalRole#getOriginUuid <em>Origin Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOriginUuid()
     * @see #getOriginUuid()
     * @see #setOriginUuid(String)
     * @generated
     */
    void unsetOriginUuid();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SignalRole#getOriginUuid <em>Origin Uuid</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Origin Uuid</em>' attribute is set.
     * @see #unsetOriginUuid()
     * @see #getOriginUuid()
     * @see #setOriginUuid(String)
     * @generated
     */
    boolean isSetOriginUuid();

    /**
     * Returns the value of the '<em><b>Parent Function Ref</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRef#getSignalRole <em>Signal Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Function Ref</em>' container reference.
     * @see #setParentFunctionRef(FunctionRef)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSignalRole_ParentFunctionRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRef#getSignalRole
     * @model opposite="signalRole" unsettable="true" ordered="false"
     * @generated
     */
    FunctionRef getParentFunctionRef();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SignalRole#getParentFunctionRef <em>Parent Function Ref</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Function Ref</em>' container reference.
     * @see #getParentFunctionRef()
     * @generated
     */
    void setParentFunctionRef( FunctionRef value );

    /**
     * Returns the value of the '<em><b>LNode Input Ref</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputRef#getParentSignalRole <em>Parent Signal Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>LNode Input Ref</em>' containment reference list.
     * @see #isSetLNodeInputRef()
     * @see #unsetLNodeInputRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSignalRole_LNodeInputRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputRef#getParentSignalRole
     * @model opposite="ParentSignalRole" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList< LNodeInputRef > getLNodeInputRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SignalRole#getLNodeInputRef <em>LNode Input Ref</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLNodeInputRef()
     * @see #getLNodeInputRef()
     * @generated
     */
    void unsetLNodeInputRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SignalRole#getLNodeInputRef <em>LNode Input Ref</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>LNode Input Ref</em>' containment reference list is set.
     * @see #unsetLNodeInputRef()
     * @see #getLNodeInputRef()
     * @generated
     */
    boolean isSetLNodeInputRef();

    /**
     * Returns the value of the '<em><b>LNode Output Ref</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputRef#getParentSignalRole <em>Parent Signal Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>LNode Output Ref</em>' containment reference list.
     * @see #isSetLNodeOutputRef()
     * @see #unsetLNodeOutputRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSignalRole_LNodeOutputRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputRef#getParentSignalRole
     * @model opposite="ParentSignalRole" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList< LNodeOutputRef > getLNodeOutputRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SignalRole#getLNodeOutputRef <em>LNode Output Ref</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLNodeOutputRef()
     * @see #getLNodeOutputRef()
     * @generated
     */
    void unsetLNodeOutputRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SignalRole#getLNodeOutputRef <em>LNode Output Ref</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>LNode Output Ref</em>' containment reference list is set.
     * @see #unsetLNodeOutputRef()
     * @see #getLNodeOutputRef()
     * @generated
     */
    boolean isSetLNodeOutputRef();

    /**
     * Returns the value of the '<em><b>LNode Data Ref</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeDataRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeDataRef#getParentSignalRole <em>Parent Signal Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>LNode Data Ref</em>' containment reference list.
     * @see #isSetLNodeDataRef()
     * @see #unsetLNodeDataRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSignalRole_LNodeDataRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeDataRef#getParentSignalRole
     * @model opposite="ParentSignalRole" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList< LNodeDataRef > getLNodeDataRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SignalRole#getLNodeDataRef <em>LNode Data Ref</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLNodeDataRef()
     * @see #getLNodeDataRef()
     * @generated
     */
    void unsetLNodeDataRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SignalRole#getLNodeDataRef <em>LNode Data Ref</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>LNode Data Ref</em>' containment reference list is set.
     * @see #unsetLNodeDataRef()
     * @see #getLNodeDataRef()
     * @generated
     */
    boolean isSetLNodeDataRef();

} // SignalRole
