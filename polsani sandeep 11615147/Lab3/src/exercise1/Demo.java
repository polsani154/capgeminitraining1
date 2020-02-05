package exercise1;

public class Demo {


	public Demo() {
	
		// TODO Auto-generated constructor stub
	}
	public int second_smallest(int[] arr)
	{
		int min=arr[0];
		int max=arr[0];
		int sec_min;
		for(int i=1;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		sec_min=max;
		for(int i=0;i<arr.length;i++)
		{
			if(min<arr[i] && sec_min>arr[i])
			{
				sec_min=arr[i];
			}
		}
		return sec_min;
	}
	
	public String[] stringSort(String[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[j].compareTo(arr[i])<0)
				{
					
					String s=arr[i];
					arr[i]=arr[j];
					arr[j]=s;
				}
			}
		}
		int startpointer=0;
		int endpointer=arr.length-1;
		
		while(startpointer<=endpointer)
		{
			arr[startpointer]=arr[startpointer].toUpperCase();
			startpointer++;
			if(startpointer<endpointer)
			{
				arr[endpointer]=arr[endpointer].toLowerCase();
				endpointer--;
			}
		}
		
		return arr;
	}

	public static void main(String[] args)
	{
		int arr[]={1,18,6,5,8,16,32,12,89,52,5};
		String string_arr[]={"polsani","ant","lion","keys","donkey"};
		Demo d=new Demo();
		System.out.println(d.second_smallest(arr));
		string_arr=d.stringSort(string_arr);
		for(int i=0;i<string_arr.length;i++)
		{
			System.out.println(string_arr[i]);
		}
		
	}

}
