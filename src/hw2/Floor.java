package hw2;

public class Floor {
	
	private int number;
	private OutsideButton up;
	private OutsideButton down;
	
	public Floor(int number) {
		this.number = number;
		this.up = new OutsideButton();
		this.down = new OutsideButton();
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public Button getUp() {
		return this.up;
	}
	
	public void setUp(OutsideButton up) {
		this.up = up;
	}
	
	public Button getDown() {
		return this.down;
	}
	
	public void setDown(OutsideButton down) {
		this.down = down;
	}
	
	public void upPressed() {
		ElevatorController.callElevator(State.goingUp, this);
	}
	
	public void downPressed() {
		ElevatorController.callElevator(State.goingDown, this);
	}
}
