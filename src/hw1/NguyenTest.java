package hw1;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


enum Branch {
   COMPUTER_SCIENCE, SOFTWARE_ENGINEERING, OTHER
}


public class NguyenTest {
  
   public static Date dateGen(String date){
       String pattern = "MM/dd/yy";
       SimpleDateFormat format = new SimpleDateFormat(pattern);
       Date d = new Date();
       try{
           d = format.parse(date);
       } catch(ParseException e){e.printStackTrace();}
      
       return d;
   }
   public static void main(String[] args) {
      
       Student Lac = new Student("Lac-Phong Nguyen", "Hey there!", 015625155, Branch.SOFTWARE_ENGINEERING, dateGen("10/12/2003"));
       System.out.println(Lac);
   }
}



