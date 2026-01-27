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
package fr.centralesupelec.edf.riseclipse.iec61850.asd;

import org.eclipse.emf.common.util.EList;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Function Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubFunctionTemplate#getGeneralEquipment <em>General Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubFunctionTemplate#getConductingEquipment <em>Conducting Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubFunctionTemplate#getSubFunctionTemplate <em>Sub Function Template</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubFunctionTemplate#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubFunctionTemplate#getParentFunctionTemplate <em>Parent Function Template</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubFunctionTemplate#getParentSubFunctionTemplate <em>Parent Sub Function Template</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSubFunctionTemplate()
 * @model extendedMetaData="name='tSubFunctionTemplate' kind='elementOnly'"
 * @generated
 */
public interface SubFunctionTemplate extends Abstract6100LNodeContainer {
    /**
     * Returns the value of the '<em><b>General Equipment</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getParentSubFunctionTemplate <em>Parent Sub Function Template</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>General Equipment</em>' containment reference list.
     * @see #isSetGeneralEquipment()
     * @see #unsetGeneralEquipment()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSubFunctionTemplate_GeneralEquipment()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getParentSubFunctionTemplate
     * @model opposite="ParentSubFunctionTemplate" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='GeneralEquipment' namespace='##targetNamespace'"
     * @generated
     */
    EList< GeneralEquipment > getGeneralEquipment();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubFunctionTemplate#getGeneralEquipment <em>General Equipment</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGeneralEquipment()
     * @see #getGeneralEquipment()
     * @generated
     */
    void unsetGeneralEquipment();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubFunctionTemplate#getGeneralEquipment <em>General Equipment</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>General Equipment</em>' containment reference list is set.
     * @see #unsetGeneralEquipment()
     * @see #getGeneralEquipment()
     * @generated
     */
    boolean isSetGeneralEquipment();

    /**
     * Returns the value of the '<em><b>Conducting Equipment</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getParentSubFunctionTemplate <em>Parent Sub Function Template</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Conducting Equipment</em>' containment reference list.
     * @see #isSetConductingEquipment()
     * @see #unsetConductingEquipment()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSubFunctionTemplate_ConductingEquipment()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getParentSubFunctionTemplate
     * @model opposite="ParentSubFunctionTemplate" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='ConductingEquipment' namespace='##targetNamespace'"
     * @generated
     */
    EList< ConductingEquipment > getConductingEquipment();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubFunctionTemplate#getConductingEquipment <em>Conducting Equipment</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConductingEquipment()
     * @see #getConductingEquipment()
     * @generated
     */
    void unsetConductingEquipment();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubFunctionTemplate#getConductingEquipment <em>Conducting Equipment</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Conducting Equipment</em>' containment reference list is set.
     * @see #unsetConductingEquipment()
     * @see #getConductingEquipment()
     * @generated
     */
    boolean isSetConductingEquipment();

    /**
     * Returns the value of the '<em><b>Sub Function Template</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubFunctionTemplate}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubFunctionTemplate#getParentSubFunctionTemplate <em>Parent Sub Function Template</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sub Function Template</em>' containment reference list.
     * @see #isSetSubFunctionTemplate()
     * @see #unsetSubFunctionTemplate()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSubFunctionTemplate_SubFunctionTemplate()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SubFunctionTemplate#getParentSubFunctionTemplate
     * @model opposite="ParentSubFunctionTemplate" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='SubFunctionTemplate' namespace='##targetNamespace'"
     * @generated
     */
    EList< SubFunctionTemplate > getSubFunctionTemplate();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubFunctionTemplate#getSubFunctionTemplate <em>Sub Function Template</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSubFunctionTemplate()
     * @see #getSubFunctionTemplate()
     * @generated
     */
    void unsetSubFunctionTemplate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubFunctionTemplate#getSubFunctionTemplate <em>Sub Function Template</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sub Function Template</em>' containment reference list is set.
     * @see #unsetSubFunctionTemplate()
     * @see #getSubFunctionTemplate()
     * @generated
     */
    boolean isSetSubFunctionTemplate();

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSubFunctionTemplate_Type()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
     *        extendedMetaData="kind='attribute' name='type'"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubFunctionTemplate#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType( String value );

    /**
     * Returns the value of the '<em><b>Parent Function Template</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionTemplate#getSubFunctionTemplate <em>Sub Function Template</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Function Template</em>' container reference.
     * @see #setParentFunctionTemplate(FunctionTemplate)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSubFunctionTemplate_ParentFunctionTemplate()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionTemplate#getSubFunctionTemplate
     * @model opposite="SubFunctionTemplate" unsettable="true" ordered="false"
     * @generated
     */
    FunctionTemplate getParentFunctionTemplate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubFunctionTemplate#getParentFunctionTemplate <em>Parent Function Template</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Function Template</em>' container reference.
     * @see #getParentFunctionTemplate()
     * @generated
     */
    void setParentFunctionTemplate( FunctionTemplate value );

    /**
     * Returns the value of the '<em><b>Parent Sub Function Template</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubFunctionTemplate#getSubFunctionTemplate <em>Sub Function Template</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Sub Function Template</em>' container reference.
     * @see #setParentSubFunctionTemplate(SubFunctionTemplate)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSubFunctionTemplate_ParentSubFunctionTemplate()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SubFunctionTemplate#getSubFunctionTemplate
     * @model opposite="SubFunctionTemplate" unsettable="true" ordered="false"
     * @generated
     */
    SubFunctionTemplate getParentSubFunctionTemplate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubFunctionTemplate#getParentSubFunctionTemplate <em>Parent Sub Function Template</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Sub Function Template</em>' container reference.
     * @see #getParentSubFunctionTemplate()
     * @generated
     */
    void setParentSubFunctionTemplate( SubFunctionTemplate value );

} // SubFunctionTemplate
