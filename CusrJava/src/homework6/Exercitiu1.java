package homework6;

import java.util.Scanner;

public class Exercitiu1 {
	
	public static void main(String[] args) {
		
		int[] numere = new int[10];
		System.out.println("Please enter 10 numbers");
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i<10; i++) {
			numere[i] = scan.nextInt();
			sum = sum + numere[i];
		}		
		System.out.println("Suma numerelor din array este: " + sum);
	}
}
