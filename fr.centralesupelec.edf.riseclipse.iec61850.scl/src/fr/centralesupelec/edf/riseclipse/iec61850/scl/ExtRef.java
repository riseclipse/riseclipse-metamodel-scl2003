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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ext Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getDaName <em>Da Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getDoName <em>Do Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getIedName <em>Ied Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getIntAddr <em>Int Addr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getLdInst <em>Ld Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getLnClass <em>Ln Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getLnInst <em>Ln Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getSrcCBName <em>Src CB Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getSrcLDInst <em>Src LD Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getSrcLNClass <em>Src LN Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getSrcLNInst <em>Src LN Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getSrcPrefix <em>Src Prefix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getInputs <em>Inputs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getRefersToAnyLN <em>Refers To Any LN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getRefersToDataAttribute <em>Refers To Data Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getRefersToDataObject <em>Refers To Data Object</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getDesc <em>Desc</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getExtRef()
 * @model
 * @generated
 */
public interface ExtRef extends BaseElement {
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getExtRef_DaName()
     * @model unsettable="true"
     * @generated
     */
    String getDaName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getDaName <em>Da Name</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getDaName <em>Da Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDaName()
     * @see #getDaName()
     * @see #setDaName(String)
     * @generated
     */
    void unsetDaName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getDaName <em>Da Name</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getExtRef_DoName()
     * @model unsettable="true"
     * @generated
     */
    String getDoName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getDoName <em>Do Name</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getDoName <em>Do Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDoName()
     * @see #getDoName()
     * @see #setDoName(String)
     * @generated
     */
    void unsetDoName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getDoName <em>Do Name</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Ied Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ied Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ied Name</em>' attribute.
     * @see #isSetIedName()
     * @see #unsetIedName()
     * @see #setIedName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getExtRef_IedName()
     * @model unsettable="true"
     * @generated
     */
    String getIedName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getIedName <em>Ied Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ied Name</em>' attribute.
     * @see #isSetIedName()
     * @see #unsetIedName()
     * @see #getIedName()
     * @generated
     */
    void setIedName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getIedName <em>Ied Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIedName()
     * @see #getIedName()
     * @see #setIedName(String)
     * @generated
     */
    void unsetIedName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getIedName <em>Ied Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ied Name</em>' attribute is set.
     * @see #unsetIedName()
     * @see #getIedName()
     * @see #setIedName(String)
     * @generated
     */
    boolean isSetIedName();

