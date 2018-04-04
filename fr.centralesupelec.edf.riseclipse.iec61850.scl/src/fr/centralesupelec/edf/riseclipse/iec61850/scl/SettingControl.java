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
 * A representation of the model object '<em><b>Setting Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl#getActSG <em>Act SG</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl#getNumOfSGs <em>Num Of SGs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl#getResvTms <em>Resv Tms</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl#getLN0 <em>LN0</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSettingControl()
 * @model
 * @generated
 */
public interface SettingControl extends UnNaming {
    /**
	 * Returns the value of the '<em><b>Act SG</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Act SG</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Act SG</em>' attribute.
	 * @see #isSetActSG()
	 * @see #unsetActSG()
	 * @see #setActSG(Integer)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSettingControl_ActSG()
	 * @model unsettable="true"
	 * @generated
	 */
    Integer getActSG();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl#getActSG <em>Act SG</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Act SG</em>' attribute.
	 * @see #isSetActSG()
	 * @see #unsetActSG()
	 * @see #getActSG()
	 * @generated
	 */
    void setActSG( Integer value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl#getActSG <em>Act SG</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetActSG()
	 * @see #getActSG()
	 * @see #setActSG(Integer)
	 * @generated
	 */
    void unsetActSG();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl#getActSG <em>Act SG</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Act SG</em>' attribute is set.
	 * @see #unsetActSG()
	 * @see #getActSG()
	 * @see #setActSG(Integer)
	 * @generated
	 */
    boolean isSetActSG();

    /**
	 * Returns the value of the '<em><b>Num Of SGs</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Num Of SGs</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Of SGs</em>' attribute.
	 * @see #isSetNumOfSGs()
	 * @see #unsetNumOfSGs()
	 * @see #setNumOfSGs(Integer)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSettingControl_NumOfSGs()
	 * @model unsettable="true"
	 * @generated
	 */
    Integer getNumOfSGs();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl#getNumOfSGs <em>Num Of SGs</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Of SGs</em>' attribute.
	 * @see #isSetNumOfSGs()
	 * @see #unsetNumOfSGs()
	 * @see #getNumOfSGs()
	 * @generated
	 */
    void setNumOfSGs( Integer value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl#getNumOfSGs <em>Num Of SGs</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetNumOfSGs()
	 * @see #getNumOfSGs()
	 * @see #setNumOfSGs(Integer)
	 * @generated
	 */
    void unsetNumOfSGs();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl#getNumOfSGs <em>Num Of SGs</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Num Of SGs</em>' attribute is set.
	 * @see #unsetNumOfSGs()
	 * @see #getNumOfSGs()
	 * @see #setNumOfSGs(Integer)
	 * @generated
	 */
    boolean isSetNumOfSGs();

    /**
	 * Returns the value of the '<em><b>Resv Tms</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resv Tms</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Resv Tms</em>' attribute.
	 * @see #isSetResvTms()
	 * @see #unsetResvTms()
	 * @see #setResvTms(Short)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSettingControl_ResvTms()
	 * @model unsettable="true"
	 * @generated
	 */
    Short getResvTms();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl#getResvTms <em>Resv Tms</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resv Tms</em>' attribute.
	 * @see #isSetResvTms()
	 * @see #unsetResvTms()
	 * @see #getResvTms()
	 * @generated
	 */
    void setResvTms( Short value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl#getResvTms <em>Resv Tms</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetResvTms()
	 * @see #getResvTms()
	 * @see #setResvTms(Short)
	 * @generated
	 */
    void unsetResvTms();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl#getResvTms <em>Resv Tms</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Resv Tms</em>' attribute is set.
	 * @see #unsetResvTms()
	 * @see #getResvTms()
	 * @see #setResvTms(Short)
	 * @generated
	 */
    boolean isSetResvTms();

    /**
	 * Returns the value of the '<em><b>LN0</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0#getSettingControl <em>Setting Control</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>LN0</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>LN0</em>' container reference.
	 * @see #setLN0(LN0)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSettingControl_LN0()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0#getSettingControl
	 * @model opposite="SettingControl" resolveProxies="false" unsettable="true"
	 * @generated
	 */
    LN0 getLN0();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl#getLN0 <em>LN0</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LN0</em>' container reference.
	 * @see #getLN0()
	 * @generated
	 */
    void setLN0( LN0 value );

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SettingControl_numOfSGs_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'numOfSGs attribute shall be present in SettingControl (line \' + self.lineNumber.toString() + \')\' ,\n\tstatus : Boolean = \n        self.numOfSGs &lt;&gt; null\n\n    \n}.status'"
	 * @generated
	 */
	boolean validateSettingControl_numOfSGs_required(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SettingControl_numOfSGs_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'numOfSGs attribute shall be greater than 0 in SettingControl (line \' + self.lineNumber.toString() + \'). \'\n          + \'Current value is \' + self.numOfSGs.toString()\n        ,\n\tstatus : Boolean = \n        self.numOfSGs &lt;&gt; null implies self.numOfSGs &gt; 0\n\n    \n}.status'"
	 * @generated
	 */
	boolean validateSettingControl_numOfSGs_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SettingControl_actSG_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'actSG attribute shall be greater than 0 in SettingControl (line \' + self.lineNumber.toString() + \'). \'\n          + \'Current value is \' + self.actSG.toString()\n        ,\n\tstatus : Boolean = \n        self.actSG &lt;&gt; null implies self.actSG &gt; 0\n\n    \n}.status'"
	 * @generated
	 */
	boolean validateSettingControl_actSG_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SettingControl_resvTms_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'resvTms attribute shall be valid in SettingControl (line \' + self.lineNumber.toString() + \'). \'\n          + \'Current value is \' + self.resvTms.toString()\n        ,\n\tstatus : Boolean = \n        self.resvTms &lt;&gt; null implies self.resvTms &gt;= 0\n\n\n\n\n}.status'"
	 * @generated
	 */
	boolean validateSettingControl_resvTms_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

} // SettingControl
