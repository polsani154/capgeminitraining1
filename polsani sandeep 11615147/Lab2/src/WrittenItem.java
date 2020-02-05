import java.util.Scanner;


public abstract class WrittenItem extends Item{

	private String author;
	Scanner sc=new Scanner(System.in);
	public WrittenItem() {
		super();
		System.out.println("Enter the Authur name : ");
		setAuthor(sc.next());
		// TODO Auto-generated constructor stub
	}
	public WrittenItem(int id,String name,String author,int copies)
	{	
		super.setBook_id(id);
		super.setCopies_count(copies);
		super.setTitle(name);
		this.author=author;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void print()
	{
		super.print();
		System.out.println("Author : "+getAuthor());
	}
	

}
