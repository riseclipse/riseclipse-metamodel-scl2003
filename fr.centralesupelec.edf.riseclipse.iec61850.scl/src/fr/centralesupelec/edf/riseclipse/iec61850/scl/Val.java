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
 * A representation of the model object '<em><b>Val</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Val#getSGroup <em>SGroup</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Val#getParentAbstractDataAttribute <em>Parent Abstract Data Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Val#getParentDAI <em>Parent DAI</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Val#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getVal()
 * @model extendedMetaData="kind='simple'"
 * @generated
 */
public interface Val extends SclObject {
    /**
     * Returns the value of the '<em><b>SGroup</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SGroup</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SGroup</em>' attribute.
     * @see #isSetSGroup()
     * @see #unsetSGroup()
     * @see #setSGroup(Integer)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getVal_SGroup()
     * @model unsettable="true"
     * @generated
     */
    Integer getSGroup();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Val#getSGroup <em>SGroup</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SGroup</em>' attribute.
     * @see #isSetSGroup()
     * @see #unsetSGroup()
     * @see #getSGroup()
     * @generated
     */
    void setSGroup( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Val#getSGroup <em>SGroup</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetSGroup()
     * @see #getSGroup()
     * @see #setSGroup(Integer)
     * @generated
     */
    void unsetSGroup();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Val#getSGroup <em>SGroup</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>SGroup</em>' attribute is set.
     * @see #unsetSGroup()
     * @see #getSGroup()
     * @see #setSGroup(Integer)
     * @generated
     */
    boolean isSetSGroup();

    /**
     * Returns the value of the '<em><b>Parent Abstract Data Attribute</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getVal <em>Val</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Abstract Data Attribute</em>' container reference.
     * @see #setParentAbstractDataAttribute(AbstractDataAttribute)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getVal_ParentAbstractDataAttribute()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getVal
     * @model opposite="Val" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    AbstractDataAttribute getParentAbstractDataAttribute();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Val#getParentAbstractDataAttribute <em>Parent Abstract Data Attribute</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Abstract Data Attribute</em>' container reference.
     * @see #getParentAbstractDataAttribute()
     * @generated
     */
    void setParentAbstractDataAttribute( AbstractDataAttribute value );

    /**
     * Returns the value of the '<em><b>Parent DAI</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getVal <em>Val</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent DAI</em>' container reference.
     * @see #setParentDAI(DAI)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getVal_ParentDAI()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getVal
     * @model opposite="Val" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    DAI getParentDAI();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Val#getParentDAI <em>Parent DAI</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent DAI</em>' container reference.
     * @see #getParentDAI()
     * @generated
     */
    void setParentDAI( DAI value );

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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getVal_Value()
     * @model extendedMetaData="kind='simple'"
     * @generated
     */
    String getValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Val#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue( String value );

} // Val
