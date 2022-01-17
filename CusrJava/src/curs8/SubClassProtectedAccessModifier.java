package curs8;

public class SubClassProtectedAccessModifier extends ProtectedAccessModifier{

	public static void main(String[] args) {


		SubClassProtectedAccessModifier obj = new SubClassProtectedAccessModifier();
		System.out.println(obj.unu);
		obj.printMesaj();

	}

}
