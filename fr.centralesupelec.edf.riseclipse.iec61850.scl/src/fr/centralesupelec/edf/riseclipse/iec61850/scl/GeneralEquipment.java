/*
*************************************************************************
**  Copyright (c) 2016-2021 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
**
**  This file is part of the RiseClipse tool
**
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      https://riseclipse.github.io/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.iec61850.scl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Equipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getParentAbstractEqFuncSubFunc <em>Parent Abstract Eq Func Sub Func</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getEqFunction <em>Eq Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getParentEquipmentContainer <em>Parent Equipment Container</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getParentFunction <em>Parent Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getParentGeneralEquipmentContainer <em>Parent General Equipment Container</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getParentSubFunction <em>Parent Sub Function</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGeneralEquipment()
 * @model
 * @generated
 */
public interface GeneralEquipment extends Equipment {
    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGeneralEquipment_Type()
     * @model unsettable="true"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     * @generated
     */
    void setType( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(String)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getType <em>Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type</em>' attribute is set.
     * @see #unsetType()
     * @see #getType()
     * @see #setType(String)
     * @generated
     */
    boolean isSetType();

    /**
     * Returns the value of the '<em><b>Parent Abstract Eq Func Sub Func</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractEqFuncSubFunc#getSubGeneralEquipment <em>Sub General Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Abstract Eq Func Sub Func</em>' container reference.
     * @see #setParentAbstractEqFuncSubFunc(AbstractEqFuncSubFunc)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGeneralEquipment_ParentAbstractEqFuncSubFunc()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractEqFuncSubFunc#getSubGeneralEquipment
     * @model opposite="SubGeneralEquipment" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    AbstractEqFuncSubFunc getParentAbstractEqFuncSubFunc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getParentAbstractEqFuncSubFunc <em>Parent Abstract Eq Func Sub Func</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Abstract Eq Func Sub Func</em>' container reference.
     * @see #getParentAbstractEqFuncSubFunc()
     * @generated
     */
    void setParentAbstractEqFuncSubFunc( AbstractEqFuncSubFunc value );

    /**
     * Returns the value of the '<em><b>Eq Function</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getParentGeneralEquipment <em>Parent General Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Eq Function</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Eq Function</em>' containment reference list.
     * @see #isSetEqFunction()
     * @see #unsetEqFunction()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGeneralEquipment_EqFunction()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getParentGeneralEquipment
     * @model opposite="ParentGeneralEquipment" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='##targetNamespace' kind='element'"
     * @generated
     */
    EList< EqFunction > getEqFunction();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getEqFunction <em>Eq Function</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEqFunction()
     * @see #getEqFunction()
     * @generated
     */
    void unsetEqFunction();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getEqFunction <em>Eq Function</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Eq Function</em>' containment reference list is set.
     * @see #unsetEqFunction()
     * @see #getEqFunction()
     * @generated
     */
    boolean isSetEqFunction();

    /**
     * Returns the value of the '<em><b>Parent Equipment Container</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EquipmentContainer#getGeneralEquipment <em>General Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Equipment Container</em>' container reference.
     * @see #setParentEquipmentContainer(EquipmentContainer)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGeneralEquipment_ParentEquipmentContainer()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.EquipmentContainer#getGeneralEquipment
     * @model opposite="GeneralEquipment" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    EquipmentContainer getParentEquipmentContainer();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getParentEquipmentContainer <em>Parent Equipment Container</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Equipment Container</em>' container reference.
     * @see #getParentEquipmentContainer()
     * @generated
     */
    void setParentEquipmentContainer( EquipmentContainer value );

    /**
     * Returns the value of the '<em><b>Parent Function</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getGeneralEquipment <em>General Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Function</em>' container reference.
     * @see #setParentFunction(Function)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGeneralEquipment_ParentFunction()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getGeneralEquipment
     * @model opposite="GeneralEquipment" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    Function getParentFunction();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getParentFunction <em>Parent Function</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Function</em>' container reference.
     * @see #getParentFunction()
     * @generated
     */
    void setParentFunction( Function value );

    /**
     * Returns the value of the '<em><b>Parent General Equipment Container</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipmentContainer#getGeneralEquipment <em>General Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent General Equipment Container</em>' container reference.
     * @see #setParentGeneralEquipmentContainer(GeneralEquipmentContainer)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGeneralEquipment_ParentGeneralEquipmentContainer()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipmentContainer#getGeneralEquipment
     * @model opposite="GeneralEquipment" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    GeneralEquipmentContainer getParentGeneralEquipmentContainer();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getParentGeneralEquipmentContainer <em>Parent General Equipment Container</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent General Equipment Container</em>' container reference.
     * @see #getParentGeneralEquipmentContainer()
     * @generated
     */
    void setParentGeneralEquipmentContainer( GeneralEquipmentContainer value );

    /**
     * Returns the value of the '<em><b>Parent Sub Function</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction#getGeneralEquipment <em>General Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Sub Function</em>' container reference.
     * @see #setParentSubFunction(SubFunction)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGeneralEquipment_ParentSubFunction()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction#getGeneralEquipment
     * @model opposite="GeneralEquipment" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    SubFunction getParentSubFunction();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getParentSubFunction <em>Parent Sub Function</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Sub Function</em>' container reference.
     * @see #getParentSubFunction()
     * @generated
     */
    void setParentSubFunction( SubFunction value );

} // GeneralEquipment
