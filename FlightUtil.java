package com.myapp.util;

import java.util.Random;

public class FlightUtil {

	public static String getRandomID()
	{
		Random random = new Random();
		
		String flightid =  random.toString();
		return flightid;
	}
}