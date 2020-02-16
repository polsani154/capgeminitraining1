package practise;

public class client {

	public client() {
		// TODO Auto-generated constructor stub
	}
	
	public static Screen addScreen()
	{
		Screen s=new Screen();
		
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Screen screen=new Screen();
		screen.setRows(3);
		screen.setColumns(3);
		screen.addSeats();
		screen.showSeatMap();
	}

}
