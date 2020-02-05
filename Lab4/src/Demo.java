import java.util.Scanner;


public class Demo {

	public Demo() {
		// TODO Auto-generated constructor stub
	}
	public static int sumofcubes(int n)
	{
		int sum=0;
		while(n>0)
		{
			sum+=Math.pow(n%10, 3);
			n=n/10;
		}
		return sum;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number");
		System.out.println(Demo.sumofcubes(sc.nextInt())); 
	}

}
