/**
 */
package org.loadbalancer.nginx.metamodel.nginx;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.loadbalancer.nginx.metamodel.nginx.Location#getPath <em>Path</em>}</li>
 *   <li>{@link org.loadbalancer.nginx.metamodel.nginx.Location#getProxyPass <em>Proxy Pass</em>}</li>
 *   <li>{@link org.loadbalancer.nginx.metamodel.nginx.Location#getProxySetHeaders <em>Proxy Set Headers</em>}</li>
 * </ul>
 *
 * @see org.loadbalancer.nginx.metamodel.nginx.NginxPackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends EObject {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * The default value is <code>"/"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.loadbalancer.nginx.metamodel.nginx.NginxPackage#getLocation_Path()
	 * @model default="/"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.loadbalancer.nginx.metamodel.nginx.Location#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Proxy Pass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy Pass</em>' attribute.
	 * @see #setProxyPass(String)
	 * @see org.loadbalancer.nginx.metamodel.nginx.NginxPackage#getLocation_ProxyPass()
	 * @model
	 * @generated
	 */
	String getProxyPass();

	/**
	 * Sets the value of the '{@link org.loadbalancer.nginx.metamodel.nginx.Location#getProxyPass <em>Proxy Pass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy Pass</em>' attribute.
	 * @see #getProxyPass()
	 * @generated
	 */
	void setProxyPass(String value);

	/**
	 * Returns the value of the '<em><b>Proxy Set Headers</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy Set Headers</em>' attribute list.
	 * @see org.loadbalancer.nginx.metamodel.nginx.NginxPackage#getLocation_ProxySetHeaders()
	 * @model
	 * @generated
	 */
	EList<String> getProxySetHeaders();

} // Location
