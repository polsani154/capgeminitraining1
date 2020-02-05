package Restaurant;

public class HotelManagement  {

	public HotelManagement() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String args[])
	{
		Tea t=new Tea();
		Coffee c=new Coffee();
		Hotel hotel=new Hotel("Suphrabha",1986,t);
		hotel.display();
		
	}

}
