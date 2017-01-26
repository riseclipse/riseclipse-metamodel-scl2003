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
 * A representation of the model object '<em><b>SM Vsc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVsc#getDelivery <em>Delivery</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVsc#getDeliveryConf <em>Delivery Conf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVsc#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSMVsc()
 * @model
 * @generated
 */
public interface SMVsc extends ServiceWithMax {
    /**
     * Returns the value of the '<em><b>Delivery</b></em>' attribute.
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
     * @model unsettable="true"
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
     * Returns the value of the '<em><b>Services</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getSMVsc <em>SM Vsc</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Services</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Services</em>' container reference.
     * @see #setServices(Services)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSMVsc_Services()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getSMVsc
     * @model opposite="SMVsc" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    Services getServices();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVsc#getServices <em>Services</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Services</em>' container reference.
     * @see #getServices()
     * @generated
     */
    void setServices( Services value );

} // SMVsc
