import java.util.Scanner;


public class Video  extends MediaItem{

	private int year;
	private String genre;
	private String director;
	Scanner sc=new Scanner(System.in);
	public Video() {
		// TODO Auto-generated constructor stub
		super();
		System.out.println("Enter the name of director");
		setDirector(sc.next());
		System.out.println("Enter the Year of release");
		setYear(sc.nextInt());
		System.out.println("Enter the Genre");
		setGenre(sc.next());
	}

	public Video(int id,String name,int runtime,int copies)
	{
		super(id,name,runtime,copies);
		System.out.println("Enter the name of director");
		setDirector(sc.next());
		System.out.println("Enter the Year of release");
		setYear(sc.nextInt());
		System.out.println("Enter the Genre");
		setGenre(sc.next());		
	}

	public int getYear() {
		return year;
	}
	public void print()
	{
		super.print();
		System.out.println("Year of release :"+getYear()+"\n"+
							"Director :"+getDirector()+"\n"+
							"Genre :"+ getGenre()+ "\n");
	}
	public void setYear(int year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
}
