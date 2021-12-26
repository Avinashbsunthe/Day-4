package com.animal;

public class Animal {
	private String colour;
	private double weight;
	
	public Animal(String name, double weight) {
		super();
		this.colour = name;
		this.weight = weight;
		
		display();
	}

	public String getName() {
		return colour;
	}

	public double getWeight() {
		return weight;
	}
	
	public void sound()
	{
		System.out.println("No Sound");
	}
	
	public void climb()
	{
		
		System.out.println("NA");
	}
	
	public void display()
	{
		System.out.println("animal colour :"+colour);
		System.out.println("animal weight :"+weight);
}
}
