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

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AgDesc;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.BaseElement;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DORef;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Private;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Text;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DO Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DORefImpl#getLineNumber <em>Line Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DORefImpl#isExplicitLinksBuilt <em>Explicit Links Built</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DORefImpl#getFilename <em>Filename</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DORefImpl#getXpath <em>Xpath</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DORefImpl#getPrivate <em>Private</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DORefImpl#getText <em>Text</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DORefImpl#getAny <em>Any</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DORefImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DORefImpl#getDesc <em>Desc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DORefImpl#getDoName <em>Do Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DORefImpl#getIedName <em>Ied Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DORefImpl#getLdInst <em>Ld Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DORefImpl#getLnClass <em>Ln Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DORefImpl#getLnInst <em>Ln Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DORefImpl#getLnUuid <em>Ln Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DORefImpl#getPDO <em>PDO</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DORefImpl#getPLN <em>PLN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DORefImpl#getPrefix <em>Prefix</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DORefImpl extends AgUuidImpl implements DORef {
    /**
     * The default value of the '{@link #getLineNumber() <em>Line Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLineNumber()
     * @generated
     * @ordered
     */
    protected static final int LINE_NUMBER_EDEFAULT = -1;

    /**
     * The cached value of the '{@link #getLineNumber() <em>Line Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLineNumber()
     * @generated
     * @ordered
     */
    protected int lineNumber = LINE_NUMBER_EDEFAULT;

    /**
     * The default value of the '{@link #isExplicitLinksBuilt() <em>Explicit Links Built</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isExplicitLinksBuilt()
     * @generated
     * @ordered
     */
    protected static final boolean EXPLICIT_LINKS_BUILT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isExplicitLinksBuilt() <em>Explicit Links Built</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isExplicitLinksBuilt()
     * @generated
     * @ordered
     */
    protected boolean explicitLinksBuilt = EXPLICIT_LINKS_BUILT_EDEFAULT;

    /**
     * The default value of the '{@link #getFilename() <em>Filename</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFilename()
     * @generated
     * @ordered
     */
    protected static final String FILENAME_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getFilename() <em>Filename</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFilename()
     * @generated
     * @ordered
     */
    protected String filename = FILENAME_EDEFAULT;

    /**
     * The default value of the '{@link #getXpath() <em>Xpath</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXpath()
     * @generated
     * @ordered
     */
    protected static final String XPATH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPrivate() <em>Private</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrivate()
     * @generated
     * @ordered
     */
    protected EList< Private > private_;

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
     * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAny()
     * @generated
     * @ordered
     */
    protected FeatureMap any;

    /**
     * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnyAttribute()
     * @generated
     * @ordered
     */
    protected FeatureMap anyAttribute;

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
     * The default value of the '{@link #getLnUuid() <em>Ln Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLnUuid()
     * @generated
     * @ordered
     */
    protected static final String LN_UUID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLnUuid() <em>Ln Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLnUuid()
     * @generated
     * @ordered
     */
    protected String lnUuid = LN_UUID_EDEFAULT;

    /**
     * This is true if the Ln Uuid attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lnUuidESet;

    /**
     * The default value of the '{@link #getPDO() <em>PDO</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPDO()
     * @generated
     * @ordered
     */
    protected static final String PDO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPDO() <em>PDO</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPDO()
     * @generated
     * @ordered
     */
    protected String pDO = PDO_EDEFAULT;

    /**
     * This is true if the PDO attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pDOESet;

    /**
     * The default value of the '{@link #getPLN() <em>PLN</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPLN()
     * @generated
     * @ordered
     */
    protected static final String PLN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPLN() <em>PLN</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPLN()
     * @generated
     * @ordered
     */
    protected String pLN = PLN_EDEFAULT;

    /**
     * This is true if the PLN attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pLNESet;

    /**
     * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrefix()
     * @generated
     * @ordered
     */
    protected static final String PREFIX_EDEFAULT = null;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DORefImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getDORef();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getLineNumber() {
        return lineNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLineNumber( int newLineNumber ) {
        int oldLineNumber = lineNumber;
        lineNumber = newLineNumber;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.DO_REF__LINE_NUMBER, oldLineNumber,
                    lineNumber ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isExplicitLinksBuilt() {
        return explicitLinksBuilt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setExplicitLinksBuilt( boolean newExplicitLinksBuilt ) {
        boolean oldExplicitLinksBuilt = explicitLinksBuilt;
        explicitLinksBuilt = newExplicitLinksBuilt;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.DO_REF__EXPLICIT_LINKS_BUILT,
                    oldExplicitLinksBuilt, explicitLinksBuilt ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getFilename() {
        return filename;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFilename( String newFilename ) {
        String oldFilename = filename;
        filename = newFilename;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.DO_REF__FILENAME, oldFilename,
                    filename ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getXpath() {
        // TODO: implement this method to return the 'Xpath' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Private > getPrivate() {
        if( private_ == null ) {
            private_ = new EObjectContainmentWithInverseEList.Unsettable< >( Private.class, this,
                    SclPackage.DO_REF__PRIVATE, SclPackage.PRIVATE__PARENT_BASE_ELEMENT );
        }
        return private_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPrivate() {
        if( private_ != null ) {
            ( ( InternalEList.Unsettable< ? > ) private_ ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPrivate() {
        return private_ != null && ( ( InternalEList.Unsettable< ? > ) private_ ).isSet();
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
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, SclPackage.DO_REF__TEXT,
                    oldText, newText, !oldTextESet );
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
    public void setText( Text newText ) {
        if( newText != text ) {
            NotificationChain msgs = null;
            if( text != null ) {
                msgs = ( ( InternalEObject ) text ).eInverseRemove( this, SclPackage.TEXT__PARENT_BASE_ELEMENT,
                        Text.class, msgs );
            }
            if( newText != null ) {
                msgs = ( ( InternalEObject ) newText ).eInverseAdd( this, SclPackage.TEXT__PARENT_BASE_ELEMENT,
                        Text.class, msgs );
            }
            msgs = basicSetText( newText, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldTextESet = textESet;
            textESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.DO_REF__TEXT, newText, newText,
                        !oldTextESet ) );
            }
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
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET, SclPackage.DO_REF__TEXT,
                    oldText, null, oldTextESet );
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
    public void unsetText() {
        if( text != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) text ).eInverseRemove( this, SclPackage.TEXT__PARENT_BASE_ELEMENT, Text.class,
                    msgs );
            msgs = basicUnsetText( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldTextESet = textESet;
            textESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.DO_REF__TEXT, null, null,
                        oldTextESet ) );
            }
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
    public FeatureMap getAny() {
        if( any == null ) {
            any = new BasicFeatureMap( this, SclPackage.DO_REF__ANY );
        }
        return any;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FeatureMap getAnyAttribute() {
        if( anyAttribute == null ) {
            anyAttribute = new BasicFeatureMap( this, SclPackage.DO_REF__ANY_ATTRIBUTE );
        }
        return anyAttribute;
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
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.DO_REF__DESC, oldDesc, desc,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.DO_REF__DESC, oldDesc, DESC_EDEFAULT,
                    oldDescESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.DO_REF__DO_NAME, oldDoName, doName,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.DO_REF__DO_NAME, oldDoName,
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
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.DO_REF__IED_NAME, oldIedName, iedName,
                    !oldIedNameESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.DO_REF__IED_NAME, oldIedName,
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
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.DO_REF__LD_INST, oldLdInst, ldInst,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.DO_REF__LD_INST, oldLdInst,
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
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.DO_REF__LN_CLASS, oldLnClass, lnClass,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.DO_REF__LN_CLASS, oldLnClass,
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
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.DO_REF__LN_INST, oldLnInst, lnInst,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.DO_REF__LN_INST, oldLnInst,
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
    public String getLnUuid() {
        return lnUuid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLnUuid( String newLnUuid ) {
        String oldLnUuid = lnUuid;
        lnUuid = newLnUuid;
        boolean oldLnUuidESet = lnUuidESet;
        lnUuidESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.DO_REF__LN_UUID, oldLnUuid, lnUuid,
                    !oldLnUuidESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLnUuid() {
        String oldLnUuid = lnUuid;
        boolean oldLnUuidESet = lnUuidESet;
        lnUuid = LN_UUID_EDEFAULT;
        lnUuidESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.DO_REF__LN_UUID, oldLnUuid,
                    LN_UUID_EDEFAULT, oldLnUuidESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLnUuid() {
        return lnUuidESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPDO() {
        return pDO;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPDO( String newPDO ) {
        String oldPDO = pDO;
        pDO = newPDO;
        boolean oldPDOESet = pDOESet;
        pDOESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.DO_REF__PDO, oldPDO, pDO,
                    !oldPDOESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPDO() {
        String oldPDO = pDO;
        boolean oldPDOESet = pDOESet;
        pDO = PDO_EDEFAULT;
        pDOESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.DO_REF__PDO, oldPDO, PDO_EDEFAULT,
                    oldPDOESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPDO() {
        return pDOESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPLN() {
        return pLN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPLN( String newPLN ) {
        String oldPLN = pLN;
        pLN = newPLN;
        boolean oldPLNESet = pLNESet;
        pLNESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.DO_REF__PLN, oldPLN, pLN,
                    !oldPLNESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPLN() {
        String oldPLN = pLN;
        boolean oldPLNESet = pLNESet;
        pLN = PLN_EDEFAULT;
        pLNESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.DO_REF__PLN, oldPLN, PLN_EDEFAULT,
                    oldPLNESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPLN() {
        return pLNESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.DO_REF__PREFIX, oldPrefix, prefix,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.DO_REF__PREFIX, oldPrefix,
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
    public boolean buildExplicitLinks( IRiseClipseConsole console, Boolean forceUpdate ) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
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
        case SclPackage.DO_REF__PRIVATE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getPrivate() ).basicAdd( otherEnd,
                    msgs );
        case SclPackage.DO_REF__TEXT:
            if( text != null ) {
                msgs = ( ( InternalEObject ) text ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - SclPackage.DO_REF__TEXT, null, msgs );
            }
            return basicSetText( ( Text ) otherEnd, msgs );
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
        case SclPackage.DO_REF__PRIVATE:
            return ( ( InternalEList< ? > ) getPrivate() ).basicRemove( otherEnd, msgs );
        case SclPackage.DO_REF__TEXT:
            return basicUnsetText( msgs );
        case SclPackage.DO_REF__ANY:
            return ( ( InternalEList< ? > ) getAny() ).basicRemove( otherEnd, msgs );
        case SclPackage.DO_REF__ANY_ATTRIBUTE:
            return ( ( InternalEList< ? > ) getAnyAttribute() ).basicRemove( otherEnd, msgs );
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
        case SclPackage.DO_REF__LINE_NUMBER:
            return getLineNumber();
        case SclPackage.DO_REF__EXPLICIT_LINKS_BUILT:
            return isExplicitLinksBuilt();
        case SclPackage.DO_REF__FILENAME:
            return getFilename();
        case SclPackage.DO_REF__XPATH:
            return getXpath();
        case SclPackage.DO_REF__PRIVATE:
            return getPrivate();
        case SclPackage.DO_REF__TEXT:
            return getText();
        case SclPackage.DO_REF__ANY:
            if( coreType ) {
                return getAny();
            }
            return ( ( FeatureMap.Internal ) getAny() ).getWrapper();
        case SclPackage.DO_REF__ANY_ATTRIBUTE:
            if( coreType ) {
                return getAnyAttribute();
            }
            return ( ( FeatureMap.Internal ) getAnyAttribute() ).getWrapper();
        case SclPackage.DO_REF__DESC:
            return getDesc();
        case SclPackage.DO_REF__DO_NAME:
            return getDoName();
        case SclPackage.DO_REF__IED_NAME:
            return getIedName();
        case SclPackage.DO_REF__LD_INST:
            return getLdInst();
        case SclPackage.DO_REF__LN_CLASS:
            return getLnClass();
        case SclPackage.DO_REF__LN_INST:
            return getLnInst();
        case SclPackage.DO_REF__LN_UUID:
            return getLnUuid();
        case SclPackage.DO_REF__PDO:
            return getPDO();
        case SclPackage.DO_REF__PLN:
            return getPLN();
        case SclPackage.DO_REF__PREFIX:
            return getPrefix();
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
        case SclPackage.DO_REF__LINE_NUMBER:
            setLineNumber( ( Integer ) newValue );
            return;
        case SclPackage.DO_REF__EXPLICIT_LINKS_BUILT:
            setExplicitLinksBuilt( ( Boolean ) newValue );
            return;
        case SclPackage.DO_REF__FILENAME:
            setFilename( ( String ) newValue );
            return;
        case SclPackage.DO_REF__PRIVATE:
            getPrivate().clear();
            getPrivate().addAll( ( Collection< ? extends Private > ) newValue );
            return;
        case SclPackage.DO_REF__TEXT:
            setText( ( Text ) newValue );
            return;
        case SclPackage.DO_REF__ANY:
            ( ( FeatureMap.Internal ) getAny() ).set( newValue );
            return;
        case SclPackage.DO_REF__ANY_ATTRIBUTE:
            ( ( FeatureMap.Internal ) getAnyAttribute() ).set( newValue );
            return;
        case SclPackage.DO_REF__DESC:
            setDesc( ( String ) newValue );
            return;
        case SclPackage.DO_REF__DO_NAME:
            setDoName( ( String ) newValue );
            return;
        case SclPackage.DO_REF__IED_NAME:
            setIedName( ( String ) newValue );
            return;
        case SclPackage.DO_REF__LD_INST:
            setLdInst( ( String ) newValue );
            return;
        case SclPackage.DO_REF__LN_CLASS:
            setLnClass( ( String ) newValue );
            return;
        case SclPackage.DO_REF__LN_INST:
            setLnInst( ( String ) newValue );
            return;
        case SclPackage.DO_REF__LN_UUID:
            setLnUuid( ( String ) newValue );
            return;
        case SclPackage.DO_REF__PDO:
            setPDO( ( String ) newValue );
            return;
        case SclPackage.DO_REF__PLN:
            setPLN( ( String ) newValue );
            return;
        case SclPackage.DO_REF__PREFIX:
            setPrefix( ( String ) newValue );
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
        case SclPackage.DO_REF__LINE_NUMBER:
            setLineNumber( LINE_NUMBER_EDEFAULT );
            return;
        case SclPackage.DO_REF__EXPLICIT_LINKS_BUILT:
            setExplicitLinksBuilt( EXPLICIT_LINKS_BUILT_EDEFAULT );
            return;
        case SclPackage.DO_REF__FILENAME:
            setFilename( FILENAME_EDEFAULT );
            return;
        case SclPackage.DO_REF__PRIVATE:
            unsetPrivate();
            return;
        case SclPackage.DO_REF__TEXT:
            unsetText();
            return;
        case SclPackage.DO_REF__ANY:
            getAny().clear();
            return;
        case SclPackage.DO_REF__ANY_ATTRIBUTE:
            getAnyAttribute().clear();
            return;
        case SclPackage.DO_REF__DESC:
            unsetDesc();
            return;
        case SclPackage.DO_REF__DO_NAME:
            unsetDoName();
            return;
        case SclPackage.DO_REF__IED_NAME:
            unsetIedName();
            return;
        case SclPackage.DO_REF__LD_INST:
            unsetLdInst();
            return;
        case SclPackage.DO_REF__LN_CLASS:
            unsetLnClass();
            return;
        case SclPackage.DO_REF__LN_INST:
            unsetLnInst();
            return;
        case SclPackage.DO_REF__LN_UUID:
            unsetLnUuid();
            return;
        case SclPackage.DO_REF__PDO:
            unsetPDO();
            return;
        case SclPackage.DO_REF__PLN:
            unsetPLN();
            return;
        case SclPackage.DO_REF__PREFIX:
            unsetPrefix();
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
        case SclPackage.DO_REF__LINE_NUMBER:
            return lineNumber != LINE_NUMBER_EDEFAULT;
        case SclPackage.DO_REF__EXPLICIT_LINKS_BUILT:
            return explicitLinksBuilt != EXPLICIT_LINKS_BUILT_EDEFAULT;
        case SclPackage.DO_REF__FILENAME:
            return FILENAME_EDEFAULT == null ? filename != null : !FILENAME_EDEFAULT.equals( filename );
        case SclPackage.DO_REF__XPATH:
            return XPATH_EDEFAULT == null ? getXpath() != null : !XPATH_EDEFAULT.equals( getXpath() );
        case SclPackage.DO_REF__PRIVATE:
            return isSetPrivate();
        case SclPackage.DO_REF__TEXT:
            return isSetText();
        case SclPackage.DO_REF__ANY:
            return any != null && !any.isEmpty();
        case SclPackage.DO_REF__ANY_ATTRIBUTE:
            return anyAttribute != null && !anyAttribute.isEmpty();
        case SclPackage.DO_REF__DESC:
            return isSetDesc();
        case SclPackage.DO_REF__DO_NAME:
            return isSetDoName();
        case SclPackage.DO_REF__IED_NAME:
            return isSetIedName();
        case SclPackage.DO_REF__LD_INST:
            return isSetLdInst();
        case SclPackage.DO_REF__LN_CLASS:
            return isSetLnClass();
        case SclPackage.DO_REF__LN_INST:
            return isSetLnInst();
        case SclPackage.DO_REF__LN_UUID:
            return isSetLnUuid();
        case SclPackage.DO_REF__PDO:
            return isSetPDO();
        case SclPackage.DO_REF__PLN:
            return isSetPLN();
        case SclPackage.DO_REF__PREFIX:
            return isSetPrefix();
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
        if( baseClass == SclObject.class ) {
            switch( derivedFeatureID ) {
            case SclPackage.DO_REF__LINE_NUMBER:
                return SclPackage.SCL_OBJECT__LINE_NUMBER;
            case SclPackage.DO_REF__EXPLICIT_LINKS_BUILT:
                return SclPackage.SCL_OBJECT__EXPLICIT_LINKS_BUILT;
            case SclPackage.DO_REF__FILENAME:
                return SclPackage.SCL_OBJECT__FILENAME;
            case SclPackage.DO_REF__XPATH:
                return SclPackage.SCL_OBJECT__XPATH;
            default:
                return -1;
            }
        }
        if( baseClass == BaseElement.class ) {
            switch( derivedFeatureID ) {
            case SclPackage.DO_REF__PRIVATE:
                return SclPackage.BASE_ELEMENT__PRIVATE;
            case SclPackage.DO_REF__TEXT:
                return SclPackage.BASE_ELEMENT__TEXT;
            case SclPackage.DO_REF__ANY:
                return SclPackage.BASE_ELEMENT__ANY;
            case SclPackage.DO_REF__ANY_ATTRIBUTE:
                return SclPackage.BASE_ELEMENT__ANY_ATTRIBUTE;
            default:
                return -1;
            }
        }
        if( baseClass == AgDesc.class ) {
            switch( derivedFeatureID ) {
            case SclPackage.DO_REF__DESC:
                return SclPackage.AG_DESC__DESC;
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
        if( baseClass == SclObject.class ) {
            switch( baseFeatureID ) {
            case SclPackage.SCL_OBJECT__LINE_NUMBER:
                return SclPackage.DO_REF__LINE_NUMBER;
            case SclPackage.SCL_OBJECT__EXPLICIT_LINKS_BUILT:
                return SclPackage.DO_REF__EXPLICIT_LINKS_BUILT;
            case SclPackage.SCL_OBJECT__FILENAME:
                return SclPackage.DO_REF__FILENAME;
            case SclPackage.SCL_OBJECT__XPATH:
                return SclPackage.DO_REF__XPATH;
            default:
                return -1;
            }
        }
        if( baseClass == BaseElement.class ) {
            switch( baseFeatureID ) {
            case SclPackage.BASE_ELEMENT__PRIVATE:
                return SclPackage.DO_REF__PRIVATE;
            case SclPackage.BASE_ELEMENT__TEXT:
                return SclPackage.DO_REF__TEXT;
            case SclPackage.BASE_ELEMENT__ANY:
                return SclPackage.DO_REF__ANY;
            case SclPackage.BASE_ELEMENT__ANY_ATTRIBUTE:
                return SclPackage.DO_REF__ANY_ATTRIBUTE;
            default:
                return -1;
            }
        }
        if( baseClass == AgDesc.class ) {
            switch( baseFeatureID ) {
            case SclPackage.AG_DESC__DESC:
                return SclPackage.DO_REF__DESC;
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
    public int eDerivedOperationID( int baseOperationID, Class< ? > baseClass ) {
        if( baseClass == SclObject.class ) {
            switch( baseOperationID ) {
            case SclPackage.SCL_OBJECT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN:
                return SclPackage.DO_REF___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;
            default:
                return -1;
            }
        }
        if( baseClass == BaseElement.class ) {
            switch( baseOperationID ) {
            default:
                return -1;
            }
        }
        if( baseClass == AgDesc.class ) {
            switch( baseOperationID ) {
            default:
                return -1;
            }
        }
        return super.eDerivedOperationID( baseOperationID, baseClass );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eInvoke( int operationID, EList< ? > arguments ) throws InvocationTargetException {
        switch( operationID ) {
        case SclPackage.DO_REF___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN:
            return buildExplicitLinks( ( IRiseClipseConsole ) arguments.get( 0 ), ( Boolean ) arguments.get( 1 ) );
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
        result.append( " (lineNumber: " );
        result.append( lineNumber );
        result.append( ", explicitLinksBuilt: " );
        result.append( explicitLinksBuilt );
        result.append( ", filename: " );
        result.append( filename );
        result.append( ", any: " );
        result.append( any );
        result.append( ", anyAttribute: " );
        result.append( anyAttribute );
        result.append( ", desc: " );
        if( descESet ) {
            result.append( desc );
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
        result.append( ", lnUuid: " );
        if( lnUuidESet ) {
            result.append( lnUuid );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", pDO: " );
        if( pDOESet ) {
            result.append( pDO );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", pLN: " );
        if( pLNESet ) {
            result.append( pLN );
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

} //DORefImpl
