package com.assignment.sample;

public class Sample 
{
	private static int count=0;
	
	public Sample() 
	{
		count++;
	}
	
	public void display()
	{
		System.out.println("No of times class instantiated: "+count);
	}

}
