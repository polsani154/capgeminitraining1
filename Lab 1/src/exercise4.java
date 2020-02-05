import java.util.Scanner;


public class exercise4 {

	public exercise4() {
		// TODO Auto-generated constructor stub
	}

	public boolean checkNumber(int n)
	{
		int k=2;
		while(k<=n)
		{
			if(k==n)
			{	
				return true;
			}
			k=k<<1;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		exercise4 ob = new exercise4();
		System.out.println(ob.checkNumber(sc.nextInt()));

	}

}
