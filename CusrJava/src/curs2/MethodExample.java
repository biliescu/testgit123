package curs2;

public class MethodExample {

	/*
	 * 1. numar de camere dinamic 2. calcul de mp al fiecarei camere 3. numarul
	 * total de mp
	 */

	int area;

	public static void main(String[] args) {

		// fara metode
		// room1
		int lenght = 4;
		int width = 2;
		int room1Area = lenght * width;
		System.out.println("Aria camerei este " + room1Area);
		// room2
		int lenght2 = 5;
		int width2 = 6;
		int room2Area = lenght2 * width2;
		System.out.println("Aria camerei 2 este " + room2Area);

		int nrTotalMp = room1Area + room2Area;
		System.out.println(nrTotalMp);
		
		MethodExample room = new MethodExample();
		MethodExample room2 = new MethodExample();
		
		int hol = room.calculateArea(2, 3);
		int baie = room2.calculateArea(4, 4);
		System.out.println("Nr total: "+ calculeazaNrTotal(hol, baie, 70));
	}

	public int calculateArea(int lenght, int width) {
		return lenght * width;
	}
	
	public static int calculeazaNrTotal (int...rooms) {
		int result = 0;
		for(int room : rooms) {
			result = result + room;
		}
		return result;
	}

}
