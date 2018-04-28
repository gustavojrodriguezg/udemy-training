package basics;

public class assignment1 {
	public static void main(String[] args) {
		
		int n=4;
		System.out.println("The result is " + Sum(n));
		
		
		
	}
	public static int Sum(int n) {
		int S=0;
		if (n==0) {
			System.out.println("n must be >=1");
		}
		else {
		for(int i=1;i<=n;i++) {
			S=i+S;
		}
		}
		return S;
		
	}

}
