package com.irctc.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandling {

	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ExceptionInfo> ExceptionHandler(Exception e) {

		String message = e.getMessage();

		ExceptionInfo expInfo = new ExceptionInfo();
		expInfo.setExceptionCode("Ex123");
		expInfo.setExceptionMessage(message);
		expInfo.setExceptionDateAndTime(LocalDateTime.now());

		return new ResponseEntity<>(expInfo, HttpStatus.INTERNAL_SERVER_ERROR);

	}
	
}
