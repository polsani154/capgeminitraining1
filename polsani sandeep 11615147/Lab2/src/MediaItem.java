import java.util.Scanner;


public abstract class MediaItem  extends Item{

	private int runtime;
	Scanner sc=new Scanner(System.in);
	public MediaItem() {
		// TODO Auto-generated constructor stub
		super();
		System.out.println("ENter the runtime in seconds :");
		setRuntime(sc.nextInt());
		
	}
	public MediaItem(int id,String name,int runtime,int copies)
	{	
		super.setBook_id(id);
		super.setCopies_count(copies);
		super.setTitle(name);
		setRuntime(runtime);
	}
	public int getRuntime() {
		return runtime;
	}
	public void print()
	{
		super.print();
		System.out.println("Runtime :"+getRuntime());
	}
	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

}
