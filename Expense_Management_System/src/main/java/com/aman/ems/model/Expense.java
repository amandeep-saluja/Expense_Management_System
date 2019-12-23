package com.aman.ems.model;

import java.time.LocalDate;
import java.util.List;

import lombok.Data;

@Data
public class Expense {
//	public Expense() {}
	private Integer expenseId;
	private String expenseName;
	private List<Category> category;
	private Transaction transaction;
	private String place;
	private LocalDate date;
	private String importance;
	private String doneWith;
	private String split;
	private String message;
}
