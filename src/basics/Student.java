package basics;

class Student {
	public String SSN;
	public String studentName;
	private static int ID=1000;
	private String studentId;
	private String phoneNumber;
	private String city;
	private String state;
	private String email;
	
	//constructor
	public Student(String studentName, String SSN) {
		this.SSN=SSN;
		this.studentName=studentName;
		email=this.studentName + "@studentdatabase.com";
		ID++;
		setStudentId();

		
	}
	//Getters - Setters
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEmail() {
		return email;
	}
	public String getStudentId() {
		return studentId;
	}
//Methods
	private void setStudentId() {
		int random= (int) (Math.random()*10000);
		while (random<1000||random>9000) {
			random= (int) (Math.random()*10000);
		}
		studentId=ID + "" + random + SSN.substring(4, 8);
	}
	public void enroll() {
		System.out.println("Enrolling to course(s)");
	}
	public void pay() {
		System.out.println("Paying");
	}
	public void checkBalance() {
		System.out.println("Showing your balance");
	}
	@Override
	public String toString() {
		return ("[Name:"+studentName+"]\n[Email:"+email+"]\n[Id:"+studentId+"]");
	}
	public void showCourses() {
		System.out.println("Showing your courses");
	}

}
