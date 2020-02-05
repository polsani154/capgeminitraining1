import java.util.HashMap;
import java.util.Map;


public class exercise4 {

	public exercise4() {
		// TODO Auto-generated constructor stub
	}
	public static HashMap getStudents(HashMap<Integer,Integer> m1)
	{
		HashMap<Integer,String> m2=new HashMap();
		
		for (Integer itr : m1.keySet()) {
			if(m1.get(itr)>=90)
			{
				m2.put(itr, "Gold");
				continue;
			}
			if(m1.get(itr)<90 && m1.get(itr)>=80)
			{
				m2.put(itr, "Silver");
				continue;
			}
			if(m1.get(itr)<80 && m1.get(itr)>=70)
			{
				m2.put(itr, "Bronze");
			}
		}
		
		return m2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> m1=new HashMap();
		m1.put(11615147, 86);
		m1.put(11603618, 92);
		m1.put(11602862, 76);
		m1.put(1168965, 88);
		
		System.out.println(getStudents(m1));
	}

}
