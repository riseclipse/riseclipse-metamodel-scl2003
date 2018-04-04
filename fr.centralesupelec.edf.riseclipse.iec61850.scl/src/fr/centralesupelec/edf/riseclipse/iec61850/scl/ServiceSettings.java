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
 * A representation of the model object '<em><b>Service Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettings#getCbName <em>Cb Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettings#getDatSet <em>Dat Set</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServiceSettings()
 * @model
 * @generated
 */
public interface ServiceSettings extends SclObject {
    /**
	 * Returns the value of the '<em><b>Cb Name</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsNoDynEnum}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cb Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Cb Name</em>' attribute.
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsNoDynEnum
	 * @see #isSetCbName()
	 * @see #unsetCbName()
	 * @see #setCbName(ServiceSettingsNoDynEnum)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServiceSettings_CbName()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!ServiceSettings!cbName'"
	 * @generated
	 */
    ServiceSettingsNoDynEnum getCbName();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettings#getCbName <em>Cb Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cb Name</em>' attribute.
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsNoDynEnum
	 * @see #isSetCbName()
	 * @see #unsetCbName()
	 * @see #getCbName()
	 * @generated
	 */
    void setCbName( ServiceSettingsNoDynEnum value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettings#getCbName <em>Cb Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetCbName()
	 * @see #getCbName()
	 * @see #setCbName(ServiceSettingsNoDynEnum)
	 * @generated
	 */
    void unsetCbName();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettings#getCbName <em>Cb Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cb Name</em>' attribute is set.
	 * @see #unsetCbName()
	 * @see #getCbName()
	 * @see #setCbName(ServiceSettingsNoDynEnum)
	 * @generated
	 */
    boolean isSetCbName();

    /**
	 * Returns the value of the '<em><b>Dat Set</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dat Set</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Dat Set</em>' attribute.
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum
	 * @see #isSetDatSet()
	 * @see #unsetDatSet()
	 * @see #setDatSet(ServiceSettingsEnum)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServiceSettings_DatSet()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!ServiceSettings!datSet'"
	 * @generated
	 */
    ServiceSettingsEnum getDatSet();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettings#getDatSet <em>Dat Set</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dat Set</em>' attribute.
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum
	 * @see #isSetDatSet()
	 * @see #unsetDatSet()
	 * @see #getDatSet()
	 * @generated
	 */
    void setDatSet( ServiceSettingsEnum value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettings#getDatSet <em>Dat Set</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetDatSet()
	 * @see #getDatSet()
	 * @see #setDatSet(ServiceSettingsEnum)
	 * @generated
	 */
    void unsetDatSet();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettings#getDatSet <em>Dat Set</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dat Set</em>' attribute is set.
	 * @see #unsetDatSet()
	 * @see #getDatSet()
	 * @see #setDatSet(ServiceSettingsEnum)
	 * @generated
	 */
    boolean isSetDatSet();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ServiceSettings_nothing'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * inv ServiceSettings_nothing: true\n \052/\nreturn &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;'"
	 * @generated
	 */
	boolean validateServiceSettings_nothing(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ServiceSettings
