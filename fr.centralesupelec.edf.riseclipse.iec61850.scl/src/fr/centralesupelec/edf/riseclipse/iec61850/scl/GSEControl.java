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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSE Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getAppID <em>App ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getFixedOffs <em>Fixed Offs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getSecurityEnable <em>Security Enable</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getParentLN0 <em>Parent LN0</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGSEControl()
 * @model
 * @generated
 */
public interface GSEControl extends ControlWithIEDName {
    /**
     * Returns the value of the '<em><b>App ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>App ID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>App ID</em>' attribute.
     * @see #isSetAppID()
     * @see #unsetAppID()
     * @see #setAppID(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGSEControl_AppID()
     * @model unsettable="true"
     * @generated
     */
    String getAppID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getAppID <em>App ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>App ID</em>' attribute.
     * @see #isSetAppID()
     * @see #unsetAppID()
     * @see #getAppID()
     * @generated
     */
    void setAppID( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getAppID <em>App ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAppID()
     * @see #getAppID()
     * @see #setAppID(String)
     * @generated
     */
    void unsetAppID();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getAppID <em>App ID</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>App ID</em>' attribute is set.
     * @see #unsetAppID()
     * @see #getAppID()
     * @see #setAppID(String)
     * @generated
     */
    boolean isSetAppID();

    /**
     * Returns the value of the '<em><b>Fixed Offs</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fixed Offs</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fixed Offs</em>' attribute.
     * @see #isSetFixedOffs()
     * @see #unsetFixedOffs()
     * @see #setFixedOffs(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGSEControl_FixedOffs()
     * @model default="false" unsettable="true"
     * @generated
     */
    Boolean getFixedOffs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getFixedOffs <em>Fixed Offs</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fixed Offs</em>' attribute.
     * @see #isSetFixedOffs()
     * @see #unsetFixedOffs()
     * @see #getFixedOffs()
     * @generated
     */
    void setFixedOffs( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getFixedOffs <em>Fixed Offs</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetFixedOffs()
     * @see #getFixedOffs()
     * @see #setFixedOffs(Boolean)
     * @generated
     */
    void unsetFixedOffs();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getFixedOffs <em>Fixed Offs</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fixed Offs</em>' attribute is set.
     * @see #unsetFixedOffs()
     * @see #getFixedOffs()
     * @see #setFixedOffs(Boolean)
     * @generated
     */
    boolean isSetFixedOffs();

    /**
     * Returns the value of the '<em><b>Security Enable</b></em>' attribute.
     * The default value is <code>"None"</code>.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.PredefinedTypeOfSecurityEnum}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Security Enable</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Security Enable</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.PredefinedTypeOfSecurityEnum
     * @see #isSetSecurityEnable()
     * @see #unsetSecurityEnable()
     * @see #setSecurityEnable(PredefinedTypeOfSecurityEnum)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGSEControl_SecurityEnable()
     * @model default="None" unsettable="true"
     * @generated
     */
    PredefinedTypeOfSecurityEnum getSecurityEnable();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getSecurityEnable <em>Security Enable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Security Enable</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.PredefinedTypeOfSecurityEnum
     * @see #isSetSecurityEnable()
     * @see #unsetSecurityEnable()
     * @see #getSecurityEnable()
     * @generated
     */
    void setSecurityEnable( PredefinedTypeOfSecurityEnum value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getSecurityEnable <em>Security Enable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSecurityEnable()
     * @see #getSecurityEnable()
     * @see #setSecurityEnable(PredefinedTypeOfSecurityEnum)
     * @generated
     */
    void unsetSecurityEnable();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getSecurityEnable <em>Security Enable</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Security Enable</em>' attribute is set.
     * @see #unsetSecurityEnable()
     * @see #getSecurityEnable()
     * @see #setSecurityEnable(PredefinedTypeOfSecurityEnum)
     * @generated
     */
    boolean isSetSecurityEnable();

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The default value is <code>"GOOSE"</code>.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControlTypeEnum}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControlTypeEnum
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(GSEControlTypeEnum)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGSEControl_Type()
     * @model default="GOOSE" unsettable="true"
     * @generated
     */
    GSEControlTypeEnum getType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControlTypeEnum
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     * @generated
     */
    void setType( GSEControlTypeEnum value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(GSEControlTypeEnum)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getType <em>Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type</em>' attribute is set.
     * @see #unsetType()
     * @see #getType()
     * @see #setType(GSEControlTypeEnum)
     * @generated
     */
    boolean isSetType();

    /**
     * Returns the value of the '<em><b>Parent LN0</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0#getGSEControl <em>GSE Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent LN0</em>' container reference.
     * @see #setParentLN0(LN0)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGSEControl_ParentLN0()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0#getGSEControl
     * @model opposite="GSEControl" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    LN0 getParentLN0();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getParentLN0 <em>Parent LN0</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent LN0</em>' container reference.
     * @see #getParentLN0()
     * @generated
     */
    void setParentLN0( LN0 value );

} // GSEControl
