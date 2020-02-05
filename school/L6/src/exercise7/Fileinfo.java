package exercise7;

import java.io.File;
import java.util.Scanner;

public class Fileinfo {

	public Fileinfo(File f) {
		// TODO Auto-generated constructor stub
		if(f.exists())
		{
			System.out.println("File exists");
			System.out.println("Is file readable: "+f.canRead());
			System.out.println("Isfile writable: "+f.canWrite());
			//System.out.println(f.getName());
			System.out.println("File type is: "+f.getName().substring(f.getName().lastIndexOf(".")+1,((f.getName().length()))));
			System.out.println("File size: "+f.length());
		}else
		{
			System.out.println("Sorry file does not exist");
		}
		
		
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		File f=new File(sc.next());	
		Fileinfo fi=new Fileinfo(f);
	}
}
