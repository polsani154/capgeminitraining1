package DAO;

import collections.ShowCollection;
import Enities.BookingState;
import Enities.Seat;
import Enities.Show;

public class SeatAccessModule {

	public SeatAccessModule() {
		// TODO Auto-generated constructor stub
	}
	
	public static Seat[] createSeatArray(int n, double seatprice)
	{
		Seat[] seatArray=new Seat[n];
		for (int i = 0; i < n; i++) {
			Seat seat=new Seat();
			seat.setSeatId(i+1);
			seat.setSeatPrice(seatprice);
			seat.setSeatStatus(BookingState.Available);
			seatArray[i]=seat;
		}
		return seatArray;
	}
	
	
	public boolean bookSeat(Integer seatId,Integer showId)
	{
		if(ShowCollection.ShowData.get(showId).getSeats()[seatId-1].bookSeat().getSeatStatus()==BookingState.Booked)
			{
			return true;
			}
		return false;
	}
	public boolean blockSeat(Integer seatId,Integer showId)
	{
		if(ShowCollection.ShowData.get(showId).getSeats()[seatId-1].blockSeat().getSeatStatus()==BookingState.Blocked)
			{
			return true;
			}
		return false;
	}
	
	public boolean isBooked(Integer seatId,Integer showId)
	{
		if(ShowCollection.ShowData.get(showId).getSeats()[seatId-1].getSeatStatus()==BookingState.Booked)
		{
			return true;
		}
		return false;
	}
	public boolean isBlocked(Integer seatId,Integer showId)
	{
		if(ShowCollection.ShowData.get(showId).getSeats()[seatId-1].getSeatStatus()==BookingState.Blocked)
		{
			return true;
		}
		return false;
	}
	public boolean isAvailable(Integer seatId,Integer showId)
	{
		if(ShowCollection.ShowData.get(showId).getSeats()[seatId-1].getSeatStatus()==BookingState.Available)
		{
			return true;
		}
		return false;
	}

	
}
