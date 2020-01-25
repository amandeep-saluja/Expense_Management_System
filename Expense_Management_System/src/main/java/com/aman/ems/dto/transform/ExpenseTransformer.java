package com.aman.ems.dto.transform;

import java.util.ArrayList;
import java.util.List;

import com.aman.ems.entity.ExpenseEntity;
import com.aman.ems.exception.EmsException;
import com.aman.ems.model.Expense;

/**
 * This class is used to convert Expense Entity Object to Expense Object and
 * Expense Object to Expense Entity Object.
 * 
 * @author Amandeep Singh Saluja
 *
 */

public class ExpenseTransformer {

	/**
	 * This static method is used to convert Expense Entity To Expense Object.
	 * 
	 * @param expenseEntity
	 * @return Expense Object
	 * @throws EmsException
	 */

	public static Expense expenseEntityToExpense(ExpenseEntity expenseEntity) throws EmsException {
		Expense expense = new Expense();
		if(expenseEntity!=null) {
			expense.setCategory(CategoryTransformer.listOfCategoryEntityToListOfCategory(expenseEntity.getCategory()));
			expense.setDate(expenseEntity.getDate());
			expense.setDoneWith(expenseEntity.getDoneWith());
			expense.setExpenseId(expenseEntity.getExpenseId());
			expense.setExpenseName(expenseEntity.getExpenseName());
			expense.setImportance(expenseEntity.getImportance());
			expense.setPlace(expenseEntity.getPlace());
			expense.setSplit(expenseEntity.getSplit());
			expense.setTransaction(TransactionTransformer.transactionEntityToTransaction(expenseEntity.getTransaction()));
		}
		return expense;
	}

	/**
	 * This static method is used to convert Expense Entity To ExpenseEntity Object.
	 * 
	 * @param expense
	 * @return ExpenseEntity
	 * @throws EmsException
	 */

	public static ExpenseEntity expenseToExpenseEntity(Expense expense) throws EmsException {
		ExpenseEntity expenseEntity = new ExpenseEntity();
		if(expense!=null) {
			expenseEntity.setCategory(CategoryTransformer.listOfCategoryToListOfCategoryEntity(expense.getCategory()));
			expenseEntity.setDate(expense.getDate());
			expenseEntity.setDoneWith(expense.getDoneWith());
			expenseEntity.setExpenseId(expense.getExpenseId());
			expenseEntity.setExpenseName(expense.getExpenseName());
			expenseEntity.setImportance(expense.getImportance());
			expenseEntity.setPlace(expense.getPlace());
			expenseEntity.setSplit(expense.getSplit());
			expenseEntity.setTransaction(TransactionTransformer.transactionToTransactionEntity(expense.getTransaction()));
		}
		return expenseEntity;
	}

	/**
	 * This static method is used to convert List of Expense Entity to List of
	 * Expense Object.
	 * 
	 * @param listOfExpense
	 * @return List<Expense>
	 * @throws EmsException
	 */

	public static List<Expense> listOfExpenseEntityToListOfExpense(List<ExpenseEntity> listOfExpense)
			throws EmsException {
		List<Expense> listOfExpenses = new ArrayList<Expense>();
		if(listOfExpense!=null) {
			Expense expense = null;
			for(ExpenseEntity expenseEntity: listOfExpense) {
				expense = expenseEntityToExpense(expenseEntity);
				listOfExpenses.add(expense);
			}
		}
		return listOfExpenses;
	}

	/**
	 * This static method is used to convert List of Expense to List of
	 * ExpenseEntity Object.
	 * 
	 * @param listOfExpenses
	 * @return List<ExpenseEntity>
	 * @throws EmsException
	 */

	public static List<ExpenseEntity> listOfExpenseToListOfExpenseEntity(List<Expense> listOfExpenses)
			throws EmsException {
		List<ExpenseEntity> listOfExpenseEntities = new ArrayList<ExpenseEntity>();
		if(listOfExpenses!=null) {
			ExpenseEntity expenseEntity = null;
			for(Expense expense: listOfExpenses) {
				expenseEntity = expenseToExpenseEntity(expense);
				listOfExpenseEntities.add(expenseEntity);
			}
		}
		return listOfExpenseEntities;
	}

}
