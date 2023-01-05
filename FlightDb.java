package com.myapp.db;

import java.util.ArrayList;
import java.util.List;

import com.myapp.entity.Flight;
import com.myapp.util.FlightUtil;

/* Replace class with actual DB*/

public class FlightDb {

	
	List<Flight> allFlights = new ArrayList<>();
	
	
	public List<Flight> getAllFlight()
	{
		return allFlights;
	
	}
	
	public Flight saveFlightInDB(Flight flight)
	{
		if(flight != null)
		{
			flight.setFlightId(FlightUtil.getRandomID());
			boolean status =  allFlights.add(flight);
			if(status) return flight;
			else return null;
			
		}
		else
		{
			return null;
		}
		
	}
	
}