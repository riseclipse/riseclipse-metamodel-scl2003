/**
 *  Copyright (c) 2016-2024 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-v20.html
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
 *      https://riseclipse.github.io/
 * 
 */
package fr.centralesupelec.edf.riseclipse.iec61850.scl.impl;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtControlCheckEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtCtrl;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Outputs;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ext Ctrl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ExtCtrlImpl#getApRef <em>Ap Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ExtCtrlImpl#getCheckInterlock <em>Check Interlock</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ExtCtrlImpl#getCheckSynchrocheck <em>Check Synchrocheck</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ExtCtrlImpl#getIntAdrr <em>Int Adrr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ExtCtrlImpl#getParentOutputs <em>Parent Outputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtCtrlImpl extends DORefImpl implements ExtCtrl {
    /**
     * The default value of the '{@link #getApRef() <em>Ap Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getApRef()
     * @generated
     * @ordered
     */
    protected static final String AP_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getApRef() <em>Ap Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getApRef()
     * @generated
     * @ordered
     */
    protected String apRef = AP_REF_EDEFAULT;

    /**
     * This is true if the Ap Ref attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean apRefESet;

    /**
     * The default value of the '{@link #getCheckInterlock() <em>Check Interlock</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCheckInterlock()
     * @generated
     * @ordered
     */
    protected static final ExtControlCheckEnum CHECK_INTERLOCK_EDEFAULT = ExtControlCheckEnum.TRUE;

    /**
     * The cached value of the '{@link #getCheckInterlock() <em>Check Interlock</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCheckInterlock()
     * @generated
     * @ordered
     */
    protected ExtControlCheckEnum checkInterlock = CHECK_INTERLOCK_EDEFAULT;

    /**
     * This is true if the Check Interlock attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean checkInterlockESet;

    /**
     * The default value of the '{@link #getCheckSynchrocheck() <em>Check Synchrocheck</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCheckSynchrocheck()
     * @generated
     * @ordered
     */
    protected static final ExtControlCheckEnum CHECK_SYNCHROCHECK_EDEFAULT = ExtControlCheckEnum.TRUE;

    /**
     * The cached value of the '{@link #getCheckSynchrocheck() <em>Check Synchrocheck</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCheckSynchrocheck()
     * @generated
     * @ordered
     */
    protected ExtControlCheckEnum checkSynchrocheck = CHECK_SYNCHROCHECK_EDEFAULT;

    /**
     * This is true if the Check Synchrocheck attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean checkSynchrocheckESet;

    /**
     * The default value of the '{@link #getIntAdrr() <em>Int Adrr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIntAdrr()
     * @generated
     * @ordered
     */
    protected static final String INT_ADRR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIntAdrr() <em>Int Adrr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIntAdrr()
     * @generated
     * @ordered
     */
    protected String intAdrr = INT_ADRR_EDEFAULT;

    /**
     * This is true if the Int Adrr attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean intAdrrESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExtCtrlImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getExtCtrl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getApRef() {
        return apRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setApRef( String newApRef ) {
        String oldApRef = apRef;
        apRef = newApRef;
        boolean oldApRefESet = apRefESet;
        apRefESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.EXT_CTRL__AP_REF, oldApRef, apRef,
                    !oldApRefESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetApRef() {
        String oldApRef = apRef;
        boolean oldApRefESet = apRefESet;
        apRef = AP_REF_EDEFAULT;
        apRefESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.EXT_CTRL__AP_REF, oldApRef,
                    AP_REF_EDEFAULT, oldApRefESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetApRef() {
        return apRefESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExtControlCheckEnum getCheckInterlock() {
        return checkInterlock;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCheckInterlock( ExtControlCheckEnum newCheckInterlock ) {
        ExtControlCheckEnum oldCheckInterlock = checkInterlock;
        checkInterlock = newCheckInterlock == null ? CHECK_INTERLOCK_EDEFAULT : newCheckInterlock;
        boolean oldCheckInterlockESet = checkInterlockESet;
        checkInterlockESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.EXT_CTRL__CHECK_INTERLOCK,
                    oldCheckInterlock, checkInterlock, !oldCheckInterlockESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCheckInterlock() {
        ExtControlCheckEnum oldCheckInterlock = checkInterlock;
        boolean oldCheckInterlockESet = checkInterlockESet;
        checkInterlock = CHECK_INTERLOCK_EDEFAULT;
        checkInterlockESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.EXT_CTRL__CHECK_INTERLOCK,
                    oldCheckInterlock, CHECK_INTERLOCK_EDEFAULT, oldCheckInterlockESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCheckInterlock() {
        return checkInterlockESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExtControlCheckEnum getCheckSynchrocheck() {
        return checkSynchrocheck;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCheckSynchrocheck( ExtControlCheckEnum newCheckSynchrocheck ) {
        ExtControlCheckEnum oldCheckSynchrocheck = checkSynchrocheck;
        checkSynchrocheck = newCheckSynchrocheck == null ? CHECK_SYNCHROCHECK_EDEFAULT : newCheckSynchrocheck;
        boolean oldCheckSynchrocheckESet = checkSynchrocheckESet;
        checkSynchrocheckESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.EXT_CTRL__CHECK_SYNCHROCHECK,
                    oldCheckSynchrocheck, checkSynchrocheck, !oldCheckSynchrocheckESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCheckSynchrocheck() {
        ExtControlCheckEnum oldCheckSynchrocheck = checkSynchrocheck;
        boolean oldCheckSynchrocheckESet = checkSynchrocheckESet;
        checkSynchrocheck = CHECK_SYNCHROCHECK_EDEFAULT;
        checkSynchrocheckESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.EXT_CTRL__CHECK_SYNCHROCHECK,
                    oldCheckSynchrocheck, CHECK_SYNCHROCHECK_EDEFAULT, oldCheckSynchrocheckESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCheckSynchrocheck() {
        return checkSynchrocheckESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getIntAdrr() {
        return intAdrr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIntAdrr( String newIntAdrr ) {
        String oldIntAdrr = intAdrr;
        intAdrr = newIntAdrr;
        boolean oldIntAdrrESet = intAdrrESet;
        intAdrrESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.EXT_CTRL__INT_ADRR, oldIntAdrr, intAdrr,
                    !oldIntAdrrESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIntAdrr() {
        String oldIntAdrr = intAdrr;
        boolean oldIntAdrrESet = intAdrrESet;
        intAdrr = INT_ADRR_EDEFAULT;
        intAdrrESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.EXT_CTRL__INT_ADRR, oldIntAdrr,
                    INT_ADRR_EDEFAULT, oldIntAdrrESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIntAdrr() {
        return intAdrrESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Outputs getParentOutputs() {
        if( eContainerFeatureID() != SclPackage.EXT_CTRL__PARENT_OUTPUTS ) {
            return null;
        }
        return ( Outputs ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentOutputs( Outputs newParentOutputs, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentOutputs, SclPackage.EXT_CTRL__PARENT_OUTPUTS, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentOutputs( Outputs newParentOutputs ) {
        if( newParentOutputs != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.EXT_CTRL__PARENT_OUTPUTS && newParentOutputs != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentOutputs ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentOutputs != null ) {
                msgs = ( ( InternalEObject ) newParentOutputs ).eInverseAdd( this, SclPackage.OUTPUTS__EXT_CTRL,
                        Outputs.class, msgs );
            }
            msgs = basicSetParentOutputs( newParentOutputs, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.EXT_CTRL__PARENT_OUTPUTS,
                    newParentOutputs, newParentOutputs ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case SclPackage.EXT_CTRL__PARENT_OUTPUTS:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentOutputs( ( Outputs ) otherEnd, msgs );
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
        case SclPackage.EXT_CTRL__PARENT_OUTPUTS:
            return basicSetParentOutputs( null, msgs );
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
        case SclPackage.EXT_CTRL__PARENT_OUTPUTS:
            return eInternalContainer().eInverseRemove( this, SclPackage.OUTPUTS__EXT_CTRL, Outputs.class, msgs );
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
        case SclPackage.EXT_CTRL__AP_REF:
            return getApRef();
        case SclPackage.EXT_CTRL__CHECK_INTERLOCK:
            return getCheckInterlock();
        case SclPackage.EXT_CTRL__CHECK_SYNCHROCHECK:
            return getCheckSynchrocheck();
        case SclPackage.EXT_CTRL__INT_ADRR:
            return getIntAdrr();
        case SclPackage.EXT_CTRL__PARENT_OUTPUTS:
            return getParentOutputs();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case SclPackage.EXT_CTRL__AP_REF:
            setApRef( ( String ) newValue );
            return;
        case SclPackage.EXT_CTRL__CHECK_INTERLOCK:
            setCheckInterlock( ( ExtControlCheckEnum ) newValue );
            return;
        case SclPackage.EXT_CTRL__CHECK_SYNCHROCHECK:
            setCheckSynchrocheck( ( ExtControlCheckEnum ) newValue );
            return;
        case SclPackage.EXT_CTRL__INT_ADRR:
            setIntAdrr( ( String ) newValue );
            return;
        case SclPackage.EXT_CTRL__PARENT_OUTPUTS:
            setParentOutputs( ( Outputs ) newValue );
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
        case SclPackage.EXT_CTRL__AP_REF:
            unsetApRef();
            return;
        case SclPackage.EXT_CTRL__CHECK_INTERLOCK:
            unsetCheckInterlock();
            return;
        case SclPackage.EXT_CTRL__CHECK_SYNCHROCHECK:
            unsetCheckSynchrocheck();
            return;
        case SclPackage.EXT_CTRL__INT_ADRR:
            unsetIntAdrr();
            return;
        case SclPackage.EXT_CTRL__PARENT_OUTPUTS:
            setParentOutputs( ( Outputs ) null );
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
        case SclPackage.EXT_CTRL__AP_REF:
            return isSetApRef();
        case SclPackage.EXT_CTRL__CHECK_INTERLOCK:
            return isSetCheckInterlock();
        case SclPackage.EXT_CTRL__CHECK_SYNCHROCHECK:
            return isSetCheckSynchrocheck();
        case SclPackage.EXT_CTRL__INT_ADRR:
            return isSetIntAdrr();
        case SclPackage.EXT_CTRL__PARENT_OUTPUTS:
            return getParentOutputs() != null;
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) {
            return super.toString();
        }

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (apRef: " );
        if( apRefESet ) {
            result.append( apRef );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", checkInterlock: " );
        if( checkInterlockESet ) {
            result.append( checkInterlock );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", checkSynchrocheck: " );
        if( checkSynchrocheckESet ) {
            result.append( checkSynchrocheck );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", intAdrr: " );
        if( intAdrrESet ) {
            result.append( intAdrr );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

} //ExtCtrlImpl
