package homework3;

import java.util.Scanner;

public class Age {

	int ages;

	public void askForAge() {
		System.out.println("Please enter the your age :");
		Scanner scan = new Scanner(System.in);
		ages = scan.nextInt();
	}

	public void checkTheAge() {
		if (ages < 18) {
			System.out.println("Esti minor");
		} else if (ages >= 18 && ages <= 65) {
			System.out.println("Esti adult");
		}
		else {
			System.out.println("Esti batran");
		}

	}

}
