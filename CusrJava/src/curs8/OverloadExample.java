package curs8;

public class OverloadExample {
	
	public static void main(String[] args) {
		
		System.out.println(multiply(3, 3));
		System.out.println(multiply(6.0, 7.0));
	}
	
	public static int multiply (int a, int b) {	
		return a*b;
	}
	
	public static double multiply (double a, double b) {
		return a*b;
	}

}
