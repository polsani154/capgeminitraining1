package faculty;

import java.util.Scanner;

public class facultyDetails {

	public facultyDetails() {
		// TODO Auto-generated constructor stub
	}
	
	public static void getFacultyDetails(faculty f){
		System.out.println(" ID: "+f.getId());
		System.out.print("Name: "+f.getName());
		System.out.println(" teaches "+f.getSubject());
		
	}
	public static void setFacultyDetails(faculty f)
	{
		Scanner s = new Scanner(System.in);	
		
		System.out.println("Please enter name");
		f.setName(s.next());
		System.out.println("What subject he teach ?");
		f.setSubject(s.next());
	}
	

}
