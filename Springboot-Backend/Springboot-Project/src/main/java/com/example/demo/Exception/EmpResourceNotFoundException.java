package com.example.demo.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class EmpResourceNotFoundException  extends RuntimeException{   //whenever resource are not exist in database this exception throws
	
	private static final long serialVersionUID =1L;
	
	public EmpResourceNotFoundException(String message) {
		super(message);
	}
}