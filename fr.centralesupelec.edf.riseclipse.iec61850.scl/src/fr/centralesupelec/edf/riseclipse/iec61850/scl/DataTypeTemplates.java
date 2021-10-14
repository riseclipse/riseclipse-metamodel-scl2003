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
 * A representation of the model object '<em><b>Data Type Templates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates#getDAType <em>DA Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates#getDOType <em>DO Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates#getEnumType <em>Enum Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates#getLNodeType <em>LNode Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates#getParentSCL <em>Parent SCL</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDataTypeTemplates()
 * @model
 * @generated
 */
public interface DataTypeTemplates extends SclObject {
    /**
     * Returns the value of the '<em><b>DA Type</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getParentDataTypeTemplates <em>Parent Data Type Templates</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DA Type</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DA Type</em>' containment reference list.
     * @see #isSetDAType()
     * @see #unsetDAType()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDataTypeTemplates_DAType()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getParentDataTypeTemplates
     * @model opposite="ParentDataTypeTemplates" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList< DAType > getDAType();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates#getDAType <em>DA Type</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDAType()
     * @see #getDAType()
     * @generated
     */
    void unsetDAType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates#getDAType <em>DA Type</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>DA Type</em>' containment reference list is set.
     * @see #unsetDAType()
     * @see #getDAType()
     * @generated
     */
    boolean isSetDAType();

    /**
     * Returns the value of the '<em><b>DO Type</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getParentDataTypeTemplates <em>Parent Data Type Templates</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DO Type</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DO Type</em>' containment reference list.
     * @see #isSetDOType()
     * @see #unsetDOType()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDataTypeTemplates_DOType()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getParentDataTypeTemplates
     * @model opposite="ParentDataTypeTemplates" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList< DOType > getDOType();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates#getDOType <em>DO Type</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDOType()
     * @see #getDOType()
     * @generated
     */
    void unsetDOType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates#getDOType <em>DO Type</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>DO Type</em>' containment reference list is set.
     * @see #unsetDOType()
     * @see #getDOType()
     * @generated
     */
    boolean isSetDOType();

    /**
     * Returns the value of the '<em><b>Enum Type</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumType}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumType#getParentDataTypeTemplates <em>Parent Data Type Templates</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Enum Type</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Enum Type</em>' containment reference list.
     * @see #isSetEnumType()
     * @see #unsetEnumType()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDataTypeTemplates_EnumType()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumType#getParentDataTypeTemplates
     * @model opposite="ParentDataTypeTemplates" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList< EnumType > getEnumType();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates#getEnumType <em>Enum Type</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnumType()
     * @see #getEnumType()
     * @generated
     */
    void unsetEnumType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates#getEnumType <em>Enum Type</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Enum Type</em>' containment reference list is set.
     * @see #unsetEnumType()
     * @see #getEnumType()
     * @generated
     */
    boolean isSetEnumType();

    /**
     * Returns the value of the '<em><b>LNode Type</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType#getParentDataTypeTemplates <em>Parent Data Type Templates</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>LNode Type</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>LNode Type</em>' containment reference list.
     * @see #isSetLNodeType()
     * @see #unsetLNodeType()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDataTypeTemplates_LNodeType()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType#getParentDataTypeTemplates
     * @model opposite="ParentDataTypeTemplates" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList< LNodeType > getLNodeType();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates#getLNodeType <em>LNode Type</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLNodeType()
     * @see #getLNodeType()
     * @generated
     */
    void unsetLNodeType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates#getLNodeType <em>LNode Type</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>LNode Type</em>' containment reference list is set.
     * @see #unsetLNodeType()
     * @see #getLNodeType()
     * @generated
     */
    boolean isSetLNodeType();

    /**
     * Returns the value of the '<em><b>Parent SCL</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getDataTypeTemplates <em>Data Type Templates</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent SCL</em>' container reference.
     * @see #setParentSCL(SCL)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDataTypeTemplates_ParentSCL()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getDataTypeTemplates
     * @model opposite="DataTypeTemplates" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    SCL getParentSCL();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates#getParentSCL <em>Parent SCL</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent SCL</em>' container reference.
     * @see #getParentSCL()
     * @generated
     */
    void setParentSCL( SCL value );

} // DataTypeTemplates
