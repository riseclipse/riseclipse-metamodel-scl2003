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
 * A representation of the model object '<em><b>DA Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getIedType <em>Ied Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getBDA <em>BDA</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getReferredByDA <em>Referred By DA</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getDataTypeTemplates <em>Data Type Templates</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getProtNs <em>Prot Ns</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDAType()
 * @model
 * @generated
 */
public interface DAType extends IDNaming {
    /**
	 * Returns the value of the '<em><b>Ied Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ied Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Ied Type</em>' attribute.
	 * @see #isSetIedType()
	 * @see #unsetIedType()
	 * @see #setIedType(String)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDAType_IedType()
	 * @model unsettable="true"
	 * @generated
	 */
    String getIedType();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getIedType <em>Ied Type</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ied Type</em>' attribute.
	 * @see #isSetIedType()
	 * @see #unsetIedType()
	 * @see #getIedType()
	 * @generated
	 */
    void setIedType( String value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getIedType <em>Ied Type</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetIedType()
	 * @see #getIedType()
	 * @see #setIedType(String)
	 * @generated
	 */
    void unsetIedType();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getIedType <em>Ied Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ied Type</em>' attribute is set.
	 * @see #unsetIedType()
	 * @see #getIedType()
	 * @see #setIedType(String)
	 * @generated
	 */
    boolean isSetIedType();

    /**
	 * Returns the value of the '<em><b>BDA</b></em>' containment reference list.
	 * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BDA}.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BDA#getDAType <em>DA Type</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>BDA</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>BDA</em>' containment reference list.
	 * @see #isSetBDA()
	 * @see #unsetBDA()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDAType_BDA()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.BDA#getDAType
	 * @model opposite="DAType" containment="true" unsettable="true" ordered="false"
	 * @generated
	 */
    EList<BDA> getBDA();

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getBDA <em>BDA</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetBDA()
	 * @see #getBDA()
	 * @generated
	 */
    void unsetBDA();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getBDA <em>BDA</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>BDA</em>' containment reference list is set.
	 * @see #unsetBDA()
	 * @see #getBDA()
	 * @generated
	 */
    boolean isSetBDA();

    /**
	 * Returns the value of the '<em><b>Referred By DA</b></em>' reference list.
	 * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DA}.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DA#getRefersToDAType <em>Refers To DA Type</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referred By DA</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred By DA</em>' reference list.
	 * @see #isSetReferredByDA()
	 * @see #unsetReferredByDA()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDAType_ReferredByDA()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DA#getRefersToDAType
	 * @model opposite="RefersToDAType" resolveProxies="false" unsettable="true" transient="true" ordered="false"
	 * @generated
	 */
    EList<DA> getReferredByDA();

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getReferredByDA <em>Referred By DA</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetReferredByDA()
	 * @see #getReferredByDA()
	 * @generated
	 */
    void unsetReferredByDA();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getReferredByDA <em>Referred By DA</em>}' reference list is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Referred By DA</em>' reference list is set.
	 * @see #unsetReferredByDA()
	 * @see #getReferredByDA()
	 * @generated
	 */
    boolean isSetReferredByDA();

    /**
	 * Returns the value of the '<em><b>Data Type Templates</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates#getDAType <em>DA Type</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Type Templates</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type Templates</em>' container reference.
	 * @see #setDataTypeTemplates(DataTypeTemplates)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDAType_DataTypeTemplates()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates#getDAType
	 * @model opposite="DAType" resolveProxies="false" unsettable="true"
	 * @generated
	 */
    DataTypeTemplates getDataTypeTemplates();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getDataTypeTemplates <em>Data Type Templates</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type Templates</em>' container reference.
	 * @see #getDataTypeTemplates()
	 * @generated
	 */
    void setDataTypeTemplates( DataTypeTemplates value );

    /**
	 * Returns the value of the '<em><b>Prot Ns</b></em>' containment reference list.
	 * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ProtNs}.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ProtNs#getDAType <em>DA Type</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Prot Ns</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Prot Ns</em>' containment reference list.
	 * @see #isSetProtNs()
	 * @see #unsetProtNs()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDAType_ProtNs()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ProtNs#getDAType
	 * @model opposite="DAType" containment="true" unsettable="true" ordered="false"
	 * @generated
	 */
    EList<ProtNs> getProtNs();

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getProtNs <em>Prot Ns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetProtNs()
	 * @see #getProtNs()
	 * @generated
	 */
    void unsetProtNs();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getProtNs <em>Prot Ns</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Prot Ns</em>' containment reference list is set.
	 * @see #unsetProtNs()
	 * @see #getProtNs()
	 * @generated
	 */
    boolean isSetProtNs();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DAType_nothing'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n        true\n\n\n'"
	 * @generated
	 */
	boolean validateDAType_nothing(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DAType_at_least_one_BDA_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'DAType shall contain at least one BDA (line \' + self.lineNumber.toString() + \')\' ,\n\tstatus : Boolean = \n        self.BDA-&gt;notEmpty()\n\n\n\n}.status'"
	 * @generated
	 */
	boolean validateDAType_at_least_one_BDA_required(DiagnosticChain diagnostics, Map<Object, Object> context);

} // DAType
