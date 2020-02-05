import java.util.concurrent.ConcurrentHashMap;

public class concurrentHash {

	public concurrentHash() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args)
	{
		ConcurrentHashMap<Integer, String> mp=new ConcurrentHashMap<Integer,String>();
		mp.put(1,"polsani");
		mp.put(2,"ravi");
		mp.put(3,"vatsav");
	}

}
