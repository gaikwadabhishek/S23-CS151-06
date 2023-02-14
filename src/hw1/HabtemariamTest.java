package hw1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

public class HabtemariamTest {
    public static void main(String[] args) throws ParseException {
        //Student s1 = new Student();
       
        // System.out.println(s1.getName());
        // System.out.println(s1.getIntroduction());
        // System.out.println(s1.getStudentId());
        // System.out.println(s1.getBranch());
        // System.out.println(s1.getDob());
        String date = "31-05-2011";
        Date year;

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
    try {
        year = format.parse (date);
        
    } 
    catch(ParseException e){
        System.out.println("date error"+date.toString());
    }
        //Date year;
        year = format.parse (date);

        Student Yohannes = new Student("Yohannes", " Selam peace to you all", 2343, Branch.SOFTWARE_ENGINEERING, year);
        System.out.println(Yohannes.toString());
    
    }
}