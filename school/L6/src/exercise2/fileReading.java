package exercise2;

import java.io.*;

public class fileReading {

	public fileReading() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws FileNotFoundException,IOException {
		// TODO Auto-generated method stub
		//FileInputStream f=new FileInputStream("sample.txt");
		//BufferedInputStream bis=new BufferedInputStream(f);
		
		
		FileReader fr=new FileReader("sample.txt");
		BufferedReader bf=new BufferedReader(fr);
		String s=bf.readLine();
		int line_count=1;
		while(s!=null)
		{
			System.out.println(line_count+") "+s);
			s=bf.readLine();
			line_count++;
		}
		//f.read()
	
	}

}
