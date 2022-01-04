package homework6;

public class Exercitiu3 {

	public static void main(String[] args) {

		String[] myStringArray = { "Maria", "Bob", "Ion", "George", "Oana", "Bogdan", "Oana", "Ion" };
		for (int j = 0; j < 8; j++) {
			for (int i = j + 1; i < 8; i++) {
				if (myStringArray[j].equals(myStringArray[i])) {
					System.out.println("Nume duplicat : " + myStringArray[j]);
				}
			}
		}
	}
}
