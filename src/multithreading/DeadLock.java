package multithreading;

public class DeadLock {
	public static void main(String[] args) throws InterruptedException {

		Thread mainThread = Thread.currentThread();
		System.out.println("Current Thread Name: " + mainThread.getName());
		
		mainThread.join(5000);
		
		System.out.println("this will not print");
	}
}
