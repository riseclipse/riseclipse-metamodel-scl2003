/**
 *  Copyright (c) 2018 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
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
 *      http://wdi.supelec.fr/software/RiseClipse/
 */
package fr.centralesupelec.edf.riseclipse.iec61850.scl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformer Winding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding#getEqFunction <em>Eq Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding#getNeutralPoint <em>Neutral Point</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding#getPowerTransformer <em>Power Transformer</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding#getTapChanger <em>Tap Changer</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getTransformerWinding()
 * @model
 * @generated
 */
public interface TransformerWinding extends AbstractConductingEquipment {
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getTransformerWinding_Type()
     * @model unsettable="true"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding#getType <em>Type</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(String)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding#getType <em>Type</em>}' attribute is set.
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
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getTransformerWinding <em>Transformer Winding</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Eq Function</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Eq Function</em>' containment reference list.
     * @see #isSetEqFunction()
     * @see #unsetEqFunction()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getTransformerWinding_EqFunction()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getTransformerWinding
     * @model opposite="TransformerWinding" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList<EqFunction> getEqFunction();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding#getEqFunction <em>Eq Function</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEqFunction()
     * @see #getEqFunction()
     * @generated
     */
    void unsetEqFunction();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding#getEqFunction <em>Eq Function</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Eq Function</em>' containment reference list is set.
     * @see #unsetEqFunction()
     * @see #getEqFunction()
     * @generated
     */
    boolean isSetEqFunction();

    /**
     * Returns the value of the '<em><b>Neutral Point</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.NeutralPoint#getTransformerWinding <em>Transformer Winding</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Neutral Point</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Neutral Point</em>' containment reference.
     * @see #isSetNeutralPoint()
     * @see #unsetNeutralPoint()
     * @see #setNeutralPoint(NeutralPoint)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getTransformerWinding_NeutralPoint()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.NeutralPoint#getTransformerWinding
     * @model opposite="TransformerWinding" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    NeutralPoint getNeutralPoint();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding#getNeutralPoint <em>Neutral Point</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Neutral Point</em>' containment reference.
     * @see #isSetNeutralPoint()
     * @see #unsetNeutralPoint()
     * @see #getNeutralPoint()
     * @generated
     */
    void setNeutralPoint( NeutralPoint value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding#getNeutralPoint <em>Neutral Point</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNeutralPoint()
     * @see #getNeutralPoint()
     * @see #setNeutralPoint(NeutralPoint)
     * @generated
     */
    void unsetNeutralPoint();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding#getNeutralPoint <em>Neutral Point</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Neutral Point</em>' containment reference is set.
     * @see #unsetNeutralPoint()
     * @see #getNeutralPoint()
     * @see #setNeutralPoint(NeutralPoint)
     * @generated
     */
    boolean isSetNeutralPoint();

    /**
     * Returns the value of the '<em><b>Power Transformer</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.PowerTransformer#getTransformerWinding <em>Transformer Winding</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Power Transformer</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Power Transformer</em>' container reference.
     * @see #setPowerTransformer(PowerTransformer)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getTransformerWinding_PowerTransformer()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.PowerTransformer#getTransformerWinding
     * @model opposite="TransformerWinding" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    PowerTransformer getPowerTransformer();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding#getPowerTransformer <em>Power Transformer</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Power Transformer</em>' container reference.
     * @see #getPowerTransformer()
     * @generated
     */
    void setPowerTransformer( PowerTransformer value );

    /**
     * Returns the value of the '<em><b>Tap Changer</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TapChanger#getTransformerWinding <em>Transformer Winding</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tap Changer</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tap Changer</em>' containment reference.
     * @see #isSetTapChanger()
     * @see #unsetTapChanger()
     * @see #setTapChanger(TapChanger)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getTransformerWinding_TapChanger()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.TapChanger#getTransformerWinding
     * @model opposite="TransformerWinding" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    TapChanger getTapChanger();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding#getTapChanger <em>Tap Changer</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tap Changer</em>' containment reference.
     * @see #isSetTapChanger()
     * @see #unsetTapChanger()
     * @see #getTapChanger()
     * @generated
     */
    void setTapChanger( TapChanger value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding#getTapChanger <em>Tap Changer</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTapChanger()
     * @see #getTapChanger()
     * @see #setTapChanger(TapChanger)
     * @generated
     */
    void unsetTapChanger();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding#getTapChanger <em>Tap Changer</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tap Changer</em>' containment reference is set.
     * @see #unsetTapChanger()
     * @see #getTapChanger()
     * @see #setTapChanger(TapChanger)
     * @generated
     */
    boolean isSetTapChanger();

} // TransformerWinding
