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
 * A representation of the model object '<em><b>Tap Changer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TapChanger#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TapChanger#getEqFunction <em>Eq Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TapChanger#getSubEquipment <em>Sub Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TapChanger#getParentTransformerWinding <em>Parent Transformer Winding</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getTapChanger()
 * @model
 * @generated
 */
public interface TapChanger extends PowerSystemResource, AgVirtual {
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getTapChanger_Type()
     * @model unsettable="true"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TapChanger#getType <em>Type</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TapChanger#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(String)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TapChanger#getType <em>Type</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Eq Function</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getParentTapChanger <em>Parent Tap Changer</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Eq Function</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Eq Function</em>' containment reference list.
     * @see #isSetEqFunction()
     * @see #unsetEqFunction()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getTapChanger_EqFunction()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getParentTapChanger
     * @model opposite="ParentTapChanger" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList< EqFunction > getEqFunction();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TapChanger#getEqFunction <em>Eq Function</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEqFunction()
     * @see #getEqFunction()
     * @generated
     */
    void unsetEqFunction();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TapChanger#getEqFunction <em>Eq Function</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Eq Function</em>' containment reference list is set.
     * @see #unsetEqFunction()
     * @see #getEqFunction()
     * @generated
     */
    boolean isSetEqFunction();

    /**
     * Returns the value of the '<em><b>Sub Equipment</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubEquipment}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubEquipment#getParentTapChanger <em>Parent Tap Changer</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sub Equipment</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sub Equipment</em>' containment reference list.
     * @see #isSetSubEquipment()
     * @see #unsetSubEquipment()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getTapChanger_SubEquipment()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SubEquipment#getParentTapChanger
     * @model opposite="ParentTapChanger" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList< SubEquipment > getSubEquipment();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TapChanger#getSubEquipment <em>Sub Equipment</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSubEquipment()
     * @see #getSubEquipment()
     * @generated
     */
    void unsetSubEquipment();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TapChanger#getSubEquipment <em>Sub Equipment</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sub Equipment</em>' containment reference list is set.
     * @see #unsetSubEquipment()
     * @see #getSubEquipment()
     * @generated
     */
    boolean isSetSubEquipment();

    /**
     * Returns the value of the '<em><b>Parent Transformer Winding</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding#getTapChanger <em>Tap Changer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Transformer Winding</em>' container reference.
     * @see #setParentTransformerWinding(TransformerWinding)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getTapChanger_ParentTransformerWinding()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding#getTapChanger
     * @model opposite="TapChanger" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    TransformerWinding getParentTransformerWinding();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TapChanger#getParentTransformerWinding <em>Parent Transformer Winding</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Transformer Winding</em>' container reference.
     * @see #getParentTransformerWinding()
     * @generated
     */
    void setParentTransformerWinding( TransformerWinding value );

} // TapChanger
