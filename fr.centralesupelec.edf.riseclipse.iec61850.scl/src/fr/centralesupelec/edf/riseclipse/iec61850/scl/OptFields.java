/**
 *  Copyright (c) 2017 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.iec61850.scl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opt Fields</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields#getBufOvfl <em>Buf Ovfl</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields#getConfigRef <em>Config Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields#getDataRef <em>Data Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields#getDataSet <em>Data Set</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields#getEntryID <em>Entry ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields#getReasonCode <em>Reason Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields#getSeqNum <em>Seq Num</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields#getReportControl <em>Report Control</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getOptFields()
 * @model
 * @generated
 */
public interface OptFields extends SclObject {
    /**
	 * Returns the value of the '<em><b>Buf Ovfl</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Buf Ovfl</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Buf Ovfl</em>' attribute.
	 * @see #isSetBufOvfl()
	 * @see #unsetBufOvfl()
	 * @see #setBufOvfl(Boolean)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getOptFields_BufOvfl()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!OptFields!bufOvfl'"
	 * @generated
	 */
    Boolean getBufOvfl();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields#getBufOvfl <em>Buf Ovfl</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buf Ovfl</em>' attribute.
	 * @see #isSetBufOvfl()
	 * @see #unsetBufOvfl()
	 * @see #getBufOvfl()
	 * @generated
	 */
    void setBufOvfl( Boolean value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields#getBufOvfl <em>Buf Ovfl</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetBufOvfl()
	 * @see #getBufOvfl()
	 * @see #setBufOvfl(Boolean)
	 * @generated
	 */
    void unsetBufOvfl();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields#getBufOvfl <em>Buf Ovfl</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Buf Ovfl</em>' attribute is set.
	 * @see #unsetBufOvfl()
	 * @see #getBufOvfl()
	 * @see #setBufOvfl(Boolean)
	 * @generated
	 */
    boolean isSetBufOvfl();

    /**
	 * Returns the value of the '<em><b>Config Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Config Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Ref</em>' attribute.
	 * @see #isSetConfigRef()
	 * @see #unsetConfigRef()
	 * @see #setConfigRef(Boolean)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getOptFields_ConfigRef()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!OptFields!configRef'"
	 * @generated
	 */
    Boolean getConfigRef();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields#getConfigRef <em>Config Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Ref</em>' attribute.
	 * @see #isSetConfigRef()
	 * @see #unsetConfigRef()
	 * @see #getConfigRef()
	 * @generated
	 */
    void setConfigRef( Boolean value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields#getConfigRef <em>Config Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetConfigRef()
	 * @see #getConfigRef()
	 * @see #setConfigRef(Boolean)
	 * @generated
	 */
    void unsetConfigRef();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields#getConfigRef <em>Config Ref</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Config Ref</em>' attribute is set.
	 * @see #unsetConfigRef()
	 * @see #getConfigRef()
	 * @see #setConfigRef(Boolean)
	 * @generated
	 */
    boolean isSetConfigRef();

    /**
	 * Returns the value of the '<em><b>Data Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Ref</em>' attribute.
	 * @see #isSetDataRef()
	 * @see #unsetDataRef()
	 * @see #setDataRef(Boolean)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getOptFields_DataRef()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!OptFields!dataRef'"
	 * @generated
	 */
    Boolean getDataRef();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields#getDataRef <em>Data Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Ref</em>' attribute.
	 * @see #isSetDataRef()
	 * @see #unsetDataRef()
	 * @see #getDataRef()
	 * @generated
	 */
    void setDataRef( Boolean value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields#getDataRef <em>Data Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetDataRef()
	 * @see #getDataRef()
	 * @see #setDataRef(Boolean)
	 * @generated
	 */
    void unsetDataRef();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields#getDataRef <em>Data Ref</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Ref</em>' attribute is set.
	 * @see #unsetDataRef()
	 * @see #getDataRef()
	 * @see #setDataRef(Boolean)
	 * @generated
	 */
    boolean isSetDataRef();

    /**
	 * Returns the value of the '<em><b>Data Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Set</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set</em>' attribute.
	 * @see #isSetDataSet()
	 * @see #unsetDataSet()
	 * @see #setDataSet(Boolean)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getOptFields_DataSet()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!OptFields!dataSet'"
	 * @generated
	 */
    Boolean getDataSet();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields#getDataSet <em>Data Set</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Set</em>' attribute.
	 * @see #isSetDataSet()
	 * @see #unsetDataSet()
	 * @see #getDataSet()
	 * @generated
	 */
    void setDataSet( Boolean value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields#getDataSet <em>Data Set</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetDataSet()
	 * @see #getDataSet()
	 * @see #setDataSet(Boolean)
	 * @generated
	 */
    void unsetDataSet();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields#getDataSet <em>Data Set</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Set</em>' attribute is set.
	 * @see #unsetDataSet()
	 * @see #getDataSet()
	 * @see #setDataSet(Boolean)
	 * @generated
	 */
    boolean isSetDataSet();

    /**
	 * Returns the value of the '<em><b>Entry ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entry ID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry ID</em>' attribute.
	 * @see #isSetEntryID()
	 * @see #unsetEntryID()
	 * @see #setEntryID(Boolean)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getOptFields_EntryID()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!OptFields!entryID'"
	 * @generated
	 */
    Boolean getEntryID();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields#getEntryID <em>Entry ID</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry ID</em>' attribute.
	 * @see #isSetEntryID()
	 * @see #unsetEntryID()
	 * @see #getEntryID()
	 * @generated
	 */
    void setEntryID( Boolean value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields#getEntryID <em>Entry ID</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetEntryID()
	 * @see #getEntryID()
	 * @see #setEntryID(Boolean)
	 * @generated
	 */
    void unsetEntryID();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields#getEntryID <em>Entry ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Entry ID</em>' attribute is set.
	 * @see #unsetEntryID()
	 * @see #getEntryID()
	 * @see #setEntryID(Boolean)
	 * @generated
	 */
    boolean isSetEntryID();

    /**
	 * Returns the value of the '<em><b>Reason Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reason Code</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason Code</em>' attribute.
	 * @see #isSetReasonCode()
	 * @see #unsetReasonCode()
	 * @see #setReasonCode(Boolean)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getOptFields_ReasonCode()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!OptFields!reasonCode'"
	 * @generated
	 */
    Boolean getReasonCode();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields#getReasonCode <em>Reason Code</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason Code</em>' attribute.
	 * @see #isSetReasonCode()
	 * @see #unsetReasonCode()
	 * @see #getReasonCode()
	 * @generated
	 */
    void setReasonCode( Boolean value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields#getReasonCode <em>Reason Code</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetReasonCode()
	 * @see #getReasonCode()
	 * @see #setReasonCode(Boolean)
	 * @generated
	 */
    void unsetReasonCode();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields#getReasonCode <em>Reason Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reason Code</em>' attribute is set.
	 * @see #unsetReasonCode()
	 * @see #getReasonCode()
	 * @see #setReasonCode(Boolean)
	 * @generated
	 */
    boolean isSetReasonCode();

    /**
	 * Returns the value of the '<em><b>Seq Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Seq Num</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Seq Num</em>' attribute.
	 * @see #isSetSeqNum()
	 * @see #unsetSeqNum()
	 * @see #setSeqNum(Boolean)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getOptFields_SeqNum()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!OptFields!seqNum'"
	 * @generated
	 */
    Boolean getSeqNum();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields#getSeqNum <em>Seq Num</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seq Num</em>' attribute.
	 * @see #isSetSeqNum()
	 * @see #unsetSeqNum()
	 * @see #getSeqNum()
	 * @generated
	 */
    void setSeqNum( Boolean value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields#getSeqNum <em>Seq Num</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetSeqNum()
	 * @see #getSeqNum()
	 * @see #setSeqNum(Boolean)
	 * @generated
	 */
    void unsetSeqNum();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields#getSeqNum <em>Seq Num</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Seq Num</em>' attribute is set.
	 * @see #unsetSeqNum()
	 * @see #getSeqNum()
	 * @see #setSeqNum(Boolean)
	 * @generated
	 */
    boolean isSetSeqNum();

    /**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time Stamp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' attribute.
	 * @see #isSetTimeStamp()
	 * @see #unsetTimeStamp()
	 * @see #setTimeStamp(Boolean)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getOptFields_TimeStamp()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!OptFields!timeStamp'"
	 * @generated
	 */
    Boolean getTimeStamp();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields#getTimeStamp <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' attribute.
	 * @see #isSetTimeStamp()
	 * @see #unsetTimeStamp()
	 * @see #getTimeStamp()
	 * @generated
	 */
    void setTimeStamp( Boolean value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields#getTimeStamp <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetTimeStamp()
	 * @see #getTimeStamp()
	 * @see #setTimeStamp(Boolean)
	 * @generated
	 */
    void unsetTimeStamp();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields#getTimeStamp <em>Time Stamp</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Time Stamp</em>' attribute is set.
	 * @see #unsetTimeStamp()
	 * @see #getTimeStamp()
	 * @see #setTimeStamp(Boolean)
	 * @generated
	 */
    boolean isSetTimeStamp();

    /**
	 * Returns the value of the '<em><b>Report Control</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getOptFields <em>Opt Fields</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Report Control</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Report Control</em>' container reference.
	 * @see #setReportControl(ReportControl)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getOptFields_ReportControl()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getOptFields
	 * @model opposite="OptFields" resolveProxies="false" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!OptFields!ReportControl'"
	 * @generated
	 */
    ReportControl getReportControl();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields#getReportControl <em>Report Control</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Report Control</em>' container reference.
	 * @see #getReportControl()
	 * @generated
	 */
    void setReportControl( ReportControl value );

} // OptFields
