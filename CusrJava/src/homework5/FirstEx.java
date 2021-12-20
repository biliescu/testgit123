package homework5;

import java.util.Scanner;

public class FirstEx {
	public static void main(String[] args) {
		int i = 3;
		int maxAttemps = 0;
		do {
			System.out.println("Enter a user");
			Scanner scan = new Scanner(System.in);
			String user = scan.next();
			System.out.println("Enter a password");
			int password = scan.nextInt();
			if (user.equals("TestUser") && password == 1234) {
				System.out.println("Login Successful!");				
				break;				
			}else {
				System.out.println("Login error!");
				maxAttemps++;
			}
			i--;
		} while (i != 0);
		
		if(maxAttemps == 3) {
			System.out.println("Maximum attempts reached. User blocked");
		}
	}

}
