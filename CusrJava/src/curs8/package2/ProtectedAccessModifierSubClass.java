package curs8.package2;

import curs8.ProtectedAccessModifier;

public class ProtectedAccessModifierSubClass extends ProtectedAccessModifier{
	
	public static void main(String[] args) {
		
		ProtectedAccessModifierSubClass obj = new ProtectedAccessModifierSubClass();
		System.out.println(obj.unu);
		obj.printMesaj();
		
	}

}
