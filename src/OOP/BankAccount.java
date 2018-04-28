package OOP;

public class BankAccount implements IRate {
	//Define variables
	String accountNumber;
	private static String routingNumber= "000362"; //This variable belongs to the CLASS not to the particular object, 
	// its value can be changed
	static final String country="USA"; //This variable is like a constant, it can't be changed
	// INSTANSE VARIABLES
	private String name;
	private String SSN;
	String accountType;
	double balance=0;
	//Constructor definitions: unique methods
	//1. They are used to define / setup /initialize properties of an object
	//2. Constructors are IMPLICITLY called upon initialization(as soon as we create a new
	//object, constructors are called automatically)
	//3. The same name as the class itself
	//4. Constructors have NO return type
	BankAccount(){
		System.out.println("NEW ACCOUNT CREATED");
		
	}
	//Overloading: call same method name with different arguments
	BankAccount(String accountType){
		System.out.println("NEW " + accountType +" CREATED");
			
	}
	BankAccount(String accountType, double initDeposit){
		// initDeposit, accountType, Msg are all local varibles
		System.out.println("NEW " + accountType +" CREATED, with an initial deposit of " + initDeposit + "$");
		String Msg="";
			if (initDeposit<1000) {
				Msg="ERROR: Minimum deposit must be at least $1000";
			}
			else {
				Msg="Thanks for your deposit of: $:" + initDeposit;
				}
			System.out.println(Msg);
			balance=balance + initDeposit;
	}
	
	//GETTERS / SETTERS
	
	//Allow the user to define the name
	public void setName(String name) {
		this.name=name; //this.name calls the class name attribute, and we are setting its value to the local varible name
	}
	public String getName() {
		return name;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	//INTERFACE METHODS
	public void setRate(){
		System.out.println("SETTING RATE");
	}
	public void increaseRate(){
		System.out.println("INCREASING RATE");
	}	
	//DEFINE METHODS
	//Access Specifiers
	//public: access throughout the project
	

	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("Deposit");
	}
	//default: access anywhere in the package
	void withdraw(double withdraw) {
		balance =  balance - withdraw;
		showActivity("Withdraw");
		
	}
	void checkBalance() {
		System.out.println("Balance: " + balance);
	}
	void getStatus() {
		
	}
	//private: only available in the class
	private void showActivity(String Activity) {
		System.out.println("Showing recent activity: " + Activity);
	}
	//Overriding toString
	@Override
	public String toString() {
		return "[" + name + ", " + routingNumber + ", " + accountNumber + ", BALANCE: $" + balance + " ]";  
	}
}
