package curs4;

public class Palindrome {

	public void checkIfWordIsPalindrome(String cuvant) {

		String cuvantIntors = "";

		for (int i = cuvant.length() - 1; i >= 0; i--) {

			cuvantIntors = cuvantIntors + cuvant.charAt(i);

		}

		if (cuvantIntors.equals(cuvant)) {
			System.out.println("Cuvantul este palindrom");
		} else {
			System.out.println("Cuvantul nu este palindrom");
		}
		System.out.println("cuvant initial: " + cuvant);
		System.out.println("cuvant intors: " + cuvantIntors);

	}

}
