package entities;

import java.util.Date;
import java.util.HashMap;

public class Screen extends Theatre {

	private int screennumber;
	private HashMap<Date,Slot[]> shows=new HashMap<Date,Slot[]>();
	private HashMap<String,Seat> seatmap=new HashMap<String,Seat>();
	public void Screen() {
		// TODO Auto-generated constructor stub
	}
	public int getScreennumber() {
		return screennumber;
	}
	public void setScreennumber(int screennumber) {
		this.screennumber = screennumber;
	}
	public HashMap<Date, Slot[]> getShows() {
		return shows;
	}
	public void setShows(Date d) {
		
		Slot[] slots=shows.get(d);
		this.shows = shows;
	}
	public void setShows(HashMap<Date, Slot[]> shows) {
		this.shows = shows;
	}
	

}
