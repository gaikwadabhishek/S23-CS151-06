package reflection.backup;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DriverTest {
	public static void main(String[] args)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Student student = new Student(0, "B", "Abhishek");

//		methods
		Method[] methods = student.getClass().getDeclaredMethods();
		
		System.out.println(student.getGrade());
		for (Method method : methods) {
			if (method.getName().equals("setGrade")) {
				method.setAccessible(true);
				method.invoke(student, "A+");
			}
		}
		System.out.println(student.getGrade());

//		attributes
//		Field[] fields = student.getClass().getDeclaredFields();
//		System.out.println(student.getGrade());
//		for (Field field : fields) {
//			if (field.getName().equals("grade")) {
//				field.setAccessible(true);
//				field.set(student, "A+");
//			}
//		}
//		System.out.println(student.getGrade());
		
	}
}
