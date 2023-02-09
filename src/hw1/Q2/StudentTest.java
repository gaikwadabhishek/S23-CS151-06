package hw1.Q2;

import java.util.HashMap;

public class StudentTest {
    public static void main(String[] args) {
        // Student 1
        Student student1 = new Student();
        HashMap<String, Double> student1CoursesTaken = new HashMap<>();

        student1CoursesTaken.put("Math", 4.0);
        student1CoursesTaken.put("Sociology", 3.2);
        student1CoursesTaken.put("Computer Science ", 3.6);
        student1CoursesTaken.put("Engineering", 4.0);

        student1.setSID("012345678");
        student1.setName("Banh Mi");
        student1.setYear("Freshman");
        student1.setCoursesTaken(student1CoursesTaken);
        student1.calculateGPA();
        student1.printInfo();

        // Student 2
        Student student2 = new Student();
        HashMap<String, Double> student2CoursesTaken = new HashMap<>();

        student2CoursesTaken.put("Psychology", 2.8);
        student2CoursesTaken.put("Programming", 3.6);
        student2CoursesTaken.put("Business ", 3.2);
        student2CoursesTaken.put("Engineering", 3.0);

        student2.setSID("016639103");
        student2.setName("Pho");
        student2.setYear("Junior");
        student2.setCoursesTaken(student2CoursesTaken);
        student2.calculateGPA();
        student2.printInfo();
    }
}
