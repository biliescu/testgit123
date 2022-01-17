package homework8;

public class Vehicul {

	private String brand;
	private int nivelPoluare;
	private String vitezaMedie;

	public Vehicul(String brand, int nivelPoluare, String vitezaMedie) {
		this.setBrand(brand);
		this.setNivelPoluare(nivelPoluare);
		this.setVitezaMedie(vitezaMedie);
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

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getNivelPoluare() {
		return nivelPoluare;
	}

	public void setNivelPoluare(int nivelPoluare) {
		this.nivelPoluare = nivelPoluare;
	}

	public String getVitezaMedie() {
		return vitezaMedie;
	}

	public void setVitezaMedie(String vitezaMedie) {
		this.vitezaMedie = vitezaMedie;
	}

}
