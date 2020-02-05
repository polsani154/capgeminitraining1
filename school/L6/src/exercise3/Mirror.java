package exercise3;

public class Mirror {

	public Mirror() {
		// TODO Auto-generated constructor stub
	
	}
	public String mirrorstring(String s)
	{
		int len=s.length()-1;
		String str="";
		while(len>=0)
		{
			str=str+s.charAt(len);
			len--;
		}
		return s+"|"+str;
	}
	public static void main(String[] args)
	{
		Mirror obj=new Mirror();
		System.out.println(obj.mirrorstring("EARTH"));
	}
}
