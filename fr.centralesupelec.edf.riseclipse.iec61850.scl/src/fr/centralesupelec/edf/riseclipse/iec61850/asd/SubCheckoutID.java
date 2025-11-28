/**
 *  Copyright (c) 2016-2024 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-v20.html
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
 *      https://riseclipse.github.io/
 * 
 */
package fr.centralesupelec.edf.riseclipse.iec61850.asd;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Checkout ID</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubCheckoutID#getParentCheckoutID <em>Parent Checkout ID</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSubCheckoutID()
 * @model
 * @generated
 */
public interface SubCheckoutID extends CheckoutID {
    /**
     * Returns the value of the '<em><b>Parent Checkout ID</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CheckoutID#getSubCheckoutID <em>Sub Checkout ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Checkout ID</em>' container reference.
     * @see #setParentCheckoutID(CheckoutID)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSubCheckoutID_ParentCheckoutID()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.CheckoutID#getSubCheckoutID
     * @model opposite="subCheckoutID" unsettable="true" ordered="false"
     * @generated
     */
    CheckoutID getParentCheckoutID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubCheckoutID#getParentCheckoutID <em>Parent Checkout ID</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Checkout ID</em>' container reference.
     * @see #getParentCheckoutID()
     * @generated
     */
    void setParentCheckoutID( CheckoutID value );

} // SubCheckoutID
