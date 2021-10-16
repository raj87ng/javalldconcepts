package com.rajat.dp.facade.partone;

public class TravelFacadeImpl implements TravelFacade {

	private HotelBook hotelBook = new HotelBook();
	private FlightBook flightBook = new FlightBook();
	
	@Override
	public void getFlightAndHotelDetails(String name) {
		System.out.println("Hotels for "+name +" are");
		System.out.println("-------------------");
		System.out.println(hotelBook.getHotels());
		System.out.println("Flights are-------------------");
		System.out.println(flightBook.getFlights());

	}

}
