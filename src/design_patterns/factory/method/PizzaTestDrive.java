package design_patterns.factory.method;

public class PizzaTestDrive {
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ordered first: " + pizza.getName() + "\n");
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Ordered second: " + pizza.getName() + "\n");
	}
	
}
