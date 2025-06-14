/*
*************************************************************************
**  Copyright (c) 2016-2022 CentraleSupélec & EDF.
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
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.Pair;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.jdt.annotation.NonNull;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.BDA;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DA;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DO;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSet;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.FCEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SDO;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclUtilities;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FCDA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FCDAImpl#getDaName <em>Da Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FCDAImpl#getDoName <em>Do Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FCDAImpl#getFc <em>Fc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FCDAImpl#getIx <em>Ix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FCDAImpl#getLdInst <em>Ld Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FCDAImpl#getLnClass <em>Ln Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FCDAImpl#getLnInst <em>Ln Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FCDAImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FCDAImpl#getParentDataSet <em>Parent Data Set</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FCDAImpl#getRefersToAbstractDataAttribute <em>Refers To Abstract Data Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FCDAImpl#getOrdNb <em>Ord Nb</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FCDAImpl extends SclObjectImpl implements FCDA {
    /**
     * The default value of the '{@link #getDaName() <em>Da Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDaName()
     * @generated
     * @ordered
     */
    protected static final String DA_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDaName() <em>Da Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDaName()
     * @generated
     * @ordered
     */
    protected String daName = DA_NAME_EDEFAULT;

    /**
     * This is true if the Da Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean daNameESet;

    /**
     * The default value of the '{@link #getDoName() <em>Do Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDoName()
     * @generated
     * @ordered
     */
    protected static final String DO_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDoName() <em>Do Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDoName()
     * @generated
     * @ordered
     */
    protected String doName = DO_NAME_EDEFAULT;

    /**
     * This is true if the Do Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean doNameESet;

    /**
     * The default value of the '{@link #getFc() <em>Fc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFc()
     * @generated NOT because there is no default value in SCL
     * @ordered
     */
    protected static final FCEnum FC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFc() <em>Fc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFc()
     * @generated
     * @ordered
     */
    protected FCEnum fc = FC_EDEFAULT;

    /**
     * This is true if the Fc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fcESet;

    /**
     * The default value of the '{@link #getIx() <em>Ix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIx()
     * @generated
     * @ordered
     */
    protected static final Integer IX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIx() <em>Ix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIx()
     * @generated
     * @ordered
     */
    protected Integer ix = IX_EDEFAULT;

    /**
     * This is true if the Ix attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ixESet;

    /**
     * The default value of the '{@link #getLdInst() <em>Ld Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLdInst()
     * @generated
     * @ordered
     */
    protected static final String LD_INST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLdInst() <em>Ld Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLdInst()
     * @generated
     * @ordered
     */
    protected String ldInst = LD_INST_EDEFAULT;

    /**
     * This is true if the Ld Inst attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ldInstESet;

    /**
     * The default value of the '{@link #getLnClass() <em>Ln Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLnClass()
     * @generated
     * @ordered
     */
    protected static final String LN_CLASS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLnClass() <em>Ln Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLnClass()
     * @generated
     * @ordered
     */
    protected String lnClass = LN_CLASS_EDEFAULT;

    /**
     * This is true if the Ln Class attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lnClassESet;

    /**
     * The default value of the '{@link #getLnInst() <em>Ln Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLnInst()
     * @generated
     * @ordered
     */
    protected static final String LN_INST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLnInst() <em>Ln Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLnInst()
     * @generated
     * @ordered
     */
    protected String lnInst = LN_INST_EDEFAULT;

    /**
     * This is true if the Ln Inst attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lnInstESet;

    /**
     * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrefix()
     * @generated
     * @ordered
     */
    protected static final String PREFIX_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrefix()
     * @generated
     * @ordered
     */
    protected String prefix = PREFIX_EDEFAULT;

    /**
     * This is true if the Prefix attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean prefixESet;

    /**
     * The cached value of the '{@link #getRefersToAbstractDataAttribute() <em>Refers To Abstract Data Attribute</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToAbstractDataAttribute()
     * @generated
     * @ordered
     */
    protected EList< AbstractDataAttribute > refersToAbstractDataAttribute;

    /**
     * The default value of the '{@link #getOrdNb() <em>Ord Nb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOrdNb()
     * @generated
     * @ordered
     */
    protected static final int ORD_NB_EDEFAULT = -1;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FCDAImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getFCDA();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDaName() {
        return daName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDaName( String newDaName ) {
        String oldDaName = daName;
        daName = newDaName;
        boolean oldDaNameESet = daNameESet;
        daNameESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.FCDA__DA_NAME, oldDaName, daName,
                    !oldDaNameESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDaName() {
        String oldDaName = daName;
        boolean oldDaNameESet = daNameESet;
        daName = DA_NAME_EDEFAULT;
        daNameESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.FCDA__DA_NAME, oldDaName,
                    DA_NAME_EDEFAULT, oldDaNameESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDaName() {
        return daNameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDoName() {
        return doName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDoName( String newDoName ) {
        String oldDoName = doName;
        doName = newDoName;
        boolean oldDoNameESet = doNameESet;
        doNameESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.FCDA__DO_NAME, oldDoName, doName,
                    !oldDoNameESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDoName() {
        String oldDoName = doName;
        boolean oldDoNameESet = doNameESet;
        doName = DO_NAME_EDEFAULT;
        doNameESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.FCDA__DO_NAME, oldDoName,
                    DO_NAME_EDEFAULT, oldDoNameESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDoName() {
        return doNameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FCEnum getFc() {
        return fc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFc( FCEnum newFc ) {
        FCEnum oldFc = fc;
        fc = newFc == null ? FC_EDEFAULT : newFc;
        boolean oldFcESet = fcESet;
        fcESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.FCDA__FC, oldFc, fc, !oldFcESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFc() {
        FCEnum oldFc = fc;
        boolean oldFcESet = fcESet;
        fc = FC_EDEFAULT;
        fcESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.FCDA__FC, oldFc, FC_EDEFAULT,
                    oldFcESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFc() {
        return fcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getIx() {
        return ix;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIx( Integer newIx ) {
        Integer oldIx = ix;
        ix = newIx;
        boolean oldIxESet = ixESet;
        ixESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.FCDA__IX, oldIx, ix, !oldIxESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIx() {
        Integer oldIx = ix;
        boolean oldIxESet = ixESet;
        ix = IX_EDEFAULT;
        ixESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.FCDA__IX, oldIx, IX_EDEFAULT,
                    oldIxESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIx() {
        return ixESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLdInst() {
        return ldInst;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLdInst( String newLdInst ) {
        String oldLdInst = ldInst;
        ldInst = newLdInst;
        boolean oldLdInstESet = ldInstESet;
        ldInstESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.FCDA__LD_INST, oldLdInst, ldInst,
                    !oldLdInstESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLdInst() {
        String oldLdInst = ldInst;
        boolean oldLdInstESet = ldInstESet;
        ldInst = LD_INST_EDEFAULT;
        ldInstESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.FCDA__LD_INST, oldLdInst,
                    LD_INST_EDEFAULT, oldLdInstESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLdInst() {
        return ldInstESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLnClass() {
        return lnClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLnClass( String newLnClass ) {
        String oldLnClass = lnClass;
        lnClass = newLnClass;
        boolean oldLnClassESet = lnClassESet;
        lnClassESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.FCDA__LN_CLASS, oldLnClass, lnClass,
                    !oldLnClassESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLnClass() {
        String oldLnClass = lnClass;
        boolean oldLnClassESet = lnClassESet;
        lnClass = LN_CLASS_EDEFAULT;
        lnClassESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.FCDA__LN_CLASS, oldLnClass,
                    LN_CLASS_EDEFAULT, oldLnClassESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLnClass() {
        return lnClassESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLnInst() {
        return lnInst;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLnInst( String newLnInst ) {
        String oldLnInst = lnInst;
        lnInst = newLnInst;
        boolean oldLnInstESet = lnInstESet;
        lnInstESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.FCDA__LN_INST, oldLnInst, lnInst,
                    !oldLnInstESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLnInst() {
        String oldLnInst = lnInst;
        boolean oldLnInstESet = lnInstESet;
        lnInst = LN_INST_EDEFAULT;
        lnInstESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.FCDA__LN_INST, oldLnInst,
                    LN_INST_EDEFAULT, oldLnInstESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLnInst() {
        return lnInstESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPrefix() {
        return prefix;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPrefix( String newPrefix ) {
        String oldPrefix = prefix;
        prefix = newPrefix;
        boolean oldPrefixESet = prefixESet;
        prefixESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.FCDA__PREFIX, oldPrefix, prefix,
                    !oldPrefixESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPrefix() {
        String oldPrefix = prefix;
        boolean oldPrefixESet = prefixESet;
        prefix = PREFIX_EDEFAULT;
        prefixESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.FCDA__PREFIX, oldPrefix,
                    PREFIX_EDEFAULT, oldPrefixESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPrefix() {
        return prefixESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DataSet getParentDataSet() {
        if( eContainerFeatureID() != SclPackage.FCDA__PARENT_DATA_SET ) {
            return null;
        }
        return ( DataSet ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentDataSet( DataSet newParentDataSet, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentDataSet, SclPackage.FCDA__PARENT_DATA_SET, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentDataSet( DataSet newParentDataSet ) {
        if( newParentDataSet != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.FCDA__PARENT_DATA_SET && newParentDataSet != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentDataSet ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentDataSet != null ) {
                msgs = ( ( InternalEObject ) newParentDataSet ).eInverseAdd( this, SclPackage.DATA_SET__FCDA,
                        DataSet.class, msgs );
            }
            msgs = basicSetParentDataSet( newParentDataSet, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.FCDA__PARENT_DATA_SET, newParentDataSet,
                    newParentDataSet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< AbstractDataAttribute > getRefersToAbstractDataAttribute() {
        if( refersToAbstractDataAttribute == null ) {
            refersToAbstractDataAttribute = new EObjectWithInverseEList.Unsettable.ManyInverse< >(
                    AbstractDataAttribute.class, this, SclPackage.FCDA__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE,
                    SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_FCDA );
        }
        return refersToAbstractDataAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRefersToAbstractDataAttribute() {
        if( refersToAbstractDataAttribute != null ) {
            ( ( InternalEList.Unsettable< ? > ) refersToAbstractDataAttribute ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToAbstractDataAttribute() {
        return refersToAbstractDataAttribute != null
                && ( ( InternalEList.Unsettable< ? > ) refersToAbstractDataAttribute ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public int getOrdNb() {
        if( getParentDataSet() == null ) {
            return ORD_NB_EDEFAULT;
        }
        return getParentDataSet().getFCDA().indexOf( this );
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
        case SclPackage.FCDA__PARENT_DATA_SET:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentDataSet( ( DataSet ) otherEnd, msgs );
        case SclPackage.FCDA__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getRefersToAbstractDataAttribute() )
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
        case SclPackage.FCDA__PARENT_DATA_SET:
            return basicSetParentDataSet( null, msgs );
        case SclPackage.FCDA__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE:
            return ( ( InternalEList< ? > ) getRefersToAbstractDataAttribute() ).basicRemove( otherEnd, msgs );
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
        case SclPackage.FCDA__PARENT_DATA_SET:
            return eInternalContainer().eInverseRemove( this, SclPackage.DATA_SET__FCDA, DataSet.class, msgs );
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
        case SclPackage.FCDA__DA_NAME:
            return getDaName();
        case SclPackage.FCDA__DO_NAME:
            return getDoName();
        case SclPackage.FCDA__FC:
            return getFc();
        case SclPackage.FCDA__IX:
            return getIx();
        case SclPackage.FCDA__LD_INST:
            return getLdInst();
        case SclPackage.FCDA__LN_CLASS:
            return getLnClass();
        case SclPackage.FCDA__LN_INST:
            return getLnInst();
        case SclPackage.FCDA__PREFIX:
            return getPrefix();
        case SclPackage.FCDA__PARENT_DATA_SET:
            return getParentDataSet();
        case SclPackage.FCDA__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE:
            return getRefersToAbstractDataAttribute();
        case SclPackage.FCDA__ORD_NB:
            return getOrdNb();
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
        case SclPackage.FCDA__DA_NAME:
            setDaName( ( String ) newValue );
            return;
        case SclPackage.FCDA__DO_NAME:
            setDoName( ( String ) newValue );
            return;
        case SclPackage.FCDA__FC:
            setFc( ( FCEnum ) newValue );
            return;
        case SclPackage.FCDA__IX:
            setIx( ( Integer ) newValue );
            return;
        case SclPackage.FCDA__LD_INST:
            setLdInst( ( String ) newValue );
            return;
        case SclPackage.FCDA__LN_CLASS:
            setLnClass( ( String ) newValue );
            return;
        case SclPackage.FCDA__LN_INST:
            setLnInst( ( String ) newValue );
            return;
        case SclPackage.FCDA__PREFIX:
            setPrefix( ( String ) newValue );
            return;
        case SclPackage.FCDA__PARENT_DATA_SET:
            setParentDataSet( ( DataSet ) newValue );
            return;
        case SclPackage.FCDA__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE:
            getRefersToAbstractDataAttribute().clear();
            getRefersToAbstractDataAttribute().addAll( ( Collection< ? extends AbstractDataAttribute > ) newValue );
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
        case SclPackage.FCDA__DA_NAME:
            unsetDaName();
            return;
        case SclPackage.FCDA__DO_NAME:
            unsetDoName();
            return;
        case SclPackage.FCDA__FC:
            unsetFc();
            return;
        case SclPackage.FCDA__IX:
            unsetIx();
            return;
        case SclPackage.FCDA__LD_INST:
            unsetLdInst();
            return;
        case SclPackage.FCDA__LN_CLASS:
            unsetLnClass();
            return;
        case SclPackage.FCDA__LN_INST:
            unsetLnInst();
            return;
        case SclPackage.FCDA__PREFIX:
            unsetPrefix();
            return;
        case SclPackage.FCDA__PARENT_DATA_SET:
            setParentDataSet( ( DataSet ) null );
            return;
        case SclPackage.FCDA__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE:
            unsetRefersToAbstractDataAttribute();
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
        case SclPackage.FCDA__DA_NAME:
            return isSetDaName();
        case SclPackage.FCDA__DO_NAME:
            return isSetDoName();
        case SclPackage.FCDA__FC:
            return isSetFc();
        case SclPackage.FCDA__IX:
            return isSetIx();
        case SclPackage.FCDA__LD_INST:
            return isSetLdInst();
        case SclPackage.FCDA__LN_CLASS:
            return isSetLnClass();
        case SclPackage.FCDA__LN_INST:
            return isSetLnInst();
        case SclPackage.FCDA__PREFIX:
            return isSetPrefix();
        case SclPackage.FCDA__PARENT_DATA_SET:
            return getParentDataSet() != null;
        case SclPackage.FCDA__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE:
            return isSetRefersToAbstractDataAttribute();
        case SclPackage.FCDA__ORD_NB:
            return getOrdNb() != ORD_NB_EDEFAULT;
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
        result.append( " (daName: " );
        if( daNameESet ) {
            result.append( daName );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", doName: " );
        if( doNameESet ) {
            result.append( doName );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", fc: " );
        if( fcESet ) {
            result.append( fc );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", ix: " );
        if( ixESet ) {
            result.append( ix );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", ldInst: " );
        if( ldInstESet ) {
            result.append( ldInst );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", lnClass: " );
        if( lnClassESet ) {
            result.append( lnClass );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", lnInst: " );
        if( lnInstESet ) {
            result.append( lnInst );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", prefix: " );
        if( prefixESet ) {
            result.append( prefix );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

    @Override
    protected void doBuildExplicitLinks( @NonNull IRiseClipseConsole console ) {
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(), "FCDAImpl.doBuildExplicitLinks()" );

        //@formatter:off

        // see Issue #13
        super.doBuildExplicitLinks( console );

        // ldInst   The LD where the DO resides; shall always be specified except for GSSE
        // prefix   Prefix identifying together with lnInst and lnClass the LN where the DO resides; optional, default value is the empty string
        // lnClass  LN class of the LN where the DO resides; shall always be specified except for GSSE DataLabel empty string
        // lnInst   Instance number of the LN where the DO resides; shall be specified except for LLN0
        // doName   A name identifying the DO (within the LN). A name standardized in IEC 61850-7-4. If doName is empty, then fc can contain a value,
        //          selecting the attribute category of all DOs of the defined LN. For elements or parts of structured data object types, all name parts
        //          are contained, separated by dots (.), down to (but without) the level where the fc is defined. If an SDO array element is selected,
        //          the appropriate name part shall contain at its end before a possible dot the array element number in the form (ArrayElementNumber).
        // daName   The attribute name – if missing, all attributes with functional characteristic given by fc are selected. For elements or parts of
        //          structured data types, all name parts are contained, separated by dots (.), starting at the level where the fc is defined. If an
        //          attribute’s array element is selected, the appropriate attribute name part shall contain at its end before any separating dot the
        //          array element number in the form (ArrayElementNumber).
        // fc       All attributes of this functional constraint are selected. Possible constraint values see IEC 61850-7-2 or the fc definition in 9.5
        // ix       An index to select an array element in case that one of the data elements is an array. The ix value shall be identical to the
        //          ArrayElementNumber value in the doName or daName part.

        String messagePrefix = "while resolving link from FCDA: ";

        if( ( getLdInst() == null ) || getLdInst().isEmpty() || ( getLnClass() == null ) || getLnClass().isEmpty() ) {
            // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
            //                  messagePrefix, "lnClass is missing" );
            return;
        }
        if( ( getDoName() == null ) || getDoName().isEmpty() ) {
            // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
            //                  messagePrefix, "doName is missing" );
            return;
        }

        // The LN we are looking for is in the same IED/Server
        EObject object = this;
        while( ( object != null ) && !( object instanceof AccessPoint ) ) {
            object = object.eContainer();
        }
        if( object == null ) {
            // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
            //                  messagePrefix, "AccessPoint not found" );
            return;
        }
        AccessPoint ap = ( AccessPoint ) object;
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                         messagePrefix, "found Server on line ", ap.getServer().getLineNumber() );

        Pair< LDevice, Integer > lDevice = SclUtilities.getLDevice( ap, getLdInst() );
        if( lDevice.getLeft() == null ) {
            // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
            //         messagePrefix, (( lDevice.getRight() == 0 ) ? "cannot find" : "found several" ),
            //         " LDevice( inst = ", getLdInst(), " )" );
            return;
        }
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                         messagePrefix, "found LDevice( inst = ", getLdInst(), " ) on line ",
                         lDevice.getLeft().getLineNumber() );

        Pair< AnyLN, Integer > anyLN = SclUtilities.getAnyLN( lDevice.getLeft(), getLnClass(), getLnInst(),
                getPrefix() );
        String mess = " LN( lnClass = " + getLnClass();
        if( getLnInst() != null ) {
            mess += ", inst = " + getLnInst();
            if( getPrefix() != "" ) {
                mess += ", prefix = " + getPrefix();
            }
        }
        mess += " )";
        if( anyLN.getLeft() == null ) {
            // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
            //         messagePrefix, (( anyLN.getRight() == 0 ) ? "cannot find" : "found several" ),
            //         mess );
            return;
        }
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                         messagePrefix, "found ", mess, " on line ", anyLN.getLeft().getLineNumber() );
        anyLN.getLeft().buildExplicitLinks( console, false );

        if( anyLN.getLeft().getRefersToLNodeType() == null ) {
            return;
        }
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                         messagePrefix, "found LNodeType on line ",
                         anyLN.getLeft().getRefersToLNodeType().getLineNumber() );

        // doName and daName are structured using . as separator
        // The first doName let us find the DO inside the LNodeType
        // referred by the LN
        // The type attribute of the DO give us the DOType with its id attribute
        // If doName is simple, use daName to find the DA in the DOType
        // If doName is structured, find the SDO and its DOType using remaining doName

        final String[] doNames = getDoName().split( "\\.", -1 );
        List< DO > res1 =
                 anyLN
                .getLeft()
                .getRefersToLNodeType()
                .getDO()
                .stream()
                .filter( do2 -> doNames[0].equals( do2.getName() ) )
                .collect( Collectors.toList() );

        if( res1.size() != 1 ) {
            // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
            //                  messagePrefix, (( res1.size() == 0 ) ? "cannot find" : "found several" ),
            //                  " DO ( name = ", doNames[0], " )" );
            return;
        }
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                         messagePrefix, "found DO ( name = ", doNames[0], " ) on line ",
                         res1.get( 0 ).getLineNumber() );

        res1.get( 0 ).buildExplicitLinks( console, false );
        DOType doType = res1.get( 0 ).getRefersToDOType();
        // No error or warning message here: if this happens, error should have been detected before
        if( doType == null ) {
            return;
        }
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                         messagePrefix, "found DOType on line ", doType.getLineNumber() );

        for( int i = 1; i < doNames.length; ++i ) {
            String name = doNames[i];
            List< SDO > res2 =
                     doType
                    .getSDO()
                    .stream()
                    .filter( sdo -> name.equals( sdo.getName() ) )
                    .collect( Collectors.toList() );

            if( res2.size() != 1 ) {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, (( res2.size() == 0 ) ? "cannot find" : "found several" ),
                //         "SDO ( name = ", name, " ) in DOType on line ", doType.getLineNumber() );
                return;
            }
            console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                             messagePrefix, "found SDO ( name = ", name, " ) in DOType (on line ",
                             doType.getLineNumber(), ") on line ", res2.get( 0 ).getLineNumber() );

            res2.get( 0 ).buildExplicitLinks( console, false );
            doType = res2.get( 0 ).getRefersToDOType();
            if( doType == null ) {
                return;
            }
            console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                             messagePrefix, "found DOType on line ", doType.getLineNumber() );
        }

        AbstractDataAttribute attributeLookedFor = null;

        if( getDaName() != null ) {
            final String[] daNames = getDaName().split( "\\.", -1 );
            // The first daName gives us the DA or SDO inside the DOType
            // If daName is structured, find the DAType/DOType and its SDO/DA/BDA using remaining daName

            for( String name : daNames ) {
                if( doType != null ) {
                    List< SDO > res3 =
                             doType
                            .getSDO()
                            .stream()
                            .filter( sdo -> sdo.getName().equals( name ) )
                            .collect( Collectors.toList() );

                    if( res3.size() == 1 ) {
                        res3.get( 0 ).buildExplicitLinks( console, false );
                        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                                         messagePrefix, "found SDO ( name = ", name, " ) in DOType on line ",
                                         res3.get( 0 ).getLineNumber() );
                        doType = res3.get( 0 ).getRefersToDOType();
                        if( doType == null ) {
                            return;
                        }
                        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                                         messagePrefix, "found DOType on line ", doType.getLineNumber() );
                        continue;
                    }

                    List< DA > res4 =
                            doType
                           .getDA()
                           .stream()
                           .filter( da -> da.getName().equals( name ) )
                           .collect( Collectors.toList() );

                    if( res4.size() == 1 ) {
                        attributeLookedFor = res4.get( 0 );
                        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                                         messagePrefix, "found DA ( name = ", name, " ) in DOType on line ",
                                         attributeLookedFor.getLineNumber() );
                        doType = null;
                        continue;
                    }

                    // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    //                  messagePrefix, (( res4.size() == 0 ) ? "cannot find" : "found several" ),
                    //                  " DA or SDO ( name = ", name, " ) in DOType" );
                    return;
                }

                if( attributeLookedFor != null ) {
                    attributeLookedFor.buildExplicitLinks( console, false );

                    List< BDA > res5 =
                            attributeLookedFor
                           .getRefersToDAType()
                           .getBDA()
                           .stream()
                           .filter( bda -> name.equals( bda.getName() ) )
                           .collect( Collectors.toList() );

                   if( res5.size() != 1 ) {
                       // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                       //                  messagePrefix, (( res5.size() == 0 ) ? "cannot find" : "found several" ),
                       //                  "BDA ( name = ", name, " ) in DAType on line ",
                       //                  attributeLookedFor.getRefersToDAType().getLineNumber() );
                       return;
                   }
                   console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                                    messagePrefix, "found BDA ( name = ", name, " ) in DAType (on line ",
                                            attributeLookedFor.getRefersToDAType().getLineNumber(),
                                            ") on line ", res5.get( 0 ).getLineNumber() );
                   attributeLookedFor = res5.get( 0 );
                   continue;
                }

                // We should never get there
                console.emergency( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                               "Unexpected error in FCDA.doBuildExplicitLinks()" );
                return;
            }
        }

        if((( doType == null ) && ( attributeLookedFor == null )) || (( doType != null ) && ( attributeLookedFor != null ))) {
            console.emergency( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                           "Unexpected state in FCDA.doBuildExplicitLinks()" );
            return;
        }

        if( attributeLookedFor != null ) {
            // TODO: do we have to check if fc is right ?
            // TODO: ix is ignored !

            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                          "FCDA refers to AbstractDataAttribute ( name = ",
                          attributeLookedFor.getName(), " ) on line ", attributeLookedFor.getLineNumber() );
            getRefersToAbstractDataAttribute().add( attributeLookedFor );
            return;
        }

        // All attributes with functional characteristic given by fc are selected.
        if( getFc() == null ) {
            return;
        }
        
        getRefersToAbstractDataAttribute().addAll( getAllDAInDOTypeWithFC( doType, getFc(), console ));
        
        if( getRefersToAbstractDataAttribute().size() == 0 ) {
            if( getFc().equals( FCEnum.SG )) {
                // Issue #66: if fc="SG" in FCDA, look for AbstractDataAttribute with fc="SE"
                getRefersToAbstractDataAttribute().addAll( getAllDAInDOTypeWithFC( doType, FCEnum.SE, console ));
            }
        }

        if( getRefersToAbstractDataAttribute().size() > 0 ) {
            for( AbstractDataAttribute a : getRefersToAbstractDataAttribute() ) {
                console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                              "FCDA refers to AbstractDataAttribute ( name = ", a.getName(), " ) on line ",
                              a.getLineNumber() );
            }
        }
        else {
            // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
            //                  "FCDA does not refer to any AbstractDataAttribute" );
        }

        //@formatter:on
    }

    private Set< DA > getAllDAInDOTypeWithFC( @NonNull DOType doType, @NonNull FCEnum fc,
            @NonNull IRiseClipseConsole console ) {
        //@formatter:off

        Set< DA > das = new HashSet<>();

        doType
                .getDA()
                .stream()
                .filter( da -> fc.equals( da.getFc() ))
                .collect( Collectors.toCollection( () -> das ));

        doType
                .getSDO()
                .stream()
                .forEach( sdo -> sdo.buildExplicitLinks( console, false ));

        doType
                .getSDO()
                .stream()
                .map( sdo -> sdo.getRefersToDOType() )
                .distinct()
                .filter( dot -> dot != null )
                .forEach( dot -> {
                    dot.buildExplicitLinks( console, false );
                    das.addAll( getAllDAInDOTypeWithFC( dot, fc, console ));
                });

        return das;

        //@formatter:on
    }

    @Override
    public String getXpath() {
        String prefixXpath = "";
        if( !getPrefix().isEmpty() ) {
            prefixXpath = "[@prefix='" + getPrefix() + "']";
        }
        String ldInstXpath = "";
        if( isSetLdInst() ) {
            ldInstXpath = "[@ldInst='" + getLdInst() + "']";
        }
        String lnClassXpath = "";
        if( isSetLnClass() ) {
            lnClassXpath = "[@lnClass='" + getLnClass() + "']";
        }
        String lnInstXpath = "";
        if( isSetLnInst() ) {
            lnInstXpath = "[@lnInst='" + getLnInst() + "']";
        }
        String doNameXpath = "";
        if( isSetDoName() ) {
            doNameXpath = "[@doName='" + getDoName() + "']";
        }
        String daNameXpath = "";
        if( isSetDaName() ) {
            daNameXpath = "[@daName='" + getDaName() + "']";
        }
        String fcXpath = "";
        if( isSetFc() ) {
            fcXpath = "[@fc='" + getFc() + "']";
        }
        String ixXpath = "";
        if( isSetIx() ) {
            ixXpath = "[@ix='" + getIx() + "']";
        }
        return getParentDataSet().getXpath() + "/scl:FCDA"
                + ldInstXpath
                + prefixXpath
                + lnClassXpath
                + lnInstXpath
                + doNameXpath
                + daNameXpath
                + fcXpath
                + ixXpath;
    }

} //FCDAImpl
