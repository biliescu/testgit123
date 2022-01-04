package homework6;

public class Exercitiu2 {

	public static void main(String[] args) {

		String string = "Eu invat Java";
		int totalVocale = 0;
		for (char vocala : string.toCharArray()) {
			if (vocala == 'a' || vocala == 'A' || vocala == 'e' || vocala == 'E' || vocala == 'i' || vocala == 'I'
					|| vocala == 'o' || vocala == 'O' || vocala == 'u' || vocala == 'U') {
				totalVocale++;
			}
		}
		System.out.println("Vocale : " + totalVocale);

	}

}
