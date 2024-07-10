package com.RedBus_NitaTravel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.RedBus_NitaTravel.model.Travel;
import com.RedBus_NitaTravel.model.PassengerDetails;
import com.RedBus_NitaTravel.serviceI.ServiceI;


@RestController
public class NitaController {


	@Autowired
	ServiceI si;
	
	@PostMapping("/addNitaT")
	public String addTravel(@RequestBody Travel nt)
	{
		si.addTravel(nt);
		return "Added...";
	}
	
	@PostMapping("/passengerBooking")
	public String passengerBooking(@RequestBody PassengerDetails pd)
	{
		si.passengerBooking(pd);
		return "booking is confirm..!";
	}
	
	
	@GetMapping("/getNitaTravelData")   //http://localhost:7073/getNitaTravelData
	public List<Travel> getNitaTravel()
	{
		List<Travel> ntmlist=si.getNitaTravelData();
		return ntmlist;
	}
	
	@GetMapping("/getNitaTDataByDate/{date}")  //http://localhost:7073/getNitaTDataByDate/16-9-2024
	public List<Travel> getByDate(@PathVariable("date") String date)
	{
		List<Travel> ntmlist=si.getByDate(date);
		return ntmlist;
	}
	
	
	//http://localhost:7073/getByDateTime_Toloc_Fromloc/16-9-2024/11:00 AM/Sangli/Solapur
	
	@GetMapping("getByDateTime_Toloc_Fromloc/{date}/{time}/{toLocation}/{fromLocation}")
	public List<Travel> getByDateTime_Toloc_Fromloc(@PathVariable("date") String date,
	  @PathVariable("time") String time,@PathVariable("toLocation") String toloc,@PathVariable("fromLocation") String fromloc)
	{
		List<Travel> ntmlist=si.getByDateTime_Toloc_Fromloc(date,time,toloc,fromloc);
		return ntmlist;
	}
}
