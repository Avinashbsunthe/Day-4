package com.assignmet.worker;

public class WorkerMain
{
	public static void main(String[] args) {
		
		Worker w1 = new DailyWorker("Avinash", 40.0, 15);
		w1.pay(15);
		w1.display();
		
		System.out.println();
		
		Worker w2 = new SalariedWorker("Abhishek", 40.0, 25);
		w2.pay(25);
		w2.display();
		
		
	}

}
