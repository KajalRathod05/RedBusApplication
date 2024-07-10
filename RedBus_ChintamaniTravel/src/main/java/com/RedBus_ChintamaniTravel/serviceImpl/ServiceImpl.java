package com.RedBus_ChintamaniTravel.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RedBus_ChintamaniTravel.model.Travel;
import com.RedBus_ChintamaniTravel.model.PassengerDetails;
import com.RedBus_ChintamaniTravel.repository.ChintamaniTravelRepository;
import com.RedBus_ChintamaniTravel.repository.PassengerDetailRepository;
import com.RedBus_ChintamaniTravel.serviceI.ServiceI;

@Service
public class ServiceImpl implements ServiceI{

	@Autowired
	ChintamaniTravelRepository cr;
	
	@Autowired
	PassengerDetailRepository pr;

	@Override
	public void addTravel(Travel ct) {
       
		  cr.save(ct);
	}

	
	//passengerBooking
	@Override
	public void passengerBooking(PassengerDetails pd) {

		pr.save(pd);
	}

	
	
	@Override
	public List<Travel> getChintamaniTravelData() {

		return cr.findAll();
	}

	
	@Override
	public List<Travel> getByDate(String date) {

		return cr.getByDate(date);
	}


	@Override
	public List<Travel> getByDateTime_Toloc_Fromloc(String date, String time, String toloc, String fromloc) {

		return cr.getByDateAndTimeAndToLocationAndFromLocation(date, time, toloc, fromloc);
		
	}
	
	
}
