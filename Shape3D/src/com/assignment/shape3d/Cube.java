package com.assignment.shape3d;

public class Cube extends Shape3D
{
	private double side;

	public Cube(double side) {
		super();
		this.side = side;
	}
	
	@Override
	public void volume()
	{
		System.out.println("Cube volume: "+(side*side*side));
	}
	@Override
	public void surfaceArea()
	{
		System.out.println("Cube surface area: "+(6*side*side));
	}

}
