package curs7;

public class TestShape {

	public static void main(String[] args) {
		Square patrat = new Square("yellow", "patrat");
		patrat.displayDetails();
		System.out.println(patrat.shapeSize);
		
		
		Square patrat2 = new Square();
		patrat2.displayDetails();

	}

}
