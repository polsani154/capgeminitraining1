package practice;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class sampledate {

	public sampledate() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		LocalDate d=new LocalDate(2019, 10, 19);/
		LocalDate a=LocalDate.now();
		LocalDate b=LocalDate.of(2020, 10, 19);
		LocalDate c=LocalDate.of(2021, 5, 18);
		
		LocalDateTime a1=LocalDateTime.now();
		LocalDateTime b1=LocalDateTime.of(2020, 10, 19, 23, 22);
		LocalDateTime c1=LocalDateTime.of(2020, 10, 19, 22, 21);
		System.out.println(c1.isAfter(a1) && c1.isBefore(b1));
		System.out.println(c.isAfter(a) && c.isBefore(b));
//		System.out.println(a);
//		System.out.println();
//		System.out.println(b);
		

	}

}
