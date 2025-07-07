package com.mysite.sbb;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "객체를 찾을수 없습니다")
public class DataNotFoundException extends RuntimeException {
	
	private static final long seriaVersionUID = 1L;
	
	public DataNotFoundException(String message) {
		super(message);
	}

}
