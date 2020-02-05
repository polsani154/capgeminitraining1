import java.util.HashMap;
import java.util.Map;


public class exercise3 {

	public exercise3() {
		// TODO Auto-generated constructor stub
	}
	public static Map getSquares(int []arr)
	{
		Map<Integer,Integer> m1=new HashMap();
		for (int c : arr) {
			m1.put(c, c*c);
		}
		return m1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,4,5,6,7,8,9};
		System.out.println(getSquares(arr));
	}

}
