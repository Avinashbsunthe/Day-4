/*Exercise 2:Create a class called Vehicle. Create subclasses like Truck, Bus, Car etc. Add common methods in the base class and specific methods in the corresponding class. Create a class called Road 
and create objects for the Truck, Car, Bus etc and display the appropriate message. */

package com.assignment.vehicle;

public class Vehicle
{
	private String colour,model;
	private double price;
	private int noOfWheels;

	public Vehicle(String colour, Double price) {
		super();
		this.colour = colour;
		this.price = price;
		System.out.println("Colour: "+this.colour);
		System.out.println("Price: "+this.price);
	}

	public Vehicle(String colour, String model, int noOfWheels) {
		super();
		this.colour = colour;
		this.model = model;
		this.noOfWheels = noOfWheels;
		System.out.println("Colour : "+this.colour);
		System.out.println("No of Wheels: "+this.noOfWheels);
		System.out.println("Model : "+this.model);
	}

}
