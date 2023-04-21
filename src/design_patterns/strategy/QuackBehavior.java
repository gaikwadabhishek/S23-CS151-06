package design_patterns.strategy;

public interface QuackBehavior {
	public void quack();
}

class Squeak implements QuackBehavior {
	public void quack() {
		System.out.println("Squeak");
	}
}

class Quack implements QuackBehavior {
	public void quack() {
		System.out.println("Quack");
	}
}

class MuteQuack implements QuackBehavior {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}