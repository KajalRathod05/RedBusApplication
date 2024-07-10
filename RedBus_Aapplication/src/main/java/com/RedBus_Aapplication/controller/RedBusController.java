package com.RedBus_Aapplication.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.RedBus_Aapplication.model.PassengerDetails;
import com.RedBus_Aapplication.serviceI.ServiceI;

@RestController
public class RedBusController {

	@Autowired
	ServiceI ssi;
	
	@Autowired
	RestTemplate restT;
	
	@GetMapping("/getAllRedBusData")
	public List getAllredBusData()
	{
		String chintaT="http://localhost:7072/getChintamaniTravelData";
		String nitaT="http://localhost:7073/getNitaTravelData";
		String shivT="http://localhost:7074/getShivshahiTravelData";
		
		List nitaTlist=restT.getForObject(nitaT, List.class);
		List chintaTlist=restT.getForObject(chintaT, List.class);
		List shivTlist=restT.getForObject(shivT, List.class);
		
		List rlist =new ArrayList<>();
		rlist.add(nitaTlist);
		rlist.add(chintaTlist);
		rlist.add(shivTlist);
		
		return rlist;
	}
	
	@GetMapping("getByDateTime_Toloc_Fromloc/{date}/{time}/{toLocation}/{fromLocation}")
	public List getByDateTime_Toloc_Fromloc(@PathVariable("date") String date,
			  @PathVariable("time") String time,@PathVariable("toLocation") String toloc,@PathVariable("fromLocation") String fromloc)
	{
		String chintaT="http://localhost:7072/getByDateTime_Toloc_Fromloc/"+date+"/"+time+"/"+toloc+"/"+fromloc+"";
		String nitaT="http://localhost:7073/getByDateTime_Toloc_Fromloc/"+date+"/"+time+"/"+toloc+"/"+fromloc+"";
		String shivT="http://localhost:7074/getByDateTime_Toloc_Fromloc/"+date+"/"+time+"/"+toloc+"/"+fromloc+"";
		
		List nitaTlist=restT.getForObject(nitaT, List.class);
		List chintaTlist=restT.getForObject(chintaT, List.class);
		List shivTlist=restT.getForObject(shivT, List.class);
		
		List rlist =new ArrayList<>();
		
		rlist.add(nitaTlist);
		rlist.add(chintaTlist);
		rlist.add(shivTlist);
		
		return rlist;
	}
	
	
	@PostMapping("/passengerBooking")
	public String passengerBooking(@RequestBody PassengerDetails pd)
	{
		if(pd.getTravelName().equals("Chintamani"))
		{
			String url="http://localhost:7072/passengerBooking";
			String msg=restT.postForObject(url,pd,String.class);
			ssi.passengerBooking(pd);
			return msg;
		}
		else if(pd.getTravelName().equals("Nita"))
		{
			String url="http://localhost:7073/passengerBooking";
			String msg=restT.postForObject(url,pd,String.class);
			ssi.passengerBooking(pd);
			return msg;
		}
		else if(pd.getTravelName().equals("Shivshahi"))
		{
			String url="http://localhost:7074/passengerBooking";
			String msg=restT.postForObject(url,pd,String.class);
			ssi.passengerBooking(pd);
			return msg;

		}
		else
		{
			return "No such Travels are available";
		}
		
		
	}
	
}
