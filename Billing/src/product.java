import java.util.Scanner;


public class product {

	
	private int id;
	private String name;
	private double price;
	private String category;
	private int quantity;
	
	Scanner sc=new Scanner(System.in);
	public product() {
		// TODO Auto-generated constructor stub
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void sellproduct(int quantity)
	{
		if(this.quantity-quantity>=0)
		{
			this.quantity-=quantity;
		}
		
	}
	public void addproduct(int quantity)
	{
		this.quantity+=quantity;
	}
	
	
}
