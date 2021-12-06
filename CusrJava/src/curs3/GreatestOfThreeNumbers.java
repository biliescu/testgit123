package curs3;

import java.util.Scanner;

public class GreatestOfThreeNumbers {

	int number1;
	int number2;
	int number3;

	// metoda care intreaba utilizatorul 3 numere
	public void askTheUserForhreeNumbers() {
		System.out.println("Please enter the first number :");
		Scanner scan = new Scanner(System.in);
		number1 = scan.nextInt();
		System.out.println("Please enter the second number :");
		number2 = scan.nextInt();
		System.out.println("Please enter the third number :");
		number3 = scan.nextInt();

	}

	// metoda care compara cele trei nr si decide care este mai mare

	public void checkTheGreatestOfThreeNumbers() {
		if (number1 > number2 && number1 > number3) {
			System.out.println("The greatest number is : " + number1);
		} else if (number2 > number1 && number2 > number3) {
			System.out.println("The greatest number is : " + number2);
		} else if (number3 > number1 && number3 > number2) {
			System.out.println("The greatest number is : " + number3);
		}
		else {
			System.out.println("Some of the numbers are equal!");
		}
	}

}
