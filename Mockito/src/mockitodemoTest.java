import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;


public class mockitodemoTest {

	@Test
	public void test() {
//		fail("Not yet implemented");
		Dao dd=Mockito.mock(Dao.class);
		
		when(dd.login("sandeep","123")).thenReturn("login.page");
		service s=new service(dd);
		assertEquals(s.databaseOperation("sandeep", "123"), "login.page");
		
	}

}
