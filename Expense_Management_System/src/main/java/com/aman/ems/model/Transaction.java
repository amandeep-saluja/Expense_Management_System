package com.aman.ems.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Transaction {
//	public Transaction() {}
	private Integer transactionId;
	private String transactionName;
	private LocalDate date;
	private String transactionType;
	private String message;
}
