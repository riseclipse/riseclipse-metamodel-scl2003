/**
 *  Copyright (c) 2016-2024 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-v20.html
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
 *      https://riseclipse.github.io/
 * 
 */
package fr.centralesupelec.edf.riseclipse.iec61850.scl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ext Ctrl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtCtrl#getApRef <em>Ap Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtCtrl#getCheckInterlock <em>Check Interlock</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtCtrl#getCheckSynchrocheck <em>Check Synchrocheck</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtCtrl#getIntAdrr <em>Int Adrr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtCtrl#getParentOutputs <em>Parent Outputs</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getExtCtrl()
 * @model
 * @generated
 */
public interface ExtCtrl extends DORef {
    /**
     * Returns the value of the '<em><b>Ap Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ap Ref</em>' attribute.
     * @see #isSetApRef()
     * @see #unsetApRef()
     * @see #setApRef(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getExtCtrl_ApRef()
     * @model unsettable="true"
     * @generated
     */
    String getApRef();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtCtrl#getApRef <em>Ap Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ap Ref</em>' attribute.
     * @see #isSetApRef()
     * @see #unsetApRef()
     * @see #getApRef()
     * @generated
     */
    void setApRef( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtCtrl#getApRef <em>Ap Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetApRef()
     * @see #getApRef()
     * @see #setApRef(String)
     * @generated
     */
    void unsetApRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtCtrl#getApRef <em>Ap Ref</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ap Ref</em>' attribute is set.
     * @see #unsetApRef()
     * @see #getApRef()
     * @see #setApRef(String)
     * @generated
     */
    boolean isSetApRef();

    /**
     * Returns the value of the '<em><b>Check Interlock</b></em>' attribute.
     * The default value is <code>"True"</code>.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtControlCheckEnum}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Check Interlock</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtControlCheckEnum
     * @see #isSetCheckInterlock()
     * @see #unsetCheckInterlock()
     * @see #setCheckInterlock(ExtControlCheckEnum)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getExtCtrl_CheckInterlock()
     * @model default="True" unsettable="true"
     * @generated
     */
    ExtControlCheckEnum getCheckInterlock();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtCtrl#getCheckInterlock <em>Check Interlock</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Check Interlock</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtControlCheckEnum
     * @see #isSetCheckInterlock()
     * @see #unsetCheckInterlock()
     * @see #getCheckInterlock()
     * @generated
     */
    void setCheckInterlock( ExtControlCheckEnum value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtCtrl#getCheckInterlock <em>Check Interlock</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCheckInterlock()
     * @see #getCheckInterlock()
     * @see #setCheckInterlock(ExtControlCheckEnum)
     * @generated
     */
    void unsetCheckInterlock();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtCtrl#getCheckInterlock <em>Check Interlock</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Check Interlock</em>' attribute is set.
     * @see #unsetCheckInterlock()
     * @see #getCheckInterlock()
     * @see #setCheckInterlock(ExtControlCheckEnum)
     * @generated
     */
    boolean isSetCheckInterlock();

    /**
     * Returns the value of the '<em><b>Check Synchrocheck</b></em>' attribute.
     * The default value is <code>"True"</code>.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtControlCheckEnum}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Check Synchrocheck</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtControlCheckEnum
     * @see #isSetCheckSynchrocheck()
     * @see #unsetCheckSynchrocheck()
     * @see #setCheckSynchrocheck(ExtControlCheckEnum)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getExtCtrl_CheckSynchrocheck()
     * @model default="True" unsettable="true"
     * @generated
     */
    ExtControlCheckEnum getCheckSynchrocheck();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtCtrl#getCheckSynchrocheck <em>Check Synchrocheck</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Check Synchrocheck</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtControlCheckEnum
     * @see #isSetCheckSynchrocheck()
     * @see #unsetCheckSynchrocheck()
     * @see #getCheckSynchrocheck()
     * @generated
     */
    void setCheckSynchrocheck( ExtControlCheckEnum value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtCtrl#getCheckSynchrocheck <em>Check Synchrocheck</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCheckSynchrocheck()
     * @see #getCheckSynchrocheck()
     * @see #setCheckSynchrocheck(ExtControlCheckEnum)
     * @generated
     */
    void unsetCheckSynchrocheck();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtCtrl#getCheckSynchrocheck <em>Check Synchrocheck</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Check Synchrocheck</em>' attribute is set.
     * @see #unsetCheckSynchrocheck()
     * @see #getCheckSynchrocheck()
     * @see #setCheckSynchrocheck(ExtControlCheckEnum)
     * @generated
     */
    boolean isSetCheckSynchrocheck();

    /**
     * Returns the value of the '<em><b>Int Adrr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Int Adrr</em>' attribute.
     * @see #isSetIntAdrr()
     * @see #unsetIntAdrr()
     * @see #setIntAdrr(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getExtCtrl_IntAdrr()
     * @model unsettable="true"
     * @generated
     */
    String getIntAdrr();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtCtrl#getIntAdrr <em>Int Adrr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Int Adrr</em>' attribute.
     * @see #isSetIntAdrr()
     * @see #unsetIntAdrr()
     * @see #getIntAdrr()
     * @generated
     */
    void setIntAdrr( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtCtrl#getIntAdrr <em>Int Adrr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIntAdrr()
     * @see #getIntAdrr()
     * @see #setIntAdrr(String)
     * @generated
     */
    void unsetIntAdrr();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtCtrl#getIntAdrr <em>Int Adrr</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Int Adrr</em>' attribute is set.
     * @see #unsetIntAdrr()
     * @see #getIntAdrr()
     * @see #setIntAdrr(String)
     * @generated
     */
    boolean isSetIntAdrr();

    /**
     * Returns the value of the '<em><b>Parent Outputs</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Outputs#getExtCtrl <em>Ext Ctrl</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Outputs</em>' container reference.
     * @see #setParentOutputs(Outputs)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getExtCtrl_ParentOutputs()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Outputs#getExtCtrl
     * @model opposite="ExtCtrl" unsettable="true" ordered="false"
     * @generated
     */
    Outputs getParentOutputs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtCtrl#getParentOutputs <em>Parent Outputs</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Outputs</em>' container reference.
     * @see #getParentOutputs()
     * @generated
     */
    void setParentOutputs( Outputs value );

} // ExtCtrl
