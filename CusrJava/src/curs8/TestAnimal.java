package curs8;

public class TestAnimal {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.makeSound();
		
		System.out.println("================================");
		
		Deer bambi = new Deer();
		bambi.makeSound();
		bambi.eatGrass();
		
		System.out.println("================================");
		
		Lion simba = new Lion();
		simba.makeSound();
		simba.eatMeat();
		
		System.out.println("================================");
		
		Animal simba2 = new Lion();
		simba2.makeSound();
		((Lion) simba2).eatMeat();
		feedAnimal(simba2);
		
		System.out.println("================================");
		
		simba2 = new Deer();
		simba2.makeSound();
		((Deer) simba2).eatGrass();
		feedAnimal(simba2);

	}
	
	public static void feedAnimal(Animal obiect) {
		if (obiect instanceof Lion) {
			System.out.println("you are getting burgers!");
		}else if (obiect instanceof Deer) {
			System.out.println("you are getting salad!");
		}
		
		
	}

}
