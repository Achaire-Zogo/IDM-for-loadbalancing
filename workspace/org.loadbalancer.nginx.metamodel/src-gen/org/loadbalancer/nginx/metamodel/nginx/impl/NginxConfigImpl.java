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

import org.loadbalancer.nginx.metamodel.nginx.NginxConfig;
import org.loadbalancer.nginx.metamodel.nginx.NginxPackage;
import org.loadbalancer.nginx.metamodel.nginx.ServerBlock;
import org.loadbalancer.nginx.metamodel.nginx.Upstream;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.loadbalancer.nginx.metamodel.nginx.impl.NginxConfigImpl#getWorkerProcesses <em>Worker Processes</em>}</li>
 *   <li>{@link org.loadbalancer.nginx.metamodel.nginx.impl.NginxConfigImpl#getWorkerConnections <em>Worker Connections</em>}</li>
 *   <li>{@link org.loadbalancer.nginx.metamodel.nginx.impl.NginxConfigImpl#getUpstreams <em>Upstreams</em>}</li>
 *   <li>{@link org.loadbalancer.nginx.metamodel.nginx.impl.NginxConfigImpl#getServers <em>Servers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NginxConfigImpl extends MinimalEObjectImpl.Container implements NginxConfig {
	/**
	 * The default value of the '{@link #getWorkerProcesses() <em>Worker Processes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkerProcesses()
	 * @generated
	 * @ordered
	 */
	protected static final String WORKER_PROCESSES_EDEFAULT = "auto";

	/**
	 * The cached value of the '{@link #getWorkerProcesses() <em>Worker Processes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkerProcesses()
	 * @generated
	 * @ordered
	 */
	protected String workerProcesses = WORKER_PROCESSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorkerConnections() <em>Worker Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkerConnections()
	 * @generated
	 * @ordered
	 */
	protected static final int WORKER_CONNECTIONS_EDEFAULT = 1024;

	/**
	 * The cached value of the '{@link #getWorkerConnections() <em>Worker Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkerConnections()
	 * @generated
	 * @ordered
	 */
	protected int workerConnections = WORKER_CONNECTIONS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUpstreams() <em>Upstreams</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpstreams()
	 * @generated
	 * @ordered
	 */
	protected EList<Upstream> upstreams;

	/**
	 * The cached value of the '{@link #getServers() <em>Servers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServers()
	 * @generated
	 * @ordered
	 */
	protected EList<ServerBlock> servers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NginxConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NginxPackage.Literals.NGINX_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWorkerProcesses() {
		return workerProcesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkerProcesses(String newWorkerProcesses) {
		String oldWorkerProcesses = workerProcesses;
		workerProcesses = newWorkerProcesses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NginxPackage.NGINX_CONFIG__WORKER_PROCESSES,
					oldWorkerProcesses, workerProcesses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWorkerConnections() {
		return workerConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkerConnections(int newWorkerConnections) {
		int oldWorkerConnections = workerConnections;
		workerConnections = newWorkerConnections;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NginxPackage.NGINX_CONFIG__WORKER_CONNECTIONS,
					oldWorkerConnections, workerConnections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Upstream> getUpstreams() {
		if (upstreams == null) {
			upstreams = new EObjectContainmentEList<Upstream>(Upstream.class, this,
					NginxPackage.NGINX_CONFIG__UPSTREAMS);
		}
		return upstreams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServerBlock> getServers() {
		if (servers == null) {
			servers = new EObjectContainmentEList<ServerBlock>(ServerBlock.class, this,
					NginxPackage.NGINX_CONFIG__SERVERS);
		}
		return servers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case NginxPackage.NGINX_CONFIG__UPSTREAMS:
			return ((InternalEList<?>) getUpstreams()).basicRemove(otherEnd, msgs);
		case NginxPackage.NGINX_CONFIG__SERVERS:
			return ((InternalEList<?>) getServers()).basicRemove(otherEnd, msgs);
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
		case NginxPackage.NGINX_CONFIG__WORKER_PROCESSES:
			return getWorkerProcesses();
		case NginxPackage.NGINX_CONFIG__WORKER_CONNECTIONS:
			return getWorkerConnections();
		case NginxPackage.NGINX_CONFIG__UPSTREAMS:
			return getUpstreams();
		case NginxPackage.NGINX_CONFIG__SERVERS:
			return getServers();
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
		case NginxPackage.NGINX_CONFIG__WORKER_PROCESSES:
			setWorkerProcesses((String) newValue);
			return;
		case NginxPackage.NGINX_CONFIG__WORKER_CONNECTIONS:
			setWorkerConnections((Integer) newValue);
			return;
		case NginxPackage.NGINX_CONFIG__UPSTREAMS:
			getUpstreams().clear();
			getUpstreams().addAll((Collection<? extends Upstream>) newValue);
			return;
		case NginxPackage.NGINX_CONFIG__SERVERS:
			getServers().clear();
			getServers().addAll((Collection<? extends ServerBlock>) newValue);
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
		case NginxPackage.NGINX_CONFIG__WORKER_PROCESSES:
			setWorkerProcesses(WORKER_PROCESSES_EDEFAULT);
			return;
		case NginxPackage.NGINX_CONFIG__WORKER_CONNECTIONS:
			setWorkerConnections(WORKER_CONNECTIONS_EDEFAULT);
			return;
		case NginxPackage.NGINX_CONFIG__UPSTREAMS:
			getUpstreams().clear();
			return;
		case NginxPackage.NGINX_CONFIG__SERVERS:
			getServers().clear();
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
		case NginxPackage.NGINX_CONFIG__WORKER_PROCESSES:
			return WORKER_PROCESSES_EDEFAULT == null ? workerProcesses != null
					: !WORKER_PROCESSES_EDEFAULT.equals(workerProcesses);
		case NginxPackage.NGINX_CONFIG__WORKER_CONNECTIONS:
			return workerConnections != WORKER_CONNECTIONS_EDEFAULT;
		case NginxPackage.NGINX_CONFIG__UPSTREAMS:
			return upstreams != null && !upstreams.isEmpty();
		case NginxPackage.NGINX_CONFIG__SERVERS:
			return servers != null && !servers.isEmpty();
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
		result.append(" (workerProcesses: ");
		result.append(workerProcesses);
		result.append(", workerConnections: ");
		result.append(workerConnections);
		result.append(')');
		return result.toString();
	}

} //NginxConfigImpl
