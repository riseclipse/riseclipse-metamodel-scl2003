/**
 *  Copyright (c) 2017 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.iec61850.scl;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;

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
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getRefersToDataAttribute <em>Refers To Data Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getRefersToDataObject <em>Refers To Data Object</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getDataSet <em>Data Set</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getRefersToAnyLN <em>Refers To Any LN</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getFCDA()
 * @model
 * @generated
 */
public interface FCDA extends ExplicitLinkResolver {
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
	 * Returns the value of the '<em><b>Refers To Data Attribute</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataAttribute#getReferredByFCDA <em>Referred By FCDA</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Refers To Data Attribute</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers To Data Attribute</em>' reference.
	 * @see #isSetRefersToDataAttribute()
	 * @see #unsetRefersToDataAttribute()
	 * @see #setRefersToDataAttribute(DataAttribute)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getFCDA_RefersToDataAttribute()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DataAttribute#getReferredByFCDA
	 * @model opposite="ReferredByFCDA" resolveProxies="false" unsettable="true" transient="true"
	 * @generated
	 */
    DataAttribute getRefersToDataAttribute();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getRefersToDataAttribute <em>Refers To Data Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers To Data Attribute</em>' reference.
	 * @see #isSetRefersToDataAttribute()
	 * @see #unsetRefersToDataAttribute()
	 * @see #getRefersToDataAttribute()
	 * @generated
	 */
    void setRefersToDataAttribute(DataAttribute value);

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getRefersToDataAttribute <em>Refers To Data Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetRefersToDataAttribute()
	 * @see #getRefersToDataAttribute()
	 * @see #setRefersToDataAttribute(DataAttribute)
	 * @generated
	 */
    void unsetRefersToDataAttribute();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getRefersToDataAttribute <em>Refers To Data Attribute</em>}' reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Refers To Data Attribute</em>' reference is set.
	 * @see #unsetRefersToDataAttribute()
	 * @see #getRefersToDataAttribute()
	 * @see #setRefersToDataAttribute(DataAttribute)
	 * @generated
	 */
    boolean isSetRefersToDataAttribute();

    /**
	 * Returns the value of the '<em><b>Refers To Data Object</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataObject#getReferredByFCDA <em>Referred By FCDA</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Refers To Data Object</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers To Data Object</em>' reference.
	 * @see #isSetRefersToDataObject()
	 * @see #unsetRefersToDataObject()
	 * @see #setRefersToDataObject(DataObject)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getFCDA_RefersToDataObject()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DataObject#getReferredByFCDA
	 * @model opposite="ReferredByFCDA" resolveProxies="false" unsettable="true" transient="true"
	 * @generated
	 */
    DataObject getRefersToDataObject();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getRefersToDataObject <em>Refers To Data Object</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers To Data Object</em>' reference.
	 * @see #isSetRefersToDataObject()
	 * @see #unsetRefersToDataObject()
	 * @see #getRefersToDataObject()
	 * @generated
	 */
    void setRefersToDataObject(DataObject value);

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getRefersToDataObject <em>Refers To Data Object</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetRefersToDataObject()
	 * @see #getRefersToDataObject()
	 * @see #setRefersToDataObject(DataObject)
	 * @generated
	 */
    void unsetRefersToDataObject();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getRefersToDataObject <em>Refers To Data Object</em>}' reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Refers To Data Object</em>' reference is set.
	 * @see #unsetRefersToDataObject()
	 * @see #getRefersToDataObject()
	 * @see #setRefersToDataObject(DataObject)
	 * @generated
	 */
    boolean isSetRefersToDataObject();

    /**
	 * Returns the value of the '<em><b>Data Set</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSet#getFCDA <em>FCDA</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Set</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set</em>' container reference.
	 * @see #setDataSet(DataSet)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getFCDA_DataSet()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSet#getFCDA
	 * @model opposite="FCDA" resolveProxies="false" unsettable="true"
	 * @generated
	 */
    DataSet getDataSet();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getDataSet <em>Data Set</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Set</em>' container reference.
	 * @see #getDataSet()
	 * @generated
	 */
    void setDataSet( DataSet value );

    /**
	 * Returns the value of the '<em><b>Refers To Any LN</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReferredByFCDA <em>Referred By FCDA</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Refers To Any LN</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers To Any LN</em>' reference.
	 * @see #isSetRefersToAnyLN()
	 * @see #unsetRefersToAnyLN()
	 * @see #setRefersToAnyLN(AnyLN)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getFCDA_RefersToAnyLN()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReferredByFCDA
	 * @model opposite="ReferredByFCDA" resolveProxies="false" unsettable="true" transient="true"
	 * @generated
	 */
    AnyLN getRefersToAnyLN();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getRefersToAnyLN <em>Refers To Any LN</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers To Any LN</em>' reference.
	 * @see #isSetRefersToAnyLN()
	 * @see #unsetRefersToAnyLN()
	 * @see #getRefersToAnyLN()
	 * @generated
	 */
    void setRefersToAnyLN(AnyLN value);

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getRefersToAnyLN <em>Refers To Any LN</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetRefersToAnyLN()
	 * @see #getRefersToAnyLN()
	 * @see #setRefersToAnyLN(AnyLN)
	 * @generated
	 */
    void unsetRefersToAnyLN();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getRefersToAnyLN <em>Refers To Any LN</em>}' reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Refers To Any LN</em>' reference is set.
	 * @see #unsetRefersToAnyLN()
	 * @see #getRefersToAnyLN()
	 * @see #setRefersToAnyLN(AnyLN)
	 * @generated
	 */
    boolean isSetRefersToAnyLN();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FCDA_fc_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'fc attribute shall be present in FCDA (line \' + self.lineNumber.toString() + \')\' ,\n\tstatus : Boolean = \n        self.fc &lt;&gt; null\n\n    \n}.status'"
	 * @generated
	 */
	boolean validateFCDA_fc_required(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FCDA_ldInst_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'ldInst attribute shall always be specified except for GSSE in FCDA (line \' + self.lineNumber.toString() + \')\' ,\n\tstatus : Boolean = \n        ( self.fc &lt;&gt; null and self.fc &lt;&gt; FCEnum::ST ) implies self.ldInst &lt;&gt; null\n\n    \n}.status'"
	 * @generated
	 */
	boolean validateFCDA_ldInst_required(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FCDA_lnClass_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'lnClass attribute shall always be specified except for GSSE in FCDA (line \' + self.lineNumber.toString() + \')\' ,\n\tstatus : Boolean = \n        ( self.fc &lt;&gt; null and self.fc &lt;&gt; FCEnum::ST ) implies self.lnClass &lt;&gt; null\n\n    \n}.status'"
	 * @generated
	 */
	boolean validateFCDA_lnClass_required(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FCDA_lnClass_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'lnClass attribute shall be valid in FCDA (line \' + self.lineNumber.toString() + \'). \'\n          + \'Current value is \' + self.lnClass.toString()\n        ,\n\tstatus : Boolean = \n        self.lnClass &lt;&gt; null implies self.validSclLNClassEnum( lnClass )\n\n    \n}.status'"
	 * @generated
	 */
	boolean validateFCDA_lnClass_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FCDA_lnInst_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'lnInst attribute shall be specified except for LLN0 in FCDA (line \' + self.lineNumber.toString() + \')\' ,\n\tstatus : Boolean = \n        not self.DataSet.AnyLN.oclIsTypeOf( scl::LN0 )\n        implies\n        self.lnInst &lt;&gt; null\n    \n    \n}.status'"
	 * @generated
	 */
	boolean validateFCDA_lnInst_required(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FCDA_lnInst_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'lnInst attribute shall be a number with no more than 7 digits in FCDA (line \' + self.lineNumber.toString() + \'). \'\n          + \'Current value is \' + self.lnInst.toString()\n        ,\n\tstatus : Boolean = \n        not self.DataSet.AnyLN.oclIsTypeOf( scl::LN0 )\n        implies\n        ( self.lnInst &lt;&gt; null implies self.validSclLNInst( lnInst ) )\n\n    \n}.status'"
	 * @generated
	 */
	boolean validateFCDA_lnInst_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FCDA_empty_attributes_only_if_GSSE'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n        (       ( self.doName  = null or self.doName.size()  = 0 )\n            and ( self.daName  = null or self.daName.size()  = 0 )\n            and ( self.ix      = null                            )\n            and ( self.ldInst  = null or self.ldInst.size()  = 0 )\n            and ( self.lnClass = null or self.lnClass.size() = 0 )\n            and ( self.lnInst  = null or self.lnInst.size()  = 0 )\n            and ( self.prefix  = null or self.prefix.size()  = 0 )\n        )\n        implies self.fc = FCEnum::ST\n\n    '"
	 * @generated
	 */
	boolean validateFCDA_empty_attributes_only_if_GSSE(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FCDA_ldInst_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'ldInst attribute shall be valid in FCDA (line \' + self.lineNumber.toString() + \'). \'\n          + \'Current value is \' + self.ldInst.toString()\n        ,\n\tstatus : Boolean = \n        self.ldInst &lt;&gt; null implies self.validSclLDInst( ldInst )\n\n    \n}.status'"
	 * @generated
	 */
	boolean validateFCDA_ldInst_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FCDA_prefix_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'prefix attribute shall be valid in FCDA (line \' + self.lineNumber.toString() + \'). \'\n          + \'Current value is \' + self.prefix.toString()\n        ,\n\tstatus : Boolean = \n        self.prefix &lt;&gt; null implies self.validSclPrefix( prefix )\n\n    \n}.status'"
	 * @generated
	 */
	boolean validateFCDA_prefix_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FCDA_doName_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'doName attribute shall be valid in FCDA (line \' + self.lineNumber.toString() + \'). \'\n          + \'Current value is \' + self.doName.toString()\n        ,\n\tstatus : Boolean = \n        self.doName &lt;&gt; null implies self.validSclFullDOName( doName )\n\n    \n}.status'"
	 * @generated
	 */
	boolean validateFCDA_doName_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FCDA_daName_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'daName attribute shall be valid in FCDA (line \' + self.lineNumber.toString() + \'). \'\n          + \'Current value is \' + self.daName.toString()\n        ,\n\tstatus : Boolean = \n        self.daName &lt;&gt; null implies self.validSclFullAttributeName( daName )\n\n    \n}.status'"
	 * @generated
	 */
	boolean validateFCDA_daName_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FCDA_ix_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'ix attribute shall be valid in FCDA (line \' + self.lineNumber.toString() + \'). \'\n          + \'Current value is \' + self.ix.toString()\n        ,\n\tstatus : Boolean = \n        self.ix &lt;&gt; null implies self.ix &gt;= 0\n\n\n\n}.status'"
	 * @generated
	 */
	boolean validateFCDA_ix_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

} // FCDA
