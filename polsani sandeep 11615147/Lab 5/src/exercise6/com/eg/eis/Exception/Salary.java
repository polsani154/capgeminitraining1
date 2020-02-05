package exercise6.com.eg.eis.Exception;

import java.util.Scanner;

public class Salary {

	public Salary() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws EmployeException {
		// TODO Auto-generated method stub
		int salary;
		Scanner sc=new Scanner(System.in);
		salary=sc.nextInt();
		if(salary<3000)
		{
			throw new EmployeException("Your salary is too low to survive");
		}
		else
		{
			System.out.println("You have good salary");
		}
	}

}
