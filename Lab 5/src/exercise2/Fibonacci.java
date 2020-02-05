package exercise2;

public class Fibonacci {

	public static double fibo(int n)
	{
		if(n==0 || n==1)
		{
			return 0;
		}
		if(n==2)
		{
			return 1;
		}
		return fibo(n-1)+fibo(n-2);
	}
	public Fibonacci() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String []args)
	{
		//Fibonacci.fibo(5);
		System.out.println((int)Fibonacci.fibo(25));
	}
}
