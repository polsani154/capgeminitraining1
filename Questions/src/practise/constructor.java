package practise;
 
class myException extends Exception
{
	
}

class A
{
	int i;
	public A(int x) {
		// TODO Auto-generated constructor stub

	}
	public A()
	{
		try
		{
			System.out.println("hello");
			throw new myException();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	void A(int x)
	{
		this.i=x;
	}
}
public class constructor extends A {

	int j;
	public constructor() {
		// TODO Auto-generated constructor stub
		super(5);
	}
	public constructor(int x,int y) {
		// TODO Auto-generated constructor stub
		super(x);
		this.j=y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		A b=new A();
		A c=a;
		
	}

}
