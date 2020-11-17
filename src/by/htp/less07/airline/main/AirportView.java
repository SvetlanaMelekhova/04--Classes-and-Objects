package by.htp.less07.airline.main;

import java.util.ArrayList;
import java.util.List;

public class AirportView {
	
	public AirportView () {
		
	}
	
	public void viewSchedule (Airline airline) {
		
		System.out.println("Информация о вылете: " + airline.toString());
	}
	
	public void viewScheduleAirport (Airport airport) {
		List <Airline> schedule;
		schedule = airport.getAirline();
		
		for (Airline airline : schedule) {
			System.out.println(airline.toString());
		}
		
		
	}

}
