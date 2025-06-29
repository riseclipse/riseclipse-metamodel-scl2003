/*
*************************************************************************
**  Copyright (c) 2016-2025 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      https://riseclipse.github.io/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.iec61850.scl.impl;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.jdt.annotation.NonNull;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessControl;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DA;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DO;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IED;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDName;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.INamespaceGetter;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Server;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Val;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LDevice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LDeviceImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LDeviceImpl#getInst <em>Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LDeviceImpl#getLdName <em>Ld Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LDeviceImpl#getAccessControl <em>Access Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LDeviceImpl#getParentServer <em>Parent Server</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LDeviceImpl#getLN0 <em>LN0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LDeviceImpl#getLN <em>LN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LDeviceImpl#getReferredByIEDName <em>Referred By IED Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LDeviceImpl#getRefersToHigherLevelLDevice <em>Refers To Higher Level LDevice</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LDeviceImpl#getRefersToLowerLevelLDevices <em>Refers To Lower Level LDevices</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LDeviceImpl extends UnNamingImpl implements LDevice {
    /**
     * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNamespace()
     * @generated
     * @ordered
     */
    protected static final String NAMESPACE_EDEFAULT = null;

    /**
     * The default value of the '{@link #getInst() <em>Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInst()
     * @generated
     * @ordered
     */
    protected static final String INST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInst() <em>Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInst()
     * @generated
     * @ordered
     */
    protected String inst = INST_EDEFAULT;

    /**
     * This is true if the Inst attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean instESet;

    /**
     * The default value of the '{@link #getLdName() <em>Ld Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLdName()
     * @generated
     * @ordered
     */
    protected static final String LD_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLdName() <em>Ld Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLdName()
     * @generated
     * @ordered
     */
    protected String ldName = LD_NAME_EDEFAULT;

    /**
     * This is true if the Ld Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ldNameESet;

    /**
     * The cached value of the '{@link #getAccessControl() <em>Access Control</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccessControl()
     * @generated
     * @ordered
     */
    protected AccessControl accessControl;

    /**
     * This is true if the Access Control containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean accessControlESet;

    /**
     * The cached value of the '{@link #getLN0() <em>LN0</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLN0()
     * @generated
     * @ordered
     */
    protected LN0 ln0;

    /**
     * This is true if the LN0 containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ln0ESet;

    /**
     * The cached value of the '{@link #getLN() <em>LN</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLN()
     * @generated
     * @ordered
     */
    protected EList< LN > ln;

    /**
     * The cached value of the '{@link #getReferredByIEDName() <em>Referred By IED Name</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByIEDName()
     * @generated
     * @ordered
     */
    protected IEDName referredByIEDName;

    /**
     * This is true if the Referred By IED Name reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean referredByIEDNameESet;

    /**
     * The cached value of the '{@link #getRefersToHigherLevelLDevice() <em>Refers To Higher Level LDevice</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToHigherLevelLDevice()
     * @generated
     * @ordered
     */
    protected LDevice refersToHigherLevelLDevice;

    /**
     * This is true if the Refers To Higher Level LDevice reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToHigherLevelLDeviceESet;

    /**
     * The cached value of the '{@link #getRefersToLowerLevelLDevices() <em>Refers To Lower Level LDevices</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToLowerLevelLDevices()
     * @generated
     * @ordered
     */
    protected EList< LDevice > refersToLowerLevelLDevices;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LDeviceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getLDevice();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getInst() {
        return inst;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInst( String newInst ) {
        String oldInst = inst;
        inst = newInst;
        boolean oldInstESet = instESet;
        instESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.LDEVICE__INST, oldInst, inst,
                    !oldInstESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInst() {
        String oldInst = inst;
        boolean oldInstESet = instESet;
        inst = INST_EDEFAULT;
        instESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.LDEVICE__INST, oldInst, INST_EDEFAULT,
                    oldInstESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInst() {
        return instESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT because the default value must be computed
     */
    @Override
    public String getLdName() {
        // the default is the IED name concatenated with the inst
        if( isSetLdName() ) {
            return ldName;
        }
        return getParentServer().getParentAccessPoint().getParentIED().getName() + getInst();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLdName( String newLdName ) {
        String oldLdName = ldName;
        ldName = newLdName;
        boolean oldLdNameESet = ldNameESet;
        ldNameESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.LDEVICE__LD_NAME, oldLdName, ldName,
                    !oldLdNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLdName() {
        String oldLdName = ldName;
        boolean oldLdNameESet = ldNameESet;
        ldName = LD_NAME_EDEFAULT;
        ldNameESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.LDEVICE__LD_NAME, oldLdName,
                    LD_NAME_EDEFAULT, oldLdNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLdName() {
        return ldNameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AccessControl getAccessControl() {
        return accessControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAccessControl( AccessControl newAccessControl, NotificationChain msgs ) {
        AccessControl oldAccessControl = accessControl;
        accessControl = newAccessControl;
        boolean oldAccessControlESet = accessControlESet;
        accessControlESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    SclPackage.LDEVICE__ACCESS_CONTROL, oldAccessControl, newAccessControl, !oldAccessControlESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAccessControl( AccessControl newAccessControl ) {
        if( newAccessControl != accessControl ) {
            NotificationChain msgs = null;
            if( accessControl != null )
                msgs = ( ( InternalEObject ) accessControl ).eInverseRemove( this,
                        SclPackage.ACCESS_CONTROL__PARENT_LDEVICE, AccessControl.class, msgs );
            if( newAccessControl != null )
                msgs = ( ( InternalEObject ) newAccessControl ).eInverseAdd( this,
                        SclPackage.ACCESS_CONTROL__PARENT_LDEVICE, AccessControl.class, msgs );
            msgs = basicSetAccessControl( newAccessControl, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAccessControlESet = accessControlESet;
            accessControlESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.LDEVICE__ACCESS_CONTROL,
                        newAccessControl, newAccessControl, !oldAccessControlESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAccessControl( NotificationChain msgs ) {
        AccessControl oldAccessControl = accessControl;
        accessControl = null;
        boolean oldAccessControlESet = accessControlESet;
        accessControlESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    SclPackage.LDEVICE__ACCESS_CONTROL, oldAccessControl, null, oldAccessControlESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAccessControl() {
        if( accessControl != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) accessControl ).eInverseRemove( this,
                    SclPackage.ACCESS_CONTROL__PARENT_LDEVICE, AccessControl.class, msgs );
            msgs = basicUnsetAccessControl( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAccessControlESet = accessControlESet;
            accessControlESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.LDEVICE__ACCESS_CONTROL, null,
                        null, oldAccessControlESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAccessControl() {
        return accessControlESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Server getParentServer() {
        if( eContainerFeatureID() != SclPackage.LDEVICE__PARENT_SERVER ) return null;
        return ( Server ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentServer( Server newParentServer, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentServer, SclPackage.LDEVICE__PARENT_SERVER, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentServer( Server newParentServer ) {
        if( newParentServer != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.LDEVICE__PARENT_SERVER && newParentServer != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentServer ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentServer != null )
                msgs = ( ( InternalEObject ) newParentServer ).eInverseAdd( this, SclPackage.SERVER__LDEVICE,
                        Server.class, msgs );
            msgs = basicSetParentServer( newParentServer, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.LDEVICE__PARENT_SERVER, newParentServer,
                    newParentServer ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< LN > getLN() {
        if( ln == null ) {
            ln = new EObjectContainmentWithInverseEList.Unsettable< LN >( LN.class, this, SclPackage.LDEVICE__LN,
                    SclPackage.LN__PARENT_LDEVICE );
        }
        return ln;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLN() {
        if( ln != null ) ( ( InternalEList.Unsettable< ? > ) ln ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLN() {
        return ln != null && ( ( InternalEList.Unsettable< ? > ) ln ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IEDName getReferredByIEDName() {
        return referredByIEDName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetReferredByIEDName( IEDName newReferredByIEDName, NotificationChain msgs ) {
        IEDName oldReferredByIEDName = referredByIEDName;
        referredByIEDName = newReferredByIEDName;
        boolean oldReferredByIEDNameESet = referredByIEDNameESet;
        referredByIEDNameESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    SclPackage.LDEVICE__REFERRED_BY_IED_NAME, oldReferredByIEDName, newReferredByIEDName,
                    !oldReferredByIEDNameESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReferredByIEDName( IEDName newReferredByIEDName ) {
        if( newReferredByIEDName != referredByIEDName ) {
            NotificationChain msgs = null;
            if( referredByIEDName != null )
                msgs = ( ( InternalEObject ) referredByIEDName ).eInverseRemove( this,
                        SclPackage.IED_NAME__REFERS_TO_LDEVICE, IEDName.class, msgs );
            if( newReferredByIEDName != null )
                msgs = ( ( InternalEObject ) newReferredByIEDName ).eInverseAdd( this,
                        SclPackage.IED_NAME__REFERS_TO_LDEVICE, IEDName.class, msgs );
            msgs = basicSetReferredByIEDName( newReferredByIEDName, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldReferredByIEDNameESet = referredByIEDNameESet;
            referredByIEDNameESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.LDEVICE__REFERRED_BY_IED_NAME,
                        newReferredByIEDName, newReferredByIEDName, !oldReferredByIEDNameESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetReferredByIEDName( NotificationChain msgs ) {
        IEDName oldReferredByIEDName = referredByIEDName;
        referredByIEDName = null;
        boolean oldReferredByIEDNameESet = referredByIEDNameESet;
        referredByIEDNameESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    SclPackage.LDEVICE__REFERRED_BY_IED_NAME, oldReferredByIEDName, null, oldReferredByIEDNameESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByIEDName() {
        if( referredByIEDName != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) referredByIEDName ).eInverseRemove( this,
                    SclPackage.IED_NAME__REFERS_TO_LDEVICE, IEDName.class, msgs );
            msgs = basicUnsetReferredByIEDName( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldReferredByIEDNameESet = referredByIEDNameESet;
            referredByIEDNameESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.LDEVICE__REFERRED_BY_IED_NAME,
                        null, null, oldReferredByIEDNameESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByIEDName() {
        return referredByIEDNameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LDevice getRefersToHigherLevelLDevice() {
        return refersToHigherLevelLDevice;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToHigherLevelLDevice( LDevice newRefersToHigherLevelLDevice,
            NotificationChain msgs ) {
        LDevice oldRefersToHigherLevelLDevice = refersToHigherLevelLDevice;
        refersToHigherLevelLDevice = newRefersToHigherLevelLDevice;
        boolean oldRefersToHigherLevelLDeviceESet = refersToHigherLevelLDeviceESet;
        refersToHigherLevelLDeviceESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    SclPackage.LDEVICE__REFERS_TO_HIGHER_LEVEL_LDEVICE, oldRefersToHigherLevelLDevice,
                    newRefersToHigherLevelLDevice, !oldRefersToHigherLevelLDeviceESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRefersToHigherLevelLDevice( LDevice newRefersToHigherLevelLDevice ) {
        if( newRefersToHigherLevelLDevice != refersToHigherLevelLDevice ) {
            NotificationChain msgs = null;
            if( refersToHigherLevelLDevice != null )
                msgs = ( ( InternalEObject ) refersToHigherLevelLDevice ).eInverseRemove( this,
                        SclPackage.LDEVICE__REFERS_TO_LOWER_LEVEL_LDEVICES, LDevice.class, msgs );
            if( newRefersToHigherLevelLDevice != null )
                msgs = ( ( InternalEObject ) newRefersToHigherLevelLDevice ).eInverseAdd( this,
                        SclPackage.LDEVICE__REFERS_TO_LOWER_LEVEL_LDEVICES, LDevice.class, msgs );
            msgs = basicSetRefersToHigherLevelLDevice( newRefersToHigherLevelLDevice, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToHigherLevelLDeviceESet = refersToHigherLevelLDeviceESet;
            refersToHigherLevelLDeviceESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        SclPackage.LDEVICE__REFERS_TO_HIGHER_LEVEL_LDEVICE, newRefersToHigherLevelLDevice,
                        newRefersToHigherLevelLDevice, !oldRefersToHigherLevelLDeviceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToHigherLevelLDevice( NotificationChain msgs ) {
        LDevice oldRefersToHigherLevelLDevice = refersToHigherLevelLDevice;
        refersToHigherLevelLDevice = null;
        boolean oldRefersToHigherLevelLDeviceESet = refersToHigherLevelLDeviceESet;
        refersToHigherLevelLDeviceESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    SclPackage.LDEVICE__REFERS_TO_HIGHER_LEVEL_LDEVICE, oldRefersToHigherLevelLDevice, null,
                    oldRefersToHigherLevelLDeviceESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRefersToHigherLevelLDevice() {
        if( refersToHigherLevelLDevice != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToHigherLevelLDevice ).eInverseRemove( this,
                    SclPackage.LDEVICE__REFERS_TO_LOWER_LEVEL_LDEVICES, LDevice.class, msgs );
            msgs = basicUnsetRefersToHigherLevelLDevice( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToHigherLevelLDeviceESet = refersToHigherLevelLDeviceESet;
            refersToHigherLevelLDeviceESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        SclPackage.LDEVICE__REFERS_TO_HIGHER_LEVEL_LDEVICE, null, null,
                        oldRefersToHigherLevelLDeviceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToHigherLevelLDevice() {
        return refersToHigherLevelLDeviceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< LDevice > getRefersToLowerLevelLDevices() {
        if( refersToLowerLevelLDevices == null ) {
            refersToLowerLevelLDevices = new EObjectWithInverseEList.Unsettable< LDevice >( LDevice.class, this,
                    SclPackage.LDEVICE__REFERS_TO_LOWER_LEVEL_LDEVICES,
                    SclPackage.LDEVICE__REFERS_TO_HIGHER_LEVEL_LDEVICE );
        }
        return refersToLowerLevelLDevices;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRefersToLowerLevelLDevices() {
        if( refersToLowerLevelLDevices != null )
            ( ( InternalEList.Unsettable< ? > ) refersToLowerLevelLDevices ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToLowerLevelLDevices() {
        return refersToLowerLevelLDevices != null
                && ( ( InternalEList.Unsettable< ? > ) refersToLowerLevelLDevices ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public String getNamespace() {
        //@formatter:off

        // The attribute ldNs shall be a DataAttribute of the name plate NamPlt of the LOGICAL- NODE-ZERO (LLN0).
        //
        // LDevice.ldNs
        // 1.  LDevice.LN0.DOI["NamPlt"].DAI["ldNs"].value                 if present
        // 2.  LDevice.LN0.LNodeType.DO["NamPlt"].DOType.DA["ldNs"].value  if present
        // 3.  null (should not occur in a valid SCL file)                 otherwise
        
        if( getLN0() == null ) return null;
        List< DOI > namPltDoi =
                 getLN0()
                .getDOI()
                .stream()
                .filter( doi -> "NamPlt".equals( doi.getName() ) )
                .toList() ;
        if( namPltDoi.size() == 1 ) {
            List< DAI > ldNsDai =
                     namPltDoi
                    .get( 0 )
                    .getDAI()
                    .stream()
                    .filter( dai -> "ldNs".equals( dai.getName() ) )
                    .toList();
            if( ldNsDai.size() == 1 && ( ldNsDai.get( 0 ).getVal().size() == 1 )
                                    && ( ldNsDai.get( 0 ).getVal().get( 0 ).getValue() != null )
                                    && ( ldNsDai.get( 0 ).getVal().get( 0 ).getValue().length() != 0 ) ) {
                    return ldNsDai.get( 0 ).getVal().get( 0 ).getValue();
                }
            
        }

        if( getLN0().getRefersToLNodeType() == null ) return null;
        List< DO > namPltDo =
                 getLN0()
                .getRefersToLNodeType()
                .getDO()
                .stream()
                .filter( do_ -> "NamPlt".equals( do_.getName() ) )
                .toList();
        if( namPltDo.size() == 1 ) {
            if( namPltDo.get( 0 ).getRefersToDOType() == null ) return null;
            List< DA > ldNsDa =
                     namPltDo
                    .get( 0 )
                    .getRefersToDOType()
                    .getDA()
                    .stream()
                    .filter( da -> "ldNs".equals( da.getName() ))
                    .toList();
            if( ldNsDa.size() == 1 && ( ldNsDa.get( 0 ).getVal().size() == 1 )
                                   && ( ldNsDa.get( 0 ).getVal().get( 0 ).getValue() != null )
                                   && ( ldNsDa.get( 0 ).getVal().get( 0 ).getValue().length() != 0 )) {
                    return ldNsDa.get( 0 ).getVal().get( 0 ).getValue();
                }
            
        }

        return null;
        
        //@formatter:on
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LN0 getLN0() {
        return ln0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLN0( LN0 newLN0, NotificationChain msgs ) {
        LN0 oldLN0 = ln0;
        ln0 = newLN0;
        boolean oldLN0ESet = ln0ESet;
        ln0ESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, SclPackage.LDEVICE__LN0,
                    oldLN0, newLN0, !oldLN0ESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLN0( LN0 newLN0 ) {
        if( newLN0 != ln0 ) {
            NotificationChain msgs = null;
            if( ln0 != null )
                msgs = ( ( InternalEObject ) ln0 ).eInverseRemove( this, SclPackage.LN0__PARENT_LDEVICE, LN0.class,
                        msgs );
            if( newLN0 != null )
                msgs = ( ( InternalEObject ) newLN0 ).eInverseAdd( this, SclPackage.LN0__PARENT_LDEVICE, LN0.class,
                        msgs );
            msgs = basicSetLN0( newLN0, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLN0ESet = ln0ESet;
            ln0ESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.LDEVICE__LN0, newLN0, newLN0,
                        !oldLN0ESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetLN0( NotificationChain msgs ) {
        LN0 oldLN0 = ln0;
        ln0 = null;
        boolean oldLN0ESet = ln0ESet;
        ln0ESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET, SclPackage.LDEVICE__LN0,
                    oldLN0, null, oldLN0ESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLN0() {
        if( ln0 != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) ln0 ).eInverseRemove( this, SclPackage.LN0__PARENT_LDEVICE, LN0.class, msgs );
            msgs = basicUnsetLN0( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLN0ESet = ln0ESet;
            ln0ESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.LDEVICE__LN0, null, null,
                        oldLN0ESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLN0() {
        return ln0ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case SclPackage.LDEVICE__ACCESS_CONTROL:
            if( accessControl != null )
                msgs = ( ( InternalEObject ) accessControl ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - SclPackage.LDEVICE__ACCESS_CONTROL, null, msgs );
            return basicSetAccessControl( ( AccessControl ) otherEnd, msgs );
        case SclPackage.LDEVICE__PARENT_SERVER:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentServer( ( Server ) otherEnd, msgs );
        case SclPackage.LDEVICE__LN0:
            if( ln0 != null )
                msgs = ( ( InternalEObject ) ln0 ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - SclPackage.LDEVICE__LN0, null, msgs );
            return basicSetLN0( ( LN0 ) otherEnd, msgs );
        case SclPackage.LDEVICE__LN:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getLN() ).basicAdd( otherEnd, msgs );
        case SclPackage.LDEVICE__REFERRED_BY_IED_NAME:
            if( referredByIEDName != null )
                msgs = ( ( InternalEObject ) referredByIEDName ).eInverseRemove( this,
                        SclPackage.IED_NAME__REFERS_TO_LDEVICE, IEDName.class, msgs );
            return basicSetReferredByIEDName( ( IEDName ) otherEnd, msgs );
        case SclPackage.LDEVICE__REFERS_TO_HIGHER_LEVEL_LDEVICE:
            if( refersToHigherLevelLDevice != null )
                msgs = ( ( InternalEObject ) refersToHigherLevelLDevice ).eInverseRemove( this,
                        SclPackage.LDEVICE__REFERS_TO_LOWER_LEVEL_LDEVICES, LDevice.class, msgs );
            return basicSetRefersToHigherLevelLDevice( ( LDevice ) otherEnd, msgs );
        case SclPackage.LDEVICE__REFERS_TO_LOWER_LEVEL_LDEVICES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getRefersToLowerLevelLDevices() )
                    .basicAdd( otherEnd, msgs );
        }
        return super.eInverseAdd( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case SclPackage.LDEVICE__ACCESS_CONTROL:
            return basicUnsetAccessControl( msgs );
        case SclPackage.LDEVICE__PARENT_SERVER:
            return basicSetParentServer( null, msgs );
        case SclPackage.LDEVICE__LN0:
            return basicUnsetLN0( msgs );
        case SclPackage.LDEVICE__LN:
            return ( ( InternalEList< ? > ) getLN() ).basicRemove( otherEnd, msgs );
        case SclPackage.LDEVICE__REFERRED_BY_IED_NAME:
            return basicUnsetReferredByIEDName( msgs );
        case SclPackage.LDEVICE__REFERS_TO_HIGHER_LEVEL_LDEVICE:
            return basicUnsetRefersToHigherLevelLDevice( msgs );
        case SclPackage.LDEVICE__REFERS_TO_LOWER_LEVEL_LDEVICES:
            return ( ( InternalEList< ? > ) getRefersToLowerLevelLDevices() ).basicRemove( otherEnd, msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature( NotificationChain msgs ) {
        switch( eContainerFeatureID() ) {
        case SclPackage.LDEVICE__PARENT_SERVER:
            return eInternalContainer().eInverseRemove( this, SclPackage.SERVER__LDEVICE, Server.class, msgs );
        }
        return super.eBasicRemoveFromContainerFeature( msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case SclPackage.LDEVICE__NAMESPACE:
            return getNamespace();
        case SclPackage.LDEVICE__INST:
            return getInst();
        case SclPackage.LDEVICE__LD_NAME:
            return getLdName();
        case SclPackage.LDEVICE__ACCESS_CONTROL:
            return getAccessControl();
        case SclPackage.LDEVICE__PARENT_SERVER:
            return getParentServer();
        case SclPackage.LDEVICE__LN0:
            return getLN0();
        case SclPackage.LDEVICE__LN:
            return getLN();
        case SclPackage.LDEVICE__REFERRED_BY_IED_NAME:
            return getReferredByIEDName();
        case SclPackage.LDEVICE__REFERS_TO_HIGHER_LEVEL_LDEVICE:
            return getRefersToHigherLevelLDevice();
        case SclPackage.LDEVICE__REFERS_TO_LOWER_LEVEL_LDEVICES:
            return getRefersToLowerLevelLDevices();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case SclPackage.LDEVICE__INST:
            setInst( ( String ) newValue );
            return;
        case SclPackage.LDEVICE__LD_NAME:
            setLdName( ( String ) newValue );
            return;
        case SclPackage.LDEVICE__ACCESS_CONTROL:
            setAccessControl( ( AccessControl ) newValue );
            return;
        case SclPackage.LDEVICE__PARENT_SERVER:
            setParentServer( ( Server ) newValue );
            return;
        case SclPackage.LDEVICE__LN0:
            setLN0( ( LN0 ) newValue );
            return;
        case SclPackage.LDEVICE__LN:
            getLN().clear();
            getLN().addAll( ( Collection< ? extends LN > ) newValue );
            return;
        case SclPackage.LDEVICE__REFERRED_BY_IED_NAME:
            setReferredByIEDName( ( IEDName ) newValue );
            return;
        case SclPackage.LDEVICE__REFERS_TO_HIGHER_LEVEL_LDEVICE:
            setRefersToHigherLevelLDevice( ( LDevice ) newValue );
            return;
        case SclPackage.LDEVICE__REFERS_TO_LOWER_LEVEL_LDEVICES:
            getRefersToLowerLevelLDevices().clear();
            getRefersToLowerLevelLDevices().addAll( ( Collection< ? extends LDevice > ) newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch( featureID ) {
        case SclPackage.LDEVICE__INST:
            unsetInst();
            return;
        case SclPackage.LDEVICE__LD_NAME:
            unsetLdName();
            return;
        case SclPackage.LDEVICE__ACCESS_CONTROL:
            unsetAccessControl();
            return;
        case SclPackage.LDEVICE__PARENT_SERVER:
            setParentServer( ( Server ) null );
            return;
        case SclPackage.LDEVICE__LN0:
            unsetLN0();
            return;
        case SclPackage.LDEVICE__LN:
            unsetLN();
            return;
        case SclPackage.LDEVICE__REFERRED_BY_IED_NAME:
            unsetReferredByIEDName();
            return;
        case SclPackage.LDEVICE__REFERS_TO_HIGHER_LEVEL_LDEVICE:
            unsetRefersToHigherLevelLDevice();
            return;
        case SclPackage.LDEVICE__REFERS_TO_LOWER_LEVEL_LDEVICES:
            unsetRefersToLowerLevelLDevices();
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch( featureID ) {
        case SclPackage.LDEVICE__NAMESPACE:
            return NAMESPACE_EDEFAULT == null ? getNamespace() != null : !NAMESPACE_EDEFAULT.equals( getNamespace() );
        case SclPackage.LDEVICE__INST:
            return isSetInst();
        case SclPackage.LDEVICE__LD_NAME:
            return isSetLdName();
        case SclPackage.LDEVICE__ACCESS_CONTROL:
            return isSetAccessControl();
        case SclPackage.LDEVICE__PARENT_SERVER:
            return getParentServer() != null;
        case SclPackage.LDEVICE__LN0:
            return isSetLN0();
        case SclPackage.LDEVICE__LN:
            return isSetLN();
        case SclPackage.LDEVICE__REFERRED_BY_IED_NAME:
            return isSetReferredByIEDName();
        case SclPackage.LDEVICE__REFERS_TO_HIGHER_LEVEL_LDEVICE:
            return isSetRefersToHigherLevelLDevice();
        case SclPackage.LDEVICE__REFERS_TO_LOWER_LEVEL_LDEVICES:
            return isSetRefersToLowerLevelLDevices();
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID( int derivedFeatureID, Class< ? > baseClass ) {
        if( baseClass == INamespaceGetter.class ) {
            switch( derivedFeatureID ) {
            case SclPackage.LDEVICE__NAMESPACE:
                return SclPackage.INAMESPACE_GETTER__NAMESPACE;
            default:
                return -1;
            }
        }
        return super.eBaseStructuralFeatureID( derivedFeatureID, baseClass );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID( int baseFeatureID, Class< ? > baseClass ) {
        if( baseClass == INamespaceGetter.class ) {
            switch( baseFeatureID ) {
            case SclPackage.INAMESPACE_GETTER__NAMESPACE:
                return SclPackage.LDEVICE__NAMESPACE;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID( baseFeatureID, baseClass );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (inst: " );
        if( instESet )
            result.append( inst );
        else
            result.append( "<unset>" );
        result.append( ", ldName: " );
        if( ldNameESet )
            result.append( ldName );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

    @Override
    public IED getIED() {
        return getParentServer().getParentAccessPoint().getParentIED();
    }

    @Override
    protected void doBuildExplicitLinks( @NonNull IRiseClipseConsole console ) {
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(), "LDeviceImpl.doBuildExplicitLinks()" );

        //@formatter:off

        // see Issue #13
        super.doBuildExplicitLinks( console );

        // String messagePrefix = "while resolving link from LDevice: ";
        
        // TODO: warning message ?
        if( getLN0() == null ) return;
        
        // Look for DOI name="GrRef" in LN0
        List< DOI > grRef =
                 getLN0()
                .getDOI()
                .stream()
                .filter( doi -> "GrRef".equals(  doi.getName() ))
                .toList();

        if( grRef.size() > 1 ) {
            // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
            //                  messagePrefix, "found several DOI named GrRef in LN0" );
            return;
        }

        if( grRef.isEmpty() ) {
            console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                          "LDevice ", getInst(), " is a root LDevice" );
            return;
        }
        // Look for DAI name="setSrcRef" in GrRef
        // When we try to get 
        List< DAI > setSrcRef =
                 grRef
                .get( 0 )
                .getDAI()
                .stream()
                .filter( dai -> "setSrcRef".equals( dai.getName() ))
                .toList();
        
        if( setSrcRef.isEmpty() ) {
            // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
            //                  messagePrefix, "found no DAI named setSrcRef in GrRef on line ", grRef.get( 0 ).getLineNumber() );
            return;
        }
        if( setSrcRef.size() > 1 ) {
            // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
            //                  messagePrefix, "found several DAI named setSrcRef in GrRef on line ", grRef.get( 0 ).getLineNumber() );
            return;
        }
        
        EList< Val > val = setSrcRef.get( 0 ).getVal();
        if( val.isEmpty() ) {
            // We look for Val in DataTypeTemplates
            // Therefore, the link from DAI to DA must exist
            getLN0().buildExplicitLinks( console, false );
            if( setSrcRef.get( 0 ).getRefersToAbstractDataAttribute() != null ) {
                val = setSrcRef.get( 0 ).getRefersToAbstractDataAttribute().getVal();
            }
        }
        
        if( val.isEmpty() ) {
            // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
            //                  messagePrefix, "found no Val in setSrcRef on line ", setSrcRef.get( 0 ).getLineNumber() );
            return;
        }
        if( val.size() > 1 ) {
            // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
            //                  messagePrefix, "found several Val in setSrcRef on line ", setSrcRef.get( 0 ).getLineNumber() );
            return;
        }
        
        String higherLevelLDeviceReference = val.get( 0 ).getValue();;
        if(( higherLevelLDeviceReference == null ) || ( higherLevelLDeviceReference.length() <= 1 )) {
            // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
            //                  messagePrefix, "found no Val or empty Val in setSrcRef on line ", setSrcRef.get( 0 ).getLineNumber() );
            return;
        }
        
        List< LDevice > lDevices = null;

        if( higherLevelLDeviceReference.startsWith( "@" )) {
            // Must be final or effectively final
            String temp = higherLevelLDeviceReference.substring( 1 );

            // Look for LDevice in same Server with "LDevice.inst" higherLevelLDeviceName
            lDevices =
                     getParentServer()
                    .getLDevice()
                    .stream()
                    .filter( ld -> temp.equals( ld.getInst() ))
                    .toList();

        }
            
        if( lDevices == null ) {
            // Issue #63
            // Look for LDevice in same Server with "LDevice.ldName" higherLevelLDeviceName
            lDevices =
                    getParentServer()
                   .getLDevice()
                   .stream()
                   .filter( ld -> higherLevelLDeviceReference.equals( ld.getLdName() ))
                   .toList();
        }

       if( lDevices.isEmpty() ) {
           // look for "IED.name" concatenated with "LDevice.inst"
           List< IED > lIEDs = 
                    getParentServer()
                   .getParentAccessPoint()
                   .getParentIED()
                   .getParentSCL()
                   .getIED()
                   .stream()
                   .filter( ied -> higherLevelLDeviceReference.startsWith( ied.getName() ))
                   .toList();
               
           if( lIEDs.isEmpty() ) {
               // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
               //                  messagePrefix, "found no IED with name is a prefix of ", higherLevelLDeviceName );
               return;
           }
           if( lIEDs.size() > 1 ) {
               // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
               //                  messagePrefix, "found several IEDd with name is a prefix of ", higherLevelLDeviceName );
               return;
           }
           IED ied = lIEDs.get( 0 );
           String ldInst = higherLevelLDeviceReference.substring( ied.getName().length() );
           
           lDevices =
                   ied
                   .getAccessPoint()
                   .stream()
                   .flatMap( ap -> {
                       if( ap.getServer() == null ) {
                           return Stream.of();
                       }
                       return 
                               ap
                               .getServer()
                               .getLDevice()
                               .stream()
                               .filter( ld -> ldInst.equals( ld.getInst() ));
                   })
                   .toList();
        }
        
        if( lDevices.isEmpty() ) {
            // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
            //                  messagePrefix, "found no LDevice named ", higherLevelLDeviceName );
            return;
        }
        if( lDevices.size() > 1 ) {
            // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
            //                  messagePrefix, "found several LDevice ", higherLevelLDeviceName );
            return;
        }
        
        console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                      "LDevice ", getInst(), " has ", lDevices.get( 0 ).getInst(), " for higher level LDevice" );
        setRefersToHigherLevelLDevice( lDevices.get( 0 ));

        //@formatter:on
    }

    @Override
    public String getXpath() {
        return getParentServer().getXpath() + "/scl:LDevice[@inst='" + getInst() + "']";
    }

} //LDeviceImpl
