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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettings#getCbName <em>Cb Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettings#getDatSet <em>Dat Set</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServiceSettings()
 * @model
 * @generated
 */
public interface ServiceSettings extends SclObject {
    /**
     * Returns the value of the '<em><b>Cb Name</b></em>' attribute.
     * The default value is <code>"Fix"</code>.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsNoDynEnum}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cb Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cb Name</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsNoDynEnum
     * @see #isSetCbName()
     * @see #unsetCbName()
     * @see #setCbName(ServiceSettingsNoDynEnum)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServiceSettings_CbName()
     * @model default="Fix" unsettable="true"
     * @generated
     */
    ServiceSettingsNoDynEnum getCbName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettings#getCbName <em>Cb Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cb Name</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsNoDynEnum
     * @see #isSetCbName()
     * @see #unsetCbName()
     * @see #getCbName()
     * @generated
     */
    void setCbName( ServiceSettingsNoDynEnum value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettings#getCbName <em>Cb Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCbName()
     * @see #getCbName()
     * @see #setCbName(ServiceSettingsNoDynEnum)
     * @generated
     */
    void unsetCbName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettings#getCbName <em>Cb Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cb Name</em>' attribute is set.
     * @see #unsetCbName()
     * @see #getCbName()
     * @see #setCbName(ServiceSettingsNoDynEnum)
     * @generated
     */
    boolean isSetCbName();

    /**
     * Returns the value of the '<em><b>Dat Set</b></em>' attribute.
     * The default value is <code>"Fix"</code>.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dat Set</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dat Set</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum
     * @see #isSetDatSet()
     * @see #unsetDatSet()
     * @see #setDatSet(ServiceSettingsEnum)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServiceSettings_DatSet()
     * @model default="Fix" unsettable="true"
     * @generated
     */
    ServiceSettingsEnum getDatSet();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettings#getDatSet <em>Dat Set</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dat Set</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum
     * @see #isSetDatSet()
     * @see #unsetDatSet()
     * @see #getDatSet()
     * @generated
     */
    void setDatSet( ServiceSettingsEnum value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettings#getDatSet <em>Dat Set</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDatSet()
     * @see #getDatSet()
     * @see #setDatSet(ServiceSettingsEnum)
     * @generated
     */
    void unsetDatSet();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettings#getDatSet <em>Dat Set</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dat Set</em>' attribute is set.
     * @see #unsetDatSet()
     * @see #getDatSet()
     * @see #setDatSet(ServiceSettingsEnum)
     * @generated
     */
    boolean isSetDatSet();

} // ServiceSettings
