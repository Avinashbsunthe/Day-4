package com.animal;

public class Elephant extends Animal
{
	public Elephant(String colour,double weight)
	{
		super(colour,weight);
	}

	@Override
	public void sound()
	{
		System.out.println("I make Make trumpet sound ");
	}
	
	@Override
	public void climb()
	{
		System.out.println("I cann't climb trees");
	}
}