package Repository;

import java.time.LocalDate;

public class Customer extends User {

	private Integer userid;
	private String customerName;
	private String password;
	private LocalDate dateOfBirth;
	private Ticket[] myTickets;
	private String customerContact;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean bookMovieTicket(Theatre theatre){
		return false;
	}
	public boolean cancelMovieTicket(Ticket ticket)
	{
		return true;
	}
	public boolean chooseCity(String city)
	{
		return true;
	}
	

}
