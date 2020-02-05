package exerxise1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDataThread extends Thread  {

	public CopyDataThread() {
		// TODO Auto-generated constructor stub
	}
	public void run() 
	{
		// TODO Auto-generated method stub
		File f=new File("source.txt");

		File f2=new File("target.txt");
		
		FileReader fr;
		try {
			fr = new FileReader(f);
			FileWriter wr;
	
			wr = new FileWriter(f2);

		BufferedReader br=new BufferedReader(fr,10);
		BufferedWriter bw=new BufferedWriter(wr,10);
		int ch=0;
		int counter=0;
		
		while((ch=br.read())!=-1)
		{
			wr.write((char)ch);
			counter++;
			if(counter==10)
			{
				counter=0;
				System.out.println("10 characters read");
				Thread.sleep(5000);
				
			}
		}
		bw.flush();
		bw.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
