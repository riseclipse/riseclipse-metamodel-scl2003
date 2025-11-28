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
 * A representation of the model object '<em><b>Functional Variant Ref Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Type which could be linked to functional variants
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRefContainer#getFunctionalVariantRef <em>Functional Variant Ref</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionalVariantRefContainer()
 * @model abstract="true"
 * @generated
 */
public interface FunctionalVariantRefContainer extends BaseExtensionElementWithDesc {
    /**
     * Returns the value of the '<em><b>Functional Variant Ref</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRef#getParentFunctionalVariantRefContainer <em>Parent Functional Variant Ref Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Ref to a functional variant of the Application
     * <!-- end-model-doc -->
     * @return the value of the '<em>Functional Variant Ref</em>' containment reference list.
     * @see #isSetFunctionalVariantRef()
     * @see #unsetFunctionalVariantRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionalVariantRefContainer_FunctionalVariantRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRef#getParentFunctionalVariantRefContainer
     * @model opposite="ParentFunctionalVariantRefContainer" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='FunctionalVariantRef' namespace='##targetNamespace'"
     * @generated
     */
    EList< FunctionalVariantRef > getFunctionalVariantRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRefContainer#getFunctionalVariantRef <em>Functional Variant Ref</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFunctionalVariantRef()
     * @see #getFunctionalVariantRef()
     * @generated
     */
    void unsetFunctionalVariantRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRefContainer#getFunctionalVariantRef <em>Functional Variant Ref</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Functional Variant Ref</em>' containment reference list is set.
     * @see #unsetFunctionalVariantRef()
     * @see #getFunctionalVariantRef()
     * @generated
     */
    boolean isSetFunctionalVariantRef();

} // FunctionalVariantRefContainer
