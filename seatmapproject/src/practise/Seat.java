package practise;
enum SeatStatus
{
	Booked,
	Blocked,
	Available,
	None 
}
enum SeatType
{
	Seat,
	None
}

public class Seat {

	public Double price;
	public SeatStatus seatStatus;
	public SeatType seatType;
	public Integer seatId;
	public String rowname;

	public Seat(double price,SeatType type,Integer id)
	{
		this.price=price;
		seatType=type;
		if(type==SeatType.Seat)
		{
			this.seatStatus=seatStatus.Available;
		}else
		{
			this.seatStatus=seatStatus.None;
		}
		this.seatId=id;
	}
	public Seat(Integer id,SeatType type)
	{
		this.seatType=type;
		this.price=null;
		this.seatId=id;
		this.rowname=null;
	}
}
