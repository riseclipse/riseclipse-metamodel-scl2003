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
 * A representation of the model object '<em><b>Control With Trigger Opt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithTriggerOpt#getIntgPd <em>Intg Pd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithTriggerOpt#getTrgOps <em>Trg Ops</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getControlWithTriggerOpt()
 * @model abstract="true"
 * @generated
 */
public interface ControlWithTriggerOpt extends Control {
    /**
     * Returns the value of the '<em><b>Intg Pd</b></em>' attribute.
     * The default value is <code>"0"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Intg Pd</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Intg Pd</em>' attribute.
     * @see #isSetIntgPd()
     * @see #unsetIntgPd()
     * @see #setIntgPd(Integer)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getControlWithTriggerOpt_IntgPd()
     * @model default="0" unsettable="true"
     * @generated
     */
    Integer getIntgPd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithTriggerOpt#getIntgPd <em>Intg Pd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Intg Pd</em>' attribute.
     * @see #isSetIntgPd()
     * @see #unsetIntgPd()
     * @see #getIntgPd()
     * @generated
     */
    void setIntgPd( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithTriggerOpt#getIntgPd <em>Intg Pd</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetIntgPd()
     * @see #getIntgPd()
     * @see #setIntgPd(Integer)
     * @generated
     */
    void unsetIntgPd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithTriggerOpt#getIntgPd <em>Intg Pd</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Intg Pd</em>' attribute is set.
     * @see #unsetIntgPd()
     * @see #getIntgPd()
     * @see #setIntgPd(Integer)
     * @generated
     */
    boolean isSetIntgPd();

    /**
     * Returns the value of the '<em><b>Trg Ops</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TrgOps#getParentControlWithTriggerOpt <em>Parent Control With Trigger Opt</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Trg Ops</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Trg Ops</em>' containment reference.
     * @see #isSetTrgOps()
     * @see #unsetTrgOps()
     * @see #setTrgOps(TrgOps)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getControlWithTriggerOpt_TrgOps()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.TrgOps#getParentControlWithTriggerOpt
     * @model opposite="ParentControlWithTriggerOpt" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='##targetNamespace' kind='element'"
     * @generated
     */
    TrgOps getTrgOps();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithTriggerOpt#getTrgOps <em>Trg Ops</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Trg Ops</em>' containment reference.
     * @see #isSetTrgOps()
     * @see #unsetTrgOps()
     * @see #getTrgOps()
     * @generated
     */
    void setTrgOps( TrgOps value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithTriggerOpt#getTrgOps <em>Trg Ops</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTrgOps()
     * @see #getTrgOps()
     * @see #setTrgOps(TrgOps)
     * @generated
     */
    void unsetTrgOps();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithTriggerOpt#getTrgOps <em>Trg Ops</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Trg Ops</em>' containment reference is set.
     * @see #unsetTrgOps()
     * @see #getTrgOps()
     * @see #setTrgOps(TrgOps)
     * @generated
     */
    boolean isSetTrgOps();

} // ControlWithTriggerOpt
