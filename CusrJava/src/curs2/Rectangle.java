package curs2;

public class Rectangle {

	private int lenght;
	private int width;
	private int bigArea;

	// constructor
	public Rectangle() {
		lenght = 5;
		width = 6;
	}
	
	//alt constructor cu parametrii
	public Rectangle (int lenght, int width) {
		setLenght(lenght);
		setWidth(width);
	}
	
	public Rectangle (int lenght, int width, int bigArea) {
		setLenght(lenght);
		setWidth(width);
		this.bigArea = bigArea;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public int getLenght() {
		return lenght;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int calculateAria() {
		return lenght * width;
	}

	public int calculateNumberOfRectangles() {
		// TODO Auto-generated method stub
		return bigArea/calculateAria();
	}

}
