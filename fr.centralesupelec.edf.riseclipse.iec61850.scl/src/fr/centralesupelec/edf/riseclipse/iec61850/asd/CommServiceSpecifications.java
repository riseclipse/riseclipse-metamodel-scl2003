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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comm Service Specifications</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of the list of Communication Service Specification
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CommServiceSpecifications#getGooseParameters <em>Goose Parameters</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CommServiceSpecifications#getSMVParameters <em>SMV Parameters</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CommServiceSpecifications#getReportParameters <em>Report Parameters</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getCommServiceSpecifications()
 * @model extendedMetaData="name='CommServiceSpecifications' kind='elementOnly'"
 * @generated
 */
public interface CommServiceSpecifications extends BaseExtensionElementWithDesc {
    /**
     * Returns the value of the '<em><b>Goose Parameters</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getParentCommServiceSpecifications <em>Parent Comm Service Specifications</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Goose Parameters</em>' containment reference list.
     * @see #isSetGooseParameters()
     * @see #unsetGooseParameters()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getCommServiceSpecifications_GooseParameters()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getParentCommServiceSpecifications
     * @model opposite="ParentCommServiceSpecifications" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='GooseParameters' namespace='##targetNamespace'"
     * @generated
     */
    EList< GooseParameters > getGooseParameters();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CommServiceSpecifications#getGooseParameters <em>Goose Parameters</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGooseParameters()
     * @see #getGooseParameters()
     * @generated
     */
    void unsetGooseParameters();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CommServiceSpecifications#getGooseParameters <em>Goose Parameters</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Goose Parameters</em>' containment reference list is set.
     * @see #unsetGooseParameters()
     * @see #getGooseParameters()
     * @generated
     */
    boolean isSetGooseParameters();

    /**
     * Returns the value of the '<em><b>SMV Parameters</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getParentCommServiceSpecifications <em>Parent Comm Service Specifications</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>SMV Parameters</em>' containment reference list.
     * @see #isSetSMVParameters()
     * @see #unsetSMVParameters()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getCommServiceSpecifications_SMVParameters()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getParentCommServiceSpecifications
     * @model opposite="ParentCommServiceSpecifications" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='SMVParameters' namespace='##targetNamespace'"
     * @generated
     */
    EList< SMVParameters > getSMVParameters();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CommServiceSpecifications#getSMVParameters <em>SMV Parameters</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSMVParameters()
     * @see #getSMVParameters()
     * @generated
     */
    void unsetSMVParameters();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CommServiceSpecifications#getSMVParameters <em>SMV Parameters</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>SMV Parameters</em>' containment reference list is set.
     * @see #unsetSMVParameters()
     * @see #getSMVParameters()
     * @generated
     */
    boolean isSetSMVParameters();

    /**
     * Returns the value of the '<em><b>Report Parameters</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters#getParentCommServiceSpecifications <em>Parent Comm Service Specifications</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Report Parameters</em>' containment reference list.
     * @see #isSetReportParameters()
     * @see #unsetReportParameters()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getCommServiceSpecifications_ReportParameters()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters#getParentCommServiceSpecifications
     * @model opposite="ParentCommServiceSpecifications" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='ReportParameters' namespace='##targetNamespace'"
     * @generated
     */
    EList< ReportParameters > getReportParameters();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CommServiceSpecifications#getReportParameters <em>Report Parameters</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReportParameters()
     * @see #getReportParameters()
     * @generated
     */
    void unsetReportParameters();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CommServiceSpecifications#getReportParameters <em>Report Parameters</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Report Parameters</em>' containment reference list is set.
     * @see #unsetReportParameters()
     * @see #getReportParameters()
     * @generated
     */
    boolean isSetReportParameters();

} // CommServiceSpecifications
