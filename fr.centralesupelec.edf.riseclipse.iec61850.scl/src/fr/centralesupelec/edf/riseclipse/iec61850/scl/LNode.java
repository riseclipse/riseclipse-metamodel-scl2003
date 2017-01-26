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
 * A representation of the model object '<em><b>LNode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getIedName <em>Ied Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLdInst <em>Ld Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLnClass <em>Ln Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLnInst <em>Ln Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLnType <em>Ln Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getIED <em>IED</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLDevice <em>LDevice</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLN <em>LN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLNodeContainer <em>LNode Container</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLNode()
 * @model
 * @generated
 */
public interface LNode extends UnNaming {
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLNode_IedName()
     * @model unsettable="true"
     * @generated
     */
    String getIedName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getIedName <em>Ied Name</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getIedName <em>Ied Name</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetIedName()
     * @see #getIedName()
     * @see #setIedName(String)
     * @generated
     */
    void unsetIedName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getIedName <em>Ied Name</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLNode_LdInst()
     * @model unique="false" unsettable="true"
     * @generated
     */
    String getLdInst();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLdInst <em>Ld Inst</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLdInst <em>Ld Inst</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetLdInst()
     * @see #getLdInst()
     * @see #setLdInst(String)
     * @generated
     */
    void unsetLdInst();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLdInst <em>Ld Inst</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLNode_LnClass()
     * @model unique="false" unsettable="true"
     * @generated
     */
    String getLnClass();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLnClass <em>Ln Class</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLnClass <em>Ln Class</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetLnClass()
     * @see #getLnClass()
     * @see #setLnClass(String)
     * @generated
     */
    void unsetLnClass();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLnClass <em>Ln Class</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLNode_LnInst()
     * @model unique="false" unsettable="true"
     * @generated
     */
    String getLnInst();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLnInst <em>Ln Inst</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLnInst <em>Ln Inst</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetLnInst()
     * @see #getLnInst()
     * @see #setLnInst(String)
     * @generated
     */
    void unsetLnInst();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLnInst <em>Ln Inst</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Ln Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ln Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ln Type</em>' attribute.
     * @see #isSetLnType()
     * @see #unsetLnType()
     * @see #setLnType(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLNode_LnType()
     * @model unsettable="true"
     * @generated
     */
    String getLnType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLnType <em>Ln Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ln Type</em>' attribute.
     * @see #isSetLnType()
     * @see #unsetLnType()
     * @see #getLnType()
     * @generated
     */
    void setLnType( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLnType <em>Ln Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLnType()
     * @see #getLnType()
     * @see #setLnType(String)
     * @generated
     */
    void unsetLnType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLnType <em>Ln Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ln Type</em>' attribute is set.
     * @see #unsetLnType()
     * @see #getLnType()
     * @see #setLnType(String)
     * @generated
     */
    boolean isSetLnType();

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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLNode_Prefix()
     * @model default="" unsettable="true"
     * @generated
     */
    String getPrefix();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getPrefix <em>Prefix</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getPrefix <em>Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPrefix()
     * @see #getPrefix()
     * @see #setPrefix(String)
     * @generated
     */
    void unsetPrefix();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getPrefix <em>Prefix</em>}' attribute is set.
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
     * Returns the value of the '<em><b>IED</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getLNode <em>LNode</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>IED</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>IED</em>' reference.
     * @see #isSetIED()
     * @see #unsetIED()
     * @see #setIED(IED)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLNode_IED()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getLNode
     * @model opposite="LNode" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    IED getIED();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getIED <em>IED</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>IED</em>' reference.
     * @see #isSetIED()
     * @see #unsetIED()
     * @see #getIED()
     * @generated
     */
    void setIED( IED value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getIED <em>IED</em>}' reference.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetIED()
     * @see #getIED()
     * @see #setIED(IED)
     * @generated
     */
    void unsetIED();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getIED <em>IED</em>}' reference is set.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @return whether the value of the '<em>IED</em>' reference is set.
     * @see #unsetIED()
     * @see #getIED()
     * @see #setIED(IED)
     * @generated
     */
    boolean isSetIED();

    /**
     * Returns the value of the '<em><b>LDevice</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getLNode <em>LNode</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>LDevice</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>LDevice</em>' reference.
     * @see #isSetLDevice()
     * @see #unsetLDevice()
     * @see #setLDevice(LDevice)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLNode_LDevice()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getLNode
     * @model opposite="LNode" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    LDevice getLDevice();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLDevice <em>LDevice</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>LDevice</em>' reference.
     * @see #isSetLDevice()
     * @see #unsetLDevice()
     * @see #getLDevice()
     * @generated
     */
    void setLDevice( LDevice value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLDevice <em>LDevice</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLDevice()
     * @see #getLDevice()
     * @see #setLDevice(LDevice)
     * @generated
     */
    void unsetLDevice();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLDevice <em>LDevice</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>LDevice</em>' reference is set.
     * @see #unsetLDevice()
     * @see #getLDevice()
     * @see #setLDevice(LDevice)
     * @generated
     */
    boolean isSetLDevice();

    /**
     * Returns the value of the '<em><b>LN</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN#getLNode <em>LNode</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>LN</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>LN</em>' reference.
     * @see #isSetLN()
     * @see #unsetLN()
     * @see #setLN(LN)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLNode_LN()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LN#getLNode
     * @model opposite="LNode" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    LN getLN();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLN <em>LN</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>LN</em>' reference.
     * @see #isSetLN()
     * @see #unsetLN()
     * @see #getLN()
     * @generated
     */
    void setLN( LN value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLN <em>LN</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLN()
     * @see #getLN()
     * @see #setLN(LN)
     * @generated
     */
    void unsetLN();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLN <em>LN</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>LN</em>' reference is set.
     * @see #unsetLN()
     * @see #getLN()
     * @see #setLN(LN)
     * @generated
     */
    boolean isSetLN();

    /**
     * Returns the value of the '<em><b>LNode Container</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeContainer#getLNode <em>LNode</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>LNode Container</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>LNode Container</em>' container reference.
     * @see #setLNodeContainer(LNodeContainer)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLNode_LNodeContainer()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeContainer#getLNode
     * @model opposite="LNode" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    LNodeContainer getLNodeContainer();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLNodeContainer <em>LNode Container</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>LNode Container</em>' container reference.
     * @see #getLNodeContainer()
     * @generated
     */
    void setLNodeContainer( LNodeContainer value );

} // LNode
