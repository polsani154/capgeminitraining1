package controllers;

public class AgeValidation extends Exception {

	public AgeValidation(String s) {
		// TODO Auto-generated constructor stub
		System.err.println(s);
	}
	public void message()
	{
		System.err.println("Age constraint is not satisfied");
	}
} 