package services;

import collections.ScreenCollection;
import collections.TheatreCollection;
import DAO.SeatAccessModule;
import DAO.ShowAccessModule;
import Enities.BookingState;
import Enities.Screen;
import Enities.Seat;
import Enities.Show;

public class UserService {

	public UserService() {
		// TODO Auto-generated constructor stub
	}
	public void printSeatMap(Integer showId)
	{
		ShowAccessModule showaccess=new ShowAccessModule();
		SeatAccessModule seataccess=new SeatAccessModule();
		Show show=showaccess.getSeatMap(showId);
		int columns=ScreenCollection.ScreenData.get(show.getScreenId()).getColumns();
		for (int i = 0; i < show.getSeats().length; i++) {
			if(seataccess.isBooked(i+1, show.getShowId()))
			{
				System.out.print("@ ");
				if((i+1)%columns==0)
				{
					System.out.println();
				}
				continue;
			}
			if(seataccess.isBlocked(i+1, show.getShowId()))
			{
				System.out.print("  ");
				if((i+1)%columns==0)
				{
					System.out.println();
				}
				continue;
			}
			if(seataccess.isAvailable(i+1, show.getShowId()))
			{
				System.out.print("* ");
				if((i+1)%columns==0)
				{
					System.out.println();
				}
			}
			

		}
	}
	public void getShowDeatails(String s)
	{
		Screen screen=new Screen();
		Show show=screen.searchShow(s);
		if(show==null)
		{
			System.out.println("No show present with that name");
			return;
		}
		int availableSeats=0;
		for (int i = 0; i < show.getSeats().length; i++) {
			if(show.getSeats()[i].getSeatStatus()==BookingState.Available)
			{
				availableSeats++;
			}
		}
		System.out.println("Name : "+show.getShowName());
		System.out.println("Movie : "+show.getMovieName().getMovieName());
		System.out.println("Theatre : "+ TheatreCollection.TheatreData.get(show.getTheatreId()).getTheatreName());
		System.out.println("Screen Name : "+ScreenCollection.ScreenData.get(show.getScreenId()).getScreenName());
		System.out.println("Available Seats : "+availableSeats);
		System.out.println("Timings : "+show.getShowStartTime().toString() +" to "+show.getShowEndTime().toString());
		
	}
	public static boolean updateScreen()
	{
		
		return false;
	}
	public void getSeatDetails(Seat seat)
	{
		System.out.println(seat.getSeatId() + "Price : "+seat.getSeatPrice());
	}
	public Seat[] chooseSeats(String[] Seats,Integer showid)
	{
		ShowAccessModule showaccess=new ShowAccessModule();
		return showaccess.chooseSeats(Seats, showid);
		
	}
	public boolean updateSeats(String[] seats,Integer showId)
	{
		ShowAccessModule showaccess=new ShowAccessModule();
		return showaccess.updateSeats(seats,showId);
	}

}
