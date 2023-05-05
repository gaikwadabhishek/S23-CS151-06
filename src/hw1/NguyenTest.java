package hw1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class NguyenTest {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date dob = formatter.parse("27/02/2003");
        String name = "Trique (Dung) Nguyen";
        String introduction = "I do web development";
        int studentId = 9103;
        Branch branch = Branch.SOFTWARE_ENGINEERING;

        Student student = new Student(name, introduction, studentId, branch, dob);
        System.out.println(student.toString());
    }
}
