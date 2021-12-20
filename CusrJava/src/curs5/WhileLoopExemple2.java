package curs5;

import java.util.Scanner;

public class WhileLoopExemple2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num = scan.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + "*" + i + "=" + num * i);
		}
		System.out.println("----------------------------------");

		int x = 1;
		while (x <= 10) {

			System.out.println(num + "*" + x + "=" + num * x);
			x++;
		}

	}

}
