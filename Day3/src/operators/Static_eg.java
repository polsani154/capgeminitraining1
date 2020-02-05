package operators;

public class Static_eg {

	 	static int a;
	 	public int b;
	 	public Static_eg()
	 	{
	 	    a++;
	 	}
	 	public void display()
	 	{
	 		System.out.println(a + " " + b);
	 	}
	 	
	 	public static void main(String[] args)
	 	{
	 		Static_eg obj1=new Static_eg();
	 		Static_eg obj2=new Static_eg();
	 		Static_eg obj3=new Static_eg();
	 		System.out.println(obj3.a);
	 		System.out.println(obj3.b);
	 		
	 	} 
	 }

