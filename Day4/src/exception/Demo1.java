package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo1 {

	public Demo1() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);

		try {
			/* System.out.println("Exit from class");
			System.out.println("Reach ground floor using lift");
			System.out.println("Reach ground floor using stairs");
			System.out.println("Head towards your hostel");
			System.out.println("Punch ID card at gate");
			System.out.println("Enter room"); */
			System.out.println("Enter two integers");
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			System.out.println(num1/num2);
			
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			System.out.println("Please Don't enter characters or STring ");
		}
		catch (ArithmeticException e)
		{
			System.out.println("2nd number should not be 0");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Better luck next time");
		}
		
	}

}
