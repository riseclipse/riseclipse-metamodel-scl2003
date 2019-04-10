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

import java.util.Collection;
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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSESecurity;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IED;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.KDC;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSecurity;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Server;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ServerAt;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Services;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AccessPointImpl#getClock <em>Clock</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AccessPointImpl#getKdc <em>Kdc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AccessPointImpl#getRouter <em>Router</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AccessPointImpl#getIED <em>IED</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AccessPointImpl#getLN <em>LN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AccessPointImpl#getSMVSecurity <em>SMV Security</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AccessPointImpl#getServerAt <em>Server At</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AccessPointImpl#getServer <em>Server</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AccessPointImpl#getServices <em>Services</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AccessPointImpl#getGOOSESecurity <em>GOOSE Security</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AccessPointImpl#getReferredByServerAt <em>Referred By Server At</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AccessPointImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AccessPointImpl#getReferredByConnectedAP <em>Referred By Connected AP</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AccessPointImpl#getReferredByKDC <em>Referred By KDC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessPointImpl extends UnNamingImpl implements AccessPoint {
    /**
     * The default value of the '{@link #getClock() <em>Clock</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClock()
     * @generated
     * @ordered
     */
    protected static final Boolean CLOCK_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getClock() <em>Clock</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClock()
     * @generated
     * @ordered
     */
    protected Boolean clock = CLOCK_EDEFAULT;

    /**
     * This is true if the Clock attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean clockESet;

    /**
     * The default value of the '{@link #getKdc() <em>Kdc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKdc()
     * @generated
     * @ordered
     */
    protected static final Boolean KDC_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getKdc() <em>Kdc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKdc()
     * @generated
     * @ordered
     */
    protected Boolean kdc = KDC_EDEFAULT;

    /**
     * This is true if the Kdc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kdcESet;

    /**
     * The default value of the '{@link #getRouter() <em>Router</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRouter()
     * @generated
     * @ordered
     */
    protected static final Boolean ROUTER_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getRouter() <em>Router</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRouter()
     * @generated
     * @ordered
     */
    protected Boolean router = ROUTER_EDEFAULT;

    /**
     * This is true if the Router attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean routerESet;

    /**
     * The cached value of the '{@link #getLN() <em>LN</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLN()
     * @generated
     * @ordered
     */
    protected EList<LN> ln;

    /**
     * The cached value of the '{@link #getSMVSecurity() <em>SMV Security</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSMVSecurity()
     * @generated
     * @ordered
     */
    protected EList<SMVSecurity> smvSecurity;

    /**
     * The cached value of the '{@link #getServerAt() <em>Server At</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServerAt()
     * @generated
     * @ordered
     */
    protected ServerAt serverAt;

    /**
     * This is true if the Server At containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean serverAtESet;

    /**
     * The cached value of the '{@link #getServer() <em>Server</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServer()
     * @generated
     * @ordered
     */
    protected Server server;

    /**
     * This is true if the Server containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean serverESet;

    /**
     * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServices()
     * @generated
     * @ordered
     */
    protected Services services;

    /**
     * This is true if the Services containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean servicesESet;

    /**
     * The cached value of the '{@link #getGOOSESecurity() <em>GOOSE Security</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGOOSESecurity()
     * @generated
     * @ordered
     */
    protected EList<GOOSESecurity> gooseSecurity;

    /**
     * The cached value of the '{@link #getReferredByServerAt() <em>Referred By Server At</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByServerAt()
     * @generated
     * @ordered
     */
    protected EList<ServerAt> referredByServerAt;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * This is true if the Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nameESet;

    /**
     * The cached value of the '{@link #getReferredByConnectedAP() <em>Referred By Connected AP</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByConnectedAP()
     * @generated
     * @ordered
     */
    protected EList<ConnectedAP> referredByConnectedAP;

    /**
     * The cached value of the '{@link #getReferredByKDC() <em>Referred By KDC</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByKDC()
     * @generated
     * @ordered
     */
    protected EList<KDC> referredByKDC;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AccessPointImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getAccessPoint();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getClock() {
        return clock;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setClock( Boolean newClock ) {
        Boolean oldClock = clock;
        clock = newClock;
        boolean oldClockESet = clockESet;
        clockESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.ACCESS_POINT__CLOCK, oldClock, clock, !oldClockESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetClock() {
        Boolean oldClock = clock;
        boolean oldClockESet = clockESet;
        clock = CLOCK_EDEFAULT;
        clockESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.ACCESS_POINT__CLOCK, oldClock, CLOCK_EDEFAULT, oldClockESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetClock() {
        return clockESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getKdc() {
        return kdc;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKdc( Boolean newKdc ) {
        Boolean oldKdc = kdc;
        kdc = newKdc;
        boolean oldKdcESet = kdcESet;
        kdcESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.ACCESS_POINT__KDC, oldKdc, kdc, !oldKdcESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKdc() {
        Boolean oldKdc = kdc;
        boolean oldKdcESet = kdcESet;
        kdc = KDC_EDEFAULT;
        kdcESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.ACCESS_POINT__KDC, oldKdc, KDC_EDEFAULT, oldKdcESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKdc() {
        return kdcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getRouter() {
        return router;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRouter( Boolean newRouter ) {
        Boolean oldRouter = router;
        router = newRouter;
        boolean oldRouterESet = routerESet;
        routerESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.ACCESS_POINT__ROUTER, oldRouter, router, !oldRouterESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRouter() {
        Boolean oldRouter = router;
        boolean oldRouterESet = routerESet;
        router = ROUTER_EDEFAULT;
        routerESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.ACCESS_POINT__ROUTER, oldRouter, ROUTER_EDEFAULT, oldRouterESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRouter() {
        return routerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IED getIED() {
        if (eContainerFeatureID() != SclPackage.ACCESS_POINT__IED) return null;
        return (IED)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetIED( IED newIED, NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newIED, SclPackage.ACCESS_POINT__IED, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIED( IED newIED ) {
        if (newIED != eInternalContainer() || (eContainerFeatureID() != SclPackage.ACCESS_POINT__IED && newIED != null)) {
            if (EcoreUtil.isAncestor(this, newIED))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newIED != null)
                msgs = ((InternalEObject)newIED).eInverseAdd(this, SclPackage.IED__ACCESS_POINT, IED.class, msgs);
            msgs = basicSetIED(newIED, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.ACCESS_POINT__IED, newIED, newIED));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<LN> getLN() {
        if (ln == null) {
            ln = new EObjectContainmentWithInverseEList.Unsettable<LN>(LN.class, this, SclPackage.ACCESS_POINT__LN, SclPackage.LN__ACCESS_POINT);
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
        if (ln != null) ((InternalEList.Unsettable<?>)ln).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLN() {
        return ln != null && ((InternalEList.Unsettable<?>)ln).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<SMVSecurity> getSMVSecurity() {
        if (smvSecurity == null) {
            smvSecurity = new EObjectContainmentWithInverseEList.Unsettable<SMVSecurity>(SMVSecurity.class, this, SclPackage.ACCESS_POINT__SMV_SECURITY, SclPackage.SMV_SECURITY__ACCESS_POINT);
        }
        return smvSecurity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSMVSecurity() {
        if (smvSecurity != null) ((InternalEList.Unsettable<?>)smvSecurity).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSMVSecurity() {
        return smvSecurity != null && ((InternalEList.Unsettable<?>)smvSecurity).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServerAt getServerAt() {
        return serverAt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetServerAt( ServerAt newServerAt, NotificationChain msgs ) {
        ServerAt oldServerAt = serverAt;
        serverAt = newServerAt;
        boolean oldServerAtESet = serverAtESet;
        serverAtESet = true;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.ACCESS_POINT__SERVER_AT, oldServerAt, newServerAt, !oldServerAtESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setServerAt( ServerAt newServerAt ) {
        if (newServerAt != serverAt) {
            NotificationChain msgs = null;
            if (serverAt != null)
                msgs = ((InternalEObject)serverAt).eInverseRemove(this, SclPackage.SERVER_AT__ACCESS_POINT, ServerAt.class, msgs);
            if (newServerAt != null)
                msgs = ((InternalEObject)newServerAt).eInverseAdd(this, SclPackage.SERVER_AT__ACCESS_POINT, ServerAt.class, msgs);
            msgs = basicSetServerAt(newServerAt, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldServerAtESet = serverAtESet;
            serverAtESet = true;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.ACCESS_POINT__SERVER_AT, newServerAt, newServerAt, !oldServerAtESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetServerAt( NotificationChain msgs ) {
        ServerAt oldServerAt = serverAt;
        serverAt = null;
        boolean oldServerAtESet = serverAtESet;
        serverAtESet = false;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.ACCESS_POINT__SERVER_AT, oldServerAt, null, oldServerAtESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetServerAt() {
        if (serverAt != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)serverAt).eInverseRemove(this, SclPackage.SERVER_AT__ACCESS_POINT, ServerAt.class, msgs);
            msgs = basicUnsetServerAt(msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldServerAtESet = serverAtESet;
            serverAtESet = false;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.ACCESS_POINT__SERVER_AT, null, null, oldServerAtESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetServerAt() {
        return serverAtESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Server getServer() {
        return server;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetServer( Server newServer, NotificationChain msgs ) {
        Server oldServer = server;
        server = newServer;
        boolean oldServerESet = serverESet;
        serverESet = true;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.ACCESS_POINT__SERVER, oldServer, newServer, !oldServerESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setServer( Server newServer ) {
        if (newServer != server) {
            NotificationChain msgs = null;
            if (server != null)
                msgs = ((InternalEObject)server).eInverseRemove(this, SclPackage.SERVER__ACCESS_POINT, Server.class, msgs);
            if (newServer != null)
                msgs = ((InternalEObject)newServer).eInverseAdd(this, SclPackage.SERVER__ACCESS_POINT, Server.class, msgs);
            msgs = basicSetServer(newServer, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldServerESet = serverESet;
            serverESet = true;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.ACCESS_POINT__SERVER, newServer, newServer, !oldServerESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetServer( NotificationChain msgs ) {
        Server oldServer = server;
        server = null;
        boolean oldServerESet = serverESet;
        serverESet = false;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.ACCESS_POINT__SERVER, oldServer, null, oldServerESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetServer() {
        if (server != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)server).eInverseRemove(this, SclPackage.SERVER__ACCESS_POINT, Server.class, msgs);
            msgs = basicUnsetServer(msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldServerESet = serverESet;
            serverESet = false;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.ACCESS_POINT__SERVER, null, null, oldServerESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetServer() {
        return serverESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Services getServices() {
        return services;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetServices( Services newServices, NotificationChain msgs ) {
        Services oldServices = services;
        services = newServices;
        boolean oldServicesESet = servicesESet;
        servicesESet = true;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.ACCESS_POINT__SERVICES, oldServices, newServices, !oldServicesESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setServices( Services newServices ) {
        if (newServices != services) {
            NotificationChain msgs = null;
            if (services != null)
                msgs = ((InternalEObject)services).eInverseRemove(this, SclPackage.SERVICES__ACCESS_POINT, Services.class, msgs);
            if (newServices != null)
                msgs = ((InternalEObject)newServices).eInverseAdd(this, SclPackage.SERVICES__ACCESS_POINT, Services.class, msgs);
            msgs = basicSetServices(newServices, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldServicesESet = servicesESet;
            servicesESet = true;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.ACCESS_POINT__SERVICES, newServices, newServices, !oldServicesESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetServices( NotificationChain msgs ) {
        Services oldServices = services;
        services = null;
        boolean oldServicesESet = servicesESet;
        servicesESet = false;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.ACCESS_POINT__SERVICES, oldServices, null, oldServicesESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetServices() {
        if (services != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)services).eInverseRemove(this, SclPackage.SERVICES__ACCESS_POINT, Services.class, msgs);
            msgs = basicUnsetServices(msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldServicesESet = servicesESet;
            servicesESet = false;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.ACCESS_POINT__SERVICES, null, null, oldServicesESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetServices() {
        return servicesESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<GOOSESecurity> getGOOSESecurity() {
        if (gooseSecurity == null) {
            gooseSecurity = new EObjectContainmentWithInverseEList.Unsettable<GOOSESecurity>(GOOSESecurity.class, this, SclPackage.ACCESS_POINT__GOOSE_SECURITY, SclPackage.GOOSE_SECURITY__ACCESS_POINT);
        }
        return gooseSecurity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGOOSESecurity() {
        if (gooseSecurity != null) ((InternalEList.Unsettable<?>)gooseSecurity).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGOOSESecurity() {
        return gooseSecurity != null && ((InternalEList.Unsettable<?>)gooseSecurity).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ServerAt> getReferredByServerAt() {
        if (referredByServerAt == null) {
            referredByServerAt = new EObjectWithInverseEList.Unsettable<ServerAt>(ServerAt.class, this, SclPackage.ACCESS_POINT__REFERRED_BY_SERVER_AT, SclPackage.SERVER_AT__REFERS_TO_ACCESS_POINT);
        }
        return referredByServerAt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByServerAt() {
        if (referredByServerAt != null) ((InternalEList.Unsettable<?>)referredByServerAt).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByServerAt() {
        return referredByServerAt != null && ((InternalEList.Unsettable<?>)referredByServerAt).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        boolean oldNameESet = nameESet;
        nameESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.ACCESS_POINT__NAME, oldName, name, !oldNameESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetName() {
        String oldName = name;
        boolean oldNameESet = nameESet;
        name = NAME_EDEFAULT;
        nameESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.ACCESS_POINT__NAME, oldName, NAME_EDEFAULT, oldNameESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetName() {
        return nameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ConnectedAP> getReferredByConnectedAP() {
        if (referredByConnectedAP == null) {
            referredByConnectedAP = new EObjectWithInverseEList.Unsettable<ConnectedAP>(ConnectedAP.class, this, SclPackage.ACCESS_POINT__REFERRED_BY_CONNECTED_AP, SclPackage.CONNECTED_AP__REFERS_TO_ACCESS_POINT);
        }
        return referredByConnectedAP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByConnectedAP() {
        if (referredByConnectedAP != null) ((InternalEList.Unsettable<?>)referredByConnectedAP).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByConnectedAP() {
        return referredByConnectedAP != null && ((InternalEList.Unsettable<?>)referredByConnectedAP).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<KDC> getReferredByKDC() {
        if (referredByKDC == null) {
            referredByKDC = new EObjectWithInverseEList.Unsettable<KDC>(KDC.class, this, SclPackage.ACCESS_POINT__REFERRED_BY_KDC, SclPackage.KDC__REFERS_TO_ACCESS_POINT);
        }
        return referredByKDC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByKDC() {
        if (referredByKDC != null) ((InternalEList.Unsettable<?>)referredByKDC).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByKDC() {
        return referredByKDC != null && ((InternalEList.Unsettable<?>)referredByKDC).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
            case SclPackage.ACCESS_POINT__IED:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetIED((IED)otherEnd, msgs);
            case SclPackage.ACCESS_POINT__LN:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getLN()).basicAdd(otherEnd, msgs);
            case SclPackage.ACCESS_POINT__SMV_SECURITY:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSMVSecurity()).basicAdd(otherEnd, msgs);
            case SclPackage.ACCESS_POINT__SERVER_AT:
                if (serverAt != null)
                    msgs = ((InternalEObject)serverAt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.ACCESS_POINT__SERVER_AT, null, msgs);
                return basicSetServerAt((ServerAt)otherEnd, msgs);
            case SclPackage.ACCESS_POINT__SERVER:
                if (server != null)
                    msgs = ((InternalEObject)server).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.ACCESS_POINT__SERVER, null, msgs);
                return basicSetServer((Server)otherEnd, msgs);
            case SclPackage.ACCESS_POINT__SERVICES:
                if (services != null)
                    msgs = ((InternalEObject)services).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.ACCESS_POINT__SERVICES, null, msgs);
                return basicSetServices((Services)otherEnd, msgs);
            case SclPackage.ACCESS_POINT__GOOSE_SECURITY:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getGOOSESecurity()).basicAdd(otherEnd, msgs);
            case SclPackage.ACCESS_POINT__REFERRED_BY_SERVER_AT:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferredByServerAt()).basicAdd(otherEnd, msgs);
            case SclPackage.ACCESS_POINT__REFERRED_BY_CONNECTED_AP:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferredByConnectedAP()).basicAdd(otherEnd, msgs);
            case SclPackage.ACCESS_POINT__REFERRED_BY_KDC:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferredByKDC()).basicAdd(otherEnd, msgs);
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
            case SclPackage.ACCESS_POINT__IED:
                return basicSetIED(null, msgs);
            case SclPackage.ACCESS_POINT__LN:
                return ((InternalEList<?>)getLN()).basicRemove(otherEnd, msgs);
            case SclPackage.ACCESS_POINT__SMV_SECURITY:
                return ((InternalEList<?>)getSMVSecurity()).basicRemove(otherEnd, msgs);
            case SclPackage.ACCESS_POINT__SERVER_AT:
                return basicUnsetServerAt(msgs);
            case SclPackage.ACCESS_POINT__SERVER:
                return basicUnsetServer(msgs);
            case SclPackage.ACCESS_POINT__SERVICES:
                return basicUnsetServices(msgs);
            case SclPackage.ACCESS_POINT__GOOSE_SECURITY:
                return ((InternalEList<?>)getGOOSESecurity()).basicRemove(otherEnd, msgs);
            case SclPackage.ACCESS_POINT__REFERRED_BY_SERVER_AT:
                return ((InternalEList<?>)getReferredByServerAt()).basicRemove(otherEnd, msgs);
            case SclPackage.ACCESS_POINT__REFERRED_BY_CONNECTED_AP:
                return ((InternalEList<?>)getReferredByConnectedAP()).basicRemove(otherEnd, msgs);
            case SclPackage.ACCESS_POINT__REFERRED_BY_KDC:
                return ((InternalEList<?>)getReferredByKDC()).basicRemove(otherEnd, msgs);
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
            case SclPackage.ACCESS_POINT__IED:
                return eInternalContainer().eInverseRemove(this, SclPackage.IED__ACCESS_POINT, IED.class, msgs);
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
            case SclPackage.ACCESS_POINT__CLOCK:
                return getClock();
            case SclPackage.ACCESS_POINT__KDC:
                return getKdc();
            case SclPackage.ACCESS_POINT__ROUTER:
                return getRouter();
            case SclPackage.ACCESS_POINT__IED:
                return getIED();
            case SclPackage.ACCESS_POINT__LN:
                return getLN();
            case SclPackage.ACCESS_POINT__SMV_SECURITY:
                return getSMVSecurity();
            case SclPackage.ACCESS_POINT__SERVER_AT:
                return getServerAt();
            case SclPackage.ACCESS_POINT__SERVER:
                return getServer();
            case SclPackage.ACCESS_POINT__SERVICES:
                return getServices();
            case SclPackage.ACCESS_POINT__GOOSE_SECURITY:
                return getGOOSESecurity();
            case SclPackage.ACCESS_POINT__REFERRED_BY_SERVER_AT:
                return getReferredByServerAt();
            case SclPackage.ACCESS_POINT__NAME:
                return getName();
            case SclPackage.ACCESS_POINT__REFERRED_BY_CONNECTED_AP:
                return getReferredByConnectedAP();
            case SclPackage.ACCESS_POINT__REFERRED_BY_KDC:
                return getReferredByKDC();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch (featureID) {
            case SclPackage.ACCESS_POINT__CLOCK:
                setClock((Boolean)newValue);
                return;
            case SclPackage.ACCESS_POINT__KDC:
                setKdc((Boolean)newValue);
                return;
            case SclPackage.ACCESS_POINT__ROUTER:
                setRouter((Boolean)newValue);
                return;
            case SclPackage.ACCESS_POINT__IED:
                setIED((IED)newValue);
                return;
            case SclPackage.ACCESS_POINT__LN:
                getLN().clear();
                getLN().addAll((Collection<? extends LN>)newValue);
                return;
            case SclPackage.ACCESS_POINT__SMV_SECURITY:
                getSMVSecurity().clear();
                getSMVSecurity().addAll((Collection<? extends SMVSecurity>)newValue);
                return;
            case SclPackage.ACCESS_POINT__SERVER_AT:
                setServerAt((ServerAt)newValue);
                return;
            case SclPackage.ACCESS_POINT__SERVER:
                setServer((Server)newValue);
                return;
            case SclPackage.ACCESS_POINT__SERVICES:
                setServices((Services)newValue);
                return;
            case SclPackage.ACCESS_POINT__GOOSE_SECURITY:
                getGOOSESecurity().clear();
                getGOOSESecurity().addAll((Collection<? extends GOOSESecurity>)newValue);
                return;
            case SclPackage.ACCESS_POINT__REFERRED_BY_SERVER_AT:
                getReferredByServerAt().clear();
                getReferredByServerAt().addAll((Collection<? extends ServerAt>)newValue);
                return;
            case SclPackage.ACCESS_POINT__NAME:
                setName((String)newValue);
                return;
            case SclPackage.ACCESS_POINT__REFERRED_BY_CONNECTED_AP:
                getReferredByConnectedAP().clear();
                getReferredByConnectedAP().addAll((Collection<? extends ConnectedAP>)newValue);
                return;
            case SclPackage.ACCESS_POINT__REFERRED_BY_KDC:
                getReferredByKDC().clear();
                getReferredByKDC().addAll((Collection<? extends KDC>)newValue);
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
            case SclPackage.ACCESS_POINT__CLOCK:
                unsetClock();
                return;
            case SclPackage.ACCESS_POINT__KDC:
                unsetKdc();
                return;
            case SclPackage.ACCESS_POINT__ROUTER:
                unsetRouter();
                return;
            case SclPackage.ACCESS_POINT__IED:
                setIED((IED)null);
                return;
            case SclPackage.ACCESS_POINT__LN:
                unsetLN();
                return;
            case SclPackage.ACCESS_POINT__SMV_SECURITY:
                unsetSMVSecurity();
                return;
            case SclPackage.ACCESS_POINT__SERVER_AT:
                unsetServerAt();
                return;
            case SclPackage.ACCESS_POINT__SERVER:
                unsetServer();
                return;
            case SclPackage.ACCESS_POINT__SERVICES:
                unsetServices();
                return;
            case SclPackage.ACCESS_POINT__GOOSE_SECURITY:
                unsetGOOSESecurity();
                return;
            case SclPackage.ACCESS_POINT__REFERRED_BY_SERVER_AT:
                unsetReferredByServerAt();
                return;
            case SclPackage.ACCESS_POINT__NAME:
                unsetName();
                return;
            case SclPackage.ACCESS_POINT__REFERRED_BY_CONNECTED_AP:
                unsetReferredByConnectedAP();
                return;
            case SclPackage.ACCESS_POINT__REFERRED_BY_KDC:
                unsetReferredByKDC();
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
            case SclPackage.ACCESS_POINT__CLOCK:
                return isSetClock();
            case SclPackage.ACCESS_POINT__KDC:
                return isSetKdc();
            case SclPackage.ACCESS_POINT__ROUTER:
                return isSetRouter();
            case SclPackage.ACCESS_POINT__IED:
                return getIED() != null;
            case SclPackage.ACCESS_POINT__LN:
                return isSetLN();
            case SclPackage.ACCESS_POINT__SMV_SECURITY:
                return isSetSMVSecurity();
            case SclPackage.ACCESS_POINT__SERVER_AT:
                return isSetServerAt();
            case SclPackage.ACCESS_POINT__SERVER:
                return isSetServer();
            case SclPackage.ACCESS_POINT__SERVICES:
                return isSetServices();
            case SclPackage.ACCESS_POINT__GOOSE_SECURITY:
                return isSetGOOSESecurity();
            case SclPackage.ACCESS_POINT__REFERRED_BY_SERVER_AT:
                return isSetReferredByServerAt();
            case SclPackage.ACCESS_POINT__NAME:
                return isSetName();
            case SclPackage.ACCESS_POINT__REFERRED_BY_CONNECTED_AP:
                return isSetReferredByConnectedAP();
            case SclPackage.ACCESS_POINT__REFERRED_BY_KDC:
                return isSetReferredByKDC();
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
        result.append(" (clock: ");
        if (clockESet) result.append(clock); else result.append("<unset>");
        result.append(", kdc: ");
        if (kdcESet) result.append(kdc); else result.append("<unset>");
        result.append(", router: ");
        if (routerESet) result.append(router); else result.append("<unset>");
        result.append(", name: ");
        if (nameESet) result.append(name); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //AccessPointImpl
