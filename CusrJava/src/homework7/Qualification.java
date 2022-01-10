package homework7;

public class Qualification extends Teacher {

	public Qualification(String course, int experienceYears, String schedule) {
		super (course, experienceYears, schedule);
	}

	public void verify() {
		if (getCourse().equals("Java") && getSchedule().equals("Afternoon")
				&& getExperienceYears() == 3) {
			System.out.println("You qualify to teach at this school!");
		} else {
			System.out.println("You do not qualify!");
		}
	}

	public static void main(String[] args) {
		Qualification obj = new Qualification("Java", 3, "Afternoon");
		obj.verify();

	}

}
