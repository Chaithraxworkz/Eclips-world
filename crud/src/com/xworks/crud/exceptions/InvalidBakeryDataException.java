package com.xworks.crud.exceptions;

public class InvalidBakeryDataException extends Exception
{
	public InvalidBakeryDataException() 
	{
		
	}
	public InvalidBakeryDataException(String data)
	{
		super(data);
	}
}
