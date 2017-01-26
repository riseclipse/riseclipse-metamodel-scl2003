/**
 *  Copyright (c) 2017 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.iec61850.scl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eq Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getConductingEquipment <em>Conducting Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getGeneralEquipment <em>General Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getPowerTransformer <em>Power Transformer</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getSubEquipment <em>Sub Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getTransformerWinding <em>Transformer Winding</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getTapChanger <em>Tap Changer</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getEqFunction()
 * @model
 * @generated
 */
public interface EqFunction extends AbstractEqFuncSubFunc {
    /**
     * Returns the value of the '<em><b>Conducting Equipment</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getEqFunction <em>Eq Function</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conducting Equipment</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Conducting Equipment</em>' container reference.
     * @see #setConductingEquipment(ConductingEquipment)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getEqFunction_ConductingEquipment()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getEqFunction
     * @model opposite="EqFunction" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    ConductingEquipment getConductingEquipment();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getConductingEquipment <em>Conducting Equipment</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Conducting Equipment</em>' container reference.
     * @see #getConductingEquipment()
     * @generated
     */
    void setConductingEquipment( ConductingEquipment value );

    /**
     * Returns the value of the '<em><b>General Equipment</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getEqFunction <em>Eq Function</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>General Equipment</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>General Equipment</em>' container reference.
     * @see #setGeneralEquipment(GeneralEquipment)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getEqFunction_GeneralEquipment()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getEqFunction
     * @model opposite="EqFunction" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    GeneralEquipment getGeneralEquipment();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getGeneralEquipment <em>General Equipment</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>General Equipment</em>' container reference.
     * @see #getGeneralEquipment()
     * @generated
     */
    void setGeneralEquipment( GeneralEquipment value );

    /**
     * Returns the value of the '<em><b>Power Transformer</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.PowerTransformer#getEqFunction <em>Eq Function</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Power Transformer</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Power Transformer</em>' container reference.
     * @see #setPowerTransformer(PowerTransformer)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getEqFunction_PowerTransformer()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.PowerTransformer#getEqFunction
     * @model opposite="EqFunction" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    PowerTransformer getPowerTransformer();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getPowerTransformer <em>Power Transformer</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Power Transformer</em>' container reference.
     * @see #getPowerTransformer()
     * @generated
     */
    void setPowerTransformer( PowerTransformer value );

    /**
     * Returns the value of the '<em><b>Sub Equipment</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubEquipment#getEqFunction <em>Eq Function</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sub Equipment</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sub Equipment</em>' container reference.
     * @see #setSubEquipment(SubEquipment)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getEqFunction_SubEquipment()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SubEquipment#getEqFunction
     * @model opposite="EqFunction" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    SubEquipment getSubEquipment();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getSubEquipment <em>Sub Equipment</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sub Equipment</em>' container reference.
     * @see #getSubEquipment()
     * @generated
     */
    void setSubEquipment( SubEquipment value );

    /**
     * Returns the value of the '<em><b>Transformer Winding</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding#getEqFunction <em>Eq Function</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transformer Winding</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Transformer Winding</em>' container reference.
     * @see #setTransformerWinding(TransformerWinding)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getEqFunction_TransformerWinding()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding#getEqFunction
     * @model opposite="EqFunction" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    TransformerWinding getTransformerWinding();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getTransformerWinding <em>Transformer Winding</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transformer Winding</em>' container reference.
     * @see #getTransformerWinding()
     * @generated
     */
    void setTransformerWinding( TransformerWinding value );

    /**
     * Returns the value of the '<em><b>Tap Changer</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TapChanger#getEqFunction <em>Eq Function</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tap Changer</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tap Changer</em>' container reference.
     * @see #setTapChanger(TapChanger)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getEqFunction_TapChanger()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.TapChanger#getEqFunction
     * @model opposite="EqFunction" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    TapChanger getTapChanger();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getTapChanger <em>Tap Changer</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tap Changer</em>' container reference.
     * @see #getTapChanger()
     * @generated
     */
    void setTapChanger( TapChanger value );

} // EqFunction
