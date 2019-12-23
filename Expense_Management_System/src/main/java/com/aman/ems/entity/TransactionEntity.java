package com.aman.ems.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Entity
@Table(name="TRANSACTION")
@Data
@Builder
@AllArgsConstructor
@Getter
public class TransactionEntity {
	public TransactionEntity() {}
	@Id
	@Column(name="TRANSACTION_ID")
	private Integer transactionId;
	@Column(name="TRANSACTION_NAME")
	private String transactionName;
	private LocalDate date;
	@Column(name="TRANSACTION_TYPE")
	private String transactionType;
}
