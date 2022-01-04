package curs6;

import java.util.Scanner;

public class ForEachEx {

	public static void main(String[] args) {
		System.out.println("Please enter a text: ");
		Scanner scan = new Scanner(System.in);
		String text = scan.next();
		char letter = 'A';
		boolean letterFound = false;
		int counter = 0;
		
		char [] myArray = text.toCharArray();
		for(char ch : myArray) {
			System.out.println(ch);
			if(ch==letter || ch == 'a') {
				letterFound = true;
				break;
			}
		}

//		for (int i = 0; i<text.length(); i++) {
//			
//			char currentLetter = text.charAt(i);
//			if(currentLetter==letter) {
//				letterFound = true;
//				break;
//			}
//			
//		}

		if (letterFound) {
			System.out.println("Litera A exista in text");
		} else {
			System.out.println("Litera A nu exista in text");
		}

	}

}
