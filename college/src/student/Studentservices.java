package student;

public class Studentservices {

	public Studentservices() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean ismarksassigned(student s)
	{
		if(!s.isIsattendedfortest())
		{
			System.out.println("Student is not attended for test");
			return false;
		}
		if(!s.isIsmarksassigned())
		{
			System.out.println("Please assign marks before you proceed");
			return false;
		}
		return true;
	}
	
	public void highestmarks(student s)
	{
		if(!this.ismarksassigned(s))
		{
			System.out.println("Marks are not assigned yet");
			return ;
		}
		int highindex=0;
		for(int i=0;i<5;i++)
		{
			if(s.getMark(highindex)<s.getMark(i))
			{
				highindex=i;
			}
		}
		System.out.println(s.getMark(highindex));
		return;
	}
	public int sumofmarks(int []marks)
	{
		int sum=0;
		for(int i=0;i<marks.length;i++)
		{
			sum+=marks[i];
		}
		return sum;
	}
	public int averagemarks(student s)
	{
		if(!this.ismarksassigned(s))
		{
			System.out.println("Marks not assigned");
			return 0;
		}
		return sumofmarks(s.getMarks())/s.getMarks().length;
	}
	public void result(student s)
	{
		if(sumofmarks(s.getMarks())>150)
		{
			System.out.println(s.getName()+" has passed the test");
		}else
		{
			System.out.println(s.getName()+" has failed the test");
		}
	}
	
	
	

}
