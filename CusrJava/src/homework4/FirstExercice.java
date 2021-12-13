package homework4;

import java.util.Scanner;

public class FirstExercice {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i < 11; i++) {
			System.out.println("Please enter number " + i + ": ");
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			sum += num;
		}
		System.out.println("The sum of the numbers is: " + sum);

	}

}
