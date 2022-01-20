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
 * A representation of the model object '<em><b>Report Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getBuffered <em>Buffered</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getBufTime <em>Buf Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getConfRev <em>Conf Rev</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getIndexed <em>Indexed</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getRptID <em>Rpt ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getParentAnyLN <em>Parent Any LN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getOptFields <em>Opt Fields</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getRptEnabled <em>Rpt Enabled</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getReportControl()
 * @model
 * @generated
 */
public interface ReportControl extends ControlWithTriggerOpt {
    /**
     * Returns the value of the '<em><b>Buffered</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Buffered</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Buffered</em>' attribute.
     * @see #isSetBuffered()
     * @see #unsetBuffered()
     * @see #setBuffered(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getReportControl_Buffered()
     * @model default="false" unsettable="true"
     * @generated
     */
    Boolean getBuffered();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getBuffered <em>Buffered</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Buffered</em>' attribute.
     * @see #isSetBuffered()
     * @see #unsetBuffered()
     * @see #getBuffered()
     * @generated
     */
    void setBuffered( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getBuffered <em>Buffered</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetBuffered()
     * @see #getBuffered()
     * @see #setBuffered(Boolean)
     * @generated
     */
    void unsetBuffered();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getBuffered <em>Buffered</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Buffered</em>' attribute is set.
     * @see #unsetBuffered()
     * @see #getBuffered()
     * @see #setBuffered(Boolean)
     * @generated
     */
    boolean isSetBuffered();

    /**
     * Returns the value of the '<em><b>Buf Time</b></em>' attribute.
     * The default value is <code>"0"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Buf Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Buf Time</em>' attribute.
     * @see #isSetBufTime()
     * @see #unsetBufTime()
     * @see #setBufTime(Integer)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getReportControl_BufTime()
     * @model default="0" unsettable="true"
     * @generated
     */
    Integer getBufTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getBufTime <em>Buf Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Buf Time</em>' attribute.
     * @see #isSetBufTime()
     * @see #unsetBufTime()
     * @see #getBufTime()
     * @generated
     */
    void setBufTime( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getBufTime <em>Buf Time</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetBufTime()
     * @see #getBufTime()
     * @see #setBufTime(Integer)
     * @generated
     */
    void unsetBufTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getBufTime <em>Buf Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Buf Time</em>' attribute is set.
     * @see #unsetBufTime()
     * @see #getBufTime()
     * @see #setBufTime(Integer)
     * @generated
     */
    boolean isSetBufTime();

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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getReportControl_ConfRev()
     * @model unsettable="true"
     * @generated
     */
    Integer getConfRev();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getConfRev <em>Conf Rev</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getConfRev <em>Conf Rev</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetConfRev()
     * @see #getConfRev()
     * @see #setConfRev(Integer)
     * @generated
     */
    void unsetConfRev();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getConfRev <em>Conf Rev</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Indexed</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Indexed</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Indexed</em>' attribute.
     * @see #isSetIndexed()
     * @see #unsetIndexed()
     * @see #setIndexed(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getReportControl_Indexed()
     * @model default="true" unsettable="true"
     * @generated
     */
    Boolean getIndexed();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getIndexed <em>Indexed</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @param value the new value of the '<em>Indexed</em>' attribute.
     * @see #isSetIndexed()
     * @see #unsetIndexed()
     * @see #getIndexed()
     * @generated
     */
    void setIndexed( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getIndexed <em>Indexed</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetIndexed()
     * @see #getIndexed()
     * @see #setIndexed(Boolean)
     * @generated
     */
    void unsetIndexed();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getIndexed <em>Indexed</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Indexed</em>' attribute is set.
     * @see #unsetIndexed()
     * @see #getIndexed()
     * @see #setIndexed(Boolean)
     * @generated
     */
    boolean isSetIndexed();

    /**
     * Returns the value of the '<em><b>Rpt ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rpt ID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rpt ID</em>' attribute.
     * @see #isSetRptID()
     * @see #unsetRptID()
     * @see #setRptID(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getReportControl_RptID()
     * @model unsettable="true"
     * @generated
     */
    String getRptID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getRptID <em>Rpt ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rpt ID</em>' attribute.
     * @see #isSetRptID()
     * @see #unsetRptID()
     * @see #getRptID()
     * @generated
     */
    void setRptID( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getRptID <em>Rpt ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRptID()
     * @see #getRptID()
     * @see #setRptID(String)
     * @generated
     */
    void unsetRptID();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getRptID <em>Rpt ID</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rpt ID</em>' attribute is set.
     * @see #unsetRptID()
     * @see #getRptID()
     * @see #setRptID(String)
     * @generated
     */
    boolean isSetRptID();

    /**
     * Returns the value of the '<em><b>Parent Any LN</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReportControl <em>Report Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Any LN</em>' container reference.
     * @see #setParentAnyLN(AnyLN)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getReportControl_ParentAnyLN()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReportControl
     * @model opposite="ReportControl" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    @Override
    AnyLN getParentAnyLN();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getParentAnyLN <em>Parent Any LN</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Any LN</em>' container reference.
     * @see #getParentAnyLN()
     * @generated
     */
    void setParentAnyLN( AnyLN value );

    /**
     * Returns the value of the '<em><b>Opt Fields</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields#getParentReportControl <em>Parent Report Control</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Opt Fields</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Opt Fields</em>' containment reference.
     * @see #isSetOptFields()
     * @see #unsetOptFields()
     * @see #setOptFields(OptFields)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getReportControl_OptFields()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields#getParentReportControl
     * @model opposite="ParentReportControl" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    OptFields getOptFields();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getOptFields <em>Opt Fields</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Opt Fields</em>' containment reference.
     * @see #isSetOptFields()
     * @see #unsetOptFields()
     * @see #getOptFields()
     * @generated
     */
    void setOptFields( OptFields value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getOptFields <em>Opt Fields</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOptFields()
     * @see #getOptFields()
     * @see #setOptFields(OptFields)
     * @generated
     */
    void unsetOptFields();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getOptFields <em>Opt Fields</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Opt Fields</em>' containment reference is set.
     * @see #unsetOptFields()
     * @see #getOptFields()
     * @see #setOptFields(OptFields)
     * @generated
     */
    boolean isSetOptFields();

    /**
     * Returns the value of the '<em><b>Rpt Enabled</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RptEnabled#getParentReportControl <em>Parent Report Control</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rpt Enabled</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rpt Enabled</em>' containment reference.
     * @see #isSetRptEnabled()
     * @see #unsetRptEnabled()
     * @see #setRptEnabled(RptEnabled)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getReportControl_RptEnabled()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.RptEnabled#getParentReportControl
     * @model opposite="ParentReportControl" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    RptEnabled getRptEnabled();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getRptEnabled <em>Rpt Enabled</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rpt Enabled</em>' containment reference.
     * @see #isSetRptEnabled()
     * @see #unsetRptEnabled()
     * @see #getRptEnabled()
     * @generated
     */
    void setRptEnabled( RptEnabled value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getRptEnabled <em>Rpt Enabled</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRptEnabled()
     * @see #getRptEnabled()
     * @see #setRptEnabled(RptEnabled)
     * @generated
     */
    void unsetRptEnabled();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getRptEnabled <em>Rpt Enabled</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rpt Enabled</em>' containment reference is set.
     * @see #unsetRptEnabled()
     * @see #getRptEnabled()
     * @see #setRptEnabled(RptEnabled)
     * @generated
     */
    boolean isSetRptEnabled();

} // ReportControl
