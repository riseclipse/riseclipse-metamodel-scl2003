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
 * A representation of the model object '<em><b>Functional Sub Variant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of a functional sub variant of a variant
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalSubVariant#getParentAbstractFunctionalVariant <em>Parent Abstract Functional Variant</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionalSubVariant()
 * @model
 * @generated
 */
public interface FunctionalSubVariant extends AbstractFunctionalVariant {
    /**
     * Returns the value of the '<em><b>Parent Abstract Functional Variant</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AbstractFunctionalVariant#getFunctionalSubVariant <em>Functional Sub Variant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Abstract Functional Variant</em>' container reference.
     * @see #setParentAbstractFunctionalVariant(AbstractFunctionalVariant)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionalSubVariant_ParentAbstractFunctionalVariant()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AbstractFunctionalVariant#getFunctionalSubVariant
     * @model opposite="FunctionalSubVariant" unsettable="true" ordered="false"
     * @generated
     */
    AbstractFunctionalVariant getParentAbstractFunctionalVariant();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalSubVariant#getParentAbstractFunctionalVariant <em>Parent Abstract Functional Variant</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Abstract Functional Variant</em>' container reference.
     * @see #getParentAbstractFunctionalVariant()
     * @generated
     */
    void setParentAbstractFunctionalVariant( AbstractFunctionalVariant value );

} // FunctionalSubVariant
