package hw1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class SharmaTest {
    public static void main(String[] args) {
        Date dateOfBirth = new Date("12/07/2000");
        Student me = new Student("Karan Sharma", "Hi", 3944, Branch.SOFTWARE_ENGINEERING, dateOfBirth);
        System.out.println(me.toString());
    }
}
