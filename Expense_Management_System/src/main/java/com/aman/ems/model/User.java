package com.aman.ems.model;

import java.time.LocalDate;
import java.util.List;

import lombok.Data;
/**
 * 
 * @author Amandeep
 *	
 *	User class has all the properties which an user has.
 * 
 */
@Data
public class User {
//	public User(){}
	private Integer userId;
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private String gender;
	private Long phoneNumber;
	private String emailId;
	private LocalDate dateOfBirth;
	private String pocketMoney;
	private Occupation occupation;
	private Address address;
	private List<Savings> listOfSavings;
	private List<Expense> listOfExpense;
	private List<Bank> listOfBank;
	// private Integer friends;
	private String message;
}
