package com.myproject.expensetrackerapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myproject.expensetrackerapi.entity.Expense;


@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long>{

}
