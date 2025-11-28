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
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of the Application element
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getFunctionRole <em>Function Role</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getFunctionalVariant <em>Functional Variant</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getFunctionalVariantGroup <em>Functional Variant Group</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getAllocationRoleRef <em>Allocation Role Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getApplicationSclRef <em>Application Scl Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getOriginUuid <em>Origin Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getTemplateUuid <em>Template Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getApplication()
 * @model extendedMetaData="name='Application' kind='elementOnly'"
 * @generated
 */
public interface Application extends BaseExtensionElementWithDesc {
    /**
     * Returns the value of the '<em><b>Function Role</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getParentApplication <em>Parent Application</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Role attached to the application type
     * <!-- end-model-doc -->
     * @return the value of the '<em>Function Role</em>' containment reference list.
     * @see #isSetFunctionRole()
     * @see #unsetFunctionRole()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getApplication_FunctionRole()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getParentApplication
     * @model opposite="ParentApplication" containment="true" unsettable="true" required="true" ordered="false"
     *        extendedMetaData="kind='element' name='FunctionRole' namespace='##targetNamespace'"
     * @generated
     */
    EList< FunctionRole > getFunctionRole();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getFunctionRole <em>Function Role</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFunctionRole()
     * @see #getFunctionRole()
     * @generated
     */
    void unsetFunctionRole();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getFunctionRole <em>Function Role</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Function Role</em>' containment reference list is set.
     * @see #unsetFunctionRole()
     * @see #getFunctionRole()
     * @generated
     */
    boolean isSetFunctionRole();

    /**
     * Returns the value of the '<em><b>Functional Variant</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariant}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariant#getParentApplication <em>Parent Application</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Variant attached to the application type
     * <!-- end-model-doc -->
     * @return the value of the '<em>Functional Variant</em>' containment reference list.
     * @see #isSetFunctionalVariant()
     * @see #unsetFunctionalVariant()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getApplication_FunctionalVariant()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariant#getParentApplication
     * @model opposite="ParentApplication" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='FunctionalVariant' namespace='##targetNamespace'"
     * @generated
     */
    EList< FunctionalVariant > getFunctionalVariant();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getFunctionalVariant <em>Functional Variant</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFunctionalVariant()
     * @see #getFunctionalVariant()
     * @generated
     */
    void unsetFunctionalVariant();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getFunctionalVariant <em>Functional Variant</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Functional Variant</em>' containment reference list is set.
     * @see #unsetFunctionalVariant()
     * @see #getFunctionalVariant()
     * @generated
     */
    boolean isSetFunctionalVariant();

    /**
     * Returns the value of the '<em><b>Functional Variant Group</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantGroup}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantGroup#getParentApplication <em>Parent Application</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Group of variants attached to the application type
     * <!-- end-model-doc -->
     * @return the value of the '<em>Functional Variant Group</em>' containment reference list.
     * @see #isSetFunctionalVariantGroup()
     * @see #unsetFunctionalVariantGroup()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getApplication_FunctionalVariantGroup()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantGroup#getParentApplication
     * @model opposite="ParentApplication" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='FunctionalVariantGroup' namespace='##targetNamespace'"
     * @generated
     */
    EList< FunctionalVariantGroup > getFunctionalVariantGroup();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getFunctionalVariantGroup <em>Functional Variant Group</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFunctionalVariantGroup()
     * @see #getFunctionalVariantGroup()
     * @generated
     */
    void unsetFunctionalVariantGroup();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getFunctionalVariantGroup <em>Functional Variant Group</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Functional Variant Group</em>' containment reference list is set.
     * @see #unsetFunctionalVariantGroup()
     * @see #getFunctionalVariantGroup()
     * @generated
     */
    boolean isSetFunctionalVariantGroup();

    /**
     * Returns the value of the '<em><b>Allocation Role Ref</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRoleRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRoleRef#getParentApplication <em>Parent Application</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Allocation role attached to the application type
     * <!-- end-model-doc -->
     * @return the value of the '<em>Allocation Role Ref</em>' containment reference list.
     * @see #isSetAllocationRoleRef()
     * @see #unsetAllocationRoleRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getApplication_AllocationRoleRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRoleRef#getParentApplication
     * @model opposite="ParentApplication" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='AllocationRoleRef' namespace='##targetNamespace'"
     * @generated
     */
    EList< AllocationRoleRef > getAllocationRoleRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getAllocationRoleRef <em>Allocation Role Ref</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAllocationRoleRef()
     * @see #getAllocationRoleRef()
     * @generated
     */
    void unsetAllocationRoleRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getAllocationRoleRef <em>Allocation Role Ref</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Allocation Role Ref</em>' containment reference list is set.
     * @see #unsetAllocationRoleRef()
     * @see #getAllocationRoleRef()
     * @generated
     */
    boolean isSetAllocationRoleRef();

    /**
     * Returns the value of the '<em><b>Application Scl Ref</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ApplicationSclRef#getParentApplication <em>Parent Application</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reference to the ASD files used to create an Application
     * <!-- end-model-doc -->
     * @return the value of the '<em>Application Scl Ref</em>' containment reference.
     * @see #isSetApplicationSclRef()
     * @see #unsetApplicationSclRef()
     * @see #setApplicationSclRef(ApplicationSclRef)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getApplication_ApplicationSclRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ApplicationSclRef#getParentApplication
     * @model opposite="ParentApplication" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='ApplicationSclRef' namespace='##targetNamespace'"
     * @generated
     */
    ApplicationSclRef getApplicationSclRef();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getApplicationSclRef <em>Application Scl Ref</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Application Scl Ref</em>' containment reference.
     * @see #isSetApplicationSclRef()
     * @see #unsetApplicationSclRef()
     * @see #getApplicationSclRef()
     * @generated
     */
    void setApplicationSclRef( ApplicationSclRef value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getApplicationSclRef <em>Application Scl Ref</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetApplicationSclRef()
     * @see #getApplicationSclRef()
     * @see #setApplicationSclRef(ApplicationSclRef)
     * @generated
     */
    void unsetApplicationSclRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getApplicationSclRef <em>Application Scl Ref</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Application Scl Ref</em>' containment reference is set.
     * @see #unsetApplicationSclRef()
     * @see #getApplicationSclRef()
     * @see #setApplicationSclRef(ApplicationSclRef)
     * @generated
     */
    boolean isSetApplicationSclRef();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Name of the application
     * <!-- end-model-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getApplication_Name()
     * @model required="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getName <em>Name</em>}' attribute.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getApplication_OriginUuid()
     * @model extendedMetaData="kind='attribute' name='originUuid'"
     * @generated
     */
    String getOriginUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getOriginUuid <em>Origin Uuid</em>}' attribute.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getApplication_TemplateUuid()
     * @model extendedMetaData="kind='attribute' name='templateUuid'"
     * @generated
     */
    String getTemplateUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getTemplateUuid <em>Template Uuid</em>}' attribute.
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
     * Identification of the application type if any
     * <!-- end-model-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getApplication_Type()
     * @model extendedMetaData="kind='attribute' name='type'"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getType <em>Type</em>}' attribute.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getApplication_Uuid()
     * @model extendedMetaData="kind='attribute' name='uuid'"
     * @generated
     */
    String getUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getUuid <em>Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Uuid</em>' attribute.
     * @see #getUuid()
     * @generated
     */
    void setUuid( String value );

} // Application
