import java.util.*;
public class exercise1 {

	public exercise1() {
		// TODO Auto-generated constructor stub
	}
	public List conversion(HashMap m1)
	{
		
		 Collection s=m1.values();
		 List sortlist=new ArrayList(s);
		Collections.sort(sortlist);
		return sortlist;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exercise1 e=new exercise1();
		HashMap<String,String> m1=new HashMap<String,String>();
		m1.put("1", "sandeep");
		m1.put("85", "p");
		m1.put("15", "polsnai");
		m1.put("32", "ravi");
		m1.put("14", "teja");
		System.out.println(e.conversion(m1));
		
		
	}

}
