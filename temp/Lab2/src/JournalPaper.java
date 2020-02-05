import java.util.Scanner;


public class JournalPaper  extends WrittenItem{

	private int year;
	Scanner sc=new Scanner(System.in);
	public JournalPaper() {
		// TODO Auto-generated constructor stub
		super();
		System.out.println("Enter the year of release");
		setYear(sc.nextInt());
		
	}
	public JournalPaper(int id,String name,String author,int copies,int year)
	{
		super(id,name,author,copies);
		setYear(year);
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void print()
	{
		super.print();
		System.out.println("published Year is: "+getYear());
	}
	
}