    /**
     * Returns the value of the '<em><b>Int Addr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Int Addr</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Int Addr</em>' attribute.
     * @see #isSetIntAddr()
     * @see #unsetIntAddr()
     * @see #setIntAddr(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getExtRef_IntAddr()
     * @model unsettable="true"
     * @generated
     */
    String getIntAddr();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getIntAddr <em>Int Addr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Int Addr</em>' attribute.
     * @see #isSetIntAddr()
     * @see #unsetIntAddr()
     * @see #getIntAddr()
     * @generated
     */
    void setIntAddr( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getIntAddr <em>Int Addr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIntAddr()
     * @see #getIntAddr()
     * @see #setIntAddr(String)
     * @generated
     */
    void unsetIntAddr();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getIntAddr <em>Int Addr</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Int Addr</em>' attribute is set.
     * @see #unsetIntAddr()
     * @see #getIntAddr()
     * @see #setIntAddr(String)
     * @generated
     */
    boolean isSetIntAddr();

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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getExtRef_LdInst()
     * @model unsettable="true"
     * @generated
     */
    String getLdInst();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getLdInst <em>Ld Inst</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getLdInst <em>Ld Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLdInst()
     * @see #getLdInst()
     * @see #setLdInst(String)
     * @generated
     */
    void unsetLdInst();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getLdInst <em>Ld Inst</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getExtRef_LnClass()
     * @model unsettable="true"
     * @generated
     */
    String getLnClass();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getLnClass <em>Ln Class</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getLnClass <em>Ln Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLnClass()
     * @see #getLnClass()
     * @see #setLnClass(String)
     * @generated
     */
    void unsetLnClass();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getLnClass <em>Ln Class</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getExtRef_LnInst()
     * @model unsettable="true"
     * @generated
     */
    String getLnInst();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getLnInst <em>Ln Inst</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getLnInst <em>Ln Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLnInst()
     * @see #getLnInst()
     * @see #setLnInst(String)
     * @generated
     */
    void unsetLnInst();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getLnInst <em>Ln Inst</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getExtRef_Prefix()
     * @model unsettable="true"
     * @generated
     */
    String getPrefix();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getPrefix <em>Prefix</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getPrefix <em>Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPrefix()
     * @see #getPrefix()
     * @see #setPrefix(String)
     * @generated
     */
    void unsetPrefix();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getPrefix <em>Prefix</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Service Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Service Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceType
     * @see #isSetServiceType()
     * @see #unsetServiceType()
     * @see #setServiceType(ServiceType)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getExtRef_ServiceType()
     * @model unsettable="true"
     * @generated
     */
    ServiceType getServiceType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getServiceType <em>Service Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Service Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceType
     * @see #isSetServiceType()
     * @see #unsetServiceType()
     * @see #getServiceType()
     * @generated
     */
    void setServiceType( ServiceType value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getServiceType <em>Service Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetServiceType()
     * @see #getServiceType()
     * @see #setServiceType(ServiceType)
     * @generated
     */
    void unsetServiceType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getServiceType <em>Service Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Service Type</em>' attribute is set.
     * @see #unsetServiceType()
     * @see #getServiceType()
     * @see #setServiceType(ServiceType)
     * @generated
     */
    boolean isSetServiceType();

    /**
     * Returns the value of the '<em><b>Src CB Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Src CB Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Src CB Name</em>' attribute.
     * @see #isSetSrcCBName()
     * @see #unsetSrcCBName()
     * @see #setSrcCBName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getExtRef_SrcCBName()
     * @model unsettable="true"
     * @generated
     */
    String getSrcCBName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getSrcCBName <em>Src CB Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Src CB Name</em>' attribute.
     * @see #isSetSrcCBName()
     * @see #unsetSrcCBName()
     * @see #getSrcCBName()
     * @generated
     */
    void setSrcCBName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getSrcCBName <em>Src CB Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSrcCBName()
     * @see #getSrcCBName()
     * @see #setSrcCBName(String)
     * @generated
     */
    void unsetSrcCBName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getSrcCBName <em>Src CB Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Src CB Name</em>' attribute is set.
     * @see #unsetSrcCBName()
     * @see #getSrcCBName()
     * @see #setSrcCBName(String)
     * @generated
     */
    boolean isSetSrcCBName();

    /**
     * Returns the value of the '<em><b>Src LD Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Src LD Inst</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Src LD Inst</em>' attribute.
     * @see #isSetSrcLDInst()
     * @see #unsetSrcLDInst()
     * @see #setSrcLDInst(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getExtRef_SrcLDInst()
     * @model unsettable="true"
     * @generated
     */
    String getSrcLDInst();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getSrcLDInst <em>Src LD Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Src LD Inst</em>' attribute.
     * @see #isSetSrcLDInst()
     * @see #unsetSrcLDInst()
     * @see #getSrcLDInst()
     * @generated
     */
    void setSrcLDInst( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getSrcLDInst <em>Src LD Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSrcLDInst()
     * @see #getSrcLDInst()
     * @see #setSrcLDInst(String)
     * @generated
     */
    void unsetSrcLDInst();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getSrcLDInst <em>Src LD Inst</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Src LD Inst</em>' attribute is set.
     * @see #unsetSrcLDInst()
     * @see #getSrcLDInst()
     * @see #setSrcLDInst(String)
     * @generated
     */
    boolean isSetSrcLDInst();

    /**
     * Returns the value of the '<em><b>Src LN Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Src LN Class</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Src LN Class</em>' attribute.
     * @see #isSetSrcLNClass()
     * @see #unsetSrcLNClass()
     * @see #setSrcLNClass(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getExtRef_SrcLNClass()
     * @model unsettable="true"
     * @generated
     */
    String getSrcLNClass();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getSrcLNClass <em>Src LN Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Src LN Class</em>' attribute.
     * @see #isSetSrcLNClass()
     * @see #unsetSrcLNClass()
     * @see #getSrcLNClass()
     * @generated
     */
    void setSrcLNClass( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getSrcLNClass <em>Src LN Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSrcLNClass()
     * @see #getSrcLNClass()
     * @see #setSrcLNClass(String)
     * @generated
     */
    void unsetSrcLNClass();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getSrcLNClass <em>Src LN Class</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Src LN Class</em>' attribute is set.
     * @see #unsetSrcLNClass()
     * @see #getSrcLNClass()
     * @see #setSrcLNClass(String)
     * @generated
     */
    boolean isSetSrcLNClass();

    /**
     * Returns the value of the '<em><b>Src LN Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Src LN Inst</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Src LN Inst</em>' attribute.
     * @see #isSetSrcLNInst()
     * @see #unsetSrcLNInst()
     * @see #setSrcLNInst(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getExtRef_SrcLNInst()
     * @model unsettable="true"
     * @generated
     */
    String getSrcLNInst();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getSrcLNInst <em>Src LN Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Src LN Inst</em>' attribute.
     * @see #isSetSrcLNInst()
     * @see #unsetSrcLNInst()
     * @see #getSrcLNInst()
     * @generated
     */
    void setSrcLNInst( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getSrcLNInst <em>Src LN Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSrcLNInst()
     * @see #getSrcLNInst()
     * @see #setSrcLNInst(String)
     * @generated
     */
    void unsetSrcLNInst();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getSrcLNInst <em>Src LN Inst</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Src LN Inst</em>' attribute is set.
     * @see #unsetSrcLNInst()
     * @see #getSrcLNInst()
     * @see #setSrcLNInst(String)
     * @generated
     */
    boolean isSetSrcLNInst();

    /**
     * Returns the value of the '<em><b>Src Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Src Prefix</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Src Prefix</em>' attribute.
     * @see #isSetSrcPrefix()
     * @see #unsetSrcPrefix()
     * @see #setSrcPrefix(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getExtRef_SrcPrefix()
     * @model unsettable="true"
     * @generated
     */
    String getSrcPrefix();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getSrcPrefix <em>Src Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Src Prefix</em>' attribute.
     * @see #isSetSrcPrefix()
     * @see #unsetSrcPrefix()
     * @see #getSrcPrefix()
     * @generated
     */
    void setSrcPrefix( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getSrcPrefix <em>Src Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSrcPrefix()
     * @see #getSrcPrefix()
     * @see #setSrcPrefix(String)
     * @generated
     */
    void unsetSrcPrefix();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getSrcPrefix <em>Src Prefix</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Src Prefix</em>' attribute is set.
     * @see #unsetSrcPrefix()
     * @see #getSrcPrefix()
     * @see #setSrcPrefix(String)
     * @generated
     */
    boolean isSetSrcPrefix();

    /**
     * Returns the value of the '<em><b>Inputs</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Inputs#getExtRef <em>Ext Ref</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Inputs</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Inputs</em>' container reference.
     * @see #setInputs(Inputs)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getExtRef_Inputs()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Inputs#getExtRef
     * @model opposite="ExtRef" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    Inputs getInputs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getInputs <em>Inputs</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Inputs</em>' container reference.
     * @see #getInputs()
     * @generated
     */
    void setInputs( Inputs value );

    /**
     * Returns the value of the '<em><b>Refers To Any LN</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReferredByExtRef <em>Referred By Ext Ref</em>}'.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getExtRef_RefersToAnyLN()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReferredByExtRef
     * @model opposite="ReferredByExtRef" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    AnyLN getRefersToAnyLN();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getRefersToAnyLN <em>Refers To Any LN</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getRefersToAnyLN <em>Refers To Any LN</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToAnyLN()
     * @see #getRefersToAnyLN()
     * @see #setRefersToAnyLN(AnyLN)
     * @generated
     */
    void unsetRefersToAnyLN();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getRefersToAnyLN <em>Refers To Any LN</em>}' reference is set.
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
     * Returns the value of the '<em><b>Refers To Data Attribute</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataAttribute#getReferredByExtRef <em>Referred By Ext Ref</em>}'.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getExtRef_RefersToDataAttribute()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DataAttribute#getReferredByExtRef
     * @model opposite="ReferredByExtRef" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    DataAttribute getRefersToDataAttribute();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getRefersToDataAttribute <em>Refers To Data Attribute</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getRefersToDataAttribute <em>Refers To Data Attribute</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToDataAttribute()
     * @see #getRefersToDataAttribute()
     * @see #setRefersToDataAttribute(DataAttribute)
     * @generated
     */
    void unsetRefersToDataAttribute();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getRefersToDataAttribute <em>Refers To Data Attribute</em>}' reference is set.
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
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataObject#getReferredByExtRef <em>Referred By Ext Ref</em>}'.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getExtRef_RefersToDataObject()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DataObject#getReferredByExtRef
     * @model opposite="ReferredByExtRef" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    DataObject getRefersToDataObject();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getRefersToDataObject <em>Refers To Data Object</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getRefersToDataObject <em>Refers To Data Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToDataObject()
     * @see #getRefersToDataObject()
     * @see #setRefersToDataObject(DataObject)
     * @generated
     */
    void unsetRefersToDataObject();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getRefersToDataObject <em>Refers To Data Object</em>}' reference is set.
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
     * Returns the value of the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Desc</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Desc</em>' attribute.
     * @see #isSetDesc()
     * @see #unsetDesc()
     * @see #setDesc(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getExtRef_Desc()
     * @model unsettable="true"
     * @generated
     */
    String getDesc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getDesc <em>Desc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Desc</em>' attribute.
     * @see #isSetDesc()
     * @see #unsetDesc()
     * @see #getDesc()
     * @generated
     */
    void setDesc(String value);

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getDesc <em>Desc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDesc()
     * @see #getDesc()
     * @see #setDesc(String)
     * @generated
     */
    void unsetDesc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getDesc <em>Desc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Desc</em>' attribute is set.
     * @see #unsetDesc()
     * @see #getDesc()
     * @see #setDesc(String)
     * @generated
     */
    boolean isSetDesc();

} // ExtRef
