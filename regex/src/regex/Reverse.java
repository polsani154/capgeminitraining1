package regex;

import java.util.Collections;
import java.util.Scanner;
import java.lang.*;

public class Reverse {

	public Reverse() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args)
	{
	 	Scanner sc=new Scanner(System.in);
		String sen=sc.nextLine();
		String []arr=sen.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].matches("[A-z]*"))
			{
				StringBuilder sb=new StringBuilder();
				
				for (int j = arr[i].length()-1; j >= 0; j--) {
					sb.append(arr[i].charAt(j));
				}
				arr[i]=""+sb;
			}
		}
		sen="";
		for (int i = 0; i < arr.length; i++) {
			sen=sen+arr[i]+" ";
		}
		System.out.println(sen);
	}

}
