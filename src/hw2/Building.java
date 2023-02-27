package hw2;
import java.util.ArrayList;

public class Building {

	ArrayList<Floor> floors;
	Elevator elevator;
	
	public Building(int num) {
		for(int i = 0; i < num; i++) {
			floors.add(new Floor(i));
		}
		elevator = new Elevator();
	}
	
	public ArrayList<Floor> getFloors() {
		return this.floors;
	}
	
	public void setFloors(ArrayList<Floor> floors) {
		this.floors = floors;
	}
	
	public Elevator getElevator() {
		return this.elevator;
	}
	
	public void setElevator(Elevator elevator) {
		this.elevator = elevator;
	}
	
}
