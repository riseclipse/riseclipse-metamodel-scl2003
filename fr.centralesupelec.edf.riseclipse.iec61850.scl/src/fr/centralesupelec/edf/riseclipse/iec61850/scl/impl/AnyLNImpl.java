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

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.jdt.annotation.NonNull;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Association;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientLN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSet;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDName;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.INamespaceGetter;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Inputs;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Log;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LogControl;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclUtilities;
import fr.centralesupelec.edf.riseclipse.util.AbstractRiseClipseConsole;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Any LN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AnyLNImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AnyLNImpl#getInst <em>Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AnyLNImpl#getLnClass <em>Ln Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AnyLNImpl#getLnType <em>Ln Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AnyLNImpl#getRefersToLNodeType <em>Refers To LNode Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AnyLNImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AnyLNImpl#getLog <em>Log</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AnyLNImpl#getDOI <em>DOI</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AnyLNImpl#getReportControl <em>Report Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AnyLNImpl#getLogControl <em>Log Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AnyLNImpl#getDataSet <em>Data Set</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AnyLNImpl#getReferredByClientLN <em>Referred By Client LN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AnyLNImpl#getReferredByAssociation <em>Referred By Association</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AnyLNImpl#getReferredByIEDName <em>Referred By IED Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AnyLNImpl#getReferredByLNode <em>Referred By LNode</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AnyLNImpl extends UnNamingImpl implements AnyLN {
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
     * The default value of the '{@link #getLnType() <em>Ln Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLnType()
     * @generated
     * @ordered
     */
    protected static final String LN_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLnType() <em>Ln Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLnType()
     * @generated
     * @ordered
     */
    protected String lnType = LN_TYPE_EDEFAULT;

    /**
     * This is true if the Ln Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lnTypeESet;

    /**
     * The cached value of the '{@link #getRefersToLNodeType() <em>Refers To LNode Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToLNodeType()
     * @generated
     * @ordered
     */
    protected LNodeType refersToLNodeType;

    /**
     * This is true if the Refers To LNode Type reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToLNodeTypeESet;

    /**
     * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInputs()
     * @generated
     * @ordered
     */
    protected Inputs inputs;

    /**
     * This is true if the Inputs containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean inputsESet;

    /**
     * The cached value of the '{@link #getLog() <em>Log</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLog()
     * @generated
     * @ordered
     */
    protected EList< Log > log;

    /**
     * The cached value of the '{@link #getDOI() <em>DOI</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDOI()
     * @generated
     * @ordered
     */
    protected EList< DOI > doi;

    /**
     * The cached value of the '{@link #getReportControl() <em>Report Control</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReportControl()
     * @generated
     * @ordered
     */
    protected EList< ReportControl > reportControl;

    /**
     * The cached value of the '{@link #getLogControl() <em>Log Control</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLogControl()
     * @generated
     * @ordered
     */
    protected EList< LogControl > logControl;

    /**
     * The cached value of the '{@link #getDataSet() <em>Data Set</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataSet()
     * @generated
     * @ordered
     */
    protected EList< DataSet > dataSet;

    /**
     * The cached value of the '{@link #getReferredByClientLN() <em>Referred By Client LN</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByClientLN()
     * @generated
     * @ordered
     */
    protected EList< ClientLN > referredByClientLN;

    /**
     * The cached value of the '{@link #getReferredByAssociation() <em>Referred By Association</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByAssociation()
     * @generated
     * @ordered
     */
    protected EList< Association > referredByAssociation;

    /**
     * The cached value of the '{@link #getReferredByIEDName() <em>Referred By IED Name</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByIEDName()
     * @generated
     * @ordered
     */
    protected EList< IEDName > referredByIEDName;

    /**
     * The cached value of the '{@link #getReferredByLNode() <em>Referred By LNode</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByLNode()
     * @generated
     * @ordered
     */
    protected EList< LNode > referredByLNode;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AnyLNImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getAnyLN();
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.ANY_LN__INST, oldInst, inst,
                    !oldInstESet ) );
        }
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.ANY_LN__INST, oldInst, INST_EDEFAULT,
                    oldInstESet ) );
        }
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
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.ANY_LN__LN_CLASS, oldLnClass, lnClass,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.ANY_LN__LN_CLASS, oldLnClass,
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
    public String getLnType() {
        return lnType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLnType( String newLnType ) {
        String oldLnType = lnType;
        lnType = newLnType;
        boolean oldLnTypeESet = lnTypeESet;
        lnTypeESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.ANY_LN__LN_TYPE, oldLnType, lnType,
                    !oldLnTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLnType() {
        String oldLnType = lnType;
        boolean oldLnTypeESet = lnTypeESet;
        lnType = LN_TYPE_EDEFAULT;
        lnTypeESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.ANY_LN__LN_TYPE, oldLnType,
                    LN_TYPE_EDEFAULT, oldLnTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLnType() {
        return lnTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LNodeType getRefersToLNodeType() {
        return refersToLNodeType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToLNodeType( LNodeType newRefersToLNodeType, NotificationChain msgs ) {
        LNodeType oldRefersToLNodeType = refersToLNodeType;
        refersToLNodeType = newRefersToLNodeType;
        boolean oldRefersToLNodeTypeESet = refersToLNodeTypeESet;
        refersToLNodeTypeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    SclPackage.ANY_LN__REFERS_TO_LNODE_TYPE, oldRefersToLNodeType, newRefersToLNodeType,
                    !oldRefersToLNodeTypeESet );
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
    public void setRefersToLNodeType( LNodeType newRefersToLNodeType ) {
        if( newRefersToLNodeType != refersToLNodeType ) {
            NotificationChain msgs = null;
            if( refersToLNodeType != null ) {
                msgs = ( ( InternalEObject ) refersToLNodeType ).eInverseRemove( this,
                        SclPackage.LNODE_TYPE__REFERRED_BY_ANY_LN, LNodeType.class, msgs );
            }
            if( newRefersToLNodeType != null ) {
                msgs = ( ( InternalEObject ) newRefersToLNodeType ).eInverseAdd( this,
                        SclPackage.LNODE_TYPE__REFERRED_BY_ANY_LN, LNodeType.class, msgs );
            }
            msgs = basicSetRefersToLNodeType( newRefersToLNodeType, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToLNodeTypeESet = refersToLNodeTypeESet;
            refersToLNodeTypeESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.ANY_LN__REFERS_TO_LNODE_TYPE,
                        newRefersToLNodeType, newRefersToLNodeType, !oldRefersToLNodeTypeESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToLNodeType( NotificationChain msgs ) {
        LNodeType oldRefersToLNodeType = refersToLNodeType;
        refersToLNodeType = null;
        boolean oldRefersToLNodeTypeESet = refersToLNodeTypeESet;
        refersToLNodeTypeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    SclPackage.ANY_LN__REFERS_TO_LNODE_TYPE, oldRefersToLNodeType, null, oldRefersToLNodeTypeESet );
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
    public void unsetRefersToLNodeType() {
        if( refersToLNodeType != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToLNodeType ).eInverseRemove( this,
                    SclPackage.LNODE_TYPE__REFERRED_BY_ANY_LN, LNodeType.class, msgs );
            msgs = basicUnsetRefersToLNodeType( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToLNodeTypeESet = refersToLNodeTypeESet;
            refersToLNodeTypeESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.ANY_LN__REFERS_TO_LNODE_TYPE, null,
                        null, oldRefersToLNodeTypeESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToLNodeType() {
        return refersToLNodeTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Inputs getInputs() {
        return inputs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInputs( Inputs newInputs, NotificationChain msgs ) {
        Inputs oldInputs = inputs;
        inputs = newInputs;
        boolean oldInputsESet = inputsESet;
        inputsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, SclPackage.ANY_LN__INPUTS,
                    oldInputs, newInputs, !oldInputsESet );
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
    public void setInputs( Inputs newInputs ) {
        if( newInputs != inputs ) {
            NotificationChain msgs = null;
            if( inputs != null ) {
                msgs = ( ( InternalEObject ) inputs ).eInverseRemove( this, SclPackage.INPUTS__PARENT_ANY_LN,
                        Inputs.class, msgs );
            }
            if( newInputs != null ) {
                msgs = ( ( InternalEObject ) newInputs ).eInverseAdd( this, SclPackage.INPUTS__PARENT_ANY_LN,
                        Inputs.class, msgs );
            }
            msgs = basicSetInputs( newInputs, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldInputsESet = inputsESet;
            inputsESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.ANY_LN__INPUTS, newInputs, newInputs,
                        !oldInputsESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetInputs( NotificationChain msgs ) {
        Inputs oldInputs = inputs;
        inputs = null;
        boolean oldInputsESet = inputsESet;
        inputsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET, SclPackage.ANY_LN__INPUTS,
                    oldInputs, null, oldInputsESet );
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
    public void unsetInputs() {
        if( inputs != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) inputs ).eInverseRemove( this, SclPackage.INPUTS__PARENT_ANY_LN, Inputs.class,
                    msgs );
            msgs = basicUnsetInputs( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldInputsESet = inputsESet;
            inputsESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.ANY_LN__INPUTS, null, null,
                        oldInputsESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInputs() {
        return inputsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Log > getLog() {
        if( log == null ) {
            log = new EObjectContainmentWithInverseEList.Unsettable< >( Log.class, this, SclPackage.ANY_LN__LOG,
                    SclPackage.LOG__PARENT_ANY_LN );
        }
        return log;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLog() {
        if( log != null ) {
            ( ( InternalEList.Unsettable< ? > ) log ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLog() {
        return log != null && ( ( InternalEList.Unsettable< ? > ) log ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< DOI > getDOI() {
        if( doi == null ) {
            doi = new EObjectContainmentWithInverseEList.Unsettable< >( DOI.class, this, SclPackage.ANY_LN__DOI,
                    SclPackage.DOI__PARENT_ANY_LN );
        }
        return doi;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDOI() {
        if( doi != null ) {
            ( ( InternalEList.Unsettable< ? > ) doi ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDOI() {
        return doi != null && ( ( InternalEList.Unsettable< ? > ) doi ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ReportControl > getReportControl() {
        if( reportControl == null ) {
            reportControl = new EObjectContainmentWithInverseEList.Unsettable< >( ReportControl.class,
                    this, SclPackage.ANY_LN__REPORT_CONTROL, SclPackage.REPORT_CONTROL__PARENT_ANY_LN );
        }
        return reportControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReportControl() {
        if( reportControl != null ) {
            ( ( InternalEList.Unsettable< ? > ) reportControl ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReportControl() {
        return reportControl != null && ( ( InternalEList.Unsettable< ? > ) reportControl ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< LogControl > getLogControl() {
        if( logControl == null ) {
            logControl = new EObjectContainmentWithInverseEList.Unsettable< >( LogControl.class, this,
                    SclPackage.ANY_LN__LOG_CONTROL, SclPackage.LOG_CONTROL__PARENT_ANY_LN );
        }
        return logControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLogControl() {
        if( logControl != null ) {
            ( ( InternalEList.Unsettable< ? > ) logControl ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLogControl() {
        return logControl != null && ( ( InternalEList.Unsettable< ? > ) logControl ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< DataSet > getDataSet() {
        if( dataSet == null ) {
            dataSet = new EObjectContainmentWithInverseEList.Unsettable< >( DataSet.class, this,
                    SclPackage.ANY_LN__DATA_SET, SclPackage.DATA_SET__PARENT_ANY_LN );
        }
        return dataSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDataSet() {
        if( dataSet != null ) {
            ( ( InternalEList.Unsettable< ? > ) dataSet ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDataSet() {
        return dataSet != null && ( ( InternalEList.Unsettable< ? > ) dataSet ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ClientLN > getReferredByClientLN() {
        if( referredByClientLN == null ) {
            referredByClientLN = new EObjectWithInverseEList.Unsettable< >( ClientLN.class, this,
                    SclPackage.ANY_LN__REFERRED_BY_CLIENT_LN, SclPackage.CLIENT_LN__REFERS_TO_ANY_LN );
        }
        return referredByClientLN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByClientLN() {
        if( referredByClientLN != null ) {
            ( ( InternalEList.Unsettable< ? > ) referredByClientLN ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByClientLN() {
        return referredByClientLN != null && ( ( InternalEList.Unsettable< ? > ) referredByClientLN ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Association > getReferredByAssociation() {
        if( referredByAssociation == null ) {
            referredByAssociation = new EObjectWithInverseEList.Unsettable< >( Association.class, this,
                    SclPackage.ANY_LN__REFERRED_BY_ASSOCIATION, SclPackage.ASSOCIATION__REFERS_TO_ANY_LN );
        }
        return referredByAssociation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByAssociation() {
        if( referredByAssociation != null ) {
            ( ( InternalEList.Unsettable< ? > ) referredByAssociation ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByAssociation() {
        return referredByAssociation != null && ( ( InternalEList.Unsettable< ? > ) referredByAssociation ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< IEDName > getReferredByIEDName() {
        if( referredByIEDName == null ) {
            referredByIEDName = new EObjectWithInverseEList.Unsettable< >( IEDName.class, this,
                    SclPackage.ANY_LN__REFERRED_BY_IED_NAME, SclPackage.IED_NAME__REFERS_TO_ANY_LN );
        }
        return referredByIEDName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByIEDName() {
        if( referredByIEDName != null ) {
            ( ( InternalEList.Unsettable< ? > ) referredByIEDName ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByIEDName() {
        return referredByIEDName != null && ( ( InternalEList.Unsettable< ? > ) referredByIEDName ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< LNode > getReferredByLNode() {
        if( referredByLNode == null ) {
            referredByLNode = new EObjectWithInverseEList.Unsettable< >( LNode.class, this,
                    SclPackage.ANY_LN__REFERRED_BY_LNODE, SclPackage.LNODE__REFERS_TO_ANY_LN );
        }
        return referredByLNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByLNode() {
        if( referredByLNode != null ) {
            ( ( InternalEList.Unsettable< ? > ) referredByLNode ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByLNode() {
        return referredByLNode != null && ( ( InternalEList.Unsettable< ? > ) referredByLNode ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public LDevice getParentLDevice() {
        AbstractRiseClipseConsole.getConsole().emergency( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                "AnyLNImpl.getParentLDevice() called" );
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public String getNamespace() {
        //@formatter:off

        // The attribute lnNs shall be a DataAttribute of the name plate NamPlt of a logical node.
        //
        // 1.  AnyLN.DOI["NamPlt"].DAI["lnNs"].value                   if present
        // 2.  AnyLN.LNodeType.namespace                               if not null
        // 3.  AnyLN.ParentLDevice.ldNs                                otherwise


        List< DOI > namPltDoi =
                 getDOI()
                .stream()
                .filter( doi -> "NamPlt".equals( doi.getName() ))
                .collect( Collectors.toList() );
        if( namPltDoi.size() == 1 ) {
            List< DAI > lnNsDai =
                     namPltDoi
                    .get( 0 )
                    .getDAI()
                    .stream()
                    .filter( dai -> "lnNs".equals(  dai.getName() ))
                    .collect( Collectors.toList() );
            if( lnNsDai.size() == 1 ) {
                if((       lnNsDai.get( 0 ).getVal().size() == 1 )
                      && ( lnNsDai.get( 0 ).getVal().get( 0 ).getValue() != null )
                      && ( lnNsDai.get( 0 ).getVal().get( 0 ).getValue().length() != 0 )) {
                    return lnNsDai.get( 0 ).getVal().get( 0 ).getValue();
                }
            }
        }

        String ns = null;
        if( getRefersToLNodeType() != null ) {
            ns = getRefersToLNodeType().getNamespace();
        }

        if(( ns == null ) && ( getParentLDevice() != null )) {
            ns = getParentLDevice().getNamespace();
        }
        return ns;

        //@formatter:on
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
        case SclPackage.ANY_LN__REFERS_TO_LNODE_TYPE:
            if( refersToLNodeType != null ) {
                msgs = ( ( InternalEObject ) refersToLNodeType ).eInverseRemove( this,
                        SclPackage.LNODE_TYPE__REFERRED_BY_ANY_LN, LNodeType.class, msgs );
            }
            return basicSetRefersToLNodeType( ( LNodeType ) otherEnd, msgs );
        case SclPackage.ANY_LN__INPUTS:
            if( inputs != null ) {
                msgs = ( ( InternalEObject ) inputs ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - SclPackage.ANY_LN__INPUTS, null, msgs );
            }
            return basicSetInputs( ( Inputs ) otherEnd, msgs );
        case SclPackage.ANY_LN__LOG:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getLog() ).basicAdd( otherEnd, msgs );
        case SclPackage.ANY_LN__DOI:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDOI() ).basicAdd( otherEnd, msgs );
        case SclPackage.ANY_LN__REPORT_CONTROL:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReportControl() )
                    .basicAdd( otherEnd, msgs );
        case SclPackage.ANY_LN__LOG_CONTROL:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getLogControl() ).basicAdd( otherEnd,
                    msgs );
        case SclPackage.ANY_LN__DATA_SET:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDataSet() ).basicAdd( otherEnd,
                    msgs );
        case SclPackage.ANY_LN__REFERRED_BY_CLIENT_LN:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByClientLN() )
                    .basicAdd( otherEnd, msgs );
        case SclPackage.ANY_LN__REFERRED_BY_ASSOCIATION:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByAssociation() )
                    .basicAdd( otherEnd, msgs );
        case SclPackage.ANY_LN__REFERRED_BY_IED_NAME:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByIEDName() )
                    .basicAdd( otherEnd, msgs );
        case SclPackage.ANY_LN__REFERRED_BY_LNODE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByLNode() )
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
        case SclPackage.ANY_LN__REFERS_TO_LNODE_TYPE:
            return basicUnsetRefersToLNodeType( msgs );
        case SclPackage.ANY_LN__INPUTS:
            return basicUnsetInputs( msgs );
        case SclPackage.ANY_LN__LOG:
            return ( ( InternalEList< ? > ) getLog() ).basicRemove( otherEnd, msgs );
        case SclPackage.ANY_LN__DOI:
            return ( ( InternalEList< ? > ) getDOI() ).basicRemove( otherEnd, msgs );
        case SclPackage.ANY_LN__REPORT_CONTROL:
            return ( ( InternalEList< ? > ) getReportControl() ).basicRemove( otherEnd, msgs );
        case SclPackage.ANY_LN__LOG_CONTROL:
            return ( ( InternalEList< ? > ) getLogControl() ).basicRemove( otherEnd, msgs );
        case SclPackage.ANY_LN__DATA_SET:
            return ( ( InternalEList< ? > ) getDataSet() ).basicRemove( otherEnd, msgs );
        case SclPackage.ANY_LN__REFERRED_BY_CLIENT_LN:
            return ( ( InternalEList< ? > ) getReferredByClientLN() ).basicRemove( otherEnd, msgs );
        case SclPackage.ANY_LN__REFERRED_BY_ASSOCIATION:
            return ( ( InternalEList< ? > ) getReferredByAssociation() ).basicRemove( otherEnd, msgs );
        case SclPackage.ANY_LN__REFERRED_BY_IED_NAME:
            return ( ( InternalEList< ? > ) getReferredByIEDName() ).basicRemove( otherEnd, msgs );
        case SclPackage.ANY_LN__REFERRED_BY_LNODE:
            return ( ( InternalEList< ? > ) getReferredByLNode() ).basicRemove( otherEnd, msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case SclPackage.ANY_LN__NAMESPACE:
            return getNamespace();
        case SclPackage.ANY_LN__INST:
            return getInst();
        case SclPackage.ANY_LN__LN_CLASS:
            return getLnClass();
        case SclPackage.ANY_LN__LN_TYPE:
            return getLnType();
        case SclPackage.ANY_LN__REFERS_TO_LNODE_TYPE:
            return getRefersToLNodeType();
        case SclPackage.ANY_LN__INPUTS:
            return getInputs();
        case SclPackage.ANY_LN__LOG:
            return getLog();
        case SclPackage.ANY_LN__DOI:
            return getDOI();
        case SclPackage.ANY_LN__REPORT_CONTROL:
            return getReportControl();
        case SclPackage.ANY_LN__LOG_CONTROL:
            return getLogControl();
        case SclPackage.ANY_LN__DATA_SET:
            return getDataSet();
        case SclPackage.ANY_LN__REFERRED_BY_CLIENT_LN:
            return getReferredByClientLN();
        case SclPackage.ANY_LN__REFERRED_BY_ASSOCIATION:
            return getReferredByAssociation();
        case SclPackage.ANY_LN__REFERRED_BY_IED_NAME:
            return getReferredByIEDName();
        case SclPackage.ANY_LN__REFERRED_BY_LNODE:
            return getReferredByLNode();
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
        case SclPackage.ANY_LN__INST:
            setInst( ( String ) newValue );
            return;
        case SclPackage.ANY_LN__LN_CLASS:
            setLnClass( ( String ) newValue );
            return;
        case SclPackage.ANY_LN__LN_TYPE:
            setLnType( ( String ) newValue );
            return;
        case SclPackage.ANY_LN__REFERS_TO_LNODE_TYPE:
            setRefersToLNodeType( ( LNodeType ) newValue );
            return;
        case SclPackage.ANY_LN__INPUTS:
            setInputs( ( Inputs ) newValue );
            return;
        case SclPackage.ANY_LN__LOG:
            getLog().clear();
            getLog().addAll( ( Collection< ? extends Log > ) newValue );
            return;
        case SclPackage.ANY_LN__DOI:
            getDOI().clear();
            getDOI().addAll( ( Collection< ? extends DOI > ) newValue );
            return;
        case SclPackage.ANY_LN__REPORT_CONTROL:
            getReportControl().clear();
            getReportControl().addAll( ( Collection< ? extends ReportControl > ) newValue );
            return;
        case SclPackage.ANY_LN__LOG_CONTROL:
            getLogControl().clear();
            getLogControl().addAll( ( Collection< ? extends LogControl > ) newValue );
            return;
        case SclPackage.ANY_LN__DATA_SET:
            getDataSet().clear();
            getDataSet().addAll( ( Collection< ? extends DataSet > ) newValue );
            return;
        case SclPackage.ANY_LN__REFERRED_BY_CLIENT_LN:
            getReferredByClientLN().clear();
            getReferredByClientLN().addAll( ( Collection< ? extends ClientLN > ) newValue );
            return;
        case SclPackage.ANY_LN__REFERRED_BY_ASSOCIATION:
            getReferredByAssociation().clear();
            getReferredByAssociation().addAll( ( Collection< ? extends Association > ) newValue );
            return;
        case SclPackage.ANY_LN__REFERRED_BY_IED_NAME:
            getReferredByIEDName().clear();
            getReferredByIEDName().addAll( ( Collection< ? extends IEDName > ) newValue );
            return;
        case SclPackage.ANY_LN__REFERRED_BY_LNODE:
            getReferredByLNode().clear();
            getReferredByLNode().addAll( ( Collection< ? extends LNode > ) newValue );
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
        case SclPackage.ANY_LN__INST:
            unsetInst();
            return;
        case SclPackage.ANY_LN__LN_CLASS:
            unsetLnClass();
            return;
        case SclPackage.ANY_LN__LN_TYPE:
            unsetLnType();
            return;
        case SclPackage.ANY_LN__REFERS_TO_LNODE_TYPE:
            unsetRefersToLNodeType();
            return;
        case SclPackage.ANY_LN__INPUTS:
            unsetInputs();
            return;
        case SclPackage.ANY_LN__LOG:
            unsetLog();
            return;
        case SclPackage.ANY_LN__DOI:
            unsetDOI();
            return;
        case SclPackage.ANY_LN__REPORT_CONTROL:
            unsetReportControl();
            return;
        case SclPackage.ANY_LN__LOG_CONTROL:
            unsetLogControl();
            return;
        case SclPackage.ANY_LN__DATA_SET:
            unsetDataSet();
            return;
        case SclPackage.ANY_LN__REFERRED_BY_CLIENT_LN:
            unsetReferredByClientLN();
            return;
        case SclPackage.ANY_LN__REFERRED_BY_ASSOCIATION:
            unsetReferredByAssociation();
            return;
        case SclPackage.ANY_LN__REFERRED_BY_IED_NAME:
            unsetReferredByIEDName();
            return;
        case SclPackage.ANY_LN__REFERRED_BY_LNODE:
            unsetReferredByLNode();
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
        case SclPackage.ANY_LN__NAMESPACE:
            return NAMESPACE_EDEFAULT == null ? getNamespace() != null : !NAMESPACE_EDEFAULT.equals( getNamespace() );
        case SclPackage.ANY_LN__INST:
            return isSetInst();
        case SclPackage.ANY_LN__LN_CLASS:
            return isSetLnClass();
        case SclPackage.ANY_LN__LN_TYPE:
            return isSetLnType();
        case SclPackage.ANY_LN__REFERS_TO_LNODE_TYPE:
            return isSetRefersToLNodeType();
        case SclPackage.ANY_LN__INPUTS:
            return isSetInputs();
        case SclPackage.ANY_LN__LOG:
            return isSetLog();
        case SclPackage.ANY_LN__DOI:
            return isSetDOI();
        case SclPackage.ANY_LN__REPORT_CONTROL:
            return isSetReportControl();
        case SclPackage.ANY_LN__LOG_CONTROL:
            return isSetLogControl();
        case SclPackage.ANY_LN__DATA_SET:
            return isSetDataSet();
        case SclPackage.ANY_LN__REFERRED_BY_CLIENT_LN:
            return isSetReferredByClientLN();
        case SclPackage.ANY_LN__REFERRED_BY_ASSOCIATION:
            return isSetReferredByAssociation();
        case SclPackage.ANY_LN__REFERRED_BY_IED_NAME:
            return isSetReferredByIEDName();
        case SclPackage.ANY_LN__REFERRED_BY_LNODE:
            return isSetReferredByLNode();
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
            case SclPackage.ANY_LN__NAMESPACE:
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
                return SclPackage.ANY_LN__NAMESPACE;
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
    public Object eInvoke( int operationID, EList< ? > arguments ) throws InvocationTargetException {
        switch( operationID ) {
        case SclPackage.ANY_LN___GET_PARENT_LDEVICE:
            return getParentLDevice();
        }
        return super.eInvoke( operationID, arguments );
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
        result.append( " (inst: " );
        if( instESet ) {
            result.append( inst );
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
        result.append( ", lnType: " );
        if( lnTypeESet ) {
            result.append( lnType );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

    @Override
    protected void doBuildExplicitLinks( @NonNull IRiseClipseConsole console ) {
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(), "AnyLNImpl.doBuildExplicitLinks()" );

        // see Issue #13
        super.doBuildExplicitLinks( console );

        // lnType  The instantiable type definition of this logical node, reference to a LNodeType definition
        // lnClass The LN class according to IEC 61850-7-x
        // inst    The LN instance number identifying this LN – an unsigned integer

        // String messagePrefix = "while resolving link from AnyLN on line: ";

        if( ( getLnType() == null ) || getLnType().isEmpty() ) {
            // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
            //         messagePrefix, "lnType is missing" );
            return;
        }
        DataTypeTemplates dtt = SclUtilities.getSCL( this ).getDataTypeTemplates();
        if( dtt == null ) {
            // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
            //         messagePrefix, "DataTypeTemplates is missing" );
            return;
        }

        List< LNodeType > res = dtt
                .getLNodeType()
                .stream()
                .filter( lnt -> getLnType().equals( lnt.getId() ) )
                .collect( Collectors.toList() );

        if( res.size() != 1 ) {
            // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
            //         messagePrefix, ( ( res.size() == 0 ) ? "cannot find" : "found several" ),
            //         " LNodeType( id = ", getLnType(), " )" );
            return;
        }
        setRefersToLNodeType( res.get( 0 ) );
        console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                "AnyLN refers to LNodeType( id = ", getLnType(),
                " ) on line ", getRefersToLNodeType().getLineNumber() );

        if( ( getLnClass() != null ) && !getLnClass().equals( getRefersToLNodeType().getLnClass() ) ) {
            // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
            //         messagePrefix, "lnClass in LNodeType( id = ", getLnType(), " ) is ",
            //         getRefersToLNodeType().getLnClass(), " and not ", getLnClass() );
        }
    }

} //AnyLNImpl
