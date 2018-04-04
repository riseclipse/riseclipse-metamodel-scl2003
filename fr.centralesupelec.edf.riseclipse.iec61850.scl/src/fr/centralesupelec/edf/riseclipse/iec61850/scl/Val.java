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
 * A representation of the model object '<em><b>Val</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Val#getSGroup <em>SGroup</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Val#getAbstractDataAttribute <em>Abstract Data Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Val#getDAI <em>DAI</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Val#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getVal()
 * @model extendedMetaData="kind='simple'"
 * @generated
 */
public interface Val extends SclObject {
    /**
	 * Returns the value of the '<em><b>SGroup</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SGroup</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>SGroup</em>' attribute.
	 * @see #isSetSGroup()
	 * @see #unsetSGroup()
	 * @see #setSGroup(Integer)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getVal_SGroup()
	 * @model unsettable="true"
	 * @generated
	 */
    Integer getSGroup();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Val#getSGroup <em>SGroup</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SGroup</em>' attribute.
	 * @see #isSetSGroup()
	 * @see #unsetSGroup()
	 * @see #getSGroup()
	 * @generated
	 */
    void setSGroup( Integer value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Val#getSGroup <em>SGroup</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetSGroup()
	 * @see #getSGroup()
	 * @see #setSGroup(Integer)
	 * @generated
	 */
    void unsetSGroup();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Val#getSGroup <em>SGroup</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>SGroup</em>' attribute is set.
	 * @see #unsetSGroup()
	 * @see #getSGroup()
	 * @see #setSGroup(Integer)
	 * @generated
	 */
    boolean isSetSGroup();

    /**
	 * Returns the value of the '<em><b>Abstract Data Attribute</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Abstract Data Attribute</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Data Attribute</em>' container reference.
	 * @see #setAbstractDataAttribute(AbstractDataAttribute)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getVal_AbstractDataAttribute()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getVal
	 * @model opposite="Val" resolveProxies="false" unsettable="true"
	 * @generated
	 */
    AbstractDataAttribute getAbstractDataAttribute();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Val#getAbstractDataAttribute <em>Abstract Data Attribute</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract Data Attribute</em>' container reference.
	 * @see #getAbstractDataAttribute()
	 * @generated
	 */
    void setAbstractDataAttribute( AbstractDataAttribute value );

    /**
	 * Returns the value of the '<em><b>DAI</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DAI</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>DAI</em>' container reference.
	 * @see #setDAI(DAI)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getVal_DAI()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getVal
	 * @model opposite="Val" resolveProxies="false" unsettable="true"
	 * @generated
	 */
    DAI getDAI();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Val#getDAI <em>DAI</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DAI</em>' container reference.
	 * @see #getDAI()
	 * @generated
	 */
    void setDAI( DAI value );

    /**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Value</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getVal_Value()
	 * @model extendedMetaData="kind='simple'"
	 * @generated
	 */
    String getValue();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Val#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
    void setValue( String value );

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Val_sGroup_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'sGroup attribute shall be valid in Val (line \' + self.lineNumber.toString() + \'). \'\n          + \'Current value is \' + self.sGroup.toString()\n        ,\n\tstatus : Boolean = \n        self.sGroup &lt;&gt; null implies self.sGroup &gt;= 0\n\n\n\n}.status'"
	 * @generated
	 */
	boolean validateVal_sGroup_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Val
