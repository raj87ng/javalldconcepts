package com.rajat.dp.facade.partone;

public class FacadeMain {

	public static void main(String[] args) {
		TravelFacade travel = new TravelFacadeImpl();
			travel.getFlightAndHotelDetails("Rajat");
	
	}
	
	/**
	 * Hotels for Rajat are
        -------------------
       [HotelParis, LocalCafe]
       Flights are-------------------
       [AirIndia, Idigo]
	 */
}
