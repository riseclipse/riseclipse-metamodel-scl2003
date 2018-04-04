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
 * A representation of the model object '<em><b>General Equipment Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipmentContainer#getFunction <em>Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipmentContainer#getGeneralEquipment <em>General Equipment</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGeneralEquipmentContainer()
 * @model
 * @generated
 */
public interface GeneralEquipmentContainer extends PowerSystemResource {
    /**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference list.
	 * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function}.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getGeneralEquipmentContainer <em>General Equipment Container</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Function</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' containment reference list.
	 * @see #isSetFunction()
	 * @see #unsetFunction()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGeneralEquipmentContainer_Function()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getGeneralEquipmentContainer
	 * @model opposite="GeneralEquipmentContainer" containment="true" unsettable="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!GeneralEquipmentContainer!Function'"
	 * @generated
	 */
    EList<Function> getFunction();

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipmentContainer#getFunction <em>Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetFunction()
	 * @see #getFunction()
	 * @generated
	 */
    void unsetFunction();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipmentContainer#getFunction <em>Function</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Function</em>' containment reference list is set.
	 * @see #unsetFunction()
	 * @see #getFunction()
	 * @generated
	 */
    boolean isSetFunction();

    /**
	 * Returns the value of the '<em><b>General Equipment</b></em>' containment reference list.
	 * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment}.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getGeneralEquipmentContainer <em>General Equipment Container</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>General Equipment</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>General Equipment</em>' containment reference list.
	 * @see #isSetGeneralEquipment()
	 * @see #unsetGeneralEquipment()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGeneralEquipmentContainer_GeneralEquipment()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getGeneralEquipmentContainer
	 * @model opposite="GeneralEquipmentContainer" containment="true" unsettable="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!GeneralEquipmentContainer!GeneralEquipment'"
	 * @generated
	 */
    EList<GeneralEquipment> getGeneralEquipment();

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipmentContainer#getGeneralEquipment <em>General Equipment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetGeneralEquipment()
	 * @see #getGeneralEquipment()
	 * @generated
	 */
    void unsetGeneralEquipment();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipmentContainer#getGeneralEquipment <em>General Equipment</em>}' containment reference list is set.
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
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='GeneralEquipmentContainer_nothing'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * inv GeneralEquipmentContainer_nothing: true\n \052/\nreturn &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;'"
	 * @generated
	 */
	boolean validateGeneralEquipmentContainer_nothing(DiagnosticChain diagnostics, Map<Object, Object> context);

} // GeneralEquipmentContainer
