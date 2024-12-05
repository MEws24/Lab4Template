/**
 */
package tuber;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Issue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tuber.PaymentIssue#getRide <em>Ride</em>}</li>
 * </ul>
 *
 * @see tuber.TuberPackage#getPaymentIssue()
 * @model
 * @generated
 */
public interface PaymentIssue extends HelpCentreCall {
	/**
	 * Returns the value of the '<em><b>Ride</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ride</em>' reference.
	 * @see #setRide(Ride)
	 * @see tuber.TuberPackage#getPaymentIssue_Ride()
	 * @model required="true"
	 * @generated
	 */
	Ride getRide();

	/**
	 * Sets the value of the '{@link tuber.PaymentIssue#getRide <em>Ride</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ride</em>' reference.
	 * @see #getRide()
	 * @generated
	 */
	void setRide(Ride value);

} // PaymentIssue
