package curs5;

import java.util.Scanner;

public class DoWhileEx2 {

	public static void main(String[] args) {

		int number;
		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("enter a number: ");
			number = scan.nextInt();
			System.out.println(number * 10);

		} while (number != 0);

	}

}
