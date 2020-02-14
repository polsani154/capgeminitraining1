import java.sql.*;


public class DML {

	public DML() {
		// TODO Auto-generated constructor stub
	}
	
	public static String updateColumn(Connection conn,String table_name,String column,Object data,String condition) throws SQLException
	{
		Statement st=conn.createStatement();
		if(!st.execute("update "+table_name+" set "+column+"='"+data.toString()+"' where "+condition))
		{
			return "Successfully updated column "+column+" value with "+data;
		}
		return "Not updated there may be an error";
	}
	public static String updateWithQuery(Connection conn,String query) throws SQLException
	{
		Statement st=conn.createStatement();
		if(!st.execute(query))
		{
			return "Query successfully executed";
		}
		return "Not updated there may be an error";
	}
}
