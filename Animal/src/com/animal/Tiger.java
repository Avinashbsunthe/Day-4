package com.animal;

public class Tiger extends Animal
{
	public Tiger(String colour,double weight)
	{
		super(colour,weight);
	}

	@Override
	public void sound()
	{
		System.out.println("I make Make roaring sound ");
	}
	
	@Override
	public void climb()
	{
		System.out.println("I can climb trees");
	}
}
