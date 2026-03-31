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

import org.eclipse.emf.ecore.util.FeatureMap;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.Text;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Extension Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base element for 6-100 extension
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BaseExtensionElement#getText <em>Text</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BaseExtensionElement#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getBaseExtensionElement()
 * @model abstract="true"
 * @generated
 */
public interface BaseExtensionElement extends AsdObject {
    /**
     * Returns the value of the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Text</em>' containment reference.
     * @see #setText(Text)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getBaseExtensionElement_Text()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='Text' namespace='##targetNamespace'"
     * @generated
     */
    Text getText();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BaseExtensionElement#getText <em>Text</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Text</em>' containment reference.
     * @see #getText()
     * @generated
     */
    void setText( Text value );

    /**
     * Returns the value of the '<em><b>Any</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Any</em>' attribute list.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getBaseExtensionElement_Any()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':0' processing='lax'"
     * @generated
     */
    FeatureMap getAny();

} // BaseExtensionElement
