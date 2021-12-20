package curs5;

import java.util.Scanner;

public class ForBreakEx {

	public static void main(String[] args) {


		System.out.println("Please enter a text: ");
		Scanner scan = new Scanner(System.in);
		String text = scan.next();
		char letter = 'A';
		boolean letterFound = false;
		
		for (int i = 0; i<text.length(); i++) {
			
			char currentLetter = text.charAt(i);
			if(currentLetter==letter) {
				letterFound = true;
				break;
			}
			
		}
		if (letterFound) {
			System.out.println("Litera A exista in text");
		}
		else {
			System.out.println("Litera A nu exista in text");
		}

	}

}
