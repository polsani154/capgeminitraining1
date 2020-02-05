import java.util.Scanner;


public class exercise1 {

	public exercise1() {
		// TODO Auto-generated constructor stub
	}
	public int calculateSum(int n)
	{
		int temp=n/3;
		int sum=0;
		sum=(temp*(temp+1))/2;
		sum=sum*3;
		int temp2=n/5;
		int counter=0;
		for(int i=1;i<=temp2;i++)
		{
			counter++;
			if(!(counter==3))
			{
				System.out.print(5*i +"+ ");
				sum=sum+(5*i);
			}
			else{
				counter=0;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exercise1 ob=new exercise1();
		System.out.println("Enter a natural number");
		Scanner dc = new Scanner(System.in);
		System.out.println(ob.calculateSum(dc.nextInt()));
	}

}
