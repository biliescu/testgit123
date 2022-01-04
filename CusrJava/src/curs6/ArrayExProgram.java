package curs6;

import java.util.Random;

public class ArrayExProgram {

	public final int LENGHT = 6;
	public final int MAX_NUMBERS = 9;

	public static void main(String[] args) {

		ArrayExProgram ex = new ArrayExProgram();
		ex.printNumbers(ex.generateNumbers());
	}

	public int[] generateNumbers() {
		int[] numbers = new int[LENGHT];
		Random random = new Random();
		for (int i = 0; i < LENGHT; i++) {

			int randomNr = 0;
			do {
				randomNr = random.nextInt(MAX_NUMBERS);
			} while (search(numbers, randomNr));
			
			numbers[i] = randomNr;
		}
		return numbers;
	}

	public void printNumbers(int[] arr) {

		for (int nr : arr) {
			System.out.print(nr + " | ");
		}
	}

	public boolean search(int[] array, int nrToSearchFor) {

		for (int value : array) {

			if (nrToSearchFor == value) {
				return true;
			}
		}
		return false;
	}
}
