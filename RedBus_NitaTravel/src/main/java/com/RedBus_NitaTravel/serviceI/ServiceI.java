package com.RedBus_NitaTravel.serviceI;

import java.util.List;

import com.RedBus_NitaTravel.model.Travel;
import com.RedBus_NitaTravel.model.PassengerDetails;

public interface ServiceI {

	void addTravel(Travel nt);

	void passengerBooking(PassengerDetails pd);

	List<Travel> getNitaTravelData();

	List<Travel> getByDate(String date);

	List<Travel> getByDateTime_Toloc_Fromloc(String date, String time, String toloc, String fromloc);

}

