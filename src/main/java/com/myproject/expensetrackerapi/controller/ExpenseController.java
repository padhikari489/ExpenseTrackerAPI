package com.myproject.expensetrackerapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myproject.expensetrackerapi.entity.Expense;
import com.myproject.expensetrackerapi.service.ExpenseService;

@RestController
public class ExpenseController {

	@Autowired
	private ExpenseService expenseService;
	
	@GetMapping("/expenses")
	public List<Expense> getAllExpenses() {
		List<Expense> ret = expenseService.getAllExpenses();
		return ret;
	}

}
