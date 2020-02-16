package DAO;

import Repository.Show;
import collections.ShowCollection;

public class ShowAccessModule {

	public ShowAccessModule() {
		// TODO Auto-generated constructor stub
	}
	public Show getSeatMap(Integer showId)
	{
		return ShowCollection.ShowData.get(showId);
		
	}
	

}
