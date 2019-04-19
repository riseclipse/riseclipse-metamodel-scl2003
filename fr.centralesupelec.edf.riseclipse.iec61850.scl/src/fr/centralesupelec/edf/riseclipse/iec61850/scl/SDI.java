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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SDI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getIx <em>Ix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getSAddr <em>SAddr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getDAI <em>DAI</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getParentDOI <em>Parent DOI</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getSubSDI <em>Sub SDI</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getParentSDI <em>Parent SDI</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getRefersToSDO <em>Refers To SDO</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getRefersToAbstractDataAttribute <em>Refers To Abstract Data Attribute</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSDI()
 * @model
 * @generated
 */
public interface SDI extends UnNaming {
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSDI_Ix()
     * @model unsettable="true"
     * @generated
     */
    Integer getIx();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getIx <em>Ix</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getIx <em>Ix</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetIx()
     * @see #getIx()
     * @see #setIx(Integer)
     * @generated
     */
    void unsetIx();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getIx <em>Ix</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSDI_SAddr()
     * @model unsettable="true"
     * @generated
     */
    String getSAddr();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getSAddr <em>SAddr</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getSAddr <em>SAddr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSAddr()
     * @see #getSAddr()
     * @see #setSAddr(String)
     * @generated
     */
    void unsetSAddr();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getSAddr <em>SAddr</em>}' attribute is set.
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
     * Returns the value of the '<em><b>DAI</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getParentSDI <em>Parent SDI</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DAI</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DAI</em>' containment reference list.
     * @see #isSetDAI()
     * @see #unsetDAI()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSDI_DAI()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getParentSDI
     * @model opposite="ParentSDI" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList<DAI> getDAI();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getDAI <em>DAI</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDAI()
     * @see #getDAI()
     * @generated
     */
    void unsetDAI();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getDAI <em>DAI</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>DAI</em>' containment reference list is set.
     * @see #unsetDAI()
     * @see #getDAI()
     * @generated
     */
    boolean isSetDAI();

    /**
     * Returns the value of the '<em><b>Parent DOI</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getSDI <em>SDI</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent DOI</em>' container reference.
     * @see #setParentDOI(DOI)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSDI_ParentDOI()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getSDI
     * @model opposite="SDI" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    DOI getParentDOI();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getParentDOI <em>Parent DOI</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent DOI</em>' container reference.
     * @see #getParentDOI()
     * @generated
     */
    void setParentDOI(DOI value);

    /**
     * Returns the value of the '<em><b>Sub SDI</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getParentSDI <em>Parent SDI</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sub SDI</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sub SDI</em>' containment reference list.
     * @see #isSetSubSDI()
     * @see #unsetSubSDI()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSDI_SubSDI()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getParentSDI
     * @model opposite="ParentSDI" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='SDI' namespace='http://www.iec.ch/61850/2003/SCL'"
     * @generated
     */
    EList<SDI> getSubSDI();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getSubSDI <em>Sub SDI</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSubSDI()
     * @see #getSubSDI()
     * @generated
     */
    void unsetSubSDI();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getSubSDI <em>Sub SDI</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sub SDI</em>' containment reference list is set.
     * @see #unsetSubSDI()
     * @see #getSubSDI()
     * @generated
     */
    boolean isSetSubSDI();

    /**
     * Returns the value of the '<em><b>Parent SDI</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getSubSDI <em>Sub SDI</em>}'.
     * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Parent SDI</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
     * @return the value of the '<em>Parent SDI</em>' container reference.
     * @see #setParentSDI(SDI)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSDI_ParentSDI()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getSubSDI
     * @model opposite="SubSDI" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    SDI getParentSDI();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getParentSDI <em>Parent SDI</em>}' container reference.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSDI_Name()
     * @model unsettable="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    void unsetName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getName <em>Name</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Refers To SDO</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDO#getReferredBySDI <em>Referred By SDI</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To SDO</em>' reference.
     * @see #isSetRefersToSDO()
     * @see #unsetRefersToSDO()
     * @see #setRefersToSDO(SDO)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSDI_RefersToSDO()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SDO#getReferredBySDI
     * @model opposite="ReferredBySDI" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    SDO getRefersToSDO();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getRefersToSDO <em>Refers To SDO</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To SDO</em>' reference.
     * @see #isSetRefersToSDO()
     * @see #unsetRefersToSDO()
     * @see #getRefersToSDO()
     * @generated
     */
    void setRefersToSDO(SDO value);

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getRefersToSDO <em>Refers To SDO</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToSDO()
     * @see #getRefersToSDO()
     * @see #setRefersToSDO(SDO)
     * @generated
     */
    void unsetRefersToSDO();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getRefersToSDO <em>Refers To SDO</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To SDO</em>' reference is set.
     * @see #unsetRefersToSDO()
     * @see #getRefersToSDO()
     * @see #setRefersToSDO(SDO)
     * @generated
     */
    boolean isSetRefersToSDO();

    /**
     * Returns the value of the '<em><b>Refers To Abstract Data Attribute</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getReferredBySDI <em>Referred By SDI</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Abstract Data Attribute</em>' reference.
     * @see #isSetRefersToAbstractDataAttribute()
     * @see #unsetRefersToAbstractDataAttribute()
     * @see #setRefersToAbstractDataAttribute(AbstractDataAttribute)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSDI_RefersToAbstractDataAttribute()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getReferredBySDI
     * @model opposite="ReferredBySDI" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    AbstractDataAttribute getRefersToAbstractDataAttribute();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getRefersToAbstractDataAttribute <em>Refers To Abstract Data Attribute</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getRefersToAbstractDataAttribute <em>Refers To Abstract Data Attribute</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToAbstractDataAttribute()
     * @see #getRefersToAbstractDataAttribute()
     * @see #setRefersToAbstractDataAttribute(AbstractDataAttribute)
     * @generated
     */
    void unsetRefersToAbstractDataAttribute();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getRefersToAbstractDataAttribute <em>Refers To Abstract Data Attribute</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Abstract Data Attribute</em>' reference is set.
     * @see #unsetRefersToAbstractDataAttribute()
     * @see #getRefersToAbstractDataAttribute()
     * @see #setRefersToAbstractDataAttribute(AbstractDataAttribute)
     * @generated
     */
    boolean isSetRefersToAbstractDataAttribute();

} // SDI
