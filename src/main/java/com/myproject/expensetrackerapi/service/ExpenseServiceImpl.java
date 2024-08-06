package com.myproject.expensetrackerapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.expensetrackerapi.entity.Expense;
import com.myproject.expensetrackerapi.repository.ExpenseRepository;


@Service
public class ExpenseServiceImpl implements ExpenseService {
	
	@Autowired
	private ExpenseRepository expenseRepo;

	@Override
	public List<Expense> getAllExpenses() {
		
		List<Expense> allExpenses = expenseRepo.findAll();
		return allExpenses;
	}

}
