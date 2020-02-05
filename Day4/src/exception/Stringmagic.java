package exception;

import java.util.Scanner;

public class Stringmagic {

	public Stringmagic() {
		// TODO Auto-generated constructor stub
	}
	public String magician(String s)
	{
		String k="";
		for(int i=0;i<s.length();i=i+2)
		{
			int num=(int)s.charAt(i);
			num=num-48;
			String temp="";
			for(int j=0;j<num;j++)
			{
				temp=temp+s.charAt(i+1);
			}
			k=k+temp;
		}
		return k;
	}
	public static void main(String []args)
	{
		String inp;
		Scanner sc=new Scanner(System.in);
		Stringmagic mag=new Stringmagic();
		System.out.println("Enter magic string");
		System.out.println(mag.magician(sc.next()));;
		
	}
}
