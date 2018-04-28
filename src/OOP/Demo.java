package OOP;

class Person{
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	void eat() {
		System.out.println(name + " is eating");		
	}
	void sleep() {
		System.out.println(name + " is sleeping");		
	}
}

public class Demo {
	public static void main(String[] args) {
		//person
		
		//Attributes, variables, adjectives, descriptors, properties
		
		String name = "Joe";
		String email = "joe@testemail.com";
		String phone = "123456789";
		
		//Action, Activity, Behavior
		System.out.println(name + " is walking");
		System.out.println(name + " is eating");
		
		//what if we wanted to do this for another person**1
		String name2 = "Sarah";
		String email2 = "sarah@testemail.com";
		String phone2 = "987654321";
		walking(name2);
		
		//what about binding attributes and properties together**2
		//2**Create a class 
		//Using the class to do the same we did above
		
	    //Initializing an object
		Person person1= new Person();
		
		//Define some properties - ATTRIBUTES
		person1.name="Joe";
		person1.email="joe@testemail.com";
		person1.phone="123456789";
		
		//ABSTRACTION
		person1.walk();
		person1.eat();
		person1.sleep();
		
		Person person2= new Person();
		person2.name="Sarah";
		person2.sleep();
		
		
	}
		//1**Adding functions to minimize code
	
	static void walking(String name) {
		System.out.println(name + " is walking");
	}


}
