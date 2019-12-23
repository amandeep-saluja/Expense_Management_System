package com.aman.ems.serviceImpl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.aman.ems.entity.TransactionEntity;
import com.aman.ems.entity.UserEntity;
import com.aman.ems.service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService{

	@Override
	public TransactionEntity getTransactionById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TransactionEntity addNewTransaction(TransactionEntity t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TransactionEntity> getAllTransactionByType(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TransactionEntity> getAllTransactionByDate(LocalDate date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserEntity getUserByTID(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
