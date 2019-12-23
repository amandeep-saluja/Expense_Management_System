package com.aman.ems.model;

import lombok.Data;

@Data
public class Bank {
//	public Bank(){}
	private Integer accountId;
	private Integer bankId;
	private String bankName;
	private Long balance;
	private Address address;
	private String message;
}
