package com.aman.ems.service;

import java.util.List;

import com.aman.ems.entity.CategoryEntity;
import com.aman.ems.entity.ExpenseEntity;

public interface ExpenseService {
	public ExpenseEntity getAllExpensesByUID(Integer id) throws Exception;
	public ExpenseEntity getExpenseById(Integer id) throws Exception;
	public List<ExpenseEntity> getAllExpenseByCategory(CategoryEntity category) throws Exception;
	public ExpenseEntity addNewExpense(ExpenseEntity expense) throws Exception;
}
