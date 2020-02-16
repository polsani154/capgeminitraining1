package collections;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;

import Repository.Movie;
import Repository.Show;

public class ShowCollection {

	public static HashMap<Integer,Show> ShowData=new HashMap<Integer,Show>();
	static
	{
		
		ShowData.put(1001,new Show(Integer.valueOf(1001),new Date(2020, 02, 16, 9, 30),new Date(2020, 02, 16, 12, 30),"MorningShow",
				new Movie(1, "Bahubali","Drama","Rajamouli", 142, new Date(2016,7,10)),
						Integer.valueOf(1001),
						Integer.valueOf(1001)));
		ShowData.put(1002,new Show(Integer.valueOf(1002),new Date(2020, 02, 16, 13, 30),new Date(2020, 02, 16, 16, 30),"Matinee",
				new Movie(1, "Bahubali","Drama","Rajamouli", 142, new Date(2016,7,10)),
						Integer.valueOf(1001),
						Integer.valueOf(1001)));
		ScreenCollection.ScreenData.get(1001).addShow(ScreenCollection.ScreenData.get(1001).getShowList(),ShowData.get(1001) );
	}
	public ShowCollection() {
		// TODO Auto-generated constructor stub
	}

}
