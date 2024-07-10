package com.RedBus_Aapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RedBus_Aapplication.model.PassengerDetails;

@Repository
public interface PassengerDetailRepository extends JpaRepository<PassengerDetails, Integer>{

}
