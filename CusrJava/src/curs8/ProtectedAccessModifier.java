package curs8;

public class ProtectedAccessModifier {
	
	
	/* 
	 * Scopul este in acelasi packet si subclase din pachete diferite
	 * Clasele nu pot fi declarate ca protected
	 * 
	 * Same class: yes
	 * 
	 * Subclass in acelasi pachet : yes
	 * ALte clase in acelasi pachet : yes
	 * 
	 * Subclass in alt pachet : yes
	 * Alta clasa in alt pachet ; no
	 *  
	 *  
	 *  */
	
	protected String unu = "unu";
	
	protected void printMesaj() {
		System.out.println("protected access");
	}
	
	public static void main(String[] args) {
		
		ProtectedAccessModifier obj = new ProtectedAccessModifier();
		System.out.println(obj.unu);
		obj.printMesaj();
	}

}
