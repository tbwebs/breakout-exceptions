package com.revature.boexception;

//#1
public class InevitableException extends Exception {
	
    //#2 Constructor for TooHighNumber, super() is constructor for parent class
	public InevitableException(int i) {
		
		//calling parameterized constructor for parent class using super()
		super("The number " + i + " is too high!");

	}

}