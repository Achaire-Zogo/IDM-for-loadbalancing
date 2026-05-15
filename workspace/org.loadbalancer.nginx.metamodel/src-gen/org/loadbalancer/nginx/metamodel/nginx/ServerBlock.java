/**
 */
package org.loadbalancer.nginx.metamodel.nginx;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.loadbalancer.nginx.metamodel.nginx.ServerBlock#getListenPort <em>Listen Port</em>}</li>
 *   <li>{@link org.loadbalancer.nginx.metamodel.nginx.ServerBlock#getServerName <em>Server Name</em>}</li>
 *   <li>{@link org.loadbalancer.nginx.metamodel.nginx.ServerBlock#getProxyPass <em>Proxy Pass</em>}</li>
 *   <li>{@link org.loadbalancer.nginx.metamodel.nginx.ServerBlock#getLocations <em>Locations</em>}</li>
 * </ul>
 *
 * @see org.loadbalancer.nginx.metamodel.nginx.NginxPackage#getServerBlock()
 * @model
 * @generated
 */
public interface ServerBlock extends EObject {
	/**
	 * Returns the value of the '<em><b>Listen Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listen Port</em>' attribute.
	 * @see #setListenPort(int)
	 * @see org.loadbalancer.nginx.metamodel.nginx.NginxPackage#getServerBlock_ListenPort()
	 * @model
	 * @generated
	 */
	int getListenPort();

	/**
	 * Sets the value of the '{@link org.loadbalancer.nginx.metamodel.nginx.ServerBlock#getListenPort <em>Listen Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Listen Port</em>' attribute.
	 * @see #getListenPort()
	 * @generated
	 */
	void setListenPort(int value);

	/**
	 * Returns the value of the '<em><b>Server Name</b></em>' attribute.
	 * The default value is <code>"_"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Name</em>' attribute.
	 * @see #setServerName(String)
	 * @see org.loadbalancer.nginx.metamodel.nginx.NginxPackage#getServerBlock_ServerName()
	 * @model default="_"
	 * @generated
	 */
	String getServerName();

	/**
	 * Sets the value of the '{@link org.loadbalancer.nginx.metamodel.nginx.ServerBlock#getServerName <em>Server Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Name</em>' attribute.
	 * @see #getServerName()
	 * @generated
	 */
	void setServerName(String value);

	/**
	 * Returns the value of the '<em><b>Proxy Pass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy Pass</em>' attribute.
	 * @see #setProxyPass(String)
	 * @see org.loadbalancer.nginx.metamodel.nginx.NginxPackage#getServerBlock_ProxyPass()
	 * @model
	 * @generated
	 */
	String getProxyPass();

	/**
	 * Sets the value of the '{@link org.loadbalancer.nginx.metamodel.nginx.ServerBlock#getProxyPass <em>Proxy Pass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy Pass</em>' attribute.
	 * @see #getProxyPass()
	 * @generated
	 */
	void setProxyPass(String value);

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' containment reference list.
	 * The list contents are of type {@link org.loadbalancer.nginx.metamodel.nginx.Location}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' containment reference list.
	 * @see org.loadbalancer.nginx.metamodel.nginx.NginxPackage#getServerBlock_Locations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Location> getLocations();

} // ServerBlock
