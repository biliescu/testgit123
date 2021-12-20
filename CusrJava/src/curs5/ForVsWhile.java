package curs5;

import java.util.Scanner;

public class ForVsWhile {

	public static void main(String[] args) {

		rezolvareCuFor();

	}

	// rezolvare cu while
	public static void rezolvareCuWhile() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int x = scan.nextInt();
		int sum = 0;

		while (x != 0) {
			sum += x;
			System.out.println("Please enter a number: ");
			x = scan.nextInt();
		}

		System.out.println("Total sum of entered numbers is: " + sum);

	}

	// rezolvare cu for
	public static void rezolvareCuFor() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number: ");

		int sum = 0;
		for (int x = scan.nextInt(); x != 0; x = scan.nextInt()) {
			sum += x;
			System.out.println("Please enter a number: ");

		}
		System.out.println("Total sum of entered numbers is: " + sum);
	}

}
