package exercise1;

import java.util.Scanner;

public class stringTokenizer{

	public int conversion(String s) {
		// TODO Auto-generated constructor stub
		String arr[]=s.split(" ");
		int sum=0;
		System.out.println("Entered Integers are");
		for(int i=0;i<arr.length;i++)
		{
			
			try
			{
			sum+=Integer.parseInt(arr[i]);
			System.out.print(arr[i]+" ");
			}
			catch(NumberFormatException e)
			{
				System.out.println("something is not right");
			}
		}
		//System.out.println(s.split(" "));
		System.out.println(" ");
		return sum;
	}
	
	
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		;
		int sum=0;
		String s=sc.nextLine();
		stringTokenizer c=new stringTokenizer();
		System.out.println("sum is "+c.conversion(s));
		System.err.print("What the Heck ?");
		
	}

}
