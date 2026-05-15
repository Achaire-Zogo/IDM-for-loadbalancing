/**
 */
package org.loadbalancer.nginx.metamodel.nginx.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.loadbalancer.nginx.metamodel.nginx.Location;
import org.loadbalancer.nginx.metamodel.nginx.NginxPackage;
import org.loadbalancer.nginx.metamodel.nginx.ServerBlock;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.loadbalancer.nginx.metamodel.nginx.impl.ServerBlockImpl#getListenPort <em>Listen Port</em>}</li>
 *   <li>{@link org.loadbalancer.nginx.metamodel.nginx.impl.ServerBlockImpl#getServerName <em>Server Name</em>}</li>
 *   <li>{@link org.loadbalancer.nginx.metamodel.nginx.impl.ServerBlockImpl#getProxyPass <em>Proxy Pass</em>}</li>
 *   <li>{@link org.loadbalancer.nginx.metamodel.nginx.impl.ServerBlockImpl#getLocations <em>Locations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServerBlockImpl extends MinimalEObjectImpl.Container implements ServerBlock {
	/**
	 * The default value of the '{@link #getListenPort() <em>Listen Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListenPort()
	 * @generated
	 * @ordered
	 */
	protected static final int LISTEN_PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getListenPort() <em>Listen Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListenPort()
	 * @generated
	 * @ordered
	 */
	protected int listenPort = LISTEN_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getServerName() <em>Server Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_NAME_EDEFAULT = "_";

	/**
	 * The cached value of the '{@link #getServerName() <em>Server Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerName()
	 * @generated
	 * @ordered
	 */
	protected String serverName = SERVER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProxyPass() <em>Proxy Pass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyPass()
	 * @generated
	 * @ordered
	 */
	protected static final String PROXY_PASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProxyPass() <em>Proxy Pass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyPass()
	 * @generated
	 * @ordered
	 */
	protected String proxyPass = PROXY_PASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> locations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NginxPackage.Literals.SERVER_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getListenPort() {
		return listenPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setListenPort(int newListenPort) {
		int oldListenPort = listenPort;
		listenPort = newListenPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NginxPackage.SERVER_BLOCK__LISTEN_PORT, oldListenPort,
					listenPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServerName() {
		return serverName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServerName(String newServerName) {
		String oldServerName = serverName;
		serverName = newServerName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NginxPackage.SERVER_BLOCK__SERVER_NAME, oldServerName,
					serverName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProxyPass() {
		return proxyPass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProxyPass(String newProxyPass) {
		String oldProxyPass = proxyPass;
		proxyPass = newProxyPass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NginxPackage.SERVER_BLOCK__PROXY_PASS, oldProxyPass,
					proxyPass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Location> getLocations() {
		if (locations == null) {
			locations = new EObjectContainmentEList<Location>(Location.class, this,
					NginxPackage.SERVER_BLOCK__LOCATIONS);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case NginxPackage.SERVER_BLOCK__LOCATIONS:
			return ((InternalEList<?>) getLocations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NginxPackage.SERVER_BLOCK__LISTEN_PORT:
			return getListenPort();
		case NginxPackage.SERVER_BLOCK__SERVER_NAME:
			return getServerName();
		case NginxPackage.SERVER_BLOCK__PROXY_PASS:
			return getProxyPass();
		case NginxPackage.SERVER_BLOCK__LOCATIONS:
			return getLocations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case NginxPackage.SERVER_BLOCK__LISTEN_PORT:
			setListenPort((Integer) newValue);
			return;
		case NginxPackage.SERVER_BLOCK__SERVER_NAME:
			setServerName((String) newValue);
			return;
		case NginxPackage.SERVER_BLOCK__PROXY_PASS:
			setProxyPass((String) newValue);
			return;
		case NginxPackage.SERVER_BLOCK__LOCATIONS:
			getLocations().clear();
			getLocations().addAll((Collection<? extends Location>) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case NginxPackage.SERVER_BLOCK__LISTEN_PORT:
			setListenPort(LISTEN_PORT_EDEFAULT);
			return;
		case NginxPackage.SERVER_BLOCK__SERVER_NAME:
			setServerName(SERVER_NAME_EDEFAULT);
			return;
		case NginxPackage.SERVER_BLOCK__PROXY_PASS:
			setProxyPass(PROXY_PASS_EDEFAULT);
			return;
		case NginxPackage.SERVER_BLOCK__LOCATIONS:
			getLocations().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case NginxPackage.SERVER_BLOCK__LISTEN_PORT:
			return listenPort != LISTEN_PORT_EDEFAULT;
		case NginxPackage.SERVER_BLOCK__SERVER_NAME:
			return SERVER_NAME_EDEFAULT == null ? serverName != null : !SERVER_NAME_EDEFAULT.equals(serverName);
		case NginxPackage.SERVER_BLOCK__PROXY_PASS:
			return PROXY_PASS_EDEFAULT == null ? proxyPass != null : !PROXY_PASS_EDEFAULT.equals(proxyPass);
		case NginxPackage.SERVER_BLOCK__LOCATIONS:
			return locations != null && !locations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (listenPort: ");
		result.append(listenPort);
		result.append(", serverName: ");
		result.append(serverName);
		result.append(", proxyPass: ");
		result.append(proxyPass);
		result.append(')');
		return result.toString();
	}

} //ServerBlockImpl
