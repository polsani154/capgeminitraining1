package practise;

enum Seatstatus{
	Booked,
	Blocked,
	Available,	
}
enum Seattype
{
	Couple,
	Recliner,
	None
}

class Seat
{
	public Seattype type;
	Seatstatus status;
}

public class EnumMap {

	public EnumMap() {
		// TODO Auto-generated constructor stub
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int j=0;j<10;j++)
		{
			System.out.print(j+1+" ");
		}
		System.out.println("");
		for(int i=0;i<10;i++)
		{

			for(int j=0;j<10;j++)
			{
				Seat a=new Seat();
				if(j==5 || j==6)
				{
					a.type=Seattype.None;
				}
				if(i==0 && (j==0 || j==2 || j==8))
				{
					a.type=Seattype.Couple;
				}
				if(a.type==Seattype.None)
				{
					System.out.print("  ");
				}else
				{if(a.type==Seattype.Couple)
				{
					System.out.print("___ ");
					j++;
				}else
				{
					System.out.print("* ");
				}}
			}
			
			System.out.println(" "+(char)(65+i));
		}
		
	}

}
