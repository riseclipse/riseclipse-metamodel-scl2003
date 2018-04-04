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
 * A representation of the model object '<em><b>GSE Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getAppID <em>App ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getFixedOffs <em>Fixed Offs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getSecurityEnable <em>Security Enable</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getLN0 <em>LN0</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGSEControl()
 * @model
 * @generated
 */
public interface GSEControl extends ControlWithIEDName {
    /**
	 * Returns the value of the '<em><b>App ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>App ID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>App ID</em>' attribute.
	 * @see #isSetAppID()
	 * @see #unsetAppID()
	 * @see #setAppID(String)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGSEControl_AppID()
	 * @model unsettable="true"
	 * @generated
	 */
    String getAppID();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getAppID <em>App ID</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App ID</em>' attribute.
	 * @see #isSetAppID()
	 * @see #unsetAppID()
	 * @see #getAppID()
	 * @generated
	 */
    void setAppID( String value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getAppID <em>App ID</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetAppID()
	 * @see #getAppID()
	 * @see #setAppID(String)
	 * @generated
	 */
    void unsetAppID();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getAppID <em>App ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>App ID</em>' attribute is set.
	 * @see #unsetAppID()
	 * @see #getAppID()
	 * @see #setAppID(String)
	 * @generated
	 */
    boolean isSetAppID();

    /**
	 * Returns the value of the '<em><b>Fixed Offs</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fixed Offs</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Offs</em>' attribute.
	 * @see #isSetFixedOffs()
	 * @see #unsetFixedOffs()
	 * @see #setFixedOffs(Boolean)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGSEControl_FixedOffs()
	 * @model unsettable="true"
	 * @generated
	 */
    Boolean getFixedOffs();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getFixedOffs <em>Fixed Offs</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Offs</em>' attribute.
	 * @see #isSetFixedOffs()
	 * @see #unsetFixedOffs()
	 * @see #getFixedOffs()
	 * @generated
	 */
    void setFixedOffs( Boolean value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getFixedOffs <em>Fixed Offs</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetFixedOffs()
	 * @see #getFixedOffs()
	 * @see #setFixedOffs(Boolean)
	 * @generated
	 */
    void unsetFixedOffs();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getFixedOffs <em>Fixed Offs</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fixed Offs</em>' attribute is set.
	 * @see #unsetFixedOffs()
	 * @see #getFixedOffs()
	 * @see #setFixedOffs(Boolean)
	 * @generated
	 */
    boolean isSetFixedOffs();

    /**
	 * Returns the value of the '<em><b>Security Enable</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.PredefinedTypeOfSecurityEnum}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Security Enable</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Enable</em>' attribute.
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.PredefinedTypeOfSecurityEnum
	 * @see #isSetSecurityEnable()
	 * @see #unsetSecurityEnable()
	 * @see #setSecurityEnable(PredefinedTypeOfSecurityEnum)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGSEControl_SecurityEnable()
	 * @model unsettable="true"
	 * @generated
	 */
    PredefinedTypeOfSecurityEnum getSecurityEnable();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getSecurityEnable <em>Security Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Enable</em>' attribute.
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.PredefinedTypeOfSecurityEnum
	 * @see #isSetSecurityEnable()
	 * @see #unsetSecurityEnable()
	 * @see #getSecurityEnable()
	 * @generated
	 */
    void setSecurityEnable( PredefinedTypeOfSecurityEnum value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getSecurityEnable <em>Security Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetSecurityEnable()
	 * @see #getSecurityEnable()
	 * @see #setSecurityEnable(PredefinedTypeOfSecurityEnum)
	 * @generated
	 */
    void unsetSecurityEnable();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getSecurityEnable <em>Security Enable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Security Enable</em>' attribute is set.
	 * @see #unsetSecurityEnable()
	 * @see #getSecurityEnable()
	 * @see #setSecurityEnable(PredefinedTypeOfSecurityEnum)
	 * @generated
	 */
    boolean isSetSecurityEnable();

    /**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControlTypeEnum}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControlTypeEnum
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(GSEControlTypeEnum)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGSEControl_Type()
	 * @model unsettable="true"
	 * @generated
	 */
    GSEControlTypeEnum getType();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControlTypeEnum
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
    void setType( GSEControlTypeEnum value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(GSEControlTypeEnum)
	 * @generated
	 */
    void unsetType();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(GSEControlTypeEnum)
	 * @generated
	 */
    boolean isSetType();

    /**
	 * Returns the value of the '<em><b>LN0</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0#getGSEControl <em>GSE Control</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>LN0</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>LN0</em>' container reference.
	 * @see #setLN0(LN0)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getGSEControl_LN0()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0#getGSEControl
	 * @model opposite="GSEControl" resolveProxies="false" unsettable="true"
	 * @generated
	 */
    LN0 getLN0();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getLN0 <em>LN0</em>}' container reference.
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
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='GSEControl_appID_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'appID attribute shall be present in GSEControl (line \' + self.lineNumber.toString() + \')\' ,\n\tstatus : Boolean = \n        self.appID &lt;&gt; null\n\n    \n}.status'"
	 * @generated
	 */
	boolean validateGSEControl_appID_required(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='GSEControl_appID_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'appID attribute shall be valid in GSEControl (line \' + self.lineNumber.toString() + \'). \'\n          + \'Current value is \' + self.appID.toString()\n        ,\n\tstatus : Boolean = \n        self.appID &lt;&gt; null implies self.validSclMessageID( appID )\n        \n    \n}.status'"
	 * @generated
	 */
	boolean validateGSEControl_appID_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='GSEControl_confRev_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'confRev attribute shall be present when type is GOOSE in GSEControl (line \' + self.lineNumber.toString() + \')\' ,\n\tstatus : Boolean = \n        ( self.type = null or self.type = GSEControlTypeEnum::GOOSE )\n        implies self.confRev &lt;&gt; null\n    \n    \n}.status'"
	 * @generated
	 */
	boolean validateGSEControl_confRev_required(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='GSEControl_confRev_unsignedInt'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'confRev attribute shall be valid in GSEControl (line \' + self.lineNumber.toString() + \'). \'\n          + \'Current value is \' + self.confRev.toString()\n        ,\n\tstatus : Boolean = \n        self.confRev &lt;&gt; null implies self.confRev &gt;= 0\n    \n\n\n\n}.status'"
	 * @generated
	 */
	boolean validateGSEControl_confRev_unsignedInt(DiagnosticChain diagnostics, Map<Object, Object> context);

} // GSEControl
