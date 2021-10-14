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
 * A representation of the model object '<em><b>LNode Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeContainer#getLNode <em>LNode</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLNodeContainer()
 * @model
 * @generated
 */
public interface LNodeContainer extends Naming {
    /**
     * Returns the value of the '<em><b>LNode</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getParentLNodeContainer <em>Parent LNode Container</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>LNode</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>LNode</em>' containment reference list.
     * @see #isSetLNode()
     * @see #unsetLNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLNodeContainer_LNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getParentLNodeContainer
     * @model opposite="ParentLNodeContainer" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList< LNode > getLNode();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeContainer#getLNode <em>LNode</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLNode()
     * @see #getLNode()
     * @generated
     */
    void unsetLNode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeContainer#getLNode <em>LNode</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>LNode</em>' containment reference list is set.
     * @see #unsetLNode()
     * @see #getLNode()
     * @generated
     */
    boolean isSetLNode();

} // LNodeContainer
