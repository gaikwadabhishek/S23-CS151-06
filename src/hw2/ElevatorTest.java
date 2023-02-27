package hw2;

public class ElevatorTest {
	
	public static void main(String[] args) {
		
		System.out.println("hello");
		Building engrBuilding = new Building(4);
		Person bob = new Person(engrBuilding.getFloors().get(0)); // starting 1st floor, wants to go 2th
		Person jim = new Person(engrBuilding.getFloors().get(0)); // starting 1st floor, wants to go 4th
		Person john = new Person(engrBuilding.getFloors().get(2)); // starting 3rd floor, wants to go 1st
		Person jack = new Person(engrBuilding.getFloors().get(1)); // starting 2nd floor, wants to go 3rd
		bob.pressUpButton();
		jim.pressUpButton();
		john.pressDownButton();
		jack.pressUpButton();
		
		engrBuilding.getElevator();
		
		
	}
}
