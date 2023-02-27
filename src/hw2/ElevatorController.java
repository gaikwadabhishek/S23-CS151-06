package hw2;

import java.util.Stack;
import java.util.TreeSet;

public class ElevatorController extends Elevator {
	
	private static TreeSet<Floor> destinationFloors = new TreeSet<>();
	
	public static TreeSet<Floor> getDestinationFloors() {
		return destinationFloors;
	}
	
	public static void callElevator(State direction, Floor floor) {
		if(direction == State.goingUp) {
			
		}
		else if(direction == State.goingDown) {
			
		}
	}
}
