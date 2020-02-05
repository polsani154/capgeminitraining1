package student;

public class student {

	private int regno;
	private String name;
	private int standard;
	private int[] marks=new int[5];
	private String subjects[] = {"Maths","Science","Hindi","Soft skills","physical activity"};
	private boolean ismarksassigned=false;
	private boolean isattendedfortest=false;
	
	public int getRegno() {
		return regno;
	}

	public void setRegno(int regno) {
		this.regno = regno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStandard() {
		return standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	
	public int getMark(int i)
	{
		return this.marks[i];
	}
	
	public void setMark(int i,int marks)
	{
	 this.marks[i] = marks;
	}
	 
	public String getSubject(int i)
	{
		return this.subjects[i];
	}
	
	public String[] getSubjects() {
		return subjects;
	}

	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}

	public boolean isIsmarksassigned() {
		return ismarksassigned;
	}

	public void setIsmarksassigned(boolean ismarksassigned) {
		this.ismarksassigned = ismarksassigned;
	}

	public boolean isIsattendedfortest() {
		return isattendedfortest;
	}

	public void setIsattendedfortest(boolean isattendedfortest) {
		this.isattendedfortest = isattendedfortest;
	}

	public student(int regno,String name,int standard) {
		
		// TODO Auto-generated constructor stub
		setRegno(regno);
		setName(name);
		setStandard(standard);
	}
	public student()
	{
		System.out.println("Please enter the student details");
	}
	
}
