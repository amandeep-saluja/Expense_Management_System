package com.aman.ems.model;

import lombok.Data;

@Data
public class Occupation {
	// public Occupation() {}
	private Integer jobId;
	private String jobType;
	private String company;
	private String role;
	private Integer salary;
	private Address address;
	private String message;
}
