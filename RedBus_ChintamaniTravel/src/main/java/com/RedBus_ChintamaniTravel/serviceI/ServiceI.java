package com.RedBus_ChintamaniTravel.serviceI;

import java.util.List;

import com.RedBus_ChintamaniTravel.model.Travel;
import com.RedBus_ChintamaniTravel.model.PassengerDetails;

public interface ServiceI {

	void addTravel(Travel ct);

	void passengerBooking(PassengerDetails pd);

	List<Travel> getChintamaniTravelData();

	List<Travel> getByDate(String date);

	List<Travel> getByDateTime_Toloc_Fromloc(String date, String time, String toloc, String fromloc);

}

