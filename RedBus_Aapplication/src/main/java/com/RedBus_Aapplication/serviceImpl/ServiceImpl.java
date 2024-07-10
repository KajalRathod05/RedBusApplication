package com.RedBus_Aapplication.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RedBus_Aapplication.model.PassengerDetails;
import com.RedBus_Aapplication.repository.PassengerDetailRepository;
import com.RedBus_Aapplication.serviceI.ServiceI;

@Service
public class ServiceImpl implements ServiceI{

	@Autowired
	PassengerDetailRepository pr;
	
	@Override
	public void passengerBooking(PassengerDetails pd) {
      
		pr.save(pd);
		
	}

}
