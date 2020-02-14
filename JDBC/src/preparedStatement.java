import java.sql.*;
import java.util.Scanner;


public class preparedStatement {

	public preparedStatement() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) throws SQLException
	{
		Database db=new Database();
		Connection conn=db.connect();
		Scanner sc=new Scanner(System.in);
		PreparedStatement ps=conn.prepareStatement("insert into employee2 values(?,?)");
		System.out.println("Enter Id : ");
		ps.setInt(1, sc.nextInt());
		System.out.println("Enter name :");
		ps.setString(2, sc.next());
		try
		{
			if(!ps.execute())
			{
				System.out.println("Successfully stored");
			}
		}catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("Select * from employee2");
		while(rs.next())
		{
			System.out.print("Id : "+rs.getInt("id")+" , ");
			System.out.println("Name : "+rs.getString("name") );
		}
	}
}
