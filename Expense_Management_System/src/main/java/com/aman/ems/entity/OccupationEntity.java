package com.aman.ems.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Entity
@Table(name = "occupation")
@Data
@Getter
@AllArgsConstructor
public class OccupationEntity {
	public OccupationEntity() {
	}

	@Id
	@Column(name = "JOB_ID")
	private Integer jobId;
	@Column(name = "JOB_TYPE")
	private String jobType;
	private String company;
	private String role;
	private Integer salary;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "ADD_OCC_JOIN", joinColumns = @JoinColumn(name = "JOB_ID", referencedColumnName = "JOB_ID"), inverseJoinColumns = @JoinColumn(name = "ADDRESS_ID", referencedColumnName = "ADDRESS_ID"))
	private AddressEntity address;
}
