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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Text#getSource <em>Source</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Text#getParentBaseElement <em>Parent Base Element</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Text#getParentHeader <em>Parent Header</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Text#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getText()
 * @model extendedMetaData="kind='simple'"
 * @generated
 */
public interface Text extends SclObject {
    /**
     * Returns the value of the '<em><b>Source</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source</em>' attribute.
     * @see #isSetSource()
     * @see #unsetSource()
     * @see #setSource(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getText_Source()
     * @model unsettable="true"
     * @generated
     */
    String getSource();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Text#getSource <em>Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source</em>' attribute.
     * @see #isSetSource()
     * @see #unsetSource()
     * @see #getSource()
     * @generated
     */
    void setSource( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Text#getSource <em>Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSource()
     * @see #getSource()
     * @see #setSource(String)
     * @generated
     */
    void unsetSource();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Text#getSource <em>Source</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Source</em>' attribute is set.
     * @see #unsetSource()
     * @see #getSource()
     * @see #setSource(String)
     * @generated
     */
    boolean isSetSource();

    /**
     * Returns the value of the '<em><b>Parent Base Element</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BaseElement#getText <em>Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Base Element</em>' container reference.
     * @see #setParentBaseElement(BaseElement)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getText_ParentBaseElement()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.BaseElement#getText
     * @model opposite="Text" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    BaseElement getParentBaseElement();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Text#getParentBaseElement <em>Parent Base Element</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Base Element</em>' container reference.
     * @see #getParentBaseElement()
     * @generated
     */
    void setParentBaseElement( BaseElement value );

    /**
     * Returns the value of the '<em><b>Parent Header</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getText <em>Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Header</em>' container reference.
     * @see #setParentHeader(Header)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getText_ParentHeader()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getText
     * @model opposite="Text" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    Header getParentHeader();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Text#getParentHeader <em>Parent Header</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Header</em>' container reference.
     * @see #getParentHeader()
     * @generated
     */
    void setParentHeader( Header value );

    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getText_Value()
     * @model extendedMetaData="kind='simple'"
     * @generated
     */
    String getValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Text#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue( String value );

} // Text
