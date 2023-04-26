package design_patterns.strategy;

public interface FlyBehavior {
	public void fly();
}

class FlyNoWay implements FlyBehavior {
	public void fly() {
		System.out.println("I can't fly");
	}
}

class FlyWithWings implements FlyBehavior {
	public void fly() {
		System.out.println("I'm flying!!");
	}
}
