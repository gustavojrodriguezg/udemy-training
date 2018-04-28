package basics;

public class assignment4 {

	public static void main(String[] args) {
		Student std1=new Student("GustavoRodriguez","20562032");
		System.out.println(std1.toString());
		std1.setCity("La Guaira");
		std1.setState("Vargas");
		std1.setPhoneNumber("+584241602058");
		System.out.println(std1.getCity());
		System.out.println(std1.getState());
		System.out.println(std1.getPhoneNumber());
		std1.enroll();
		std1.showCourses();
		std1.checkBalance();
		std1.pay();
	}

}
