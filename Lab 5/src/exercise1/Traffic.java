package exercise1;

import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;


public class Traffic {

	public Traffic() {
		// TODO Auto-generated constructor stub,
	}
	public static void main(String []args)
	{
		int ch;
		Scanner sc=new Scanner(System.in);

		
		while(true)
		{
			System.out.println("1.Red \n 2.Yellow \n3. Green");
			ch=sc.nextInt();
		switch(ch)
		{
		case 1:
		{
			System.out.println(" Stop ");
			break;
		}
		case 2:
		{
			System.out.println("Ready");
			break;
		}
		case 3:
		{
			System.out.println("Go");
			break;
		}
		default:
		{
			System.out.println("wrong option");
		}
		
		}
		}
	}

}
