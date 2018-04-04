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
 * A representation of the model object '<em><b>LNode Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeContainer#getLNode <em>LNode</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLNodeContainer()
 * @model
 * @generated
 */
public interface LNodeContainer extends Naming {
    /**
	 * Returns the value of the '<em><b>LNode</b></em>' containment reference list.
	 * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode}.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLNodeContainer <em>LNode Container</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>LNode</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>LNode</em>' containment reference list.
	 * @see #isSetLNode()
	 * @see #unsetLNode()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLNodeContainer_LNode()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLNodeContainer
	 * @model opposite="LNodeContainer" containment="true" unsettable="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!LNodeContainer!LNode'"
	 * @generated
	 */
    EList<LNode> getLNode();

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeContainer#getLNode <em>LNode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetLNode()
	 * @see #getLNode()
	 * @generated
	 */
    void unsetLNode();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeContainer#getLNode <em>LNode</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>LNode</em>' containment reference list is set.
	 * @see #unsetLNode()
	 * @see #getLNode()
	 * @generated
	 */
    boolean isSetLNode();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='LNodeContainer_nothing'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * inv LNodeContainer_nothing: true\n \052/\nreturn &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;'"
	 * @generated
	 */
	boolean validateLNodeContainer_nothing(DiagnosticChain diagnostics, Map<Object, Object> context);

} // LNodeContainer
