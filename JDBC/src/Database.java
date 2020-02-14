import java.sql.*;

import javax.sql.*;
import java.util.*;

public class Database {

	public Database() {
		// TODO Auto-generated constructor stub
		
	}
	
	public Connection connect() throws SQLException
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url="jdbc:oracle:thin:@127.0.0.1:1521:XE";
		Connection conn=DriverManager.getConnection(url,"system","sandeep");

		return conn;
		
	}

}
