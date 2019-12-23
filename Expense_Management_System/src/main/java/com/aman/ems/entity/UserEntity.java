package com.aman.ems.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Entity
@Table(name = "user")
@Data
@Builder
@Getter
@AllArgsConstructor
public class UserEntity {
	public UserEntity(){
	}
	@Id
	@Column(name = "USER_ID")
	private Integer userId;
	@Column(name = "USER_NAME")
	private String userName;
	private String password;
	@Column(name = "FIRST_NAME")
	private String firstName;
	@Column(name = "LAST_NAME")
	private String lastName;
	private String gender;
	@Column(name = "PHONE_NUMBER")
	private Long phoneNumber;
	@Column(name = "EMAIL_ID")
	private String emailId;
	@Column(name = "DATE_OF_BIRTH")
	private LocalDate dateOfBirth;
	@Column(name = "POCKET_MONEY")
	private String pocketMoney;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "USER_OCC_JOIN", 
				joinColumns = @JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID"), 
				inverseJoinColumns = @JoinColumn(name = "OCCUPATION_ID", referencedColumnName = "JOB_ID"))
	private OccupationEntity occupation;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "USER_ADD_JOIN", 
				joinColumns = @JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID"),
				inverseJoinColumns = @JoinColumn(name = "ADDRESS_ID", referencedColumnName = "ADDRESS_ID"))
	private AddressEntity address;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "SAVINGS_USER_JOIN",
				joinColumns = @JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID"), 
				inverseJoinColumns = @JoinColumn(name = "SAVING_ID", referencedColumnName = "SAVING_ID"))
	private List<SavingsEntity> listOfSavings;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "EXPENSE_USER_JOIN",
				joinColumns = @JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID"), 
				inverseJoinColumns = @JoinColumn(name = "EXPENSE_ID", referencedColumnName = "EXPENSE_ID"))
	private List<ExpenseEntity> listOfExpense;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "BANK_USER_JOIN", 
				joinColumns = @JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID"), 
				inverseJoinColumns = @JoinColumn(name = "ACCOUNT_ID", referencedColumnName = "ACCOUNT_ID"))
	private List<BankEntity> listOfBank;

	/*
	 * @OneToOne(cascade = CascadeType.ALL)
	 * 
	 * @JoinTable(name = "USER_SELF_JOIN", joinColumns = @JoinColumn(name =
	 * "USER_ID", referencedColumnName = "USER_ID"), inverseJoinColumns
	 * = @JoinColumn(name = "UID", referencedColumnName = "USER_ID")) private
	 * Integer friends;
	 */
}
