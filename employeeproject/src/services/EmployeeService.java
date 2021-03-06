package services;
import controllers.*;

import java.util.Scanner;

import javax.xml.validation.Validator;

import collections.EmployeeTable;
import entities.Employee;


public class EmployeeService implements IEmployeeService {

	
	Scanner sc=new Scanner(System.in);
	public EmployeeService() {
		// TODO Auto-generated constructor stub
		System.out.println("WELCOME");
	}

	public void getEmployeeDetails() {
		// TODO Auto-generated method stub
		System.out.println("Enter id to get employee Details");
		int key=sc.nextInt();
		EmployeeDAO emp=new EmployeeDAO();
		Employee employee=emp.getEmployeeDetails(key);
		if(employee!=null)
		{
			System.out.println("ID: "+key);
			System.out.println("Name: "+employee.getName());
			System.out.println("Age: "+employee.getAge());
			System.out.println("Department: "+employee.getDepartment());
			System.out.println("Salary"+employee.getSalary());
		}
		else
		{
			System.out.println("no EMPLOYEE found with ID :"+key);
		}
	}

	public void getEmployeeSalary(){
		// TODO Auto-generated method stub
		System.out.println("Enter id to get employee salary");
		int key=sc.nextInt();
		EmployeeDAO emp=new EmployeeDAO();
		System.out.println(emp.getEmployeeSalary(key));
	}

	public void getEmployeeName() {
		System.out.println("Enter id to get employee name");
		int key=sc.nextInt();
		// TODO Auto-generated method stub
		EmployeeDAO emp=new EmployeeDAO();
		System.out.println(emp.getEmployeName(key));
	}

	public void addEmployee() throws salaryException {
		
		// TODO Auto-generated method stub
		Employee e=new Employee();
		System.out.println("Enter name");
		e.setName(sc.next());
		System.out.println("Enter age greater than 18");
		int age=sc.nextInt();
		while(validator.checkage(age)==0)
		{
			System.out.println("please re-enter the age 0 to exit");
			age=sc.nextInt();
			if(age==0)
			{
				return;
			}
		}
		e.setAge(age);
		System.out.println("Enter department");
		e.setDepartment(sc.next());
		System.out.println("Enter salary greater than 0");
		double salary=sc.nextDouble();
		while(validator.checksalary(salary)==0)
		{
			System.out.println("please re-enter the salary, or 0 to mainmenu");
			salary=sc.nextDouble();
			if(salary==0)
			{
				return;
			}
		}
		e.setSalary(salary);
		EmployeeDAO emp=new EmployeeDAO();
		int key=emp.addEmployee(e);
		if(key!=0)
		{
			System.out.println("Employee added with id number "+key);
			return;
		}
		System.out.println("employeee not added try again");
		
	}

	public void removeEmployee() {
		// TODO Auto-generated method stub
		System.out.println("Enter Employee Id to remove");
		int key =sc.nextInt();
		EmployeeDAO emp=new EmployeeDAO();
		emp.removeEmployee(key);
	}
	public void mainmenu()
	{
		System.out.println("Welcome to Employee management system \n"
				+ "1. Add an employee\n"
				+ "2. Remove an employee\n"
				+ "3. Get employee Details\n"
				+ "4. Get employee name\n"
				+ "5. Get Employee salary\n"
				+ "6. Exit");
	}
	

}
