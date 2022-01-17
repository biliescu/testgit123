package curs8;

public class DefaultAccessModifier {
		
	
	String mesaj;
	
	void printMesaj() {
		
		System.out.println("Default modifier");
	}
	
	public static void main(String[] args) {
		
		DefaultAccessModifier obj = new DefaultAccessModifier();
		obj.printMesaj();
	}

}
