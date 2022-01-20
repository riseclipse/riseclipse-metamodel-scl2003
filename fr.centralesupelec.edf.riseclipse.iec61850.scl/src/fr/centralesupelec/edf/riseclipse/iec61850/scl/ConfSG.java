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
 * A representation of the model object '<em><b>Conf SG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfSG#getResvTms <em>Resv Tms</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfSG#getParentSettingGroups <em>Parent Setting Groups</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getConfSG()
 * @model
 * @generated
 */
public interface ConfSG extends SclObject {
    /**
     * Returns the value of the '<em><b>Resv Tms</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resv Tms</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Resv Tms</em>' attribute.
     * @see #isSetResvTms()
     * @see #unsetResvTms()
     * @see #setResvTms(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getConfSG_ResvTms()
     * @model unsettable="true"
     * @generated
     */
    Boolean getResvTms();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfSG#getResvTms <em>Resv Tms</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resv Tms</em>' attribute.
     * @see #isSetResvTms()
     * @see #unsetResvTms()
     * @see #getResvTms()
     * @generated
     */
    void setResvTms( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfSG#getResvTms <em>Resv Tms</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetResvTms()
     * @see #getResvTms()
     * @see #setResvTms(Boolean)
     * @generated
     */
    void unsetResvTms();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfSG#getResvTms <em>Resv Tms</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Resv Tms</em>' attribute is set.
     * @see #unsetResvTms()
     * @see #getResvTms()
     * @see #setResvTms(Boolean)
     * @generated
     */
    boolean isSetResvTms();

    /**
     * Returns the value of the '<em><b>Parent Setting Groups</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingGroups#getConfSG <em>Conf SG</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Setting Groups</em>' container reference.
     * @see #setParentSettingGroups(SettingGroups)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getConfSG_ParentSettingGroups()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingGroups#getConfSG
     * @model opposite="ConfSG" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    SettingGroups getParentSettingGroups();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfSG#getParentSettingGroups <em>Parent Setting Groups</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Setting Groups</em>' container reference.
     * @see #getParentSettingGroups()
     * @generated
     */
    void setParentSettingGroups( SettingGroups value );

} // ConfSG
