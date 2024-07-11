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

import org.apache.commons.lang3.tuple.Pair;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AgDesc;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AgLDRef;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AgLNRef;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Association;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AssociationKindEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IED;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Server;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclUtilities;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AssociationImpl#getDesc <em>Desc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AssociationImpl#getIedName <em>Ied Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AssociationImpl#getLdInst <em>Ld Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AssociationImpl#getLnClass <em>Ln Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AssociationImpl#getLnInst <em>Ln Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AssociationImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AssociationImpl#getAssociationID <em>Association ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AssociationImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AssociationImpl#getParentServer <em>Parent Server</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AssociationImpl#getRefersToAnyLN <em>Refers To Any LN</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationImpl extends BaseElementImpl implements Association {
    /**
     * The default value of the '{@link #getDesc() <em>Desc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDesc()
     * @generated
     * @ordered
     */
    protected static final String DESC_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getDesc() <em>Desc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDesc()
     * @generated
     * @ordered
     */
    protected String desc = DESC_EDEFAULT;

    /**
     * This is true if the Desc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean descESet;

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
     * The default value of the '{@link #getAssociationID() <em>Association ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssociationID()
     * @generated
     * @ordered
     */
    protected static final String ASSOCIATION_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAssociationID() <em>Association ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssociationID()
     * @generated
     * @ordered
     */
    protected String associationID = ASSOCIATION_ID_EDEFAULT;

    /**
     * This is true if the Association ID attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean associationIDESet;

    /**
     * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated NOT because there is no default value in SCL
     * @ordered
     */
    protected static final AssociationKindEnum KIND_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected AssociationKindEnum kind = KIND_EDEFAULT;

    /**
     * This is true if the Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kindESet;

    /**
     * The cached value of the '{@link #getRefersToAnyLN() <em>Refers To Any LN</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToAnyLN()
     * @generated
     * @ordered
     */
    protected AnyLN refersToAnyLN;

    /**
     * This is true if the Refers To Any LN reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToAnyLNESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AssociationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getAssociation();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDesc() {
        return desc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDesc( String newDesc ) {
        String oldDesc = desc;
        desc = newDesc;
        boolean oldDescESet = descESet;
        descESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.ASSOCIATION__DESC, oldDesc, desc,
                    !oldDescESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDesc() {
        String oldDesc = desc;
        boolean oldDescESet = descESet;
        desc = DESC_EDEFAULT;
        descESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.ASSOCIATION__DESC, oldDesc,
                    DESC_EDEFAULT, oldDescESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDesc() {
        return descESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getAssociationID() {
        return associationID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAssociationID( String newAssociationID ) {
        String oldAssociationID = associationID;
        associationID = newAssociationID;
        boolean oldAssociationIDESet = associationIDESet;
        associationIDESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.ASSOCIATION__ASSOCIATION_ID,
                    oldAssociationID, associationID, !oldAssociationIDESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAssociationID() {
        String oldAssociationID = associationID;
        boolean oldAssociationIDESet = associationIDESet;
        associationID = ASSOCIATION_ID_EDEFAULT;
        associationIDESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.ASSOCIATION__ASSOCIATION_ID,
                    oldAssociationID, ASSOCIATION_ID_EDEFAULT, oldAssociationIDESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAssociationID() {
        return associationIDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getIedName() {
        return iedName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIedName( String newIedName ) {
        String oldIedName = iedName;
        iedName = newIedName;
        boolean oldIedNameESet = iedNameESet;
        iedNameESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.ASSOCIATION__IED_NAME, oldIedName,
                    iedName, !oldIedNameESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIedName() {
        String oldIedName = iedName;
        boolean oldIedNameESet = iedNameESet;
        iedName = IED_NAME_EDEFAULT;
        iedNameESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.ASSOCIATION__IED_NAME, oldIedName,
                    IED_NAME_EDEFAULT, oldIedNameESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIedName() {
        return iedNameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssociationKindEnum getKind() {
        return kind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKind( AssociationKindEnum newKind ) {
        AssociationKindEnum oldKind = kind;
        kind = newKind == null ? KIND_EDEFAULT : newKind;
        boolean oldKindESet = kindESet;
        kindESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.ASSOCIATION__KIND, oldKind, kind,
                    !oldKindESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKind() {
        AssociationKindEnum oldKind = kind;
        boolean oldKindESet = kindESet;
        kind = KIND_EDEFAULT;
        kindESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.ASSOCIATION__KIND, oldKind,
                    KIND_EDEFAULT, oldKindESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKind() {
        return kindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Server getParentServer() {
        if( eContainerFeatureID() != SclPackage.ASSOCIATION__PARENT_SERVER ) {
            return null;
        }
        return ( Server ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentServer( Server newParentServer, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentServer, SclPackage.ASSOCIATION__PARENT_SERVER, msgs );
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
                || ( eContainerFeatureID() != SclPackage.ASSOCIATION__PARENT_SERVER && newParentServer != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentServer ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentServer != null ) {
                msgs = ( ( InternalEObject ) newParentServer ).eInverseAdd( this, SclPackage.SERVER__ASSOCIATION,
                        Server.class, msgs );
            }
            msgs = basicSetParentServer( newParentServer, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.ASSOCIATION__PARENT_SERVER,
                    newParentServer, newParentServer ) );
        }
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
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.ASSOCIATION__LD_INST, oldLdInst, ldInst,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.ASSOCIATION__LD_INST, oldLdInst,
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
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.ASSOCIATION__LN_CLASS, oldLnClass,
                    lnClass, !oldLnClassESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.ASSOCIATION__LN_CLASS, oldLnClass,
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
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.ASSOCIATION__LN_INST, oldLnInst, lnInst,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.ASSOCIATION__LN_INST, oldLnInst,
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
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.ASSOCIATION__PREFIX, oldPrefix, prefix,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.ASSOCIATION__PREFIX, oldPrefix,
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
    public AnyLN getRefersToAnyLN() {
        return refersToAnyLN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToAnyLN( AnyLN newRefersToAnyLN, NotificationChain msgs ) {
        AnyLN oldRefersToAnyLN = refersToAnyLN;
        refersToAnyLN = newRefersToAnyLN;
        boolean oldRefersToAnyLNESet = refersToAnyLNESet;
        refersToAnyLNESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    SclPackage.ASSOCIATION__REFERS_TO_ANY_LN, oldRefersToAnyLN, newRefersToAnyLN,
                    !oldRefersToAnyLNESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRefersToAnyLN( AnyLN newRefersToAnyLN ) {
        if( newRefersToAnyLN != refersToAnyLN ) {
            NotificationChain msgs = null;
            if( refersToAnyLN != null ) {
                msgs = ( ( InternalEObject ) refersToAnyLN ).eInverseRemove( this,
                        SclPackage.ANY_LN__REFERRED_BY_ASSOCIATION, AnyLN.class, msgs );
            }
            if( newRefersToAnyLN != null ) {
                msgs = ( ( InternalEObject ) newRefersToAnyLN ).eInverseAdd( this,
                        SclPackage.ANY_LN__REFERRED_BY_ASSOCIATION, AnyLN.class, msgs );
            }
            msgs = basicSetRefersToAnyLN( newRefersToAnyLN, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToAnyLNESet = refersToAnyLNESet;
            refersToAnyLNESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.ASSOCIATION__REFERS_TO_ANY_LN,
                        newRefersToAnyLN, newRefersToAnyLN, !oldRefersToAnyLNESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToAnyLN( NotificationChain msgs ) {
        AnyLN oldRefersToAnyLN = refersToAnyLN;
        refersToAnyLN = null;
        boolean oldRefersToAnyLNESet = refersToAnyLNESet;
        refersToAnyLNESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    SclPackage.ASSOCIATION__REFERS_TO_ANY_LN, oldRefersToAnyLN, null, oldRefersToAnyLNESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRefersToAnyLN() {
        if( refersToAnyLN != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToAnyLN ).eInverseRemove( this,
                    SclPackage.ANY_LN__REFERRED_BY_ASSOCIATION, AnyLN.class, msgs );
            msgs = basicUnsetRefersToAnyLN( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToAnyLNESet = refersToAnyLNESet;
            refersToAnyLNESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.ASSOCIATION__REFERS_TO_ANY_LN,
                        null, null, oldRefersToAnyLNESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToAnyLN() {
        return refersToAnyLNESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case SclPackage.ASSOCIATION__PARENT_SERVER:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentServer( ( Server ) otherEnd, msgs );
        case SclPackage.ASSOCIATION__REFERS_TO_ANY_LN:
            if( refersToAnyLN != null ) {
                msgs = ( ( InternalEObject ) refersToAnyLN ).eInverseRemove( this,
                        SclPackage.ANY_LN__REFERRED_BY_ASSOCIATION, AnyLN.class, msgs );
            }
            return basicSetRefersToAnyLN( ( AnyLN ) otherEnd, msgs );
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
        case SclPackage.ASSOCIATION__PARENT_SERVER:
            return basicSetParentServer( null, msgs );
        case SclPackage.ASSOCIATION__REFERS_TO_ANY_LN:
            return basicUnsetRefersToAnyLN( msgs );
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
        case SclPackage.ASSOCIATION__PARENT_SERVER:
            return eInternalContainer().eInverseRemove( this, SclPackage.SERVER__ASSOCIATION, Server.class, msgs );
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
        case SclPackage.ASSOCIATION__DESC:
            return getDesc();
        case SclPackage.ASSOCIATION__IED_NAME:
            return getIedName();
        case SclPackage.ASSOCIATION__LD_INST:
            return getLdInst();
        case SclPackage.ASSOCIATION__LN_CLASS:
            return getLnClass();
        case SclPackage.ASSOCIATION__LN_INST:
            return getLnInst();
        case SclPackage.ASSOCIATION__PREFIX:
            return getPrefix();
        case SclPackage.ASSOCIATION__ASSOCIATION_ID:
            return getAssociationID();
        case SclPackage.ASSOCIATION__KIND:
            return getKind();
        case SclPackage.ASSOCIATION__PARENT_SERVER:
            return getParentServer();
        case SclPackage.ASSOCIATION__REFERS_TO_ANY_LN:
            return getRefersToAnyLN();
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
        case SclPackage.ASSOCIATION__DESC:
            setDesc( ( String ) newValue );
            return;
        case SclPackage.ASSOCIATION__IED_NAME:
            setIedName( ( String ) newValue );
            return;
        case SclPackage.ASSOCIATION__LD_INST:
            setLdInst( ( String ) newValue );
            return;
        case SclPackage.ASSOCIATION__LN_CLASS:
            setLnClass( ( String ) newValue );
            return;
        case SclPackage.ASSOCIATION__LN_INST:
            setLnInst( ( String ) newValue );
            return;
        case SclPackage.ASSOCIATION__PREFIX:
            setPrefix( ( String ) newValue );
            return;
        case SclPackage.ASSOCIATION__ASSOCIATION_ID:
            setAssociationID( ( String ) newValue );
            return;
        case SclPackage.ASSOCIATION__KIND:
            setKind( ( AssociationKindEnum ) newValue );
            return;
        case SclPackage.ASSOCIATION__PARENT_SERVER:
            setParentServer( ( Server ) newValue );
            return;
        case SclPackage.ASSOCIATION__REFERS_TO_ANY_LN:
            setRefersToAnyLN( ( AnyLN ) newValue );
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
        case SclPackage.ASSOCIATION__DESC:
            unsetDesc();
            return;
        case SclPackage.ASSOCIATION__IED_NAME:
            unsetIedName();
            return;
        case SclPackage.ASSOCIATION__LD_INST:
            unsetLdInst();
            return;
        case SclPackage.ASSOCIATION__LN_CLASS:
            unsetLnClass();
            return;
        case SclPackage.ASSOCIATION__LN_INST:
            unsetLnInst();
            return;
        case SclPackage.ASSOCIATION__PREFIX:
            unsetPrefix();
            return;
        case SclPackage.ASSOCIATION__ASSOCIATION_ID:
            unsetAssociationID();
            return;
        case SclPackage.ASSOCIATION__KIND:
            unsetKind();
            return;
        case SclPackage.ASSOCIATION__PARENT_SERVER:
            setParentServer( ( Server ) null );
            return;
        case SclPackage.ASSOCIATION__REFERS_TO_ANY_LN:
            unsetRefersToAnyLN();
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
        case SclPackage.ASSOCIATION__DESC:
            return isSetDesc();
        case SclPackage.ASSOCIATION__IED_NAME:
            return isSetIedName();
        case SclPackage.ASSOCIATION__LD_INST:
            return isSetLdInst();
        case SclPackage.ASSOCIATION__LN_CLASS:
            return isSetLnClass();
        case SclPackage.ASSOCIATION__LN_INST:
            return isSetLnInst();
        case SclPackage.ASSOCIATION__PREFIX:
            return isSetPrefix();
        case SclPackage.ASSOCIATION__ASSOCIATION_ID:
            return isSetAssociationID();
        case SclPackage.ASSOCIATION__KIND:
            return isSetKind();
        case SclPackage.ASSOCIATION__PARENT_SERVER:
            return getParentServer() != null;
        case SclPackage.ASSOCIATION__REFERS_TO_ANY_LN:
            return isSetRefersToAnyLN();
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
        if( baseClass == AgDesc.class ) {
            switch( derivedFeatureID ) {
            case SclPackage.ASSOCIATION__DESC:
                return SclPackage.AG_DESC__DESC;
            default:
                return -1;
            }
        }
        if( baseClass == AgLDRef.class ) {
            switch( derivedFeatureID ) {
            case SclPackage.ASSOCIATION__IED_NAME:
                return SclPackage.AG_LD_REF__IED_NAME;
            case SclPackage.ASSOCIATION__LD_INST:
                return SclPackage.AG_LD_REF__LD_INST;
            default:
                return -1;
            }
        }
        if( baseClass == AgLNRef.class ) {
            switch( derivedFeatureID ) {
            case SclPackage.ASSOCIATION__LN_CLASS:
                return SclPackage.AG_LN_REF__LN_CLASS;
            case SclPackage.ASSOCIATION__LN_INST:
                return SclPackage.AG_LN_REF__LN_INST;
            case SclPackage.ASSOCIATION__PREFIX:
                return SclPackage.AG_LN_REF__PREFIX;
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
        if( baseClass == AgDesc.class ) {
            switch( baseFeatureID ) {
            case SclPackage.AG_DESC__DESC:
                return SclPackage.ASSOCIATION__DESC;
            default:
                return -1;
            }
        }
        if( baseClass == AgLDRef.class ) {
            switch( baseFeatureID ) {
            case SclPackage.AG_LD_REF__IED_NAME:
                return SclPackage.ASSOCIATION__IED_NAME;
            case SclPackage.AG_LD_REF__LD_INST:
                return SclPackage.ASSOCIATION__LD_INST;
            default:
                return -1;
            }
        }
        if( baseClass == AgLNRef.class ) {
            switch( baseFeatureID ) {
            case SclPackage.AG_LN_REF__LN_CLASS:
                return SclPackage.ASSOCIATION__LN_CLASS;
            case SclPackage.AG_LN_REF__LN_INST:
                return SclPackage.ASSOCIATION__LN_INST;
            case SclPackage.AG_LN_REF__PREFIX:
                return SclPackage.ASSOCIATION__PREFIX;
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
        if( eIsProxy() ) {
            return super.toString();
        }

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (desc: " );
        if( descESet ) {
            result.append( desc );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", iedName: " );
        if( iedNameESet ) {
            result.append( iedName );
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
        result.append( ", associationID: " );
        if( associationIDESet ) {
            result.append( associationID );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", kind: " );
        if( kindESet ) {
            result.append( kind );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

    @Override
    protected void doBuildExplicitLinks( @NonNull IRiseClipseConsole console ) {
        //@formatter:off

        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                "AssociationImpl.doBuildExplicitLinks()" );

        // see Issue #13
        super.doBuildExplicitLinks( console );

        // kind            The kind of pre-configured association, pre-established or predefined
        // associationID   The identification of a pre-configured association (otherwise empty)
        // iedName         The reference identifying the IED on which the client resides
        // ldInst          The reference to the client logical device
        // lnClass         The class of the client LN
        // prefix          The LN prefix
        // lnInst          The instance number of the client LN

        String messagePrefix = "while resolving link from Association: ";

        if( ( getIedName() == null ) || getIedName().isEmpty() ) {
            // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
            //         messagePrefix, "iedName is missing " );
            return;
        }
        if( ( getLdInst() == null ) || getLdInst().isEmpty() ) {
            // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
            //         messagePrefix, "ldInst is missing " );
            return;
        }
        if( ( getLnClass() == null ) || getLnClass().isEmpty() ) {
            // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
            //         messagePrefix, "lnClass is missing " );
            return;
        }

        // find an IED with
        //   IED.name == Association.iedName
        Pair< IED, Integer > ied = SclUtilities.getIED( SclUtilities.getSCL( this ), getIedName() );
        if( ied.getLeft() == null ) {
            // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
            //         messagePrefix, ( ( ied.getRight() == 0 ) ? "cannot find" : "found several" ),
            //         " IED( name = ", getIedName(), " )" );
            return;
        }
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                messagePrefix, "found IED( name = ", getIedName(), " ) on line ",
                ied.getLeft().getLineNumber() );

        // find inside an LDevice with
        //   LDevice.name == Association.ldInst
        Pair< LDevice, Integer > lDevice = SclUtilities.getLDevice( ied.getLeft(), getLdInst() );
        if( lDevice.getLeft() == null ) {
            // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
            //         messagePrefix, ( ( lDevice.getRight() == 0 ) ? "cannot find" : "found several" ),
            //         " LDevice( inst = ", getLdInst(), " )" );
            return;
        }
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                messagePrefix, "found ", "LDevice( inst = ", getLdInst(), " )", " on line ",
                lDevice.getLeft().getLineNumber() );

        Pair< AnyLN, Integer > anyLN = SclUtilities.getAnyLN( lDevice.getLeft(), getLnClass(), getLnInst(),
                getPrefix() );
        String mess = "LN( lnClass = " + getLnClass();
        if( getLnInst() != null ) {
            mess += ", inst = " + getLnInst();
            if( getPrefix() != "" ) {
                mess += ", prefix = " + getPrefix();
            }
        }
        mess += " )";
        if( anyLN.getLeft() == null ) {
            // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
            //         messagePrefix, ( ( anyLN.getRight() == 0 ) ? "cannot find" : "found several" ), mess );
            return;
        }
        setRefersToAnyLN( anyLN.getLeft() );
        console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                "Association refers to ", mess, " on line ",
                getRefersToAnyLN().getLineNumber() );

        //@formatter:on
    }

} //AssociationImpl
