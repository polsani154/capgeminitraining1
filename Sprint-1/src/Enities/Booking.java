package Enities;

import java.time.LocalDate;

public class Booking {

	private Integer bookingId;
	private Integer movieId;
	private Integer showId;
	private LocalDate bookingDate;
	private Show showRef;
	private Integer transactionId;
	private double totalCost;
	private Seat[] seatList;
	private Ticket ticket;
	public Booking() {
		// TODO Auto-generated constructor stub
	}
	
	public Double calculateTotalCost()
	{
		return null;
	}
	public PaymentMethod choosePaymentMethod()
	{
		return null;
	}
	
	public boolean makePayment(PaymentMethod method,double cost)
	{
		return true;
	}
	public boolean cancelTickets(Seat[] seats)
	{
		return true;
	}

}
