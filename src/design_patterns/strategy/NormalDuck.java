package design_patterns.strategy;

public class NormalDuck extends Duck {
	public NormalDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	public void display() {
		System.out.println("I'm a real duck");
	}
}
