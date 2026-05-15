/**
 */
package org.loadbalancer.nginx.metamodel.nginx;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Upstream Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.loadbalancer.nginx.metamodel.nginx.UpstreamServer#getAddress <em>Address</em>}</li>
 *   <li>{@link org.loadbalancer.nginx.metamodel.nginx.UpstreamServer#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.loadbalancer.nginx.metamodel.nginx.UpstreamServer#getMaxFails <em>Max Fails</em>}</li>
 *   <li>{@link org.loadbalancer.nginx.metamodel.nginx.UpstreamServer#getFailTimeout <em>Fail Timeout</em>}</li>
 *   <li>{@link org.loadbalancer.nginx.metamodel.nginx.UpstreamServer#isBackup <em>Backup</em>}</li>
 * </ul>
 *
 * @see org.loadbalancer.nginx.metamodel.nginx.NginxPackage#getUpstreamServer()
 * @model
 * @generated
 */
public interface UpstreamServer extends EObject {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see org.loadbalancer.nginx.metamodel.nginx.NginxPackage#getUpstreamServer_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link org.loadbalancer.nginx.metamodel.nginx.UpstreamServer#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(int)
	 * @see org.loadbalancer.nginx.metamodel.nginx.NginxPackage#getUpstreamServer_Weight()
	 * @model default="1"
	 * @generated
	 */
	int getWeight();

	/**
	 * Sets the value of the '{@link org.loadbalancer.nginx.metamodel.nginx.UpstreamServer#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(int value);

	/**
	 * Returns the value of the '<em><b>Max Fails</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Fails</em>' attribute.
	 * @see #setMaxFails(int)
	 * @see org.loadbalancer.nginx.metamodel.nginx.NginxPackage#getUpstreamServer_MaxFails()
	 * @model default="3"
	 * @generated
	 */
	int getMaxFails();

	/**
	 * Sets the value of the '{@link org.loadbalancer.nginx.metamodel.nginx.UpstreamServer#getMaxFails <em>Max Fails</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Fails</em>' attribute.
	 * @see #getMaxFails()
	 * @generated
	 */
	void setMaxFails(int value);

	/**
	 * Returns the value of the '<em><b>Fail Timeout</b></em>' attribute.
	 * The default value is <code>"30s"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fail Timeout</em>' attribute.
	 * @see #setFailTimeout(String)
	 * @see org.loadbalancer.nginx.metamodel.nginx.NginxPackage#getUpstreamServer_FailTimeout()
	 * @model default="30s"
	 * @generated
	 */
	String getFailTimeout();

	/**
	 * Sets the value of the '{@link org.loadbalancer.nginx.metamodel.nginx.UpstreamServer#getFailTimeout <em>Fail Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fail Timeout</em>' attribute.
	 * @see #getFailTimeout()
	 * @generated
	 */
	void setFailTimeout(String value);

	/**
	 * Returns the value of the '<em><b>Backup</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backup</em>' attribute.
	 * @see #setBackup(boolean)
	 * @see org.loadbalancer.nginx.metamodel.nginx.NginxPackage#getUpstreamServer_Backup()
	 * @model default="false"
	 * @generated
	 */
	boolean isBackup();

	/**
	 * Sets the value of the '{@link org.loadbalancer.nginx.metamodel.nginx.UpstreamServer#isBackup <em>Backup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backup</em>' attribute.
	 * @see #isBackup()
	 * @generated
	 */
	void setBackup(boolean value);

} // UpstreamServer
