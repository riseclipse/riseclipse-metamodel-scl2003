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
 * A representation of the model object '<em><b>Process Resources</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This element is used by a function/sub function to indicate reference to a process resource (conducting equipment, transformer, ...) which is associated to current function
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResources#getProcessResource <em>Process Resource</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getProcessResources()
 * @model extendedMetaData="name='ProcessResources' kind='elementOnly'"
 * @generated
 */
public interface ProcessResources extends BaseExtensionElementWithDesc {
    /**
     * Returns the value of the '<em><b>Process Resource</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getParentProcessResources <em>Parent Process Resources</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Process Resource</em>' containment reference list.
     * @see #isSetProcessResource()
     * @see #unsetProcessResource()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getProcessResources_ProcessResource()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getParentProcessResources
     * @model opposite="ParentProcessResources" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='ProcessResource' namespace='##targetNamespace'"
     * @generated
     */
    EList< ProcessResource > getProcessResource();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResources#getProcessResource <em>Process Resource</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetProcessResource()
     * @see #getProcessResource()
     * @generated
     */
    void unsetProcessResource();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResources#getProcessResource <em>Process Resource</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Process Resource</em>' containment reference list is set.
     * @see #unsetProcessResource()
     * @see #getProcessResource()
     * @generated
     */
    boolean isSetProcessResource();

} // ProcessResources
