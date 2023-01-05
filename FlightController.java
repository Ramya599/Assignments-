package com.myapp.controller;

import java.util.List;

import com.myapp.db.FlightDb;
import com.myapp.entity.Flight;

//import com.myapp.entity.Flight;


/* Server code */
public class FlightController{
	
	FlightDb db1 ;
	
	public FlightController() {
		db1 = new FlightDb();
	}
	
	public List<Flight> getAllFlights()
	{
		return db1.getAllFlight();
	}
	
	public Flight insertFlight(Flight userInputflight)
	{
		// validate property values
		// security 
		Flight savedFlight = db1.saveFlightInDB(userInputflight);
		return savedFlight;
		
	}

	
	
	
	
}//end of class
