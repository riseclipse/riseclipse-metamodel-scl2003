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
 * A representation of the model object '<em><b>Setting Groups</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingGroups#getConfSG <em>Conf SG</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingGroups#getSGEdit <em>SG Edit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingGroups#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSettingGroups()
 * @model
 * @generated
 */
public interface SettingGroups extends SclObject {
    /**
	 * Returns the value of the '<em><b>Conf SG</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfSG#getSettingGroups <em>Setting Groups</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conf SG</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Conf SG</em>' containment reference.
	 * @see #isSetConfSG()
	 * @see #unsetConfSG()
	 * @see #setConfSG(ConfSG)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSettingGroups_ConfSG()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfSG#getSettingGroups
	 * @model opposite="SettingGroups" containment="true" unsettable="true"
	 * @generated
	 */
    ConfSG getConfSG();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingGroups#getConfSG <em>Conf SG</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conf SG</em>' containment reference.
	 * @see #isSetConfSG()
	 * @see #unsetConfSG()
	 * @see #getConfSG()
	 * @generated
	 */
    void setConfSG( ConfSG value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingGroups#getConfSG <em>Conf SG</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetConfSG()
	 * @see #getConfSG()
	 * @see #setConfSG(ConfSG)
	 * @generated
	 */
    void unsetConfSG();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingGroups#getConfSG <em>Conf SG</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Conf SG</em>' containment reference is set.
	 * @see #unsetConfSG()
	 * @see #getConfSG()
	 * @see #setConfSG(ConfSG)
	 * @generated
	 */
    boolean isSetConfSG();

    /**
	 * Returns the value of the '<em><b>SG Edit</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SGEdit#getSettingGroups <em>Setting Groups</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SG Edit</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>SG Edit</em>' containment reference.
	 * @see #isSetSGEdit()
	 * @see #unsetSGEdit()
	 * @see #setSGEdit(SGEdit)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSettingGroups_SGEdit()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SGEdit#getSettingGroups
	 * @model opposite="SettingGroups" containment="true" unsettable="true"
	 * @generated
	 */
    SGEdit getSGEdit();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingGroups#getSGEdit <em>SG Edit</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SG Edit</em>' containment reference.
	 * @see #isSetSGEdit()
	 * @see #unsetSGEdit()
	 * @see #getSGEdit()
	 * @generated
	 */
    void setSGEdit( SGEdit value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingGroups#getSGEdit <em>SG Edit</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetSGEdit()
	 * @see #getSGEdit()
	 * @see #setSGEdit(SGEdit)
	 * @generated
	 */
    void unsetSGEdit();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingGroups#getSGEdit <em>SG Edit</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>SG Edit</em>' containment reference is set.
	 * @see #unsetSGEdit()
	 * @see #getSGEdit()
	 * @see #setSGEdit(SGEdit)
	 * @generated
	 */
    boolean isSetSGEdit();

    /**
	 * Returns the value of the '<em><b>Services</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getSettingGroups <em>Setting Groups</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Services</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' container reference.
	 * @see #setServices(Services)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSettingGroups_Services()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getSettingGroups
	 * @model opposite="SettingGroups" resolveProxies="false" unsettable="true"
	 * @generated
	 */
    Services getServices();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingGroups#getServices <em>Services</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Services</em>' container reference.
	 * @see #getServices()
	 * @generated
	 */
    void setServices( Services value );

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SettingGroups_nothing'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n        true\n\n\n'"
	 * @generated
	 */
	boolean validateSettingGroups_nothing(DiagnosticChain diagnostics, Map<Object, Object> context);

} // SettingGroups
