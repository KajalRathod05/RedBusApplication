package com.RedBus_ChintamaniTravel.model;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class PassengerDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	private String name;
	private String gender;
	private  String email;
	private long contact;
	private String toPlace;
	private String fromPlace;
	private String travelName;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Travel travel;
}
