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
package fr.centralesupelec.edf.riseclipse.iec61850.asd.impl;

import java.util.Collection;

import org.apache.commons.lang3.tuple.Pair;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.jdt.annotation.NonNull;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParametersRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.util.AsdUtilities;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Val;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ValKindEnum;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DAS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.DASImpl#getSubscriberLNode <em>Subscriber LNode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.DASImpl#getControllingLNode <em>Controlling LNode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.DASImpl#getProcessEcho <em>Process Echo</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.DASImpl#getLogParametersRef <em>Log Parameters Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.DASImpl#getVal <em>Val</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.DASImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.DASImpl#getIx <em>Ix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.DASImpl#getMappedDaName <em>Mapped Da Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.DASImpl#getMappedLnUuid <em>Mapped Ln Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.DASImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.DASImpl#isValImport <em>Val Import</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.DASImpl#getValKind <em>Val Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.DASImpl#getParentDOS <em>Parent DOS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.DASImpl#getParentSDS <em>Parent SDS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.DASImpl#getRefersToAnyLN <em>Refers To Any LN</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DASImpl extends BaseExtensionElementWithDescImpl implements DAS {
    /**
     * The cached value of the '{@link #getSubscriberLNode() <em>Subscriber LNode</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubscriberLNode()
     * @generated
     * @ordered
     */
    protected EList< SubscriberLNode > subscriberLNode;

    /**
     * The cached value of the '{@link #getControllingLNode() <em>Controlling LNode</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControllingLNode()
     * @generated
     * @ordered
     */
    protected EList< ControllingLNode > controllingLNode;

    /**
     * The cached value of the '{@link #getProcessEcho() <em>Process Echo</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcessEcho()
     * @generated
     * @ordered
     */
    protected EList< ProcessEcho > processEcho;

    /**
     * The cached value of the '{@link #getLogParametersRef() <em>Log Parameters Ref</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLogParametersRef()
     * @generated
     * @ordered
     */
    protected EList< LogParametersRef > logParametersRef;

    /**
     * The cached value of the '{@link #getVal() <em>Val</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVal()
     * @generated
     * @ordered
     */
    protected EList< Val > val;

    /**
     * The cached value of the '{@link #getLabels() <em>Labels</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabels()
     * @generated
     * @ordered
     */
    protected EList< Labels > labels;

    /**
     * The default value of the '{@link #getIx() <em>Ix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIx()
     * @generated
     * @ordered
     */
    protected static final long IX_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getIx() <em>Ix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIx()
     * @generated
     * @ordered
     */
    protected long ix = IX_EDEFAULT;

    /**
     * This is true if the Ix attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ixESet;

    /**
     * The default value of the '{@link #getMappedDaName() <em>Mapped Da Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMappedDaName()
     * @generated
     * @ordered
     */
    protected static final String MAPPED_DA_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMappedDaName() <em>Mapped Da Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMappedDaName()
     * @generated
     * @ordered
     */
    protected String mappedDaName = MAPPED_DA_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getMappedLnUuid() <em>Mapped Ln Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMappedLnUuid()
     * @generated
     * @ordered
     */
    protected static final String MAPPED_LN_UUID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMappedLnUuid() <em>Mapped Ln Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMappedLnUuid()
     * @generated
     * @ordered
     */
    protected String mappedLnUuid = MAPPED_LN_UUID_EDEFAULT;

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
     * The default value of the '{@link #isValImport() <em>Val Import</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isValImport()
     * @generated
     * @ordered
     */
    protected static final boolean VAL_IMPORT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isValImport() <em>Val Import</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isValImport()
     * @generated
     * @ordered
     */
    protected boolean valImport = VAL_IMPORT_EDEFAULT;

    /**
     * This is true if the Val Import attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean valImportESet;

    /**
     * The default value of the '{@link #getValKind() <em>Val Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValKind()
     * @generated
     * @ordered
     */
    protected static final ValKindEnum VAL_KIND_EDEFAULT = ValKindEnum.SPEC;

    /**
     * The cached value of the '{@link #getValKind() <em>Val Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValKind()
     * @generated
     * @ordered
     */
    protected ValKindEnum valKind = VAL_KIND_EDEFAULT;

    /**
     * This is true if the Val Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean valKindESet;

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
    protected DASImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getDAS();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SubscriberLNode > getSubscriberLNode() {
        if( subscriberLNode == null ) {
            subscriberLNode = new EObjectContainmentWithInverseEList.Unsettable< >(
                    SubscriberLNode.class, this, AsdPackage.DAS__SUBSCRIBER_LNODE,
                    AsdPackage.SUBSCRIBER_LNODE__PARENT_DAS );
        }
        return subscriberLNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSubscriberLNode() {
        if( subscriberLNode != null ) {
            ( ( InternalEList.Unsettable< ? > ) subscriberLNode ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSubscriberLNode() {
        return subscriberLNode != null && ( ( InternalEList.Unsettable< ? > ) subscriberLNode ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ControllingLNode > getControllingLNode() {
        if( controllingLNode == null ) {
            controllingLNode = new EObjectContainmentWithInverseEList.Unsettable< >(
                    ControllingLNode.class, this, AsdPackage.DAS__CONTROLLING_LNODE,
                    AsdPackage.CONTROLLING_LNODE__PARENT_DAS );
        }
        return controllingLNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetControllingLNode() {
        if( controllingLNode != null ) {
            ( ( InternalEList.Unsettable< ? > ) controllingLNode ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetControllingLNode() {
        return controllingLNode != null && ( ( InternalEList.Unsettable< ? > ) controllingLNode ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ProcessEcho > getProcessEcho() {
        if( processEcho == null ) {
            processEcho = new EObjectContainmentWithInverseEList.Unsettable< >( ProcessEcho.class, this,
                    AsdPackage.DAS__PROCESS_ECHO, AsdPackage.PROCESS_ECHO__PARENT_DAS );
        }
        return processEcho;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetProcessEcho() {
        if( processEcho != null ) {
            ( ( InternalEList.Unsettable< ? > ) processEcho ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetProcessEcho() {
        return processEcho != null && ( ( InternalEList.Unsettable< ? > ) processEcho ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< LogParametersRef > getLogParametersRef() {
        if( logParametersRef == null ) {
            logParametersRef = new EObjectContainmentWithInverseEList.Unsettable< >(
                    LogParametersRef.class, this, AsdPackage.DAS__LOG_PARAMETERS_REF,
                    AsdPackage.LOG_PARAMETERS_REF__PARENT_DAS );
        }
        return logParametersRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLogParametersRef() {
        if( logParametersRef != null ) {
            ( ( InternalEList.Unsettable< ? > ) logParametersRef ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLogParametersRef() {
        return logParametersRef != null && ( ( InternalEList.Unsettable< ? > ) logParametersRef ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Val > getVal() {
        if( val == null ) {
            val = new EObjectContainmentWithInverseEList.Unsettable< >( Val.class, this, AsdPackage.DAS__VAL,
                    SclPackage.VAL__PARENT_DAS );
        }
        return val;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVal() {
        if( val != null ) {
            ( ( InternalEList.Unsettable< ? > ) val ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVal() {
        return val != null && ( ( InternalEList.Unsettable< ? > ) val ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Labels > getLabels() {
        if( labels == null ) {
            labels = new EObjectContainmentWithInverseEList.Unsettable< >( Labels.class, this,
                    AsdPackage.DAS__LABELS, SclPackage.LABELS__PARENT_DAS );
        }
        return labels;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLabels() {
        if( labels != null ) {
            ( ( InternalEList.Unsettable< ? > ) labels ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLabels() {
        return labels != null && ( ( InternalEList.Unsettable< ? > ) labels ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public long getIx() {
        return ix;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIx( long newIx ) {
        long oldIx = ix;
        ix = newIx;
        boolean oldIxESet = ixESet;
        ixESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.DAS__IX, oldIx, ix, !oldIxESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIx() {
        long oldIx = ix;
        boolean oldIxESet = ixESet;
        ix = IX_EDEFAULT;
        ixESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.DAS__IX, oldIx, IX_EDEFAULT,
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
    public String getMappedDaName() {
        return mappedDaName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMappedDaName( String newMappedDaName ) {
        String oldMappedDaName = mappedDaName;
        mappedDaName = newMappedDaName;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.DAS__MAPPED_DA_NAME, oldMappedDaName,
                    mappedDaName ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getMappedLnUuid() {
        return mappedLnUuid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMappedLnUuid( String newMappedLnUuid ) {
        String oldMappedLnUuid = mappedLnUuid;
        mappedLnUuid = newMappedLnUuid;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.DAS__MAPPED_LN_UUID, oldMappedLnUuid,
                    mappedLnUuid ) );
        }
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
    public void setName( String newName ) {
        String oldName = name;
        name = newName;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.DAS__NAME, oldName, name ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isValImport() {
        return valImport;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setValImport( boolean newValImport ) {
        boolean oldValImport = valImport;
        valImport = newValImport;
        boolean oldValImportESet = valImportESet;
        valImportESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.DAS__VAL_IMPORT, oldValImport, valImport,
                    !oldValImportESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetValImport() {
        boolean oldValImport = valImport;
        boolean oldValImportESet = valImportESet;
        valImport = VAL_IMPORT_EDEFAULT;
        valImportESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.DAS__VAL_IMPORT, oldValImport,
                    VAL_IMPORT_EDEFAULT, oldValImportESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetValImport() {
        return valImportESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ValKindEnum getValKind() {
        return valKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setValKind( ValKindEnum newValKind ) {
        ValKindEnum oldValKind = valKind;
        valKind = newValKind == null ? VAL_KIND_EDEFAULT : newValKind;
        boolean oldValKindESet = valKindESet;
        valKindESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.DAS__VAL_KIND, oldValKind, valKind,
                    !oldValKindESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetValKind() {
        ValKindEnum oldValKind = valKind;
        boolean oldValKindESet = valKindESet;
        valKind = VAL_KIND_EDEFAULT;
        valKindESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.DAS__VAL_KIND, oldValKind,
                    VAL_KIND_EDEFAULT, oldValKindESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetValKind() {
        return valKindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DOS getParentDOS() {
        if( eContainerFeatureID() != AsdPackage.DAS__PARENT_DOS ) {
            return null;
        }
        return ( DOS ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentDOS( DOS newParentDOS, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentDOS, AsdPackage.DAS__PARENT_DOS, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentDOS( DOS newParentDOS ) {
        if( newParentDOS != eInternalContainer()
                || ( eContainerFeatureID() != AsdPackage.DAS__PARENT_DOS && newParentDOS != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentDOS ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentDOS != null ) {
                msgs = ( ( InternalEObject ) newParentDOS ).eInverseAdd( this, AsdPackage.DOS__DAS, DOS.class, msgs );
            }
            msgs = basicSetParentDOS( newParentDOS, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.DAS__PARENT_DOS, newParentDOS,
                    newParentDOS ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SDS getParentSDS() {
        if( eContainerFeatureID() != AsdPackage.DAS__PARENT_SDS ) {
            return null;
        }
        return ( SDS ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentSDS( SDS newParentSDS, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentSDS, AsdPackage.DAS__PARENT_SDS, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentSDS( SDS newParentSDS ) {
        if( newParentSDS != eInternalContainer()
                || ( eContainerFeatureID() != AsdPackage.DAS__PARENT_SDS && newParentSDS != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentSDS ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentSDS != null ) {
                msgs = ( ( InternalEObject ) newParentSDS ).eInverseAdd( this, AsdPackage.SDS__DAS, SDS.class, msgs );
            }
            msgs = basicSetParentSDS( newParentSDS, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.DAS__PARENT_SDS, newParentSDS,
                    newParentSDS ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AnyLN getRefersToAnyLN() {
        if( refersToAnyLN != null && refersToAnyLN.eIsProxy() ) {
            InternalEObject oldRefersToAnyLN = ( InternalEObject ) refersToAnyLN;
            refersToAnyLN = ( AnyLN ) eResolveProxy( oldRefersToAnyLN );
            if( refersToAnyLN != oldRefersToAnyLN ) {
                if( eNotificationRequired() ) {
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE, AsdPackage.DAS__REFERS_TO_ANY_LN,
                            oldRefersToAnyLN, refersToAnyLN ) );
                }
            }
        }
        return refersToAnyLN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnyLN basicGetRefersToAnyLN() {
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
                    AsdPackage.DAS__REFERS_TO_ANY_LN, oldRefersToAnyLN, newRefersToAnyLN, !oldRefersToAnyLNESet );
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
                msgs = ( ( InternalEObject ) refersToAnyLN ).eInverseRemove( this, SclPackage.ANY_LN__REFERRED_BY_DAS,
                        AnyLN.class, msgs );
            }
            if( newRefersToAnyLN != null ) {
                msgs = ( ( InternalEObject ) newRefersToAnyLN ).eInverseAdd( this, SclPackage.ANY_LN__REFERRED_BY_DAS,
                        AnyLN.class, msgs );
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
                eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.DAS__REFERS_TO_ANY_LN,
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
                    AsdPackage.DAS__REFERS_TO_ANY_LN, oldRefersToAnyLN, null, oldRefersToAnyLNESet );
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
            msgs = ( ( InternalEObject ) refersToAnyLN ).eInverseRemove( this, SclPackage.ANY_LN__REFERRED_BY_DAS,
                    AnyLN.class, msgs );
            msgs = basicUnsetRefersToAnyLN( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToAnyLNESet = refersToAnyLNESet;
            refersToAnyLNESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.DAS__REFERS_TO_ANY_LN, null, null,
                        oldRefersToAnyLNESet ) );
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
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case AsdPackage.DAS__SUBSCRIBER_LNODE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSubscriberLNode() )
                    .basicAdd( otherEnd, msgs );
        case AsdPackage.DAS__CONTROLLING_LNODE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getControllingLNode() )
                    .basicAdd( otherEnd, msgs );
        case AsdPackage.DAS__PROCESS_ECHO:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getProcessEcho() ).basicAdd( otherEnd,
                    msgs );
        case AsdPackage.DAS__LOG_PARAMETERS_REF:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getLogParametersRef() )
                    .basicAdd( otherEnd, msgs );
        case AsdPackage.DAS__VAL:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getVal() ).basicAdd( otherEnd, msgs );
        case AsdPackage.DAS__LABELS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getLabels() ).basicAdd( otherEnd,
                    msgs );
        case AsdPackage.DAS__PARENT_DOS:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentDOS( ( DOS ) otherEnd, msgs );
        case AsdPackage.DAS__PARENT_SDS:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentSDS( ( SDS ) otherEnd, msgs );
        case AsdPackage.DAS__REFERS_TO_ANY_LN:
            if( refersToAnyLN != null ) {
                msgs = ( ( InternalEObject ) refersToAnyLN ).eInverseRemove( this, SclPackage.ANY_LN__REFERRED_BY_DAS,
                        AnyLN.class, msgs );
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
        case AsdPackage.DAS__SUBSCRIBER_LNODE:
            return ( ( InternalEList< ? > ) getSubscriberLNode() ).basicRemove( otherEnd, msgs );
        case AsdPackage.DAS__CONTROLLING_LNODE:
            return ( ( InternalEList< ? > ) getControllingLNode() ).basicRemove( otherEnd, msgs );
        case AsdPackage.DAS__PROCESS_ECHO:
            return ( ( InternalEList< ? > ) getProcessEcho() ).basicRemove( otherEnd, msgs );
        case AsdPackage.DAS__LOG_PARAMETERS_REF:
            return ( ( InternalEList< ? > ) getLogParametersRef() ).basicRemove( otherEnd, msgs );
        case AsdPackage.DAS__VAL:
            return ( ( InternalEList< ? > ) getVal() ).basicRemove( otherEnd, msgs );
        case AsdPackage.DAS__LABELS:
            return ( ( InternalEList< ? > ) getLabels() ).basicRemove( otherEnd, msgs );
        case AsdPackage.DAS__PARENT_DOS:
            return basicSetParentDOS( null, msgs );
        case AsdPackage.DAS__PARENT_SDS:
            return basicSetParentSDS( null, msgs );
        case AsdPackage.DAS__REFERS_TO_ANY_LN:
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
        case AsdPackage.DAS__PARENT_DOS:
            return eInternalContainer().eInverseRemove( this, AsdPackage.DOS__DAS, DOS.class, msgs );
        case AsdPackage.DAS__PARENT_SDS:
            return eInternalContainer().eInverseRemove( this, AsdPackage.SDS__DAS, SDS.class, msgs );
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
        case AsdPackage.DAS__SUBSCRIBER_LNODE:
            return getSubscriberLNode();
        case AsdPackage.DAS__CONTROLLING_LNODE:
            return getControllingLNode();
        case AsdPackage.DAS__PROCESS_ECHO:
            return getProcessEcho();
        case AsdPackage.DAS__LOG_PARAMETERS_REF:
            return getLogParametersRef();
        case AsdPackage.DAS__VAL:
            return getVal();
        case AsdPackage.DAS__LABELS:
            return getLabels();
        case AsdPackage.DAS__IX:
            return getIx();
        case AsdPackage.DAS__MAPPED_DA_NAME:
            return getMappedDaName();
        case AsdPackage.DAS__MAPPED_LN_UUID:
            return getMappedLnUuid();
        case AsdPackage.DAS__NAME:
            return getName();
        case AsdPackage.DAS__VAL_IMPORT:
            return isValImport();
        case AsdPackage.DAS__VAL_KIND:
            return getValKind();
        case AsdPackage.DAS__PARENT_DOS:
            return getParentDOS();
        case AsdPackage.DAS__PARENT_SDS:
            return getParentSDS();
        case AsdPackage.DAS__REFERS_TO_ANY_LN:
            if( resolve ) {
                return getRefersToAnyLN();
            }
            return basicGetRefersToAnyLN();
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
        case AsdPackage.DAS__SUBSCRIBER_LNODE:
            getSubscriberLNode().clear();
            getSubscriberLNode().addAll( ( Collection< ? extends SubscriberLNode > ) newValue );
            return;
        case AsdPackage.DAS__CONTROLLING_LNODE:
            getControllingLNode().clear();
            getControllingLNode().addAll( ( Collection< ? extends ControllingLNode > ) newValue );
            return;
        case AsdPackage.DAS__PROCESS_ECHO:
            getProcessEcho().clear();
            getProcessEcho().addAll( ( Collection< ? extends ProcessEcho > ) newValue );
            return;
        case AsdPackage.DAS__LOG_PARAMETERS_REF:
            getLogParametersRef().clear();
            getLogParametersRef().addAll( ( Collection< ? extends LogParametersRef > ) newValue );
            return;
        case AsdPackage.DAS__VAL:
            getVal().clear();
            getVal().addAll( ( Collection< ? extends Val > ) newValue );
            return;
        case AsdPackage.DAS__LABELS:
            getLabels().clear();
            getLabels().addAll( ( Collection< ? extends Labels > ) newValue );
            return;
        case AsdPackage.DAS__IX:
            setIx( ( Long ) newValue );
            return;
        case AsdPackage.DAS__MAPPED_DA_NAME:
            setMappedDaName( ( String ) newValue );
            return;
        case AsdPackage.DAS__MAPPED_LN_UUID:
            setMappedLnUuid( ( String ) newValue );
            return;
        case AsdPackage.DAS__NAME:
            setName( ( String ) newValue );
            return;
        case AsdPackage.DAS__VAL_IMPORT:
            setValImport( ( Boolean ) newValue );
            return;
        case AsdPackage.DAS__VAL_KIND:
            setValKind( ( ValKindEnum ) newValue );
            return;
        case AsdPackage.DAS__PARENT_DOS:
            setParentDOS( ( DOS ) newValue );
            return;
        case AsdPackage.DAS__PARENT_SDS:
            setParentSDS( ( SDS ) newValue );
            return;
        case AsdPackage.DAS__REFERS_TO_ANY_LN:
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
        case AsdPackage.DAS__SUBSCRIBER_LNODE:
            unsetSubscriberLNode();
            return;
        case AsdPackage.DAS__CONTROLLING_LNODE:
            unsetControllingLNode();
            return;
        case AsdPackage.DAS__PROCESS_ECHO:
            unsetProcessEcho();
            return;
        case AsdPackage.DAS__LOG_PARAMETERS_REF:
            unsetLogParametersRef();
            return;
        case AsdPackage.DAS__VAL:
            unsetVal();
            return;
        case AsdPackage.DAS__LABELS:
            unsetLabels();
            return;
        case AsdPackage.DAS__IX:
            unsetIx();
            return;
        case AsdPackage.DAS__MAPPED_DA_NAME:
            setMappedDaName( MAPPED_DA_NAME_EDEFAULT );
            return;
        case AsdPackage.DAS__MAPPED_LN_UUID:
            setMappedLnUuid( MAPPED_LN_UUID_EDEFAULT );
            return;
        case AsdPackage.DAS__NAME:
            setName( NAME_EDEFAULT );
            return;
        case AsdPackage.DAS__VAL_IMPORT:
            unsetValImport();
            return;
        case AsdPackage.DAS__VAL_KIND:
            unsetValKind();
            return;
        case AsdPackage.DAS__PARENT_DOS:
            setParentDOS( ( DOS ) null );
            return;
        case AsdPackage.DAS__PARENT_SDS:
            setParentSDS( ( SDS ) null );
            return;
        case AsdPackage.DAS__REFERS_TO_ANY_LN:
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
        case AsdPackage.DAS__SUBSCRIBER_LNODE:
            return isSetSubscriberLNode();
        case AsdPackage.DAS__CONTROLLING_LNODE:
            return isSetControllingLNode();
        case AsdPackage.DAS__PROCESS_ECHO:
            return isSetProcessEcho();
        case AsdPackage.DAS__LOG_PARAMETERS_REF:
            return isSetLogParametersRef();
        case AsdPackage.DAS__VAL:
            return isSetVal();
        case AsdPackage.DAS__LABELS:
            return isSetLabels();
        case AsdPackage.DAS__IX:
            return isSetIx();
        case AsdPackage.DAS__MAPPED_DA_NAME:
            return MAPPED_DA_NAME_EDEFAULT == null ? mappedDaName != null
                    : !MAPPED_DA_NAME_EDEFAULT.equals( mappedDaName );
        case AsdPackage.DAS__MAPPED_LN_UUID:
            return MAPPED_LN_UUID_EDEFAULT == null ? mappedLnUuid != null
                    : !MAPPED_LN_UUID_EDEFAULT.equals( mappedLnUuid );
        case AsdPackage.DAS__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals( name );
        case AsdPackage.DAS__VAL_IMPORT:
            return isSetValImport();
        case AsdPackage.DAS__VAL_KIND:
            return isSetValKind();
        case AsdPackage.DAS__PARENT_DOS:
            return getParentDOS() != null;
        case AsdPackage.DAS__PARENT_SDS:
            return getParentSDS() != null;
        case AsdPackage.DAS__REFERS_TO_ANY_LN:
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
    public String toString() {
        if( eIsProxy() ) {
            return super.toString();
        }

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (ix: " );
        if( ixESet ) {
            result.append( ix );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", mappedDaName: " );
        result.append( mappedDaName );
        result.append( ", mappedLnUuid: " );
        result.append( mappedLnUuid );
        result.append( ", name: " );
        result.append( name );
        result.append( ", valImport: " );
        if( valImportESet ) {
            result.append( valImport );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", valKind: " );
        if( valKindESet ) {
            result.append( valKind );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

    @Override
    protected void doBuildExplicitLinks( @NonNull IRiseClipseConsole console ) {
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                "DAS.doBuildExplicitLinks()" );

        // see Issue #13
        super.doBuildExplicitLinks( console );

        String messagePrefix = "while resolving link from DAS: ";
        doBuildExplicitLinkWithAnyLN( console, messagePrefix );
    }

    private void doBuildExplicitLinkWithAnyLN( @NonNull IRiseClipseConsole console, @NonNull String mPrefix ) {

        String messagePrefix = mPrefix + "(looking for AnyLN) ";

        SCL sclRoot = AsdUtilities.getSCL( this );

        if( getMappedLnUuid() != null && !getMappedLnUuid().isEmpty() ) {
            Pair< AnyLN, Integer > res = AsdUtilities.findByUuid( sclRoot.getIED(), getMappedLnUuid(), AnyLN.class );

            if( res.getLeft() != null ) {
                setRefersToAnyLN( res.getLeft() );
                console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        "DAS refers to AnyLN( uuid = ", getMappedLnUuid(), " ) on line ",
                        getRefersToAnyLN().getLineNumber() );
            }
            else {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( res.getRight() == 0 ) ? "cannot find" : "found several" ),
                //         " AnyLN( uuid = ", getMappedLnUuid(), " )" );
            }

        }
        else {
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "link not resolved because mappedLnUuid are missing" );
        }

    }

} //DASImpl
