package hw1;

import java.util.Date;

public class LeTest {
    public static void main(String[] args) {
        Student me = new Student();
        me.setName("Dylan Le");
        me.setIntroduction("I am a 3rd year Computer Science Major");
        me.setStudentId(16563118);
        me.setDob(new Date(2002,07,27,01,01,01));
        me.setBranch(Branch.COMPUTER_SCIENCE);
        System.out.println(me.toString());
    }
}
