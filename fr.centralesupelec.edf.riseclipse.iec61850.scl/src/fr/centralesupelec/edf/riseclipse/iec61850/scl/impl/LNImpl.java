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

import java.util.List;
import java.util.stream.Collectors;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IED;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Val;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNImpl#getParentAccessPoint <em>Parent Access Point</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNImpl#getParentLDevice <em>Parent LDevice</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNImpl#getRefersToGSEControl <em>Refers To GSE Control</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LNImpl extends AnyLNImpl implements LN {
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
     * The cached value of the '{@link #getRefersToGSEControl() <em>Refers To GSE Control</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToGSEControl()
     * @generated
     * @ordered
     */
    protected GSEControl refersToGSEControl;

    /**
     * This is true if the Refers To GSE Control reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToGSEControlESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LNImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getLN();
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
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.LN__PREFIX, oldPrefix, prefix,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.LN__PREFIX, oldPrefix, PREFIX_EDEFAULT,
                    oldPrefixESet ) );
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
    public AccessPoint getParentAccessPoint() {
        if( eContainerFeatureID() != SclPackage.LN__PARENT_ACCESS_POINT ) {
            return null;
        }
        return ( AccessPoint ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentAccessPoint( AccessPoint newParentAccessPoint, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentAccessPoint, SclPackage.LN__PARENT_ACCESS_POINT, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentAccessPoint( AccessPoint newParentAccessPoint ) {
        if( newParentAccessPoint != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.LN__PARENT_ACCESS_POINT && newParentAccessPoint != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentAccessPoint ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentAccessPoint != null ) {
                msgs = ( ( InternalEObject ) newParentAccessPoint ).eInverseAdd( this, SclPackage.ACCESS_POINT__LN,
                        AccessPoint.class, msgs );
            }
            msgs = basicSetParentAccessPoint( newParentAccessPoint, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.LN__PARENT_ACCESS_POINT,
                    newParentAccessPoint, newParentAccessPoint ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LDevice getParentLDevice() {
        if( eContainerFeatureID() != SclPackage.LN__PARENT_LDEVICE ) {
            return null;
        }
        return ( LDevice ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentLDevice( LDevice newParentLDevice, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentLDevice, SclPackage.LN__PARENT_LDEVICE, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentLDevice( LDevice newParentLDevice ) {
        if( newParentLDevice != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.LN__PARENT_LDEVICE && newParentLDevice != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentLDevice ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentLDevice != null ) {
                msgs = ( ( InternalEObject ) newParentLDevice ).eInverseAdd( this, SclPackage.LDEVICE__LN,
                        LDevice.class, msgs );
            }
            msgs = basicSetParentLDevice( newParentLDevice, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.LN__PARENT_LDEVICE, newParentLDevice,
                    newParentLDevice ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GSEControl getRefersToGSEControl() {
        return refersToGSEControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToGSEControl( GSEControl newRefersToGSEControl, NotificationChain msgs ) {
        GSEControl oldRefersToGSEControl = refersToGSEControl;
        refersToGSEControl = newRefersToGSEControl;
        boolean oldRefersToGSEControlESet = refersToGSEControlESet;
        refersToGSEControlESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    SclPackage.LN__REFERS_TO_GSE_CONTROL, oldRefersToGSEControl, newRefersToGSEControl,
                    !oldRefersToGSEControlESet );
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
    public void setRefersToGSEControl( GSEControl newRefersToGSEControl ) {
        if( newRefersToGSEControl != refersToGSEControl ) {
            NotificationChain msgs = null;
            if( refersToGSEControl != null ) {
                msgs = ( ( InternalEObject ) refersToGSEControl ).eInverseRemove( this,
                        SclPackage.GSE_CONTROL__REFERRED_BY_LSVS, GSEControl.class, msgs );
            }
            if( newRefersToGSEControl != null ) {
                msgs = ( ( InternalEObject ) newRefersToGSEControl ).eInverseAdd( this,
                        SclPackage.GSE_CONTROL__REFERRED_BY_LSVS, GSEControl.class, msgs );
            }
            msgs = basicSetRefersToGSEControl( newRefersToGSEControl, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToGSEControlESet = refersToGSEControlESet;
            refersToGSEControlESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.LN__REFERS_TO_GSE_CONTROL,
                        newRefersToGSEControl, newRefersToGSEControl, !oldRefersToGSEControlESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToGSEControl( NotificationChain msgs ) {
        GSEControl oldRefersToGSEControl = refersToGSEControl;
        refersToGSEControl = null;
        boolean oldRefersToGSEControlESet = refersToGSEControlESet;
        refersToGSEControlESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    SclPackage.LN__REFERS_TO_GSE_CONTROL, oldRefersToGSEControl, null, oldRefersToGSEControlESet );
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
    public void unsetRefersToGSEControl() {
        if( refersToGSEControl != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToGSEControl ).eInverseRemove( this,
                    SclPackage.GSE_CONTROL__REFERRED_BY_LSVS, GSEControl.class, msgs );
            msgs = basicUnsetRefersToGSEControl( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToGSEControlESet = refersToGSEControlESet;
            refersToGSEControlESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.LN__REFERS_TO_GSE_CONTROL, null,
                        null, oldRefersToGSEControlESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToGSEControl() {
        return refersToGSEControlESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case SclPackage.LN__PARENT_ACCESS_POINT:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentAccessPoint( ( AccessPoint ) otherEnd, msgs );
        case SclPackage.LN__PARENT_LDEVICE:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentLDevice( ( LDevice ) otherEnd, msgs );
        case SclPackage.LN__REFERS_TO_GSE_CONTROL:
            if( refersToGSEControl != null ) {
                msgs = ( ( InternalEObject ) refersToGSEControl ).eInverseRemove( this,
                        SclPackage.GSE_CONTROL__REFERRED_BY_LSVS, GSEControl.class, msgs );
            }
            return basicSetRefersToGSEControl( ( GSEControl ) otherEnd, msgs );
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
        case SclPackage.LN__PARENT_ACCESS_POINT:
            return basicSetParentAccessPoint( null, msgs );
        case SclPackage.LN__PARENT_LDEVICE:
            return basicSetParentLDevice( null, msgs );
        case SclPackage.LN__REFERS_TO_GSE_CONTROL:
            return basicUnsetRefersToGSEControl( msgs );
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
        case SclPackage.LN__PARENT_ACCESS_POINT:
            return eInternalContainer().eInverseRemove( this, SclPackage.ACCESS_POINT__LN, AccessPoint.class, msgs );
        case SclPackage.LN__PARENT_LDEVICE:
            return eInternalContainer().eInverseRemove( this, SclPackage.LDEVICE__LN, LDevice.class, msgs );
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
        case SclPackage.LN__PREFIX:
            return getPrefix();
        case SclPackage.LN__PARENT_ACCESS_POINT:
            return getParentAccessPoint();
        case SclPackage.LN__PARENT_LDEVICE:
            return getParentLDevice();
        case SclPackage.LN__REFERS_TO_GSE_CONTROL:
            return getRefersToGSEControl();
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
        case SclPackage.LN__PREFIX:
            setPrefix( ( String ) newValue );
            return;
        case SclPackage.LN__PARENT_ACCESS_POINT:
            setParentAccessPoint( ( AccessPoint ) newValue );
            return;
        case SclPackage.LN__PARENT_LDEVICE:
            setParentLDevice( ( LDevice ) newValue );
            return;
        case SclPackage.LN__REFERS_TO_GSE_CONTROL:
            setRefersToGSEControl( ( GSEControl ) newValue );
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
        case SclPackage.LN__PREFIX:
            unsetPrefix();
            return;
        case SclPackage.LN__PARENT_ACCESS_POINT:
            setParentAccessPoint( ( AccessPoint ) null );
            return;
        case SclPackage.LN__PARENT_LDEVICE:
            setParentLDevice( ( LDevice ) null );
            return;
        case SclPackage.LN__REFERS_TO_GSE_CONTROL:
            unsetRefersToGSEControl();
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
        case SclPackage.LN__PREFIX:
            return isSetPrefix();
        case SclPackage.LN__PARENT_ACCESS_POINT:
            return getParentAccessPoint() != null;
        case SclPackage.LN__PARENT_LDEVICE:
            return getParentLDevice() != null;
        case SclPackage.LN__REFERS_TO_GSE_CONTROL:
            return isSetRefersToGSEControl();
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
        result.append( " (prefix: " );
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
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(), "LN.doBuildExplicitLinks()" );

        //@formatter:off

        // see Issue #13
        super.doBuildExplicitLinks( console );
        
        if( ! "LGOS".equals( getLnClass() )) return;

        String messagePrefix = "while resolving link to GSEControl from LN lnClass=\"LGOS\":";
        
        List< DOI > goCBRef =
             getDOI()
            .stream()
            .filter( doi -> "GoCBRef".equals( doi.getName() ))
            .collect( Collectors.toList() );
        if( goCBRef.size() > 1 ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                             messagePrefix, "found several DOI named GoCBRef" );
            return;            
        }
        if( goCBRef.size() == 0 ) {
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "found no DOI named GoCBRef" );
            return;            
        }
        
        // Look for DAI name="setSrcRef" in GrRef
        List< DAI > setSrcRef =
                 goCBRef
                .get( 0 )
                .getDAI()
                .stream()
                .filter( dai -> "setSrcRef".equals( dai.getName() ))
                .toList();
        if( setSrcRef.size() == 0 ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                             messagePrefix, "found no DAI named setSrcRef in GoCBRef on line ", goCBRef.get( 0 ).getLineNumber() );
            return;
        }
        if( setSrcRef.size() > 1 ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                             messagePrefix, "found several DAI named setSrcRef in GoCBRef on line ", goCBRef.get( 0 ).getLineNumber() );
            return;
        }
        
        if( setSrcRef.get( 0 ).getVal().size() == 0 ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                             messagePrefix, "found no Val in setSrcRef on line ", setSrcRef.get( 0 ).getLineNumber() );
            return;
        }
        if( setSrcRef.get( 0 ).getVal().size() > 1 ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                             messagePrefix, "found several Val in setSrcRef on line ", setSrcRef.get( 0 ).getLineNumber() );
            return;            
        }
        
        Val val = setSrcRef.get( 0 ).getVal().get( 0 );
        String gSEControlName = val.getValue();
        if(( gSEControlName == null ) || ( gSEControlName.length() <= 1 )) {
            console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                             messagePrefix, "found no Val or empty Val in setSrcRef on line ", setSrcRef.get( 0 ).getLineNumber() );
            return;            
        }
        if( gSEControlName.indexOf( '/' ) == -1 ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "Val of setSrcRef on line ", setSrcRef.get( 0 ).getLineNumber(), " is illformed, it should contain \"/\"" );
            return;
        }
        if(( gSEControlName.indexOf( '.' ) == -1 ) || ( gSEControlName.indexOf( '.' ) != gSEControlName.indexOf( '/' ) + 5 )) {
            console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "Val of setSrcRef on line ", setSrcRef.get( 0 ).getLineNumber(), " is illformed, it should contain \"/LLN0.\"" );
            return;
        }
        if( ! "/LLN0.".equals( gSEControlName.subSequence( gSEControlName.indexOf( '/' ), gSEControlName.indexOf( '.' ) + 1 ))) {
            console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "Val of setSrcRef on line ", setSrcRef.get( 0 ).getLineNumber(), " is illformed, it should contain \"/LLN0.\"" );
            return;
        }
        
        SCL scl = getParentLDevice().getParentServer().getParentAccessPoint().getParentIED().getParentSCL();
        List< IED > ieds =
                 scl
                .getIED()
                .stream()
                .filter( ied -> gSEControlName.startsWith( ied.getName() ))
                .toList();
        if( ieds.size() == 0 ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                             messagePrefix, "found no IED whose name is the start of ", gSEControlName, " on line ", val.getLineNumber() );
            return;
        }
        if( ieds.size() > 1 ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "found several IED whose name is the start of ", gSEControlName, " on line ", val.getLineNumber() );
            return;
        }
        String ldInst = gSEControlName.substring( ieds.get( 0 ).getName().length(), gSEControlName.indexOf( '/' ));
        List< LDevice > lDevices =
                 ieds
                .get( 0 )
                .getAccessPoint()
                .stream()
                .map( ap -> ap.getServer() )
                .filter(  s -> s != null  )
                .map( s -> s.getLDevice() )
                .flatMap( List::stream )
                .filter( ld -> ( ld != null ) && ld.getInst().equals( ldInst ))
                .toList();
        if( lDevices.size() == 0 ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "found no LDevice whose inst is ", ldInst, " in IED on line ", ieds.get( 0 ).getLineNumber() );
            return;
        }
        if( lDevices.size() > 1 ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "found several LDevice whose inst is ", ldInst, " in IED on line ", ieds.get( 0 ).getLineNumber() );
            return;
        }
        
        LN0 ln0 = lDevices.get( 0 ).getLN0();
        if( ln0 == null ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "found no LN0 in LDevice on line ", lDevices.get( 0 ).getLineNumber() );
            return;
        }
        
        List< GSEControl > gseControls =
                 ln0
                .getGSEControl()
                .stream()
                .filter( gse -> gse.getName().equals( gSEControlName.substring( gSEControlName.indexOf( '.' ) + 1 )))
                .toList();
        if( gseControls.size() == 0 ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "found no GSEControl whose name is ", gSEControlName.substring( gSEControlName.indexOf( '.' ) + 1 ), " in IED on line ", ieds.get( 0 ).getLineNumber() );
            return;
        }
        if( gseControls.size() > 1 ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "found several GSEControl whose name is ", gSEControlName.substring( gSEControlName.indexOf( '.' ) + 1 ), " in IED on line ", ieds.get( 0 ).getLineNumber() );
            return;
        }
        
        setRefersToGSEControl( gseControls.get( 0 ));
    }

} //LNImpl
