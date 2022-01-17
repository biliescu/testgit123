package homework8;

public class Vehicul {

	private String brand;
	private int nivelPoluare;
	private String vitezaMedie;

	public Vehicul(String brand, int nivelPoluare, String vitezaMedie) {
		this.brand = brand;
		this.nivelPoluare = nivelPoluare;
		this.vitezaMedie = vitezaMedie;
	}

	public Vehicul() {
		// TODO Auto-generated constructor stub
	}

	public String nume() {
		String nume = null;
		return nume;
	}

	public String motorizare() {
		String motorizare = null;
		return motorizare;
	}

	public void detaliiVehicul() {
		System.out.println("Nivelul de poluare pentru masina " + getBrand() + " este :" + getNivelPoluare()
				+ " si viteza medie atinsa este de " + getVitezaMedie());
	}

	public String getBrand() {
		return brand;
	}

	public int getNivelPoluare() {
		return nivelPoluare;
	}


	public String getVitezaMedie() {
		return vitezaMedie;
	}

}
