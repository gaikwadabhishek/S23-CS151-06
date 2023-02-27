package hw2;

public class OutsideButton implements Button {
		
	private State direction;
	private Floor floor;
	
	public State getDirection() {
		return this.direction;
	}

	public void setDirection(State direction) {
		this.direction = direction;
	}

	public Floor getFloor() {
		return this.floor;
	}
	
	public void setFloor(Floor floor) {
		this.floor = floor;
	}
	
	@Override
	public void wasPressed() {
		ElevatorController.callElevator(direction, floor);
	}

}
