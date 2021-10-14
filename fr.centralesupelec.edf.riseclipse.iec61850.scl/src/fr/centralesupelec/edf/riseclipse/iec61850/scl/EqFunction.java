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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eq Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getParentConductingEquipment <em>Parent Conducting Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getParentGeneralEquipment <em>Parent General Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getParentPowerTransformer <em>Parent Power Transformer</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getParentSubEquipment <em>Parent Sub Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getParentTransformerWinding <em>Parent Transformer Winding</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getParentTapChanger <em>Parent Tap Changer</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getEqFunction()
 * @model
 * @generated
 */
public interface EqFunction extends AbstractEqFuncSubFunc {
    /**
     * Returns the value of the '<em><b>Parent Conducting Equipment</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getEqFunction <em>Eq Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Conducting Equipment</em>' container reference.
     * @see #setParentConductingEquipment(ConductingEquipment)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getEqFunction_ParentConductingEquipment()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getEqFunction
     * @model opposite="EqFunction" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    ConductingEquipment getParentConductingEquipment();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getParentConductingEquipment <em>Parent Conducting Equipment</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Conducting Equipment</em>' container reference.
     * @see #getParentConductingEquipment()
     * @generated
     */
    void setParentConductingEquipment( ConductingEquipment value );

    /**
     * Returns the value of the '<em><b>Parent General Equipment</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getEqFunction <em>Eq Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent General Equipment</em>' container reference.
     * @see #setParentGeneralEquipment(GeneralEquipment)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getEqFunction_ParentGeneralEquipment()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getEqFunction
     * @model opposite="EqFunction" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    GeneralEquipment getParentGeneralEquipment();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getParentGeneralEquipment <em>Parent General Equipment</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent General Equipment</em>' container reference.
     * @see #getParentGeneralEquipment()
     * @generated
     */
    void setParentGeneralEquipment( GeneralEquipment value );

    /**
     * Returns the value of the '<em><b>Parent Power Transformer</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.PowerTransformer#getEqFunction <em>Eq Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Power Transformer</em>' container reference.
     * @see #setParentPowerTransformer(PowerTransformer)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getEqFunction_ParentPowerTransformer()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.PowerTransformer#getEqFunction
     * @model opposite="EqFunction" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    PowerTransformer getParentPowerTransformer();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getParentPowerTransformer <em>Parent Power Transformer</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Power Transformer</em>' container reference.
     * @see #getParentPowerTransformer()
     * @generated
     */
    void setParentPowerTransformer( PowerTransformer value );

    /**
     * Returns the value of the '<em><b>Parent Sub Equipment</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubEquipment#getEqFunction <em>Eq Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Sub Equipment</em>' container reference.
     * @see #setParentSubEquipment(SubEquipment)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getEqFunction_ParentSubEquipment()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SubEquipment#getEqFunction
     * @model opposite="EqFunction" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    SubEquipment getParentSubEquipment();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getParentSubEquipment <em>Parent Sub Equipment</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Sub Equipment</em>' container reference.
     * @see #getParentSubEquipment()
     * @generated
     */
    void setParentSubEquipment( SubEquipment value );

    /**
     * Returns the value of the '<em><b>Parent Transformer Winding</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding#getEqFunction <em>Eq Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Transformer Winding</em>' container reference.
     * @see #setParentTransformerWinding(TransformerWinding)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getEqFunction_ParentTransformerWinding()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding#getEqFunction
     * @model opposite="EqFunction" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    TransformerWinding getParentTransformerWinding();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getParentTransformerWinding <em>Parent Transformer Winding</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Transformer Winding</em>' container reference.
     * @see #getParentTransformerWinding()
     * @generated
     */
    void setParentTransformerWinding( TransformerWinding value );

    /**
     * Returns the value of the '<em><b>Parent Tap Changer</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TapChanger#getEqFunction <em>Eq Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Tap Changer</em>' container reference.
     * @see #setParentTapChanger(TapChanger)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getEqFunction_ParentTapChanger()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.TapChanger#getEqFunction
     * @model opposite="EqFunction" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    TapChanger getParentTapChanger();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getParentTapChanger <em>Parent Tap Changer</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Tap Changer</em>' container reference.
     * @see #getParentTapChanger()
     * @generated
     */
    void setParentTapChanger( TapChanger value );

} // EqFunction
