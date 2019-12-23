package com.aman.ems.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="address")
@Data
public class AddressEntity {
	@Id
	@Column(name = "ADDRESS_ID")
	private Integer addressId;

	@Column(name = "HOUSE_NO")
	private Integer houseNumber;

	@Column(name = "BUILDING_NAME")
	private String buildingName;
	private String landmark;
	private String area;
	private String city;
	private Integer pincode;
	private String state;
	private String country;
}
