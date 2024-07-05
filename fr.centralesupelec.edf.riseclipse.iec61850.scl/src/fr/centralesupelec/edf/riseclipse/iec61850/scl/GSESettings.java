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
 * A representation of the model object '<em><b>GSE Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings#getAppID <em>App ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings#getDataLabel <em>Data Label</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings#getParentServices <em>Parent Services</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings#getMcSecurity <em>Mc Security</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings#getKdaParticipant <em>Kda Participant</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGSESettings()
 * @model
 * @generated
 */
public interface GSESettings extends ServiceSettings {
    /**
     * Returns the value of the '<em><b>App ID</b></em>' attribute.
     * The default value is <code>"Fix"</code>.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>App ID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>App ID</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum
     * @see #isSetAppID()
     * @see #unsetAppID()
     * @see #setAppID(ServiceSettingsEnum)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGSESettings_AppID()
     * @model default="Fix" unsettable="true"
     * @generated
     */
    ServiceSettingsEnum getAppID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings#getAppID <em>App ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>App ID</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum
     * @see #isSetAppID()
     * @see #unsetAppID()
     * @see #getAppID()
     * @generated
     */
    void setAppID( ServiceSettingsEnum value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings#getAppID <em>App ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAppID()
     * @see #getAppID()
     * @see #setAppID(ServiceSettingsEnum)
     * @generated
     */
    void unsetAppID();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings#getAppID <em>App ID</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>App ID</em>' attribute is set.
     * @see #unsetAppID()
     * @see #getAppID()
     * @see #setAppID(ServiceSettingsEnum)
     * @generated
     */
    boolean isSetAppID();

    /**
     * Returns the value of the '<em><b>Data Label</b></em>' attribute.
     * The default value is <code>"Fix"</code>.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Label</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Label</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum
     * @see #isSetDataLabel()
     * @see #unsetDataLabel()
     * @see #setDataLabel(ServiceSettingsEnum)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGSESettings_DataLabel()
     * @model default="Fix" unsettable="true"
     * @generated
     */
    ServiceSettingsEnum getDataLabel();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings#getDataLabel <em>Data Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Label</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum
     * @see #isSetDataLabel()
     * @see #unsetDataLabel()
     * @see #getDataLabel()
     * @generated
     */
    void setDataLabel( ServiceSettingsEnum value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings#getDataLabel <em>Data Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDataLabel()
     * @see #getDataLabel()
     * @see #setDataLabel(ServiceSettingsEnum)
     * @generated
     */
    void unsetDataLabel();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings#getDataLabel <em>Data Label</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Data Label</em>' attribute is set.
     * @see #unsetDataLabel()
     * @see #getDataLabel()
     * @see #setDataLabel(ServiceSettingsEnum)
     * @generated
     */
    boolean isSetDataLabel();

    /**
     * Returns the value of the '<em><b>Parent Services</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGSESettings <em>GSE Settings</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Services</em>' container reference.
     * @see #setParentServices(Services)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGSESettings_ParentServices()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGSESettings
     * @model opposite="GSESettings" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    Services getParentServices();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings#getParentServices <em>Parent Services</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Services</em>' container reference.
     * @see #getParentServices()
     * @generated
     */
    void setParentServices( Services value );

    /**
     * Returns the value of the '<em><b>Mc Security</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.McSecurity#getParentGSESettings <em>Parent GSE Settings</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mc Security</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mc Security</em>' containment reference.
     * @see #isSetMcSecurity()
     * @see #unsetMcSecurity()
     * @see #setMcSecurity(McSecurity)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGSESettings_McSecurity()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.McSecurity#getParentGSESettings
     * @model opposite="ParentGSESettings" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    McSecurity getMcSecurity();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings#getMcSecurity <em>Mc Security</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mc Security</em>' containment reference.
     * @see #isSetMcSecurity()
     * @see #unsetMcSecurity()
     * @see #getMcSecurity()
     * @generated
     */
    void setMcSecurity( McSecurity value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings#getMcSecurity <em>Mc Security</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMcSecurity()
     * @see #getMcSecurity()
     * @see #setMcSecurity(McSecurity)
     * @generated
     */
    void unsetMcSecurity();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings#getMcSecurity <em>Mc Security</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Mc Security</em>' containment reference is set.
     * @see #unsetMcSecurity()
     * @see #getMcSecurity()
     * @see #setMcSecurity(McSecurity)
     * @generated
     */
    boolean isSetMcSecurity();

    /**
     * Returns the value of the '<em><b>Kda Participant</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kda Participant</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kda Participant</em>' attribute.
     * @see #isSetKdaParticipant()
     * @see #unsetKdaParticipant()
     * @see #setKdaParticipant(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGSESettings_KdaParticipant()
     * @model default="false" unsettable="true"
     * @generated
     */
    Boolean getKdaParticipant();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings#getKdaParticipant <em>Kda Participant</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kda Participant</em>' attribute.
     * @see #isSetKdaParticipant()
     * @see #unsetKdaParticipant()
     * @see #getKdaParticipant()
     * @generated
     */
    void setKdaParticipant( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings#getKdaParticipant <em>Kda Participant</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKdaParticipant()
     * @see #getKdaParticipant()
     * @see #setKdaParticipant(Boolean)
     * @generated
     */
    void unsetKdaParticipant();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings#getKdaParticipant <em>Kda Participant</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kda Participant</em>' attribute is set.
     * @see #unsetKdaParticipant()
     * @see #getKdaParticipant()
     * @see #setKdaParticipant(Boolean)
     * @generated
     */
    boolean isSetKdaParticipant();

} // GSESettings
