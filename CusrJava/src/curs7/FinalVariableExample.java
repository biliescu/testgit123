package curs7;

public class FinalVariableExample {
	
	public final int VALUE;
	
	public FinalVariableExample() {
		VALUE = 100;
	}
	
	
	public void demo() {
		//VALUE=150;
		System.out.println(VALUE);
	}

	public static void main(String[] args) {
		
		FinalVariableExample obj = new FinalVariableExample();
		obj.demo();
	
	

	}

}
