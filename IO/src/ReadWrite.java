import java.io.FileWriter;
import java.io.IOException;


public class ReadWrite {

	public ReadWrite() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("abc.txt");
		fw.write("Hello Polsani");
		fw.write(5);
		fw.flush();
		fw.close();
		
		
	}

}
