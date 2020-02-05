import java.io.*;
public class Buffer {

	public Buffer() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException, InterruptedException
	{
		FileWriter fw = new FileWriter("demo2.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("hello");
		bw.newLine();
		bw.write("welcome");
		bw.newLine();
		bw.write("polsani");
		bw.flush();
		bw.close();
		FileReader fr=new FileReader("demo2.txt");
		BufferedReader bf=new BufferedReader(fr);
		
		//BufferedReader bf=new BufferedReader(new FileReader("demo2.txt"));
		
		String s=bf.readLine();
		while(s!=null)
		{
			System.out.println(s);
			s=bf.readLine();
			//bf.wait(500);
		}
		
	}
}
