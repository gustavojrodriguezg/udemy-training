package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		bookTitle="The Lord of the Rings";
		if (bookTitle.contains("Ring")){
			System.out.println("The book contains the word Ring");
		}
		String browser="Chrome";
		if (browser.equalsIgnoreCase("chrome")){
			System.out.println("The browser is Chrome");
		}
		String firstName="Tim";
		String lastName="Short";
		String SSN="564851264";
		System.out.println("There are " + SSN.length() + " digits in your SSN" );
		//print the initials plus las 4 digits of SNN
		System.out.println(firstName.substring(0,1));
		System.out.println(lastName.substring(0,1));
		System.out.println(SSN.substring(5,9));
	}
}
