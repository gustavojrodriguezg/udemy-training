package basics;

public class NumbersCalcFunctions {
	
	public static void main (String[] args) {
		printname();
		int numA=10;
		int numB=20;
		addNumbers(numA,numB);
		System.out.println("The product of numbers " + numA + " and " + numB + " is " + (multiplyNumbers(numA,numB)));
	}
	static void printname() {
		System.out.println("My name is Tim");
	}
	static void addNumbers(int numberA, int numberB) {
		// This function will add two numbers
		int sum;
		sum= numberA + numberB ;
		System.out.println("The sum of numbers "+ numberA + " and "+ numberB + " is "+ sum);
	}
	static int multiplyNumbers (int numberA, int numberB) {
		// This function will return the product of two numbers
		int mult;
		mult= numberA * numberB;
		//Calling a function from another function
		addNumbers(mult,mult);
		
		return mult;
	}

}
