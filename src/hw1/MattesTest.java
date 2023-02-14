package hw1;

import java.util.Calendar;
import java.util.Date;

public class MattesTest {
    public static void main(String[] args) {
        Date dob = new Date(1998, Calendar.DECEMBER, 1);
        Student dean = new Student("Dean Mattes", "Hello everybody!", 14445509, Branch.OTHER, dob);
        System.out.println(dean.toString());
    }
}
