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

import java.util.List;

import java.util.Map;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.BDA;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclSwitch;
import fr.centralesupelec.edf.riseclipse.util.AbstractRiseClipseConsole;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BDA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.BDAImpl#getDAType <em>DA Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BDAImpl extends AbstractDataAttributeImpl implements BDA {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected BDAImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getBDA();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DAType getDAType() {
		if (eContainerFeatureID() != SclPackage.BDA__DA_TYPE) return null;
		return (DAType)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetDAType( DAType newDAType, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newDAType, SclPackage.BDA__DA_TYPE, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDAType( DAType newDAType ) {
		if (newDAType != eInternalContainer() || (eContainerFeatureID() != SclPackage.BDA__DA_TYPE && newDAType != null)) {
			if (EcoreUtil.isAncestor(this, newDAType))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDAType != null)
				msgs = ((InternalEObject)newDAType).eInverseAdd(this, SclPackage.DA_TYPE__BDA, DAType.class, msgs);
			msgs = basicSetDAType(newDAType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.BDA__DA_TYPE, newDAType, newDAType));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBDA_nothing(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * inv BDA_nothing: true
		 */
		return ValueUtil.TRUE_VALUE;
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
		switch (featureID) {
			case SclPackage.BDA__DA_TYPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDAType((DAType)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
		switch (featureID) {
			case SclPackage.BDA__DA_TYPE:
				return basicSetDAType(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature( NotificationChain msgs ) {
		switch (eContainerFeatureID()) {
			case SclPackage.BDA__DA_TYPE:
				return eInternalContainer().eInverseRemove(this, SclPackage.DA_TYPE__BDA, DAType.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
		switch (featureID) {
			case SclPackage.BDA__DA_TYPE:
				return getDAType();
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
			case SclPackage.BDA__DA_TYPE:
				setDAType((DAType)newValue);
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
			case SclPackage.BDA__DA_TYPE:
				setDAType((DAType)null);
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
			case SclPackage.BDA__DA_TYPE:
				return getDAType() != null;
		}
		return super.eIsSet(featureID);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SclPackage.BDA___VALIDATE_BDA_NOTHING__DIAGNOSTICCHAIN_MAP:
				return validateBDA_nothing((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

				@Override
    protected void doResolveLinks() {
        // desc    Some descriptive text for the attribute
        // name    The attribute name; the type tAttributeEnum restricts to the attribute names from IEC 61850-7-3, plus new ones starting with lower case letters
        // sAddr   an optional short address of this BDA attribute
        // bType   The basic type of the attribute, taken from tBasicTypeEnum
        // type    Only used if bType= Enum or bType = Struct to refer to the appropriate enumeration type or DAType definition
        // count   Optional. Shall state the number of array elements in the case where the attribute is an array
        // valKind Determines how the value shall be interpreted if any is given

        // TODO: put in AbstractDataType

        // Resolve only if attribute has been read
        if( !typeESet ) return;

        if( "Enum".equals( getBType() ) ) {

            // find an EnumType with
            //   EnumType.id == DA.type
            SclSwitch< Boolean > s = new SclSwitch< Boolean >() {

                @Override
                public Boolean caseEnumType( EnumType object ) {
                    return object.getId().equals( getType() );
                }

                @Override
                public Boolean defaultCase( EObject object ) {
                    return false;
                }

            };

            List< EnumType > res = shallowSearchObjects( getSCLRoot().getDataTypeTemplates().getEnumType(), s );
            String mess = "EnumType( id = " + getType() + " ) for BDA on line " + getLineNumber() + " )";
            if( res.isEmpty() ) {
                AbstractRiseClipseConsole.getConsole().error( "cannot find " + mess );
            }
            else if( res.size() > 1 ) {
                AbstractRiseClipseConsole.getConsole().error( "found several " + mess );
            }
            else {
                //AbstractRiseClipseConsole.getConsole().info( "found " + mess );
                setRefersToEnumType( res.get( 0 ) );
            }
        }
        else if( "Struct".equals( getBType() ) ) {

            // find an DAType with
            //   DAType.id == DA.type
            SclSwitch< Boolean > s = new SclSwitch< Boolean >() {

                @Override
                public Boolean caseDAType( DAType object ) {
                    return object.getId().equals( getType() );
                }

                @Override
                public Boolean defaultCase( EObject object ) {
                    return false;
                }

            };

            List< DAType > res = shallowSearchObjects( getSCLRoot().getDataTypeTemplates().getDAType(), s );
            String mess = "DAType( id = " + getType() + " ) for BDA on line " + getLineNumber() + " )";
            if( res.isEmpty() ) {
                AbstractRiseClipseConsole.getConsole().error( "cannot find " + mess );
            }
            else if( res.size() > 1 ) {
                AbstractRiseClipseConsole.getConsole().error( "found several " + mess );
            }
            else {
                //AbstractRiseClipseConsole.getConsole().info( "found " + mess );
                // TODO
                //daType = res.get( 0 );
            }
        }
    }
} //BDAImpl
