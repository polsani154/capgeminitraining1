package withdraw;
import deposit.cash;
public class online extends cash{

	public online() {
		// TODO Auto-generated constructor stub
	}
	 
	public int greater(int a,int b){
		return a>b?a:b;
	}
	
	public static void main(String args[])
	{
		online obj=new online();
		System.out.println(obj.b);
		
	}

}
