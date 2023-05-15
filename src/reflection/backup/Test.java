package reflection.backup;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Student  abhishek = new Student(1, "B", "Abhishek");
		System.out.println(abhishek.getGrade());
//	
//		for ( Method method : Student.class.getDeclaredMethods()) {
//			if (method.getName().equals("setGrade")) {
//				System.out.println("method found");
//				method.setAccessible(true);
//				method.invoke(abhishek, "A");
//			}
//		}
//		System.out.println(abhishek.getGrade());
//		
		for (Field field : Student.class.getFields()) {
			if (field.getName().equals("grade")) {
				field.setAccessible(true);
				field.set("A+", abhishek);
//				field.set(abhishek, "A+");
			}
		}
		System.out.println(abhishek.getGrade());

	}
}
