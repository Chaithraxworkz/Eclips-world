package com.xworks.crud.exceptions;

public class StorageFullException extends RuntimeException
{

	public StorageFullException() 
	{
		
	}
	public StorageFullException(String msg)
	{
		super(msg);
	}
	
}
