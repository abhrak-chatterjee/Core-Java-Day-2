package com.capgemini.flight;

public class FlightPojo 
{
	public int flightId, arrivalTime, departureTime;
	public String flightName, source, destination;
	public double flightFare;
	public static int autoFlightIdGen;
	
	{
		flightId = ++autoFlightIdGen;
	}

	public FlightPojo(int arrivalTime, int departureTime, String flightName, String source,
			String destination, double flightFare) 
	{
		super();
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.flightName = flightName;
		this.source = source;
		this.destination = destination;
		this.flightFare = flightFare;
	}

	public int getArrivalTime() 
	{
		return arrivalTime;
	}

	public void setArrivalTime(int arrivalTime) 
	{
		this.arrivalTime = arrivalTime;
	}

	public int getDepartureTime() 
	{
		return departureTime;
	}

	public void setDepartureTime(int departureTime) 
	{
		this.departureTime = departureTime;
	}

	public String getFlightName() 
	{
		return flightName;
	}

	public void setFlightName(String flightName) 
	{
		this.flightName = flightName;
	}

	public String getSource() 
	{
		return source;
	}

	public void setSource(String source) 
	{
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) 
	{
		this.destination = destination;
	}

	public int getFlightId() 
	{
		return flightId;
	}

	public double getFlightFare() 
	{
		return flightFare;
	}

	@Override
	public String toString() {
		return "Flight Details= [flightId=" + flightId + ", arrivalTime=" + arrivalTime + ", departureTime=" + departureTime
				+ ", flightName=" + flightName + ", source=" + source + ", destination=" + destination + ", flightFare="
				+ flightFare + "]\n";
	}
	
	
	
}
