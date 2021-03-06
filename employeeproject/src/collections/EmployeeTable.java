package collections;
import entities.*;

import java.util.*;
import controllers.EmployeeDAO;
public class EmployeeTable {

	static int id=1;
	private static HashMap<Integer,Employee> data=new HashMap<Integer,Employee>();
	public  EmployeeTable() {
		// TODO Auto-generated constructor stub
	}
	public static int add(Employee e)
	{
		int key=id;
		e=data.put(id, e);
	
//		e=data.put(id,e);
		if(e!=null)
		{
			++id;
			return key;
		}
		else
		{
			return 0;
		}
		
	}
	public static Employee remove(int key)
	{
		if(!data.containsKey(key))
		{
			System.out.println("No data exists with id:"+key);
			return null;
		}
		Employee e=data.get(key);
		e=data.remove(key);
		return e;
	}
	public static Employee getEmployeeDetails(int key)
	{
		return data.get(key);
	}
	public static String getEmployeeName(int key)
	{
		return data.get(key).getName();
	}
	public static double getEmployeeSalary(int key)
	{
		return data.get(key).getSalary();
	}
	
}
