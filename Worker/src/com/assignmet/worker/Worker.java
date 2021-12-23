/*Exercise 5:Create a class called Worker. Write classes DailyWorker and SalariedWorker that
 inherit from Worker.Every worker has a name and a salaryrate. Write method Pay (int hours) to compute 
the week pay of every worker.  A Daily worker is paid on the basis of the number of days 
she/he works.The salaried worker gets paid the wage for 40 hours a week no matter what the
actual hours are.  Test this program to calculate the pay of workers.*/

package com.assignmet.worker;



public class Worker
{
	private String name;
	private double salaryRate,salary;
	private int hour;
	
	public Worker(String name, double salaryRate, int hour) {
		super();
		this.name = name;
		this.salaryRate = salaryRate;
		this.hour = hour;
	}
	public void pay(int hour)
	{
		salary=salaryRate*hour;
	}
	public void display()
	{
		System.out.println("Name of the worker: "+this.name);
		System.out.println("No. of hours worked: "+this.hour);
		System.out.println("salary of the worker: "+this.salary);
	}

}
