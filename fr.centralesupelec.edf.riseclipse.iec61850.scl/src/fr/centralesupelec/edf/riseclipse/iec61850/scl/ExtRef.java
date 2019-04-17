/**
 *  Copyright (c) 2018 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
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
 *      http://wdi.supelec.fr/software/RiseClipse/
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
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getParentInputs <em>Parent Inputs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getRefersToAbstractDataAttribute <em>Refers To Abstract Data Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getRefersToDOType <em>Refers To DO Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getPServT <em>PServ T</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getPLN <em>PLN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getPDO <em>PDO</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getPDA <em>PDA</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getRefersToControl <em>Refers To Control</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getExtRef()
 * @model
 * @generated
 */
public interface ExtRef extends BaseElement, AgDesc {
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getExtRef_Prefix()
     * @model default="" unsettable="true"
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
     * Returns the value of the '<em><b>Parent Inputs</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Inputs#getExtRef <em>Ext Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Inputs</em>' container reference.
     * @see #setParentInputs(Inputs)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getExtRef_ParentInputs()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Inputs#getExtRef
     * @model opposite="ExtRef" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    Inputs getParentInputs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getParentInputs <em>Parent Inputs</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Inputs</em>' container reference.
     * @see #getParentInputs()
     * @generated
     */
    void setParentInputs(Inputs value);

    /**
     * Returns the value of the '<em><b>Refers To Abstract Data Attribute</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getReferredByExtRef <em>Referred By Ext Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Abstract Data Attribute</em>' reference.
     * @see #isSetRefersToAbstractDataAttribute()
     * @see #unsetRefersToAbstractDataAttribute()
     * @see #setRefersToAbstractDataAttribute(AbstractDataAttribute)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getExtRef_RefersToAbstractDataAttribute()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getReferredByExtRef
     * @model opposite="ReferredByExtRef" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    AbstractDataAttribute getRefersToAbstractDataAttribute();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getRefersToAbstractDataAttribute <em>Refers To Abstract Data Attribute</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Abstract Data Attribute</em>' reference.
     * @see #isSetRefersToAbstractDataAttribute()
     * @see #unsetRefersToAbstractDataAttribute()
     * @see #getRefersToAbstractDataAttribute()
     * @generated
     */
    void setRefersToAbstractDataAttribute(AbstractDataAttribute value);

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getRefersToAbstractDataAttribute <em>Refers To Abstract Data Attribute</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToAbstractDataAttribute()
     * @see #getRefersToAbstractDataAttribute()
     * @see #setRefersToAbstractDataAttribute(AbstractDataAttribute)
     * @generated
     */
    void unsetRefersToAbstractDataAttribute();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getRefersToAbstractDataAttribute <em>Refers To Abstract Data Attribute</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Abstract Data Attribute</em>' reference is set.
     * @see #unsetRefersToAbstractDataAttribute()
     * @see #getRefersToAbstractDataAttribute()
     * @see #setRefersToAbstractDataAttribute(AbstractDataAttribute)
     * @generated
     */
    boolean isSetRefersToAbstractDataAttribute();

    /**
     * Returns the value of the '<em><b>Refers To DO Type</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getReferredByExtRef <em>Referred By Ext Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To DO Type</em>' reference.
     * @see #isSetRefersToDOType()
     * @see #unsetRefersToDOType()
     * @see #setRefersToDOType(DOType)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getExtRef_RefersToDOType()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getReferredByExtRef
     * @model opposite="ReferredByExtRef" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    DOType getRefersToDOType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getRefersToDOType <em>Refers To DO Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To DO Type</em>' reference.
     * @see #isSetRefersToDOType()
     * @see #unsetRefersToDOType()
     * @see #getRefersToDOType()
     * @generated
     */
    void setRefersToDOType(DOType value);

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getRefersToDOType <em>Refers To DO Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToDOType()
     * @see #getRefersToDOType()
     * @see #setRefersToDOType(DOType)
     * @generated
     */
    void unsetRefersToDOType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getRefersToDOType <em>Refers To DO Type</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To DO Type</em>' reference is set.
     * @see #unsetRefersToDOType()
     * @see #getRefersToDOType()
     * @see #setRefersToDOType(DOType)
     * @generated
     */
    boolean isSetRefersToDOType();

