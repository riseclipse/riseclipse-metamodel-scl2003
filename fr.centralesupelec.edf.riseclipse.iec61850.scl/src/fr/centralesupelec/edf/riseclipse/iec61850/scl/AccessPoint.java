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

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
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
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getIED <em>IED</em>}</li>
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
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!AccessPoint!clock'"
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
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!AccessPoint!kdc'"
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
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!AccessPoint!router'"
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
	 * Returns the value of the '<em><b>IED</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getAccessPoint <em>Access Point</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>IED</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>IED</em>' container reference.
	 * @see #setIED(IED)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAccessPoint_IED()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getAccessPoint
	 * @model opposite="AccessPoint" resolveProxies="false" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!AccessPoint!IED'"
	 * @generated
	 */
    IED getIED();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getIED <em>IED</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IED</em>' container reference.
	 * @see #getIED()
	 * @generated
	 */
    void setIED( IED value );

    /**
	 * Returns the value of the '<em><b>LN</b></em>' containment reference list.
	 * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN}.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN#getAccessPoint <em>Access Point</em>}'.
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
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LN#getAccessPoint
	 * @model opposite="AccessPoint" containment="true" unsettable="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!AccessPoint!LN'"
	 * @generated
	 */
    EList<LN> getLN();

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
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSecurity#getAccessPoint <em>Access Point</em>}'.
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
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSecurity#getAccessPoint
	 * @model opposite="AccessPoint" containment="true" unsettable="true" upper="7" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!AccessPoint!SMVSecurity'"
	 * @generated
	 */
    EList<SMVSecurity> getSMVSecurity();

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
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServerAt#getAccessPoint <em>Access Point</em>}'.
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
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServerAt#getAccessPoint
	 * @model opposite="AccessPoint" containment="true" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!AccessPoint!ServerAt'"
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
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getAccessPoint <em>Access Point</em>}'.
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
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getAccessPoint
	 * @model opposite="AccessPoint" containment="true" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!AccessPoint!Server'"
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
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getAccessPoint <em>Access Point</em>}'.
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
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getAccessPoint
	 * @model opposite="AccessPoint" containment="true" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!AccessPoint!Services'"
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
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSESecurity#getAccessPoint <em>Access Point</em>}'.
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
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSESecurity#getAccessPoint
	 * @model opposite="AccessPoint" containment="true" unsettable="true" upper="7" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!AccessPoint!GOOSESecurity'"
	 * @generated
	 */
    EList<GOOSESecurity> getGOOSESecurity();

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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!AccessPoint!ReferredByServerAt'"
	 * @generated
	 */
    EList<ServerAt> getReferredByServerAt();

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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!AccessPoint!name'"
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
    void setName(String value);

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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!AccessPoint!ReferredByConnectedAP'"
	 * @generated
	 */
    EList<ConnectedAP> getReferredByConnectedAP();

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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!AccessPoint!ReferredByKDC'"
	 * @generated
	 */
    EList<KDC> getReferredByKDC();

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

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='AccessPoint_name_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv AccessPoint_name_required:\n *   let\n *     severity : Integer[1] = \'AccessPoint::AccessPoint_name_required\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let status : Boolean[1] = self.name &lt;&gt; null\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{message = \'name attribute shall be present in AccessPoint (line \' +\n *               self.lineNumber.toString() + \')\', status = status\n *             }\n *           endif\n *       in\n *         \'AccessPoint::AccessPoint_name_required\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_AccessPoint_c_c_AccessPoint_name_required);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_2;\nif (le) {\n\tsymbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; name = this.getName();\n\tfinal /*@NonInvalid\052/ boolean status = name != null;\n\t/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_1;\n\tif (status) {\n\t\tsymbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid\052/ int lineNumber = this.getLineNumber();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_lineNumber = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(lineNumber);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; toString = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_lineNumber);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_name_32_attribute_32_shall_32_be_32_present_32_in_32_AccessPoint_32_o_line_32, toString);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__e);\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.TUPLid_, sum_0, status);\n\t\tsymbol_1 = symbol_0;\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_AccessPoint_c_c_AccessPoint_name_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\tsymbol_2 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_2;'"
	 * @generated
	 */
	boolean validateAccessPoint_name_required(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='AccessPoint_name_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv AccessPoint_name_valid:\n *   let\n *     severity : Integer[1] = \'AccessPoint::AccessPoint_name_valid\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let status : Boolean[?] = self.name &lt;&gt; null implies\n *           self.validSclAccessPointName(name)\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{message = \'name attribute shall be valid in AccessPoint (line \' +\n *               self.lineNumber.toString() + \'). \' + \'Current value is \' +\n *               self.name.toString(), status = status\n *             }\n *           endif\n *       in\n *         \'AccessPoint::AccessPoint_name_valid\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_AccessPoint_c_c_AccessPoint_name_valid);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_2;\nif (le) {\n\tsymbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_symbol_1;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; name = this.getName();\n\t\tfinal /*@NonInvalid\052/ boolean ne = name != null;\n\t\t/*@Thrown\052/ boolean status;\n\t\tif (ne) {\n\t\t\tfinal /*@Thrown\052/ boolean validSclAccessPointName = ((&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject%&gt;)this).validSclAccessPointName(name);\n\t\t\tstatus = validSclAccessPointName;\n\t\t}\n\t\telse {\n\t\t\tstatus = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\t/*@Thrown\052/ &lt;%java.lang.Object%&gt; symbol_1;\n\t\tif (status) {\n\t\t\tsymbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\telse {\n\t\t\tfinal /*@NonInvalid\052/ int lineNumber = this.getLineNumber();\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_lineNumber = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; toString = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_name_32_attribute_32_shall_32_be_32_valid_32_in_32_AccessPoint_32_o_line_32, toString);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__e__32);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_1 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_Current_32_value_32_is_32);\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; toString_0 = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(name);\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; sum_2 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_1, toString_0);\n\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.TUPLid_, sum_2, status);\n\t\t\tsymbol_1 = symbol_0;\n\t\t}\n\t\tCAUGHT_symbol_1 = symbol_1;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_symbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_AccessPoint_c_c_AccessPoint_name_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\tsymbol_2 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_2;'"
	 * @generated
	 */
	boolean validateAccessPoint_name_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='AccessPoint_restriction_on_content'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv AccessPoint_restriction_on_content:\n *   let\n *     severity : Integer[1] = \'AccessPoint::AccessPoint_restriction_on_content\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let\n *           status : Boolean[1] = let\n *             serverPresent : Integer[1] = if self.Server = null\n *             then 0\n *             else 1\n *             endif\n *           in\n *             let\n *               serverAtPresent : Integer[1] = if self.ServerAt = null\n *               then 0\n *               else 1\n *               endif\n *             in\n *               let\n *                 lnPresent : Integer[1] = if self.LN-&gt;size() = 0\n *                 then 0\n *                 else 1\n *                 endif\n *               in serverPresent + serverAtPresent + lnPresent &lt;= 1\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{message = \'AccessPoint shall contain one Server xor one ServerAt xor at least one LN xor none \' + \'of them (line \' +\n *               self.lineNumber.toString() + \')\', status = status\n *             }\n *           endif\n *       in\n *         \'AccessPoint::AccessPoint_restriction_on_content\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_AccessPoint_c_c_AccessPoint_restriction_on_content);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_2;\nif (le) {\n\tsymbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.Server%&gt; Server = this.getServer();\n\tfinal /*@NonInvalid\052/ boolean eq = Server == null;\n\t/*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; serverPresent;\n\tif (eq) {\n\t\tserverPresent = &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0;\n\t}\n\telse {\n\t\tserverPresent = &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_1;\n\t}\n\tfinal /*@NonInvalid\052/ &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.ServerAt%&gt; ServerAt = this.getServerAt();\n\tfinal /*@NonInvalid\052/ boolean eq_0 = ServerAt == null;\n\t/*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; serverAtPresent;\n\tif (eq_0) {\n\t\tserverAtPresent = &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0;\n\t}\n\telse {\n\t\tserverAtPresent = &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_1;\n\t}\n\tfinal /*@NonInvalid\052/ &lt;%java.util.List%&gt;&lt;&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.LN%&gt;&gt; LN = this.getLN();\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.SetValue%&gt; BOXED_LN = idResolver.createSetOfAll(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.SET_CLSSid_LN, LN);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; size = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation%&gt;.INSTANCE.evaluate(BOXED_LN);\n\tfinal /*@NonInvalid\052/ boolean eq_1 = size.equals(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0);\n\t/*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; lnPresent;\n\tif (eq_1) {\n\t\tlnPresent = &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0;\n\t}\n\telse {\n\t\tlnPresent = &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_1;\n\t}\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; sum = (&lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt;)&lt;%org.eclipse.ocl.pivot.library.numeric.NumericPlusOperation%&gt;.INSTANCE.evaluate(serverPresent, serverAtPresent);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; sum_0 = (&lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt;)&lt;%org.eclipse.ocl.pivot.library.numeric.NumericPlusOperation%&gt;.INSTANCE.evaluate(sum, lnPresent);\n\tfinal /*@NonInvalid\052/ boolean le_0 = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, sum_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_1).booleanValue();\n\t/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_1;\n\tif (le_0) {\n\t\tsymbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_1 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_AccessPoint_32_shall_32_contain_32_one_32_Server_32_xor_32_one_32_ServerAt_32_xor_32_at_32_lea, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_of_32_them_32_o_line_32);\n\t\tfinal /*@NonInvalid\052/ int lineNumber = this.getLineNumber();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_lineNumber = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(lineNumber);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; toString = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_lineNumber);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_2 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_1, toString);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_3 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_2, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__e);\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.TUPLid_, sum_3, le_0);\n\t\tsymbol_1 = symbol_0;\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_AccessPoint_c_c_AccessPoint_restriction_on_content, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\tsymbol_2 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_2;'"
	 * @generated
	 */
	boolean validateAccessPoint_restriction_on_content(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='AccessPoint_at_most_securities'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv AccessPoint_at_most_securities:\n *   let\n *     severity : Integer[1] = \'AccessPoint::AccessPoint_at_most_securities\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let\n *           status : Boolean[?] = self.GOOSESecurity-&gt;size() &lt;= 7 and\n *           self.SMVSecurity-&gt;size() &lt;= 7\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{message = \'AccessPoint shall contain at most 7 GOOSESecurity and at most 7 SMVSecurity (line \' +\n *               self.lineNumber.toString() + \')\', status = status\n *             }\n *           endif\n *       in\n *         \'AccessPoint::AccessPoint_at_most_securities\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_AccessPoint_c_c_AccessPoint_at_most_securities);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_2;\nif (le) {\n\tsymbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%java.util.List%&gt;&lt;&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSESecurity%&gt;&gt; GOOSESecurity = this.getGOOSESecurity();\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.SetValue%&gt; BOXED_GOOSESecurity = idResolver.createSetOfAll(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.SET_CLSSid_GOOSESecurity, GOOSESecurity);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; size = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation%&gt;.INSTANCE.evaluate(BOXED_GOOSESecurity);\n\tfinal /*@NonInvalid\052/ boolean le_0 = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, size, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_7).booleanValue();\n\t/*@NonInvalid\052/ boolean status;\n\tif (le_0) {\n\t\tfinal /*@NonInvalid\052/ &lt;%java.util.List%&gt;&lt;&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSecurity%&gt;&gt; SMVSecurity = this.getSMVSecurity();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.SetValue%&gt; BOXED_SMVSecurity = idResolver.createSetOfAll(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.SET_CLSSid_SMVSecurity, SMVSecurity);\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; size_0 = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation%&gt;.INSTANCE.evaluate(BOXED_SMVSecurity);\n\t\tfinal /*@NonInvalid\052/ boolean le_1 = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, size_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_7).booleanValue();\n\t\tstatus = le_1;\n\t}\n\telse {\n\t\tstatus = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t}\n\t/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_1;\n\tif (status) {\n\t\tsymbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid\052/ int lineNumber = this.getLineNumber();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_lineNumber = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(lineNumber);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; toString = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_lineNumber);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_AccessPoint_32_shall_32_contain_32_at_32_most_32_7_32_GOOSESecurity_32_and_32_at_32_most_32_7_32, toString);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__e);\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.TUPLid_, sum_0, status);\n\t\tsymbol_1 = symbol_0;\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_AccessPoint_c_c_AccessPoint_at_most_securities, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\tsymbol_2 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_2;'"
	 * @generated
	 */
	boolean validateAccessPoint_at_most_securities(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='AccessPoint_securities_allowed'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv AccessPoint_securities_allowed:\n *   let\n *     severity : Integer[1] = \'AccessPoint::AccessPoint_securities_allowed\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let\n *           status : Boolean[?] = if\n *             self.GOOSESecurity-&gt;isEmpty() and\n *             self.SMVSecurity-&gt;isEmpty()\n *           then true\n *           else\n *             if self.Server = null\n *             then false\n *             else\n *               if self.Server.Authentication = null\n *               then false\n *               else self.Server.Authentication.certificate\n *               endif\n *             endif\n *           endif\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{message = \'AccessPoint shall contain GOOSESecurity or SMVSecurity only if if the attribute certificate \' + \'of the server\\u2019s Authentication element is true (line \' +\n *               self.lineNumber.toString() + \')\', status = status\n *             }\n *           endif\n *       in\n *         \'AccessPoint::AccessPoint_securities_allowed\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_AccessPoint_c_c_AccessPoint_securities_allowed);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_5;\nif (le) {\n\tsymbol_5 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_symbol_4;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ &lt;%java.util.List%&gt;&lt;&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSESecurity%&gt;&gt; GOOSESecurity = this.getGOOSESecurity();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.SetValue%&gt; BOXED_GOOSESecurity = idResolver.createSetOfAll(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.SET_CLSSid_GOOSESecurity, GOOSESecurity);\n\t\tfinal /*@NonInvalid\052/ boolean isEmpty = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionIsEmptyOperation%&gt;.INSTANCE.evaluate(BOXED_GOOSESecurity).booleanValue();\n\t\t/*@NonInvalid\052/ boolean and;\n\t\tif (isEmpty) {\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.util.List%&gt;&lt;&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSecurity%&gt;&gt; SMVSecurity = this.getSMVSecurity();\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.SetValue%&gt; BOXED_SMVSecurity = idResolver.createSetOfAll(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.SET_CLSSid_SMVSecurity, SMVSecurity);\n\t\t\tfinal /*@NonInvalid\052/ boolean isEmpty_0 = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionIsEmptyOperation%&gt;.INSTANCE.evaluate(BOXED_SMVSecurity).booleanValue();\n\t\t\tand = isEmpty_0;\n\t\t}\n\t\telse {\n\t\t\tand = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\t}\n\t\t/*@Thrown\052/ &lt;%java.lang.Boolean%&gt; status;\n\t\tif (and) {\n\t\t\tstatus = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\telse {\n\t\t\tfinal /*@NonInvalid\052/ &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.Server%&gt; Server = this.getServer();\n\t\t\tfinal /*@NonInvalid\052/ boolean eq = Server == null;\n\t\t\t/*@Thrown\052/ &lt;%java.lang.Boolean%&gt; symbol_1;\n\t\t\tif (eq) {\n\t\t\t\tsymbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\t\t}\n\t\t\telse {\n\t\t\t\tif (Server == null) {\n\t\t\t\t\tthrow new &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;(\"Null source for \\\'\\\'http://www.iec.ch/61850/2003/SCL\\\'::Server::Authentication\\\'\");\n\t\t\t\t}\n\t\t\t\tfinal /*@Thrown\052/ &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.Authentication%&gt; Authentication = Server.getAuthentication();\n\t\t\t\tfinal /*@Thrown\052/ boolean eq_0 = Authentication == null;\n\t\t\t\t/*@Thrown\052/ &lt;%java.lang.Boolean%&gt; symbol_0;\n\t\t\t\tif (eq_0) {\n\t\t\t\t\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tif (Authentication == null) {\n\t\t\t\t\t\tthrow new &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;(\"Null source for \\\'\\\'http://www.iec.ch/61850/2003/SCL\\\'::Authentication::certificate\\\'\");\n\t\t\t\t\t}\n\t\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; certificate = Authentication.getCertificate();\n\t\t\t\t\tsymbol_0 = certificate;\n\t\t\t\t}\n\t\t\t\tsymbol_1 = symbol_0;\n\t\t\t}\n\t\t\tstatus = symbol_1;\n\t\t}\n\t\tfinal /*@Thrown\052/ boolean symbol_2 = status == Boolean.TRUE;\n\t\t/*@Thrown\052/ &lt;%java.lang.Object%&gt; symbol_4;\n\t\tif (symbol_2) {\n\t\t\tsymbol_4 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\telse {\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_AccessPoint_32_shall_32_contain_32_GOOSESecurity_32_or_32_SMVSecurity_32_only_32_if_32_i, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_of_32_the_32_server_8217_s_32_Authentication_32_element_32_is_32_true_32_o_line_32);\n\t\t\tfinal /*@NonInvalid\052/ int lineNumber = this.getLineNumber();\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_lineNumber = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; toString = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum, toString);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_1 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__e);\n\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_3 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.TUPLid_, sum_1, status);\n\t\t\tsymbol_4 = symbol_3;\n\t\t}\n\t\tCAUGHT_symbol_4 = symbol_4;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_symbol_4 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_AccessPoint_c_c_AccessPoint_securities_allowed, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_4, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\tsymbol_5 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_5;'"
	 * @generated
	 */
	boolean validateAccessPoint_securities_allowed(DiagnosticChain diagnostics, Map<Object, Object> context);

} // AccessPoint
