/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
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
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.iec61850.scl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FCDA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getDaName <em>Da Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getDoName <em>Do Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getFc <em>Fc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getIx <em>Ix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getLdInst <em>Ld Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getLnClass <em>Ln Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getLnInst <em>Ln Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getParentDataSet <em>Parent Data Set</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getRefersToAbstractDataAttribute <em>Refers To Abstract Data Attribute</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getFCDA()
 * @model
 * @generated
 */
public interface FCDA extends SclObject {
    /**
     * Returns the value of the '<em><b>Da Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Da Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Da Name</em>' attribute.
     * @see #isSetDaName()
     * @see #unsetDaName()
     * @see #setDaName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getFCDA_DaName()
     * @model unsettable="true"
     * @generated
     */
    String getDaName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getDaName <em>Da Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Da Name</em>' attribute.
     * @see #isSetDaName()
     * @see #unsetDaName()
     * @see #getDaName()
     * @generated
     */
    void setDaName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getDaName <em>Da Name</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetDaName()
     * @see #getDaName()
     * @see #setDaName(String)
     * @generated
     */
    void unsetDaName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getDaName <em>Da Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @return whether the value of the '<em>Da Name</em>' attribute is set.
     * @see #unsetDaName()
     * @see #getDaName()
     * @see #setDaName(String)
     * @generated
     */
    boolean isSetDaName();

    /**
     * Returns the value of the '<em><b>Do Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Do Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Do Name</em>' attribute.
     * @see #isSetDoName()
     * @see #unsetDoName()
     * @see #setDoName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getFCDA_DoName()
     * @model unsettable="true"
     * @generated
     */
    String getDoName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getDoName <em>Do Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Do Name</em>' attribute.
     * @see #isSetDoName()
     * @see #unsetDoName()
     * @see #getDoName()
     * @generated
     */
    void setDoName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getDoName <em>Do Name</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetDoName()
     * @see #getDoName()
     * @see #setDoName(String)
     * @generated
     */
    void unsetDoName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getDoName <em>Do Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @return whether the value of the '<em>Do Name</em>' attribute is set.
     * @see #unsetDoName()
     * @see #getDoName()
     * @see #setDoName(String)
     * @generated
     */
    boolean isSetDoName();

