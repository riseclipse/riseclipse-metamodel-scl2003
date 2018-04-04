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
 * A representation of the model object '<em><b>SDI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getIx <em>Ix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getSAddr <em>SAddr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getDAI <em>DAI</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getDOI <em>DOI</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getSubSDI <em>Sub SDI</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getParentSDI <em>Parent SDI</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSDI()
 * @model
 * @generated
 */
public interface SDI extends DataAttribute {
    /**
	 * Returns the value of the '<em><b>Ix</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ix</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Ix</em>' attribute.
	 * @see #isSetIx()
	 * @see #unsetIx()
	 * @see #setIx(Integer)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSDI_Ix()
	 * @model unsettable="true"
	 * @generated
	 */
    Integer getIx();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getIx <em>Ix</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ix</em>' attribute.
	 * @see #isSetIx()
	 * @see #unsetIx()
	 * @see #getIx()
	 * @generated
	 */
    void setIx( Integer value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getIx <em>Ix</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetIx()
	 * @see #getIx()
	 * @see #setIx(Integer)
	 * @generated
	 */
    void unsetIx();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getIx <em>Ix</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ix</em>' attribute is set.
	 * @see #unsetIx()
	 * @see #getIx()
	 * @see #setIx(Integer)
	 * @generated
	 */
    boolean isSetIx();

    /**
	 * Returns the value of the '<em><b>SAddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SAddr</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>SAddr</em>' attribute.
	 * @see #isSetSAddr()
	 * @see #unsetSAddr()
	 * @see #setSAddr(String)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSDI_SAddr()
	 * @model unsettable="true"
	 * @generated
	 */
    String getSAddr();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getSAddr <em>SAddr</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SAddr</em>' attribute.
	 * @see #isSetSAddr()
	 * @see #unsetSAddr()
	 * @see #getSAddr()
	 * @generated
	 */
    void setSAddr( String value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getSAddr <em>SAddr</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetSAddr()
	 * @see #getSAddr()
	 * @see #setSAddr(String)
	 * @generated
	 */
    void unsetSAddr();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getSAddr <em>SAddr</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>SAddr</em>' attribute is set.
	 * @see #unsetSAddr()
	 * @see #getSAddr()
	 * @see #setSAddr(String)
	 * @generated
	 */
    boolean isSetSAddr();

    /**
	 * Returns the value of the '<em><b>DAI</b></em>' containment reference list.
	 * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI}.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getSDI <em>SDI</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DAI</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>DAI</em>' containment reference list.
	 * @see #isSetDAI()
	 * @see #unsetDAI()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSDI_DAI()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getSDI
	 * @model opposite="SDI" containment="true" unsettable="true" ordered="false"
	 * @generated
	 */
    EList<DAI> getDAI();

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getDAI <em>DAI</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetDAI()
	 * @see #getDAI()
	 * @generated
	 */
    void unsetDAI();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getDAI <em>DAI</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>DAI</em>' containment reference list is set.
	 * @see #unsetDAI()
	 * @see #getDAI()
	 * @generated
	 */
    boolean isSetDAI();

    /**
	 * Returns the value of the '<em><b>DOI</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getSDI <em>SDI</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DOI</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>DOI</em>' container reference.
	 * @see #setDOI(DOI)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSDI_DOI()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getSDI
	 * @model opposite="SDI" resolveProxies="false" unsettable="true"
	 * @generated
	 */
    DOI getDOI();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getDOI <em>DOI</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DOI</em>' container reference.
	 * @see #getDOI()
	 * @generated
	 */
    void setDOI( DOI value );

    /**
	 * Returns the value of the '<em><b>Sub SDI</b></em>' containment reference list.
	 * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI}.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getParentSDI <em>Parent SDI</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sub SDI</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub SDI</em>' containment reference list.
	 * @see #isSetSubSDI()
	 * @see #unsetSubSDI()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSDI_SubSDI()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getParentSDI
	 * @model opposite="ParentSDI" containment="true" unsettable="true" ordered="false"
	 *        extendedMetaData="kind='element' name='SDI' namespace='http://www.iec.ch/61850/2003/SCL'"
	 * @generated
	 */
    EList<SDI> getSubSDI();

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getSubSDI <em>Sub SDI</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetSubSDI()
	 * @see #getSubSDI()
	 * @generated
	 */
    void unsetSubSDI();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getSubSDI <em>Sub SDI</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sub SDI</em>' containment reference list is set.
	 * @see #unsetSubSDI()
	 * @see #getSubSDI()
	 * @generated
	 */
    boolean isSetSubSDI();

    /**
	 * Returns the value of the '<em><b>Parent SDI</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getSubSDI <em>Sub SDI</em>}'.
	 * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Parent SDI</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent SDI</em>' container reference.
	 * @see #setParentSDI(SDI)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSDI_ParentSDI()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getSubSDI
	 * @model opposite="SubSDI" resolveProxies="false" unsettable="true"
	 * @generated
	 */
    SDI getParentSDI();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getParentSDI <em>Parent SDI</em>}' container reference.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent SDI</em>' container reference.
	 * @see #getParentSDI()
	 * @generated
	 */
    void setParentSDI( SDI value );

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SDI_name_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'name attribute shall be present in SDI (line \' + self.lineNumber.toString() + \')\' ,\n\tstatus : Boolean = \n        self.name &lt;&gt; null\n    \n    \n}.status'"
	 * @generated
	 */
	boolean validateSDI_name_required(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SDI_name_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'name attribute shall be \\\'SIUnit\\\' or begin with a lower-case letter in SDI (line \' + self.lineNumber.toString() + \'). \'\n          + \'Current value is \' + self.name.toString()\n        ,\n\tstatus : Boolean = \n        self.name &lt;&gt; null implies self.validSclAttributeNameEnum( name )\n\n    \n}.status'"
	 * @generated
	 */
	boolean validateSDI_name_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SDI_ix_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'ix attribute shall be valid in SDI (line \' + self.lineNumber.toString() + \'). \'\n          + \'Current value is \' + self.ix.toString()\n        ,\n\tstatus : Boolean = \n        self.ix &lt;&gt; null implies self.ix &gt;= 0\n\n    \n}.status'"
	 * @generated
	 */
	boolean validateSDI_ix_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

} // SDI
