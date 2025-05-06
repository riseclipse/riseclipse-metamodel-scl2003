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
 * A representation of the model object '<em><b>Abstract Eq Func Sub Func</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractEqFuncSubFunc#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractEqFuncSubFunc#getEqSubFunction <em>Eq Sub Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractEqFuncSubFunc#getSubGeneralEquipment <em>Sub General Equipment</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAbstractEqFuncSubFunc()
 * @model
 * @generated
 */
public interface AbstractEqFuncSubFunc extends PowerSystemResource {
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAbstractEqFuncSubFunc_Type()
     * @model unsettable="true"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractEqFuncSubFunc#getType <em>Type</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractEqFuncSubFunc#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(String)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractEqFuncSubFunc#getType <em>Type</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Eq Sub Function</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqSubFunction}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqSubFunction#getParentAbstractEqFuncSubFunc <em>Parent Abstract Eq Func Sub Func</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Eq Sub Function</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Eq Sub Function</em>' containment reference list.
     * @see #isSetEqSubFunction()
     * @see #unsetEqSubFunction()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAbstractEqFuncSubFunc_EqSubFunction()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.EqSubFunction#getParentAbstractEqFuncSubFunc
     * @model opposite="ParentAbstractEqFuncSubFunc" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='##targetNamespace' kind='element'"
     * @generated
     */
    EList< EqSubFunction > getEqSubFunction();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractEqFuncSubFunc#getEqSubFunction <em>Eq Sub Function</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEqSubFunction()
     * @see #getEqSubFunction()
     * @generated
     */
    void unsetEqSubFunction();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractEqFuncSubFunc#getEqSubFunction <em>Eq Sub Function</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Eq Sub Function</em>' containment reference list is set.
     * @see #unsetEqSubFunction()
     * @see #getEqSubFunction()
     * @generated
     */
    boolean isSetEqSubFunction();

    /**
     * Returns the value of the '<em><b>Sub General Equipment</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getParentAbstractEqFuncSubFunc <em>Parent Abstract Eq Func Sub Func</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sub General Equipment</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sub General Equipment</em>' containment reference list.
     * @see #isSetSubGeneralEquipment()
     * @see #unsetSubGeneralEquipment()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAbstractEqFuncSubFunc_SubGeneralEquipment()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getParentAbstractEqFuncSubFunc
     * @model opposite="ParentAbstractEqFuncSubFunc" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='##targetNamespace' kind='element'"
     * @generated
     */
    EList< GeneralEquipment > getSubGeneralEquipment();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractEqFuncSubFunc#getSubGeneralEquipment <em>Sub General Equipment</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSubGeneralEquipment()
     * @see #getSubGeneralEquipment()
     * @generated
     */
    void unsetSubGeneralEquipment();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractEqFuncSubFunc#getSubGeneralEquipment <em>Sub General Equipment</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sub General Equipment</em>' containment reference list is set.
     * @see #unsetSubGeneralEquipment()
     * @see #getSubGeneralEquipment()
     * @generated
     */
    boolean isSetSubGeneralEquipment();

} // AbstractEqFuncSubFunc
