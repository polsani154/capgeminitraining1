package serializeDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class serialize {

	public serialize() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		Employee E= new Employee(1,"ravi","hr");
		System.out.println(E.id);
		System.out.println(E.name);
		System.out.println(E.Position);
		
		//serialiasation
		
		System.out.println("...............Serialization started................");
		FileOutputStream fis=new FileOutputStream("demo.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fis);
		oos.writeObject(E);
		System.out.println("...............serialisation ended..............");
		
		System.out.println(".............Deserialisation started................");
		FileInputStream fi=new FileInputStream("demo.ser");
		ObjectInputStream ois=new ObjectInputStream(fi);
		
		Employee emp=(Employee)ois.readObject();
		System.out.println(emp.id);
		System.out.println(emp.name);
		System.out.println(emp.Position);
		System.out.println("...............Deserialisation Ended..................");
		
	}
}
class Employee implements Serializable
{
	static int id;
	String name;
	String Position;
	public Employee(int id,String name,String pos)
	{
		this.id=id;
		this.name=name;
		this.Position=pos;
	}
	
}
