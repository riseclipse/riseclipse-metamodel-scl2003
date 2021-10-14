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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DAI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getIx <em>Ix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getSAddr <em>SAddr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getValImport <em>Val Import</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getValKind <em>Val Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getVal <em>Val</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getParentDOI <em>Parent DOI</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getParentSDI <em>Parent SDI</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getRefersToAbstractDataAttribute <em>Refers To Abstract Data Attribute</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDAI()
 * @model
 * @generated
 */
public interface DAI extends UnNaming {
    /**
     * Returns the value of the '<em><b>Ix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ix</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ix</em>' attribute.
     * @see #isSetIx()
     * @see #unsetIx()
     * @see #setIx(Integer)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDAI_Ix()
     * @model unsettable="true"
     * @generated
     */
    Integer getIx();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getIx <em>Ix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ix</em>' attribute.
     * @see #isSetIx()
     * @see #unsetIx()
     * @see #getIx()
     * @generated
     */
    void setIx( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getIx <em>Ix</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetIx()
     * @see #getIx()
     * @see #setIx(Integer)
     * @generated
     */
    void unsetIx();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getIx <em>Ix</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ix</em>' attribute is set.
     * @see #unsetIx()
     * @see #getIx()
     * @see #setIx(Integer)
     * @generated
     */
    boolean isSetIx();

    /**
     * Returns the value of the '<em><b>SAddr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SAddr</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SAddr</em>' attribute.
     * @see #isSetSAddr()
     * @see #unsetSAddr()
     * @see #setSAddr(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDAI_SAddr()
     * @model unsettable="true"
     * @generated
     */
    String getSAddr();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getSAddr <em>SAddr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SAddr</em>' attribute.
     * @see #isSetSAddr()
     * @see #unsetSAddr()
     * @see #getSAddr()
     * @generated
     */
    void setSAddr( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getSAddr <em>SAddr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSAddr()
     * @see #getSAddr()
     * @see #setSAddr(String)
     * @generated
     */
    void unsetSAddr();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getSAddr <em>SAddr</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>SAddr</em>' attribute is set.
     * @see #unsetSAddr()
     * @see #getSAddr()
     * @see #setSAddr(String)
     * @generated
     */
    boolean isSetSAddr();

    /**
     * Returns the value of the '<em><b>Val Import</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Val Import</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Val Import</em>' attribute.
     * @see #isSetValImport()
     * @see #unsetValImport()
     * @see #setValImport(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDAI_ValImport()
     * @model unsettable="true"
     * @generated
     */
    Boolean getValImport();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getValImport <em>Val Import</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @param value the new value of the '<em>Val Import</em>' attribute.
     * @see #isSetValImport()
     * @see #unsetValImport()
     * @see #getValImport()
     * @generated
     */
    void setValImport( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getValImport <em>Val Import</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetValImport()
     * @see #getValImport()
     * @see #setValImport(Boolean)
     * @generated
     */
    void unsetValImport();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getValImport <em>Val Import</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Val Import</em>' attribute is set.
     * @see #unsetValImport()
     * @see #getValImport()
     * @see #setValImport(Boolean)
     * @generated
     */
    boolean isSetValImport();

    /**
     * Returns the value of the '<em><b>Val Kind</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ValKindEnum}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Val Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Val Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ValKindEnum
     * @see #isSetValKind()
     * @see #unsetValKind()
     * @see #setValKind(ValKindEnum)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDAI_ValKind()
     * @model unsettable="true"
     * @generated
     */
    ValKindEnum getValKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getValKind <em>Val Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Val Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ValKindEnum
     * @see #isSetValKind()
     * @see #unsetValKind()
     * @see #getValKind()
     * @generated
     */
    void setValKind( ValKindEnum value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getValKind <em>Val Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetValKind()
     * @see #getValKind()
     * @see #setValKind(ValKindEnum)
     * @generated
     */
    void unsetValKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getValKind <em>Val Kind</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Val Kind</em>' attribute is set.
     * @see #unsetValKind()
     * @see #getValKind()
     * @see #setValKind(ValKindEnum)
     * @generated
     */
    boolean isSetValKind();

    /**
     * Returns the value of the '<em><b>Val</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Val}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Val#getParentDAI <em>Parent DAI</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Val</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Val</em>' containment reference list.
     * @see #isSetVal()
     * @see #unsetVal()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDAI_Val()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Val#getParentDAI
     * @model opposite="ParentDAI" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList< Val > getVal();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getVal <em>Val</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVal()
     * @see #getVal()
     * @generated
     */
    void unsetVal();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getVal <em>Val</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Val</em>' containment reference list is set.
     * @see #unsetVal()
     * @see #getVal()
     * @generated
     */
    boolean isSetVal();

    /**
     * Returns the value of the '<em><b>Parent DOI</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getDAI <em>DAI</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent DOI</em>' container reference.
     * @see #setParentDOI(DOI)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDAI_ParentDOI()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getDAI
     * @model opposite="DAI" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    DOI getParentDOI();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getParentDOI <em>Parent DOI</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent DOI</em>' container reference.
     * @see #getParentDOI()
     * @generated
     */
    void setParentDOI( DOI value );

    /**
     * Returns the value of the '<em><b>Parent SDI</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getDAI <em>DAI</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent SDI</em>' container reference.
     * @see #setParentSDI(SDI)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDAI_ParentSDI()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getDAI
     * @model opposite="DAI" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    SDI getParentSDI();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getParentSDI <em>Parent SDI</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent SDI</em>' container reference.
     * @see #getParentSDI()
     * @generated
     */
    void setParentSDI( SDI value );

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #setName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDAI_Name()
     * @model unsettable="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #getName()
     * @generated
     */
    void setName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    void unsetName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getName <em>Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Name</em>' attribute is set.
     * @see #unsetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    boolean isSetName();

    /**
     * Returns the value of the '<em><b>Refers To Abstract Data Attribute</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getReferredByDAI <em>Referred By DAI</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Abstract Data Attribute</em>' reference.
     * @see #isSetRefersToAbstractDataAttribute()
     * @see #unsetRefersToAbstractDataAttribute()
     * @see #setRefersToAbstractDataAttribute(AbstractDataAttribute)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDAI_RefersToAbstractDataAttribute()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getReferredByDAI
     * @model opposite="ReferredByDAI" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    AbstractDataAttribute getRefersToAbstractDataAttribute();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getRefersToAbstractDataAttribute <em>Refers To Abstract Data Attribute</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Abstract Data Attribute</em>' reference.
     * @see #isSetRefersToAbstractDataAttribute()
     * @see #unsetRefersToAbstractDataAttribute()
     * @see #getRefersToAbstractDataAttribute()
     * @generated
     */
    void setRefersToAbstractDataAttribute( AbstractDataAttribute value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getRefersToAbstractDataAttribute <em>Refers To Abstract Data Attribute</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToAbstractDataAttribute()
     * @see #getRefersToAbstractDataAttribute()
     * @see #setRefersToAbstractDataAttribute(AbstractDataAttribute)
     * @generated
     */
    void unsetRefersToAbstractDataAttribute();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getRefersToAbstractDataAttribute <em>Refers To Abstract Data Attribute</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Abstract Data Attribute</em>' reference is set.
     * @see #unsetRefersToAbstractDataAttribute()
     * @see #getRefersToAbstractDataAttribute()
     * @see #setRefersToAbstractDataAttribute(AbstractDataAttribute)
     * @generated
     */
    boolean isSetRefersToAbstractDataAttribute();

} // DAI
