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

import java.math.BigDecimal;
import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bit Rate In Mb Per Sec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BitRateInMbPerSec#getValue <em>Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BitRateInMbPerSec#getMultiplier <em>Multiplier</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BitRateInMbPerSec#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getBitRateInMbPerSec()
 * @model extendedMetaData="kind='simple'"
 * @generated
 */
public interface BitRateInMbPerSec extends SclObject {

    /**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BigDecimal)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getBitRateInMbPerSec_Value()
	 * @model required="true"
	 *        extendedMetaData="kind='simple'"
	 * @generated
	 */
    BigDecimal getValue();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BitRateInMbPerSec#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
    void setValue(BigDecimal value);

    /**
	 * Returns the value of the '<em><b>Multiplier</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.UnitMultiplierEnum}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Multiplier</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplier</em>' attribute.
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.UnitMultiplierEnum
	 * @see #isSetMultiplier()
	 * @see #unsetMultiplier()
	 * @see #setMultiplier(UnitMultiplierEnum)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getBitRateInMbPerSec_Multiplier()
	 * @model unsettable="true"
	 * @generated
	 */
    UnitMultiplierEnum getMultiplier();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BitRateInMbPerSec#getMultiplier <em>Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplier</em>' attribute.
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.UnitMultiplierEnum
	 * @see #isSetMultiplier()
	 * @see #unsetMultiplier()
	 * @see #getMultiplier()
	 * @generated
	 */
    void setMultiplier(UnitMultiplierEnum value);

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BitRateInMbPerSec#getMultiplier <em>Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetMultiplier()
	 * @see #getMultiplier()
	 * @see #setMultiplier(UnitMultiplierEnum)
	 * @generated
	 */
    void unsetMultiplier();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BitRateInMbPerSec#getMultiplier <em>Multiplier</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Multiplier</em>' attribute is set.
	 * @see #unsetMultiplier()
	 * @see #getMultiplier()
	 * @see #setMultiplier(UnitMultiplierEnum)
	 * @generated
	 */
    boolean isSetMultiplier();

    /**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Unit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #setUnit(String)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getBitRateInMbPerSec_Unit()
	 * @model unsettable="true"
	 * @generated
	 */
    String getUnit();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BitRateInMbPerSec#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @generated
	 */
    void setUnit(String value);

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BitRateInMbPerSec#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetUnit()
	 * @see #getUnit()
	 * @see #setUnit(String)
	 * @generated
	 */
    void unsetUnit();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BitRateInMbPerSec#getUnit <em>Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unit</em>' attribute is set.
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @see #setUnit(String)
	 * @generated
	 */
    boolean isSetUnit();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BitRateInMbPerSec_value_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'value shall be present in BitRateInMbPerSec (line \' + self.lineNumber.toString() + \')\' ,\n\tstatus : Boolean = \n        self.value &lt;&gt; null\n\n    \n}.status'"
	 * @generated
	 */
	boolean validateBitRateInMbPerSec_value_required(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BitRateInMbPerSec_value_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'value shall be positive in BitRateInMbPerSec (line \' + self.lineNumber.toString() + \'). \'\n          + \'Current value is \' + self.value.toString()\n        ,\n\tstatus : Boolean = \n        self.value &lt;&gt; null implies self.value &gt; 0\n\n    \n}.status'"
	 * @generated
	 */
	boolean validateBitRateInMbPerSec_value_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BitRateInMbPerSec_unit_value'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'unit attribute if present shall be b/s in BitRateInMbPerSec (line \' + self.lineNumber.toString() + \'). \'\n          + \'Current value is \' + self.unit.toString()\n        ,\n\tstatus : Boolean = \n        self.unit &lt;&gt; null implies self.unit = \'b/s\'\n\n    \n}.status'"
	 * @generated
	 */
	boolean validateBitRateInMbPerSec_unit_value(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BitRateInMbPerSec_multiplier_value'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'multiplier attribute if present shall be M in BitRateInMbPerSec (line \' + self.lineNumber.toString() + \'). \'\n          + \'Current value is \' + self.multiplier.toString()\n        ,\n\tstatus : Boolean = \n        self.multiplier &lt;&gt; null implies self.multiplier = UnitMultiplierEnum::M\n    \n\n\n}.status'"
	 * @generated
	 */
	boolean validateBitRateInMbPerSec_multiplier_value(DiagnosticChain diagnostics, Map<Object, Object> context);

} // BitRateInMbPerSec
