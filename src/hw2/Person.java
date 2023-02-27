package hw2;

public class Person extends Elevator {
	
	private Floor floor;
	
	public Person(Floor floor) {
		this.floor = floor;
	}
	
	public void pressUpButton() {
			floor.upPressed();
	}
	
	public void pressDownButton() {
			floor.downPressed();
	}

	public Floor getFloor() {
		return floor;
	}

	public void setFloor(Floor floor) {
		this.floor = floor;
	}

}
