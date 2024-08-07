package com.myproject.expensetrackerapi.service;

import java.util.List;

import com.myproject.expensetrackerapi.entity.Expense;

public interface ExpenseService {
	
	List<Expense> getAllExpenses();
	Expense getExpenseById(Long id);
	void deleteExpenseById(Long id);
	Expense saveExpense(Expense expense);

}
