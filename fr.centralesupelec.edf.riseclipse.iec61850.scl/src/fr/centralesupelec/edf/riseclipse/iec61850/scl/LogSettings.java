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
 * A representation of the model object '<em><b>Log Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LogSettings#getIntgPd <em>Intg Pd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LogSettings#getLogEna <em>Log Ena</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LogSettings#getTrgOps <em>Trg Ops</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LogSettings#getParentServices <em>Parent Services</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLogSettings()
 * @model
 * @generated
 */
public interface LogSettings extends ServiceSettings {
    /**
     * Returns the value of the '<em><b>Intg Pd</b></em>' attribute.
     * The default value is <code>"Fix"</code>.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Intg Pd</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Intg Pd</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum
     * @see #isSetIntgPd()
     * @see #unsetIntgPd()
     * @see #setIntgPd(ServiceSettingsEnum)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLogSettings_IntgPd()
     * @model default="Fix" unsettable="true"
     * @generated
     */
    ServiceSettingsEnum getIntgPd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LogSettings#getIntgPd <em>Intg Pd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Intg Pd</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum
     * @see #isSetIntgPd()
     * @see #unsetIntgPd()
     * @see #getIntgPd()
     * @generated
     */
    void setIntgPd( ServiceSettingsEnum value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LogSettings#getIntgPd <em>Intg Pd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIntgPd()
     * @see #getIntgPd()
     * @see #setIntgPd(ServiceSettingsEnum)
     * @generated
     */
    void unsetIntgPd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LogSettings#getIntgPd <em>Intg Pd</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Intg Pd</em>' attribute is set.
     * @see #unsetIntgPd()
     * @see #getIntgPd()
     * @see #setIntgPd(ServiceSettingsEnum)
     * @generated
     */
    boolean isSetIntgPd();

    /**
     * Returns the value of the '<em><b>Log Ena</b></em>' attribute.
     * The default value is <code>"Fix"</code>.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Log Ena</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Log Ena</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum
     * @see #isSetLogEna()
     * @see #unsetLogEna()
     * @see #setLogEna(ServiceSettingsEnum)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLogSettings_LogEna()
     * @model default="Fix" unsettable="true"
     * @generated
     */
    ServiceSettingsEnum getLogEna();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LogSettings#getLogEna <em>Log Ena</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Log Ena</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum
     * @see #isSetLogEna()
     * @see #unsetLogEna()
     * @see #getLogEna()
     * @generated
     */
    void setLogEna( ServiceSettingsEnum value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LogSettings#getLogEna <em>Log Ena</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLogEna()
     * @see #getLogEna()
     * @see #setLogEna(ServiceSettingsEnum)
     * @generated
     */
    void unsetLogEna();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LogSettings#getLogEna <em>Log Ena</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Log Ena</em>' attribute is set.
     * @see #unsetLogEna()
     * @see #getLogEna()
     * @see #setLogEna(ServiceSettingsEnum)
     * @generated
     */
    boolean isSetLogEna();

    /**
     * Returns the value of the '<em><b>Trg Ops</b></em>' attribute.
     * The default value is <code>"Fix"</code>.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Trg Ops</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Trg Ops</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum
     * @see #isSetTrgOps()
     * @see #unsetTrgOps()
     * @see #setTrgOps(ServiceSettingsEnum)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLogSettings_TrgOps()
     * @model default="Fix" unsettable="true"
     * @generated
     */
    ServiceSettingsEnum getTrgOps();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LogSettings#getTrgOps <em>Trg Ops</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Trg Ops</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum
     * @see #isSetTrgOps()
     * @see #unsetTrgOps()
     * @see #getTrgOps()
     * @generated
     */
    void setTrgOps( ServiceSettingsEnum value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LogSettings#getTrgOps <em>Trg Ops</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTrgOps()
     * @see #getTrgOps()
     * @see #setTrgOps(ServiceSettingsEnum)
     * @generated
     */
    void unsetTrgOps();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LogSettings#getTrgOps <em>Trg Ops</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Trg Ops</em>' attribute is set.
     * @see #unsetTrgOps()
     * @see #getTrgOps()
     * @see #setTrgOps(ServiceSettingsEnum)
     * @generated
     */
    boolean isSetTrgOps();

    /**
     * Returns the value of the '<em><b>Parent Services</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getLogSettings <em>Log Settings</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Services</em>' container reference.
     * @see #setParentServices(Services)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLogSettings_ParentServices()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getLogSettings
     * @model opposite="LogSettings" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    Services getParentServices();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LogSettings#getParentServices <em>Parent Services</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Services</em>' container reference.
     * @see #getParentServices()
     * @generated
     */
    void setParentServices( Services value );

} // LogSettings
