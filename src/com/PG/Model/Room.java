package com.PG.Model;

public class Room {
	
	private int r_no;
	private int capacity;
	private int occupied_count ;
	
	@Override
	public String toString() {
	    return "Room{" +
	            "r_no=" + r_no +
	            ", capacity=" + capacity +
	            ", occupied_count=" + occupied_count +
	            '}';
	}

	// isSpecified methods
	public boolean isSpecifiedR_no() { 
	    return r_no > 0; 
	}

	public boolean isSpecifiedCapacity() { 
	    return capacity > 0; 
	}

	public boolean isSpecifiedOccupied_count() { 
	    return occupied_count >= 0; // Assuming occupied_count can be 0 or more
	}
	
	public int getR_no() {
		return r_no;
	}
	public void setR_no(int r_no) {
		this.r_no = r_no;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getOccupied_count() {
		return occupied_count;
	}
	public void setOccupied_count(int occupied_count) {
		this.occupied_count = occupied_count;
	}
	public Room(int r_no, int capacity, int occupied_count) {
		super();
		this.r_no = r_no;
		this.capacity = capacity;
		this.occupied_count = occupied_count;
	}
	
	
}
