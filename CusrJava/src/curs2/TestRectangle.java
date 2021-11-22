package curs2;

public class TestRectangle {

	public static void main(String[] args) {

		Rectangle rectangle1 = new Rectangle();
		System.out.println("Rectangle 1: " + rectangle1.calculateAria());
		rectangle1.setLenght(6);
		rectangle1.setWidth(2);
		System.out.println("Rectangle 1.1: " + rectangle1.calculateAria());

		Rectangle rectangle2 = new Rectangle();
		System.out.println("Rectangle 2: " + rectangle2.calculateAria());
		
		Rectangle rectangle3 = new Rectangle(3, 3);
		System.out.println("Rectangle 3: " + rectangle3.calculateAria());
		
		Rectangle rectangle4 = new Rectangle(5, 2, 400);
		System.out.println("Number of rectangles for rectangle 4: " + rectangle4.calculateNumberOfRectangles());


	}

}
