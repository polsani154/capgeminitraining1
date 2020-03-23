package Enities;



public class Seat {

	private Integer seatId;
	private Enum seatStatus;
	private double seatPrice;
	public Seat() {
		
	}
	public Seat blockSeat()
	{
		this.setSeatStatus(BookingState.Blocked);
		return this;	
	}
	
	public Seat bookSeat()
	{
		
		if(this.seatStatus==BookingState.Blocked || this.seatStatus==BookingState.Booked )
		{
			return null;
		}
		
		this.seatStatus=BookingState.Booked;
		return this;		

	}
	public Seat cancelSeatBooking()
	{
		if(this.seatStatus==BookingState.Booked)
		{
			this.setSeatStatus(BookingState.Available);
			return this;
		}
		
		return null;
	}
	public Enum unBlockSeat()
	{
		this.setSeatStatus(BookingState.Available);
		return null;
	}
	public Integer getSeatId() {
		return seatId;
	}
	public void setSeatId(Integer seatId) {
		this.seatId = seatId;
	}
	public Enum getSeatStatus() {
		return seatStatus;
	}
	public void setSeatStatus(Enum seatStatus) {
		this.seatStatus = seatStatus;
	}
	public double getSeatPrice() {
		return seatPrice;
	}
	public void setSeatPrice(double seatPrice) {
		this.seatPrice = seatPrice;
	}
	
	

}
