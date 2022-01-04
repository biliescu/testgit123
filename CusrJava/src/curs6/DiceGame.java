package curs6;

public class DiceGame {

	// Joc de zaruri in care avem urmatoarele reguli:
	// Daca userul da in total : 2, 6, 12 pierde // break
	// Daca userul da in total : 7, 11 castiga // break
	// Daca userul da in total : 3, 10 repeta // continue
	// Daca nu da oricare dintre valorile de mai sus, intrebam daca vrea sa mai dea
	// inca o data. Raspuns boolean

	public static void main(String[] args) {
		
		boolean condition = true;
		
		while(condition) {
			int dice1 = (int) (Math.random()*6+1);
			int dice2 = (int) (Math.random()*6+1);
			System.out.println();
			
			
		}

	}

}
