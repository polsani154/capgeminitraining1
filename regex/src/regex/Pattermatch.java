package regex;

import java.util.Collections;
import java.util.regex.Pattern;

public class Pattermatch {

	public Pattermatch() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args)
	{
		byte x=(byte)1000L;
//		l y=(byte)1000;
		
		System.out.println(Pattern.matches("p*[a-z]*", "polsani"));
		System.out.println(Pattern.matches(".*[\\.\\.]+.*", "hello .. sanadeep"));
		System.out.println(Pattern.matches("[0-9A-Za-z]+(\\.)*[0-9A-Za-z]*@gmail.com","polsanisandeep@gmail.com"));
		System.out.println(Pattern.matches("[a-zA-Z0-9@.]*", "polsani.sandeep@gmail.com"));
		String s="polsani";
//		System.out.println(Collections.reverseOrder(s));
	
	}
	
}
