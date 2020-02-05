package exercise4;

public class Replacer {

	public Replacer() {
		// TODO Auto-generated constructor stub
	}
	public boolean isvowel(char ch)
	{
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
		{
			return true;
		}
		return false;
	}
	public String Consonantreplacer(String s)
	{
		String str="";
		for(int itr=0;itr<s.length();itr++)
		{
			if(!isvowel(s.charAt(itr)))
			{
				str=str+(char)((int)s.charAt(itr)+1);
			}
			else
			{
				str=str+s.charAt(itr);
			}
			
		}
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Replacer r=new Replacer();
		System.out.println(r.Consonantreplacer("polsani sandeep"));
	}

}
