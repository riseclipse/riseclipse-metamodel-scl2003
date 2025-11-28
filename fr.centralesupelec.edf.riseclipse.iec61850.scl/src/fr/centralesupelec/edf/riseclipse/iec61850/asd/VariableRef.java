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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of the VariableRef element
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableRef#getValue <em>Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableRef#getVariable <em>Variable</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableRef#getVariableUuid <em>Variable Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableRef#getParentAbstractFunctionalVariant <em>Parent Abstract Functional Variant</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableRef#getParentFunctionRoleContent <em>Parent Function Role Content</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableRef#getRefersToVariable <em>Refers To Variable</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getVariableRef()
 * @model extendedMetaData="name='tVariableRef' kind='elementOnly'"
 * @generated
 */
public interface VariableRef extends FunctionalVariantRefContainer {
    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Value to be used for the variable when current reference is used
     * <!-- end-model-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getVariableRef_Value()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
     *        extendedMetaData="kind='attribute' name='value'"
     * @generated
     */
    String getValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableRef#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue( String value );

    /**
     * Returns the value of the '<em><b>Variable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Path to the variable referenced
     * <!-- end-model-doc -->
     * @return the value of the '<em>Variable</em>' attribute.
     * @see #setVariable(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getVariableRef_Variable()
     * @model extendedMetaData="kind='attribute' name='variable'"
     * @generated
     */
    String getVariable();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableRef#getVariable <em>Variable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Variable</em>' attribute.
     * @see #getVariable()
     * @generated
     */
    void setVariable( String value );

    /**
     * Returns the value of the '<em><b>Variable Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Variable Uuid</em>' attribute.
     * @see #setVariableUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getVariableRef_VariableUuid()
     * @model
     * @generated
     */
    String getVariableUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableRef#getVariableUuid <em>Variable Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Variable Uuid</em>' attribute.
     * @see #getVariableUuid()
     * @generated
     */
    void setVariableUuid( String value );

    /**
     * Returns the value of the '<em><b>Parent Abstract Functional Variant</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AbstractFunctionalVariant#getVariableRef <em>Variable Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Abstract Functional Variant</em>' container reference.
     * @see #setParentAbstractFunctionalVariant(AbstractFunctionalVariant)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getVariableRef_ParentAbstractFunctionalVariant()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AbstractFunctionalVariant#getVariableRef
     * @model opposite="variableRef" unsettable="true" ordered="false"
     * @generated
     */
    AbstractFunctionalVariant getParentAbstractFunctionalVariant();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableRef#getParentAbstractFunctionalVariant <em>Parent Abstract Functional Variant</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Abstract Functional Variant</em>' container reference.
     * @see #getParentAbstractFunctionalVariant()
     * @generated
     */
    void setParentAbstractFunctionalVariant( AbstractFunctionalVariant value );

    /**
     * Returns the value of the '<em><b>Parent Function Role Content</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getVariableRef <em>Variable Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Function Role Content</em>' container reference.
     * @see #setParentFunctionRoleContent(FunctionRoleContent)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getVariableRef_ParentFunctionRoleContent()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getVariableRef
     * @model opposite="variableRef" unsettable="true" ordered="false"
     * @generated
     */
    FunctionRoleContent getParentFunctionRoleContent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableRef#getParentFunctionRoleContent <em>Parent Function Role Content</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Function Role Content</em>' container reference.
     * @see #getParentFunctionRoleContent()
     * @generated
     */
    void setParentFunctionRoleContent( FunctionRoleContent value );

    /**
     * Returns the value of the '<em><b>Refers To Variable</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Variable#getReferredByVariableRef <em>Referred By Variable Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Variable</em>' reference.
     * @see #isSetRefersToVariable()
     * @see #unsetRefersToVariable()
     * @see #setRefersToVariable(Variable)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getVariableRef_RefersToVariable()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Variable#getReferredByVariableRef
     * @model opposite="ReferredByVariableRef" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    Variable getRefersToVariable();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableRef#getRefersToVariable <em>Refers To Variable</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Variable</em>' reference.
     * @see #isSetRefersToVariable()
     * @see #unsetRefersToVariable()
     * @see #getRefersToVariable()
     * @generated
     */
    void setRefersToVariable( Variable value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableRef#getRefersToVariable <em>Refers To Variable</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToVariable()
     * @see #getRefersToVariable()
     * @see #setRefersToVariable(Variable)
     * @generated
     */
    void unsetRefersToVariable();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableRef#getRefersToVariable <em>Refers To Variable</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Variable</em>' reference is set.
     * @see #unsetRefersToVariable()
     * @see #getRefersToVariable()
     * @see #setRefersToVariable(Variable)
     * @generated
     */
    boolean isSetRefersToVariable();

} // VariableRef
