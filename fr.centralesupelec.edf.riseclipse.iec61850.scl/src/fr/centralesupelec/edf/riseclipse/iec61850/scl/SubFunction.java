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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction#getConductingEquipment <em>Conducting Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction#getFunction <em>Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction#getGeneralEquipment <em>General Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction#getSubSubFunctions <em>Sub Sub Functions</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSubFunction()
 * @model
 * @generated
 */
public interface SubFunction extends PowerSystemResource {
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSubFunction_Type()
     * @model unsettable="true"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction#getType <em>Type</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(String)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction#getType <em>Type</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Conducting Equipment</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getSubFunction <em>Sub Function</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conducting Equipment</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Conducting Equipment</em>' containment reference list.
     * @see #isSetConductingEquipment()
     * @see #unsetConductingEquipment()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSubFunction_ConductingEquipment()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getSubFunction
     * @model opposite="SubFunction" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList<ConductingEquipment> getConductingEquipment();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction#getConductingEquipment <em>Conducting Equipment</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConductingEquipment()
     * @see #getConductingEquipment()
     * @generated
     */
    void unsetConductingEquipment();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction#getConductingEquipment <em>Conducting Equipment</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Conducting Equipment</em>' containment reference list is set.
     * @see #unsetConductingEquipment()
     * @see #getConductingEquipment()
     * @generated
     */
    boolean isSetConductingEquipment();

    /**
     * Returns the value of the '<em><b>Function</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getSubFunction <em>Sub Function</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Function</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Function</em>' container reference.
     * @see #setFunction(Function)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSubFunction_Function()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getSubFunction
     * @model opposite="SubFunction" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    Function getFunction();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction#getFunction <em>Function</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Function</em>' container reference.
     * @see #getFunction()
     * @generated
     */
    void setFunction( Function value );

    /**
     * Returns the value of the '<em><b>General Equipment</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getSubFunction <em>Sub Function</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>General Equipment</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>General Equipment</em>' containment reference list.
     * @see #isSetGeneralEquipment()
     * @see #unsetGeneralEquipment()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSubFunction_GeneralEquipment()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getSubFunction
     * @model opposite="SubFunction" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList<GeneralEquipment> getGeneralEquipment();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction#getGeneralEquipment <em>General Equipment</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGeneralEquipment()
     * @see #getGeneralEquipment()
     * @generated
     */
    void unsetGeneralEquipment();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction#getGeneralEquipment <em>General Equipment</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>General Equipment</em>' containment reference list is set.
     * @see #unsetGeneralEquipment()
     * @see #getGeneralEquipment()
     * @generated
     */
    boolean isSetGeneralEquipment();

    /**
     * Returns the value of the '<em><b>Sub Sub Functions</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sub Sub Functions</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sub Sub Functions</em>' containment reference list.
     * @see #isSetSubSubFunctions()
     * @see #unsetSubSubFunctions()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSubFunction_SubSubFunctions()
     * @model containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList<SubFunction> getSubSubFunctions();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction#getSubSubFunctions <em>Sub Sub Functions</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSubSubFunctions()
     * @see #getSubSubFunctions()
     * @generated
     */
    void unsetSubSubFunctions();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction#getSubSubFunctions <em>Sub Sub Functions</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sub Sub Functions</em>' containment reference list is set.
     * @see #unsetSubSubFunctions()
     * @see #getSubSubFunctions()
     * @generated
     */
    boolean isSetSubSubFunctions();

} // SubFunction
