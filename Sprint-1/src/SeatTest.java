import static org.junit.Assert.*;

import org.junit.Test;

import Enities.Screen;
import Enities.Seat;
import Enities.Show;
import services.UserService;

public class SeatTest {

	@Test
	public void seatBlockTest() {
		UserService service=new UserService();
		Screen screen=new Screen();
		Show show=screen.searchShow("matine");
		Seat[] seats=show.getSeats();
		assertEquals(seats[1].blockSeat().getSeatStatus(),seats[1].getSeatStatus());
	}
	
	@Test
	public void seatBookTest() {
		UserService service=new UserService();
		Screen screen=new Screen();
		Show show=screen.searchShow("matine");
		Seat[] seats=show.getSeats();
		assertEquals(seats[0].bookSeat().getSeatStatus(),seats[0].getSeatStatus());
	}
	
	@Test
	public void bookBlockedSeatTest() {
		UserService service=new UserService();
		Screen screen=new Screen();
		Show show=screen.searchShow("matine");
		Seat[] seats=show.getSeats();
		Seat seat=seats[0].blockSeat();
		System.out.println(seat.getSeatStatus());
		assertEquals(seat.bookSeat(),null);
		seat.unBlockSeat();
	}

	@Test
	public void cancelSeatBookingTest() {
		UserService service=new UserService();
		Screen screen=new Screen();
		Show show=screen.searchShow("matine");
		Seat[] seats=show.getSeats();
		seats[0].bookSeat();
		assertEquals(seats[0].cancelSeatBooking(),seats[0]);
	}
	
	@Test
	public void cancelSeatWhichIsNotBooked() {
		UserService service=new UserService();
		Screen screen=new Screen();
		Show show=screen.searchShow("matine");
		Seat[] seats=show.getSeats();
//		Seat seat=seats[0];
		Seat seat=seats[0].cancelSeatBooking();
		assertEquals(seat.cancelSeatBooking(),null);
		System.out.println("Ticket cannot be cancelled as it is not booked");
	}
}
