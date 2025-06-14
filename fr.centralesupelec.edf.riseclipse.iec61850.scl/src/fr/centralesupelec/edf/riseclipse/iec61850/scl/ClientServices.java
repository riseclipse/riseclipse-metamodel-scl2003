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
 * A representation of the model object '<em><b>Client Services</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getBufReport <em>Buf Report</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getGoose <em>Goose</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getGsse <em>Gsse</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getMaxAttributes <em>Max Attributes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getMaxGOOSE <em>Max GOOSE</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getMaxReports <em>Max Reports</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getMaxSMV <em>Max SMV</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getReadLog <em>Read Log</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getSupportsLdName <em>Supports Ld Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getSv <em>Sv</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getUnbufReport <em>Unbuf Report</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getParentServices <em>Parent Services</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getTimeSyncProt <em>Time Sync Prot</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getRGOOSE <em>RGOOSE</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getRSV <em>RSV</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getNoIctBinding <em>No Ict Binding</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getMcSecurity <em>Mc Security</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getClientServices()
 * @model
 * @generated
 */
public interface ClientServices extends SclObject {
    /**
     * Returns the value of the '<em><b>Buf Report</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Buf Report</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Buf Report</em>' attribute.
     * @see #isSetBufReport()
     * @see #unsetBufReport()
     * @see #setBufReport(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getClientServices_BufReport()
     * @model default="false" unsettable="true"
     * @generated
     */
    Boolean getBufReport();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getBufReport <em>Buf Report</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Buf Report</em>' attribute.
     * @see #isSetBufReport()
     * @see #unsetBufReport()
     * @see #getBufReport()
     * @generated
     */
    void setBufReport( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getBufReport <em>Buf Report</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetBufReport()
     * @see #getBufReport()
     * @see #setBufReport(Boolean)
     * @generated
     */
    void unsetBufReport();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getBufReport <em>Buf Report</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Buf Report</em>' attribute is set.
     * @see #unsetBufReport()
     * @see #getBufReport()
     * @see #setBufReport(Boolean)
     * @generated
     */
    boolean isSetBufReport();

    /**
     * Returns the value of the '<em><b>Goose</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Goose</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Goose</em>' attribute.
     * @see #isSetGoose()
     * @see #unsetGoose()
     * @see #setGoose(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getClientServices_Goose()
     * @model default="false" unsettable="true"
     * @generated
     */
    Boolean getGoose();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getGoose <em>Goose</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @param value the new value of the '<em>Goose</em>' attribute.
     * @see #isSetGoose()
     * @see #unsetGoose()
     * @see #getGoose()
     * @generated
     */
    void setGoose( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getGoose <em>Goose</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetGoose()
     * @see #getGoose()
     * @see #setGoose(Boolean)
     * @generated
     */
    void unsetGoose();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getGoose <em>Goose</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Goose</em>' attribute is set.
     * @see #unsetGoose()
     * @see #getGoose()
     * @see #setGoose(Boolean)
     * @generated
     */
    boolean isSetGoose();

    /**
     * Returns the value of the '<em><b>Gsse</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Gsse</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Gsse</em>' attribute.
     * @see #isSetGsse()
     * @see #unsetGsse()
     * @see #setGsse(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getClientServices_Gsse()
     * @model default="false" unsettable="true"
     * @generated
     */
    Boolean getGsse();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getGsse <em>Gsse</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gsse</em>' attribute.
     * @see #isSetGsse()
     * @see #unsetGsse()
     * @see #getGsse()
     * @generated
     */
    void setGsse( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getGsse <em>Gsse</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetGsse()
     * @see #getGsse()
     * @see #setGsse(Boolean)
     * @generated
     */
    void unsetGsse();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getGsse <em>Gsse</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gsse</em>' attribute is set.
     * @see #unsetGsse()
     * @see #getGsse()
     * @see #setGsse(Boolean)
     * @generated
     */
    boolean isSetGsse();

    /**
     * Returns the value of the '<em><b>Max Attributes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Attributes</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Attributes</em>' attribute.
     * @see #isSetMaxAttributes()
     * @see #unsetMaxAttributes()
     * @see #setMaxAttributes(Integer)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getClientServices_MaxAttributes()
     * @model unsettable="true"
     * @generated
     */
    Integer getMaxAttributes();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getMaxAttributes <em>Max Attributes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Attributes</em>' attribute.
     * @see #isSetMaxAttributes()
     * @see #unsetMaxAttributes()
     * @see #getMaxAttributes()
     * @generated
     */
    void setMaxAttributes( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getMaxAttributes <em>Max Attributes</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetMaxAttributes()
     * @see #getMaxAttributes()
     * @see #setMaxAttributes(Integer)
     * @generated
     */
    void unsetMaxAttributes();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getMaxAttributes <em>Max Attributes</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Attributes</em>' attribute is set.
     * @see #unsetMaxAttributes()
     * @see #getMaxAttributes()
     * @see #setMaxAttributes(Integer)
     * @generated
     */
    boolean isSetMaxAttributes();

    /**
     * Returns the value of the '<em><b>Max GOOSE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max GOOSE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max GOOSE</em>' attribute.
     * @see #isSetMaxGOOSE()
     * @see #unsetMaxGOOSE()
     * @see #setMaxGOOSE(Integer)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getClientServices_MaxGOOSE()
     * @model unsettable="true"
     * @generated
     */
    Integer getMaxGOOSE();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getMaxGOOSE <em>Max GOOSE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max GOOSE</em>' attribute.
     * @see #isSetMaxGOOSE()
     * @see #unsetMaxGOOSE()
     * @see #getMaxGOOSE()
     * @generated
     */
    void setMaxGOOSE( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getMaxGOOSE <em>Max GOOSE</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetMaxGOOSE()
     * @see #getMaxGOOSE()
     * @see #setMaxGOOSE(Integer)
     * @generated
     */
    void unsetMaxGOOSE();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getMaxGOOSE <em>Max GOOSE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max GOOSE</em>' attribute is set.
     * @see #unsetMaxGOOSE()
     * @see #getMaxGOOSE()
     * @see #setMaxGOOSE(Integer)
     * @generated
     */
    boolean isSetMaxGOOSE();

    /**
     * Returns the value of the '<em><b>Max Reports</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Reports</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Reports</em>' attribute.
     * @see #isSetMaxReports()
     * @see #unsetMaxReports()
     * @see #setMaxReports(Integer)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getClientServices_MaxReports()
     * @model unsettable="true"
     * @generated
     */
    Integer getMaxReports();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getMaxReports <em>Max Reports</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Reports</em>' attribute.
     * @see #isSetMaxReports()
     * @see #unsetMaxReports()
     * @see #getMaxReports()
     * @generated
     */
    void setMaxReports( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getMaxReports <em>Max Reports</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetMaxReports()
     * @see #getMaxReports()
     * @see #setMaxReports(Integer)
     * @generated
     */
    void unsetMaxReports();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getMaxReports <em>Max Reports</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Reports</em>' attribute is set.
     * @see #unsetMaxReports()
     * @see #getMaxReports()
     * @see #setMaxReports(Integer)
     * @generated
     */
    boolean isSetMaxReports();

    /**
     * Returns the value of the '<em><b>Max SMV</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max SMV</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max SMV</em>' attribute.
     * @see #isSetMaxSMV()
     * @see #unsetMaxSMV()
     * @see #setMaxSMV(Integer)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getClientServices_MaxSMV()
     * @model unsettable="true"
     * @generated
     */
    Integer getMaxSMV();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getMaxSMV <em>Max SMV</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max SMV</em>' attribute.
     * @see #isSetMaxSMV()
     * @see #unsetMaxSMV()
     * @see #getMaxSMV()
     * @generated
     */
    void setMaxSMV( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getMaxSMV <em>Max SMV</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetMaxSMV()
     * @see #getMaxSMV()
     * @see #setMaxSMV(Integer)
     * @generated
     */
    void unsetMaxSMV();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getMaxSMV <em>Max SMV</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max SMV</em>' attribute is set.
     * @see #unsetMaxSMV()
     * @see #getMaxSMV()
     * @see #setMaxSMV(Integer)
     * @generated
     */
    boolean isSetMaxSMV();

    /**
     * Returns the value of the '<em><b>Read Log</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Read Log</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Read Log</em>' attribute.
     * @see #isSetReadLog()
     * @see #unsetReadLog()
     * @see #setReadLog(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getClientServices_ReadLog()
     * @model default="false" unsettable="true"
     * @generated
     */
    Boolean getReadLog();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getReadLog <em>Read Log</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @param value the new value of the '<em>Read Log</em>' attribute.
     * @see #isSetReadLog()
     * @see #unsetReadLog()
     * @see #getReadLog()
     * @generated
     */
    void setReadLog( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getReadLog <em>Read Log</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetReadLog()
     * @see #getReadLog()
     * @see #setReadLog(Boolean)
     * @generated
     */
    void unsetReadLog();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getReadLog <em>Read Log</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Read Log</em>' attribute is set.
     * @see #unsetReadLog()
     * @see #getReadLog()
     * @see #setReadLog(Boolean)
     * @generated
     */
    boolean isSetReadLog();

    /**
     * Returns the value of the '<em><b>Supports Ld Name</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Supports Ld Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Supports Ld Name</em>' attribute.
     * @see #isSetSupportsLdName()
     * @see #unsetSupportsLdName()
     * @see #setSupportsLdName(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getClientServices_SupportsLdName()
     * @model default="false" unsettable="true"
     * @generated
     */
    Boolean getSupportsLdName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getSupportsLdName <em>Supports Ld Name</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @param value the new value of the '<em>Supports Ld Name</em>' attribute.
     * @see #isSetSupportsLdName()
     * @see #unsetSupportsLdName()
     * @see #getSupportsLdName()
     * @generated
     */
    void setSupportsLdName( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getSupportsLdName <em>Supports Ld Name</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetSupportsLdName()
     * @see #getSupportsLdName()
     * @see #setSupportsLdName(Boolean)
     * @generated
     */
    void unsetSupportsLdName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getSupportsLdName <em>Supports Ld Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Supports Ld Name</em>' attribute is set.
     * @see #unsetSupportsLdName()
     * @see #getSupportsLdName()
     * @see #setSupportsLdName(Boolean)
     * @generated
     */
    boolean isSetSupportsLdName();

    /**
     * Returns the value of the '<em><b>Sv</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sv</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sv</em>' attribute.
     * @see #isSetSv()
     * @see #unsetSv()
     * @see #setSv(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getClientServices_Sv()
     * @model default="false" unsettable="true"
     * @generated
     */
    Boolean getSv();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getSv <em>Sv</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sv</em>' attribute.
     * @see #isSetSv()
     * @see #unsetSv()
     * @see #getSv()
     * @generated
     */
    void setSv( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getSv <em>Sv</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetSv()
     * @see #getSv()
     * @see #setSv(Boolean)
     * @generated
     */
    void unsetSv();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getSv <em>Sv</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sv</em>' attribute is set.
     * @see #unsetSv()
     * @see #getSv()
     * @see #setSv(Boolean)
     * @generated
     */
    boolean isSetSv();

    /**
     * Returns the value of the '<em><b>Unbuf Report</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Unbuf Report</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Unbuf Report</em>' attribute.
     * @see #isSetUnbufReport()
     * @see #unsetUnbufReport()
     * @see #setUnbufReport(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getClientServices_UnbufReport()
     * @model default="false" unsettable="true"
     * @generated
     */
    Boolean getUnbufReport();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getUnbufReport <em>Unbuf Report</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @param value the new value of the '<em>Unbuf Report</em>' attribute.
     * @see #isSetUnbufReport()
     * @see #unsetUnbufReport()
     * @see #getUnbufReport()
     * @generated
     */
    void setUnbufReport( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getUnbufReport <em>Unbuf Report</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetUnbufReport()
     * @see #getUnbufReport()
     * @see #setUnbufReport(Boolean)
     * @generated
     */
    void unsetUnbufReport();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getUnbufReport <em>Unbuf Report</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Unbuf Report</em>' attribute is set.
     * @see #unsetUnbufReport()
     * @see #getUnbufReport()
     * @see #setUnbufReport(Boolean)
     * @generated
     */
    boolean isSetUnbufReport();

    /**
     * Returns the value of the '<em><b>Parent Services</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getClientServices <em>Client Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Services</em>' container reference.
     * @see #setParentServices(Services)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getClientServices_ParentServices()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getClientServices
     * @model opposite="ClientServices" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    Services getParentServices();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getParentServices <em>Parent Services</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Services</em>' container reference.
     * @see #getParentServices()
     * @generated
     */
    void setParentServices( Services value );

    /**
     * Returns the value of the '<em><b>Time Sync Prot</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt#getParentClientServices <em>Parent Client Services</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time Sync Prot</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Time Sync Prot</em>' containment reference.
     * @see #isSetTimeSyncProt()
     * @see #unsetTimeSyncProt()
     * @see #setTimeSyncProt(TimeSyncProt)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getClientServices_TimeSyncProt()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt#getParentClientServices
     * @model opposite="ParentClientServices" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='##targetNamespace' kind='element'"
     * @generated
     */
    TimeSyncProt getTimeSyncProt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getTimeSyncProt <em>Time Sync Prot</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Time Sync Prot</em>' containment reference.
     * @see #isSetTimeSyncProt()
     * @see #unsetTimeSyncProt()
     * @see #getTimeSyncProt()
     * @generated
     */
    void setTimeSyncProt( TimeSyncProt value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getTimeSyncProt <em>Time Sync Prot</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTimeSyncProt()
     * @see #getTimeSyncProt()
     * @see #setTimeSyncProt(TimeSyncProt)
     * @generated
     */
    void unsetTimeSyncProt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getTimeSyncProt <em>Time Sync Prot</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Time Sync Prot</em>' containment reference is set.
     * @see #unsetTimeSyncProt()
     * @see #getTimeSyncProt()
     * @see #setTimeSyncProt(TimeSyncProt)
     * @generated
     */
    boolean isSetTimeSyncProt();

    /**
     * Returns the value of the '<em><b>RGOOSE</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>RGOOSE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>RGOOSE</em>' attribute.
     * @see #isSetRGOOSE()
     * @see #unsetRGOOSE()
     * @see #setRGOOSE(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getClientServices_RGOOSE()
     * @model default="false" unsettable="true"
     * @generated
     */
    Boolean getRGOOSE();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getRGOOSE <em>RGOOSE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>RGOOSE</em>' attribute.
     * @see #isSetRGOOSE()
     * @see #unsetRGOOSE()
     * @see #getRGOOSE()
     * @generated
     */
    void setRGOOSE( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getRGOOSE <em>RGOOSE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRGOOSE()
     * @see #getRGOOSE()
     * @see #setRGOOSE(Boolean)
     * @generated
     */
    void unsetRGOOSE();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getRGOOSE <em>RGOOSE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>RGOOSE</em>' attribute is set.
     * @see #unsetRGOOSE()
     * @see #getRGOOSE()
     * @see #setRGOOSE(Boolean)
     * @generated
     */
    boolean isSetRGOOSE();

    /**
     * Returns the value of the '<em><b>RSV</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>RSV</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>RSV</em>' attribute.
     * @see #isSetRSV()
     * @see #unsetRSV()
     * @see #setRSV(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getClientServices_RSV()
     * @model default="false" unsettable="true"
     * @generated
     */
    Boolean getRSV();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getRSV <em>RSV</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>RSV</em>' attribute.
     * @see #isSetRSV()
     * @see #unsetRSV()
     * @see #getRSV()
     * @generated
     */
    void setRSV( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getRSV <em>RSV</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRSV()
     * @see #getRSV()
     * @see #setRSV(Boolean)
     * @generated
     */
    void unsetRSV();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getRSV <em>RSV</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>RSV</em>' attribute is set.
     * @see #unsetRSV()
     * @see #getRSV()
     * @see #setRSV(Boolean)
     * @generated
     */
    boolean isSetRSV();

    /**
     * Returns the value of the '<em><b>No Ict Binding</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>No Ict Binding</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>No Ict Binding</em>' attribute.
     * @see #isSetNoIctBinding()
     * @see #unsetNoIctBinding()
     * @see #setNoIctBinding(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getClientServices_NoIctBinding()
     * @model default="false" unsettable="true"
     * @generated
     */
    Boolean getNoIctBinding();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getNoIctBinding <em>No Ict Binding</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>No Ict Binding</em>' attribute.
     * @see #isSetNoIctBinding()
     * @see #unsetNoIctBinding()
     * @see #getNoIctBinding()
     * @generated
     */
    void setNoIctBinding( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getNoIctBinding <em>No Ict Binding</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNoIctBinding()
     * @see #getNoIctBinding()
     * @see #setNoIctBinding(Boolean)
     * @generated
     */
    void unsetNoIctBinding();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getNoIctBinding <em>No Ict Binding</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>No Ict Binding</em>' attribute is set.
     * @see #unsetNoIctBinding()
     * @see #getNoIctBinding()
     * @see #setNoIctBinding(Boolean)
     * @generated
     */
    boolean isSetNoIctBinding();

    /**
     * Returns the value of the '<em><b>Mc Security</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.McSecurity#getParentClientServices <em>Parent Client Services</em>}'.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getClientServices_McSecurity()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.McSecurity#getParentClientServices
     * @model opposite="ParentClientServices" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='##targetNamespace' kind='element'"
     * @generated
     */
    McSecurity getMcSecurity();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getMcSecurity <em>Mc Security</em>}' containment reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getMcSecurity <em>Mc Security</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMcSecurity()
     * @see #getMcSecurity()
     * @see #setMcSecurity(McSecurity)
     * @generated
     */
    void unsetMcSecurity();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getMcSecurity <em>Mc Security</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Mc Security</em>' containment reference is set.
     * @see #unsetMcSecurity()
     * @see #getMcSecurity()
     * @see #setMcSecurity(McSecurity)
     * @generated
     */
    boolean isSetMcSecurity();

} // ClientServices
