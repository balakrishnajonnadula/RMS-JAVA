package com.rms.exceptions;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<Map<String, Object>> userNotFoundException(UserNotFoundException user) {

		Map<String, Object> handle = new HashMap<String, Object>();

		handle.put("status", 404);
		handle.put("error", HttpStatus.NOT_FOUND);
		handle.put("timestamp", new Date());
		handle.put("message", user.getMessage());

		return new ResponseEntity<Map<String, Object>>(handle, HttpStatus.NOT_FOUND);
	}
}
