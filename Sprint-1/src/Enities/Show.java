package Enities;

import java.util.*;

import services.UserService;
import collections.ScreenCollection;
import DAO.SeatAccessModule;

public class Show {

	private Integer showId;
	private Date showStartTime;
	private Date showEndTime;
	private Seat[] seats;
	private String showName;
	private Movie movieName;
	private Integer screenId;
	private Integer theatreId;
	public Show() {
		// TODO Auto-generated constructor stub
	}
	
	public Show(Integer showId, Date showStartTime, Date showEndTime, String showName, Movie movieName, Integer screenId,
			Integer theatreId) {
		
		this.showId = showId;
		this.showStartTime = showStartTime;
		this.showEndTime = showEndTime;
		this.showName = showName;
		this.movieName = movieName;
		this.screenId = screenId;
		this.theatreId = theatreId;
		this.seats=SeatAccessModule.createSeatArray(ScreenCollection.ScreenData.get(screenId).getRows()*ScreenCollection.ScreenData.get(screenId).getColumns(), 100.0);
	}

	public Boolean updateSeatsStatus(String[] seats)
	{
		UserService userservice=new UserService();
		return userservice.updateSeats(seats,this.showId);
	}
	public Seat[] chooseSeats(String[] seats)
	{
		UserService userservice=new UserService();
		return userservice.chooseSeats(seats,this.showId);
	}
	public Boolean initiateBooking()
	{
		return false;
	}
	public Integer getShowId() {
		return showId;
	}
	public void setShowId(Integer showId) {
		this.showId = showId;
	}
	public Date getShowStartTime() {
		return showStartTime;
	}
	public void setShowStartTime(Date showStartTime) {
		this.showStartTime = showStartTime;
	}
	public Date getShowEndTime() {
		return showEndTime;
	}
	public void setShowEndTime(Date showEndTime) {
		this.showEndTime = showEndTime;
	}
	public Seat[] getSeats() {
		return seats;
	}
	public void setSeats(Seat[] seats) {
		this.seats = seats;
	}
	public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	public Movie getMovieName() {
		return movieName;
	}
	public void setMovieName(Movie movieName) {
		this.movieName = movieName;
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
	
	
}
