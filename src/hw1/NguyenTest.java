package hw1;

public class NguyenTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Trique (Dung) Nguyen");
        student.setIntroduction("I do web development");
        student.setStudentId(9103);
        student.setBranch(Branch.SOFTWARE_ENGINEERING);
        student.setDob(null);
        System.out.println(student.toString());
    }
}
