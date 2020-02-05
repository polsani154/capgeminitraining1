package services;
import controllers.salaryException;
import entities.*;
public interface IEmployeeService {
	
	void getEmployeeDetails();
	void getEmployeeSalary();
	void getEmployeeName();
	void addEmployee() throws salaryException;
	void removeEmployee();
}
