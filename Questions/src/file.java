import java.io.*;
import java.util.Properties;


public class file {

	public file() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("sample.txt");
		File g=new File("sample.txt");
		FileReader fr=new FileReader("sample.txt");
		System.out.println(f.exists());
		g.createNewFile();
		System.out.println(g.hashCode());
		Properties props=new Properties();
		System.out.println("true");

	}

}
