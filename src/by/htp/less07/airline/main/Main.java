package by.htp.less07.airline.main;
////Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
public class Main {

	public static void main(String[] args) {
		
		
		Airport airport = new Airport ();
		Airport airport1 = new Airport ();
		AirportView view = new AirportView ();
		
		//view.viewSchedule(airline1);
		
		airport.add(new Airline("Прага", 8567, "Боинг-747", 12.55 , "среда"));
		airport.add(new Airline("Будапешт", 4975, "Боинг-777", 10.33 , "вторник"));
		airport.add(new Airline("Киев", 3589, "Ту-134", 14.15 , "суббота"));
		airport.add(new Airline("Вильнюс", 2486, "Ил-86", 04.27 , "четверг"));
		airport.add(new Airline("Париж", 7626, "Боинг-747", 19.12 , "вторник"));
		
		//view.viewScheduleAirport(airport);
		
		FlightSearch find = new FlightSearch ();
		
		view.viewScheduleAirport(airport);
		
		//airport1 = find.sortByDestination(airport, "Будапешт");
		//view.viewScheduleAirport(airport1);
		
		//System.out.println (airport.size());
		//airport1 = find.sortByDayOfWeek(airport, "вторник", 14.00);
		//view.viewScheduleAirport(airport1);

	}

}
