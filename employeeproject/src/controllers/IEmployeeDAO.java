package controllers;
import entities.*;
public interface IEmployeeDAO {
	
	int addEmployee(Employee e);
	Employee getEmployeeDetails(int key);
	void removeEmployee(int key);
	double getEmployeeSalary(int key);
	String getEmployeName(int key);
	

}
