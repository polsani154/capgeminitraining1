package controllers;
import java.util.Collections;

import collections.*;
import entities.*;
public class EmployeeDAO implements IEmployeeDAO{

	public EmployeeDAO() {
		// TODO Auto-generated constructor stub
	}

	public Employee getEmployeeDetails(int key) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e=EmployeeTable.getEmployeeDetails(key);
		return e;
	}

	public void removeEmployee(int key) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e=EmployeeTable.remove(key);
		if(e!=null)
		{
		System.out.println("Employee named: "+e.getName()+" is successfully deleted");
		return;
		}
		System.out.println("Data with this key not exists");
		
		}

	public double getEmployeeSalary(int key) {
		// TODO Auto-generated method stub
		return EmployeeTable.getEmployeeSalary(key);
	}

	public String getEmployeName(int key) {
		// TODO Auto-generated method stub
		return EmployeeTable.getEmployeeName(key);
	}

	public int addEmployee(Employee e) {
		// TODO Auto-generated method stub
		return EmployeeTable.add(e);
	}


}
