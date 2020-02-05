
public class exercise2 {

	public exercise2() {
		// TODO Auto-generated constructor stub
	}
	public int calculateDifference(int n)
	{
		int Sum=0;
		int squares=(n*(n+1)*((2*n)+1))/6;
		//System.out.println(squares);
		int sumsquare=(n*(n+1))/2;
		//System.out.println(sumsquare);
		Sum = squares - (sumsquare*sumsquare);
		return Math.abs(Sum);
	}
	public static void main(String[] args) {
		exercise2 ob = new exercise2();
		System.out.println(ob.calculateDifference(26));
	}
}
