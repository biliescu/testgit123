package curs7;

public class ChildClass extends ParentClass{
	
	int number = 30;
	
	public void printNumebr() {
		
		System.out.println(super.number);
	}

	public static void main(String[] args) {

		ChildClass obj = new ChildClass();
		obj.printNumebr();

	}

}
