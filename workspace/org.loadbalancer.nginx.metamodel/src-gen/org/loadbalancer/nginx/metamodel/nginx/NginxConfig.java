/**
 */
package org.loadbalancer.nginx.metamodel.nginx;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.loadbalancer.nginx.metamodel.nginx.NginxConfig#getWorkerProcesses <em>Worker Processes</em>}</li>
 *   <li>{@link org.loadbalancer.nginx.metamodel.nginx.NginxConfig#getWorkerConnections <em>Worker Connections</em>}</li>
 *   <li>{@link org.loadbalancer.nginx.metamodel.nginx.NginxConfig#getUpstreams <em>Upstreams</em>}</li>
 *   <li>{@link org.loadbalancer.nginx.metamodel.nginx.NginxConfig#getServers <em>Servers</em>}</li>
 * </ul>
 *
 * @see org.loadbalancer.nginx.metamodel.nginx.NginxPackage#getNginxConfig()
 * @model
 * @generated
 */
public interface NginxConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Worker Processes</b></em>' attribute.
	 * The default value is <code>"auto"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worker Processes</em>' attribute.
	 * @see #setWorkerProcesses(String)
	 * @see org.loadbalancer.nginx.metamodel.nginx.NginxPackage#getNginxConfig_WorkerProcesses()
	 * @model default="auto"
	 * @generated
	 */
	String getWorkerProcesses();

	/**
	 * Sets the value of the '{@link org.loadbalancer.nginx.metamodel.nginx.NginxConfig#getWorkerProcesses <em>Worker Processes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worker Processes</em>' attribute.
	 * @see #getWorkerProcesses()
	 * @generated
	 */
	void setWorkerProcesses(String value);

	/**
	 * Returns the value of the '<em><b>Worker Connections</b></em>' attribute.
	 * The default value is <code>"1024"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worker Connections</em>' attribute.
	 * @see #setWorkerConnections(int)
	 * @see org.loadbalancer.nginx.metamodel.nginx.NginxPackage#getNginxConfig_WorkerConnections()
	 * @model default="1024"
	 * @generated
	 */
	int getWorkerConnections();

	/**
	 * Sets the value of the '{@link org.loadbalancer.nginx.metamodel.nginx.NginxConfig#getWorkerConnections <em>Worker Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worker Connections</em>' attribute.
	 * @see #getWorkerConnections()
	 * @generated
	 */
	void setWorkerConnections(int value);

	/**
	 * Returns the value of the '<em><b>Upstreams</b></em>' containment reference list.
	 * The list contents are of type {@link org.loadbalancer.nginx.metamodel.nginx.Upstream}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upstreams</em>' containment reference list.
	 * @see org.loadbalancer.nginx.metamodel.nginx.NginxPackage#getNginxConfig_Upstreams()
	 * @model containment="true"
	 * @generated
	 */
	EList<Upstream> getUpstreams();

	/**
	 * Returns the value of the '<em><b>Servers</b></em>' containment reference list.
	 * The list contents are of type {@link org.loadbalancer.nginx.metamodel.nginx.ServerBlock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servers</em>' containment reference list.
	 * @see org.loadbalancer.nginx.metamodel.nginx.NginxPackage#getNginxConfig_Servers()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServerBlock> getServers();

} // NginxConfig
