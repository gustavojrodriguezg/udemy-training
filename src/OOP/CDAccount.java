package OOP;
//Inheritance!!!!!
public class CDAccount extends BankAccount implements IRate{

		String interestReate;
		
		void compount() {
			System.out.println("Compounding interest");
		}
		
}
