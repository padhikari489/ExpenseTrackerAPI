package com.myproject.expensetrackerapi.exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import com.myproject.expensetrackerapi.entity.ErrorResponse;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleExpenseNotFoundException(ResourceNotFoundException ex, WebRequest request) {
		
		ErrorResponse error = new ErrorResponse();
		
		error.setCode(HttpStatus.NOT_FOUND.value());
		
		error.setMessage(ex.getMessage());
		
		error.setTimestamp(new Date());
		
		return new ResponseEntity<ErrorResponse>(error, HttpStatus.NOT_FOUND);
		
	}
	
	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public ResponseEntity<Object> handleArgumentMismatchException(MethodArgumentTypeMismatchException ex, WebRequest request) {
		
		ErrorResponse error  = new ErrorResponse();
		error.setCode(HttpStatus.BAD_REQUEST.value());
		error.setMessage(ex.getMessage());
		error.setTimestamp(new Date());
		return new ResponseEntity<Object>(error, HttpStatus.BAD_REQUEST);
		
		
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> handleGeneralException(Exception ex, WebRequest request) {
		
		ErrorResponse error  = new ErrorResponse();
		error.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		error.setMessage(ex.getMessage());
		error.setTimestamp(new Date());
		return new ResponseEntity<Object>(error, HttpStatus.INTERNAL_SERVER_ERROR);
		
		
	}

}
