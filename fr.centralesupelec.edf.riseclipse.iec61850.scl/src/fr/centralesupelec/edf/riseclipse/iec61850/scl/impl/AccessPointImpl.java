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

import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.collection.CollectionIsEmptyOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.numeric.NumericPlusOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringConcatOperation;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.pivot.values.TupleValue;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Authentication;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSESecurity;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IED;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.KDC;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSecurity;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Server;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ServerAt;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Services;
import java.lang.reflect.InvocationTargetException;

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
    protected static final Boolean CLOCK_EDEFAULT = null;

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
    protected static final Boolean KDC_EDEFAULT = null;

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
    protected static final Boolean ROUTER_EDEFAULT = null;

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
		return SclPackage.Literals.ACCESS_POINT;
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public Boolean getClock() {
        if( isSetClock() ) {
            return clock;
        }
        return false;
    }

    /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
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
    public boolean isSetClock() {
		return clockESet;
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public Boolean getKdc() {
        if( isSetKdc() ) {
            return kdc;
        }
        return false;
    }

    /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
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
    public boolean isSetKdc() {
		return kdcESet;
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public Boolean getRouter() {
        if( isSetRouter() ) {
            return router;
        }
        return false;
    }

    /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
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
    public boolean isSetRouter() {
		return routerESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
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
    public void unsetLN() {
		if (ln != null) ((InternalEList.Unsettable<?>)ln).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetLN() {
		return ln != null && ((InternalEList.Unsettable<?>)ln).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
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
    public void unsetSMVSecurity() {
		if (smvSecurity != null) ((InternalEList.Unsettable<?>)smvSecurity).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetSMVSecurity() {
		return smvSecurity != null && ((InternalEList.Unsettable<?>)smvSecurity).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
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
    public boolean isSetServerAt() {
		return serverAtESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
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
    public boolean isSetServer() {
		return serverESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
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
    public boolean isSetServices() {
		return servicesESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
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
    public void unsetGOOSESecurity() {
		if (gooseSecurity != null) ((InternalEList.Unsettable<?>)gooseSecurity).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetGOOSESecurity() {
		return gooseSecurity != null && ((InternalEList.Unsettable<?>)gooseSecurity).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
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
    public void unsetReferredByServerAt() {
		if (referredByServerAt != null) ((InternalEList.Unsettable<?>)referredByServerAt).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetReferredByServerAt() {
		return referredByServerAt != null && ((InternalEList.Unsettable<?>)referredByServerAt).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getName() {
		return name;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
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
    public boolean isSetName() {
		return nameESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
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
    public void unsetReferredByConnectedAP() {
		if (referredByConnectedAP != null) ((InternalEList.Unsettable<?>)referredByConnectedAP).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetReferredByConnectedAP() {
		return referredByConnectedAP != null && ((InternalEList.Unsettable<?>)referredByConnectedAP).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
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
    public void unsetReferredByKDC() {
		if (referredByKDC != null) ((InternalEList.Unsettable<?>)referredByKDC).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetReferredByKDC() {
		return referredByKDC != null && ((InternalEList.Unsettable<?>)referredByKDC).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessPoint_name_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv AccessPoint_name_required:
		 *   let
		 *     severity : Integer[1] = 'AccessPoint::AccessPoint_name_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[1] = self.name <> null
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'name attribute shall be present in AccessPoint (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'AccessPoint::AccessPoint_name_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_AccessPoint_c_c_AccessPoint_name_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ String name = this.getName();
			final /*@NonInvalid*/ boolean status = name != null;
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_name_32_attribute_32_shall_32_be_32_present_32_in_32_AccessPoint_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_AccessPoint_c_c_AccessPoint_name_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessPoint_name_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv AccessPoint_name_valid:
		 *   let
		 *     severity : Integer[1] = 'AccessPoint::AccessPoint_name_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.name <> null implies
		 *           self.validSclAccessPointName(name)
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'name attribute shall be valid in AccessPoint (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.name.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'AccessPoint::AccessPoint_name_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_AccessPoint_c_c_AccessPoint_name_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String name = this.getName();
				final /*@NonInvalid*/ boolean ne = name != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean validSclAccessPointName = ((SclObject)this).validSclAccessPointName(name);
					status = validSclAccessPointName;
				}
				else {
					status = ValueUtil.TRUE_VALUE;
				}
				/*@Thrown*/ Object symbol_1;
				if (status) {
					symbol_1 = ValueUtil.TRUE_VALUE;
				}
				else {
					final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
					final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
					final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_name_32_attribute_32_shall_32_be_32_valid_32_in_32_AccessPoint_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(name);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_AccessPoint_c_c_AccessPoint_name_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessPoint_restriction_on_content(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv AccessPoint_restriction_on_content:
		 *   let
		 *     severity : Integer[1] = 'AccessPoint::AccessPoint_restriction_on_content'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let
		 *           status : Boolean[1] = let
		 *             serverPresent : Integer[1] = if self.Server = null
		 *             then 0
		 *             else 1
		 *             endif
		 *           in
		 *             let
		 *               serverAtPresent : Integer[1] = if self.ServerAt = null
		 *               then 0
		 *               else 1
		 *               endif
		 *             in
		 *               let
		 *                 lnPresent : Integer[1] = if self.LN->size() = 0
		 *                 then 0
		 *                 else 1
		 *                 endif
		 *               in serverPresent + serverAtPresent + lnPresent <= 1
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'AccessPoint shall contain one Server xor one ServerAt xor at least one LN xor none ' + 'of them (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'AccessPoint::AccessPoint_restriction_on_content'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_AccessPoint_c_c_AccessPoint_restriction_on_content);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ Server Server = this.getServer();
			final /*@NonInvalid*/ boolean eq = Server == null;
			/*@NonInvalid*/ IntegerValue serverPresent;
			if (eq) {
				serverPresent = SclTables.INT_0;
			}
			else {
				serverPresent = SclTables.INT_1;
			}
			final /*@NonInvalid*/ ServerAt ServerAt = this.getServerAt();
			final /*@NonInvalid*/ boolean eq_0 = ServerAt == null;
			/*@NonInvalid*/ IntegerValue serverAtPresent;
			if (eq_0) {
				serverAtPresent = SclTables.INT_0;
			}
			else {
				serverAtPresent = SclTables.INT_1;
			}
			final /*@NonInvalid*/ List<LN> LN = this.getLN();
			final /*@NonInvalid*/ SetValue BOXED_LN = idResolver.createSetOfAll(SclTables.SET_CLSSid_LN, LN);
			final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_LN);
			final /*@NonInvalid*/ boolean eq_1 = size.equals(SclTables.INT_0);
			/*@NonInvalid*/ IntegerValue lnPresent;
			if (eq_1) {
				lnPresent = SclTables.INT_0;
			}
			else {
				lnPresent = SclTables.INT_1;
			}
			final /*@NonInvalid*/ IntegerValue sum = (IntegerValue)NumericPlusOperation.INSTANCE.evaluate(serverPresent, serverAtPresent);
			final /*@NonInvalid*/ IntegerValue sum_0 = (IntegerValue)NumericPlusOperation.INSTANCE.evaluate(sum, lnPresent);
			final /*@NonInvalid*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, sum_0, SclTables.INT_1).booleanValue();
			/*@NonInvalid*/ Object symbol_1;
			if (le_0) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_AccessPoint_32_shall_32_contain_32_one_32_Server_32_xor_32_one_32_ServerAt_32_xor_32_at_32_lea, SclTables.STR_of_32_them_32_o_line_32);
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString);
				final /*@NonInvalid*/ String sum_3 = StringConcatOperation.INSTANCE.evaluate(sum_2, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_3, le_0);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_AccessPoint_c_c_AccessPoint_restriction_on_content, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessPoint_at_most_securities(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv AccessPoint_at_most_securities:
		 *   let
		 *     severity : Integer[1] = 'AccessPoint::AccessPoint_at_most_securities'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let
		 *           status : Boolean[?] = self.GOOSESecurity->size() <= 7 and
		 *           self.SMVSecurity->size() <= 7
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'AccessPoint shall contain at most 7 GOOSESecurity and at most 7 SMVSecurity (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'AccessPoint::AccessPoint_at_most_securities'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_AccessPoint_c_c_AccessPoint_at_most_securities);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ List<GOOSESecurity> GOOSESecurity = this.getGOOSESecurity();
			final /*@NonInvalid*/ SetValue BOXED_GOOSESecurity = idResolver.createSetOfAll(SclTables.SET_CLSSid_GOOSESecurity, GOOSESecurity);
			final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_GOOSESecurity);
			final /*@NonInvalid*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, size, SclTables.INT_7).booleanValue();
			/*@NonInvalid*/ boolean status;
			if (le_0) {
				final /*@NonInvalid*/ List<SMVSecurity> SMVSecurity = this.getSMVSecurity();
				final /*@NonInvalid*/ SetValue BOXED_SMVSecurity = idResolver.createSetOfAll(SclTables.SET_CLSSid_SMVSecurity, SMVSecurity);
				final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE.evaluate(BOXED_SMVSecurity);
				final /*@NonInvalid*/ boolean le_1 = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, size_0, SclTables.INT_7).booleanValue();
				status = le_1;
			}
			else {
				status = ValueUtil.FALSE_VALUE;
			}
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_AccessPoint_32_shall_32_contain_32_at_32_most_32_7_32_GOOSESecurity_32_and_32_at_32_most_32_7_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_AccessPoint_c_c_AccessPoint_at_most_securities, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessPoint_securities_allowed(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv AccessPoint_securities_allowed:
		 *   let
		 *     severity : Integer[1] = 'AccessPoint::AccessPoint_securities_allowed'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let
		 *           status : Boolean[?] = if
		 *             self.GOOSESecurity->isEmpty() and
		 *             self.SMVSecurity->isEmpty()
		 *           then true
		 *           else
		 *             if self.Server = null
		 *             then false
		 *             else
		 *               if self.Server.Authentication = null
		 *               then false
		 *               else self.Server.Authentication.certificate
		 *               endif
		 *             endif
		 *           endif
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'AccessPoint shall contain GOOSESecurity or SMVSecurity only if if the attribute certificate ' + 'of the server\u2019s Authentication element is true (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'AccessPoint::AccessPoint_securities_allowed'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_AccessPoint_c_c_AccessPoint_securities_allowed);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_5;
		if (le) {
			symbol_5 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_4;
			try {
				final /*@NonInvalid*/ List<GOOSESecurity> GOOSESecurity = this.getGOOSESecurity();
				final /*@NonInvalid*/ SetValue BOXED_GOOSESecurity = idResolver.createSetOfAll(SclTables.SET_CLSSid_GOOSESecurity, GOOSESecurity);
				final /*@NonInvalid*/ boolean isEmpty = CollectionIsEmptyOperation.INSTANCE.evaluate(BOXED_GOOSESecurity).booleanValue();
				/*@NonInvalid*/ boolean and;
				if (isEmpty) {
					final /*@NonInvalid*/ List<SMVSecurity> SMVSecurity = this.getSMVSecurity();
					final /*@NonInvalid*/ SetValue BOXED_SMVSecurity = idResolver.createSetOfAll(SclTables.SET_CLSSid_SMVSecurity, SMVSecurity);
					final /*@NonInvalid*/ boolean isEmpty_0 = CollectionIsEmptyOperation.INSTANCE.evaluate(BOXED_SMVSecurity).booleanValue();
					and = isEmpty_0;
				}
				else {
					and = ValueUtil.FALSE_VALUE;
				}
				/*@Thrown*/ Boolean status;
				if (and) {
					status = ValueUtil.TRUE_VALUE;
				}
				else {
					final /*@NonInvalid*/ Server Server = this.getServer();
					final /*@NonInvalid*/ boolean eq = Server == null;
					/*@Thrown*/ Boolean symbol_1;
					if (eq) {
						symbol_1 = ValueUtil.FALSE_VALUE;
					}
					else {
						if (Server == null) {
							throw new InvalidValueException("Null source for \'\'http://www.iec.ch/61850/2003/SCL\'::Server::Authentication\'");
						}
						final /*@Thrown*/ Authentication Authentication = Server.getAuthentication();
						final /*@Thrown*/ boolean eq_0 = Authentication == null;
						/*@Thrown*/ Boolean symbol_0;
						if (eq_0) {
							symbol_0 = ValueUtil.FALSE_VALUE;
						}
						else {
							if (Authentication == null) {
								throw new InvalidValueException("Null source for \'\'http://www.iec.ch/61850/2003/SCL\'::Authentication::certificate\'");
							}
							final /*@Thrown*/ Boolean certificate = Authentication.getCertificate();
							symbol_0 = certificate;
						}
						symbol_1 = symbol_0;
					}
					status = symbol_1;
				}
				final /*@Thrown*/ boolean symbol_2 = status == Boolean.TRUE;
				/*@Thrown*/ Object symbol_4;
				if (symbol_2) {
					symbol_4 = ValueUtil.TRUE_VALUE;
				}
				else {
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_AccessPoint_32_shall_32_contain_32_GOOSESecurity_32_or_32_SMVSecurity_32_only_32_if_32_i, SclTables.STR_of_32_the_32_server_8217_s_32_Authentication_32_element_32_is_32_true_32_o_line_32);
					final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
					final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
					final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, toString);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR__e);
					final /*@Thrown*/ TupleValue symbol_3 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_1, status);
					symbol_4 = symbol_3;
				}
				CAUGHT_symbol_4 = symbol_4;
			}
			catch (Exception e) {
				CAUGHT_symbol_4 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_AccessPoint_c_c_AccessPoint_securities_allowed, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_4, SclTables.INT_0).booleanValue();
			symbol_5 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_5;
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SclPackage.ACCESS_POINT___VALIDATE_ACCESS_POINT_NAME_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateAccessPoint_name_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.ACCESS_POINT___VALIDATE_ACCESS_POINT_NAME_VALID__DIAGNOSTICCHAIN_MAP:
				return validateAccessPoint_name_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.ACCESS_POINT___VALIDATE_ACCESS_POINT_RESTRICTION_ON_CONTENT__DIAGNOSTICCHAIN_MAP:
				return validateAccessPoint_restriction_on_content((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.ACCESS_POINT___VALIDATE_ACCESS_POINT_AT_MOST_SECURITIES__DIAGNOSTICCHAIN_MAP:
				return validateAccessPoint_at_most_securities((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.ACCESS_POINT___VALIDATE_ACCESS_POINT_SECURITIES_ALLOWED__DIAGNOSTICCHAIN_MAP:
				return validateAccessPoint_securities_allowed((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
