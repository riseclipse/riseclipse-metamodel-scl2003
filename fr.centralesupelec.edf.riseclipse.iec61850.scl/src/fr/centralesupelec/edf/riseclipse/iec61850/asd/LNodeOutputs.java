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
 * A representation of the model object '<em><b>LNode Outputs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specification of data outputs required by the LNode
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputs#getControlRef <em>Control Ref</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLNodeOutputs()
 * @model extendedMetaData="name='LNodeOutputs' kind='elementOnly'"
 * @generated
 */
public interface LNodeOutputs extends BaseExtensionElementWithDesc {
    /**
     * Returns the value of the '<em><b>Control Ref</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getParentLNodeOutputs <em>Parent LNode Outputs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reference to a control data in the process
     * <!-- end-model-doc -->
     * @return the value of the '<em>Control Ref</em>' containment reference list.
     * @see #isSetControlRef()
     * @see #unsetControlRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLNodeOutputs_ControlRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getParentLNodeOutputs
     * @model opposite="ParentLNodeOutputs" containment="true" unsettable="true" required="true" ordered="false"
     *        extendedMetaData="kind='element' name='ControlRef' namespace='##targetNamespace'"
     * @generated
     */
    EList< ControlRef > getControlRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputs#getControlRef <em>Control Ref</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetControlRef()
     * @see #getControlRef()
     * @generated
     */
    void unsetControlRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputs#getControlRef <em>Control Ref</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Control Ref</em>' containment reference list is set.
     * @see #unsetControlRef()
     * @see #getControlRef()
     * @generated
     */
    boolean isSetControlRef();

} // LNodeOutputs
