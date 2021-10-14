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
 * A representation of the model object '<em><b>Report Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getBufTime <em>Buf Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getIntgPd <em>Intg Pd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getOptFields <em>Opt Fields</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getOwner <em>Owner</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getResvTms <em>Resv Tms</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getRptID <em>Rpt ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getTrgOps <em>Trg Ops</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getParentServices <em>Parent Services</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getReportSettings()
 * @model
 * @generated
 */
public interface ReportSettings extends ServiceSettings {
    /**
     * Returns the value of the '<em><b>Buf Time</b></em>' attribute.
     * The default value is <code>"Fix"</code>.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Buf Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Buf Time</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum
     * @see #isSetBufTime()
     * @see #unsetBufTime()
     * @see #setBufTime(ServiceSettingsEnum)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getReportSettings_BufTime()
     * @model default="Fix" unsettable="true"
     * @generated
     */
    ServiceSettingsEnum getBufTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getBufTime <em>Buf Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Buf Time</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum
     * @see #isSetBufTime()
     * @see #unsetBufTime()
     * @see #getBufTime()
     * @generated
     */
    void setBufTime( ServiceSettingsEnum value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getBufTime <em>Buf Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBufTime()
     * @see #getBufTime()
     * @see #setBufTime(ServiceSettingsEnum)
     * @generated
     */
    void unsetBufTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getBufTime <em>Buf Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Buf Time</em>' attribute is set.
     * @see #unsetBufTime()
     * @see #getBufTime()
     * @see #setBufTime(ServiceSettingsEnum)
     * @generated
     */
    boolean isSetBufTime();

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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getReportSettings_IntgPd()
     * @model default="Fix" unsettable="true"
     * @generated
     */
    ServiceSettingsEnum getIntgPd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getIntgPd <em>Intg Pd</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getIntgPd <em>Intg Pd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIntgPd()
     * @see #getIntgPd()
     * @see #setIntgPd(ServiceSettingsEnum)
     * @generated
     */
    void unsetIntgPd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getIntgPd <em>Intg Pd</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Opt Fields</b></em>' attribute.
     * The default value is <code>"Fix"</code>.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Opt Fields</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Opt Fields</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum
     * @see #isSetOptFields()
     * @see #unsetOptFields()
     * @see #setOptFields(ServiceSettingsEnum)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getReportSettings_OptFields()
     * @model default="Fix" unsettable="true"
     * @generated
     */
    ServiceSettingsEnum getOptFields();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getOptFields <em>Opt Fields</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Opt Fields</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum
     * @see #isSetOptFields()
     * @see #unsetOptFields()
     * @see #getOptFields()
     * @generated
     */
    void setOptFields( ServiceSettingsEnum value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getOptFields <em>Opt Fields</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOptFields()
     * @see #getOptFields()
     * @see #setOptFields(ServiceSettingsEnum)
     * @generated
     */
    void unsetOptFields();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getOptFields <em>Opt Fields</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Opt Fields</em>' attribute is set.
     * @see #unsetOptFields()
     * @see #getOptFields()
     * @see #setOptFields(ServiceSettingsEnum)
     * @generated
     */
    boolean isSetOptFields();

    /**
     * Returns the value of the '<em><b>Owner</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owner</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owner</em>' attribute.
     * @see #isSetOwner()
     * @see #unsetOwner()
     * @see #setOwner(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getReportSettings_Owner()
     * @model default="false" unsettable="true"
     * @generated
     */
    Boolean getOwner();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getOwner <em>Owner</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @param value the new value of the '<em>Owner</em>' attribute.
     * @see #isSetOwner()
     * @see #unsetOwner()
     * @see #getOwner()
     * @generated
     */
    void setOwner( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getOwner <em>Owner</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetOwner()
     * @see #getOwner()
     * @see #setOwner(Boolean)
     * @generated
     */
    void unsetOwner();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getOwner <em>Owner</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Owner</em>' attribute is set.
     * @see #unsetOwner()
     * @see #getOwner()
     * @see #setOwner(Boolean)
     * @generated
     */
    boolean isSetOwner();

    /**
     * Returns the value of the '<em><b>Resv Tms</b></em>' attribute.
     * The default value is <code>"false"</code>.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getReportSettings_ResvTms()
     * @model default="false" unsettable="true"
     * @generated
     */
    Boolean getResvTms();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getResvTms <em>Resv Tms</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getResvTms <em>Resv Tms</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetResvTms()
     * @see #getResvTms()
     * @see #setResvTms(Boolean)
     * @generated
     */
    void unsetResvTms();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getResvTms <em>Resv Tms</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Rpt ID</b></em>' attribute.
     * The default value is <code>"Fix"</code>.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rpt ID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rpt ID</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum
     * @see #isSetRptID()
     * @see #unsetRptID()
     * @see #setRptID(ServiceSettingsEnum)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getReportSettings_RptID()
     * @model default="Fix" unsettable="true"
     * @generated
     */
    ServiceSettingsEnum getRptID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getRptID <em>Rpt ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rpt ID</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum
     * @see #isSetRptID()
     * @see #unsetRptID()
     * @see #getRptID()
     * @generated
     */
    void setRptID( ServiceSettingsEnum value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getRptID <em>Rpt ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRptID()
     * @see #getRptID()
     * @see #setRptID(ServiceSettingsEnum)
     * @generated
     */
    void unsetRptID();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getRptID <em>Rpt ID</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rpt ID</em>' attribute is set.
     * @see #unsetRptID()
     * @see #getRptID()
     * @see #setRptID(ServiceSettingsEnum)
     * @generated
     */
    boolean isSetRptID();

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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getReportSettings_TrgOps()
     * @model default="Fix" unsettable="true"
     * @generated
     */
    ServiceSettingsEnum getTrgOps();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getTrgOps <em>Trg Ops</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getTrgOps <em>Trg Ops</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTrgOps()
     * @see #getTrgOps()
     * @see #setTrgOps(ServiceSettingsEnum)
     * @generated
     */
    void unsetTrgOps();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getTrgOps <em>Trg Ops</em>}' attribute is set.
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
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getReportSettings <em>Report Settings</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Services</em>' container reference.
     * @see #setParentServices(Services)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getReportSettings_ParentServices()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getReportSettings
     * @model opposite="ReportSettings" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    Services getParentServices();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getParentServices <em>Parent Services</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Services</em>' container reference.
     * @see #getParentServices()
     * @generated
     */
    void setParentServices( Services value );

} // ReportSettings
