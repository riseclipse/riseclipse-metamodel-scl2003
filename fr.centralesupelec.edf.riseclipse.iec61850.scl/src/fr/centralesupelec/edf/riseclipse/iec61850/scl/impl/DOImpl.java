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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.DO;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclSwitch;
import fr.centralesupelec.edf.riseclipse.util.AbstractRiseClipseConsole;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DOImpl#getTransient <em>Transient</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DOImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DOImpl#getLNodeType <em>LNode Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DOImpl#getRefersToDOType <em>Refers To DO Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DOImpl extends DataObjectImpl implements DO {
    /**
     * The default value of the '{@link #getTransient() <em>Transient</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransient()
     * @generated
     * @ordered
     */
    protected static final Boolean TRANSIENT_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getTransient() <em>Transient</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransient()
     * @generated
     * @ordered
     */
    protected Boolean transient_ = TRANSIENT_EDEFAULT;

    /**
     * This is true if the Transient attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean transientESet;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

    /**
     * This is true if the Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean typeESet;

    /**
     * The cached value of the '{@link #getRefersToDOType() <em>Refers To DO Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToDOType()
     * @generated
     * @ordered
     */
    protected DOType refersToDOType;

    /**
     * This is true if the Refers To DO Type reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToDOTypeESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DOImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getDO();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getTransient() {
        return transient_;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void setTransient( Boolean newTransient ) {
        Boolean oldTransient = transient_;
        transient_ = newTransient;
        boolean oldTransientESet = transientESet;
        transientESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.DO__TRANSIENT, oldTransient, transient_, !oldTransientESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void unsetTransient() {
        Boolean oldTransient = transient_;
        boolean oldTransientESet = transientESet;
        transient_ = TRANSIENT_EDEFAULT;
        transientESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.DO__TRANSIENT, oldTransient, TRANSIENT_EDEFAULT, oldTransientESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetTransient() {
        return transientESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType( String newType ) {
        String oldType = type;
        type = newType;
        boolean oldTypeESet = typeESet;
        typeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.DO__TYPE, oldType, type, !oldTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetType() {
        String oldType = type;
        boolean oldTypeESet = typeESet;
        type = TYPE_EDEFAULT;
        typeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.DO__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetType() {
        return typeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LNodeType getLNodeType() {
        if (eContainerFeatureID() != SclPackage.DO__LNODE_TYPE) return null;
        return (LNodeType)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLNodeType( LNodeType newLNodeType, NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newLNodeType, SclPackage.DO__LNODE_TYPE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLNodeType( LNodeType newLNodeType ) {
        if (newLNodeType != eInternalContainer() || (eContainerFeatureID() != SclPackage.DO__LNODE_TYPE && newLNodeType != null)) {
            if (EcoreUtil.isAncestor(this, newLNodeType))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newLNodeType != null)
                msgs = ((InternalEObject)newLNodeType).eInverseAdd(this, SclPackage.LNODE_TYPE__DO, LNodeType.class, msgs);
            msgs = basicSetLNodeType(newLNodeType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.DO__LNODE_TYPE, newLNodeType, newLNodeType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DOType getRefersToDOType() {
        return refersToDOType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToDOType(DOType newRefersToDOType, NotificationChain msgs) {
        DOType oldRefersToDOType = refersToDOType;
        refersToDOType = newRefersToDOType;
        boolean oldRefersToDOTypeESet = refersToDOTypeESet;
        refersToDOTypeESet = true;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.DO__REFERS_TO_DO_TYPE, oldRefersToDOType, newRefersToDOType, !oldRefersToDOTypeESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRefersToDOType(DOType newRefersToDOType) {
        if (newRefersToDOType != refersToDOType) {
            NotificationChain msgs = null;
            if (refersToDOType != null)
                msgs = ((InternalEObject)refersToDOType).eInverseRemove(this, SclPackage.DO_TYPE__REFERRED_BY_DO, DOType.class, msgs);
            if (newRefersToDOType != null)
                msgs = ((InternalEObject)newRefersToDOType).eInverseAdd(this, SclPackage.DO_TYPE__REFERRED_BY_DO, DOType.class, msgs);
            msgs = basicSetRefersToDOType(newRefersToDOType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldRefersToDOTypeESet = refersToDOTypeESet;
            refersToDOTypeESet = true;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.DO__REFERS_TO_DO_TYPE, newRefersToDOType, newRefersToDOType, !oldRefersToDOTypeESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToDOType(NotificationChain msgs) {
        DOType oldRefersToDOType = refersToDOType;
        refersToDOType = null;
        boolean oldRefersToDOTypeESet = refersToDOTypeESet;
        refersToDOTypeESet = false;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.DO__REFERS_TO_DO_TYPE, oldRefersToDOType, null, oldRefersToDOTypeESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetRefersToDOType() {
        if (refersToDOType != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)refersToDOType).eInverseRemove(this, SclPackage.DO_TYPE__REFERRED_BY_DO, DOType.class, msgs);
            msgs = basicUnsetRefersToDOType(msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldRefersToDOTypeESet = refersToDOTypeESet;
            refersToDOTypeESet = false;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.DO__REFERS_TO_DO_TYPE, null, null, oldRefersToDOTypeESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetRefersToDOType() {
        return refersToDOTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
            case SclPackage.DO__LNODE_TYPE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetLNodeType((LNodeType)otherEnd, msgs);
            case SclPackage.DO__REFERS_TO_DO_TYPE:
                if (refersToDOType != null)
                    msgs = ((InternalEObject)refersToDOType).eInverseRemove(this, SclPackage.DO_TYPE__REFERRED_BY_DO, DOType.class, msgs);
                return basicSetRefersToDOType((DOType)otherEnd, msgs);
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
            case SclPackage.DO__LNODE_TYPE:
                return basicSetLNodeType(null, msgs);
            case SclPackage.DO__REFERS_TO_DO_TYPE:
                return basicUnsetRefersToDOType(msgs);
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
            case SclPackage.DO__LNODE_TYPE:
                return eInternalContainer().eInverseRemove(this, SclPackage.LNODE_TYPE__DO, LNodeType.class, msgs);
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
            case SclPackage.DO__TRANSIENT:
                return getTransient();
            case SclPackage.DO__TYPE:
                return getType();
            case SclPackage.DO__LNODE_TYPE:
                return getLNodeType();
            case SclPackage.DO__REFERS_TO_DO_TYPE:
                return getRefersToDOType();
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
            case SclPackage.DO__TRANSIENT:
                setTransient((Boolean)newValue);
                return;
            case SclPackage.DO__TYPE:
                setType((String)newValue);
                return;
            case SclPackage.DO__LNODE_TYPE:
                setLNodeType((LNodeType)newValue);
                return;
            case SclPackage.DO__REFERS_TO_DO_TYPE:
                setRefersToDOType((DOType)newValue);
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
            case SclPackage.DO__TRANSIENT:
                unsetTransient();
                return;
            case SclPackage.DO__TYPE:
                unsetType();
                return;
            case SclPackage.DO__LNODE_TYPE:
                setLNodeType((LNodeType)null);
                return;
            case SclPackage.DO__REFERS_TO_DO_TYPE:
                unsetRefersToDOType();
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
            case SclPackage.DO__TRANSIENT:
                return isSetTransient();
            case SclPackage.DO__TYPE:
                return isSetType();
            case SclPackage.DO__LNODE_TYPE:
                return getLNodeType() != null;
            case SclPackage.DO__REFERS_TO_DO_TYPE:
                return isSetRefersToDOType();
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
        result.append(" (transient: ");
        if (transientESet) result.append(transient_); else result.append("<unset>");
        result.append(", type: ");
        if (typeESet) result.append(type); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

    @Override
    protected void doResolveLinks() {
        // see Issue #13
        super.doResolveLinks();
        
        // name             The data object name as specified for example in IEC 61850-7-4
        // type             The type references the id of a DOType definition
        // accessControl    Access control definition for this DO. If it is missing then any higher-level
        //                  access control definition applies
        // transient        If set to true, it indicates that the Transient definition from IEC 61850-7-4 applies

        if( getType() == null ) return;
        DataTypeTemplates dtt = get_DataTypeTemplates();
        if( dtt == null ) return;

        // find an DOType with
        //   DOType.id      == DO.type
        SclSwitch< Boolean > s = new SclSwitch< Boolean >() {

            @Override
            public Boolean caseDOType( DOType object ) {
                return getType().equals( object.getId() );
            }

            @Override
            public Boolean defaultCase( EObject object ) {
                return false;
            }

        };

        List< DOType > res = shallowSearchObjects( dtt.getDOType(), s );
        String mess = "DOType( id = " + getType() + " ) for DO on line " + getLineNumber() + " )";
        if( res.isEmpty() ) {
            AbstractRiseClipseConsole.getConsole().error( "cannot find " + mess );
            return;
        }
        if( res.size() > 1 ) {
            AbstractRiseClipseConsole.getConsole().error( "found several " + mess );
            return;
        }
        //AbstractRiseClipseConsole.getConsole().info( "found " + mess );
        setRefersToDOType( res.get( 0 ) );
    }

} //DOImpl
