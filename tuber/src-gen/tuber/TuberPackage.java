/**
 */
package tuber;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tuber.TuberFactory
 * @model kind="package"
 * @generated
 */
public interface TuberPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tuber";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/tuber";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tuber";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TuberPackage eINSTANCE = tuber.impl.TuberPackageImpl.init();

	/**
	 * The meta object id for the '{@link tuber.impl.TUberImpl <em>TUber</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tuber.impl.TUberImpl
	 * @see tuber.impl.TuberPackageImpl#getTUber()
	 * @generated
	 */
	int TUBER = 0;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBER__AGENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBER__NAME = 1;

	/**
	 * The number of structural features of the '<em>TUber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TUber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tuber.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tuber.impl.AgentImpl
	 * @see tuber.impl.TuberPackageImpl#getAgent()
	 * @generated
	 */
	int AGENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Rides</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__RIDES = 1;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__CITY = 2;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__USERS = 3;

	/**
	 * The feature id for the '<em><b>Revenue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__REVENUE = 4;

	/**
	 * The number of structural features of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tuber.impl.AppUserImpl <em>App User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tuber.impl.AppUserImpl
	 * @see tuber.impl.TuberPackageImpl#getAppUser()
	 * @generated
	 */
	int APP_USER = 4;

	/**
	 * The feature id for the '<em><b>Support Call</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_USER__SUPPORT_CALL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_USER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_USER__LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_USER__RATING = 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_USER__STATUS = 4;

	/**
	 * The number of structural features of the '<em>App User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_USER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>App User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tuber.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tuber.impl.CustomerImpl
	 * @see tuber.impl.TuberPackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 2;

	/**
	 * The feature id for the '<em><b>Support Call</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__SUPPORT_CALL = APP_USER__SUPPORT_CALL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__NAME = APP_USER__NAME;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__LOCATION = APP_USER__LOCATION;

	/**
	 * The feature id for the '<em><b>Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__RATING = APP_USER__RATING;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__STATUS = APP_USER__STATUS;

	/**
	 * The feature id for the '<em><b>Payment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__PAYMENT = APP_USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Spendings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__SPENDINGS = APP_USER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = APP_USER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = APP_USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tuber.impl.DriverImpl <em>Driver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tuber.impl.DriverImpl
	 * @see tuber.impl.TuberPackageImpl#getDriver()
	 * @generated
	 */
	int DRIVER = 3;

	/**
	 * The feature id for the '<em><b>Support Call</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__SUPPORT_CALL = APP_USER__SUPPORT_CALL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__NAME = APP_USER__NAME;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__LOCATION = APP_USER__LOCATION;

	/**
	 * The feature id for the '<em><b>Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__RATING = APP_USER__RATING;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__STATUS = APP_USER__STATUS;

	/**
	 * The feature id for the '<em><b>Vehicle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__VEHICLE = APP_USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Earnings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__EARNINGS = APP_USER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Driver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER_FEATURE_COUNT = APP_USER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Driver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER_OPERATION_COUNT = APP_USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tuber.impl.PaymentImpl <em>Payment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tuber.impl.PaymentImpl
	 * @see tuber.impl.TuberPackageImpl#getPayment()
	 * @generated
	 */
	int PAYMENT = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__STATUS = 1;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__AMOUNT = 2;

	/**
	 * The number of structural features of the '<em>Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tuber.impl.HelpCentreCallImpl <em>Help Centre Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tuber.impl.HelpCentreCallImpl
	 * @see tuber.impl.TuberPackageImpl#getHelpCentreCall()
	 * @generated
	 */
	int HELP_CENTRE_CALL = 6;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELP_CENTRE_CALL__ISSUE = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELP_CENTRE_CALL__STATUS = 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELP_CENTRE_CALL__DURATION = 2;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELP_CENTRE_CALL__DATE = 3;

	/**
	 * The number of structural features of the '<em>Help Centre Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELP_CENTRE_CALL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Help Centre Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELP_CENTRE_CALL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tuber.impl.VehicleImpl <em>Vehicle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tuber.impl.VehicleImpl
	 * @see tuber.impl.TuberPackageImpl#getVehicle()
	 * @generated
	 */
	int VEHICLE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__CAPACITY = 2;

	/**
	 * The number of structural features of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tuber.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tuber.impl.LocationImpl
	 * @see tuber.impl.TuberPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 8;

	/**
	 * The feature id for the '<em><b>Lt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LT = 0;

	/**
	 * The feature id for the '<em><b>Lg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LG = 1;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CITY = 2;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tuber.impl.RideImpl <em>Ride</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tuber.impl.RideImpl
	 * @see tuber.impl.TuberPackageImpl#getRide()
	 * @generated
	 */
	int RIDE = 9;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDE__CUSTOMER = 0;

	/**
	 * The feature id for the '<em><b>Driver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDE__DRIVER = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDE__ID = 2;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDE__DATE = 3;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDE__AMOUNT = 4;

	/**
	 * The feature id for the '<em><b>Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDE__PAID = 5;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDE__STATUS = 6;

	/**
	 * The feature id for the '<em><b>Payment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDE__PAYMENT = 7;

	/**
	 * The feature id for the '<em><b>Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDE__MULTIPLIER = 8;

	/**
	 * The feature id for the '<em><b>Sharing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDE__SHARING = 9;

	/**
	 * The number of structural features of the '<em>Ride</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Ride</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tuber.impl.SafetyIssueImpl <em>Safety Issue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tuber.impl.SafetyIssueImpl
	 * @see tuber.impl.TuberPackageImpl#getSafetyIssue()
	 * @generated
	 */
	int SAFETY_ISSUE = 10;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_ISSUE__ISSUE = HELP_CENTRE_CALL__ISSUE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_ISSUE__STATUS = HELP_CENTRE_CALL__STATUS;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_ISSUE__DURATION = HELP_CENTRE_CALL__DURATION;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_ISSUE__DATE = HELP_CENTRE_CALL__DATE;

	/**
	 * The feature id for the '<em><b>Ride</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_ISSUE__RIDE = HELP_CENTRE_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Safety Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_ISSUE_FEATURE_COUNT = HELP_CENTRE_CALL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Safety Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_ISSUE_OPERATION_COUNT = HELP_CENTRE_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tuber.impl.PaymentIssueImpl <em>Payment Issue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tuber.impl.PaymentIssueImpl
	 * @see tuber.impl.TuberPackageImpl#getPaymentIssue()
	 * @generated
	 */
	int PAYMENT_ISSUE = 11;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_ISSUE__ISSUE = HELP_CENTRE_CALL__ISSUE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_ISSUE__STATUS = HELP_CENTRE_CALL__STATUS;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_ISSUE__DURATION = HELP_CENTRE_CALL__DURATION;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_ISSUE__DATE = HELP_CENTRE_CALL__DATE;

	/**
	 * The feature id for the '<em><b>Ride</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_ISSUE__RIDE = HELP_CENTRE_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Payment Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_ISSUE_FEATURE_COUNT = HELP_CENTRE_CALL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Payment Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_ISSUE_OPERATION_COUNT = HELP_CENTRE_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tuber.City <em>City</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tuber.City
	 * @see tuber.impl.TuberPackageImpl#getCity()
	 * @generated
	 */
	int CITY = 12;

	/**
	 * The meta object id for the '{@link tuber.TicketStatus <em>Ticket Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tuber.TicketStatus
	 * @see tuber.impl.TuberPackageImpl#getTicketStatus()
	 * @generated
	 */
	int TICKET_STATUS = 13;

	/**
	 * The meta object id for the '{@link tuber.IssueType <em>Issue Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tuber.IssueType
	 * @see tuber.impl.TuberPackageImpl#getIssueType()
	 * @generated
	 */
	int ISSUE_TYPE = 14;

	/**
	 * The meta object id for the '{@link tuber.RideStatus <em>Ride Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tuber.RideStatus
	 * @see tuber.impl.TuberPackageImpl#getRideStatus()
	 * @generated
	 */
	int RIDE_STATUS = 15;

	/**
	 * The meta object id for the '{@link tuber.PaymentType <em>Payment Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tuber.PaymentType
	 * @see tuber.impl.TuberPackageImpl#getPaymentType()
	 * @generated
	 */
	int PAYMENT_TYPE = 16;

	/**
	 * The meta object id for the '{@link tuber.VehicleType <em>Vehicle Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tuber.VehicleType
	 * @see tuber.impl.TuberPackageImpl#getVehicleType()
	 * @generated
	 */
	int VEHICLE_TYPE = 17;

	/**
	 * Returns the meta object for class '{@link tuber.TUber <em>TUber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TUber</em>'.
	 * @see tuber.TUber
	 * @generated
	 */
	EClass getTUber();

	/**
	 * Returns the meta object for the containment reference list '{@link tuber.TUber#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agent</em>'.
	 * @see tuber.TUber#getAgent()
	 * @see #getTUber()
	 * @generated
	 */
	EReference getTUber_Agent();

	/**
	 * Returns the meta object for the attribute '{@link tuber.TUber#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tuber.TUber#getName()
	 * @see #getTUber()
	 * @generated
	 */
	EAttribute getTUber_Name();

	/**
	 * Returns the meta object for class '{@link tuber.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent</em>'.
	 * @see tuber.Agent
	 * @generated
	 */
	EClass getAgent();

	/**
	 * Returns the meta object for the attribute '{@link tuber.Agent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tuber.Agent#getName()
	 * @see #getAgent()
	 * @generated
	 */
	EAttribute getAgent_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tuber.Agent#getRides <em>Rides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rides</em>'.
	 * @see tuber.Agent#getRides()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Rides();

	/**
	 * Returns the meta object for the attribute '{@link tuber.Agent#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see tuber.Agent#getCity()
	 * @see #getAgent()
	 * @generated
	 */
	EAttribute getAgent_City();

	/**
	 * Returns the meta object for the containment reference list '{@link tuber.Agent#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Users</em>'.
	 * @see tuber.Agent#getUsers()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Users();

	/**
	 * Returns the meta object for the attribute '{@link tuber.Agent#getRevenue <em>Revenue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revenue</em>'.
	 * @see tuber.Agent#getRevenue()
	 * @see #getAgent()
	 * @generated
	 */
	EAttribute getAgent_Revenue();

	/**
	 * Returns the meta object for class '{@link tuber.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see tuber.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the containment reference list '{@link tuber.Customer#getPayment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Payment</em>'.
	 * @see tuber.Customer#getPayment()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Payment();

	/**
	 * Returns the meta object for the attribute '{@link tuber.Customer#getSpendings <em>Spendings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spendings</em>'.
	 * @see tuber.Customer#getSpendings()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Spendings();

	/**
	 * Returns the meta object for class '{@link tuber.Driver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Driver</em>'.
	 * @see tuber.Driver
	 * @generated
	 */
	EClass getDriver();

	/**
	 * Returns the meta object for the containment reference '{@link tuber.Driver#getVehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vehicle</em>'.
	 * @see tuber.Driver#getVehicle()
	 * @see #getDriver()
	 * @generated
	 */
	EReference getDriver_Vehicle();

	/**
	 * Returns the meta object for the attribute '{@link tuber.Driver#getEarnings <em>Earnings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Earnings</em>'.
	 * @see tuber.Driver#getEarnings()
	 * @see #getDriver()
	 * @generated
	 */
	EAttribute getDriver_Earnings();

	/**
	 * Returns the meta object for class '{@link tuber.AppUser <em>App User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App User</em>'.
	 * @see tuber.AppUser
	 * @generated
	 */
	EClass getAppUser();

	/**
	 * Returns the meta object for the containment reference list '{@link tuber.AppUser#getSupportCall <em>Support Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Support Call</em>'.
	 * @see tuber.AppUser#getSupportCall()
	 * @see #getAppUser()
	 * @generated
	 */
	EReference getAppUser_SupportCall();

	/**
	 * Returns the meta object for the attribute '{@link tuber.AppUser#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tuber.AppUser#getName()
	 * @see #getAppUser()
	 * @generated
	 */
	EAttribute getAppUser_Name();

	/**
	 * Returns the meta object for the containment reference '{@link tuber.AppUser#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see tuber.AppUser#getLocation()
	 * @see #getAppUser()
	 * @generated
	 */
	EReference getAppUser_Location();

	/**
	 * Returns the meta object for the attribute '{@link tuber.AppUser#getRating <em>Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rating</em>'.
	 * @see tuber.AppUser#getRating()
	 * @see #getAppUser()
	 * @generated
	 */
	EAttribute getAppUser_Rating();

	/**
	 * Returns the meta object for the attribute '{@link tuber.AppUser#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see tuber.AppUser#getStatus()
	 * @see #getAppUser()
	 * @generated
	 */
	EAttribute getAppUser_Status();

	/**
	 * Returns the meta object for class '{@link tuber.Payment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment</em>'.
	 * @see tuber.Payment
	 * @generated
	 */
	EClass getPayment();

	/**
	 * Returns the meta object for the attribute '{@link tuber.Payment#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see tuber.Payment#getType()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_Type();

	/**
	 * Returns the meta object for the attribute '{@link tuber.Payment#isStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see tuber.Payment#isStatus()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_Status();

	/**
	 * Returns the meta object for the attribute '{@link tuber.Payment#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see tuber.Payment#getAmount()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_Amount();

	/**
	 * Returns the meta object for class '{@link tuber.HelpCentreCall <em>Help Centre Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Help Centre Call</em>'.
	 * @see tuber.HelpCentreCall
	 * @generated
	 */
	EClass getHelpCentreCall();

	/**
	 * Returns the meta object for the attribute '{@link tuber.HelpCentreCall#getIssue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue</em>'.
	 * @see tuber.HelpCentreCall#getIssue()
	 * @see #getHelpCentreCall()
	 * @generated
	 */
	EAttribute getHelpCentreCall_Issue();

	/**
	 * Returns the meta object for the attribute '{@link tuber.HelpCentreCall#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see tuber.HelpCentreCall#getStatus()
	 * @see #getHelpCentreCall()
	 * @generated
	 */
	EAttribute getHelpCentreCall_Status();

	/**
	 * Returns the meta object for the attribute '{@link tuber.HelpCentreCall#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see tuber.HelpCentreCall#getDuration()
	 * @see #getHelpCentreCall()
	 * @generated
	 */
	EAttribute getHelpCentreCall_Duration();

	/**
	 * Returns the meta object for the attribute '{@link tuber.HelpCentreCall#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see tuber.HelpCentreCall#getDate()
	 * @see #getHelpCentreCall()
	 * @generated
	 */
	EAttribute getHelpCentreCall_Date();

	/**
	 * Returns the meta object for class '{@link tuber.Vehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle</em>'.
	 * @see tuber.Vehicle
	 * @generated
	 */
	EClass getVehicle();

	/**
	 * Returns the meta object for the attribute '{@link tuber.Vehicle#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tuber.Vehicle#getName()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_Name();

	/**
	 * Returns the meta object for the attribute '{@link tuber.Vehicle#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see tuber.Vehicle#getType()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_Type();

	/**
	 * Returns the meta object for the attribute '{@link tuber.Vehicle#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see tuber.Vehicle#getCapacity()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_Capacity();

	/**
	 * Returns the meta object for class '{@link tuber.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see tuber.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link tuber.Location#getLt <em>Lt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lt</em>'.
	 * @see tuber.Location#getLt()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Lt();

	/**
	 * Returns the meta object for the attribute '{@link tuber.Location#getLg <em>Lg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lg</em>'.
	 * @see tuber.Location#getLg()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Lg();

	/**
	 * Returns the meta object for the attribute '{@link tuber.Location#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see tuber.Location#getCity()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_City();

	/**
	 * Returns the meta object for class '{@link tuber.Ride <em>Ride</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ride</em>'.
	 * @see tuber.Ride
	 * @generated
	 */
	EClass getRide();

	/**
	 * Returns the meta object for the reference list '{@link tuber.Ride#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Customer</em>'.
	 * @see tuber.Ride#getCustomer()
	 * @see #getRide()
	 * @generated
	 */
	EReference getRide_Customer();

	/**
	 * Returns the meta object for the reference '{@link tuber.Ride#getDriver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Driver</em>'.
	 * @see tuber.Ride#getDriver()
	 * @see #getRide()
	 * @generated
	 */
	EReference getRide_Driver();

	/**
	 * Returns the meta object for the attribute '{@link tuber.Ride#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tuber.Ride#getId()
	 * @see #getRide()
	 * @generated
	 */
	EAttribute getRide_Id();

	/**
	 * Returns the meta object for the attribute '{@link tuber.Ride#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see tuber.Ride#getDate()
	 * @see #getRide()
	 * @generated
	 */
	EAttribute getRide_Date();

	/**
	 * Returns the meta object for the attribute '{@link tuber.Ride#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see tuber.Ride#getAmount()
	 * @see #getRide()
	 * @generated
	 */
	EAttribute getRide_Amount();

	/**
	 * Returns the meta object for the attribute '{@link tuber.Ride#isPaid <em>Paid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paid</em>'.
	 * @see tuber.Ride#isPaid()
	 * @see #getRide()
	 * @generated
	 */
	EAttribute getRide_Paid();

	/**
	 * Returns the meta object for the attribute '{@link tuber.Ride#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see tuber.Ride#getStatus()
	 * @see #getRide()
	 * @generated
	 */
	EAttribute getRide_Status();

	/**
	 * Returns the meta object for the reference '{@link tuber.Ride#getPayment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment</em>'.
	 * @see tuber.Ride#getPayment()
	 * @see #getRide()
	 * @generated
	 */
	EReference getRide_Payment();

	/**
	 * Returns the meta object for the attribute '{@link tuber.Ride#getMultiplier <em>Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplier</em>'.
	 * @see tuber.Ride#getMultiplier()
	 * @see #getRide()
	 * @generated
	 */
	EAttribute getRide_Multiplier();

	/**
	 * Returns the meta object for the attribute '{@link tuber.Ride#isSharing <em>Sharing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sharing</em>'.
	 * @see tuber.Ride#isSharing()
	 * @see #getRide()
	 * @generated
	 */
	EAttribute getRide_Sharing();

	/**
	 * Returns the meta object for class '{@link tuber.SafetyIssue <em>Safety Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Safety Issue</em>'.
	 * @see tuber.SafetyIssue
	 * @generated
	 */
	EClass getSafetyIssue();

	/**
	 * Returns the meta object for the reference '{@link tuber.SafetyIssue#getRide <em>Ride</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ride</em>'.
	 * @see tuber.SafetyIssue#getRide()
	 * @see #getSafetyIssue()
	 * @generated
	 */
	EReference getSafetyIssue_Ride();

	/**
	 * Returns the meta object for class '{@link tuber.PaymentIssue <em>Payment Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment Issue</em>'.
	 * @see tuber.PaymentIssue
	 * @generated
	 */
	EClass getPaymentIssue();

	/**
	 * Returns the meta object for the reference '{@link tuber.PaymentIssue#getRide <em>Ride</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ride</em>'.
	 * @see tuber.PaymentIssue#getRide()
	 * @see #getPaymentIssue()
	 * @generated
	 */
	EReference getPaymentIssue_Ride();

	/**
	 * Returns the meta object for enum '{@link tuber.City <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>City</em>'.
	 * @see tuber.City
	 * @generated
	 */
	EEnum getCity();

	/**
	 * Returns the meta object for enum '{@link tuber.TicketStatus <em>Ticket Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ticket Status</em>'.
	 * @see tuber.TicketStatus
	 * @generated
	 */
	EEnum getTicketStatus();

	/**
	 * Returns the meta object for enum '{@link tuber.IssueType <em>Issue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Issue Type</em>'.
	 * @see tuber.IssueType
	 * @generated
	 */
	EEnum getIssueType();

	/**
	 * Returns the meta object for enum '{@link tuber.RideStatus <em>Ride Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ride Status</em>'.
	 * @see tuber.RideStatus
	 * @generated
	 */
	EEnum getRideStatus();

	/**
	 * Returns the meta object for enum '{@link tuber.PaymentType <em>Payment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Payment Type</em>'.
	 * @see tuber.PaymentType
	 * @generated
	 */
	EEnum getPaymentType();

	/**
	 * Returns the meta object for enum '{@link tuber.VehicleType <em>Vehicle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vehicle Type</em>'.
	 * @see tuber.VehicleType
	 * @generated
	 */
	EEnum getVehicleType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TuberFactory getTuberFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tuber.impl.TUberImpl <em>TUber</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tuber.impl.TUberImpl
		 * @see tuber.impl.TuberPackageImpl#getTUber()
		 * @generated
		 */
		EClass TUBER = eINSTANCE.getTUber();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUBER__AGENT = eINSTANCE.getTUber_Agent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUBER__NAME = eINSTANCE.getTUber_Name();

		/**
		 * The meta object literal for the '{@link tuber.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tuber.impl.AgentImpl
		 * @see tuber.impl.TuberPackageImpl#getAgent()
		 * @generated
		 */
		EClass AGENT = eINSTANCE.getAgent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT__NAME = eINSTANCE.getAgent_Name();

		/**
		 * The meta object literal for the '<em><b>Rides</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__RIDES = eINSTANCE.getAgent_Rides();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT__CITY = eINSTANCE.getAgent_City();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__USERS = eINSTANCE.getAgent_Users();

		/**
		 * The meta object literal for the '<em><b>Revenue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT__REVENUE = eINSTANCE.getAgent_Revenue();

		/**
		 * The meta object literal for the '{@link tuber.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tuber.impl.CustomerImpl
		 * @see tuber.impl.TuberPackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>Payment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__PAYMENT = eINSTANCE.getCustomer_Payment();

		/**
		 * The meta object literal for the '<em><b>Spendings</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__SPENDINGS = eINSTANCE.getCustomer_Spendings();

		/**
		 * The meta object literal for the '{@link tuber.impl.DriverImpl <em>Driver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tuber.impl.DriverImpl
		 * @see tuber.impl.TuberPackageImpl#getDriver()
		 * @generated
		 */
		EClass DRIVER = eINSTANCE.getDriver();

		/**
		 * The meta object literal for the '<em><b>Vehicle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRIVER__VEHICLE = eINSTANCE.getDriver_Vehicle();

		/**
		 * The meta object literal for the '<em><b>Earnings</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRIVER__EARNINGS = eINSTANCE.getDriver_Earnings();

		/**
		 * The meta object literal for the '{@link tuber.impl.AppUserImpl <em>App User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tuber.impl.AppUserImpl
		 * @see tuber.impl.TuberPackageImpl#getAppUser()
		 * @generated
		 */
		EClass APP_USER = eINSTANCE.getAppUser();

		/**
		 * The meta object literal for the '<em><b>Support Call</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_USER__SUPPORT_CALL = eINSTANCE.getAppUser_SupportCall();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_USER__NAME = eINSTANCE.getAppUser_Name();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_USER__LOCATION = eINSTANCE.getAppUser_Location();

		/**
		 * The meta object literal for the '<em><b>Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_USER__RATING = eINSTANCE.getAppUser_Rating();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_USER__STATUS = eINSTANCE.getAppUser_Status();

		/**
		 * The meta object literal for the '{@link tuber.impl.PaymentImpl <em>Payment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tuber.impl.PaymentImpl
		 * @see tuber.impl.TuberPackageImpl#getPayment()
		 * @generated
		 */
		EClass PAYMENT = eINSTANCE.getPayment();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__TYPE = eINSTANCE.getPayment_Type();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__STATUS = eINSTANCE.getPayment_Status();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__AMOUNT = eINSTANCE.getPayment_Amount();

		/**
		 * The meta object literal for the '{@link tuber.impl.HelpCentreCallImpl <em>Help Centre Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tuber.impl.HelpCentreCallImpl
		 * @see tuber.impl.TuberPackageImpl#getHelpCentreCall()
		 * @generated
		 */
		EClass HELP_CENTRE_CALL = eINSTANCE.getHelpCentreCall();

		/**
		 * The meta object literal for the '<em><b>Issue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HELP_CENTRE_CALL__ISSUE = eINSTANCE.getHelpCentreCall_Issue();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HELP_CENTRE_CALL__STATUS = eINSTANCE.getHelpCentreCall_Status();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HELP_CENTRE_CALL__DURATION = eINSTANCE.getHelpCentreCall_Duration();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HELP_CENTRE_CALL__DATE = eINSTANCE.getHelpCentreCall_Date();

		/**
		 * The meta object literal for the '{@link tuber.impl.VehicleImpl <em>Vehicle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tuber.impl.VehicleImpl
		 * @see tuber.impl.TuberPackageImpl#getVehicle()
		 * @generated
		 */
		EClass VEHICLE = eINSTANCE.getVehicle();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__NAME = eINSTANCE.getVehicle_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__TYPE = eINSTANCE.getVehicle_Type();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__CAPACITY = eINSTANCE.getVehicle_Capacity();

		/**
		 * The meta object literal for the '{@link tuber.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tuber.impl.LocationImpl
		 * @see tuber.impl.TuberPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Lt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LT = eINSTANCE.getLocation_Lt();

		/**
		 * The meta object literal for the '<em><b>Lg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LG = eINSTANCE.getLocation_Lg();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__CITY = eINSTANCE.getLocation_City();

		/**
		 * The meta object literal for the '{@link tuber.impl.RideImpl <em>Ride</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tuber.impl.RideImpl
		 * @see tuber.impl.TuberPackageImpl#getRide()
		 * @generated
		 */
		EClass RIDE = eINSTANCE.getRide();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIDE__CUSTOMER = eINSTANCE.getRide_Customer();

		/**
		 * The meta object literal for the '<em><b>Driver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIDE__DRIVER = eINSTANCE.getRide_Driver();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIDE__ID = eINSTANCE.getRide_Id();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIDE__DATE = eINSTANCE.getRide_Date();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIDE__AMOUNT = eINSTANCE.getRide_Amount();

		/**
		 * The meta object literal for the '<em><b>Paid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIDE__PAID = eINSTANCE.getRide_Paid();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIDE__STATUS = eINSTANCE.getRide_Status();

		/**
		 * The meta object literal for the '<em><b>Payment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIDE__PAYMENT = eINSTANCE.getRide_Payment();

		/**
		 * The meta object literal for the '<em><b>Multiplier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIDE__MULTIPLIER = eINSTANCE.getRide_Multiplier();

		/**
		 * The meta object literal for the '<em><b>Sharing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIDE__SHARING = eINSTANCE.getRide_Sharing();

		/**
		 * The meta object literal for the '{@link tuber.impl.SafetyIssueImpl <em>Safety Issue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tuber.impl.SafetyIssueImpl
		 * @see tuber.impl.TuberPackageImpl#getSafetyIssue()
		 * @generated
		 */
		EClass SAFETY_ISSUE = eINSTANCE.getSafetyIssue();

		/**
		 * The meta object literal for the '<em><b>Ride</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAFETY_ISSUE__RIDE = eINSTANCE.getSafetyIssue_Ride();

		/**
		 * The meta object literal for the '{@link tuber.impl.PaymentIssueImpl <em>Payment Issue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tuber.impl.PaymentIssueImpl
		 * @see tuber.impl.TuberPackageImpl#getPaymentIssue()
		 * @generated
		 */
		EClass PAYMENT_ISSUE = eINSTANCE.getPaymentIssue();

		/**
		 * The meta object literal for the '<em><b>Ride</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_ISSUE__RIDE = eINSTANCE.getPaymentIssue_Ride();

		/**
		 * The meta object literal for the '{@link tuber.City <em>City</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tuber.City
		 * @see tuber.impl.TuberPackageImpl#getCity()
		 * @generated
		 */
		EEnum CITY = eINSTANCE.getCity();

		/**
		 * The meta object literal for the '{@link tuber.TicketStatus <em>Ticket Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tuber.TicketStatus
		 * @see tuber.impl.TuberPackageImpl#getTicketStatus()
		 * @generated
		 */
		EEnum TICKET_STATUS = eINSTANCE.getTicketStatus();

		/**
		 * The meta object literal for the '{@link tuber.IssueType <em>Issue Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tuber.IssueType
		 * @see tuber.impl.TuberPackageImpl#getIssueType()
		 * @generated
		 */
		EEnum ISSUE_TYPE = eINSTANCE.getIssueType();

		/**
		 * The meta object literal for the '{@link tuber.RideStatus <em>Ride Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tuber.RideStatus
		 * @see tuber.impl.TuberPackageImpl#getRideStatus()
		 * @generated
		 */
		EEnum RIDE_STATUS = eINSTANCE.getRideStatus();

		/**
		 * The meta object literal for the '{@link tuber.PaymentType <em>Payment Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tuber.PaymentType
		 * @see tuber.impl.TuberPackageImpl#getPaymentType()
		 * @generated
		 */
		EEnum PAYMENT_TYPE = eINSTANCE.getPaymentType();

		/**
		 * The meta object literal for the '{@link tuber.VehicleType <em>Vehicle Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tuber.VehicleType
		 * @see tuber.impl.TuberPackageImpl#getVehicleType()
		 * @generated
		 */
		EEnum VEHICLE_TYPE = eINSTANCE.getVehicleType();

	}

} //TuberPackage
