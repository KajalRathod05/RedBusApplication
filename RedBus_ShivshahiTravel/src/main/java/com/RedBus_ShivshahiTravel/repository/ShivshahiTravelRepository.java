package com.RedBus_ShivshahiTravel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RedBus_ShivshahiTravel.model.Travel;

@Repository
public interface ShivshahiTravelRepository extends JpaRepository<Travel, Integer>{

	
      List<Travel> getByDate(String date);
	
	List<Travel> getByDateAndTimeAndToLocationAndFromLocation(String date,String time,
			                                            String toLocation,String fromLocation);
}
