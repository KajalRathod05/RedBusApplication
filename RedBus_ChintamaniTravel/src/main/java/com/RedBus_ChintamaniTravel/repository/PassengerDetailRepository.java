package com.RedBus_ChintamaniTravel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RedBus_ChintamaniTravel.model.PassengerDetails;

@Repository
public interface PassengerDetailRepository extends JpaRepository<PassengerDetails, Integer>{

}
