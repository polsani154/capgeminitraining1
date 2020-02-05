package pack1;

public class constructor {

	private int a;
	final static int balance=55000;
	int b;
	public constructor(int a,int c) {
		// TODO Auto-generated constructor stub
	this.a=a;
	this.b=c;
	
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		constructor o=new constructor(5,6);
		System.out.println(o.a);
		System.out.println(o.b);
		System.out.println(constructor.balance);
	}

}
