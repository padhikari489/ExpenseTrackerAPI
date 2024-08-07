package com.myproject.expensetrackerapi.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.myproject.expensetrackerapi.entity.Expense;
import com.myproject.expensetrackerapi.exceptions.ResourceNotFoundException;
import com.myproject.expensetrackerapi.repository.ExpenseRepository;


@Service
public class ExpenseServiceImpl implements ExpenseService {
	
	@Autowired
	private ExpenseRepository expenseRepo;

	@Override
	public Page<Expense> getAllExpenses(Pageable page) {
		
		Page<Expense> allExpenses = expenseRepo.findAll(page);
		return allExpenses;
	}

	@Override
	public Expense getExpenseById(Long id) {
		
		Optional <Expense> expense = expenseRepo.findById(id);
		if(expense.isPresent()) {
			return expense.get();
		}
		throw new ResourceNotFoundException("Expense is not found for the id "+id);
		
	}

	@Override
	public void deleteExpenseById(Long id) {
		
		expenseRepo.deleteById(id);
		
	}

	@Override
	public Expense saveExpense(Expense expense) {
		return expenseRepo.save(expense);
		
	}

}
