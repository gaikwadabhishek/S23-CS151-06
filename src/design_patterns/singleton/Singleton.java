package design_patterns.singleton;

public class Singleton {
	
	/*
	 * We have a static variable to hold our one instance of the class Singleton.
	 */
	private static Singleton uniqueInstance; 

	// other useful instance variables here
	private Singleton() {
		/*
		 * Our constructor is declared private; only Singleton can instantiate this
		 * class!
		 */
	}

	public static Singleton getInstance() {
		/*
		 * The getInstance() method gives us a way to instantiate the class and also to
		 * return an instance of it.
		 */
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
	// other useful methods here
}
