/**
 */
package tuber.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import tuber.Customer;
import tuber.Driver;
import tuber.Payment;
import tuber.Ride;
import tuber.RideStatus;
import tuber.TuberPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ride</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tuber.impl.RideImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link tuber.impl.RideImpl#getDriver <em>Driver</em>}</li>
 *   <li>{@link tuber.impl.RideImpl#getId <em>Id</em>}</li>
 *   <li>{@link tuber.impl.RideImpl#getDate <em>Date</em>}</li>
 *   <li>{@link tuber.impl.RideImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link tuber.impl.RideImpl#isPaid <em>Paid</em>}</li>
 *   <li>{@link tuber.impl.RideImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link tuber.impl.RideImpl#getPayment <em>Payment</em>}</li>
 *   <li>{@link tuber.impl.RideImpl#getMultiplier <em>Multiplier</em>}</li>
 *   <li>{@link tuber.impl.RideImpl#isSharing <em>Sharing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RideImpl extends MinimalEObjectImpl.Container implements Ride {
	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected EList<Customer> customer;

	/**
	 * The cached value of the '{@link #getDriver() <em>Driver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriver()
	 * @generated
	 * @ordered
	 */
	protected Driver driver;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected String date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected float amount = AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #isPaid() <em>Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPaid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PAID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPaid() <em>Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPaid()
	 * @generated
	 * @ordered
	 */
	protected boolean paid = PAID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final RideStatus STATUS_EDEFAULT = RideStatus.IDLE;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected RideStatus status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPayment() <em>Payment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment()
	 * @generated
	 * @ordered
	 */
	protected Payment payment;

	/**
	 * The default value of the '{@link #getMultiplier() <em>Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplier()
	 * @generated
	 * @ordered
	 */
	protected static final float MULTIPLIER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMultiplier() <em>Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplier()
	 * @generated
	 * @ordered
	 */
	protected float multiplier = MULTIPLIER_EDEFAULT;

	/**
	 * The default value of the '{@link #isSharing() <em>Sharing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSharing()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHARING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSharing() <em>Sharing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSharing()
	 * @generated
	 * @ordered
	 */
	protected boolean sharing = SHARING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RideImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TuberPackage.Literals.RIDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Customer> getCustomer() {
		if (customer == null) {
			customer = new EObjectResolvingEList<Customer>(Customer.class, this, TuberPackage.RIDE__CUSTOMER);
		}
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Driver getDriver() {
		if (driver != null && driver.eIsProxy()) {
			InternalEObject oldDriver = (InternalEObject) driver;
			driver = (Driver) eResolveProxy(oldDriver);
			if (driver != oldDriver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TuberPackage.RIDE__DRIVER, oldDriver,
							driver));
			}
		}
		return driver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Driver basicGetDriver() {
		return driver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDriver(Driver newDriver) {
		Driver oldDriver = driver;
		driver = newDriver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TuberPackage.RIDE__DRIVER, oldDriver, driver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TuberPackage.RIDE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(String newDate) {
		String oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TuberPackage.RIDE__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmount(float newAmount) {
		float oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TuberPackage.RIDE__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPaid() {
		return paid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaid(boolean newPaid) {
		boolean oldPaid = paid;
		paid = newPaid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TuberPackage.RIDE__PAID, oldPaid, paid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RideStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(RideStatus newStatus) {
		RideStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TuberPackage.RIDE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Payment getPayment() {
		if (payment != null && payment.eIsProxy()) {
			InternalEObject oldPayment = (InternalEObject) payment;
			payment = (Payment) eResolveProxy(oldPayment);
			if (payment != oldPayment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TuberPackage.RIDE__PAYMENT, oldPayment,
							payment));
			}
		}
		return payment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Payment basicGetPayment() {
		return payment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPayment(Payment newPayment) {
		Payment oldPayment = payment;
		payment = newPayment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TuberPackage.RIDE__PAYMENT, oldPayment, payment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getMultiplier() {
		return multiplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiplier(float newMultiplier) {
		float oldMultiplier = multiplier;
		multiplier = newMultiplier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TuberPackage.RIDE__MULTIPLIER, oldMultiplier,
					multiplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSharing() {
		return sharing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSharing(boolean newSharing) {
		boolean oldSharing = sharing;
		sharing = newSharing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TuberPackage.RIDE__SHARING, oldSharing, sharing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TuberPackage.RIDE__CUSTOMER:
			return getCustomer();
		case TuberPackage.RIDE__DRIVER:
			if (resolve)
				return getDriver();
			return basicGetDriver();
		case TuberPackage.RIDE__ID:
			return getId();
		case TuberPackage.RIDE__DATE:
			return getDate();
		case TuberPackage.RIDE__AMOUNT:
			return getAmount();
		case TuberPackage.RIDE__PAID:
			return isPaid();
		case TuberPackage.RIDE__STATUS:
			return getStatus();
		case TuberPackage.RIDE__PAYMENT:
			if (resolve)
				return getPayment();
			return basicGetPayment();
		case TuberPackage.RIDE__MULTIPLIER:
			return getMultiplier();
		case TuberPackage.RIDE__SHARING:
			return isSharing();
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
		case TuberPackage.RIDE__CUSTOMER:
			getCustomer().clear();
			getCustomer().addAll((Collection<? extends Customer>) newValue);
			return;
		case TuberPackage.RIDE__DRIVER:
			setDriver((Driver) newValue);
			return;
		case TuberPackage.RIDE__ID:
			setId((String) newValue);
			return;
		case TuberPackage.RIDE__DATE:
			setDate((String) newValue);
			return;
		case TuberPackage.RIDE__AMOUNT:
			setAmount((Float) newValue);
			return;
		case TuberPackage.RIDE__PAID:
			setPaid((Boolean) newValue);
			return;
		case TuberPackage.RIDE__STATUS:
			setStatus((RideStatus) newValue);
			return;
		case TuberPackage.RIDE__PAYMENT:
			setPayment((Payment) newValue);
			return;
		case TuberPackage.RIDE__MULTIPLIER:
			setMultiplier((Float) newValue);
			return;
		case TuberPackage.RIDE__SHARING:
			setSharing((Boolean) newValue);
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
		case TuberPackage.RIDE__CUSTOMER:
			getCustomer().clear();
			return;
		case TuberPackage.RIDE__DRIVER:
			setDriver((Driver) null);
			return;
		case TuberPackage.RIDE__ID:
			setId(ID_EDEFAULT);
			return;
		case TuberPackage.RIDE__DATE:
			setDate(DATE_EDEFAULT);
			return;
		case TuberPackage.RIDE__AMOUNT:
			setAmount(AMOUNT_EDEFAULT);
			return;
		case TuberPackage.RIDE__PAID:
			setPaid(PAID_EDEFAULT);
			return;
		case TuberPackage.RIDE__STATUS:
			setStatus(STATUS_EDEFAULT);
			return;
		case TuberPackage.RIDE__PAYMENT:
			setPayment((Payment) null);
			return;
		case TuberPackage.RIDE__MULTIPLIER:
			setMultiplier(MULTIPLIER_EDEFAULT);
			return;
		case TuberPackage.RIDE__SHARING:
			setSharing(SHARING_EDEFAULT);
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
		case TuberPackage.RIDE__CUSTOMER:
			return customer != null && !customer.isEmpty();
		case TuberPackage.RIDE__DRIVER:
			return driver != null;
		case TuberPackage.RIDE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case TuberPackage.RIDE__DATE:
			return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
		case TuberPackage.RIDE__AMOUNT:
			return amount != AMOUNT_EDEFAULT;
		case TuberPackage.RIDE__PAID:
			return paid != PAID_EDEFAULT;
		case TuberPackage.RIDE__STATUS:
			return status != STATUS_EDEFAULT;
		case TuberPackage.RIDE__PAYMENT:
			return payment != null;
		case TuberPackage.RIDE__MULTIPLIER:
			return multiplier != MULTIPLIER_EDEFAULT;
		case TuberPackage.RIDE__SHARING:
			return sharing != SHARING_EDEFAULT;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", date: ");
		result.append(date);
		result.append(", amount: ");
		result.append(amount);
		result.append(", paid: ");
		result.append(paid);
		result.append(", status: ");
		result.append(status);
		result.append(", multiplier: ");
		result.append(multiplier);
		result.append(", sharing: ");
		result.append(sharing);
		result.append(')');
		return result.toString();
	}

} //RideImpl
