import java.sql.*;
import java.util.Scanner;


public class updatedemo {

	public updatedemo() {
		// TODO Auto-generated constructor stub
	}
	public void updateColumn(Connection conn) throws SQLException
	{
		System.out.println(DML.updateColumn(conn, "employee2", "name", "sandeep", "id=2"));
	}
	public static void main(String[] args) throws SQLException
	{
		Database db=new Database();
		Connection conn=db.connect();
		Scanner sc=new Scanner(System.in);
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("select * from employee2");
		while(rs.next())
		{
			System.out.print("Id : "+rs.getInt("id")+" , ");
			System.out.println("Name : "+rs.getString("name") );
		}
		System.out.println();
		System.out.println("Enter update query ");
		System.out.println(DML.updateWithQuery(conn,sc.nextLine()));
		System.out.println();
		System.out.println("Updated table is :");
		rs=st.executeQuery("desc employee2");
		while(rs.next())
		{
			System.out.print("Id : "+rs.getInt("id")+" , ");
			System.out.println("Name : "+rs.getString("name") );
		}
		
		

	}
}
