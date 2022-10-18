package com.masai;

public class Bike implements Vehicle {
	public void ride() {
		System.out.println("Ride Started...");
	}

	@Override
	public void go() {
		// TODO Auto-generated method stub
		ride();
	}
}
