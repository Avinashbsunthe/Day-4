package com.animal;

public class Zoo {
	public static void main(String[] args) 
	{
		System.out.println("*** Tiger ***");
		Animal t = new Tiger("Yellow & black",200.00);
		t.sound();
		t.climb();
		System.out.println();
		
		System.out.println("*** Elephant ***");
		Animal e = new Elephant("Black", 500.00);
		e.sound();
		e.climb();
	}

}
