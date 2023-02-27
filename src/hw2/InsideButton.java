package hw2;

public class InsideButton implements Button {
	
	private Floor floor;
	
	public InsideButton(Floor floor) {
		this.floor = floor;
	}

	public Floor getFloor() {
		return this.floor;
	}

	public void setFloor(Floor floor) {
		this.floor = floor;
	}

	@Override
	public void wasPressed() {
	}

}
