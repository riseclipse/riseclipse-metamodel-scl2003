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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Communication#getSubNetwork <em>Sub Network</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Communication#getParentSCL <em>Parent SCL</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getCommunication()
 * @model
 * @generated
 */
public interface Communication extends UnNaming {
    /**
     * Returns the value of the '<em><b>Sub Network</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubNetwork}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubNetwork#getParentCommunication <em>Parent Communication</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sub Network</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sub Network</em>' containment reference list.
     * @see #isSetSubNetwork()
     * @see #unsetSubNetwork()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getCommunication_SubNetwork()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SubNetwork#getParentCommunication
     * @model opposite="ParentCommunication" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList< SubNetwork > getSubNetwork();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Communication#getSubNetwork <em>Sub Network</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSubNetwork()
     * @see #getSubNetwork()
     * @generated
     */
    void unsetSubNetwork();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Communication#getSubNetwork <em>Sub Network</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sub Network</em>' containment reference list is set.
     * @see #unsetSubNetwork()
     * @see #getSubNetwork()
     * @generated
     */
    boolean isSetSubNetwork();

    /**
     * Returns the value of the '<em><b>Parent SCL</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getCommunication <em>Communication</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent SCL</em>' container reference.
     * @see #setParentSCL(SCL)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getCommunication_ParentSCL()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getCommunication
     * @model opposite="Communication" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    SCL getParentSCL();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Communication#getParentSCL <em>Parent SCL</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent SCL</em>' container reference.
     * @see #getParentSCL()
     * @generated
     */
    void setParentSCL( SCL value );

} // Communication
