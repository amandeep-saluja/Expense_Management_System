package com.aman.ems.service;

import java.util.List;

import com.aman.ems.entity.AddressEntity;
import com.aman.ems.entity.BankEntity;
import com.aman.ems.entity.UserEntity;

public interface BankService {
	public List<BankEntity> getAllBankByUID(Integer id) throws Exception;
	public BankEntity getBankById(Integer id) throws Exception;
	public BankEntity addNewBank(BankEntity bank) throws Exception;
	public AddressEntity getAddressByBID(Integer id) throws Exception;
	public UserEntity getUserByBID(Integer id) throws Exception;
	public Long getBalance(Integer id) throws Exception;
}
