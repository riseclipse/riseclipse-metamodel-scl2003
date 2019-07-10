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
 * A representation of the model object '<em><b>Abstract Conducting Equipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractConductingEquipment#getSubEquipment <em>Sub Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractConductingEquipment#getTerminal <em>Terminal</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAbstractConductingEquipment()
 * @model
 * @generated
 */
public interface AbstractConductingEquipment extends Equipment {
    /**
     * Returns the value of the '<em><b>Sub Equipment</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubEquipment}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubEquipment#getParentAbstractConductingEquipment <em>Parent Abstract Conducting Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sub Equipment</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sub Equipment</em>' containment reference list.
     * @see #isSetSubEquipment()
     * @see #unsetSubEquipment()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAbstractConductingEquipment_SubEquipment()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SubEquipment#getParentAbstractConductingEquipment
     * @model opposite="ParentAbstractConductingEquipment" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList<SubEquipment> getSubEquipment();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractConductingEquipment#getSubEquipment <em>Sub Equipment</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSubEquipment()
     * @see #getSubEquipment()
     * @generated
     */
    void unsetSubEquipment();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractConductingEquipment#getSubEquipment <em>Sub Equipment</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sub Equipment</em>' containment reference list is set.
     * @see #unsetSubEquipment()
     * @see #getSubEquipment()
     * @generated
     */
    boolean isSetSubEquipment();

    /**
     * Returns the value of the '<em><b>Terminal</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getParentAbstractConductingEquipment <em>Parent Abstract Conducting Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Terminal</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Terminal</em>' containment reference list.
     * @see #isSetTerminal()
     * @see #unsetTerminal()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAbstractConductingEquipment_Terminal()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getParentAbstractConductingEquipment
     * @model opposite="ParentAbstractConductingEquipment" containment="true" unsettable="true" upper="2" ordered="false"
     * @generated
     */
    EList<Terminal> getTerminal();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractConductingEquipment#getTerminal <em>Terminal</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTerminal()
     * @see #getTerminal()
     * @generated
     */
    void unsetTerminal();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractConductingEquipment#getTerminal <em>Terminal</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Terminal</em>' containment reference list is set.
     * @see #unsetTerminal()
     * @see #getTerminal()
     * @generated
     */
    boolean isSetTerminal();

} // AbstractConductingEquipment
