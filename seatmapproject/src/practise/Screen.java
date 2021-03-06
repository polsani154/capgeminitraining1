package practise;

import java.util.*;

import javax.net.ssl.SSLEngineResult.Status;

public class Screen {

	private Integer screenId;
	private Integer theatreId;
	private String screenName;
	private Show[] showList;
	private Integer rows;
	private Integer columns;
	Scanner sc=new Scanner(System.in);
	private Integer seatIdGenerator=0;
	public static Collection<Seat[]> seatMap=new ArrayList<Seat[]>();
	public  HashMap<Integer,Seat> seatmap=new HashMap<Integer,Seat>();
	public Screen() {
		// TODO Auto-generated constructor stub
	}
	public Screen( Integer screenId, Integer theatreId, String screenName, Show[] showList, Integer rows, Integer columns)
	{
		this.screenId=screenId;
		this.theatreId=theatreId;
		this.screenName=screenName;
		this.showList=showList;
		this.rows=rows;
		this.columns=columns;
	}
	public void addRow(int row)
	{
		System.out.println("Enter row name");
		String rowname=sc.next();
		System.out.println("Enter price for this row");
		double price=sc.nextDouble();
		for (int i = 0; i < this.columns; i++) {
			System.out.println("Is there seat at row  "+row +" column "+i+" or Empty ?");
			String s=sc.nextLine();
			this.seatIdGenerator++;
			if(s.isEmpty())
			{
				Seat seat=new Seat(price,SeatType.Seat,seatIdGenerator);
				this.seatmap.put(seatIdGenerator, seat);
				continue;
			}
			Seat seat=new Seat(seatIdGenerator,SeatType.None);
			this.seatmap.put(seatIdGenerator, seat);
		}
	}
	public void addSeats()
	{
		for (int i = 0; i < rows; i++) {
			this.addRow(i+1);
		}
	}
	public void showSeatMap()
	{
		for (int i = 1; i < seatIdGenerator+1; i++) {
				if(seatmap.get(i).seatType==SeatType.Seat)
				{
					System.out.print("*");
				}else
				{
					System.out.print(" ");
				}
			if(i%columns==0)
			{
				System.out.println();
			}
		}
	}
	public Show searchShow(String showName)
	{
		return null;
	}
	
	
	public Show[] showShows()
	{
		return null;
	}

	public Integer getScreenId() {
		return screenId;
	}

	public void setScreenId(Integer screenId) {
		this.screenId = screenId;
	}

	public Integer getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(Integer theatreId) {
		this.theatreId = theatreId;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public Show[] getShowList() {
		return showList;
	}

	public void setShowList(Show[] showList) {
		this.showList = showList;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getColumns() {
		return columns;
	}

	public void setColumns(Integer columns) {
		this.columns = columns;
	}
	
}

