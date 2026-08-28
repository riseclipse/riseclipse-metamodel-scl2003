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
 * A representation of the model object '<em><b>Function Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of the Function Role element
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getFunctionRoleContent <em>Function Role Content</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getParentApplication <em>Parent Application</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionRole()
 * @model
 * @generated
 */
public interface FunctionRole extends FunctionalVariantRefContainer, AgUuidWithOrigin, AgCardinalityWithSelector {
    /**
     * Returns the value of the '<em><b>Function Role Content</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getParentFunctionRole <em>Parent Function Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * an instance of the current role. In case of application type definition, instance 1 is the default instance
     * <!-- end-model-doc -->
     * @return the value of the '<em>Function Role Content</em>' containment reference list.
     * @see #isSetFunctionRoleContent()
     * @see #unsetFunctionRoleContent()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionRole_FunctionRoleContent()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getParentFunctionRole
     * @model opposite="ParentFunctionRole" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='FunctionRoleContent' namespace='##targetNamespace'"
     * @generated
     */
    EList< FunctionRoleContent > getFunctionRoleContent();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getFunctionRoleContent <em>Function Role Content</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFunctionRoleContent()
     * @see #getFunctionRoleContent()
     * @generated
     */
    void unsetFunctionRoleContent();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getFunctionRoleContent <em>Function Role Content</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Function Role Content</em>' containment reference list is set.
     * @see #unsetFunctionRoleContent()
     * @see #getFunctionRoleContent()
     * @generated
     */
    boolean isSetFunctionRoleContent();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Name of the role
     * <!-- end-model-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionRole_Name()
     * @model extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName( String value );

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Type of the role (Predefined value = EXTERNAL)
     * <!-- end-model-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionRole_Type()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
     *        extendedMetaData="kind='attribute' name='type'"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType( String value );

    /**
     * Returns the value of the '<em><b>Parent Application</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getFunctionRole <em>Function Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Application</em>' container reference.
     * @see #setParentApplication(Application)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionRole_ParentApplication()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getFunctionRole
     * @model opposite="FunctionRole" unsettable="true" ordered="false"
     * @generated
     */
    Application getParentApplication();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getParentApplication <em>Parent Application</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Application</em>' container reference.
     * @see #getParentApplication()
     * @generated
     */
    void setParentApplication( Application value );

} // FunctionRole
