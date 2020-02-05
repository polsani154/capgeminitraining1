package exercise9;

import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Formatter;


public class Duration {

	public Duration() {
		// TODO Auto-generated constructor stub
	}
	public static void getDuration(Date d)
	{
		System.out.println(d.getYear());
		System.out.println(d.getMonth());
		System.out.println(d.getDate());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
//		DateFormat format=new DateFormat("dd-mm-yyyy");
		getDuration(d);
	}

}
