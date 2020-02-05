package exercise8;

import java.util.Scanner;

public class PositiveString {

	public PositiveString() {
		// TODO Auto-generated constructor stub
	}
	
	//checks weather the string is positive or not
	public boolean ispositive(String s)
	{
		for (int i = 0; i < s.length()-1; i++) {
			if(s.charAt(i)>s.charAt(i+1))
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		PositiveString ps=new PositiveString();
		System.out.println("Enter a string");
		System.out.println("Is positive ? ->"+ps.ispositive(sc.next()));
		
	}

}
