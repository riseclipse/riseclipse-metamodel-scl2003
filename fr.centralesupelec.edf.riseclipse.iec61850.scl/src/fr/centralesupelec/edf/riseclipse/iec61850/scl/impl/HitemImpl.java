/*
*************************************************************************
**  Copyright (c) 2016-2021 CentraleSupélec & EDF.
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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.History;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hitem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.HitemImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.HitemImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.HitemImpl#getWhat <em>What</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.HitemImpl#getWhen <em>When</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.HitemImpl#getWho <em>Who</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.HitemImpl#getWhy <em>Why</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.HitemImpl#getParentHistory <em>Parent History</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HitemImpl extends SclObjectImpl implements Hitem {
    /**
     * The default value of the '{@link #getRevision() <em>Revision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRevision()
     * @generated
     * @ordered
     */
    protected static final String REVISION_EDEFAULT = null;

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
     * The default value of the '{@link #getWhat() <em>What</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWhat()
     * @generated
     * @ordered
     */
    protected static final String WHAT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWhat() <em>What</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWhat()
     * @generated
     * @ordered
     */
    protected String what = WHAT_EDEFAULT;

    /**
     * This is true if the What attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean whatESet;

    /**
     * The default value of the '{@link #getWhen() <em>When</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWhen()
     * @generated
     * @ordered
     */
    protected static final String WHEN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWhen() <em>When</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWhen()
     * @generated
     * @ordered
     */
    protected String when = WHEN_EDEFAULT;

    /**
     * This is true if the When attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean whenESet;

    /**
     * The default value of the '{@link #getWho() <em>Who</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWho()
     * @generated
     * @ordered
     */
    protected static final String WHO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWho() <em>Who</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWho()
     * @generated
     * @ordered
     */
    protected String who = WHO_EDEFAULT;

    /**
     * This is true if the Who attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean whoESet;

    /**
     * The default value of the '{@link #getWhy() <em>Why</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWhy()
     * @generated
     * @ordered
     */
    protected static final String WHY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWhy() <em>Why</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWhy()
     * @generated
     * @ordered
     */
    protected String why = WHY_EDEFAULT;

    /**
     * This is true if the Why attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean whyESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected HitemImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getHitem();
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
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.HITEM__REVISION, oldRevision, revision,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.HITEM__REVISION, oldRevision,
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
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.HITEM__VERSION, oldVersion, version,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.HITEM__VERSION, oldVersion,
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
    public String getWhat() {
        return what;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWhat( String newWhat ) {
        String oldWhat = what;
        what = newWhat;
        boolean oldWhatESet = whatESet;
        whatESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.HITEM__WHAT, oldWhat, what,
                    !oldWhatESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWhat() {
        String oldWhat = what;
        boolean oldWhatESet = whatESet;
        what = WHAT_EDEFAULT;
        whatESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.HITEM__WHAT, oldWhat, WHAT_EDEFAULT,
                    oldWhatESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWhat() {
        return whatESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getWhen() {
        return when;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWhen( String newWhen ) {
        String oldWhen = when;
        when = newWhen;
        boolean oldWhenESet = whenESet;
        whenESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.HITEM__WHEN, oldWhen, when,
                    !oldWhenESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWhen() {
        String oldWhen = when;
        boolean oldWhenESet = whenESet;
        when = WHEN_EDEFAULT;
        whenESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.HITEM__WHEN, oldWhen, WHEN_EDEFAULT,
                    oldWhenESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWhen() {
        return whenESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getWho() {
        return who;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWho( String newWho ) {
        String oldWho = who;
        who = newWho;
        boolean oldWhoESet = whoESet;
        whoESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.HITEM__WHO, oldWho, who, !oldWhoESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWho() {
        String oldWho = who;
        boolean oldWhoESet = whoESet;
        who = WHO_EDEFAULT;
        whoESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.HITEM__WHO, oldWho, WHO_EDEFAULT,
                    oldWhoESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWho() {
        return whoESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getWhy() {
        return why;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWhy( String newWhy ) {
        String oldWhy = why;
        why = newWhy;
        boolean oldWhyESet = whyESet;
        whyESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.HITEM__WHY, oldWhy, why, !oldWhyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWhy() {
        String oldWhy = why;
        boolean oldWhyESet = whyESet;
        why = WHY_EDEFAULT;
        whyESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.HITEM__WHY, oldWhy, WHY_EDEFAULT,
                    oldWhyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWhy() {
        return whyESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public History getParentHistory() {
        if( eContainerFeatureID() != SclPackage.HITEM__PARENT_HISTORY ) return null;
        return ( History ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentHistory( History newParentHistory, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentHistory, SclPackage.HITEM__PARENT_HISTORY, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentHistory( History newParentHistory ) {
        if( newParentHistory != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.HITEM__PARENT_HISTORY && newParentHistory != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentHistory ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentHistory != null )
                msgs = ( ( InternalEObject ) newParentHistory ).eInverseAdd( this, SclPackage.HISTORY__HITEM,
                        History.class, msgs );
            msgs = basicSetParentHistory( newParentHistory, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.HITEM__PARENT_HISTORY, newParentHistory,
                    newParentHistory ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case SclPackage.HITEM__PARENT_HISTORY:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentHistory( ( History ) otherEnd, msgs );
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
        case SclPackage.HITEM__PARENT_HISTORY:
            return basicSetParentHistory( null, msgs );
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
        case SclPackage.HITEM__PARENT_HISTORY:
            return eInternalContainer().eInverseRemove( this, SclPackage.HISTORY__HITEM, History.class, msgs );
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
        case SclPackage.HITEM__REVISION:
            return getRevision();
        case SclPackage.HITEM__VERSION:
            return getVersion();
        case SclPackage.HITEM__WHAT:
            return getWhat();
        case SclPackage.HITEM__WHEN:
            return getWhen();
        case SclPackage.HITEM__WHO:
            return getWho();
        case SclPackage.HITEM__WHY:
            return getWhy();
        case SclPackage.HITEM__PARENT_HISTORY:
            return getParentHistory();
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
        case SclPackage.HITEM__REVISION:
            setRevision( ( String ) newValue );
            return;
        case SclPackage.HITEM__VERSION:
            setVersion( ( String ) newValue );
            return;
        case SclPackage.HITEM__WHAT:
            setWhat( ( String ) newValue );
            return;
        case SclPackage.HITEM__WHEN:
            setWhen( ( String ) newValue );
            return;
        case SclPackage.HITEM__WHO:
            setWho( ( String ) newValue );
            return;
        case SclPackage.HITEM__WHY:
            setWhy( ( String ) newValue );
            return;
        case SclPackage.HITEM__PARENT_HISTORY:
            setParentHistory( ( History ) newValue );
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
        case SclPackage.HITEM__REVISION:
            unsetRevision();
            return;
        case SclPackage.HITEM__VERSION:
            unsetVersion();
            return;
        case SclPackage.HITEM__WHAT:
            unsetWhat();
            return;
        case SclPackage.HITEM__WHEN:
            unsetWhen();
            return;
        case SclPackage.HITEM__WHO:
            unsetWho();
            return;
        case SclPackage.HITEM__WHY:
            unsetWhy();
            return;
        case SclPackage.HITEM__PARENT_HISTORY:
            setParentHistory( ( History ) null );
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
        case SclPackage.HITEM__REVISION:
            return isSetRevision();
        case SclPackage.HITEM__VERSION:
            return isSetVersion();
        case SclPackage.HITEM__WHAT:
            return isSetWhat();
        case SclPackage.HITEM__WHEN:
            return isSetWhen();
        case SclPackage.HITEM__WHO:
            return isSetWho();
        case SclPackage.HITEM__WHY:
            return isSetWhy();
        case SclPackage.HITEM__PARENT_HISTORY:
            return getParentHistory() != null;
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
        result.append( " (revision: " );
        if( revisionESet )
            result.append( revision );
        else
            result.append( "<unset>" );
        result.append( ", version: " );
        if( versionESet )
            result.append( version );
        else
            result.append( "<unset>" );
        result.append( ", what: " );
        if( whatESet )
            result.append( what );
        else
            result.append( "<unset>" );
        result.append( ", when: " );
        if( whenESet )
            result.append( when );
        else
            result.append( "<unset>" );
        result.append( ", who: " );
        if( whoESet )
            result.append( who );
        else
            result.append( "<unset>" );
        result.append( ", why: " );
        if( whyESet )
            result.append( why );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //HitemImpl
