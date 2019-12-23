package com.aman.ems.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aman.ems.entity.AddressEntity;
import com.aman.ems.entity.BankEntity;
import com.aman.ems.entity.UserEntity;
import com.aman.ems.service.BankService;

@Service
public class BankServiceImpl implements BankService{
 
	@Override
	public List<BankEntity> getAllBankByUID(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BankEntity getBankById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BankEntity addNewBank(BankEntity bank) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AddressEntity getAddressByBID(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserEntity getUserByBID(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getBalance(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
