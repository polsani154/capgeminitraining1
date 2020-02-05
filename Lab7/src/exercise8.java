import java.util.*;

public class exercise8 {

	public exercise8() {
		// TODO Auto-generated constructor stub
	}

	public static Integer[] modifyArray(Integer[] arr)
	{
		Integer arr2[] = {};
		HashSet<Integer> h=new HashSet<Integer>();
		ArrayList<Integer> arrlist=new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			h.add(arr[i]);
		}

		for (Integer integer : h) {
			arrlist.add(integer);
		}
		Collections.sort(arrlist,Collections.reverseOrder());
		arr2=arrlist.toArray(arr2);
		
		return arr2;
		
	}
	public static void main(String[] args){
		Integer[] arr={9,5,6,8,63,23,6,4,5,8,52};
		Integer[] arr2=modifyArray(arr);
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}

}
