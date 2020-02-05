package duplicacy;
import java.util.*;
public class Duplicates {

	public Duplicates() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args)
	{
		ArrayList<String> batch1=new ArrayList<String>();
		ArrayList<String> batch2=new ArrayList<String>();
//		HashSet<String> union=new HashSet<String>();
		batch1.add("sandeep");
		batch1.add("gopi");
		batch1.add("yaseen");
		batch1.add("sharukh");
		batch1.add("polsani");
		batch2.add("sandeep");
		batch2.add("yaseen");
		batch2.add("arjun");
		batch2.add("rakesh");
//		for (String string : batch1) {
//			union.add(string);
//		}
//		for (String string : batch2) {
//			union.add(string);
//		}
		batch1.removeAll(batch2);
		for (String string : batch1) {
			batch2.add(string);
		}
		Collections.sort(batch2);
		for (String string : batch2) {
			System.out.println(string);
		}
		
	}

}
