package Restaurant;

public class Hotel{

	String name;
	int year;
	HotDrink hotDrink;
	public Hotel(String name,int year,HotDrink h)
	{
		this.name=name;
		this.year=year;
		this.hotDrink=h;
	}
	void display()
	{
		System.out.println("Hotel Name : "+ name);
		System.out.println("Started in : "+ year);
		hotDrink.litre();
	}
	public Hotel() {
		// TODO Auto-generated constructor stub
	}

}
