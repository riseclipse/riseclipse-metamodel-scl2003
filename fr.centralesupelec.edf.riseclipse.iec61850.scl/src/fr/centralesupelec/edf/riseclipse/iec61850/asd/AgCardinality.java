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
 * A representation of the model object '<em><b>Ag Cardinality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AgCardinality#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AgCardinality#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getAgCardinality()
 * @model
 * @generated
 */
public interface AgCardinality extends EObject {
    /**
     * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
     * The default value is <code>"1..1"</code>.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CardinalityEnum}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * This attribute indicates the multiple instances allowed for the current element.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Cardinality</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.CardinalityEnum
     * @see #isSetCardinality()
     * @see #unsetCardinality()
     * @see #setCardinality(CardinalityEnum)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getAgCardinality_Cardinality()
     * @model default="1..1" unsettable="true"
     *        extendedMetaData="kind='attribute' name='cardinality'"
     * @generated
     */
    CardinalityEnum getCardinality();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AgCardinality#getCardinality <em>Cardinality</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cardinality</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.CardinalityEnum
     * @see #isSetCardinality()
     * @see #unsetCardinality()
     * @see #getCardinality()
     * @generated
     */
    void setCardinality( CardinalityEnum value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AgCardinality#getCardinality <em>Cardinality</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCardinality()
     * @see #getCardinality()
     * @see #setCardinality(CardinalityEnum)
     * @generated
     */
    void unsetCardinality();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AgCardinality#getCardinality <em>Cardinality</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cardinality</em>' attribute is set.
     * @see #unsetCardinality()
     * @see #getCardinality()
     * @see #setCardinality(CardinalityEnum)
     * @generated
     */
    boolean isSetCardinality();

    /**
     * Returns the value of the '<em><b>Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * This attribute indicates the maximum number of an element in case of cardinality allowing multiple instances. If not defined, there is no limit
     * <!-- end-model-doc -->
     * @return the value of the '<em>Max</em>' attribute.
     * @see #setMax(int)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getAgCardinality_Max()
     * @model extendedMetaData="kind='attribute' name='max'"
     * @generated
     */
    int getMax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AgCardinality#getMax <em>Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max</em>' attribute.
     * @see #getMax()
     * @generated
     */
    void setMax( int value );

} // AgCardinality
