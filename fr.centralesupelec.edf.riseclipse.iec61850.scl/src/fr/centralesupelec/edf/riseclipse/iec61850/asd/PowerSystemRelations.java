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
 * A representation of the model object '<em><b>Power System Relations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This element is used by a function/sub function to indicate relation with any element of the process (conducting equipment, transformer, Bay, ...) when there is a dependency between them
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelations#getPowerSystemRelation <em>Power System Relation</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getPowerSystemRelations()
 * @model extendedMetaData="name='PowerSystemRelations' kind='elementOnly'"
 * @generated
 */
public interface PowerSystemRelations extends BaseExtensionElementWithDesc {
    /**
     * Returns the value of the '<em><b>Power System Relation</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation#getParentPowerSystemRelation <em>Parent Power System Relation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Power System Relation</em>' containment reference list.
     * @see #isSetPowerSystemRelation()
     * @see #unsetPowerSystemRelation()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getPowerSystemRelations_PowerSystemRelation()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation#getParentPowerSystemRelation
     * @model opposite="ParentPowerSystemRelation" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='PowerSystemRelation' namespace='##targetNamespace'"
     * @generated
     */
    EList< PowerSystemRelation > getPowerSystemRelation();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelations#getPowerSystemRelation <em>Power System Relation</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPowerSystemRelation()
     * @see #getPowerSystemRelation()
     * @generated
     */
    void unsetPowerSystemRelation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelations#getPowerSystemRelation <em>Power System Relation</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Power System Relation</em>' containment reference list is set.
     * @see #unsetPowerSystemRelation()
     * @see #getPowerSystemRelation()
     * @generated
     */
    boolean isSetPowerSystemRelation();

} // PowerSystemRelations
