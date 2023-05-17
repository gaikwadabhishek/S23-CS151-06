package multithreading;
import java.util.Arrays;
import java.util.List;

class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("child thread " + this.getId() + " " + i);
			
		}
	}
}

public class ExercisePriority {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("main thread");
		}
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		list.removeIf(x -> x < 3);
	}
}
