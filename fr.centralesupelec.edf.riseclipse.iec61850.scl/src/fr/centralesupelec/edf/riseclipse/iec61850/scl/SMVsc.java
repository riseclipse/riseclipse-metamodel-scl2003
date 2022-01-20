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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SM Vsc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVsc#getDelivery <em>Delivery</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVsc#getDeliveryConf <em>Delivery Conf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVsc#getParentServices <em>Parent Services</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVsc#getSv <em>Sv</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVsc#getRSV <em>RSV</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSMVsc()
 * @model
 * @generated
 */
public interface SMVsc extends ServiceWithMax {
    /**
     * Returns the value of the '<em><b>Delivery</b></em>' attribute.
     * The default value is <code>"multicast"</code>.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVDeliveryEnum}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Delivery</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Delivery</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVDeliveryEnum
     * @see #isSetDelivery()
     * @see #unsetDelivery()
     * @see #setDelivery(SMVDeliveryEnum)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSMVsc_Delivery()
     * @model default="multicast" unsettable="true"
     * @generated
     */
    SMVDeliveryEnum getDelivery();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVsc#getDelivery <em>Delivery</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Delivery</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVDeliveryEnum
     * @see #isSetDelivery()
     * @see #unsetDelivery()
     * @see #getDelivery()
     * @generated
     */
    void setDelivery( SMVDeliveryEnum value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVsc#getDelivery <em>Delivery</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDelivery()
     * @see #getDelivery()
     * @see #setDelivery(SMVDeliveryEnum)
     * @generated
     */
    void unsetDelivery();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVsc#getDelivery <em>Delivery</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Delivery</em>' attribute is set.
     * @see #unsetDelivery()
     * @see #getDelivery()
     * @see #setDelivery(SMVDeliveryEnum)
     * @generated
     */
    boolean isSetDelivery();

    /**
     * Returns the value of the '<em><b>Delivery Conf</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Delivery Conf</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Delivery Conf</em>' attribute.
     * @see #isSetDeliveryConf()
     * @see #unsetDeliveryConf()
     * @see #setDeliveryConf(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSMVsc_DeliveryConf()
     * @model unsettable="true"
     * @generated
     */
    Boolean getDeliveryConf();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVsc#getDeliveryConf <em>Delivery Conf</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @param value the new value of the '<em>Delivery Conf</em>' attribute.
     * @see #isSetDeliveryConf()
     * @see #unsetDeliveryConf()
     * @see #getDeliveryConf()
     * @generated
     */
    void setDeliveryConf( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVsc#getDeliveryConf <em>Delivery Conf</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetDeliveryConf()
     * @see #getDeliveryConf()
     * @see #setDeliveryConf(Boolean)
     * @generated
     */
    void unsetDeliveryConf();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVsc#getDeliveryConf <em>Delivery Conf</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Delivery Conf</em>' attribute is set.
     * @see #unsetDeliveryConf()
     * @see #getDeliveryConf()
     * @see #setDeliveryConf(Boolean)
     * @generated
     */
    boolean isSetDeliveryConf();

    /**
     * Returns the value of the '<em><b>Parent Services</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getSMVsc <em>SM Vsc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Services</em>' container reference.
     * @see #setParentServices(Services)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSMVsc_ParentServices()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getSMVsc
     * @model opposite="SMVsc" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    Services getParentServices();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVsc#getParentServices <em>Parent Services</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Services</em>' container reference.
     * @see #getParentServices()
     * @generated
     */
    void setParentServices( Services value );

    /**
     * Returns the value of the '<em><b>Sv</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sv</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sv</em>' attribute.
     * @see #isSetSv()
     * @see #unsetSv()
     * @see #setSv(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSMVsc_Sv()
     * @model unsettable="true"
     * @generated
     */
    Boolean getSv();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVsc#getSv <em>Sv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sv</em>' attribute.
     * @see #isSetSv()
     * @see #unsetSv()
     * @see #getSv()
     * @generated
     */
    void setSv( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVsc#getSv <em>Sv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSv()
     * @see #getSv()
     * @see #setSv(Boolean)
     * @generated
     */
    void unsetSv();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVsc#getSv <em>Sv</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sv</em>' attribute is set.
     * @see #unsetSv()
     * @see #getSv()
     * @see #setSv(Boolean)
     * @generated
     */
    boolean isSetSv();

    /**
     * Returns the value of the '<em><b>RSV</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>RSV</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>RSV</em>' attribute.
     * @see #isSetRSV()
     * @see #unsetRSV()
     * @see #setRSV(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSMVsc_RSV()
     * @model unsettable="true"
     * @generated
     */
    Boolean getRSV();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVsc#getRSV <em>RSV</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>RSV</em>' attribute.
     * @see #isSetRSV()
     * @see #unsetRSV()
     * @see #getRSV()
     * @generated
     */
    void setRSV( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVsc#getRSV <em>RSV</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRSV()
     * @see #getRSV()
     * @see #setRSV(Boolean)
     * @generated
     */
    void unsetRSV();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVsc#getRSV <em>RSV</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>RSV</em>' attribute is set.
     * @see #unsetRSV()
     * @see #getRSV()
     * @see #setRSV(Boolean)
     * @generated
     */
    boolean isSetRSV();

} // SMVsc
