package exercise5;

import java.util.Scanner;

class AgeLimitException extends Exception
{
	public AgeLimitException()
	{
		System.out.println("You are not elegible because U are under age");
	}
	
}
public class Age {

	public Age() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;

		try
		{
			Scanner sc=new Scanner(System.in);
			age=sc.nextInt();
			if(age<18)
			{
				throw new AgeLimitException();
			}
			System.out.println("You are eligible for this offer");
		}catch(AgeLimitException e)
		{
			
		}

	}

}
