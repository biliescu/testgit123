package curs7;

public class Square extends Shape{
	
	String shapeName = "Square";
	String shapeColor = "Black";

	public Square() {
		System.out.println("Square class constructor");
		
	}
	
	//constructor cu parametrii
	public Square(String color, String name) {
		super(color, name);
	}
	
	public void displayDetails() {
		System.out.println(" The shape name is : " + super.shapeName + " and color is : " + super.shapeColor);
	}

}
