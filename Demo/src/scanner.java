import java.util.Scanner;


public class scanner {

	
	public scanner() {
		// TODO Auto-generated constructor stub
	}

	class Polsani
	{
		
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		
		System.out.println(a>b?(a>c?a:c):(b>c?b:c));
		
		
	}

}
