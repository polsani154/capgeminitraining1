package mocktest;



import java.util.HashMap;
import java.util.Scanner;
class A
{
	int l=1;
	
}
abstract class Account
{
	Person accHolder;
	Integer accNum;
	Integer balance;
	String accountType;
	public abstract void setAccountDetails(Person accHolder,Integer accNum,Integer balance);
	public abstract void setBalance(Integer balance);
	public abstract Integer getBalance();
	public abstract String debit(Integer amount);
	public abstract String credit(Integer amount);
	static HashMap<Integer,Account> accounts=new HashMap<Integer,Account>();
	
	public static String createSavingsAccount(Person accHolder,Integer accNum,Integer balance)
	{
		SavingsAccount acc=new SavingsAccount();
		acc.setAccountDetails(accHolder, accNum, balance);
		 acc.accountType="Savings";
		accounts.put(accNum, acc);
		return "polsani";
		
		
	}
	public static String createCurrentAccount(Person accHolder,Integer accNum,Integer balance)
	{
		CurrentAccount acc=new CurrentAccount();
		acc.setAccountDetails(accHolder, accNum, balance);
		acc.accountType="Current";
		accounts.put(accNum, acc);
		return "sandeep";
		
	}
}
class SavingsAccount extends Account
{
	public  void setAccountDetails(Person accHolder,Integer accNum,Integer balance)
	{
		
		this.accHolder=accHolder;	
		this.accNum=accNum;
		this.balance=balance;
		
	}
	public String toString()
	{
		return "Name : "+this.accHolder.Name;
		
	}
	@Override
	public void setBalance(Integer balance) {
		// TODO Auto-generated method stub
		this.balance=balance;
		
	}
	@Override
	public Integer getBalance() {
		// TODO Auto-generated method stub
		return this.balance;
	}
	@Override
	public String debit(Integer amount) {
		// TODO Auto-generated method stub
		this.balance-=amount;
		return "deducted ne amount: "+this.balance ;
	}
	@Override
	public String credit(Integer amount) {
		// TODO Auto-generated method stub
		this.balance+=amount;
		return "Credited New balance : "+this.balance;
	}
}
class CurrentAccount extends Account
{
	public  void setAccountDetails(Person accHolder,Integer accNum,Integer balance)
	{
		
		this.accHolder=accHolder;
		this.accNum=accNum;
		this.balance=balance;
		
	}
	public String toString()
	{
		return " Name : "+this.accHolder.Name;
		
	}
	@Override
	public void setBalance(Integer balance) {
		// TODO Auto-generated method stub
		this.balance=balance;
		
	}
	@Override
	public Integer getBalance() {
		// TODO Auto-generated method stub
		return this.balance;
	}
	@Override
	public String debit(Integer amount) {
		// TODO Auto-generated method stub
		this.balance-=amount;
		return "deducted ne amount: "+this.balance ;
	}
	@Override
	public String credit(Integer amount) {
		// TODO Auto-generated method stub
		this.balance+=amount;
		return "Credited New balance : "+this.balance;
	}
}
class Person
{
	String Name;
	int Age;
	String City;
	Scanner sc=new Scanner(System.in);
	Person(String name,String city,int age)
	{
		this.Name=name;
		this.City=city;
		this.Age=age;
	}
	Person()
	{
		System.out.println("Enter Name,city and Age");
		this.Name=sc.next();
		this.City=sc.next();
		this.Age=sc.nextInt();
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
	
}

public class bank {

	public bank() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person();
		System.out.println(Account.createCurrentAccount(p, 1234, 10000));
		
	}

}
