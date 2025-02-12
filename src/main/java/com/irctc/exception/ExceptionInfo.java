package com.irctc.exception;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ExceptionInfo {

	private String exceptionCode;
	private String exceptionMessage;
	private LocalDateTime exceptionDateAndTime;

}
