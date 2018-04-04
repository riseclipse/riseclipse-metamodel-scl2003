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
package fr.centralesupelec.edf.riseclipse.iec61850.scl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclObjectImpl#getLineNumber <em>Line Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SclObjectImpl extends MinimalEObjectImpl.Container implements SclObject {
    /**
	 * The default value of the '{@link #getLineNumber() <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLineNumber()
	 * @generated
	 * @ordered
	 */
    protected static final int LINE_NUMBER_EDEFAULT = -1;

    /**
	 * The cached value of the '{@link #getLineNumber() <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLineNumber()
	 * @generated
	 * @ordered
	 */
    protected int lineNumber = LINE_NUMBER_EDEFAULT;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected SclObjectImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getSclObject();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public int getLineNumber() {
		return lineNumber;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setLineNumber( int newLineNumber ) {
		int oldLineNumber = lineNumber;
		lineNumber = newLineNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SCL_OBJECT__LINE_NUMBER, oldLineNumber, lineNumber));
	}

    /**
	 * The cached invocation delegate for the '{@link #validSclAccessPointName(java.lang.String) <em>Valid Scl Access Point Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclAccessPointName(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_ACCESS_POINT_NAME_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclAccessPointName__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclAccessPointName(String s) {
		try {
			return (Boolean)VALID_SCL_ACCESS_POINT_NAME_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclAcsiName(java.lang.String) <em>Valid Scl Acsi Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclAcsiName(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_ACSI_NAME_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclAcsiName__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclAcsiName(String s) {
		try {
			return (Boolean)VALID_SCL_ACSI_NAME_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclAnyName(java.lang.String) <em>Valid Scl Any Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclAnyName(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_ANY_NAME_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclAnyName__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclAnyName(String s) {
		try {
			return (Boolean)VALID_SCL_ANY_NAME_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclAssociationID(java.lang.String) <em>Valid Scl Association ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclAssociationID(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_ASSOCIATION_ID_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclAssociationID__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclAssociationID(String s) {
		try {
			return (Boolean)VALID_SCL_ASSOCIATION_ID_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclAttributeNameEnum(java.lang.String) <em>Valid Scl Attribute Name Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclAttributeNameEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_ATTRIBUTE_NAME_ENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclAttributeNameEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclAttributeNameEnum(String s) {
		try {
			return (Boolean)VALID_SCL_ATTRIBUTE_NAME_ENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclAuthenticationEnum(java.lang.String) <em>Valid Scl Authentication Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclAuthenticationEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_AUTHENTICATION_ENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclAuthenticationEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclAuthenticationEnum(String s) {
		try {
			return (Boolean)VALID_SCL_AUTHENTICATION_ENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclBasicTypeEnum(java.lang.String) <em>Valid Scl Basic Type Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclBasicTypeEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_BASIC_TYPE_ENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclBasicTypeEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclBasicTypeEnum(String s) {
		try {
			return (Boolean)VALID_SCL_BASIC_TYPE_ENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclCBName(java.lang.String) <em>Valid Scl CB Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclCBName(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_CB_NAME_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclCBName__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclCBName(String s) {
		try {
			return (Boolean)VALID_SCL_CB_NAME_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclCDCEnum(java.lang.String) <em>Valid Scl CDC Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclCDCEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_CDC_ENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclCDCEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclCDCEnum(String s) {
		try {
			return (Boolean)VALID_SCL_CDC_ENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclCommonConductingEquipmentEnum(java.lang.String) <em>Valid Scl Common Conducting Equipment Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclCommonConductingEquipmentEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_COMMON_CONDUCTING_EQUIPMENT_ENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclCommonConductingEquipmentEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclCommonConductingEquipmentEnum(String s) {
		try {
			return (Boolean)VALID_SCL_COMMON_CONDUCTING_EQUIPMENT_ENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclDACount(java.lang.String) <em>Valid Scl DA Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclDACount(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_DA_COUNT_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclDACount__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclDACount(String s) {
		try {
			return (Boolean)VALID_SCL_DA_COUNT_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclDataName(java.lang.String) <em>Valid Scl Data Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclDataName(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_DATA_NAME_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclDataName__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclDataName(String s) {
		try {
			return (Boolean)VALID_SCL_DATA_NAME_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclDataSetName(java.lang.String) <em>Valid Scl Data Set Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclDataSetName(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_DATA_SET_NAME_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclDataSetName__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclDataSetName(String s) {
		try {
			return (Boolean)VALID_SCL_DATA_SET_NAME_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclDomainLNEnum(java.lang.String) <em>Valid Scl Domain LN Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclDomainLNEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_DOMAIN_LN_ENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclDomainLNEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclDomainLNEnum(String s) {
		try {
			return (Boolean)VALID_SCL_DOMAIN_LN_ENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclDomainLNGroupAEnum(java.lang.String) <em>Valid Scl Domain LN Group AEnum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclDomainLNGroupAEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_DOMAIN_LN_GROUP_AENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclDomainLNGroupAEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclDomainLNGroupAEnum(String s) {
		try {
			return (Boolean)VALID_SCL_DOMAIN_LN_GROUP_AENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclDomainLNGroupCEnum(java.lang.String) <em>Valid Scl Domain LN Group CEnum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclDomainLNGroupCEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_DOMAIN_LN_GROUP_CENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclDomainLNGroupCEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclDomainLNGroupCEnum(String s) {
		try {
			return (Boolean)VALID_SCL_DOMAIN_LN_GROUP_CENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclDomainLNGroupFEnum(java.lang.String) <em>Valid Scl Domain LN Group FEnum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclDomainLNGroupFEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_DOMAIN_LN_GROUP_FENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclDomainLNGroupFEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclDomainLNGroupFEnum(String s) {
		try {
			return (Boolean)VALID_SCL_DOMAIN_LN_GROUP_FENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclDomainLNGroupGEnum(java.lang.String) <em>Valid Scl Domain LN Group GEnum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclDomainLNGroupGEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_DOMAIN_LN_GROUP_GENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclDomainLNGroupGEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclDomainLNGroupGEnum(String s) {
		try {
			return (Boolean)VALID_SCL_DOMAIN_LN_GROUP_GENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclDomainLNGroupIEnum(java.lang.String) <em>Valid Scl Domain LN Group IEnum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclDomainLNGroupIEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_DOMAIN_LN_GROUP_IENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclDomainLNGroupIEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclDomainLNGroupIEnum(String s) {
		try {
			return (Boolean)VALID_SCL_DOMAIN_LN_GROUP_IENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclDomainLNGroupKEnum(java.lang.String) <em>Valid Scl Domain LN Group KEnum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclDomainLNGroupKEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_DOMAIN_LN_GROUP_KENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclDomainLNGroupKEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclDomainLNGroupKEnum(String s) {
		try {
			return (Boolean)VALID_SCL_DOMAIN_LN_GROUP_KENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclDomainLNGroupMEnum(java.lang.String) <em>Valid Scl Domain LN Group MEnum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclDomainLNGroupMEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_DOMAIN_LN_GROUP_MENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclDomainLNGroupMEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclDomainLNGroupMEnum(String s) {
		try {
			return (Boolean)VALID_SCL_DOMAIN_LN_GROUP_MENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclDomainLNGroupPEnum(java.lang.String) <em>Valid Scl Domain LN Group PEnum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclDomainLNGroupPEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_DOMAIN_LN_GROUP_PENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclDomainLNGroupPEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclDomainLNGroupPEnum(String s) {
		try {
			return (Boolean)VALID_SCL_DOMAIN_LN_GROUP_PENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclDomainLNGroupQEnum(java.lang.String) <em>Valid Scl Domain LN Group QEnum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclDomainLNGroupQEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_DOMAIN_LN_GROUP_QENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclDomainLNGroupQEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclDomainLNGroupQEnum(String s) {
		try {
			return (Boolean)VALID_SCL_DOMAIN_LN_GROUP_QENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclDomainLNGroupREnum(java.lang.String) <em>Valid Scl Domain LN Group REnum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclDomainLNGroupREnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_DOMAIN_LN_GROUP_RENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclDomainLNGroupREnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclDomainLNGroupREnum(String s) {
		try {
			return (Boolean)VALID_SCL_DOMAIN_LN_GROUP_RENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclDomainLNGroupSEnum(java.lang.String) <em>Valid Scl Domain LN Group SEnum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclDomainLNGroupSEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_DOMAIN_LN_GROUP_SENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclDomainLNGroupSEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclDomainLNGroupSEnum(String s) {
		try {
			return (Boolean)VALID_SCL_DOMAIN_LN_GROUP_SENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclDomainLNGroupTEnum(java.lang.String) <em>Valid Scl Domain LN Group TEnum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclDomainLNGroupTEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_DOMAIN_LN_GROUP_TENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclDomainLNGroupTEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclDomainLNGroupTEnum(String s) {
		try {
			return (Boolean)VALID_SCL_DOMAIN_LN_GROUP_TENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclDomainLNGroupXEnum(java.lang.String) <em>Valid Scl Domain LN Group XEnum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclDomainLNGroupXEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_DOMAIN_LN_GROUP_XENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclDomainLNGroupXEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclDomainLNGroupXEnum(String s) {
		try {
			return (Boolean)VALID_SCL_DOMAIN_LN_GROUP_XENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclDomainLNGroupYEnum(java.lang.String) <em>Valid Scl Domain LN Group YEnum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclDomainLNGroupYEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_DOMAIN_LN_GROUP_YENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclDomainLNGroupYEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclDomainLNGroupYEnum(String s) {
		try {
			return (Boolean)VALID_SCL_DOMAIN_LN_GROUP_YENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclDomainLNGroupZEnum(java.lang.String) <em>Valid Scl Domain LN Group ZEnum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclDomainLNGroupZEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_DOMAIN_LN_GROUP_ZENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclDomainLNGroupZEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclDomainLNGroupZEnum(String s) {
		try {
			return (Boolean)VALID_SCL_DOMAIN_LN_GROUP_ZENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclEmpty(java.lang.String) <em>Valid Scl Empty</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclEmpty(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_EMPTY_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclEmpty__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclEmpty(String s) {
		try {
			return (Boolean)VALID_SCL_EMPTY_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclExtensionAttributeNameEnum(java.lang.String) <em>Valid Scl Extension Attribute Name Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclExtensionAttributeNameEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_EXTENSION_ATTRIBUTE_NAME_ENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclExtensionAttributeNameEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclExtensionAttributeNameEnum(String s) {
		try {
			return (Boolean)VALID_SCL_EXTENSION_ATTRIBUTE_NAME_ENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclExtensionCDCEnum(java.lang.String) <em>Valid Scl Extension CDC Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclExtensionCDCEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_EXTENSION_CDC_ENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclExtensionCDCEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclExtensionCDCEnum(String s) {
		try {
			return (Boolean)VALID_SCL_EXTENSION_CDC_ENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclExtensionEquipmentEnum(java.lang.String) <em>Valid Scl Extension Equipment Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclExtensionEquipmentEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_EXTENSION_EQUIPMENT_ENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclExtensionEquipmentEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclExtensionEquipmentEnum(String s) {
		try {
			return (Boolean)VALID_SCL_EXTENSION_EQUIPMENT_ENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclExtensionGeneralEquipmentEnum(java.lang.String) <em>Valid Scl Extension General Equipment Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclExtensionGeneralEquipmentEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_EXTENSION_GENERAL_EQUIPMENT_ENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclExtensionGeneralEquipmentEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclExtensionGeneralEquipmentEnum(String s) {
		try {
			return (Boolean)VALID_SCL_EXTENSION_GENERAL_EQUIPMENT_ENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclExtensionLNClassEnum(java.lang.String) <em>Valid Scl Extension LN Class Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclExtensionLNClassEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_EXTENSION_LN_CLASS_ENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclExtensionLNClassEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclExtensionLNClassEnum(String s) {
		try {
			return (Boolean)VALID_SCL_EXTENSION_LN_CLASS_ENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclExtensionPTypeEnum(java.lang.String) <em>Valid Scl Extension PType Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclExtensionPTypeEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_EXTENSION_PTYPE_ENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclExtensionPTypeEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclExtensionPTypeEnum(String s) {
		try {
			return (Boolean)VALID_SCL_EXTENSION_PTYPE_ENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclExtensionPhysConnTypeEnum(java.lang.String) <em>Valid Scl Extension Phys Conn Type Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclExtensionPhysConnTypeEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_EXTENSION_PHYS_CONN_TYPE_ENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclExtensionPhysConnTypeEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclExtensionPhysConnTypeEnum(String s) {
		try {
			return (Boolean)VALID_SCL_EXTENSION_PHYS_CONN_TYPE_ENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclFullAttributeName(java.lang.String) <em>Valid Scl Full Attribute Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclFullAttributeName(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_FULL_ATTRIBUTE_NAME_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclFullAttributeName__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclFullAttributeName(String s) {
		try {
			return (Boolean)VALID_SCL_FULL_ATTRIBUTE_NAME_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclFullDOName(java.lang.String) <em>Valid Scl Full DO Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclFullDOName(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_FULL_DO_NAME_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclFullDOName__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclFullDOName(String s) {
		try {
			return (Boolean)VALID_SCL_FULL_DO_NAME_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclGeneralEquipmentEnum(java.lang.String) <em>Valid Scl General Equipment Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclGeneralEquipmentEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_GENERAL_EQUIPMENT_ENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclGeneralEquipmentEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclGeneralEquipmentEnum(String s) {
		try {
			return (Boolean)VALID_SCL_GENERAL_EQUIPMENT_ENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclIEDName(java.lang.String) <em>Valid Scl IED Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclIEDName(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_IED_NAME_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclIEDName__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclIEDName(String s) {
		try {
			return (Boolean)VALID_SCL_IED_NAME_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclIEDNameOrRelative(java.lang.String) <em>Valid Scl IED Name Or Relative</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclIEDNameOrRelative(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_IED_NAME_OR_RELATIVE_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclIEDNameOrRelative__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclIEDNameOrRelative(String s) {
		try {
			return (Boolean)VALID_SCL_IED_NAME_OR_RELATIVE_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclLDInst(java.lang.String) <em>Valid Scl LD Inst</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclLDInst(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_LD_INST_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclLDInst__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclLDInst(String s) {
		try {
			return (Boolean)VALID_SCL_LD_INST_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclLDInstOrEmpty(java.lang.String) <em>Valid Scl LD Inst Or Empty</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclLDInstOrEmpty(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_LD_INST_OR_EMPTY_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclLDInstOrEmpty__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclLDInstOrEmpty(String s) {
		try {
			return (Boolean)VALID_SCL_LD_INST_OR_EMPTY_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclLDName(java.lang.String) <em>Valid Scl LD Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclLDName(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_LD_NAME_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclLDName__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclLDName(String s) {
		try {
			return (Boolean)VALID_SCL_LD_NAME_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclLLN0Enum(java.lang.String) <em>Valid Scl LLN0 Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclLLN0Enum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_LLN0_ENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclLLN0Enum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclLLN0Enum(String s) {
		try {
			return (Boolean)VALID_SCL_LLN0_ENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclLNClassEnum(java.lang.String) <em>Valid Scl LN Class Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclLNClassEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_LN_CLASS_ENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclLNClassEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclLNClassEnum(String s) {
		try {
			return (Boolean)VALID_SCL_LN_CLASS_ENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclLNInst(java.lang.String) <em>Valid Scl LN Inst</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclLNInst(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_LN_INST_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclLNInst__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclLNInst(String s) {
		try {
			return (Boolean)VALID_SCL_LN_INST_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclLNInstOrEmpty(java.lang.String) <em>Valid Scl LN Inst Or Empty</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclLNInstOrEmpty(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_LN_INST_OR_EMPTY_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclLNInstOrEmpty__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclLNInstOrEmpty(String s) {
		try {
			return (Boolean)VALID_SCL_LN_INST_OR_EMPTY_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclLPHDEnum(java.lang.String) <em>Valid Scl LPHD Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclLPHDEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_LPHD_ENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclLPHDEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclLPHDEnum(String s) {
		try {
			return (Boolean)VALID_SCL_LPHD_ENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclLineType(java.lang.String) <em>Valid Scl Line Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclLineType(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_LINE_TYPE_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclLineType__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclLineType(String s) {
		try {
			return (Boolean)VALID_SCL_LINE_TYPE_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclLogName(java.lang.String) <em>Valid Scl Log Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclLogName(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_LOG_NAME_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclLogName__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclLogName(String s) {
		try {
			return (Boolean)VALID_SCL_LOG_NAME_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclMessageID(java.lang.String) <em>Valid Scl Message ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclMessageID(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_MESSAGE_ID_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclMessageID__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclMessageID(String s) {
		try {
			return (Boolean)VALID_SCL_MESSAGE_ID_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclName(java.lang.String) <em>Valid Scl Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclName(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_NAME_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclName__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclName(String s) {
		try {
			return (Boolean)VALID_SCL_NAME_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclNamespaceName(java.lang.String) <em>Valid Scl Namespace Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclNamespaceName(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_NAMESPACE_NAME_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclNamespaceName__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclNamespaceName(String s) {
		try {
			return (Boolean)VALID_SCL_NAMESPACE_NAME_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclOnlyRelativeIEDName(java.lang.String) <em>Valid Scl Only Relative IED Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclOnlyRelativeIEDName(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_ONLY_RELATIVE_IED_NAME_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclOnlyRelativeIEDName__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclOnlyRelativeIEDName(String s) {
		try {
			return (Boolean)VALID_SCL_ONLY_RELATIVE_IED_NAME_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclPAddr(java.lang.String) <em>Valid Scl PAddr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclPAddr(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_PADDR_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclPAddr__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclPAddr(String s) {
		try {
			return (Boolean)VALID_SCL_PADDR_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclPTypeEnum(java.lang.String) <em>Valid Scl PType Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclPTypeEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_PTYPE_ENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclPTypeEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclPTypeEnum(String s) {
		try {
			return (Boolean)VALID_SCL_PTYPE_ENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclPTypePhysConnEnum(java.lang.String) <em>Valid Scl PType Phys Conn Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclPTypePhysConnEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_PTYPE_PHYS_CONN_ENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclPTypePhysConnEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclPTypePhysConnEnum(String s) {
		try {
			return (Boolean)VALID_SCL_PTYPE_PHYS_CONN_ENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclPhysConnTypeEnum(java.lang.String) <em>Valid Scl Phys Conn Type Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclPhysConnTypeEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_PHYS_CONN_TYPE_ENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclPhysConnTypeEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclPhysConnTypeEnum(String s) {
		try {
			return (Boolean)VALID_SCL_PHYS_CONN_TYPE_ENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclPowerTransformerEnum(java.lang.String) <em>Valid Scl Power Transformer Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclPowerTransformerEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_POWER_TRANSFORMER_ENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclPowerTransformerEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclPowerTransformerEnum(String s) {
		try {
			return (Boolean)VALID_SCL_POWER_TRANSFORMER_ENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclPredefinedAttributeNameEnum(java.lang.String) <em>Valid Scl Predefined Attribute Name Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclPredefinedAttributeNameEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_PREDEFINED_ATTRIBUTE_NAME_ENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclPredefinedAttributeNameEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclPredefinedAttributeNameEnum(String s) {
		try {
			return (Boolean)VALID_SCL_PREDEFINED_ATTRIBUTE_NAME_ENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclPredefinedBasicTypeEnum(java.lang.String) <em>Valid Scl Predefined Basic Type Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclPredefinedBasicTypeEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_PREDEFINED_BASIC_TYPE_ENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclPredefinedBasicTypeEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclPredefinedBasicTypeEnum(String s) {
		try {
			return (Boolean)VALID_SCL_PREDEFINED_BASIC_TYPE_ENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclPredefinedCDCEnum(java.lang.String) <em>Valid Scl Predefined CDC Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclPredefinedCDCEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_PREDEFINED_CDC_ENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclPredefinedCDCEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclPredefinedCDCEnum(String s) {
		try {
			return (Boolean)VALID_SCL_PREDEFINED_CDC_ENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclPredefinedCommonConductingEquipmentEnum(java.lang.String) <em>Valid Scl Predefined Common Conducting Equipment Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclPredefinedCommonConductingEquipmentEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_PREDEFINED_COMMON_CONDUCTING_EQUIPMENT_ENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclPredefinedCommonConductingEquipmentEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclPredefinedCommonConductingEquipmentEnum(String s) {
		try {
			return (Boolean)VALID_SCL_PREDEFINED_COMMON_CONDUCTING_EQUIPMENT_ENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclPredefinedGeneralEquipmentEnum(java.lang.String) <em>Valid Scl Predefined General Equipment Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclPredefinedGeneralEquipmentEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_PREDEFINED_GENERAL_EQUIPMENT_ENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclPredefinedGeneralEquipmentEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclPredefinedGeneralEquipmentEnum(String s) {
		try {
			return (Boolean)VALID_SCL_PREDEFINED_GENERAL_EQUIPMENT_ENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclPredefinedLNClassEnum(java.lang.String) <em>Valid Scl Predefined LN Class Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclPredefinedLNClassEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_PREDEFINED_LN_CLASS_ENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclPredefinedLNClassEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclPredefinedLNClassEnum(String s) {
		try {
			return (Boolean)VALID_SCL_PREDEFINED_LN_CLASS_ENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclPredefinedPTypeEnum(java.lang.String) <em>Valid Scl Predefined PType Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclPredefinedPTypeEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_PREDEFINED_PTYPE_ENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclPredefinedPTypeEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclPredefinedPTypeEnum(String s) {
		try {
			return (Boolean)VALID_SCL_PREDEFINED_PTYPE_ENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclPredefinedPTypePhysConnEnum(java.lang.String) <em>Valid Scl Predefined PType Phys Conn Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclPredefinedPTypePhysConnEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_PREDEFINED_PTYPE_PHYS_CONN_ENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclPredefinedPTypePhysConnEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclPredefinedPTypePhysConnEnum(String s) {
		try {
			return (Boolean)VALID_SCL_PREDEFINED_PTYPE_PHYS_CONN_ENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclPredefinedPhysConnTypeEnum(java.lang.String) <em>Valid Scl Predefined Phys Conn Type Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclPredefinedPhysConnTypeEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_PREDEFINED_PHYS_CONN_TYPE_ENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclPredefinedPhysConnTypeEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclPredefinedPhysConnTypeEnum(String s) {
		try {
			return (Boolean)VALID_SCL_PREDEFINED_PHYS_CONN_TYPE_ENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclPrefix(java.lang.String) <em>Valid Scl Prefix</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclPrefix(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_PREFIX_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclPrefix__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclPrefix(String s) {
		try {
			return (Boolean)VALID_SCL_PREFIX_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclProcessName(java.lang.String) <em>Valid Scl Process Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclProcessName(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_PROCESS_NAME_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclProcessName__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclProcessName(String s) {
		try {
			return (Boolean)VALID_SCL_PROCESS_NAME_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclProcessType(java.lang.String) <em>Valid Scl Process Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclProcessType(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_PROCESS_TYPE_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclProcessType__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclProcessType(String s) {
		try {
			return (Boolean)VALID_SCL_PROCESS_TYPE_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclRedProtEnum(java.lang.String) <em>Valid Scl Red Prot Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclRedProtEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_RED_PROT_ENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclRedProtEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclRedProtEnum(String s) {
		try {
			return (Boolean)VALID_SCL_RED_PROT_ENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclRef(java.lang.String) <em>Valid Scl Ref</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclRef(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_REF_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclRef__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclRef(String s) {
		try {
			return (Boolean)VALID_SCL_REF_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclRelease(java.math.BigInteger) <em>Valid Scl Release</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclRelease(java.math.BigInteger)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_RELEASE_BIG_INTEGER__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclRelease__BigInteger()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclRelease(BigInteger i) {
		try {
			return (Boolean)VALID_SCL_RELEASE_BIG_INTEGER__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{i}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclRestrName1stL(java.lang.String) <em>Valid Scl Restr Name1st L</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclRestrName1stL(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_RESTR_NAME1ST_LSTRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclRestrName1stL__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclRestrName1stL(String s) {
		try {
			return (Boolean)VALID_SCL_RESTR_NAME1ST_LSTRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclRestrName1stU(java.lang.String) <em>Valid Scl Restr Name1st U</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclRestrName1stU(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_RESTR_NAME1ST_USTRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclRestrName1stU__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclRestrName1stU(String s) {
		try {
			return (Boolean)VALID_SCL_RESTR_NAME1ST_USTRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclRevision(java.lang.String) <em>Valid Scl Revision</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclRevision(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_REVISION_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclRevision__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclRevision(String s) {
		try {
			return (Boolean)VALID_SCL_REVISION_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclRightEnum(java.lang.String) <em>Valid Scl Right Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclRightEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_RIGHT_ENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclRightEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclRightEnum(String s) {
		try {
			return (Boolean)VALID_SCL_RIGHT_ENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclSDOCount(java.lang.String) <em>Valid Scl SDO Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclSDOCount(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_SDO_COUNT_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclSDOCount__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclSDOCount(String s) {
		try {
			return (Boolean)VALID_SCL_SDO_COUNT_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclSubDataName(java.lang.String) <em>Valid Scl Sub Data Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclSubDataName(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_SUB_DATA_NAME_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclSubDataName__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclSubDataName(String s) {
		try {
			return (Boolean)VALID_SCL_SUB_DATA_NAME_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclSystemLNGroupEnum(java.lang.String) <em>Valid Scl System LN Group Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclSystemLNGroupEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_SYSTEM_LN_GROUP_ENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclSystemLNGroupEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclSystemLNGroupEnum(String s) {
		try {
			return (Boolean)VALID_SCL_SYSTEM_LN_GROUP_ENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclTransformerWindingEnum(java.lang.String) <em>Valid Scl Transformer Winding Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclTransformerWindingEnum(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_TRANSFORMER_WINDING_ENUM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclTransformerWindingEnum__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclTransformerWindingEnum(String s) {
		try {
			return (Boolean)VALID_SCL_TRANSFORMER_WINDING_ENUM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclVersion(java.lang.String) <em>Valid Scl Version</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclVersion(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_VERSION_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclVersion__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclVersion(String s) {
		try {
			return (Boolean)VALID_SCL_VERSION_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * The cached invocation delegate for the '{@link #validSclVisibleBasicLatin(java.lang.String) <em>Valid Scl Visible Basic Latin</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validSclVisibleBasicLatin(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALID_SCL_VISIBLE_BASIC_LATIN_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SclPackage.eINSTANCE.getSclObject__ValidSclVisibleBasicLatin__String()).getInvocationDelegate();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validSclVisibleBasicLatin(String s) {
		try {
			return (Boolean)VALID_SCL_VISIBLE_BASIC_LATIN_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
		switch (featureID) {
			case SclPackage.SCL_OBJECT__LINE_NUMBER:
				return getLineNumber();
		}
		return super.eGet(featureID, resolve, coreType);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void eSet( int featureID, Object newValue ) {
		switch (featureID) {
			case SclPackage.SCL_OBJECT__LINE_NUMBER:
				setLineNumber((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void eUnset( int featureID ) {
		switch (featureID) {
			case SclPackage.SCL_OBJECT__LINE_NUMBER:
				setLineNumber(LINE_NUMBER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public boolean eIsSet( int featureID ) {
		switch (featureID) {
			case SclPackage.SCL_OBJECT__LINE_NUMBER:
				return lineNumber != LINE_NUMBER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SclPackage.SCL_OBJECT___VALID_SCL_ACCESS_POINT_NAME__STRING:
				return validSclAccessPointName((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_ACSI_NAME__STRING:
				return validSclAcsiName((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_ANY_NAME__STRING:
				return validSclAnyName((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_ASSOCIATION_ID__STRING:
				return validSclAssociationID((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_ATTRIBUTE_NAME_ENUM__STRING:
				return validSclAttributeNameEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_AUTHENTICATION_ENUM__STRING:
				return validSclAuthenticationEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_BASIC_TYPE_ENUM__STRING:
				return validSclBasicTypeEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_CB_NAME__STRING:
				return validSclCBName((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_CDC_ENUM__STRING:
				return validSclCDCEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_COMMON_CONDUCTING_EQUIPMENT_ENUM__STRING:
				return validSclCommonConductingEquipmentEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_DA_COUNT__STRING:
				return validSclDACount((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_DATA_NAME__STRING:
				return validSclDataName((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_DATA_SET_NAME__STRING:
				return validSclDataSetName((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_DOMAIN_LN_ENUM__STRING:
				return validSclDomainLNEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_DOMAIN_LN_GROUP_AENUM__STRING:
				return validSclDomainLNGroupAEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_DOMAIN_LN_GROUP_CENUM__STRING:
				return validSclDomainLNGroupCEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_DOMAIN_LN_GROUP_FENUM__STRING:
				return validSclDomainLNGroupFEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_DOMAIN_LN_GROUP_GENUM__STRING:
				return validSclDomainLNGroupGEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_DOMAIN_LN_GROUP_IENUM__STRING:
				return validSclDomainLNGroupIEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_DOMAIN_LN_GROUP_KENUM__STRING:
				return validSclDomainLNGroupKEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_DOMAIN_LN_GROUP_MENUM__STRING:
				return validSclDomainLNGroupMEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_DOMAIN_LN_GROUP_PENUM__STRING:
				return validSclDomainLNGroupPEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_DOMAIN_LN_GROUP_QENUM__STRING:
				return validSclDomainLNGroupQEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_DOMAIN_LN_GROUP_RENUM__STRING:
				return validSclDomainLNGroupREnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_DOMAIN_LN_GROUP_SENUM__STRING:
				return validSclDomainLNGroupSEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_DOMAIN_LN_GROUP_TENUM__STRING:
				return validSclDomainLNGroupTEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_DOMAIN_LN_GROUP_XENUM__STRING:
				return validSclDomainLNGroupXEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_DOMAIN_LN_GROUP_YENUM__STRING:
				return validSclDomainLNGroupYEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_DOMAIN_LN_GROUP_ZENUM__STRING:
				return validSclDomainLNGroupZEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_EMPTY__STRING:
				return validSclEmpty((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_EXTENSION_ATTRIBUTE_NAME_ENUM__STRING:
				return validSclExtensionAttributeNameEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_EXTENSION_CDC_ENUM__STRING:
				return validSclExtensionCDCEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_EXTENSION_EQUIPMENT_ENUM__STRING:
				return validSclExtensionEquipmentEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_EXTENSION_GENERAL_EQUIPMENT_ENUM__STRING:
				return validSclExtensionGeneralEquipmentEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_EXTENSION_LN_CLASS_ENUM__STRING:
				return validSclExtensionLNClassEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_EXTENSION_PTYPE_ENUM__STRING:
				return validSclExtensionPTypeEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_EXTENSION_PHYS_CONN_TYPE_ENUM__STRING:
				return validSclExtensionPhysConnTypeEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_FULL_ATTRIBUTE_NAME__STRING:
				return validSclFullAttributeName((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_FULL_DO_NAME__STRING:
				return validSclFullDOName((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_GENERAL_EQUIPMENT_ENUM__STRING:
				return validSclGeneralEquipmentEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_IED_NAME__STRING:
				return validSclIEDName((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_IED_NAME_OR_RELATIVE__STRING:
				return validSclIEDNameOrRelative((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_LD_INST__STRING:
				return validSclLDInst((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_LD_INST_OR_EMPTY__STRING:
				return validSclLDInstOrEmpty((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_LD_NAME__STRING:
				return validSclLDName((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_LLN0_ENUM__STRING:
				return validSclLLN0Enum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_LN_CLASS_ENUM__STRING:
				return validSclLNClassEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_LN_INST__STRING:
				return validSclLNInst((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_LN_INST_OR_EMPTY__STRING:
				return validSclLNInstOrEmpty((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_LPHD_ENUM__STRING:
				return validSclLPHDEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_LINE_TYPE__STRING:
				return validSclLineType((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_LOG_NAME__STRING:
				return validSclLogName((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_MESSAGE_ID__STRING:
				return validSclMessageID((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_NAME__STRING:
				return validSclName((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_NAMESPACE_NAME__STRING:
				return validSclNamespaceName((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_ONLY_RELATIVE_IED_NAME__STRING:
				return validSclOnlyRelativeIEDName((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_PADDR__STRING:
				return validSclPAddr((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_PTYPE_ENUM__STRING:
				return validSclPTypeEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_PTYPE_PHYS_CONN_ENUM__STRING:
				return validSclPTypePhysConnEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_PHYS_CONN_TYPE_ENUM__STRING:
				return validSclPhysConnTypeEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_POWER_TRANSFORMER_ENUM__STRING:
				return validSclPowerTransformerEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_PREDEFINED_ATTRIBUTE_NAME_ENUM__STRING:
				return validSclPredefinedAttributeNameEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_PREDEFINED_BASIC_TYPE_ENUM__STRING:
				return validSclPredefinedBasicTypeEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_PREDEFINED_CDC_ENUM__STRING:
				return validSclPredefinedCDCEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_PREDEFINED_COMMON_CONDUCTING_EQUIPMENT_ENUM__STRING:
				return validSclPredefinedCommonConductingEquipmentEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_PREDEFINED_GENERAL_EQUIPMENT_ENUM__STRING:
				return validSclPredefinedGeneralEquipmentEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_PREDEFINED_LN_CLASS_ENUM__STRING:
				return validSclPredefinedLNClassEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_PREDEFINED_PTYPE_ENUM__STRING:
				return validSclPredefinedPTypeEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_PREDEFINED_PTYPE_PHYS_CONN_ENUM__STRING:
				return validSclPredefinedPTypePhysConnEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_PREDEFINED_PHYS_CONN_TYPE_ENUM__STRING:
				return validSclPredefinedPhysConnTypeEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_PREFIX__STRING:
				return validSclPrefix((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_PROCESS_NAME__STRING:
				return validSclProcessName((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_PROCESS_TYPE__STRING:
				return validSclProcessType((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_RED_PROT_ENUM__STRING:
				return validSclRedProtEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_REF__STRING:
				return validSclRef((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_RELEASE__BIGINTEGER:
				return validSclRelease((BigInteger)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_RESTR_NAME1ST_L__STRING:
				return validSclRestrName1stL((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_RESTR_NAME1ST_U__STRING:
				return validSclRestrName1stU((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_REVISION__STRING:
				return validSclRevision((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_RIGHT_ENUM__STRING:
				return validSclRightEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_SDO_COUNT__STRING:
				return validSclSDOCount((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_SUB_DATA_NAME__STRING:
				return validSclSubDataName((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_SYSTEM_LN_GROUP_ENUM__STRING:
				return validSclSystemLNGroupEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_TRANSFORMER_WINDING_ENUM__STRING:
				return validSclTransformerWindingEnum((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_VERSION__STRING:
				return validSclVersion((String)arguments.get(0));
			case SclPackage.SCL_OBJECT___VALID_SCL_VISIBLE_BASIC_LATIN__STRING:
				return validSclVisibleBasicLatin((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (lineNumber: ");
		result.append(lineNumber);
		result.append(')');
		return result.toString();
	}

} //SclObjectImpl
