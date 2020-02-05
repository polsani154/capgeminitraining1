import java.io.File;
import java.io.IOException;
public class createDemo {

	public createDemo() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) throws IOException
	{
		
		// By using file class you can either create a file or folder But you cannot write or read
		
		File f=new File("C:\\Users\\POLSANI\\Desktop\\abc.text");
		System.out.println("checking... "+f.exists());
		f.createNewFile();
		System.out.println("checking.....   "+f.exists());
		
		File file=new File("movies");
		System.out.println(file.exists());
		file.mkdir();
		System.out.println(file.exists());
	}
}
