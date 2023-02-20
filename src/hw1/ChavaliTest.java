package hw1;

import java.util.Date;


public class ChavaliTest{

  public static void main(String[] args)
  {
	  Date dob = new Date(1046908800000L);
    Student anusri = new Student("Anusri", "I am a computer science student", 6855, Branch.COMPUTER_SCIENCE, dob);
    System.out.println(anusri.toString());
    
  }
  
}
