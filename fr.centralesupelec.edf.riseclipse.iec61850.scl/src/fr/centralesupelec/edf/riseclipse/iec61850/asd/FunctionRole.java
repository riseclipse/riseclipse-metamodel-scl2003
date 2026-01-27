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
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getMax <em>Max</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getOriginUuid <em>Origin Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getSelector <em>Selector</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getTemplateUuid <em>Template Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getUuid <em>Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getParentApplication <em>Parent Application</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionRole()
 * @model
 * @generated
 */
public interface FunctionRole extends FunctionalVariantRefContainer {
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
     * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
     * The default value is <code>"1..1"</code>.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CardinalityEnum}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * This attribute indicates the multiple instances allowed for the current element.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Cardinality</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.CardinalityEnum
     * @see #isSetCardinality()
     * @see #unsetCardinality()
     * @see #setCardinality(CardinalityEnum)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionRole_Cardinality()
     * @model default="1..1" unsettable="true"
     *        extendedMetaData="kind='attribute' name='cardinality'"
     * @generated
     */
    CardinalityEnum getCardinality();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getCardinality <em>Cardinality</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cardinality</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.CardinalityEnum
     * @see #isSetCardinality()
     * @see #unsetCardinality()
     * @see #getCardinality()
     * @generated
     */
    void setCardinality( CardinalityEnum value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getCardinality <em>Cardinality</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCardinality()
     * @see #getCardinality()
     * @see #setCardinality(CardinalityEnum)
     * @generated
     */
    void unsetCardinality();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getCardinality <em>Cardinality</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cardinality</em>' attribute is set.
     * @see #unsetCardinality()
     * @see #getCardinality()
     * @see #setCardinality(CardinalityEnum)
     * @generated
     */
    boolean isSetCardinality();

    /**
     * Returns the value of the '<em><b>Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * This attribute indicates the maximum number of an element in case of cardinality allowing multiple instances. If not defined, there is no limit
     * <!-- end-model-doc -->
     * @return the value of the '<em>Max</em>' attribute.
     * @see #setMax(int)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionRole_Max()
     * @model extendedMetaData="kind='attribute' name='max'"
     * @generated
     */
    int getMax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getMax <em>Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max</em>' attribute.
     * @see #getMax()
     * @generated
     */
    void setMax( int value );

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
     * Returns the value of the '<em><b>Origin Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Origin Uuid</em>' attribute.
     * @see #setOriginUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionRole_OriginUuid()
     * @model extendedMetaData="kind='attribute' name='originUuid'"
     * @generated
     */
    String getOriginUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getOriginUuid <em>Origin Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Origin Uuid</em>' attribute.
     * @see #getOriginUuid()
     * @generated
     */
    void setOriginUuid( String value );

    /**
     * Returns the value of the '<em><b>Selector</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Selector is used to give a searching rule to help user to select a target. It is represented by an XPath
     * <!-- end-model-doc -->
     * @return the value of the '<em>Selector</em>' attribute.
     * @see #setSelector(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionRole_Selector()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
     *        extendedMetaData="kind='attribute' name='selector'"
     * @generated
     */
    String getSelector();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getSelector <em>Selector</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Selector</em>' attribute.
     * @see #getSelector()
     * @generated
     */
    void setSelector( String value );

    /**
     * Returns the value of the '<em><b>Template Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Template Uuid</em>' attribute.
     * @see #setTemplateUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionRole_TemplateUuid()
     * @model extendedMetaData="kind='attribute' name='templateUuid'"
     * @generated
     */
    String getTemplateUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getTemplateUuid <em>Template Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Template Uuid</em>' attribute.
     * @see #getTemplateUuid()
     * @generated
     */
    void setTemplateUuid( String value );

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
     * Returns the value of the '<em><b>Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Uuid</em>' attribute.
     * @see #setUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionRole_Uuid()
     * @model extendedMetaData="kind='attribute' name='uuid'"
     * @generated
     */
    String getUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getUuid <em>Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Uuid</em>' attribute.
     * @see #getUuid()
     * @generated
     */
    void setUuid( String value );

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
