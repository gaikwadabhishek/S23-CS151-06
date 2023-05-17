package multithreading;

//class MyThread extends Thread {
//	public void run() {
//		System.out.println("run method");
//	}
//}
//
public class ThreadDemo {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		Thread t1 = new Thread(t);
		t1.start();
	}
}
