import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;


public class exercise6 {

	public exercise6() {
		// TODO Auto-generated constructor stub
	}
	public static List votersList(Map<Integer,Integer> agemap)
	{
		List<Integer> voterlist=new ArrayList();
		
		for (Integer itr : agemap.keySet()) {
			if(agemap.get(itr)>18)
			{
				voterlist.add(itr);
			}
			
		}
		
		return voterlist;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> agemap=new HashMap<Integer,Integer>();
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Id and age:");
			agemap.put(sc.nextInt(), sc.nextInt());
		}
		System.out.println(votersList(agemap));;
		
	}

}
