package Teacher;
import java.util.Scanner;

import student.*;
public class teacher {

	public teacher() {
		// TODO Auto-generated constructor stub
	}
	
	public student addstudent()
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter regno :");
		int temp_regno=sc.nextInt();
		System.out.println("What is his name ?");
		String temp_name=sc.next();
		System.out.println("Which standard is he joining ?");
		int temp_standard=sc.nextInt();
		student s = new student(temp_regno,temp_name,temp_standard);
		return s;
	}
	
	public void attendancemark(student s)
	{
		s.setIsattendedfortest(true);
		
	}
	public void assignmarks(student s)
	{
		Scanner sc=new Scanner(System.in);
		if(!s.isIsattendedfortest())
		{
			System.out.println(s.getName()+" has not attended the test");
			return;
		}
		System.out.println("Name :"+s.getName());
		int[] temp_marks=new int[5];
		System.out.println("Enter marks in Maths ");
		temp_marks[0]=sc.nextInt();
		System.out.println("Enter marks in Science");	
		temp_marks[1]=sc.nextInt();
		System.out.println("Enter marks in Hindi ");
		temp_marks[2]=sc.nextInt();
		System.out.println("Enter marks in Softskills ");
		temp_marks[3]=sc.nextInt();
		System.out.println("Enter marks in physical activities ");
		temp_marks[4]=sc.nextInt();	
		s.setMarks(temp_marks);
		s.setIsmarksassigned(true);
		System.out.println("Attendaance successfully marked ");
		
	}
	
	public static void main(String args[])
	{
		student s=new student(1,"sandeep",10);
		teacher t=new teacher();
		Studentservices service=new Studentservices();
		boolean n=true;
		while(n)
		{
			n=false;
			System.out.println("1. mark attendance");
			System.out.println("2. assign marks");
			System.out.println("3. gethighest mark \n "
					+ "4. check whether student is pass or fail \n"
					+ "5. Get average marks of student");
			
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();
			switch(choice){
			case 1:
			{
				t.attendancemark(s);
				System.out.println("press 1 to continue any other to exit");
				int ch=sc.nextInt();
				if(ch==1?true:false)
				{
					n=true;
				}
				break;
				
			}
			case 2:
			{
				t.assignmarks(s);
				System.out.println("successfully marked \n"
						+ "press 1 to continue any other to exit");
				int ch=sc.nextInt();
				if(ch==1?true:false)
				{
					n=true;
				}
				break;
			}
			case 3:
			{
				service.highestmarks(s);
				System.out.println(" \n"
						+ "press 1 to continue any other to exit");
				int ch=sc.nextInt();
				if(ch==1?true:false)
				{
					n=true;
				}
				break;
			}
			case 4:
			{
				service.result(s);
				System.out.println("\n"
						+ "press 1 to continue any other to exit");
				int ch=sc.nextInt();
				if(ch==1?true:false)
				{
					n=true;
				}
				break;
			}
			case 5:
			{
				System.out.println(service.averagemarks(s));
				
				System.out.println(" \n"
						+ "press 1 to continue any other to exit");
				int ch=sc.nextInt();
				if(ch==1?true:false)
				{
					n=true;
				}
				break;
			}
			default:
			{
				System.out.println("Wrong option \n"
						+ "press 1 to continue any other to exit");
				int ch=sc.nextInt();
				if(ch==1?true:false)
				{
					n=true;
				}
			}
			}

		}
		System.out.println("Bye");
		return;
	}

}
