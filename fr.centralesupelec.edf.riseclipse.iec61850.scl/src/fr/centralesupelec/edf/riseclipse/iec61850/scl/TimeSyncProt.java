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
 * A representation of the model object '<em><b>Time Sync Prot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt#getC37_238 <em>C37 238</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt#getOther <em>Other</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt#getSntp <em>Sntp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt#getClientServices <em>Client Services</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getTimeSyncProt()
 * @model
 * @generated
 */
public interface TimeSyncProt extends SclObject {
    /**
     * Returns the value of the '<em><b>C37 238</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>C37 238</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>C37 238</em>' attribute.
     * @see #isSetC37_238()
     * @see #unsetC37_238()
     * @see #setC37_238(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getTimeSyncProt_C37_238()
     * @model unsettable="true"
     * @generated
     */
    Boolean getC37_238();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt#getC37_238 <em>C37 238</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>C37 238</em>' attribute.
     * @see #isSetC37_238()
     * @see #unsetC37_238()
     * @see #getC37_238()
     * @generated
     */
    void setC37_238( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt#getC37_238 <em>C37 238</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetC37_238()
     * @see #getC37_238()
     * @see #setC37_238(Boolean)
     * @generated
     */
    void unsetC37_238();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt#getC37_238 <em>C37 238</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>C37 238</em>' attribute is set.
     * @see #unsetC37_238()
     * @see #getC37_238()
     * @see #setC37_238(Boolean)
     * @generated
     */
    boolean isSetC37_238();

    /**
     * Returns the value of the '<em><b>Other</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Other</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Other</em>' attribute.
     * @see #isSetOther()
     * @see #unsetOther()
     * @see #setOther(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getTimeSyncProt_Other()
     * @model unsettable="true"
     * @generated
     */
    Boolean getOther();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt#getOther <em>Other</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @param value the new value of the '<em>Other</em>' attribute.
     * @see #isSetOther()
     * @see #unsetOther()
     * @see #getOther()
     * @generated
     */
    void setOther( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt#getOther <em>Other</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetOther()
     * @see #getOther()
     * @see #setOther(Boolean)
     * @generated
     */
    void unsetOther();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt#getOther <em>Other</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Other</em>' attribute is set.
     * @see #unsetOther()
     * @see #getOther()
     * @see #setOther(Boolean)
     * @generated
     */
    boolean isSetOther();

    /**
     * Returns the value of the '<em><b>Sntp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sntp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sntp</em>' attribute.
     * @see #isSetSntp()
     * @see #unsetSntp()
     * @see #setSntp(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getTimeSyncProt_Sntp()
     * @model unsettable="true"
     * @generated
     */
    Boolean getSntp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt#getSntp <em>Sntp</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sntp</em>' attribute.
     * @see #isSetSntp()
     * @see #unsetSntp()
     * @see #getSntp()
     * @generated
     */
    void setSntp( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt#getSntp <em>Sntp</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetSntp()
     * @see #getSntp()
     * @see #setSntp(Boolean)
     * @generated
     */
    void unsetSntp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt#getSntp <em>Sntp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sntp</em>' attribute is set.
     * @see #unsetSntp()
     * @see #getSntp()
     * @see #setSntp(Boolean)
     * @generated
     */
    boolean isSetSntp();

    /**
     * Returns the value of the '<em><b>Client Services</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getTimeSyncProt <em>Time Sync Prot</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Client Services</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Client Services</em>' container reference.
     * @see #setClientServices(ClientServices)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getTimeSyncProt_ClientServices()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getTimeSyncProt
     * @model opposite="TimeSyncProt" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    ClientServices getClientServices();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt#getClientServices <em>Client Services</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Client Services</em>' container reference.
     * @see #getClientServices()
     * @generated
     */
    void setClientServices( ClientServices value );

    /**
     * Returns the value of the '<em><b>Services</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getTimeSyncProt <em>Time Sync Prot</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Services</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Services</em>' container reference.
     * @see #setServices(Services)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getTimeSyncProt_Services()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getTimeSyncProt
     * @model opposite="TimeSyncProt" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    Services getServices();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt#getServices <em>Services</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Services</em>' container reference.
     * @see #getServices()
     * @generated
     */
    void setServices( Services value );

} // TimeSyncProt
