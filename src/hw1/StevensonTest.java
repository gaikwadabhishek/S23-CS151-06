package hw1; 
import java.util.Date;

public class StevensonTest {
    public static void main(String[] args) {
        // reference for how to use Date class: https://www.geeksforgeeks.org/date-class-java-examples/
        Student lucas = new Student("Lucas Stevenson", "Hi, I'm Lucas", 5249, Branch.COMPUTER_SCIENCE, new Date("09/18/2003"));
        System.out.println(lucas);
    }
}
