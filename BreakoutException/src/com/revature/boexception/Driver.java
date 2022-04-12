package com.revature.boexception;


public class Driver {
	public static void main(String[] args) {

		int i = 16;
		try {
			
			//#4  function to throw
			functionThatThrowsException(i);
			
		} catch (InevitableException c) {
			
			System.out.println(c);
		}
	}

	// #3 create function that throws your exception
	public static void functionThatThrowsException(int i) throws InevitableException {
		if (i > 15) {

			throw new InevitableException(i);

		}
	}
}