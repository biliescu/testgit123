package curs5;

import java.util.Scanner;

public class WhileLoopExample3 {

	public static void main(String[] args) {
		int maxAllowedHoursWorked = 40;
		int ratePerHour = 15;

		System.out.println("Cate ore ai lucrat saptamana aceasta? :");
		Scanner scan = new Scanner(System.in);
		int hoursWorked = scan.nextInt();

		while (hoursWorked > maxAllowedHoursWorked || hoursWorked < 1) {
			System.out.println("Numar invalid de ore!");
			System.out.println("Introdu un nr valid de ore, mai mic decat 40: ");
			hoursWorked = scan.nextInt();
			
		}
		System.out.println("Salariul de plata este: " + hoursWorked * ratePerHour);
	}

}
