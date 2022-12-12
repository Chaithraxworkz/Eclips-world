package com.xworkz.exceptions;

public class Doctor 
{
	public void method1()throws IllegalArgumentException
	{
		this.method2();
	}
	public void method2()throws IllegalArgumentException
	{
		this.method3();
	}
	public void method3()throws IllegalArgumentException
	{
		this.method4();
	}
	public void method4()throws IllegalArgumentException
	{
		this.method5();
	}
	public void method5()throws IllegalArgumentException
	{
		throw new IllegalArgumentException();
	}
	public void method6()throws ArrayIndexOutOfBoundsException
	{
		throw new ArrayIndexOutOfBoundsException();
	}
}
