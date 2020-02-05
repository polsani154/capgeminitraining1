import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileRead {

	public FileRead() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("abc.txt");
		//System.out.println(fr.read());
		//System.out.println((char)fr.read());
		int r=fr.read();
		while(r!=-1)
		{
			
			System.out.println((char)r);
			r=fr.read();
			
		}

	}

}
