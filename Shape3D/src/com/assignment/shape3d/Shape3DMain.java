package com.assignment.shape3d;

public class Shape3DMain 
{
	public static void main(String[] args) {
		
		Shape3D s1 = new Cylinder(5.0, 2.5);
		s1.volume();
		s1.surfaceArea();
		
		System.out.println("\n===============================\n");
		
		Shape3D s2 = new Sphere(5.0);
		s2.volume();
		s2.surfaceArea();
		
		System.out.println("\n===============================\n");
		
		Shape3D s3 = new Cube(5.0);
		s3.volume();
		s3.surfaceArea();
		
		
	}

}
