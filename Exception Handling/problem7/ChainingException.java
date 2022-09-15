package com.yash.exception.problem7;

public class ChainingException extends Exception {
	public ChainingException(Exception e)
	{
		super(e);
	}

}
