package DAO;

import Enities.BookingState;
import Enities.Seat;
import Enities.Show;
import collections.ShowCollection;

public class ShowAccessModule {

	public ShowAccessModule() {
		// TODO Auto-generated constructor stub
	}
	public Show getSeatMap(Integer showId)
	{
		return ShowCollection.ShowData.get(showId);
		
	}
	public boolean AddShow()
	{
		System.out.println();
		return false;
	}
	
	public Seat[] chooseSeats(String[] Seats,Integer showId)
	{

		Seat[] seatslist=ShowCollection.ShowData.get(showId).getSeats();  
		Seat[] resultseats=new Seat[Seats.length];
		for (int i = 0; i < Seats.length; i++) {
			try {
				Integer id=Integer.parseInt(Seats[i]);
				if(seatslist[id-1].getSeatStatus()==BookingState.Blocked || seatslist[id-1].getSeatStatus()==BookingState.Booked)
				{
					System.out.println("You are not allowed to choose seat with ID : "+id );
					return null;
				}
				resultseats[i]=seatslist[id-1];
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		return resultseats;
	}
	public boolean updateSeats(String[] Seats,Integer showId)
	{
		Seat[] seatslist=ShowCollection.ShowData.get(showId).getSeats();  
		for (int i = 0; i < Seats.length; i++) {
			try {
				Integer id=Integer.parseInt(Seats[i]);
				if(seatslist[id-1].getSeatStatus()==BookingState.Blocked || seatslist[id-1].getSeatStatus()==BookingState.Booked)
				{
					return false;
				}
				seatslist[id-1].bookSeat();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				
			}
		}
		Show updatedShow=ShowCollection.ShowData.get(showId);
		updatedShow.setSeats(seatslist);
		ShowCollection.ShowData.replace(showId,updatedShow);
		return true;
	}
	

}
