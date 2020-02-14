package leastprice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Product
{
	private int price;
	private String name;
	private int discount;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
}
public class Leastoffer {

	public Leastoffer() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args)
	{
		ArrayList<Product> list=new ArrayList<Product>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for (int i = 0; i < n; i++) {
			Product p=new Product();
			String s=sc.next();
			String[] arr=s.split(",");
			p.setName(arr[0]);
			p.setPrice(Integer.parseInt(arr[1]));
			p.setDiscount(Integer.parseInt(arr[2]));
			list.add(p);
		}
		int leastdiscountindex=0;
		int discountprice=(list.get(leastdiscountindex).getPrice()*list.get(leastdiscountindex).getDiscount())/100;
		
		
//		finding least discounted item
		for (int i = 0; i < list.size(); i++) {
			if(discountprice>(list.get(i).getPrice()*list.get(i).getDiscount())/100)
			{
				discountprice=(list.get(i).getPrice()*list.get(i).getDiscount())/100;
				leastdiscountindex=i;
			}
		}
//		Output
		System.out.println("least discounted item is: ");
		System.out.println("Name : "+list.get(leastdiscountindex).getName());
		System.out.println("Actual price : "+list.get(leastdiscountindex).getPrice());
		System.out.println("Discount : "+list.get(leastdiscountindex).getDiscount());
		System.out.println("Discounted amount :"+discountprice);
		
	}

}
//mobile,10000,20
//shoe,5000,10
//watch,6000,15
//laptop,35000,5
