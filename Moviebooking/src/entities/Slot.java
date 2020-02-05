package entities;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Slot {

	private String movie;
	private Date Time;
	private boolean isbookingopen=false;
	
	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	public Date getTime() {
		return Time;
	}

	public void setTime(String time) throws ParseException {
		DateFormat formatter=new SimpleDateFormat("HH:min");
		Date dt=formatter.parse(time);
		Time = dt;
	}

	public Slot() {
		// TODO Auto-generated constructor stub
	}

}
