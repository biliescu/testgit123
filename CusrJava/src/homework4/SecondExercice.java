package homework4;

import java.util.Scanner;

public class SecondExercice {

	public static void main(String[] args) {
		int num = 0;
		System.out.println("Please enter number: ");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		System.out.println("Tabla inmultirii cu " + num + "\n");
		for (int i = 1; i < 11; i++) {
			System.out.println(num + " * " + i + " = " + num * i + "\n");

		}

	}

}
