import java.util.*;


public class exercise2 {

	public exercise2() {
		// TODO Auto-generated constructor stub
	}
	public static Map countCharacter(char []arr)
	{
		Map<Character,Integer> m1=new HashMap();
		for (char c : arr) {
			if(m1.containsKey(c))
			{
				int val=m1.get(c);
				m1.put(c,++val);
				continue;
			}
			m1.put(c, 1);
		}
		return m1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Character,Integer> m1=new HashMap();
		char arr[]={'a','p','p','l','e'};
		m1=countCharacter(arr);
		System.out.println(m1);
	}

}
