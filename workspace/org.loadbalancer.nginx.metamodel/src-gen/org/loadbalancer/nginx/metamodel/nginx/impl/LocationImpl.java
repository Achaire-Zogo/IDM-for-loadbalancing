/**
 */
package org.loadbalancer.nginx.metamodel.nginx.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.loadbalancer.nginx.metamodel.nginx.Location;
import org.loadbalancer.nginx.metamodel.nginx.NginxPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.loadbalancer.nginx.metamodel.nginx.impl.LocationImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.loadbalancer.nginx.metamodel.nginx.impl.LocationImpl#getProxyPass <em>Proxy Pass</em>}</li>
 *   <li>{@link org.loadbalancer.nginx.metamodel.nginx.impl.LocationImpl#getProxySetHeaders <em>Proxy Set Headers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationImpl extends MinimalEObjectImpl.Container implements Location {
	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = "/";

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

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
	 * The cached value of the '{@link #getProxySetHeaders() <em>Proxy Set Headers</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxySetHeaders()
	 * @generated
	 * @ordered
	 */
	protected EList<String> proxySetHeaders;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NginxPackage.Literals.LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NginxPackage.LOCATION__PATH, oldPath, path));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NginxPackage.LOCATION__PROXY_PASS, oldProxyPass,
					proxyPass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getProxySetHeaders() {
		if (proxySetHeaders == null) {
			proxySetHeaders = new EDataTypeUniqueEList<String>(String.class, this,
					NginxPackage.LOCATION__PROXY_SET_HEADERS);
		}
		return proxySetHeaders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NginxPackage.LOCATION__PATH:
			return getPath();
		case NginxPackage.LOCATION__PROXY_PASS:
			return getProxyPass();
		case NginxPackage.LOCATION__PROXY_SET_HEADERS:
			return getProxySetHeaders();
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
		case NginxPackage.LOCATION__PATH:
			setPath((String) newValue);
			return;
		case NginxPackage.LOCATION__PROXY_PASS:
			setProxyPass((String) newValue);
			return;
		case NginxPackage.LOCATION__PROXY_SET_HEADERS:
			getProxySetHeaders().clear();
			getProxySetHeaders().addAll((Collection<? extends String>) newValue);
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
		case NginxPackage.LOCATION__PATH:
			setPath(PATH_EDEFAULT);
			return;
		case NginxPackage.LOCATION__PROXY_PASS:
			setProxyPass(PROXY_PASS_EDEFAULT);
			return;
		case NginxPackage.LOCATION__PROXY_SET_HEADERS:
			getProxySetHeaders().clear();
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
		case NginxPackage.LOCATION__PATH:
			return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
		case NginxPackage.LOCATION__PROXY_PASS:
			return PROXY_PASS_EDEFAULT == null ? proxyPass != null : !PROXY_PASS_EDEFAULT.equals(proxyPass);
		case NginxPackage.LOCATION__PROXY_SET_HEADERS:
			return proxySetHeaders != null && !proxySetHeaders.isEmpty();
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
		result.append(" (path: ");
		result.append(path);
		result.append(", proxyPass: ");
		result.append(proxyPass);
		result.append(", proxySetHeaders: ");
		result.append(proxySetHeaders);
		result.append(')');
		return result.toString();
	}

} //LocationImpl
