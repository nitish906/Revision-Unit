package com.masai;

public class Travel {
	//Car c=new Car();
	//Bike b=new Bike();
	
	//object type dependency
	private Vehicle v;
	
	//simple type dependency
	private int numberOFPersion;
	
	//injection pont--setter injection point
	public void setV(Vehicle v) {
		this.v = v;
	}
	// injection point --setter injection point
	public void setNumberOFPersion(int numberOFPersion) {
		this.numberOFPersion = numberOFPersion;
	}
	
	
	
	//constructor injection point
//	public Travel(Vehicle v) {
//		super();
//		this.v = v;
//	}
	
	


	




	public void journey() {
		//c.start();
		//b.ride();
		v.go();
		
		System.out.println("Jounrney started...");
		System.out.println("Number of Persion are: "+numberOFPersion);
	   }


	

	
}