package Iterator;

import java.util.*;

public class Iterator {

	public Iterator() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String []args)
	
	{
		ArrayList s=new ArrayList();
		s.add("polsani");
		s.add(true);
		s.add(1);
		s.add("sandeep");
		java.util.Iterator it= s.iterator();
		ListIterator li=s.listIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
	}
}
