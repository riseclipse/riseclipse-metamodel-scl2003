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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Address;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GSE;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IED;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.PhysConn;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SMV;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SubNetwork;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclSwitch;
import fr.centralesupelec.edf.riseclipse.util.AbstractRiseClipseConsole;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringConcatOperation;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.pivot.values.TupleValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connected AP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConnectedAPImpl#getApName <em>Ap Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConnectedAPImpl#getIedName <em>Ied Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConnectedAPImpl#getRedProt <em>Red Prot</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConnectedAPImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConnectedAPImpl#getSubNetwork <em>Sub Network</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConnectedAPImpl#getRefersToAccessPoint <em>Refers To Access Point</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConnectedAPImpl#getPhysConn <em>Phys Conn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConnectedAPImpl#getGSE <em>GSE</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConnectedAPImpl#getSMV <em>SMV</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectedAPImpl extends UnNamingImpl implements ConnectedAP {
    /**
	 * The default value of the '{@link #getApName() <em>Ap Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getApName()
	 * @generated
	 * @ordered
	 */
    protected static final String AP_NAME_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getApName() <em>Ap Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getApName()
	 * @generated
	 * @ordered
	 */
    protected String apName = AP_NAME_EDEFAULT;

    /**
	 * This is true if the Ap Name attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean apNameESet;

    /**
	 * The default value of the '{@link #getIedName() <em>Ied Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIedName()
	 * @generated
	 * @ordered
	 */
    protected static final String IED_NAME_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getIedName() <em>Ied Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIedName()
	 * @generated
	 * @ordered
	 */
    protected String iedName = IED_NAME_EDEFAULT;

    /**
	 * This is true if the Ied Name attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean iedNameESet;

    /**
	 * The default value of the '{@link #getRedProt() <em>Red Prot</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRedProt()
	 * @generated
	 * @ordered
	 */
    protected static final String RED_PROT_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getRedProt() <em>Red Prot</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRedProt()
	 * @generated
	 * @ordered
	 */
    protected String redProt = RED_PROT_EDEFAULT;

    /**
	 * This is true if the Red Prot attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean redProtESet;

    /**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
    protected Address address;

    /**
	 * This is true if the Address containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean addressESet;

    /**
	 * The cached value of the '{@link #getRefersToAccessPoint() <em>Refers To Access Point</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRefersToAccessPoint()
	 * @generated
	 * @ordered
	 */
    protected AccessPoint refersToAccessPoint;

    /**
	 * This is true if the Refers To Access Point reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean refersToAccessPointESet;

    /**
	 * The cached value of the '{@link #getPhysConn() <em>Phys Conn</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getPhysConn()
	 * @generated
	 * @ordered
	 */
    protected EList<PhysConn> physConn;

    /**
	 * The cached value of the '{@link #getGSE() <em>GSE</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getGSE()
	 * @generated
	 * @ordered
	 */
    protected EList<GSE> gse;

    /**
	 * The cached value of the '{@link #getSMV() <em>SMV</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSMV()
	 * @generated
	 * @ordered
	 */
    protected EList<SMV> smv;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ConnectedAPImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.Literals.CONNECTED_AP;
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public String getApName() {
        if( isSetRefersToAccessPoint() ) {
            return getRefersToAccessPoint().getName();
        }
        return apName;
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setApName( String newApName ) {
		String oldApName = apName;
		apName = newApName;
		boolean oldApNameESet = apNameESet;
		apNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CONNECTED_AP__AP_NAME, oldApName, apName, !oldApNameESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetApName() {
		String oldApName = apName;
		boolean oldApNameESet = apNameESet;
		apName = AP_NAME_EDEFAULT;
		apNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CONNECTED_AP__AP_NAME, oldApName, AP_NAME_EDEFAULT, oldApNameESet));
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public boolean isSetApName() {
        return isSetRefersToAccessPoint();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public String getIedName() {
        if( isSetRefersToAccessPoint() ) {
            return getRefersToAccessPoint().getIED().getName();
        }
        return iedName;
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setIedName( String newIedName ) {
		String oldIedName = iedName;
		iedName = newIedName;
		boolean oldIedNameESet = iedNameESet;
		iedNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CONNECTED_AP__IED_NAME, oldIedName, iedName, !oldIedNameESet));
	}

    /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetIedName() {
		String oldIedName = iedName;
		boolean oldIedNameESet = iedNameESet;
		iedName = IED_NAME_EDEFAULT;
		iedNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CONNECTED_AP__IED_NAME, oldIedName, IED_NAME_EDEFAULT, oldIedNameESet));
	}

    /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated NOT
    */
    public boolean isSetIedName() {
        return isSetRefersToAccessPoint();
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getRedProt() {
		return redProt;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setRedProt( String newRedProt ) {
		String oldRedProt = redProt;
		redProt = newRedProt;
		boolean oldRedProtESet = redProtESet;
		redProtESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CONNECTED_AP__RED_PROT, oldRedProt, redProt, !oldRedProtESet));
	}

    /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetRedProt() {
		String oldRedProt = redProt;
		boolean oldRedProtESet = redProtESet;
		redProt = RED_PROT_EDEFAULT;
		redProtESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CONNECTED_AP__RED_PROT, oldRedProt, RED_PROT_EDEFAULT, oldRedProtESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetRedProt() {
		return redProtESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Address getAddress() {
		return address;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetAddress( Address newAddress, NotificationChain msgs ) {
		Address oldAddress = address;
		address = newAddress;
		boolean oldAddressESet = addressESet;
		addressESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.CONNECTED_AP__ADDRESS, oldAddress, newAddress, !oldAddressESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setAddress( Address newAddress ) {
		if (newAddress != address) {
			NotificationChain msgs = null;
			if (address != null)
				msgs = ((InternalEObject)address).eInverseRemove(this, SclPackage.ADDRESS__CONNECTED_AP, Address.class, msgs);
			if (newAddress != null)
				msgs = ((InternalEObject)newAddress).eInverseAdd(this, SclPackage.ADDRESS__CONNECTED_AP, Address.class, msgs);
			msgs = basicSetAddress(newAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAddressESet = addressESet;
			addressESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CONNECTED_AP__ADDRESS, newAddress, newAddress, !oldAddressESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetAddress( NotificationChain msgs ) {
		Address oldAddress = address;
		address = null;
		boolean oldAddressESet = addressESet;
		addressESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.CONNECTED_AP__ADDRESS, oldAddress, null, oldAddressESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetAddress() {
		if (address != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)address).eInverseRemove(this, SclPackage.ADDRESS__CONNECTED_AP, Address.class, msgs);
			msgs = basicUnsetAddress(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAddressESet = addressESet;
			addressESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CONNECTED_AP__ADDRESS, null, null, oldAddressESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetAddress() {
		return addressESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SubNetwork getSubNetwork() {
		if (eContainerFeatureID() != SclPackage.CONNECTED_AP__SUB_NETWORK) return null;
		return (SubNetwork)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetSubNetwork( SubNetwork newSubNetwork, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newSubNetwork, SclPackage.CONNECTED_AP__SUB_NETWORK, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setSubNetwork( SubNetwork newSubNetwork ) {
		if (newSubNetwork != eInternalContainer() || (eContainerFeatureID() != SclPackage.CONNECTED_AP__SUB_NETWORK && newSubNetwork != null)) {
			if (EcoreUtil.isAncestor(this, newSubNetwork))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSubNetwork != null)
				msgs = ((InternalEObject)newSubNetwork).eInverseAdd(this, SclPackage.SUB_NETWORK__CONNECTED_AP, SubNetwork.class, msgs);
			msgs = basicSetSubNetwork(newSubNetwork, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CONNECTED_AP__SUB_NETWORK, newSubNetwork, newSubNetwork));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public AccessPoint getRefersToAccessPoint() {
		return refersToAccessPoint;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetRefersToAccessPoint( AccessPoint newRefersToAccessPoint, NotificationChain msgs ) {
		AccessPoint oldRefersToAccessPoint = refersToAccessPoint;
		refersToAccessPoint = newRefersToAccessPoint;
		boolean oldRefersToAccessPointESet = refersToAccessPointESet;
		refersToAccessPointESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.CONNECTED_AP__REFERS_TO_ACCESS_POINT, oldRefersToAccessPoint, newRefersToAccessPoint, !oldRefersToAccessPointESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setRefersToAccessPoint( AccessPoint newRefersToAccessPoint ) {
		if (newRefersToAccessPoint != refersToAccessPoint) {
			NotificationChain msgs = null;
			if (refersToAccessPoint != null)
				msgs = ((InternalEObject)refersToAccessPoint).eInverseRemove(this, SclPackage.ACCESS_POINT__REFERRED_BY_CONNECTED_AP, AccessPoint.class, msgs);
			if (newRefersToAccessPoint != null)
				msgs = ((InternalEObject)newRefersToAccessPoint).eInverseAdd(this, SclPackage.ACCESS_POINT__REFERRED_BY_CONNECTED_AP, AccessPoint.class, msgs);
			msgs = basicSetRefersToAccessPoint(newRefersToAccessPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRefersToAccessPointESet = refersToAccessPointESet;
			refersToAccessPointESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CONNECTED_AP__REFERS_TO_ACCESS_POINT, newRefersToAccessPoint, newRefersToAccessPoint, !oldRefersToAccessPointESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetRefersToAccessPoint( NotificationChain msgs ) {
		AccessPoint oldRefersToAccessPoint = refersToAccessPoint;
		refersToAccessPoint = null;
		boolean oldRefersToAccessPointESet = refersToAccessPointESet;
		refersToAccessPointESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.CONNECTED_AP__REFERS_TO_ACCESS_POINT, oldRefersToAccessPoint, null, oldRefersToAccessPointESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetRefersToAccessPoint() {
		if (refersToAccessPoint != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)refersToAccessPoint).eInverseRemove(this, SclPackage.ACCESS_POINT__REFERRED_BY_CONNECTED_AP, AccessPoint.class, msgs);
			msgs = basicUnsetRefersToAccessPoint(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRefersToAccessPointESet = refersToAccessPointESet;
			refersToAccessPointESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CONNECTED_AP__REFERS_TO_ACCESS_POINT, null, null, oldRefersToAccessPointESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetRefersToAccessPoint() {
		return refersToAccessPointESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<PhysConn> getPhysConn() {
		if (physConn == null) {
			physConn = new EObjectContainmentWithInverseEList.Unsettable<PhysConn>(PhysConn.class, this, SclPackage.CONNECTED_AP__PHYS_CONN, SclPackage.PHYS_CONN__CONNECTED_AP);
		}
		return physConn;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetPhysConn() {
		if (physConn != null) ((InternalEList.Unsettable<?>)physConn).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetPhysConn() {
		return physConn != null && ((InternalEList.Unsettable<?>)physConn).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<GSE> getGSE() {
		if (gse == null) {
			gse = new EObjectContainmentWithInverseEList.Unsettable<GSE>(GSE.class, this, SclPackage.CONNECTED_AP__GSE, SclPackage.GSE__CONNECTED_AP);
		}
		return gse;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetGSE() {
		if (gse != null) ((InternalEList.Unsettable<?>)gse).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetGSE() {
		return gse != null && ((InternalEList.Unsettable<?>)gse).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<SMV> getSMV() {
		if (smv == null) {
			smv = new EObjectContainmentWithInverseEList.Unsettable<SMV>(SMV.class, this, SclPackage.CONNECTED_AP__SMV, SclPackage.SMV__CONNECTED_AP);
		}
		return smv;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetSMV() {
		if (smv != null) ((InternalEList.Unsettable<?>)smv).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetSMV() {
		return smv != null && ((InternalEList.Unsettable<?>)smv).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectedAP_iedName_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv ConnectedAP_iedName_required:
		 *   let
		 *     severity : Integer[1] = 'ConnectedAP::ConnectedAP_iedName_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[1] = self.iedName <> null
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'iedName attribute shall be present in ConnectedAP (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'ConnectedAP::ConnectedAP_iedName_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_ConnectedAP_c_c_ConnectedAP_iedName_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ String iedName = this.getIedName();
			final /*@NonInvalid*/ boolean status = iedName != null;
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_iedName_32_attribute_32_shall_32_be_32_present_32_in_32_ConnectedAP_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_ConnectedAP_c_c_ConnectedAP_iedName_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectedAP_iedName_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv ConnectedAP_iedName_valid:
		 *   let
		 *     severity : Integer[1] = 'ConnectedAP::ConnectedAP_iedName_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.iedName <> null implies
		 *           self.validSclIEDName(iedName)
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'iedName attribute shall be valid in ConnectedAP (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.iedName.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'ConnectedAP::ConnectedAP_iedName_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_ConnectedAP_c_c_ConnectedAP_iedName_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String iedName = this.getIedName();
				final /*@NonInvalid*/ boolean ne = iedName != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean validSclIEDName = ((SclObject)this).validSclIEDName(iedName);
					status = validSclIEDName;
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_iedName_32_attribute_32_shall_32_be_32_valid_32_in_32_ConnectedAP_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(iedName);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_ConnectedAP_c_c_ConnectedAP_iedName_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectedAP_apName_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv ConnectedAP_apName_required:
		 *   let
		 *     severity : Integer[1] = 'ConnectedAP::ConnectedAP_apName_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[1] = self.apName <> null
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'apName attribute shall be present in ConnectedAP (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'ConnectedAP::ConnectedAP_apName_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_ConnectedAP_c_c_ConnectedAP_apName_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ String apName = this.getApName();
			final /*@NonInvalid*/ boolean status = apName != null;
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_apName_32_attribute_32_shall_32_be_32_present_32_in_32_ConnectedAP_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_ConnectedAP_c_c_ConnectedAP_apName_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectedAP_apName_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv ConnectedAP_apName_valid:
		 *   let
		 *     severity : Integer[1] = 'ConnectedAP::ConnectedAP_apName_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.apName <> null implies
		 *           self.validSclAccessPointName(apName)
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'apName attribute shall be valid in ConnectedAP (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.apName.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'ConnectedAP::ConnectedAP_apName_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_ConnectedAP_c_c_ConnectedAP_apName_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String apName = this.getApName();
				final /*@NonInvalid*/ boolean ne = apName != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean validSclAccessPointName = ((SclObject)this).validSclAccessPointName(apName);
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_apName_32_attribute_32_shall_32_be_32_valid_32_in_32_ConnectedAP_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(apName);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_ConnectedAP_c_c_ConnectedAP_apName_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectedAP_redProt_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv ConnectedAP_redProt_valid:
		 *   let
		 *     severity : Integer[1] = 'ConnectedAP::ConnectedAP_redProt_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.redProt <> null implies
		 *           self.validSclRedProtEnum(redProt)
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'redProt attribute shall be valid if present in ConnectedAP (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.redProt.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'ConnectedAP::ConnectedAP_redProt_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_ConnectedAP_c_c_ConnectedAP_redProt_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String redProt = this.getRedProt();
				final /*@NonInvalid*/ boolean ne = redProt != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean validSclRedProtEnum = ((SclObject)this).validSclRedProtEnum(redProt);
					status = validSclRedProtEnum;
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_redProt_32_attribute_32_shall_32_be_32_valid_32_if_32_present_32_in_32_ConnectedAP_32_o_line, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(redProt);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_ConnectedAP_c_c_ConnectedAP_redProt_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectedAP_at_most_one_PhysConnTypeRedConn_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv ConnectedAP_at_most_one_PhysConnTypeRedConn_required:
		 *   let
		 *     severity : Integer[1] = 'ConnectedAP::ConnectedAP_at_most_one_PhysConnTypeRedConn_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let
		 *           status : Boolean[1] = self.PhysConn->select(p |
		 *             (p.type = 'RedConn'
		 *             ))
		 *           ->size() <= 1
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'Only one PhysConn type RedConn is allowed in ConnectedAP (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'ConnectedAP::ConnectedAP_at_most_one_PhysConnTypeRedConn_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_ConnectedAP_c_c_ConnectedAP_at_most_one_PhysConnTypeRedConn_require);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ List<PhysConn> PhysConn = this.getPhysConn();
			final /*@NonInvalid*/ SetValue BOXED_PhysConn = idResolver.createSetOfAll(SclTables.SET_CLSSid_PhysConn, PhysConn);
			/*@Thrown*/ SetValue.Accumulator accumulator = ValueUtil.createSetAccumulatorValue(SclTables.SET_CLSSid_PhysConn);
			/*@NonNull*/ Iterator<Object> ITERATOR_p = BOXED_PhysConn.iterator();
			/*@NonInvalid*/ SetValue select;
			while (true) {
				if (!ITERATOR_p.hasNext()) {
					select = accumulator;
					break;
				}
				/*@NonInvalid*/ PhysConn p = (PhysConn)ITERATOR_p.next();
				/**
				 * p.type = 'RedConn'
				 */
				final /*@NonInvalid*/ String type = p.getType();
				final /*@NonInvalid*/ boolean eq = SclTables.STR_RedConn.equals(type);
				//
				if (eq == ValueUtil.TRUE_VALUE) {
					accumulator.add(p);
				}
			}
			final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
			final /*@NonInvalid*/ boolean status = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, size, SclTables.INT_1).booleanValue();
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_Only_32_one_32_PhysConn_32_type_32_RedConn_32_is_32_allowed_32_in_32_ConnectedAP_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_ConnectedAP_c_c_ConnectedAP_at_most_one_PhysConnTypeRedConn_require, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectedAP_at_most_one_PhysConnTypeConnection_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv ConnectedAP_at_most_one_PhysConnTypeConnection_required:
		 *   let
		 *     severity : Integer[1] = 'ConnectedAP::ConnectedAP_at_most_one_PhysConnTypeConnection_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let
		 *           status : Boolean[?] = self.PhysConn->select(p | p.type = 'RedConn')
		 *           ->size() = 1 implies
		 *           self.PhysConn->select(p | (p.type = 'Connection'))
		 *           ->size() <= 1
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'Only one PhysConn type Connection is allowed when there is one PhysConn type RedConn in ConnectedAP (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'ConnectedAP::ConnectedAP_at_most_one_PhysConnTypeConnection_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_ConnectedAP_c_c_ConnectedAP_at_most_one_PhysConnTypeConnection_requ);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ List<PhysConn> PhysConn_0 = this.getPhysConn();
			final /*@NonInvalid*/ SetValue BOXED_PhysConn_0 = idResolver.createSetOfAll(SclTables.SET_CLSSid_PhysConn, PhysConn_0);
			/*@Thrown*/ SetValue.Accumulator accumulator = ValueUtil.createSetAccumulatorValue(SclTables.SET_CLSSid_PhysConn);
			/*@NonNull*/ Iterator<Object> ITERATOR_p = BOXED_PhysConn_0.iterator();
			/*@NonInvalid*/ SetValue select;
			while (true) {
				if (!ITERATOR_p.hasNext()) {
					select = accumulator;
					break;
				}
				/*@NonInvalid*/ PhysConn p = (PhysConn)ITERATOR_p.next();
				/**
				 * p.type = 'RedConn'
				 */
				final /*@NonInvalid*/ String type = p.getType();
				final /*@NonInvalid*/ boolean eq = SclTables.STR_RedConn.equals(type);
				//
				if (eq == ValueUtil.TRUE_VALUE) {
					accumulator.add(p);
				}
			}
			final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
			final /*@NonInvalid*/ boolean eq_0 = size.equals(SclTables.INT_1);
			/*@NonInvalid*/ boolean status;
			if (eq_0) {
				/*@Thrown*/ SetValue.Accumulator accumulator_0 = ValueUtil.createSetAccumulatorValue(SclTables.SET_CLSSid_PhysConn);
				/*@NonNull*/ Iterator<Object> ITERATOR_p_0 = BOXED_PhysConn_0.iterator();
				/*@NonInvalid*/ SetValue select_0;
				while (true) {
					if (!ITERATOR_p_0.hasNext()) {
						select_0 = accumulator_0;
						break;
					}
					/*@NonInvalid*/ PhysConn p_0 = (PhysConn)ITERATOR_p_0.next();
					/**
					 * p.type = 'Connection'
					 */
					final /*@NonInvalid*/ String type_0 = p_0.getType();
					final /*@NonInvalid*/ boolean eq_1 = SclTables.STR_Connection.equals(type_0);
					//
					if (eq_1 == ValueUtil.TRUE_VALUE) {
						accumulator_0.add(p_0);
					}
				}
				final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE.evaluate(select_0);
				final /*@NonInvalid*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, size_0, SclTables.INT_1).booleanValue();
				status = le_0;
			}
			else {
				status = ValueUtil.TRUE_VALUE;
			}
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_Only_32_one_32_PhysConn_32_type_32_Connection_32_is_32_allowed_32_when_32_there_32_is_32_one_32_P, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_ConnectedAP_c_c_ConnectedAP_at_most_one_PhysConnTypeConnection_requ, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
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
			case SclPackage.CONNECTED_AP__ADDRESS:
				if (address != null)
					msgs = ((InternalEObject)address).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.CONNECTED_AP__ADDRESS, null, msgs);
				return basicSetAddress((Address)otherEnd, msgs);
			case SclPackage.CONNECTED_AP__SUB_NETWORK:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSubNetwork((SubNetwork)otherEnd, msgs);
			case SclPackage.CONNECTED_AP__REFERS_TO_ACCESS_POINT:
				if (refersToAccessPoint != null)
					msgs = ((InternalEObject)refersToAccessPoint).eInverseRemove(this, SclPackage.ACCESS_POINT__REFERRED_BY_CONNECTED_AP, AccessPoint.class, msgs);
				return basicSetRefersToAccessPoint((AccessPoint)otherEnd, msgs);
			case SclPackage.CONNECTED_AP__PHYS_CONN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPhysConn()).basicAdd(otherEnd, msgs);
			case SclPackage.CONNECTED_AP__GSE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGSE()).basicAdd(otherEnd, msgs);
			case SclPackage.CONNECTED_AP__SMV:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSMV()).basicAdd(otherEnd, msgs);
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
			case SclPackage.CONNECTED_AP__ADDRESS:
				return basicUnsetAddress(msgs);
			case SclPackage.CONNECTED_AP__SUB_NETWORK:
				return basicSetSubNetwork(null, msgs);
			case SclPackage.CONNECTED_AP__REFERS_TO_ACCESS_POINT:
				return basicUnsetRefersToAccessPoint(msgs);
			case SclPackage.CONNECTED_AP__PHYS_CONN:
				return ((InternalEList<?>)getPhysConn()).basicRemove(otherEnd, msgs);
			case SclPackage.CONNECTED_AP__GSE:
				return ((InternalEList<?>)getGSE()).basicRemove(otherEnd, msgs);
			case SclPackage.CONNECTED_AP__SMV:
				return ((InternalEList<?>)getSMV()).basicRemove(otherEnd, msgs);
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
			case SclPackage.CONNECTED_AP__SUB_NETWORK:
				return eInternalContainer().eInverseRemove(this, SclPackage.SUB_NETWORK__CONNECTED_AP, SubNetwork.class, msgs);
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
			case SclPackage.CONNECTED_AP__AP_NAME:
				return getApName();
			case SclPackage.CONNECTED_AP__IED_NAME:
				return getIedName();
			case SclPackage.CONNECTED_AP__RED_PROT:
				return getRedProt();
			case SclPackage.CONNECTED_AP__ADDRESS:
				return getAddress();
			case SclPackage.CONNECTED_AP__SUB_NETWORK:
				return getSubNetwork();
			case SclPackage.CONNECTED_AP__REFERS_TO_ACCESS_POINT:
				return getRefersToAccessPoint();
			case SclPackage.CONNECTED_AP__PHYS_CONN:
				return getPhysConn();
			case SclPackage.CONNECTED_AP__GSE:
				return getGSE();
			case SclPackage.CONNECTED_AP__SMV:
				return getSMV();
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
			case SclPackage.CONNECTED_AP__AP_NAME:
				setApName((String)newValue);
				return;
			case SclPackage.CONNECTED_AP__IED_NAME:
				setIedName((String)newValue);
				return;
			case SclPackage.CONNECTED_AP__RED_PROT:
				setRedProt((String)newValue);
				return;
			case SclPackage.CONNECTED_AP__ADDRESS:
				setAddress((Address)newValue);
				return;
			case SclPackage.CONNECTED_AP__SUB_NETWORK:
				setSubNetwork((SubNetwork)newValue);
				return;
			case SclPackage.CONNECTED_AP__REFERS_TO_ACCESS_POINT:
				setRefersToAccessPoint((AccessPoint)newValue);
				return;
			case SclPackage.CONNECTED_AP__PHYS_CONN:
				getPhysConn().clear();
				getPhysConn().addAll((Collection<? extends PhysConn>)newValue);
				return;
			case SclPackage.CONNECTED_AP__GSE:
				getGSE().clear();
				getGSE().addAll((Collection<? extends GSE>)newValue);
				return;
			case SclPackage.CONNECTED_AP__SMV:
				getSMV().clear();
				getSMV().addAll((Collection<? extends SMV>)newValue);
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
			case SclPackage.CONNECTED_AP__AP_NAME:
				unsetApName();
				return;
			case SclPackage.CONNECTED_AP__IED_NAME:
				unsetIedName();
				return;
			case SclPackage.CONNECTED_AP__RED_PROT:
				unsetRedProt();
				return;
			case SclPackage.CONNECTED_AP__ADDRESS:
				unsetAddress();
				return;
			case SclPackage.CONNECTED_AP__SUB_NETWORK:
				setSubNetwork((SubNetwork)null);
				return;
			case SclPackage.CONNECTED_AP__REFERS_TO_ACCESS_POINT:
				unsetRefersToAccessPoint();
				return;
			case SclPackage.CONNECTED_AP__PHYS_CONN:
				unsetPhysConn();
				return;
			case SclPackage.CONNECTED_AP__GSE:
				unsetGSE();
				return;
			case SclPackage.CONNECTED_AP__SMV:
				unsetSMV();
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
			case SclPackage.CONNECTED_AP__AP_NAME:
				return isSetApName();
			case SclPackage.CONNECTED_AP__IED_NAME:
				return isSetIedName();
			case SclPackage.CONNECTED_AP__RED_PROT:
				return isSetRedProt();
			case SclPackage.CONNECTED_AP__ADDRESS:
				return isSetAddress();
			case SclPackage.CONNECTED_AP__SUB_NETWORK:
				return getSubNetwork() != null;
			case SclPackage.CONNECTED_AP__REFERS_TO_ACCESS_POINT:
				return isSetRefersToAccessPoint();
			case SclPackage.CONNECTED_AP__PHYS_CONN:
				return isSetPhysConn();
			case SclPackage.CONNECTED_AP__GSE:
				return isSetGSE();
			case SclPackage.CONNECTED_AP__SMV:
				return isSetSMV();
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
			case SclPackage.CONNECTED_AP___VALIDATE_CONNECTED_AP_IED_NAME_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateConnectedAP_iedName_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.CONNECTED_AP___VALIDATE_CONNECTED_AP_IED_NAME_VALID__DIAGNOSTICCHAIN_MAP:
				return validateConnectedAP_iedName_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.CONNECTED_AP___VALIDATE_CONNECTED_AP_AP_NAME_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateConnectedAP_apName_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.CONNECTED_AP___VALIDATE_CONNECTED_AP_AP_NAME_VALID__DIAGNOSTICCHAIN_MAP:
				return validateConnectedAP_apName_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.CONNECTED_AP___VALIDATE_CONNECTED_AP_RED_PROT_VALID__DIAGNOSTICCHAIN_MAP:
				return validateConnectedAP_redProt_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.CONNECTED_AP___VALIDATE_CONNECTED_AP_AT_MOST_ONE_PHYS_CONN_TYPE_RED_CONN_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateConnectedAP_at_most_one_PhysConnTypeRedConn_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.CONNECTED_AP___VALIDATE_CONNECTED_AP_AT_MOST_ONE_PHYS_CONN_TYPE_CONNECTION_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateConnectedAP_at_most_one_PhysConnTypeConnection_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (apName: ");
		if (apNameESet) result.append(apName); else result.append("<unset>");
		result.append(", iedName: ");
		if (iedNameESet) result.append(iedName); else result.append("<unset>");
		result.append(", redProt: ");
		if (redProtESet) result.append(redProt); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

    @Override
    protected void doResolveLinks() {
        // iedName a name identifying the IED
        // apName  a name identifying this access point within the IED
        // desc    some descriptive text for this access point at this subnetwork

        // Resolve only if attribute has been read
        // Cannot use isSetApName() Here
        if( !apNameESet ) return;

        // find an IED with
        //   IED.name == ConnectedAP.iedName
        SclSwitch< Boolean > s1 = new SclSwitch< Boolean >() {

            @Override
            public Boolean caseIED( IED object ) {
                return object.getName().equals( getIedName() );
            }

            @Override
            public Boolean defaultCase( EObject object ) {
                return false;
            }

        };

        List< IED > res1 = shallowSearchObjects( getSCLRoot().getIED(), s1 );
        IED ied = null;
        String mess1 = "IED( name = " + getIedName() + " ) for ConnectedAP on line " + getLineNumber() + " ( apName = "
                + getApName() + " )";
        if( res1.isEmpty() ) {
            AbstractRiseClipseConsole.getConsole().error( "cannot find " + mess1 );
            return;
        }
        else if( res1.size() > 1 ) {
            AbstractRiseClipseConsole.getConsole().error( "found several " + mess1 );
            return;
        }
        else {
            //AbstractRiseClipseConsole.getConsole().info( "found " + mess );
            ied = res1.get( 0 );
        }

        SclSwitch< Boolean > s2 = new SclSwitch< Boolean >() {

            @Override
            public Boolean caseAccessPoint( AccessPoint object ) {
                return object.getName().equals( getApName() );
            }

            @Override
            public Boolean defaultCase( EObject object ) {
                return false;
            }

        };

        List< AccessPoint > res2 = shallowSearchObjects( ied.getAccessPoint(), s2 );
        String mess2 = "AccessPoint( name = " + getApName() + " ) for ConnectedAP on line " + getLineNumber()
                + " ( iedName = " + getIedName() + " )";
        if( res2.isEmpty() ) {
            AbstractRiseClipseConsole.getConsole().error( "cannot find " + mess2 );
            return;
        }
        else if( res2.size() > 1 ) {
            AbstractRiseClipseConsole.getConsole().error( "found several " + mess2 );
            return;
        }
        else {
            //AbstractRiseClipseConsole.getConsole().info( "found " + mess );
            setRefersToAccessPoint( res2.get( 0 ));
        }
    }

} //ConnectedAPImpl
