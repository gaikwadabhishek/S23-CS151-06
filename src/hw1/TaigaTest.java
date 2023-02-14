package hw1; 

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TaigaTest {
	private final String name;
	private final String studentId;
	private final String branch; 
	private final int year; 
	
	public TaigaTest(String name, String studentId, String branch, int year) {
		this.name = name;
		this.studentId = studentId;
		this.branch = branch; 
		this.year = year; 
		
		System.out.printf("Name Registered: " + name + ", " + studentId + ", " + branch, "+ ", year);
	}
	
	public TaigaTest(String name, String studentId, String branch) {
		this.name = "";
		this.studentId = "";
		this.branch = "";
		this.year = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public String getstudentId() {
		return studentId;
	}
	
	public String getBranch() {
		return branch;
	}
	
	public int getYear() {
		return year;
	}
	
	public static void main(String[] args) {
		TaigaTest studentOne = new TaigaTest("Rio", "014163604", "Computer Science", 3);
	}
}
