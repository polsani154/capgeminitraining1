package exercise5;

import java.util.Scanner;

public class Digitmodifier {

	public Digitmodifier() {
		// TODO Auto-generated constructor stub
	}
	public int modifier(int num)
	{
		String s=""+num;
		String b="";
		int len=s.length()-1;
		char ch=s.charAt(len);
		len--;
		b=ch+b;
		while(len>=0)
		{
			
			b=Math.abs(Integer.parseInt(s.charAt(len+1)+"")-Integer.parseInt(s.charAt(len)+""))+b;
			len--;
		}
		int result=Integer.parseInt(b);
		return result;
	}
	public static void main(String[] args)
	{
		Digitmodifier d=new Digitmodifier();
		System.out.println("ENter an Integer");
		Scanner sc=new Scanner(System.in);
		System.out.println(d.modifier(sc.nextInt()));;
	}
	
}
