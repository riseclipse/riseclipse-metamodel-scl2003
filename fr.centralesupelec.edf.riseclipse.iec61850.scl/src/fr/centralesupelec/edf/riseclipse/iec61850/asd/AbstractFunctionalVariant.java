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
 * A representation of the model object '<em><b>Abstract Functional Variant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of a functional variant of the Application
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AbstractFunctionalVariant#getFunctionalSubVariant <em>Functional Sub Variant</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AbstractFunctionalVariant#getVariableRef <em>Variable Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AbstractFunctionalVariant#isIsBaseline <em>Is Baseline</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AbstractFunctionalVariant#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AbstractFunctionalVariant#getOriginUuid <em>Origin Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AbstractFunctionalVariant#getTemplateUuid <em>Template Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AbstractFunctionalVariant#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getAbstractFunctionalVariant()
 * @model abstract="true"
 * @generated
 */
public interface AbstractFunctionalVariant extends BaseExtensionElementWithDesc {
    /**
     * Returns the value of the '<em><b>Functional Sub Variant</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalSubVariant}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalSubVariant#getParentAbstractFunctionalVariant <em>Parent Abstract Functional Variant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Sub variant of the current variant
     * <!-- end-model-doc -->
     * @return the value of the '<em>Functional Sub Variant</em>' containment reference list.
     * @see #isSetFunctionalSubVariant()
     * @see #unsetFunctionalSubVariant()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getAbstractFunctionalVariant_FunctionalSubVariant()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalSubVariant#getParentAbstractFunctionalVariant
     * @model opposite="ParentAbstractFunctionalVariant" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='FunctionalSubVariant' namespace='##targetNamespace'"
     * @generated
     */
    EList< FunctionalSubVariant > getFunctionalSubVariant();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AbstractFunctionalVariant#getFunctionalSubVariant <em>Functional Sub Variant</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFunctionalSubVariant()
     * @see #getFunctionalSubVariant()
     * @generated
     */
    void unsetFunctionalSubVariant();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AbstractFunctionalVariant#getFunctionalSubVariant <em>Functional Sub Variant</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Functional Sub Variant</em>' containment reference list is set.
     * @see #unsetFunctionalSubVariant()
     * @see #getFunctionalSubVariant()
     * @generated
     */
    boolean isSetFunctionalSubVariant();

    /**
     * Returns the value of the '<em><b>Variable Ref</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableRef#getParentAbstractFunctionalVariant <em>Parent Abstract Functional Variant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reference to a variable attached to current variant, to parameterize the instance with the value defined in the reference
     * <!-- end-model-doc -->
     * @return the value of the '<em>Variable Ref</em>' containment reference list.
     * @see #isSetVariableRef()
     * @see #unsetVariableRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getAbstractFunctionalVariant_VariableRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableRef#getParentAbstractFunctionalVariant
     * @model opposite="ParentAbstractFunctionalVariant" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='VariableRef' namespace='##targetNamespace'"
     * @generated
     */
    EList< VariableRef > getVariableRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AbstractFunctionalVariant#getVariableRef <em>Variable Ref</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVariableRef()
     * @see #getVariableRef()
     * @generated
     */
    void unsetVariableRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AbstractFunctionalVariant#getVariableRef <em>Variable Ref</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Variable Ref</em>' containment reference list is set.
     * @see #unsetVariableRef()
     * @see #getVariableRef()
     * @generated
     */
    boolean isSetVariableRef();

    /**
     * Returns the value of the '<em><b>Is Baseline</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indication if the functional variant is used as baseline variant used as reference for other variants
     * <!-- end-model-doc -->
     * @return the value of the '<em>Is Baseline</em>' attribute.
     * @see #isSetIsBaseline()
     * @see #unsetIsBaseline()
     * @see #setIsBaseline(boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getAbstractFunctionalVariant_IsBaseline()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='isBaseline'"
     * @generated
     */
    boolean isIsBaseline();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AbstractFunctionalVariant#isIsBaseline <em>Is Baseline</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Baseline</em>' attribute.
     * @see #isSetIsBaseline()
     * @see #unsetIsBaseline()
     * @see #isIsBaseline()
     * @generated
     */
    void setIsBaseline( boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AbstractFunctionalVariant#isIsBaseline <em>Is Baseline</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsBaseline()
     * @see #isIsBaseline()
     * @see #setIsBaseline(boolean)
     * @generated
     */
    void unsetIsBaseline();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AbstractFunctionalVariant#isIsBaseline <em>Is Baseline</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Baseline</em>' attribute is set.
     * @see #unsetIsBaseline()
     * @see #isIsBaseline()
     * @see #setIsBaseline(boolean)
     * @generated
     */
    boolean isSetIsBaseline();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Name of the variant
     * <!-- end-model-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getAbstractFunctionalVariant_Name()
     * @model extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AbstractFunctionalVariant#getName <em>Name</em>}' attribute.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getAbstractFunctionalVariant_OriginUuid()
     * @model extendedMetaData="kind='attribute' name='originUuid'"
     * @generated
     */
    String getOriginUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AbstractFunctionalVariant#getOriginUuid <em>Origin Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Origin Uuid</em>' attribute.
     * @see #getOriginUuid()
     * @generated
     */
    void setOriginUuid( String value );

    /**
     * Returns the value of the '<em><b>Template Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Template Uuid</em>' attribute.
     * @see #setTemplateUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getAbstractFunctionalVariant_TemplateUuid()
     * @model extendedMetaData="kind='attribute' name='templateUuid'"
     * @generated
     */
    String getTemplateUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AbstractFunctionalVariant#getTemplateUuid <em>Template Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Template Uuid</em>' attribute.
     * @see #getTemplateUuid()
     * @generated
     */
    void setTemplateUuid( String value );

    /**
     * Returns the value of the '<em><b>Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Uuid</em>' attribute.
     * @see #setUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getAbstractFunctionalVariant_Uuid()
     * @model extendedMetaData="kind='attribute' name='uuid'"
     * @generated
     */
    String getUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AbstractFunctionalVariant#getUuid <em>Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Uuid</em>' attribute.
     * @see #getUuid()
     * @generated
     */
    void setUuid( String value );

} // AbstractFunctionalVariant
