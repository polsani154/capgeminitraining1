package collections;

import java.util.HashMap;

import Enities.Theatre;

public class TheatreCollection {
	public static HashMap<Integer,Theatre> TheatreData=new HashMap<Integer,Theatre>();
	static
	{
		Theatre theatre=new Theatre();
		theatre.setManagerContact("9573028680");
		theatre.setManagerName("Sandeep Polsani");
		theatre.setTheatreCity("warangal");
		theatre.setTheatreId(1001);
		theatre.setTheatreName("Sridevi multiplex");
		
		TheatreData.put(1001,theatre);
	}
	public TheatreCollection() {
		// TODO Auto-generated constructor stub
	}

}
