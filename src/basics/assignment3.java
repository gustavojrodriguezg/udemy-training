package basics;

public class assignment3 {
	public static void main(String[] args) {
	   int[] arrayOfNumbers= {1,40,22,41};

	   System.out.println("The minimum number of the array is "+ Minimum(arrayOfNumbers));
	   System.out.println("The average of the array is "+ Average(arrayOfNumbers));
	   System.out.println("The maximum number of the array is "+ Maximum(arrayOfNumbers));   
	}
	public static int Maximum(int[] n) {
		int x=0;
		for (int i=0;i<n.length;i++) {
			if(n[i]>x) {
				x=n[i];
			}
					}
		return x;
	}
	public static double Average(int[] n) {
		double x=0;
		for (int i=0;i<n.length;i++) {
				x=x+n[i];
								}
		x=x/n.length;
		return x;
	}
	public static int Minimum(int[] n) {
		int x=n[0];
		for (int i=0;i<n.length;i++) {
			if(n[i]<x) {
				x=n[i];
			}
					}
		return x;
	}
	
}
