package com.RedBus_ShivshahiTravel.serviceI;

import java.util.List;

import com.RedBus_ShivshahiTravel.model.PassengerDetails;
import com.RedBus_ShivshahiTravel.model.Travel;

public interface ServiceI {

	void addTravel(Travel shivt);

	void passengerBooking(PassengerDetails pd);

	List<Travel> getShivshahiTravelData();

	List<Travel> getByDate(String date);

	List<Travel> getByDateTime_Toloc_Fromloc(String date, String time, String toloc, String fromloc);

}
