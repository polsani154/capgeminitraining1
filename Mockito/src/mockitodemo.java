
public class mockitodemo {

	public mockitodemo() {
		// TODO Auto-generated constructor stub
	}
	

}
class Dao
{
	public String login(String username,String password)
	{
		return username+password;
	}
}
class service
{
	Dao d;
	service(Dao d)
	{
		this.d=d;
	}
	public String databaseOperation(String username,String password)
	{
		return d.login(username, password);
	}
}