package homework7;

public class Teacher {

	private String course;
	private int experienceYears;
	private String schedule;

	public Teacher(String course, int experienceYears, String schedule) {
		this.course = course;
		this.experienceYears = experienceYears;
		this.schedule = schedule;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getExperienceYears() {
		return experienceYears;
	}

	public void setExperienceYears(int experienceYears) {
		this.experienceYears = experienceYears;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

}
