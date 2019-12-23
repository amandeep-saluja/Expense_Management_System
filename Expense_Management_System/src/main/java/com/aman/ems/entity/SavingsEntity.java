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
import lombok.Data;
import lombok.Getter;

@Entity
@Table(name = "savings")
@Data
@AllArgsConstructor
@Getter
public class SavingsEntity {
	public SavingsEntity() {
	}

	@Id
	@Column(name = "SAVING_ID")
	private Integer savingID;
	@Column(name = "SAVING_NAME")
	private String savingName;
	private LocalDate date;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "SAVINGS_CAT_JOIN", joinColumns = @JoinColumn(name = "SAVING_ID", referencedColumnName = "SAVING_ID"), inverseJoinColumns = @JoinColumn(name = "CATEGORY_ID", referencedColumnName = "CATEGORY_ID"))
	private List<CategoryEntity> category;
	private String need;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "SAVINGS_TRANS_JOIN", joinColumns = @JoinColumn(name = "SAVING_ID", referencedColumnName = "SAVING_ID"), inverseJoinColumns = @JoinColumn(name = "TRANSACTION_ID", referencedColumnName = "TRANSACTION_ID"))
	private TransactionEntity transaction;
	private Integer balance;
}
