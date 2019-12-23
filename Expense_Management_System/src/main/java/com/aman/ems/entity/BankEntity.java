package com.aman.ems.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Entity
@Table(name="bank")
@Data
@GenericGenerator(name = "pkgen",strategy = "sequence",
parameters={@Parameter(name="sequence_name",value="bank_seq")})
@AllArgsConstructor
public class BankEntity {
	
	public BankEntity(){}
	@Id
	@GeneratedValue(generator = "pkgen")
	@Column(name="ACCOUNT_ID")
	private Integer accountId;
	@Column(name="BANK_ID")
	private Integer bankId;
	@Column(name="BANK_NAME")
	private String bankName;
	private Long balance;
	@OneToOne(cascade = CascadeType.ALL)	  
	@JoinTable(name="BANK_ADD_JOIN",
				joinColumns = @JoinColumn(name="ACCOUNT_ID",referencedColumnName = "ACCOUNT_ID"),
				inverseJoinColumns = @JoinColumn(name="ADDRESS_ID",referencedColumnName = "ADDRESS_ID"))
	private AddressEntity address;
}
