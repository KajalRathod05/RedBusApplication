package com.RedBus_ShivshahiTravel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RedBus_ShivshahiTravel.model.PassengerDetails;

@Repository
public interface PassengerDetailRepository extends JpaRepository<PassengerDetails, Integer>{

}
