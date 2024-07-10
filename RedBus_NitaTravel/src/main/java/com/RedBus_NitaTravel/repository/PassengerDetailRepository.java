package com.RedBus_NitaTravel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RedBus_NitaTravel.model.PassengerDetails;

@Repository
public interface PassengerDetailRepository extends JpaRepository<PassengerDetails, Integer>{

}
