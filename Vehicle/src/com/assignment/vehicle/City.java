package com.assignment.vehicle;

public class City
{
	private String city;
	
	public static void main(String[] args) {
		
		
	System.out.println("*** Truck ***");
	Vehicle v1 = new Truck("Red", 1500000.00);
	
	System.out.println("=====================\n");
	
	System.out.println("*** Bus ***");
	Vehicle v2 = new Truck("Yellow", 1000000.00);
	
	System.out.println("=====================\n");
	
	System.out.println("*** Car ***");
	Vehicle v3 = new Truck("White", 1200000.00);
	}

}