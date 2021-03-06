package practise;

import java.util.*;
import java.util.Scanner;

public class seatsection {

	private int rows;
	private int hallwidth;
	private double price;
	private String section_name;
	Scanner sc=new Scanner(System.in);
	private List <Row> section=new ArrayList<Row>(); 
	public seatsection() {
		// TODO Auto-generated constructor stub
		System.out.println("Price per each seat in the section");
		setPrice(sc.nextDouble());
		System.out.println("Section name");
		setSection_name(sc.next());
		System.out.println("Number of rows in this section");
		setNumOfRows(sc.nextInt());
		System.out.println("Enter max number of columns in a row");
		setHallwidth(sc.nextInt());
	}

	public void setNumOfRows(int num)
	{
		this.rows=num;
	}
	public int getNumOfRows()
	{
		return this.rows;
	}
	
	public Row getRow(int index) {
		return section.get(index);
	}

	public void addRow() {
		Row r=new Row(getHallwidth());
		section.add(r);
	}
	
	public void addRow(int index,Row row)
	{
		section.add(index, row);
	}
	public void replaceRow(int index,Row row)
	{
		section.remove(index);
		section.add(index, row);
	}
	public void deleteRow(int index)
	{
		section.remove(index);
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSection_name() {
		return section_name;
	}

	public void setSection_name(String section_name) {
		this.section_name = section_name;
	}

	public int getHallwidth() {
		return hallwidth;
	}

	public void setHallwidth(int hallwidth) {
		this.hallwidth = hallwidth;
	}
	
	

}
