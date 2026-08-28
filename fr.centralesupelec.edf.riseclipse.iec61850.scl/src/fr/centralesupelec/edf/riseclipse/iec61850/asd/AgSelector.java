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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ag Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AgSelector#getSelector <em>Selector</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getAgSelector()
 * @model
 * @generated
 */
public interface AgSelector extends EObject {
    /**
     * Returns the value of the '<em><b>Selector</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Selector is used to give a searching rule to help user to select a target. It is represented by an XPath
     * <!-- end-model-doc -->
     * @return the value of the '<em>Selector</em>' attribute.
     * @see #setSelector(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getAgSelector_Selector()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
     *        extendedMetaData="kind='attribute' name='selector'"
     * @generated
     */
    String getSelector();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AgSelector#getSelector <em>Selector</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Selector</em>' attribute.
     * @see #getSelector()
     * @generated
     */
    void setSelector( String value );

} // AgSelector
