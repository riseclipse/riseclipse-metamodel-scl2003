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
 * A representation of the model object '<em><b>Setting Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl#getActSG <em>Act SG</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl#getNumOfSGs <em>Num Of SGs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl#getResvTms <em>Resv Tms</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl#getParentLN0 <em>Parent LN0</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSettingControl()
 * @model
 * @generated
 */
public interface SettingControl extends UnNaming {
    /**
     * Returns the value of the '<em><b>Act SG</b></em>' attribute.
     * The default value is <code>"1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Act SG</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Act SG</em>' attribute.
     * @see #isSetActSG()
     * @see #unsetActSG()
     * @see #setActSG(Integer)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSettingControl_ActSG()
     * @model default="1" unsettable="true"
     * @generated
     */
    Integer getActSG();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl#getActSG <em>Act SG</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Act SG</em>' attribute.
     * @see #isSetActSG()
     * @see #unsetActSG()
     * @see #getActSG()
     * @generated
     */
    void setActSG( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl#getActSG <em>Act SG</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetActSG()
     * @see #getActSG()
     * @see #setActSG(Integer)
     * @generated
     */
    void unsetActSG();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl#getActSG <em>Act SG</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Act SG</em>' attribute is set.
     * @see #unsetActSG()
     * @see #getActSG()
     * @see #setActSG(Integer)
     * @generated
     */
    boolean isSetActSG();

    /**
     * Returns the value of the '<em><b>Num Of SGs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Num Of SGs</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Num Of SGs</em>' attribute.
     * @see #isSetNumOfSGs()
     * @see #unsetNumOfSGs()
     * @see #setNumOfSGs(Integer)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSettingControl_NumOfSGs()
     * @model unsettable="true"
     * @generated
     */
    Integer getNumOfSGs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl#getNumOfSGs <em>Num Of SGs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Num Of SGs</em>' attribute.
     * @see #isSetNumOfSGs()
     * @see #unsetNumOfSGs()
     * @see #getNumOfSGs()
     * @generated
     */
    void setNumOfSGs( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl#getNumOfSGs <em>Num Of SGs</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetNumOfSGs()
     * @see #getNumOfSGs()
     * @see #setNumOfSGs(Integer)
     * @generated
     */
    void unsetNumOfSGs();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl#getNumOfSGs <em>Num Of SGs</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Num Of SGs</em>' attribute is set.
     * @see #unsetNumOfSGs()
     * @see #getNumOfSGs()
     * @see #setNumOfSGs(Integer)
     * @generated
     */
    boolean isSetNumOfSGs();

    /**
     * Returns the value of the '<em><b>Resv Tms</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resv Tms</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Resv Tms</em>' attribute.
     * @see #isSetResvTms()
     * @see #unsetResvTms()
     * @see #setResvTms(Short)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSettingControl_ResvTms()
     * @model unsettable="true"
     * @generated
     */
    Short getResvTms();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl#getResvTms <em>Resv Tms</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resv Tms</em>' attribute.
     * @see #isSetResvTms()
     * @see #unsetResvTms()
     * @see #getResvTms()
     * @generated
     */
    void setResvTms( Short value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl#getResvTms <em>Resv Tms</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetResvTms()
     * @see #getResvTms()
     * @see #setResvTms(Short)
     * @generated
     */
    void unsetResvTms();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl#getResvTms <em>Resv Tms</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Resv Tms</em>' attribute is set.
     * @see #unsetResvTms()
     * @see #getResvTms()
     * @see #setResvTms(Short)
     * @generated
     */
    boolean isSetResvTms();

    /**
     * Returns the value of the '<em><b>Parent LN0</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0#getSettingControl <em>Setting Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent LN0</em>' container reference.
     * @see #setParentLN0(LN0)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSettingControl_ParentLN0()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0#getSettingControl
     * @model opposite="SettingControl" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    LN0 getParentLN0();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl#getParentLN0 <em>Parent LN0</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent LN0</em>' container reference.
     * @see #getParentLN0()
     * @generated
     */
    void setParentLN0( LN0 value );

} // SettingControl
