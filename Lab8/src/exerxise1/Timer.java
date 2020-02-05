package exerxise1;

import java.util.Date;

public class Timer extends Thread {
	
	public void run()
	{

//		System.out.println("Im running");
		while(true)
		{
			
			try {
				Date date=new Date();
				System.out.println(date.getHours()+":"+date.getMinutes()+":"+date.getSeconds());
				Thread.sleep(10000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public Timer() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer time=new Timer();
		Thread th=new Thread(time);
		
		th.start();
		

	}

}
