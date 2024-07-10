package com.RedBus_ChintamaniTravel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.RedBus_ChintamaniTravel.model.Travel;
import com.RedBus_ChintamaniTravel.model.PassengerDetails;
import com.RedBus_ChintamaniTravel.serviceI.ServiceI;

@RestController
public class ChintamaniController {

	@Autowired
	ServiceI si;
	
	@PostMapping("/addChintamaniT")
	public String addTravel(@RequestBody Travel ct)
	{
		si.addTravel(ct);
		return "Added...";
	}
	
	@PostMapping("/passengerBooking")
	public String passengerBooking(@RequestBody PassengerDetails pd)
	{
		si.passengerBooking(pd);
		return "booking is confirm..!";
	}
	
	@GetMapping("/getChintamaniTravelData")   //http://localhost:7072/getChintamaniTravelData
	public List<Travel> getChintamaniTravel()
	{
		List<Travel> ctmlist=si.getChintamaniTravelData();
		return ctmlist;
	}
	
	@GetMapping("/getChinDataByDate/{date}")  //http://localhost:7072/getChinDataByDate/16-9-2024
	public List<Travel> getByDate(@PathVariable("date") String date)
	{
		List<Travel> ctmlist=si.getByDate(date);
		return ctmlist;
	}
	
	
	
	//http://localhost:7072/getByDateTime_Toloc_Fromloc/16-9-2024/11:00 AM/Sangli/Solapur
	
	@GetMapping("getByDateTime_Toloc_Fromloc/{date}/{time}/{toLocation}/{fromLocation}")
	public List<Travel> getByDateTime_Toloc_Fromloc(@PathVariable("date") String date,
	  @PathVariable("time") String time,@PathVariable("toLocation") String toloc,@PathVariable("fromLocation") String fromloc)
	{
		List<Travel> ctmlist=si.getByDateTime_Toloc_Fromloc(date,time,toloc,fromloc);
		return ctmlist;
	}
}
