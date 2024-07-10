package com.RedBus_Aapplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Travel {

	@Id
	
	private int id;
	private String travelName;
	private String toLocation;
	private String fromLocation;
	private String date;
	private String time;
	private double price;
}
