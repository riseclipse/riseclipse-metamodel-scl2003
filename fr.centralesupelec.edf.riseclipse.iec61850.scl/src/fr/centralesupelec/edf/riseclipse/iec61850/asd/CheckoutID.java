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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileUUIDReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Checkout ID</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Type defining the CheckoutID element based on tSclFileUUIDReference with new attribute for engineering rights
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CheckoutID#getSubCheckoutID <em>Sub Checkout ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CheckoutID#getEngRight <em>Eng Right</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CheckoutID#getHeaderId <em>Header Id</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getCheckoutID()
 * @model extendedMetaData="name='CheckoutID' kind='elementOnly'"
 * @generated
 */
public interface CheckoutID extends SclFileUUIDReference {
    /**
     * Returns the value of the '<em><b>Sub Checkout ID</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubCheckoutID#getParentCheckoutID <em>Parent Checkout ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * When an IED is checkedout for a collaborative work by an SCC, it may be required to give right to a subpart of the collaborative project. So a CheckoutID may have an additional SubCheckoutID giving IED to nother project
     * <!-- end-model-doc -->
     * @return the value of the '<em>Sub Checkout ID</em>' containment reference.
     * @see #isSetSubCheckoutID()
     * @see #unsetSubCheckoutID()
     * @see #setSubCheckoutID(SubCheckoutID)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getCheckoutID_SubCheckoutID()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SubCheckoutID#getParentCheckoutID
     * @model opposite="ParentCheckoutID" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='SubCheckoutID' namespace='##targetNamespace'"
     * @generated
     */
    SubCheckoutID getSubCheckoutID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CheckoutID#getSubCheckoutID <em>Sub Checkout ID</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sub Checkout ID</em>' containment reference.
     * @see #isSetSubCheckoutID()
     * @see #unsetSubCheckoutID()
     * @see #getSubCheckoutID()
     * @generated
     */
    void setSubCheckoutID( SubCheckoutID value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CheckoutID#getSubCheckoutID <em>Sub Checkout ID</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSubCheckoutID()
     * @see #getSubCheckoutID()
     * @see #setSubCheckoutID(SubCheckoutID)
     * @generated
     */
    void unsetSubCheckoutID();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CheckoutID#getSubCheckoutID <em>Sub Checkout ID</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sub Checkout ID</em>' containment reference is set.
     * @see #unsetSubCheckoutID()
     * @see #getSubCheckoutID()
     * @see #setSubCheckoutID(SubCheckoutID)
     * @generated
     */
    boolean isSetSubCheckoutID();

    /**
     * Returns the value of the '<em><b>Eng Right</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Engineering right transfered from the original project to the current one
     * <!-- end-model-doc -->
     * @return the value of the '<em>Eng Right</em>' attribute.
     * @see #isSetEngRight()
     * @see #unsetEngRight()
     * @see #setEngRight(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getCheckoutID_EngRight()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='engRight'"
     * @generated
     */
    String getEngRight();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CheckoutID#getEngRight <em>Eng Right</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Eng Right</em>' attribute.
     * @see #isSetEngRight()
     * @see #unsetEngRight()
     * @see #getEngRight()
     * @generated
     */
    void setEngRight( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CheckoutID#getEngRight <em>Eng Right</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEngRight()
     * @see #getEngRight()
     * @see #setEngRight(String)
     * @generated
     */
    void unsetEngRight();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CheckoutID#getEngRight <em>Eng Right</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Eng Right</em>' attribute is set.
     * @see #unsetEngRight()
     * @see #getEngRight()
     * @see #setEngRight(String)
     * @generated
     */
    boolean isSetEngRight();

    /**
     * Returns the value of the '<em><b>Header Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Id of the header in the imported file
     * <!-- end-model-doc -->
     * @return the value of the '<em>Header Id</em>' attribute.
     * @see #setHeaderId(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getCheckoutID_HeaderId()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
     *        extendedMetaData="kind='attribute' name='headerId'"
     * @generated
     */
    String getHeaderId();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CheckoutID#getHeaderId <em>Header Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Header Id</em>' attribute.
     * @see #getHeaderId()
     * @generated
     */
    void setHeaderId( String value );

} // CheckoutID
