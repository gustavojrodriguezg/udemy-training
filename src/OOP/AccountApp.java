package OOP;

public class AccountApp {

	public static void main(String[] args) {
		LoanAccount la = new LoanAccount();
		la.increaseRate();
		la.setRate();
		la.setTerm(4);
		la.setAmortSchedule();
		//POLYMORPHISM
		// creating an object of class(properties) IRate  but pointing LoanAccount
		// the available methods for account1 object are the ones in IRate but
		// the actual code that executes is from LoanAccount methods.
		IRate account1 = new LoanAccount();
		account1.setRate();
	}


}
