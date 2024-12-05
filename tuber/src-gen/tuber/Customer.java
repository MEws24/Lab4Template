/**
 */
package tuber;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tuber.Customer#getPayment <em>Payment</em>}</li>
 *   <li>{@link tuber.Customer#getSpendings <em>Spendings</em>}</li>
 * </ul>
 *
 * @see tuber.TuberPackage#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends AppUser {
	/**
	 * Returns the value of the '<em><b>Payment</b></em>' containment reference list.
	 * The list contents are of type {@link tuber.Payment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment</em>' containment reference list.
	 * @see tuber.TuberPackage#getCustomer_Payment()
	 * @model containment="true"
	 * @generated
	 */
	EList<Payment> getPayment();

	/**
	 * Returns the value of the '<em><b>Spendings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spendings</em>' attribute.
	 * @see #setSpendings(float)
	 * @see tuber.TuberPackage#getCustomer_Spendings()
	 * @model required="true"
	 * @generated
	 */
	float getSpendings();

	/**
	 * Sets the value of the '{@link tuber.Customer#getSpendings <em>Spendings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spendings</em>' attribute.
	 * @see #getSpendings()
	 * @generated
	 */
	void setSpendings(float value);

} // Customer
