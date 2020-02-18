package services;

import DAO.ScreenAccessModule;
import Enities.Screen;

public class AdminService {

	public AdminService() {
		// TODO Auto-generated constructor stub
	}
	public boolean addScreen()
	{
		
		return true;
		
	}
	public boolean UpdateScreen(Screen screen)
	{
		ScreenAccessModule screenaccess=new ScreenAccessModule();
		return screenaccess.updateScreen(screen);
	}
}
