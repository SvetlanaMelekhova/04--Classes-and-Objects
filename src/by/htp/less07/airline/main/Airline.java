package by.htp.less07.airline.main;
//Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
public class Airline {
	
	private String destination;
	private int numbOfFlight;
	private String typeOfPlane;
	private double departureTime;
	private String dayOfWeek;
	
	public Airline () {
		
	}
	
	public Airline (String destination, int numbOfFlight, String typeOfPlane, double departureTime, String dayOfWeek) {
		this.destination = destination;
		this.numbOfFlight = numbOfFlight;
		this.typeOfPlane = typeOfPlane;
		this.departureTime = departureTime;
		this.dayOfWeek = dayOfWeek;
	}
	
	public void setDestination (String destination) {
		this.destination = destination;
	}
	
	public String getDestination () {
		return destination;
	}
	
	public void setNumbOfFlight (int numbOfFlight) {
		this.numbOfFlight = numbOfFlight;
	}
	
	public int getNumbOfFlight () {
		return numbOfFlight;
	}
	
	public void setTypeOfPlane (String typeOfPlane) {
		this.typeOfPlane = typeOfPlane;
	}
	
	public String getTypeOfPlane () {
		return typeOfPlane;
	}
	
	public void setDepartureTime (double departureTime) {
		this.departureTime = departureTime;
 	}
	
	public double getDepartureTime () {
		return departureTime;
	}
	
	public void setDayOfWeek (String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

    public String getDayOfWeek () {
    	return dayOfWeek;
    }

		@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dayOfWeek == null) ? 0 : dayOfWeek.hashCode());
		long temp;
		temp = Double.doubleToLongBits(departureTime);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + numbOfFlight;
		result = prime * result + ((typeOfPlane == null) ? 0 : typeOfPlane.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airline other = (Airline) obj;
		if (dayOfWeek == null) {
			if (other.dayOfWeek != null)
				return false;
		} else if (!dayOfWeek.equals(other.dayOfWeek))
			return false;
		if (Double.doubleToLongBits(departureTime) != Double.doubleToLongBits(other.departureTime))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (numbOfFlight != other.numbOfFlight)
			return false;
		if (typeOfPlane == null) {
			if (other.typeOfPlane != null)
				return false;
		} else if (!typeOfPlane.equals(other.typeOfPlane))
			return false;
		return true;
	}
    
	@Override
	public String toString() {
		return destination + " " + numbOfFlight + " " + typeOfPlane	+ " " + departureTime + " " + dayOfWeek;
	}


    
}
