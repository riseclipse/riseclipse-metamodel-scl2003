/**
 *  Copyright (c) 2018 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec
 *      EDF R&D
 *  Contacts:
 *      dominique.marcadet@centralesupelec.fr
 *      aurelie.dehouck-neveu@edf.fr
 *  Web site:
 *      http://wdi.supelec.fr/software/RiseClipse/
 */
package fr.centralesupelec.edf.riseclipse.iec61850.scl.impl;

import java.util.List;
import java.util.stream.Collectors;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SDO;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.util.AbstractRiseClipseConsole;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SDO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SDOImpl#getCount <em>Count</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SDOImpl#getParentDOType <em>Parent DO Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SDOImpl extends AbstractDataObjectImpl implements SDO {
    /**
     * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCount()
     * @generated
     * @ordered
     */
    protected static final String COUNT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCount()
     * @generated
     * @ordered
     */
    protected String count = COUNT_EDEFAULT;

    /**
     * This is true if the Count attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean countESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SDOImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getSDO();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCount() {
        return count;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCount(String newCount) {
        String oldCount = count;
        count = newCount;
        boolean oldCountESet = countESet;
        countESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SDO__COUNT, oldCount, count, !oldCountESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCount() {
        String oldCount = count;
        boolean oldCountESet = countESet;
        count = COUNT_EDEFAULT;
        countESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SDO__COUNT, oldCount, COUNT_EDEFAULT, oldCountESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCount() {
        return countESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DOType getParentDOType() {
        if (eContainerFeatureID() != SclPackage.SDO__PARENT_DO_TYPE) return null;
        return (DOType)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentDOType(DOType newParentDOType, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentDOType, SclPackage.SDO__PARENT_DO_TYPE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentDOType(DOType newParentDOType) {
        if (newParentDOType != eInternalContainer() || (eContainerFeatureID() != SclPackage.SDO__PARENT_DO_TYPE && newParentDOType != null)) {
            if (EcoreUtil.isAncestor(this, newParentDOType))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentDOType != null)
                msgs = ((InternalEObject)newParentDOType).eInverseAdd(this, SclPackage.DO_TYPE__SDO, DOType.class, msgs);
            msgs = basicSetParentDOType(newParentDOType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SDO__PARENT_DO_TYPE, newParentDOType, newParentDOType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
            case SclPackage.SDO__PARENT_DO_TYPE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentDOType((DOType)otherEnd, msgs);
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
            case SclPackage.SDO__PARENT_DO_TYPE:
                return basicSetParentDOType(null, msgs);
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
            case SclPackage.SDO__PARENT_DO_TYPE:
                return eInternalContainer().eInverseRemove(this, SclPackage.DO_TYPE__SDO, DOType.class, msgs);
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
            case SclPackage.SDO__COUNT:
                return getCount();
            case SclPackage.SDO__PARENT_DO_TYPE:
                return getParentDOType();
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
            case SclPackage.SDO__COUNT:
                setCount((String)newValue);
                return;
            case SclPackage.SDO__PARENT_DO_TYPE:
                setParentDOType((DOType)newValue);
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
            case SclPackage.SDO__COUNT:
                unsetCount();
                return;
            case SclPackage.SDO__PARENT_DO_TYPE:
                setParentDOType((DOType)null);
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
            case SclPackage.SDO__COUNT:
                return isSetCount();
            case SclPackage.SDO__PARENT_DO_TYPE:
                return getParentDOType() != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (count: ");
        if (countESet) result.append(count); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

    @Override
    protected void doResolveLinks() {
        // see Issue #13
        super.doResolveLinks();
        
        // name     The SDO name
        // desc     Descriptive text for the SDO
        // type     References the DOType defining the contents of the SDO
        // count    The number or reference to an attribute defining the number of array elements,
        //          if this element has an ARRAY type. If missing, the default value is 0 (no array)
        
        if( getType() == null ) return;
        DataTypeTemplates dtt = get_DataTypeTemplates();
        if( dtt == null ) return;

        String messagePrefix = "while resolving link from SDO on line " + getLineNumber() + ": ";
        IRiseClipseConsole console = AbstractRiseClipseConsole.getConsole();

        List< DOType > res =
                dtt
                .getDOType()
                .stream()
                .filter( sdo -> getType().equals(  sdo.getId() ))
                .collect( Collectors.toList() );
        
        String mess = "DOType( id = " + getType() + " )";
        if( res.isEmpty() ) {
            console.error( messagePrefix + "cannot find " + mess );
            return;
        }
        if( res.size() > 1 ) {
            console.error( messagePrefix + "found several " + mess );
            return;
        }
        setRefersToDOType( res.get( 0 ) );
        console.info( "SDO on line " + getLineNumber() + " refers to " + mess + " on line " + getRefersToDOType().getLineNumber() );
    }

} //SDOImpl
