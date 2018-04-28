package basics;

public class assignment2 {
	public static void main(String[] args) {
		
		int n=10;
		System.out.println("The result is " + Fact(n) + " and " + Fact2(n));
		
	
	}
	public static int Fact(int n) {
		int F=1;
		if (n==0||n==1) {
			F=1;
		}
		else {
		for(int i=1;i<n;i++) {
			F=F*(i+1);
			
		}
		
		}
		return F;
	}
	
	public static int Fact2(int n) {
		if (n==0) {
			return 1;
		}
		else {
		
			return Fact2(n-1) * n;
		}
		
		
	}
}
