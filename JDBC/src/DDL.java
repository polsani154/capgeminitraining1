import java.sql.*;

import javax.sql.*;
public class DDL {

	public DDL() {
		// TODO Auto-generated constructor stub
	}
	public boolean drop(Connection conn,String tablename) throws SQLException
	{
		Statement st=conn.createStatement();
		
		if(st.execute("drop table "+tablename))
		{
			return true;
		}
		return false;
	}
	public boolean rename(Connection conn,String table_name,String new_table_name) throws SQLException
	{
		Statement  st=conn.createStatement();
		if(st.execute("rename table "+table_name+" to "+new_table_name))
		{
			return true;
		}
		return false;
	}
	public boolean create(Connection conn,String table_name,String schema) throws SQLException
	{
		Statement  st=conn.createStatement();
		if(st.execute("create table "+table_name+"("+schema+")"))
		{
			return true;
		}
		return false;
		
	}
	public boolean alter(Connection conn,String table_name,String schema) throws SQLException
	{
		Statement  st=conn.createStatement();
		if(st.execute("alter table "+table_name+" "+schema))
		{
			return true;
		}
		return false;
	}
	public boolean alter(Connection conn,String table_name) throws SQLException
	{
		Statement  st=conn.createStatement();
		if(st.execute("truncate table "+table_name))
		{
			return true;
		}
		return false;
	}
}
