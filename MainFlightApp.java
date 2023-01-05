package com.myapp.main;

import java.util.List;
import java.util.Scanner;

import com.myapp.controller.FlightController;

import com.myapp.entity.Flight;


/* USER Code */
public class MainFlightApp {

	Scanner sc = new Scanner(System.in);
	FlightController server = new FlightController();
	
	public static void main(String[] args) {
		
		MainFlightApp app = new MainFlightApp();
		
		while(true)
		{
			System.out.println("\n\n-------- App MENU ---------");
			System.out.println("1.Insert Flights In Database.");
			System.out.println("2.Display All Flights");
			System.out.println("3.Search Flights by CarrierName.");
			System.out.println("4.All Flights between source and destination");
			System.out.println("0. EXIT ");
			
			System.out.println(" --- Enter Choice :- ");
			int choice = Integer.parseInt(app.sc.nextLine());
			
			switch (choice) {
				case 1:
					app.takeUserInputForFlight();
					break;
				
				case 2:
					app.displayAllFlights();
					break;
					
					
				//case 3:
				//	app.getFlightsByCarrierName();
				//	break;
				
				
				
				
				case 0:
					System.exit(0);
					break;
				

	
				default:
					break;
			}//end of switch
			
		}//end of while
		
		
	}//end main
	
	
	public void displayAllFlights() {
		List<Flight> allFlights = server.getAllFlights();
		
		System.out.println("\n\n ----All Saved Flights---");
		
		for (Flight flight : allFlights) {
			displayFlights(flight, "");
		}
		
	}


	public void takeUserInputForFlight()
	{
		try {
			System.out.println("\n\t Enter Flight Details \n");
			System.out.println("\n Enter Flight Carrier Name ");
			String carrierName = sc.nextLine();
			
			System.out.println("\n Enter Flight source Airport Name ");
			String sourceAirportName = sc.nextLine();
			

			System.out.println("\n Enter Flight Destination Airport Name ");
			String destinationAirportName = sc.nextLine();
			
			System.out.println("\n Enter Flight Take off time ");
			float takeOffTime = Float.parseFloat(sc.nextLine());
			
			System.out.println("\n Enter Flight landing time ");
			float landingTime = Float.parseFloat(sc.nextLine());
			
			System.out.println("\n Enter date ");
			String date = sc.nextLine();
			
			System.out.println("\n Enter Flight Cost ");
			int cost = Integer.parseInt(sc.nextLine());
			
			
			System.out.println("\n Enter Flight duration ");
			float flightDuration= Float.parseFloat(sc.nextLine());
			
			
			
			Flight userInputFlight = new Flight("0", carrierName, sourceAirportName, destinationAirportName, takeOffTime,landingTime,date,cost,flightDuration);
			// Now click the submit button
			Flight serverSavedFlight = server.insertFlight(userInputFlight);
			
			if(serverSavedFlight != null)
				displayFlights(serverSavedFlight,"Flight Inserted !!!");
			else
				displayErrors("Flight Not Saved , Try again or check Authority ");
			
		}
		catch (Exception e) {
			displayErrors(" Wrong Input , Enter Again");
			takeUserInputForFlight();
		}
	
	}
	
	public void displayErrors(String errorMsg)
	{
		System.out.println("_______ !!! Error !!! _________________________");
		System.out.println(errorMsg);
	}
	
	
	
	public void displayFlights(Flight f,String tagline)
	{
		System.out.println(tagline);
		System.out.println(f.getFlightId()+" - "+f.getCarrierName()+" - "+f.getSourceAirport()+" - "+f.getDestinationAirport()+" - "+f.getTakeoffTime()+" - "+f.getLandingTime()+" - "+f.getDate()+" -"+f.getDate()+"-"+f.getCost()+f.getFlightDuration());
	}
	
}//end main class

