import java.util.*;


public class exercise5 {

	public exercise5() {
		// TODO Auto-generated constructor stub
	}
	public static int second_smallest(Integer[] arr)
	{
		List arrList=new ArrayList();	
		arrList= Arrays.asList(arr);
		Collections.sort(arrList);
//		System.out.println(arrList.size());
//		for (Iterator iterator = arrList.iterator(); iterator.hasNext();) {
//			System.out.println(iterator.next());
//			
//		}
		return (Integer) arrList.get(1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[]={1,18,6,5,8,16,32,12,89,52,5};
		System.out.println("Second smallest : "+second_smallest(arr));
	}

}
