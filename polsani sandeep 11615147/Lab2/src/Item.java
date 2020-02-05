import java.util.Scanner;


public abstract class Item {

	private int Book_id;
	private String title;
	private int copies_count;
	Scanner sc=new Scanner(System.in);
	public Item() {
		// TODO Auto-generated constructor stub
		System.out.println("Enter the Title :");
		setTitle(sc.next());
		System.out.println("Enter the Id");
		setBook_id(sc.nextInt());
		System.out.println("Enter number of available copies");
		setCopies_count(sc.nextInt());
		
	}
	public Item(int Book_id,String title,int copies_count)
	{
		this.Book_id=Book_id;
		this.title=title;
		this.copies_count=copies_count;
	}
	public int getBook_id() {
		return Book_id;
	}
	public void setBook_id(int book_id) {
		Book_id = book_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCopies_count() {
		return copies_count;
	}
	public void setCopies_count(int copies_count) {
		this.copies_count = copies_count;
	}
	public boolean equals(int id)
	{
		return this.Book_id==id;
	}
//	public String toString(Object s)
//	{
//		return s.toString();
//	}
	
	public void print()
	{
		System.out.println("Id : "+this.getBook_id());
		System.out.println(" Title "+this.getTitle());
		System.out.println(" Copies : "+this.getCopies_count());
	}
	public void checkIn()
	{
		this.setCopies_count(++this.copies_count);
	}
	public void checkOut()
	{
		this.setCopies_count(--this.copies_count);
	}
	public void addItem()
	{
		this.setCopies_count(++this.copies_count);
	}
	
	

}
