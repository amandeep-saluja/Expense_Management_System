package com.aman.ems.model;

import java.time.LocalDate;
import java.util.List;

import lombok.Data;

@Data
public class Savings {
	// public Savings() {}
	private Integer savingID;
	private String savingName;
	private LocalDate date;
	private List<Category> category;
	private String need;
	private Transaction transaction;
	private Integer balance;
	private String message;
}
