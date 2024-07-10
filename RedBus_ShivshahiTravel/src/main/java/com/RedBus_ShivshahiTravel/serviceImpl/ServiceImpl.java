package com.RedBus_ShivshahiTravel.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RedBus_ShivshahiTravel.model.PassengerDetails;
import com.RedBus_ShivshahiTravel.model.Travel;
import com.RedBus_ShivshahiTravel.repository.PassengerDetailRepository;
import com.RedBus_ShivshahiTravel.repository.ShivshahiTravelRepository;
import com.RedBus_ShivshahiTravel.serviceI.ServiceI;

@Service
public class ServiceImpl implements ServiceI{

	@Autowired
	ShivshahiTravelRepository shr;
	
	@Autowired
	PassengerDetailRepository pr;
	
	@Override
	public void addTravel(Travel shivt) {

		shr.save(shivt);
	}


	@Override
	public void passengerBooking(PassengerDetails pd) {

		pr.save(pd);
	}


	@Override
	public List<Travel> getShivshahiTravelData() {
		return shr.findAll();
	}


	@Override
	public List<Travel> getByDate(String date) {

		return shr.getByDate(date);
	}


	@Override
	public List<Travel> getByDateTime_Toloc_Fromloc(String date, String time, String toloc, String fromloc) {

		return shr.getByDateAndTimeAndToLocationAndFromLocation(date, time, toloc, fromloc);
	}

}
