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
 * A representation of the model object '<em><b>Conducting Equipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getBay <em>Bay</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getFunction <em>Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getSubFunction <em>Sub Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getEqFunction <em>Eq Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getLine <em>Line</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getProcess <em>Process</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getConductingEquipment()
 * @model
 * @generated
 */
public interface ConductingEquipment extends AbstractConductingEquipment {
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getConductingEquipment_Type()
     * @model unsettable="true"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getType <em>Type</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(String)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getType <em>Type</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Bay</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay#getConductingEquipment <em>Conducting Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bay</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Bay</em>' container reference.
     * @see #setBay(Bay)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getConductingEquipment_Bay()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay#getConductingEquipment
     * @model opposite="ConductingEquipment" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    Bay getBay();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getBay <em>Bay</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bay</em>' container reference.
     * @see #getBay()
     * @generated
     */
    void setBay( Bay value );

    /**
     * Returns the value of the '<em><b>Function</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getConductingEquipment <em>Conducting Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Function</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Function</em>' container reference.
     * @see #setFunction(Function)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getConductingEquipment_Function()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getConductingEquipment
     * @model opposite="ConductingEquipment" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    Function getFunction();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getFunction <em>Function</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Function</em>' container reference.
     * @see #getFunction()
     * @generated
     */
    void setFunction( Function value );

    /**
     * Returns the value of the '<em><b>Sub Function</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction#getConductingEquipment <em>Conducting Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sub Function</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sub Function</em>' container reference.
     * @see #setSubFunction(SubFunction)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getConductingEquipment_SubFunction()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction#getConductingEquipment
     * @model opposite="ConductingEquipment" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    SubFunction getSubFunction();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getSubFunction <em>Sub Function</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sub Function</em>' container reference.
     * @see #getSubFunction()
     * @generated
     */
    void setSubFunction( SubFunction value );

    /**
     * Returns the value of the '<em><b>Eq Function</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getConductingEquipment <em>Conducting Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Eq Function</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Eq Function</em>' containment reference list.
     * @see #isSetEqFunction()
     * @see #unsetEqFunction()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getConductingEquipment_EqFunction()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getConductingEquipment
     * @model opposite="ConductingEquipment" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList<EqFunction> getEqFunction();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getEqFunction <em>Eq Function</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEqFunction()
     * @see #getEqFunction()
     * @generated
     */
    void unsetEqFunction();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getEqFunction <em>Eq Function</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Eq Function</em>' containment reference list is set.
     * @see #unsetEqFunction()
     * @see #getEqFunction()
     * @generated
     */
    boolean isSetEqFunction();

    /**
     * Returns the value of the '<em><b>Line</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getConductingEquipment <em>Conducting Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Line</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Line</em>' container reference.
     * @see #setLine(Line)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getConductingEquipment_Line()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getConductingEquipment
     * @model opposite="ConductingEquipment" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    Line getLine();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getLine <em>Line</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Line</em>' container reference.
     * @see #getLine()
     * @generated
     */
    void setLine( Line value );

    /**
     * Returns the value of the '<em><b>Process</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getConductingEquipment <em>Conducting Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Process</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Process</em>' container reference.
     * @see #setProcess(fr.centralesupelec.edf.riseclipse.iec61850.scl.Process)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getConductingEquipment_Process()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getConductingEquipment
     * @model opposite="ConductingEquipment" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    fr.centralesupelec.edf.riseclipse.iec61850.scl.Process getProcess();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getProcess <em>Process</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Process</em>' container reference.
     * @see #getProcess()
     * @generated
     */
    void setProcess( fr.centralesupelec.edf.riseclipse.iec61850.scl.Process value );

} // ConductingEquipment
