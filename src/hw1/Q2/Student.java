package hw1.Q2;
import java.util.HashMap;

public class Student {
    private String name;
    private String SID;
	private String year;
	private HashMap<String, Double> coursesTaken;
	private double GPA;	

    public Student() {};

	Student(String SID, String name, String year, HashMap<String, Double> coursesTaken, double GPA) {
		this.SID = SID;
		this.name = name;
		this.year = year;
		this.coursesTaken = coursesTaken;
		calculateGPA();
	}	

	public String getSID() {
		return this.SID;
	}

	public void setSID(String SID) {
		this.SID = SID;
	}

    public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
    }

	public String getYear() {
		return this.year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public HashMap<String,Double> getCoursesTaken() {
		return this.coursesTaken;
	}

	public void setCoursesTaken(HashMap<String,Double> coursesTaken) {
		this.coursesTaken = coursesTaken;
	}

	public void calculateGPA() {
		HashMap<String, Double> coursesTaken = this.coursesTaken;
		float sum = 0;
		int numOfCourses = coursesTaken.size();
		
		for (HashMap.Entry<String, Double> course : coursesTaken.entrySet()) {
			sum += course.getValue();
		}

		float GPA = sum / (float) numOfCourses;
		
		this.GPA = GPA;
	}

	public double getGPA() {
		return this.GPA;
	}
	
	public void printInfo() {
		System.out.println("Student " + name + "[SID=" + SID + ", year=" + year + ", coursesTaken=" + coursesTaken + ", GPA=" + GPA + "]");
	}
}
