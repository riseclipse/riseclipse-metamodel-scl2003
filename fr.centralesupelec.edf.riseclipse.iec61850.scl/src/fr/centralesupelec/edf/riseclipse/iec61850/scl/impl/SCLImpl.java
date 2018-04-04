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

import java.util.Collection;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringConcatOperation;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.TupleValue;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Communication;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Header;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IED;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Line;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SCL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SCLImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SCLImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SCLImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SCLImpl#getLine <em>Line</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SCLImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SCLImpl#getIED <em>IED</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SCLImpl#getDataTypeTemplates <em>Data Type Templates</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SCLImpl#getCommunication <em>Communication</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SCLImpl#getSubstation <em>Substation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SCLImpl#getRelease <em>Release</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SCLImpl extends BaseElementImpl implements SCL {
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
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
    protected Header header;

    /**
	 * This is true if the Header containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean headerESet;

    /**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
    protected EList<Line> line;

    /**
	 * The cached value of the '{@link #getProcess() <em>Process</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
    protected EList<fr.centralesupelec.edf.riseclipse.iec61850.scl.Process> process;

    /**
	 * The cached value of the '{@link #getIED() <em>IED</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIED()
	 * @generated
	 * @ordered
	 */
    protected EList<IED> ied;

    /**
	 * The cached value of the '{@link #getDataTypeTemplates() <em>Data Type Templates</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDataTypeTemplates()
	 * @generated
	 * @ordered
	 */
    protected DataTypeTemplates dataTypeTemplates;

    /**
	 * This is true if the Data Type Templates containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean dataTypeTemplatesESet;

    /**
	 * The cached value of the '{@link #getCommunication() <em>Communication</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getCommunication()
	 * @generated
	 * @ordered
	 */
    protected Communication communication;

    /**
	 * This is true if the Communication containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean communicationESet;

    /**
	 * The cached value of the '{@link #getSubstation() <em>Substation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSubstation()
	 * @generated
	 * @ordered
	 */
    protected EList<Substation> substation;

    /**
	 * The default value of the '{@link #getRelease() <em>Release</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRelease()
	 * @generated
	 * @ordered
	 */
    protected static final Byte RELEASE_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getRelease() <em>Release</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRelease()
	 * @generated
	 * @ordered
	 */
    protected Byte release = RELEASE_EDEFAULT;

    /**
	 * This is true if the Release attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean releaseESet;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected SCLImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getSCL();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getRevision() {
		return revision;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setRevision( String newRevision ) {
		String oldRevision = revision;
		revision = newRevision;
		boolean oldRevisionESet = revisionESet;
		revisionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SCL__REVISION, oldRevision, revision, !oldRevisionESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetRevision() {
		String oldRevision = revision;
		boolean oldRevisionESet = revisionESet;
		revision = REVISION_EDEFAULT;
		revisionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SCL__REVISION, oldRevision, REVISION_EDEFAULT, oldRevisionESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetRevision() {
		return revisionESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getVersion() {
		return version;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setVersion( String newVersion ) {
		String oldVersion = version;
		version = newVersion;
		boolean oldVersionESet = versionESet;
		versionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SCL__VERSION, oldVersion, version, !oldVersionESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetVersion() {
		String oldVersion = version;
		boolean oldVersionESet = versionESet;
		version = VERSION_EDEFAULT;
		versionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SCL__VERSION, oldVersion, VERSION_EDEFAULT, oldVersionESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetVersion() {
		return versionESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Header getHeader() {
		return header;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetHeader( Header newHeader, NotificationChain msgs ) {
		Header oldHeader = header;
		header = newHeader;
		boolean oldHeaderESet = headerESet;
		headerESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SCL__HEADER, oldHeader, newHeader, !oldHeaderESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setHeader( Header newHeader ) {
		if (newHeader != header) {
			NotificationChain msgs = null;
			if (header != null)
				msgs = ((InternalEObject)header).eInverseRemove(this, SclPackage.HEADER__SCL, Header.class, msgs);
			if (newHeader != null)
				msgs = ((InternalEObject)newHeader).eInverseAdd(this, SclPackage.HEADER__SCL, Header.class, msgs);
			msgs = basicSetHeader(newHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldHeaderESet = headerESet;
			headerESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SCL__HEADER, newHeader, newHeader, !oldHeaderESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetHeader( NotificationChain msgs ) {
		Header oldHeader = header;
		header = null;
		boolean oldHeaderESet = headerESet;
		headerESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.SCL__HEADER, oldHeader, null, oldHeaderESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetHeader() {
		if (header != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)header).eInverseRemove(this, SclPackage.HEADER__SCL, Header.class, msgs);
			msgs = basicUnsetHeader(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldHeaderESet = headerESet;
			headerESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SCL__HEADER, null, null, oldHeaderESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetHeader() {
		return headerESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Line> getLine() {
		if (line == null) {
			line = new EObjectContainmentWithInverseEList.Unsettable<Line>(Line.class, this, SclPackage.SCL__LINE, SclPackage.LINE__SCL);
		}
		return line;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetLine() {
		if (line != null) ((InternalEList.Unsettable<?>)line).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetLine() {
		return line != null && ((InternalEList.Unsettable<?>)line).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<fr.centralesupelec.edf.riseclipse.iec61850.scl.Process> getProcess() {
		if (process == null) {
			process = new EObjectContainmentWithInverseEList.Unsettable<fr.centralesupelec.edf.riseclipse.iec61850.scl.Process>(fr.centralesupelec.edf.riseclipse.iec61850.scl.Process.class, this, SclPackage.SCL__PROCESS, SclPackage.PROCESS__SCL);
		}
		return process;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetProcess() {
		if (process != null) ((InternalEList.Unsettable<?>)process).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetProcess() {
		return process != null && ((InternalEList.Unsettable<?>)process).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<IED> getIED() {
		if (ied == null) {
			ied = new EObjectContainmentWithInverseEList.Unsettable<IED>(IED.class, this, SclPackage.SCL__IED, SclPackage.IED__SCL);
		}
		return ied;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetIED() {
		if (ied != null) ((InternalEList.Unsettable<?>)ied).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetIED() {
		return ied != null && ((InternalEList.Unsettable<?>)ied).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DataTypeTemplates getDataTypeTemplates() {
		return dataTypeTemplates;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetDataTypeTemplates( DataTypeTemplates newDataTypeTemplates, NotificationChain msgs ) {
		DataTypeTemplates oldDataTypeTemplates = dataTypeTemplates;
		dataTypeTemplates = newDataTypeTemplates;
		boolean oldDataTypeTemplatesESet = dataTypeTemplatesESet;
		dataTypeTemplatesESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SCL__DATA_TYPE_TEMPLATES, oldDataTypeTemplates, newDataTypeTemplates, !oldDataTypeTemplatesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDataTypeTemplates( DataTypeTemplates newDataTypeTemplates ) {
		if (newDataTypeTemplates != dataTypeTemplates) {
			NotificationChain msgs = null;
			if (dataTypeTemplates != null)
				msgs = ((InternalEObject)dataTypeTemplates).eInverseRemove(this, SclPackage.DATA_TYPE_TEMPLATES__SCL, DataTypeTemplates.class, msgs);
			if (newDataTypeTemplates != null)
				msgs = ((InternalEObject)newDataTypeTemplates).eInverseAdd(this, SclPackage.DATA_TYPE_TEMPLATES__SCL, DataTypeTemplates.class, msgs);
			msgs = basicSetDataTypeTemplates(newDataTypeTemplates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDataTypeTemplatesESet = dataTypeTemplatesESet;
			dataTypeTemplatesESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SCL__DATA_TYPE_TEMPLATES, newDataTypeTemplates, newDataTypeTemplates, !oldDataTypeTemplatesESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetDataTypeTemplates( NotificationChain msgs ) {
		DataTypeTemplates oldDataTypeTemplates = dataTypeTemplates;
		dataTypeTemplates = null;
		boolean oldDataTypeTemplatesESet = dataTypeTemplatesESet;
		dataTypeTemplatesESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.SCL__DATA_TYPE_TEMPLATES, oldDataTypeTemplates, null, oldDataTypeTemplatesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetDataTypeTemplates() {
		if (dataTypeTemplates != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)dataTypeTemplates).eInverseRemove(this, SclPackage.DATA_TYPE_TEMPLATES__SCL, DataTypeTemplates.class, msgs);
			msgs = basicUnsetDataTypeTemplates(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDataTypeTemplatesESet = dataTypeTemplatesESet;
			dataTypeTemplatesESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SCL__DATA_TYPE_TEMPLATES, null, null, oldDataTypeTemplatesESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetDataTypeTemplates() {
		return dataTypeTemplatesESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Communication getCommunication() {
		return communication;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetCommunication( Communication newCommunication, NotificationChain msgs ) {
		Communication oldCommunication = communication;
		communication = newCommunication;
		boolean oldCommunicationESet = communicationESet;
		communicationESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SCL__COMMUNICATION, oldCommunication, newCommunication, !oldCommunicationESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setCommunication( Communication newCommunication ) {
		if (newCommunication != communication) {
			NotificationChain msgs = null;
			if (communication != null)
				msgs = ((InternalEObject)communication).eInverseRemove(this, SclPackage.COMMUNICATION__SCL, Communication.class, msgs);
			if (newCommunication != null)
				msgs = ((InternalEObject)newCommunication).eInverseAdd(this, SclPackage.COMMUNICATION__SCL, Communication.class, msgs);
			msgs = basicSetCommunication(newCommunication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldCommunicationESet = communicationESet;
			communicationESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SCL__COMMUNICATION, newCommunication, newCommunication, !oldCommunicationESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetCommunication( NotificationChain msgs ) {
		Communication oldCommunication = communication;
		communication = null;
		boolean oldCommunicationESet = communicationESet;
		communicationESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.SCL__COMMUNICATION, oldCommunication, null, oldCommunicationESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetCommunication() {
		if (communication != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)communication).eInverseRemove(this, SclPackage.COMMUNICATION__SCL, Communication.class, msgs);
			msgs = basicUnsetCommunication(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldCommunicationESet = communicationESet;
			communicationESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SCL__COMMUNICATION, null, null, oldCommunicationESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetCommunication() {
		return communicationESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Substation> getSubstation() {
		if (substation == null) {
			substation = new EObjectContainmentWithInverseEList.Unsettable<Substation>(Substation.class, this, SclPackage.SCL__SUBSTATION, SclPackage.SUBSTATION__SCL);
		}
		return substation;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetSubstation() {
		if (substation != null) ((InternalEList.Unsettable<?>)substation).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetSubstation() {
		return substation != null && ((InternalEList.Unsettable<?>)substation).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Byte getRelease() {
		return release;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setRelease( Byte newRelease ) {
		Byte oldRelease = release;
		release = newRelease;
		boolean oldReleaseESet = releaseESet;
		releaseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SCL__RELEASE, oldRelease, release, !oldReleaseESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetRelease() {
		Byte oldRelease = release;
		boolean oldReleaseESet = releaseESet;
		release = RELEASE_EDEFAULT;
		releaseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SCL__RELEASE, oldRelease, RELEASE_EDEFAULT, oldReleaseESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetRelease() {
		return releaseESet;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSCL_version_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv SCL_version_required:
		 *   let severity : Integer[1] = 'SCL::SCL_version_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[1] = self.version <> null
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'version attribute shall be present in SCL (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'SCL::SCL_version_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_SCL_c_c_SCL_version_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ String version = this.getVersion();
			final /*@NonInvalid*/ boolean status = version != null;
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_version_32_attribute_32_shall_32_be_32_present_32_in_32_SCL_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_SCL_c_c_SCL_version_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSCL_version_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv SCL_version_valid:
		 *   let severity : Integer[1] = 'SCL::SCL_version_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.version <> null implies
		 *           self.validSclVersion(version)
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'version attribute shall be a year between 2000 and 2999 in SCL (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.version.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'SCL::SCL_version_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_SCL_c_c_SCL_version_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String version_0 = this.getVersion();
				final /*@NonInvalid*/ boolean ne = version_0 != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean validSclVersion = ((SclObject)this).validSclVersion(version_0);
					status = validSclVersion;
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_version_32_attribute_32_shall_32_be_32_a_32_year_32_between_32_2000_32_and_32_2999_32_in_32_SCL_32_o, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(version_0);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_SCL_c_c_SCL_version_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSCL_version_value_2007(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv SCL_version_value_2007:
		 *   let severity : Integer[1] = 'SCL::SCL_version_value_2007'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.version <> null implies self.version = '2007'
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'version attribute shall be equal to 2007 in SCL (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.version.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'SCL::SCL_version_value_2007'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_SCL_c_c_SCL_version_value_2007);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String version_0 = this.getVersion();
				final /*@NonInvalid*/ boolean ne = version_0 != null;
				/*@NonInvalid*/ boolean status;
				if (ne) {
					final /*@NonInvalid*/ boolean eq = SclTables.STR_2007.equals(version_0);
					status = eq;
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_version_32_attribute_32_shall_32_be_32_equal_32_to_32_2007_32_in_32_SCL_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(version_0);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_SCL_c_c_SCL_version_value_2007, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSCL_revision_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv SCL_revision_required:
		 *   let severity : Integer[1] = 'SCL::SCL_revision_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[1] = self.revision <> null
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'revision attribute shall be present in SCL (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'SCL::SCL_revision_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_SCL_c_c_SCL_revision_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ String revision = this.getRevision();
			final /*@NonInvalid*/ boolean status = revision != null;
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_revision_32_attribute_32_shall_32_be_32_present_32_in_32_SCL_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_SCL_c_c_SCL_revision_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSCL_revision_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv SCL_revision_valid:
		 *   let severity : Integer[1] = 'SCL::SCL_revision_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.revision <> null implies
		 *           self.validSclRevision(revision)
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'revision attribute shall be an uppercase letter in SCL (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.revision.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'SCL::SCL_revision_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_SCL_c_c_SCL_revision_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String revision = this.getRevision();
				final /*@NonInvalid*/ boolean ne = revision != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean validSclRevision = ((SclObject)this).validSclRevision(revision);
					status = validSclRevision;
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_revision_32_attribute_32_shall_32_be_32_an_32_uppercase_32_letter_32_in_32_SCL_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(revision);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_SCL_c_c_SCL_revision_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSCL_revision_value_B(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv SCL_revision_value_B:
		 *   let severity : Integer[1] = 'SCL::SCL_revision_value_B'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.revision <> null implies self.revision = 'B'
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'revision attribute shall be equal to B in SCL (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.revision.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'SCL::SCL_revision_value_B'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_SCL_c_c_SCL_revision_value_B);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String revision = this.getRevision();
				final /*@NonInvalid*/ boolean ne = revision != null;
				/*@NonInvalid*/ boolean status;
				if (ne) {
					final /*@NonInvalid*/ boolean eq = SclTables.STR_B.equals(revision);
					status = eq;
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_revision_32_attribute_32_shall_32_be_32_equal_32_to_32_B_32_in_32_SCL_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(revision);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_SCL_c_c_SCL_revision_value_B, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSCL_release_value_1(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv SCL_release_value_1:
		 *   let severity : Integer[1] = 'SCL::SCL_release_value_1'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.release <> null implies self.release = 1
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'release attribute shall be equal to 1 in SCL (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.release.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'SCL::SCL_release_value_1'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_SCL_c_c_SCL_release_value_1);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ Byte release = this.getRelease();
				final /*@NonInvalid*/ IntegerValue BOXED_release = release == null ? null : ValueUtil.integerValueOf(release);
				final /*@NonInvalid*/ boolean ne = BOXED_release != null;
				/*@NonInvalid*/ boolean status;
				if (ne) {
					final /*@NonInvalid*/ boolean eq = SclTables.INT_1.equals(BOXED_release);
					status = eq;
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_release_32_attribute_32_shall_32_be_32_equal_32_to_32_1_32_in_32_SCL_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_release);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_SCL_c_c_SCL_release_value_1, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSCL_one_Header_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv SCL_one_Header_required:
		 *   let severity : Integer[1] = 'SCL::SCL_one_Header_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[1] = self.Header <> null
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'SCL shall contain an Header (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'SCL::SCL_one_Header_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_SCL_c_c_SCL_one_Header_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ Header Header = this.getHeader();
			final /*@NonInvalid*/ boolean status = Header != null;
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_SCL_32_shall_32_contain_32_an_32_Header_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_SCL_c_c_SCL_one_Header_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
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
			case SclPackage.SCL__HEADER:
				if (header != null)
					msgs = ((InternalEObject)header).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SCL__HEADER, null, msgs);
				return basicSetHeader((Header)otherEnd, msgs);
			case SclPackage.SCL__LINE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLine()).basicAdd(otherEnd, msgs);
			case SclPackage.SCL__PROCESS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcess()).basicAdd(otherEnd, msgs);
			case SclPackage.SCL__IED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIED()).basicAdd(otherEnd, msgs);
			case SclPackage.SCL__DATA_TYPE_TEMPLATES:
				if (dataTypeTemplates != null)
					msgs = ((InternalEObject)dataTypeTemplates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SCL__DATA_TYPE_TEMPLATES, null, msgs);
				return basicSetDataTypeTemplates((DataTypeTemplates)otherEnd, msgs);
			case SclPackage.SCL__COMMUNICATION:
				if (communication != null)
					msgs = ((InternalEObject)communication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SCL__COMMUNICATION, null, msgs);
				return basicSetCommunication((Communication)otherEnd, msgs);
			case SclPackage.SCL__SUBSTATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubstation()).basicAdd(otherEnd, msgs);
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
			case SclPackage.SCL__HEADER:
				return basicUnsetHeader(msgs);
			case SclPackage.SCL__LINE:
				return ((InternalEList<?>)getLine()).basicRemove(otherEnd, msgs);
			case SclPackage.SCL__PROCESS:
				return ((InternalEList<?>)getProcess()).basicRemove(otherEnd, msgs);
			case SclPackage.SCL__IED:
				return ((InternalEList<?>)getIED()).basicRemove(otherEnd, msgs);
			case SclPackage.SCL__DATA_TYPE_TEMPLATES:
				return basicUnsetDataTypeTemplates(msgs);
			case SclPackage.SCL__COMMUNICATION:
				return basicUnsetCommunication(msgs);
			case SclPackage.SCL__SUBSTATION:
				return ((InternalEList<?>)getSubstation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
		switch (featureID) {
			case SclPackage.SCL__REVISION:
				return getRevision();
			case SclPackage.SCL__VERSION:
				return getVersion();
			case SclPackage.SCL__HEADER:
				return getHeader();
			case SclPackage.SCL__LINE:
				return getLine();
			case SclPackage.SCL__PROCESS:
				return getProcess();
			case SclPackage.SCL__IED:
				return getIED();
			case SclPackage.SCL__DATA_TYPE_TEMPLATES:
				return getDataTypeTemplates();
			case SclPackage.SCL__COMMUNICATION:
				return getCommunication();
			case SclPackage.SCL__SUBSTATION:
				return getSubstation();
			case SclPackage.SCL__RELEASE:
				return getRelease();
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
			case SclPackage.SCL__REVISION:
				setRevision((String)newValue);
				return;
			case SclPackage.SCL__VERSION:
				setVersion((String)newValue);
				return;
			case SclPackage.SCL__HEADER:
				setHeader((Header)newValue);
				return;
			case SclPackage.SCL__LINE:
				getLine().clear();
				getLine().addAll((Collection<? extends Line>)newValue);
				return;
			case SclPackage.SCL__PROCESS:
				getProcess().clear();
				getProcess().addAll((Collection<? extends fr.centralesupelec.edf.riseclipse.iec61850.scl.Process>)newValue);
				return;
			case SclPackage.SCL__IED:
				getIED().clear();
				getIED().addAll((Collection<? extends IED>)newValue);
				return;
			case SclPackage.SCL__DATA_TYPE_TEMPLATES:
				setDataTypeTemplates((DataTypeTemplates)newValue);
				return;
			case SclPackage.SCL__COMMUNICATION:
				setCommunication((Communication)newValue);
				return;
			case SclPackage.SCL__SUBSTATION:
				getSubstation().clear();
				getSubstation().addAll((Collection<? extends Substation>)newValue);
				return;
			case SclPackage.SCL__RELEASE:
				setRelease((Byte)newValue);
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
			case SclPackage.SCL__REVISION:
				unsetRevision();
				return;
			case SclPackage.SCL__VERSION:
				unsetVersion();
				return;
			case SclPackage.SCL__HEADER:
				unsetHeader();
				return;
			case SclPackage.SCL__LINE:
				unsetLine();
				return;
			case SclPackage.SCL__PROCESS:
				unsetProcess();
				return;
			case SclPackage.SCL__IED:
				unsetIED();
				return;
			case SclPackage.SCL__DATA_TYPE_TEMPLATES:
				unsetDataTypeTemplates();
				return;
			case SclPackage.SCL__COMMUNICATION:
				unsetCommunication();
				return;
			case SclPackage.SCL__SUBSTATION:
				unsetSubstation();
				return;
			case SclPackage.SCL__RELEASE:
				unsetRelease();
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
			case SclPackage.SCL__REVISION:
				return isSetRevision();
			case SclPackage.SCL__VERSION:
				return isSetVersion();
			case SclPackage.SCL__HEADER:
				return isSetHeader();
			case SclPackage.SCL__LINE:
				return isSetLine();
			case SclPackage.SCL__PROCESS:
				return isSetProcess();
			case SclPackage.SCL__IED:
				return isSetIED();
			case SclPackage.SCL__DATA_TYPE_TEMPLATES:
				return isSetDataTypeTemplates();
			case SclPackage.SCL__COMMUNICATION:
				return isSetCommunication();
			case SclPackage.SCL__SUBSTATION:
				return isSetSubstation();
			case SclPackage.SCL__RELEASE:
				return isSetRelease();
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
			case SclPackage.SCL___VALIDATE_SCL_VERSION_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateSCL_version_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.SCL___VALIDATE_SCL_VERSION_VALID__DIAGNOSTICCHAIN_MAP:
				return validateSCL_version_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.SCL___VALIDATE_SCL_VERSION_VALUE_2007__DIAGNOSTICCHAIN_MAP:
				return validateSCL_version_value_2007((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.SCL___VALIDATE_SCL_REVISION_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateSCL_revision_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.SCL___VALIDATE_SCL_REVISION_VALID__DIAGNOSTICCHAIN_MAP:
				return validateSCL_revision_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.SCL___VALIDATE_SCL_REVISION_VALUE_B__DIAGNOSTICCHAIN_MAP:
				return validateSCL_revision_value_B((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.SCL___VALIDATE_SCL_RELEASE_VALUE_1__DIAGNOSTICCHAIN_MAP:
				return validateSCL_release_value_1((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.SCL___VALIDATE_SCL_ONE_HEADER_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateSCL_one_Header_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (revision: ");
		if (revisionESet) result.append(revision); else result.append("<unset>");
		result.append(", version: ");
		if (versionESet) result.append(version); else result.append("<unset>");
		result.append(", release: ");
		if (releaseESet) result.append(release); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SCLImpl
