import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class sysin {

	public sysin() {
		// TODO Auto-generated constructor stub
	}
	private static float temp()
	{
		 float a=21;
		return --a;
	}
	public static void main(String[] args) throws IOException
	{
//		int n=System.in.read();
//		System.out.println(n);
		int inp=1_000_000;
		System.out.println(inp);
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		String s=br.readLine();
		System.out.println(s);
		int a=br.read();
		//String s=System.in.read();
	}

}
