package com.assignment.demo.exception;

public class GordonException extends RuntimeException {
	private static final long serialVersionUID = -1626501420467939474L;

	public GordonException() {
	}

	public GordonException(String str) {
		super(str);
	}

	public GordonException(Throwable e) {
		super(e);
	}
}
