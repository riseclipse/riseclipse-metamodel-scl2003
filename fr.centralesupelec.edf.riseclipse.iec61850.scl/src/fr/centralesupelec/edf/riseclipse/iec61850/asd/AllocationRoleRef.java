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
 * A representation of the model object '<em><b>Allocation Role Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of the AllocationRoleRef element
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRoleRef#getAllocationRole <em>Allocation Role</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRoleRef#getAllocationRoleUuid <em>Allocation Role Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRoleRef#getParentApplication <em>Parent Application</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRoleRef#getRefersToAllocationRole <em>Refers To Allocation Role</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getAllocationRoleRef()
 * @model
 * @generated
 */
public interface AllocationRoleRef extends FunctionalVariantRefContainer {
    /**
     * Returns the value of the '<em><b>Allocation Role</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Path to the allocation role referenced
     * <!-- end-model-doc -->
     * @return the value of the '<em>Allocation Role</em>' attribute.
     * @see #setAllocationRole(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getAllocationRoleRef_AllocationRole()
     * @model extendedMetaData="kind='attribute' name='allocationRole'"
     * @generated
     */
    String getAllocationRole();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRoleRef#getAllocationRole <em>Allocation Role</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Allocation Role</em>' attribute.
     * @see #getAllocationRole()
     * @generated
     */
    void setAllocationRole( String value );

    /**
     * Returns the value of the '<em><b>Allocation Role Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UUID of the allocation role referenced
     * <!-- end-model-doc -->
     * @return the value of the '<em>Allocation Role Uuid</em>' attribute.
     * @see #setAllocationRoleUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getAllocationRoleRef_AllocationRoleUuid()
     * @model extendedMetaData="kind='attribute' name='allocationRoleUuid'"
     * @generated
     */
    String getAllocationRoleUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRoleRef#getAllocationRoleUuid <em>Allocation Role Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Allocation Role Uuid</em>' attribute.
     * @see #getAllocationRoleUuid()
     * @generated
     */
    void setAllocationRoleUuid( String value );

    /**
     * Returns the value of the '<em><b>Parent Application</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getAllocationRoleRef <em>Allocation Role Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Application</em>' container reference.
     * @see #setParentApplication(Application)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getAllocationRoleRef_ParentApplication()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getAllocationRoleRef
     * @model opposite="AllocationRoleRef" unsettable="true" ordered="false"
     * @generated
     */
    Application getParentApplication();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRoleRef#getParentApplication <em>Parent Application</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Application</em>' container reference.
     * @see #getParentApplication()
     * @generated
     */
    void setParentApplication( Application value );

    /**
     * Returns the value of the '<em><b>Refers To Allocation Role</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRole#getReferredByAllocationRoleRef <em>Referred By Allocation Role Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Allocation Role</em>' reference.
     * @see #isSetRefersToAllocationRole()
     * @see #unsetRefersToAllocationRole()
     * @see #setRefersToAllocationRole(AllocationRole)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getAllocationRoleRef_RefersToAllocationRole()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRole#getReferredByAllocationRoleRef
     * @model opposite="ReferredByAllocationRoleRef" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    AllocationRole getRefersToAllocationRole();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRoleRef#getRefersToAllocationRole <em>Refers To Allocation Role</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Allocation Role</em>' reference.
     * @see #isSetRefersToAllocationRole()
     * @see #unsetRefersToAllocationRole()
     * @see #getRefersToAllocationRole()
     * @generated
     */
    void setRefersToAllocationRole( AllocationRole value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRoleRef#getRefersToAllocationRole <em>Refers To Allocation Role</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToAllocationRole()
     * @see #getRefersToAllocationRole()
     * @see #setRefersToAllocationRole(AllocationRole)
     * @generated
     */
    void unsetRefersToAllocationRole();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRoleRef#getRefersToAllocationRole <em>Refers To Allocation Role</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Allocation Role</em>' reference is set.
     * @see #unsetRefersToAllocationRole()
     * @see #getRefersToAllocationRole()
     * @see #setRefersToAllocationRole(AllocationRole)
     * @generated
     */
    boolean isSetRefersToAllocationRole();

} // AllocationRoleRef
