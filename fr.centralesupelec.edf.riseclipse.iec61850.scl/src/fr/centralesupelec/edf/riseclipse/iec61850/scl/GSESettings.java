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
 * A representation of the model object '<em><b>GSE Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings#getAppID <em>App ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings#getDataLabel <em>Data Label</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGSESettings()
 * @model
 * @generated
 */
public interface GSESettings extends ServiceSettings {
    /**
	 * Returns the value of the '<em><b>App ID</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>App ID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>App ID</em>' attribute.
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum
	 * @see #isSetAppID()
	 * @see #unsetAppID()
	 * @see #setAppID(ServiceSettingsEnum)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGSESettings_AppID()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!GSESettings!appID'"
	 * @generated
	 */
    ServiceSettingsEnum getAppID();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings#getAppID <em>App ID</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App ID</em>' attribute.
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum
	 * @see #isSetAppID()
	 * @see #unsetAppID()
	 * @see #getAppID()
	 * @generated
	 */
    void setAppID( ServiceSettingsEnum value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings#getAppID <em>App ID</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetAppID()
	 * @see #getAppID()
	 * @see #setAppID(ServiceSettingsEnum)
	 * @generated
	 */
    void unsetAppID();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings#getAppID <em>App ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>App ID</em>' attribute is set.
	 * @see #unsetAppID()
	 * @see #getAppID()
	 * @see #setAppID(ServiceSettingsEnum)
	 * @generated
	 */
    boolean isSetAppID();

    /**
	 * Returns the value of the '<em><b>Data Label</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Label</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Label</em>' attribute.
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum
	 * @see #isSetDataLabel()
	 * @see #unsetDataLabel()
	 * @see #setDataLabel(ServiceSettingsEnum)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGSESettings_DataLabel()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!GSESettings!dataLabel'"
	 * @generated
	 */
    ServiceSettingsEnum getDataLabel();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings#getDataLabel <em>Data Label</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Label</em>' attribute.
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum
	 * @see #isSetDataLabel()
	 * @see #unsetDataLabel()
	 * @see #getDataLabel()
	 * @generated
	 */
    void setDataLabel( ServiceSettingsEnum value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings#getDataLabel <em>Data Label</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetDataLabel()
	 * @see #getDataLabel()
	 * @see #setDataLabel(ServiceSettingsEnum)
	 * @generated
	 */
    void unsetDataLabel();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings#getDataLabel <em>Data Label</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Label</em>' attribute is set.
	 * @see #unsetDataLabel()
	 * @see #getDataLabel()
	 * @see #setDataLabel(ServiceSettingsEnum)
	 * @generated
	 */
    boolean isSetDataLabel();

    /**
	 * Returns the value of the '<em><b>Services</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGSESettings <em>GSE Settings</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Services</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' container reference.
	 * @see #setServices(Services)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGSESettings_Services()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGSESettings
	 * @model opposite="GSESettings" resolveProxies="false" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!GSESettings!Services'"
	 * @generated
	 */
    Services getServices();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings#getServices <em>Services</em>}' container reference.
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
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='GSESettings_nothing'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * inv GSESettings_nothing: true\n \052/\nreturn &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;'"
	 * @generated
	 */
	boolean validateGSESettings_nothing(DiagnosticChain diagnostics, Map<Object, Object> context);

} // GSESettings
