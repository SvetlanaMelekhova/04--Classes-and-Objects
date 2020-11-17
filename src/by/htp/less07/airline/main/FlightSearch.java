package by.htp.less07.airline.main;
/*Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.*/
import java.util.List;
import java.util.ArrayList;

public class FlightSearch {
	
	private Airport airport = new Airport ();
	
	public FlightSearch () {
		
	}
	
	public Airport sortByDestination (Airport airport , String destination) {
		List <Airline> allFlights;
		allFlights = airport.getAirline();
		String city = destination;
		
		for (Airline airline : allFlights) {
			String temp = airline.getDestination();
			if (city.compareTo(temp) == 0 ) {
				this.airport.add(airline);
			}
		}
		return this.airport;
	}
	
	public Airport sortByDayOfWeek (Airport airport , String dayOfWeek) {
		List <Airline> allFlights;
		allFlights = airport.getAirline();
		String day = dayOfWeek;
		
		for (Airline airline : allFlights) {
			String temp = airline.getDayOfWeek();
			if (day.compareTo(temp) == 0 ) {
				this.airport.add(airline);
			}
		}
		return this.airport;
	}
	
	public Airport sortByDayOfWeek (Airport airport , String dayOfWeek , double departureTime) {
		List <Airline> allFlights;
		allFlights = airport.getAirline();
		String day = dayOfWeek;
		double time = departureTime;
		
		for (Airline airline : allFlights) {
			String tempWeek = airline.getDayOfWeek();
			double tempTime = airline.getDepartureTime();
			if (day.compareTo(tempWeek) == 0 && tempTime > time ) {
				this.airport.add(airline);
			}
		}
		return this.airport;
	}
	
	
	

}
