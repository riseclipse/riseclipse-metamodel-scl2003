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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Services</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getNameLength <em>Name Length</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getAccessPoint <em>Access Point</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getClientServices <em>Client Services</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getCommProt <em>Comm Prot</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getConfDataSet <em>Conf Data Set</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getConfLNs <em>Conf LNs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getConfLdName <em>Conf Ld Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getConfLogControl <em>Conf Log Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getConfReportControl <em>Conf Report Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getConfSigRef <em>Conf Sig Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getDataObjectDirectory <em>Data Object Directory</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getDataSetDirectory <em>Data Set Directory</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getDynAssociation <em>Dyn Association</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getDynDataSet <em>Dyn Data Set</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getFileHandling <em>File Handling</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGOOSE <em>GOOSE</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGSEDir <em>GSE Dir</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGSESettings <em>GSE Settings</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGSSE <em>GSSE</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGetCBValues <em>Get CB Values</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGetDataObjectDefinition <em>Get Data Object Definition</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGetDataSetValue <em>Get Data Set Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGetDirectory <em>Get Directory</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getIED <em>IED</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getLogSettings <em>Log Settings</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getReadWrite <em>Read Write</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getRedProt <em>Red Prot</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getReportSettings <em>Report Settings</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getSMVsc <em>SM Vsc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getSupSubscription <em>Sup Subscription</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getValueHandling <em>Value Handling</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getSetDataSetValue <em>Set Data Set Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getSettingGroups <em>Setting Groups</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getTimeSyncProt <em>Time Sync Prot</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getTimerActivatedControl <em>Timer Activated Control</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServices()
 * @model
 * @generated
 */
public interface Services extends SclObject {
    /**
	 * Returns the value of the '<em><b>Name Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name Length</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Length</em>' attribute.
	 * @see #isSetNameLength()
	 * @see #unsetNameLength()
	 * @see #setNameLength(Integer)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServices_NameLength()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Services!nameLength'"
	 * @generated
	 */
    Integer getNameLength();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getNameLength <em>Name Length</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Length</em>' attribute.
	 * @see #isSetNameLength()
	 * @see #unsetNameLength()
	 * @see #getNameLength()
	 * @generated
	 */
    void setNameLength(Integer value);

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getNameLength <em>Name Length</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetNameLength()
	 * @see #getNameLength()
	 * @see #setNameLength(Integer)
	 * @generated
	 */
    void unsetNameLength();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getNameLength <em>Name Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name Length</em>' attribute is set.
	 * @see #unsetNameLength()
	 * @see #getNameLength()
	 * @see #setNameLength(Integer)
	 * @generated
	 */
    boolean isSetNameLength();

    /**
	 * Returns the value of the '<em><b>Access Point</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Access Point</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Point</em>' container reference.
	 * @see #setAccessPoint(AccessPoint)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServices_AccessPoint()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getServices
	 * @model opposite="Services" resolveProxies="false" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Services!AccessPoint'"
	 * @generated
	 */
    AccessPoint getAccessPoint();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getAccessPoint <em>Access Point</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Point</em>' container reference.
	 * @see #getAccessPoint()
	 * @generated
	 */
    void setAccessPoint( AccessPoint value );

