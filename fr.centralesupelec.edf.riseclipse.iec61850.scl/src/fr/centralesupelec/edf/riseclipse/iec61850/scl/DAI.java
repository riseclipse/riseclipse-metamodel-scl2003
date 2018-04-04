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
 * A representation of the model object '<em><b>DAI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getIx <em>Ix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getSAddr <em>SAddr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getValImport <em>Val Import</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getValKind <em>Val Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getVal <em>Val</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getDOI <em>DOI</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getSDI <em>SDI</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDAI()
 * @model
 * @generated
 */
public interface DAI extends DataAttribute {
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
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDAI_Ix()
	 * @model unsettable="true"
	 * @generated
	 */
    Integer getIx();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getIx <em>Ix</em>}' attribute.
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
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getIx <em>Ix</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetIx()
	 * @see #getIx()
	 * @see #setIx(Integer)
	 * @generated
	 */
    void unsetIx();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getIx <em>Ix</em>}' attribute is set.
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
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDAI_SAddr()
	 * @model unsettable="true"
	 * @generated
	 */
    String getSAddr();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getSAddr <em>SAddr</em>}' attribute.
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
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getSAddr <em>SAddr</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetSAddr()
	 * @see #getSAddr()
	 * @see #setSAddr(String)
	 * @generated
	 */
    void unsetSAddr();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getSAddr <em>SAddr</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Val Import</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Val Import</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Val Import</em>' attribute.
	 * @see #isSetValImport()
	 * @see #unsetValImport()
	 * @see #setValImport(Boolean)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDAI_ValImport()
	 * @model unsettable="true"
	 * @generated
	 */
    Boolean getValImport();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getValImport <em>Val Import</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val Import</em>' attribute.
	 * @see #isSetValImport()
	 * @see #unsetValImport()
	 * @see #getValImport()
	 * @generated
	 */
    void setValImport( Boolean value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getValImport <em>Val Import</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetValImport()
	 * @see #getValImport()
	 * @see #setValImport(Boolean)
	 * @generated
	 */
    void unsetValImport();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getValImport <em>Val Import</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Val Import</em>' attribute is set.
	 * @see #unsetValImport()
	 * @see #getValImport()
	 * @see #setValImport(Boolean)
	 * @generated
	 */
    boolean isSetValImport();

    /**
	 * Returns the value of the '<em><b>Val Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ValKindEnum}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Val Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Val Kind</em>' attribute.
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ValKindEnum
	 * @see #isSetValKind()
	 * @see #unsetValKind()
	 * @see #setValKind(ValKindEnum)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDAI_ValKind()
	 * @model unsettable="true"
	 * @generated
	 */
    ValKindEnum getValKind();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getValKind <em>Val Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val Kind</em>' attribute.
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ValKindEnum
	 * @see #isSetValKind()
	 * @see #unsetValKind()
	 * @see #getValKind()
	 * @generated
	 */
    void setValKind( ValKindEnum value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getValKind <em>Val Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetValKind()
	 * @see #getValKind()
	 * @see #setValKind(ValKindEnum)
	 * @generated
	 */
    void unsetValKind();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getValKind <em>Val Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Val Kind</em>' attribute is set.
	 * @see #unsetValKind()
	 * @see #getValKind()
	 * @see #setValKind(ValKindEnum)
	 * @generated
	 */
    boolean isSetValKind();

    /**
	 * Returns the value of the '<em><b>Val</b></em>' containment reference list.
	 * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Val}.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Val#getDAI <em>DAI</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Val</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Val</em>' containment reference list.
	 * @see #isSetVal()
	 * @see #unsetVal()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDAI_Val()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Val#getDAI
	 * @model opposite="DAI" containment="true" unsettable="true" ordered="false"
	 * @generated
	 */
    EList<Val> getVal();

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getVal <em>Val</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetVal()
	 * @see #getVal()
	 * @generated
	 */
    void unsetVal();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getVal <em>Val</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Val</em>' containment reference list is set.
	 * @see #unsetVal()
	 * @see #getVal()
	 * @generated
	 */
    boolean isSetVal();

    /**
	 * Returns the value of the '<em><b>DOI</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getDAI <em>DAI</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DOI</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>DOI</em>' container reference.
	 * @see #setDOI(DOI)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDAI_DOI()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getDAI
	 * @model opposite="DAI" resolveProxies="false" unsettable="true"
	 * @generated
	 */
    DOI getDOI();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getDOI <em>DOI</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DOI</em>' container reference.
	 * @see #getDOI()
	 * @generated
	 */
    void setDOI( DOI value );

    /**
	 * Returns the value of the '<em><b>SDI</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getDAI <em>DAI</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SDI</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>SDI</em>' container reference.
	 * @see #setSDI(SDI)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDAI_SDI()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getDAI
	 * @model opposite="DAI" resolveProxies="false" unsettable="true"
	 * @generated
	 */
    SDI getSDI();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getSDI <em>SDI</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SDI</em>' container reference.
	 * @see #getSDI()
	 * @generated
	 */
    void setSDI( SDI value );

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DAI_name_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'name attribute shall be present in DAI (line \' + self.lineNumber.toString() + \')\' ,\n\tstatus : Boolean = \n        self.name &lt;&gt; null\n    \n    \n}.status'"
	 * @generated
	 */
	boolean validateDAI_name_required(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DAI_name_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'name attribute shall be valid in DAI (line \' + self.lineNumber.toString() + \'). \'\n          + \'Current value is \' + self.name.toString()\n        ,\n\tstatus : Boolean = \n        self.name &lt;&gt; null implies self.validSclAttributeNameEnum( name )\n\n    \n}.status'"
	 * @generated
	 */
	boolean validateDAI_name_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DAI_ix_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'ix attribute shall be valid in DAI (line \' + self.lineNumber.toString() + \'). \'\n          + \'Current value is \' + self.ix.toString()\n        ,\n\tstatus : Boolean = \n        self.ix &lt;&gt; null implies self.ix &gt;= 0\n\n    \n}.status'"
	 * @generated
	 */
	boolean validateDAI_ix_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

} // DAI
