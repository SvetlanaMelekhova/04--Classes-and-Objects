package by.htp.less07.airline.main;

import java.util.ArrayList;
import java.util.List;

import by.htp.less07.book.main.Book;

public class Airport {
	
	private List <Airline> airline;
	
	public Airport () {
		airline = new ArrayList <Airline> ();
	}
	
	public List<Airline> getAirline() {
		
		 return airline;	
	}
	 
	public Airline getAirline(int index) {
		if(index >= airline.size()) {
			return null;
		}
		
		return airline.get(index);
	}
	
	public void add (Airline airline) {
		this.airline.add(airline);
	}
	
	public int size () {
		return airline.size();
	}

	public void remove(int i) {
		airline.remove(i);

	}
	
	public void remove (Airline airline) {
		this.airline.remove(airline);
	}

	public void add(int i, Airline airline) {
		this.airline.add(i, airline);
		
	}
	

}
