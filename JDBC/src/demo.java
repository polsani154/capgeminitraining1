import java.sql.*;

import javax.sql.*;
public class demo {

	public demo() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) throws SQLException
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url="jdbc:oracle:thin:@127.0.0.1:1521:XE";
		Connection conn=DriverManager.getConnection(url,"system","sandeep");
		System.out.println("connected");
		Statement st=conn.createStatement();
//		ResultSet rs=st.executeQuery("CREATE table employee2(id number(10),name varchar2(30), primary key(id))");
//		st.execute("INSERT into employee2 values(1,'"+"polsani'"+")");
//		st.execute("INSERT into employee2 values(2,'"+"polsani2'"+")");
//		st.execute("INSERT into employee2 values(3,'"+"polsani3'"+")");
		ResultSet rs=st.executeQuery("Select * from employee2");
//		conn.prepareStatement("SELECT * from employee");
		while(rs.next())
		{
			System.out.print("Id : "+rs.getInt("id")+" , ");
			System.out.println("Name : "+rs.getString("name") );
		}
		conn.close();
	}

}
