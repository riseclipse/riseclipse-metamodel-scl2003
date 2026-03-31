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
 * A representation of the model object '<em><b>Function Role Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *
 * 			Definition of the content of a Function Role
 * 			In case of a content which can be instantiated multiple times when Cardinality is greater than 1, then this content will be instantiated multiple times
 *
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getFunctionRef <em>Function Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getBehaviorDescriptionRef <em>Behavior Description Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getProcessResourceRef <em>Process Resource Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getVariableRef <em>Variable Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getFunctionCategoryRef <em>Function Category Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getPowerSystemRelationRef <em>Power System Relation Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getRoleInst <em>Role Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getParentFunctionRole <em>Parent Function Role</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionRoleContent()
 * @model
 * @generated
 */
public interface FunctionRoleContent extends BaseExtensionElement {
    /**
     * Returns the value of the '<em><b>Function Ref</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRef#getParentFunctionRoleContent <em>Parent Function Role Content</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reference to a function definition attached to current role
     * <!-- end-model-doc -->
     * @return the value of the '<em>Function Ref</em>' containment reference list.
     * @see #isSetFunctionRef()
     * @see #unsetFunctionRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionRoleContent_FunctionRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRef#getParentFunctionRoleContent
     * @model opposite="ParentFunctionRoleContent" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='FunctionRef' namespace='##targetNamespace'"
     * @generated
     */
    EList< FunctionRef > getFunctionRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getFunctionRef <em>Function Ref</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFunctionRef()
     * @see #getFunctionRef()
     * @generated
     */
    void unsetFunctionRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getFunctionRef <em>Function Ref</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Function Ref</em>' containment reference list is set.
     * @see #unsetFunctionRef()
     * @see #getFunctionRef()
     * @generated
     */
    boolean isSetFunctionRef();

    /**
     * Returns the value of the '<em><b>Behavior Description Ref</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescriptionRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescriptionRef#getParentFunctionRoleContent <em>Parent Function Role Content</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reference to a behavior description attached to current role
     * <!-- end-model-doc -->
     * @return the value of the '<em>Behavior Description Ref</em>' containment reference list.
     * @see #isSetBehaviorDescriptionRef()
     * @see #unsetBehaviorDescriptionRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionRoleContent_BehaviorDescriptionRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescriptionRef#getParentFunctionRoleContent
     * @model opposite="ParentFunctionRoleContent" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='BehaviorDescriptionRef' namespace='##targetNamespace'"
     * @generated
     */
    EList< BehaviorDescriptionRef > getBehaviorDescriptionRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getBehaviorDescriptionRef <em>Behavior Description Ref</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBehaviorDescriptionRef()
     * @see #getBehaviorDescriptionRef()
     * @generated
     */
    void unsetBehaviorDescriptionRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getBehaviorDescriptionRef <em>Behavior Description Ref</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Behavior Description Ref</em>' containment reference list is set.
     * @see #unsetBehaviorDescriptionRef()
     * @see #getBehaviorDescriptionRef()
     * @generated
     */
    boolean isSetBehaviorDescriptionRef();

    /**
     * Returns the value of the '<em><b>Process Resource Ref</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResourceRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResourceRef#getParentFunctionRoleContent <em>Parent Function Role Content</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reference to a process resource attached to current role
     * <!-- end-model-doc -->
     * @return the value of the '<em>Process Resource Ref</em>' containment reference list.
     * @see #isSetProcessResourceRef()
     * @see #unsetProcessResourceRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionRoleContent_ProcessResourceRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResourceRef#getParentFunctionRoleContent
     * @model opposite="ParentFunctionRoleContent" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='ProcessResourceRef' namespace='##targetNamespace'"
     * @generated
     */
    EList< ProcessResourceRef > getProcessResourceRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getProcessResourceRef <em>Process Resource Ref</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetProcessResourceRef()
     * @see #getProcessResourceRef()
     * @generated
     */
    void unsetProcessResourceRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getProcessResourceRef <em>Process Resource Ref</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Process Resource Ref</em>' containment reference list is set.
     * @see #unsetProcessResourceRef()
     * @see #getProcessResourceRef()
     * @generated
     */
    boolean isSetProcessResourceRef();

    /**
     * Returns the value of the '<em><b>Variable Ref</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableRef#getParentFunctionRoleContent <em>Parent Function Role Content</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reference to a variable attached to current role
     * <!-- end-model-doc -->
     * @return the value of the '<em>Variable Ref</em>' containment reference list.
     * @see #isSetVariableRef()
     * @see #unsetVariableRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionRoleContent_VariableRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableRef#getParentFunctionRoleContent
     * @model opposite="ParentFunctionRoleContent" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='VariableRef' namespace='##targetNamespace'"
     * @generated
     */
    EList< VariableRef > getVariableRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getVariableRef <em>Variable Ref</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVariableRef()
     * @see #getVariableRef()
     * @generated
     */
    void unsetVariableRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getVariableRef <em>Variable Ref</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Variable Ref</em>' containment reference list is set.
     * @see #unsetVariableRef()
     * @see #getVariableRef()
     * @generated
     */
    boolean isSetVariableRef();

