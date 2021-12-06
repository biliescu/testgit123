package homework3;

public class TestCar {
	
	public static void main(String[] args) {
		
		Car obiect = new Car("Toyota", "diesel");
		System.out.println(obiect.carDetails());
		
		Car obiect2 = new Car("Honda", "diesel");
		obiect2.type = "sedan";
		
		System.out.println(obiect2.carDetails());
		
		System.out.println(obiect.carDetails());
		
	}

}
