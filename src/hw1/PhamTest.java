package hw1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PhamTest{
    public static void main(String[] args) throws ParseException {
        DateFormat f = new SimpleDateFormat("MM/dd/yyyy");
        Date dob = f.parse("09/27/2000");
        Student s = new Student("Brian Pham","Hello",3369,Branch.SOFTWARE_ENGINEERING,dob);
        System.out.println(s.toString());
    }
}