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
 * A representation of the model object '<em><b>LNode Inputs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specification of data inputs required by the LNode
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputs#getSourceRef <em>Source Ref</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLNodeInputs()
 * @model extendedMetaData="name='LNodeInputs' kind='elementOnly'"
 * @generated
 */
public interface LNodeInputs extends BaseExtensionElementWithDesc {
    /**
     * Returns the value of the '<em><b>Source Ref</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getParentLNodeInputs <em>Parent LNode Inputs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reference to a data in the process
     * <!-- end-model-doc -->
     * @return the value of the '<em>Source Ref</em>' containment reference list.
     * @see #isSetSourceRef()
     * @see #unsetSourceRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLNodeInputs_SourceRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getParentLNodeInputs
     * @model opposite="ParentLNodeInputs" containment="true" unsettable="true" required="true" ordered="false"
     *        extendedMetaData="kind='element' name='SourceRef' namespace='##targetNamespace'"
     * @generated
     */
    EList< SourceRef > getSourceRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputs#getSourceRef <em>Source Ref</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSourceRef()
     * @see #getSourceRef()
     * @generated
     */
    void unsetSourceRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputs#getSourceRef <em>Source Ref</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Source Ref</em>' containment reference list is set.
     * @see #unsetSourceRef()
     * @see #getSourceRef()
     * @generated
     */
    boolean isSetSourceRef();

} // LNodeInputs
