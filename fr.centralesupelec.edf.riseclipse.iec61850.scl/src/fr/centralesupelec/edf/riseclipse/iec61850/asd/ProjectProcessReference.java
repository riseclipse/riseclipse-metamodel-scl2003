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
 * A representation of the model object '<em><b>Project Process Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reference to another behavior description, used when a vendor is describing his implementation of a specific specification.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProjectProcessReference#getProcessReference <em>Process Reference</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProjectProcessReference#getProcessUuid <em>Process Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProjectProcessReference#getParentProject <em>Parent Project</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getProjectProcessReference()
 * @model extendedMetaData="name='tProjectProcessReference' kind='elementOnly'"
 * @generated
 */
public interface ProjectProcessReference extends BaseExtensionElementWithDesc {
    /**
     * Returns the value of the '<em><b>Process Reference</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * path to an element in the process belonging to this project
     * <!-- end-model-doc -->
     * @return the value of the '<em>Process Reference</em>' attribute.
     * @see #setProcessReference(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getProjectProcessReference_ProcessReference()
     * @model extendedMetaData="kind='attribute' name='processReference'"
     * @generated
     */
    String getProcessReference();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProjectProcessReference#getProcessReference <em>Process Reference</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Process Reference</em>' attribute.
     * @see #getProcessReference()
     * @generated
     */
    void setProcessReference( String value );

    /**
     * Returns the value of the '<em><b>Process Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UUID of an element in the process belonging to this project
     * <!-- end-model-doc -->
     * @return the value of the '<em>Process Uuid</em>' attribute.
     * @see #setProcessUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getProjectProcessReference_ProcessUuid()
     * @model extendedMetaData="kind='attribute' name='processUuid'"
     * @generated
     */
    String getProcessUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProjectProcessReference#getProcessUuid <em>Process Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Process Uuid</em>' attribute.
     * @see #getProcessUuid()
     * @generated
     */
    void setProcessUuid( String value );

    /**
     * Returns the value of the '<em><b>Parent Project</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Project#getProjectProcessReference <em>Project Process Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Project</em>' container reference.
     * @see #setParentProject(Project)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getProjectProcessReference_ParentProject()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Project#getProjectProcessReference
     * @model opposite="ProjectProcessReference" unsettable="true" ordered="false"
     * @generated
     */
    Project getParentProject();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProjectProcessReference#getParentProject <em>Parent Project</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Project</em>' container reference.
     * @see #getParentProject()
     * @generated
     */
    void setParentProject( Project value );

} // ProjectProcessReference
