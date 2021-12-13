package curs4;

import java.util.Scanner;

public class ForExample2 {
	

	public static void main(String[] args) {
		char character;
		int num;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a char: ");
		character = scan.next().charAt(0);
		System.out.println("Please enter a number:");
		num = scan.nextInt();

		// for pt nr de linii
		for (int i=0; i<num; i++) {

			//for pt caracter
			for(int j = 0; j<num; j++) {
				System.out.println(character);
			}
			System.out.println();
		}

	}

}
