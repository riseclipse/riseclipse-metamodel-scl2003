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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getClock <em>Clock</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getKdc <em>Kdc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getRouter <em>Router</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getParentIED <em>Parent IED</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getLN <em>LN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getSMVSecurity <em>SMV Security</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getServerAt <em>Server At</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getServer <em>Server</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getServices <em>Services</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getGOOSESecurity <em>GOOSE Security</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getReferredByServerAt <em>Referred By Server At</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getReferredByConnectedAP <em>Referred By Connected AP</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getReferredByKDC <em>Referred By KDC</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAccessPoint()
 * @model
 * @generated
 */
public interface AccessPoint extends UnNaming {
    /**
     * Returns the value of the '<em><b>Clock</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Clock</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Clock</em>' attribute.
     * @see #isSetClock()
     * @see #unsetClock()
     * @see #setClock(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAccessPoint_Clock()
     * @model default="false" unsettable="true"
     * @generated
     */
    Boolean getClock();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getClock <em>Clock</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Clock</em>' attribute.
     * @see #isSetClock()
     * @see #unsetClock()
     * @see #getClock()
     * @generated
     */
    void setClock( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getClock <em>Clock</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetClock()
     * @see #getClock()
     * @see #setClock(Boolean)
     * @generated
     */
    void unsetClock();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getClock <em>Clock</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Clock</em>' attribute is set.
     * @see #unsetClock()
     * @see #getClock()
     * @see #setClock(Boolean)
     * @generated
     */
    boolean isSetClock();

    /**
     * Returns the value of the '<em><b>Kdc</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kdc</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kdc</em>' attribute.
     * @see #isSetKdc()
     * @see #unsetKdc()
     * @see #setKdc(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAccessPoint_Kdc()
     * @model default="false" unsettable="true"
     * @generated
     */
    Boolean getKdc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getKdc <em>Kdc</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kdc</em>' attribute.
     * @see #isSetKdc()
     * @see #unsetKdc()
     * @see #getKdc()
     * @generated
     */
    void setKdc( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getKdc <em>Kdc</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetKdc()
     * @see #getKdc()
     * @see #setKdc(Boolean)
     * @generated
     */
    void unsetKdc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getKdc <em>Kdc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kdc</em>' attribute is set.
     * @see #unsetKdc()
     * @see #getKdc()
     * @see #setKdc(Boolean)
     * @generated
     */
    boolean isSetKdc();

    /**
     * Returns the value of the '<em><b>Router</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Router</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Router</em>' attribute.
     * @see #isSetRouter()
     * @see #unsetRouter()
     * @see #setRouter(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAccessPoint_Router()
     * @model default="false" unsettable="true"
     * @generated
     */
    Boolean getRouter();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getRouter <em>Router</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @param value the new value of the '<em>Router</em>' attribute.
     * @see #isSetRouter()
     * @see #unsetRouter()
     * @see #getRouter()
     * @generated
     */
    void setRouter( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getRouter <em>Router</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetRouter()
     * @see #getRouter()
     * @see #setRouter(Boolean)
     * @generated
     */
    void unsetRouter();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getRouter <em>Router</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Router</em>' attribute is set.
     * @see #unsetRouter()
     * @see #getRouter()
     * @see #setRouter(Boolean)
     * @generated
     */
    boolean isSetRouter();

    /**
     * Returns the value of the '<em><b>Parent IED</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getAccessPoint <em>Access Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent IED</em>' container reference.
     * @see #setParentIED(IED)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAccessPoint_ParentIED()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getAccessPoint
     * @model opposite="AccessPoint" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    IED getParentIED();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getParentIED <em>Parent IED</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent IED</em>' container reference.
     * @see #getParentIED()
     * @generated
     */
    void setParentIED( IED value );

    /**
     * Returns the value of the '<em><b>LN</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN#getParentAccessPoint <em>Parent Access Point</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>LN</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>LN</em>' containment reference list.
     * @see #isSetLN()
     * @see #unsetLN()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAccessPoint_LN()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LN#getParentAccessPoint
     * @model opposite="ParentAccessPoint" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList< LN > getLN();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getLN <em>LN</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLN()
     * @see #getLN()
     * @generated
     */
    void unsetLN();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getLN <em>LN</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>LN</em>' containment reference list is set.
     * @see #unsetLN()
     * @see #getLN()
     * @generated
     */
    boolean isSetLN();

    /**
     * Returns the value of the '<em><b>SMV Security</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSecurity}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSecurity#getParentAccessPoint <em>Parent Access Point</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SMV Security</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SMV Security</em>' containment reference list.
     * @see #isSetSMVSecurity()
     * @see #unsetSMVSecurity()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAccessPoint_SMVSecurity()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSecurity#getParentAccessPoint
     * @model opposite="ParentAccessPoint" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList< SMVSecurity > getSMVSecurity();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getSMVSecurity <em>SMV Security</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSMVSecurity()
     * @see #getSMVSecurity()
     * @generated
     */
    void unsetSMVSecurity();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getSMVSecurity <em>SMV Security</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>SMV Security</em>' containment reference list is set.
     * @see #unsetSMVSecurity()
     * @see #getSMVSecurity()
     * @generated
     */
    boolean isSetSMVSecurity();

    /**
     * Returns the value of the '<em><b>Server At</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServerAt#getParentAccessPoint <em>Parent Access Point</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Server At</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Server At</em>' containment reference.
     * @see #isSetServerAt()
     * @see #unsetServerAt()
     * @see #setServerAt(ServerAt)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAccessPoint_ServerAt()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServerAt#getParentAccessPoint
     * @model opposite="ParentAccessPoint" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    ServerAt getServerAt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getServerAt <em>Server At</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Server At</em>' containment reference.
     * @see #isSetServerAt()
     * @see #unsetServerAt()
     * @see #getServerAt()
     * @generated
     */
    void setServerAt( ServerAt value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getServerAt <em>Server At</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetServerAt()
     * @see #getServerAt()
     * @see #setServerAt(ServerAt)
     * @generated
     */
    void unsetServerAt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getServerAt <em>Server At</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Server At</em>' containment reference is set.
     * @see #unsetServerAt()
     * @see #getServerAt()
     * @see #setServerAt(ServerAt)
     * @generated
     */
    boolean isSetServerAt();

    /**
     * Returns the value of the '<em><b>Server</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getParentAccessPoint <em>Parent Access Point</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Server</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Server</em>' containment reference.
     * @see #isSetServer()
     * @see #unsetServer()
     * @see #setServer(Server)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAccessPoint_Server()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getParentAccessPoint
     * @model opposite="ParentAccessPoint" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    Server getServer();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getServer <em>Server</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Server</em>' containment reference.
     * @see #isSetServer()
     * @see #unsetServer()
     * @see #getServer()
     * @generated
     */
    void setServer( Server value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getServer <em>Server</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetServer()
     * @see #getServer()
     * @see #setServer(Server)
     * @generated
     */
    void unsetServer();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getServer <em>Server</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Server</em>' containment reference is set.
     * @see #unsetServer()
     * @see #getServer()
     * @see #setServer(Server)
     * @generated
     */
    boolean isSetServer();

    /**
     * Returns the value of the '<em><b>Services</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getParentAccessPoint <em>Parent Access Point</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Services</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Services</em>' containment reference.
     * @see #isSetServices()
     * @see #unsetServices()
     * @see #setServices(Services)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAccessPoint_Services()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getParentAccessPoint
     * @model opposite="ParentAccessPoint" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    Services getServices();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getServices <em>Services</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Services</em>' containment reference.
     * @see #isSetServices()
     * @see #unsetServices()
     * @see #getServices()
     * @generated
     */
    void setServices( Services value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getServices <em>Services</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetServices()
     * @see #getServices()
     * @see #setServices(Services)
     * @generated
     */
    void unsetServices();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getServices <em>Services</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Services</em>' containment reference is set.
     * @see #unsetServices()
     * @see #getServices()
     * @see #setServices(Services)
     * @generated
     */
    boolean isSetServices();

    /**
     * Returns the value of the '<em><b>GOOSE Security</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSESecurity}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSESecurity#getParentAccessPoint <em>Parent Access Point</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>GOOSE Security</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>GOOSE Security</em>' containment reference list.
     * @see #isSetGOOSESecurity()
     * @see #unsetGOOSESecurity()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAccessPoint_GOOSESecurity()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSESecurity#getParentAccessPoint
     * @model opposite="ParentAccessPoint" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList< GOOSESecurity > getGOOSESecurity();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getGOOSESecurity <em>GOOSE Security</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGOOSESecurity()
     * @see #getGOOSESecurity()
     * @generated
     */
    void unsetGOOSESecurity();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getGOOSESecurity <em>GOOSE Security</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>GOOSE Security</em>' containment reference list is set.
     * @see #unsetGOOSESecurity()
     * @see #getGOOSESecurity()
     * @generated
     */
    boolean isSetGOOSESecurity();

    /**
     * Returns the value of the '<em><b>Referred By Server At</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServerAt}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServerAt#getRefersToAccessPoint <em>Refers To Access Point</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referred By Server At</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Server At</em>' reference list.
     * @see #isSetReferredByServerAt()
     * @see #unsetReferredByServerAt()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAccessPoint_ReferredByServerAt()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServerAt#getRefersToAccessPoint
     * @model opposite="RefersToAccessPoint" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< ServerAt > getReferredByServerAt();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getReferredByServerAt <em>Referred By Server At</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByServerAt()
     * @see #getReferredByServerAt()
     * @generated
     */
    void unsetReferredByServerAt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getReferredByServerAt <em>Referred By Server At</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Server At</em>' reference list is set.
     * @see #unsetReferredByServerAt()
     * @see #getReferredByServerAt()
     * @generated
     */
    boolean isSetReferredByServerAt();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #setName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAccessPoint_Name()
     * @model unsettable="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #getName()
     * @generated
     */
    void setName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    void unsetName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getName <em>Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Name</em>' attribute is set.
     * @see #unsetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    boolean isSetName();

    /**
     * Returns the value of the '<em><b>Referred By Connected AP</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getRefersToAccessPoint <em>Refers To Access Point</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referred By Connected AP</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Connected AP</em>' reference list.
     * @see #isSetReferredByConnectedAP()
     * @see #unsetReferredByConnectedAP()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAccessPoint_ReferredByConnectedAP()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getRefersToAccessPoint
     * @model opposite="RefersToAccessPoint" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< ConnectedAP > getReferredByConnectedAP();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getReferredByConnectedAP <em>Referred By Connected AP</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByConnectedAP()
     * @see #getReferredByConnectedAP()
     * @generated
     */
    void unsetReferredByConnectedAP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getReferredByConnectedAP <em>Referred By Connected AP</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Connected AP</em>' reference list is set.
     * @see #unsetReferredByConnectedAP()
     * @see #getReferredByConnectedAP()
     * @generated
     */
    boolean isSetReferredByConnectedAP();

    /**
     * Returns the value of the '<em><b>Referred By KDC</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.KDC}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.KDC#getRefersToAccessPoint <em>Refers To Access Point</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referred By KDC</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By KDC</em>' reference list.
     * @see #isSetReferredByKDC()
     * @see #unsetReferredByKDC()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAccessPoint_ReferredByKDC()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.KDC#getRefersToAccessPoint
     * @model opposite="RefersToAccessPoint" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< KDC > getReferredByKDC();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getReferredByKDC <em>Referred By KDC</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByKDC()
     * @see #getReferredByKDC()
     * @generated
     */
    void unsetReferredByKDC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getReferredByKDC <em>Referred By KDC</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By KDC</em>' reference list is set.
     * @see #unsetReferredByKDC()
     * @see #getReferredByKDC()
     * @generated
     */
    boolean isSetReferredByKDC();

} // AccessPoint
