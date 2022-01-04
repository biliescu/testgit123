package curs6;

public class ForEachEx1 {

	public static void main(String[] args) {

		int[] number = { 10, 20, 30, 40 };

		for (int i = 0; i < number.length; i++) {
			System.out.println("Clasic for : " + number[i]);
		}
		
		for(int num : number) {
			System.out.println(num);
		}
		
		String[] cities = {"Iasi", "Cluj", "Arad", "Alba", "Oradea"};
		
		for (String oras : cities) {
			if(oras.equals("Arad")) {
				continue;
			}
			
			System.out.println(oras);
		}

	}

}
