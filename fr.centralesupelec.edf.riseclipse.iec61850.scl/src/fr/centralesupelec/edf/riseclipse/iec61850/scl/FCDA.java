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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!FCDA!daName'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!FCDA!doName'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!FCDA!fc'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!FCDA!ix'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!FCDA!ldInst'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!FCDA!lnClass'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!FCDA!lnInst'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!FCDA!prefix'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!FCDA!RefersToDataAttribute'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!FCDA!RefersToDataObject'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!FCDA!DataSet'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!FCDA!RefersToAnyLN'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv FCDA_fc_required:\n *   let severity : Integer[1] = \'FCDA::FCDA_fc_required\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let status : Boolean[1] = self.fc &lt;&gt; null\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{message = \'fc attribute shall be present in FCDA (line \' +\n *               self.lineNumber.toString() + \')\', status = status\n *             }\n *           endif\n *       in\n *         \'FCDA::FCDA_fc_required\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_FCDA_c_c_FCDA_fc_required);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_2;\nif (le) {\n\tsymbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.FCEnum%&gt; fc = this.getFc();\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.EnumerationLiteralId%&gt; BOXED_fc = fc == null ? null : &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.ENUMid_FCEnum.getEnumerationLiteralId(&lt;%org.eclipse.ocl.pivot.utilities.ClassUtil%&gt;.nonNullState(fc.getName()));\n\tfinal /*@NonInvalid\052/ boolean status = BOXED_fc != null;\n\t/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_1;\n\tif (status) {\n\t\tsymbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid\052/ int lineNumber = this.getLineNumber();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_lineNumber = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(lineNumber);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; toString = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_lineNumber);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_fc_32_attribute_32_shall_32_be_32_present_32_in_32_FCDA_32_o_line_32, toString);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__e);\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.TUPLid_, sum_0, status);\n\t\tsymbol_1 = symbol_0;\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_FCDA_c_c_FCDA_fc_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\tsymbol_2 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_2;'"
	 * @generated
	 */
	boolean validateFCDA_fc_required(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FCDA_ldInst_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv FCDA_ldInst_required:\n *   let severity : Integer[1] = \'FCDA::FCDA_ldInst_required\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let status : Boolean[?] = self.fc &lt;&gt; null and self.fc &lt;&gt; FCEnum::ST implies self.ldInst &lt;&gt; null\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{message = \'ldInst attribute shall always be specified except for GSSE in FCDA (line \' +\n *               self.lineNumber.toString() + \')\', status = status\n *             }\n *           endif\n *       in\n *         \'FCDA::FCDA_ldInst_required\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_FCDA_c_c_FCDA_ldInst_required);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_2;\nif (le) {\n\tsymbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.FCEnum%&gt; fc_0 = this.getFc();\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.EnumerationLiteralId%&gt; BOXED_fc_0 = fc_0 == null ? null : &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.ENUMid_FCEnum.getEnumerationLiteralId(&lt;%org.eclipse.ocl.pivot.utilities.ClassUtil%&gt;.nonNullState(fc_0.getName()));\n\tfinal /*@NonInvalid\052/ boolean ne = BOXED_fc_0 != null;\n\t/*@NonInvalid\052/ boolean and;\n\tif (ne) {\n\t\tfinal /*@NonInvalid\052/ boolean ne_0 = BOXED_fc_0 != &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.ELITid_ST;\n\t\tand = ne_0;\n\t}\n\telse {\n\t\tand = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t}\n\t/*@NonInvalid\052/ boolean status;\n\tif (and) {\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; ldInst = this.getLdInst();\n\t\tfinal /*@NonInvalid\052/ boolean ne_1 = ldInst != null;\n\t\tstatus = ne_1;\n\t}\n\telse {\n\t\tstatus = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t}\n\t/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_1;\n\tif (status) {\n\t\tsymbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid\052/ int lineNumber = this.getLineNumber();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_lineNumber = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(lineNumber);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; toString = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_lineNumber);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_ldInst_32_attribute_32_shall_32_always_32_be_32_specified_32_except_32_for_32_GSSE_32_in_32_FC, toString);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__e);\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.TUPLid_, sum_0, status);\n\t\tsymbol_1 = symbol_0;\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_FCDA_c_c_FCDA_ldInst_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\tsymbol_2 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_2;'"
	 * @generated
	 */
	boolean validateFCDA_ldInst_required(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FCDA_lnClass_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv FCDA_lnClass_required:\n *   let severity : Integer[1] = \'FCDA::FCDA_lnClass_required\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let status : Boolean[?] = self.fc &lt;&gt; null and self.fc &lt;&gt; FCEnum::ST implies self.lnClass &lt;&gt; null\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{message = \'lnClass attribute shall always be specified except for GSSE in FCDA (line \' +\n *               self.lineNumber.toString() + \')\', status = status\n *             }\n *           endif\n *       in\n *         \'FCDA::FCDA_lnClass_required\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_FCDA_c_c_FCDA_lnClass_required);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_2;\nif (le) {\n\tsymbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.FCEnum%&gt; fc_0 = this.getFc();\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.EnumerationLiteralId%&gt; BOXED_fc_0 = fc_0 == null ? null : &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.ENUMid_FCEnum.getEnumerationLiteralId(&lt;%org.eclipse.ocl.pivot.utilities.ClassUtil%&gt;.nonNullState(fc_0.getName()));\n\tfinal /*@NonInvalid\052/ boolean ne = BOXED_fc_0 != null;\n\t/*@NonInvalid\052/ boolean and;\n\tif (ne) {\n\t\tfinal /*@NonInvalid\052/ boolean ne_0 = BOXED_fc_0 != &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.ELITid_ST;\n\t\tand = ne_0;\n\t}\n\telse {\n\t\tand = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t}\n\t/*@NonInvalid\052/ boolean status;\n\tif (and) {\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; lnClass = this.getLnClass();\n\t\tfinal /*@NonInvalid\052/ boolean ne_1 = lnClass != null;\n\t\tstatus = ne_1;\n\t}\n\telse {\n\t\tstatus = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t}\n\t/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_1;\n\tif (status) {\n\t\tsymbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid\052/ int lineNumber = this.getLineNumber();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_lineNumber = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(lineNumber);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; toString = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_lineNumber);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_lnClass_32_attribute_32_shall_32_always_32_be_32_specified_32_except_32_for_32_GSSE_32_in_32_F, toString);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__e);\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.TUPLid_, sum_0, status);\n\t\tsymbol_1 = symbol_0;\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_FCDA_c_c_FCDA_lnClass_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\tsymbol_2 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_2;'"
	 * @generated
	 */
	boolean validateFCDA_lnClass_required(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FCDA_lnClass_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv FCDA_lnClass_valid:\n *   let severity : Integer[1] = \'FCDA::FCDA_lnClass_valid\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let status : Boolean[?] = self.lnClass &lt;&gt; null implies\n *           self.validSclLNClassEnum(lnClass)\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{message = \'lnClass attribute shall be valid in FCDA (line \' +\n *               self.lineNumber.toString() + \'). \' + \'Current value is \' +\n *               self.lnClass.toString(), status = status\n *             }\n *           endif\n *       in\n *         \'FCDA::FCDA_lnClass_valid\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_FCDA_c_c_FCDA_lnClass_valid);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_2;\nif (le) {\n\tsymbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_symbol_1;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; lnClass_0 = this.getLnClass();\n\t\tfinal /*@NonInvalid\052/ boolean ne = lnClass_0 != null;\n\t\t/*@Thrown\052/ boolean status;\n\t\tif (ne) {\n\t\t\tfinal /*@Thrown\052/ boolean validSclLNClassEnum = ((&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject%&gt;)this).validSclLNClassEnum(lnClass_0);\n\t\t\tstatus = validSclLNClassEnum;\n\t\t}\n\t\telse {\n\t\t\tstatus = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\t/*@Thrown\052/ &lt;%java.lang.Object%&gt; symbol_1;\n\t\tif (status) {\n\t\t\tsymbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\telse {\n\t\t\tfinal /*@NonInvalid\052/ int lineNumber = this.getLineNumber();\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_lineNumber = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; toString = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_lnClass_32_attribute_32_shall_32_be_32_valid_32_in_32_FCDA_32_o_line_32, toString);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__e__32);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_1 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_Current_32_value_32_is_32);\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; toString_0 = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(lnClass_0);\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; sum_2 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_1, toString_0);\n\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.TUPLid_, sum_2, status);\n\t\t\tsymbol_1 = symbol_0;\n\t\t}\n\t\tCAUGHT_symbol_1 = symbol_1;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_symbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_FCDA_c_c_FCDA_lnClass_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\tsymbol_2 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_2;'"
	 * @generated
	 */
	boolean validateFCDA_lnClass_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FCDA_lnInst_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv FCDA_lnInst_required:\n *   let severity : Integer[1] = \'FCDA::FCDA_lnInst_required\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let\n *           status : Boolean[?] = not self.DataSet.AnyLN.oclIsTypeOf(LN0) implies self.lnInst &lt;&gt; null\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{message = \'lnInst attribute shall be specified except for LLN0 in FCDA (line \' +\n *               self.lineNumber.toString() + \')\', status = status\n *             }\n *           endif\n *       in\n *         \'FCDA::FCDA_lnInst_required\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_FCDA_c_c_FCDA_lnInst_required);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_3;\nif (le) {\n\tsymbol_3 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_symbol_2;\n\ttry {\n\t\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_oclIsTypeOf;\n\t\ttry {\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_scl_c_c_LN0 = idResolver.getClass(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.CLSSid_LN0, null);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSet%&gt; DataSet = this.getDataSet();\n\t\t\tif (DataSet == null) {\n\t\t\t\tthrow new &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;(\"Null source for \\\'\\\'http://www.iec.ch/61850/2003/SCL\\\'::DataSet::AnyLN\\\'\");\n\t\t\t}\n\t\t\tfinal /*@Thrown\052/ &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN%&gt; AnyLN = DataSet.getAnyLN();\n\t\t\tfinal /*@Thrown\052/ boolean oclIsTypeOf = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation%&gt;.INSTANCE.evaluate(executor, AnyLN, TYP_scl_c_c_LN0).booleanValue();\n\t\t\tCAUGHT_oclIsTypeOf = oclIsTypeOf;\n\t\t}\n\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\tCAUGHT_oclIsTypeOf = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t}\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Boolean%&gt; not = &lt;%org.eclipse.ocl.pivot.library.logical.BooleanNotOperation%&gt;.INSTANCE.evaluate(CAUGHT_oclIsTypeOf);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; lnInst = this.getLnInst();\n\t\tfinal /*@NonInvalid\052/ boolean ne = lnInst != null;\n\t\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; status = &lt;%org.eclipse.ocl.pivot.library.logical.BooleanImpliesOperation%&gt;.INSTANCE.evaluate(not, ne);\n\t\tfinal /*@Thrown\052/ boolean symbol_0 = status == Boolean.TRUE;\n\t\t/*@Thrown\052/ &lt;%java.lang.Object%&gt; symbol_2;\n\t\tif (symbol_0) {\n\t\t\tsymbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\telse {\n\t\t\tfinal /*@NonInvalid\052/ int lineNumber = this.getLineNumber();\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_lineNumber = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; toString = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_lnInst_32_attribute_32_shall_32_be_32_specified_32_except_32_for_32_LLN0_32_in_32_FCDA_32_o_lin, toString);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__e);\n\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.TUPLid_, sum_0, status);\n\t\t\tsymbol_2 = symbol_1;\n\t\t}\n\t\tCAUGHT_symbol_2 = symbol_2;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_symbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_FCDA_c_c_FCDA_lnInst_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_2, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\tsymbol_3 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_3;'"
	 * @generated
	 */
	boolean validateFCDA_lnInst_required(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FCDA_lnInst_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv FCDA_lnInst_valid:\n *   let severity : Integer[1] = \'FCDA::FCDA_lnInst_valid\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let\n *           status : Boolean[?] = not self.DataSet.AnyLN.oclIsTypeOf(LN0) implies self.lnInst &lt;&gt; null implies\n *           self.validSclLNInst(lnInst)\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{message = \'lnInst attribute shall be a number with no more than 7 digits in FCDA (line \' +\n *               self.lineNumber.toString() + \'). \' + \'Current value is \' +\n *               self.lnInst.toString(), status = status\n *             }\n *           endif\n *       in\n *         \'FCDA::FCDA_lnInst_valid\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_FCDA_c_c_FCDA_lnInst_valid);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_3;\nif (le) {\n\tsymbol_3 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_symbol_2;\n\ttry {\n\t\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_oclIsTypeOf;\n\t\ttry {\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_scl_c_c_LN0_0 = idResolver.getClass(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.CLSSid_LN0, null);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSet%&gt; DataSet = this.getDataSet();\n\t\t\tif (DataSet == null) {\n\t\t\t\tthrow new &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;(\"Null source for \\\'\\\'http://www.iec.ch/61850/2003/SCL\\\'::DataSet::AnyLN\\\'\");\n\t\t\t}\n\t\t\tfinal /*@Thrown\052/ &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN%&gt; AnyLN = DataSet.getAnyLN();\n\t\t\tfinal /*@Thrown\052/ boolean oclIsTypeOf = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation%&gt;.INSTANCE.evaluate(executor, AnyLN, TYP_scl_c_c_LN0_0).booleanValue();\n\t\t\tCAUGHT_oclIsTypeOf = oclIsTypeOf;\n\t\t}\n\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\tCAUGHT_oclIsTypeOf = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t}\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Boolean%&gt; not = &lt;%org.eclipse.ocl.pivot.library.logical.BooleanNotOperation%&gt;.INSTANCE.evaluate(CAUGHT_oclIsTypeOf);\n\t\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_implies;\n\t\ttry {\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; lnInst_0 = this.getLnInst();\n\t\t\tfinal /*@NonInvalid\052/ boolean ne = lnInst_0 != null;\n\t\t\t/*@Thrown\052/ boolean implies;\n\t\t\tif (ne) {\n\t\t\t\tfinal /*@Thrown\052/ boolean validSclLNInst = ((&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject%&gt;)this).validSclLNInst(lnInst_0);\n\t\t\t\timplies = validSclLNInst;\n\t\t\t}\n\t\t\telse {\n\t\t\t\timplies = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t}\n\t\t\tCAUGHT_implies = implies;\n\t\t}\n\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\tCAUGHT_implies = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t}\n\t\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; status = &lt;%org.eclipse.ocl.pivot.library.logical.BooleanImpliesOperation%&gt;.INSTANCE.evaluate(not, CAUGHT_implies);\n\t\tfinal /*@Thrown\052/ boolean symbol_0 = status == Boolean.TRUE;\n\t\t/*@Thrown\052/ &lt;%java.lang.Object%&gt; symbol_2;\n\t\tif (symbol_0) {\n\t\t\tsymbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\telse {\n\t\t\tfinal /*@NonInvalid\052/ int lineNumber = this.getLineNumber();\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_lineNumber = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; toString = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_lnInst_32_attribute_32_shall_32_be_32_a_32_number_32_with_32_no_32_more_32_than_32_7_32_digits_32_in, toString);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__e__32);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_1 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_Current_32_value_32_is_32);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; lnInst_1 = this.getLnInst();\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; toString_0 = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(lnInst_1);\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; sum_2 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_1, toString_0);\n\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.TUPLid_, sum_2, status);\n\t\t\tsymbol_2 = symbol_1;\n\t\t}\n\t\tCAUGHT_symbol_2 = symbol_2;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_symbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_FCDA_c_c_FCDA_lnInst_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_2, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\tsymbol_3 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_3;'"
	 * @generated
	 */
	boolean validateFCDA_lnInst_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FCDA_empty_attributes_only_if_GSSE'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv FCDA_empty_attributes_only_if_GSSE:\n *   let\n *     severity : Integer[1] = \'FCDA::FCDA_empty_attributes_only_if_GSSE\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : Boolean[?] = (self.doName = null or self.doName.size() = 0\n *         ) and\n *         (self.daName = null or self.daName.size() = 0\n *         ) and self.ix = null and\n *         (self.ldInst = null or self.ldInst.size() = 0\n *         ) and\n *         (self.lnClass = null or self.lnClass.size() = 0\n *         ) and\n *         (self.lnInst = null or self.lnInst.size() = 0\n *         ) and\n *         (self.prefix = null or self.prefix.size() = 0\n *         ) implies self.fc = FCEnum::ST\n *       in\n *         \'FCDA::FCDA_empty_attributes_only_if_GSSE\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_FCDA_c_c_FCDA_empty_attributes_only_if_GSSE);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@Nullable\052/ &lt;%java.lang.Object%&gt; CAUGHT_result;\n\ttry {\n\t\t/*@Caught\052/ /*@Nullable\052/ &lt;%java.lang.Object%&gt; CAUGHT_and_4;\n\t\ttry {\n\t\t\t/*@Caught\052/ /*@Nullable\052/ &lt;%java.lang.Object%&gt; CAUGHT_and_3;\n\t\t\ttry {\n\t\t\t\t/*@Caught\052/ /*@Nullable\052/ &lt;%java.lang.Object%&gt; CAUGHT_and_2;\n\t\t\t\ttry {\n\t\t\t\t\t/*@Caught\052/ /*@Nullable\052/ &lt;%java.lang.Object%&gt; CAUGHT_and_1;\n\t\t\t\t\ttry {\n\t\t\t\t\t\t/*@Caught\052/ /*@Nullable\052/ &lt;%java.lang.Object%&gt; CAUGHT_and_0;\n\t\t\t\t\t\ttry {\n\t\t\t\t\t\t\t/*@Caught\052/ /*@Nullable\052/ &lt;%java.lang.Object%&gt; CAUGHT_and;\n\t\t\t\t\t\t\ttry {\n\t\t\t\t\t\t\t\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_or;\n\t\t\t\t\t\t\t\ttry {\n\t\t\t\t\t\t\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; doName = this.getDoName();\n\t\t\t\t\t\t\t\t\tfinal /*@NonInvalid\052/ boolean eq = doName == null;\n\t\t\t\t\t\t\t\t\t/*@Thrown\052/ boolean or;\n\t\t\t\t\t\t\t\t\tif (eq) {\n\t\t\t\t\t\t\t\t\t\tor = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\t\telse {\n\t\t\t\t\t\t\t\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; size = &lt;%org.eclipse.ocl.pivot.library.string.StringSizeOperation%&gt;.INSTANCE.evaluate(doName);\n\t\t\t\t\t\t\t\t\t\tfinal /*@Thrown\052/ boolean eq_0 = size.equals(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0);\n\t\t\t\t\t\t\t\t\t\tor = eq_0;\n\t\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\t\tCAUGHT_or = or;\n\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\t\t\t\t\t\tCAUGHT_or = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_or_0;\n\t\t\t\t\t\t\t\ttry {\n\t\t\t\t\t\t\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; daName = this.getDaName();\n\t\t\t\t\t\t\t\t\tfinal /*@NonInvalid\052/ boolean eq_1 = daName == null;\n\t\t\t\t\t\t\t\t\t/*@Thrown\052/ boolean or_0;\n\t\t\t\t\t\t\t\t\tif (eq_1) {\n\t\t\t\t\t\t\t\t\t\tor_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\t\telse {\n\t\t\t\t\t\t\t\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; size_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringSizeOperation%&gt;.INSTANCE.evaluate(daName);\n\t\t\t\t\t\t\t\t\t\tfinal /*@Thrown\052/ boolean eq_2 = size_0.equals(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0);\n\t\t\t\t\t\t\t\t\t\tor_0 = eq_2;\n\t\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\t\tCAUGHT_or_0 = or_0;\n\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\t\t\t\t\t\tCAUGHT_or_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; and = &lt;%org.eclipse.ocl.pivot.library.logical.BooleanAndOperation%&gt;.INSTANCE.evaluate(CAUGHT_or, CAUGHT_or_0);\n\t\t\t\t\t\t\t\tCAUGHT_and = and;\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\t\t\t\t\tCAUGHT_and = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Integer%&gt; ix = this.getIx();\n\t\t\t\t\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_ix = ix == null ? null : &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(ix);\n\t\t\t\t\t\t\tfinal /*@NonInvalid\052/ boolean eq_3 = BOXED_ix == null;\n\t\t\t\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; and_0 = &lt;%org.eclipse.ocl.pivot.library.logical.BooleanAndOperation%&gt;.INSTANCE.evaluate(CAUGHT_and, eq_3);\n\t\t\t\t\t\t\tCAUGHT_and_0 = and_0;\n\t\t\t\t\t\t}\n\t\t\t\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\t\t\t\tCAUGHT_and_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t\t\t\t}\n\t\t\t\t\t\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_or_1;\n\t\t\t\t\t\ttry {\n\t\t\t\t\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; ldInst = this.getLdInst();\n\t\t\t\t\t\t\tfinal /*@NonInvalid\052/ boolean eq_4 = ldInst == null;\n\t\t\t\t\t\t\t/*@Thrown\052/ boolean or_1;\n\t\t\t\t\t\t\tif (eq_4) {\n\t\t\t\t\t\t\t\tor_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\telse {\n\t\t\t\t\t\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; size_1 = &lt;%org.eclipse.ocl.pivot.library.string.StringSizeOperation%&gt;.INSTANCE.evaluate(ldInst);\n\t\t\t\t\t\t\t\tfinal /*@Thrown\052/ boolean eq_5 = size_1.equals(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0);\n\t\t\t\t\t\t\t\tor_1 = eq_5;\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\tCAUGHT_or_1 = or_1;\n\t\t\t\t\t\t}\n\t\t\t\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\t\t\t\tCAUGHT_or_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t\t\t\t}\n\t\t\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; and_1 = &lt;%org.eclipse.ocl.pivot.library.logical.BooleanAndOperation%&gt;.INSTANCE.evaluate(CAUGHT_and_0, CAUGHT_or_1);\n\t\t\t\t\t\tCAUGHT_and_1 = and_1;\n\t\t\t\t\t}\n\t\t\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\t\t\tCAUGHT_and_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t\t\t}\n\t\t\t\t\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_or_2;\n\t\t\t\t\ttry {\n\t\t\t\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; lnClass = this.getLnClass();\n\t\t\t\t\t\tfinal /*@NonInvalid\052/ boolean eq_6 = lnClass == null;\n\t\t\t\t\t\t/*@Thrown\052/ boolean or_2;\n\t\t\t\t\t\tif (eq_6) {\n\t\t\t\t\t\t\tor_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t\t\t\t}\n\t\t\t\t\t\telse {\n\t\t\t\t\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; size_2 = &lt;%org.eclipse.ocl.pivot.library.string.StringSizeOperation%&gt;.INSTANCE.evaluate(lnClass);\n\t\t\t\t\t\t\tfinal /*@Thrown\052/ boolean eq_7 = size_2.equals(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0);\n\t\t\t\t\t\t\tor_2 = eq_7;\n\t\t\t\t\t\t}\n\t\t\t\t\t\tCAUGHT_or_2 = or_2;\n\t\t\t\t\t}\n\t\t\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\t\t\tCAUGHT_or_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t\t\t}\n\t\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; and_2 = &lt;%org.eclipse.ocl.pivot.library.logical.BooleanAndOperation%&gt;.INSTANCE.evaluate(CAUGHT_and_1, CAUGHT_or_2);\n\t\t\t\t\tCAUGHT_and_2 = and_2;\n\t\t\t\t}\n\t\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\t\tCAUGHT_and_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t\t}\n\t\t\t\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_or_3;\n\t\t\t\ttry {\n\t\t\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; lnInst = this.getLnInst();\n\t\t\t\t\tfinal /*@NonInvalid\052/ boolean eq_8 = lnInst == null;\n\t\t\t\t\t/*@Thrown\052/ boolean or_3;\n\t\t\t\t\tif (eq_8) {\n\t\t\t\t\t\tor_3 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t\t\t}\n\t\t\t\t\telse {\n\t\t\t\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; size_3 = &lt;%org.eclipse.ocl.pivot.library.string.StringSizeOperation%&gt;.INSTANCE.evaluate(lnInst);\n\t\t\t\t\t\tfinal /*@Thrown\052/ boolean eq_9 = size_3.equals(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0);\n\t\t\t\t\t\tor_3 = eq_9;\n\t\t\t\t\t}\n\t\t\t\t\tCAUGHT_or_3 = or_3;\n\t\t\t\t}\n\t\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\t\tCAUGHT_or_3 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t\t}\n\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; and_3 = &lt;%org.eclipse.ocl.pivot.library.logical.BooleanAndOperation%&gt;.INSTANCE.evaluate(CAUGHT_and_2, CAUGHT_or_3);\n\t\t\t\tCAUGHT_and_3 = and_3;\n\t\t\t}\n\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\tCAUGHT_and_3 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t}\n\t\t\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_or_4;\n\t\t\ttry {\n\t\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; prefix = this.getPrefix();\n\t\t\t\tfinal /*@NonInvalid\052/ boolean eq_10 = prefix == null;\n\t\t\t\t/*@Thrown\052/ boolean or_4;\n\t\t\t\tif (eq_10) {\n\t\t\t\t\tor_4 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; size_4 = &lt;%org.eclipse.ocl.pivot.library.string.StringSizeOperation%&gt;.INSTANCE.evaluate(prefix);\n\t\t\t\t\tfinal /*@Thrown\052/ boolean eq_11 = size_4.equals(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0);\n\t\t\t\t\tor_4 = eq_11;\n\t\t\t\t}\n\t\t\t\tCAUGHT_or_4 = or_4;\n\t\t\t}\n\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\tCAUGHT_or_4 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t}\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; and_4 = &lt;%org.eclipse.ocl.pivot.library.logical.BooleanAndOperation%&gt;.INSTANCE.evaluate(CAUGHT_and_3, CAUGHT_or_4);\n\t\t\tCAUGHT_and_4 = and_4;\n\t\t}\n\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\tCAUGHT_and_4 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t}\n\t\tfinal /*@NonInvalid\052/ &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.FCEnum%&gt; fc = this.getFc();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.EnumerationLiteralId%&gt; BOXED_fc = fc == null ? null : &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.ENUMid_FCEnum.getEnumerationLiteralId(&lt;%org.eclipse.ocl.pivot.utilities.ClassUtil%&gt;.nonNullState(fc.getName()));\n\t\tfinal /*@NonInvalid\052/ boolean eq_12 = BOXED_fc == &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.ELITid_ST;\n\t\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; result = &lt;%org.eclipse.ocl.pivot.library.logical.BooleanImpliesOperation%&gt;.INSTANCE.evaluate(CAUGHT_and_4, eq_12);\n\t\tCAUGHT_result = result;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_result = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_FCDA_c_c_FCDA_empty_attributes_only_if_GSSE, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean validateFCDA_empty_attributes_only_if_GSSE(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FCDA_ldInst_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv FCDA_ldInst_valid:\n *   let severity : Integer[1] = \'FCDA::FCDA_ldInst_valid\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let status : Boolean[?] = self.ldInst &lt;&gt; null implies\n *           self.validSclLDInst(ldInst)\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{message = \'ldInst attribute shall be valid in FCDA (line \' +\n *               self.lineNumber.toString() + \'). \' + \'Current value is \' +\n *               self.ldInst.toString(), status = status\n *             }\n *           endif\n *       in\n *         \'FCDA::FCDA_ldInst_valid\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_FCDA_c_c_FCDA_ldInst_valid);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_2;\nif (le) {\n\tsymbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_symbol_1;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; ldInst = this.getLdInst();\n\t\tfinal /*@NonInvalid\052/ boolean ne = ldInst != null;\n\t\t/*@Thrown\052/ boolean status;\n\t\tif (ne) {\n\t\t\tfinal /*@Thrown\052/ boolean validSclLDInst = ((&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject%&gt;)this).validSclLDInst(ldInst);\n\t\t\tstatus = validSclLDInst;\n\t\t}\n\t\telse {\n\t\t\tstatus = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\t/*@Thrown\052/ &lt;%java.lang.Object%&gt; symbol_1;\n\t\tif (status) {\n\t\t\tsymbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\telse {\n\t\t\tfinal /*@NonInvalid\052/ int lineNumber = this.getLineNumber();\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_lineNumber = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; toString = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_ldInst_32_attribute_32_shall_32_be_32_valid_32_in_32_FCDA_32_o_line_32, toString);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__e__32);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_1 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_Current_32_value_32_is_32);\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; toString_0 = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(ldInst);\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; sum_2 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_1, toString_0);\n\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.TUPLid_, sum_2, status);\n\t\t\tsymbol_1 = symbol_0;\n\t\t}\n\t\tCAUGHT_symbol_1 = symbol_1;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_symbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_FCDA_c_c_FCDA_ldInst_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\tsymbol_2 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_2;'"
	 * @generated
	 */
	boolean validateFCDA_ldInst_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FCDA_prefix_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv FCDA_prefix_valid:\n *   let severity : Integer[1] = \'FCDA::FCDA_prefix_valid\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let status : Boolean[?] = self.prefix &lt;&gt; null implies\n *           self.validSclPrefix(prefix)\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{message = \'prefix attribute shall be valid in FCDA (line \' +\n *               self.lineNumber.toString() + \'). \' + \'Current value is \' +\n *               self.prefix.toString(), status = status\n *             }\n *           endif\n *       in\n *         \'FCDA::FCDA_prefix_valid\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_FCDA_c_c_FCDA_prefix_valid);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_2;\nif (le) {\n\tsymbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_symbol_1;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; prefix_0 = this.getPrefix();\n\t\tfinal /*@NonInvalid\052/ boolean ne = prefix_0 != null;\n\t\t/*@Thrown\052/ boolean status;\n\t\tif (ne) {\n\t\t\tfinal /*@Thrown\052/ boolean validSclPrefix = ((&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject%&gt;)this).validSclPrefix(prefix_0);\n\t\t\tstatus = validSclPrefix;\n\t\t}\n\t\telse {\n\t\t\tstatus = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\t/*@Thrown\052/ &lt;%java.lang.Object%&gt; symbol_1;\n\t\tif (status) {\n\t\t\tsymbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\telse {\n\t\t\tfinal /*@NonInvalid\052/ int lineNumber = this.getLineNumber();\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_lineNumber = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; toString = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_prefix_32_attribute_32_shall_32_be_32_valid_32_in_32_FCDA_32_o_line_32, toString);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__e__32);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_1 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_Current_32_value_32_is_32);\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; toString_0 = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(prefix_0);\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; sum_2 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_1, toString_0);\n\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.TUPLid_, sum_2, status);\n\t\t\tsymbol_1 = symbol_0;\n\t\t}\n\t\tCAUGHT_symbol_1 = symbol_1;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_symbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_FCDA_c_c_FCDA_prefix_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\tsymbol_2 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_2;'"
	 * @generated
	 */
	boolean validateFCDA_prefix_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FCDA_doName_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv FCDA_doName_valid:\n *   let severity : Integer[1] = \'FCDA::FCDA_doName_valid\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let status : Boolean[?] = self.doName &lt;&gt; null implies\n *           self.validSclFullDOName(doName)\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{message = \'doName attribute shall be valid in FCDA (line \' +\n *               self.lineNumber.toString() + \'). \' + \'Current value is \' +\n *               self.doName.toString(), status = status\n *             }\n *           endif\n *       in\n *         \'FCDA::FCDA_doName_valid\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_FCDA_c_c_FCDA_doName_valid);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_2;\nif (le) {\n\tsymbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_symbol_1;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; doName = this.getDoName();\n\t\tfinal /*@NonInvalid\052/ boolean ne = doName != null;\n\t\t/*@Thrown\052/ boolean status;\n\t\tif (ne) {\n\t\t\tfinal /*@Thrown\052/ boolean validSclFullDOName = ((&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject%&gt;)this).validSclFullDOName(doName);\n\t\t\tstatus = validSclFullDOName;\n\t\t}\n\t\telse {\n\t\t\tstatus = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\t/*@Thrown\052/ &lt;%java.lang.Object%&gt; symbol_1;\n\t\tif (status) {\n\t\t\tsymbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\telse {\n\t\t\tfinal /*@NonInvalid\052/ int lineNumber = this.getLineNumber();\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_lineNumber = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; toString = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_doName_32_attribute_32_shall_32_be_32_valid_32_in_32_FCDA_32_o_line_32, toString);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__e__32);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_1 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_Current_32_value_32_is_32);\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; toString_0 = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(doName);\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; sum_2 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_1, toString_0);\n\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.TUPLid_, sum_2, status);\n\t\t\tsymbol_1 = symbol_0;\n\t\t}\n\t\tCAUGHT_symbol_1 = symbol_1;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_symbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_FCDA_c_c_FCDA_doName_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\tsymbol_2 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_2;'"
	 * @generated
	 */
	boolean validateFCDA_doName_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FCDA_daName_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv FCDA_daName_valid:\n *   let severity : Integer[1] = \'FCDA::FCDA_daName_valid\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let status : Boolean[?] = self.daName &lt;&gt; null implies\n *           self.validSclFullAttributeName(daName)\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{message = \'daName attribute shall be valid in FCDA (line \' +\n *               self.lineNumber.toString() + \'). \' + \'Current value is \' +\n *               self.daName.toString(), status = status\n *             }\n *           endif\n *       in\n *         \'FCDA::FCDA_daName_valid\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_FCDA_c_c_FCDA_daName_valid);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_2;\nif (le) {\n\tsymbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_symbol_1;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; daName = this.getDaName();\n\t\tfinal /*@NonInvalid\052/ boolean ne = daName != null;\n\t\t/*@Thrown\052/ boolean status;\n\t\tif (ne) {\n\t\t\tfinal /*@Thrown\052/ boolean validSclFullAttributeName = ((&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject%&gt;)this).validSclFullAttributeName(daName);\n\t\t\tstatus = validSclFullAttributeName;\n\t\t}\n\t\telse {\n\t\t\tstatus = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\t/*@Thrown\052/ &lt;%java.lang.Object%&gt; symbol_1;\n\t\tif (status) {\n\t\t\tsymbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\telse {\n\t\t\tfinal /*@NonInvalid\052/ int lineNumber = this.getLineNumber();\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_lineNumber = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; toString = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_daName_32_attribute_32_shall_32_be_32_valid_32_in_32_FCDA_32_o_line_32, toString);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__e__32);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_1 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_Current_32_value_32_is_32);\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; toString_0 = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(daName);\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; sum_2 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_1, toString_0);\n\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.TUPLid_, sum_2, status);\n\t\t\tsymbol_1 = symbol_0;\n\t\t}\n\t\tCAUGHT_symbol_1 = symbol_1;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_symbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_FCDA_c_c_FCDA_daName_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\tsymbol_2 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_2;'"
	 * @generated
	 */
	boolean validateFCDA_daName_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FCDA_ix_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv FCDA_ix_valid:\n *   let severity : Integer[1] = \'FCDA::FCDA_ix_valid\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let status : Boolean[?] = self.ix &lt;&gt; null implies self.ix &gt;= 0\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{message = \'ix attribute shall be valid in FCDA (line \' +\n *               self.lineNumber.toString() + \'). \' + \'Current value is \' +\n *               self.ix.toString(), status = status\n *             }\n *           endif\n *       in\n *         \'FCDA::FCDA_ix_valid\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_FCDA_c_c_FCDA_ix_valid);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_2;\nif (le) {\n\tsymbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_symbol_1;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Integer%&gt; ix_0 = this.getIx();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_ix_0 = ix_0 == null ? null : &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(ix_0);\n\t\tfinal /*@NonInvalid\052/ boolean ne = BOXED_ix_0 != null;\n\t\t/*@Thrown\052/ boolean status;\n\t\tif (ne) {\n\t\t\tfinal /*@Thrown\052/ boolean ge = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation%&gt;.INSTANCE.evaluate(executor, BOXED_ix_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\t\t\tstatus = ge;\n\t\t}\n\t\telse {\n\t\t\tstatus = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\t/*@Thrown\052/ &lt;%java.lang.Object%&gt; symbol_1;\n\t\tif (status) {\n\t\t\tsymbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\telse {\n\t\t\tfinal /*@NonInvalid\052/ int lineNumber = this.getLineNumber();\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_lineNumber = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; toString = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_ix_32_attribute_32_shall_32_be_32_valid_32_in_32_FCDA_32_o_line_32, toString);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__e__32);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_1 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_Current_32_value_32_is_32);\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; toString_0 = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_ix_0);\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; sum_2 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_1, toString_0);\n\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.TUPLid_, sum_2, status);\n\t\t\tsymbol_1 = symbol_0;\n\t\t}\n\t\tCAUGHT_symbol_1 = symbol_1;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_symbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_FCDA_c_c_FCDA_ix_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\tsymbol_2 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_2;'"
	 * @generated
	 */
	boolean validateFCDA_ix_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

} // FCDA
