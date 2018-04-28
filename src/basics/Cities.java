package basics;

public class Cities {
	public static void main(String[] args) {
		//***********ARRAYS
		//Declare and Define an Array
		String[] cities= {"New York","San Francisco","Miami","Dallas"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);

		//Declare the array
		String[] countries;
		//Define the array
		countries= new String[2];
		countries[0]="USA";
		countries[1]="Canada";
		System.out.println(countries[1]);
		System.out.println("*********");
		//Declare the array & define the size
		String[] states= new String[5];
		states[0]="California";
		states[1]="Ohio";
		states[2]="New Jersey";
		states[3]="Texas";
		states[4]="Utah";
		//****************CYCLES
		// DO WHILE
		int i=0;
		do {
					System.out.println(states[i]);
					i=i+1;
		}while(i<5);
		// WHILE
		int n=0;
		boolean stateFound=false;
		while(!stateFound) { // while !stateFound=True
			String state= states[n];
			System.out.println(states[n]);
			if(state=="Texas") {
				System.out.println("STATE FOUND!");
				stateFound=true;
			}
			n++;
		}
		//FOR
		for(int x= 0; x < 5; x++) {
			System.out.println(states[x]);
		}
		
		
	}
}
