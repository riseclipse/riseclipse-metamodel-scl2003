/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
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
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.iec61850.scl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.Header;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.History;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Text;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.HeaderImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.HeaderImpl#getNameStructure <em>Name Structure</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.HeaderImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.HeaderImpl#getToolID <em>Tool ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.HeaderImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.HeaderImpl#getParentSCL <em>Parent SCL</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.HeaderImpl#getText <em>Text</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.HeaderImpl#getHistory <em>History</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HeaderImpl extends SclObjectImpl implements Header {
    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected String id = ID_EDEFAULT;

    /**
     * This is true if the Id attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean idESet;

    /**
     * The default value of the '{@link #getNameStructure() <em>Name Structure</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNameStructure()
     * @generated
     * @ordered
     */
    protected static final String NAME_STRUCTURE_EDEFAULT = "IEDName";

    /**
     * The cached value of the '{@link #getNameStructure() <em>Name Structure</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNameStructure()
     * @generated
     * @ordered
     */
    protected String nameStructure = NAME_STRUCTURE_EDEFAULT;

    /**
     * This is true if the Name Structure attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nameStructureESet;

    /**
     * The default value of the '{@link #getRevision() <em>Revision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRevision()
     * @generated
     * @ordered
     */
    protected static final String REVISION_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getRevision() <em>Revision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRevision()
     * @generated
     * @ordered
     */
    protected String revision = REVISION_EDEFAULT;

    /**
     * This is true if the Revision attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean revisionESet;

    /**
     * The default value of the '{@link #getToolID() <em>Tool ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getToolID()
     * @generated
     * @ordered
     */
    protected static final String TOOL_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getToolID() <em>Tool ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getToolID()
     * @generated
     * @ordered
     */
    protected String toolID = TOOL_ID_EDEFAULT;

    /**
     * This is true if the Tool ID attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean toolIDESet;

    /**
     * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected static final String VERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected String version = VERSION_EDEFAULT;

    /**
     * This is true if the Version attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean versionESet;

    /**
     * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getText()
     * @generated
     * @ordered
     */
    protected Text text;

    /**
     * This is true if the Text containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean textESet;

    /**
     * The cached value of the '{@link #getHistory() <em>History</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHistory()
     * @generated
     * @ordered
     */
    protected History history;

    /**
     * This is true if the History containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean historyESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected HeaderImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getHeader();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setId( String newId ) {
        String oldId = id;
        id = newId;
        boolean oldIdESet = idESet;
        idESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.HEADER__ID, oldId, id, !oldIdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetId() {
        String oldId = id;
        boolean oldIdESet = idESet;
        id = ID_EDEFAULT;
        idESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.HEADER__ID, oldId, ID_EDEFAULT,
                    oldIdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetId() {
        return idESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getNameStructure() {
        return nameStructure;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNameStructure( String newNameStructure ) {
        String oldNameStructure = nameStructure;
        nameStructure = newNameStructure;
        boolean oldNameStructureESet = nameStructureESet;
        nameStructureESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.HEADER__NAME_STRUCTURE, oldNameStructure,
                    nameStructure, !oldNameStructureESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNameStructure() {
        String oldNameStructure = nameStructure;
        boolean oldNameStructureESet = nameStructureESet;
        nameStructure = NAME_STRUCTURE_EDEFAULT;
        nameStructureESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.HEADER__NAME_STRUCTURE,
                    oldNameStructure, NAME_STRUCTURE_EDEFAULT, oldNameStructureESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNameStructure() {
        return nameStructureESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getRevision() {
        return revision;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRevision( String newRevision ) {
        String oldRevision = revision;
        revision = newRevision;
        boolean oldRevisionESet = revisionESet;
        revisionESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.HEADER__REVISION, oldRevision, revision,
                    !oldRevisionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRevision() {
        String oldRevision = revision;
        boolean oldRevisionESet = revisionESet;
        revision = REVISION_EDEFAULT;
        revisionESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.HEADER__REVISION, oldRevision,
                    REVISION_EDEFAULT, oldRevisionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRevision() {
        return revisionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getToolID() {
        return toolID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setToolID( String newToolID ) {
        String oldToolID = toolID;
        toolID = newToolID;
        boolean oldToolIDESet = toolIDESet;
        toolIDESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.HEADER__TOOL_ID, oldToolID, toolID,
                    !oldToolIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetToolID() {
        String oldToolID = toolID;
        boolean oldToolIDESet = toolIDESet;
        toolID = TOOL_ID_EDEFAULT;
        toolIDESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.HEADER__TOOL_ID, oldToolID,
                    TOOL_ID_EDEFAULT, oldToolIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetToolID() {
        return toolIDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getVersion() {
        return version;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVersion( String newVersion ) {
        String oldVersion = version;
        version = newVersion;
        boolean oldVersionESet = versionESet;
        versionESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.HEADER__VERSION, oldVersion, version,
                    !oldVersionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVersion() {
        String oldVersion = version;
        boolean oldVersionESet = versionESet;
        version = VERSION_EDEFAULT;
        versionESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.HEADER__VERSION, oldVersion,
                    VERSION_EDEFAULT, oldVersionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVersion() {
        return versionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SCL getParentSCL() {
        if( eContainerFeatureID() != SclPackage.HEADER__PARENT_SCL ) return null;
        return ( SCL ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentSCL( SCL newParentSCL, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentSCL, SclPackage.HEADER__PARENT_SCL, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentSCL( SCL newParentSCL ) {
        if( newParentSCL != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.HEADER__PARENT_SCL && newParentSCL != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentSCL ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentSCL != null )
                msgs = ( ( InternalEObject ) newParentSCL ).eInverseAdd( this, SclPackage.SCL__HEADER, SCL.class,
                        msgs );
            msgs = basicSetParentSCL( newParentSCL, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.HEADER__PARENT_SCL, newParentSCL,
                    newParentSCL ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Text getText() {
        return text;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetText( Text newText, NotificationChain msgs ) {
        Text oldText = text;
        text = newText;
        boolean oldTextESet = textESet;
        textESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, SclPackage.HEADER__TEXT,
                    oldText, newText, !oldTextESet );
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
    public void setText( Text newText ) {
        if( newText != text ) {
            NotificationChain msgs = null;
            if( text != null )
                msgs = ( ( InternalEObject ) text ).eInverseRemove( this, SclPackage.TEXT__PARENT_HEADER, Text.class,
                        msgs );
            if( newText != null )
                msgs = ( ( InternalEObject ) newText ).eInverseAdd( this, SclPackage.TEXT__PARENT_HEADER, Text.class,
                        msgs );
            msgs = basicSetText( newText, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTextESet = textESet;
            textESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.HEADER__TEXT, newText, newText,
                        !oldTextESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetText( NotificationChain msgs ) {
        Text oldText = text;
        text = null;
        boolean oldTextESet = textESet;
        textESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET, SclPackage.HEADER__TEXT,
                    oldText, null, oldTextESet );
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
    public void unsetText() {
        if( text != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) text ).eInverseRemove( this, SclPackage.TEXT__PARENT_HEADER, Text.class,
                    msgs );
            msgs = basicUnsetText( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTextESet = textESet;
            textESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.HEADER__TEXT, null, null,
                        oldTextESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetText() {
        return textESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public History getHistory() {
        return history;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetHistory( History newHistory, NotificationChain msgs ) {
        History oldHistory = history;
        history = newHistory;
        boolean oldHistoryESet = historyESet;
        historyESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, SclPackage.HEADER__HISTORY,
                    oldHistory, newHistory, !oldHistoryESet );
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
    public void setHistory( History newHistory ) {
        if( newHistory != history ) {
            NotificationChain msgs = null;
            if( history != null )
                msgs = ( ( InternalEObject ) history ).eInverseRemove( this, SclPackage.HISTORY__PARENT_HEADER,
                        History.class, msgs );
            if( newHistory != null )
                msgs = ( ( InternalEObject ) newHistory ).eInverseAdd( this, SclPackage.HISTORY__PARENT_HEADER,
                        History.class, msgs );
            msgs = basicSetHistory( newHistory, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldHistoryESet = historyESet;
            historyESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.HEADER__HISTORY, newHistory,
                        newHistory, !oldHistoryESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetHistory( NotificationChain msgs ) {
        History oldHistory = history;
        history = null;
        boolean oldHistoryESet = historyESet;
        historyESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    SclPackage.HEADER__HISTORY, oldHistory, null, oldHistoryESet );
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
    public void unsetHistory() {
        if( history != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) history ).eInverseRemove( this, SclPackage.HISTORY__PARENT_HEADER,
                    History.class, msgs );
            msgs = basicUnsetHistory( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldHistoryESet = historyESet;
            historyESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.HEADER__HISTORY, null, null,
                        oldHistoryESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHistory() {
        return historyESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case SclPackage.HEADER__PARENT_SCL:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentSCL( ( SCL ) otherEnd, msgs );
        case SclPackage.HEADER__TEXT:
            if( text != null )
                msgs = ( ( InternalEObject ) text ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - SclPackage.HEADER__TEXT, null, msgs );
            return basicSetText( ( Text ) otherEnd, msgs );
        case SclPackage.HEADER__HISTORY:
            if( history != null )
                msgs = ( ( InternalEObject ) history ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - SclPackage.HEADER__HISTORY, null, msgs );
            return basicSetHistory( ( History ) otherEnd, msgs );
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
        case SclPackage.HEADER__PARENT_SCL:
            return basicSetParentSCL( null, msgs );
        case SclPackage.HEADER__TEXT:
            return basicUnsetText( msgs );
        case SclPackage.HEADER__HISTORY:
            return basicUnsetHistory( msgs );
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
        case SclPackage.HEADER__PARENT_SCL:
            return eInternalContainer().eInverseRemove( this, SclPackage.SCL__HEADER, SCL.class, msgs );
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
        case SclPackage.HEADER__ID:
            return getId();
        case SclPackage.HEADER__NAME_STRUCTURE:
            return getNameStructure();
        case SclPackage.HEADER__REVISION:
            return getRevision();
        case SclPackage.HEADER__TOOL_ID:
            return getToolID();
        case SclPackage.HEADER__VERSION:
            return getVersion();
        case SclPackage.HEADER__PARENT_SCL:
            return getParentSCL();
        case SclPackage.HEADER__TEXT:
            return getText();
        case SclPackage.HEADER__HISTORY:
            return getHistory();
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
        case SclPackage.HEADER__ID:
            setId( ( String ) newValue );
            return;
        case SclPackage.HEADER__NAME_STRUCTURE:
            setNameStructure( ( String ) newValue );
            return;
        case SclPackage.HEADER__REVISION:
            setRevision( ( String ) newValue );
            return;
        case SclPackage.HEADER__TOOL_ID:
            setToolID( ( String ) newValue );
            return;
        case SclPackage.HEADER__VERSION:
            setVersion( ( String ) newValue );
            return;
        case SclPackage.HEADER__PARENT_SCL:
            setParentSCL( ( SCL ) newValue );
            return;
        case SclPackage.HEADER__TEXT:
            setText( ( Text ) newValue );
            return;
        case SclPackage.HEADER__HISTORY:
            setHistory( ( History ) newValue );
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
        case SclPackage.HEADER__ID:
            unsetId();
            return;
        case SclPackage.HEADER__NAME_STRUCTURE:
            unsetNameStructure();
            return;
        case SclPackage.HEADER__REVISION:
            unsetRevision();
            return;
        case SclPackage.HEADER__TOOL_ID:
            unsetToolID();
            return;
        case SclPackage.HEADER__VERSION:
            unsetVersion();
            return;
        case SclPackage.HEADER__PARENT_SCL:
            setParentSCL( ( SCL ) null );
            return;
        case SclPackage.HEADER__TEXT:
            unsetText();
            return;
        case SclPackage.HEADER__HISTORY:
            unsetHistory();
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
        case SclPackage.HEADER__ID:
            return isSetId();
        case SclPackage.HEADER__NAME_STRUCTURE:
            return isSetNameStructure();
        case SclPackage.HEADER__REVISION:
            return isSetRevision();
        case SclPackage.HEADER__TOOL_ID:
            return isSetToolID();
        case SclPackage.HEADER__VERSION:
            return isSetVersion();
        case SclPackage.HEADER__PARENT_SCL:
            return getParentSCL() != null;
        case SclPackage.HEADER__TEXT:
            return isSetText();
        case SclPackage.HEADER__HISTORY:
            return isSetHistory();
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
        if( eIsProxy() ) return super.toString();

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (id: " );
        if( idESet )
            result.append( id );
        else
            result.append( "<unset>" );
        result.append( ", nameStructure: " );
        if( nameStructureESet )
            result.append( nameStructure );
        else
            result.append( "<unset>" );
        result.append( ", revision: " );
        if( revisionESet )
            result.append( revision );
        else
            result.append( "<unset>" );
        result.append( ", toolID: " );
        if( toolIDESet )
            result.append( toolID );
        else
            result.append( "<unset>" );
        result.append( ", version: " );
        if( versionESet )
            result.append( version );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //HeaderImpl
