package OOP;

public class BankAccountApp {
	
	public static void main(String[] args) {
	//Creating a new bank account >> think instantiate an object
		BankAccount acc1= new BankAccount();
		acc1.accountNumber="123456";
		//using constructors
		//polymorphism through overloading 
		//calling different methods called the same name but with different arguments
		BankAccount acc2= new BankAccount("Checking Account");
		acc2.accountNumber="654789";
		BankAccount acc3= new BankAccount("Checking Account",25638.20);
		acc3.accountNumber="123789";
		// System.out.println(acc1.routingNumber + " "  + acc2.routingNumber + " " + acc3.routingNumber);
		acc3.checkBalance();
		
		//Demo for inheritance
		//CDAccount inherited from Class BankAccount and of course parent Object Class.
		//Constructors are not inherited
		CDAccount cd1= new CDAccount();
		cd1.balance=3000;
		cd1.setName("Juan");
		cd1.accountType="CD Account";
		cd1.accountNumber="52147963";
		cd1.checkBalance();
		
		//Override
		//Example: Overriding toString method of Object Class
		//Polymorphism through overriding 
		System.out.println(cd1.toString());
		cd1.compount();
	
		acc1.deposit(5000);
		acc1.deposit(300);
		acc1.withdraw(2000);
		acc1.checkBalance();
		
		//ENCAPSULATION

		BankAccount acc4=new BankAccount();
		//Old way of defining variables
		acc4.accountNumber="82849303";
		// acc4.name="Pedro";
		acc4.setName("Pedro");
		System.out.println(acc4.getName());
		acc4.setSSN("20562032");
		System.out.println("SSN of Mr." + acc4.getName() + " is: " + acc4.getSSN());
		acc4.setRate();
		acc4.increaseRate();
		
		LoanAccount acc5= new LoanAccount();
		acc5.increaseRate();
		acc5.setRate();
	}
}
