package com.RedBus_ShivshahiTravel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.RedBus_ShivshahiTravel.model.PassengerDetails;
import com.RedBus_ShivshahiTravel.model.Travel;
import com.RedBus_ShivshahiTravel.serviceI.ServiceI;

@RestController
public class ShivshahiController {

	
	@Autowired
	ServiceI si;
	
	@PostMapping("/addShivshahiT")
	public String addTravel(@RequestBody Travel shivt)
	{
		si.addTravel(shivt);
		return "Added...";
	}
	
	@PostMapping("/passengerBooking")
	public String passengerBooking(@RequestBody PassengerDetails pd)
	{
		si.passengerBooking(pd);
		return "booking is confirm..!";
	}
	
	
	@GetMapping("/getShivshahiTravelData")   //http://localhost:7074/getShivshahiTravelData
	public List<Travel> getNitaTravel()
	{
		List<Travel> shivlist=si.getShivshahiTravelData();
		return shivlist;
	}
	
	@GetMapping("/getShivTDataByDate/{date}")  //http://localhost:7074/getShivTDataByDate/16-9-2024
	public List<Travel> getByDate(@PathVariable("date") String date)
	{
		List<Travel> shivlist=si.getByDate(date);
		return shivlist;
	}
	
	
	//http://localhost:7074/getByDateTime_Toloc_Fromloc/16-9-2024/11:00 AM/Sangli/Solapur
	
	@GetMapping("getByDateTime_Toloc_Fromloc/{date}/{time}/{toLocation}/{fromLocation}")
	public List<Travel> getByDateTime_Toloc_Fromloc(@PathVariable("date") String date,
	  @PathVariable("time") String time,@PathVariable("toLocation") String toloc,@PathVariable("fromLocation") String fromloc)
	{
		List<Travel> shivlist=si.getByDateTime_Toloc_Fromloc(date,time,toloc,fromloc);
		return shivlist;
	}
}
