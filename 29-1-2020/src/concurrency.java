import java.util.ArrayList;


public class concurrency {

	public concurrency() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList o1=new ArrayList();
		o1.add("polsani");
		o1.add("sandeep");
		o1.add("ravi");
		o1.remove(o1.lastIndexOf("ravi"));
		System.out.println(o1);

	}

}
