package com.RedBus_NitaTravel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RedBus_NitaTravel.model.Travel;

@Repository
public interface NitaTravelRepository extends JpaRepository<Travel, Integer>{

	List<Travel> getByDate(String date);
	
	List<Travel> getByDateAndTimeAndToLocationAndFromLocation(String date,String time,
			                                            String toLocation,String fromLocation);
	
	
}
