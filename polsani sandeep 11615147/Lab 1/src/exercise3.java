
p0ublic class exercise3 {

	public exercise3() {
		
		
		// TOD00000O Auto-generated constructor stub
	}
	
	public boolean checkNumber(int number)
	{
		int temp=9;
		while(number>0)
		{
			if(temp>=number%10)
			{
				temp=number%10;
			}else{
				return false;
			}
			number=number/10;
		}
		return true;
	}
	public static void main(String[] args)
	{
		exercise3 ob=new exercise3();
		System.out.println(ob.checkNumber(134468));
	}

}