    /**
     * Returns the value of the '<em><b>Function Category Ref</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategoryRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategoryRef#getParentFunctionRoleContent <em>Parent Function Role Content</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reference to a function category attached to current role
     * <!-- end-model-doc -->
     * @return the value of the '<em>Function Category Ref</em>' containment reference list.
     * @see #isSetFunctionCategoryRef()
     * @see #unsetFunctionCategoryRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionRoleContent_FunctionCategoryRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategoryRef#getParentFunctionRoleContent
     * @model opposite="ParentFunctionRoleContent" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='FunctionCategoryRef' namespace='##targetNamespace'"
     * @generated
     */
    EList< FunctionCategoryRef > getFunctionCategoryRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getFunctionCategoryRef <em>Function Category Ref</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFunctionCategoryRef()
     * @see #getFunctionCategoryRef()
     * @generated
     */
    void unsetFunctionCategoryRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getFunctionCategoryRef <em>Function Category Ref</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Function Category Ref</em>' containment reference list is set.
     * @see #unsetFunctionCategoryRef()
     * @see #getFunctionCategoryRef()
     * @generated
     */
    boolean isSetFunctionCategoryRef();

    /**
     * Returns the value of the '<em><b>Power System Relation Ref</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelationRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelationRef#getParentFunctionRoleContent <em>Parent Function Role Content</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reference to a power system relation attached to current role
     * <!-- end-model-doc -->
     * @return the value of the '<em>Power System Relation Ref</em>' containment reference list.
     * @see #isSetPowerSystemRelationRef()
     * @see #unsetPowerSystemRelationRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionRoleContent_PowerSystemRelationRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelationRef#getParentFunctionRoleContent
     * @model opposite="ParentFunctionRoleContent" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='PowerSystemRelationRef' namespace='##targetNamespace'"
     * @generated
     */
    EList< PowerSystemRelationRef > getPowerSystemRelationRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getPowerSystemRelationRef <em>Power System Relation Ref</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPowerSystemRelationRef()
     * @see #getPowerSystemRelationRef()
     * @generated
     */
    void unsetPowerSystemRelationRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getPowerSystemRelationRef <em>Power System Relation Ref</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Power System Relation Ref</em>' containment reference list is set.
     * @see #unsetPowerSystemRelationRef()
     * @see #getPowerSystemRelationRef()
     * @generated
     */
    boolean isSetPowerSystemRelationRef();

    /**
     * Returns the value of the '<em><b>Role Inst</b></em>' attribute.
     * The default value is <code>"1"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Instance of the role
     * <!-- end-model-doc -->
     * @return the value of the '<em>Role Inst</em>' attribute.
     * @see #isSetRoleInst()
     * @see #unsetRoleInst()
     * @see #setRoleInst(int)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionRoleContent_RoleInst()
     * @model default="1" unsettable="true"
     *        extendedMetaData="kind='attribute' name='roleInst'"
     * @generated
     */
    int getRoleInst();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getRoleInst <em>Role Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Role Inst</em>' attribute.
     * @see #isSetRoleInst()
     * @see #unsetRoleInst()
     * @see #getRoleInst()
     * @generated
     */
    void setRoleInst( int value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getRoleInst <em>Role Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRoleInst()
     * @see #getRoleInst()
     * @see #setRoleInst(int)
     * @generated
     */
    void unsetRoleInst();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getRoleInst <em>Role Inst</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Role Inst</em>' attribute is set.
     * @see #unsetRoleInst()
     * @see #getRoleInst()
     * @see #setRoleInst(int)
     * @generated
     */
    boolean isSetRoleInst();

    /**
     * Returns the value of the '<em><b>Parent Function Role</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getFunctionRoleContent <em>Function Role Content</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Function Role</em>' container reference.
     * @see #setParentFunctionRole(FunctionRole)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionRoleContent_ParentFunctionRole()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getFunctionRoleContent
     * @model opposite="FunctionRoleContent" unsettable="true" ordered="false"
     * @generated
     */
    FunctionRole getParentFunctionRole();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getParentFunctionRole <em>Parent Function Role</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Function Role</em>' container reference.
     * @see #getParentFunctionRole()
     * @generated
     */
    void setParentFunctionRole( FunctionRole value );

} // FunctionRoleContent
