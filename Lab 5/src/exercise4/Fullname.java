package exercise4;

import java.util.Scanner;

class BlankNameException extends Exception
{
	public BlankNameException(String s)
	{
		System.out.println(s);
	}
	public void solution()
	{
		System.out.println("please restart and enter the name");
	}
}

public class Fullname {

	public Fullname() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String []args)
	{
		Scanner sc =new Scanner(System.in);
		String firstName;
		String lastName;
		System.out.println("Enter first name ");
		firstName=sc.nextLine();
		System.out.println("Enter last name ");
		lastName=sc.nextLine();
		
	
			try {
				if(firstName.isEmpty() && lastName.isEmpty())
				{
				throw new BlankNameException("Name should not be blank");
				
				}
//				if(firstName.isEmpty() && !lastName.isEmpty())
//				{
//					throw new BlankNameException("First name is empty");
//				}
//				if(!firstName.isEmpty() && lastName.isEmpty())
//				{
//					throw new BlankNameException("Last name is empty");
//				}
				
			} catch (BlankNameException e) {
				// TODO Auto-generated catch block
			
				System.err.println("error");
				e.solution();
			}
		
	}

}
