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
 * A representation of the model object '<em><b>Equipment Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EquipmentContainer#getPowerTransformer <em>Power Transformer</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EquipmentContainer#getGeneralEquipment <em>General Equipment</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getEquipmentContainer()
 * @model
 * @generated
 */
public interface EquipmentContainer extends PowerSystemResource {
    /**
	 * Returns the value of the '<em><b>Power Transformer</b></em>' containment reference list.
	 * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.PowerTransformer}.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.PowerTransformer#getEquipmentContainer <em>Equipment Container</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Power Transformer</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Transformer</em>' containment reference list.
	 * @see #isSetPowerTransformer()
	 * @see #unsetPowerTransformer()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getEquipmentContainer_PowerTransformer()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.PowerTransformer#getEquipmentContainer
	 * @model opposite="EquipmentContainer" containment="true" unsettable="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!EquipmentContainer!PowerTransformer'"
	 * @generated
	 */
    EList<PowerTransformer> getPowerTransformer();

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EquipmentContainer#getPowerTransformer <em>Power Transformer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetPowerTransformer()
	 * @see #getPowerTransformer()
	 * @generated
	 */
    void unsetPowerTransformer();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EquipmentContainer#getPowerTransformer <em>Power Transformer</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Power Transformer</em>' containment reference list is set.
	 * @see #unsetPowerTransformer()
	 * @see #getPowerTransformer()
	 * @generated
	 */
    boolean isSetPowerTransformer();

    /**
	 * Returns the value of the '<em><b>General Equipment</b></em>' containment reference list.
	 * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment}.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getEquipmentContainer <em>Equipment Container</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>General Equipment</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>General Equipment</em>' containment reference list.
	 * @see #isSetGeneralEquipment()
	 * @see #unsetGeneralEquipment()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getEquipmentContainer_GeneralEquipment()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getEquipmentContainer
	 * @model opposite="EquipmentContainer" containment="true" unsettable="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!EquipmentContainer!GeneralEquipment'"
	 * @generated
	 */
    EList<GeneralEquipment> getGeneralEquipment();

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EquipmentContainer#getGeneralEquipment <em>General Equipment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetGeneralEquipment()
	 * @see #getGeneralEquipment()
	 * @generated
	 */
    void unsetGeneralEquipment();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EquipmentContainer#getGeneralEquipment <em>General Equipment</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>General Equipment</em>' containment reference list is set.
	 * @see #unsetGeneralEquipment()
	 * @see #getGeneralEquipment()
	 * @generated
	 */
    boolean isSetGeneralEquipment();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='EquipmentContainer_nothing'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * inv EquipmentContainer_nothing: true\n \052/\nreturn &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;'"
	 * @generated
	 */
	boolean validateEquipmentContainer_nothing(DiagnosticChain diagnostics, Map<Object, Object> context);

} // EquipmentContainer
