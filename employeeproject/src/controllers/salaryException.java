package controllers;

public class salaryException extends Exception{

	public salaryException(String s) {
		// TODO Auto-generated constructor stub
		System.out.println(s);
	}
	public void message()
	{
		System.err.println("Salary should not be negative");
	}
}
