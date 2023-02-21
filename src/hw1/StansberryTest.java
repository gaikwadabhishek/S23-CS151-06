import java.util.Calendar;
import java.util.Date;

public class StansberryTest {
    public static void main(String[] args) {
        Date date = new Date(2000, 6,21);
        Student steven = new Student("Steven", "Hi, my name is Steven",01234,
                Branch.SOFTWARE_ENGINEERING, date);
        System.out.println(steven);



    }
}