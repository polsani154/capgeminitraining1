package pack1;

public class StaticDemo {

	public StaticDemo() {
		// TODO Auto-generated constructor stub
	}

	static int a=20;
	int b=10;
	static int hex=010001;
	
	static void display()
	{
		int c=50;
		System.out.println("static display");
	}
	void display2()
	{
		int x=55;
		System.out.println(StaticDemo.a);
		System.out.println("normal display method in class");
	}
	public static void main(String[] args) {
		
		//static methods only accept static properties
		//To  access non static properties or methods we should create objects
		
		StaticDemo.display();
		System.out.println(StaticDemo.a);
		
		System.out.println(StaticDemo.hex);
	}
}