    /**
	 * Returns the value of the '<em><b>Client Services</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Client Services</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Services</em>' containment reference.
	 * @see #isSetClientServices()
	 * @see #unsetClientServices()
	 * @see #setClientServices(ClientServices)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServices_ClientServices()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getServices
	 * @model opposite="Services" containment="true" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Services!ClientServices'"
	 * @generated
	 */
    ClientServices getClientServices();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getClientServices <em>Client Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Services</em>' containment reference.
	 * @see #isSetClientServices()
	 * @see #unsetClientServices()
	 * @see #getClientServices()
	 * @generated
	 */
    void setClientServices( ClientServices value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getClientServices <em>Client Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetClientServices()
	 * @see #getClientServices()
	 * @see #setClientServices(ClientServices)
	 * @generated
	 */
    void unsetClientServices();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getClientServices <em>Client Services</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Client Services</em>' containment reference is set.
	 * @see #unsetClientServices()
	 * @see #getClientServices()
	 * @see #setClientServices(ClientServices)
	 * @generated
	 */
    boolean isSetClientServices();

    /**
	 * Returns the value of the '<em><b>Comm Prot</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.CommProt#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Comm Prot</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Comm Prot</em>' containment reference.
	 * @see #isSetCommProt()
	 * @see #unsetCommProt()
	 * @see #setCommProt(CommProt)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServices_CommProt()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.CommProt#getServices
	 * @model opposite="Services" containment="true" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Services!CommProt'"
	 * @generated
	 */
    CommProt getCommProt();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getCommProt <em>Comm Prot</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comm Prot</em>' containment reference.
	 * @see #isSetCommProt()
	 * @see #unsetCommProt()
	 * @see #getCommProt()
	 * @generated
	 */
    void setCommProt( CommProt value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getCommProt <em>Comm Prot</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetCommProt()
	 * @see #getCommProt()
	 * @see #setCommProt(CommProt)
	 * @generated
	 */
    void unsetCommProt();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getCommProt <em>Comm Prot</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Comm Prot</em>' containment reference is set.
	 * @see #unsetCommProt()
	 * @see #getCommProt()
	 * @see #setCommProt(CommProt)
	 * @generated
	 */
    boolean isSetCommProt();

    /**
	 * Returns the value of the '<em><b>Conf Data Set</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfDataSet#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conf Data Set</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Conf Data Set</em>' containment reference.
	 * @see #isSetConfDataSet()
	 * @see #unsetConfDataSet()
	 * @see #setConfDataSet(ConfDataSet)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServices_ConfDataSet()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfDataSet#getServices
	 * @model opposite="Services" containment="true" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Services!ConfDataSet'"
	 * @generated
	 */
    ConfDataSet getConfDataSet();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getConfDataSet <em>Conf Data Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conf Data Set</em>' containment reference.
	 * @see #isSetConfDataSet()
	 * @see #unsetConfDataSet()
	 * @see #getConfDataSet()
	 * @generated
	 */
    void setConfDataSet( ConfDataSet value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getConfDataSet <em>Conf Data Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetConfDataSet()
	 * @see #getConfDataSet()
	 * @see #setConfDataSet(ConfDataSet)
	 * @generated
	 */
    void unsetConfDataSet();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getConfDataSet <em>Conf Data Set</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Conf Data Set</em>' containment reference is set.
	 * @see #unsetConfDataSet()
	 * @see #getConfDataSet()
	 * @see #setConfDataSet(ConfDataSet)
	 * @generated
	 */
    boolean isSetConfDataSet();

    /**
	 * Returns the value of the '<em><b>Conf LNs</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfLNs#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conf LNs</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Conf LNs</em>' containment reference.
	 * @see #isSetConfLNs()
	 * @see #unsetConfLNs()
	 * @see #setConfLNs(ConfLNs)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServices_ConfLNs()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfLNs#getServices
	 * @model opposite="Services" containment="true" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Services!ConfLNs'"
	 * @generated
	 */
    ConfLNs getConfLNs();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getConfLNs <em>Conf LNs</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conf LNs</em>' containment reference.
	 * @see #isSetConfLNs()
	 * @see #unsetConfLNs()
	 * @see #getConfLNs()
	 * @generated
	 */
    void setConfLNs( ConfLNs value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getConfLNs <em>Conf LNs</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetConfLNs()
	 * @see #getConfLNs()
	 * @see #setConfLNs(ConfLNs)
	 * @generated
	 */
    void unsetConfLNs();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getConfLNs <em>Conf LNs</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Conf LNs</em>' containment reference is set.
	 * @see #unsetConfLNs()
	 * @see #getConfLNs()
	 * @see #setConfLNs(ConfLNs)
	 * @generated
	 */
    boolean isSetConfLNs();

    /**
	 * Returns the value of the '<em><b>Conf Ld Name</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfLdName#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conf Ld Name</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Conf Ld Name</em>' containment reference.
	 * @see #isSetConfLdName()
	 * @see #unsetConfLdName()
	 * @see #setConfLdName(ConfLdName)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServices_ConfLdName()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfLdName#getServices
	 * @model opposite="Services" containment="true" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Services!ConfLdName'"
	 * @generated
	 */
    ConfLdName getConfLdName();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getConfLdName <em>Conf Ld Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conf Ld Name</em>' containment reference.
	 * @see #isSetConfLdName()
	 * @see #unsetConfLdName()
	 * @see #getConfLdName()
	 * @generated
	 */
    void setConfLdName( ConfLdName value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getConfLdName <em>Conf Ld Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetConfLdName()
	 * @see #getConfLdName()
	 * @see #setConfLdName(ConfLdName)
	 * @generated
	 */
    void unsetConfLdName();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getConfLdName <em>Conf Ld Name</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Conf Ld Name</em>' containment reference is set.
	 * @see #unsetConfLdName()
	 * @see #getConfLdName()
	 * @see #setConfLdName(ConfLdName)
	 * @generated
	 */
    boolean isSetConfLdName();

    /**
	 * Returns the value of the '<em><b>Conf Log Control</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfLogControl#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conf Log Control</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Conf Log Control</em>' containment reference.
	 * @see #isSetConfLogControl()
	 * @see #unsetConfLogControl()
	 * @see #setConfLogControl(ConfLogControl)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServices_ConfLogControl()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfLogControl#getServices
	 * @model opposite="Services" containment="true" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Services!ConfLogControl'"
	 * @generated
	 */
    ConfLogControl getConfLogControl();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getConfLogControl <em>Conf Log Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conf Log Control</em>' containment reference.
	 * @see #isSetConfLogControl()
	 * @see #unsetConfLogControl()
	 * @see #getConfLogControl()
	 * @generated
	 */
    void setConfLogControl( ConfLogControl value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getConfLogControl <em>Conf Log Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetConfLogControl()
	 * @see #getConfLogControl()
	 * @see #setConfLogControl(ConfLogControl)
	 * @generated
	 */
    void unsetConfLogControl();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getConfLogControl <em>Conf Log Control</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Conf Log Control</em>' containment reference is set.
	 * @see #unsetConfLogControl()
	 * @see #getConfLogControl()
	 * @see #setConfLogControl(ConfLogControl)
	 * @generated
	 */
    boolean isSetConfLogControl();

    /**
	 * Returns the value of the '<em><b>Conf Report Control</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfReportControl#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conf Report Control</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Conf Report Control</em>' containment reference.
	 * @see #isSetConfReportControl()
	 * @see #unsetConfReportControl()
	 * @see #setConfReportControl(ConfReportControl)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServices_ConfReportControl()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfReportControl#getServices
	 * @model opposite="Services" containment="true" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Services!ConfReportControl'"
	 * @generated
	 */
    ConfReportControl getConfReportControl();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getConfReportControl <em>Conf Report Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conf Report Control</em>' containment reference.
	 * @see #isSetConfReportControl()
	 * @see #unsetConfReportControl()
	 * @see #getConfReportControl()
	 * @generated
	 */
    void setConfReportControl( ConfReportControl value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getConfReportControl <em>Conf Report Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetConfReportControl()
	 * @see #getConfReportControl()
	 * @see #setConfReportControl(ConfReportControl)
	 * @generated
	 */
    void unsetConfReportControl();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getConfReportControl <em>Conf Report Control</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Conf Report Control</em>' containment reference is set.
	 * @see #unsetConfReportControl()
	 * @see #getConfReportControl()
	 * @see #setConfReportControl(ConfReportControl)
	 * @generated
	 */
    boolean isSetConfReportControl();

    /**
	 * Returns the value of the '<em><b>Conf Sig Ref</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfSigRef#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conf Sig Ref</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Conf Sig Ref</em>' containment reference.
	 * @see #isSetConfSigRef()
	 * @see #unsetConfSigRef()
	 * @see #setConfSigRef(ConfSigRef)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServices_ConfSigRef()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfSigRef#getServices
	 * @model opposite="Services" containment="true" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Services!ConfSigRef'"
	 * @generated
	 */
    ConfSigRef getConfSigRef();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getConfSigRef <em>Conf Sig Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conf Sig Ref</em>' containment reference.
	 * @see #isSetConfSigRef()
	 * @see #unsetConfSigRef()
	 * @see #getConfSigRef()
	 * @generated
	 */
    void setConfSigRef( ConfSigRef value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getConfSigRef <em>Conf Sig Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetConfSigRef()
	 * @see #getConfSigRef()
	 * @see #setConfSigRef(ConfSigRef)
	 * @generated
	 */
    void unsetConfSigRef();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getConfSigRef <em>Conf Sig Ref</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Conf Sig Ref</em>' containment reference is set.
	 * @see #unsetConfSigRef()
	 * @see #getConfSigRef()
	 * @see #setConfSigRef(ConfSigRef)
	 * @generated
	 */
    boolean isSetConfSigRef();

    /**
	 * Returns the value of the '<em><b>Data Object Directory</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataObjectDirectory#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Object Directory</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Object Directory</em>' containment reference.
	 * @see #isSetDataObjectDirectory()
	 * @see #unsetDataObjectDirectory()
	 * @see #setDataObjectDirectory(DataObjectDirectory)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServices_DataObjectDirectory()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DataObjectDirectory#getServices
	 * @model opposite="Services" containment="true" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Services!DataObjectDirectory'"
	 * @generated
	 */
    DataObjectDirectory getDataObjectDirectory();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getDataObjectDirectory <em>Data Object Directory</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Object Directory</em>' containment reference.
	 * @see #isSetDataObjectDirectory()
	 * @see #unsetDataObjectDirectory()
	 * @see #getDataObjectDirectory()
	 * @generated
	 */
    void setDataObjectDirectory( DataObjectDirectory value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getDataObjectDirectory <em>Data Object Directory</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetDataObjectDirectory()
	 * @see #getDataObjectDirectory()
	 * @see #setDataObjectDirectory(DataObjectDirectory)
	 * @generated
	 */
    void unsetDataObjectDirectory();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getDataObjectDirectory <em>Data Object Directory</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Object Directory</em>' containment reference is set.
	 * @see #unsetDataObjectDirectory()
	 * @see #getDataObjectDirectory()
	 * @see #setDataObjectDirectory(DataObjectDirectory)
	 * @generated
	 */
    boolean isSetDataObjectDirectory();

    /**
	 * Returns the value of the '<em><b>Data Set Directory</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSetDirectory#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Set Directory</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set Directory</em>' containment reference.
	 * @see #isSetDataSetDirectory()
	 * @see #unsetDataSetDirectory()
	 * @see #setDataSetDirectory(DataSetDirectory)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServices_DataSetDirectory()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSetDirectory#getServices
	 * @model opposite="Services" containment="true" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Services!DataSetDirectory'"
	 * @generated
	 */
    DataSetDirectory getDataSetDirectory();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getDataSetDirectory <em>Data Set Directory</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Set Directory</em>' containment reference.
	 * @see #isSetDataSetDirectory()
	 * @see #unsetDataSetDirectory()
	 * @see #getDataSetDirectory()
	 * @generated
	 */
    void setDataSetDirectory( DataSetDirectory value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getDataSetDirectory <em>Data Set Directory</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetDataSetDirectory()
	 * @see #getDataSetDirectory()
	 * @see #setDataSetDirectory(DataSetDirectory)
	 * @generated
	 */
    void unsetDataSetDirectory();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getDataSetDirectory <em>Data Set Directory</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Set Directory</em>' containment reference is set.
	 * @see #unsetDataSetDirectory()
	 * @see #getDataSetDirectory()
	 * @see #setDataSetDirectory(DataSetDirectory)
	 * @generated
	 */
    boolean isSetDataSetDirectory();

    /**
	 * Returns the value of the '<em><b>Dyn Association</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DynAssociation#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dyn Association</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Dyn Association</em>' containment reference.
	 * @see #isSetDynAssociation()
	 * @see #unsetDynAssociation()
	 * @see #setDynAssociation(DynAssociation)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServices_DynAssociation()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DynAssociation#getServices
	 * @model opposite="Services" containment="true" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Services!DynAssociation'"
	 * @generated
	 */
    DynAssociation getDynAssociation();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getDynAssociation <em>Dyn Association</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dyn Association</em>' containment reference.
	 * @see #isSetDynAssociation()
	 * @see #unsetDynAssociation()
	 * @see #getDynAssociation()
	 * @generated
	 */
    void setDynAssociation( DynAssociation value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getDynAssociation <em>Dyn Association</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetDynAssociation()
	 * @see #getDynAssociation()
	 * @see #setDynAssociation(DynAssociation)
	 * @generated
	 */
    void unsetDynAssociation();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getDynAssociation <em>Dyn Association</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dyn Association</em>' containment reference is set.
	 * @see #unsetDynAssociation()
	 * @see #getDynAssociation()
	 * @see #setDynAssociation(DynAssociation)
	 * @generated
	 */
    boolean isSetDynAssociation();

    /**
	 * Returns the value of the '<em><b>Dyn Data Set</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DynDataSet#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dyn Data Set</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Dyn Data Set</em>' containment reference.
	 * @see #isSetDynDataSet()
	 * @see #unsetDynDataSet()
	 * @see #setDynDataSet(DynDataSet)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServices_DynDataSet()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DynDataSet#getServices
	 * @model opposite="Services" containment="true" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Services!DynDataSet'"
	 * @generated
	 */
    DynDataSet getDynDataSet();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getDynDataSet <em>Dyn Data Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dyn Data Set</em>' containment reference.
	 * @see #isSetDynDataSet()
	 * @see #unsetDynDataSet()
	 * @see #getDynDataSet()
	 * @generated
	 */
    void setDynDataSet( DynDataSet value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getDynDataSet <em>Dyn Data Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetDynDataSet()
	 * @see #getDynDataSet()
	 * @see #setDynDataSet(DynDataSet)
	 * @generated
	 */
    void unsetDynDataSet();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getDynDataSet <em>Dyn Data Set</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dyn Data Set</em>' containment reference is set.
	 * @see #unsetDynDataSet()
	 * @see #getDynDataSet()
	 * @see #setDynDataSet(DynDataSet)
	 * @generated
	 */
    boolean isSetDynDataSet();

    /**
	 * Returns the value of the '<em><b>File Handling</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FileHandling#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>File Handling</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>File Handling</em>' containment reference.
	 * @see #isSetFileHandling()
	 * @see #unsetFileHandling()
	 * @see #setFileHandling(FileHandling)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServices_FileHandling()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.FileHandling#getServices
	 * @model opposite="Services" containment="true" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Services!FileHandling'"
	 * @generated
	 */
    FileHandling getFileHandling();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getFileHandling <em>File Handling</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Handling</em>' containment reference.
	 * @see #isSetFileHandling()
	 * @see #unsetFileHandling()
	 * @see #getFileHandling()
	 * @generated
	 */
    void setFileHandling( FileHandling value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getFileHandling <em>File Handling</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetFileHandling()
	 * @see #getFileHandling()
	 * @see #setFileHandling(FileHandling)
	 * @generated
	 */
    void unsetFileHandling();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getFileHandling <em>File Handling</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>File Handling</em>' containment reference is set.
	 * @see #unsetFileHandling()
	 * @see #getFileHandling()
	 * @see #setFileHandling(FileHandling)
	 * @generated
	 */
    boolean isSetFileHandling();

    /**
	 * Returns the value of the '<em><b>GOOSE</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSE#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>GOOSE</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>GOOSE</em>' containment reference.
	 * @see #isSetGOOSE()
	 * @see #unsetGOOSE()
	 * @see #setGOOSE(GOOSE)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServices_GOOSE()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSE#getServices
	 * @model opposite="Services" containment="true" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Services!GOOSE'"
	 * @generated
	 */
    GOOSE getGOOSE();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGOOSE <em>GOOSE</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GOOSE</em>' containment reference.
	 * @see #isSetGOOSE()
	 * @see #unsetGOOSE()
	 * @see #getGOOSE()
	 * @generated
	 */
    void setGOOSE( GOOSE value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGOOSE <em>GOOSE</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetGOOSE()
	 * @see #getGOOSE()
	 * @see #setGOOSE(GOOSE)
	 * @generated
	 */
    void unsetGOOSE();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGOOSE <em>GOOSE</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>GOOSE</em>' containment reference is set.
	 * @see #unsetGOOSE()
	 * @see #getGOOSE()
	 * @see #setGOOSE(GOOSE)
	 * @generated
	 */
    boolean isSetGOOSE();

    /**
	 * Returns the value of the '<em><b>GSE Dir</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEDir#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>GSE Dir</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>GSE Dir</em>' containment reference.
	 * @see #isSetGSEDir()
	 * @see #unsetGSEDir()
	 * @see #setGSEDir(GSEDir)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServices_GSEDir()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEDir#getServices
	 * @model opposite="Services" containment="true" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Services!GSEDir'"
	 * @generated
	 */
    GSEDir getGSEDir();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGSEDir <em>GSE Dir</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GSE Dir</em>' containment reference.
	 * @see #isSetGSEDir()
	 * @see #unsetGSEDir()
	 * @see #getGSEDir()
	 * @generated
	 */
    void setGSEDir( GSEDir value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGSEDir <em>GSE Dir</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetGSEDir()
	 * @see #getGSEDir()
	 * @see #setGSEDir(GSEDir)
	 * @generated
	 */
    void unsetGSEDir();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGSEDir <em>GSE Dir</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>GSE Dir</em>' containment reference is set.
	 * @see #unsetGSEDir()
	 * @see #getGSEDir()
	 * @see #setGSEDir(GSEDir)
	 * @generated
	 */
    boolean isSetGSEDir();

    /**
	 * Returns the value of the '<em><b>GSE Settings</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>GSE Settings</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>GSE Settings</em>' containment reference.
	 * @see #isSetGSESettings()
	 * @see #unsetGSESettings()
	 * @see #setGSESettings(GSESettings)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServices_GSESettings()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings#getServices
	 * @model opposite="Services" containment="true" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Services!GSESettings'"
	 * @generated
	 */
    GSESettings getGSESettings();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGSESettings <em>GSE Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GSE Settings</em>' containment reference.
	 * @see #isSetGSESettings()
	 * @see #unsetGSESettings()
	 * @see #getGSESettings()
	 * @generated
	 */
    void setGSESettings( GSESettings value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGSESettings <em>GSE Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetGSESettings()
	 * @see #getGSESettings()
	 * @see #setGSESettings(GSESettings)
	 * @generated
	 */
    void unsetGSESettings();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGSESettings <em>GSE Settings</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>GSE Settings</em>' containment reference is set.
	 * @see #unsetGSESettings()
	 * @see #getGSESettings()
	 * @see #setGSESettings(GSESettings)
	 * @generated
	 */
    boolean isSetGSESettings();

    /**
	 * Returns the value of the '<em><b>GSSE</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSSE#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>GSSE</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>GSSE</em>' containment reference.
	 * @see #isSetGSSE()
	 * @see #unsetGSSE()
	 * @see #setGSSE(GSSE)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServices_GSSE()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GSSE#getServices
	 * @model opposite="Services" containment="true" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Services!GSSE'"
	 * @generated
	 */
    GSSE getGSSE();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGSSE <em>GSSE</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GSSE</em>' containment reference.
	 * @see #isSetGSSE()
	 * @see #unsetGSSE()
	 * @see #getGSSE()
	 * @generated
	 */
    void setGSSE( GSSE value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGSSE <em>GSSE</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetGSSE()
	 * @see #getGSSE()
	 * @see #setGSSE(GSSE)
	 * @generated
	 */
    void unsetGSSE();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGSSE <em>GSSE</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>GSSE</em>' containment reference is set.
	 * @see #unsetGSSE()
	 * @see #getGSSE()
	 * @see #setGSSE(GSSE)
	 * @generated
	 */
    boolean isSetGSSE();

    /**
	 * Returns the value of the '<em><b>Get CB Values</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GetCBValues#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Get CB Values</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Get CB Values</em>' containment reference.
	 * @see #isSetGetCBValues()
	 * @see #unsetGetCBValues()
	 * @see #setGetCBValues(GetCBValues)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServices_GetCBValues()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GetCBValues#getServices
	 * @model opposite="Services" containment="true" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Services!GetCBValues'"
	 * @generated
	 */
    GetCBValues getGetCBValues();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGetCBValues <em>Get CB Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get CB Values</em>' containment reference.
	 * @see #isSetGetCBValues()
	 * @see #unsetGetCBValues()
	 * @see #getGetCBValues()
	 * @generated
	 */
    void setGetCBValues( GetCBValues value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGetCBValues <em>Get CB Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetGetCBValues()
	 * @see #getGetCBValues()
	 * @see #setGetCBValues(GetCBValues)
	 * @generated
	 */
    void unsetGetCBValues();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGetCBValues <em>Get CB Values</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Get CB Values</em>' containment reference is set.
	 * @see #unsetGetCBValues()
	 * @see #getGetCBValues()
	 * @see #setGetCBValues(GetCBValues)
	 * @generated
	 */
    boolean isSetGetCBValues();

    /**
	 * Returns the value of the '<em><b>Get Data Object Definition</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GetDataObjectDefinition#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Get Data Object Definition</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Data Object Definition</em>' containment reference.
	 * @see #isSetGetDataObjectDefinition()
	 * @see #unsetGetDataObjectDefinition()
	 * @see #setGetDataObjectDefinition(GetDataObjectDefinition)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServices_GetDataObjectDefinition()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GetDataObjectDefinition#getServices
	 * @model opposite="Services" containment="true" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Services!GetDataObjectDefinition'"
	 * @generated
	 */
    GetDataObjectDefinition getGetDataObjectDefinition();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGetDataObjectDefinition <em>Get Data Object Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Data Object Definition</em>' containment reference.
	 * @see #isSetGetDataObjectDefinition()
	 * @see #unsetGetDataObjectDefinition()
	 * @see #getGetDataObjectDefinition()
	 * @generated
	 */
    void setGetDataObjectDefinition( GetDataObjectDefinition value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGetDataObjectDefinition <em>Get Data Object Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetGetDataObjectDefinition()
	 * @see #getGetDataObjectDefinition()
	 * @see #setGetDataObjectDefinition(GetDataObjectDefinition)
	 * @generated
	 */
    void unsetGetDataObjectDefinition();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGetDataObjectDefinition <em>Get Data Object Definition</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Get Data Object Definition</em>' containment reference is set.
	 * @see #unsetGetDataObjectDefinition()
	 * @see #getGetDataObjectDefinition()
	 * @see #setGetDataObjectDefinition(GetDataObjectDefinition)
	 * @generated
	 */
    boolean isSetGetDataObjectDefinition();

    /**
	 * Returns the value of the '<em><b>Get Data Set Value</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GetDataSetValue#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Get Data Set Value</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Data Set Value</em>' containment reference.
	 * @see #isSetGetDataSetValue()
	 * @see #unsetGetDataSetValue()
	 * @see #setGetDataSetValue(GetDataSetValue)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServices_GetDataSetValue()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GetDataSetValue#getServices
	 * @model opposite="Services" containment="true" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Services!GetDataSetValue'"
	 * @generated
	 */
    GetDataSetValue getGetDataSetValue();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGetDataSetValue <em>Get Data Set Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Data Set Value</em>' containment reference.
	 * @see #isSetGetDataSetValue()
	 * @see #unsetGetDataSetValue()
	 * @see #getGetDataSetValue()
	 * @generated
	 */
    void setGetDataSetValue( GetDataSetValue value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGetDataSetValue <em>Get Data Set Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetGetDataSetValue()
	 * @see #getGetDataSetValue()
	 * @see #setGetDataSetValue(GetDataSetValue)
	 * @generated
	 */
    void unsetGetDataSetValue();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGetDataSetValue <em>Get Data Set Value</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Get Data Set Value</em>' containment reference is set.
	 * @see #unsetGetDataSetValue()
	 * @see #getGetDataSetValue()
	 * @see #setGetDataSetValue(GetDataSetValue)
	 * @generated
	 */
    boolean isSetGetDataSetValue();

    /**
	 * Returns the value of the '<em><b>Get Directory</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GetDirectory#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Get Directory</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Directory</em>' containment reference.
	 * @see #isSetGetDirectory()
	 * @see #unsetGetDirectory()
	 * @see #setGetDirectory(GetDirectory)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServices_GetDirectory()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GetDirectory#getServices
	 * @model opposite="Services" containment="true" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Services!GetDirectory'"
	 * @generated
	 */
    GetDirectory getGetDirectory();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGetDirectory <em>Get Directory</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Directory</em>' containment reference.
	 * @see #isSetGetDirectory()
	 * @see #unsetGetDirectory()
	 * @see #getGetDirectory()
	 * @generated
	 */
    void setGetDirectory( GetDirectory value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGetDirectory <em>Get Directory</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetGetDirectory()
	 * @see #getGetDirectory()
	 * @see #setGetDirectory(GetDirectory)
	 * @generated
	 */
    void unsetGetDirectory();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGetDirectory <em>Get Directory</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Get Directory</em>' containment reference is set.
	 * @see #unsetGetDirectory()
	 * @see #getGetDirectory()
	 * @see #setGetDirectory(GetDirectory)
	 * @generated
	 */
    boolean isSetGetDirectory();

    /**
	 * Returns the value of the '<em><b>IED</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>IED</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>IED</em>' container reference.
	 * @see #setIED(IED)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServices_IED()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getServices
	 * @model opposite="Services" resolveProxies="false" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Services!IED'"
	 * @generated
	 */
    IED getIED();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getIED <em>IED</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IED</em>' container reference.
	 * @see #getIED()
	 * @generated
	 */
    void setIED( IED value );

    /**
	 * Returns the value of the '<em><b>Log Settings</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LogSettings#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Log Settings</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Settings</em>' containment reference.
	 * @see #isSetLogSettings()
	 * @see #unsetLogSettings()
	 * @see #setLogSettings(LogSettings)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServices_LogSettings()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LogSettings#getServices
	 * @model opposite="Services" containment="true" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Services!LogSettings'"
	 * @generated
	 */
    LogSettings getLogSettings();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getLogSettings <em>Log Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Settings</em>' containment reference.
	 * @see #isSetLogSettings()
	 * @see #unsetLogSettings()
	 * @see #getLogSettings()
	 * @generated
	 */
    void setLogSettings( LogSettings value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getLogSettings <em>Log Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetLogSettings()
	 * @see #getLogSettings()
	 * @see #setLogSettings(LogSettings)
	 * @generated
	 */
    void unsetLogSettings();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getLogSettings <em>Log Settings</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Log Settings</em>' containment reference is set.
	 * @see #unsetLogSettings()
	 * @see #getLogSettings()
	 * @see #setLogSettings(LogSettings)
	 * @generated
	 */
    boolean isSetLogSettings();

    /**
	 * Returns the value of the '<em><b>Read Write</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReadWrite#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Read Write</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Write</em>' containment reference.
	 * @see #isSetReadWrite()
	 * @see #unsetReadWrite()
	 * @see #setReadWrite(ReadWrite)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServices_ReadWrite()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ReadWrite#getServices
	 * @model opposite="Services" containment="true" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Services!ReadWrite'"
	 * @generated
	 */
    ReadWrite getReadWrite();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getReadWrite <em>Read Write</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Write</em>' containment reference.
	 * @see #isSetReadWrite()
	 * @see #unsetReadWrite()
	 * @see #getReadWrite()
	 * @generated
	 */
    void setReadWrite( ReadWrite value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getReadWrite <em>Read Write</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetReadWrite()
	 * @see #getReadWrite()
	 * @see #setReadWrite(ReadWrite)
	 * @generated
	 */
    void unsetReadWrite();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getReadWrite <em>Read Write</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Read Write</em>' containment reference is set.
	 * @see #unsetReadWrite()
	 * @see #getReadWrite()
	 * @see #setReadWrite(ReadWrite)
	 * @generated
	 */
    boolean isSetReadWrite();

    /**
	 * Returns the value of the '<em><b>Red Prot</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RedProt#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Red Prot</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Red Prot</em>' containment reference.
	 * @see #isSetRedProt()
	 * @see #unsetRedProt()
	 * @see #setRedProt(RedProt)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServices_RedProt()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.RedProt#getServices
	 * @model opposite="Services" containment="true" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Services!RedProt'"
	 * @generated
	 */
    RedProt getRedProt();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getRedProt <em>Red Prot</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Red Prot</em>' containment reference.
	 * @see #isSetRedProt()
	 * @see #unsetRedProt()
	 * @see #getRedProt()
	 * @generated
	 */
    void setRedProt( RedProt value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getRedProt <em>Red Prot</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetRedProt()
	 * @see #getRedProt()
	 * @see #setRedProt(RedProt)
	 * @generated
	 */
    void unsetRedProt();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getRedProt <em>Red Prot</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Red Prot</em>' containment reference is set.
	 * @see #unsetRedProt()
	 * @see #getRedProt()
	 * @see #setRedProt(RedProt)
	 * @generated
	 */
    boolean isSetRedProt();

    /**
	 * Returns the value of the '<em><b>Report Settings</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Report Settings</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Report Settings</em>' containment reference.
	 * @see #isSetReportSettings()
	 * @see #unsetReportSettings()
	 * @see #setReportSettings(ReportSettings)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServices_ReportSettings()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getServices
	 * @model opposite="Services" containment="true" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Services!ReportSettings'"
	 * @generated
	 */
    ReportSettings getReportSettings();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getReportSettings <em>Report Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Report Settings</em>' containment reference.
	 * @see #isSetReportSettings()
	 * @see #unsetReportSettings()
	 * @see #getReportSettings()
	 * @generated
	 */
    void setReportSettings( ReportSettings value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getReportSettings <em>Report Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetReportSettings()
	 * @see #getReportSettings()
	 * @see #setReportSettings(ReportSettings)
	 * @generated
	 */
    void unsetReportSettings();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getReportSettings <em>Report Settings</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Report Settings</em>' containment reference is set.
	 * @see #unsetReportSettings()
	 * @see #getReportSettings()
	 * @see #setReportSettings(ReportSettings)
	 * @generated
	 */
    boolean isSetReportSettings();

    /**
	 * Returns the value of the '<em><b>SM Vsc</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVsc#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SM Vsc</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>SM Vsc</em>' containment reference.
	 * @see #isSetSMVsc()
	 * @see #unsetSMVsc()
	 * @see #setSMVsc(SMVsc)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServices_SMVsc()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVsc#getServices
	 * @model opposite="Services" containment="true" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Services!SMVsc'"
	 * @generated
	 */
    SMVsc getSMVsc();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getSMVsc <em>SM Vsc</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SM Vsc</em>' containment reference.
	 * @see #isSetSMVsc()
	 * @see #unsetSMVsc()
	 * @see #getSMVsc()
	 * @generated
	 */
    void setSMVsc( SMVsc value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getSMVsc <em>SM Vsc</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetSMVsc()
	 * @see #getSMVsc()
	 * @see #setSMVsc(SMVsc)
	 * @generated
	 */
    void unsetSMVsc();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getSMVsc <em>SM Vsc</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>SM Vsc</em>' containment reference is set.
	 * @see #unsetSMVsc()
	 * @see #getSMVsc()
	 * @see #setSMVsc(SMVsc)
	 * @generated
	 */
    boolean isSetSMVsc();

    /**
	 * Returns the value of the '<em><b>Sup Subscription</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SupSubscription#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sup Subscription</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Sup Subscription</em>' containment reference.
	 * @see #isSetSupSubscription()
	 * @see #unsetSupSubscription()
	 * @see #setSupSubscription(SupSubscription)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServices_SupSubscription()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SupSubscription#getServices
	 * @model opposite="Services" containment="true" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Services!SupSubscription'"
	 * @generated
	 */
    SupSubscription getSupSubscription();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getSupSubscription <em>Sup Subscription</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sup Subscription</em>' containment reference.
	 * @see #isSetSupSubscription()
	 * @see #unsetSupSubscription()
	 * @see #getSupSubscription()
	 * @generated
	 */
    void setSupSubscription( SupSubscription value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getSupSubscription <em>Sup Subscription</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetSupSubscription()
	 * @see #getSupSubscription()
	 * @see #setSupSubscription(SupSubscription)
	 * @generated
	 */
    void unsetSupSubscription();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getSupSubscription <em>Sup Subscription</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sup Subscription</em>' containment reference is set.
	 * @see #unsetSupSubscription()
	 * @see #getSupSubscription()
	 * @see #setSupSubscription(SupSubscription)
	 * @generated
	 */
    boolean isSetSupSubscription();

    /**
	 * Returns the value of the '<em><b>Value Handling</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ValueHandling#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value Handling</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Handling</em>' containment reference.
	 * @see #isSetValueHandling()
	 * @see #unsetValueHandling()
	 * @see #setValueHandling(ValueHandling)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServices_ValueHandling()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ValueHandling#getServices
	 * @model opposite="Services" containment="true" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Services!ValueHandling'"
	 * @generated
	 */
    ValueHandling getValueHandling();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getValueHandling <em>Value Handling</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Handling</em>' containment reference.
	 * @see #isSetValueHandling()
	 * @see #unsetValueHandling()
	 * @see #getValueHandling()
	 * @generated
	 */
    void setValueHandling( ValueHandling value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getValueHandling <em>Value Handling</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetValueHandling()
	 * @see #getValueHandling()
	 * @see #setValueHandling(ValueHandling)
	 * @generated
	 */
    void unsetValueHandling();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getValueHandling <em>Value Handling</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value Handling</em>' containment reference is set.
	 * @see #unsetValueHandling()
	 * @see #getValueHandling()
	 * @see #setValueHandling(ValueHandling)
	 * @generated
	 */
    boolean isSetValueHandling();

    /**
	 * Returns the value of the '<em><b>Set Data Set Value</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SetDataSetValue#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Set Data Set Value</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Data Set Value</em>' containment reference.
	 * @see #isSetSetDataSetValue()
	 * @see #unsetSetDataSetValue()
	 * @see #setSetDataSetValue(SetDataSetValue)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServices_SetDataSetValue()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SetDataSetValue#getServices
	 * @model opposite="Services" containment="true" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Services!SetDataSetValue'"
	 * @generated
	 */
    SetDataSetValue getSetDataSetValue();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getSetDataSetValue <em>Set Data Set Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Data Set Value</em>' containment reference.
	 * @see #isSetSetDataSetValue()
	 * @see #unsetSetDataSetValue()
	 * @see #getSetDataSetValue()
	 * @generated
	 */
    void setSetDataSetValue( SetDataSetValue value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getSetDataSetValue <em>Set Data Set Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetSetDataSetValue()
	 * @see #getSetDataSetValue()
	 * @see #setSetDataSetValue(SetDataSetValue)
	 * @generated
	 */
    void unsetSetDataSetValue();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getSetDataSetValue <em>Set Data Set Value</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Set Data Set Value</em>' containment reference is set.
	 * @see #unsetSetDataSetValue()
	 * @see #getSetDataSetValue()
	 * @see #setSetDataSetValue(SetDataSetValue)
	 * @generated
	 */
    boolean isSetSetDataSetValue();

    /**
	 * Returns the value of the '<em><b>Setting Groups</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingGroups#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Setting Groups</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Setting Groups</em>' containment reference.
	 * @see #isSetSettingGroups()
	 * @see #unsetSettingGroups()
	 * @see #setSettingGroups(SettingGroups)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServices_SettingGroups()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingGroups#getServices
	 * @model opposite="Services" containment="true" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Services!SettingGroups'"
	 * @generated
	 */
    SettingGroups getSettingGroups();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getSettingGroups <em>Setting Groups</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setting Groups</em>' containment reference.
	 * @see #isSetSettingGroups()
	 * @see #unsetSettingGroups()
	 * @see #getSettingGroups()
	 * @generated
	 */
    void setSettingGroups( SettingGroups value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getSettingGroups <em>Setting Groups</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetSettingGroups()
	 * @see #getSettingGroups()
	 * @see #setSettingGroups(SettingGroups)
	 * @generated
	 */
    void unsetSettingGroups();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getSettingGroups <em>Setting Groups</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Setting Groups</em>' containment reference is set.
	 * @see #unsetSettingGroups()
	 * @see #getSettingGroups()
	 * @see #setSettingGroups(SettingGroups)
	 * @generated
	 */
    boolean isSetSettingGroups();

    /**
	 * Returns the value of the '<em><b>Time Sync Prot</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt#getServices <em>Services</em>}'.
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
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServices_TimeSyncProt()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt#getServices
	 * @model opposite="Services" containment="true" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Services!TimeSyncProt'"
	 * @generated
	 */
    TimeSyncProt getTimeSyncProt();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getTimeSyncProt <em>Time Sync Prot</em>}' containment reference.
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
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getTimeSyncProt <em>Time Sync Prot</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetTimeSyncProt()
	 * @see #getTimeSyncProt()
	 * @see #setTimeSyncProt(TimeSyncProt)
	 * @generated
	 */
    void unsetTimeSyncProt();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getTimeSyncProt <em>Time Sync Prot</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Timer Activated Control</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TimerActivatedControl#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Timer Activated Control</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Timer Activated Control</em>' containment reference.
	 * @see #isSetTimerActivatedControl()
	 * @see #unsetTimerActivatedControl()
	 * @see #setTimerActivatedControl(TimerActivatedControl)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServices_TimerActivatedControl()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.TimerActivatedControl#getServices
	 * @model opposite="Services" containment="true" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Services!TimerActivatedControl'"
	 * @generated
	 */
    TimerActivatedControl getTimerActivatedControl();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getTimerActivatedControl <em>Timer Activated Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timer Activated Control</em>' containment reference.
	 * @see #isSetTimerActivatedControl()
	 * @see #unsetTimerActivatedControl()
	 * @see #getTimerActivatedControl()
	 * @generated
	 */
    void setTimerActivatedControl( TimerActivatedControl value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getTimerActivatedControl <em>Timer Activated Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetTimerActivatedControl()
	 * @see #getTimerActivatedControl()
	 * @see #setTimerActivatedControl(TimerActivatedControl)
	 * @generated
	 */
    void unsetTimerActivatedControl();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getTimerActivatedControl <em>Timer Activated Control</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Timer Activated Control</em>' containment reference is set.
	 * @see #unsetTimerActivatedControl()
	 * @see #getTimerActivatedControl()
	 * @see #setTimerActivatedControl(TimerActivatedControl)
	 * @generated
	 */
    boolean isSetTimerActivatedControl();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Services_nameLength_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv Services_nameLength_valid:\n *   let\n *     severity : Integer[1] = \'Services::Services_nameLength_valid\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let status : Boolean[?] = self.nameLength &lt;&gt; null implies self.nameLength = 32 or self.nameLength &gt;= 64\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{message = \'nameLength attribute shall be valid in Services (line \' +\n *               self.lineNumber.toString() + \'). \' + \'Current value is \' +\n *               self.nameLength.toString(), status = status\n *             }\n *           endif\n *       in\n *         \'Services::Services_nameLength_valid\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_Services_c_c_Services_nameLength_valid);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_2;\nif (le) {\n\tsymbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_symbol_1;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Integer%&gt; nameLength = this.getNameLength();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_nameLength = nameLength == null ? null : &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(nameLength);\n\t\tfinal /*@NonInvalid\052/ boolean ne = BOXED_nameLength != null;\n\t\t/*@Thrown\052/ boolean status;\n\t\tif (ne) {\n\t\t\tfinal /*@NonInvalid\052/ boolean eq = &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_32.equals(BOXED_nameLength);\n\t\t\t/*@Thrown\052/ boolean or;\n\t\t\tif (eq) {\n\t\t\t\tor = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t}\n\t\t\telse {\n\t\t\t\tfinal /*@Thrown\052/ boolean ge = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation%&gt;.INSTANCE.evaluate(executor, BOXED_nameLength, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_64).booleanValue();\n\t\t\t\tor = ge;\n\t\t\t}\n\t\t\tstatus = or;\n\t\t}\n\t\telse {\n\t\t\tstatus = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\t/*@Thrown\052/ &lt;%java.lang.Object%&gt; symbol_1;\n\t\tif (status) {\n\t\t\tsymbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\telse {\n\t\t\tfinal /*@NonInvalid\052/ int lineNumber = this.getLineNumber();\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_lineNumber = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; toString = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_lineNumber);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_nameLength_32_attribute_32_shall_32_be_32_valid_32_in_32_Services_32_o_line_32, toString);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR__e__32);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_1 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_0, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_Current_32_value_32_is_32);\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; toString_0 = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation%&gt;.INSTANCE.evaluate(BOXED_nameLength);\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; sum_2 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_1, toString_0);\n\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.TUPLid_, sum_2, status);\n\t\t\tsymbol_1 = symbol_0;\n\t\t}\n\t\tCAUGHT_symbol_1 = symbol_1;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_symbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.STR_Services_c_c_Services_nameLength_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, &lt;%fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables%&gt;.INT_0).booleanValue();\n\tsymbol_2 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_2;'"
	 * @generated
	 */
	boolean validateServices_nameLength_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Services
