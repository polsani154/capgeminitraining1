package DAO;
import Enities.Screen;
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
	public boolean updateShow(Screen screen)
	{
		return false;
	}
	public boolean updateScreen(Screen screen)
	{
		ScreenCollection.ScreenData.replace(screen.getScreenId(), screen);
		return true;
		
	}
	
}
