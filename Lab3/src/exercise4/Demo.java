package exercise4;

public class Demo {

	public Demo() {
		// TODO Auto-generated constructor stub
	}
	public static void frequency(char[] arr)
	{
		for(int i=48;i<123;i++)
		{
			int k=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]==(char)i)
				{
					k++;
				}
			}
			if(k>0)
			{
				System.out.println((char)i+" frequency : "+k);
			}
		}
	}
	
	public static void main(String[] args)
	{
		char arr[]={'f','e','k','l','p','s','S','S','?',',','/','/','p','p','p'};
		Demo.frequency(arr);
	}
}
