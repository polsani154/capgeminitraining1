package pack1;

public class types_of_var {

	public types_of_var() {
		// TODO Auto-generated constructor stub
	}
		int roll_no=550;
		int college_id;
		void demo1()
		{
			System.out.println("demo1 instance is created");
		}
		void details1()
		{
			int student_id1=20;
			System.out.println(college_id);
			System.out.println(roll_no);
		}
		void details2(){
			int student_id2=410;
			System.out.println(college_id);
			System.out.println(roll_no);
			System.out.println(student_id2);
		}
	

	// int a ; global or instance variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		types_of_var obj=new types_of_var();
		obj.college_id=50;
		obj.details1();
		obj.details2();
		
		
		//Local variable int a ;

	}

}

