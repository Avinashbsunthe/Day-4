package com.assignment.shape3d;

public class Cylinder extends Shape3D
{
	private double height,radius;
	
	public Cylinder(double height, double radius) {
		super();
		this.height = height;
		this.radius = radius;
	}
	@Override
	public void volume()
	{
		System.out.println("Cylinder volume: "+(3.142 * radius * radius * height));
	}
	@Override
	public void surfaceArea()
	{
		System.out.println("Cylinder surface area: "+(2*3.142*radius*height+2*3.142*radius*radius*radius));
	}

}