    /**
     * Returns the value of the '<em><b>PServ T</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PServ T</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PServ T</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceType
     * @see #isSetPServT()
     * @see #unsetPServT()
     * @see #setPServT(ServiceType)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getExtRef_PServT()
     * @model unsettable="true"
     * @generated
     */
    ServiceType getPServT();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getPServT <em>PServ T</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PServ T</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceType
     * @see #isSetPServT()
     * @see #unsetPServT()
     * @see #getPServT()
     * @generated
     */
    void setPServT(ServiceType value);

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getPServT <em>PServ T</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPServT()
     * @see #getPServT()
     * @see #setPServT(ServiceType)
     * @generated
     */
    void unsetPServT();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getPServT <em>PServ T</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>PServ T</em>' attribute is set.
     * @see #unsetPServT()
     * @see #getPServT()
     * @see #setPServT(ServiceType)
     * @generated
     */
    boolean isSetPServT();

    /**
     * Returns the value of the '<em><b>PLN</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PLN</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PLN</em>' attribute.
     * @see #isSetPLN()
     * @see #unsetPLN()
     * @see #setPLN(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getExtRef_PLN()
     * @model unsettable="true"
     * @generated
     */
    String getPLN();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getPLN <em>PLN</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PLN</em>' attribute.
     * @see #isSetPLN()
     * @see #unsetPLN()
     * @see #getPLN()
     * @generated
     */
    void setPLN(String value);

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getPLN <em>PLN</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPLN()
     * @see #getPLN()
     * @see #setPLN(String)
     * @generated
     */
    void unsetPLN();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getPLN <em>PLN</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>PLN</em>' attribute is set.
     * @see #unsetPLN()
     * @see #getPLN()
     * @see #setPLN(String)
     * @generated
     */
    boolean isSetPLN();

    /**
     * Returns the value of the '<em><b>PDO</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PDO</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PDO</em>' attribute.
     * @see #isSetPDO()
     * @see #unsetPDO()
     * @see #setPDO(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getExtRef_PDO()
     * @model unsettable="true"
     * @generated
     */
    String getPDO();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getPDO <em>PDO</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PDO</em>' attribute.
     * @see #isSetPDO()
     * @see #unsetPDO()
     * @see #getPDO()
     * @generated
     */
    void setPDO(String value);

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getPDO <em>PDO</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPDO()
     * @see #getPDO()
     * @see #setPDO(String)
     * @generated
     */
    void unsetPDO();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getPDO <em>PDO</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>PDO</em>' attribute is set.
     * @see #unsetPDO()
     * @see #getPDO()
     * @see #setPDO(String)
     * @generated
     */
    boolean isSetPDO();

    /**
     * Returns the value of the '<em><b>PDA</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PDA</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PDA</em>' attribute.
     * @see #isSetPDA()
     * @see #unsetPDA()
     * @see #setPDA(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getExtRef_PDA()
     * @model unsettable="true"
     * @generated
     */
    String getPDA();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getPDA <em>PDA</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PDA</em>' attribute.
     * @see #isSetPDA()
     * @see #unsetPDA()
     * @see #getPDA()
     * @generated
     */
    void setPDA(String value);

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getPDA <em>PDA</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPDA()
     * @see #getPDA()
     * @see #setPDA(String)
     * @generated
     */
    void unsetPDA();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getPDA <em>PDA</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>PDA</em>' attribute is set.
     * @see #unsetPDA()
     * @see #getPDA()
     * @see #setPDA(String)
     * @generated
     */
    boolean isSetPDA();

    /**
     * Returns the value of the '<em><b>Refers To Control</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Control#getReferredByExtRef <em>Referred By Ext Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Control</em>' reference.
     * @see #isSetRefersToControl()
     * @see #unsetRefersToControl()
     * @see #setRefersToControl(Control)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getExtRef_RefersToControl()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Control#getReferredByExtRef
     * @model opposite="ReferredByExtRef" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    Control getRefersToControl();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getRefersToControl <em>Refers To Control</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Control</em>' reference.
     * @see #isSetRefersToControl()
     * @see #unsetRefersToControl()
     * @see #getRefersToControl()
     * @generated
     */
    void setRefersToControl(Control value);

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getRefersToControl <em>Refers To Control</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToControl()
     * @see #getRefersToControl()
     * @see #setRefersToControl(Control)
     * @generated
     */
    void unsetRefersToControl();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getRefersToControl <em>Refers To Control</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Control</em>' reference is set.
     * @see #unsetRefersToControl()
     * @see #getRefersToControl()
     * @see #setRefersToControl(Control)
     * @generated
     */
    boolean isSetRefersToControl();

} // ExtRef
