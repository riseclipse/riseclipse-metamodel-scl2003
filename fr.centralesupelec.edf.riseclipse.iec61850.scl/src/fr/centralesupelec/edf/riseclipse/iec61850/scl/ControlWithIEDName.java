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
 * A representation of the model object '<em><b>Control With IED Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName#getConfRev <em>Conf Rev</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName#getIEDName <em>IED Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName#getReferredByControlBlock <em>Referred By Control Block</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName#getProtocol <em>Protocol</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getControlWithIEDName()
 * @model
 * @generated
 */
public interface ControlWithIEDName extends Control {
    /**
     * Returns the value of the '<em><b>Conf Rev</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conf Rev</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Conf Rev</em>' attribute.
     * @see #isSetConfRev()
     * @see #unsetConfRev()
     * @see #setConfRev(Integer)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getControlWithIEDName_ConfRev()
     * @model unsettable="true"
     * @generated
     */
    Integer getConfRev();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName#getConfRev <em>Conf Rev</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Conf Rev</em>' attribute.
     * @see #isSetConfRev()
     * @see #unsetConfRev()
     * @see #getConfRev()
     * @generated
     */
    void setConfRev( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName#getConfRev <em>Conf Rev</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetConfRev()
     * @see #getConfRev()
     * @see #setConfRev(Integer)
     * @generated
     */
    void unsetConfRev();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName#getConfRev <em>Conf Rev</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Conf Rev</em>' attribute is set.
     * @see #unsetConfRev()
     * @see #getConfRev()
     * @see #setConfRev(Integer)
     * @generated
     */
    boolean isSetConfRev();

    /**
     * Returns the value of the '<em><b>IED Name</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDName}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDName#getControlWithIEDName <em>Control With IED Name</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>IED Name</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>IED Name</em>' containment reference list.
     * @see #isSetIEDName()
     * @see #unsetIEDName()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getControlWithIEDName_IEDName()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDName#getControlWithIEDName
     * @model opposite="ControlWithIEDName" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList<IEDName> getIEDName();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName#getIEDName <em>IED Name</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIEDName()
     * @see #getIEDName()
     * @generated
     */
    void unsetIEDName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName#getIEDName <em>IED Name</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>IED Name</em>' containment reference list is set.
     * @see #unsetIEDName()
     * @see #getIEDName()
     * @generated
     */
    boolean isSetIEDName();

    /**
     * Returns the value of the '<em><b>Referred By Control Block</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock#getRefersToControlWithIEDName <em>Refers To Control With IED Name</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referred By Control Block</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Control Block</em>' reference list.
     * @see #isSetReferredByControlBlock()
     * @see #unsetReferredByControlBlock()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getControlWithIEDName_ReferredByControlBlock()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock#getRefersToControlWithIEDName
     * @model opposite="RefersToControlWithIEDName" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList<ControlBlock> getReferredByControlBlock();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName#getReferredByControlBlock <em>Referred By Control Block</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByControlBlock()
     * @see #getReferredByControlBlock()
     * @generated
     */
    void unsetReferredByControlBlock();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName#getReferredByControlBlock <em>Referred By Control Block</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Control Block</em>' reference list is set.
     * @see #unsetReferredByControlBlock()
     * @see #getReferredByControlBlock()
     * @generated
     */
    boolean isSetReferredByControlBlock();

    /**
     * Returns the value of the '<em><b>Protocol</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Protocol#getControlWithIEDName <em>Control With IED Name</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Protocol</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Protocol</em>' containment reference.
     * @see #isSetProtocol()
     * @see #unsetProtocol()
     * @see #setProtocol(Protocol)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getControlWithIEDName_Protocol()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Protocol#getControlWithIEDName
     * @model opposite="ControlWithIEDName" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    Protocol getProtocol();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName#getProtocol <em>Protocol</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Protocol</em>' containment reference.
     * @see #isSetProtocol()
     * @see #unsetProtocol()
     * @see #getProtocol()
     * @generated
     */
    void setProtocol( Protocol value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName#getProtocol <em>Protocol</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetProtocol()
     * @see #getProtocol()
     * @see #setProtocol(Protocol)
     * @generated
     */
    void unsetProtocol();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName#getProtocol <em>Protocol</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Protocol</em>' containment reference is set.
     * @see #unsetProtocol()
     * @see #getProtocol()
     * @see #setProtocol(Protocol)
     * @generated
     */
    boolean isSetProtocol();

} // ControlWithIEDName
