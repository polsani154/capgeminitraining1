package exercise3;

public class primenumbers {

	public primenumbers(int n) {
		// TODO Auto-generated constructor stub
		for(int i=2;i<n;i++)
		{
			boolean prime=true;
			for(int j=2;j<i;j++)
			{
				//System.out.println(i/j==1);
				if(i%j==0)
				{	
					prime=false;
					break;
				}
			}
			if(!prime)
			{
				continue;
			}
			System.out.print(i+" ");
		}
	}
	public static void main(String []args)
	{
		primenumbers a=new primenumbers(10);
	}

}
