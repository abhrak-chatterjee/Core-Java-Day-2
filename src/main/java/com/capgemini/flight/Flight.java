package com.capgemini.flight;

import java.util.ArrayList;
import java.util.Collections;

public class Flight 
{
	ArrayList<FlightPojo> flightList = new ArrayList<FlightPojo> ();
	
	public ArrayList<FlightPojo> displayFlight()
	{
		return flightList;
	}
	
	public void addFlight(FlightPojo flight)
	{
		flightList.add(flight);
	}
	
	public ArrayList<FlightPojo> removeFlightById(int flightId)
	{
		for(FlightPojo flight : flightList)
		{
			if(flight.getFlightId()==flightId)
			{
				flightList.remove(flight);
				return flightList;
			}
		}
		throw new RuntimeException("Account does not exist");
	}
	
	public ArrayList<FlightPojo> updateFlightNameById(int flightId, String flightName) 
	{
		for(FlightPojo flight : flightList)
		{
			if(flight.getFlightId()==flightId)
			{
				flight.setFlightName(flightName);
				return flightList;
			}
		}
		throw new RuntimeException("Flight ID supplied does not exist");
	}
	
	public ArrayList<FlightPojo> updateArrivalTimeById(int flightId, int arrivalTime) 
	{
		for(FlightPojo flight : flightList)
		{
			if(flight.getFlightId()==flightId)
			{
				flight.setArrivalTime(arrivalTime);
				return flightList;
			}
		}
		throw new RuntimeException("Flight ID supplied does not exist");
	}
	
	public ArrayList<FlightPojo> updateDepartureTimeById(int flightId, int departureTime) 
	{
		for(FlightPojo flight : flightList)
		{
			if(flight.getFlightId()==flightId)
			{
				flight.setDepartureTime(departureTime);
				return flightList;
			}
		}
		throw new RuntimeException("Flight ID supplied does not exist");
	}
	
	public ArrayList<FlightPojo> updateSourceById(int flightId, String source) 
	{
		for(FlightPojo flight : flightList)
		{
			if(flight.getFlightId()==flightId)
			{
				flight.setSource(source);
				return flightList;
			}
		}
		throw new RuntimeException("Flight ID supplied does not exist");
	}
	
	public ArrayList<FlightPojo> updateDestinationById(int flightId, String destination) 
	{
		for(FlightPojo flight : flightList)
		{
			if(flight.getFlightId()==flightId)
			{
				flight.setDestination(destination);
				return flightList;
			}
		}
		throw new RuntimeException("Flight ID supplied does not exist");
	}
	
	public ArrayList<FlightPojo> sortByDuration()
	{
		Collections.sort(flightList,(FlightPojo fp1,FlightPojo fp2)->(fp1.getDepartureTime() - fp1.getArrivalTime())-(fp2.getDepartureTime() - fp2.getArrivalTime()));
		return flightList;
	}
	
	public static void main(String[] args) 
	{
		Flight flight = new Flight();
		flight.addFlight(new FlightPojo(1230, 1000, "IndiGo", "BLR", "CCU", 5549.63));
		flight.addFlight(new FlightPojo(1630, 1545, "AirIndia", "CCU", "IXB", 7459.89));
		flight.addFlight(new FlightPojo(1030, 800, "AirIndia", "BLR", "CCU", 5638.63));
		flight.addFlight(new FlightPojo(1230, 1000, "SpiceJet", "BLR", "CCU", 5449.63));
		flight.addFlight(new FlightPojo(2330, 2100, "GoAir", "HYD", "CCU", 5684.42));
		System.out.println(flight.displayFlight().toString());
		System.out.println(flight.removeFlightById(3).toString());
		System.out.println(flight.updateFlightNameById(4,"Vistara").toString());
		System.out.println(flight.updateArrivalTimeById(1,1235).toString());
		System.out.println(flight.updateDepartureTimeById(1,1005).toString());
		System.out.println(flight.updateSourceById(2,"IXB").toString());
		System.out.println(flight.updateDestinationById(5,"BLR").toString());
	}

}
