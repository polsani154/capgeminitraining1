package practise;

import java.util.Arrays;

interface Animal
{
	public void sound();
	abstract void setLivingEnvironment(String s);
	int age=56;	
	public String getBreed();
//	abstract void soundType(int s);
}

interface Aquatic extends Animal
{
	String color="blue";
	public void Aquatic();
	public void setColor();
	public void getcolor();
}
interface landers extends Animal
{
	String color="red";
	public void landers();
	public void setColor();
	public void getcolor();
}
class pets implements landers
{

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLivingEnvironment(String s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void landers() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setColor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getcolor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getBreed() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
class Dog extends pets implements landers 
{
	private String breed="hutch kukka";

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
	
		
	}

	@Override
	public void setLivingEnvironment(String s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void landers() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setColor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getcolor() {
		// TODO Auto-generated method stub
		
	}
	
}

public class fill {

	public fill() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args)
	{
		
		System.out.println("hello sandy");
	}
	pets pet=new Dog();
	Animal dog=new Dog();
	Animal ox=new pets();
//	int[] arr=Arrays.fill(,8);
	
	
	

}
