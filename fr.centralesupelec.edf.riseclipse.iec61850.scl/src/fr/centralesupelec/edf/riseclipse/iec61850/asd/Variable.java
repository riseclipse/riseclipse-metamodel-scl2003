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
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of a Variable
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Variable#getVariableApplyTo <em>Variable Apply To</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Variable#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Variable#getOriginUuid <em>Origin Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Variable#getTemplateUuid <em>Template Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Variable#getUuid <em>Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Variable#getValue <em>Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Variable#getReferredByVariableRef <em>Referred By Variable Ref</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getVariable()
 * @model extendedMetaData="name='Variable' kind='elementOnly'"
 * @generated
 */
public interface Variable extends BaseExtensionElementWithDesc {
    /**
     * Returns the value of the '<em><b>Variable Apply To</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo#getParentVariable <em>Parent Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Variable Apply To</em>' containment reference list.
     * @see #isSetVariableApplyTo()
     * @see #unsetVariableApplyTo()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getVariable_VariableApplyTo()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo#getParentVariable
     * @model opposite="ParentVariable" containment="true" unsettable="true" required="true" ordered="false"
     *        extendedMetaData="kind='element' name='VariableApplyTo' namespace='##targetNamespace'"
     * @generated
     */
    EList< VariableApplyTo > getVariableApplyTo();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Variable#getVariableApplyTo <em>Variable Apply To</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVariableApplyTo()
     * @see #getVariableApplyTo()
     * @generated
     */
    void unsetVariableApplyTo();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Variable#getVariableApplyTo <em>Variable Apply To</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Variable Apply To</em>' containment reference list is set.
     * @see #unsetVariableApplyTo()
     * @see #getVariableApplyTo()
     * @generated
     */
    boolean isSetVariableApplyTo();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Name of the variable used to identify it
     * <!-- end-model-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getVariable_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString" required="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Variable#getName <em>Name</em>}' attribute.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getVariable_OriginUuid()
     * @model extendedMetaData="kind='attribute' name='originUuid'"
     * @generated
     */
    String getOriginUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Variable#getOriginUuid <em>Origin Uuid</em>}' attribute.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getVariable_TemplateUuid()
     * @model extendedMetaData="kind='attribute' name='templateUuid'"
     * @generated
     */
    String getTemplateUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Variable#getTemplateUuid <em>Template Uuid</em>}' attribute.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getVariable_Uuid()
     * @model extendedMetaData="kind='attribute' name='uuid'"
     * @generated
     */
    String getUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Variable#getUuid <em>Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Uuid</em>' attribute.
     * @see #getUuid()
     * @generated
     */
    void setUuid( String value );

    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Value to be used for the variable
     * <!-- end-model-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getVariable_Value()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
     *        extendedMetaData="kind='attribute' name='value'"
     * @generated
     */
    String getValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Variable#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue( String value );

    /**
     * Returns the value of the '<em><b>Referred By Variable Ref</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableRef#getRefersToVariable <em>Refers To Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Variable Ref</em>' reference list.
     * @see #isSetReferredByVariableRef()
     * @see #unsetReferredByVariableRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getVariable_ReferredByVariableRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableRef#getRefersToVariable
     * @model opposite="RefersToVariable" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< VariableRef > getReferredByVariableRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Variable#getReferredByVariableRef <em>Referred By Variable Ref</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByVariableRef()
     * @see #getReferredByVariableRef()
     * @generated
     */
    void unsetReferredByVariableRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Variable#getReferredByVariableRef <em>Referred By Variable Ref</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Variable Ref</em>' reference list is set.
     * @see #unsetReferredByVariableRef()
     * @see #getReferredByVariableRef()
     * @generated
     */
    boolean isSetReferredByVariableRef();

} // Variable
