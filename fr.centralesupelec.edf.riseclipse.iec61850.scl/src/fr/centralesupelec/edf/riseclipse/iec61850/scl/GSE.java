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
 * A representation of the model object '<em><b>GSE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSE#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSE#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSE#getParentConnectedAP <em>Parent Connected AP</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGSE()
 * @model
 * @generated
 */
public interface GSE extends ControlBlock {
    /**
     * Returns the value of the '<em><b>Max Time</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.MaxTime#getParentGSE <em>Parent GSE</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Time</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Time</em>' containment reference.
     * @see #isSetMaxTime()
     * @see #unsetMaxTime()
     * @see #setMaxTime(MaxTime)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGSE_MaxTime()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.MaxTime#getParentGSE
     * @model opposite="ParentGSE" containment="true" unsettable="true"
     * @generated
     */
    MaxTime getMaxTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSE#getMaxTime <em>Max Time</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Time</em>' containment reference.
     * @see #isSetMaxTime()
     * @see #unsetMaxTime()
     * @see #getMaxTime()
     * @generated
     */
    void setMaxTime( MaxTime value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSE#getMaxTime <em>Max Time</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxTime()
     * @see #getMaxTime()
     * @see #setMaxTime(MaxTime)
     * @generated
     */
    void unsetMaxTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSE#getMaxTime <em>Max Time</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Time</em>' containment reference is set.
     * @see #unsetMaxTime()
     * @see #getMaxTime()
     * @see #setMaxTime(MaxTime)
     * @generated
     */
    boolean isSetMaxTime();

    /**
     * Returns the value of the '<em><b>Parent Connected AP</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getGSE <em>GSE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Connected AP</em>' container reference.
     * @see #setParentConnectedAP(ConnectedAP)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGSE_ParentConnectedAP()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getGSE
     * @model opposite="GSE" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    @Override
    ConnectedAP getParentConnectedAP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSE#getParentConnectedAP <em>Parent Connected AP</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Connected AP</em>' container reference.
     * @see #getParentConnectedAP()
     * @generated
     */
    void setParentConnectedAP( ConnectedAP value );

    /**
     * Returns the value of the '<em><b>Min Time</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.MinTime#getParentGSE <em>Parent GSE</em>}'.
     * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Min Time</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
     * @return the value of the '<em>Min Time</em>' containment reference.
     * @see #isSetMinTime()
     * @see #unsetMinTime()
     * @see #setMinTime(MinTime)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGSE_MinTime()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.MinTime#getParentGSE
     * @model opposite="ParentGSE" containment="true" unsettable="true"
     * @generated
     */
    MinTime getMinTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSE#getMinTime <em>Min Time</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Time</em>' containment reference.
     * @see #isSetMinTime()
     * @see #unsetMinTime()
     * @see #getMinTime()
     * @generated
     */
    void setMinTime( MinTime value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSE#getMinTime <em>Min Time</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinTime()
     * @see #getMinTime()
     * @see #setMinTime(MinTime)
     * @generated
     */
    void unsetMinTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSE#getMinTime <em>Min Time</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min Time</em>' containment reference is set.
     * @see #unsetMinTime()
     * @see #getMinTime()
     * @see #setMinTime(MinTime)
     * @generated
     */
    boolean isSetMinTime();

} // GSE
