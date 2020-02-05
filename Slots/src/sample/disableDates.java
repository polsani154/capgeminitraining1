package sample;

import java.util.Date;

public class disableDates {

	public disableDates() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args)
	{
		Date d=new Date();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print("hai");
			}
			System.out.println();
		}
		System.out.println(d.getDay()==0);
	}

}
