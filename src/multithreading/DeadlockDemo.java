package multithreading;

public class DeadlockDemo {
	public static void main(String[] args) throws InterruptedException {
		Thread t = Thread.currentThread();

		System.out.println("Name: " + t.getName());
		System.out.println("Priority: " + t.getPriority());

		t.setPriority(Thread.MAX_PRIORITY);

		t.setName("MAIN");
		System.out.println("New Name: " + t.getName());
		System.out.println("New Priority: " + t.getPriority());

		// deadlock
		t.join();
		System.out.println("this will not print");

	}
}
