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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Address#getParentConnectedAP <em>Parent Connected AP</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Address#getParentControlBlock <em>Parent Control Block</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Address#getP <em>P</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAddress()
 * @model
 * @generated
 */
public interface Address extends SclObject {
    /**
     * Returns the value of the '<em><b>Parent Connected AP</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getAddress <em>Address</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Connected AP</em>' container reference.
     * @see #setParentConnectedAP(ConnectedAP)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAddress_ParentConnectedAP()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getAddress
     * @model opposite="Address" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    ConnectedAP getParentConnectedAP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Address#getParentConnectedAP <em>Parent Connected AP</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Connected AP</em>' container reference.
     * @see #getParentConnectedAP()
     * @generated
     */
    void setParentConnectedAP(ConnectedAP value);

    /**
     * Returns the value of the '<em><b>Parent Control Block</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock#getAddress <em>Address</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Control Block</em>' container reference.
     * @see #setParentControlBlock(ControlBlock)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAddress_ParentControlBlock()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock#getAddress
     * @model opposite="Address" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    ControlBlock getParentControlBlock();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Address#getParentControlBlock <em>Parent Control Block</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Control Block</em>' container reference.
     * @see #getParentControlBlock()
     * @generated
     */
    void setParentControlBlock(ControlBlock value);

    /**
     * Returns the value of the '<em><b>P</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.P}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.P#getParentAddress <em>Parent Address</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>P</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>P</em>' containment reference list.
     * @see #isSetP()
     * @see #unsetP()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAddress_P()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.P#getParentAddress
     * @model opposite="ParentAddress" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList<P> getP();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Address#getP <em>P</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetP()
     * @see #getP()
     * @generated
     */
    void unsetP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Address#getP <em>P</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>P</em>' containment reference list is set.
     * @see #unsetP()
     * @see #getP()
     * @generated
     */
    boolean isSetP();

} // Address
