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
 * A representation of the model object '<em><b>DO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DO#getTransient <em>Transient</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DO#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DO#getLNodeType <em>LNode Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DO#getRefersToDOType <em>Refers To DO Type</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDO()
 * @model
 * @generated
 */
public interface DO extends DataObject {
    /**
	 * Returns the value of the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transient</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient</em>' attribute.
	 * @see #isSetTransient()
	 * @see #unsetTransient()
	 * @see #setTransient(Boolean)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDO_Transient()
	 * @model unsettable="true"
	 * @generated
	 */
    Boolean getTransient();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DO#getTransient <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transient</em>' attribute.
	 * @see #isSetTransient()
	 * @see #unsetTransient()
	 * @see #getTransient()
	 * @generated
	 */
    void setTransient( Boolean value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DO#getTransient <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetTransient()
	 * @see #getTransient()
	 * @see #setTransient(Boolean)
	 * @generated
	 */
    void unsetTransient();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DO#getTransient <em>Transient</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transient</em>' attribute is set.
	 * @see #unsetTransient()
	 * @see #getTransient()
	 * @see #setTransient(Boolean)
	 * @generated
	 */
    boolean isSetTransient();

    /**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(String)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDO_Type()
	 * @model unsettable="true"
	 * @generated
	 */
    String getType();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DO#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
    void setType( String value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DO#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(String)
	 * @generated
	 */
    void unsetType();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DO#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(String)
	 * @generated
	 */
    boolean isSetType();

    /**
	 * Returns the value of the '<em><b>LNode Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType#getDO <em>DO</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>LNode Type</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>LNode Type</em>' container reference.
	 * @see #setLNodeType(LNodeType)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDO_LNodeType()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType#getDO
	 * @model opposite="DO" resolveProxies="false" unsettable="true"
	 * @generated
	 */
    LNodeType getLNodeType();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DO#getLNodeType <em>LNode Type</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LNode Type</em>' container reference.
	 * @see #getLNodeType()
	 * @generated
	 */
    void setLNodeType( LNodeType value );

    /**
	 * Returns the value of the '<em><b>Refers To DO Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getReferredByDO <em>Referred By DO</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Refers To DO Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers To DO Type</em>' reference.
	 * @see #isSetRefersToDOType()
	 * @see #unsetRefersToDOType()
	 * @see #setRefersToDOType(DOType)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDO_RefersToDOType()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getReferredByDO
	 * @model opposite="ReferredByDO" resolveProxies="false" unsettable="true" transient="true"
	 * @generated
	 */
    DOType getRefersToDOType();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DO#getRefersToDOType <em>Refers To DO Type</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers To DO Type</em>' reference.
	 * @see #isSetRefersToDOType()
	 * @see #unsetRefersToDOType()
	 * @see #getRefersToDOType()
	 * @generated
	 */
    void setRefersToDOType(DOType value);

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DO#getRefersToDOType <em>Refers To DO Type</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetRefersToDOType()
	 * @see #getRefersToDOType()
	 * @see #setRefersToDOType(DOType)
	 * @generated
	 */
    void unsetRefersToDOType();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DO#getRefersToDOType <em>Refers To DO Type</em>}' reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Refers To DO Type</em>' reference is set.
	 * @see #unsetRefersToDOType()
	 * @see #getRefersToDOType()
	 * @see #setRefersToDOType(DOType)
	 * @generated
	 */
    boolean isSetRefersToDOType();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DO_type_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'type attribute shall be present in DO (line \' + self.lineNumber.toString() + \')\' ,\n\tstatus : Boolean = \n        self.type &lt;&gt; null\n\n    \n}.status'"
	 * @generated
	 */
	boolean validateDO_type_required(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DO_type_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'type attribute shall be valid in DO (line \' + self.lineNumber.toString() + \'). \'\n          + \'Current value is \' + self.type.toString()\n        ,\n\tstatus : Boolean = \n        self.type &lt;&gt; null implies self.validSclName( type )\n\n    \n}.status'"
	 * @generated
	 */
	boolean validateDO_type_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

} // DO
