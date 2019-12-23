package com.aman.ems.model;

import lombok.Data;

@Data
public class Address {
	private Integer addressId;
	private Integer houseNumber;
	private String buildingName;
	private String landmark;
	private String area;
	private String city;
	private Integer pincode;
	private String state;
	private String country;
	private String message;
}
