class Ravi extends Thread
{
	public void run()
	{
		     try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		     System.out.println(Thread.currentThread().getName()+"ravi");
		     //System.out.println(Thread.getAllStackTraces());
		     
	}
}
class counter extends Thread
{
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			try {
				sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(i+" ");
		}
	}
}
class Kumar extends Thread
{
	public void run()
	
	{
		
		for (int i=0;i<5;i++)
		
		{
		     try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		     System.out.println(Thread.currentThread().getName()+"kumar");	
		}
		     
	}
}
public class threads {

	public threads() {
		// TODO Auto-generated constructor stub
		}

	public static void main(String[] args) throws InterruptedException {
		Thread.sleep(3000);
		// TODO Auto-generated method stub

		Kumar k=new Kumar();
		Ravi r=new Ravi();
		counter c=new counter();
		c.start();
		k.start();
		r.start();
		System.out.println(Thread.currentThread().getName());
	}

}
