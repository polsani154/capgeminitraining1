package controllers;

import java.io.*;
public class validator {

	public validator() {
		// TODO Auto-generated constructor stub
	}
	public static int checkage(int age) 
	{
		if(age<18 || age>50)
		{
			age=0;
			try {
				throw new AgeValidation("Age constraint is not satisfied");
			} catch (AgeValidation e) {
				// TODO Auto-generated catch block
				e.message();
			}
		}
		return age;
	}
	public static double checksalary(double salary) throws salaryException
	{
		if(salary<0)
		{
			salary=0.0;
			throw new salaryException("Age should not be negative");
		
		}
		return salary;
	}
	

}
