
public class synchronised {

	public synchronised() {
		// TODO Auto-generated constructor stub
	}
	
	synchronized public void printnumbers() throws InterruptedException
	{
		System.out.println();
		for (int i = 1; i < 27; i++) {
			System.out.print(" "+i);
			Thread.sleep(100);
//			notify();
//			wait();
		}
	}
	synchronized public void printletters() throws InterruptedException
	{
		for (int i = 65; i < 91; i++) {
			
			System.out.print((char)i);
			Thread.sleep(100);
//			notify();
//			wait();
			
		}
	}
	synchronized public void printsmallletters() throws InterruptedException
	{
		for (int i = 97; i < 123; i++) {
			
			System.out.print((char)i);
			Thread.sleep(100);
//			notify();
//			wait();
			
		}
	}
	public static void main(String[] args)
	{
	
		final synchronised sync=new synchronised();
		Thread t1=new Thread(){
			public void run()
			{
				try {
					sync.printletters();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread t2=new Thread(){
			public void run()
			{
				try {
					sync.printnumbers();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread t3=new Thread(){
			public void run()
			{
				try {
					sync.printsmallletters();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		t1.setName("letters");
		t2.setName("numbers");
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
