package hw1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class NguyenTest {
    public static void main(String[] args) throws ParseException {
        Student student = new Student();

        student.setName("Trique (Dung) Nguyen");
        student.setIntroduction("I do web development");
        student.setStudentId(9103);
        student.setBranch(Branch.SOFTWARE_ENGINEERING);
        student.setDob("27-Feb-2003");
        System.out.println(student.toString());
    }
}
