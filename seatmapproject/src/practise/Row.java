package practise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Row {
	
	private int columns;
	private List<Boolean> list=new ArrayList();
	public Row(int num) {
		// TODO Auto-generated constructor stub
		for (int i = 0; i < num; i++) {
			list.add(false);
		}
	}
	public String print()
	{
		String s="";
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			if((Boolean) iterator.next())
			{
				s=s+"#";
			}
			else
			{
				s=s+".";
			}
			
		}
		return s;
	}
	
	public void makeempty(int index)
	{
		if(index==-1 || index>=list.size())
		{
			System.out.println("Seat position is not in limit");
			return;
		}
		list.set(index, false);
		
	}
	
	public void setSeats(int startindex,int endindex)
	{
		if(startindex<0 || endindex>=list.size() || startindex>endindex)
		{
			return;
		}
		for (int i = startindex; i <= endindex; i++) {
			list.set(i, true);
		}
	}
	
	public int getColumns() {
		return columns;
	}


	public void setColumns(int columns) {
		this.columns = columns;
	}

	

	public List<Boolean> getList() {
		return list;
	}


	public void setList(List<Boolean> list) {
		this.list = list;
	}
	public void printseatnumbers()
	{
		int num=1;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i))
			{
				System.out.print(num+" ");
				num++;
			}
			else
			{
				System.out.print(". ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of available columns in a row");
		Row obj=new Row(sc.nextInt());
		System.out.println(obj.print());
		obj.setSeats(2, 6);
		obj.setSeats(8, 9);
		System.out.println(obj.print());
		obj.printseatnumbers();
		obj.makeempty(2);
		System.out.println(obj.print());
		obj.printseatnumbers();
		obj.makeempty(3);
		System.out.println(obj.print());
		obj.printseatnumbers();
		
		
	}
}
