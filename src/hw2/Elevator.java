package hw2;

import java.util.ArrayList;
import java.util.Stack;

public class Elevator {
	
	private int currentFloor;
	ArrayList<Person> people;
	private State state;
	private Stack<Integer> up;
	private Stack<Integer> down;
	
	public Elevator() {
		people = new ArrayList<Person>();
		currentFloor = 0;
		state = State.notMoving;
		up = new Stack<Integer>();
		down = new Stack<Integer>();
	}
	
	public void enterElevator(Person person) {	
		getPeople().add(person);
	}
	
	public void exitElevator(Person person) {
		getPeople().remove(person);
	}

	public int getCurrentFloor() {
		return currentFloor;
	}

	public void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}
	
	public ArrayList<Person> getPeople() {
		return this.people;
	}
	
	public void setPeople(ArrayList<Person> people) {
		this.people = people;
	}
	
	public State getState() {
		return this.state;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public Stack<Integer> getUp() {
		return this.up;
	}
	
	public Stack<Integer> getDown() {
		return this.down;
	}
}