    /**
     * Returns the value of the '<em><b>Fc</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCEnum}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fc</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fc</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.FCEnum
     * @see #isSetFc()
     * @see #unsetFc()
     * @see #setFc(FCEnum)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getFCDA_Fc()
     * @model unsettable="true"
     * @generated
     */
    FCEnum getFc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getFc <em>Fc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fc</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.FCEnum
     * @see #isSetFc()
     * @see #unsetFc()
     * @see #getFc()
     * @generated
     */
    void setFc( FCEnum value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getFc <em>Fc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFc()
     * @see #getFc()
     * @see #setFc(FCEnum)
     * @generated
     */
    void unsetFc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getFc <em>Fc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fc</em>' attribute is set.
     * @see #unsetFc()
     * @see #getFc()
     * @see #setFc(FCEnum)
     * @generated
     */
    boolean isSetFc();

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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getFCDA_Ix()
     * @model unsettable="true"
     * @generated
     */
    Integer getIx();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getIx <em>Ix</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getIx <em>Ix</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetIx()
     * @see #getIx()
     * @see #setIx(Integer)
     * @generated
     */
    void unsetIx();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getIx <em>Ix</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Ld Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ld Inst</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ld Inst</em>' attribute.
     * @see #isSetLdInst()
     * @see #unsetLdInst()
     * @see #setLdInst(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getFCDA_LdInst()
     * @model unsettable="true"
     * @generated
     */
    String getLdInst();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getLdInst <em>Ld Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ld Inst</em>' attribute.
     * @see #isSetLdInst()
     * @see #unsetLdInst()
     * @see #getLdInst()
     * @generated
     */
    void setLdInst( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getLdInst <em>Ld Inst</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetLdInst()
     * @see #getLdInst()
     * @see #setLdInst(String)
     * @generated
     */
    void unsetLdInst();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getLdInst <em>Ld Inst</em>}' attribute is set.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ld Inst</em>' attribute is set.
     * @see #unsetLdInst()
     * @see #getLdInst()
     * @see #setLdInst(String)
     * @generated
     */
    boolean isSetLdInst();

    /**
     * Returns the value of the '<em><b>Ln Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ln Class</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ln Class</em>' attribute.
     * @see #isSetLnClass()
     * @see #unsetLnClass()
     * @see #setLnClass(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getFCDA_LnClass()
     * @model unsettable="true"
     * @generated
     */
    String getLnClass();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getLnClass <em>Ln Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ln Class</em>' attribute.
     * @see #isSetLnClass()
     * @see #unsetLnClass()
     * @see #getLnClass()
     * @generated
     */
    void setLnClass( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getLnClass <em>Ln Class</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetLnClass()
     * @see #getLnClass()
     * @see #setLnClass(String)
     * @generated
     */
    void unsetLnClass();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getLnClass <em>Ln Class</em>}' attribute is set.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ln Class</em>' attribute is set.
     * @see #unsetLnClass()
     * @see #getLnClass()
     * @see #setLnClass(String)
     * @generated
     */
    boolean isSetLnClass();

    /**
     * Returns the value of the '<em><b>Ln Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ln Inst</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ln Inst</em>' attribute.
     * @see #isSetLnInst()
     * @see #unsetLnInst()
     * @see #setLnInst(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getFCDA_LnInst()
     * @model unsettable="true"
     * @generated
     */
    String getLnInst();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getLnInst <em>Ln Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ln Inst</em>' attribute.
     * @see #isSetLnInst()
     * @see #unsetLnInst()
     * @see #getLnInst()
     * @generated
     */
    void setLnInst( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getLnInst <em>Ln Inst</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetLnInst()
     * @see #getLnInst()
     * @see #setLnInst(String)
     * @generated
     */
    void unsetLnInst();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getLnInst <em>Ln Inst</em>}' attribute is set.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ln Inst</em>' attribute is set.
     * @see #unsetLnInst()
     * @see #getLnInst()
     * @see #setLnInst(String)
     * @generated
     */
    boolean isSetLnInst();

    /**
     * Returns the value of the '<em><b>Prefix</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Prefix</em>' attribute.
     * @see #isSetPrefix()
     * @see #unsetPrefix()
     * @see #setPrefix(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getFCDA_Prefix()
     * @model default="" unsettable="true"
     * @generated
     */
    String getPrefix();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getPrefix <em>Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Prefix</em>' attribute.
     * @see #isSetPrefix()
     * @see #unsetPrefix()
     * @see #getPrefix()
     * @generated
     */
    void setPrefix( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getPrefix <em>Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPrefix()
     * @see #getPrefix()
     * @see #setPrefix(String)
     * @generated
     */
    void unsetPrefix();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getPrefix <em>Prefix</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Prefix</em>' attribute is set.
     * @see #unsetPrefix()
     * @see #getPrefix()
     * @see #setPrefix(String)
     * @generated
     */
    boolean isSetPrefix();

    /**
     * Returns the value of the '<em><b>Parent Data Set</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSet#getFCDA <em>FCDA</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Data Set</em>' container reference.
     * @see #setParentDataSet(DataSet)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getFCDA_ParentDataSet()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSet#getFCDA
     * @model opposite="FCDA" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    DataSet getParentDataSet();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getParentDataSet <em>Parent Data Set</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Data Set</em>' container reference.
     * @see #getParentDataSet()
     * @generated
     */
    void setParentDataSet( DataSet value );

    /**
     * Returns the value of the '<em><b>Refers To Abstract Data Attribute</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getReferredByFCDA <em>Referred By FCDA</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Abstract Data Attribute</em>' reference list.
     * @see #isSetRefersToAbstractDataAttribute()
     * @see #unsetRefersToAbstractDataAttribute()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getFCDA_RefersToAbstractDataAttribute()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getReferredByFCDA
     * @model opposite="ReferredByFCDA" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< AbstractDataAttribute > getRefersToAbstractDataAttribute();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getRefersToAbstractDataAttribute <em>Refers To Abstract Data Attribute</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToAbstractDataAttribute()
     * @see #getRefersToAbstractDataAttribute()
     * @generated
     */
    void unsetRefersToAbstractDataAttribute();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getRefersToAbstractDataAttribute <em>Refers To Abstract Data Attribute</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Abstract Data Attribute</em>' reference list is set.
     * @see #unsetRefersToAbstractDataAttribute()
     * @see #getRefersToAbstractDataAttribute()
     * @generated
     */
    boolean isSetRefersToAbstractDataAttribute();

} // FCDA
