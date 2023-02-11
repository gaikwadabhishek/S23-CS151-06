package hw1;

public class HabtemariamTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("John");
        s1.setIntroduction("Selam");
        s1.setStudentId(2343);
        s1.setBranch(Branch.SOFTWARE_ENGINEERING);
        s1.setDob(1991);
        System.out.println(s1.getName());
        System.out.println(s1.getIntroduction());
        System.out.println(s1.getStudentId());
        System.out.println(s1.getBranch());
        System.out.println(s1.getDob());

    
    }
}