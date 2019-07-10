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
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt#getParentClientServices <em>Parent Client Services</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt#getParentServices <em>Parent Services</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt#getIec61850_9_3 <em>Iec61850 93</em>}</li>
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
     * Returns the value of the '<em><b>Parent Client Services</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getTimeSyncProt <em>Time Sync Prot</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Client Services</em>' container reference.
     * @see #setParentClientServices(ClientServices)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getTimeSyncProt_ParentClientServices()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getTimeSyncProt
     * @model opposite="TimeSyncProt" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    ClientServices getParentClientServices();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt#getParentClientServices <em>Parent Client Services</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Client Services</em>' container reference.
     * @see #getParentClientServices()
     * @generated
     */
    void setParentClientServices(ClientServices value);

    /**
     * Returns the value of the '<em><b>Parent Services</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getTimeSyncProt <em>Time Sync Prot</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Services</em>' container reference.
     * @see #setParentServices(Services)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getTimeSyncProt_ParentServices()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getTimeSyncProt
     * @model opposite="TimeSyncProt" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    Services getParentServices();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt#getParentServices <em>Parent Services</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Services</em>' container reference.
     * @see #getParentServices()
     * @generated
     */
    void setParentServices(Services value);

    /**
     * Returns the value of the '<em><b>Iec61850 93</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Iec61850 93</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Iec61850 93</em>' attribute.
     * @see #isSetIec61850_9_3()
     * @see #unsetIec61850_9_3()
     * @see #setIec61850_9_3(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getTimeSyncProt_Iec61850_9_3()
     * @model unsettable="true"
     * @generated
     */
    Boolean getIec61850_9_3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt#getIec61850_9_3 <em>Iec61850 93</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Iec61850 93</em>' attribute.
     * @see #isSetIec61850_9_3()
     * @see #unsetIec61850_9_3()
     * @see #getIec61850_9_3()
     * @generated
     */
    void setIec61850_9_3(Boolean value);

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt#getIec61850_9_3 <em>Iec61850 93</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIec61850_9_3()
     * @see #getIec61850_9_3()
     * @see #setIec61850_9_3(Boolean)
     * @generated
     */
    void unsetIec61850_9_3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt#getIec61850_9_3 <em>Iec61850 93</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Iec61850 93</em>' attribute is set.
     * @see #unsetIec61850_9_3()
     * @see #getIec61850_9_3()
     * @see #setIec61850_9_3(Boolean)
     * @generated
     */
    boolean isSetIec61850_9_3();

} // TimeSyncProt
