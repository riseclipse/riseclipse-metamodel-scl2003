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
 * A representation of the model object '<em><b>Sup Subscription</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SupSubscription#getMaxGo <em>Max Go</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SupSubscription#getMaxSv <em>Max Sv</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SupSubscription#getParentServices <em>Parent Services</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSupSubscription()
 * @model
 * @generated
 */
public interface SupSubscription extends SclObject {
    /**
     * Returns the value of the '<em><b>Max Go</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Go</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Go</em>' attribute.
     * @see #isSetMaxGo()
     * @see #unsetMaxGo()
     * @see #setMaxGo(Integer)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSupSubscription_MaxGo()
     * @model unsettable="true"
     * @generated
     */
    Integer getMaxGo();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SupSubscription#getMaxGo <em>Max Go</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Go</em>' attribute.
     * @see #isSetMaxGo()
     * @see #unsetMaxGo()
     * @see #getMaxGo()
     * @generated
     */
    void setMaxGo( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SupSubscription#getMaxGo <em>Max Go</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetMaxGo()
     * @see #getMaxGo()
     * @see #setMaxGo(Integer)
     * @generated
     */
    void unsetMaxGo();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SupSubscription#getMaxGo <em>Max Go</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Go</em>' attribute is set.
     * @see #unsetMaxGo()
     * @see #getMaxGo()
     * @see #setMaxGo(Integer)
     * @generated
     */
    boolean isSetMaxGo();

    /**
     * Returns the value of the '<em><b>Max Sv</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Sv</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Sv</em>' attribute.
     * @see #isSetMaxSv()
     * @see #unsetMaxSv()
     * @see #setMaxSv(Integer)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSupSubscription_MaxSv()
     * @model unsettable="true"
     * @generated
     */
    Integer getMaxSv();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SupSubscription#getMaxSv <em>Max Sv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Sv</em>' attribute.
     * @see #isSetMaxSv()
     * @see #unsetMaxSv()
     * @see #getMaxSv()
     * @generated
     */
    void setMaxSv( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SupSubscription#getMaxSv <em>Max Sv</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetMaxSv()
     * @see #getMaxSv()
     * @see #setMaxSv(Integer)
     * @generated
     */
    void unsetMaxSv();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SupSubscription#getMaxSv <em>Max Sv</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Sv</em>' attribute is set.
     * @see #unsetMaxSv()
     * @see #getMaxSv()
     * @see #setMaxSv(Integer)
     * @generated
     */
    boolean isSetMaxSv();

    /**
     * Returns the value of the '<em><b>Parent Services</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getSupSubscription <em>Sup Subscription</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Services</em>' container reference.
     * @see #setParentServices(Services)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSupSubscription_ParentServices()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getSupSubscription
     * @model opposite="SupSubscription" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    Services getParentServices();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SupSubscription#getParentServices <em>Parent Services</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Services</em>' container reference.
     * @see #getParentServices()
     * @generated
     */
    void setParentServices(Services value);

} // SupSubscription
