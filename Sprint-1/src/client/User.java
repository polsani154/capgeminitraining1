package client;

import services.UserService;
import collections.ShowCollection;

public class User {

	public User() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
		ShowCollection.ShowData.get(1001).getSeats()[10].bookSeat();
		ShowCollection.ShowData.get(1001).getSeats()[9].bookSeat();
		ShowCollection.ShowData.get(1001).getSeats()[1].blockSeat();
		ShowCollection.ShowData.get(1001).getSeats()[20].bookSeat();
		ShowCollection.ShowData.get(1001).getSeats()[21].bookSeat();
		UserService service=new UserService();
		service.printSeatMap(1001);
		service.getShowDeatails("MorningShow");
	}
}