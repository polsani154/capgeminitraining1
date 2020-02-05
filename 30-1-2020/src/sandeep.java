
class S  extends Thread 
{
	public void run()
	{	
		try {
	
		for(int i=0;i<5;i++)
		{
			if(i%2==0)
			{
				for (int j = 0; j < 6; j++) {
				
						Thread.sleep(120);
						System.out.print("#");
					}
					
				}
			
			if(i==1)
			{
				System.out.print("#     ");
				Thread.sleep(1200);
			}
			if(i==3)
			{
				System.out.print("     #");
				Thread.sleep(1200);
			}
			System.out.print(" ");
			Thread.sleep(1220);
		
		}
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
class A extends Thread
{
	public void run()
	{
		try
		{
			Thread.sleep(1200);
		for(int i=0;i<5;i++)
		{
			if(i==0 || i==2)
			{
				for (int j = 0; j < 6; j++) {
					Thread.sleep(200);
					System.out.print("#");
				}
			}else
			{
				Thread.sleep(200);
				System.out.print("#");
				for (int j = 0; j < 4 ; j++) {
					Thread.sleep(200);
				    System.out.print(" ");
				}
				Thread.sleep(200);
				System.out.print("#");
			}
			System.out.println();
//			System.out.println();
//			Thread.sleep(1220);
			
		}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
class N extends Thread
{
	public void run()
	{
		for (int i = 0; i < 5; i++) {
			System.out.print("#");
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			if(i!=0)
			System.out.print("#");
			
			for (int j = i; j < 4; j++) {
				System.out.print(" ");
			}
			System.out.print("#");
			System.out.println("");
		}
	}
}
class D extends Thread
{
	public void run()
	{
		for (int i = 0; i < 5; i++) {
			System.out.print("#");
			if(i==0 || i==4)
			{
				for (int j = 0; j < 3; j++) {
					System.out.print("#");
				}
			}
			if(i==1 || i==3)
			{
				for (int j = 1;j<4; j++) {
					System.out.print(" ");
				}
				System.out.print("#");
			}
			if(i==2)
			{
				for (int j = 1;j<5; j++) {
					System.out.print(" ");
				}
				System.out.print("#");
			}
			System.out.println();	
		}
		
	}
}
class E extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			if(i%2==0)
			{
				System.out.println("######");
			}
			else
			{
				System.out.println("#     ");
			}
		}
	}
}
class P extends Thread
{
	public void run()
	{
		for (int i = 0; i < 5; i++) {
			System.out.print("#");
			if(i==0 || i==2)
			{
				System.out.print("####");
			}
			if(i==1)
			{
				System.out.print("    #");
			}
			System.out.println();
		}
	}
}
class nextline extends Thread
{
	public void run()
	{
		try {
			Thread.sleep(2410);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
	}
}
public class sandeep extends Thread {

	public sandeep() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String []args)
	{
		N n=new N();
		S s=new S();
		A a=new A();
		D d=new D();
		E e1=new E();
		E e2=new E();
		P p=new P();
		nextline next=new nextline();
//		next.start();
		s.start();
		a.start();
		
//		n.start();
//		d.start();
//		e1.start();
//		e2.start();
//		p.start();
	}

}
