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
 * A representation of the model object '<em><b>Process Resource Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of the ProcessResourceRef element
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResourceRef#getProcessResource <em>Process Resource</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResourceRef#getProcessResourceUuid <em>Process Resource Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResourceRef#getParentFunctionRoleContent <em>Parent Function Role Content</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResourceRef#getRefersToProcessResource <em>Refers To Process Resource</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getProcessResourceRef()
 * @model extendedMetaData="name='tProcessResourceRef' kind='elementOnly'"
 * @generated
 */
public interface ProcessResourceRef extends FunctionalVariantRefContainer {
    /**
     * Returns the value of the '<em><b>Process Resource</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Path to the process resource referenced
     * <!-- end-model-doc -->
     * @return the value of the '<em>Process Resource</em>' attribute.
     * @see #setProcessResource(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getProcessResourceRef_ProcessResource()
     * @model extendedMetaData="kind='attribute' name='processResource'"
     * @generated
     */
    String getProcessResource();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResourceRef#getProcessResource <em>Process Resource</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Process Resource</em>' attribute.
     * @see #getProcessResource()
     * @generated
     */
    void setProcessResource( String value );

    /**
     * Returns the value of the '<em><b>Process Resource Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UUID of the process resource referenced
     * <!-- end-model-doc -->
     * @return the value of the '<em>Process Resource Uuid</em>' attribute.
     * @see #setProcessResourceUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getProcessResourceRef_ProcessResourceUuid()
     * @model extendedMetaData="kind='attribute' name='processResourceUuid'"
     * @generated
     */
    String getProcessResourceUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResourceRef#getProcessResourceUuid <em>Process Resource Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Process Resource Uuid</em>' attribute.
     * @see #getProcessResourceUuid()
     * @generated
     */
    void setProcessResourceUuid( String value );

    /**
     * Returns the value of the '<em><b>Parent Function Role Content</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getProcessResourceRef <em>Process Resource Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Function Role Content</em>' container reference.
     * @see #setParentFunctionRoleContent(FunctionRoleContent)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getProcessResourceRef_ParentFunctionRoleContent()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getProcessResourceRef
     * @model opposite="processResourceRef" unsettable="true" ordered="false"
     * @generated
     */
    FunctionRoleContent getParentFunctionRoleContent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResourceRef#getParentFunctionRoleContent <em>Parent Function Role Content</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Function Role Content</em>' container reference.
     * @see #getParentFunctionRoleContent()
     * @generated
     */
    void setParentFunctionRoleContent( FunctionRoleContent value );

    /**
     * Returns the value of the '<em><b>Refers To Process Resource</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredByProcessResourceRef <em>Referred By Process Resource Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Process Resource</em>' reference.
     * @see #setRefersToProcessResource(ProcessResource)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getProcessResourceRef_RefersToProcessResource()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredByProcessResourceRef
     * @model opposite="ReferredByProcessResourceRef" transient="true"
     * @generated
     */
    ProcessResource getRefersToProcessResource();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResourceRef#getRefersToProcessResource <em>Refers To Process Resource</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Process Resource</em>' reference.
     * @see #getRefersToProcessResource()
     * @generated
     */
    void setRefersToProcessResource( ProcessResource value );

} // ProcessResourceRef
