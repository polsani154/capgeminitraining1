import java.util.Scanner;


public class CD  extends MediaItem{

	private String artist;
	private int year;
	Scanner sc=new Scanner(System.in);
	
	public CD() {
		// TODO Auto-generated constructor stub
		super();
		System.out.println("Enter Artist name");
		setArtist(sc.next());
		System.out.println("Enter released year");
		setYear(sc.nextInt());
		
		
	}
	public CD(int id,String name,int runtime,int copies)
	{
		super(id,name,runtime,copies);
		System.out.println("Enter the arist");
		setArtist(sc.next());
		System.out.println("Enter the Yearof release");
		setYear(sc.nextInt());
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
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
		System.out.println("Artist :"+getArtist()+"\n"
				+ "Released in : "+getYear()+"\n");
	}

}
