/*
*************************************************************************
**  Copyright (c) 2016-2021 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      https://riseclipse.github.io/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.iec61850.scl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BaseElement#getPrivate <em>Private</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BaseElement#getText <em>Text</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BaseElement#getAny <em>Any</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BaseElement#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getBaseElement()
 * @model abstract="true"
 * @generated
 */
public interface BaseElement extends SclObject {
    /**
     * Returns the value of the '<em><b>Private</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Private}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Private#getParentBaseElement <em>Parent Base Element</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Private</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Private</em>' containment reference list.
     * @see #isSetPrivate()
     * @see #unsetPrivate()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getBaseElement_Private()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Private#getParentBaseElement
     * @model opposite="ParentBaseElement" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList< Private > getPrivate();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BaseElement#getPrivate <em>Private</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPrivate()
     * @see #getPrivate()
     * @generated
     */
    void unsetPrivate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BaseElement#getPrivate <em>Private</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Private</em>' containment reference list is set.
     * @see #unsetPrivate()
     * @see #getPrivate()
     * @generated
     */
    boolean isSetPrivate();

    /**
     * Returns the value of the '<em><b>Text</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Text#getParentBaseElement <em>Parent Base Element</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Text</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Text</em>' containment reference.
     * @see #isSetText()
     * @see #unsetText()
     * @see #setText(Text)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getBaseElement_Text()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Text#getParentBaseElement
     * @model opposite="ParentBaseElement" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    Text getText();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BaseElement#getText <em>Text</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Text</em>' containment reference.
     * @see #isSetText()
     * @see #unsetText()
     * @see #getText()
     * @generated
     */
    void setText( Text value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BaseElement#getText <em>Text</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetText()
     * @see #getText()
     * @see #setText(Text)
     * @generated
     */
    void unsetText();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BaseElement#getText <em>Text</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Text</em>' containment reference is set.
     * @see #unsetText()
     * @see #getText()
     * @see #setText(Text)
     * @generated
     */
    boolean isSetText();

    /**
     * Returns the value of the '<em><b>Any</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Any</em>' attribute list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
     * @return the value of the '<em>Any</em>' attribute list.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getBaseElement_Any()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':0' processing='lax'"
     * @generated
     */
    FeatureMap getAny();

    /**
     * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Any Attribute</em>' attribute list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
     * @return the value of the '<em>Any Attribute</em>' attribute list.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getBaseElement_AnyAttribute()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':3' processing='lax'"
     * @generated
     */
    FeatureMap getAnyAttribute();

} // BaseElement
