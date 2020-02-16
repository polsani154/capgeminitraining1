package DAO;
import Repository.Screen;
import collections.ScreenCollection;
public class ScreenAccessModule {

	public ScreenAccessModule() {
		// TODO Auto-generated constructor stub
	}

	public Screen getScreen(Integer screenId)
	{
		return ScreenCollection.getScreenData().get(screenId);
	}
	
	public boolean AddScreen(Screen screen)
	{
		Screen s=ScreenCollection.ScreenData.put(ScreenCollection.getKey(), screen);
		if(screen==null)
		{
			return false;
		}
			System.out.println(screen.getScreenName() +" Successfully Added");
			ScreenCollection.keyIncrement();
			return true;
	}
	
}