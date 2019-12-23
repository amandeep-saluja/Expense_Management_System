package com.aman.ems.service;

import java.time.LocalDate;
import java.util.List;

import com.aman.ems.entity.TransactionEntity;
import com.aman.ems.entity.UserEntity;

public interface TransactionService {
	public TransactionEntity getTransactionById(Integer id) throws Exception;
	public TransactionEntity addNewTransaction(TransactionEntity t) throws Exception;
	public List<TransactionEntity> getAllTransactionByType(String type) throws Exception;
	public List<TransactionEntity> getAllTransactionByDate(LocalDate date) throws Exception;
	public UserEntity getUserByTID(Integer id) throws Exception;
}
