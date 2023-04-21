package design_patterns.factory.method;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

	// Each Pizza has a name, a type of dough, a type of sauce, and a set of
	// toppings.
	String name;
	String dough;
	String sauce;
	List<String> toppings = new ArrayList<String>();

	void prepare() {
		// Preparation follows a number of steps in a particular sequence.
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings: ");
		for (String topping : toppings) {
			System.out.println(" " + topping);
		}
	}

	// The abstract class provides some basic defaults for baking, cutting, and
	// boxing.
	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public String getName() {
		return name;
	}
}

class NYStyleCheesePizza extends Pizza {
	// The NY Pizza has its own marinara-style sauce and thin crust.
	public NYStyleCheesePizza() {
		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		toppings.add("Grated Reggiano Cheese"); // And one topping, Reggiano cheese!
	}
}

class ChicagoStyleCheesePizza extends Pizza {
	// The Chicago Pizza uses plum tomatoes as a sauce along with extra-thick crust.
	public ChicagoStyleCheesePizza() {
		name = "Chicago Style Deep Dish Cheese Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
		// The Chicago-style deep dish pizza has lots of mozzarella cheese!
		toppings.add("Shredded Mozzarella Cheese");
	}

	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
