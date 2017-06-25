package com.assignment.demo.exception;

public class InvalidInputFormatException extends GordonException {
	private static final long serialVersionUID = 386353751289376875L;

	public InvalidInputFormatException(Throwable e) {
		super(e);
	}

	public InvalidInputFormatException() {
	}
}
