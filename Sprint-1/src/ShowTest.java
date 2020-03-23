import static org.junit.Assert.*;

import org.junit.Test;

import Enities.Screen;

public class ShowTest {

//	@Test
//	public void test() {
//		
//		
//	}

	@Test
	public void caseSensitiveSearch()
	{
		Screen screen=new Screen();
		assertEquals(screen.searchShow("matinee"), screen.searchShow("Matinee"));
	}

	@Test
	public void subStringMatch()
	{
		Screen screen=new Screen();
		assertEquals(screen.searchShow("Mat"), screen.searchShow("Matinee"));
	}

	@Test
	public void subStringcaseSensitiveMatch()
	{
		Screen screen=new Screen();
		assertEquals(screen.searchShow("mat"), screen.searchShow("Matinee"));
	}

	@Test
	public void wrongShowName()
	{
		Screen screen=new Screen();
		assertEquals(screen.searchShow("tam"), null);
	}
	
}
