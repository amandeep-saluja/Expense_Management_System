package com.aman.ems.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name="expense")
@Data
@Builder
@AllArgsConstructor
public class ExpenseEntity {
	public ExpenseEntity() {}
	@Id
	@Column(name="EXPENSE_ID")
	private Integer expenseId;
	@Column(name="EXPENSE_NAME")
	private String expenseName;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name="EXPENSE_CAT_JOIN",
				joinColumns = @JoinColumn(name="EXPENSE_ID",referencedColumnName = "EXPENSE_ID"),
				inverseJoinColumns = @JoinColumn(name="CATEGORY_ID",referencedColumnName = "CATEGORY_ID"))
	private List<CategoryEntity> category;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinTable(name="EXPENSE_TRANS_JOIN",
				joinColumns = @JoinColumn(name="EXPENSE_ID",referencedColumnName = "EXPENSE_ID"),
				inverseJoinColumns = @JoinColumn(name="TRANSACTION_ID",referencedColumnName = "TRANSACTION_ID"))
	private TransactionEntity transaction;
	
	private String place;
	private LocalDate date;
	private String importance;
	@Column(name="DONE_WITH")
	private String doneWith;
	private String split;
}
