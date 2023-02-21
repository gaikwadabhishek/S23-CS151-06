 package hw1;
import java.text.SimpleDateFormat;
import java.text.ParseException;


public class SakharavaTest {
    public static void main(String[] args) {
        Student s = new Student();
        String dateString = "04/13/2001";
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");


        s.setName("Maryia Sakharava");
        s.setIntroduction("I am a 4th year Software Engineering Studnet at San Jose State, and I like to watch movies");
        s.setStudentId(3468);
        s.setBranch(Branch.SOFTWARE_ENGINEERING);
        try {
            s.setDob(formatter.parse(dateString));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        s.toString();
        System.out.println(s);

    }
}
