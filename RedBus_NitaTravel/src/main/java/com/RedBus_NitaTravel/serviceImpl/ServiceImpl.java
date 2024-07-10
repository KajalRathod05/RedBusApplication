package com.RedBus_NitaTravel.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RedBus_NitaTravel.model.Travel;
import com.RedBus_NitaTravel.model.PassengerDetails;
import com.RedBus_NitaTravel.repository.NitaTravelRepository;
import com.RedBus_NitaTravel.repository.PassengerDetailRepository;
import com.RedBus_NitaTravel.serviceI.ServiceI;

@Service
public class ServiceImpl implements ServiceI{

	@Autowired
	NitaTravelRepository nr;
	
	@Autowired
	PassengerDetailRepository pr;
	
	@Override
	public void addTravel(Travel nt) {
       nr.save(nt);
	}

	@Override
	public void passengerBooking(PassengerDetails pd) {

		pr.save(pd);
	}

	@Override
	public List<Travel> getNitaTravelData() {
		
		return nr.findAll();
	}

	@Override
	public List<Travel> getByDate(String date) {

		return nr.getByDate(date);
	}

	@Override
	public List<Travel> getByDateTime_Toloc_Fromloc(String date, String time, String toloc, String fromloc) {

		return nr.getByDateAndTimeAndToLocationAndFromLocation(date, time, toloc, fromloc);
	}

	
}
