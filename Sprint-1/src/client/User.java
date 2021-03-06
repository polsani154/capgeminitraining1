package client;

import java.util.Scanner;
import java.util.logging.Logger;

import Enities.Screen;
import Enities.Seat;
import Enities.Show;
import services.UserService;
import collections.ScreenCollection;
import collections.ShowCollection;

public class User {

	public User() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
	ScreenCollection.ScreenData.get(1001).addShow(ScreenCollection.ScreenData.get(1001),ShowCollection.ShowData.get(1001) );	
	ScreenCollection.ScreenData.get(1001).addShow(ScreenCollection.ScreenData.get(1001),ShowCollection.ShowData.get(1002));
	System.out.println("*************WELCOME TO MOVIE BOOKING SYSTEM****************");
	Scanner sc=new Scanner(System.in);
	Screen screen=ScreenCollection.getScreenData().get(1001);
	Show []shows=screen.getShowList();
	UserService service=new UserService();
	String choi="";
	do
	{
		System.out.println("Menu");
		System.out.println("1. Search Show \n"
				+ "2. Show shows\n"
				+ "3. Select Seats\n"
				+ "4. Start Booking");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		{
			
			
			Show[] showlist=ScreenCollection.getScreenData().get(1001).getShowList();
			if(showlist==null) 
			{
				System.out.println("No shows in the list");
				break;
			}
			for (int i = 0; i < showlist.length; i++) {
				System.out.println(showlist[i].getShowName());
			}	

			
			System.out.println("Enter show name ");
			service.getShowDeatails(sc.next());
			
			break;
		}
		case 2:
		{

			Show[] showlist=ScreenCollection.getScreenData().get(1001).getShowList();
			if(showlist==null) 
			{
				System.out.println("No shows in the list");
				break;
			}
			for (int i = 0; i < showlist.length; i++) {
				service.getShowDeatails(showlist[i].getShowName());
				System.out.println();
				System.out.println();
			}	
			break;
		}
		case 3:
		{
			System.out.println("Select Show");
			for (int i = 0; i < shows.length; i++) {
				System.out.println((i+1)+shows[i].getShowName());
			}
			int ch=sc.nextInt();
			service.printSeatMap(shows[ch-1].getShowId());
			System.out.println("Select Seats separated by comma");
			
			Seat []selectedseats= shows[ch-1].chooseSeats(sc.next().split(","));
			if(selectedseats==null) {
				System.out.println("Invalid seats selected"); 
				break;
				}
			System.out.println("Your selected seats are :");
			for (int i = 0; i < selectedseats.length; i++) {
				service.getSeatDetails(selectedseats[i]);
			}
			break;
		}
		case 4:
		{
			System.out.println("Select Show");
			for (int i = 0; i < shows.length; i++) {
				System.out.println((i+1)+shows[i].getShowName());
			}
			int ch=sc.nextInt();
			service.printSeatMap(shows[ch-1].getShowId());
			System.out.println("Select Seats separated by comma");
			if(shows[ch-1].updateSeatsStatus(sc.next().split(",")))
			{
				System.out.println("Successfully updated");
				service.printSeatMap(shows[ch-1].getShowId());
			}else
			{
				System.out.println("blocked seats or already booked seaats selected");
			}
			break;
		}
		default:
		{
			System.out.println("Invalid Option");
			break;
		}
		}
		System.out.println("ENter something to continue");
		choi=sc.next();
		
	}while(!choi.isEmpty());
		
		
	}
}

//
//ShowCollection.ShowData.get(1001).getSeats()[10].bookSeat();
//ShowCollection.ShowData.get(1001).getSeats()[9].bookSeat();
//ShowCollection.ShowData.get(1001).getSeats()[1].blockSeat();
//ShowCollection.ShowData.get(1001).getSeats()[20].bookSeat();
//ShowCollection.ShowData.get(1001).getSeats()[21].bookSeat();
//ShowCollection.ShowData.get(1001).getSeats()[24].bookSeat();
//UserService service=new UserService();
//service.printSeatMap(1001);
//System.out.println();
//service.printSeatMap(1002);
//service.getShowDeatails("MorningShow");