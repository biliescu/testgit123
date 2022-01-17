package homework8;

public class TestVehicul {

	public static void main(String[] args) {

		Vehicul masina = new Masina("BMW", 6, "150km/h");
		Vehicul bicicleta = new Bicicleta("Pegas", 0, "30km/h");
		verificaMotorizarea(masina);
		verificaMotorizarea(bicicleta);
		masina.detaliiVehicul();
		bicicleta.detaliiVehicul();
	}

	public static void verificaMotorizarea(Vehicul vehicul) {
		System.out.println(vehicul.nume());
		System.out.println(vehicul.motorizare());
	}

}
