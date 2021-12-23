package com.assignment.shape3d;

public class Sphere extends Shape3D
{
	private double radius;
	
	public Sphere(double radius) {
		super();
		this.radius = radius;
	}
	@Override
	public void volume()
	{
		System.out.println("Sphere volume: "+((4/3)*3.142*radius*radius*radius));
	}
	public void surfaceArea()
	{
		System.out.println("Sphere surface Area: "+(4*3.142*radius*radius));
	}
	

}
