package pack1;

/* After compiling JVM looks for static variables and allocates
memory before going to the main function */


public class jvm_arc {

	public jvm_arc() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello this is msain block");
	}

	//Static will be executed first
	static{
		System.out.println("This is static ");
	}
}
