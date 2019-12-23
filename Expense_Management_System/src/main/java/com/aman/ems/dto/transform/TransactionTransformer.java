package com.aman.ems.dto.transform;

import java.util.ArrayList;
import java.util.List;

import com.aman.ems.entity.TransactionEntity;
import com.aman.ems.exception.EmsException;
import com.aman.ems.model.Transaction;

/**
 * This class is used to convert Transaction Entity Object to Transaction Object
 * and Transaction Object to Transaction Entity Object.
 * 
 * @author Infinty
 *
 */

public class TransactionTransformer {

	/**
	 * This static method is used to convert Transaction Entity To Transaction
	 * Object.
	 * 
	 * @param transactionEntity
	 * @return Transaction Object
	 * @throws EmsException
	 */

	public static Transaction transactionEntityToTransaction(TransactionEntity transactionEntity) throws EmsException {
		Transaction transaction = new Transaction();
		transaction.setDate(transactionEntity.getDate());
		transaction.setTransactionId(transactionEntity.getTransactionId());
		transaction.setTransactionName(transactionEntity.getTransactionName());
		transaction.setTransactionType(transactionEntity.getTransactionType());
		return transaction;
	}

	/**
	 * This static method is used to convert Expense Entity To ExpenseEntity Object.
	 * 
	 * @param transaction
	 * @return TransactionEntity
	 * @throws EmsException
	 */

	public static TransactionEntity transactionToTransactionEntity(Transaction transaction) throws EmsException {
		TransactionEntity transactionEntity = new TransactionEntity();
		transactionEntity.setDate(transaction.getDate());
		transactionEntity.setTransactionId(transaction.getTransactionId());
		transactionEntity.setTransactionName(transaction.getTransactionName());
		transactionEntity.setTransactionType(transaction.getTransactionType());
		return transactionEntity;
	}

	/**
	 * This static method is used to convert List of Transaction to List of
	 * Transaction Entity Object.
	 * 
	 * @param listOfTransaction
	 * @return List<TransactionEntity>
	 * @throws EmsException
	 */

	public static List<TransactionEntity> listOfTransactionToListOfTransactionEntity(
			List<Transaction> listOfTransaction) throws EmsException {
		List<TransactionEntity> listOfTransactionEntities = new ArrayList<TransactionEntity>();
		TransactionEntity transactionEntity = null;
		for (Transaction transaction : listOfTransaction) {
			transactionEntity = transactionToTransactionEntity(transaction);
			listOfTransactionEntities.add(transactionEntity);
		}
		return listOfTransactionEntities;
	}

	/**
	 * This static method is used to convert List of Transaction Entity to List of
	 * Transaction Object.
	 * 
	 * @param listOfTransactionEntities
	 * @return List<Transaction>
	 * @throws EmsException
	 */

	public static List<Transaction> listOfTransactionEntityToListOfTransaction(
			List<TransactionEntity> listOfTransactionEntities) throws EmsException {
		List<Transaction> listOfTransactions = new ArrayList<>();
		Transaction transaction = null;
		for (TransactionEntity transactionEntity : listOfTransactionEntities) {
			transaction = transactionEntityToTransaction(transactionEntity);
			listOfTransactions.add(transaction);
		}
		return listOfTransactions;
	}

}
