package hw1;

import java.util.Date;

public class Kim {

   public static void main(String[] args) {

      String intro = "Hello, I am Reece.";
      Date dob = new Date("09/15/2002");

      Student kim = new Student("Reece Kim", intro, 7964,
              Branch.COMPUTER_SCIENCE, dob);

      System.out.println(kim.toString());
   }


}
